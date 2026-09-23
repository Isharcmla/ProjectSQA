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

public class ListOrderedMap_asList_76935881055 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5550;
     Object term13527;
     Object term13526;

    public ListOrderedMap_asList_76935881055() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term5553 = newInstance(Class.forName("java.lang.Object"));
        Object term5554 = newInstance(Class.forName("java.lang.Object"));
        Object term5555 = newInstance(Class.forName("java.lang.Object"));
        Object term5556 = newInstance(Class.forName("java.lang.Object"));
        Object term5557 = newInstance(Class.forName("java.lang.Object"));
        Object term5558 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term5551 = new ArrayList();
        ((ArrayList) term5551).add(term5553);
        ((ArrayList) term5551).add(term5554);
        ((ArrayList) term5551).add(term5555);
        ((ArrayList) term5551).add(term5556);
        ((ArrayList) term5551).add(term5557);
        ((ArrayList) term5551).add(term5558);
        HashMap term5561 = new HashMap();
        term5550 = newInstance(Class.forName("org.apache.commons.collections4.map.ListOrderedMap"));
        setField(term5550, term5550.getClass(), "insertOrder", term5551);
        setField(term5550, term5550.getClass(), "map", term5561);
        Object term13530 = newInstance(Class.forName("java.lang.Object"));
        Object term13531 = newInstance(Class.forName("java.lang.Object"));
        Object term13532 = newInstance(Class.forName("java.lang.Object"));
        Object term13533 = newInstance(Class.forName("java.lang.Object"));
        Object term13534 = newInstance(Class.forName("java.lang.Object"));
        Object term13535 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term13528 = new ArrayList();
        ((ArrayList) term13528).add(term13530);
        ((ArrayList) term13528).add(term13531);
        ((ArrayList) term13528).add(term13532);
        ((ArrayList) term13528).add(term13533);
        ((ArrayList) term13528).add(term13534);
        ((ArrayList) term13528).add(term13535);
        HashMap term13536 = new HashMap();
        term13527 = newInstance(Class.forName("org.apache.commons.collections4.map.ListOrderedMap"));
        setField(term13527, term13527.getClass(), "insertOrder", term13528);
        setField(term13527, term13527.getClass(), "map", term13536);
        Object term13513 = newInstance(Class.forName("java.lang.Object"));
        Object term13514 = newInstance(Class.forName("java.lang.Object"));
        Object term13515 = newInstance(Class.forName("java.lang.Object"));
        Object term13516 = newInstance(Class.forName("java.lang.Object"));
        Object term13517 = newInstance(Class.forName("java.lang.Object"));
        Object term13518 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term13511 = new ArrayList();
        ((ArrayList) term13511).add(term13513);
        ((ArrayList) term13511).add(term13514);
        ((ArrayList) term13511).add(term13515);
        ((ArrayList) term13511).add(term13516);
        ((ArrayList) term13511).add(term13517);
        ((ArrayList) term13511).add(term13518);
        term13526 = newInstance(Class.forName("org.apache.commons.collections4.list.UnmodifiableList"));
        setField(term13526, term13526.getClass(), "collection", term13511);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.map.ListOrderedMap");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "asList", argTypes, term5550, args);
        assertTrue(recursiveEquals(term5550, term13527));
        assertTrue(recursiveEquals(retValue, term13526));
    }

};


