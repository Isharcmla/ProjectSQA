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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class GlobalNamespace_getNameForest_66304294455 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13781;

    public GlobalNamespace_getNameForest_66304294455() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13781 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace"));
        Object term13851 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13921 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setBooleanField(term13781, term13781.getClass(), "generated", false);
        setIntField(term13851, term13851.getClass(), "type", 0);
        setField(term13851, term13851.getClass(), "first", term13921);
        setField(term13781, term13781.getClass(), "externsRoot", term13851);
        setBooleanField(term13781, term13781.getClass(), "inExterns", false);
        setField(term13781, term13781.getClass(), "compiler", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.GlobalNamespace");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getNameForest", argTypes, term13781, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


