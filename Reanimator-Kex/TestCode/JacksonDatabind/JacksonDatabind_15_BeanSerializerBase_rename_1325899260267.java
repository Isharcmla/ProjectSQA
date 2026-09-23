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

public class BeanSerializerBase_rename_1325899260267 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term102003;
     Object term102602;
     Object term103193;
     Object term103194;
     Object term103190;

    public BeanSerializerBase_rename_1325899260267() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term102003 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 93);
        term102602 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$3"));
        term103193 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 93);
        term103194 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$3"));
        setField(term103194, term103194.getClass(), "val$prefix", null);
        term103190 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 93);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"), 0).getClass();
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Object[] args = new Object[2];
        args[0] = term102003;
        args[1] = term102602;
        Object retValue = callMethod(klass, "rename", argTypes, null, args);
        assertTrue(recursiveEquals(term102003, term103193));
        assertTrue(recursiveEquals(term102602, term103194));
        assertTrue(recursiveEquals(retValue, term103190));
    }

};


