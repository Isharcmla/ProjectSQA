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

public class TypeInfoFactory_extractRealTypes_123012340737 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7441;

    public TypeInfoFactory_extractRealTypes_123012340737() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term7601 = Class.forName((String) "java.util.Collections$UnmodifiableList");
        term7441 = (Object[]) newArray("java.lang.reflect.Type", 492);
        Object term7565 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term7445 = Mockito.mock(Class.forName("java.lang.reflect.TypeVariable"));
        setField(term7565, term7565.getClass(), "genericComponentType", term7445);
        setElement(term7441, 0, term7565);
        setElement(term7441, 128, term7601);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.TypeInfoFactory");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.reflect.Type"), 0).getClass();
        argTypes[1] = Class.forName("java.lang.reflect.Type");
        argTypes[2] = Class.forName("java.lang.Class");
        Object[] args = new Object[3];
        args[0] = term7441;
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
