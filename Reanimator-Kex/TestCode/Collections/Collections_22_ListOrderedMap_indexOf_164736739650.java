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

public class ListOrderedMap_indexOf_164736739650 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5448;
     Object term5468;
     Object term12569;
     Object term12575;

    public ListOrderedMap_indexOf_164736739650() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term5451 = newInstance(Class.forName("java.lang.Object"));
        Object term5452 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term5449 = new ArrayList();
        ((ArrayList) term5449).add(term5451);
        ((ArrayList) term5449).add(term5452);
        HashMap term5455 = new HashMap();
        term5448 = newInstance(Class.forName("org.apache.commons.collections4.map.ListOrderedMap"));
        setField(term5448, term5448.getClass(), "insertOrder", term5449);
        setField(term5448, term5448.getClass(), "map", term5455);
        term5468 = newInstance(Class.forName("java.lang.Object"));
        Object term12572 = newInstance(Class.forName("java.lang.Object"));
        Object term12573 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term12570 = new ArrayList();
        ((ArrayList) term12570).add(term12572);
        ((ArrayList) term12570).add(term12573);
        HashMap term12574 = new HashMap();
        term12569 = newInstance(Class.forName("org.apache.commons.collections4.map.ListOrderedMap"));
        setField(term12569, term12569.getClass(), "insertOrder", term12570);
        setField(term12569, term12569.getClass(), "map", term12574);
        term12575 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.map.ListOrderedMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term5468;
        Object retValue = callMethod(klass, "indexOf", argTypes, term5448, args);
        assertTrue(recursiveEquals(term5448, term12569));
        assertTrue(recursiveEquals(term5468, term12575));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


