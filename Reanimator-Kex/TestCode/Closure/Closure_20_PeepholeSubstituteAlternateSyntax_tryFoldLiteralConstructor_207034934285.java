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
import java.lang.IllegalArgumentException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class PeepholeSubstituteAlternateSyntax_tryFoldLiteralConstructor_207034934285 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1172;
     Object term1175;

    public PeepholeSubstituteAlternateSyntax_tryFoldLiteralConstructor_207034934285() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1172 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        setBooleanField(term1172, term1172.getClass(), "late", true);
        setIntField(term1172, term1172.getClass(), "STRING_SPLIT_OVERHEAD", 200252898);
        setField(term1172, term1172.getClass(), "compiler", null);
        term1175 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1177 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1179 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1181 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1183 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1186 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1190 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1192 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1197 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1175, term1175.getClass(), "type", -1831826725);
        setIntField(term1177, term1177.getClass(), "type", 752152965);
        setIntField(term1179, term1179.getClass(), "type", -1577069773);
        setIntField(term1181, term1181.getClass(), "type", -266625190);
        setIntField(term1183, term1183.getClass(), "type", 489201218);
        setField(term1183, term1183.getClass(), "next", null);
        setField(term1183, term1183.getClass(), "first", null);
        setField(term1183, term1183.getClass(), "last", null);
        setField(term1183, term1183.getClass(), "propListHead", null);
        setIntField(term1183, term1183.getClass(), "sourcePosition", 0);
        setField(term1183, term1183.getClass(), "jsType", null);
        setField(term1183, term1183.getClass(), "parent", null);
        setField(term1181, term1181.getClass(), "next", term1183);
        setIntField(term1186, term1186.getClass(), "type", 464181937);
        setField(term1186, term1186.getClass(), "next", null);
        setField(term1186, term1186.getClass(), "first", null);
        setField(term1186, term1186.getClass(), "last", term1183);
        setField(term1186, term1186.getClass(), "propListHead", null);
        setIntField(term1186, term1186.getClass(), "sourcePosition", 0);
        setField(term1186, term1186.getClass(), "jsType", null);
        setField(term1186, term1186.getClass(), "parent", null);
        setField(term1181, term1181.getClass(), "first", term1186);
        setField(term1181, term1181.getClass(), "last", term1179);
        setField(term1181, term1181.getClass(), "propListHead", null);
        setIntField(term1181, term1181.getClass(), "sourcePosition", 0);
        setField(term1181, term1181.getClass(), "jsType", null);
        setField(term1181, term1181.getClass(), "parent", null);
        setField(term1179, term1179.getClass(), "next", term1181);
        setField(term1179, term1179.getClass(), "first", term1183);
        setIntField(term1190, term1190.getClass(), "type", -941356098);
        setIntField(term1192, term1192.getClass(), "type", -201517446);
        setField(term1192, term1192.getClass(), "next", null);
        setField(term1192, term1192.getClass(), "first", term1186);
        setField(term1192, term1192.getClass(), "last", term1181);
        setField(term1192, term1192.getClass(), "propListHead", null);
        setIntField(term1192, term1192.getClass(), "sourcePosition", 0);
        setField(term1192, term1192.getClass(), "jsType", null);
        setField(term1192, term1192.getClass(), "parent", null);
        setField(term1190, term1190.getClass(), "next", term1192);
        setField(term1190, term1190.getClass(), "first", term1177);
        setField(term1190, term1190.getClass(), "last", term1177);
        setField(term1190, term1190.getClass(), "propListHead", null);
        setIntField(term1190, term1190.getClass(), "sourcePosition", 0);
        setField(term1190, term1190.getClass(), "jsType", null);
        setField(term1190, term1190.getClass(), "parent", null);
        setField(term1179, term1179.getClass(), "last", term1190);
        setField(term1179, term1179.getClass(), "propListHead", null);
        setIntField(term1179, term1179.getClass(), "sourcePosition", 0);
        setField(term1179, term1179.getClass(), "jsType", null);
        setField(term1179, term1179.getClass(), "parent", null);
        setField(term1177, term1177.getClass(), "next", term1179);
        setIntField(term1197, term1197.getClass(), "type", -97742366);
        setField(term1197, term1197.getClass(), "next", term1190);
        setField(term1197, term1197.getClass(), "first", term1192);
        setField(term1197, term1197.getClass(), "last", term1175);
        setField(term1197, term1197.getClass(), "propListHead", null);
        setIntField(term1197, term1197.getClass(), "sourcePosition", 0);
        setField(term1197, term1197.getClass(), "jsType", null);
        setField(term1197, term1197.getClass(), "parent", null);
        setField(term1177, term1177.getClass(), "first", term1197);
        setField(term1177, term1177.getClass(), "last", term1197);
        setField(term1177, term1177.getClass(), "propListHead", null);
        setIntField(term1177, term1177.getClass(), "sourcePosition", 0);
        setField(term1177, term1177.getClass(), "jsType", null);
        setField(term1177, term1177.getClass(), "parent", null);
        setField(term1175, term1175.getClass(), "next", term1177);
        setField(term1175, term1175.getClass(), "first", term1181);
        setField(term1175, term1175.getClass(), "last", term1183);
        setField(term1175, term1175.getClass(), "propListHead", null);
        setIntField(term1175, term1175.getClass(), "sourcePosition", 0);
        setField(term1175, term1175.getClass(), "jsType", null);
        setField(term1175, term1175.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1175;
        try {
            callMethod(klass, "tryFoldLiteralConstructor", argTypes, term1172, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


