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

public class SetUniqueList_decorate_176823377683 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18882;
     Object term18959;
     Object term18952;

    public SetUniqueList_decorate_176823377683() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18882 = new LinkedList();
        term18959 = new LinkedList();
        HashMap term18954 = new HashMap();
        Set<Object> term18960 =  ((Map) term18954).keySet();
        HashSet term18953 = new HashSet((Collection<? extends Object>) term18960);
        LinkedList term18948 = new LinkedList();
        term18952 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        setField(term18952, term18952.getClass(), "set", term18953);
        setField(term18952, term18952.getClass(), "collection", term18948);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.list.SetUniqueList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term18882;
        Object retValue = callMethod(klass, "decorate", argTypes, null, args);
        assertTrue(recursiveEquals(term18882, term18959));
        assertTrue(recursiveEquals(retValue, term18952));
    }

};


