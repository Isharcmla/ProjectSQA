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

public class ListOrderedMap_keyList_5662112744 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5280;
     Object term11842;
     Object term11828;

    public ListOrderedMap_keyList_5662112744() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term5283 = newInstance(Class.forName("java.lang.Object"));
        Object term5284 = newInstance(Class.forName("java.lang.Object"));
        Object term5285 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term5281 = new ArrayList();
        ((ArrayList) term5281).add(term5283);
        ((ArrayList) term5281).add(term5284);
        ((ArrayList) term5281).add(term5285);
        HashMap term5288 = new HashMap();
        term5280 = newInstance(Class.forName("org.apache.commons.collections4.map.ListOrderedMap"));
        setField(term5280, term5280.getClass(), "insertOrder", term5281);
        setField(term5280, term5280.getClass(), "map", term5288);
        Object term11845 = newInstance(Class.forName("java.lang.Object"));
        Object term11846 = newInstance(Class.forName("java.lang.Object"));
        Object term11847 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term11843 = new ArrayList();
        ((ArrayList) term11843).add(term11845);
        ((ArrayList) term11843).add(term11846);
        ((ArrayList) term11843).add(term11847);
        HashMap term11848 = new HashMap();
        term11842 = newInstance(Class.forName("org.apache.commons.collections4.map.ListOrderedMap"));
        setField(term11842, term11842.getClass(), "insertOrder", term11843);
        setField(term11842, term11842.getClass(), "map", term11848);
        Object term11831 = newInstance(Class.forName("java.lang.Object"));
        Object term11832 = newInstance(Class.forName("java.lang.Object"));
        Object term11833 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term11829 = new ArrayList();
        ((ArrayList) term11829).add(term11831);
        ((ArrayList) term11829).add(term11832);
        ((ArrayList) term11829).add(term11833);
        term11828 = newInstance(Class.forName("org.apache.commons.collections4.list.UnmodifiableList"));
        setField(term11828, term11828.getClass(), "collection", term11829);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.map.ListOrderedMap");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "keyList", argTypes, term5280, args);
        assertTrue(recursiveEquals(term5280, term11842));
        assertTrue(recursiveEquals(retValue, term11828));
    }

};


