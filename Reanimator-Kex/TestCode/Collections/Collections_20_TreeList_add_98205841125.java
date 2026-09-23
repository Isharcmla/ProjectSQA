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
import java.lang.Object;

public class TreeList_add_98205841125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29;
     Object term32;
     Object term804;

    public TreeList_add_98205841125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29 = newInstance(Class.forName("org.apache.commons.collections.list.TreeList"));
        setField(term29, term29.getClass(), "root", null);
        setIntField(term29, term29.getClass(), "size", 0);
        setIntField(term29, term29.getClass(), "modCount", 0);
        term32 = new Integer(0);
        term804 = newInstance(Class.forName("org.apache.commons.collections.list.TreeList"));
        Object term805 = newInstance(Class.forName("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(term805, term805.getClass(), "left", null);
        setBooleanField(term805, term805.getClass(), "leftIsPrevious", true);
        setField(term805, term805.getClass(), "right", null);
        setBooleanField(term805, term805.getClass(), "rightIsNext", true);
        setIntField(term805, term805.getClass(), "height", 0);
        setIntField(term805, term805.getClass(), "relativePosition", 0);
        setField(term805, term805.getClass(), "value", null);
        setField(term804, term804.getClass(), "root", term805);
        setIntField(term804, term804.getClass(), "size", 1);
        setIntField(term804, term804.getClass(), "modCount", 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.list.TreeList");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term32;
        args[1] = null;
        callMethod(klass, "add", argTypes, term29, args);
        assertTrue(recursiveEquals(term29, term804));
        assertTrue(recursiveEquals(term32, 0));
    }

};


