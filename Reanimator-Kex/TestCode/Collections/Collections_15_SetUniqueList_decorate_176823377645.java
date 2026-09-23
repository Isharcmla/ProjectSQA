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
     Object term9027;
     Object term9052;
     Object term9045;

    public SetUniqueList_decorate_176823377645() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9027 = new LinkedList();
        term9052 = new LinkedList();
        HashMap term9047 = new HashMap();
        Set<Object> term9053 =  ((Map) term9047).keySet();
        HashSet term9046 = new HashSet((Collection<? extends Object>) term9053);
        LinkedList term9041 = new LinkedList();
        term9045 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        setField(term9045, term9045.getClass(), "set", term9046);
        setField(term9045, term9045.getClass(), "collection", term9041);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.list.SetUniqueList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term9027;
        Object retValue = callMethod(klass, "decorate", argTypes, null, args);
        assertTrue(recursiveEquals(term9027, term9052));
        assertTrue(recursiveEquals(retValue, term9045));
    }

};


