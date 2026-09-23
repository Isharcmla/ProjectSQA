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

public class BeanSerializerBase_rename_1325899260259 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99662;
     Object term99866;
     Object term99903;
     Object term99904;
     Object term99900;

    public BeanSerializerBase_rename_1325899260259() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term99662 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 14);
        term99866 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$4"));
        term99903 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 14);
        term99904 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$4"));
        setField(term99904, term99904.getClass(), "val$suffix", null);
        term99900 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 14);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"), 0).getClass();
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Object[] args = new Object[2];
        args[0] = term99662;
        args[1] = term99866;
        Object retValue = callMethod(klass, "rename", argTypes, null, args);
        assertTrue(recursiveEquals(term99662, term99903));
        assertTrue(recursiveEquals(term99866, term99904));
        assertTrue(recursiveEquals(retValue, term99900));
    }

};


