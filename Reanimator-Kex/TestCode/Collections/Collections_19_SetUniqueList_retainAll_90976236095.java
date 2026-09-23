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

public class SetUniqueList_retainAll_90976236095 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18736;
     Object term18836;
     Object term18851;
     Object term18854;

    public SetUniqueList_retainAll_90976236095() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashSet term18784 = new HashSet();
        term18736 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        setField(term18736, term18736.getClass(), "set", term18784);
        term18836 = new ArrayList();
        HashMap term18853 = new HashMap();
        Set<Object> term18857 =  ((Map) term18853).keySet();
        HashSet term18852 = new HashSet((Collection<? extends Object>) term18857);
        term18851 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        setField(term18851, term18851.getClass(), "set", term18852);
        setField(term18851, term18851.getClass(), "collection", null);
        term18854 = new ArrayList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.list.SetUniqueList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = term18836;
        Object retValue = callMethod(klass, "retainAll", argTypes, term18736, args);
        assertTrue(recursiveEquals(term18736, term18851));
        assertTrue(recursiveEquals(term18836, term18854));
        assertTrue(recursiveEquals(retValue, false));
    }

};


