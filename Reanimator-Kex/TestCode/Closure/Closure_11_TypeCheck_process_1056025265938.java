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

public class TypeCheck_process_1056025265938 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term248863;
     Object term249113;

    public TypeCheck_process_1056025265938() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term248863 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term248969 = newInstance(Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator"));
        Object term249043 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term248863, term248863.getClass(), "scopeCreator", term248969);
        setField(term249043, term249043.getClass(), "parent", null);
        setField(term248863, term248863.getClass(), "topScope", term249043);
        setField(term248863, term248863.getClass(), "compiler", null);
        setBooleanField(term248863, term248863.getClass(), "inExterns", false);
        term249113 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term249183 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term249113, term249113.getClass(), "parent", term249183);
        setIntField(term249113, term249113.getClass(), "type", 98);
        setField(term249113, term249113.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term249113;
        try {
            callMethod(klass, "process", argTypes, term248863, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


