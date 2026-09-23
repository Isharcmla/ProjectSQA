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

public class SetUniqueList_asSet_75086135063 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9687;
     Object term9760;
     Object term9752;

    public SetUniqueList_asSet_75086135063() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashSet term9735 = new HashSet();
        term9687 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        setField(term9687, term9687.getClass(), "set", term9735);
        HashMap term9762 = new HashMap();
        Set<Object> term9763 =  ((Map) term9762).keySet();
        HashSet term9761 = new HashSet((Collection<? extends Object>) term9763);
        term9760 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        setField(term9760, term9760.getClass(), "set", term9761);
        setField(term9760, term9760.getClass(), "collection", null);
        HashMap term9754 = new HashMap();
        Set<Object> term9764 =  ((Map) term9754).keySet();
        HashSet term9753 = new HashSet((Collection<? extends Object>) term9764);
        term9752 = newInstance(Class.forName("org.apache.commons.collections.set.UnmodifiableSet"));
        setField(term9752, term9752.getClass(), "collection", term9753);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.list.SetUniqueList");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "asSet", argTypes, term9687, args);
        assertTrue(recursiveEquals(term9687, term9760));
        assertTrue(recursiveEquals(retValue, term9752));
    }

};


