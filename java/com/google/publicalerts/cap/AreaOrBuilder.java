// Generated by the protocol buffer compiler.  DO NOT EDIT!

package com.google.publicalerts.cap;

public interface AreaOrBuilder
    extends com.google.protobuf.MessageOrBuilder {
  
  // required string area_desc = 1;
  boolean hasAreaDesc();
  String getAreaDesc();
  
  // repeated .alerts.cap.Polygon polygon = 2;
  java.util.List<com.google.publicalerts.cap.Polygon> 
      getPolygonList();
  com.google.publicalerts.cap.Polygon getPolygon(int index);
  int getPolygonCount();
  java.util.List<? extends com.google.publicalerts.cap.PolygonOrBuilder> 
      getPolygonOrBuilderList();
  com.google.publicalerts.cap.PolygonOrBuilder getPolygonOrBuilder(
      int index);
  
  // repeated .alerts.cap.Circle circle = 3;
  java.util.List<com.google.publicalerts.cap.Circle> 
      getCircleList();
  com.google.publicalerts.cap.Circle getCircle(int index);
  int getCircleCount();
  java.util.List<? extends com.google.publicalerts.cap.CircleOrBuilder> 
      getCircleOrBuilderList();
  com.google.publicalerts.cap.CircleOrBuilder getCircleOrBuilder(
      int index);
  
  // repeated .alerts.cap.ValuePair geocode = 4;
  java.util.List<com.google.publicalerts.cap.ValuePair> 
      getGeocodeList();
  com.google.publicalerts.cap.ValuePair getGeocode(int index);
  int getGeocodeCount();
  java.util.List<? extends com.google.publicalerts.cap.ValuePairOrBuilder> 
      getGeocodeOrBuilderList();
  com.google.publicalerts.cap.ValuePairOrBuilder getGeocodeOrBuilder(
      int index);
  
  // optional double altitude = 5;
  boolean hasAltitude();
  double getAltitude();
  
  // optional double ceiling = 6;
  boolean hasCeiling();
  double getCeiling();
}
