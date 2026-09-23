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

public class ArrayUtils_indexOf_1336932501230 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term587;
     Object term590;
     Object term592;
     Object term12736;

    public ArrayUtils_indexOf_1336932501230() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term587 = (int[]) newIntArray(2);
        setIntElement(term587, 0, -157887805);
        setIntElement(term587, 1, 1876565163);
        term590 = new Integer(-817164822);
        term592 = new Integer(-1016503459);
        term12736 = (int[]) newIntArray(2);
        setIntElement(term12736, 0, -157887805);
        setIntElement(term12736, 1, 1876565163);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term587;
        args[1] = term590;
        args[2] = term592;
        Object retValue = callMethod(klass, "indexOf", argTypes, null, args);
        assertTrue(recursiveEquals(term587, term12736));
        assertTrue(recursiveEquals(term590, -817164822));
        assertTrue(recursiveEquals(term592, -1016503459));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


