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

public class ArrayUtils_clone_335221183183 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60;
     Object term10717;
     Object term10709;

    public ArrayUtils_clone_335221183183() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60 = (int[]) newIntArray(3);
        setIntElement(term60, 0, 568599855);
        setIntElement(term60, 1, 1162663216);
        setIntElement(term60, 2, 1484323161);
        term10717 = (int[]) newIntArray(3);
        setIntElement(term10717, 0, 568599855);
        setIntElement(term10717, 1, 1162663216);
        setIntElement(term10717, 2, 1484323161);
        term10709 = (int[]) newIntArray(3);
        setIntElement(term10709, 0, 568599855);
        setIntElement(term10709, 1, 1162663216);
        setIntElement(term10709, 2, 1484323161);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term60;
        Object retValue = callMethod(klass, "clone", argTypes, null, args);
        assertTrue(recursiveEquals(term60, term10717));
        assertTrue(recursiveEquals(retValue, term10709));
    }

};


