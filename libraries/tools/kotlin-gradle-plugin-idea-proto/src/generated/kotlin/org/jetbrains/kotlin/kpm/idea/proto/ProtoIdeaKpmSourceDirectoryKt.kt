//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: proto_idea_kpm.proto

package org.jetbrains.kotlin.kpm.idea.proto;

@kotlin.jvm.JvmSynthetic
internal inline fun protoIdeaKpmSourceDirectory(block: org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmSourceDirectoryKt.Dsl.() -> kotlin.Unit): org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmSourceDirectory =
  org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmSourceDirectoryKt.Dsl._create(org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmSourceDirectory.newBuilder()).apply { block() }._build()
internal object ProtoIdeaKpmSourceDirectoryKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  internal class Dsl private constructor(
    private val _builder: org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmSourceDirectory.Builder
  ) {
    internal companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmSourceDirectory.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmSourceDirectory = _builder.build()

    /**
     * <code>string absolute_path = 1;</code>
     */
    internal var absolutePath: kotlin.String
      @JvmName("getAbsolutePath")
      get() = _builder.getAbsolutePath()
      @JvmName("setAbsolutePath")
      set(value) {
        _builder.setAbsolutePath(value)
      }
    /**
     * <code>string absolute_path = 1;</code>
     */
    internal fun clearAbsolutePath() {
      _builder.clearAbsolutePath()
    }
  }
}
@kotlin.jvm.JvmSynthetic
internal inline fun org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmSourceDirectory.copy(block: org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmSourceDirectoryKt.Dsl.() -> kotlin.Unit): org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmSourceDirectory =
  org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmSourceDirectoryKt.Dsl._create(this.toBuilder()).apply { block() }._build()
