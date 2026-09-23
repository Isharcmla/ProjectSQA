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

public class ScopedAliases_process_840655313174 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98761;
     Object term98847;
     Object term99127;
     Object term99128;

    public ScopedAliases_process_840655313174() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term98761 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term98761, term98761.getClass(), "compiler", null);
        term98847 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term99127 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term99127, term99127.getClass(), "compiler", null);
        setField(term99127, term99127.getClass(), "preprocessorSymbolTable", null);
        setField(term99127, term99127.getClass(), "transformationHandler", null);
        term99128 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term99128, term99128.getClass(), "functionName", null);
        setBooleanField(term99128, term99128.getClass(), "itsNeedsActivation", false);
        setIntField(term99128, term99128.getClass(), "itsFunctionType", 0);
        setBooleanField(term99128, term99128.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term99128, term99128.getClass(), "encodedSourceStart", 0);
        setIntField(term99128, term99128.getClass(), "encodedSourceEnd", 0);
        setField(term99128, term99128.getClass(), "sourceName", null);
        setIntField(term99128, term99128.getClass(), "baseLineno", 0);
        setIntField(term99128, term99128.getClass(), "endLineno", 0);
        setField(term99128, term99128.getClass(), "functions", null);
        setField(term99128, term99128.getClass(), "regexps", null);
        setField(term99128, term99128.getClass(), "itsVariables", null);
        setField(term99128, term99128.getClass(), "itsConst", null);
        setField(term99128, term99128.getClass(), "itsVariableNames", null);
        setIntField(term99128, term99128.getClass(), "varStart", 0);
        setField(term99128, term99128.getClass(), "compilerData", null);
        setIntField(term99128, term99128.getClass(), "type", 0);
        setField(term99128, term99128.getClass(), "next", null);
        setField(term99128, term99128.getClass(), "first", null);
        setField(term99128, term99128.getClass(), "last", null);
        setField(term99128, term99128.getClass(), "propListHead", null);
        setIntField(term99128, term99128.getClass(), "sourcePosition", 0);
        setField(term99128, term99128.getClass(), "jsType", null);
        setField(term99128, term99128.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term98847;
        callMethod(klass, "process", argTypes, term98761, args);
        assertTrue(recursiveEquals(term98761, term99127));
        assertTrue(recursiveEquals(term98847, null));
    }

};


