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

public class PeepholeSubstituteAlternateSyntax_isLowerPrecedenceInExpression_76775269078 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term927;
     Object term930;
     Object term957;

    public PeepholeSubstituteAlternateSyntax_isLowerPrecedenceInExpression_76775269078() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term927 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        setBooleanField(term927, term927.getClass(), "late", true);
        setIntField(term927, term927.getClass(), "STRING_SPLIT_OVERHEAD", -146054762);
        setField(term927, term927.getClass(), "compiler", null);
        term930 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term932 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term934 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term936 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term938 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term941 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term945 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term947 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term952 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term930, term930.getClass(), "type", 798043553);
        setIntField(term932, term932.getClass(), "type", 533197381);
        setIntField(term934, term934.getClass(), "type", 1048271679);
        setIntField(term936, term936.getClass(), "type", -1529797673);
        setIntField(term938, term938.getClass(), "type", -868676396);
        setField(term938, term938.getClass(), "next", null);
        setField(term938, term938.getClass(), "first", null);
        setField(term938, term938.getClass(), "last", null);
        setField(term938, term938.getClass(), "propListHead", null);
        setIntField(term938, term938.getClass(), "sourcePosition", 0);
        setField(term938, term938.getClass(), "jsType", null);
        setField(term938, term938.getClass(), "parent", null);
        setField(term936, term936.getClass(), "next", term938);
        setIntField(term941, term941.getClass(), "type", 1922684808);
        setField(term941, term941.getClass(), "next", null);
        setField(term941, term941.getClass(), "first", null);
        setField(term941, term941.getClass(), "last", term938);
        setField(term941, term941.getClass(), "propListHead", null);
        setIntField(term941, term941.getClass(), "sourcePosition", 0);
        setField(term941, term941.getClass(), "jsType", null);
        setField(term941, term941.getClass(), "parent", null);
        setField(term936, term936.getClass(), "first", term941);
        setField(term936, term936.getClass(), "last", term934);
        setField(term936, term936.getClass(), "propListHead", null);
        setIntField(term936, term936.getClass(), "sourcePosition", 0);
        setField(term936, term936.getClass(), "jsType", null);
        setField(term936, term936.getClass(), "parent", null);
        setField(term934, term934.getClass(), "next", term936);
        setField(term934, term934.getClass(), "first", term938);
        setIntField(term945, term945.getClass(), "type", -288604325);
        setIntField(term947, term947.getClass(), "type", -1268314569);
        setField(term947, term947.getClass(), "next", null);
        setField(term947, term947.getClass(), "first", term941);
        setField(term947, term947.getClass(), "last", term936);
        setField(term947, term947.getClass(), "propListHead", null);
        setIntField(term947, term947.getClass(), "sourcePosition", 0);
        setField(term947, term947.getClass(), "jsType", null);
        setField(term947, term947.getClass(), "parent", null);
        setField(term945, term945.getClass(), "next", term947);
        setField(term945, term945.getClass(), "first", term932);
        setField(term945, term945.getClass(), "last", term932);
        setField(term945, term945.getClass(), "propListHead", null);
        setIntField(term945, term945.getClass(), "sourcePosition", 0);
        setField(term945, term945.getClass(), "jsType", null);
        setField(term945, term945.getClass(), "parent", null);
        setField(term934, term934.getClass(), "last", term945);
        setField(term934, term934.getClass(), "propListHead", null);
        setIntField(term934, term934.getClass(), "sourcePosition", 0);
        setField(term934, term934.getClass(), "jsType", null);
        setField(term934, term934.getClass(), "parent", null);
        setField(term932, term932.getClass(), "next", term934);
        setIntField(term952, term952.getClass(), "type", 877649659);
        setField(term952, term952.getClass(), "next", term945);
        setField(term952, term952.getClass(), "first", term947);
        setField(term952, term952.getClass(), "last", term930);
        setField(term952, term952.getClass(), "propListHead", null);
        setIntField(term952, term952.getClass(), "sourcePosition", 0);
        setField(term952, term952.getClass(), "jsType", null);
        setField(term952, term952.getClass(), "parent", null);
        setField(term932, term932.getClass(), "first", term952);
        setField(term932, term932.getClass(), "last", term952);
        setField(term932, term932.getClass(), "propListHead", null);
        setIntField(term932, term932.getClass(), "sourcePosition", 0);
        setField(term932, term932.getClass(), "jsType", null);
        setField(term932, term932.getClass(), "parent", null);
        setField(term930, term930.getClass(), "next", term932);
        setField(term930, term930.getClass(), "first", term936);
        setField(term930, term930.getClass(), "last", term938);
        setField(term930, term930.getClass(), "propListHead", null);
        setIntField(term930, term930.getClass(), "sourcePosition", 0);
        setField(term930, term930.getClass(), "jsType", null);
        setField(term930, term930.getClass(), "parent", null);
        term957 = new Integer(-1332748804);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term930;
        args[1] = term957;
        try {
            callMethod(klass, "isLowerPrecedenceInExpression", argTypes, term927, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


