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

public class PeepholeFoldConstants_tryFoldAndOr_425870290368 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term74157;
     Object term74249;
     Object term74341;
     Object term74427;
     Object term74593;
     Object term74594;
     Object term74595;
     Object term74596;
     Object term74545;

    public PeepholeFoldConstants_tryFoldAndOr_425870290368() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term74157 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term74249 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term74249, term74249.getClass(), "parent", null);
        setIntField(term74249, term74249.getClass(), "type", 0);
        term74341 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term74341, term74341.getClass(), "type", 0);
        term74427 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term74593 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term74593, term74593.getClass(), "currentTraversal", null);
        term74594 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term74594, term74594.getClass(), "number", 0.0);
        setIntField(term74594, term74594.getClass(), "type", 0);
        setField(term74594, term74594.getClass(), "next", null);
        setField(term74594, term74594.getClass(), "first", null);
        setField(term74594, term74594.getClass(), "last", null);
        setField(term74594, term74594.getClass(), "propListHead", null);
        setIntField(term74594, term74594.getClass(), "sourcePosition", 0);
        setField(term74594, term74594.getClass(), "jsType", null);
        setField(term74594, term74594.getClass(), "parent", null);
        term74595 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term74595, term74595.getClass(), "number", 0.0);
        setIntField(term74595, term74595.getClass(), "type", 0);
        setField(term74595, term74595.getClass(), "next", null);
        setField(term74595, term74595.getClass(), "first", null);
        setField(term74595, term74595.getClass(), "last", null);
        setField(term74595, term74595.getClass(), "propListHead", null);
        setIntField(term74595, term74595.getClass(), "sourcePosition", 0);
        setField(term74595, term74595.getClass(), "jsType", null);
        setField(term74595, term74595.getClass(), "parent", null);
        term74596 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term74596, term74596.getClass(), "functionName", null);
        setBooleanField(term74596, term74596.getClass(), "itsNeedsActivation", false);
        setIntField(term74596, term74596.getClass(), "itsFunctionType", 0);
        setBooleanField(term74596, term74596.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term74596, term74596.getClass(), "encodedSourceStart", 0);
        setIntField(term74596, term74596.getClass(), "encodedSourceEnd", 0);
        setField(term74596, term74596.getClass(), "sourceName", null);
        setIntField(term74596, term74596.getClass(), "baseLineno", 0);
        setIntField(term74596, term74596.getClass(), "endLineno", 0);
        setField(term74596, term74596.getClass(), "functions", null);
        setField(term74596, term74596.getClass(), "regexps", null);
        setField(term74596, term74596.getClass(), "itsVariables", null);
        setField(term74596, term74596.getClass(), "itsConst", null);
        setField(term74596, term74596.getClass(), "itsVariableNames", null);
        setIntField(term74596, term74596.getClass(), "varStart", 0);
        setField(term74596, term74596.getClass(), "compilerData", null);
        setIntField(term74596, term74596.getClass(), "type", 0);
        setField(term74596, term74596.getClass(), "next", null);
        setField(term74596, term74596.getClass(), "first", null);
        setField(term74596, term74596.getClass(), "last", null);
        setField(term74596, term74596.getClass(), "propListHead", null);
        setIntField(term74596, term74596.getClass(), "sourcePosition", 0);
        setField(term74596, term74596.getClass(), "jsType", null);
        setField(term74596, term74596.getClass(), "parent", null);
        term74545 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term74545, term74545.getClass(), "number", 0.0);
        setIntField(term74545, term74545.getClass(), "type", 0);
        setField(term74545, term74545.getClass(), "next", null);
        setField(term74545, term74545.getClass(), "first", null);
        setField(term74545, term74545.getClass(), "last", null);
        setField(term74545, term74545.getClass(), "propListHead", null);
        setIntField(term74545, term74545.getClass(), "sourcePosition", 0);
        setField(term74545, term74545.getClass(), "jsType", null);
        setField(term74545, term74545.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term74249;
        args[1] = term74341;
        args[2] = term74427;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term74157, args);
        assertTrue(recursiveEquals(term74157, term74593));
        assertTrue(recursiveEquals(term74249, term74594));
        assertTrue(recursiveEquals(term74341, term74595));
        assertTrue(recursiveEquals(term74427, term74596));
        assertTrue(recursiveEquals(retValue, term74545));
    }

};


