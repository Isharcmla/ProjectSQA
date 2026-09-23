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

public class NumberUtils_equals_25706658573 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term427;
     Object term431;
     Object term5617;
     Object term5618;

    public NumberUtils_equals_25706658573() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term427 = (short[]) newShortArray(3);
        setShortElement(term427, 0, (short) 9519);
        setShortElement(term427, 1, (short) -10960);
        setShortElement(term427, 2, (short) -1703);
        term431 = (short[]) newShortArray(4);
        setShortElement(term431, 0, (short) 23627);
        setShortElement(term431, 1, (short) -19694);
        setShortElement(term431, 2, (short) 31942);
        setShortElement(term431, 3, (short) 30947);
        term5617 = (short[]) newShortArray(3);
        setShortElement(term5617, 0, (short) 9519);
        setShortElement(term5617, 1, (short) -10960);
        setShortElement(term5617, 2, (short) -1703);
        term5618 = (short[]) newShortArray(4);
        setShortElement(term5618, 0, (short) 23627);
        setShortElement(term5618, 1, (short) -19694);
        setShortElement(term5618, 2, (short) 31942);
        setShortElement(term5618, 3, (short) 30947);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.NumberUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(short.class, 0).getClass();
        argTypes[1] = Array.newInstance(short.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term427;
        args[1] = term431;
        Object retValue = callMethod(klass, "equals", argTypes, null, args);
        assertTrue(recursiveEquals(term427, term5617));
        assertTrue(recursiveEquals(term431, term5618));
        assertTrue(recursiveEquals(retValue, false));
    }

};


