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

public class TypeCheck_process_10560252651540 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term482870;
     Object term483112;

    public TypeCheck_process_10560252651540() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term482870 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term482968 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term483042 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term482870, term482870.getClass(), "scopeCreator", term482968);
        setField(term483042, term483042.getClass(), "parent", null);
        setField(term482870, term482870.getClass(), "topScope", term483042);
        setField(term482870, term482870.getClass(), "compiler", null);
        setBooleanField(term482870, term482870.getClass(), "inExterns", false);
        term483112 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term483182 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term483112, term483112.getClass(), "parent", term483182);
        setIntField(term483112, term483112.getClass(), "type", 107);
        setField(term483112, term483112.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term483112;
        try {
            callMethod(klass, "process", argTypes, term482870, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


