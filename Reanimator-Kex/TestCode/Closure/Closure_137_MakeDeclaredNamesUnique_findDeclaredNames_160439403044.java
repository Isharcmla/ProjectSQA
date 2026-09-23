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

public class MakeDeclaredNamesUnique_findDeclaredNames_160439403044 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7605;
     Object term7697;
     Object term7783;
     Object term26903;
     Object term26904;
     Object term26905;

    public MakeDeclaredNamesUnique_findDeclaredNames_160439403044() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7605 = newInstance(Class.forName("com.google.javascript.jscomp.MakeDeclaredNamesUnique"));
        term7697 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term7783 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term7783, term7783.getClass(), "type", -106);
        term26903 = newInstance(Class.forName("com.google.javascript.jscomp.MakeDeclaredNamesUnique"));
        setField(term26903, term26903.getClass(), "nameStack", null);
        setField(term26903, term26903.getClass(), "rootRenamer", null);
        term26904 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term26904, term26904.getClass(), "functionName", null);
        setBooleanField(term26904, term26904.getClass(), "itsNeedsActivation", false);
        setIntField(term26904, term26904.getClass(), "itsFunctionType", 0);
        setBooleanField(term26904, term26904.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term26904, term26904.getClass(), "encodedSourceStart", 0);
        setIntField(term26904, term26904.getClass(), "encodedSourceEnd", 0);
        setField(term26904, term26904.getClass(), "sourceName", null);
        setIntField(term26904, term26904.getClass(), "baseLineno", 0);
        setIntField(term26904, term26904.getClass(), "endLineno", 0);
        setField(term26904, term26904.getClass(), "functions", null);
        setField(term26904, term26904.getClass(), "regexps", null);
        setField(term26904, term26904.getClass(), "itsVariables", null);
        setField(term26904, term26904.getClass(), "itsConst", null);
        setField(term26904, term26904.getClass(), "itsVariableNames", null);
        setIntField(term26904, term26904.getClass(), "varStart", 0);
        setField(term26904, term26904.getClass(), "compilerData", null);
        setIntField(term26904, term26904.getClass(), "type", -106);
        setField(term26904, term26904.getClass(), "next", null);
        setField(term26904, term26904.getClass(), "first", null);
        setField(term26904, term26904.getClass(), "last", null);
        setField(term26904, term26904.getClass(), "propListHead", null);
        setIntField(term26904, term26904.getClass(), "sourcePosition", 0);
        setField(term26904, term26904.getClass(), "jsType", null);
        setField(term26904, term26904.getClass(), "parent", null);
        term26905 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term26905, term26905.getClass(), "str", null);
        setIntField(term26905, term26905.getClass(), "type", 0);
        setField(term26905, term26905.getClass(), "next", null);
        setField(term26905, term26905.getClass(), "first", null);
        setField(term26905, term26905.getClass(), "last", null);
        setField(term26905, term26905.getClass(), "propListHead", null);
        setIntField(term26905, term26905.getClass(), "sourcePosition", 0);
        setField(term26905, term26905.getClass(), "jsType", null);
        setField(term26905, term26905.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.MakeDeclaredNamesUnique");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.MakeDeclaredNamesUnique$Renamer");
        Object[] args = new Object[3];
        args[0] = term7697;
        args[1] = term7783;
        args[2] = null;
        callMethod(klass, "findDeclaredNames", argTypes, term7605, args);
        assertTrue(recursiveEquals(term7605, term26903));
        assertTrue(recursiveEquals(term7697, term26904));
        assertTrue(recursiveEquals(term7783, term26905));
    }

};


