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
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.ArrayList;

public class ListOrderedSet_init_68590523026 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56;
     Object term466;
     Object term472;

    public ListOrderedSet_init_68590523026() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term57 = new HashMap();
        Set<Object> term475 =  ((Map) term57).keySet();
        term56 = new HashSet((Collection<? extends Object>) term475);
        ArrayList term467 = new ArrayList();
        HashMap term470 = new HashMap();
        Set<Object> term476 =  ((Map) term470).keySet();
        HashSet term469 = new HashSet((Collection<? extends Object>) term476);
        term466 = newInstance(Class.forName("org.apache.commons.collections.set.ListOrderedSet"));
        setField(term466, term466.getClass(), "setOrder", term467);
        setField(term466, term466.getClass(), "collection", term469);
        HashMap term473 = new HashMap();
        Set<Object> term477 =  ((Map) term473).keySet();
        term472 = new HashSet((Collection<? extends Object>) term477);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.set.ListOrderedSet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Set");
        Object[] args = new Object[1];
        args[0] = term56;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term466));
        assertTrue(recursiveEquals(term56, term472));
    }

};


