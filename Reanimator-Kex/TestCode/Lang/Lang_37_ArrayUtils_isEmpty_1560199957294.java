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

public class ArrayUtils_isEmpty_1560199957294 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1337;
     Object term14790;

    public ArrayUtils_isEmpty_1560199957294() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1337 = (short[]) newShortArray(3);
        setShortElement(term1337, 0, (short) -11818);
        setShortElement(term1337, 1, (short) 7028);
        setShortElement(term1337, 2, (short) -29521);
        term14790 = (short[]) newShortArray(3);
        setShortElement(term14790, 0, (short) -11818);
        setShortElement(term14790, 1, (short) 7028);
        setShortElement(term14790, 2, (short) -29521);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(short.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1337;
        Object retValue = callMethod(klass, "isEmpty", argTypes, null, args);
        assertTrue(recursiveEquals(term1337, term14790));
        assertTrue(recursiveEquals(retValue, false));
    }

};


