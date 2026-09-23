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

public class ListOrderedMap_setValue_84910026152 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5469;
     Object term5493;
     Object term5495;

    public ListOrderedMap_setValue_84910026152() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term5472 = newInstance(Class.forName("java.lang.Object"));
        Object term5473 = newInstance(Class.forName("java.lang.Object"));
        Object term5474 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term5470 = new ArrayList();
        ((ArrayList) term5470).add(term5472);
        ((ArrayList) term5470).add(term5473);
        ((ArrayList) term5470).add(term5474);
        HashMap term5477 = new HashMap();
        term5469 = newInstance(Class.forName("org.apache.commons.collections4.map.ListOrderedMap"));
        setField(term5469, term5469.getClass(), "insertOrder", term5470);
        setField(term5469, term5469.getClass(), "map", term5477);
        term5493 = new Integer(1324040357);
        term5495 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.map.ListOrderedMap");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term5493;
        args[1] = term5495;
        try {
            callMethod(klass, "setValue", argTypes, term5469, args);
            assertTrue(false);
        }
        catch (IndexOutOfBoundsException e) {
        }

    }

};


