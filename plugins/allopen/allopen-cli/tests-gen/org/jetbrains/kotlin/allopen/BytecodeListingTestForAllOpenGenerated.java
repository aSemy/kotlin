/*
 * Copyright 2010-2021 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.allopen;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link GenerateNewCompilerTests.kt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("plugins/allopen/allopen-cli/testData/bytecodeListing")
@TestDataPath("$PROJECT_ROOT")
public class BytecodeListingTestForAllOpenGenerated extends AbstractBytecodeListingTestForAllOpen {
    @Test
    public void testAllFilesPresentInBytecodeListing() throws Exception {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("plugins/allopen/allopen-cli/testData/bytecodeListing"), Pattern.compile("^(.+)\\.kt$"), Pattern.compile("^(.+)\\.fir\\.kts?$"), TargetBackend.JVM, true);
    }

    @Test
    @TestMetadata("allOpenOnNotClasses.kt")
    public void testAllOpenOnNotClasses() throws Exception {
        runTest("plugins/allopen/allopen-cli/testData/bytecodeListing/allOpenOnNotClasses.kt");
    }

    @Test
    @TestMetadata("alreadyOpen.kt")
    public void testAlreadyOpen() throws Exception {
        runTest("plugins/allopen/allopen-cli/testData/bytecodeListing/alreadyOpen.kt");
    }

    @Test
    @TestMetadata("annotationMembers.kt")
    public void testAnnotationMembers() throws Exception {
        runTest("plugins/allopen/allopen-cli/testData/bytecodeListing/annotationMembers.kt");
    }

    @Test
    @TestMetadata("anonymousObject.kt")
    public void testAnonymousObject() throws Exception {
        runTest("plugins/allopen/allopen-cli/testData/bytecodeListing/anonymousObject.kt");
    }

    @Test
    @TestMetadata("explicitFinal.kt")
    public void testExplicitFinal() throws Exception {
        runTest("plugins/allopen/allopen-cli/testData/bytecodeListing/explicitFinal.kt");
    }

    @Test
    @TestMetadata("metaAnnotation.kt")
    public void testMetaAnnotation() throws Exception {
        runTest("plugins/allopen/allopen-cli/testData/bytecodeListing/metaAnnotation.kt");
    }

    @Test
    @TestMetadata("nestedClass.kt")
    public void testNestedClass() throws Exception {
        runTest("plugins/allopen/allopen-cli/testData/bytecodeListing/nestedClass.kt");
    }

    @Test
    @TestMetadata("nestedInner.kt")
    public void testNestedInner() throws Exception {
        runTest("plugins/allopen/allopen-cli/testData/bytecodeListing/nestedInner.kt");
    }

    @Test
    @TestMetadata("noAllOpen.kt")
    public void testNoAllOpen() throws Exception {
        runTest("plugins/allopen/allopen-cli/testData/bytecodeListing/noAllOpen.kt");
    }

    @Test
    @TestMetadata("privateMembers.kt")
    public void testPrivateMembers() throws Exception {
        runTest("plugins/allopen/allopen-cli/testData/bytecodeListing/privateMembers.kt");
    }

    @Test
    @TestMetadata("sealed.kt")
    public void testSealed() throws Exception {
        runTest("plugins/allopen/allopen-cli/testData/bytecodeListing/sealed.kt");
    }

    @Test
    @TestMetadata("severalAllOpen.kt")
    public void testSeveralAllOpen() throws Exception {
        runTest("plugins/allopen/allopen-cli/testData/bytecodeListing/severalAllOpen.kt");
    }

    @Test
    @TestMetadata("simple.kt")
    public void testSimple() throws Exception {
        runTest("plugins/allopen/allopen-cli/testData/bytecodeListing/simple.kt");
    }

    @Test
    @TestMetadata("springAnnotations.kt")
    public void testSpringAnnotations() throws Exception {
        runTest("plugins/allopen/allopen-cli/testData/bytecodeListing/springAnnotations.kt");
    }

    @Test
    @TestMetadata("superClassAnnotation.kt")
    public void testSuperClassAnnotation() throws Exception {
        runTest("plugins/allopen/allopen-cli/testData/bytecodeListing/superClassAnnotation.kt");
    }
}
