package com.fasterxml.jackson.databind;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import static org.junit.Assert.*;

public class JavaTypeTest {

    private static class ConcreteJavaType extends JavaType {
        private static final long serialVersionUID = 1L;

        private final JavaType[] _contained;
        private final boolean _container;

        public ConcreteJavaType(Class<?> raw) {
            this(raw, 0, null, null, false, null, false);
        }

        public ConcreteJavaType(Class<?> raw, int additionalHash, Object valueHandler, Object typeHandler, boolean asStatic) {
            this(raw, additionalHash, valueHandler, typeHandler, asStatic, null, false);
        }

        public ConcreteJavaType(Class<?> raw, int additionalHash, Object valueHandler, Object typeHandler, boolean asStatic, JavaType[] contained, boolean isContainer) {
            super(raw, additionalHash, valueHandler, typeHandler, asStatic);
            _contained = contained;
            _container = isContainer;
        }

        @Override
        public JavaType withTypeHandler(Object h) {
            return new ConcreteJavaType(_class, _hash - _class.getName().hashCode(), _valueHandler, h, _asStatic, _contained, _container);
        }

        @Override
        public JavaType withContentTypeHandler(Object h) {
            return this;
        }

        @Override
        public JavaType withValueHandler(Object h) {
            return new ConcreteJavaType(_class, _hash - _class.getName().hashCode(), h, _typeHandler, _asStatic, _contained, _container);
        }

        @Override
        public JavaType withContentValueHandler(Object h) {
            return this;
        }

        @Override
        public JavaType withStaticTyping() {
            return new ConcreteJavaType(_class, _hash - _class.getName().hashCode(), _valueHandler, _typeHandler, true, _contained, _container);
        }

        @Override
        protected JavaType _narrow(Class<?> subclass) {
            return new ConcreteJavaType(subclass, _hash - _class.getName().hashCode(), null, null, _asStatic, _contained, _container);
        }

        @Override
        public JavaType narrowContentsBy(Class<?> contentClass) {
            return this;
        }

        @Override
        public JavaType widenContentsBy(Class<?> contentClass) {
            return this;
        }

        @Override
        public boolean isContainerType() {
            return _container;
        }

        @Override
        public int containedTypeCount() {
            return _contained == null ? 0 : _contained.length;
        }

        @Override
        public JavaType containedType(int index) {
            if (_contained != null && index >= 0 && index < _contained.length) {
                return _contained[index];
            }
            return null;
        }

        @Override
        public Class<?> getParameterSource() {
            return _class;
        }

        @Override
        public StringBuilder getGenericSignature(StringBuilder sb) {
            sb.append("L").append(_class.getName().replace('.', '/')).append(";");
            return sb;
        }

        @Override
        public StringBuilder getErasedSignature(StringBuilder sb) {
            sb.append("L").append(_class.getName().replace('.', '/')).append(";");
            return sb;
        }

        @Override
        public String toString() {
            return "[ConcreteJavaType: " + _class.getName() + "]";
        }

        @Override
        public boolean equals(Object o) {
            if (o == this) return true;
            if (o == null || o.getClass() != getClass()) return false;
            ConcreteJavaType other = (ConcreteJavaType) o;
            return other._class == _class;
        }

        public JavaType testWiden(Class<?> superclass) {
            return _widen(superclass);
        }

        public void testAssertSubclass(Class<?> subclass, Class<?> superClass) {
            _assertSubclass(subclass, superClass);
        }
    }

    private static class MinimalJavaType extends JavaType {
        private static final long serialVersionUID = 1L;

        public MinimalJavaType(Class<?> raw) {
            super(raw, 0, null, null, false);
        }

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
        protected JavaType _narrow(Class<?> subclass) { return new MinimalJavaType(subclass); }
        @Override
        public JavaType narrowContentsBy(Class<?> contentClass) { return this; }
        @Override
        public JavaType widenContentsBy(Class<?> contentClass) { return this; }
        @Override
        public boolean isContainerType() { return false; }
        @Override
        public Class<?> getParameterSource() { return _class; }
        @Override
        public StringBuilder getGenericSignature(StringBuilder sb) { return sb.append("X"); }
        @Override
        public StringBuilder getErasedSignature(StringBuilder sb) { return sb.append("X"); }
        @Override
        public String toString() { return "Minimal"; }
        @Override
        public boolean equals(Object o) { return o instanceof MinimalJavaType; }
    }

    private enum SampleEnum { A, B }
    private interface SampleInterface { }
    private static abstract class SampleAbstractClass { }
    private static final class SampleFinalClass { }

    @Test
    public void testInterfacesImplemented() {
        ConcreteJavaType type = new ConcreteJavaType(String.class);
        assertTrue(type instanceof Serializable);
        assertTrue(type instanceof Type);
    }

    @Test
    public void testGetRawClassAndHasRawClass_normal_returnsExpected() {
        ConcreteJavaType type = new ConcreteJavaType(String.class);
        assertEquals(String.class, type.getRawClass());
        assertTrue(type.hasRawClass(String.class));
        assertFalse(type.hasRawClass(Integer.class));
        assertFalse(type.hasRawClass(null));
    }

    @Test
    public void testHashCode_variousInputs_matchesFormula() {
        int additionalHash = 42;
        ConcreteJavaType type = new ConcreteJavaType(String.class, additionalHash, null, null, false);
        assertEquals(String.class.getName().hashCode() + additionalHash, type.hashCode());

        ConcreteJavaType typeZero = new ConcreteJavaType(Integer.class, 0, null, null, false);
        assertEquals(Integer.class.getName().hashCode(), typeZero.hashCode());

        ConcreteJavaType typeNegative = new ConcreteJavaType(Long.class, -100, null, null, false);
        assertEquals(Long.class.getName().hashCode() - 100, typeNegative.hashCode());
    }

    @Test
    public void testIsAbstract_abstractAndNonAbstractClasses_returnsCorrectValue() {
        assertTrue(new ConcreteJavaType(SampleAbstractClass.class).isAbstract());
        assertTrue(new ConcreteJavaType(SampleInterface.class).isAbstract());
        assertFalse(new ConcreteJavaType(String.class).isAbstract());
        assertFalse(new ConcreteJavaType(int.class).isAbstract());
    }

    @Test
    public void testIsConcrete_variousTypes_returnsCorrectValue() {
        assertTrue(new ConcreteJavaType(String.class).isConcrete());
        assertTrue(new ConcreteJavaType(int.class).isConcrete());
        assertTrue(new ConcreteJavaType(boolean.class).isConcrete());
        assertFalse(new ConcreteJavaType(SampleAbstractClass.class).isConcrete());
        assertFalse(new ConcreteJavaType(SampleInterface.class).isConcrete());
        assertFalse(new ConcreteJavaType(List.class).isConcrete());
    }

    @Test
    public void testIsThrowable_throwableAndNonThrowable_returnsCorrectValue() {
        assertTrue(new ConcreteJavaType(Throwable.class).isThrowable());
        assertTrue(new ConcreteJavaType(Exception.class).isThrowable());
        assertTrue(new ConcreteJavaType(RuntimeException.class).isThrowable());
        assertTrue(new ConcreteJavaType(Error.class).isThrowable());
        assertFalse(new ConcreteJavaType(String.class).isThrowable());
        assertFalse(new ConcreteJavaType(Object.class).isThrowable());
    }

    @Test
    public void testIsArrayType_defaultImplementation_returnsFalse() {
        ConcreteJavaType type = new ConcreteJavaType(String[].class);
        assertFalse(type.isArrayType());
    }

    @Test
    public void testIsEnumType_enumAndNonEnum_returnsCorrectValue() {
        assertTrue(new ConcreteJavaType(SampleEnum.class).isEnumType());
        assertFalse(new ConcreteJavaType(String.class).isEnumType());
    }

    @Test
    public void testIsInterface_interfaceAndClass_returnsCorrectValue() {
        assertTrue(new ConcreteJavaType(SampleInterface.class).isInterface());
        assertTrue(new ConcreteJavaType(List.class).isInterface());
        assertFalse(new ConcreteJavaType(String.class).isInterface());
        assertFalse(new ConcreteJavaType(ArrayList.class).isInterface());
    }

    @Test
    public void testIsPrimitive_primitiveAndObject_returnsCorrectValue() {
        assertTrue(new ConcreteJavaType(int.class).isPrimitive());
        assertTrue(new ConcreteJavaType(boolean.class).isPrimitive());
        assertTrue(new ConcreteJavaType(double.class).isPrimitive());
        assertTrue(new ConcreteJavaType(void.class).isPrimitive());
        assertFalse(new ConcreteJavaType(Integer.class).isPrimitive());
        assertFalse(new ConcreteJavaType(String.class).isPrimitive());
    }

    @Test
    public void testIsFinal_finalAndNonFinal_returnsCorrectValue() {
        assertTrue(new ConcreteJavaType(SampleFinalClass.class).isFinal());
        assertTrue(new ConcreteJavaType(String.class).isFinal());
        assertFalse(new ConcreteJavaType(Object.class).isFinal());
        assertFalse(new ConcreteJavaType(SampleAbstractClass.class).isFinal());
    }

    @Test
    public void testIsContainerType_setValues_returnsConfiguredValue() {
        ConcreteJavaType containerType = new ConcreteJavaType(ArrayList.class, 0, null, null, false, null, true);
        assertTrue(containerType.isContainerType());

        ConcreteJavaType nonContainerType = new ConcreteJavaType(String.class, 0, null, null, false, null, false);
        assertFalse(nonContainerType.isContainerType());
    }

    @Test
    public void testIsCollectionLikeType_defaultImplementation_returnsFalse() {
        ConcreteJavaType type = new ConcreteJavaType(List.class);
        assertFalse(type.isCollectionLikeType());
    }

    @Test
    public void testIsMapLikeType_defaultImplementation_returnsFalse() {
        ConcreteJavaType type = new ConcreteJavaType(java.util.Map.class);
        assertFalse(type.isMapLikeType());
    }

    @Test
    public void testUseStaticType_booleanSetting_returnsConfiguredValue() {
        ConcreteJavaType staticType = new ConcreteJavaType(String.class, 0, null, null, true);
        assertTrue(staticType.useStaticType());

        ConcreteJavaType dynamicType = new ConcreteJavaType(String.class, 0, null, null, false);
        assertFalse(dynamicType.useStaticType());
    }

    @Test
    public void testHandlers_getAndSet_preservesHandlers() {
        String valueHandler = "VAL_HANDLER";
        Integer typeHandler = 12345;
        ConcreteJavaType type = new ConcreteJavaType(String.class, 0, valueHandler, typeHandler, false);

        assertEquals(valueHandler, type.getValueHandler());
        assertEquals(typeHandler, type.getTypeHandler());
    }

    @Test
    public void testHandlers_nullHandlers_returnsNull() {
        ConcreteJavaType type = new ConcreteJavaType(String.class);
        assertNull(type.getValueHandler());
        assertNull(type.getTypeHandler());
    }

    @Test
    public void testNarrowBy_sameClass_returnsSameInstance() {
        ConcreteJavaType type = new ConcreteJavaType(CharSequence.class);
        JavaType narrowed = type.narrowBy(CharSequence.class);
        assertSame(type, narrowed);
    }

    @Test
    public void testNarrowBy_validSubclassWithoutHandlers_narrowsCorrectly() {
        ConcreteJavaType type = new ConcreteJavaType(CharSequence.class);
        JavaType narrowed = type.narrowBy(String.class);
        assertNotSame(type, narrowed);
        assertEquals(String.class, narrowed.getRawClass());
        assertNull(narrowed.getValueHandler());
        assertNull(narrowed.getTypeHandler());
    }

    @Test
    public void testNarrowBy_validSubclassWithHandlers_preservesHandlers() {
        String valHandler = "VAL";
        String typeHandler = "TYPE";
        ConcreteJavaType type = new ConcreteJavaType(CharSequence.class, 0, valHandler, typeHandler, false);
        JavaType narrowed = type.narrowBy(String.class);

        assertNotSame(type, narrowed);
        assertEquals(String.class, narrowed.getRawClass());
        assertEquals(valHandler, narrowed.getValueHandler());
        assertEquals(typeHandler, narrowed.getTypeHandler());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNarrowBy_invalidSubclass_throwsIllegalArgumentException() {
        ConcreteJavaType type = new ConcreteJavaType(String.class);
        type.narrowBy(Integer.class);
    }

    @Test
    public void testForcedNarrowBy_sameClass_returnsSameInstance() {
        ConcreteJavaType type = new ConcreteJavaType(CharSequence.class);
        JavaType result = type.forcedNarrowBy(CharSequence.class);
        assertSame(type, result);
    }

    @Test
    public void testForcedNarrowBy_differentClassWithHandlers_preservesHandlers() {
        String valHandler = "VAL";
        String typeHandler = "TYPE";
        ConcreteJavaType type = new ConcreteJavaType(CharSequence.class, 0, valHandler, typeHandler, false);
        JavaType result = type.forcedNarrowBy(String.class);

        assertNotSame(type, result);
        assertEquals(String.class, result.getRawClass());
        assertEquals(valHandler, result.getValueHandler());
        assertEquals(typeHandler, result.getTypeHandler());
    }

    @Test
    public void testForcedNarrowBy_differentClassWithoutHandlers_returnsNarrowed() {
        ConcreteJavaType type = new ConcreteJavaType(CharSequence.class);
        JavaType result = type.forcedNarrowBy(String.class);

        assertNotSame(type, result);
        assertEquals(String.class, result.getRawClass());
        assertNull(result.getValueHandler());
        assertNull(result.getTypeHandler());
    }

    @Test
    public void testWidenBy_sameClass_returnsSameInstance() {
        ConcreteJavaType type = new ConcreteJavaType(String.class);
        JavaType result = type.widenBy(String.class);
        assertSame(type, result);
    }

    @Test
    public void testWidenBy_validSuperclass_returnsWidened() {
        ConcreteJavaType type = new ConcreteJavaType(String.class);
        JavaType result = type.widenBy(CharSequence.class);
        assertNotSame(type, result);
        assertEquals(CharSequence.class, result.getRawClass());
    }

    @Test
    public void testTestWiden_callsUnderlyingNarrow() {
        ConcreteJavaType type = new ConcreteJavaType(String.class);
        JavaType result = type.testWiden(Object.class);
        assertEquals(Object.class, result.getRawClass());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAssertSubclass_notAssignable_throwsException() {
        ConcreteJavaType type = new ConcreteJavaType(String.class);
        type.testAssertSubclass(Integer.class, String.class);
    }

    @Test
    public void testAssertSubclass_assignable_noExceptionThrown() {
        ConcreteJavaType type = new ConcreteJavaType(CharSequence.class);
        type.testAssertSubclass(String.class, CharSequence.class);
    }

    @Test
    public void testTypeParametersDefaults_onMinimalJavaType_returnsDefaultValues() {
        MinimalJavaType type = new MinimalJavaType(String.class);

        assertFalse(type.hasGenericTypes());
        assertNull(type.getKeyType());
        assertNull(type.getContentType());
        assertEquals(0, type.containedTypeCount());
        assertNull(type.containedType(0));
        assertNull(type.containedType(-1));
        assertNull(type.containedType(10));
        assertNull(type.containedTypeName(0));
        assertNull(type.containedTypeName(-1));
    }

    @Test
    public void testTypeParametersWithContainedTypes_returnsExpectedValues() {
        JavaType stringType = new ConcreteJavaType(String.class);
        JavaType intType = new ConcreteJavaType(Integer.class);
        ConcreteJavaType typeWithGenerics = new ConcreteJavaType(
                List.class, 0, null, null, false, new JavaType[]{ stringType, intType }, true);

        assertTrue(typeWithGenerics.hasGenericTypes());
        assertEquals(2, typeWithGenerics.containedTypeCount());
        assertSame(stringType, typeWithGenerics.containedType(0));
        assertSame(intType, typeWithGenerics.containedType(1));
        assertNull(typeWithGenerics.containedType(2));
        assertNull(typeWithGenerics.containedType(-1));
    }

    @Test
    public void testContainedTypeOrUnknown_whenTypePresent_returnsType() {
        JavaType stringType = new ConcreteJavaType(String.class);
        ConcreteJavaType type = new ConcreteJavaType(
                List.class, 0, null, null, false, new JavaType[]{ stringType }, true);

        JavaType result = type.containedTypeOrUnknown(0);
        assertSame(stringType, result);
    }

    @Test
    public void testContainedTypeOrUnknown_whenTypeAbsent_returnsUnknownType() {
        ConcreteJavaType type = new ConcreteJavaType(String.class);
        JavaType result = type.containedTypeOrUnknown(0);

        assertNotNull(result);
        assertEquals(Object.class, result.getRawClass());

        JavaType resultNegative = type.containedTypeOrUnknown(-1);
        assertNotNull(resultNegative);
        assertEquals(Object.class, resultNegative.getRawClass());
    }

    @Test
    public void testGetGenericSignature_normalClass_returnsExpectedFormat() {
        ConcreteJavaType type = new ConcreteJavaType(String.class);
        assertEquals("Ljava/lang/String;", type.getGenericSignature());
    }

    @Test
    public void testGetErasedSignature_normalClass_returnsExpectedFormat() {
        ConcreteJavaType type = new ConcreteJavaType(String.class);
        assertEquals("Ljava/lang/String;", type.getErasedSignature());
    }

    @Test
    public void testAbstractCopyMethodsOnConcreteType_executesSuccessfully() {
        ConcreteJavaType type = new ConcreteJavaType(List.class);

        JavaType withTypeH = type.withTypeHandler("TH");
        assertEquals("TH", withTypeH.getTypeHandler());

        JavaType withValH = type.withValueHandler("VH");
        assertEquals("VH", withValH.getValueHandler());

        JavaType withStatic = type.withStaticTyping();
        assertTrue(withStatic.useStaticType());

        JavaType withContentTH = type.withContentTypeHandler("CTH");
        assertNotNull(withContentTH);

        JavaType withContentVH = type.withContentValueHandler("CVH");
        assertNotNull(withContentVH);

        JavaType narrowContents = type.narrowContentsBy(String.class);
        assertNotNull(narrowContents);

        JavaType widenContents = type.widenContentsBy(Object.class);
        assertNotNull(widenContents);
    }

    @Test
    public void testToStringAndEquals_normalCases_behavesAsExpected() {
        ConcreteJavaType type1 = new ConcreteJavaType(String.class);
        ConcreteJavaType type2 = new ConcreteJavaType(String.class);
        ConcreteJavaType type3 = new ConcreteJavaType(Integer.class);

        assertEquals("[ConcreteJavaType: java.lang.String]", type1.toString());
        assertTrue(type1.equals(type1));
        assertTrue(type1.equals(type2));
        assertFalse(type1.equals(type3));
        assertFalse(type1.equals(null));
        assertFalse(type1.equals("SomeString"));
    }

    @Test
    public void testInheritanceHierarchyNarrowAndWiden() {
        ConcreteJavaType listType = new ConcreteJavaType(List.class);
        JavaType arrayListType = listType.narrowBy(ArrayList.class);
        assertEquals(ArrayList.class, arrayListType.getRawClass());

        ConcreteJavaType concreteArrayList = new ConcreteJavaType(ArrayList.class);
        JavaType abstractListType = concreteArrayList.widenBy(AbstractList.class);
        assertEquals(AbstractList.class, abstractListType.getRawClass());
    }
}
