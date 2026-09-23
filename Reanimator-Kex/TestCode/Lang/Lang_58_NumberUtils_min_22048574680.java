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

public class NumberUtils_min_22048574680 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term535;
     Object term5835;

    public NumberUtils_min_22048574680() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term535 = (short[]) newShortArray(3);
        setShortElement(term535, 0, (short) 27594);
        setShortElement(term535, 1, (short) 7670);
        setShortElement(term535, 2, (short) -26033);
        term5835 = (short[]) newShortArray(3);
        setShortElement(term5835, 0, (short) 27594);
        setShortElement(term5835, 1, (short) 7670);
        setShortElement(term5835, 2, (short) -26033);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.NumberUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(short.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term535;
        callMethod(klass, "min", argTypes, null, args);
        assertTrue(recursiveEquals(term535, term5835));
    }

};


