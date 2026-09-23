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

public class ListOrderedSet_indexOf_93128905661 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7272;
     Object term7662;

    public ListOrderedSet_indexOf_93128905661() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term7324 = new ArrayList();
        term7272 = newInstance(Class.forName("org.apache.commons.collections.set.ListOrderedSet"));
        setField(term7272, term7272.getClass(), "setOrder", term7324);
        ArrayList term7663 = new ArrayList();
        term7662 = newInstance(Class.forName("org.apache.commons.collections.set.ListOrderedSet"));
        setField(term7662, term7662.getClass(), "setOrder", term7663);
        setField(term7662, term7662.getClass(), "collection", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.set.ListOrderedSet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "indexOf", argTypes, term7272, args);
        assertTrue(recursiveEquals(term7272, term7662));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


