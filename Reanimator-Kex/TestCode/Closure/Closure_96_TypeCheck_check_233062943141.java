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

public class TypeCheck_check_233062943141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71807;
     Object term72031;

    public TypeCheck_check_233062943141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71807 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term71887 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term71961 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term71807, term71807.getClass(), "compiler", term71887);
        setField(term71807, term71807.getClass(), "scopeCreator", null);
        setBooleanField(term71807, term71807.getClass(), "inExterns", false);
        setField(term71961, term71961.getClass(), "parent", null);
        setField(term71807, term71807.getClass(), "topScope", term71961);
        term72031 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term72101 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term72171 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term72031, term72031.getClass(), "type", 0);
        setField(term72101, term72101.getClass(), "next", term72171);
        setIntField(term72101, term72101.getClass(), "type", 89);
        setField(term72101, term72101.getClass(), "first", null);
        setField(term72031, term72031.getClass(), "first", term72101);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term72031;
        args[1] = true;
        try {
            callMethod(klass, "check", argTypes, term71807, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


