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

public class ArrayUtils_clone_335221183181 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46;
     Object term10663;
     Object term10655;

    public ArrayUtils_clone_335221183181() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46 = (int[]) newIntArray(3);
        setIntElement(term46, 0, 568599855);
        setIntElement(term46, 1, 1162663216);
        setIntElement(term46, 2, 1484323161);
        term10663 = (int[]) newIntArray(3);
        setIntElement(term10663, 0, 568599855);
        setIntElement(term10663, 1, 1162663216);
        setIntElement(term10663, 2, 1484323161);
        term10655 = (int[]) newIntArray(3);
        setIntElement(term10655, 0, 568599855);
        setIntElement(term10655, 1, 1162663216);
        setIntElement(term10655, 2, 1484323161);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term46;
        Object retValue = callMethod(klass, "clone", argTypes, null, args);
        assertTrue(recursiveEquals(term46, term10663));
        assertTrue(recursiveEquals(retValue, term10655));
    }

};


