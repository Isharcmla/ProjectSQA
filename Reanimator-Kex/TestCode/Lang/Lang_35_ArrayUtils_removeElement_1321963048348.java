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

public class ArrayUtils_removeElement_1321963048348 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1960;
     Object term1969;
     Object term26620;
     Object term26611;

    public ArrayUtils_removeElement_1321963048348() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1960 = (short[]) newShortArray(8);
        setShortElement(term1960, 0, (short) -9644);
        setShortElement(term1960, 1, (short) 21919);
        setShortElement(term1960, 2, (short) -32536);
        setShortElement(term1960, 3, (short) -13992);
        setShortElement(term1960, 4, (short) -24480);
        setShortElement(term1960, 5, (short) 19526);
        setShortElement(term1960, 6, (short) -5072);
        setShortElement(term1960, 7, (short) -13870);
        term1969 = new Short((short) -5504);
        term26620 = (short[]) newShortArray(8);
        setShortElement(term26620, 0, (short) -9644);
        setShortElement(term26620, 1, (short) 21919);
        setShortElement(term26620, 2, (short) -32536);
        setShortElement(term26620, 3, (short) -13992);
        setShortElement(term26620, 4, (short) -24480);
        setShortElement(term26620, 5, (short) 19526);
        setShortElement(term26620, 6, (short) -5072);
        setShortElement(term26620, 7, (short) -13870);
        term26611 = (short[]) newShortArray(8);
        setShortElement(term26611, 0, (short) -9644);
        setShortElement(term26611, 1, (short) 21919);
        setShortElement(term26611, 2, (short) -32536);
        setShortElement(term26611, 3, (short) -13992);
        setShortElement(term26611, 4, (short) -24480);
        setShortElement(term26611, 5, (short) 19526);
        setShortElement(term26611, 6, (short) -5072);
        setShortElement(term26611, 7, (short) -13870);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(short.class, 0).getClass();
        argTypes[1] = short.class;
        Object[] args = new Object[2];
        args[0] = term1960;
        args[1] = term1969;
        Object retValue = callMethod(klass, "removeElement", argTypes, null, args);
        assertTrue(recursiveEquals(term1960, term26620));
        assertTrue(recursiveEquals(term1969, (short) -5504));
        assertTrue(recursiveEquals(retValue, term26611));
    }

};


