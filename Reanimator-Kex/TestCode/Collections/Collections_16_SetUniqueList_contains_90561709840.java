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

public class SetUniqueList_contains_90561709840 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6363;
     Object term6696;

    public SetUniqueList_contains_90561709840() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashSet term6411 = new HashSet();
        term6363 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        setField(term6363, term6363.getClass(), "set", term6411);
        HashMap term6698 = new HashMap();
        Set<Object> term6699 =  ((Map) term6698).keySet();
        HashSet term6697 = new HashSet((Collection<? extends Object>) term6699);
        term6696 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        setField(term6696, term6696.getClass(), "set", term6697);
        setField(term6696, term6696.getClass(), "collection", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.list.SetUniqueList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "contains", argTypes, term6363, args);
        assertTrue(recursiveEquals(term6363, term6696));
    }

};


