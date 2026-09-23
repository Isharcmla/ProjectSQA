package org.apache.commons.collections4.list;

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
import static org.apache.commons.collections4.list.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.collections4.list.EqualityUtils.*;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;

public class SetUniqueList_createSetBasedOnList_51673750073 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12885;
     Object term12909;
     Object term12961;
     Object term12980;
     Object term12981;
     Object term12983;
     Object term12963;

    public SetUniqueList_createSetBasedOnList_51673750073() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12885 = newInstance(Class.forName("org.apache.commons.collections4.list.SetUniqueList"));
        term12909 = new HashSet();
        term12961 = new ArrayList();
        term12980 = newInstance(Class.forName("org.apache.commons.collections4.list.SetUniqueList"));
        setField(term12980, term12980.getClass(), "set", null);
        setField(term12980, term12980.getClass(), "collection", null);
        HashMap term12982 = new HashMap();
        Set<Object> term12985 =  ((Map) term12982).keySet();
        term12981 = new HashSet((Collection<? extends Object>) term12985);
        term12983 = new ArrayList();
        HashMap term12964 = new HashMap();
        Set<Object> term12986 =  ((Map) term12964).keySet();
        term12963 = new HashSet((Collection<? extends Object>) term12986);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.list.SetUniqueList");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Set");
        argTypes[1] = Class.forName("java.util.List");
        Object[] args = new Object[2];
        args[0] = term12909;
        args[1] = term12961;
        Object retValue = callMethod(klass, "createSetBasedOnList", argTypes, term12885, args);
        assertTrue(recursiveEquals(term12885, term12980));
        assertTrue(recursiveEquals(term12909, term12981));
        assertTrue(recursiveEquals(term12961, term12983));
        assertTrue(recursiveEquals(retValue, term12963));
    }

};


