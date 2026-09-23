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
import java.util.LinkedList;
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class SetUniqueList_decorate_176823377645 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8548;
     Object term8573;
     Object term8566;

    public SetUniqueList_decorate_176823377645() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8548 = new LinkedList();
        term8573 = new LinkedList();
        HashMap term8568 = new HashMap();
        Set<Object> term8574 =  ((Map) term8568).keySet();
        HashSet term8567 = new HashSet((Collection<? extends Object>) term8574);
        LinkedList term8562 = new LinkedList();
        term8566 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        setField(term8566, term8566.getClass(), "set", term8567);
        setField(term8566, term8566.getClass(), "collection", term8562);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.list.SetUniqueList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term8548;
        Object retValue = callMethod(klass, "decorate", argTypes, null, args);
        assertTrue(recursiveEquals(term8548, term8573));
        assertTrue(recursiveEquals(retValue, term8566));
    }

};


