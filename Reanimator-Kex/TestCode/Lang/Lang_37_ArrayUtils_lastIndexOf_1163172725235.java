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

public class ArrayUtils_lastIndexOf_1163172725235 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term683;
     Object term693;
     Object term695;
     Object term12966;

    public ArrayUtils_lastIndexOf_1163172725235() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term683 = (short[]) newShortArray(9);
        setShortElement(term683, 0, (short) -31121);
        setShortElement(term683, 1, (short) 14947);
        setShortElement(term683, 2, (short) -12812);
        setShortElement(term683, 3, (short) -11581);
        setShortElement(term683, 4, (short) 7339);
        setShortElement(term683, 5, (short) 3562);
        setShortElement(term683, 6, (short) 25437);
        setShortElement(term683, 7, (short) -14779);
        setShortElement(term683, 8, (short) -4938);
        term693 = new Short((short) -13947);
        term695 = new Integer(287287233);
        term12966 = (short[]) newShortArray(9);
        setShortElement(term12966, 0, (short) -31121);
        setShortElement(term12966, 1, (short) 14947);
        setShortElement(term12966, 2, (short) -12812);
        setShortElement(term12966, 3, (short) -11581);
        setShortElement(term12966, 4, (short) 7339);
        setShortElement(term12966, 5, (short) 3562);
        setShortElement(term12966, 6, (short) 25437);
        setShortElement(term12966, 7, (short) -14779);
        setShortElement(term12966, 8, (short) -4938);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(short.class, 0).getClass();
        argTypes[1] = short.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term683;
        args[1] = term693;
        args[2] = term695;
        Object retValue = callMethod(klass, "lastIndexOf", argTypes, null, args);
        assertTrue(recursiveEquals(term683, term12966));
        assertTrue(recursiveEquals(term693, (short) -13947));
        assertTrue(recursiveEquals(term695, 287287233));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


