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
     Object term262;
     Object term274;
     Object term283;

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
        Set<Object> term285 =  ((Map) term28).keySet();
        term27 = new HashSet((Collection<? extends Object>) term285);
        HashMap term264 = new HashMap();
        Set<Object> term286 =  ((Map) term264).keySet();
        HashSet term263 = new HashSet((Collection<? extends Object>) term286);
        Object term267 = newInstance(Class.forName("java.lang.Object"));
        Object term269 = newInstance(Class.forName("java.lang.Object"));
        LinkedList term265 = new LinkedList();
        ((LinkedList) term265).add(term267);
        ((LinkedList) term265).add(term269);
        ((LinkedList) term265).add((Object)null);
        ((LinkedList) term265).add((Object)null);
        ((LinkedList) term265).add((Object)null);
        ((LinkedList) term265).add((Object)null);
        term262 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        setField(term262, term262.getClass(), "set", term263);
        setField(term262, term262.getClass(), "collection", term265);
        Object term276 = newInstance(Class.forName("java.lang.Object"));
        Object term278 = newInstance(Class.forName("java.lang.Object"));
        term274 = new LinkedList();
        ((LinkedList) term274).add(term276);
        ((LinkedList) term274).add(term278);
        ((LinkedList) term274).add((Object)null);
        ((LinkedList) term274).add((Object)null);
        ((LinkedList) term274).add((Object)null);
        ((LinkedList) term274).add((Object)null);
        HashMap term284 = new HashMap();
        Set<Object> term287 =  ((Map) term284).keySet();
        term283 = new HashSet((Collection<? extends Object>) term287);
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
        assertTrue(recursiveEquals(instance, term262));
        assertTrue(recursiveEquals(term13, term274));
        assertTrue(recursiveEquals(term27, term283));
    }

};


