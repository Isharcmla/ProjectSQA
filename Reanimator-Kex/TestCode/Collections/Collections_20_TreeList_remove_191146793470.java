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

public class TreeList_remove_191146793470 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6270;
     Object term14478;

    public TreeList_remove_191146793470() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6270 = newInstance(Class.forName("org.apache.commons.collections.list.TreeList"));
        Object term6380 = newInstance(Class.forName("org.apache.commons.collections.list.TreeList$AVLNode"));
        setIntField(term6270, term6270.getClass(), "modCount", 0);
        setIntField(term6270, term6270.getClass(), "size", 1);
        setField(term6270, term6270.getClass(), "root", term6380);
        term14478 = newInstance(Class.forName("org.apache.commons.collections.list.TreeList"));
        setField(term14478, term14478.getClass(), "root", null);
        setIntField(term14478, term14478.getClass(), "size", 0);
        setIntField(term14478, term14478.getClass(), "modCount", 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.list.TreeList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        Object retValue = callMethod(klass, "remove", argTypes, term6270, args);
        assertTrue(recursiveEquals(term6270, term14478));
        assertTrue(recursiveEquals(retValue, null));
    }

};


