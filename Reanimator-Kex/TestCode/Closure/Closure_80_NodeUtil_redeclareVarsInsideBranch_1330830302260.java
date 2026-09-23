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

public class NodeUtil_redeclareVarsInsideBranch_1330830302260 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2921;
     Object term17784;

    public NodeUtil_redeclareVarsInsideBranch_1330830302260() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2921 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2923 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2925 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2928 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2931 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2934 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2938 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2941 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2944 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term2921, term2921.getClass(), "type", 1505375686);
        setIntField(term2923, term2923.getClass(), "type", 444514470);
        setIntField(term2925, term2925.getClass(), "type", 0);
        setField(term2925, term2925.getClass(), "next", null);
        setField(term2925, term2925.getClass(), "first", null);
        setField(term2925, term2925.getClass(), "last", null);
        setField(term2925, term2925.getClass(), "propListHead", null);
        setIntField(term2925, term2925.getClass(), "sourcePosition", 0);
        setField(term2925, term2925.getClass(), "jsType", null);
        setField(term2925, term2925.getClass(), "parent", null);
        setField(term2923, term2923.getClass(), "next", term2925);
        setIntField(term2928, term2928.getClass(), "type", 0);
        setField(term2928, term2928.getClass(), "next", null);
        setField(term2928, term2928.getClass(), "first", null);
        setField(term2928, term2928.getClass(), "last", null);
        setField(term2928, term2928.getClass(), "propListHead", null);
        setIntField(term2928, term2928.getClass(), "sourcePosition", 0);
        setField(term2928, term2928.getClass(), "jsType", null);
        setField(term2928, term2928.getClass(), "parent", null);
        setField(term2923, term2923.getClass(), "first", term2928);
        setIntField(term2931, term2931.getClass(), "type", 0);
        setField(term2931, term2931.getClass(), "next", null);
        setField(term2931, term2931.getClass(), "first", null);
        setField(term2931, term2931.getClass(), "last", null);
        setField(term2931, term2931.getClass(), "propListHead", null);
        setIntField(term2931, term2931.getClass(), "sourcePosition", 0);
        setField(term2931, term2931.getClass(), "jsType", null);
        setField(term2931, term2931.getClass(), "parent", null);
        setField(term2923, term2923.getClass(), "last", term2931);
        setField(term2934, term2934.getClass(), "next", null);
        setIntField(term2934, term2934.getClass(), "type", 0);
        setIntField(term2934, term2934.getClass(), "intValue", 0);
        setField(term2934, term2934.getClass(), "objectValue", null);
        setField(term2923, term2923.getClass(), "propListHead", term2934);
        setIntField(term2923, term2923.getClass(), "sourcePosition", 961252909);
        setField(term2923, term2923.getClass(), "jsType", null);
        setField(term2923, term2923.getClass(), "parent", null);
        setField(term2921, term2921.getClass(), "next", term2923);
        setIntField(term2938, term2938.getClass(), "type", 0);
        setField(term2938, term2938.getClass(), "next", null);
        setField(term2938, term2938.getClass(), "first", null);
        setField(term2938, term2938.getClass(), "last", null);
        setField(term2938, term2938.getClass(), "propListHead", null);
        setIntField(term2938, term2938.getClass(), "sourcePosition", 0);
        setField(term2938, term2938.getClass(), "jsType", null);
        setField(term2938, term2938.getClass(), "parent", null);
        setField(term2921, term2921.getClass(), "first", term2938);
        setIntField(term2941, term2941.getClass(), "type", 0);
        setField(term2941, term2941.getClass(), "next", null);
        setField(term2941, term2941.getClass(), "first", null);
        setField(term2941, term2941.getClass(), "last", null);
        setField(term2941, term2941.getClass(), "propListHead", null);
        setIntField(term2941, term2941.getClass(), "sourcePosition", 0);
        setField(term2941, term2941.getClass(), "jsType", null);
        setField(term2941, term2941.getClass(), "parent", null);
        setField(term2921, term2921.getClass(), "last", term2941);
        setField(term2944, term2944.getClass(), "next", null);
        setIntField(term2944, term2944.getClass(), "type", 0);
        setIntField(term2944, term2944.getClass(), "intValue", 0);
        setField(term2944, term2944.getClass(), "objectValue", null);
        setField(term2921, term2921.getClass(), "propListHead", term2944);
        setIntField(term2921, term2921.getClass(), "sourcePosition", 1455842357);
        setField(term2921, term2921.getClass(), "jsType", null);
        setField(term2921, term2921.getClass(), "parent", null);
        term17784 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17785 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17786 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17787 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17788 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17789 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term17790 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17791 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17792 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term17784, term17784.getClass(), "type", 1505375686);
        setIntField(term17785, term17785.getClass(), "type", 444514470);
        setIntField(term17786, term17786.getClass(), "type", 0);
        setField(term17786, term17786.getClass(), "next", null);
        setField(term17786, term17786.getClass(), "first", null);
        setField(term17786, term17786.getClass(), "last", null);
        setField(term17786, term17786.getClass(), "propListHead", null);
        setIntField(term17786, term17786.getClass(), "sourcePosition", 0);
        setField(term17786, term17786.getClass(), "jsType", null);
        setField(term17786, term17786.getClass(), "parent", null);
        setField(term17785, term17785.getClass(), "next", term17786);
        setIntField(term17787, term17787.getClass(), "type", 0);
        setField(term17787, term17787.getClass(), "next", null);
        setField(term17787, term17787.getClass(), "first", null);
        setField(term17787, term17787.getClass(), "last", null);
        setField(term17787, term17787.getClass(), "propListHead", null);
        setIntField(term17787, term17787.getClass(), "sourcePosition", 0);
        setField(term17787, term17787.getClass(), "jsType", null);
        setField(term17787, term17787.getClass(), "parent", null);
        setField(term17785, term17785.getClass(), "first", term17787);
        setIntField(term17788, term17788.getClass(), "type", 0);
        setField(term17788, term17788.getClass(), "next", null);
        setField(term17788, term17788.getClass(), "first", null);
        setField(term17788, term17788.getClass(), "last", null);
        setField(term17788, term17788.getClass(), "propListHead", null);
        setIntField(term17788, term17788.getClass(), "sourcePosition", 0);
        setField(term17788, term17788.getClass(), "jsType", null);
        setField(term17788, term17788.getClass(), "parent", null);
        setField(term17785, term17785.getClass(), "last", term17788);
        setField(term17789, term17789.getClass(), "next", null);
        setIntField(term17789, term17789.getClass(), "type", 0);
        setIntField(term17789, term17789.getClass(), "intValue", 0);
        setField(term17789, term17789.getClass(), "objectValue", null);
        setField(term17785, term17785.getClass(), "propListHead", term17789);
        setIntField(term17785, term17785.getClass(), "sourcePosition", 961252909);
        setField(term17785, term17785.getClass(), "jsType", null);
        setField(term17785, term17785.getClass(), "parent", null);
        setField(term17784, term17784.getClass(), "next", term17785);
        setIntField(term17790, term17790.getClass(), "type", 0);
        setField(term17790, term17790.getClass(), "next", null);
        setField(term17790, term17790.getClass(), "first", null);
        setField(term17790, term17790.getClass(), "last", null);
        setField(term17790, term17790.getClass(), "propListHead", null);
        setIntField(term17790, term17790.getClass(), "sourcePosition", 0);
        setField(term17790, term17790.getClass(), "jsType", null);
        setField(term17790, term17790.getClass(), "parent", null);
        setField(term17784, term17784.getClass(), "first", term17790);
        setIntField(term17791, term17791.getClass(), "type", 0);
        setField(term17791, term17791.getClass(), "next", null);
        setField(term17791, term17791.getClass(), "first", null);
        setField(term17791, term17791.getClass(), "last", null);
        setField(term17791, term17791.getClass(), "propListHead", null);
        setIntField(term17791, term17791.getClass(), "sourcePosition", 0);
        setField(term17791, term17791.getClass(), "jsType", null);
        setField(term17791, term17791.getClass(), "parent", null);
        setField(term17784, term17784.getClass(), "last", term17791);
        setField(term17792, term17792.getClass(), "next", null);
        setIntField(term17792, term17792.getClass(), "type", 0);
        setIntField(term17792, term17792.getClass(), "intValue", 0);
        setField(term17792, term17792.getClass(), "objectValue", null);
        setField(term17784, term17784.getClass(), "propListHead", term17792);
        setIntField(term17784, term17784.getClass(), "sourcePosition", 1455842357);
        setField(term17784, term17784.getClass(), "jsType", null);
        setField(term17784, term17784.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2921;
        callMethod(klass, "redeclareVarsInsideBranch", argTypes, null, args);
        assertTrue(recursiveEquals(term2921, term17784));
    }

};


