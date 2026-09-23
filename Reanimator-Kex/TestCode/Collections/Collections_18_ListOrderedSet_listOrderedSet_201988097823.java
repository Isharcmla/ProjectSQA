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
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.ArrayList;

public class ListOrderedSet_listOrderedSet_201988097823 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39;
     Object term391;
     Object term379;

    public ListOrderedSet_listOrderedSet_201988097823() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term40 = new HashMap();
        Set<Object> term394 =  ((Map) term40).keySet();
        term39 = new HashSet((Collection<? extends Object>) term394);
        HashMap term392 = new HashMap();
        Set<Object> term395 =  ((Map) term392).keySet();
        term391 = new HashSet((Collection<? extends Object>) term395);
        ArrayList term380 = new ArrayList();
        HashMap term385 = new HashMap();
        Set<Object> term396 =  ((Map) term385).keySet();
        HashSet term384 = new HashSet((Collection<? extends Object>) term396);
        term379 = newInstance(Class.forName("org.apache.commons.collections.set.ListOrderedSet"));
        setField(term379, term379.getClass(), "setOrder", term380);
        setField(term379, term379.getClass(), "collection", term384);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.set.ListOrderedSet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Set");
        Object[] args = new Object[1];
        args[0] = term39;
        Object retValue = callMethod(klass, "listOrderedSet", argTypes, null, args);
        assertTrue(recursiveEquals(term39, term391));
        assertTrue(recursiveEquals(retValue, term379));
    }

};


