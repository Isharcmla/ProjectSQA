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

public class NumberUtils_max_22071395285 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term568;
     Object term6212;

    public NumberUtils_max_22071395285() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term568 = (int[]) newIntArray(6);
        setIntElement(term568, 0, -522618178);
        setIntElement(term568, 1, 1134449235);
        setIntElement(term568, 2, -883034806);
        setIntElement(term568, 3, 1585847225);
        setIntElement(term568, 4, 597278769);
        setIntElement(term568, 5, -1685132342);
        term6212 = (int[]) newIntArray(6);
        setIntElement(term6212, 0, -522618178);
        setIntElement(term6212, 1, 1134449235);
        setIntElement(term6212, 2, -883034806);
        setIntElement(term6212, 3, 1585847225);
        setIntElement(term6212, 4, 597278769);
        setIntElement(term6212, 5, -1685132342);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.NumberUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term568;
        callMethod(klass, "max", argTypes, null, args);
        assertTrue(recursiveEquals(term568, term6212));
    }

};


