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
import java.lang.RuntimeException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class GlobalNamespace_getNameForest_66304294465 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17960;

    public GlobalNamespace_getNameForest_66304294465() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17960 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace"));
        Object term18030 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term18110 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setBooleanField(term17960, term17960.getClass(), "generated", false);
        setIntField(term18030, term18030.getClass(), "type", 0);
        setField(term18030, term18030.getClass(), "first", null);
        setField(term17960, term17960.getClass(), "externsRoot", term18030);
        setBooleanField(term17960, term17960.getClass(), "inExterns", false);
        setField(term17960, term17960.getClass(), "compiler", term18110);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.GlobalNamespace");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getNameForest", argTypes, term17960, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


