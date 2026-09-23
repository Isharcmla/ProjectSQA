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
import java.util.HashMap;

public class MustBeReachingVariableDef_isParameter_72313889120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term404;
     Object term422;

    public MustBeReachingVariableDef_isParameter_72313889120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term406 = new HashMap();
        term404 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        Object term405 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term414 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term418 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term405, term405.getClass(), "vars", term406);
        setField(term414, term414.getClass(), "vars", null);
        setField(term414, term414.getClass(), "parent", null);
        setIntField(term414, term414.getClass(), "depth", 0);
        setField(term414, term414.getClass(), "rootNode", null);
        setField(term414, term414.getClass(), "thisType", null);
        setBooleanField(term414, term414.getClass(), "isBottom", false);
        setField(term414, term414.getClass(), "arguments", null);
        setField(term405, term405.getClass(), "parent", term414);
        setIntField(term405, term405.getClass(), "depth", 71190297);
        setIntField(term418, term418.getClass(), "type", 0);
        setField(term418, term418.getClass(), "next", null);
        setField(term418, term418.getClass(), "first", null);
        setField(term418, term418.getClass(), "last", null);
        setField(term418, term418.getClass(), "propListHead", null);
        setIntField(term418, term418.getClass(), "sourcePosition", 0);
        setField(term418, term418.getClass(), "jsType", null);
        setField(term418, term418.getClass(), "parent", null);
        setField(term405, term405.getClass(), "rootNode", term418);
        setField(term405, term405.getClass(), "thisType", null);
        setBooleanField(term405, term405.getClass(), "isBottom", false);
        setField(term405, term405.getClass(), "arguments", null);
        setField(term404, term404.getClass(), "jsScope", term405);
        setField(term404, term404.getClass(), "compiler", null);
        setField(term404, term404.getClass(), "escaped", null);
        setField(term404, term404.getClass(), "cfg", null);
        setField(term404, term404.getClass(), "joinOp", null);
        setField(term404, term404.getClass(), "orderedWorkSet", null);
        term422 = newInstance(Class.forName("com.google.javascript.jscomp.Scope$Var"));
        Object term435 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term437 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term439 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term441 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term444 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term447 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term451 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term455 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term422, term422.getClass(), "name", "pCTimMblYc");
        setIntField(term435, term435.getClass(), "type", 1202361360);
        setIntField(term437, term437.getClass(), "type", -2015048153);
        setIntField(term439, term439.getClass(), "type", -2063457669);
        setIntField(term441, term441.getClass(), "type", -1222006000);
        setField(term441, term441.getClass(), "next", null);
        setField(term441, term441.getClass(), "first", null);
        setField(term441, term441.getClass(), "last", null);
        setField(term441, term441.getClass(), "propListHead", null);
        setIntField(term441, term441.getClass(), "sourcePosition", 0);
        setField(term441, term441.getClass(), "jsType", null);
        setField(term441, term441.getClass(), "parent", null);
        setField(term439, term439.getClass(), "next", term441);
        setIntField(term444, term444.getClass(), "type", 9726679);
        setField(term444, term444.getClass(), "next", null);
        setField(term444, term444.getClass(), "first", term435);
        setField(term444, term444.getClass(), "last", null);
        setField(term444, term444.getClass(), "propListHead", null);
        setIntField(term444, term444.getClass(), "sourcePosition", 0);
        setField(term444, term444.getClass(), "jsType", null);
        setField(term444, term444.getClass(), "parent", null);
        setField(term439, term439.getClass(), "first", term444);
        setIntField(term447, term447.getClass(), "type", -1565502840);
        setField(term447, term447.getClass(), "next", null);
        setField(term447, term447.getClass(), "first", term437);
        setField(term447, term447.getClass(), "last", null);
        setField(term447, term447.getClass(), "propListHead", null);
        setIntField(term447, term447.getClass(), "sourcePosition", 0);
        setField(term447, term447.getClass(), "jsType", null);
        setField(term447, term447.getClass(), "parent", null);
        setField(term439, term439.getClass(), "last", term447);
        setField(term439, term439.getClass(), "propListHead", null);
        setIntField(term439, term439.getClass(), "sourcePosition", 0);
        setField(term439, term439.getClass(), "jsType", null);
        setField(term439, term439.getClass(), "parent", null);
        setField(term437, term437.getClass(), "next", term439);
        setField(term437, term437.getClass(), "first", term439);
        setIntField(term451, term451.getClass(), "type", 2095798786);
        setField(term451, term451.getClass(), "next", term447);
        setField(term451, term451.getClass(), "first", term444);
        setField(term451, term451.getClass(), "last", term444);
        setField(term451, term451.getClass(), "propListHead", null);
        setIntField(term451, term451.getClass(), "sourcePosition", 0);
        setField(term451, term451.getClass(), "jsType", null);
        setField(term451, term451.getClass(), "parent", null);
        setField(term437, term437.getClass(), "last", term451);
        setField(term437, term437.getClass(), "propListHead", null);
        setIntField(term437, term437.getClass(), "sourcePosition", 0);
        setField(term437, term437.getClass(), "jsType", null);
        setField(term437, term437.getClass(), "parent", null);
        setField(term435, term435.getClass(), "next", term437);
        setField(term435, term435.getClass(), "first", term444);
        setIntField(term455, term455.getClass(), "type", 0);
        setField(term455, term455.getClass(), "next", null);
        setField(term455, term455.getClass(), "first", null);
        setField(term455, term455.getClass(), "last", null);
        setField(term455, term455.getClass(), "propListHead", null);
        setIntField(term455, term455.getClass(), "sourcePosition", 0);
        setField(term455, term455.getClass(), "jsType", null);
        setField(term455, term455.getClass(), "parent", null);
        setField(term435, term435.getClass(), "last", term455);
        setField(term435, term435.getClass(), "propListHead", null);
        setIntField(term435, term435.getClass(), "sourcePosition", 0);
        setField(term435, term435.getClass(), "jsType", null);
        setField(term435, term435.getClass(), "parent", null);
        setField(term422, term422.getClass(), "nameNode", term435);
        setField(term422, term422.getClass(), "type", null);
        setField(term422, term422.getClass(), "info", null);
        setBooleanField(term422, term422.getClass(), "typeInferred", false);
        setField(term422, term422.getClass(), "input", null);
        setBooleanField(term422, term422.getClass(), "isDefine", false);
        setIntField(term422, term422.getClass(), "index", 0);
        setField(term422, term422.getClass(), "scope", null);
        setBooleanField(term422, term422.getClass(), "markedEscaped", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.Scope$Var");
        Object[] args = new Object[1];
        args[0] = term422;
        try {
            callMethod(klass, "isParameter", argTypes, term404, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


