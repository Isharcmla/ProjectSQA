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
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;

public class SetUniqueList_add_954530422101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19964;
     Object term20189;

    public SetUniqueList_add_954530422101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashSet term20012 = new HashSet();
        ArrayList term20112 = new ArrayList();
        term19964 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        setField(term19964, term19964.getClass(), "set", term20012);
        setField(term19964, term19964.getClass(), "collection", term20112);
        HashMap term20191 = new HashMap();
        Set<Object> term20196 =  ((Map) term20191).keySet();
        HashSet term20190 = new HashSet((Collection<? extends Object>) term20196);
        ArrayList term20194 = new ArrayList();
        ((ArrayList) term20194).add((Object)null);
        term20189 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        setField(term20189, term20189.getClass(), "set", term20190);
        setField(term20189, term20189.getClass(), "collection", term20194);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.list.SetUniqueList");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = 0;
        args[1] = null;
        callMethod(klass, "add", argTypes, term19964, args);
        assertTrue(recursiveEquals(term19964, term20189));
    }

};


