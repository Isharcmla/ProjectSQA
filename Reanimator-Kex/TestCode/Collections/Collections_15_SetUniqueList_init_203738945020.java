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
     Object term248;
     Object term260;
     Object term269;

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
        Set<Object> term271 =  ((Map) term28).keySet();
        term27 = new HashSet((Collection<? extends Object>) term271);
        HashMap term250 = new HashMap();
        Set<Object> term272 =  ((Map) term250).keySet();
        HashSet term249 = new HashSet((Collection<? extends Object>) term272);
        Object term253 = newInstance(Class.forName("java.lang.Object"));
        Object term255 = newInstance(Class.forName("java.lang.Object"));
        LinkedList term251 = new LinkedList();
        ((LinkedList) term251).add(term253);
        ((LinkedList) term251).add(term255);
        ((LinkedList) term251).add((Object)null);
        ((LinkedList) term251).add((Object)null);
        ((LinkedList) term251).add((Object)null);
        ((LinkedList) term251).add((Object)null);
        term248 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        setField(term248, term248.getClass(), "set", term249);
        setField(term248, term248.getClass(), "collection", term251);
        Object term262 = newInstance(Class.forName("java.lang.Object"));
        Object term264 = newInstance(Class.forName("java.lang.Object"));
        term260 = new LinkedList();
        ((LinkedList) term260).add(term262);
        ((LinkedList) term260).add(term264);
        ((LinkedList) term260).add((Object)null);
        ((LinkedList) term260).add((Object)null);
        ((LinkedList) term260).add((Object)null);
        ((LinkedList) term260).add((Object)null);
        HashMap term270 = new HashMap();
        Set<Object> term273 =  ((Map) term270).keySet();
        term269 = new HashSet((Collection<? extends Object>) term273);
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
        assertTrue(recursiveEquals(instance, term248));
        assertTrue(recursiveEquals(term13, term260));
        assertTrue(recursiveEquals(term27, term269));
    }

};


