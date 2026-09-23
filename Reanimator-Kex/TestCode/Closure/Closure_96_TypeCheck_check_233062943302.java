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

public class TypeCheck_check_233062943302 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term132726;
     Object term133048;

    public TypeCheck_check_233062943302() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term132726 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term132806 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term132904 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term132978 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term132726, term132726.getClass(), "compiler", term132806);
        setField(term132726, term132726.getClass(), "scopeCreator", term132904);
        setBooleanField(term132726, term132726.getClass(), "inExterns", false);
        setField(term132978, term132978.getClass(), "parent", null);
        setField(term132726, term132726.getClass(), "topScope", term132978);
        term133048 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term133118 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term133188 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term133258 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term133328 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term133048, term133048.getClass(), "type", 0);
        setField(term133258, term133258.getClass(), "next", term133328);
        setIntField(term133258, term133258.getClass(), "type", 59);
        setField(term133258, term133258.getClass(), "first", null);
        setField(term133188, term133188.getClass(), "next", term133258);
        setIntField(term133188, term133188.getClass(), "type", 108);
        setField(term133188, term133188.getClass(), "first", null);
        setField(term133118, term133118.getClass(), "next", term133188);
        setIntField(term133118, term133118.getClass(), "type", 130);
        setField(term133118, term133118.getClass(), "first", null);
        setField(term133048, term133048.getClass(), "first", term133118);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term133048;
        args[1] = true;
        callMethod(klass, "check", argTypes, term132726, args);
    }

};


