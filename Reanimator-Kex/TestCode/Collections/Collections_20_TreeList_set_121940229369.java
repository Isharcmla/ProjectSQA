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

public class TreeList_set_121940229369 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6040;
     Object term14442;

    public TreeList_set_121940229369() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6040 = newInstance(Class.forName("org.apache.commons.collections.list.TreeList"));
        Object term6150 = newInstance(Class.forName("org.apache.commons.collections.list.TreeList$AVLNode"));
        setIntField(term6040, term6040.getClass(), "size", 1);
        setField(term6040, term6040.getClass(), "root", term6150);
        term14442 = newInstance(Class.forName("org.apache.commons.collections.list.TreeList"));
        Object term14443 = newInstance(Class.forName("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(term14443, term14443.getClass(), "left", null);
        setBooleanField(term14443, term14443.getClass(), "leftIsPrevious", false);
        setField(term14443, term14443.getClass(), "right", null);
        setBooleanField(term14443, term14443.getClass(), "rightIsNext", false);
        setIntField(term14443, term14443.getClass(), "height", 0);
        setIntField(term14443, term14443.getClass(), "relativePosition", 0);
        setField(term14443, term14443.getClass(), "value", null);
        setField(term14442, term14442.getClass(), "root", term14443);
        setIntField(term14442, term14442.getClass(), "size", 1);
        setIntField(term14442, term14442.getClass(), "modCount", 0);
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
        Object retValue = callMethod(klass, "set", argTypes, term6040, args);
        assertTrue(recursiveEquals(term6040, term14442));
        assertTrue(recursiveEquals(retValue, null));
    }

};


