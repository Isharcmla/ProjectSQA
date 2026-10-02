package org.mockito.internal.util.reflection;

import org.junit.Test;
import org.mockito.exceptions.base.MockitoException;

import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class GenericMetadataSupportTest {

    interface GenericsNest<K extends Comparable<K> & Cloneable> extends Map<K, Set<Number>> {
        Set<Number> remove(Object key);
        List<? super Integer> returning_wildcard_with_class_lower_bound();
        List<? super K> returning_wildcard_with_typeVar_lower_bound();
        List<? extends K> returning_wildcard_with_typeVar_upper_bound();
        List<? extends Number> returning_wildcard_with_class_upper_bound();
        K returningK();
        <O extends K> List<O> paramType_with_type_params();
        <S, T extends S> T two_type_params();
        <O extends K> O typeVar_with_type_params();
        Number returningNonGeneric();
        <X> X[] returningGenericArray();
    }

    interface UpperBoundedTypeWithClass<E extends Number & Comparable<E> & Cloneable> {
        E get();
    }

    interface SingleBoundInterface<E extends CharSequence> {
        E get();
    }

    interface SimpleInterface<T> {
        T get();
    }

    static class BaseGenericClass<T, U> {
        T fieldT;
    }

    static class SubGenericClass<X> extends BaseGenericClass<X, String> {
        X methodX() { return null; }
    }

    static class ConcreteSubClass extends SubGenericClass<Integer> {
    }

    static class PlainClass {
        public String simpleMethod() {
            return "";
        }
    }

    interface TypeVariableChain<A, B extends A, C extends B> {
        C getC();
    }

    private static class DummyGenericArrayType implements GenericArrayType {
        private final Type componentType;

        DummyGenericArrayType(Type componentType) {
            this.componentType = componentType;
        }

        @Override
        public Type getGenericComponentType() {
            return componentType;
        }
    }

    @Test
    public void testInferFrom_withClass_returnsCorrectRawType() {
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(String.class);
        assertNotNull(metadata);
        assertEquals(String.class, metadata.rawType());
        assertTrue(metadata.actualTypeArguments().isEmpty());
        assertFalse(metadata.hasRawExtraInterfaces());
        assertEquals(0, metadata.rawExtraInterfaces().length);
        assertTrue(metadata.extraInterfaces().isEmpty());
    }

    @Test
    public void testInferFrom_withGenericClassHierarchy_registersTypeParameters() {
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(ConcreteSubClass.class);
        assertNotNull(metadata);
        assertEquals(ConcreteSubClass.class, metadata.rawType());
    }

    @Test
    public void testInferFrom_withParameterizedType_returnsCorrectRawTypeAndArguments() throws Exception {
        Method method = GenericsNest.class.getMethod("returning_wildcard_with_class_upper_bound");
        ParameterizedType returnType = (ParameterizedType) method.getGenericReturnType();

        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(returnType);
        assertNotNull(metadata);
        assertEquals(List.class, metadata.rawType());
        Map<TypeVariable, Type> typeArgs = metadata.actualTypeArguments();
        assertEquals(1, typeArgs.size());
    }

    @Test(expected = MockitoException.class)
    public void testInferFrom_withNullType_throwsMockitoException() {
        GenericMetadataSupport.inferFrom(null);
    }

    @Test(expected = MockitoException.class)
    public void testInferFrom_withUnsupportedType_throwsMockitoException() {
        GenericMetadataSupport.inferFrom(new DummyGenericArrayType(String.class));
    }

    @Test
    public void testResolveGenericReturnType_nonGenericMethod() throws Exception {
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(GenericsNest.class);
        Method method = GenericsNest.class.getMethod("returningNonGeneric");

        GenericMetadataSupport returnMetadata = metadata.resolveGenericReturnType(method);
        assertNotNull(returnMetadata);
        assertEquals(Number.class, returnMetadata.rawType());
    }

    @Test
    public void testResolveGenericReturnType_parameterizedReturnType() throws Exception {
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(GenericsNest.class);
        Method method = GenericsNest.class.getMethod("remove", Object.class);

        GenericMetadataSupport returnMetadata = metadata.resolveGenericReturnType(method);
        assertNotNull(returnMetadata);
        assertEquals(Set.class, returnMetadata.rawType());
    }

    @Test
    public void testResolveGenericReturnType_typeVariableReturnType() throws Exception {
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(GenericsNest.class);
        Method method = GenericsNest.class.getMethod("returningK");

        GenericMetadataSupport returnMetadata = metadata.resolveGenericReturnType(method);
        assertNotNull(returnMetadata);
        assertEquals(Comparable.class, returnMetadata.rawType());
        assertTrue(returnMetadata.hasRawExtraInterfaces());
        assertArrayEquals(new Class<?>[]{Cloneable.class}, returnMetadata.rawExtraInterfaces());
    }

    @Test
    public void testResolveGenericReturnType_typeVarWithMethodTypeParams() throws Exception {
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(GenericsNest.class);
        Method method = GenericsNest.class.getMethod("typeVar_with_type_params");

        GenericMetadataSupport returnMetadata = metadata.resolveGenericReturnType(method);
        assertNotNull(returnMetadata);
        assertEquals(Comparable.class, returnMetadata.rawType());
    }

    @Test
    public void testResolveGenericReturnType_paramTypeWithMethodTypeParams() throws Exception {
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(GenericsNest.class);
        Method method = GenericsNest.class.getMethod("paramType_with_type_params");

        GenericMetadataSupport returnMetadata = metadata.resolveGenericReturnType(method);
        assertNotNull(returnMetadata);
        assertEquals(List.class, returnMetadata.rawType());
    }

    @Test
    public void testResolveGenericReturnType_twoTypeParams() throws Exception {
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(GenericsNest.class);
        Method method = GenericsNest.class.getMethod("two_type_params");

        GenericMetadataSupport returnMetadata = metadata.resolveGenericReturnType(method);
        assertNotNull(returnMetadata);
        assertEquals(Object.class, returnMetadata.rawType());
    }

    @Test(expected = MockitoException.class)
    public void testResolveGenericReturnType_unsupportedReturnType_throwsException() throws Exception {
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(GenericsNest.class);
        Method method = GenericsNest.class.getMethod("returningGenericArray");

        metadata.resolveGenericReturnType(method);
    }

    @Test
    public void testResolveGenericReturnType_resolvedOnConcreteSubclass() throws Exception {
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(ConcreteSubClass.class);
        Method method = SubGenericClass.class.getDeclaredMethod("methodX");

        GenericMetadataSupport returnMetadata = metadata.resolveGenericReturnType(method);
        assertNotNull(returnMetadata);
        assertEquals(Integer.class, returnMetadata.rawType());
    }

    @Test
    public void testResolveGenericReturnType_typeVariableChain() throws Exception {
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(TypeVariableChain.class);
        Method method = TypeVariableChain.class.getMethod("getC");

        GenericMetadataSupport returnMetadata = metadata.resolveGenericReturnType(method);
        assertNotNull(returnMetadata);
        assertEquals(Object.class, returnMetadata.rawType());
    }

    @Test
    public void testExtraInterfaces_upperBoundedMultipleInterfaces() throws Exception {
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(UpperBoundedTypeWithClass.class);
        Method method = UpperBoundedTypeWithClass.class.getMethod("get");

        GenericMetadataSupport returnMetadata = metadata.resolveGenericReturnType(method);
        assertEquals(Number.class, returnMetadata.rawType());
        assertTrue(returnMetadata.hasRawExtraInterfaces());
        assertEquals(2, returnMetadata.extraInterfaces().size());
        assertEquals(2, returnMetadata.rawExtraInterfaces().length);
    }

    @Test
    public void testExtraInterfaces_singleBoundInterface() throws Exception {
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(SingleBoundInterface.class);
        Method method = SingleBoundInterface.class.getMethod("get");

        GenericMetadataSupport returnMetadata = metadata.resolveGenericReturnType(method);
        assertEquals(CharSequence.class, returnMetadata.rawType());
        assertFalse(returnMetadata.hasRawExtraInterfaces());
        assertEquals(0, returnMetadata.rawExtraInterfaces().length);
    }

    @Test
    public void testWildcardRegistration_upperAndLowerBounds() throws Exception {
        Method m1 = GenericsNest.class.getMethod("returning_wildcard_with_typeVar_upper_bound");
        Method m2 = GenericsNest.class.getMethod("returning_wildcard_with_typeVar_lower_bound");
        Method m3 = GenericsNest.class.getMethod("returning_wildcard_with_class_lower_bound");

        GenericMetadataSupport meta1 = GenericMetadataSupport.inferFrom(m1.getGenericReturnType());
        GenericMetadataSupport meta2 = GenericMetadataSupport.inferFrom(m2.getGenericReturnType());
        GenericMetadataSupport meta3 = GenericMetadataSupport.inferFrom(m3.getGenericReturnType());

        assertNotNull(meta1);
        assertNotNull(meta2);
        assertNotNull(meta3);
    }

    @Test
    public void testTypeVarBoundedType_methodsAndEqualsHashCode() throws Exception {
        TypeVariable<?>[] typeParams = GenericsNest.class.getTypeParameters();
        TypeVariable<?> kVar = typeParams[0];

        GenericMetadataSupport.TypeVarBoundedType boundedType = new GenericMetadataSupport.TypeVarBoundedType(kVar);
        assertEquals(Comparable.class, ((ParameterizedType) boundedType.firstBound()).getRawType());
        assertEquals(1, boundedType.interfaceBounds().length);
        assertEquals(Cloneable.class, boundedType.interfaceBounds()[0]);
        assertEquals(kVar, boundedType.typeVariable());

        assertTrue(boundedType.equals(boundedType));
        assertFalse(boundedType.equals(null));
        assertFalse(boundedType.equals("NotATypeVarBoundedType"));

        GenericMetadataSupport.TypeVarBoundedType sameBoundedType = new GenericMetadataSupport.TypeVarBoundedType(kVar);
        assertTrue(boundedType.equals(sameBoundedType));
        assertEquals(boundedType.hashCode(), sameBoundedType.hashCode());

        String str = boundedType.toString();
        assertNotNull(str);
        assertTrue(str.contains("firstBound="));
        assertTrue(str.contains("interfaceBounds="));
    }

    @Test
    public void testWildCardBoundedType_methodsAndEqualsHashCode() throws Exception {
        Method method = GenericsNest.class.getMethod("returning_wildcard_with_class_upper_bound");
        ParameterizedType pType = (ParameterizedType) method.getGenericReturnType();
        WildcardType wildcardType = (WildcardType) pType.getActualTypeArguments()[0];

        GenericMetadataSupport.WildCardBoundedType wildCardBoundedType = new GenericMetadataSupport.WildCardBoundedType(wildcardType);
        assertEquals(Number.class, wildCardBoundedType.firstBound());
        assertEquals(0, wildCardBoundedType.interfaceBounds().length);
        assertEquals(wildcardType, wildCardBoundedType.wildCard());

        assertTrue(wildCardBoundedType.equals(wildCardBoundedType));
        assertFalse(wildCardBoundedType.equals(null));
        assertFalse(wildCardBoundedType.equals("NotAWildcard"));

        assertEquals(wildcardType.hashCode(), wildCardBoundedType.hashCode());
        String str = wildCardBoundedType.toString();
        assertNotNull(str);
        assertTrue(str.contains("firstBound="));
        assertTrue(str.contains("interfaceBounds=[]"));
    }

    @Test
    public void testWildCardBoundedType_withLowerBound() throws Exception {
        Method method = GenericsNest.class.getMethod("returning_wildcard_with_class_lower_bound");
        ParameterizedType pType = (ParameterizedType) method.getGenericReturnType();
        WildcardType wildcardType = (WildcardType) pType.getActualTypeArguments()[0];

        GenericMetadataSupport.WildCardBoundedType wildCardBoundedType = new GenericMetadataSupport.WildCardBoundedType(wildcardType);
        assertEquals(Integer.class, wildCardBoundedType.firstBound());
    }

    @Test
    public void testActualTypeArguments_onSimpleInterface() {
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(SimpleInterface.class);
        Map<TypeVariable, Type> args = metadata.actualTypeArguments();
        assertEquals(1, args.size());
        TypeVariable<?> tv = SimpleInterface.class.getTypeParameters()[0];
        assertTrue(args.containsKey(tv));
    }

    @Test
    public void testPlainClassMetadataSupport() throws Exception {
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(PlainClass.class);
        assertEquals(PlainClass.class, metadata.rawType());
        assertTrue(metadata.actualTypeArguments().isEmpty());

        Method method = PlainClass.class.getMethod("simpleMethod");
        GenericMetadataSupport returnMetadata = metadata.resolveGenericReturnType(method);
        assertEquals(String.class, returnMetadata.rawType());
    }
}
