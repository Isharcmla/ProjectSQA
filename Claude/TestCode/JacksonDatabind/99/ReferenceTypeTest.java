package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class ReferenceTypeTest {

    private JavaType stringType;
    private JavaType intType;
    private JavaType longType;
    private JavaType listType;

    @Before
    public void setUp() {
        stringType = TypeFactory.defaultInstance().constructType(String.class);
        intType = TypeFactory.defaultInstance().constructType(Integer.class);
        longType = TypeFactory.defaultInstance().constructType(Long.class);
        listType = TypeFactory.defaultInstance().constructType(java.util.ArrayList.class);
    }

    // ---------------------------------------------------------
    // upgradeFrom
    // ---------------------------------------------------------

    @Test
    public void testUpgradeFrom_validInputs_returnsReferenceType() {
        ReferenceType rt = ReferenceType.upgradeFrom(stringType, intType);
        assertNotNull(rt);
        assertEquals(intType, rt.getReferencedType());
        assertTrue(rt.isAnchorType());
        assertSame(rt, rt.getAnchorType());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testUpgradeFrom_nullRefType_throwsException() {
        ReferenceType.upgradeFrom(stringType, null);
    }

    // Note: testing the "baseType not instanceof TypeBase" branch of upgradeFrom
    // is not feasible without extending the abstract JavaType class with many
    // abstract method implementations, and mocking frameworks are not allowed.
    // This branch is therefore not covered.

    // ---------------------------------------------------------
    // construct (static factory methods)
    // ---------------------------------------------------------

    @Test
    public void testConstruct_fiveArgVersion_returnsValidReferenceType() {
        ReferenceType rt = ReferenceType.construct(
                java.util.concurrent.atomic.AtomicReference.class,
                TypeBindings.emptyBindings(),
                null, null, intType);
        assertNotNull(rt);
        assertEquals(intType, rt.getContentType());
        assertTrue(rt.isReferenceType());
    }

    @SuppressWarnings("deprecation")
    @Test
    public void testConstruct_deprecatedTwoArgVersion_returnsValidReferenceType() {
        ReferenceType rt = ReferenceType.construct(
                java.util.concurrent.atomic.AtomicReference.class, intType);
        assertNotNull(rt);
        assertEquals(intType, rt.getReferencedType());
    }

    // ---------------------------------------------------------
    // withContentType
    // ---------------------------------------------------------

    @Test
    public void testWithContentType_differentType_returnsNewInstance() {
        ReferenceType rt = ReferenceType.upgradeFrom(stringType, intType);
        JavaType updated = rt.withContentType(longType);
        assertNotSame(rt, updated);
        assertEquals(longType, updated.getContentType());
    }

    @Test
    public void testWithContentType_sameType_returnsSameInstance() {
        ReferenceType rt = ReferenceType.upgradeFrom(stringType, intType);
        JavaType updated = rt.withContentType(rt.getContentType());
        assertSame(rt, updated);
    }

    // ---------------------------------------------------------
    // withTypeHandler
    // ---------------------------------------------------------

    @Test
    public void testWithTypeHandler_differentHandler_returnsNewInstance() {
        ReferenceType rt = ReferenceType.upgradeFrom(stringType, intType);
        Object handler = new Object();
        ReferenceType updated = rt.withTypeHandler(handler);
        assertNotSame(rt, updated);
        assertSame(handler, updated.getTypeHandler());
    }

    @Test
    public void testWithTypeHandler_sameHandler_returnsSameInstance() {
        ReferenceType rt = ReferenceType.upgradeFrom(stringType, intType);
        ReferenceType updated = rt.withTypeHandler(rt.getTypeHandler());
        assertSame(rt, updated);
    }

    // ---------------------------------------------------------
    // withContentTypeHandler
    // ---------------------------------------------------------

    @Test
    public void testWithContentTypeHandler_differentHandler_returnsNewInstance() {
        ReferenceType rt = ReferenceType.upgradeFrom(stringType, intType);
        Object handler = new Object();
        ReferenceType updated = rt.withContentTypeHandler(handler);
        assertNotSame(rt, updated);
        assertSame(handler, updated.getContentType().getTypeHandler());
    }

    @Test
    public void testWithContentTypeHandler_sameHandler_returnsSameInstance() {
        ReferenceType rt = ReferenceType.upgradeFrom(stringType, intType);
        Object existingHandler = rt.getContentType().getTypeHandler();
        ReferenceType updated = rt.withContentTypeHandler(existingHandler);
        assertSame(rt, updated);
    }

    // ---------------------------------------------------------
    // withValueHandler
    // ---------------------------------------------------------

    @Test
    public void testWithValueHandler_differentHandler_returnsNewInstance() {
        ReferenceType rt = ReferenceType.upgradeFrom(stringType, intType);
        Object handler = new Object();
        ReferenceType updated = rt.withValueHandler(handler);
        assertNotSame(rt, updated);
        assertSame(handler, updated.getValueHandler());
    }

    @Test
    public void testWithValueHandler_sameHandler_returnsSameInstance() {
        ReferenceType rt = ReferenceType.upgradeFrom(stringType, intType);
        ReferenceType updated = rt.withValueHandler(rt.getValueHandler());
        assertSame(rt, updated);
    }

    // ---------------------------------------------------------
    // withContentValueHandler
    // ---------------------------------------------------------

    @Test
    public void testWithContentValueHandler_differentHandler_returnsNewInstance() {
        ReferenceType rt = ReferenceType.upgradeFrom(stringType, intType);
        Object handler = new Object();
        ReferenceType updated = rt.withContentValueHandler(handler);
        assertNotSame(rt, updated);
        assertSame(handler, updated.getContentType().getValueHandler());
    }

    @Test
    public void testWithContentValueHandler_sameHandler_returnsSameInstance() {
        ReferenceType rt = ReferenceType.upgradeFrom(stringType, intType);
        Object existingHandler = rt.getContentType().getValueHandler();
        ReferenceType updated = rt.withContentValueHandler(existingHandler);
        assertSame(rt, updated);
    }

    // ---------------------------------------------------------
    // withStaticTyping
    // ---------------------------------------------------------

    @Test
    public void testWithStaticTyping_notStatic_returnsNewInstance() {
        ReferenceType rt = ReferenceType.upgradeFrom(stringType, intType);
        ReferenceType updated = rt.withStaticTyping();
        assertNotSame(rt, updated);
        assertTrue(updated.isStatic());
    }

    @Test
    public void testWithStaticTyping_alreadyStatic_returnsSameInstance() {
        ReferenceType rt = ReferenceType.upgradeFrom(stringType, intType);
        ReferenceType staticRt = rt.withStaticTyping();
        ReferenceType updatedAgain = staticRt.withStaticTyping();
        assertSame(staticRt, updatedAgain);
    }

    // ---------------------------------------------------------
    // refine
    // ---------------------------------------------------------

    @Test
    public void testRefine_validArgs_returnsNewReferenceType() {
        ReferenceType rt = ReferenceType.upgradeFrom(stringType, intType);
        JavaType refined = rt.refine(java.util.concurrent.atomic.AtomicReference.class,
                TypeBindings.emptyBindings(), null, null);
        assertNotNull(refined);
        assertTrue(refined instanceof ReferenceType);
        assertEquals(java.util.concurrent.atomic.AtomicReference.class, refined.getRawClass());
    }

    // ---------------------------------------------------------
    // _narrow (deprecated, protected)
    // ---------------------------------------------------------

    @SuppressWarnings("deprecation")
    @Test
    public void testNarrow_validSubclass_returnsNewReferenceType() {
        ReferenceType rt = ReferenceType.upgradeFrom(stringType, intType);
        JavaType narrowed = rt._narrow(String.class);
        assertNotNull(narrowed);
        assertTrue(narrowed instanceof ReferenceType);
        assertEquals(String.class, narrowed.getRawClass());
    }

    // ---------------------------------------------------------
    // buildCanonicalName (protected)
    // ---------------------------------------------------------

    @Test
    public void testBuildCanonicalName_returnsExpectedFormat() {
        ReferenceType rt = ReferenceType.upgradeFrom(stringType, intType);
        String canonical = rt.buildCanonicalName();
        assertNotNull(canonical);
        assertTrue(canonical.contains(String.class.getName()));
        assertTrue(canonical.contains(intType.toCanonical()));
    }

    // ---------------------------------------------------------
    // getContentType / getReferencedType
    // ---------------------------------------------------------

    @Test
    public void testGetContentType_returnsReferencedType() {
        ReferenceType rt = ReferenceType.upgradeFrom(stringType, intType);
        assertEquals(intType, rt.getContentType());
    }

    @Test
    public void testGetReferencedType_returnsReferencedType() {
        ReferenceType rt = ReferenceType.upgradeFrom(stringType, intType);
        assertEquals(intType, rt.getReferencedType());
    }

    // ---------------------------------------------------------
    // hasContentType / isReferenceType
    // ---------------------------------------------------------

    @Test
    public void testHasContentType_alwaysTrue() {
        ReferenceType rt = ReferenceType.upgradeFrom(stringType, intType);
        assertTrue(rt.hasContentType());
    }

    @Test
    public void testIsReferenceType_alwaysTrue() {
        ReferenceType rt = ReferenceType.upgradeFrom(stringType, intType);
        assertTrue(rt.isReferenceType());
    }

    // ---------------------------------------------------------
    // getErasedSignature / getGenericSignature
    // ---------------------------------------------------------

    @Test
    public void testGetErasedSignature_returnsNonEmptySignature() {
        ReferenceType rt = ReferenceType.upgradeFrom(stringType, intType);
        StringBuilder sb = new StringBuilder();
        StringBuilder result = rt.getErasedSignature(sb);
        assertNotNull(result);
        assertTrue(result.length() > 0);
    }

    @Test
    public void testGetGenericSignature_returnsExpectedFormat() {
        ReferenceType rt = ReferenceType.upgradeFrom(stringType, intType);
        StringBuilder sb = new StringBuilder();
        StringBuilder result = rt.getGenericSignature(sb);
        assertNotNull(result);
        String sig = result.toString();
        assertTrue(sig.contains("<"));
        assertTrue(sig.endsWith(">;"));
    }

    // ---------------------------------------------------------
    // getAnchorType / isAnchorType
    // ---------------------------------------------------------

    @Test
    public void testGetAnchorType_forFreshlyUpgradedType_returnsSelf() {
        ReferenceType rt = ReferenceType.upgradeFrom(stringType, intType);
        assertSame(rt, rt.getAnchorType());
    }

    @Test
    public void testIsAnchorType_forFreshlyUpgradedType_returnsTrue() {
        ReferenceType rt = ReferenceType.upgradeFrom(stringType, intType);
        assertTrue(rt.isAnchorType());
    }

    @Test
    public void testIsAnchorType_forDerivedType_returnsTrue() {
        // withContentType preserves the original anchor type
        ReferenceType rt = ReferenceType.upgradeFrom(stringType, intType);
        JavaType updated = rt.withContentType(longType);
        assertTrue(updated instanceof ReferenceType);
        ReferenceType updatedRt = (ReferenceType) updated;
        // anchor should still point back to original rt
        assertSame(rt, updatedRt.getAnchorType());
        assertFalse(updatedRt.isAnchorType());
    }

    // ---------------------------------------------------------
    // toString
    // ---------------------------------------------------------

    @Test
    public void testToString_containsExpectedParts() {
        ReferenceType rt = ReferenceType.upgradeFrom(stringType, intType);
        String str = rt.toString();
        assertNotNull(str);
        assertTrue(str.startsWith("[reference type, class "));
        assertTrue(str.contains(String.class.getName()));
        assertTrue(str.endsWith("]"));
    }

    // ---------------------------------------------------------
    // equals
    // ---------------------------------------------------------

    @Test
    public void testEquals_sameInstance_returnsTrue() {
        ReferenceType rt = ReferenceType.upgradeFrom(stringType, intType);
        assertTrue(rt.equals(rt));
    }

    @Test
    public void testEquals_null_returnsFalse() {
        ReferenceType rt = ReferenceType.upgradeFrom(stringType, intType);
        assertFalse(rt.equals(null));
    }

    @Test
    public void testEquals_differentClassType_returnsFalse() {
        ReferenceType rt = ReferenceType.upgradeFrom(stringType, intType);
        assertFalse(rt.equals("not a reference type"));
    }

    @Test
    public void testEquals_differentRawClass_returnsFalse() {
        ReferenceType rt1 = ReferenceType.upgradeFrom(stringType, intType);
        ReferenceType rt2 = ReferenceType.upgradeFrom(listType, intType);
        assertFalse(rt1.equals(rt2));
    }

    @Test
    public void testEquals_differentReferencedType_returnsFalse() {
        ReferenceType rt1 = ReferenceType.upgradeFrom(stringType, intType);
        ReferenceType rt2 = ReferenceType.upgradeFrom(stringType, longType);
        assertFalse(rt1.equals(rt2));
    }

    @Test
    public void testEquals_sameRawClassAndReferencedType_returnsTrue() {
        ReferenceType rt1 = ReferenceType.upgradeFrom(stringType, intType);
        ReferenceType rt2 = ReferenceType.upgradeFrom(
                TypeFactory.defaultInstance().constructType(String.class), intType);
        assertTrue(rt1.equals(rt2));
    }
}
