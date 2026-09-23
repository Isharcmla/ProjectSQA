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
import static org.apache.commons.collections.set.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.collections.set.EqualityUtils.*;
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;

public class ListOrderedSet_init_136611582627 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63;
     Object term69;
     Object term490;
     Object term494;
     Object term496;

    public ListOrderedSet_init_136611582627() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term64 = new HashMap();
        Set<Object> term497 =  ((Map) term64).keySet();
        term63 = new HashSet((Collection<? extends Object>) term497);
        term69 = new LinkedList();
        LinkedList term491 = new LinkedList();
        HashMap term493 = new HashMap();
        Set<Object> term498 =  ((Map) term493).keySet();
        HashSet term492 = new HashSet((Collection<? extends Object>) term498);
        term490 = newInstance(Class.forName("org.apache.commons.collections.set.ListOrderedSet"));
        setField(term490, term490.getClass(), "setOrder", term491);
        setField(term490, term490.getClass(), "collection", term492);
        HashMap term495 = new HashMap();
        Set<Object> term499 =  ((Map) term495).keySet();
        term494 = new HashSet((Collection<? extends Object>) term499);
        term496 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.set.ListOrderedSet");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Set");
        argTypes[1] = Class.forName("java.util.List");
        Object[] args = new Object[2];
        args[0] = term63;
        args[1] = term69;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term490));
        assertTrue(recursiveEquals(term63, term494));
        assertTrue(recursiveEquals(term69, term496));
    }

};


