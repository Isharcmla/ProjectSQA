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

public class SetUniqueList_retainAll_909762360135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34295;
     Object term34595;
     Object term39198;
     Object term39203;

    public SetUniqueList_retainAll_909762360135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashSet term34671 = new HashSet();
        HashSet term34343 = new HashSet();
        ((HashSet) term34343).add(term34671);
        term34295 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        setField(term34295, term34295.getClass(), "set", term34343);
        ArrayList term34647 = new ArrayList();
        term34595 = new ArrayList();
        ((ArrayList) term34595).add(term34647);
        ((ArrayList) term34595).add((Object)null);
        ((ArrayList) term34595).add((Object)null);
        ((ArrayList) term34595).add((Object)null);
        ((ArrayList) term34595).add((Object)null);
        ((ArrayList) term34595).add(term34671);
        ((ArrayList) term34595).add((Object)null);
        ((ArrayList) term34595).add((Object)null);
        ((ArrayList) term34595).add((Object)null);
        ((ArrayList) term34595).add((Object)null);
        ((ArrayList) term34595).add((Object)null);
        HashMap term39200 = new HashMap();
        Set<Object> term39211 =  ((Map) term39200).keySet();
        HashSet term39199 = new HashSet((Collection<? extends Object>) term39211);
        term39198 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        setField(term39198, term39198.getClass(), "set", term39199);
        setField(term39198, term39198.getClass(), "collection", null);
        ArrayList term39205 = new ArrayList();
        HashMap term39208 = new HashMap();
        Set<Object> term39212 =  ((Map) term39208).keySet();
        HashSet term39207 = new HashSet((Collection<? extends Object>) term39212);
        term39203 = new ArrayList();
        ((ArrayList) term39203).add(term39205);
        ((ArrayList) term39203).add((Object)null);
        ((ArrayList) term39203).add((Object)null);
        ((ArrayList) term39203).add((Object)null);
        ((ArrayList) term39203).add((Object)null);
        ((ArrayList) term39203).add(term39207);
        ((ArrayList) term39203).add((Object)null);
        ((ArrayList) term39203).add((Object)null);
        ((ArrayList) term39203).add((Object)null);
        ((ArrayList) term39203).add((Object)null);
        ((ArrayList) term39203).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.list.SetUniqueList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = term34595;
        Object retValue = callMethod(klass, "retainAll", argTypes, term34295, args);
        assertTrue(recursiveEquals(term34295, term39198));
        assertTrue(recursiveEquals(term34595, term39203));
        assertTrue(recursiveEquals(retValue, false));
    }

};


