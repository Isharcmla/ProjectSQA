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

public class PeepholeFoldConstants_tryFoldAndOr_425870290378 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76448;
     Object term76534;
     Object term76620;
     Object term76712;
     Object term76851;
     Object term76852;
     Object term76853;
     Object term76854;
     Object term76797;

    public PeepholeFoldConstants_tryFoldAndOr_425870290378() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term76448 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term76534 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term76534, term76534.getClass(), "parent", null);
        setIntField(term76534, term76534.getClass(), "type", 0);
        term76620 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term76620, term76620.getClass(), "type", 0);
        term76712 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term76851 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term76851, term76851.getClass(), "currentTraversal", null);
        term76852 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term76852, term76852.getClass(), "functionName", null);
        setBooleanField(term76852, term76852.getClass(), "itsNeedsActivation", false);
        setIntField(term76852, term76852.getClass(), "itsFunctionType", 0);
        setBooleanField(term76852, term76852.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term76852, term76852.getClass(), "encodedSourceStart", 0);
        setIntField(term76852, term76852.getClass(), "encodedSourceEnd", 0);
        setField(term76852, term76852.getClass(), "sourceName", null);
        setIntField(term76852, term76852.getClass(), "baseLineno", 0);
        setIntField(term76852, term76852.getClass(), "endLineno", 0);
        setField(term76852, term76852.getClass(), "functions", null);
        setField(term76852, term76852.getClass(), "regexps", null);
        setField(term76852, term76852.getClass(), "itsVariables", null);
        setField(term76852, term76852.getClass(), "itsConst", null);
        setField(term76852, term76852.getClass(), "itsVariableNames", null);
        setIntField(term76852, term76852.getClass(), "varStart", 0);
        setField(term76852, term76852.getClass(), "compilerData", null);
        setIntField(term76852, term76852.getClass(), "type", 0);
        setField(term76852, term76852.getClass(), "next", null);
        setField(term76852, term76852.getClass(), "first", null);
        setField(term76852, term76852.getClass(), "last", null);
        setField(term76852, term76852.getClass(), "propListHead", null);
        setIntField(term76852, term76852.getClass(), "sourcePosition", 0);
        setField(term76852, term76852.getClass(), "jsType", null);
        setField(term76852, term76852.getClass(), "parent", null);
        term76853 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term76853, term76853.getClass(), "functionName", null);
        setBooleanField(term76853, term76853.getClass(), "itsNeedsActivation", false);
        setIntField(term76853, term76853.getClass(), "itsFunctionType", 0);
        setBooleanField(term76853, term76853.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term76853, term76853.getClass(), "encodedSourceStart", 0);
        setIntField(term76853, term76853.getClass(), "encodedSourceEnd", 0);
        setField(term76853, term76853.getClass(), "sourceName", null);
        setIntField(term76853, term76853.getClass(), "baseLineno", 0);
        setIntField(term76853, term76853.getClass(), "endLineno", 0);
        setField(term76853, term76853.getClass(), "functions", null);
        setField(term76853, term76853.getClass(), "regexps", null);
        setField(term76853, term76853.getClass(), "itsVariables", null);
        setField(term76853, term76853.getClass(), "itsConst", null);
        setField(term76853, term76853.getClass(), "itsVariableNames", null);
        setIntField(term76853, term76853.getClass(), "varStart", 0);
        setField(term76853, term76853.getClass(), "compilerData", null);
        setIntField(term76853, term76853.getClass(), "type", 0);
        setField(term76853, term76853.getClass(), "next", null);
        setField(term76853, term76853.getClass(), "first", null);
        setField(term76853, term76853.getClass(), "last", null);
        setField(term76853, term76853.getClass(), "propListHead", null);
        setIntField(term76853, term76853.getClass(), "sourcePosition", 0);
        setField(term76853, term76853.getClass(), "jsType", null);
        setField(term76853, term76853.getClass(), "parent", null);
        term76854 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term76854, term76854.getClass(), "str", null);
        setIntField(term76854, term76854.getClass(), "type", 0);
        setField(term76854, term76854.getClass(), "next", null);
        setField(term76854, term76854.getClass(), "first", null);
        setField(term76854, term76854.getClass(), "last", null);
        setField(term76854, term76854.getClass(), "propListHead", null);
        setIntField(term76854, term76854.getClass(), "sourcePosition", 0);
        setField(term76854, term76854.getClass(), "jsType", null);
        setField(term76854, term76854.getClass(), "parent", null);
        term76797 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term76797, term76797.getClass(), "functionName", null);
        setBooleanField(term76797, term76797.getClass(), "itsNeedsActivation", false);
        setIntField(term76797, term76797.getClass(), "itsFunctionType", 0);
        setBooleanField(term76797, term76797.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term76797, term76797.getClass(), "encodedSourceStart", 0);
        setIntField(term76797, term76797.getClass(), "encodedSourceEnd", 0);
        setField(term76797, term76797.getClass(), "sourceName", null);
        setIntField(term76797, term76797.getClass(), "baseLineno", 0);
        setIntField(term76797, term76797.getClass(), "endLineno", 0);
        setField(term76797, term76797.getClass(), "functions", null);
        setField(term76797, term76797.getClass(), "regexps", null);
        setField(term76797, term76797.getClass(), "itsVariables", null);
        setField(term76797, term76797.getClass(), "itsConst", null);
        setField(term76797, term76797.getClass(), "itsVariableNames", null);
        setIntField(term76797, term76797.getClass(), "varStart", 0);
        setField(term76797, term76797.getClass(), "compilerData", null);
        setIntField(term76797, term76797.getClass(), "type", 0);
        setField(term76797, term76797.getClass(), "next", null);
        setField(term76797, term76797.getClass(), "first", null);
        setField(term76797, term76797.getClass(), "last", null);
        setField(term76797, term76797.getClass(), "propListHead", null);
        setIntField(term76797, term76797.getClass(), "sourcePosition", 0);
        setField(term76797, term76797.getClass(), "jsType", null);
        setField(term76797, term76797.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term76534;
        args[1] = term76620;
        args[2] = term76712;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term76448, args);
        assertTrue(recursiveEquals(term76448, term76851));
        assertTrue(recursiveEquals(term76534, term76852));
        assertTrue(recursiveEquals(term76620, term76853));
        assertTrue(recursiveEquals(term76712, term76854));
        assertTrue(recursiveEquals(retValue, term76797));
    }

};


