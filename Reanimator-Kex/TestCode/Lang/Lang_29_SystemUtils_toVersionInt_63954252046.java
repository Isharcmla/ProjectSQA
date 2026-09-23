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

public class SystemUtils_toVersionInt_63954252046 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term392;
     Object term1610;

    public SystemUtils_toVersionInt_63954252046() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term392 = (int[]) newIntArray(4);
        setIntElement(term392, 0, -2038273078);
        setIntElement(term392, 1, 1227103734);
        setIntElement(term392, 2, -1339778481);
        setIntElement(term392, 3, 1725571209);
        term1610 = (int[]) newIntArray(4);
        setIntElement(term1610, 0, -2038273078);
        setIntElement(term1610, 1, 1227103734);
        setIntElement(term1610, 2, -1339778481);
        setIntElement(term1610, 3, 1725571209);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.SystemUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term392;
        Object retValue = callMethod(klass, "toVersionInt", argTypes, null, args);
        assertTrue(recursiveEquals(term392, term1610));
        assertTrue(recursiveEquals(retValue, 377479379));
    }

};


