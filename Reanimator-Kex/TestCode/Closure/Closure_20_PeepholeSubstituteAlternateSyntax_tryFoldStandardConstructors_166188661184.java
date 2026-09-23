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

public class PeepholeSubstituteAlternateSyntax_tryFoldStandardConstructors_166188661184 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1142;
     Object term1145;

    public PeepholeSubstituteAlternateSyntax_tryFoldStandardConstructors_166188661184() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1142 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        setBooleanField(term1142, term1142.getClass(), "late", true);
        setIntField(term1142, term1142.getClass(), "STRING_SPLIT_OVERHEAD", 947897214);
        setField(term1142, term1142.getClass(), "compiler", null);
        term1145 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1147 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1149 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1151 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1153 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1156 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1160 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1162 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1167 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1145, term1145.getClass(), "type", 1496340209);
        setIntField(term1147, term1147.getClass(), "type", -1748391876);
        setIntField(term1149, term1149.getClass(), "type", 43258317);
        setIntField(term1151, term1151.getClass(), "type", 1707220033);
        setIntField(term1153, term1153.getClass(), "type", -1792504217);
        setField(term1153, term1153.getClass(), "next", null);
        setField(term1153, term1153.getClass(), "first", null);
        setField(term1153, term1153.getClass(), "last", null);
        setField(term1153, term1153.getClass(), "propListHead", null);
        setIntField(term1153, term1153.getClass(), "sourcePosition", 0);
        setField(term1153, term1153.getClass(), "jsType", null);
        setField(term1153, term1153.getClass(), "parent", null);
        setField(term1151, term1151.getClass(), "next", term1153);
        setIntField(term1156, term1156.getClass(), "type", 1824538861);
        setField(term1156, term1156.getClass(), "next", null);
        setField(term1156, term1156.getClass(), "first", null);
        setField(term1156, term1156.getClass(), "last", term1153);
        setField(term1156, term1156.getClass(), "propListHead", null);
        setIntField(term1156, term1156.getClass(), "sourcePosition", 0);
        setField(term1156, term1156.getClass(), "jsType", null);
        setField(term1156, term1156.getClass(), "parent", null);
        setField(term1151, term1151.getClass(), "first", term1156);
        setField(term1151, term1151.getClass(), "last", term1149);
        setField(term1151, term1151.getClass(), "propListHead", null);
        setIntField(term1151, term1151.getClass(), "sourcePosition", 0);
        setField(term1151, term1151.getClass(), "jsType", null);
        setField(term1151, term1151.getClass(), "parent", null);
        setField(term1149, term1149.getClass(), "next", term1151);
        setField(term1149, term1149.getClass(), "first", term1153);
        setIntField(term1160, term1160.getClass(), "type", 1501165033);
        setIntField(term1162, term1162.getClass(), "type", 510162332);
        setField(term1162, term1162.getClass(), "next", null);
        setField(term1162, term1162.getClass(), "first", term1156);
        setField(term1162, term1162.getClass(), "last", term1151);
        setField(term1162, term1162.getClass(), "propListHead", null);
        setIntField(term1162, term1162.getClass(), "sourcePosition", 0);
        setField(term1162, term1162.getClass(), "jsType", null);
        setField(term1162, term1162.getClass(), "parent", null);
        setField(term1160, term1160.getClass(), "next", term1162);
        setField(term1160, term1160.getClass(), "first", term1147);
        setField(term1160, term1160.getClass(), "last", term1147);
        setField(term1160, term1160.getClass(), "propListHead", null);
        setIntField(term1160, term1160.getClass(), "sourcePosition", 0);
        setField(term1160, term1160.getClass(), "jsType", null);
        setField(term1160, term1160.getClass(), "parent", null);
        setField(term1149, term1149.getClass(), "last", term1160);
        setField(term1149, term1149.getClass(), "propListHead", null);
        setIntField(term1149, term1149.getClass(), "sourcePosition", 0);
        setField(term1149, term1149.getClass(), "jsType", null);
        setField(term1149, term1149.getClass(), "parent", null);
        setField(term1147, term1147.getClass(), "next", term1149);
        setIntField(term1167, term1167.getClass(), "type", 888506903);
        setField(term1167, term1167.getClass(), "next", term1160);
        setField(term1167, term1167.getClass(), "first", term1162);
        setField(term1167, term1167.getClass(), "last", term1145);
        setField(term1167, term1167.getClass(), "propListHead", null);
        setIntField(term1167, term1167.getClass(), "sourcePosition", 0);
        setField(term1167, term1167.getClass(), "jsType", null);
        setField(term1167, term1167.getClass(), "parent", null);
        setField(term1147, term1147.getClass(), "first", term1167);
        setField(term1147, term1147.getClass(), "last", term1167);
        setField(term1147, term1147.getClass(), "propListHead", null);
        setIntField(term1147, term1147.getClass(), "sourcePosition", 0);
        setField(term1147, term1147.getClass(), "jsType", null);
        setField(term1147, term1147.getClass(), "parent", null);
        setField(term1145, term1145.getClass(), "next", term1147);
        setField(term1145, term1145.getClass(), "first", term1151);
        setField(term1145, term1145.getClass(), "last", term1153);
        setField(term1145, term1145.getClass(), "propListHead", null);
        setIntField(term1145, term1145.getClass(), "sourcePosition", 0);
        setField(term1145, term1145.getClass(), "jsType", null);
        setField(term1145, term1145.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1145;
        try {
            callMethod(klass, "tryFoldStandardConstructors", argTypes, term1142, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


