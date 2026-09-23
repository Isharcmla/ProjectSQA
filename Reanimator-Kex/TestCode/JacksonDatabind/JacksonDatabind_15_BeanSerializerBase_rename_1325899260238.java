package com.fasterxml.jackson.databind.ser.std;

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
import static com.fasterxml.jackson.databind.ser.std.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.databind.ser.std.EqualityUtils.*;
import java.lang.Object;

public class BeanSerializerBase_rename_1325899260238 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term92647;
     Object term93306;
     Object term93903;
     Object term93904;
     Object term93900;

    public BeanSerializerBase_rename_1325899260238() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term92647 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 143);
        term93306 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$4"));
        term93903 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 143);
        term93904 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$4"));
        setField(term93904, term93904.getClass(), "val$suffix", null);
        term93900 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 143);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"), 0).getClass();
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Object[] args = new Object[2];
        args[0] = term92647;
        args[1] = term93306;
        Object retValue = callMethod(klass, "rename", argTypes, null, args);
        assertTrue(recursiveEquals(term92647, term93903));
        assertTrue(recursiveEquals(term93306, term93904));
        assertTrue(recursiveEquals(retValue, term93900));
    }

};


