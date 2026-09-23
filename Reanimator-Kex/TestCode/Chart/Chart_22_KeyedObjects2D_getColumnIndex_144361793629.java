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
import java.util.ArrayList;

public class KeyedObjects2D_getColumnIndex_144361793629 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100;
     Object term1289;

    public KeyedObjects2D_getColumnIndex_144361793629() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term101 = new ArrayList();
        ArrayList term105 = new ArrayList();
        ArrayList term109 = new ArrayList();
        term100 = newInstance(Class.forName("org.jfree.data.KeyedObjects2D"));
        setField(term100, term100.getClass(), "rowKeys", term101);
        setField(term100, term100.getClass(), "columnKeys", term105);
        setField(term100, term100.getClass(), "rows", term109);
        ArrayList term1290 = new ArrayList();
        ArrayList term1292 = new ArrayList();
        ArrayList term1294 = new ArrayList();
        term1289 = newInstance(Class.forName("org.jfree.data.KeyedObjects2D"));
        setField(term1289, term1289.getClass(), "rowKeys", term1290);
        setField(term1289, term1289.getClass(), "columnKeys", term1292);
        setField(term1289, term1289.getClass(), "rows", term1294);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.KeyedObjects2D");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Comparable");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "getColumnIndex", argTypes, term100, args);
        assertTrue(recursiveEquals(term100, term1289));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


