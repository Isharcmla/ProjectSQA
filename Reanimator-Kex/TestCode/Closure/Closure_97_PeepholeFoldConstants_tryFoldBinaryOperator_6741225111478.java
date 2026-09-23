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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111478 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term549716;
     Object term549808;
     Object term550035;
     Object term550036;
     Object term549985;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111478() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term549716 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term549808 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term549894 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term549964 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term549894, term549894.getClass(), "next", term549964);
        setField(term549808, term549808.getClass(), "first", term549894);
        setIntField(term549808, term549808.getClass(), "type", 46);
        term550035 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term550035, term550035.getClass(), "currentTraversal", null);
        term550036 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term550037 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term550038 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term550036, term550036.getClass(), "str", null);
        setIntField(term550036, term550036.getClass(), "type", 46);
        setField(term550036, term550036.getClass(), "next", null);
        setField(term550037, term550037.getClass(), "functionName", null);
        setBooleanField(term550037, term550037.getClass(), "itsNeedsActivation", false);
        setIntField(term550037, term550037.getClass(), "itsFunctionType", 0);
        setBooleanField(term550037, term550037.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term550037, term550037.getClass(), "encodedSourceStart", 0);
        setIntField(term550037, term550037.getClass(), "encodedSourceEnd", 0);
        setField(term550037, term550037.getClass(), "sourceName", null);
        setIntField(term550037, term550037.getClass(), "baseLineno", 0);
        setIntField(term550037, term550037.getClass(), "endLineno", 0);
        setField(term550037, term550037.getClass(), "functions", null);
        setField(term550037, term550037.getClass(), "regexps", null);
        setField(term550037, term550037.getClass(), "itsVariables", null);
        setField(term550037, term550037.getClass(), "itsConst", null);
        setField(term550037, term550037.getClass(), "itsVariableNames", null);
        setIntField(term550037, term550037.getClass(), "varStart", 0);
        setField(term550037, term550037.getClass(), "compilerData", null);
        setIntField(term550037, term550037.getClass(), "type", 0);
        setIntField(term550038, term550038.getClass(), "type", 0);
        setField(term550038, term550038.getClass(), "next", null);
        setField(term550038, term550038.getClass(), "first", null);
        setField(term550038, term550038.getClass(), "last", null);
        setField(term550038, term550038.getClass(), "propListHead", null);
        setIntField(term550038, term550038.getClass(), "sourcePosition", 0);
        setField(term550038, term550038.getClass(), "jsType", null);
        setField(term550038, term550038.getClass(), "parent", null);
        setField(term550037, term550037.getClass(), "next", term550038);
        setField(term550037, term550037.getClass(), "first", null);
        setField(term550037, term550037.getClass(), "last", null);
        setField(term550037, term550037.getClass(), "propListHead", null);
        setIntField(term550037, term550037.getClass(), "sourcePosition", 0);
        setField(term550037, term550037.getClass(), "jsType", null);
        setField(term550037, term550037.getClass(), "parent", null);
        setField(term550036, term550036.getClass(), "first", term550037);
        setField(term550036, term550036.getClass(), "last", null);
        setField(term550036, term550036.getClass(), "propListHead", null);
        setIntField(term550036, term550036.getClass(), "sourcePosition", 0);
        setField(term550036, term550036.getClass(), "jsType", null);
        setField(term550036, term550036.getClass(), "parent", null);
        term549985 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term549987 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term549997 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term549985, term549985.getClass(), "str", null);
        setIntField(term549985, term549985.getClass(), "type", 46);
        setField(term549985, term549985.getClass(), "next", null);
        setField(term549987, term549987.getClass(), "functionName", null);
        setBooleanField(term549987, term549987.getClass(), "itsNeedsActivation", false);
        setIntField(term549987, term549987.getClass(), "itsFunctionType", 0);
        setBooleanField(term549987, term549987.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term549987, term549987.getClass(), "encodedSourceStart", 0);
        setIntField(term549987, term549987.getClass(), "encodedSourceEnd", 0);
        setField(term549987, term549987.getClass(), "sourceName", null);
        setIntField(term549987, term549987.getClass(), "baseLineno", 0);
        setIntField(term549987, term549987.getClass(), "endLineno", 0);
        setField(term549987, term549987.getClass(), "functions", null);
        setField(term549987, term549987.getClass(), "regexps", null);
        setField(term549987, term549987.getClass(), "itsVariables", null);
        setField(term549987, term549987.getClass(), "itsConst", null);
        setField(term549987, term549987.getClass(), "itsVariableNames", null);
        setIntField(term549987, term549987.getClass(), "varStart", 0);
        setField(term549987, term549987.getClass(), "compilerData", null);
        setIntField(term549987, term549987.getClass(), "type", 0);
        setIntField(term549997, term549997.getClass(), "type", 0);
        setField(term549997, term549997.getClass(), "next", null);
        setField(term549997, term549997.getClass(), "first", null);
        setField(term549997, term549997.getClass(), "last", null);
        setField(term549997, term549997.getClass(), "propListHead", null);
        setIntField(term549997, term549997.getClass(), "sourcePosition", 0);
        setField(term549997, term549997.getClass(), "jsType", null);
        setField(term549997, term549997.getClass(), "parent", null);
        setField(term549987, term549987.getClass(), "next", term549997);
        setField(term549987, term549987.getClass(), "first", null);
        setField(term549987, term549987.getClass(), "last", null);
        setField(term549987, term549987.getClass(), "propListHead", null);
        setIntField(term549987, term549987.getClass(), "sourcePosition", 0);
        setField(term549987, term549987.getClass(), "jsType", null);
        setField(term549987, term549987.getClass(), "parent", null);
        setField(term549985, term549985.getClass(), "first", term549987);
        setField(term549985, term549985.getClass(), "last", null);
        setField(term549985, term549985.getClass(), "propListHead", null);
        setIntField(term549985, term549985.getClass(), "sourcePosition", 0);
        setField(term549985, term549985.getClass(), "jsType", null);
        setField(term549985, term549985.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term549808;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term549716, args);
        assertTrue(recursiveEquals(term549716, term550035));
        assertTrue(recursiveEquals(term549808, term550036));
        assertTrue(recursiveEquals(retValue, term549985));
    }

};


