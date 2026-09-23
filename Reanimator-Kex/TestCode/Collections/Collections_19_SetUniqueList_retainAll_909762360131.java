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
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;

public class SetUniqueList_retainAll_909762360131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32590;
     Object term32932;
     Object term32965;
     Object term32971;

    public SetUniqueList_retainAll_909762360131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term32776 = newInstance(Class.forName("java.lang.Object"));
        HashSet term32638 = new HashSet();
        ((HashSet) term32638).add(term32776);
        ((HashSet) term32638).add((Object)null);
        ((HashSet) term32638).add((Object)null);
        ((HashSet) term32638).add((Object)null);
        ((HashSet) term32638).add((Object)null);
        ((HashSet) term32638).add((Object)null);
        ((HashSet) term32638).add((Object)null);
        ((HashSet) term32638).add((Object)null);
        ((HashSet) term32638).add((Object)null);
        ((HashSet) term32638).add((Object)null);
        ((HashSet) term32638).add((Object)null);
        ((HashSet) term32638).add((Object)null);
        ArrayList term32880 = new ArrayList();
        term32590 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        setField(term32590, term32590.getClass(), "set", term32638);
        setField(term32590, term32590.getClass(), "collection", term32880);
        term32932 = new ArrayList();
        HashMap term32967 = new HashMap();
        Set<Object> term32974 =  ((Map) term32967).keySet();
        HashSet term32966 = new HashSet((Collection<? extends Object>) term32974);
        ArrayList term32969 = new ArrayList();
        term32965 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        setField(term32965, term32965.getClass(), "set", term32966);
        setField(term32965, term32965.getClass(), "collection", term32969);
        term32971 = new ArrayList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.list.SetUniqueList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = term32932;
        Object retValue = callMethod(klass, "retainAll", argTypes, term32590, args);
        assertTrue(recursiveEquals(term32590, term32965));
        assertTrue(recursiveEquals(term32932, term32971));
        assertTrue(recursiveEquals(retValue, true));
    }

};


