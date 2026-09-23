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

public class TypeCheck_process_10560252651026 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term284736;
     Object term284984;

    public TypeCheck_process_10560252651026() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term284736 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term284840 = newInstance(Class.forName("com.google.javascript.jscomp.MemoizedScopeCreator"));
        Object term284914 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term284736, term284736.getClass(), "scopeCreator", term284840);
        setField(term284914, term284914.getClass(), "parent", null);
        setField(term284736, term284736.getClass(), "topScope", term284914);
        setField(term284736, term284736.getClass(), "compiler", null);
        setBooleanField(term284736, term284736.getClass(), "inExterns", false);
        term284984 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term285054 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term284984, term284984.getClass(), "parent", term285054);
        setIntField(term284984, term284984.getClass(), "type", 87);
        setField(term284984, term284984.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term284984;
        try {
            callMethod(klass, "process", argTypes, term284736, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


