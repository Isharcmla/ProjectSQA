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
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.lang.Object;

public class PeepholeFoldConstants_tryReduceVoid_94254671577 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13744;
     Object term13904;
     Object term14259;
     Object term14261;
     Object term14232;

    public PeepholeFoldConstants_tryReduceVoid_94254671577() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13744 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        Object term13834 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term13834, term13834.getClass(), "compiler", null);
        setField(term13744, term13744.getClass(), "currentTraversal", term13834);
        term13904 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13974 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term13974, term13974.getClass(), "type", 109);
        setField(term13904, term13904.getClass(), "first", term13974);
        setIntField(term13904, term13904.getClass(), "type", 109);
        term14259 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        Object term14260 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term14260, term14260.getClass(), "compiler", null);
        setField(term14260, term14260.getClass(), "callback", null);
        setField(term14260, term14260.getClass(), "curNode", null);
        setField(term14260, term14260.getClass(), "scopes", null);
        setField(term14260, term14260.getClass(), "scopeRoots", null);
        setField(term14260, term14260.getClass(), "cfgs", null);
        setField(term14260, term14260.getClass(), "sourceName", null);
        setField(term14260, term14260.getClass(), "scopeCreator", null);
        setField(term14260, term14260.getClass(), "scopeCallback", null);
        setField(term14259, term14259.getClass(), "currentTraversal", term14260);
        term14261 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14262 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term14261, term14261.getClass(), "type", 109);
        setField(term14261, term14261.getClass(), "next", null);
        setIntField(term14262, term14262.getClass(), "type", 109);
        setField(term14262, term14262.getClass(), "next", null);
        setField(term14262, term14262.getClass(), "first", null);
        setField(term14262, term14262.getClass(), "last", null);
        setField(term14262, term14262.getClass(), "propListHead", null);
        setIntField(term14262, term14262.getClass(), "sourcePosition", 0);
        setField(term14262, term14262.getClass(), "jsType", null);
        setField(term14262, term14262.getClass(), "parent", null);
        setField(term14261, term14261.getClass(), "first", term14262);
        setField(term14261, term14261.getClass(), "last", null);
        setField(term14261, term14261.getClass(), "propListHead", null);
        setIntField(term14261, term14261.getClass(), "sourcePosition", 0);
        setField(term14261, term14261.getClass(), "jsType", null);
        setField(term14261, term14261.getClass(), "parent", null);
        term14232 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14234 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term14232, term14232.getClass(), "type", 109);
        setField(term14232, term14232.getClass(), "next", null);
        setIntField(term14234, term14234.getClass(), "type", 109);
        setField(term14234, term14234.getClass(), "next", null);
        setField(term14234, term14234.getClass(), "first", null);
        setField(term14234, term14234.getClass(), "last", null);
        setField(term14234, term14234.getClass(), "propListHead", null);
        setIntField(term14234, term14234.getClass(), "sourcePosition", 0);
        setField(term14234, term14234.getClass(), "jsType", null);
        setField(term14234, term14234.getClass(), "parent", null);
        setField(term14232, term14232.getClass(), "first", term14234);
        setField(term14232, term14232.getClass(), "last", null);
        setField(term14232, term14232.getClass(), "propListHead", null);
        setIntField(term14232, term14232.getClass(), "sourcePosition", 0);
        setField(term14232, term14232.getClass(), "jsType", null);
        setField(term14232, term14232.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term13904;
        Object retValue = callMethod(klass, "tryReduceVoid", argTypes, term13744, args);
        assertTrue(recursiveEquals(term13744, term14259));
        assertTrue(recursiveEquals(term13904, term14261));
        assertTrue(recursiveEquals(retValue, term14232));
    }

};


