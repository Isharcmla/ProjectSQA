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

public class ListOrderedMap_clear_104938149142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5210;
     Object term11775;

    public ListOrderedMap_clear_104938149142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term5213 = newInstance(Class.forName("java.lang.Object"));
        Object term5214 = newInstance(Class.forName("java.lang.Object"));
        Object term5215 = newInstance(Class.forName("java.lang.Object"));
        Object term5216 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term5211 = new ArrayList();
        ((ArrayList) term5211).add(term5213);
        ((ArrayList) term5211).add(term5214);
        ((ArrayList) term5211).add(term5215);
        ((ArrayList) term5211).add(term5216);
        HashMap term5219 = new HashMap();
        term5210 = newInstance(Class.forName("org.apache.commons.collections4.map.ListOrderedMap"));
        setField(term5210, term5210.getClass(), "insertOrder", term5211);
        setField(term5210, term5210.getClass(), "map", term5219);
        ArrayList term11776 = new ArrayList();
        HashMap term11778 = new HashMap();
        term11775 = newInstance(Class.forName("org.apache.commons.collections4.map.ListOrderedMap"));
        setField(term11775, term11775.getClass(), "insertOrder", term11776);
        setField(term11775, term11775.getClass(), "map", term11778);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.map.ListOrderedMap");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "clear", argTypes, term5210, args);
        assertTrue(recursiveEquals(term5210, term11775));
    }

};


