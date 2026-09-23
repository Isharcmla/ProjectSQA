package org.apache.commons.collections.list;

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
import static org.apache.commons.collections.list.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.collections.list.EqualityUtils.*;
import java.lang.Integer;

public class TreeList_checkInterval_44147268429 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47;
     Object term50;
     Object term52;
     Object term54;
     Object term1380;

    public TreeList_checkInterval_44147268429() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47 = newInstance(Class.forName("org.apache.commons.collections.list.TreeList"));
        setField(term47, term47.getClass(), "root", null);
        setIntField(term47, term47.getClass(), "size", 0);
        setIntField(term47, term47.getClass(), "modCount", 0);
        term50 = new Integer(0);
        term52 = new Integer(0);
        term54 = new Integer(0);
        term1380 = newInstance(Class.forName("org.apache.commons.collections.list.TreeList"));
        setField(term1380, term1380.getClass(), "root", null);
        setIntField(term1380, term1380.getClass(), "size", 0);
        setIntField(term1380, term1380.getClass(), "modCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.list.TreeList");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term50;
        args[1] = term52;
        args[2] = term54;
        callMethod(klass, "checkInterval", argTypes, term47, args);
        assertTrue(recursiveEquals(term47, term1380));
        assertTrue(recursiveEquals(term50, 0));
        assertTrue(recursiveEquals(term52, 0));
        assertTrue(recursiveEquals(term54, 0));
    }

};


