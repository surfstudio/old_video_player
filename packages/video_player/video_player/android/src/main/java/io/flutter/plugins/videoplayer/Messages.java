// Autogenerated from Pigeon (v0.2.1), do not edit directly.
// See also: https://pub.dev/packages/pigeon

package io.flutter.plugins.videoplayer;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.StandardMessageCodec;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

/** Generated class from Pigeon. */
@SuppressWarnings({"unused", "unchecked", "CodeBlock2Expr", "RedundantSuppression"})
public class Messages {

  /** Generated class from Pigeon that represents data sent in messages. */
  public static class TextureMessage {
    private Long textureId;
    public Long getTextureId() { return textureId; }
    public void setTextureId(Long setterArg) { this.textureId = setterArg; }

    Map<String, Object> toMap() {
      Map<String, Object> toMapResult = new HashMap<>();
      toMapResult.put("textureId", textureId);
      return toMapResult;
    }
    static TextureMessage fromMap(Map<String, Object> map) {
      TextureMessage fromMapResult = new TextureMessage();
      Object textureId = map.get("textureId");
      fromMapResult.textureId = (textureId == null) ? null : ((textureId instanceof Integer) ? (Integer)textureId : (Long)textureId);
      return fromMapResult;
    }
  }

  /** Generated class from Pigeon that represents data sent in messages. */
  public static class CreateMessage {
    private String asset;
    public String getAsset() { return asset; }
    public void setAsset(String setterArg) { this.asset = setterArg; }

    private String uri;
    public String getUri() { return uri; }
    public void setUri(String setterArg) { this.uri = setterArg; }

    private String packageName;
    public String getPackageName() { return packageName; }
    public void setPackageName(String setterArg) { this.packageName = setterArg; }

    private String formatHint;
    public String getFormatHint() { return formatHint; }
    public void setFormatHint(String setterArg) { this.formatHint = setterArg; }

    private HashMap httpHeaders;

    public HashMap getHttpHeaders() {
          return httpHeaders;
      }

    public void setHttpHeaders(HashMap setterArg) {
          this.httpHeaders = setterArg;
      }

    private Long duration;
    public Long getDuration() { return duration; }
    public void setDuration(Long setterArg) { this.duration = setterArg; }

    private Boolean enableLog;
    public Boolean getEnableLog() { return enableLog; }
    public void setEnableLog(Boolean setterArg) { this.enableLog = setterArg; }

    HashMap toMap() {
      HashMap toMapResult = new HashMap<>();
      toMapResult.put("asset", asset);
      toMapResult.put("uri", uri);
      toMapResult.put("packageName", packageName);
      toMapResult.put("formatHint", formatHint);
      toMapResult.put("httpHeaders", httpHeaders);
      toMapResult.put("duration", duration);
      toMapResult.put("enableLog", enableLog);
      return toMapResult;
    }
    static CreateMessage fromMap(HashMap map) {
      CreateMessage fromMapResult = new CreateMessage();
      Object asset = map.get("asset");
      fromMapResult.asset = (String)asset;
      Object uri = map.get("uri");
      fromMapResult.uri = (String)uri;
      Object packageName = map.get("packageName");
      fromMapResult.packageName = (String)packageName;
      Object formatHint = map.get("formatHint");
      fromMapResult.formatHint = (String)formatHint;
      Object httpHeaders = map.get("httpHeaders");
      fromMapResult.httpHeaders = (HashMap)httpHeaders;
      Object duration = map.get("duration");
      fromMapResult.duration = (duration == null) ? null : ((duration instanceof Integer) ? (Integer)duration : (Long)duration);
      Object enableLog = map.get("enableLog");
      fromMapResult.enableLog = (Boolean)enableLog;
      return fromMapResult;
    }
  }

  /** Generated class from Pigeon that represents data sent in messages. */
  public static class LoopingMessage {
    private Long textureId;
    public Long getTextureId() { return textureId; }
    public void setTextureId(Long setterArg) { this.textureId = setterArg; }

    private Boolean isLooping;
    public Boolean getIsLooping() { return isLooping; }
    public void setIsLooping(Boolean setterArg) { this.isLooping = setterArg; }

    Map<String, Object> toMap() {
      Map<String, Object> toMapResult = new HashMap<>();
      toMapResult.put("textureId", textureId);
      toMapResult.put("isLooping", isLooping);
      return toMapResult;
    }
    static LoopingMessage fromMap(Map<String, Object> map) {
      LoopingMessage fromMapResult = new LoopingMessage();
      Object textureId = map.get("textureId");
      fromMapResult.textureId = (textureId == null) ? null : ((textureId instanceof Integer) ? (Integer)textureId : (Long)textureId);
      Object isLooping = map.get("isLooping");
      fromMapResult.isLooping = (Boolean)isLooping;
      return fromMapResult;
    }
  }

  /** Generated class from Pigeon that represents data sent in messages. */
  public static class VolumeMessage {
    private Long textureId;
    public Long getTextureId() { return textureId; }
    public void setTextureId(Long setterArg) { this.textureId = setterArg; }

    private Double volume;
    public Double getVolume() { return volume; }
    public void setVolume(Double setterArg) { this.volume = setterArg; }

    Map<String, Object> toMap() {
      Map<String, Object> toMapResult = new HashMap<>();
      toMapResult.put("textureId", textureId);
      toMapResult.put("volume", volume);
      return toMapResult;
    }
    static VolumeMessage fromMap(Map<String, Object> map) {
      VolumeMessage fromMapResult = new VolumeMessage();
      Object textureId = map.get("textureId");
      fromMapResult.textureId = (textureId == null) ? null : ((textureId instanceof Integer) ? (Integer)textureId : (Long)textureId);
      Object volume = map.get("volume");
      fromMapResult.volume = (Double)volume;
      return fromMapResult;
    }
  }

  /** Generated class from Pigeon that represents data sent in messages. */
  public static class PlaybackSpeedMessage {
    private Long textureId;
    public Long getTextureId() { return textureId; }
    public void setTextureId(Long setterArg) { this.textureId = setterArg; }

    private Double speed;
    public Double getSpeed() { return speed; }
    public void setSpeed(Double setterArg) { this.speed = setterArg; }

    Map<String, Object> toMap() {
      Map<String, Object> toMapResult = new HashMap<>();
      toMapResult.put("textureId", textureId);
      toMapResult.put("speed", speed);
      return toMapResult;
    }
    static PlaybackSpeedMessage fromMap(Map<String, Object> map) {
      PlaybackSpeedMessage fromMapResult = new PlaybackSpeedMessage();
      Object textureId = map.get("textureId");
      fromMapResult.textureId = (textureId == null) ? null : ((textureId instanceof Integer) ? (Integer)textureId : (Long)textureId);
      Object speed = map.get("speed");
      fromMapResult.speed = (Double)speed;
      return fromMapResult;
    }
  }

  /** Generated class from Pigeon that represents data sent in messages. */
  public static class PositionMessage {
    private Long textureId;
    public Long getTextureId() { return textureId; }
    public void setTextureId(Long setterArg) { this.textureId = setterArg; }

    private Long position;
    public Long getPosition() { return position; }
    public void setPosition(Long setterArg) { this.position = setterArg; }

    Map<String, Object> toMap() {
      Map<String, Object> toMapResult = new HashMap<>();
      toMapResult.put("textureId", textureId);
      toMapResult.put("position", position);
      return toMapResult;
    }
    static PositionMessage fromMap(Map<String, Object> map) {
      PositionMessage fromMapResult = new PositionMessage();
      Object textureId = map.get("textureId");
      fromMapResult.textureId = (textureId == null) ? null : ((textureId instanceof Integer) ? (Integer)textureId : (Long)textureId);
      Object position = map.get("position");
      fromMapResult.position = (position == null) ? null : ((position instanceof Integer) ? (Integer)position : (Long)position);
      return fromMapResult;
    }
  }

  /** Generated class from Pigeon that represents data sent in messages. */
  public static class MixWithOthersMessage {
    private Boolean mixWithOthers;
    public Boolean getMixWithOthers() { return mixWithOthers; }
    public void setMixWithOthers(Boolean setterArg) { this.mixWithOthers = setterArg; }

    Map<String, Object> toMap() {
      Map<String, Object> toMapResult = new HashMap<>();
      toMapResult.put("mixWithOthers", mixWithOthers);
      return toMapResult;
    }
    static MixWithOthersMessage fromMap(Map<String, Object> map) {
      MixWithOthersMessage fromMapResult = new MixWithOthersMessage();
      Object mixWithOthers = map.get("mixWithOthers");
      fromMapResult.mixWithOthers = (Boolean)mixWithOthers;
      return fromMapResult;
    }
  }

  /** Generated interface from Pigeon that represents a handler of messages from Flutter.*/
  public interface VideoPlayerApi {
    void initialize();
    TextureMessage create(CreateMessage arg);
    void dispose(TextureMessage arg);
    void setLooping(LoopingMessage arg);
    void setVolume(VolumeMessage arg);
    void setPlaybackSpeed(PlaybackSpeedMessage arg);
    void play(TextureMessage arg);
    PositionMessage position(TextureMessage arg);
    void seekTo(PositionMessage arg);
    void pause(TextureMessage arg);
    void setMixWithOthers(MixWithOthersMessage arg);

    /** Sets up an instance of `VideoPlayerApi` to handle messages through the `binaryMessenger`. */
    static void setup(BinaryMessenger binaryMessenger, VideoPlayerApi api) {
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.VideoPlayerApi.initialize", new StandardMessageCodec());
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            Map<String, Object> wrapped = new HashMap<>();
            try {
              api.initialize();
              wrapped.put("result", null);
            }
            catch (Error | RuntimeException exception) {
              wrapped.put("error", wrapError(exception));
            }
            reply.reply(wrapped);
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.VideoPlayerApi.create", new StandardMessageCodec());
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            Map<String, Object> wrapped = new HashMap<>();
            try {
              @SuppressWarnings("ConstantConditions")
              CreateMessage input = CreateMessage.fromMap((HashMap) message);
              TextureMessage output = api.create(input);
              wrapped.put("result", output.toMap());
            }
            catch (Error | RuntimeException exception) {
              wrapped.put("error", wrapError(exception));
            }
            reply.reply(wrapped);
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.VideoPlayerApi.dispose", new StandardMessageCodec());
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            Map<String, Object> wrapped = new HashMap<>();
            try {
              @SuppressWarnings("ConstantConditions")
              TextureMessage input = TextureMessage.fromMap((Map<String, Object>)message);
              api.dispose(input);
              wrapped.put("result", null);
            }
            catch (Error | RuntimeException exception) {
              wrapped.put("error", wrapError(exception));
            }
            reply.reply(wrapped);
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.VideoPlayerApi.setLooping", new StandardMessageCodec());
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            Map<String, Object> wrapped = new HashMap<>();
            try {
              @SuppressWarnings("ConstantConditions")
              LoopingMessage input = LoopingMessage.fromMap((Map<String, Object>)message);
              api.setLooping(input);
              wrapped.put("result", null);
            }
            catch (Error | RuntimeException exception) {
              wrapped.put("error", wrapError(exception));
            }
            reply.reply(wrapped);
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.VideoPlayerApi.setVolume", new StandardMessageCodec());
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            Map<String, Object> wrapped = new HashMap<>();
            try {
              @SuppressWarnings("ConstantConditions")
              VolumeMessage input = VolumeMessage.fromMap((Map<String, Object>)message);
              api.setVolume(input);
              wrapped.put("result", null);
            }
            catch (Error | RuntimeException exception) {
              wrapped.put("error", wrapError(exception));
            }
            reply.reply(wrapped);
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.VideoPlayerApi.setPlaybackSpeed", new StandardMessageCodec());
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            Map<String, Object> wrapped = new HashMap<>();
            try {
              @SuppressWarnings("ConstantConditions")
              PlaybackSpeedMessage input = PlaybackSpeedMessage.fromMap((Map<String, Object>)message);
              api.setPlaybackSpeed(input);
              wrapped.put("result", null);
            }
            catch (Error | RuntimeException exception) {
              wrapped.put("error", wrapError(exception));
            }
            reply.reply(wrapped);
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.VideoPlayerApi.play", new StandardMessageCodec());
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            Map<String, Object> wrapped = new HashMap<>();
            try {
              @SuppressWarnings("ConstantConditions")
              TextureMessage input = TextureMessage.fromMap((Map<String, Object>)message);
              api.play(input);
              wrapped.put("result", null);
            }
            catch (Error | RuntimeException exception) {
              wrapped.put("error", wrapError(exception));
            }
            reply.reply(wrapped);
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.VideoPlayerApi.position", new StandardMessageCodec());
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            Map<String, Object> wrapped = new HashMap<>();
            try {
              @SuppressWarnings("ConstantConditions")
              TextureMessage input = TextureMessage.fromMap((Map<String, Object>)message);
              PositionMessage output = api.position(input);
              wrapped.put("result", output.toMap());
            }
            catch (Error | RuntimeException exception) {
              wrapped.put("error", wrapError(exception));
            }
            reply.reply(wrapped);
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.VideoPlayerApi.seekTo", new StandardMessageCodec());
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            Map<String, Object> wrapped = new HashMap<>();
            try {
              @SuppressWarnings("ConstantConditions")
              PositionMessage input = PositionMessage.fromMap((Map<String, Object>)message);
              api.seekTo(input);
              wrapped.put("result", null);
            }
            catch (Error | RuntimeException exception) {
              wrapped.put("error", wrapError(exception));
            }
            reply.reply(wrapped);
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.VideoPlayerApi.pause", new StandardMessageCodec());
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            Map<String, Object> wrapped = new HashMap<>();
            try {
              @SuppressWarnings("ConstantConditions")
              TextureMessage input = TextureMessage.fromMap((Map<String, Object>)message);
              api.pause(input);
              wrapped.put("result", null);
            }
            catch (Error | RuntimeException exception) {
              wrapped.put("error", wrapError(exception));
            }
            reply.reply(wrapped);
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.VideoPlayerApi.setMixWithOthers", new StandardMessageCodec());
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            Map<String, Object> wrapped = new HashMap<>();
            try {
              @SuppressWarnings("ConstantConditions")
              MixWithOthersMessage input = MixWithOthersMessage.fromMap((Map<String, Object>)message);
              api.setMixWithOthers(input);
              wrapped.put("result", null);
            }
            catch (Error | RuntimeException exception) {
              wrapped.put("error", wrapError(exception));
            }
            reply.reply(wrapped);
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
    }
  }
  private static Map<String, Object> wrapError(Throwable exception) {
    Map<String, Object> errorMap = new HashMap<>();
    errorMap.put("message", exception.toString());
    errorMap.put("code", exception.getClass().getSimpleName());
    errorMap.put("details", null);
    return errorMap;
  }
}
