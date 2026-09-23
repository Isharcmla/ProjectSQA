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
import java.util.HashMap;
import java.lang.Object;

public class ListOrderedMap_valueList_62028744946 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5320;
     Object term11877;
     Object term11865;

    public ListOrderedMap_valueList_62028744946() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term5321 = new ArrayList();
        HashMap term5325 = new HashMap();
        term5320 = newInstance(Class.forName("org.apache.commons.collections4.map.ListOrderedMap"));
        setField(term5320, term5320.getClass(), "insertOrder", term5321);
        setField(term5320, term5320.getClass(), "map", term5325);
        ArrayList term11878 = new ArrayList();
        HashMap term11880 = new HashMap();
        term11877 = newInstance(Class.forName("org.apache.commons.collections4.map.ListOrderedMap"));
        setField(term11877, term11877.getClass(), "insertOrder", term11878);
        setField(term11877, term11877.getClass(), "map", term11880);
        ArrayList term11867 = new ArrayList();
        HashMap term11871 = new HashMap();
        term11865 = newInstance(Class.forName("org.apache.commons.collections4.map.ListOrderedMap$ValuesView"));
        Object term11866 = newInstance(Class.forName("org.apache.commons.collections4.map.ListOrderedMap"));
        setField(term11866, term11866.getClass(), "insertOrder", term11867);
        setField(term11866, term11866.getClass(), "map", term11871);
        setField(term11865, term11865.getClass(), "parent", term11866);
        setIntField(term11865, term11865.getClass(), "modCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.map.ListOrderedMap");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "valueList", argTypes, term5320, args);
        assertTrue(recursiveEquals(term5320, term11877));
        assertTrue(recursiveEquals(retValue, term11865));
    }

};


