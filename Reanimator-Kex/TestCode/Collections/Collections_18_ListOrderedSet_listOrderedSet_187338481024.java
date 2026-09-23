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
import java.util.LinkedList;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class ListOrderedSet_listOrderedSet_187338481024 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51;
     Object term425;
     Object term399;

    public ListOrderedSet_listOrderedSet_187338481024() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term54 = newInstance(Class.forName("java.lang.Object"));
        term51 = new LinkedList();
        ((LinkedList) term51).add(term54);
        Object term427 = newInstance(Class.forName("java.lang.Object"));
        term425 = new LinkedList();
        ((LinkedList) term425).add(term427);
        Object term403 = newInstance(Class.forName("java.lang.Object"));
        LinkedList term400 = new LinkedList();
        ((LinkedList) term400).add(term403);
        HashMap term406 = new HashMap();
        Set<Object> term428 =  ((Map) term406).keySet();
        HashSet term405 = new HashSet((Collection<? extends Object>) term428);
        term399 = newInstance(Class.forName("org.apache.commons.collections.set.ListOrderedSet"));
        setField(term399, term399.getClass(), "setOrder", term400);
        setField(term399, term399.getClass(), "collection", term405);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.set.ListOrderedSet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term51;
        Object retValue = callMethod(klass, "listOrderedSet", argTypes, null, args);
        assertTrue(recursiveEquals(term51, term425));
        assertTrue(recursiveEquals(retValue, term399));
    }

};


