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

public class SetUniqueList_decorate_176823377639 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7333;
     Object term7410;
     Object term7403;

    public SetUniqueList_decorate_176823377639() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7333 = new LinkedList();
        term7410 = new LinkedList();
        HashMap term7405 = new HashMap();
        Set<Object> term7411 =  ((Map) term7405).keySet();
        HashSet term7404 = new HashSet((Collection<? extends Object>) term7411);
        LinkedList term7399 = new LinkedList();
        term7403 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        setField(term7403, term7403.getClass(), "set", term7404);
        setField(term7403, term7403.getClass(), "collection", term7399);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.list.SetUniqueList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term7333;
        Object retValue = callMethod(klass, "decorate", argTypes, null, args);
        assertTrue(recursiveEquals(term7333, term7410));
        assertTrue(recursiveEquals(retValue, term7403));
    }

};


