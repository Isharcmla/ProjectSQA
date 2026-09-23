package org.apache.commons.lang.math;

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
import static org.apache.commons.lang.math.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang.math.EqualityUtils.*;

public class NumberUtils_max_220714720261 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72053;
     Object term92952;

    public NumberUtils_max_220714720261() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term72053 = (byte[]) newByteArray(898);
        setByteElement(term72053, 181, (byte) -127);
        setByteElement(term72053, 389, (byte) -127);
        setByteElement(term72053, 449, (byte) 1);
        term92952 = (byte[]) newByteArray(898);
        setByteElement(term92952, 181, (byte) -127);
        setByteElement(term92952, 389, (byte) -127);
        setByteElement(term92952, 449, (byte) 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.NumberUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term72053;
        callMethod(klass, "max", argTypes, null, args);
        assertTrue(recursiveEquals(term72053, term92952));
    }

};


