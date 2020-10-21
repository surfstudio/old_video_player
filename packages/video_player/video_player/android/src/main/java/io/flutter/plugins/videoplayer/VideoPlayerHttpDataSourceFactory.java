package io.flutter.plugins.videoplayer;

import androidx.annotation.Nullable;

import com.google.android.exoplayer2.upstream.DefaultHttpDataSource;
import com.google.android.exoplayer2.upstream.HttpDataSource.BaseFactory;
import com.google.android.exoplayer2.upstream.HttpDataSource.RequestProperties;
import com.google.android.exoplayer2.upstream.TransferListener;

import java.util.Map;

// near copy and paste from final class DefaultHttpDataSourceFactory
public class VideoPlayerHttpDataSourceFactory extends BaseFactory {
    private final String userAgent;
    private final @Nullable
    TransferListener listener;
    private final int connectTimeoutMillis;
    private final int readTimeoutMillis;
    private final boolean allowCrossProtocolRedirects;
    private final Map<String, String> headers;
    private final boolean enableLog;

    public VideoPlayerHttpDataSourceFactory(
            String userAgent,
            @Nullable TransferListener listener,
            int connectTimeoutMillis,
            int readTimeoutMillis,
            boolean allowCrossProtocolRedirects,
            Map<String, String> headers,
            boolean enableLog) {
        this.userAgent = userAgent;
        this.listener = listener;
        this.connectTimeoutMillis = connectTimeoutMillis;
        this.readTimeoutMillis = readTimeoutMillis;
        this.allowCrossProtocolRedirects = allowCrossProtocolRedirects;
        this.headers = headers;
        this.enableLog = enableLog;
    }

    @Override
    protected DefaultHttpDataSource createDataSourceInternal(
            RequestProperties defaultRequestProperties) {
        if(headers != null && enableLog){
            System.out.println("DEV_INFO_VIDEO Auth headers: " + headers);
        }

        if (this.headers != null) {
            if (defaultRequestProperties == null) {
                defaultRequestProperties = new RequestProperties();
            }
            for (Map.Entry<String, String> header : this.headers.entrySet()) {
                defaultRequestProperties.set(header.getKey(), header.getValue());
            }
        }
        DefaultHttpDataSource dataSource =
                new DefaultHttpDataSource(
                        userAgent,
                        /* contentTypePredicate= */ null,
                        connectTimeoutMillis,
                        readTimeoutMillis,
                        allowCrossProtocolRedirects,
                        defaultRequestProperties);
        if (listener != null) {
            dataSource.addTransferListener(listener);
        }
        return dataSource;
    }
}
