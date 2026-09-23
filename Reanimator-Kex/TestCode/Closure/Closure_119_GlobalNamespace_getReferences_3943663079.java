package com.google.javascript.jscomp;

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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.lang.Object;

public class GlobalNamespace_getReferences_3943663079 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15259;
     Object term15363;
     Object term24039;
     Object term24040;
     Object term24037;

    public GlobalNamespace_getReferences_3943663079() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15259 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace"));
        setBooleanField(term15259, term15259.getClass(), "generated", true);
        term15363 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        term24039 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace"));
        setField(term24039, term24039.getClass(), "compiler", null);
        setField(term24039, term24039.getClass(), "root", null);
        setField(term24039, term24039.getClass(), "externsRoot", null);
        setBooleanField(term24039, term24039.getClass(), "inExterns", false);
        setField(term24039, term24039.getClass(), "externsScope", null);
        setBooleanField(term24039, term24039.getClass(), "generated", true);
        setIntField(term24039, term24039.getClass(), "currentPreOrderIndex", 0);
        setField(term24039, term24039.getClass(), "globalNames", null);
        setField(term24039, term24039.getClass(), "nameMap", null);
        term24040 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        setField(term24040, term24040.getClass(), "baseName", null);
        setField(term24040, term24040.getClass(), "parent", null);
        setField(term24040, term24040.getClass(), "props", null);
        setField(term24040, term24040.getClass(), "declaration", null);
        setField(term24040, term24040.getClass(), "refs", null);
        setField(term24040, term24040.getClass(), "type", null);
        setBooleanField(term24040, term24040.getClass(), "declaredType", false);
        setBooleanField(term24040, term24040.getClass(), "hasDeclaredTypeDescendant", false);
        setIntField(term24040, term24040.getClass(), "globalSets", 0);
        setIntField(term24040, term24040.getClass(), "localSets", 0);
        setIntField(term24040, term24040.getClass(), "aliasingGets", 0);
        setIntField(term24040, term24040.getClass(), "totalGets", 0);
        setIntField(term24040, term24040.getClass(), "callGets", 0);
        setIntField(term24040, term24040.getClass(), "deleteProps", 0);
        setBooleanField(term24040, term24040.getClass(), "inExterns", false);
        setField(term24040, term24040.getClass(), "docInfo", null);
        term24037 = newInstance(Class.forName("java.util.Collections$UnmodifiableRandomAccessList"));
        Object term24038 = newInstance(Class.forName("com.google.common.collect.EmptyImmutableList"));
        setField(term24038, term24038.getClass(), "asList", null);
        setField(term24037, term24037.getClass(), "list", term24038);
        setField(term24037, term24037.getClass(), "c", term24038);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.GlobalNamespace");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Object[] args = new Object[1];
        args[0] = term15363;
        Object retValue = callMethod(klass, "getReferences", argTypes, term15259, args);
        assertTrue(recursiveEquals(term15259, term24039));
        assertTrue(recursiveEquals(term15363, term24040));
        assertTrue(recursiveEquals(retValue, term24037));
    }

};


