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

public class TypeCheck_check_233062943217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98198;
     Object term98526;

    public TypeCheck_check_233062943217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term98198 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term98278 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term98382 = newInstance(Class.forName("com.google.javascript.jscomp.MemoizedScopeCreator"));
        Object term98456 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term98198, term98198.getClass(), "compiler", term98278);
        setField(term98198, term98198.getClass(), "scopeCreator", term98382);
        setBooleanField(term98198, term98198.getClass(), "inExterns", false);
        setField(term98456, term98456.getClass(), "parent", null);
        setField(term98198, term98198.getClass(), "topScope", term98456);
        term98526 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term98596 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term98666 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term98526, term98526.getClass(), "type", 0);
        setField(term98596, term98596.getClass(), "next", term98666);
        setIntField(term98596, term98596.getClass(), "type", 77);
        setField(term98596, term98596.getClass(), "first", null);
        setField(term98526, term98526.getClass(), "first", term98596);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term98526;
        args[1] = true;
        try {
            callMethod(klass, "check", argTypes, term98198, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


