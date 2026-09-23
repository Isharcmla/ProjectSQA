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

public class ListOrderedMap_values_202076914045 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5304;
     Object term11862;
     Object term11849;

    public ListOrderedMap_values_202076914045() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term5307 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term5305 = new ArrayList();
        ((ArrayList) term5305).add(term5307);
        HashMap term5310 = new HashMap();
        term5304 = newInstance(Class.forName("org.apache.commons.collections4.map.ListOrderedMap"));
        setField(term5304, term5304.getClass(), "insertOrder", term5305);
        setField(term5304, term5304.getClass(), "map", term5310);
        Object term11881 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term11863 = new ArrayList();
        ((ArrayList) term11863).add(term11881);
        HashMap term11882 = new HashMap();
        term11862 = newInstance(Class.forName("org.apache.commons.collections4.map.ListOrderedMap"));
        setField(term11862, term11862.getClass(), "insertOrder", term11863);
        setField(term11862, term11862.getClass(), "map", term11882);
        Object term11853 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term11851 = new ArrayList();
        ((ArrayList) term11851).add(term11853);
        HashMap term11856 = new HashMap();
        term11849 = newInstance(Class.forName("org.apache.commons.collections4.map.ListOrderedMap$ValuesView"));
        Object term11850 = newInstance(Class.forName("org.apache.commons.collections4.map.ListOrderedMap"));
        setField(term11850, term11850.getClass(), "insertOrder", term11851);
        setField(term11850, term11850.getClass(), "map", term11856);
        setField(term11849, term11849.getClass(), "parent", term11850);
        setIntField(term11849, term11849.getClass(), "modCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.map.ListOrderedMap");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "values", argTypes, term5304, args);
        assertTrue(recursiveEquals(term5304, term11862));
        assertTrue(recursiveEquals(retValue, term11849));
    }

};


