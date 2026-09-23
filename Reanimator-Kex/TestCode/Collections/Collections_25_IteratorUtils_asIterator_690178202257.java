package org.apache.commons.collections4;

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
import static org.apache.commons.collections4.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.collections4.EqualityUtils.*;
import java.util.ArrayList;
import java.lang.Object;

public class IteratorUtils_asIterator_690178202257 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32163;
     Object term32215;
     Object term32877;
     Object term32878;
     Object term32870;

    public IteratorUtils_asIterator_690178202257() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32163 = newInstance(Class.forName("java.util.Vector$1"));
        term32215 = new ArrayList();
        term32877 = newInstance(Class.forName("java.util.Vector$1"));
        setIntField(term32877, term32877.getClass(), "count", 0);
        setField(term32877, term32877.getClass(), "this$0", null);
        term32878 = new ArrayList();
        ArrayList term32871 = new ArrayList();
        term32870 = newInstance(Class.forName("org.apache.commons.collections4.iterators.EnumerationIterator"));
        Object term32875 = newInstance(Class.forName("java.util.Vector$1"));
        setField(term32870, term32870.getClass(), "collection", term32871);
        setIntField(term32875, term32875.getClass(), "count", 0);
        setField(term32875, term32875.getClass(), "this$0", null);
        setField(term32870, term32870.getClass(), "enumeration", term32875);
        setField(term32870, term32870.getClass(), "last", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.IteratorUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Enumeration");
        argTypes[1] = Class.forName("java.util.Collection");
        Object[] args = new Object[2];
        args[0] = term32163;
        args[1] = term32215;
        Object retValue = callMethod(klass, "asIterator", argTypes, null, args);
        assertTrue(recursiveEquals(term32163, term32877));
        assertTrue(recursiveEquals(term32215, term32878));
        assertTrue(recursiveEquals(retValue, term32870));
    }

};


