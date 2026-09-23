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

public class SetUniqueList_decorate_176823377655 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11293;
     Object term11370;
     Object term11363;

    public SetUniqueList_decorate_176823377655() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11293 = new LinkedList();
        term11370 = new LinkedList();
        HashMap term11365 = new HashMap();
        Set<Object> term11371 =  ((Map) term11365).keySet();
        HashSet term11364 = new HashSet((Collection<? extends Object>) term11371);
        LinkedList term11359 = new LinkedList();
        term11363 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        setField(term11363, term11363.getClass(), "set", term11364);
        setField(term11363, term11363.getClass(), "collection", term11359);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.list.SetUniqueList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term11293;
        Object retValue = callMethod(klass, "decorate", argTypes, null, args);
        assertTrue(recursiveEquals(term11293, term11370));
        assertTrue(recursiveEquals(retValue, term11363));
    }

};


