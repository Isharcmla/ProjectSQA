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

public class GlobalNamespace_getNameIndex_22018420964 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15872;
     Object term167030;

    public GlobalNamespace_getNameIndex_22018420964() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15872 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace"));
        Object term15942 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setBooleanField(term15872, term15872.getClass(), "generated", false);
        setField(term15872, term15872.getClass(), "externsRoot", null);
        setBooleanField(term15872, term15872.getClass(), "inExterns", false);
        setField(term15872, term15872.getClass(), "compiler", null);
        setIntField(term15942, term15942.getClass(), "type", 0);
        setField(term15942, term15942.getClass(), "first", null);
        setField(term15872, term15872.getClass(), "root", term15942);
        term167030 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace"));
        Object term167031 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term167030, term167030.getClass(), "compiler", null);
        setIntField(term167031, term167031.getClass(), "type", 0);
        setField(term167031, term167031.getClass(), "next", null);
        setField(term167031, term167031.getClass(), "first", null);
        setField(term167031, term167031.getClass(), "last", null);
        setField(term167031, term167031.getClass(), "propListHead", null);
        setIntField(term167031, term167031.getClass(), "sourcePosition", 0);
        setField(term167031, term167031.getClass(), "jsType", null);
        setField(term167031, term167031.getClass(), "parent", null);
        setField(term167030, term167030.getClass(), "root", term167031);
        setField(term167030, term167030.getClass(), "externsRoot", null);
        setBooleanField(term167030, term167030.getClass(), "inExterns", false);
        setField(term167030, term167030.getClass(), "externsScope", null);
        setBooleanField(term167030, term167030.getClass(), "generated", true);
        setField(term167030, term167030.getClass(), "globalNames", null);
        setField(term167030, term167030.getClass(), "nameMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.GlobalNamespace");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getNameIndex", argTypes, term15872, args);
        assertTrue(recursiveEquals(term15872, term167030));
        assertTrue(recursiveEquals(retValue, null));
    }

};


