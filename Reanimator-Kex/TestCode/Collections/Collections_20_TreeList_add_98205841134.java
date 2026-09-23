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
import java.lang.Object;

public class TreeList_add_98205841134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1602;
     Object term2329;

    public TreeList_add_98205841134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1602 = newInstance(Class.forName("org.apache.commons.collections.list.TreeList"));
        Object term1712 = newInstance(Class.forName("org.apache.commons.collections.list.TreeList$AVLNode"));
        setIntField(term1602, term1602.getClass(), "modCount", 0);
        setIntField(term1602, term1602.getClass(), "size", 0);
        setField(term1602, term1602.getClass(), "root", term1712);
        term2329 = newInstance(Class.forName("org.apache.commons.collections.list.TreeList"));
        Object term2330 = newInstance(Class.forName("org.apache.commons.collections.list.TreeList$AVLNode"));
        Object term2331 = newInstance(Class.forName("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(term2331, term2331.getClass(), "left", null);
        setBooleanField(term2331, term2331.getClass(), "leftIsPrevious", true);
        setField(term2331, term2331.getClass(), "right", term2330);
        setBooleanField(term2331, term2331.getClass(), "rightIsNext", true);
        setIntField(term2331, term2331.getClass(), "height", 0);
        setIntField(term2331, term2331.getClass(), "relativePosition", -1);
        setField(term2331, term2331.getClass(), "value", null);
        setField(term2330, term2330.getClass(), "left", term2331);
        setBooleanField(term2330, term2330.getClass(), "leftIsPrevious", false);
        setField(term2330, term2330.getClass(), "right", null);
        setBooleanField(term2330, term2330.getClass(), "rightIsNext", false);
        setIntField(term2330, term2330.getClass(), "height", 1);
        setIntField(term2330, term2330.getClass(), "relativePosition", 1);
        setField(term2330, term2330.getClass(), "value", null);
        setField(term2329, term2329.getClass(), "root", term2330);
        setIntField(term2329, term2329.getClass(), "size", 1);
        setIntField(term2329, term2329.getClass(), "modCount", 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.list.TreeList");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = 0;
        args[1] = null;
        callMethod(klass, "add", argTypes, term1602, args);
        assertTrue(recursiveEquals(term1602, term2329));
    }

};


