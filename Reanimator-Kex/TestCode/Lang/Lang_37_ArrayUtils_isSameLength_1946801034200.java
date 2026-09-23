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

public class ArrayUtils_isSameLength_1946801034200 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term259;
     Object term263;
     Object term11642;
     Object term11643;

    public ArrayUtils_isSameLength_1946801034200() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term259 = (short[]) newShortArray(3);
        setShortElement(term259, 0, (short) -26033);
        setShortElement(term259, 1, (short) 8329);
        setShortElement(term259, 2, (short) 31422);
        term263 = (short[]) newShortArray(5);
        setShortElement(term263, 0, (short) 21075);
        setShortElement(term263, 1, (short) -2742);
        setShortElement(term263, 2, (short) 7097);
        setShortElement(term263, 3, (short) -16335);
        setShortElement(term263, 4, (short) -5174);
        term11642 = (short[]) newShortArray(3);
        setShortElement(term11642, 0, (short) -26033);
        setShortElement(term11642, 1, (short) 8329);
        setShortElement(term11642, 2, (short) 31422);
        term11643 = (short[]) newShortArray(5);
        setShortElement(term11643, 0, (short) 21075);
        setShortElement(term11643, 1, (short) -2742);
        setShortElement(term11643, 2, (short) 7097);
        setShortElement(term11643, 3, (short) -16335);
        setShortElement(term11643, 4, (short) -5174);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(short.class, 0).getClass();
        argTypes[1] = Array.newInstance(short.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term259;
        args[1] = term263;
        Object retValue = callMethod(klass, "isSameLength", argTypes, null, args);
        assertTrue(recursiveEquals(term259, term11642));
        assertTrue(recursiveEquals(term263, term11643));
        assertTrue(recursiveEquals(retValue, false));
    }

};


