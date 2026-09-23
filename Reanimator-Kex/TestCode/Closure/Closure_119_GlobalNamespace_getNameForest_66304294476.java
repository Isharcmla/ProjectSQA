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

public class GlobalNamespace_getNameForest_66304294476 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14797;
     Object term23745;

    public GlobalNamespace_getNameForest_66304294476() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14797 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace"));
        setBooleanField(term14797, term14797.getClass(), "generated", true);
        term23745 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace"));
        setField(term23745, term23745.getClass(), "compiler", null);
        setField(term23745, term23745.getClass(), "root", null);
        setField(term23745, term23745.getClass(), "externsRoot", null);
        setBooleanField(term23745, term23745.getClass(), "inExterns", false);
        setField(term23745, term23745.getClass(), "externsScope", null);
        setBooleanField(term23745, term23745.getClass(), "generated", true);
        setIntField(term23745, term23745.getClass(), "currentPreOrderIndex", 0);
        setField(term23745, term23745.getClass(), "globalNames", null);
        setField(term23745, term23745.getClass(), "nameMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.GlobalNamespace");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getNameForest", argTypes, term14797, args);
        assertTrue(recursiveEquals(term14797, term23745));
        assertTrue(recursiveEquals(retValue, null));
    }

};


