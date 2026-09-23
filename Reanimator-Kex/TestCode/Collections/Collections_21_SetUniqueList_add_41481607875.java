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

public class SetUniqueList_add_41481607875 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13241;
     Object term13466;

    public SetUniqueList_add_41481607875() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashSet term13289 = new HashSet();
        ArrayList term13389 = new ArrayList();
        term13241 = newInstance(Class.forName("org.apache.commons.collections4.list.SetUniqueList"));
        setField(term13241, term13241.getClass(), "set", term13289);
        setField(term13241, term13241.getClass(), "collection", term13389);
        HashMap term13468 = new HashMap();
        Set<Object> term13473 =  ((Map) term13468).keySet();
        HashSet term13467 = new HashSet((Collection<? extends Object>) term13473);
        ArrayList term13471 = new ArrayList();
        ((ArrayList) term13471).add((Object)null);
        term13466 = newInstance(Class.forName("org.apache.commons.collections4.list.SetUniqueList"));
        setField(term13466, term13466.getClass(), "set", term13467);
        setField(term13466, term13466.getClass(), "collection", term13471);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.list.SetUniqueList");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = 0;
        args[1] = null;
        callMethod(klass, "add", argTypes, term13241, args);
        assertTrue(recursiveEquals(term13241, term13466));
    }

};


