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
import java.util.LinkedList;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class SetUniqueList_init_203738945020 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13;
     Object term27;
     Object term252;
     Object term264;
     Object term273;

    public SetUniqueList_init_203738945020() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term16 = newInstance(Class.forName("java.lang.Object"));
        Object term18 = newInstance(Class.forName("java.lang.Object"));
        Object term20 = newInstance(Class.forName("java.lang.Object"));
        term13 = new LinkedList();
        ((LinkedList) term13).add(term16);
        ((LinkedList) term13).add(term18);
        ((LinkedList) term13).add(term20);
        ((LinkedList) term13).add((Object)null);
        ((LinkedList) term13).add((Object)null);
        ((LinkedList) term13).add((Object)null);
        HashMap term28 = new HashMap();
        Set<Object> term275 =  ((Map) term28).keySet();
        term27 = new HashSet((Collection<? extends Object>) term275);
        HashMap term254 = new HashMap();
        Set<Object> term276 =  ((Map) term254).keySet();
        HashSet term253 = new HashSet((Collection<? extends Object>) term276);
        Object term257 = newInstance(Class.forName("java.lang.Object"));
        Object term259 = newInstance(Class.forName("java.lang.Object"));
        LinkedList term255 = new LinkedList();
        ((LinkedList) term255).add(term257);
        ((LinkedList) term255).add(term259);
        ((LinkedList) term255).add((Object)null);
        ((LinkedList) term255).add((Object)null);
        ((LinkedList) term255).add((Object)null);
        ((LinkedList) term255).add((Object)null);
        term252 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        setField(term252, term252.getClass(), "set", term253);
        setField(term252, term252.getClass(), "collection", term255);
        Object term266 = newInstance(Class.forName("java.lang.Object"));
        Object term268 = newInstance(Class.forName("java.lang.Object"));
        term264 = new LinkedList();
        ((LinkedList) term264).add(term266);
        ((LinkedList) term264).add(term268);
        ((LinkedList) term264).add((Object)null);
        ((LinkedList) term264).add((Object)null);
        ((LinkedList) term264).add((Object)null);
        ((LinkedList) term264).add((Object)null);
        HashMap term274 = new HashMap();
        Set<Object> term277 =  ((Map) term274).keySet();
        term273 = new HashSet((Collection<? extends Object>) term277);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.list.SetUniqueList");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.List");
        argTypes[1] = Class.forName("java.util.Set");
        Object[] args = new Object[2];
        args[0] = term13;
        args[1] = term27;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term252));
        assertTrue(recursiveEquals(term13, term264));
        assertTrue(recursiveEquals(term27, term273));
    }

};


