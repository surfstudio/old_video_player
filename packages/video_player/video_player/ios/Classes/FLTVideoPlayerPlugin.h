// Copyright 2017 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

#import <Flutter/Flutter.h>
#import <AVFoundation/AVFoundation.h>

@interface FLTVideoPlayerPlugin : NSObject <FlutterPlugin>
@property(readonly, strong, nonatomic) NSMutableDictionary* players;
@end

@interface FLTVideoPlayer : NSObject <FlutterTexture, FlutterStreamHandler>
@property(readonly, nonatomic) AVPlayer* player;
@property(nonatomic) bool isPipActive;
- (void)play;
- (void)pause;
- (void)setIsPipActive:(bool)isPipActive;
@end
