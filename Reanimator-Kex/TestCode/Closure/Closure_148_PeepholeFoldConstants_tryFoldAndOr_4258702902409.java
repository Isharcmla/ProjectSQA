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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902409 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term670540;
     Object term670626;
     Object term670782;
     Object term670868;
     Object term671519;
     Object term671520;
     Object term671522;
     Object term671523;
     Object term671428;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902409() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term670540 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term670626 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term670696 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term670696, term670696.getClass(), "type", 108);
        setField(term670626, term670626.getClass(), "parent", term670696);
        setIntField(term670626, term670626.getClass(), "type", 0);
        term670782 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term670782, term670782.getClass(), "type", 121);
        term670868 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term670868, term670868.getClass(), "type", 44);
        term671519 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term671519, term671519.getClass(), "currentTraversal", null);
        term671520 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term671521 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term671520, term671520.getClass(), "functionName", null);
        setBooleanField(term671520, term671520.getClass(), "itsNeedsActivation", false);
        setIntField(term671520, term671520.getClass(), "itsFunctionType", 0);
        setBooleanField(term671520, term671520.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term671520, term671520.getClass(), "encodedSourceStart", 0);
        setIntField(term671520, term671520.getClass(), "encodedSourceEnd", 0);
        setField(term671520, term671520.getClass(), "sourceName", null);
        setIntField(term671520, term671520.getClass(), "baseLineno", 0);
        setIntField(term671520, term671520.getClass(), "endLineno", 0);
        setField(term671520, term671520.getClass(), "functions", null);
        setField(term671520, term671520.getClass(), "regexps", null);
        setField(term671520, term671520.getClass(), "itsVariables", null);
        setField(term671520, term671520.getClass(), "itsConst", null);
        setField(term671520, term671520.getClass(), "itsVariableNames", null);
        setIntField(term671520, term671520.getClass(), "varStart", 0);
        setField(term671520, term671520.getClass(), "compilerData", null);
        setIntField(term671520, term671520.getClass(), "type", 0);
        setField(term671520, term671520.getClass(), "next", null);
        setField(term671520, term671520.getClass(), "first", null);
        setField(term671520, term671520.getClass(), "last", null);
        setField(term671520, term671520.getClass(), "propListHead", null);
        setIntField(term671520, term671520.getClass(), "sourcePosition", 0);
        setField(term671520, term671520.getClass(), "jsType", null);
        setIntField(term671521, term671521.getClass(), "type", 108);
        setField(term671521, term671521.getClass(), "next", null);
        setField(term671521, term671521.getClass(), "first", null);
        setField(term671521, term671521.getClass(), "last", null);
        setField(term671521, term671521.getClass(), "propListHead", null);
        setIntField(term671521, term671521.getClass(), "sourcePosition", 0);
        setField(term671521, term671521.getClass(), "jsType", null);
        setField(term671521, term671521.getClass(), "parent", null);
        setField(term671520, term671520.getClass(), "parent", term671521);
        term671522 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term671522, term671522.getClass(), "functionName", null);
        setBooleanField(term671522, term671522.getClass(), "itsNeedsActivation", false);
        setIntField(term671522, term671522.getClass(), "itsFunctionType", 0);
        setBooleanField(term671522, term671522.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term671522, term671522.getClass(), "encodedSourceStart", 0);
        setIntField(term671522, term671522.getClass(), "encodedSourceEnd", 0);
        setField(term671522, term671522.getClass(), "sourceName", null);
        setIntField(term671522, term671522.getClass(), "baseLineno", 0);
        setIntField(term671522, term671522.getClass(), "endLineno", 0);
        setField(term671522, term671522.getClass(), "functions", null);
        setField(term671522, term671522.getClass(), "regexps", null);
        setField(term671522, term671522.getClass(), "itsVariables", null);
        setField(term671522, term671522.getClass(), "itsConst", null);
        setField(term671522, term671522.getClass(), "itsVariableNames", null);
        setIntField(term671522, term671522.getClass(), "varStart", 0);
        setField(term671522, term671522.getClass(), "compilerData", null);
        setIntField(term671522, term671522.getClass(), "type", 121);
        setField(term671522, term671522.getClass(), "next", null);
        setField(term671522, term671522.getClass(), "first", null);
        setField(term671522, term671522.getClass(), "last", null);
        setField(term671522, term671522.getClass(), "propListHead", null);
        setIntField(term671522, term671522.getClass(), "sourcePosition", 0);
        setField(term671522, term671522.getClass(), "jsType", null);
        setField(term671522, term671522.getClass(), "parent", null);
        term671523 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term671523, term671523.getClass(), "functionName", null);
        setBooleanField(term671523, term671523.getClass(), "itsNeedsActivation", false);
        setIntField(term671523, term671523.getClass(), "itsFunctionType", 0);
        setBooleanField(term671523, term671523.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term671523, term671523.getClass(), "encodedSourceStart", 0);
        setIntField(term671523, term671523.getClass(), "encodedSourceEnd", 0);
        setField(term671523, term671523.getClass(), "sourceName", null);
        setIntField(term671523, term671523.getClass(), "baseLineno", 0);
        setIntField(term671523, term671523.getClass(), "endLineno", 0);
        setField(term671523, term671523.getClass(), "functions", null);
        setField(term671523, term671523.getClass(), "regexps", null);
        setField(term671523, term671523.getClass(), "itsVariables", null);
        setField(term671523, term671523.getClass(), "itsConst", null);
        setField(term671523, term671523.getClass(), "itsVariableNames", null);
        setIntField(term671523, term671523.getClass(), "varStart", 0);
        setField(term671523, term671523.getClass(), "compilerData", null);
        setIntField(term671523, term671523.getClass(), "type", 44);
        setField(term671523, term671523.getClass(), "next", null);
        setField(term671523, term671523.getClass(), "first", null);
        setField(term671523, term671523.getClass(), "last", null);
        setField(term671523, term671523.getClass(), "propListHead", null);
        setIntField(term671523, term671523.getClass(), "sourcePosition", 0);
        setField(term671523, term671523.getClass(), "jsType", null);
        setField(term671523, term671523.getClass(), "parent", null);
        term671428 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term671439 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term671428, term671428.getClass(), "functionName", null);
        setBooleanField(term671428, term671428.getClass(), "itsNeedsActivation", false);
        setIntField(term671428, term671428.getClass(), "itsFunctionType", 0);
        setBooleanField(term671428, term671428.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term671428, term671428.getClass(), "encodedSourceStart", 0);
        setIntField(term671428, term671428.getClass(), "encodedSourceEnd", 0);
        setField(term671428, term671428.getClass(), "sourceName", null);
        setIntField(term671428, term671428.getClass(), "baseLineno", 0);
        setIntField(term671428, term671428.getClass(), "endLineno", 0);
        setField(term671428, term671428.getClass(), "functions", null);
        setField(term671428, term671428.getClass(), "regexps", null);
        setField(term671428, term671428.getClass(), "itsVariables", null);
        setField(term671428, term671428.getClass(), "itsConst", null);
        setField(term671428, term671428.getClass(), "itsVariableNames", null);
        setIntField(term671428, term671428.getClass(), "varStart", 0);
        setField(term671428, term671428.getClass(), "compilerData", null);
        setIntField(term671428, term671428.getClass(), "type", 0);
        setField(term671428, term671428.getClass(), "next", null);
        setField(term671428, term671428.getClass(), "first", null);
        setField(term671428, term671428.getClass(), "last", null);
        setField(term671428, term671428.getClass(), "propListHead", null);
        setIntField(term671428, term671428.getClass(), "sourcePosition", 0);
        setField(term671428, term671428.getClass(), "jsType", null);
        setIntField(term671439, term671439.getClass(), "type", 108);
        setField(term671439, term671439.getClass(), "next", null);
        setField(term671439, term671439.getClass(), "first", null);
        setField(term671439, term671439.getClass(), "last", null);
        setField(term671439, term671439.getClass(), "propListHead", null);
        setIntField(term671439, term671439.getClass(), "sourcePosition", 0);
        setField(term671439, term671439.getClass(), "jsType", null);
        setField(term671439, term671439.getClass(), "parent", null);
        setField(term671428, term671428.getClass(), "parent", term671439);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term670626;
        args[1] = term670782;
        args[2] = term670868;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term670540, args);
        assertTrue(recursiveEquals(term670540, term671519));
        assertTrue(recursiveEquals(term670626, term671520));
        assertTrue(recursiveEquals(term670782, term671522));
        assertTrue(recursiveEquals(term670868, term671523));
        assertTrue(recursiveEquals(retValue, term671428));
    }

};


