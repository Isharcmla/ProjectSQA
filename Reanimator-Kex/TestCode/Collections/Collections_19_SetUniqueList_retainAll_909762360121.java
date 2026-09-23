package org.apache.commons.collections.list;

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
import static org.apache.commons.collections.list.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.collections.list.EqualityUtils.*;
import java.util.HashSet;
import java.util.ArrayList;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;

public class SetUniqueList_retainAll_909762360121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29308;
     Object term29408;
     Object term29497;
     Object term29500;

    public SetUniqueList_retainAll_909762360121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashSet term29356 = new HashSet();
        term29308 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        setField(term29308, term29308.getClass(), "set", term29356);
        ArrayList term29460 = new ArrayList();
        term29408 = new ArrayList();
        ((ArrayList) term29408).add(term29460);
        ((ArrayList) term29408).add((Object)null);
        ((ArrayList) term29408).add((Object)null);
        ((ArrayList) term29408).add((Object)null);
        ((ArrayList) term29408).add((Object)null);
        ((ArrayList) term29408).add((Object)null);
        ((ArrayList) term29408).add((Object)null);
        ((ArrayList) term29408).add((Object)null);
        ((ArrayList) term29408).add((Object)null);
        HashMap term29499 = new HashMap();
        Set<Object> term29505 =  ((Map) term29499).keySet();
        HashSet term29498 = new HashSet((Collection<? extends Object>) term29505);
        term29497 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        setField(term29497, term29497.getClass(), "set", term29498);
        setField(term29497, term29497.getClass(), "collection", null);
        ArrayList term29502 = new ArrayList();
        term29500 = new ArrayList();
        ((ArrayList) term29500).add(term29502);
        ((ArrayList) term29500).add((Object)null);
        ((ArrayList) term29500).add((Object)null);
        ((ArrayList) term29500).add((Object)null);
        ((ArrayList) term29500).add((Object)null);
        ((ArrayList) term29500).add((Object)null);
        ((ArrayList) term29500).add((Object)null);
        ((ArrayList) term29500).add((Object)null);
        ((ArrayList) term29500).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.list.SetUniqueList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = term29408;
        Object retValue = callMethod(klass, "retainAll", argTypes, term29308, args);
        assertTrue(recursiveEquals(term29308, term29497));
        assertTrue(recursiveEquals(term29408, term29500));
        assertTrue(recursiveEquals(retValue, false));
    }

};


