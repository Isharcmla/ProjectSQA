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

public class ScopedAliases_hotSwapScript_88341709113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58740;
     Object term58912;
     Object term60420;
     Object term60422;

    public ScopedAliases_hotSwapScript_88341709113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term58740 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term58820 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term58740, term58740.getClass(), "compiler", term58820);
        term58912 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term59004 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term59090 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term58912, term58912.getClass(), "type", 0);
        setField(term58912, term58912.getClass(), "parent", null);
        setField(term59004, term59004.getClass(), "next", null);
        setIntField(term59004, term59004.getClass(), "type", 0);
        setField(term59090, term59090.getClass(), "next", null);
        setIntField(term59090, term59090.getClass(), "type", 0);
        setField(term59090, term59090.getClass(), "first", null);
        setField(term59004, term59004.getClass(), "first", term59090);
        setField(term58912, term58912.getClass(), "first", term59004);
        term60420 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term60421 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term60421, term60421.getClass(), "options", null);
        setField(term60421, term60421.getClass(), "passes", null);
        setField(term60421, term60421.getClass(), "externs", null);
        setField(term60421, term60421.getClass(), "modules", null);
        setField(term60421, term60421.getClass(), "moduleGraph", null);
        setField(term60421, term60421.getClass(), "inputs", null);
        setField(term60421, term60421.getClass(), "errorManager", null);
        setField(term60421, term60421.getClass(), "warningsGuard", null);
        setField(term60421, term60421.getClass(), "externsRoot", null);
        setField(term60421, term60421.getClass(), "jsRoot", null);
        setField(term60421, term60421.getClass(), "externAndJsRoot", null);
        setField(term60421, term60421.getClass(), "inputsById", null);
        setField(term60421, term60421.getClass(), "sourceMap", null);
        setField(term60421, term60421.getClass(), "externExports", null);
        setIntField(term60421, term60421.getClass(), "uniqueNameId", 0);
        setBooleanField(term60421, term60421.getClass(), "useThreads", false);
        setBooleanField(term60421, term60421.getClass(), "hasRegExpGlobalReferences", false);
        setField(term60421, term60421.getClass(), "functionInformationMap", null);
        setField(term60421, term60421.getClass(), "debugLog", null);
        setField(term60421, term60421.getClass(), "defaultCodingConvention", null);
        setField(term60421, term60421.getClass(), "typeRegistry", null);
        setField(term60421, term60421.getClass(), "parserConfig", null);
        setField(term60421, term60421.getClass(), "abstractInterpreter", null);
        setField(term60421, term60421.getClass(), "typeValidator", null);
        setField(term60421, term60421.getClass(), "tracker", null);
        setField(term60421, term60421.getClass(), "oldErrorReporter", null);
        setField(term60421, term60421.getClass(), "defaultErrorReporter", null);
        setField(term60421, term60421.getClass(), "outStream", null);
        setField(term60421, term60421.getClass(), "globalRefMap", null);
        setField(term60421, term60421.getClass(), "sanityCheck", null);
        setField(term60421, term60421.getClass(), "currentTracer", null);
        setField(term60421, term60421.getClass(), "currentPassName", null);
        setIntField(term60421, term60421.getClass(), "syntheticCodeId", 0);
        setField(term60421, term60421.getClass(), "recentChange", null);
        setField(term60421, term60421.getClass(), "codeChangeHandlers", null);
        setField(term60421, term60421.getClass(), "stage", null);
        setField(term60420, term60420.getClass(), "compiler", term60421);
        setField(term60420, term60420.getClass(), "preprocessorSymbolTable", null);
        setField(term60420, term60420.getClass(), "transformationHandler", null);
        term60422 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term60423 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term60424 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term60422, term60422.getClass(), "number", 0.0);
        setIntField(term60422, term60422.getClass(), "type", 0);
        setField(term60422, term60422.getClass(), "next", null);
        setDoubleField(term60423, term60423.getClass(), "number", 0.0);
        setIntField(term60423, term60423.getClass(), "type", 0);
        setField(term60423, term60423.getClass(), "next", null);
        setField(term60424, term60424.getClass(), "functionName", null);
        setBooleanField(term60424, term60424.getClass(), "itsNeedsActivation", false);
        setIntField(term60424, term60424.getClass(), "itsFunctionType", 0);
        setBooleanField(term60424, term60424.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term60424, term60424.getClass(), "encodedSourceStart", 0);
        setIntField(term60424, term60424.getClass(), "encodedSourceEnd", 0);
        setField(term60424, term60424.getClass(), "sourceName", null);
        setIntField(term60424, term60424.getClass(), "baseLineno", 0);
        setIntField(term60424, term60424.getClass(), "endLineno", 0);
        setField(term60424, term60424.getClass(), "functions", null);
        setField(term60424, term60424.getClass(), "regexps", null);
        setField(term60424, term60424.getClass(), "itsVariables", null);
        setField(term60424, term60424.getClass(), "itsConst", null);
        setField(term60424, term60424.getClass(), "itsVariableNames", null);
        setIntField(term60424, term60424.getClass(), "varStart", 0);
        setField(term60424, term60424.getClass(), "compilerData", null);
        setIntField(term60424, term60424.getClass(), "type", 0);
        setField(term60424, term60424.getClass(), "next", null);
        setField(term60424, term60424.getClass(), "first", null);
        setField(term60424, term60424.getClass(), "last", null);
        setField(term60424, term60424.getClass(), "propListHead", null);
        setIntField(term60424, term60424.getClass(), "sourcePosition", 0);
        setField(term60424, term60424.getClass(), "jsType", null);
        setField(term60424, term60424.getClass(), "parent", null);
        setField(term60423, term60423.getClass(), "first", term60424);
        setField(term60423, term60423.getClass(), "last", null);
        setField(term60423, term60423.getClass(), "propListHead", null);
        setIntField(term60423, term60423.getClass(), "sourcePosition", 0);
        setField(term60423, term60423.getClass(), "jsType", null);
        setField(term60423, term60423.getClass(), "parent", null);
        setField(term60422, term60422.getClass(), "first", term60423);
        setField(term60422, term60422.getClass(), "last", null);
        setField(term60422, term60422.getClass(), "propListHead", null);
        setIntField(term60422, term60422.getClass(), "sourcePosition", 0);
        setField(term60422, term60422.getClass(), "jsType", null);
        setField(term60422, term60422.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term58912;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term58740, args);
        assertTrue(recursiveEquals(term58740, term60420));
        assertTrue(recursiveEquals(term58912, term60422));
    }

};


