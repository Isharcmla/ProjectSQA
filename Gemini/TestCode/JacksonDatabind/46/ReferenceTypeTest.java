package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;
import org.junit.Before;
import org.junit.Test;

import java.util.concurrent.atomic.AtomicReference;

import static org.junit.Assert.*;

public class ReferenceTypeTest {

    private JavaType refTargetType;
    private JavaType altRefTargetType;
    private ReferenceType referenceType;

    @Before
    public void setUp() {
        refTargetType = TypeFactory.defaultInstance().constructType(String.class);
        altRefTargetType = TypeFactory.defaultInstance().constructType(Integer.class);
        referenceType = ReferenceType.construct(AtomicReference.class, refTargetType, null, null);
    }

    @Test
    public void testConstructAndGetters_validInputs_correctInitialization() {
        ReferenceType ref = ReferenceType.construct(AtomicReference.class, refTargetType, "valueHandler", "typeHandler");
        assertNotNull(ref);
        assertEquals(AtomicReference.class, ref.getRawClass());
        assertEquals(refTargetType, ref.getReferencedType());
        assertTrue(ref.isReferenceType());
        assertFalse(ref.useStaticType());
        assertNull(ref.getValueHandler());
        assertNull(ref.getTypeHandler());
    }

    @Test
    public void testWithTypeHandler_sameAndDifferentHandlers_returnsAppropriateInstance() {
        Object handler = "customTypeHandler";

        // Different handler -> new instance with handler
        ReferenceType withH = referenceType.withTypeHandler(handler);
        assertNotSame(referenceType, withH);
        assertEquals(handler, withH.getTypeHandler());

        // Same handler -> same instance returned
        ReferenceType same = withH.withTypeHandler(handler);
        assertSame(withH, same);

        // Null handler when already null -> same instance
        assertSame(referenceType, referenceType.withTypeHandler(null));
    }

    @Test
    public void testWithContentTypeHandler_sameAndDifferentHandlers_returnsAppropriateInstance() {
        Object contentHandler = "customContentTypeHandler";

        // Different handler -> new instance with content type handler
        ReferenceType withCH = referenceType.withContentTypeHandler(contentHandler);
        assertNotSame(referenceType, withCH);
        assertEquals(contentHandler, withCH.getReferencedType().getTypeHandler());

        // Same handler -> same instance
        ReferenceType same = withCH.withContentTypeHandler(contentHandler);
        assertSame(withCH, same);

        // Null handler when already null -> same instance
        assertSame(referenceType, referenceType.withContentTypeHandler(null));
    }

    @Test
    public void testWithValueHandler_sameAndDifferentHandlers_returnsAppropriateInstance() {
        Object valHandler = "customValueHandler";

        // Different handler -> new instance
        ReferenceType withVH = referenceType.withValueHandler(valHandler);
        assertNotSame(referenceType, withVH);
        assertEquals(valHandler, withVH.getValueHandler());

        // Same handler -> same instance
        ReferenceType same = withVH.withValueHandler(valHandler);
        assertSame(withVH, same);

        // Null handler when already null -> same instance
        assertSame(referenceType, referenceType.withValueHandler(null));
    }

    @Test
    public void testWithContentValueHandler_sameAndDifferentHandlers_returnsAppropriateInstance() {
        Object contentValHandler = "customContentValHandler";

        // Different handler -> new instance
        ReferenceType withCVH = referenceType.withContentValueHandler(contentValHandler);
        assertNotSame(referenceType, withCVH);
        assertEquals(contentValHandler, withCVH.getReferencedType().getValueHandler());

        // Same handler -> same instance
        ReferenceType same = withCVH.withContentValueHandler(contentValHandler);
        assertSame(withCVH, same);

        // Null handler when already null -> same instance
        assertSame(referenceType, referenceType.withContentValueHandler(null));
    }

    @Test
    public void testWithStaticTyping_transitionsAndIdempotency() {
        assertFalse(referenceType.useStaticType());

        // First call -> returns new instance with static typing
        ReferenceType staticRef = referenceType.withStaticTyping();
        assertNotSame(referenceType, staticRef);
        assertTrue(staticRef.useStaticType());
        assertTrue(staticRef.getReferencedType().useStaticType());

        // Second call on already static instance -> returns same instance
        ReferenceType sameStaticRef = staticRef.withStaticTyping();
        assertSame(staticRef, sameStaticRef);
    }

    @Test
    public void testBuildCanonicalName_standardType_formatsCorrectly() {
        String canonical = referenceType.buildCanonicalName();
        assertEquals(AtomicReference.class.getName() + "<java.lang.String>", canonical);
    }

    @Test
    public void testNarrow_subclass_returnsNarrowedReferenceType() {
        JavaType narrowed = referenceType._narrow(AtomicReference.class);
        assertNotNull(narrowed);
        assertTrue(narrowed instanceof ReferenceType);
        assertEquals(AtomicReference.class, narrowed.getRawClass());
        assertEquals(refTargetType, ((ReferenceType) narrowed).getReferencedType());
    }

    @Test
    public void testContainedTypeCount_always_returnsOne() {
        assertEquals(1, referenceType.containedTypeCount());
    }

    @Test
    public void testContainedType_indexZero_returnsReferencedType() {
        assertSame(refTargetType, referenceType.containedType(0));
    }

    @Test
    public void testContainedType_invalidIndex_returnsNull() {
        assertNull(referenceType.containedType(1));
        assertNull(referenceType.containedType(-1));
        assertNull(referenceType.containedType(99));
    }

    @Test
    public void testContainedTypeName_indexZero_returnsT() {
        assertEquals("T", referenceType.containedTypeName(0));
    }

    @Test
    public void testContainedTypeName_invalidIndex_returnsNull() {
        assertNull(referenceType.containedTypeName(1));
        assertNull(referenceType.containedTypeName(-1));
        assertNull(referenceType.containedTypeName(99));
    }

    @Test
    public void testGetParameterSource_returnsRawClass() {
        assertSame(AtomicReference.class, referenceType.getParameterSource());
    }

    @Test
    public void testGetErasedSignature_validStringBuilder_appendsSignature() {
        StringBuilder sb = new StringBuilder();
        StringBuilder result = referenceType.getErasedSignature(sb);
        assertSame(sb, result);
        assertEquals("Ljava/util/concurrent/atomic/AtomicReference;", sb.toString());
    }

    @Test
    public void testGetGenericSignature_validStringBuilder_appendsGenericSignature() {
        StringBuilder sb = new StringBuilder();
        StringBuilder result = referenceType.getGenericSignature(sb);
        assertSame(sb, result);
        assertEquals("Ljava/util/concurrent/atomic/AtomicReference<Ljava/lang/String;;>;", sb.toString());
    }

    @Test
    public void testToString_validInstance_producesExpectedFormat() {
        String str = referenceType.toString();
        assertNotNull(str);
        assertTrue(str.startsWith("[reference type, class "));
        assertTrue(str.contains(AtomicReference.class.getName() + "<java.lang.String>"));
        assertTrue(str.endsWith(">]"));
    }

    @Test
    public void testEquals_variousScenarios_returnsExpectedBooleans() {
        // Same instance
        assertTrue(referenceType.equals(referenceType));

        // Null comparison
        assertFalse(referenceType.equals(null));

        // Different class type
        assertFalse(referenceType.equals("Not a ReferenceType"));

        // Same class and same referenced type
        ReferenceType identical = ReferenceType.construct(AtomicReference.class, refTargetType, null, null);
        assertTrue(referenceType.equals(identical));
        assertEquals(referenceType.hashCode(), identical.hashCode());

        // Different raw class
        ReferenceType diffRawClass = ReferenceType.construct(Object.class, refTargetType, null, null);
        assertFalse(referenceType.equals(diffRawClass));

        // Different referenced type
        ReferenceType diffRefType = ReferenceType.construct(AtomicReference.class, altRefTargetType, null, null);
        assertFalse(referenceType.equals(diffRefType));
    }

    @Test
    public void testProtectedConstructorDirectInvocation() {
        ReferenceType custom = new ReferenceType(AtomicReference.class, refTargetType, "val", "type", true);
        assertEquals(AtomicReference.class, custom.getRawClass());
        assertEquals(refTargetType, custom.getReferencedType());
        assertEquals("val", custom.getValueHandler());
        assertEquals("type", custom.getTypeHandler());
        assertTrue(custom.useStaticType());
    }
}
