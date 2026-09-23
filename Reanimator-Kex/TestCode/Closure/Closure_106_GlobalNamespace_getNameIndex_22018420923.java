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

public class GlobalNamespace_getNameIndex_22018420923 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5604;
     Object term5888;

    public GlobalNamespace_getNameIndex_22018420923() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5604 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace"));
        setBooleanField(term5604, term5604.getClass(), "generated", true);
        term5888 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace"));
        setField(term5888, term5888.getClass(), "compiler", null);
        setField(term5888, term5888.getClass(), "root", null);
        setField(term5888, term5888.getClass(), "externsRoot", null);
        setBooleanField(term5888, term5888.getClass(), "inExterns", false);
        setField(term5888, term5888.getClass(), "externsScope", null);
        setBooleanField(term5888, term5888.getClass(), "generated", true);
        setField(term5888, term5888.getClass(), "globalNames", null);
        setField(term5888, term5888.getClass(), "nameMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.GlobalNamespace");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getNameIndex", argTypes, term5604, args);
        assertTrue(recursiveEquals(term5604, term5888));
        assertTrue(recursiveEquals(retValue, null));
    }

};


