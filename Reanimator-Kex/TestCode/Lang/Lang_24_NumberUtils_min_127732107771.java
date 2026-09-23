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

public class NumberUtils_min_127732107771 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term480;
     Object term6791;

    public NumberUtils_min_127732107771() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term480 = (byte[]) newByteArray(4);
        setByteElement(term480, 0, (byte) 48);
        setByteElement(term480, 1, (byte) 89);
        setByteElement(term480, 2, (byte) 75);
        setByteElement(term480, 3, (byte) 18);
        term6791 = (byte[]) newByteArray(4);
        setByteElement(term6791, 0, (byte) 48);
        setByteElement(term6791, 1, (byte) 89);
        setByteElement(term6791, 2, (byte) 75);
        setByteElement(term6791, 3, (byte) 18);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.NumberUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term480;
        callMethod(klass, "min", argTypes, null, args);
        assertTrue(recursiveEquals(term480, term6791));
    }

};


