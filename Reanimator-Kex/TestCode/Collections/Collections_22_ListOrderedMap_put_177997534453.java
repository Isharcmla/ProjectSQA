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

public class ListOrderedMap_put_177997534453 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5496;
     Object term5524;
     Object term5526;
     Object term5527;

    public ListOrderedMap_put_177997534453() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term5499 = newInstance(Class.forName("java.lang.Object"));
        Object term5500 = newInstance(Class.forName("java.lang.Object"));
        Object term5501 = newInstance(Class.forName("java.lang.Object"));
        Object term5502 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term5497 = new ArrayList();
        ((ArrayList) term5497).add(term5499);
        ((ArrayList) term5497).add(term5500);
        ((ArrayList) term5497).add(term5501);
        ((ArrayList) term5497).add(term5502);
        HashMap term5505 = new HashMap();
        term5496 = newInstance(Class.forName("org.apache.commons.collections4.map.ListOrderedMap"));
        setField(term5496, term5496.getClass(), "insertOrder", term5497);
        setField(term5496, term5496.getClass(), "map", term5505);
        term5524 = new Integer(-1588772968);
        term5526 = newInstance(Class.forName("java.lang.Object"));
        term5527 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.map.ListOrderedMap");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.lang.Object");
        argTypes[2] = Class.forName("java.lang.Object");
        Object[] args = new Object[3];
        args[0] = term5524;
        args[1] = term5526;
        args[2] = term5527;
        try {
            callMethod(klass, "put", argTypes, term5496, args);
            assertTrue(false);
        }
        catch (IndexOutOfBoundsException e) {
        }

    }

};


