package org.jfree.data;

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
import static org.jfree.data.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jfree.data.EqualityUtils.*;
import java.util.HashMap;

public class DefaultKeyedValues_getIndex_201068939193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19735;
     Object term19837;
     Object term20436;
     Object term20437;

    public DefaultKeyedValues_getIndex_201068939193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term19783 = new HashMap();
        term19735 = newInstance(Class.forName("org.jfree.data.DefaultKeyedValues"));
        setField(term19735, term19735.getClass(), "indexMap", term19783);
        term19837 = newInstance(Class.forName("org.jfree.data.time.Year"));
        term20436 = newInstance(Class.forName("org.jfree.data.time.Year"));
        setShortField(term20436, term20436.getClass(), "year", (short) 0);
        setLongField(term20436, term20436.getClass(), "firstMillisecond", 0L);
        setLongField(term20436, term20436.getClass(), "lastMillisecond", 0L);
        term20437 = newInstance(Class.forName("org.jfree.data.time.Year"));
        setShortField(term20437, term20437.getClass(), "year", (short) 0);
        setLongField(term20437, term20437.getClass(), "firstMillisecond", 0L);
        setLongField(term20437, term20437.getClass(), "lastMillisecond", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.DefaultKeyedValues");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Comparable");
        Object[] args = new Object[1];
        args[0] = term19837;
        Object retValue = callMethod(klass, "getIndex", argTypes, term19735, args);
        assertTrue(recursiveEquals(term19735, term20436));
        assertTrue(recursiveEquals(term19837, term20437));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


