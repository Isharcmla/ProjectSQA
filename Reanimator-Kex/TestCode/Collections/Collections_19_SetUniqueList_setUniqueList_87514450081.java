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
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class SetUniqueList_setUniqueList_87514450081 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15091;
     Object term15168;
     Object term15161;

    public SetUniqueList_setUniqueList_87514450081() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15091 = new LinkedList();
        term15168 = new LinkedList();
        HashMap term15163 = new HashMap();
        Set<Object> term15169 =  ((Map) term15163).keySet();
        HashSet term15162 = new HashSet((Collection<? extends Object>) term15169);
        LinkedList term15157 = new LinkedList();
        term15161 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        setField(term15161, term15161.getClass(), "set", term15162);
        setField(term15161, term15161.getClass(), "collection", term15157);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.list.SetUniqueList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term15091;
        Object retValue = callMethod(klass, "setUniqueList", argTypes, null, args);
        assertTrue(recursiveEquals(term15091, term15168));
        assertTrue(recursiveEquals(retValue, term15161));
    }

};


