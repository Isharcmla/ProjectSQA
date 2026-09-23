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

public class KeyedObjects2D_getRowIndex_37475666426 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59;
     Object term949;

    public KeyedObjects2D_getRowIndex_37475666426() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term60 = new ArrayList();
        ArrayList term64 = new ArrayList();
        ArrayList term68 = new ArrayList();
        term59 = newInstance(Class.forName("org.jfree.data.KeyedObjects2D"));
        setField(term59, term59.getClass(), "rowKeys", term60);
        setField(term59, term59.getClass(), "columnKeys", term64);
        setField(term59, term59.getClass(), "rows", term68);
        ArrayList term950 = new ArrayList();
        ArrayList term952 = new ArrayList();
        ArrayList term954 = new ArrayList();
        term949 = newInstance(Class.forName("org.jfree.data.KeyedObjects2D"));
        setField(term949, term949.getClass(), "rowKeys", term950);
        setField(term949, term949.getClass(), "columnKeys", term952);
        setField(term949, term949.getClass(), "rows", term954);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.KeyedObjects2D");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Comparable");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "getRowIndex", argTypes, term59, args);
        assertTrue(recursiveEquals(term59, term949));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


