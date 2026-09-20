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
import java.lang.String;

public class TypeInfoFactory_extractRealTypes_123012340742 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8669;

    public TypeInfoFactory_extractRealTypes_123012340742() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term8903 = Class.forName((String) "java.util.Collections$EmptyIterator");
        term8669 = (Object[]) newArray("java.lang.reflect.Type", 12);
        Object term8789 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term8867 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        setField(term8789, term8789.getClass(), "genericComponentType", term8867);
        setElement(term8669, 0, term8789);
        setElement(term8669, 8, term8903);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.TypeInfoFactory");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.reflect.Type"), 0).getClass();
        argTypes[1] = Class.forName("java.lang.reflect.Type");
        argTypes[2] = Class.forName("java.lang.Class");
        Object[] args = new Object[3];
        args[0] = term8669;
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
