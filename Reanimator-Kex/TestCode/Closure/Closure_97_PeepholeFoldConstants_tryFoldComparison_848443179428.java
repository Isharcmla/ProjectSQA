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

public class PeepholeFoldConstants_tryFoldComparison_848443179428 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99089;
     Object term99181;
     Object term99273;
     Object term99359;
     Object term99440;
     Object term99441;
     Object term99442;
     Object term99443;
     Object term99411;

    public PeepholeFoldConstants_tryFoldComparison_848443179428() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term99089 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term99181 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term99181, term99181.getClass(), "type", 14);
        term99273 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term99273, term99273.getClass(), "type", 14);
        term99359 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term99440 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term99440, term99440.getClass(), "currentTraversal", null);
        term99441 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term99441, term99441.getClass(), "number", 0.0);
        setIntField(term99441, term99441.getClass(), "type", 14);
        setField(term99441, term99441.getClass(), "next", null);
        setField(term99441, term99441.getClass(), "first", null);
        setField(term99441, term99441.getClass(), "last", null);
        setField(term99441, term99441.getClass(), "propListHead", null);
        setIntField(term99441, term99441.getClass(), "sourcePosition", 0);
        setField(term99441, term99441.getClass(), "jsType", null);
        setField(term99441, term99441.getClass(), "parent", null);
        term99442 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term99442, term99442.getClass(), "number", 0.0);
        setIntField(term99442, term99442.getClass(), "type", 14);
        setField(term99442, term99442.getClass(), "next", null);
        setField(term99442, term99442.getClass(), "first", null);
        setField(term99442, term99442.getClass(), "last", null);
        setField(term99442, term99442.getClass(), "propListHead", null);
        setIntField(term99442, term99442.getClass(), "sourcePosition", 0);
        setField(term99442, term99442.getClass(), "jsType", null);
        setField(term99442, term99442.getClass(), "parent", null);
        term99443 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term99443, term99443.getClass(), "functionName", null);
        setBooleanField(term99443, term99443.getClass(), "itsNeedsActivation", false);
        setIntField(term99443, term99443.getClass(), "itsFunctionType", 0);
        setBooleanField(term99443, term99443.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term99443, term99443.getClass(), "encodedSourceStart", 0);
        setIntField(term99443, term99443.getClass(), "encodedSourceEnd", 0);
        setField(term99443, term99443.getClass(), "sourceName", null);
        setIntField(term99443, term99443.getClass(), "baseLineno", 0);
        setIntField(term99443, term99443.getClass(), "endLineno", 0);
        setField(term99443, term99443.getClass(), "functions", null);
        setField(term99443, term99443.getClass(), "regexps", null);
        setField(term99443, term99443.getClass(), "itsVariables", null);
        setField(term99443, term99443.getClass(), "itsConst", null);
        setField(term99443, term99443.getClass(), "itsVariableNames", null);
        setIntField(term99443, term99443.getClass(), "varStart", 0);
        setField(term99443, term99443.getClass(), "compilerData", null);
        setIntField(term99443, term99443.getClass(), "type", 0);
        setField(term99443, term99443.getClass(), "next", null);
        setField(term99443, term99443.getClass(), "first", null);
        setField(term99443, term99443.getClass(), "last", null);
        setField(term99443, term99443.getClass(), "propListHead", null);
        setIntField(term99443, term99443.getClass(), "sourcePosition", 0);
        setField(term99443, term99443.getClass(), "jsType", null);
        setField(term99443, term99443.getClass(), "parent", null);
        term99411 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term99411, term99411.getClass(), "number", 0.0);
        setIntField(term99411, term99411.getClass(), "type", 14);
        setField(term99411, term99411.getClass(), "next", null);
        setField(term99411, term99411.getClass(), "first", null);
        setField(term99411, term99411.getClass(), "last", null);
        setField(term99411, term99411.getClass(), "propListHead", null);
        setIntField(term99411, term99411.getClass(), "sourcePosition", 0);
        setField(term99411, term99411.getClass(), "jsType", null);
        setField(term99411, term99411.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term99181;
        args[1] = term99273;
        args[2] = term99359;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term99089, args);
        assertTrue(recursiveEquals(term99089, term99440));
        assertTrue(recursiveEquals(term99181, term99441));
        assertTrue(recursiveEquals(term99273, term99442));
        assertTrue(recursiveEquals(term99359, term99443));
        assertTrue(recursiveEquals(retValue, term99411));
    }

};


