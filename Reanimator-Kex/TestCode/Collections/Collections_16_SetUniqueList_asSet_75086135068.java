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

public class SetUniqueList_asSet_75086135068 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14198;
     Object term14383;
     Object term14375;

    public SetUniqueList_asSet_75086135068() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashSet term14246 = new HashSet();
        term14198 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        setField(term14198, term14198.getClass(), "set", term14246);
        HashMap term14385 = new HashMap();
        Set<Object> term14386 =  ((Map) term14385).keySet();
        HashSet term14384 = new HashSet((Collection<? extends Object>) term14386);
        term14383 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        setField(term14383, term14383.getClass(), "set", term14384);
        setField(term14383, term14383.getClass(), "collection", null);
        HashMap term14377 = new HashMap();
        Set<Object> term14387 =  ((Map) term14377).keySet();
        HashSet term14376 = new HashSet((Collection<? extends Object>) term14387);
        term14375 = newInstance(Class.forName("org.apache.commons.collections.set.UnmodifiableSet"));
        setField(term14375, term14375.getClass(), "collection", term14376);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.list.SetUniqueList");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "asSet", argTypes, term14198, args);
        assertTrue(recursiveEquals(term14198, term14383));
        assertTrue(recursiveEquals(retValue, term14375));
    }

};


