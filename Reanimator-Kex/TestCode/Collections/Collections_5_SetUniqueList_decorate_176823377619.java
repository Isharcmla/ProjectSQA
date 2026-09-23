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
     Object term234;
     Object term218;

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
        Object term236 = newInstance(Class.forName("java.lang.Object"));
        Object term238 = newInstance(Class.forName("java.lang.Object"));
        term234 = new LinkedList();
        ((LinkedList) term234).add(term236);
        ((LinkedList) term234).add(term238);
        ((LinkedList) term234).add((Object)null);
        ((LinkedList) term234).add((Object)null);
        HashMap term220 = new HashMap();
        Set<Object> term241 =  ((Map) term220).keySet();
        HashSet term219 = new HashSet((Collection<? extends Object>) term241);
        Object term101 = newInstance(Class.forName("java.lang.Object"));
        Object term103 = newInstance(Class.forName("java.lang.Object"));
        LinkedList term98 = new LinkedList();
        ((LinkedList) term98).add(term101);
        ((LinkedList) term98).add(term103);
        ((LinkedList) term98).add((Object)null);
        ((LinkedList) term98).add((Object)null);
        term218 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        setField(term218, term218.getClass(), "set", term219);
        setField(term218, term218.getClass(), "collection", term98);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.list.SetUniqueList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term1;
        Object retValue = callMethod(klass, "decorate", argTypes, null, args);
        assertTrue(recursiveEquals(term1, term234));
        assertTrue(recursiveEquals(retValue, term218));
    }

};


