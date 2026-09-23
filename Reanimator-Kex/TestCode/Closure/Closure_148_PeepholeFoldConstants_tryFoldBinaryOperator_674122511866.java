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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511866 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term200636;
     Object term200728;
     Object term201295;
     Object term201296;
     Object term201244;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511866() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term200636 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term200728 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term200814 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term200728, term200728.getClass(), "first", term200728);
        setField(term200728, term200728.getClass(), "next", term200814);
        setIntField(term200728, term200728.getClass(), "type", 33);
        term201295 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term201295, term201295.getClass(), "currentTraversal", null);
        term201296 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term201297 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term201296, term201296.getClass(), "number", 0.0);
        setIntField(term201296, term201296.getClass(), "type", 33);
        setField(term201297, term201297.getClass(), "functionName", null);
        setBooleanField(term201297, term201297.getClass(), "itsNeedsActivation", false);
        setIntField(term201297, term201297.getClass(), "itsFunctionType", 0);
        setBooleanField(term201297, term201297.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term201297, term201297.getClass(), "encodedSourceStart", 0);
        setIntField(term201297, term201297.getClass(), "encodedSourceEnd", 0);
        setField(term201297, term201297.getClass(), "sourceName", null);
        setIntField(term201297, term201297.getClass(), "baseLineno", 0);
        setIntField(term201297, term201297.getClass(), "endLineno", 0);
        setField(term201297, term201297.getClass(), "functions", null);
        setField(term201297, term201297.getClass(), "regexps", null);
        setField(term201297, term201297.getClass(), "itsVariables", null);
        setField(term201297, term201297.getClass(), "itsConst", null);
        setField(term201297, term201297.getClass(), "itsVariableNames", null);
        setIntField(term201297, term201297.getClass(), "varStart", 0);
        setField(term201297, term201297.getClass(), "compilerData", null);
        setIntField(term201297, term201297.getClass(), "type", 0);
        setField(term201297, term201297.getClass(), "next", null);
        setField(term201297, term201297.getClass(), "first", null);
        setField(term201297, term201297.getClass(), "last", null);
        setField(term201297, term201297.getClass(), "propListHead", null);
        setIntField(term201297, term201297.getClass(), "sourcePosition", 0);
        setField(term201297, term201297.getClass(), "jsType", null);
        setField(term201297, term201297.getClass(), "parent", null);
        setField(term201296, term201296.getClass(), "next", term201297);
        setField(term201296, term201296.getClass(), "first", term201296);
        setField(term201296, term201296.getClass(), "last", null);
        setField(term201296, term201296.getClass(), "propListHead", null);
        setIntField(term201296, term201296.getClass(), "sourcePosition", 0);
        setField(term201296, term201296.getClass(), "jsType", null);
        setField(term201296, term201296.getClass(), "parent", null);
        term201244 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term201247 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term201244, term201244.getClass(), "number", 0.0);
        setIntField(term201244, term201244.getClass(), "type", 33);
        setField(term201247, term201247.getClass(), "functionName", null);
        setBooleanField(term201247, term201247.getClass(), "itsNeedsActivation", false);
        setIntField(term201247, term201247.getClass(), "itsFunctionType", 0);
        setBooleanField(term201247, term201247.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term201247, term201247.getClass(), "encodedSourceStart", 0);
        setIntField(term201247, term201247.getClass(), "encodedSourceEnd", 0);
        setField(term201247, term201247.getClass(), "sourceName", null);
        setIntField(term201247, term201247.getClass(), "baseLineno", 0);
        setIntField(term201247, term201247.getClass(), "endLineno", 0);
        setField(term201247, term201247.getClass(), "functions", null);
        setField(term201247, term201247.getClass(), "regexps", null);
        setField(term201247, term201247.getClass(), "itsVariables", null);
        setField(term201247, term201247.getClass(), "itsConst", null);
        setField(term201247, term201247.getClass(), "itsVariableNames", null);
        setIntField(term201247, term201247.getClass(), "varStart", 0);
        setField(term201247, term201247.getClass(), "compilerData", null);
        setIntField(term201247, term201247.getClass(), "type", 0);
        setField(term201247, term201247.getClass(), "next", null);
        setField(term201247, term201247.getClass(), "first", null);
        setField(term201247, term201247.getClass(), "last", null);
        setField(term201247, term201247.getClass(), "propListHead", null);
        setIntField(term201247, term201247.getClass(), "sourcePosition", 0);
        setField(term201247, term201247.getClass(), "jsType", null);
        setField(term201247, term201247.getClass(), "parent", null);
        setField(term201244, term201244.getClass(), "next", term201247);
        setField(term201244, term201244.getClass(), "first", term201244);
        setField(term201244, term201244.getClass(), "last", null);
        setField(term201244, term201244.getClass(), "propListHead", null);
        setIntField(term201244, term201244.getClass(), "sourcePosition", 0);
        setField(term201244, term201244.getClass(), "jsType", null);
        setField(term201244, term201244.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term200728;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term200636, args);
        assertTrue(recursiveEquals(term200636, term201295));
        assertTrue(recursiveEquals(term200728, term201296));
        assertTrue(recursiveEquals(retValue, term201244));
    }

};


