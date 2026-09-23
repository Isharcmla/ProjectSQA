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

public class CheckAccessControls_hotSwapScript_73948618051 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9001;
     Object term9071;

    public CheckAccessControls_hotSwapScript_73948618051() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9001 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        setField(term9001, term9001.getClass(), "compiler", null);
        term9071 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9141 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term9071, term9071.getClass(), "type", 0);
        setField(term9141, term9141.getClass(), "next", null);
        setIntField(term9141, term9141.getClass(), "type", 33);
        setField(term9141, term9141.getClass(), "first", null);
        setField(term9071, term9071.getClass(), "first", term9141);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term9071;
        try {
            callMethod(klass, "hotSwapScript", argTypes, term9001, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


