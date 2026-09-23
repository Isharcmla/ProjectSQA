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

public class PeepholeSubstituteAlternateSyntax_tryFoldStandardConstructors_166188661128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term233;
     Object term235;

    public PeepholeSubstituteAlternateSyntax_tryFoldStandardConstructors_166188661128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term233 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        setBooleanField(term233, term233.getClass(), "late", false);
        setField(term233, term233.getClass(), "compiler", null);
        term235 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term237 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term239 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term241 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term243 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term246 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term250 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term252 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term257 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term235, term235.getClass(), "type", 972867650);
        setIntField(term237, term237.getClass(), "type", 1655935355);
        setIntField(term239, term239.getClass(), "type", -481533957);
        setIntField(term241, term241.getClass(), "type", 1240914516);
        setIntField(term243, term243.getClass(), "type", -1465035361);
        setField(term243, term243.getClass(), "next", null);
        setField(term243, term243.getClass(), "first", null);
        setField(term243, term243.getClass(), "last", null);
        setField(term243, term243.getClass(), "propListHead", null);
        setIntField(term243, term243.getClass(), "sourcePosition", 0);
        setField(term243, term243.getClass(), "jsType", null);
        setField(term243, term243.getClass(), "parent", null);
        setField(term241, term241.getClass(), "next", term243);
        setIntField(term246, term246.getClass(), "type", 1090617576);
        setField(term246, term246.getClass(), "next", null);
        setField(term246, term246.getClass(), "first", null);
        setField(term246, term246.getClass(), "last", term243);
        setField(term246, term246.getClass(), "propListHead", null);
        setIntField(term246, term246.getClass(), "sourcePosition", 0);
        setField(term246, term246.getClass(), "jsType", null);
        setField(term246, term246.getClass(), "parent", null);
        setField(term241, term241.getClass(), "first", term246);
        setField(term241, term241.getClass(), "last", term239);
        setField(term241, term241.getClass(), "propListHead", null);
        setIntField(term241, term241.getClass(), "sourcePosition", 0);
        setField(term241, term241.getClass(), "jsType", null);
        setField(term241, term241.getClass(), "parent", null);
        setField(term239, term239.getClass(), "next", term241);
        setField(term239, term239.getClass(), "first", term243);
        setIntField(term250, term250.getClass(), "type", 1442160736);
        setIntField(term252, term252.getClass(), "type", 1114000454);
        setField(term252, term252.getClass(), "next", null);
        setField(term252, term252.getClass(), "first", term246);
        setField(term252, term252.getClass(), "last", term241);
        setField(term252, term252.getClass(), "propListHead", null);
        setIntField(term252, term252.getClass(), "sourcePosition", 0);
        setField(term252, term252.getClass(), "jsType", null);
        setField(term252, term252.getClass(), "parent", null);
        setField(term250, term250.getClass(), "next", term252);
        setField(term250, term250.getClass(), "first", term237);
        setField(term250, term250.getClass(), "last", term237);
        setField(term250, term250.getClass(), "propListHead", null);
        setIntField(term250, term250.getClass(), "sourcePosition", 0);
        setField(term250, term250.getClass(), "jsType", null);
        setField(term250, term250.getClass(), "parent", null);
        setField(term239, term239.getClass(), "last", term250);
        setField(term239, term239.getClass(), "propListHead", null);
        setIntField(term239, term239.getClass(), "sourcePosition", 0);
        setField(term239, term239.getClass(), "jsType", null);
        setField(term239, term239.getClass(), "parent", null);
        setField(term237, term237.getClass(), "next", term239);
        setIntField(term257, term257.getClass(), "type", -556405712);
        setField(term257, term257.getClass(), "next", term250);
        setField(term257, term257.getClass(), "first", term252);
        setField(term257, term257.getClass(), "last", term235);
        setField(term257, term257.getClass(), "propListHead", null);
        setIntField(term257, term257.getClass(), "sourcePosition", 0);
        setField(term257, term257.getClass(), "jsType", null);
        setField(term257, term257.getClass(), "parent", null);
        setField(term237, term237.getClass(), "first", term257);
        setField(term237, term237.getClass(), "last", term257);
        setField(term237, term237.getClass(), "propListHead", null);
        setIntField(term237, term237.getClass(), "sourcePosition", 0);
        setField(term237, term237.getClass(), "jsType", null);
        setField(term237, term237.getClass(), "parent", null);
        setField(term235, term235.getClass(), "next", term237);
        setField(term235, term235.getClass(), "first", term241);
        setField(term235, term235.getClass(), "last", term243);
        setField(term235, term235.getClass(), "propListHead", null);
        setIntField(term235, term235.getClass(), "sourcePosition", 0);
        setField(term235, term235.getClass(), "jsType", null);
        setField(term235, term235.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term235;
        try {
            callMethod(klass, "tryFoldStandardConstructors", argTypes, term233, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


