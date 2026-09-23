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
import java.lang.Integer;

public class ArrayUtils_lastIndexOf_1163172725237 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term694;
     Object term704;
     Object term706;
     Object term13012;

    public ArrayUtils_lastIndexOf_1163172725237() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term694 = (short[]) newShortArray(9);
        setShortElement(term694, 0, (short) -31121);
        setShortElement(term694, 1, (short) 14947);
        setShortElement(term694, 2, (short) -12812);
        setShortElement(term694, 3, (short) -11581);
        setShortElement(term694, 4, (short) 7339);
        setShortElement(term694, 5, (short) 3562);
        setShortElement(term694, 6, (short) 25437);
        setShortElement(term694, 7, (short) -14779);
        setShortElement(term694, 8, (short) -4938);
        term704 = new Short((short) -13947);
        term706 = new Integer(287287233);
        term13012 = (short[]) newShortArray(9);
        setShortElement(term13012, 0, (short) -31121);
        setShortElement(term13012, 1, (short) 14947);
        setShortElement(term13012, 2, (short) -12812);
        setShortElement(term13012, 3, (short) -11581);
        setShortElement(term13012, 4, (short) 7339);
        setShortElement(term13012, 5, (short) 3562);
        setShortElement(term13012, 6, (short) 25437);
        setShortElement(term13012, 7, (short) -14779);
        setShortElement(term13012, 8, (short) -4938);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(short.class, 0).getClass();
        argTypes[1] = short.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term694;
        args[1] = term704;
        args[2] = term706;
        Object retValue = callMethod(klass, "lastIndexOf", argTypes, null, args);
        assertTrue(recursiveEquals(term694, term13012));
        assertTrue(recursiveEquals(term704, (short) -13947));
        assertTrue(recursiveEquals(term706, 287287233));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


