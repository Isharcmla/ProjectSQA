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
import java.lang.Integer;

public class ArrayUtils_subarray_115005125192 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term139;
     Object term146;
     Object term148;
     Object term11184;
     Object term11168;

    public ArrayUtils_subarray_115005125192() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term139 = (int[]) newIntArray(6);
        setIntElement(term139, 0, -2038273078);
        setIntElement(term139, 1, 1227103734);
        setIntElement(term139, 2, -1339778481);
        setIntElement(term139, 3, 1725571209);
        setIntElement(term139, 4, -522618178);
        setIntElement(term139, 5, 1134449235);
        term146 = new Integer(-883034806);
        term148 = new Integer(1585847225);
        term11184 = (int[]) newIntArray(6);
        setIntElement(term11184, 0, -2038273078);
        setIntElement(term11184, 1, 1227103734);
        setIntElement(term11184, 2, -1339778481);
        setIntElement(term11184, 3, 1725571209);
        setIntElement(term11184, 4, -522618178);
        setIntElement(term11184, 5, 1134449235);
        term11168 = (int[]) newIntArray(6);
        setIntElement(term11168, 0, -2038273078);
        setIntElement(term11168, 1, 1227103734);
        setIntElement(term11168, 2, -1339778481);
        setIntElement(term11168, 3, 1725571209);
        setIntElement(term11168, 4, -522618178);
        setIntElement(term11168, 5, 1134449235);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term139;
        args[1] = term146;
        args[2] = term148;
        Object retValue = callMethod(klass, "subarray", argTypes, null, args);
        assertTrue(recursiveEquals(term139, term11184));
        assertTrue(recursiveEquals(term146, -883034806));
        assertTrue(recursiveEquals(term148, 1585847225));
        assertTrue(recursiveEquals(retValue, term11168));
    }

};


