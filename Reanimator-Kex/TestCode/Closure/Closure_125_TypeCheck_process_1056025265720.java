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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TypeCheck_process_1056025265720 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term191211;
     Object term191459;

    public TypeCheck_process_1056025265720() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term191211 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term191315 = newInstance(Class.forName("com.google.javascript.jscomp.MemoizedScopeCreator"));
        Object term191389 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term191211, term191211.getClass(), "scopeCreator", term191315);
        setField(term191211, term191211.getClass(), "topScope", term191389);
        term191459 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term191529 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term191459, term191459.getClass(), "parent", term191529);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term191459;
        callMethod(klass, "process", argTypes, term191211, args);
    }

};


