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

public class ListOrderedSet_removeAll_132812146383 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11696;
     Object term12040;
     Object term12043;

    public ListOrderedSet_removeAll_132812146383() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term11722 = new ArrayList();
        term11696 = newInstance(Class.forName("org.apache.commons.collections.set.ListOrderedSet"));
        setField(term11696, term11696.getClass(), "setOrder", term11722);
        ArrayList term12041 = new ArrayList();
        term12040 = newInstance(Class.forName("org.apache.commons.collections.set.ListOrderedSet"));
        setField(term12040, term12040.getClass(), "setOrder", term12041);
        setField(term12040, term12040.getClass(), "collection", null);
        ArrayList term12044 = new ArrayList();
        term12043 = newInstance(Class.forName("org.apache.commons.collections.set.ListOrderedSet"));
        setField(term12043, term12043.getClass(), "setOrder", term12044);
        setField(term12043, term12043.getClass(), "collection", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.set.ListOrderedSet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = term11696;
        Object retValue = callMethod(klass, "removeAll", argTypes, term11696, args);
        assertTrue(recursiveEquals(term11696, term12040));
        assertTrue(recursiveEquals(term11696, term12043));
        assertTrue(recursiveEquals(retValue, false));
    }

};


