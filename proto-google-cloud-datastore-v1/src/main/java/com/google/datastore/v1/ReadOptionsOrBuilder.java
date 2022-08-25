/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/datastore/v1/datastore.proto

package com.google.datastore.v1;

public interface ReadOptionsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.datastore.v1.ReadOptions)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The non-transactional read consistency to use.
   * </pre>
   *
   * <code>.google.datastore.v1.ReadOptions.ReadConsistency read_consistency = 1;</code>
   *
   * @return Whether the readConsistency field is set.
   */
  boolean hasReadConsistency();
  /**
   *
   *
   * <pre>
   * The non-transactional read consistency to use.
   * </pre>
   *
   * <code>.google.datastore.v1.ReadOptions.ReadConsistency read_consistency = 1;</code>
   *
   * @return The enum numeric value on the wire for readConsistency.
   */
  int getReadConsistencyValue();
  /**
   *
   *
   * <pre>
   * The non-transactional read consistency to use.
   * </pre>
   *
   * <code>.google.datastore.v1.ReadOptions.ReadConsistency read_consistency = 1;</code>
   *
   * @return The readConsistency.
   */
  com.google.datastore.v1.ReadOptions.ReadConsistency getReadConsistency();

  /**
   *
   *
   * <pre>
   * The identifier of the transaction in which to read. A
   * transaction identifier is returned by a call to
   * [Datastore.BeginTransaction][google.datastore.v1.Datastore.BeginTransaction].
   * </pre>
   *
   * <code>bytes transaction = 2;</code>
   *
   * @return Whether the transaction field is set.
   */
  boolean hasTransaction();
  /**
   *
   *
   * <pre>
   * The identifier of the transaction in which to read. A
   * transaction identifier is returned by a call to
   * [Datastore.BeginTransaction][google.datastore.v1.Datastore.BeginTransaction].
   * </pre>
   *
   * <code>bytes transaction = 2;</code>
   *
   * @return The transaction.
   */
  com.google.protobuf.ByteString getTransaction();

  /**
   *
   *
   * <pre>
   * Reads entities as they were at the given time. This may not be older
   * than 270 seconds.  This value is only supported for Cloud Firestore in
   * Datastore mode.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp read_time = 4;</code>
   *
   * @return Whether the readTime field is set.
   */
  boolean hasReadTime();
  /**
   *
   *
   * <pre>
   * Reads entities as they were at the given time. This may not be older
   * than 270 seconds.  This value is only supported for Cloud Firestore in
   * Datastore mode.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp read_time = 4;</code>
   *
   * @return The readTime.
   */
  com.google.protobuf.Timestamp getReadTime();
  /**
   *
   *
   * <pre>
   * Reads entities as they were at the given time. This may not be older
   * than 270 seconds.  This value is only supported for Cloud Firestore in
   * Datastore mode.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp read_time = 4;</code>
   */
  com.google.protobuf.TimestampOrBuilder getReadTimeOrBuilder();

  public com.google.datastore.v1.ReadOptions.ConsistencyTypeCase getConsistencyTypeCase();
}
