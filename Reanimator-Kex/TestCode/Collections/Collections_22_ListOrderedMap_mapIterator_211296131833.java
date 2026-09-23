package org.apache.commons.collections4.map;

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
import static org.apache.commons.collections4.map.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.collections4.map.EqualityUtils.*;
import java.util.ArrayList;
import java.lang.Object;
import java.util.HashMap;

public class ListOrderedMap_mapIterator_211296131833 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4955;
     Object term9090;
     Object term9084;

    public ListOrderedMap_mapIterator_211296131833() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term4958 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term4956 = new ArrayList();
        ((ArrayList) term4956).add(term4958);
        HashMap term4961 = new HashMap();
        term4955 = newInstance(Class.forName("org.apache.commons.collections4.map.ListOrderedMap"));
        setField(term4955, term4955.getClass(), "insertOrder", term4956);
        setField(term4955, term4955.getClass(), "map", term4961);
        Object term9093 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term9091 = new ArrayList();
        ((ArrayList) term9091).add(term9093);
        HashMap term9094 = new HashMap();
        term9090 = newInstance(Class.forName("org.apache.commons.collections4.map.ListOrderedMap"));
        setField(term9090, term9090.getClass(), "insertOrder", term9091);
        setField(term9090, term9090.getClass(), "map", term9094);
        Object term9076 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term9074 = new ArrayList();
        ((ArrayList) term9074).add(term9076);
        HashMap term9079 = new HashMap();
        term9084 = newInstance(Class.forName("org.apache.commons.collections4.map.ListOrderedMap$ListOrderedMapIterator"));
        Object term9073 = newInstance(Class.forName("org.apache.commons.collections4.map.ListOrderedMap"));
        Object term9085 = newInstance(Class.forName("java.util.ArrayList$ListItr"));
        setField(term9073, term9073.getClass(), "insertOrder", term9074);
        setField(term9073, term9073.getClass(), "map", term9079);
        setField(term9084, term9084.getClass(), "parent", term9073);
        setField(term9085, term9085.getClass(), "this$0", term9074);
        setIntField(term9085, term9085.getClass(), "cursor", 0);
        setIntField(term9085, term9085.getClass(), "lastRet", -1);
        setIntField(term9085, term9085.getClass(), "expectedModCount", 1);
        setField(term9084, term9084.getClass(), "iterator", term9085);
        setField(term9084, term9084.getClass(), "last", null);
        setBooleanField(term9084, term9084.getClass(), "readable", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.map.ListOrderedMap");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "mapIterator", argTypes, term4955, args);
        assertTrue(recursiveEquals(term4955, term9090));
        assertTrue(recursiveEquals(retValue, term9084));
    }

};


