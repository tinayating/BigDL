// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: variable.proto

package org.tensorflow.framework;

public interface VariableDefOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.VariableDef)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Name of the variable tensor.
   * </pre>
   *
   * <code>optional string variable_name = 1;</code>
   */
  java.lang.String getVariableName();
  /**
   * <pre>
   * Name of the variable tensor.
   * </pre>
   *
   * <code>optional string variable_name = 1;</code>
   */
  com.google.protobuf.ByteString
      getVariableNameBytes();

  /**
   * <pre>
   * Name of the initializer op.
   * </pre>
   *
   * <code>optional string initializer_name = 2;</code>
   */
  java.lang.String getInitializerName();
  /**
   * <pre>
   * Name of the initializer op.
   * </pre>
   *
   * <code>optional string initializer_name = 2;</code>
   */
  com.google.protobuf.ByteString
      getInitializerNameBytes();

  /**
   * <pre>
   * Name of the snapshot tensor.
   * </pre>
   *
   * <code>optional string snapshot_name = 3;</code>
   */
  java.lang.String getSnapshotName();
  /**
   * <pre>
   * Name of the snapshot tensor.
   * </pre>
   *
   * <code>optional string snapshot_name = 3;</code>
   */
  com.google.protobuf.ByteString
      getSnapshotNameBytes();

  /**
   * <pre>
   * Support for saving variables as slices of a larger variable.
   * </pre>
   *
   * <code>optional .tensorflow.SaveSliceInfoDef save_slice_info_def = 4;</code>
   */
  boolean hasSaveSliceInfoDef();
  /**
   * <pre>
   * Support for saving variables as slices of a larger variable.
   * </pre>
   *
   * <code>optional .tensorflow.SaveSliceInfoDef save_slice_info_def = 4;</code>
   */
  org.tensorflow.framework.SaveSliceInfoDef getSaveSliceInfoDef();
  /**
   * <pre>
   * Support for saving variables as slices of a larger variable.
   * </pre>
   *
   * <code>optional .tensorflow.SaveSliceInfoDef save_slice_info_def = 4;</code>
   */
  org.tensorflow.framework.SaveSliceInfoDefOrBuilder getSaveSliceInfoDefOrBuilder();
}