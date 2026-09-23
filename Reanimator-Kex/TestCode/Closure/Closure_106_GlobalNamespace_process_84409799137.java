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

public class GlobalNamespace_process_84409799137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8461;

    public GlobalNamespace_process_84409799137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8461 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace"));
        Object term8531 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term8531, term8531.getClass(), "type", 120);
        setField(term8461, term8461.getClass(), "externsRoot", term8531);
        setBooleanField(term8461, term8461.getClass(), "inExterns", false);
        setField(term8461, term8461.getClass(), "compiler", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.GlobalNamespace");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "process", argTypes, term8461, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


