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

public class ArrayUtils_subarray_1991585723197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term206;
     Object term208;
     Object term210;
     Object term11553;
     Object term11548;

    public ArrayUtils_subarray_1991585723197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term206 = (float[]) newFloatArray(1);
        setFloatElement(term206, 0, 0.5446086F);
        term208 = new Integer(-117576464);
        term210 = new Integer(-1007160944);
        term11553 = (float[]) newFloatArray(1);
        setFloatElement(term11553, 0, 0.5446086F);
        term11548 = (float[]) newFloatArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(float.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term206;
        args[1] = term208;
        args[2] = term210;
        Object retValue = callMethod(klass, "subarray", argTypes, null, args);
        assertTrue(recursiveEquals(term206, term11553));
        assertTrue(recursiveEquals(term208, -117576464));
        assertTrue(recursiveEquals(term210, -1007160944));
        assertTrue(recursiveEquals(retValue, term11548));
    }

};


