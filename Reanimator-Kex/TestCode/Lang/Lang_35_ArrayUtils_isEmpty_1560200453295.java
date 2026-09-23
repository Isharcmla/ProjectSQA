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

public class ArrayUtils_isEmpty_1560200453295 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1326;
     Object term14797;

    public ArrayUtils_isEmpty_1560200453295() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1326 = (int[]) newIntArray(6);
        setIntElement(term1326, 0, -1465035361);
        setIntElement(term1326, 1, 1090617576);
        setIntElement(term1326, 2, -1547384488);
        setIntElement(term1326, 3, 1442160736);
        setIntElement(term1326, 4, 1114000454);
        setIntElement(term1326, 5, -556405712);
        term14797 = (int[]) newIntArray(6);
        setIntElement(term14797, 0, -1465035361);
        setIntElement(term14797, 1, 1090617576);
        setIntElement(term14797, 2, -1547384488);
        setIntElement(term14797, 3, 1442160736);
        setIntElement(term14797, 4, 1114000454);
        setIntElement(term14797, 5, -556405712);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1326;
        Object retValue = callMethod(klass, "isEmpty", argTypes, null, args);
        assertTrue(recursiveEquals(term1326, term14797));
        assertTrue(recursiveEquals(retValue, false));
    }

};


