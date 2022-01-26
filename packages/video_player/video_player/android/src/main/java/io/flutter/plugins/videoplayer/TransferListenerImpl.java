package io.flutter.plugins.videoplayer;

import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.TransferListener;

import java.util.Map;

/** Listen to network transfer */
class TransferListenerImpl implements TransferListener {
  @Override
  public void onTransferInitializing(DataSource source, DataSpec dataSpec, boolean isNetwork) {
    log("onTransferInitializing", source, dataSpec, isNetwork, null);
  }

  @Override
  public void onTransferStart(DataSource source, DataSpec dataSpec, boolean isNetwork) {
    log("onTransferStart", source, dataSpec, isNetwork, null);
  }

  @Override
  public void onBytesTransferred(
      DataSource source, DataSpec dataSpec, boolean isNetwork, int bytesTransferred) {
    log("onBytesTransferred", source, dataSpec, isNetwork, bytesTransferred);
  }

  @Override
  public void onTransferEnd(DataSource source, DataSpec dataSpec, boolean isNetwork) {
    log("onTransferEnd", source, dataSpec, isNetwork, null);
  }

  private void log(
      String methodName,
      DataSource source,
      DataSpec dataSpec,
      Boolean isNetwork,
      Integer bytesTransferred) {
    StringBuilder stringBuilder =
        new StringBuilder("DEV_INFO_VIDEO TransferListener." + methodName + "(");

    if (dataSpec != null) {
      if (dataSpec.uri != null) {
        stringBuilder.append(" url: ").append(dataSpec.uri);
      }
    }

    if (source != null) {
      if (source.getResponseHeaders() != null) {
        stringBuilder.append(" responseHeaders").append(source.getResponseHeaders().toString());
      }
    }

    if (isNetwork != null) {
      stringBuilder.append(" isNetwork: ").append(isNetwork);
    }

    if (bytesTransferred != null) {
      stringBuilder.append(" bytesTransferred: ").append(bytesTransferred);
    }

    stringBuilder.append(")");
    System.out.println(stringBuilder.toString());
  }

  /**
   * Convert map to String
   *
   * @param map - map for converting
   * @return String representing map
   */
  private String convertWithIteration(Map<String, ?> map) {
    StringBuilder mapAsString = new StringBuilder("{");
    for (String key : map.keySet()) {
      mapAsString.append(key).append("=").append(map.get(key)).append(", ");
    }
    mapAsString.delete(mapAsString.length() - 2, mapAsString.length()).append("}");
    return mapAsString.toString();
  }
}
