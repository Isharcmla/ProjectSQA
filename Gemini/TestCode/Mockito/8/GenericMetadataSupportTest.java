package org.mockito.internal.util.reflection;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.exceptions.base.MockitoException;

import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GenericMetadataSupportTest {

    interface InterfaceA {}
    interface InterfaceB {}

    interface SimpleInterface<T> {
        T get();
        void set(T value);
    }

    interface UpperBoundedInterface<K extends Number & Comparable<K> & Cloneable> {
        K getBounded();
        <O extends K> O getChained();
        <S, T extends S> T getTwoTypeParams();
        <A extends S, S extends InterfaceA> A getChainedGeneric();
    }

    interface NestedGenericsInterface<K extends Comparable<K> & Cloneable> extends Map<K, Set<Number>> {
        Set<Number> remove(Object key);
        List<? super Integer> returning_wildcard_with_class_lower_bound();
        List<? super K> returning_wildcard_with_typeVar_lower_bound();
        List<? extends K> returning_wildcard_with_typeVar_upper_bound();
        List<? extends String> returning_wildcard_with_class_upper_bound();
        K returningK();
        <O extends K> List<O> paramType_with_type_params();
        <S, T extends S> T two_type_params();
        <O extends K> O typeVar_with_type_params();
        Number returningNonGeneric();
        <T> T[] returningArray();
    }

    static class BaseClass<T> {
        T baseField;
    }

    static class MiddleClass<M> extends BaseClass<M> implements SimpleInterface<M> {
        @Override
        public M get() {
            return null;
        }

        @Override
        public void set(M value) {}
    }

    static class ConcreteClass extends MiddleClass<String> implements UpperBoundedInterface<Integer> {
        @Override
        public Integer getBounded() {
            return null;
        }

        @Override
        public <O extends Integer> O getChained() {
            return null;
        }

        @Override
        public <S, T extends S> T getTwoTypeParams() {
            return null;
        }

        @Override
        public <A extends S, S extends InterfaceA> A getChainedGeneric() {
            return null;
        }
    }

    static class PlainClass {
        public String plainMethod() {
            return "test";
        }
    }

    static class SubClassWithDirectSuper<T extends Number & Serializable> extends BaseClass<List<T>> {
    }

    interface MultiBoundedWildcardHolder {
        List<? extends Number> upperBoundWildcard();
        List<? super Integer> lowerBoundWildcard();
        <K extends Comparable<K>> List<? extends K> typeVarUpperBoundWildcard();
        <K extends Comparable<K>> List<? super K> typeVarLowerBoundWildcard();
    }

    @Test
    public void testInferFrom_withClass_returnsMetadata() {
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(ConcreteClass.class);
        Assert.assertNotNull(metadata);
        Assert.assertEquals(ConcreteClass.class, metadata.rawType());
    }

    @Test
    public void testInferFrom_withPlainClass_returnsMetadata() {
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(PlainClass.class);
        Assert.assertNotNull(metadata);
        Assert.assertEquals(PlainClass.class, metadata.rawType());
        Assert.assertTrue(metadata.actualTypeArguments().isEmpty());
    }

    @Test
    public void testInferFrom_withParameterizedType_returnsMetadata() throws Exception {
        Method method = NestedGenericsInterface.class.getMethod("returning_wildcard_with_class_upper_bound");
        ParameterizedType parameterizedType = (ParameterizedType) method.getGenericReturnType();

        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(parameterizedType);
        Assert.assertNotNull(metadata);
        Assert.assertEquals(List.class, metadata.rawType());
    }

    @Test(expected = MockitoException.class)
    public void testInferFrom_withNullType_throwsException() {
        GenericMetadataSupport.inferFrom(null);
    }

    @Test(expected = MockitoException.class)
    public void testInferFrom_withUnsupportedType_throwsException() throws Exception {
        Method method = NestedGenericsInterface.class.getMethod("returningArray");
        GenericArrayType arrayType = (GenericArrayType) method.getGenericReturnType();
        GenericMetadataSupport.inferFrom(arrayType);
    }

    @Test
    public void testResolveGenericReturnType_nonGenericMethod() throws Exception {
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(NestedGenericsInterface.class);
        Method method = NestedGenericsInterface.class.getMethod("returningNonGeneric");
        GenericMetadataSupport returnMetadata = metadata.resolveGenericReturnType(method);

        Assert.assertNotNull(returnMetadata);
        Assert.assertEquals(Number.class, returnMetadata.rawType());
        Assert.assertFalse(returnMetadata.hasRawExtraInterfaces());
        Assert.assertEquals(0, returnMetadata.rawExtraInterfaces().length);
        Assert.assertEquals(Collections.emptyList(), returnMetadata.extraInterfaces());
    }

    @Test
    public void testResolveGenericReturnType_parameterizedReturnType() throws Exception {
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(NestedGenericsInterface.class);
        Method method = NestedGenericsInterface.class.getMethod("remove", Object.class);
        GenericMetadataSupport returnMetadata = metadata.resolveGenericReturnType(method);

        Assert.assertNotNull(returnMetadata);
        Assert.assertEquals(Set.class, returnMetadata.rawType());
    }

    @Test
    public void testResolveGenericReturnType_typeVariableReturnType() throws Exception {
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(ConcreteClass.class);
        Method method = SimpleInterface.class.getMethod("get");
        GenericMetadataSupport returnMetadata = metadata.resolveGenericReturnType(method);

        Assert.assertNotNull(returnMetadata);
        Assert.assertEquals(String.class, returnMetadata.rawType());
    }

    @Test
    public void testResolveGenericReturnType_typeVariableWithBounds() throws Exception {
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(UpperBoundedInterface.class);
        Method method = UpperBoundedInterface.class.getMethod("getBounded");
        GenericMetadataSupport returnMetadata = metadata.resolveGenericReturnType(method);

        Assert.assertNotNull(returnMetadata);
        Assert.assertEquals(Number.class, returnMetadata.rawType());
        Assert.assertTrue(returnMetadata.hasRawExtraInterfaces());
        Class<?>[] extraInterfaces = returnMetadata.rawExtraInterfaces();
        Assert.assertEquals(2, extraInterfaces.length);
        Assert.assertEquals(Comparable.class, extraInterfaces[0]);
        Assert.assertEquals(Cloneable.class, extraInterfaces[1]);
    }

    @Test
    public void testResolveGenericReturnType_chainedTypeVariable() throws Exception {
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(UpperBoundedInterface.class);
        Method method = UpperBoundedInterface.class.getMethod("getChained");
        GenericMetadataSupport returnMetadata = metadata.resolveGenericReturnType(method);

        Assert.assertNotNull(returnMetadata);
        Assert.assertEquals(Number.class, returnMetadata.rawType());
    }

    @Test
    public void testResolveGenericReturnType_chainedTypeVariableWithInterface() throws Exception {
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(UpperBoundedInterface.class);
        Method method = UpperBoundedInterface.class.getMethod("getChainedGeneric");
        GenericMetadataSupport returnMetadata = metadata.resolveGenericReturnType(method);

        Assert.assertNotNull(returnMetadata);
        Assert.assertEquals(InterfaceA.class, returnMetadata.rawType());
    }

    @Test
    public void testResolveGenericReturnType_twoTypeParams() throws Exception {
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(UpperBoundedInterface.class);
        Method method = UpperBoundedInterface.class.getMethod("getTwoTypeParams");
        GenericMetadataSupport returnMetadata = metadata.resolveGenericReturnType(method);

        Assert.assertNotNull(returnMetadata);
        Assert.assertEquals(Object.class, returnMetadata.rawType());
    }

    @Test
    public void testResolveGenericReturnType_parameterizedTypeWithTypeParams() throws Exception {
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(NestedGenericsInterface.class);
        Method method = NestedGenericsInterface.class.getMethod("paramType_with_type_params");
        GenericMetadataSupport returnMetadata = metadata.resolveGenericReturnType(method);

        Assert.assertNotNull(returnMetadata);
        Assert.assertEquals(List.class, returnMetadata.rawType());
    }

    @Test
    public void testResolveGenericReturnType_wildcardUpperBounds() throws Exception {
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(NestedGenericsInterface.class);
        Method method = NestedGenericsInterface.class.getMethod("returning_wildcard_with_typeVar_upper_bound");
        GenericMetadataSupport returnMetadata = metadata.resolveGenericReturnType(method);

        Assert.assertNotNull(returnMetadata);
        Assert.assertEquals(List.class, returnMetadata.rawType());
    }

    @Test
    public void testResolveGenericReturnType_wildcardLowerBounds() throws Exception {
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(NestedGenericsInterface.class);
        Method method = NestedGenericsInterface.class.getMethod("returning_wildcard_with_class_lower_bound");
        GenericMetadataSupport returnMetadata = metadata.resolveGenericReturnType(method);

        Assert.assertNotNull(returnMetadata);
        Assert.assertEquals(List.class, returnMetadata.rawType());
    }

    @Test
    public void testResolveGenericReturnType_wildcardTypeVarLowerBound() throws Exception {
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(NestedGenericsInterface.class);
        Method method = NestedGenericsInterface.class.getMethod("returning_wildcard_with_typeVar_lower_bound");
        GenericMetadataSupport returnMetadata = metadata.resolveGenericReturnType(method);

        Assert.assertNotNull(returnMetadata);
        Assert.assertEquals(List.class, returnMetadata.rawType());
    }

    @Test(expected = MockitoException.class)
    public void testResolveGenericReturnType_unsupportedReturnType_throwsException() throws Exception {
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(NestedGenericsInterface.class);
        Method method = NestedGenericsInterface.class.getMethod("returningArray");
        metadata.resolveGenericReturnType(method);
    }

    @Test
    public void testActualTypeArguments_onGenericClass() {
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(SimpleInterface.class);
        Map<TypeVariable, Type> actualArgs = metadata.actualTypeArguments();
        Assert.assertEquals(1, actualArgs.size());
        TypeVariable typeVar = SimpleInterface.class.getTypeParameters()[0];
        Assert.assertTrue(actualArgs.containsKey(typeVar));
    }

    @Test
    public void testSubClassWithDirectSuperGenerics() {
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(SubClassWithDirectSuper.class);
        Assert.assertNotNull(metadata);
        Assert.assertEquals(SubClassWithDirectSuper.class, metadata.rawType());
    }

    @Test
    public void testTypeVarBoundedType() {
        TypeVariable<?>[] typeParameters = UpperBoundedInterface.class.getTypeParameters();
        TypeVariable<?> typeVarK = typeParameters[0];

        GenericMetadataSupport.TypeVarBoundedType boundedType = new GenericMetadataSupport.TypeVarBoundedType(typeVarK);

        Assert.assertEquals(Number.class, boundedType.firstBound());
        Type[] interfaceBounds = boundedType.interfaceBounds();
        Assert.assertEquals(2, interfaceBounds.length);
        Assert.assertEquals(typeVarK, boundedType.typeVariable());
        Assert.assertTrue(boundedType.toString().contains("firstBound="));

        Assert.assertEquals(boundedType, boundedType);
        Assert.assertFalse(boundedType.equals(null));
        Assert.assertFalse(boundedType.equals("Not a TypeVarBoundedType"));

        GenericMetadataSupport.TypeVarBoundedType sameBoundedType = new GenericMetadataSupport.TypeVarBoundedType(typeVarK);
        Assert.assertEquals(boundedType, sameBoundedType);
        Assert.assertEquals(boundedType.hashCode(), sameBoundedType.hashCode());

        TypeVariable<?> typeVarT = SimpleInterface.class.getTypeParameters()[0];
        GenericMetadataSupport.TypeVarBoundedType differentBoundedType = new GenericMetadataSupport.TypeVarBoundedType(typeVarT);
        Assert.assertFalse(boundedType.equals(differentBoundedType));
    }

    @Test
    public void testWildCardBoundedType_upperBound() throws Exception {
        Method method = MultiBoundedWildcardHolder.class.getMethod("upperBoundWildcard");
        ParameterizedType listType = (ParameterizedType) method.getGenericReturnType();
        WildcardType wildcardType = (WildcardType) listType.getActualTypeArguments()[0];

        GenericMetadataSupport.WildCardBoundedType wildCardBoundedType = new GenericMetadataSupport.WildCardBoundedType(wildcardType);

        Assert.assertEquals(Number.class, wildCardBoundedType.firstBound());
        Assert.assertEquals(0, wildCardBoundedType.interfaceBounds().length);
        Assert.assertEquals(wildcardType, wildCardBoundedType.wildCard());
        Assert.assertTrue(wildCardBoundedType.toString().contains("firstBound="));

        Assert.assertEquals(wildCardBoundedType, wildCardBoundedType);
        Assert.assertFalse(wildCardBoundedType.equals(null));
        Assert.assertFalse(wildCardBoundedType.equals("Not a WildCardBoundedType"));
        Assert.assertEquals(wildcardType.hashCode(), wildCardBoundedType.hashCode());
    }

    @Test
    public void testWildCardBoundedType_lowerBound() throws Exception {
        Method method = MultiBoundedWildcardHolder.class.getMethod("lowerBoundWildcard");
        ParameterizedType listType = (ParameterizedType) method.getGenericReturnType();
        WildcardType wildcardType = (WildcardType) listType.getActualTypeArguments()[0];

        GenericMetadataSupport.WildCardBoundedType wildCardBoundedType = new GenericMetadataSupport.WildCardBoundedType(wildcardType);

        Assert.assertEquals(Integer.class, wildCardBoundedType.firstBound());
        Assert.assertEquals(0, wildCardBoundedType.interfaceBounds().length);
    }

    @Test
    public void testWildCardBoundedType_typeVarUpperBound() throws Exception {
        Method method = MultiBoundedWildcardHolder.class.getMethod("typeVarUpperBoundWildcard");
        ParameterizedType listType = (ParameterizedType) method.getGenericReturnType();
        WildcardType wildcardType = (WildcardType) listType.getActualTypeArguments()[0];

        GenericMetadataSupport.WildCardBoundedType wildCardBoundedType = new GenericMetadataSupport.WildCardBoundedType(wildcardType);

        Assert.assertTrue(wildCardBoundedType.firstBound() instanceof TypeVariable);
    }

    @Test
    public void testDefaultBaseMethods() {
        GenericMetadataSupport custom = new GenericMetadataSupport() {
            @Override
            public Class<?> rawType() {
                return String.class;
            }
        };

        Assert.assertEquals(String.class, custom.rawType());
        Assert.assertEquals(Collections.emptyList(), custom.extraInterfaces());
        Assert.assertArrayEquals(new Class[0], custom.rawExtraInterfaces());
        Assert.assertFalse(custom.hasRawExtraInterfaces());
        Assert.assertTrue(custom.actualTypeArguments().isEmpty());
    }
}
