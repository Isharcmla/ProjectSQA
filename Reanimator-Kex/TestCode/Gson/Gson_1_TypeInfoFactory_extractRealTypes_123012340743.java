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
import java.lang.reflect.InaccessibleObjectException;
import static com.google.gson.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import org.mockito.Mockito;
import java.lang.String;

public class TypeInfoFactory_extractRealTypes_123012340743 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9691;

    public TypeInfoFactory_extractRealTypes_123012340743() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term9854 = Class.forName((String) "java.lang.ref.Cleaner$1");
        term9691 = (Object[]) newArray("java.lang.reflect.Type", 492);
        Object term9818 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term9695 = Mockito.mock(Class.forName("java.lang.reflect.WildcardType"));
        setField(term9818, term9818.getClass(), "genericComponentType", term9695);
        setElement(term9691, 0, term9818);
        setElement(term9691, 8, term9854);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.TypeInfoFactory");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.reflect.Type"), 0).getClass();
        argTypes[1] = Class.forName("java.lang.reflect.Type");
        argTypes[2] = Class.forName("java.lang.Class");
        Object[] args = new Object[3];
        args[0] = term9691;
        args[1] = null;
        args[2] = null;
        try {
            callMethod(klass, "extractRealTypes", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};
