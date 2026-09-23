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

public class TypeCheck_check_233062943147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term74262;
     Object term74510;

    public TypeCheck_check_233062943147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term74262 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term74366 = newInstance(Class.forName("com.google.javascript.jscomp.MemoizedScopeCreator"));
        Object term74440 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term74262, term74262.getClass(), "compiler", null);
        setField(term74262, term74262.getClass(), "scopeCreator", term74366);
        setBooleanField(term74262, term74262.getClass(), "inExterns", false);
        setField(term74440, term74440.getClass(), "parent", null);
        setField(term74262, term74262.getClass(), "topScope", term74440);
        term74510 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term74580 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term74650 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term74510, term74510.getClass(), "type", 0);
        setField(term74580, term74580.getClass(), "next", term74650);
        setIntField(term74580, term74580.getClass(), "type", 24);
        setField(term74580, term74580.getClass(), "first", null);
        setField(term74510, term74510.getClass(), "first", term74580);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term74510;
        args[1] = true;
        try {
            callMethod(klass, "check", argTypes, term74262, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


