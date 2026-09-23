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

public class SetUniqueList_contains_90561709853 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10707;
     Object term10764;

    public SetUniqueList_contains_90561709853() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashSet term10755 = new HashSet();
        term10707 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        setField(term10707, term10707.getClass(), "set", term10755);
        HashMap term10766 = new HashMap();
        Set<Object> term10767 =  ((Map) term10766).keySet();
        HashSet term10765 = new HashSet((Collection<? extends Object>) term10767);
        term10764 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        setField(term10764, term10764.getClass(), "set", term10765);
        setField(term10764, term10764.getClass(), "collection", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.list.SetUniqueList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "contains", argTypes, term10707, args);
        assertTrue(recursiveEquals(term10707, term10764));
    }

};


