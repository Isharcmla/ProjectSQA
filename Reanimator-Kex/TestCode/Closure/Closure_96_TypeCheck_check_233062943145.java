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

public class TypeCheck_check_233062943145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73686;
     Object term73910;

    public TypeCheck_check_233062943145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term73686 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term73766 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term73840 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term73686, term73686.getClass(), "compiler", term73766);
        setField(term73686, term73686.getClass(), "scopeCreator", null);
        setBooleanField(term73686, term73686.getClass(), "inExterns", false);
        setField(term73840, term73840.getClass(), "parent", null);
        setField(term73686, term73686.getClass(), "topScope", term73840);
        term73910 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term73980 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term74050 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term73910, term73910.getClass(), "type", 0);
        setField(term73980, term73980.getClass(), "next", term74050);
        setIntField(term73980, term73980.getClass(), "type", 23);
        setField(term73980, term73980.getClass(), "first", null);
        setField(term73910, term73910.getClass(), "first", term73980);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term73910;
        args[1] = true;
        try {
            callMethod(klass, "check", argTypes, term73686, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


