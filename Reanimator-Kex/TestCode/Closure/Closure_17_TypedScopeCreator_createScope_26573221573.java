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

public class TypedScopeCreator_createScope_26573221573 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50890;
     Object term50960;
     Object term51314;

    public TypedScopeCreator_createScope_26573221573() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50890 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term50890, term50890.getClass(), "compiler", null);
        term50960 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term51030 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term51100 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term51170 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term51240 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term50960, term50960.getClass(), "jsType", null);
        setIntField(term50960, term50960.getClass(), "type", 0);
        setField(term50960, term50960.getClass(), "parent", null);
        setField(term51170, term51170.getClass(), "next", null);
        setIntField(term51170, term51170.getClass(), "type", 44);
        setField(term51170, term51170.getClass(), "first", null);
        setField(term51100, term51100.getClass(), "next", term51170);
        setIntField(term51100, term51100.getClass(), "type", 125);
        setField(term51100, term51100.getClass(), "first", null);
        setField(term51100, term51100.getClass(), "parent", null);
        setField(term51030, term51030.getClass(), "next", term51100);
        setIntField(term51030, term51030.getClass(), "type", 0);
        setField(term51240, term51240.getClass(), "next", null);
        setIntField(term51240, term51240.getClass(), "type", 0);
        setField(term51240, term51240.getClass(), "first", null);
        setField(term51240, term51240.getClass(), "parent", null);
        setField(term51030, term51030.getClass(), "first", term51240);
        setField(term51030, term51030.getClass(), "parent", null);
        setField(term50960, term50960.getClass(), "first", term51030);
        term51314 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term51314, term51314.getClass(), "rootNode", null);
        setField(term51314, term51314.getClass(), "thisType", null);
        setIntField(term51314, term51314.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term50960;
        args[1] = term51314;
        try {
            callMethod(klass, "createScope", argTypes, term50890, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


