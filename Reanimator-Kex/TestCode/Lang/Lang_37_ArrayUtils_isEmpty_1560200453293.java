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

public class ArrayUtils_isEmpty_1560200453293 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1324;
     Object term14769;

    public ArrayUtils_isEmpty_1560200453293() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1324 = (int[]) newIntArray(6);
        setIntElement(term1324, 0, -1465035361);
        setIntElement(term1324, 1, 1090617576);
        setIntElement(term1324, 2, -1547384488);
        setIntElement(term1324, 3, 1442160736);
        setIntElement(term1324, 4, 1114000454);
        setIntElement(term1324, 5, -556405712);
        term14769 = (int[]) newIntArray(6);
        setIntElement(term14769, 0, -1465035361);
        setIntElement(term14769, 1, 1090617576);
        setIntElement(term14769, 2, -1547384488);
        setIntElement(term14769, 3, 1442160736);
        setIntElement(term14769, 4, 1114000454);
        setIntElement(term14769, 5, -556405712);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1324;
        Object retValue = callMethod(klass, "isEmpty", argTypes, null, args);
        assertTrue(recursiveEquals(term1324, term14769));
        assertTrue(recursiveEquals(retValue, false));
    }

};


