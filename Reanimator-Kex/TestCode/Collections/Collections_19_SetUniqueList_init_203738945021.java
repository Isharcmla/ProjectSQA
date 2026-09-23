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

public class SetUniqueList_init_203738945021 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13;
     Object term27;
     Object term202;
     Object term214;
     Object term223;

    public SetUniqueList_init_203738945021() {
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
        Set<Object> term225 =  ((Map) term28).keySet();
        term27 = new HashSet((Collection<? extends Object>) term225);
        HashMap term204 = new HashMap();
        Set<Object> term226 =  ((Map) term204).keySet();
        HashSet term203 = new HashSet((Collection<? extends Object>) term226);
        Object term207 = newInstance(Class.forName("java.lang.Object"));
        Object term209 = newInstance(Class.forName("java.lang.Object"));
        LinkedList term205 = new LinkedList();
        ((LinkedList) term205).add(term207);
        ((LinkedList) term205).add(term209);
        ((LinkedList) term205).add((Object)null);
        ((LinkedList) term205).add((Object)null);
        ((LinkedList) term205).add((Object)null);
        ((LinkedList) term205).add((Object)null);
        term202 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        setField(term202, term202.getClass(), "set", term203);
        setField(term202, term202.getClass(), "collection", term205);
        Object term216 = newInstance(Class.forName("java.lang.Object"));
        Object term218 = newInstance(Class.forName("java.lang.Object"));
        term214 = new LinkedList();
        ((LinkedList) term214).add(term216);
        ((LinkedList) term214).add(term218);
        ((LinkedList) term214).add((Object)null);
        ((LinkedList) term214).add((Object)null);
        ((LinkedList) term214).add((Object)null);
        ((LinkedList) term214).add((Object)null);
        HashMap term224 = new HashMap();
        Set<Object> term227 =  ((Map) term224).keySet();
        term223 = new HashSet((Collection<? extends Object>) term227);
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
        assertTrue(recursiveEquals(instance, term202));
        assertTrue(recursiveEquals(term13, term214));
        assertTrue(recursiveEquals(term27, term223));
    }

};


