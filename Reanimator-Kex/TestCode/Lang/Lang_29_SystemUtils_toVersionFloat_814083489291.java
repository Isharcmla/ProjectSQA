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

public class SystemUtils_toVersionFloat_814083489291 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98931;
     Object term100928;

    public SystemUtils_toVersionFloat_814083489291() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term98931 = (int[]) newIntArray(135);
        term100928 = (int[]) newIntArray(135);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.SystemUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term98931;
        Object retValue = callMethod(klass, "toVersionFloat", argTypes, null, args);
        assertTrue(recursiveEquals(term98931, term100928));
        assertTrue(recursiveEquals(retValue, 0.0F));
    }

};


