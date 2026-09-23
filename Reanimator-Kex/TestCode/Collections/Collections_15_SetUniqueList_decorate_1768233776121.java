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

public class SetUniqueList_decorate_1768233776121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29857;
     Object term30184;
     Object term30177;

    public SetUniqueList_decorate_1768233776121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29857 = new LinkedList();
        term30184 = new LinkedList();
        HashMap term30179 = new HashMap();
        Set<Object> term30185 =  ((Map) term30179).keySet();
        HashSet term30178 = new HashSet((Collection<? extends Object>) term30185);
        LinkedList term30173 = new LinkedList();
        term30177 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        setField(term30177, term30177.getClass(), "set", term30178);
        setField(term30177, term30177.getClass(), "collection", term30173);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.list.SetUniqueList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term29857;
        Object retValue = callMethod(klass, "decorate", argTypes, null, args);
        assertTrue(recursiveEquals(term29857, term30184));
        assertTrue(recursiveEquals(retValue, term30177));
    }

};


