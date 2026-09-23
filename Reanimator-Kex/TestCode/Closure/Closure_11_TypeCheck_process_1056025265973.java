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

public class TypeCheck_process_1056025265973 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term261893;
     Object term262135;

    public TypeCheck_process_1056025265973() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term261893 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term261991 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term262065 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term261893, term261893.getClass(), "scopeCreator", term261991);
        setField(term262065, term262065.getClass(), "parent", null);
        setField(term261893, term261893.getClass(), "topScope", term262065);
        setField(term261893, term261893.getClass(), "compiler", null);
        setBooleanField(term261893, term261893.getClass(), "inExterns", false);
        term262135 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term262205 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term262135, term262135.getClass(), "parent", term262205);
        setIntField(term262135, term262135.getClass(), "type", 85);
        setField(term262135, term262135.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term262135;
        try {
            callMethod(klass, "process", argTypes, term261893, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


