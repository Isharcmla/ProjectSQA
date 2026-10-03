package com.google.gson;

import com.google.gson.reflect.TypeToken;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class TypeInfoFactoryTest {

  private static class SimpleClass {
    int intField;
    String stringField;
    String[] stringArrayField;
  }

  private static class GenericClass<T, U> {
    T tField;
    U uField;
    T[] tArrayField;
    List<T> tListField;
    List<String> stringListField;
    List<? extends Number> wildcardField;
    List<? extends T> wildcardGenericField;
    List<T>[] listOfTArrayField;
  }

  private static class AnotherGeneric<T> {
    T otherField;
  }

  private static class ClassWithGenericArray {
    List<String>[] stringListArray;
  }

  @Test
  public void testConstructor_privateAccessibleViaReflection_success() throws Exception {
    Constructor<TypeInfoFactory> constructor = TypeInfoFactory.class.getDeclaredConstructor();
    constructor.setAccessible(true);
    TypeInfoFactory factory = constructor.newInstance();
    assertNotNull(factory);
  }

  @Test
  public void testGetTypeInfoForArray_validClassArray_returnsTypeInfoArray() {
    TypeInfoArray typeInfoArray = TypeInfoFactory.getTypeInfoForArray(String[].class);
    assertNotNull(typeInfoArray);
    assertEquals(String.class, typeInfoArray.getComponentType());
  }

  @Test
  public void testGetTypeInfoForArray_validGenericArray_returnsTypeInfoArray() throws Exception {
    Field field = ClassWithGenericArray.class.getDeclaredField("stringListArray");
    Type genericArrayType = field.getGenericType();
    TypeInfoArray typeInfoArray = TypeInfoFactory.getTypeInfoForArray(genericArrayType);
    assertNotNull(typeInfoArray);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testGetTypeInfoForArray_nonArrayType_throwsIllegalArgumentException() {
    TypeInfoFactory.getTypeInfoForArray(String.class);
  }

  @Test
  public void testGetTypeInfoForField_primitiveAndStandardClassFields_resolvesDirectly() throws Exception {
    Field intField = SimpleClass.class.getDeclaredField("intField");
    TypeInfo intInfo = TypeInfoFactory.getTypeInfoForField(intField, SimpleClass.class);
    assertEquals(int.class, intInfo.getActualType());

    Field stringField = SimpleClass.class.getDeclaredField("stringField");
    TypeInfo stringInfo = TypeInfoFactory.getTypeInfoForField(stringField, SimpleClass.class);
    assertEquals(String.class, stringInfo.getActualType());

    Field stringArrayField = SimpleClass.class.getDeclaredField("stringArrayField");
    TypeInfo stringArrayInfo = TypeInfoFactory.getTypeInfoForField(stringArrayField, SimpleClass.class);
    assertEquals(String[].class, stringArrayInfo.getActualType());
  }

  @Test
  public void testGetTypeInfoForField_typeVariables_parameterizedParent_resolvesCorrectTypes() throws Exception {
    Field tField = GenericClass.class.getDeclaredField("tField");
    Field uField = GenericClass.class.getDeclaredField("uField");
    Type parentType = new TypeToken<GenericClass<String, Integer>>() {}.getType();

    TypeInfo tInfo = TypeInfoFactory.getTypeInfoForField(tField, parentType);
    assertEquals(String.class, tInfo.getActualType());

    TypeInfo uInfo = TypeInfoFactory.getTypeInfoForField(uField, parentType);
    assertEquals(Integer.class, uInfo.getActualType());
  }

  @Test(expected = UnsupportedOperationException.class)
  public void testGetTypeInfoForField_typeVariable_rawParentType_throwsUnsupportedOperationException() throws Exception {
    Field tField = GenericClass.class.getDeclaredField("tField");
    TypeInfoFactory.getTypeInfoForField(tField, GenericClass.class);
  }

  @Test(expected = IllegalStateException.class)
  public void testGetTypeInfoForField_typeVariableNotInClassDeclaration_throwsIllegalStateException() throws Exception {
    Field tField = GenericClass.class.getDeclaredField("tField");
    Type mismatchedParentType = new TypeToken<AnotherGeneric<String>>() {}.getType();
    TypeInfoFactory.getTypeInfoForField(tField, mismatchedParentType);
  }

  @Test
  public void testGetTypeInfoForField_parameterizedField_resolvesTypeArguments() throws Exception {
    Field tListField = GenericClass.class.getDeclaredField("tListField");
    Type parentType = new TypeToken<GenericClass<Double, Boolean>>() {}.getType();

    TypeInfo listInfo = TypeInfoFactory.getTypeInfoForField(tListField, parentType);
    assertTrue(listInfo.getActualType() instanceof ParameterizedType);

    ParameterizedType paramType = (ParameterizedType) listInfo.getActualType();
    assertEquals(List.class, paramType.getRawType());
    assertEquals(Double.class, paramType.getActualTypeArguments()[0]);
  }

  @Test
  public void testGetTypeInfoForField_parameterizedFieldWithConcreteType_resolvesCorrectly() throws Exception {
    Field stringListField = GenericClass.class.getDeclaredField("stringListField");
    Type parentType = new TypeToken<GenericClass<Double, Boolean>>() {}.getType();

    TypeInfo listInfo = TypeInfoFactory.getTypeInfoForField(stringListField, parentType);
    assertTrue(listInfo.getActualType() instanceof ParameterizedType);

    ParameterizedType paramType = (ParameterizedType) listInfo.getActualType();
    assertEquals(List.class, paramType.getRawType());
    assertEquals(String.class, paramType.getActualTypeArguments()[0]);
  }

  @Test
  public void testGetTypeInfoForField_genericArrayResolvingToClass_returnsArrayClass() throws Exception {
    Field tArrayField = GenericClass.class.getDeclaredField("tArrayField");
    Type parentType = new TypeToken<GenericClass<String, Integer>>() {}.getType();

    TypeInfo arrayInfo = TypeInfoFactory.getTypeInfoForField(tArrayField, parentType);
    assertEquals(String[].class, arrayInfo.getActualType());
  }

  @Test
  public void testGetTypeInfoForField_genericArrayResolvingToGenericArrayType_returnsGenericArrayTypeImpl() throws Exception {
    Field listOfTArrayField = GenericClass.class.getDeclaredField("listOfTArrayField");
    Type parentType = new TypeToken<GenericClass<String, Integer>>() {}.getType();

    TypeInfo arrayInfo = TypeInfoFactory.getTypeInfoForField(listOfTArrayField, parentType);
    assertTrue(arrayInfo.getActualType() instanceof GenericArrayType);

    GenericArrayType gat = (GenericArrayType) arrayInfo.getActualType();
    assertTrue(gat.getGenericComponentType() instanceof ParameterizedType);

    ParameterizedType compParamType = (ParameterizedType) gat.getGenericComponentType();
    assertEquals(List.class, compParamType.getRawType());
    assertEquals(String.class, compParamType.getActualTypeArguments()[0]);
  }

  @Test
  public void testGetTypeInfoForField_genericArrayUnchangedComponentType_returnsOriginalOrMatching() throws Exception {
    Field stringListArrayField = ClassWithGenericArray.class.getDeclaredField("stringListArray");
    TypeInfo arrayInfo = TypeInfoFactory.getTypeInfoForField(stringListArrayField, ClassWithGenericArray.class);

    assertTrue(arrayInfo.getActualType() instanceof GenericArrayType);
    GenericArrayType gat = (GenericArrayType) arrayInfo.getActualType();
    assertTrue(gat.getGenericComponentType() instanceof ParameterizedType);
  }

  @Test
  public void testGetTypeInfoForField_wildcardType_resolvesUpperBound() throws Exception {
    Field wildcardField = GenericClass.class.getDeclaredField("wildcardField");
    Type parentType = GenericClass.class;

    TypeInfo wildcardInfo = TypeInfoFactory.getTypeInfoForField(wildcardField, parentType);
    assertTrue(wildcardInfo.getActualType() instanceof ParameterizedType);

    ParameterizedType paramType = (ParameterizedType) wildcardInfo.getActualType();
    assertEquals(Number.class, paramType.getActualTypeArguments()[0]);
  }

  @Test
  public void testGetTypeInfoForField_wildcardTypeWithGenericBound_resolvesActualType() throws Exception {
    Field wildcardGenericField = GenericClass.class.getDeclaredField("wildcardGenericField");
    Type parentType = new TypeToken<GenericClass<Long, Integer>>() {}.getType();

    TypeInfo wildcardInfo = TypeInfoFactory.getTypeInfoForField(wildcardGenericField, parentType);
    assertTrue(wildcardInfo.getActualType() instanceof ParameterizedType);

    ParameterizedType paramType = (ParameterizedType) wildcardInfo.getActualType();
    assertEquals(Long.class, paramType.getActualTypeArguments()[0]);
  }
}
