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

public class BeanSerializerBase_rename_1325899260265 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term102523;
     Object term102968;
     Object term103305;
     Object term103306;
     Object term103302;

    public BeanSerializerBase_rename_1325899260265() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term102523 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 62);
        term102968 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$2"));
        term103305 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 62);
        term103306 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$2"));
        setField(term103306, term103306.getClass(), "val$prefix", null);
        term103302 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 62);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"), 0).getClass();
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Object[] args = new Object[2];
        args[0] = term102523;
        args[1] = term102968;
        Object retValue = callMethod(klass, "rename", argTypes, null, args);
        assertTrue(recursiveEquals(term102523, term103305));
        assertTrue(recursiveEquals(term102968, term103306));
        assertTrue(recursiveEquals(retValue, term103302));
    }

};


