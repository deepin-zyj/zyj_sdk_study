// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: baseProtoc.proto

package proto.base;

public interface BaseResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:proto.user.BaseResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *状态码
   * </pre>
   *
   * <code>int32 code = 1;</code>
   * @return The code.
   */
  int getCode();

  /**
   * <code>string message = 2;</code>
   * @return The message.
   */
  java.lang.String getMessage();
  /**
   * <code>string message = 2;</code>
   * @return The bytes for message.
   */
  com.google.protobuf.ByteString
      getMessageBytes();

  /**
   * <code>bytes data = 3;</code>
   * @return The data.
   */
  com.google.protobuf.ByteString getData();
}
