package org.apache.commons.lang3;

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
import static org.apache.commons.lang3.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang3.EqualityUtils.*;
import java.lang.Byte;

public class ArrayUtils_contains_385872481248 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term839;
     Object term841;
     Object term13338;

    public ArrayUtils_contains_385872481248() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term839 = (byte[]) newByteArray(1);
        setByteElement(term839, 0, (byte) 42);
        term841 = new Byte((byte) 72);
        term13338 = (byte[]) newByteArray(1);
        setByteElement(term13338, 0, (byte) 42);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = byte.class;
        Object[] args = new Object[2];
        args[0] = term839;
        args[1] = term841;
        Object retValue = callMethod(klass, "contains", argTypes, null, args);
        assertTrue(recursiveEquals(term839, term13338));
        assertTrue(recursiveEquals(term841, (byte) 72));
        assertTrue(recursiveEquals(retValue, false));
    }

};


