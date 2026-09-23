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

public class SetUniqueList_remove_19435107364 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10017;
     Object term10297;

    public SetUniqueList_remove_19435107364() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashSet term10065 = new HashSet();
        term10017 = newInstance(Class.forName("org.apache.commons.collections4.list.SetUniqueList"));
        setField(term10017, term10017.getClass(), "set", term10065);
        HashMap term10299 = new HashMap();
        Set<Object> term10300 =  ((Map) term10299).keySet();
        HashSet term10298 = new HashSet((Collection<? extends Object>) term10300);
        term10297 = newInstance(Class.forName("org.apache.commons.collections4.list.SetUniqueList"));
        setField(term10297, term10297.getClass(), "set", term10298);
        setField(term10297, term10297.getClass(), "collection", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.list.SetUniqueList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "remove", argTypes, term10017, args);
        assertTrue(recursiveEquals(term10017, term10297));
    }

};


