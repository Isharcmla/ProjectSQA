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

public class TreeList_contains_103097173581 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8676;
     Object term16166;

    public TreeList_contains_103097173581() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8676 = newInstance(Class.forName("org.apache.commons.collections.list.TreeList"));
        Object term8786 = newInstance(Class.forName("org.apache.commons.collections.list.TreeList$AVLNode"));
        setIntField(term8786, term8786.getClass(), "relativePosition", 0);
        setBooleanField(term8786, term8786.getClass(), "leftIsPrevious", true);
        setField(term8676, term8676.getClass(), "root", term8786);
        term16166 = newInstance(Class.forName("org.apache.commons.collections.list.TreeList"));
        Object term16167 = newInstance(Class.forName("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(term16167, term16167.getClass(), "left", null);
        setBooleanField(term16167, term16167.getClass(), "leftIsPrevious", true);
        setField(term16167, term16167.getClass(), "right", null);
        setBooleanField(term16167, term16167.getClass(), "rightIsNext", false);
        setIntField(term16167, term16167.getClass(), "height", 0);
        setIntField(term16167, term16167.getClass(), "relativePosition", 0);
        setField(term16167, term16167.getClass(), "value", null);
        setField(term16166, term16166.getClass(), "root", term16167);
        setIntField(term16166, term16166.getClass(), "size", 0);
        setIntField(term16166, term16166.getClass(), "modCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.list.TreeList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "contains", argTypes, term8676, args);
        assertTrue(recursiveEquals(term8676, term16166));
        assertTrue(recursiveEquals(retValue, true));
    }

};


