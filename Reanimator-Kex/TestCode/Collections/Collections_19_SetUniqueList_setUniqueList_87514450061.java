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

public class SetUniqueList_setUniqueList_87514450061 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9517;
     Object term9565;
     Object term9558;

    public SetUniqueList_setUniqueList_87514450061() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9517 = new LinkedList();
        term9565 = new LinkedList();
        HashMap term9560 = new HashMap();
        Set<Object> term9566 =  ((Map) term9560).keySet();
        HashSet term9559 = new HashSet((Collection<? extends Object>) term9566);
        LinkedList term9554 = new LinkedList();
        term9558 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        setField(term9558, term9558.getClass(), "set", term9559);
        setField(term9558, term9558.getClass(), "collection", term9554);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.list.SetUniqueList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term9517;
        Object retValue = callMethod(klass, "setUniqueList", argTypes, null, args);
        assertTrue(recursiveEquals(term9517, term9565));
        assertTrue(recursiveEquals(retValue, term9558));
    }

};


