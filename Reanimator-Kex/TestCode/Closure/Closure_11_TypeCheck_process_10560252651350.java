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

public class TypeCheck_process_10560252651350 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term407682;
     Object term407930;

    public TypeCheck_process_10560252651350() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term407682 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term407786 = newInstance(Class.forName("com.google.javascript.jscomp.MemoizedScopeCreator"));
        Object term407860 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term407682, term407682.getClass(), "scopeCreator", term407786);
        setField(term407860, term407860.getClass(), "parent", null);
        setField(term407682, term407682.getClass(), "topScope", term407860);
        setField(term407682, term407682.getClass(), "compiler", null);
        setBooleanField(term407682, term407682.getClass(), "inExterns", false);
        term407930 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term408000 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term407930, term407930.getClass(), "parent", term408000);
        setIntField(term407930, term407930.getClass(), "type", 97);
        setField(term407930, term407930.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term407930;
        try {
            callMethod(klass, "process", argTypes, term407682, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


