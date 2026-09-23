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

public class ListOrderedMap_put_178182238638 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5064;
     Object term5103;
     Object term5104;
     Object term11656;
     Object term11671;
     Object term11672;

    public ListOrderedMap_put_178182238638() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term5067 = newInstance(Class.forName("java.lang.Object"));
        Object term5068 = newInstance(Class.forName("java.lang.Object"));
        Object term5069 = newInstance(Class.forName("java.lang.Object"));
        Object term5070 = newInstance(Class.forName("java.lang.Object"));
        Object term5071 = newInstance(Class.forName("java.lang.Object"));
        Object term5072 = newInstance(Class.forName("java.lang.Object"));
        Object term5073 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term5065 = new ArrayList();
        ((ArrayList) term5065).add(term5067);
        ((ArrayList) term5065).add(term5068);
        ((ArrayList) term5065).add(term5069);
        ((ArrayList) term5065).add(term5070);
        ((ArrayList) term5065).add(term5071);
        ((ArrayList) term5065).add(term5072);
        ((ArrayList) term5065).add(term5073);
        HashMap term5076 = new HashMap();
        term5064 = newInstance(Class.forName("org.apache.commons.collections4.map.ListOrderedMap"));
        setField(term5064, term5064.getClass(), "insertOrder", term5065);
        setField(term5064, term5064.getClass(), "map", term5076);
        term5103 = newInstance(Class.forName("java.lang.Object"));
        term5104 = newInstance(Class.forName("java.lang.Object"));
        Object term11659 = newInstance(Class.forName("java.lang.Object"));
        Object term11660 = newInstance(Class.forName("java.lang.Object"));
        Object term11661 = newInstance(Class.forName("java.lang.Object"));
        Object term11662 = newInstance(Class.forName("java.lang.Object"));
        Object term11663 = newInstance(Class.forName("java.lang.Object"));
        Object term11664 = newInstance(Class.forName("java.lang.Object"));
        Object term11665 = newInstance(Class.forName("java.lang.Object"));
        Object term11666 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term11657 = new ArrayList();
        ((ArrayList) term11657).add(term11659);
        ((ArrayList) term11657).add(term11660);
        ((ArrayList) term11657).add(term11661);
        ((ArrayList) term11657).add(term11662);
        ((ArrayList) term11657).add(term11663);
        ((ArrayList) term11657).add(term11664);
        ((ArrayList) term11657).add(term11665);
        ((ArrayList) term11657).add(term11666);
        HashMap term11667 = new HashMap();
        term11656 = newInstance(Class.forName("org.apache.commons.collections4.map.ListOrderedMap"));
        setField(term11656, term11656.getClass(), "insertOrder", term11657);
        setField(term11656, term11656.getClass(), "map", term11667);
        term11671 = newInstance(Class.forName("java.lang.Object"));
        term11672 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.map.ListOrderedMap");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term5103;
        args[1] = term5104;
        Object retValue = callMethod(klass, "put", argTypes, term5064, args);
        assertTrue(recursiveEquals(term5064, term11656));
        assertTrue(recursiveEquals(term5103, term11671));
        assertTrue(recursiveEquals(term5104, term11672));
        assertTrue(recursiveEquals(retValue, null));
    }

};


