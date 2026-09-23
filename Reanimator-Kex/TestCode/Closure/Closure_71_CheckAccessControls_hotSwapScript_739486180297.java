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

public class CheckAccessControls_hotSwapScript_739486180297 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term92603;
     Object term92673;

    public CheckAccessControls_hotSwapScript_739486180297() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term92603 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        setField(term92603, term92603.getClass(), "compiler", null);
        term92673 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term92743 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term92673, term92673.getClass(), "type", 0);
        setField(term92743, term92743.getClass(), "next", null);
        setIntField(term92743, term92743.getClass(), "type", 38);
        setField(term92743, term92743.getClass(), "first", null);
        setField(term92673, term92673.getClass(), "first", term92743);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term92673;
        try {
            callMethod(klass, "hotSwapScript", argTypes, term92603, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


