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

public class TypeCheck_check_233062943281 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term122675;
     Object term122917;

    public TypeCheck_check_233062943281() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term122675 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term122773 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term122847 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term122675, term122675.getClass(), "compiler", null);
        setField(term122675, term122675.getClass(), "scopeCreator", term122773);
        setBooleanField(term122675, term122675.getClass(), "inExterns", false);
        setField(term122847, term122847.getClass(), "parent", null);
        setField(term122675, term122675.getClass(), "topScope", term122847);
        term122917 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term122987 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term123057 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term122917, term122917.getClass(), "type", 0);
        setField(term122987, term122987.getClass(), "next", term123057);
        setIntField(term122987, term122987.getClass(), "type", 54);
        setField(term122987, term122987.getClass(), "first", null);
        setField(term122917, term122917.getClass(), "first", term122987);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term122917;
        args[1] = true;
        try {
            callMethod(klass, "check", argTypes, term122675, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


