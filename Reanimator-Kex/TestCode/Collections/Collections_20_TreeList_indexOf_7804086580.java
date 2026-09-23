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

public class TreeList_indexOf_7804086580 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8454;
     Object term16135;

    public TreeList_indexOf_7804086580() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8454 = newInstance(Class.forName("org.apache.commons.collections.list.TreeList"));
        Object term8564 = newInstance(Class.forName("org.apache.commons.collections.list.TreeList$AVLNode"));
        setIntField(term8564, term8564.getClass(), "relativePosition", 0);
        setBooleanField(term8564, term8564.getClass(), "leftIsPrevious", true);
        setField(term8454, term8454.getClass(), "root", term8564);
        term16135 = newInstance(Class.forName("org.apache.commons.collections.list.TreeList"));
        Object term16136 = newInstance(Class.forName("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(term16136, term16136.getClass(), "left", null);
        setBooleanField(term16136, term16136.getClass(), "leftIsPrevious", true);
        setField(term16136, term16136.getClass(), "right", null);
        setBooleanField(term16136, term16136.getClass(), "rightIsNext", false);
        setIntField(term16136, term16136.getClass(), "height", 0);
        setIntField(term16136, term16136.getClass(), "relativePosition", 0);
        setField(term16136, term16136.getClass(), "value", null);
        setField(term16135, term16135.getClass(), "root", term16136);
        setIntField(term16135, term16135.getClass(), "size", 0);
        setIntField(term16135, term16135.getClass(), "modCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.list.TreeList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "indexOf", argTypes, term8454, args);
        assertTrue(recursiveEquals(term8454, term16135));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


