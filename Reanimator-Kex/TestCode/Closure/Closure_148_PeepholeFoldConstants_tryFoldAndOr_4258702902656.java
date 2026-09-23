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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902656 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term758559;
     Object term758645;
     Object term758823;
     Object term758893;
     Object term759045;
     Object term759046;
     Object term759048;
     Object term759049;
     Object term758954;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902656() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term758559 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term758645 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term758731 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term758731, term758731.getClass(), "type", 108);
        setField(term758645, term758645.getClass(), "parent", term758731);
        setIntField(term758645, term758645.getClass(), "type", 0);
        term758823 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term758823, term758823.getClass(), "type", 0);
        term758893 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term758893, term758893.getClass(), "type", 63);
        term759045 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term759045, term759045.getClass(), "currentTraversal", null);
        term759046 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term759047 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term759046, term759046.getClass(), "functionName", null);
        setBooleanField(term759046, term759046.getClass(), "itsNeedsActivation", false);
        setIntField(term759046, term759046.getClass(), "itsFunctionType", 0);
        setBooleanField(term759046, term759046.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term759046, term759046.getClass(), "encodedSourceStart", 0);
        setIntField(term759046, term759046.getClass(), "encodedSourceEnd", 0);
        setField(term759046, term759046.getClass(), "sourceName", null);
        setIntField(term759046, term759046.getClass(), "baseLineno", 0);
        setIntField(term759046, term759046.getClass(), "endLineno", 0);
        setField(term759046, term759046.getClass(), "functions", null);
        setField(term759046, term759046.getClass(), "regexps", null);
        setField(term759046, term759046.getClass(), "itsVariables", null);
        setField(term759046, term759046.getClass(), "itsConst", null);
        setField(term759046, term759046.getClass(), "itsVariableNames", null);
        setIntField(term759046, term759046.getClass(), "varStart", 0);
        setField(term759046, term759046.getClass(), "compilerData", null);
        setIntField(term759046, term759046.getClass(), "type", 0);
        setField(term759046, term759046.getClass(), "next", null);
        setField(term759046, term759046.getClass(), "first", null);
        setField(term759046, term759046.getClass(), "last", null);
        setField(term759046, term759046.getClass(), "propListHead", null);
        setIntField(term759046, term759046.getClass(), "sourcePosition", 0);
        setField(term759046, term759046.getClass(), "jsType", null);
        setField(term759047, term759047.getClass(), "functionName", null);
        setBooleanField(term759047, term759047.getClass(), "itsNeedsActivation", false);
        setIntField(term759047, term759047.getClass(), "itsFunctionType", 0);
        setBooleanField(term759047, term759047.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term759047, term759047.getClass(), "encodedSourceStart", 0);
        setIntField(term759047, term759047.getClass(), "encodedSourceEnd", 0);
        setField(term759047, term759047.getClass(), "sourceName", null);
        setIntField(term759047, term759047.getClass(), "baseLineno", 0);
        setIntField(term759047, term759047.getClass(), "endLineno", 0);
        setField(term759047, term759047.getClass(), "functions", null);
        setField(term759047, term759047.getClass(), "regexps", null);
        setField(term759047, term759047.getClass(), "itsVariables", null);
        setField(term759047, term759047.getClass(), "itsConst", null);
        setField(term759047, term759047.getClass(), "itsVariableNames", null);
        setIntField(term759047, term759047.getClass(), "varStart", 0);
        setField(term759047, term759047.getClass(), "compilerData", null);
        setIntField(term759047, term759047.getClass(), "type", 108);
        setField(term759047, term759047.getClass(), "next", null);
        setField(term759047, term759047.getClass(), "first", null);
        setField(term759047, term759047.getClass(), "last", null);
        setField(term759047, term759047.getClass(), "propListHead", null);
        setIntField(term759047, term759047.getClass(), "sourcePosition", 0);
        setField(term759047, term759047.getClass(), "jsType", null);
        setField(term759047, term759047.getClass(), "parent", null);
        setField(term759046, term759046.getClass(), "parent", term759047);
        term759048 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term759048, term759048.getClass(), "str", null);
        setIntField(term759048, term759048.getClass(), "type", 0);
        setField(term759048, term759048.getClass(), "next", null);
        setField(term759048, term759048.getClass(), "first", null);
        setField(term759048, term759048.getClass(), "last", null);
        setField(term759048, term759048.getClass(), "propListHead", null);
        setIntField(term759048, term759048.getClass(), "sourcePosition", 0);
        setField(term759048, term759048.getClass(), "jsType", null);
        setField(term759048, term759048.getClass(), "parent", null);
        term759049 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term759049, term759049.getClass(), "type", 63);
        setField(term759049, term759049.getClass(), "next", null);
        setField(term759049, term759049.getClass(), "first", null);
        setField(term759049, term759049.getClass(), "last", null);
        setField(term759049, term759049.getClass(), "propListHead", null);
        setIntField(term759049, term759049.getClass(), "sourcePosition", 0);
        setField(term759049, term759049.getClass(), "jsType", null);
        setField(term759049, term759049.getClass(), "parent", null);
        term758954 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term758965 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term758954, term758954.getClass(), "functionName", null);
        setBooleanField(term758954, term758954.getClass(), "itsNeedsActivation", false);
        setIntField(term758954, term758954.getClass(), "itsFunctionType", 0);
        setBooleanField(term758954, term758954.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term758954, term758954.getClass(), "encodedSourceStart", 0);
        setIntField(term758954, term758954.getClass(), "encodedSourceEnd", 0);
        setField(term758954, term758954.getClass(), "sourceName", null);
        setIntField(term758954, term758954.getClass(), "baseLineno", 0);
        setIntField(term758954, term758954.getClass(), "endLineno", 0);
        setField(term758954, term758954.getClass(), "functions", null);
        setField(term758954, term758954.getClass(), "regexps", null);
        setField(term758954, term758954.getClass(), "itsVariables", null);
        setField(term758954, term758954.getClass(), "itsConst", null);
        setField(term758954, term758954.getClass(), "itsVariableNames", null);
        setIntField(term758954, term758954.getClass(), "varStart", 0);
        setField(term758954, term758954.getClass(), "compilerData", null);
        setIntField(term758954, term758954.getClass(), "type", 0);
        setField(term758954, term758954.getClass(), "next", null);
        setField(term758954, term758954.getClass(), "first", null);
        setField(term758954, term758954.getClass(), "last", null);
        setField(term758954, term758954.getClass(), "propListHead", null);
        setIntField(term758954, term758954.getClass(), "sourcePosition", 0);
        setField(term758954, term758954.getClass(), "jsType", null);
        setField(term758965, term758965.getClass(), "functionName", null);
        setBooleanField(term758965, term758965.getClass(), "itsNeedsActivation", false);
        setIntField(term758965, term758965.getClass(), "itsFunctionType", 0);
        setBooleanField(term758965, term758965.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term758965, term758965.getClass(), "encodedSourceStart", 0);
        setIntField(term758965, term758965.getClass(), "encodedSourceEnd", 0);
        setField(term758965, term758965.getClass(), "sourceName", null);
        setIntField(term758965, term758965.getClass(), "baseLineno", 0);
        setIntField(term758965, term758965.getClass(), "endLineno", 0);
        setField(term758965, term758965.getClass(), "functions", null);
        setField(term758965, term758965.getClass(), "regexps", null);
        setField(term758965, term758965.getClass(), "itsVariables", null);
        setField(term758965, term758965.getClass(), "itsConst", null);
        setField(term758965, term758965.getClass(), "itsVariableNames", null);
        setIntField(term758965, term758965.getClass(), "varStart", 0);
        setField(term758965, term758965.getClass(), "compilerData", null);
        setIntField(term758965, term758965.getClass(), "type", 108);
        setField(term758965, term758965.getClass(), "next", null);
        setField(term758965, term758965.getClass(), "first", null);
        setField(term758965, term758965.getClass(), "last", null);
        setField(term758965, term758965.getClass(), "propListHead", null);
        setIntField(term758965, term758965.getClass(), "sourcePosition", 0);
        setField(term758965, term758965.getClass(), "jsType", null);
        setField(term758965, term758965.getClass(), "parent", null);
        setField(term758954, term758954.getClass(), "parent", term758965);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term758645;
        args[1] = term758823;
        args[2] = term758893;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term758559, args);
        assertTrue(recursiveEquals(term758559, term759045));
        assertTrue(recursiveEquals(term758645, term759046));
        assertTrue(recursiveEquals(term758823, term759048));
        assertTrue(recursiveEquals(term758893, term759049));
        assertTrue(recursiveEquals(retValue, term758954));
    }

};


