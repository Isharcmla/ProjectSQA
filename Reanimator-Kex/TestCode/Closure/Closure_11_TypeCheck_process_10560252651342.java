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

public class TypeCheck_process_10560252651342 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term401954;
     Object term402204;

    public TypeCheck_process_10560252651342() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term401954 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term402060 = newInstance(Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator"));
        Object term402134 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term401954, term401954.getClass(), "scopeCreator", term402060);
        setField(term402134, term402134.getClass(), "parent", null);
        setField(term401954, term401954.getClass(), "topScope", term402134);
        setField(term401954, term401954.getClass(), "compiler", null);
        setBooleanField(term401954, term401954.getClass(), "inExterns", false);
        term402204 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term402274 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term402204, term402204.getClass(), "parent", term402274);
        setIntField(term402204, term402204.getClass(), "type", 105);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term402204;
        try {
            callMethod(klass, "process", argTypes, term401954, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


