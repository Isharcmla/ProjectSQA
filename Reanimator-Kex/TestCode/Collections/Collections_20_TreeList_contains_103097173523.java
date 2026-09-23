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

public class TreeList_contains_103097173523 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23;
     Object term775;

    public TreeList_contains_103097173523() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23 = newInstance(Class.forName("org.apache.commons.collections.list.TreeList"));
        setField(term23, term23.getClass(), "root", null);
        setIntField(term23, term23.getClass(), "size", 0);
        setIntField(term23, term23.getClass(), "modCount", 0);
        term775 = newInstance(Class.forName("org.apache.commons.collections.list.TreeList"));
        setField(term775, term775.getClass(), "root", null);
        setIntField(term775, term775.getClass(), "size", 0);
        setIntField(term775, term775.getClass(), "modCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.list.TreeList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "contains", argTypes, term23, args);
        assertTrue(recursiveEquals(term23, term775));
        assertTrue(recursiveEquals(retValue, false));
    }

};


