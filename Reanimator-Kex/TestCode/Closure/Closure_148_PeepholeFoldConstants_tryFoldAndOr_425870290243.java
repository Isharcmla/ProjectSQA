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

public class PeepholeFoldConstants_tryFoldAndOr_425870290243 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45908;
     Object term45994;
     Object term46086;
     Object term46172;
     Object term46669;
     Object term46670;
     Object term46671;
     Object term46672;
     Object term46614;

    public PeepholeFoldConstants_tryFoldAndOr_425870290243() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45908 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term45994 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term45994, term45994.getClass(), "parent", null);
        setIntField(term45994, term45994.getClass(), "type", 0);
        term46086 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term46086, term46086.getClass(), "type", 0);
        term46172 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term46669 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term46669, term46669.getClass(), "currentTraversal", null);
        term46670 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term46670, term46670.getClass(), "functionName", null);
        setBooleanField(term46670, term46670.getClass(), "itsNeedsActivation", false);
        setIntField(term46670, term46670.getClass(), "itsFunctionType", 0);
        setBooleanField(term46670, term46670.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term46670, term46670.getClass(), "encodedSourceStart", 0);
        setIntField(term46670, term46670.getClass(), "encodedSourceEnd", 0);
        setField(term46670, term46670.getClass(), "sourceName", null);
        setIntField(term46670, term46670.getClass(), "baseLineno", 0);
        setIntField(term46670, term46670.getClass(), "endLineno", 0);
        setField(term46670, term46670.getClass(), "functions", null);
        setField(term46670, term46670.getClass(), "regexps", null);
        setField(term46670, term46670.getClass(), "itsVariables", null);
        setField(term46670, term46670.getClass(), "itsConst", null);
        setField(term46670, term46670.getClass(), "itsVariableNames", null);
        setIntField(term46670, term46670.getClass(), "varStart", 0);
        setField(term46670, term46670.getClass(), "compilerData", null);
        setIntField(term46670, term46670.getClass(), "type", 0);
        setField(term46670, term46670.getClass(), "next", null);
        setField(term46670, term46670.getClass(), "first", null);
        setField(term46670, term46670.getClass(), "last", null);
        setField(term46670, term46670.getClass(), "propListHead", null);
        setIntField(term46670, term46670.getClass(), "sourcePosition", 0);
        setField(term46670, term46670.getClass(), "jsType", null);
        setField(term46670, term46670.getClass(), "parent", null);
        term46671 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term46671, term46671.getClass(), "number", 0.0);
        setIntField(term46671, term46671.getClass(), "type", 0);
        setField(term46671, term46671.getClass(), "next", null);
        setField(term46671, term46671.getClass(), "first", null);
        setField(term46671, term46671.getClass(), "last", null);
        setField(term46671, term46671.getClass(), "propListHead", null);
        setIntField(term46671, term46671.getClass(), "sourcePosition", 0);
        setField(term46671, term46671.getClass(), "jsType", null);
        setField(term46671, term46671.getClass(), "parent", null);
        term46672 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term46672, term46672.getClass(), "functionName", null);
        setBooleanField(term46672, term46672.getClass(), "itsNeedsActivation", false);
        setIntField(term46672, term46672.getClass(), "itsFunctionType", 0);
        setBooleanField(term46672, term46672.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term46672, term46672.getClass(), "encodedSourceStart", 0);
        setIntField(term46672, term46672.getClass(), "encodedSourceEnd", 0);
        setField(term46672, term46672.getClass(), "sourceName", null);
        setIntField(term46672, term46672.getClass(), "baseLineno", 0);
        setIntField(term46672, term46672.getClass(), "endLineno", 0);
        setField(term46672, term46672.getClass(), "functions", null);
        setField(term46672, term46672.getClass(), "regexps", null);
        setField(term46672, term46672.getClass(), "itsVariables", null);
        setField(term46672, term46672.getClass(), "itsConst", null);
        setField(term46672, term46672.getClass(), "itsVariableNames", null);
        setIntField(term46672, term46672.getClass(), "varStart", 0);
        setField(term46672, term46672.getClass(), "compilerData", null);
        setIntField(term46672, term46672.getClass(), "type", 0);
        setField(term46672, term46672.getClass(), "next", null);
        setField(term46672, term46672.getClass(), "first", null);
        setField(term46672, term46672.getClass(), "last", null);
        setField(term46672, term46672.getClass(), "propListHead", null);
        setIntField(term46672, term46672.getClass(), "sourcePosition", 0);
        setField(term46672, term46672.getClass(), "jsType", null);
        setField(term46672, term46672.getClass(), "parent", null);
        term46614 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term46614, term46614.getClass(), "functionName", null);
        setBooleanField(term46614, term46614.getClass(), "itsNeedsActivation", false);
        setIntField(term46614, term46614.getClass(), "itsFunctionType", 0);
        setBooleanField(term46614, term46614.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term46614, term46614.getClass(), "encodedSourceStart", 0);
        setIntField(term46614, term46614.getClass(), "encodedSourceEnd", 0);
        setField(term46614, term46614.getClass(), "sourceName", null);
        setIntField(term46614, term46614.getClass(), "baseLineno", 0);
        setIntField(term46614, term46614.getClass(), "endLineno", 0);
        setField(term46614, term46614.getClass(), "functions", null);
        setField(term46614, term46614.getClass(), "regexps", null);
        setField(term46614, term46614.getClass(), "itsVariables", null);
        setField(term46614, term46614.getClass(), "itsConst", null);
        setField(term46614, term46614.getClass(), "itsVariableNames", null);
        setIntField(term46614, term46614.getClass(), "varStart", 0);
        setField(term46614, term46614.getClass(), "compilerData", null);
        setIntField(term46614, term46614.getClass(), "type", 0);
        setField(term46614, term46614.getClass(), "next", null);
        setField(term46614, term46614.getClass(), "first", null);
        setField(term46614, term46614.getClass(), "last", null);
        setField(term46614, term46614.getClass(), "propListHead", null);
        setIntField(term46614, term46614.getClass(), "sourcePosition", 0);
        setField(term46614, term46614.getClass(), "jsType", null);
        setField(term46614, term46614.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term45994;
        args[1] = term46086;
        args[2] = term46172;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term45908, args);
        assertTrue(recursiveEquals(term45908, term46669));
        assertTrue(recursiveEquals(term45994, term46670));
        assertTrue(recursiveEquals(term46086, term46671));
        assertTrue(recursiveEquals(term46172, term46672));
        assertTrue(recursiveEquals(retValue, term46614));
    }

};


