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
import java.lang.Short;

public class ArrayUtils_removeElement_1321963048346 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1944;
     Object term1953;
     Object term26599;
     Object term26590;

    public ArrayUtils_removeElement_1321963048346() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1944 = (short[]) newShortArray(8);
        setShortElement(term1944, 0, (short) -9644);
        setShortElement(term1944, 1, (short) 21919);
        setShortElement(term1944, 2, (short) -32536);
        setShortElement(term1944, 3, (short) -13992);
        setShortElement(term1944, 4, (short) -24480);
        setShortElement(term1944, 5, (short) 19526);
        setShortElement(term1944, 6, (short) -5072);
        setShortElement(term1944, 7, (short) -13870);
        term1953 = new Short((short) -5504);
        term26599 = (short[]) newShortArray(8);
        setShortElement(term26599, 0, (short) -9644);
        setShortElement(term26599, 1, (short) 21919);
        setShortElement(term26599, 2, (short) -32536);
        setShortElement(term26599, 3, (short) -13992);
        setShortElement(term26599, 4, (short) -24480);
        setShortElement(term26599, 5, (short) 19526);
        setShortElement(term26599, 6, (short) -5072);
        setShortElement(term26599, 7, (short) -13870);
        term26590 = (short[]) newShortArray(8);
        setShortElement(term26590, 0, (short) -9644);
        setShortElement(term26590, 1, (short) 21919);
        setShortElement(term26590, 2, (short) -32536);
        setShortElement(term26590, 3, (short) -13992);
        setShortElement(term26590, 4, (short) -24480);
        setShortElement(term26590, 5, (short) 19526);
        setShortElement(term26590, 6, (short) -5072);
        setShortElement(term26590, 7, (short) -13870);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(short.class, 0).getClass();
        argTypes[1] = short.class;
        Object[] args = new Object[2];
        args[0] = term1944;
        args[1] = term1953;
        Object retValue = callMethod(klass, "removeElement", argTypes, null, args);
        assertTrue(recursiveEquals(term1944, term26599));
        assertTrue(recursiveEquals(term1953, (short) -5504));
        assertTrue(recursiveEquals(retValue, term26590));
    }

};


