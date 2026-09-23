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

public class TreeList_contains_103097173552 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5029;
     Object term5390;

    public TreeList_contains_103097173552() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5029 = newInstance(Class.forName("org.apache.commons.collections.list.TreeList"));
        Object term5139 = newInstance(Class.forName("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(term5029, term5029.getClass(), "root", term5139);
        term5390 = newInstance(Class.forName("org.apache.commons.collections.list.TreeList"));
        Object term5391 = newInstance(Class.forName("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(term5391, term5391.getClass(), "left", null);
        setBooleanField(term5391, term5391.getClass(), "leftIsPrevious", false);
        setField(term5391, term5391.getClass(), "right", null);
        setBooleanField(term5391, term5391.getClass(), "rightIsNext", false);
        setIntField(term5391, term5391.getClass(), "height", 0);
        setIntField(term5391, term5391.getClass(), "relativePosition", 0);
        setField(term5391, term5391.getClass(), "value", null);
        setField(term5390, term5390.getClass(), "root", term5391);
        setIntField(term5390, term5390.getClass(), "size", 0);
        setIntField(term5390, term5390.getClass(), "modCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.list.TreeList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "contains", argTypes, term5029, args);
        assertTrue(recursiveEquals(term5029, term5390));
        assertTrue(recursiveEquals(retValue, true));
    }

};


