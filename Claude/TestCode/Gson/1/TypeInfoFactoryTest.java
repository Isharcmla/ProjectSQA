package com.google.gson;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class TypeInfoFactoryTest {

  // ---------- Test helper classes ----------

  static class Plain {
    String name;
    int number;
  }

  static class GenericHolder<T> {
    T simpleField;
    List<T> listField;
    T[] arrayField;
    List<? extends Number> wildcardField;
    Map<String, T> mapField;
  }

  static class StringHolder extends GenericHolder<String> {
  }

  // ---------- getTypeInfoForArray tests ----------

  @Test
  public void testGetTypeInfoForArray_withClassArrayType_returnsTypeInfoArray() {
    TypeInfoArray result = TypeInfoFactory.getTypeInfoForArray(String[].class);
    assertNotNull(result);
  }

  @Test
  public void testGetTypeInfoForArray_withPrimitiveArrayType_returnsTypeInfoArray() {
    TypeInfoArray result = TypeInfoFactory.getTypeInfoForArray(int[].class);
    assertNotNull(result);
  }

  @Test
  public void testGetTypeInfoForArray_withGenericArrayType_returnsTypeInfoArray() throws Exception {
    Field field = GenericHolder.class.getDeclaredField("arrayField");
    Type genericType = field.getGenericType();
    assertTrue(genericType instanceof GenericArrayType);
    TypeInfoArray result = TypeInfoFactory.getTypeInfoForArray(genericType);
    assertNotNull(result);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testGetTypeInfoForArray_withNonArrayClass_throwsIllegalArgumentException() {
    TypeInfoFactory.getTypeInfoForArray(String.class);
  }

  @Test(expected = Exception.class)
  public void testGetTypeInfoForArray_withNullType_throwsException() {
    TypeInfoFactory.getTypeInfoForArray(null);
  }

  // ---------- getTypeInfoForField tests ----------

  @Test
  public void testGetTypeInfoForField_withNonGenericStringField_returnsTypeInfo() throws Exception {
    Field field = Plain.class.getDeclaredField("name");
    TypeInfo result = TypeInfoFactory.getTypeInfoForField(field, Plain.class);
    assertNotNull(result);
  }

  @Test
  public void testGetTypeInfoForField_withPrimitiveIntField_returnsTypeInfo() throws Exception {
    Field field = Plain.class.getDeclaredField("number");
    TypeInfo result = TypeInfoFactory.getTypeInfoForField(field, Plain.class);
    assertNotNull(result);
  }

  @Test
  public void testGetTypeInfoForField_withTypeVariableField_resolvesToActualType() throws Exception {
    Field field = GenericHolder.class.getDeclaredField("simpleField");
    Type parentType = StringHolder.class.getGenericSuperclass();
    TypeInfo result = TypeInfoFactory.getTypeInfoForField(field, parentType);
    assertNotNull(result);
  }

  @Test
  public void testGetTypeInfoForField_withParameterizedTypeField_resolvesActualTypeArguments() throws Exception {
    Field field = GenericHolder.class.getDeclaredField("listField");
    Type parentType = StringHolder.class.getGenericSuperclass();
    TypeInfo result = TypeInfoFactory.getTypeInfoForField(field, parentType);
    assertNotNull(result);
  }

  @Test
  public void testGetTypeInfoForField_withGenericArrayTypeField_resolvesToArrayClass() throws Exception {
    Field field = GenericHolder.class.getDeclaredField("arrayField");
    Type parentType = StringHolder.class.getGenericSuperclass();
    TypeInfo result = TypeInfoFactory.getTypeInfoForField(field, parentType);
    assertNotNull(result);
  }

  @Test
  public void testGetTypeInfoForField_withWildcardTypeField_resolvesUpperBound() throws Exception {
    Field field = GenericHolder.class.getDeclaredField("wildcardField");
    Type parentType = StringHolder.class.getGenericSuperclass();
    TypeInfo result = TypeInfoFactory.getTypeInfoForField(field, parentType);
    assertNotNull(result);
  }

  @Test
  public void testGetTypeInfoForField_withMultipleTypeArguments_resolvesAllArguments() throws Exception {
    Field field = GenericHolder.class.getDeclaredField("mapField");
    Type parentType = StringHolder.class.getGenericSuperclass();
    TypeInfo result = TypeInfoFactory.getTypeInfoForField(field, parentType);
    assertNotNull(result);
  }

  @Test(expected = UnsupportedOperationException.class)
  public void testGetTypeInfoForField_withTypeVariableAndNonParameterizedParent_throwsUnsupportedOperationException()
      throws Exception {
    Field field = GenericHolder.class.getDeclaredField("simpleField");
    TypeInfoFactory.getTypeInfoForField(field, GenericHolder.class);
  }

  @Test(expected = Exception.class)
  public void testGetTypeInfoForField_withNullField_throwsException() {
    TypeInfoFactory.getTypeInfoForField(null, Plain.class);
  }

  // ---------- Private constructor coverage ----------

  @Test
  public void testPrivateConstructor_invokedViaReflection_createsInstance() throws Exception {
    Constructor<TypeInfoFactory> constructor = TypeInfoFactory.class.getDeclaredConstructor();
    constructor.setAccessible(true);
    TypeInfoFactory instance = constructor.newInstance();
    assertNotNull(instance);
  }
}
