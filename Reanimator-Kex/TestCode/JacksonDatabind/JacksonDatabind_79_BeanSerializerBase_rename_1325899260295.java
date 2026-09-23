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

public class BeanSerializerBase_rename_1325899260295 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term114514;
     Object term115053;
     Object term115672;
     Object term115673;
     Object term115669;

    public BeanSerializerBase_rename_1325899260295() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term114514 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 81);
        term115053 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$1"));
        term115672 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 81);
        term115673 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$1"));
        setField(term115673, term115673.getClass(), "val$prefix", null);
        setField(term115673, term115673.getClass(), "val$suffix", null);
        term115669 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 81);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"), 0).getClass();
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Object[] args = new Object[2];
        args[0] = term114514;
        args[1] = term115053;
        Object retValue = callMethod(klass, "rename", argTypes, null, args);
        assertTrue(recursiveEquals(term114514, term115672));
        assertTrue(recursiveEquals(term115053, term115673));
        assertTrue(recursiveEquals(retValue, term115669));
    }

};


