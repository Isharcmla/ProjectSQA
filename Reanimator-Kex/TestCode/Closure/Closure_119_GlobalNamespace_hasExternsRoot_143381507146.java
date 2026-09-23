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

public class GlobalNamespace_hasExternsRoot_143381507146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11006;
     Object term11115;

    public GlobalNamespace_hasExternsRoot_143381507146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11006 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace"));
        setField(term11006, term11006.getClass(), "externsRoot", null);
        term11115 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace"));
        setField(term11115, term11115.getClass(), "compiler", null);
        setField(term11115, term11115.getClass(), "root", null);
        setField(term11115, term11115.getClass(), "externsRoot", null);
        setBooleanField(term11115, term11115.getClass(), "inExterns", false);
        setField(term11115, term11115.getClass(), "externsScope", null);
        setBooleanField(term11115, term11115.getClass(), "generated", false);
        setIntField(term11115, term11115.getClass(), "currentPreOrderIndex", 0);
        setField(term11115, term11115.getClass(), "globalNames", null);
        setField(term11115, term11115.getClass(), "nameMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.GlobalNamespace");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hasExternsRoot", argTypes, term11006, args);
        assertTrue(recursiveEquals(term11006, term11115));
        assertTrue(recursiveEquals(retValue, false));
    }

};


