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
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;

public class SetUniqueList_asSet_61848515083 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14941;
     Object term15271;
     Object term15263;

    public SetUniqueList_asSet_61848515083() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashSet term14989 = new HashSet();
        term14941 = newInstance(Class.forName("org.apache.commons.collections4.list.SetUniqueList"));
        setField(term14941, term14941.getClass(), "set", term14989);
        HashMap term15273 = new HashMap();
        Set<Object> term15274 =  ((Map) term15273).keySet();
        HashSet term15272 = new HashSet((Collection<? extends Object>) term15274);
        term15271 = newInstance(Class.forName("org.apache.commons.collections4.list.SetUniqueList"));
        setField(term15271, term15271.getClass(), "set", term15272);
        setField(term15271, term15271.getClass(), "collection", null);
        HashMap term15265 = new HashMap();
        Set<Object> term15275 =  ((Map) term15265).keySet();
        HashSet term15264 = new HashSet((Collection<? extends Object>) term15275);
        term15263 = newInstance(Class.forName("org.apache.commons.collections4.set.UnmodifiableSet"));
        setField(term15263, term15263.getClass(), "collection", term15264);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.list.SetUniqueList");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "asSet", argTypes, term14941, args);
        assertTrue(recursiveEquals(term14941, term15271));
        assertTrue(recursiveEquals(retValue, term15263));
    }

};


