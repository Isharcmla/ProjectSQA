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

public class GlobalNamespace_getNameForest_66304294434 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7661;
     Object term7771;

    public GlobalNamespace_getNameForest_66304294434() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7661 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace"));
        setBooleanField(term7661, term7661.getClass(), "generated", true);
        term7771 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace"));
        setField(term7771, term7771.getClass(), "compiler", null);
        setField(term7771, term7771.getClass(), "root", null);
        setField(term7771, term7771.getClass(), "externsRoot", null);
        setBooleanField(term7771, term7771.getClass(), "inExterns", false);
        setField(term7771, term7771.getClass(), "externsScope", null);
        setBooleanField(term7771, term7771.getClass(), "generated", true);
        setField(term7771, term7771.getClass(), "globalNames", null);
        setField(term7771, term7771.getClass(), "nameMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.GlobalNamespace");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getNameForest", argTypes, term7661, args);
        assertTrue(recursiveEquals(term7661, term7771));
        assertTrue(recursiveEquals(retValue, null));
    }

};


