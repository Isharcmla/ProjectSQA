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

public class ArrayUtils_isSameLength_1946801034202 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term270;
     Object term274;
     Object term11707;
     Object term11708;

    public ArrayUtils_isSameLength_1946801034202() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term270 = (short[]) newShortArray(3);
        setShortElement(term270, 0, (short) -26033);
        setShortElement(term270, 1, (short) 8329);
        setShortElement(term270, 2, (short) 31422);
        term274 = (short[]) newShortArray(5);
        setShortElement(term274, 0, (short) 21075);
        setShortElement(term274, 1, (short) -2742);
        setShortElement(term274, 2, (short) 7097);
        setShortElement(term274, 3, (short) -16335);
        setShortElement(term274, 4, (short) -5174);
        term11707 = (short[]) newShortArray(3);
        setShortElement(term11707, 0, (short) -26033);
        setShortElement(term11707, 1, (short) 8329);
        setShortElement(term11707, 2, (short) 31422);
        term11708 = (short[]) newShortArray(5);
        setShortElement(term11708, 0, (short) 21075);
        setShortElement(term11708, 1, (short) -2742);
        setShortElement(term11708, 2, (short) 7097);
        setShortElement(term11708, 3, (short) -16335);
        setShortElement(term11708, 4, (short) -5174);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(short.class, 0).getClass();
        argTypes[1] = Array.newInstance(short.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term270;
        args[1] = term274;
        Object retValue = callMethod(klass, "isSameLength", argTypes, null, args);
        assertTrue(recursiveEquals(term270, term11707));
        assertTrue(recursiveEquals(term274, term11708));
        assertTrue(recursiveEquals(retValue, false));
    }

};


