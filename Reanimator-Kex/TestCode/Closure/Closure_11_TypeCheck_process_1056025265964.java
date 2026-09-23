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

public class TypeCheck_process_1056025265964 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term259336;
     Object term259578;

    public TypeCheck_process_1056025265964() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term259336 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term259434 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term259508 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term259336, term259336.getClass(), "scopeCreator", term259434);
        setField(term259508, term259508.getClass(), "parent", null);
        setField(term259336, term259336.getClass(), "topScope", term259508);
        setField(term259336, term259336.getClass(), "compiler", null);
        setBooleanField(term259336, term259336.getClass(), "inExterns", false);
        term259578 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term259648 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term259578, term259578.getClass(), "parent", term259648);
        setIntField(term259578, term259578.getClass(), "type", 25);
        setField(term259578, term259578.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term259578;
        try {
            callMethod(klass, "process", argTypes, term259336, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


