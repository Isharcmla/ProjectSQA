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
import java.lang.Integer;

public class ArrayUtils_subarray_115720133195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term186;
     Object term189;
     Object term191;
     Object term11521;
     Object term11515;

    public ArrayUtils_subarray_115720133195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term186 = (byte[]) newByteArray(2);
        setByteElement(term186, 0, (byte) -29);
        setByteElement(term186, 1, (byte) -54);
        term189 = new Integer(1048535127);
        term191 = new Integer(-655067527);
        term11521 = (byte[]) newByteArray(2);
        setByteElement(term11521, 0, (byte) -29);
        setByteElement(term11521, 1, (byte) -54);
        term11515 = (byte[]) newByteArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term186;
        args[1] = term189;
        args[2] = term191;
        Object retValue = callMethod(klass, "subarray", argTypes, null, args);
        assertTrue(recursiveEquals(term186, term11521));
        assertTrue(recursiveEquals(term189, 1048535127));
        assertTrue(recursiveEquals(term191, -655067527));
        assertTrue(recursiveEquals(retValue, term11515));
    }

};


