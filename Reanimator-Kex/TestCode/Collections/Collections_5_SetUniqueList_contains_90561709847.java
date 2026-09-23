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
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;

public class SetUniqueList_contains_90561709847 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8505;
     Object term8562;

    public SetUniqueList_contains_90561709847() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashSet term8553 = new HashSet();
        term8505 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        setField(term8505, term8505.getClass(), "set", term8553);
        HashMap term8564 = new HashMap();
        Set<Object> term8565 =  ((Map) term8564).keySet();
        HashSet term8563 = new HashSet((Collection<? extends Object>) term8565);
        term8562 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        setField(term8562, term8562.getClass(), "set", term8563);
        setField(term8562, term8562.getClass(), "collection", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.list.SetUniqueList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "contains", argTypes, term8505, args);
        assertTrue(recursiveEquals(term8505, term8562));
    }

};


