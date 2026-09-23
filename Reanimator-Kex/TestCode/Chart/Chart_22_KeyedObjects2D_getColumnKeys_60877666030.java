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

public class KeyedObjects2D_getColumnKeys_60877666030 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term113;
     Object term1310;
     Object term1296;

    public KeyedObjects2D_getColumnKeys_60877666030() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term114 = new ArrayList();
        ArrayList term118 = new ArrayList();
        ArrayList term122 = new ArrayList();
        term113 = newInstance(Class.forName("org.jfree.data.KeyedObjects2D"));
        setField(term113, term113.getClass(), "rowKeys", term114);
        setField(term113, term113.getClass(), "columnKeys", term118);
        setField(term113, term113.getClass(), "rows", term122);
        ArrayList term1311 = new ArrayList();
        ArrayList term1313 = new ArrayList();
        ArrayList term1315 = new ArrayList();
        term1310 = newInstance(Class.forName("org.jfree.data.KeyedObjects2D"));
        setField(term1310, term1310.getClass(), "rowKeys", term1311);
        setField(term1310, term1310.getClass(), "columnKeys", term1313);
        setField(term1310, term1310.getClass(), "rows", term1315);
        ArrayList term1297 = new ArrayList();
        term1296 = newInstance(Class.forName("java.util.Collections$UnmodifiableRandomAccessList"));
        setField(term1296, term1296.getClass(), "list", term1297);
        setField(term1296, term1296.getClass(), "c", term1297);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.KeyedObjects2D");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getColumnKeys", argTypes, term113, args);
        assertTrue(recursiveEquals(term113, term1310));
        assertTrue(recursiveEquals(retValue, term1296));
    }

};


