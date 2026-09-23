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

public class GlobalNamespace_getNameIndex_22018420942 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10084;

    public GlobalNamespace_getNameIndex_22018420942() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10084 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace"));
        Object term10170 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setBooleanField(term10084, term10084.getClass(), "generated", false);
        setField(term10084, term10084.getClass(), "externsRoot", term10170);
        setBooleanField(term10084, term10084.getClass(), "inExterns", false);
        setField(term10084, term10084.getClass(), "compiler", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.GlobalNamespace");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getNameIndex", argTypes, term10084, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


