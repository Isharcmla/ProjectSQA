package com.fasterxml.jackson.databind;

import java.lang.annotation.RetentionPolicy;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.type.TypeFactory;
import org.junit.Test;

import static org.junit.Assert.*;

public class JavaTypeTest {

    static class DummyJavaType extends JavaType {
        private static final long serialVersionUID = 1L;

        private JavaType _containedType;
        private int _containedCount;

        public DummyJavaType(Class<?> raw) {
            this(raw, 0, null, null, false);
        }

        public DummyJavaType(Class<?> raw, int additionalHash, Object valueHandler, Object typeHandler, boolean asStatic) {
            super(raw, additionalHash, valueHandler, typeHandler, asStatic);
            this._containedCount = 0;
            this._containedType = null;
        }

        public DummyJavaType(DummyJavaType base) {
            super(base);
            this._containedCount = base._containedCount;
            this._containedType = base._containedType;
        }

        public void setContainedType(JavaType type) {
            this._containedType = type;
            this._containedCount = (type != null) ? 1 : 0;
        }

        @Override
        public JavaType withTypeHandler(Object h) {
            return new DummyJavaType(_class, _hash - _class.getName().hashCode(), _valueHandler, h, _asStatic);
        }

        @Override
        public JavaType withContentTypeHandler(Object h) {
            return this;
        }

        @Override
        public JavaType withValueHandler(Object h) {
            return new DummyJavaType(_class, _hash - _class.getName().hashCode(), h, _typeHandler, _asStatic);
        }

        @Override
        public JavaType withContentValueHandler(Object h) {
            return this;
        }

        @Override
        public JavaType withContentType(JavaType contentType) {
            return this;
        }

        @Override
        public JavaType withStaticTyping() {
            return new DummyJavaType(_class, _hash - _class.getName().hashCode(), _valueHandler, _typeHandler, true);
        }

        @Override
        public JavaType refine(Class<?> rawType, TypeBindings bindings, JavaType superClass, JavaType[] superInterfaces) {
            return this;
        }

        @Override
        protected JavaType _narrow(Class<?> subclass) {
            return new DummyJavaType(subclass, 0, null, null, _asStatic);
        }

        @Override
        public boolean isContainerType() {
            return false;
        }

        @Override
        public int containedTypeCount() {
            return _containedCount;
        }

        @Override
        public JavaType containedType(int index) {
            return (index == 0) ? _containedType : null;
        }

        @Deprecated
        @Override
        public String containedTypeName(int index) {
            return "T";
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
            return "[DummyJavaType: " + _class.getName() + "]";
        }

        @Override
        public boolean equals(Object o) {
            if (o == this) return true;
            if (o == null || o.getClass() != getClass()) return false;
            DummyJavaType other = (DummyJavaType) o;
            return other._class == _class;
        }
    }

    @Test
    public void testConstructorsAndGetters_normal_initializedProperly() {
        DummyJavaType base = new DummyJavaType(String.class, 10, "valH", "typeH", true);

        assertEquals(String.class, base.getRawClass());
        assertTrue(base.hasRawClass(String.class));
        assertFalse(base.hasRawClass(Integer.class));
        assertEquals(String.class.getName().hashCode() + 10, base.hashCode());
        assertEquals("valH", base.getValueHandler());
        assertEquals("typeH", base.getTypeHandler());
        assertTrue(base.useStaticType());
        assertTrue(base.hasValueHandler());
        assertTrue(base.hasHandlers());

        DummyJavaType copied = new DummyJavaType(base);
        assertEquals(base.getRawClass(), copied.getRawClass());
        assertEquals(base.hashCode(), copied.hashCode());
        assertEquals(base.getValueHandler(), copied.getValueHandler());
        assertEquals(base.getTypeHandler(), copied.getTypeHandler());
        assertEquals(base.useStaticType(), copied.useStaticType());
    }

    @Test
    public void testForcedNarrowBy_sameClass_returnsSameInstance() {
        DummyJavaType type = new DummyJavaType(CharSequence.class);
        assertSame(type, type.forcedNarrowBy(CharSequence.class));
    }

    @Test
    public void testForcedNarrowBy_differentClass_propagatesHandlers() {
        DummyJavaType type = new DummyJavaType(CharSequence.class, 5, "vHandler", "tHandler", false);
        JavaType narrowed = type.forcedNarrowBy(String.class);

        assertEquals(String.class, narrowed.getRawClass());
        assertEquals("vHandler", narrowed.getValueHandler());
        assertEquals("tHandler", narrowed.getTypeHandler());
    }

    @Test
    public void testForcedNarrowBy_noHandlers_narrowsSuccessfully() {
        DummyJavaType type = new DummyJavaType(CharSequence.class, 0, null, null, false);
        JavaType narrowed = type.forcedNarrowBy(String.class);

        assertEquals(String.class, narrowed.getRawClass());
        assertNull(narrowed.getValueHandler());
        assertNull(narrowed.getTypeHandler());
    }

    @Test
    public void testHasHandlers_variousCombinations_correctBoolean() {
        DummyJavaType noHandlers = new DummyJavaType(String.class, 0, null, null, false);
        assertFalse(noHandlers.hasHandlers());
        assertFalse(noHandlers.hasValueHandler());

        DummyJavaType onlyVal = new DummyJavaType(String.class, 0, "val", null, false);
        assertTrue(onlyVal.hasHandlers());
        assertTrue(onlyVal.hasValueHandler());

        DummyJavaType onlyType = new DummyJavaType(String.class, 0, null, "type", false);
        assertTrue(onlyType.hasHandlers());
        assertFalse(onlyType.hasValueHandler());
    }

    @Test
    public void testIsTypeOrSubTypeOf_matchingAndHierarchies_returnsExpected() {
        DummyJavaType stringType = new DummyJavaType(String.class);
        assertTrue(stringType.isTypeOrSubTypeOf(String.class));
        assertTrue(stringType.isTypeOrSubTypeOf(CharSequence.class));
        assertTrue(stringType.isTypeOrSubTypeOf(Object.class));
        assertFalse(stringType.isTypeOrSubTypeOf(Integer.class));
    }

    @Test
    public void testIsAbstract_abstractAndConcreteClasses_correctFlag() {
        DummyJavaType abstractType = new DummyJavaType(AbstractList.class);
        assertTrue(abstractType.isAbstract());

        DummyJavaType interfaceType = new DummyJavaType(List.class);
        assertTrue(interfaceType.isAbstract());

        DummyJavaType concreteType = new DummyJavaType(ArrayList.class);
        assertFalse(concreteType.isAbstract());
    }

    @Test
    public void testIsConcrete_allVariations_returnsCorrect() {
        DummyJavaType concreteType = new DummyJavaType(String.class);
        assertTrue(concreteType.isConcrete());

        DummyJavaType primitiveType = new DummyJavaType(int.class);
        assertTrue(primitiveType.isConcrete());

        DummyJavaType abstractType = new DummyJavaType(Number.class);
        assertFalse(abstractType.isConcrete());

        DummyJavaType interfaceType = new DummyJavaType(List.class);
        assertFalse(interfaceType.isConcrete());
    }

    @Test
    public void testTypeClassificationMethods_standardClasses_correctFlags() {
        DummyJavaType throwableType = new DummyJavaType(Exception.class);
        assertTrue(throwableType.isThrowable());

        DummyJavaType nonThrowableType = new DummyJavaType(String.class);
        assertFalse(nonThrowableType.isThrowable());
        assertFalse(nonThrowableType.isArrayType());
        assertFalse(nonThrowableType.isEnumType());
        assertFalse(nonThrowableType.isInterface());
        assertFalse(nonThrowableType.isPrimitive());
        assertTrue(nonThrowableType.isFinal());
        assertFalse(nonThrowableType.isCollectionLikeType());
        assertFalse(nonThrowableType.isMapLikeType());
        assertFalse(nonThrowableType.isJavaLangObject());

        DummyJavaType enumType = new DummyJavaType(RetentionPolicy.class);
        assertTrue(enumType.isEnumType());

        DummyJavaType ifaceType = new DummyJavaType(List.class);
        assertTrue(ifaceType.isInterface());
        assertFalse(ifaceType.isFinal());

        DummyJavaType primType = new DummyJavaType(boolean.class);
        assertTrue(primType.isPrimitive());

        DummyJavaType objType = new DummyJavaType(Object.class);
        assertTrue(objType.isJavaLangObject());
    }

    @Test
    public void testDefaultAndPassThroughMethods_defaults_returnNullOrDefaults() {
        DummyJavaType type = new DummyJavaType(String.class);

        assertTrue(type.hasContentType());
        assertNull(type.getKeyType());
        assertNull(type.getContentType());
        assertNull(type.getReferencedType());
        assertNull(type.getParameterSource());
        assertNull(type.getContentValueHandler());
        assertNull(type.getContentTypeHandler());
    }

    @Test
    public void testContainedTypesAndGenerics_withAndWithoutContainedTypes_correctResolution() {
        DummyJavaType simpleType = new DummyJavaType(String.class);
        assertFalse(simpleType.hasGenericTypes());
        assertEquals(0, simpleType.containedTypeCount());
        assertNull(simpleType.containedType(0));

        JavaType unknown = simpleType.containedTypeOrUnknown(0);
        assertNotNull(unknown);
        assertEquals(TypeFactory.unknownType(), unknown);

        DummyJavaType parameterized = new DummyJavaType(ArrayList.class);
        parameterized.setContainedType(simpleType);
        assertTrue(parameterized.hasGenericTypes());
        assertEquals(1, parameterized.containedTypeCount());
        assertSame(simpleType, parameterized.containedType(0));
        assertSame(simpleType, parameterized.containedTypeOrUnknown(0));
    }

    @Test
    public void testSignatureMethods_validClass_generatesCorrectSignature() {
        DummyJavaType type = new DummyJavaType(String.class);
        assertEquals("Ljava/lang/String;", type.getGenericSignature());
        assertEquals("Ljava/lang/String;", type.getErasedSignature());
    }

    @Test
    public void testMutantMethodsAndEqualsToString_validCalls_executedSuccessfully() {
        DummyJavaType type = new DummyJavaType(String.class, 0, null, null, false);

        JavaType staticType = type.withStaticTyping();
        assertTrue(staticType.useStaticType());

        assertSame(type, type.withContentType(staticType));
        assertSame(type, type.withContentTypeHandler("handler"));
        assertSame(type, type.withContentValueHandler("handler"));

        assertEquals("[DummyJavaType: java.lang.String]", type.toString());
        assertEquals(type, new DummyJavaType(String.class));
        assertNotEquals(type, new DummyJavaType(Integer.class));
        assertNotEquals(type, null);
        assertNotEquals(type, "otherObject");
    }
}
