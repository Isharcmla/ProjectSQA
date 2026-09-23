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

public class ListOrderedMap_remove_27228609441 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5165;
     Object term5209;
     Object term11747;
     Object term11759;

    public ListOrderedMap_remove_27228609441() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term5168 = newInstance(Class.forName("java.lang.Object"));
        Object term5169 = newInstance(Class.forName("java.lang.Object"));
        Object term5170 = newInstance(Class.forName("java.lang.Object"));
        Object term5171 = newInstance(Class.forName("java.lang.Object"));
        Object term5172 = newInstance(Class.forName("java.lang.Object"));
        Object term5173 = newInstance(Class.forName("java.lang.Object"));
        Object term5174 = newInstance(Class.forName("java.lang.Object"));
        Object term5175 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term5166 = new ArrayList();
        ((ArrayList) term5166).add(term5168);
        ((ArrayList) term5166).add(term5169);
        ((ArrayList) term5166).add(term5170);
        ((ArrayList) term5166).add(term5171);
        ((ArrayList) term5166).add(term5172);
        ((ArrayList) term5166).add(term5173);
        ((ArrayList) term5166).add(term5174);
        ((ArrayList) term5166).add(term5175);
        HashMap term5178 = new HashMap();
        term5165 = newInstance(Class.forName("org.apache.commons.collections4.map.ListOrderedMap"));
        setField(term5165, term5165.getClass(), "insertOrder", term5166);
        setField(term5165, term5165.getClass(), "map", term5178);
        term5209 = newInstance(Class.forName("java.lang.Object"));
        Object term11750 = newInstance(Class.forName("java.lang.Object"));
        Object term11751 = newInstance(Class.forName("java.lang.Object"));
        Object term11752 = newInstance(Class.forName("java.lang.Object"));
        Object term11753 = newInstance(Class.forName("java.lang.Object"));
        Object term11754 = newInstance(Class.forName("java.lang.Object"));
        Object term11755 = newInstance(Class.forName("java.lang.Object"));
        Object term11756 = newInstance(Class.forName("java.lang.Object"));
        Object term11757 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term11748 = new ArrayList();
        ((ArrayList) term11748).add(term11750);
        ((ArrayList) term11748).add(term11751);
        ((ArrayList) term11748).add(term11752);
        ((ArrayList) term11748).add(term11753);
        ((ArrayList) term11748).add(term11754);
        ((ArrayList) term11748).add(term11755);
        ((ArrayList) term11748).add(term11756);
        ((ArrayList) term11748).add(term11757);
        HashMap term11758 = new HashMap();
        term11747 = newInstance(Class.forName("org.apache.commons.collections4.map.ListOrderedMap"));
        setField(term11747, term11747.getClass(), "insertOrder", term11748);
        setField(term11747, term11747.getClass(), "map", term11758);
        term11759 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.map.ListOrderedMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term5209;
        Object retValue = callMethod(klass, "remove", argTypes, term5165, args);
        assertTrue(recursiveEquals(term5165, term11747));
        assertTrue(recursiveEquals(term5209, term11759));
        assertTrue(recursiveEquals(retValue, null));
    }

};


