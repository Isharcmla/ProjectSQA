package org.apache.commons.collections.set;

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
import static org.apache.commons.collections.set.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.collections.set.EqualityUtils.*;
import java.util.ArrayList;

public class ListOrderedSet_addAll_202463137089 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13003;
     Object term13107;
     Object term13455;
     Object term13456;

    public ListOrderedSet_addAll_202463137089() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13003 = newInstance(Class.forName("org.apache.commons.collections.set.ListOrderedSet"));
        ArrayList term13159 = new ArrayList();
        term13107 = newInstance(Class.forName("org.apache.commons.collections.set.ListOrderedSet"));
        setField(term13107, term13107.getClass(), "setOrder", term13159);
        term13455 = newInstance(Class.forName("org.apache.commons.collections.set.ListOrderedSet"));
        setField(term13455, term13455.getClass(), "setOrder", null);
        setField(term13455, term13455.getClass(), "collection", null);
        ArrayList term13457 = new ArrayList();
        term13456 = newInstance(Class.forName("org.apache.commons.collections.set.ListOrderedSet"));
        setField(term13456, term13456.getClass(), "setOrder", term13457);
        setField(term13456, term13456.getClass(), "collection", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.set.ListOrderedSet");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.util.Collection");
        Object[] args = new Object[2];
        args[0] = 0;
        args[1] = term13107;
        Object retValue = callMethod(klass, "addAll", argTypes, term13003, args);
        assertTrue(recursiveEquals(term13003, term13455));
        assertTrue(recursiveEquals(term13107, 0));
        assertTrue(recursiveEquals(retValue, false));
    }

};


