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

public class PeepholeFoldConstants_tryFoldAndOr_425870290350 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69649;
     Object term69735;
     Object term69825;
     Object term69895;
     Object term81989;
     Object term81990;
     Object term81991;
     Object term81992;
     Object term81938;

    public PeepholeFoldConstants_tryFoldAndOr_425870290350() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term69649 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term69735 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term69735, term69735.getClass(), "parent", null);
        setIntField(term69735, term69735.getClass(), "type", 0);
        term69825 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term69825, term69825.getClass(), "type", 0);
        term69895 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term81989 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term81989, term81989.getClass(), "currentTraversal", null);
        term81990 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term81990, term81990.getClass(), "functionName", null);
        setBooleanField(term81990, term81990.getClass(), "itsNeedsActivation", false);
        setIntField(term81990, term81990.getClass(), "itsFunctionType", 0);
        setBooleanField(term81990, term81990.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term81990, term81990.getClass(), "encodedSourceStart", 0);
        setIntField(term81990, term81990.getClass(), "encodedSourceEnd", 0);
        setField(term81990, term81990.getClass(), "sourceName", null);
        setIntField(term81990, term81990.getClass(), "baseLineno", 0);
        setIntField(term81990, term81990.getClass(), "endLineno", 0);
        setField(term81990, term81990.getClass(), "functions", null);
        setField(term81990, term81990.getClass(), "regexps", null);
        setField(term81990, term81990.getClass(), "itsVariables", null);
        setField(term81990, term81990.getClass(), "itsConst", null);
        setField(term81990, term81990.getClass(), "itsVariableNames", null);
        setIntField(term81990, term81990.getClass(), "varStart", 0);
        setField(term81990, term81990.getClass(), "compilerData", null);
        setIntField(term81990, term81990.getClass(), "type", 0);
        setField(term81990, term81990.getClass(), "next", null);
        setField(term81990, term81990.getClass(), "first", null);
        setField(term81990, term81990.getClass(), "last", null);
        setField(term81990, term81990.getClass(), "propListHead", null);
        setIntField(term81990, term81990.getClass(), "sourcePosition", 0);
        setField(term81990, term81990.getClass(), "jsType", null);
        setField(term81990, term81990.getClass(), "parent", null);
        term81991 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term81991, term81991.getClass(), "encodedSourceStart", 0);
        setIntField(term81991, term81991.getClass(), "encodedSourceEnd", 0);
        setField(term81991, term81991.getClass(), "sourceName", null);
        setIntField(term81991, term81991.getClass(), "baseLineno", 0);
        setIntField(term81991, term81991.getClass(), "endLineno", 0);
        setField(term81991, term81991.getClass(), "functions", null);
        setField(term81991, term81991.getClass(), "regexps", null);
        setField(term81991, term81991.getClass(), "itsVariables", null);
        setField(term81991, term81991.getClass(), "itsConst", null);
        setField(term81991, term81991.getClass(), "itsVariableNames", null);
        setIntField(term81991, term81991.getClass(), "varStart", 0);
        setField(term81991, term81991.getClass(), "compilerData", null);
        setIntField(term81991, term81991.getClass(), "type", 0);
        setField(term81991, term81991.getClass(), "next", null);
        setField(term81991, term81991.getClass(), "first", null);
        setField(term81991, term81991.getClass(), "last", null);
        setField(term81991, term81991.getClass(), "propListHead", null);
        setIntField(term81991, term81991.getClass(), "sourcePosition", 0);
        setField(term81991, term81991.getClass(), "jsType", null);
        setField(term81991, term81991.getClass(), "parent", null);
        term81992 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term81992, term81992.getClass(), "type", 0);
        setField(term81992, term81992.getClass(), "next", null);
        setField(term81992, term81992.getClass(), "first", null);
        setField(term81992, term81992.getClass(), "last", null);
        setField(term81992, term81992.getClass(), "propListHead", null);
        setIntField(term81992, term81992.getClass(), "sourcePosition", 0);
        setField(term81992, term81992.getClass(), "jsType", null);
        setField(term81992, term81992.getClass(), "parent", null);
        term81938 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term81938, term81938.getClass(), "functionName", null);
        setBooleanField(term81938, term81938.getClass(), "itsNeedsActivation", false);
        setIntField(term81938, term81938.getClass(), "itsFunctionType", 0);
        setBooleanField(term81938, term81938.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term81938, term81938.getClass(), "encodedSourceStart", 0);
        setIntField(term81938, term81938.getClass(), "encodedSourceEnd", 0);
        setField(term81938, term81938.getClass(), "sourceName", null);
        setIntField(term81938, term81938.getClass(), "baseLineno", 0);
        setIntField(term81938, term81938.getClass(), "endLineno", 0);
        setField(term81938, term81938.getClass(), "functions", null);
        setField(term81938, term81938.getClass(), "regexps", null);
        setField(term81938, term81938.getClass(), "itsVariables", null);
        setField(term81938, term81938.getClass(), "itsConst", null);
        setField(term81938, term81938.getClass(), "itsVariableNames", null);
        setIntField(term81938, term81938.getClass(), "varStart", 0);
        setField(term81938, term81938.getClass(), "compilerData", null);
        setIntField(term81938, term81938.getClass(), "type", 0);
        setField(term81938, term81938.getClass(), "next", null);
        setField(term81938, term81938.getClass(), "first", null);
        setField(term81938, term81938.getClass(), "last", null);
        setField(term81938, term81938.getClass(), "propListHead", null);
        setIntField(term81938, term81938.getClass(), "sourcePosition", 0);
        setField(term81938, term81938.getClass(), "jsType", null);
        setField(term81938, term81938.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term69735;
        args[1] = term69825;
        args[2] = term69895;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term69649, args);
        assertTrue(recursiveEquals(term69649, term81989));
        assertTrue(recursiveEquals(term69735, term81990));
        assertTrue(recursiveEquals(term69825, term81991));
        assertTrue(recursiveEquals(term69895, term81992));
        assertTrue(recursiveEquals(retValue, term81938));
    }

};


