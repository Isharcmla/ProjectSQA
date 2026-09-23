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

public class SetUniqueList_contains_46372940243 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5158;
     Object term5467;

    public SetUniqueList_contains_46372940243() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashSet term5206 = new HashSet();
        term5158 = newInstance(Class.forName("org.apache.commons.collections4.list.SetUniqueList"));
        setField(term5158, term5158.getClass(), "set", term5206);
        HashMap term5469 = new HashMap();
        Set<Object> term5470 =  ((Map) term5469).keySet();
        HashSet term5468 = new HashSet((Collection<? extends Object>) term5470);
        term5467 = newInstance(Class.forName("org.apache.commons.collections4.list.SetUniqueList"));
        setField(term5467, term5467.getClass(), "set", term5468);
        setField(term5467, term5467.getClass(), "collection", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.list.SetUniqueList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "contains", argTypes, term5158, args);
        assertTrue(recursiveEquals(term5158, term5467));
    }

};


