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

public class PeepholeFoldConstants_tryFoldAndOr_425870290198 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37712;
     Object term37798;
     Object term37890;
     Object term37982;
     Object term38040;
     Object term38041;
     Object term38042;
     Object term38043;
     Object term37994;

    public PeepholeFoldConstants_tryFoldAndOr_425870290198() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37712 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term37798 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term37798, term37798.getClass(), "parent", null);
        setIntField(term37798, term37798.getClass(), "type", 0);
        term37890 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term37890, term37890.getClass(), "type", 0);
        term37982 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term38040 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term38040, term38040.getClass(), "currentTraversal", null);
        term38041 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term38041, term38041.getClass(), "functionName", null);
        setBooleanField(term38041, term38041.getClass(), "itsNeedsActivation", false);
        setIntField(term38041, term38041.getClass(), "itsFunctionType", 0);
        setBooleanField(term38041, term38041.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term38041, term38041.getClass(), "encodedSourceStart", 0);
        setIntField(term38041, term38041.getClass(), "encodedSourceEnd", 0);
        setField(term38041, term38041.getClass(), "sourceName", null);
        setIntField(term38041, term38041.getClass(), "baseLineno", 0);
        setIntField(term38041, term38041.getClass(), "endLineno", 0);
        setField(term38041, term38041.getClass(), "functions", null);
        setField(term38041, term38041.getClass(), "regexps", null);
        setField(term38041, term38041.getClass(), "itsVariables", null);
        setField(term38041, term38041.getClass(), "itsConst", null);
        setField(term38041, term38041.getClass(), "itsVariableNames", null);
        setIntField(term38041, term38041.getClass(), "varStart", 0);
        setField(term38041, term38041.getClass(), "compilerData", null);
        setIntField(term38041, term38041.getClass(), "type", 0);
        setField(term38041, term38041.getClass(), "next", null);
        setField(term38041, term38041.getClass(), "first", null);
        setField(term38041, term38041.getClass(), "last", null);
        setField(term38041, term38041.getClass(), "propListHead", null);
        setIntField(term38041, term38041.getClass(), "sourcePosition", 0);
        setField(term38041, term38041.getClass(), "jsType", null);
        setField(term38041, term38041.getClass(), "parent", null);
        term38042 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term38042, term38042.getClass(), "str", null);
        setIntField(term38042, term38042.getClass(), "type", 0);
        setField(term38042, term38042.getClass(), "next", null);
        setField(term38042, term38042.getClass(), "first", null);
        setField(term38042, term38042.getClass(), "last", null);
        setField(term38042, term38042.getClass(), "propListHead", null);
        setIntField(term38042, term38042.getClass(), "sourcePosition", 0);
        setField(term38042, term38042.getClass(), "jsType", null);
        setField(term38042, term38042.getClass(), "parent", null);
        term38043 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term38043, term38043.getClass(), "str", null);
        setIntField(term38043, term38043.getClass(), "type", 0);
        setField(term38043, term38043.getClass(), "next", null);
        setField(term38043, term38043.getClass(), "first", null);
        setField(term38043, term38043.getClass(), "last", null);
        setField(term38043, term38043.getClass(), "propListHead", null);
        setIntField(term38043, term38043.getClass(), "sourcePosition", 0);
        setField(term38043, term38043.getClass(), "jsType", null);
        setField(term38043, term38043.getClass(), "parent", null);
        term37994 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term37994, term37994.getClass(), "functionName", null);
        setBooleanField(term37994, term37994.getClass(), "itsNeedsActivation", false);
        setIntField(term37994, term37994.getClass(), "itsFunctionType", 0);
        setBooleanField(term37994, term37994.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term37994, term37994.getClass(), "encodedSourceStart", 0);
        setIntField(term37994, term37994.getClass(), "encodedSourceEnd", 0);
        setField(term37994, term37994.getClass(), "sourceName", null);
        setIntField(term37994, term37994.getClass(), "baseLineno", 0);
        setIntField(term37994, term37994.getClass(), "endLineno", 0);
        setField(term37994, term37994.getClass(), "functions", null);
        setField(term37994, term37994.getClass(), "regexps", null);
        setField(term37994, term37994.getClass(), "itsVariables", null);
        setField(term37994, term37994.getClass(), "itsConst", null);
        setField(term37994, term37994.getClass(), "itsVariableNames", null);
        setIntField(term37994, term37994.getClass(), "varStart", 0);
        setField(term37994, term37994.getClass(), "compilerData", null);
        setIntField(term37994, term37994.getClass(), "type", 0);
        setField(term37994, term37994.getClass(), "next", null);
        setField(term37994, term37994.getClass(), "first", null);
        setField(term37994, term37994.getClass(), "last", null);
        setField(term37994, term37994.getClass(), "propListHead", null);
        setIntField(term37994, term37994.getClass(), "sourcePosition", 0);
        setField(term37994, term37994.getClass(), "jsType", null);
        setField(term37994, term37994.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term37798;
        args[1] = term37890;
        args[2] = term37982;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term37712, args);
        assertTrue(recursiveEquals(term37712, term38040));
        assertTrue(recursiveEquals(term37798, term38041));
        assertTrue(recursiveEquals(term37890, term38042));
        assertTrue(recursiveEquals(term37982, term38043));
        assertTrue(recursiveEquals(retValue, term37994));
    }

};


