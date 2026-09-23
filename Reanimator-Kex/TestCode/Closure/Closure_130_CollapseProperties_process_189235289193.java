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
import java.util.ArrayList;
import java.util.HashMap;

public class CollapseProperties_process_189235289193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term245200;
     Object term245350;
     Object term246244;
     Object term246250;

    public CollapseProperties_process_189235289193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term245200 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        Object term245280 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setBooleanField(term245200, term245200.getClass(), "collapsePropertiesOnExternTypes", false);
        setField(term245200, term245200.getClass(), "compiler", term245280);
        setBooleanField(term245200, term245200.getClass(), "inlineAliases", true);
        term245350 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        ArrayList term246246 = new ArrayList();
        HashMap term246248 = new HashMap();
        term246244 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        Object term246245 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term246245, term246245.getClass(), "options", null);
        setField(term246245, term246245.getClass(), "passes", null);
        setField(term246245, term246245.getClass(), "externs", null);
        setField(term246245, term246245.getClass(), "modules", null);
        setField(term246245, term246245.getClass(), "moduleGraph", null);
        setField(term246245, term246245.getClass(), "inputs", null);
        setField(term246245, term246245.getClass(), "errorManager", null);
        setField(term246245, term246245.getClass(), "warningsGuard", null);
        setField(term246245, term246245.getClass(), "injectedLibraries", null);
        setField(term246245, term246245.getClass(), "externsRoot", null);
        setField(term246245, term246245.getClass(), "jsRoot", null);
        setField(term246245, term246245.getClass(), "externAndJsRoot", null);
        setField(term246245, term246245.getClass(), "inputsById", null);
        setField(term246245, term246245.getClass(), "sourceMap", null);
        setField(term246245, term246245.getClass(), "externExports", null);
        setIntField(term246245, term246245.getClass(), "uniqueNameId", 0);
        setBooleanField(term246245, term246245.getClass(), "hasRegExpGlobalReferences", false);
        setField(term246245, term246245.getClass(), "functionInformationMap", null);
        setField(term246245, term246245.getClass(), "debugLog", null);
        setField(term246245, term246245.getClass(), "defaultCodingConvention", null);
        setField(term246245, term246245.getClass(), "typeRegistry", null);
        setField(term246245, term246245.getClass(), "parserConfig", null);
        setField(term246245, term246245.getClass(), "abstractInterpreter", null);
        setField(term246245, term246245.getClass(), "typeValidator", null);
        setField(term246245, term246245.getClass(), "tracker", null);
        setField(term246245, term246245.getClass(), "oldErrorReporter", null);
        setField(term246245, term246245.getClass(), "defaultErrorReporter", null);
        setField(term246245, term246245.getClass(), "compilerThread", null);
        setBooleanField(term246245, term246245.getClass(), "useThreads", false);
        setField(term246245, term246245.getClass(), "outStream", null);
        setField(term246245, term246245.getClass(), "globalRefMap", null);
        setDoubleField(term246245, term246245.getClass(), "progress", 0.0);
        setField(term246245, term246245.getClass(), "lastPassName", null);
        setField(term246245, term246245.getClass(), "sanityCheck", null);
        setField(term246245, term246245.getClass(), "currentTracer", null);
        setField(term246245, term246245.getClass(), "currentPassName", null);
        setIntField(term246245, term246245.getClass(), "syntheticCodeId", 0);
        setField(term246245, term246245.getClass(), "recentChange", null);
        setField(term246245, term246245.getClass(), "codeChangeHandlers", null);
        setField(term246245, term246245.getClass(), "synthesizedExternsInput", null);
        setField(term246245, term246245.getClass(), "stage", null);
        setField(term246244, term246244.getClass(), "compiler", term246245);
        setField(term246244, term246244.getClass(), "globalNames", term246246);
        setField(term246244, term246244.getClass(), "nameMap", term246248);
        setBooleanField(term246244, term246244.getClass(), "collapsePropertiesOnExternTypes", false);
        setBooleanField(term246244, term246244.getClass(), "inlineAliases", true);
        term246250 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term246250, term246250.getClass(), "type", 0);
        setField(term246250, term246250.getClass(), "next", null);
        setField(term246250, term246250.getClass(), "first", null);
        setField(term246250, term246250.getClass(), "last", null);
        setField(term246250, term246250.getClass(), "propListHead", null);
        setIntField(term246250, term246250.getClass(), "sourcePosition", 0);
        setField(term246250, term246250.getClass(), "jsType", null);
        setField(term246250, term246250.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term245350;
        callMethod(klass, "process", argTypes, term245200, args);
        assertTrue(recursiveEquals(term245200, term246244));
        assertTrue(recursiveEquals(term245350, null));
    }

};


