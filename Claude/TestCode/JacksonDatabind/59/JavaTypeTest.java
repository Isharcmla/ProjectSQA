package com.fasterxml.jackson.databind;

import java.util.Collections;
import java.util.List;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.type.TypeFactory;

public class JavaTypeTest {

    /**
     * Minimal concrete implementation of JavaType used purely for testing
     * the abstract base class behavior. This is NOT a mocking framework;
     * it is a real subclass implementing the required abstract API.
     */
    static class TestJavaType extends JavaType {

        private final boolean containerType;
        private final int containedCount;
        private final JavaType contentTypeValue;

        TestJavaType(Class<?> raw, int additionalHash, Object valueHandler,
                Object typeHandler, boolean asStatic) {
            super(raw, additionalHash, valueHandler, typeHandler, asStatic);
            this.containerType = false;
            this.containedCount = 0;
            this.contentTypeValue = null;
        }

        TestJavaType(Class<?> raw, int additionalHash, Object valueHandler,
                Object typeHandler, boolean asStatic,
                boolean containerType, int containedCount, JavaType contentTypeValue) {
            super(raw, additionalHash, valueHandler, typeHandler, asStatic);
            this.containerType = containerType;
            this.containedCount = containedCount;
            this.contentTypeValue = contentTypeValue;
        }

        TestJavaType(JavaType base) {
            super(base);
            this.containerType = false;
            this.containedCount = 0;
            this.contentTypeValue = null;
        }

        @Override
        public JavaType withTypeHandler(Object h) {
            return new TestJavaType(_class, 0, _valueHandler, h, _asStatic);
        }

        @Override
        public JavaType withContentTypeHandler(Object h) {
            return this;
        }

        @Override
        public JavaType withValueHandler(Object h) {
            return new TestJavaType(_class, 0, h, _typeHandler, _asStatic);
        }

        @Override
        public JavaType withContentValueHandler(Object h) {
            return this;
        }

        @Override
        public JavaType withContentType(JavaType contentType) {
            if (!containerType) {
                throw new IllegalArgumentException("No content type for this type");
            }
            return new TestJavaType(_class, 0, _valueHandler, _typeHandler, _asStatic,
                    true, 1, contentType);
        }

        @Override
        public JavaType withStaticTyping() {
            return new TestJavaType(_class, 0, _valueHandler, _typeHandler, true,
                    containerType, containedCount, contentTypeValue);
        }

        @Override
        public JavaType refine(Class<?> rawType, TypeBindings bindings,
                JavaType superClass, JavaType[] superInterfaces) {
            return null;
        }

        @Override
        protected JavaType _narrow(Class<?> subclass) {
            return new TestJavaType(subclass, 0, _valueHandler, _typeHandler, _asStatic);
        }

        @Override
        public boolean isContainerType() {
            return containerType;
        }

        @Override
        public int containedTypeCount() {
            return containedCount;
        }

        @Override
        public JavaType containedType(int index) {
            if (index == 0 && containedCount > 0) {
                return contentTypeValue;
            }
            return null;
        }

        @Override
        public String containedTypeName(int index) {
            if (index == 0 && containedCount > 0 && contentTypeValue != null) {
                return contentTypeValue.getRawClass().getName();
            }
            return null;
        }

        @Override
        public TypeBindings getBindings() {
            return TypeBindings.emptyBindings();
        }

        @Override
        public JavaType findSuperType(Class<?> erasedTarget) {
            return null;
        }

        @Override
        public JavaType getSuperClass() {
            return null;
        }

        @Override
        public List<JavaType> getInterfaces() {
            return Collections.emptyList();
        }

        @Override
        public JavaType[] findTypeParameters(Class<?> expType) {
            return new JavaType[0];
        }

        @Override
        public StringBuilder getGenericSignature(StringBuilder sb) {
            return sb.append("Ltest/Generic;");
        }

        @Override
        public StringBuilder getErasedSignature(StringBuilder sb) {
            return sb.append("Ltest/Erased;");
        }

        @Override
        public String toString() {
            return "TestJavaType[" + _class.getName() + "]";
        }

        @Override
        public boolean equals(Object o) {
            if (o == this) {
                return true;
            }
            if (!(o instanceof TestJavaType)) {
                return false;
            }
            return ((TestJavaType) o)._class == _class;
        }
    }

    private TestJavaType simpleType;
    private TestJavaType containerTypeInstance;

    @Before
    public void setUp() {
        simpleType = new TestJavaType(String.class, 0, null, null, false);
        JavaType content = new TestJavaType(Integer.class, 0, null, null, false);
        containerTypeInstance = new TestJavaType(java.util.List.class, 0, null, null, false,
                true, 1, content);
    }

    // ---------- Constructor / basic accessors ----------

    @Test
    public void testGetRawClass_typicalInput_returnsExpectedClass() {
        assertEquals(String.class, simpleType.getRawClass());
    }

    @Test
    public void testHasRawClass_matchingClass_returnsTrue() {
        assertTrue(simpleType.hasRawClass(String.class));
    }

    @Test
    public void testHasRawClass_nonMatchingClass_returnsFalse() {
        assertFalse(simpleType.hasRawClass(Integer.class));
    }

    @Test
    public void testHasContentType_defaultImplementation_returnsTrue() {
        assertTrue(simpleType.hasContentType());
    }

    @Test
    public void testIsTypeOrSubTypeOf_sameClass_returnsTrue() {
        assertTrue(simpleType.isTypeOrSubTypeOf(String.class));
    }

    @Test
    public void testIsTypeOrSubTypeOf_superClass_returnsTrue() {
        assertTrue(simpleType.isTypeOrSubTypeOf(CharSequence.class));
    }

    @Test
    public void testIsTypeOrSubTypeOf_unrelatedClass_returnsFalse() {
        assertFalse(simpleType.isTypeOrSubTypeOf(Integer.class));
    }

    @Test
    public void testIsAbstract_concreteClass_returnsFalse() {
        assertFalse(simpleType.isAbstract());
    }

    @Test
    public void testIsAbstract_abstractClass_returnsTrue() {
        TestJavaType abstractType = new TestJavaType(java.util.AbstractList.class, 0, null, null, false);
        assertTrue(abstractType.isAbstract());
    }

    @Test
    public void testIsConcrete_concreteClass_returnsTrue() {
        assertTrue(simpleType.isConcrete());
    }

    @Test
    public void testIsConcrete_interfaceClass_returnsFalse() {
        TestJavaType ifaceType = new TestJavaType(java.util.List.class, 0, null, null, false);
        assertFalse(ifaceType.isConcrete());
    }

    @Test
    public void testIsConcrete_primitiveType_returnsTrue() {
        TestJavaType primType = new TestJavaType(int.class, 0, null, null, false);
        assertTrue(primType.isConcrete());
    }

    @Test
    public void testIsThrowable_throwableClass_returnsTrue() {
        TestJavaType throwableType = new TestJavaType(RuntimeException.class, 0, null, null, false);
        assertTrue(throwableType.isThrowable());
    }

    @Test
    public void testIsThrowable_nonThrowableClass_returnsFalse() {
        assertFalse(simpleType.isThrowable());
    }

    @Test
    public void testIsArrayType_alwaysFalse_returnsFalse() {
        assertFalse(simpleType.isArrayType());
    }

    @Test
    public void testIsEnumType_enumClass_returnsTrue() {
        TestJavaType enumType = new TestJavaType(java.util.concurrent.TimeUnit.class, 0, null, null, false);
        assertTrue(enumType.isEnumType());
    }

    @Test
    public void testIsEnumType_nonEnumClass_returnsFalse() {
        assertFalse(simpleType.isEnumType());
    }

    @Test
    public void testIsInterface_interfaceClass_returnsTrue() {
        TestJavaType ifaceType = new TestJavaType(java.util.List.class, 0, null, null, false);
        assertTrue(ifaceType.isInterface());
    }

    @Test
    public void testIsInterface_classType_returnsFalse() {
        assertFalse(simpleType.isInterface());
    }

    @Test
    public void testIsPrimitive_primitiveClass_returnsTrue() {
        TestJavaType primType = new TestJavaType(int.class, 0, null, null, false);
        assertTrue(primType.isPrimitive());
    }

    @Test
    public void testIsPrimitive_nonPrimitiveClass_returnsFalse() {
        assertFalse(simpleType.isPrimitive());
    }

    @Test
    public void testIsFinal_finalClass_returnsTrue() {
        assertTrue(simpleType.isFinal()); // String is final
    }

    @Test
    public void testIsFinal_nonFinalClass_returnsFalse() {
        TestJavaType nonFinal = new TestJavaType(Object.class, 0, null, null, false);
        assertFalse(nonFinal.isFinal());
    }

    @Test
    public void testIsContainerType_falseByDefault_returnsFalse() {
        assertFalse(simpleType.isContainerType());
    }

    @Test
    public void testIsContainerType_trueForContainer_returnsTrue() {
        assertTrue(containerTypeInstance.isContainerType());
    }

    @Test
    public void testIsCollectionLikeType_defaultImplementation_returnsFalse() {
        assertFalse(simpleType.isCollectionLikeType());
    }

    @Test
    public void testIsMapLikeType_defaultImplementation_returnsFalse() {
        assertFalse(simpleType.isMapLikeType());
    }

    @Test
    public void testIsJavaLangObject_objectClass_returnsTrue() {
        TestJavaType objType = new TestJavaType(Object.class, 0, null, null, false);
        assertTrue(objType.isJavaLangObject());
    }

    @Test
    public void testIsJavaLangObject_nonObjectClass_returnsFalse() {
        assertFalse(simpleType.isJavaLangObject());
    }

    @Test
    public void testUseStaticType_falseByDefault_returnsFalse() {
        assertFalse(simpleType.useStaticType());
    }

    @Test
    public void testUseStaticType_trueWhenSet_returnsTrue() {
        TestJavaType staticType = new TestJavaType(String.class, 0, null, null, true);
        assertTrue(staticType.useStaticType());
    }

    // ---------- Type parameter access ----------

    @Test
    public void testHasGenericTypes_zeroContainedTypes_returnsFalse() {
        assertFalse(simpleType.hasGenericTypes());
    }

    @Test
    public void testHasGenericTypes_hasContainedTypes_returnsTrue() {
        assertTrue(containerTypeInstance.hasGenericTypes());
    }

    @Test
    public void testGetKeyType_defaultImplementation_returnsNull() {
        assertNull(simpleType.getKeyType());
    }

    @Test
    public void testGetContentType_defaultImplementation_returnsNull() {
        assertNull(simpleType.getContentType());
    }

    @Test
    public void testGetReferencedType_defaultImplementation_returnsNull() {
        assertNull(simpleType.getReferencedType());
    }

    @Test
    public void testContainedTypeCount_zeroForSimpleType_returnsZero() {
        assertEquals(0, simpleType.containedTypeCount());
    }

    @Test
    public void testContainedTypeCount_oneForContainerType_returnsOne() {
        assertEquals(1, containerTypeInstance.containedTypeCount());
    }

    @Test
    public void testContainedType_indexOutOfRange_returnsNull() {
        assertNull(simpleType.containedType(0));
    }

    @Test
    public void testContainedType_validIndex_returnsExpectedType() {
        JavaType content = containerTypeInstance.containedType(0);
        assertNotNull(content);
        assertEquals(Integer.class, content.getRawClass());
    }

    @Test
    public void testContainedTypeName_indexOutOfRange_returnsNull() {
        assertNull(simpleType.containedTypeName(0));
    }

    @Test
    public void testContainedTypeName_validIndex_returnsExpectedName() {
        assertEquals(Integer.class.getName(), containerTypeInstance.containedTypeName(0));
    }

    @Test
    public void testGetParameterSource_defaultImplementation_returnsNull() {
        assertNull(simpleType.getParameterSource());
    }

    // ---------- Extended API ----------

    @Test
    public void testContainedTypeOrUnknown_nullContainedType_returnsUnknownType() {
        JavaType result = simpleType.containedTypeOrUnknown(0);
        assertNotNull(result);
        assertEquals(TypeFactory.unknownType().getRawClass(), result.getRawClass());
    }

    @Test
    public void testContainedTypeOrUnknown_validContainedType_returnsActualType() {
        JavaType result = containerTypeInstance.containedTypeOrUnknown(0);
        assertEquals(Integer.class, result.getRawClass());
    }

    @Test
    public void testGetBindings_returnsNonNullBindings() {
        assertNotNull(simpleType.getBindings());
    }

    @Test
    public void testFindSuperType_defaultImplementation_returnsNull() {
        assertNull(simpleType.findSuperType(Object.class));
    }

    @Test
    public void testGetSuperClass_defaultImplementation_returnsNull() {
        assertNull(simpleType.getSuperClass());
    }

    @Test
    public void testGetInterfaces_defaultImplementation_returnsEmptyList() {
        assertTrue(simpleType.getInterfaces().isEmpty());
    }

    @Test
    public void testFindTypeParameters_defaultImplementation_returnsEmptyArray() {
        JavaType[] params = simpleType.findTypeParameters(Object.class);
        assertNotNull(params);
        assertEquals(0, params.length);
    }

    // ---------- Handlers ----------

    @Test
    public void testGetValueHandler_nullByDefault_returnsNull() {
        assertNull(simpleType.<Object>getValueHandler());
    }

    @Test
    public void testGetValueHandler_setValue_returnsValue() {
        Object handler = new Object();
        TestJavaType typed = new TestJavaType(String.class, 0, handler, null, false);
        assertSame(handler, typed.<Object>getValueHandler());
    }

    @Test
    public void testGetTypeHandler_nullByDefault_returnsNull() {
        assertNull(simpleType.<Object>getTypeHandler());
    }

    @Test
    public void testGetTypeHandler_setValue_returnsValue() {
        Object handler = new Object();
        TestJavaType typed = new TestJavaType(String.class, 0, null, handler, false);
        assertSame(handler, typed.<Object>getTypeHandler());
    }

    @Test
    public void testGetContentValueHandler_defaultImplementation_returnsNull() {
        assertNull(simpleType.getContentValueHandler());
    }

    @Test
    public void testGetContentTypeHandler_defaultImplementation_returnsNull() {
        assertNull(simpleType.getContentTypeHandler());
    }

    @Test
    public void testHasValueHandler_nullHandler_returnsFalse() {
        assertFalse(simpleType.hasValueHandler());
    }

    @Test
    public void testHasValueHandler_nonNullHandler_returnsTrue() {
        TestJavaType typed = new TestJavaType(String.class, 0, new Object(), null, false);
        assertTrue(typed.hasValueHandler());
    }

    @Test
    public void testHasHandlers_noHandlers_returnsFalse() {
        assertFalse(simpleType.hasHandlers());
    }

    @Test
    public void testHasHandlers_valueHandlerPresent_returnsTrue() {
        TestJavaType typed = new TestJavaType(String.class, 0, new Object(), null, false);
        assertTrue(typed.hasHandlers());
    }

    @Test
    public void testHasHandlers_typeHandlerPresent_returnsTrue() {
        TestJavaType typed = new TestJavaType(String.class, 0, null, new Object(), false);
        assertTrue(typed.hasHandlers());
    }

    // ---------- Fluent factory methods ----------

    @Test
    public void testWithTypeHandler_setsHandler_returnsNewInstanceWithHandler() {
        Object handler = new Object();
        JavaType result = simpleType.withTypeHandler(handler);
        assertSame(handler, result.<Object>getTypeHandler());
    }

    @Test
    public void testWithValueHandler_setsHandler_returnsNewInstanceWithHandler() {
        Object handler = new Object();
        JavaType result = simpleType.withValueHandler(handler);
        assertSame(handler, result.<Object>getValueHandler());
    }

    @Test
    public void testWithContentTypeHandler_returnsSameOrNewInstance() {
        JavaType result = simpleType.withContentTypeHandler(new Object());
        assertNotNull(result);
    }

    @Test
    public void testWithContentValueHandler_returnsSameOrNewInstance() {
        JavaType result = simpleType.withContentValueHandler(new Object());
        assertNotNull(result);
    }

    @Test
    public void testWithStaticTyping_setsFlag_returnsNewInstanceWithStaticTyping() {
        JavaType result = simpleType.withStaticTyping();
        assertTrue(result.useStaticType());
    }

    @Test
    public void testWithContentType_containerType_returnsNewInstanceWithContentType() {
        JavaType newContent = new TestJavaType(Long.class, 0, null, null, false);
        JavaType result = containerTypeInstance.withContentType(newContent);
        assertEquals(Long.class, result.getContentType() == null ? result.containedType(0).getRawClass()
                : result.getContentType().getRawClass());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithContentType_simpleTypeWithoutContent_throwsIllegalArgumentException() {
        JavaType newContent = new TestJavaType(Long.class, 0, null, null, false);
        simpleType.withContentType(newContent);
    }

    @Test
    public void testRefine_defaultImplementation_returnsNull() {
        JavaType result = simpleType.refine(String.class, TypeBindings.emptyBindings(), null, null);
        assertNull(result);
    }

    // ---------- forcedNarrowBy ----------

    @Test
    public void testForcedNarrowBy_sameClass_returnsSameInstance() {
        JavaType result = simpleType.forcedNarrowBy(String.class);
        assertSame(simpleType, result);
    }

    @Test
    public void testForcedNarrowBy_differentClass_returnsNarrowedInstance() {
        TestJavaType baseType = new TestJavaType(Object.class, 0, null, null, false);
        JavaType result = baseType.forcedNarrowBy(String.class);
        assertEquals(String.class, result.getRawClass());
    }

    @Test
    public void testForcedNarrowBy_withHandlers_preservesHandlers() {
        Object valueHandler = new Object();
        Object typeHandler = new Object();
        TestJavaType baseType = new TestJavaType(Object.class, 0, valueHandler, typeHandler, false);
        JavaType result = baseType.forcedNarrowBy(String.class);
        assertSame(valueHandler, result.<Object>getValueHandler());
        assertSame(typeHandler, result.<Object>getTypeHandler());
    }

    // ---------- Signature methods ----------

    @Test
    public void testGetGenericSignature_returnsExpectedString() {
        String sig = simpleType.getGenericSignature();
        assertEquals("Ltest/Generic;", sig);
    }

    @Test
    public void testGetGenericSignatureWithBuilder_appendsToBuilder() {
        StringBuilder sb = new StringBuilder();
        StringBuilder result = simpleType.getGenericSignature(sb);
        assertSame(sb, result);
        assertEquals("Ltest/Generic;", result.toString());
    }

    @Test
    public void testGetErasedSignature_returnsExpectedString() {
        String sig = simpleType.getErasedSignature();
        assertEquals("Ltest/Erased;", sig);
    }

    @Test
    public void testGetErasedSignatureWithBuilder_appendsToBuilder() {
        StringBuilder sb = new StringBuilder();
        StringBuilder result = simpleType.getErasedSignature(sb);
        assertSame(sb, result);
        assertEquals("Ltest/Erased;", result.toString());
    }

    // ---------- Standard object methods ----------

    @Test
    public void testToString_returnsNonNullDescriptiveString() {
        String str = simpleType.toString();
        assertNotNull(str);
        assertTrue(str.contains("String"));
    }

    @Test
    public void testEquals_sameInstance_returnsTrue() {
        assertTrue(simpleType.equals(simpleType));
    }

    @Test
    public void testEquals_differentTypeSameClass_returnsTrue() {
        TestJavaType other = new TestJavaType(String.class, 0, null, null, false);
        assertTrue(simpleType.equals(other));
    }

    @Test
    public void testEquals_differentClass_returnsFalse() {
        TestJavaType other = new TestJavaType(Integer.class, 0, null, null, false);
        assertFalse(simpleType.equals(other));
    }

    @Test
    public void testEquals_null_returnsFalse() {
        assertFalse(simpleType.equals(null));
    }

    @Test
    public void testEquals_differentObjectType_returnsFalse() {
        assertFalse(simpleType.equals("not a JavaType"));
    }

    @Test
    public void testHashCode_consistentWithEquals_sameForEqualObjects() {
        TestJavaType other = new TestJavaType(String.class, 0, null, null, false);
        assertEquals(simpleType.hashCode(), other.hashCode());
    }

    @Test
    public void testHashCode_differentAdditionalHash_producesDifferentHash() {
        TestJavaType typeA = new TestJavaType(String.class, 0, null, null, false);
        TestJavaType typeB = new TestJavaType(String.class, 100, null, null, false);
        assertNotEquals(typeA.hashCode(), typeB.hashCode());
    }

    // ---------- Copy constructor ----------

    @Test
    public void testCopyConstructor_copiesAllFieldsFromBase() {
        Object valueHandler = new Object();
        Object typeHandler = new Object();
        TestJavaType base = new TestJavaType(String.class, 0, valueHandler, typeHandler, true);
        TestJavaType copy = new TestJavaType(base);

        assertEquals(base.getRawClass(), copy.getRawClass());
        assertEquals(base.hashCode(), copy.hashCode());
        assertSame(valueHandler, copy.<Object>getValueHandler());
        assertSame(typeHandler, copy.<Object>getTypeHandler());
        assertEquals(base.useStaticType(), copy.useStaticType());
    }
}
