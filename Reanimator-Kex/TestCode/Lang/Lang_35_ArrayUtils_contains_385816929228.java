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
import java.lang.Long;

public class ArrayUtils_contains_385816929228 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term571;
     Object term577;
     Object term12702;

    public ArrayUtils_contains_385816929228() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term571 = (long[]) newLongArray(5);
        setLongElement(term571, 0, -8708192233349544946L);
        setLongElement(term571, 1, 5907001541142728739L);
        setLongElement(term571, 2, 4178434741742309755L);
        setLongElement(term571, 3, -2068172595987555756L);
        setLongElement(term571, 4, -6292278961887936280L);
        term577 = new Long(-6645965768855543712L);
        term12702 = (long[]) newLongArray(5);
        setLongElement(term12702, 0, -8708192233349544946L);
        setLongElement(term12702, 1, 5907001541142728739L);
        setLongElement(term12702, 2, 4178434741742309755L);
        setLongElement(term12702, 3, -2068172595987555756L);
        setLongElement(term12702, 4, -6292278961887936280L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(long.class, 0).getClass();
        argTypes[1] = long.class;
        Object[] args = new Object[2];
        args[0] = term571;
        args[1] = term577;
        Object retValue = callMethod(klass, "contains", argTypes, null, args);
        assertTrue(recursiveEquals(term571, term12702));
        assertTrue(recursiveEquals(term577, -6645965768855543712L));
        assertTrue(recursiveEquals(retValue, false));
    }

};


