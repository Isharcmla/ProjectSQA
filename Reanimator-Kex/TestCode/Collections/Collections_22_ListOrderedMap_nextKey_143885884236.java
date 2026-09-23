package org.apache.commons.collections4.map;

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
import static org.apache.commons.collections4.map.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.collections4.map.EqualityUtils.*;
import java.util.ArrayList;
import java.lang.Object;
import java.util.HashMap;

public class ListOrderedMap_nextKey_143885884236 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5027;
     Object term5051;
     Object term11598;
     Object term11605;

    public ListOrderedMap_nextKey_143885884236() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term5030 = newInstance(Class.forName("java.lang.Object"));
        Object term5031 = newInstance(Class.forName("java.lang.Object"));
        Object term5032 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term5028 = new ArrayList();
        ((ArrayList) term5028).add(term5030);
        ((ArrayList) term5028).add(term5031);
        ((ArrayList) term5028).add(term5032);
        HashMap term5035 = new HashMap();
        term5027 = newInstance(Class.forName("org.apache.commons.collections4.map.ListOrderedMap"));
        setField(term5027, term5027.getClass(), "insertOrder", term5028);
        setField(term5027, term5027.getClass(), "map", term5035);
        term5051 = newInstance(Class.forName("java.lang.Object"));
        Object term11601 = newInstance(Class.forName("java.lang.Object"));
        Object term11602 = newInstance(Class.forName("java.lang.Object"));
        Object term11603 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term11599 = new ArrayList();
        ((ArrayList) term11599).add(term11601);
        ((ArrayList) term11599).add(term11602);
        ((ArrayList) term11599).add(term11603);
        HashMap term11604 = new HashMap();
        term11598 = newInstance(Class.forName("org.apache.commons.collections4.map.ListOrderedMap"));
        setField(term11598, term11598.getClass(), "insertOrder", term11599);
        setField(term11598, term11598.getClass(), "map", term11604);
        term11605 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.map.ListOrderedMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term5051;
        Object retValue = callMethod(klass, "nextKey", argTypes, term5027, args);
        assertTrue(recursiveEquals(term5027, term11598));
        assertTrue(recursiveEquals(term5051, term11605));
        assertTrue(recursiveEquals(retValue, null));
    }

};


