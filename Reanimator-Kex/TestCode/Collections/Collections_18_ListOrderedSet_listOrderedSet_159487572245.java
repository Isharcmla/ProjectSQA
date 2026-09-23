package org.apache.commons.collections.set;

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
import static org.apache.commons.collections.set.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.collections.set.EqualityUtils.*;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;

public class ListOrderedSet_listOrderedSet_159487572245 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4607;
     Object term4813;
     Object term4856;
     Object term4858;
     Object term4845;

    public ListOrderedSet_listOrderedSet_159487572245() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4607 = new HashSet();
        term4813 = new LinkedList();
        HashMap term4857 = new HashMap();
        Set<Object> term4859 =  ((Map) term4857).keySet();
        term4856 = new HashSet((Collection<? extends Object>) term4859);
        term4858 = new LinkedList();
        LinkedList term4846 = new LinkedList();
        HashMap term4850 = new HashMap();
        Set<Object> term4860 =  ((Map) term4850).keySet();
        HashSet term4849 = new HashSet((Collection<? extends Object>) term4860);
        term4845 = newInstance(Class.forName("org.apache.commons.collections.set.ListOrderedSet"));
        setField(term4845, term4845.getClass(), "setOrder", term4846);
        setField(term4845, term4845.getClass(), "collection", term4849);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.set.ListOrderedSet");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Set");
        argTypes[1] = Class.forName("java.util.List");
        Object[] args = new Object[2];
        args[0] = term4607;
        args[1] = term4813;
        Object retValue = callMethod(klass, "listOrderedSet", argTypes, null, args);
        assertTrue(recursiveEquals(term4607, term4856));
        assertTrue(recursiveEquals(term4813, term4858));
        assertTrue(recursiveEquals(retValue, term4845));
    }

};


