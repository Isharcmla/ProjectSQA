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

public class SetUniqueList_retainAll_459584140105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25389;
     Object term25489;
     Object term25504;
     Object term25507;

    public SetUniqueList_retainAll_459584140105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashSet term25437 = new HashSet();
        term25389 = newInstance(Class.forName("org.apache.commons.collections4.list.SetUniqueList"));
        setField(term25389, term25389.getClass(), "set", term25437);
        term25489 = new ArrayList();
        HashMap term25506 = new HashMap();
        Set<Object> term25510 =  ((Map) term25506).keySet();
        HashSet term25505 = new HashSet((Collection<? extends Object>) term25510);
        term25504 = newInstance(Class.forName("org.apache.commons.collections4.list.SetUniqueList"));
        setField(term25504, term25504.getClass(), "set", term25505);
        setField(term25504, term25504.getClass(), "collection", null);
        term25507 = new ArrayList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.list.SetUniqueList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = term25489;
        Object retValue = callMethod(klass, "retainAll", argTypes, term25389, args);
        assertTrue(recursiveEquals(term25389, term25504));
        assertTrue(recursiveEquals(term25489, term25507));
        assertTrue(recursiveEquals(retValue, false));
    }

};


