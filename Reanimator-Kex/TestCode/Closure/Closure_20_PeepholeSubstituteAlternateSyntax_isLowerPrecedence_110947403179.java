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
import java.lang.Integer;

public class PeepholeSubstituteAlternateSyntax_isLowerPrecedence_110947403179 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term959;
     Object term962;
     Object term989;

    public PeepholeSubstituteAlternateSyntax_isLowerPrecedence_110947403179() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term959 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        setBooleanField(term959, term959.getClass(), "late", true);
        setIntField(term959, term959.getClass(), "STRING_SPLIT_OVERHEAD", 1774507971);
        setField(term959, term959.getClass(), "compiler", null);
        term962 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term964 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term966 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term968 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term970 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term973 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term977 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term979 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term984 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term962, term962.getClass(), "type", -1420269858);
        setIntField(term964, term964.getClass(), "type", -2119545015);
        setIntField(term966, term966.getClass(), "type", 1272542218);
        setIntField(term968, term968.getClass(), "type", 1209799204);
        setIntField(term970, term970.getClass(), "type", 1094107751);
        setField(term970, term970.getClass(), "next", null);
        setField(term970, term970.getClass(), "first", null);
        setField(term970, term970.getClass(), "last", null);
        setField(term970, term970.getClass(), "propListHead", null);
        setIntField(term970, term970.getClass(), "sourcePosition", 0);
        setField(term970, term970.getClass(), "jsType", null);
        setField(term970, term970.getClass(), "parent", null);
        setField(term968, term968.getClass(), "next", term970);
        setIntField(term973, term973.getClass(), "type", 844222656);
        setField(term973, term973.getClass(), "next", null);
        setField(term973, term973.getClass(), "first", null);
        setField(term973, term973.getClass(), "last", term970);
        setField(term973, term973.getClass(), "propListHead", null);
        setIntField(term973, term973.getClass(), "sourcePosition", 0);
        setField(term973, term973.getClass(), "jsType", null);
        setField(term973, term973.getClass(), "parent", null);
        setField(term968, term968.getClass(), "first", term973);
        setField(term968, term968.getClass(), "last", term966);
        setField(term968, term968.getClass(), "propListHead", null);
        setIntField(term968, term968.getClass(), "sourcePosition", 0);
        setField(term968, term968.getClass(), "jsType", null);
        setField(term968, term968.getClass(), "parent", null);
        setField(term966, term966.getClass(), "next", term968);
        setField(term966, term966.getClass(), "first", term970);
        setIntField(term977, term977.getClass(), "type", -1813280137);
        setIntField(term979, term979.getClass(), "type", 719656595);
        setField(term979, term979.getClass(), "next", null);
        setField(term979, term979.getClass(), "first", term973);
        setField(term979, term979.getClass(), "last", term968);
        setField(term979, term979.getClass(), "propListHead", null);
        setIntField(term979, term979.getClass(), "sourcePosition", 0);
        setField(term979, term979.getClass(), "jsType", null);
        setField(term979, term979.getClass(), "parent", null);
        setField(term977, term977.getClass(), "next", term979);
        setField(term977, term977.getClass(), "first", term964);
        setField(term977, term977.getClass(), "last", term964);
        setField(term977, term977.getClass(), "propListHead", null);
        setIntField(term977, term977.getClass(), "sourcePosition", 0);
        setField(term977, term977.getClass(), "jsType", null);
        setField(term977, term977.getClass(), "parent", null);
        setField(term966, term966.getClass(), "last", term977);
        setField(term966, term966.getClass(), "propListHead", null);
        setIntField(term966, term966.getClass(), "sourcePosition", 0);
        setField(term966, term966.getClass(), "jsType", null);
        setField(term966, term966.getClass(), "parent", null);
        setField(term964, term964.getClass(), "next", term966);
        setIntField(term984, term984.getClass(), "type", -1516995753);
        setField(term984, term984.getClass(), "next", term977);
        setField(term984, term984.getClass(), "first", term979);
        setField(term984, term984.getClass(), "last", term962);
        setField(term984, term984.getClass(), "propListHead", null);
        setIntField(term984, term984.getClass(), "sourcePosition", 0);
        setField(term984, term984.getClass(), "jsType", null);
        setField(term984, term984.getClass(), "parent", null);
        setField(term964, term964.getClass(), "first", term984);
        setField(term964, term964.getClass(), "last", term984);
        setField(term964, term964.getClass(), "propListHead", null);
        setIntField(term964, term964.getClass(), "sourcePosition", 0);
        setField(term964, term964.getClass(), "jsType", null);
        setField(term964, term964.getClass(), "parent", null);
        setField(term962, term962.getClass(), "next", term964);
        setField(term962, term962.getClass(), "first", term968);
        setField(term962, term962.getClass(), "last", term970);
        setField(term962, term962.getClass(), "propListHead", null);
        setIntField(term962, term962.getClass(), "sourcePosition", 0);
        setField(term962, term962.getClass(), "jsType", null);
        setField(term962, term962.getClass(), "parent", null);
        term989 = new Integer(-390501023);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term962;
        args[1] = term989;
        try {
            callMethod(klass, "isLowerPrecedence", argTypes, term959, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


