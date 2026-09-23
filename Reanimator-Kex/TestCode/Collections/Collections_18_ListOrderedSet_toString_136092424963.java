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

public class ListOrderedSet_toString_136092424963 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7603;
     Object term7964;

    public ListOrderedSet_toString_136092424963() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term7655 = new ArrayList();
        term7603 = newInstance(Class.forName("org.apache.commons.collections.set.ListOrderedSet"));
        setField(term7603, term7603.getClass(), "setOrder", term7655);
        ArrayList term7965 = new ArrayList();
        term7964 = newInstance(Class.forName("org.apache.commons.collections.set.ListOrderedSet"));
        setField(term7964, term7964.getClass(), "setOrder", term7965);
        setField(term7964, term7964.getClass(), "collection", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.set.ListOrderedSet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term7603, args);
        assertTrue(recursiveEquals(term7603, term7964));
        assertTrue(recursiveEquals(retValue, "[]"));
    }

};


