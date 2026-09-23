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
import java.util.HashMap;
import java.lang.Object;

public class CodeGenerator_isIndirectEval_8291314679 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term630;
     Object term641;

    public CodeGenerator_isIndirectEval_8291314679() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term631 = new HashMap();
        term630 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term630, term630.getClass(), "ESCAPED_JS_STRINGS", term631);
        setField(term630, term630.getClass(), "cc", null);
        setField(term630, term630.getClass(), "outputCharsetEncoder", null);
        term641 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term643 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term645 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term648 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term651 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term655 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term658 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term641, term641.getClass(), "type", -117576464);
        setIntField(term643, term643.getClass(), "type", 865208305);
        setIntField(term645, term645.getClass(), "type", 0);
        setField(term645, term645.getClass(), "next", null);
        setField(term645, term645.getClass(), "first", null);
        setField(term645, term645.getClass(), "last", null);
        setField(term645, term645.getClass(), "propListHead", null);
        setIntField(term645, term645.getClass(), "sourcePosition", 0);
        setField(term645, term645.getClass(), "jsType", null);
        setField(term645, term645.getClass(), "parent", null);
        setField(term643, term643.getClass(), "next", term645);
        setIntField(term648, term648.getClass(), "type", 0);
        setField(term648, term648.getClass(), "next", null);
        setField(term648, term648.getClass(), "first", null);
        setField(term648, term648.getClass(), "last", null);
        setField(term648, term648.getClass(), "propListHead", null);
        setIntField(term648, term648.getClass(), "sourcePosition", 0);
        setField(term648, term648.getClass(), "jsType", null);
        setField(term648, term648.getClass(), "parent", null);
        setField(term643, term643.getClass(), "first", term648);
        setIntField(term651, term651.getClass(), "type", 0);
        setField(term651, term651.getClass(), "next", null);
        setField(term651, term651.getClass(), "first", null);
        setField(term651, term651.getClass(), "last", null);
        setField(term651, term651.getClass(), "propListHead", null);
        setIntField(term651, term651.getClass(), "sourcePosition", 0);
        setField(term651, term651.getClass(), "jsType", null);
        setField(term651, term651.getClass(), "parent", null);
        setField(term643, term643.getClass(), "last", term651);
        setField(term643, term643.getClass(), "propListHead", null);
        setIntField(term643, term643.getClass(), "sourcePosition", 0);
        setField(term643, term643.getClass(), "jsType", null);
        setField(term643, term643.getClass(), "parent", null);
        setField(term641, term641.getClass(), "next", term643);
        setIntField(term655, term655.getClass(), "type", 0);
        setField(term655, term655.getClass(), "next", null);
        setField(term655, term655.getClass(), "first", null);
        setField(term655, term655.getClass(), "last", null);
        setField(term655, term655.getClass(), "propListHead", null);
        setIntField(term655, term655.getClass(), "sourcePosition", 0);
        setField(term655, term655.getClass(), "jsType", null);
        setField(term655, term655.getClass(), "parent", null);
        setField(term641, term641.getClass(), "first", term655);
        setIntField(term658, term658.getClass(), "type", 0);
        setField(term658, term658.getClass(), "next", null);
        setField(term658, term658.getClass(), "first", null);
        setField(term658, term658.getClass(), "last", null);
        setField(term658, term658.getClass(), "propListHead", null);
        setIntField(term658, term658.getClass(), "sourcePosition", 0);
        setField(term658, term658.getClass(), "jsType", null);
        setField(term658, term658.getClass(), "parent", null);
        setField(term641, term641.getClass(), "last", term658);
        setField(term641, term641.getClass(), "propListHead", null);
        setIntField(term641, term641.getClass(), "sourcePosition", 0);
        setField(term641, term641.getClass(), "jsType", null);
        setField(term641, term641.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term641;
        callMethod(klass, "isIndirectEval", argTypes, term630, args);
    }

};


