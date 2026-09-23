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
import java.lang.IndexOutOfBoundsException;
import static org.apache.commons.collections4.map.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.util.HashMap;
import java.lang.Integer;

public class ListOrderedMap_get_26892709549 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5388;
     Object term5428;

    public ListOrderedMap_get_26892709549() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term5391 = newInstance(Class.forName("java.lang.Object"));
        Object term5392 = newInstance(Class.forName("java.lang.Object"));
        Object term5393 = newInstance(Class.forName("java.lang.Object"));
        Object term5394 = newInstance(Class.forName("java.lang.Object"));
        Object term5395 = newInstance(Class.forName("java.lang.Object"));
        Object term5396 = newInstance(Class.forName("java.lang.Object"));
        Object term5397 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term5389 = new ArrayList();
        ((ArrayList) term5389).add(term5391);
        ((ArrayList) term5389).add(term5392);
        ((ArrayList) term5389).add(term5393);
        ((ArrayList) term5389).add(term5394);
        ((ArrayList) term5389).add(term5395);
        ((ArrayList) term5389).add(term5396);
        ((ArrayList) term5389).add(term5397);
        HashMap term5400 = new HashMap();
        term5388 = newInstance(Class.forName("org.apache.commons.collections4.map.ListOrderedMap"));
        setField(term5388, term5388.getClass(), "insertOrder", term5389);
        setField(term5388, term5388.getClass(), "map", term5400);
        term5428 = new Integer(-2095575670);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.map.ListOrderedMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term5428;
        try {
            callMethod(klass, "get", argTypes, term5388, args);
            assertTrue(false);
        }
        catch (IndexOutOfBoundsException e) {
        }

    }

};


