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

public class SetUniqueList_setUniqueList_87514450020 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term174;
     Object term158;

    public SetUniqueList_setUniqueList_87514450020() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term4 = newInstance(Class.forName("java.lang.Object"));
        Object term6 = newInstance(Class.forName("java.lang.Object"));
        Object term8 = newInstance(Class.forName("java.lang.Object"));
        term1 = new LinkedList();
        ((LinkedList) term1).add(term4);
        ((LinkedList) term1).add(term6);
        ((LinkedList) term1).add(term8);
        ((LinkedList) term1).add((Object)null);
        ((LinkedList) term1).add((Object)null);
        Object term176 = newInstance(Class.forName("java.lang.Object"));
        Object term178 = newInstance(Class.forName("java.lang.Object"));
        term174 = new LinkedList();
        ((LinkedList) term174).add(term176);
        ((LinkedList) term174).add(term178);
        ((LinkedList) term174).add((Object)null);
        ((LinkedList) term174).add((Object)null);
        HashMap term160 = new HashMap();
        Set<Object> term181 =  ((Map) term160).keySet();
        HashSet term159 = new HashSet((Collection<? extends Object>) term181);
        Object term102 = newInstance(Class.forName("java.lang.Object"));
        Object term104 = newInstance(Class.forName("java.lang.Object"));
        LinkedList term99 = new LinkedList();
        ((LinkedList) term99).add(term102);
        ((LinkedList) term99).add(term104);
        ((LinkedList) term99).add((Object)null);
        ((LinkedList) term99).add((Object)null);
        term158 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        setField(term158, term158.getClass(), "set", term159);
        setField(term158, term158.getClass(), "collection", term99);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.list.SetUniqueList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term1;
        Object retValue = callMethod(klass, "setUniqueList", argTypes, null, args);
        assertTrue(recursiveEquals(term1, term174));
        assertTrue(recursiveEquals(retValue, term158));
    }

};


