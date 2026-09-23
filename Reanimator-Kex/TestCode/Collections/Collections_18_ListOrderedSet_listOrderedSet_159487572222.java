package org.apache.commons.collections.set;

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
import java.lang.IllegalArgumentException;
import static org.apache.commons.collections.set.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;

public class ListOrderedSet_listOrderedSet_159487572222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term24;

    public ListOrderedSet_listOrderedSet_159487572222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2 = new HashMap();
        Set<Object> term377 =  ((Map) term2).keySet();
        term1 = new HashSet((Collection<? extends Object>) term377);
        Object term27 = newInstance(Class.forName("java.lang.Object"));
        Object term29 = newInstance(Class.forName("java.lang.Object"));
        Object term31 = newInstance(Class.forName("java.lang.Object"));
        term24 = new LinkedList();
        ((LinkedList) term24).add(term27);
        ((LinkedList) term24).add(term29);
        ((LinkedList) term24).add(term31);
        ((LinkedList) term24).add((Object)null);
        ((LinkedList) term24).add((Object)null);
        ((LinkedList) term24).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.set.ListOrderedSet");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Set");
        argTypes[1] = Class.forName("java.util.List");
        Object[] args = new Object[2];
        args[0] = term1;
        args[1] = term24;
        try {
            callMethod(klass, "listOrderedSet", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


