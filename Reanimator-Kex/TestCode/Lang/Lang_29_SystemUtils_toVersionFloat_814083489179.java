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

public class SystemUtils_toVersionFloat_814083489179 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18418;
     Object term18762;

    public SystemUtils_toVersionFloat_814083489179() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18418 = (int[]) newIntArray(16);
        term18762 = (int[]) newIntArray(16);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.SystemUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term18418;
        Object retValue = callMethod(klass, "toVersionFloat", argTypes, null, args);
        assertTrue(recursiveEquals(term18418, term18762));
        assertTrue(recursiveEquals(retValue, 0.0F));
    }

};


