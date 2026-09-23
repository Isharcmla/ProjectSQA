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
import java.lang.Object;

public class ArrayUtils_toObject_266375368289 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1298;
     Object term14690;
     Object term14688;

    public ArrayUtils_toObject_266375368289() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1298 = (float[]) newFloatArray(0);
        term14690 = (float[]) newFloatArray(0);
        term14688 = (Object[]) newArray("java.lang.Float", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(float.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1298;
        Object retValue = callMethod(klass, "toObject", argTypes, null, args);
        assertTrue(recursiveEquals(term1298, term14690));
        assertTrue(recursiveEquals(retValue, term14688));
    }

};


