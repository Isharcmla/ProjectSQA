package com.google.gson;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static com.google.gson.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TypeInfoFactory_getActualType_63538312595 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term231225;

    public TypeInfoFactory_getActualType_63538312595() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term231225 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term231303 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term231381 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term231459 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term231537 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term231615 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term231693 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term231771 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term231849 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term231927 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term232005 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term232083 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term232161 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term232239 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term232317 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term232395 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term232473 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term232551 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term232631 = newInstance(Class.forName("com.google.gson.ParameterizedTypeImpl"));
        setField(term232551, term232551.getClass(), "genericComponentType", term232631);
        setField(term232473, term232473.getClass(), "genericComponentType", term232551);
        setField(term232395, term232395.getClass(), "genericComponentType", term232473);
        setField(term232317, term232317.getClass(), "genericComponentType", term232395);
        setField(term232239, term232239.getClass(), "genericComponentType", term232317);
        setField(term232161, term232161.getClass(), "genericComponentType", term232239);
        setField(term232083, term232083.getClass(), "genericComponentType", term232161);
        setField(term232005, term232005.getClass(), "genericComponentType", term232083);
        setField(term231927, term231927.getClass(), "genericComponentType", term232005);
        setField(term231849, term231849.getClass(), "genericComponentType", term231927);
        setField(term231771, term231771.getClass(), "genericComponentType", term231849);
        setField(term231693, term231693.getClass(), "genericComponentType", term231771);
        setField(term231615, term231615.getClass(), "genericComponentType", term231693);
        setField(term231537, term231537.getClass(), "genericComponentType", term231615);
        setField(term231459, term231459.getClass(), "genericComponentType", term231537);
        setField(term231381, term231381.getClass(), "genericComponentType", term231459);
        setField(term231303, term231303.getClass(), "genericComponentType", term231381);
        setField(term231225, term231225.getClass(), "genericComponentType", term231303);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.TypeInfoFactory");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.reflect.Type");
        argTypes[1] = Class.forName("java.lang.reflect.Type");
        argTypes[2] = Class.forName("java.lang.Class");
        Object[] args = new Object[3];
        args[0] = term231225;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "getActualType", argTypes, null, args);
    }

};
