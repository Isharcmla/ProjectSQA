package org.apache.commons.lang3.reflect;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TypeUtilsTest {

    public static class CustomType implements Type {
        @Override
        public String getTypeName() {
            return "CustomType";
        }
    }

    public static class A<T> {}
    public static class B<T> extends A<T> {}
    public static class C<T> extends B<List<T>> {}
    public static class D extends B<String> {}
    public static class E extends A<Integer> {}

    public interface I1<T> {}
    public interface I2<T> extends I1<T> {}
    public interface I3<T, U> {}
    public static class Impl<T> implements I2<T>, I3<String, T> {}

    public static class Outer<K, V> {
        public class Inner<T> {
            public class DeepInner<E> {}
        }
    }

    public static class TestFixture<T, S extends T, U extends Number & Comparable<U>, V extends List<String>> {
        public List<?> wildList;
        public List<? extends Number> extendsNumList;
        public List<? super Integer> superIntList;
        public List<? extends Comparable<?>> extendsCompList;
        public List<String> stringList;
        public List<Integer> intList;
        public List<Object> objList;
        @SuppressWarnings("rawtypes")
        public List rawList;
        public String[] stringArray;
        public List<String>[] genericStringArrayList;
        public List<?>[] genericWildArray;
        public T[] genericTArray;
        public T typeVarField;
        public Outer<String, Integer>.Inner<Long>.DeepInner<Byte> deepInnerField;
        public Outer<String, Integer>.Inner<Long> innerField;

        public <M> void methodWithTypeVar(M m) {}
        public <M extends Number> void methodWithBoundedTypeVar(M m) {}
    }

    private Type getFieldType(String fieldName) throws NoSuchFieldException {
        return TestFixture.class.getField(fieldName).getGenericType();
    }

    private TypeVariable<?> getTypeVar(Class<?> cls, String name) {
        for (TypeVariable<?> var : cls.getTypeParameters()) {
            if (var.getName().equals(name)) {
                return var;
            }
        }
        return null;
    }

    @Test
    public void testConstructor() {
        assertNotNull(new TypeUtils());
    }

    @Test
    public void testIsArrayType() throws NoSuchFieldException {
        assertTrue(TypeUtils.isArrayType(String[].class));
        assertTrue(TypeUtils.isArrayType(int[].class));
        assertTrue(TypeUtils.isArrayType(getFieldType("genericStringArrayList")));
        assertTrue(TypeUtils.isArrayType(getFieldType("genericTArray")));

        assertFalse(TypeUtils.isArrayType(String.class));
        assertFalse(TypeUtils.isArrayType(getFieldType("stringList")));
        assertFalse(TypeUtils.isArrayType(null));
    }

    @Test
    public void testGetArrayComponentType() throws NoSuchFieldException {
        assertEquals(String.class, TypeUtils.getArrayComponentType(String[].class));
        assertEquals(int.class, TypeUtils.getArrayComponentType(int[].class));
        assertEquals(getFieldType("stringList"), TypeUtils.getArrayComponentType(getFieldType("genericStringArrayList")));
        assertEquals(getTypeVar(TestFixture.class, "T"), TypeUtils.getArrayComponentType(getFieldType("genericTArray")));

        assertNull(TypeUtils.getArrayComponentType(String.class));
        assertNull(TypeUtils.getArrayComponentType(getFieldType("stringList")));
        assertNull(TypeUtils.getArrayComponentType(null));
    }

    @Test
    public void testIsInstance() throws NoSuchFieldException {
        assertFalse(TypeUtils.isInstance("abc", null));
        assertFalse(TypeUtils.isInstance(null, int.class));
        assertTrue(TypeUtils.isInstance(null, String.class));
        assertTrue(TypeUtils.isInstance(null, getFieldType("stringList")));

        assertTrue(TypeUtils.isInstance("hello", String.class));
        assertTrue(TypeUtils.isInstance("hello", Object.class));
        assertFalse(TypeUtils.isInstance("hello", Integer.class));

        assertTrue(TypeUtils.isInstance(new ArrayList<String>(), List.class));
        assertTrue(TypeUtils.isInstance(new ArrayList<String>(), getFieldType("rawList")));
    }

    @Test
    public void testNormalizeUpperBounds() {
        Type[] empty = new Type[0];
        assertSame(empty, TypeUtils.normalizeUpperBounds(empty));

        Type[] single = new Type[] { String.class };
        assertSame(single, TypeUtils.normalizeUpperBounds(single));

        Type[] redundant = new Type[] { Collection.class, List.class };
        Type[] normalized = TypeUtils.normalizeUpperBounds(redundant);
        assertEquals(1, normalized.length);
        assertEquals(List.class, normalized[0]);

        Type[] redundantReversed = new Type[] { List.class, Collection.class };
        Type[] normalizedReversed = TypeUtils.normalizeUpperBounds(redundantReversed);
        assertEquals(1, normalizedReversed.length);
        assertEquals(List.class, normalizedReversed[0]);

        Type[] distinct = new Type[] { Comparable.class, Serializable.class };
        Type[] normalizedDistinct = TypeUtils.normalizeUpperBounds(distinct);
        assertEquals(2, normalizedDistinct.length);
    }

    @Test
    public void testGetImplicitBounds() throws NoSuchMethodException {
        TypeVariable<?> tVar = getTypeVar(TestFixture.class, "T");
        Type[] tBounds = TypeUtils.getImplicitBounds(tVar);
        assertEquals(1, tBounds.length);
        assertEquals(Object.class, tBounds[0]);

        TypeVariable<?> uVar = getTypeVar(TestFixture.class, "U");
        Type[] uBounds = TypeUtils.getImplicitBounds(uVar);
        assertEquals(2, uBounds.length);
    }

    @Test
    public void testGetImplicitUpperAndLowerBounds() throws NoSuchFieldException {
        ParameterizedType wildList = (ParameterizedType) getFieldType("wildList");
        WildcardType wild = (WildcardType) wildList.getActualTypeArguments()[0];
        Type[] upper = TypeUtils.getImplicitUpperBounds(wild);
        Type[] lower = TypeUtils.getImplicitLowerBounds(wild);
        assertEquals(1, upper.length);
        assertEquals(Object.class, upper[0]);
        assertEquals(1, lower.length);
        assertNull(lower[0]);

        ParameterizedType extendsList = (ParameterizedType) getFieldType("extendsNumList");
        WildcardType extendsWild = (WildcardType) extendsList.getActualTypeArguments()[0];
        Type[] extendsUpper = TypeUtils.getImplicitUpperBounds(extendsWild);
        assertEquals(1, extendsUpper.length);
        assertEquals(Number.class, extendsUpper[0]);

        ParameterizedType superList = (ParameterizedType) getFieldType("superIntList");
        WildcardType superWild = (WildcardType) superList.getActualTypeArguments()[0];
        Type[] superLower = TypeUtils.getImplicitLowerBounds(superWild);
        assertEquals(1, superLower.length);
        assertEquals(Integer.class, superLower[0]);
    }

    @Test
    public void testTypesSatisfyVariables() {
        TypeVariable<?> tVar = getTypeVar(TestFixture.class, "T");
        TypeVariable<?> sVar = getTypeVar(TestFixture.class, "S");
        TypeVariable<?> uVar = getTypeVar(TestFixture.class, "U");

        Map<TypeVariable<?>, Type> map = new HashMap<TypeVariable<?>, Type>();
        map.put(tVar, Number.class);
        map.put(sVar, Integer.class);
        map.put(uVar, Integer.class);
        assertTrue(TypeUtils.typesSatisfyVariables(map));

        map.put(sVar, String.class);
        assertFalse(TypeUtils.typesSatisfyVariables(map));

        map.put(sVar, Integer.class);
        map.put(uVar, Object.class);
        assertFalse(TypeUtils.typesSatisfyVariables(map));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTypesSatisfyVariables_missingAssignment() {
        TypeVariable<?> sVar = getTypeVar(TestFixture.class, "S");
        Map<TypeVariable<?>, Type> map = new HashMap<TypeVariable<?>, Type>();
        map.put(sVar, Integer.class);
        TypeUtils.typesSatisfyVariables(map);
    }

    @Test
    public void testGetRawType() throws NoSuchFieldException, NoSuchMethodException {
        assertEquals(String.class, TypeUtils.getRawType(String.class, null));
        assertEquals(List.class, TypeUtils.getRawType(getFieldType("stringList"), null));
        assertEquals(String[].class, TypeUtils.getRawType(getFieldType("genericStringArrayList"), null));

        Type genericTArray = getFieldType("genericTArray");
        ParameterizedType fixtureType = (ParameterizedType) new ArrayList<TestFixture<String, String, Integer, ArrayList<String>>>() {}.getClass().getGenericSuperclass();
        Type paramFixture = fixtureType.getActualTypeArguments()[0];
        assertEquals(String[].class, TypeUtils.getRawType(genericTArray, paramFixture));

        Type tVar = getTypeVar(TestFixture.class, "T");
        assertEquals(String.class, TypeUtils.getRawType(tVar, paramFixture));
        assertNull(TypeUtils.getRawType(tVar, null));
        assertNull(TypeUtils.getRawType(tVar, String.class));

        ParameterizedType wildList = (ParameterizedType) getFieldType("wildList");
        WildcardType wild = (WildcardType) wildList.getActualTypeArguments()[0];
        assertNull(TypeUtils.getRawType(wild, null));

        Method m = TestFixture.class.getMethod("methodWithTypeVar", Object.class);
        TypeVariable<?> methodVar = m.getTypeParameters()[0];
        assertNull(TypeUtils.getRawType(methodVar, String.class));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetRawType_unknownType() {
        TypeUtils.getRawType(new CustomType(), null);
    }

    @Test
    public void testGetTypeArgumentsParameterizedType() throws NoSuchFieldException {
        ParameterizedType stringListType = (ParameterizedType) getFieldType("stringList");
        Map<TypeVariable<?>, Type> typeArgs = TypeUtils.getTypeArguments(stringListType);
        assertEquals(1, typeArgs.size());
        TypeVariable<?> listParam = List.class.getTypeParameters()[0];
        assertEquals(String.class, typeArgs.get(listParam));

        ParameterizedType deepInnerType = (ParameterizedType) getFieldType("deepInnerField");
        Map<TypeVariable<?>, Type> deepArgs = TypeUtils.getTypeArguments(deepInnerType);
        assertEquals(4, deepArgs.size());
    }

    @Test
    public void testGetTypeArgumentsTypeAndClass() throws NoSuchFieldException {
        Map<TypeVariable<?>, Type> args = TypeUtils.getTypeArguments(D.class, A.class);
        assertNotNull(args);
        TypeVariable<?> aParam = A.class.getTypeParameters()[0];
        assertEquals(String.class, args.get(aParam));

        Map<TypeVariable<?>, Type> implArgs = TypeUtils.getTypeArguments(Impl.class, I1.class);
        assertNotNull(implArgs);

        Map<TypeVariable<?>, Type> invalidArgs = TypeUtils.getTypeArguments(String.class, List.class);
        assertNull(invalidArgs);

        Map<TypeVariable<?>, Type> primitiveArgs = TypeUtils.getTypeArguments(int.class, long.class);
        assertNotNull(primitiveArgs);
        assertTrue(primitiveArgs.isEmpty());

        Map<TypeVariable<?>, Type> primToWrapperArgs = TypeUtils.getTypeArguments(int.class, Number.class);
        assertNotNull(primToWrapperArgs);

        Type genericStringArray = getFieldType("genericStringArrayList");
        Map<TypeVariable<?>, Type> arrayArgs = TypeUtils.getTypeArguments(genericStringArray, List[].class);
        assertNotNull(arrayArgs);

        ParameterizedType extendsList = (ParameterizedType) getFieldType("extendsNumList");
        WildcardType extendsWild = (WildcardType) extendsList.getActualTypeArguments()[0];
        Map<TypeVariable<?>, Type> wildArgs = TypeUtils.getTypeArguments(extendsWild, Object.class);
        assertNotNull(wildArgs);

        WildcardType unassignableWild = (WildcardType) ((ParameterizedType) getFieldType("wildList")).getActualTypeArguments()[0];
        assertNull(TypeUtils.getTypeArguments(unassignableWild, List.class));

        TypeVariable<?> tVar = getTypeVar(TestFixture.class, "T");
        Map<TypeVariable<?>, Type> tVarArgs = TypeUtils.getTypeArguments(tVar, Object.class);
        assertNotNull(tVarArgs);

        TypeVariable<?> vVar = getTypeVar(TestFixture.class, "V");
        Map<TypeVariable<?>, Type> vVarArgs = TypeUtils.getTypeArguments(vVar, Collection.class);
        assertNotNull(vVarArgs);

        assertNull(TypeUtils.getTypeArguments(tVar, List.class));
    }

    @Test(expected = IllegalStateException.class)
    public void testGetTypeArguments_unhandledType() {
        TypeUtils.getTypeArguments(new CustomType(), Object.class);
    }

    @Test
    public void testDetermineTypeArguments() throws NoSuchFieldException {
        ParameterizedType aString = (ParameterizedType) D.class.getGenericSuperclass();
        Map<TypeVariable<?>, Type> args = TypeUtils.determineTypeArguments(D.class, aString);
        assertNotNull(args);

        Map<TypeVariable<?>, Type> exactArgs = TypeUtils.determineTypeArguments(A.class, (ParameterizedType) D.class.getGenericSuperclass());
        assertNotNull(exactArgs);

        ParameterizedType listString = (ParameterizedType) getFieldType("stringList");
        Map<TypeVariable<?>, Type> nullArgs = TypeUtils.determineTypeArguments(String.class, listString);
        assertNull(nullArgs);

        ParameterizedType deepInnerType = (ParameterizedType) getFieldType("deepInnerField");
        Map<TypeVariable<?>, Type> deepArgs = TypeUtils.determineTypeArguments(Outer.Inner.DeepInner.class, deepInnerType);
        assertNotNull(deepArgs);
    }

    @Test
    public void testIsAssignable() throws NoSuchFieldException, NoSuchMethodException {
        assertTrue(TypeUtils.isAssignable((Type) null, (Type) null));
        assertTrue(TypeUtils.isAssignable((Type) null, Object.class));
        assertFalse(TypeUtils.isAssignable((Type) null, int.class));
        assertFalse(TypeUtils.isAssignable(Object.class, (Type) null));
        assertTrue(TypeUtils.isAssignable(String.class, String.class));
        assertTrue(TypeUtils.isAssignable(String.class, Object.class));
        assertFalse(TypeUtils.isAssignable(Object.class, String.class));
        assertTrue(TypeUtils.isAssignable(Integer.TYPE, Long.TYPE));

        ParameterizedType stringList = (ParameterizedType) getFieldType("stringList");
        ParameterizedType objList = (ParameterizedType) getFieldType("objList");
        ParameterizedType wildList = (ParameterizedType) getFieldType("wildList");
        ParameterizedType extendsNumList = (ParameterizedType) getFieldType("extendsNumList");
        ParameterizedType superIntList = (ParameterizedType) getFieldType("superIntList");
        ParameterizedType rawList = (ParameterizedType) getFieldType("rawList");

        assertTrue(TypeUtils.isAssignable(stringList, List.class));
        assertTrue(TypeUtils.isAssignable(stringList, Collection.class));
        assertTrue(TypeUtils.isAssignable(stringList, stringList));
        assertFalse(TypeUtils.isAssignable(stringList, objList));
        assertTrue(TypeUtils.isAssignable(stringList, wildList));
        assertTrue(TypeUtils.isAssignable(intListType(), extendsNumList));
        assertFalse(TypeUtils.isAssignable(stringList, extendsNumList));
        assertTrue(TypeUtils.isAssignable(intListType(), superIntList));
        assertTrue(TypeUtils.isAssignable(objList, superIntList));
        assertFalse(TypeUtils.isAssignable(stringList, superIntList));
        assertTrue(TypeUtils.isAssignable(rawList, stringList));

        Type genericStringArray = getFieldType("genericStringArrayList");
        Type genericWildArray = getFieldType("genericWildArray");
        assertTrue(TypeUtils.isAssignable(genericStringArray, Object.class));
        assertTrue(TypeUtils.isAssignable(genericStringArray, List[].class));
        assertTrue(TypeUtils.isAssignable(genericStringArray, genericStringArray));
        assertTrue(TypeUtils.isAssignable(genericStringArray, genericWildArray));
        assertFalse(TypeUtils.isAssignable(genericStringArray, String[].class));
        assertFalse(TypeUtils.isAssignable(genericStringArray, String.class));
        assertFalse(TypeUtils.isAssignable(List[].class, genericStringArray));

        WildcardType wildType = (WildcardType) wildList.getActualTypeArguments()[0];
        WildcardType extendsNumType = (WildcardType) extendsNumList.getActualTypeArguments()[0];
        WildcardType superIntType = (WildcardType) superIntList.getActualTypeArguments()[0];

        assertFalse(TypeUtils.isAssignable(wildType, Object.class));
        assertTrue(TypeUtils.isAssignable(String.class, wildType));
        assertTrue(TypeUtils.isAssignable(Integer.class, extendsNumType));
        assertFalse(TypeUtils.isAssignable(String.class, extendsNumType));
        assertTrue(TypeUtils.isAssignable(Number.class, superIntType));
        assertFalse(TypeUtils.isAssignable(Double.class, superIntType));

        assertTrue(TypeUtils.isAssignable(extendsNumType, wildType));
        assertTrue(TypeUtils.isAssignable(superIntType, wildType));
        assertFalse(TypeUtils.isAssignable(wildType, extendsNumType));
        assertTrue(TypeUtils.isAssignable(extendsNumType, extendsNumType));
        assertTrue(TypeUtils.isAssignable(superIntType, superIntType));

        TypeVariable<?> tVar = getTypeVar(TestFixture.class, "T");
        TypeVariable<?> sVar = getTypeVar(TestFixture.class, "S");
        TypeVariable<?> uVar = getTypeVar(TestFixture.class, "U");
        TypeVariable<?> vVar = getTypeVar(TestFixture.class, "V");

        assertTrue(TypeUtils.isAssignable(tVar, Object.class));
        assertFalse(TypeUtils.isAssignable(tVar, Number.class));
        assertTrue(TypeUtils.isAssignable(uVar, Number.class));
        assertTrue(TypeUtils.isAssignable(uVar, Comparable.class));
        assertTrue(TypeUtils.isAssignable(vVar, List.class));

        assertTrue(TypeUtils.isAssignable(tVar, tVar));
        assertTrue(TypeUtils.isAssignable(sVar, tVar));
        assertFalse(TypeUtils.isAssignable(tVar, sVar));
        assertFalse(TypeUtils.isAssignable(String.class, tVar));

        assertFalse(TypeUtils.isAssignable(stringList, genericStringArray));
        assertFalse(TypeUtils.isAssignable(wildType, genericStringArray));
        assertFalse(TypeUtils.isAssignable(tVar, genericStringArray));
    }

    private ParameterizedType intListType() throws NoSuchFieldException {
        return (ParameterizedType) getFieldType("intList");
    }

    @Test(expected = IllegalStateException.class)
    public void testIsAssignable_unhandledToType() {
        TypeUtils.isAssignable(String.class, new CustomType());
    }

    @Test(expected = IllegalStateException.class)
    public void testIsAssignable_unhandledFromType() {
        TypeUtils.isAssignable(new CustomType(), String.class);
    }
}
