package org.apache.commons.lang3.math;

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
import static org.apache.commons.lang3.math.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang3.math.EqualityUtils.*;

public class NumberUtils_max_1277549795193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70837;
     Object term81137;

    public NumberUtils_max_1277549795193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term70837 = (byte[]) newByteArray(384);
        setByteElement(term70837, 34, (byte) -127);
        setByteElement(term70837, 133, (byte) -127);
        setByteElement(term70837, 277, (byte) 1);
        term81137 = (byte[]) newByteArray(384);
        setByteElement(term81137, 34, (byte) -127);
        setByteElement(term81137, 133, (byte) -127);
        setByteElement(term81137, 277, (byte) 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.NumberUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term70837;
        callMethod(klass, "max", argTypes, null, args);
        assertTrue(recursiveEquals(term70837, term81137));
    }

};


