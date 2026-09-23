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

public class SetUniqueList_remove_156369757360 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9400;
     Object term9527;

    public SetUniqueList_remove_156369757360() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashSet term9448 = new HashSet();
        term9400 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        setField(term9400, term9400.getClass(), "set", term9448);
        HashMap term9529 = new HashMap();
        Set<Object> term9530 =  ((Map) term9529).keySet();
        HashSet term9528 = new HashSet((Collection<? extends Object>) term9530);
        term9527 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        setField(term9527, term9527.getClass(), "set", term9528);
        setField(term9527, term9527.getClass(), "collection", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.list.SetUniqueList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "remove", argTypes, term9400, args);
        assertTrue(recursiveEquals(term9400, term9527));
    }

};


