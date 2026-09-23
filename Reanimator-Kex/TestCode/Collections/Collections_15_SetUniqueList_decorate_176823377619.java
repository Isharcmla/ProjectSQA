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

public class SetUniqueList_decorate_176823377619 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term220;
     Object term206;

    public SetUniqueList_decorate_176823377619() {
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
        Object term222 = newInstance(Class.forName("java.lang.Object"));
        Object term224 = newInstance(Class.forName("java.lang.Object"));
        term220 = new LinkedList();
        ((LinkedList) term220).add(term222);
        ((LinkedList) term220).add(term224);
        ((LinkedList) term220).add((Object)null);
        ((LinkedList) term220).add((Object)null);
        HashMap term208 = new HashMap();
        Set<Object> term227 =  ((Map) term208).keySet();
        HashSet term207 = new HashSet((Collection<? extends Object>) term227);
        Object term99 = newInstance(Class.forName("java.lang.Object"));
        Object term101 = newInstance(Class.forName("java.lang.Object"));
        LinkedList term96 = new LinkedList();
        ((LinkedList) term96).add(term99);
        ((LinkedList) term96).add(term101);
        ((LinkedList) term96).add((Object)null);
        ((LinkedList) term96).add((Object)null);
        term206 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        setField(term206, term206.getClass(), "set", term207);
        setField(term206, term206.getClass(), "collection", term96);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.list.SetUniqueList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term1;
        Object retValue = callMethod(klass, "decorate", argTypes, null, args);
        assertTrue(recursiveEquals(term1, term220));
        assertTrue(recursiveEquals(retValue, term206));
    }

};


