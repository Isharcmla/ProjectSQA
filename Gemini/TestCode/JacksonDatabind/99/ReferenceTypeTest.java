package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;
import org.junit.Assert;
import org.junit.Test;

import java.util.concurrent.atomic.AtomicReference;

public class ReferenceTypeTest {

    private final TypeFactory _tf = TypeFactory.defaultInstance();

    @Test
    public void testUpgradeFrom_validBaseType_success() {
        JavaType baseType = SimpleType.constructUnsafe(AtomicReference.class);
        JavaType refType = _tf.constructType(String.class);

        ReferenceType result = ReferenceType.upgradeFrom(baseType, refType);

        Assert.assertNotNull(result);
        Assert.assertSame(AtomicReference.class, result.getRawClass());
        Assert.assertEquals(refType, result.getReferencedType());
        Assert.assertEquals(refType, result.getContentType());
        Assert.assertTrue(result.isAnchorType());
        Assert.assertSame(result, result.getAnchorType());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testUpgradeFrom_nullRefdType_throwsException() {
        JavaType baseType = SimpleType.constructUnsafe(AtomicReference.class);
        ReferenceType.upgradeFrom(baseType, null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testUpgradeFrom_nonTypeBase_throwsException() {
        JavaType nonTypeBase = new JavaType(Object.class, 0, null, null, false) {
            private static final long serialVersionUID = 1L;

            @Override
            public JavaType withContentType(JavaType contentType) { return this; }
            @Override
            public JavaType withTypeHandler(Object h) { return this; }
            @Override
            public JavaType withContentTypeHandler(Object h) { return this; }
            @Override
            public JavaType withValueHandler(Object h) { return this; }
            @Override
            public JavaType withContentValueHandler(Object h) { return this; }
            @Override
            public JavaType withStaticTyping() { return this; }
            @Override
            public JavaType refine(Class<?> rawType, TypeBindings bindings, JavaType superClass, JavaType[] superInterfaces) { return this; }
            @Override
            public boolean isContainerType() { return false; }
            @Override
            public StringBuilder getErasedSignature(StringBuilder sb) { return sb; }
            @Override
            public StringBuilder getGenericSignature(StringBuilder sb) { return sb; }
            @Override
            public String toString() { return ""; }
            @Override
            public boolean equals(Object o) { return o == this; }
        };

        JavaType refType = _tf.constructType(String.class);
        ReferenceType.upgradeFrom(nonTypeBase, refType);
    }

    @Test
    public void testConstruct_5Params_success() {
        JavaType refType = _tf.constructType(String.class);
        JavaType superClass = _tf.constructType(Object.class);
        TypeBindings bindings = TypeBindings.create(AtomicReference.class, refType);

        ReferenceType ref = ReferenceType.construct(AtomicReference.class, bindings, superClass, null, refType);

        Assert.assertNotNull(ref);
        Assert.assertSame(AtomicReference.class, ref.getRawClass());
        Assert.assertEquals(refType, ref.getReferencedType());
        Assert.assertTrue(ref.isAnchorType());
    }

    @SuppressWarnings("deprecation")
    @Test
    public void testConstruct_deprecated2Params_success() {
        JavaType refType = _tf.constructType(Integer.class);
        ReferenceType ref = ReferenceType.construct(AtomicReference.class, refType);

        Assert.assertNotNull(ref);
        Assert.assertSame(AtomicReference.class, ref.getRawClass());
        Assert.assertEquals(refType, ref.getReferencedType());
    }

    @Test
    public void testWithContentType_sameAndDifferent() {
        JavaType refType1 = _tf.constructType(String.class);
        JavaType refType2 = _tf.constructType(Integer.class);
        ReferenceType ref = ReferenceType.construct(AtomicReference.class, TypeBindings.emptyBindings(), null, null, refType1);

        JavaType same = ref.withContentType(refType1);
        Assert.assertSame(ref, same);

        JavaType diff = ref.withContentType(refType2);
        Assert.assertNotSame(ref, diff);
        Assert.assertEquals(refType2, diff.getContentType());
    }

    @Test
    public void testWithTypeHandler_sameAndDifferent() {
        JavaType refType = _tf.constructType(String.class);
        ReferenceType ref = ReferenceType.construct(AtomicReference.class, TypeBindings.emptyBindings(), null, null, refType);

        Object handler1 = "handler1";
        Object handler2 = "handler2";

        ReferenceType withHandler = ref.withTypeHandler(handler1);
        Assert.assertNotSame(ref, withHandler);
        Assert.assertEquals(handler1, withHandler.getTypeHandler());

        ReferenceType sameHandler = withHandler.withTypeHandler(handler1);
        Assert.assertSame(withHandler, sameHandler);

        ReferenceType diffHandler = withHandler.withTypeHandler(handler2);
        Assert.assertNotSame(withHandler, diffHandler);
        Assert.assertEquals(handler2, diffHandler.getTypeHandler());
    }

    @Test
    public void testWithContentTypeHandler_sameAndDifferent() {
        JavaType refType = _tf.constructType(String.class);
        ReferenceType ref = ReferenceType.construct(AtomicReference.class, TypeBindings.emptyBindings(), null, null, refType);

        Object handler1 = "contentHandler1";
        Object handler2 = "contentHandler2";

        ReferenceType withHandler = ref.withContentTypeHandler(handler1);
        Assert.assertNotSame(ref, withHandler);
        Assert.assertEquals(handler1, withHandler.getContentType().getTypeHandler());

        ReferenceType sameHandler = withHandler.withContentTypeHandler(handler1);
        Assert.assertSame(withHandler, sameHandler);

        ReferenceType diffHandler = withHandler.withContentTypeHandler(handler2);
        Assert.assertNotSame(withHandler, diffHandler);
        Assert.assertEquals(handler2, diffHandler.getContentType().getTypeHandler());
    }

    @Test
    public void testWithValueHandler_sameAndDifferent() {
        JavaType refType = _tf.constructType(String.class);
        ReferenceType ref = ReferenceType.construct(AtomicReference.class, TypeBindings.emptyBindings(), null, null, refType);

        Object handler1 = "valHandler1";
        Object handler2 = "valHandler2";

        ReferenceType withHandler = ref.withValueHandler(handler1);
        Assert.assertNotSame(ref, withHandler);
        Assert.assertEquals(handler1, withHandler.getValueHandler());

        ReferenceType sameHandler = withHandler.withValueHandler(handler1);
        Assert.assertSame(withHandler, sameHandler);

        ReferenceType diffHandler = withHandler.withValueHandler(handler2);
        Assert.assertNotSame(withHandler, diffHandler);
        Assert.assertEquals(handler2, diffHandler.getValueHandler());
    }

    @Test
    public void testWithContentValueHandler_sameAndDifferent() {
        JavaType refType = _tf.constructType(String.class);
        ReferenceType ref = ReferenceType.construct(AtomicReference.class, TypeBindings.emptyBindings(), null, null, refType);

        Object handler1 = "contentValHandler1";
        Object handler2 = "contentValHandler2";

        ReferenceType withHandler = ref.withContentValueHandler(handler1);
        Assert.assertNotSame(ref, withHandler);
        Assert.assertEquals(handler1, withHandler.getContentType().getValueHandler());

        ReferenceType sameHandler = withHandler.withContentValueHandler(handler1);
        Assert.assertSame(withHandler, sameHandler);

        ReferenceType diffHandler = withHandler.withContentValueHandler(handler2);
        Assert.assertNotSame(withHandler, diffHandler);
        Assert.assertEquals(handler2, diffHandler.getContentType().getValueHandler());
    }

    @Test
    public void testWithStaticTyping_toggleStatic() {
        JavaType refType = _tf.constructType(String.class);
        ReferenceType ref = ReferenceType.construct(AtomicReference.class, TypeBindings.emptyBindings(), null, null, refType);

        Assert.assertFalse(ref.useStaticType());

        ReferenceType staticRef = ref.withStaticTyping();
        Assert.assertNotSame(ref, staticRef);
        Assert.assertTrue(staticRef.useStaticType());

        ReferenceType staticRef2 = staticRef.withStaticTyping();
        Assert.assertSame(staticRef, staticRef2);
    }

    @Test
    public void testRefine_validInputs() {
        JavaType refType = _tf.constructType(String.class);
        ReferenceType ref = ReferenceType.construct(AtomicReference.class, TypeBindings.emptyBindings(), null, null, refType);

        JavaType refined = ref.refine(AtomicReference.class, TypeBindings.emptyBindings(), null, new JavaType[0]);
        Assert.assertNotNull(refined);
        Assert.assertEquals(AtomicReference.class, refined.getRawClass());
    }

    @SuppressWarnings("deprecation")
    @Test
    public void testNarrow_validSubclass() {
        JavaType refType = _tf.constructType(String.class);
        ReferenceType ref = ReferenceType.construct(Object.class, TypeBindings.emptyBindings(), null, null, refType);

        JavaType narrowed = ref._narrow(AtomicReference.class);
        Assert.assertNotNull(narrowed);
        Assert.assertSame(AtomicReference.class, narrowed.getRawClass());
    }

    @Test
    public void testBasicPropertiesAndFlags() {
        JavaType refType = _tf.constructType(String.class);
        ReferenceType ref = ReferenceType.construct(AtomicReference.class, TypeBindings.emptyBindings(), null, null, refType);

        Assert.assertTrue(ref.hasContentType());
        Assert.assertTrue(ref.isReferenceType());
        Assert.assertEquals(refType, ref.getContentType());
        Assert.assertEquals(refType, ref.getReferencedType());
    }

    @Test
    public void testSignaturesAndCanonicalName() {
        JavaType refType = _tf.constructType(String.class);
        ReferenceType ref = ReferenceType.construct(AtomicReference.class, TypeBindings.emptyBindings(), null, null, refType);

        StringBuilder sbErased = new StringBuilder();
        ref.getErasedSignature(sbErased);
        Assert.assertEquals("Ljava/util/concurrent/atomic/AtomicReference;", sbErased.toString());

        StringBuilder sbGeneric = new StringBuilder();
        ref.getGenericSignature(sbGeneric);
        Assert.assertEquals("Ljava/util/concurrent/atomic/AtomicReference<Ljava/lang/String;>;", sbGeneric.toString());

        String canonical = ref.toCanonical();
        Assert.assertEquals("java.util.concurrent.atomic.AtomicReference<java.lang.String>", canonical);
    }

    @Test
    public void testToString_format() {
        JavaType refType = _tf.constructType(String.class);
        ReferenceType ref = ReferenceType.construct(AtomicReference.class, TypeBindings.emptyBindings(), null, null, refType);

        String str = ref.toString();
        Assert.assertTrue(str.startsWith("[reference type, class "));
        Assert.assertTrue(str.contains(refType.toString()));
    }

    @Test
    public void testEquals_allBranches() {
        JavaType refTypeStr = _tf.constructType(String.class);
        JavaType refTypeInt = _tf.constructType(Integer.class);

        ReferenceType ref1 = ReferenceType.construct(AtomicReference.class, TypeBindings.emptyBindings(), null, null, refTypeStr);
        ReferenceType ref2 = ReferenceType.construct(AtomicReference.class, TypeBindings.emptyBindings(), null, null, refTypeStr);
        ReferenceType refDiffContent = ReferenceType.construct(AtomicReference.class, TypeBindings.emptyBindings(), null, null, refTypeInt);
        ReferenceType refDiffClass = ReferenceType.construct(Object.class, TypeBindings.emptyBindings(), null, null, refTypeStr);

        // o == this
        Assert.assertEquals(ref1, ref1);

        // o == null
        Assert.assertNotEquals(ref1, null);

        // o.getClass() != getClass()
        Assert.assertNotEquals(ref1, "someString");

        // other._class != _class
        Assert.assertNotEquals(ref1, refDiffClass);

        // _referencedType does not match
        Assert.assertNotEquals(ref1, refDiffContent);

        // Equal
        Assert.assertEquals(ref1, ref2);
    }

    @Test
    public void testCustomAnchorType() {
        JavaType refType = _tf.constructType(String.class);
        JavaType customAnchor = SimpleType.constructUnsafe(Object.class);

        ReferenceType ref = new ReferenceType(AtomicReference.class, TypeBindings.emptyBindings(),
                null, null, refType, customAnchor, null, null, false);

        Assert.assertFalse(ref.isAnchorType());
        Assert.assertSame(customAnchor, ref.getAnchorType());
    }
}
