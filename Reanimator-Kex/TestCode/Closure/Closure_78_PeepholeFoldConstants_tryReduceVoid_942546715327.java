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

public class PeepholeFoldConstants_tryReduceVoid_942546715327 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50970;
     Object term51210;
     Object term78874;
     Object term78877;
     Object term78838;

    public PeepholeFoldConstants_tryReduceVoid_942546715327() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50970 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        Object term51060 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        Object term51140 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term51060, term51060.getClass(), "compiler", term51140);
        setField(term50970, term50970.getClass(), "currentTraversal", term51060);
        term51210 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term51210, term51210.getClass(), "first", term51210);
        setIntField(term51210, term51210.getClass(), "type", -40);
        term78874 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        Object term78875 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        Object term78876 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term78876, term78876.getClass(), "options", null);
        setField(term78876, term78876.getClass(), "passes", null);
        setField(term78876, term78876.getClass(), "externs", null);
        setField(term78876, term78876.getClass(), "modules", null);
        setField(term78876, term78876.getClass(), "moduleGraph", null);
        setField(term78876, term78876.getClass(), "inputs", null);
        setField(term78876, term78876.getClass(), "errorManager", null);
        setField(term78876, term78876.getClass(), "warningsGuard", null);
        setField(term78876, term78876.getClass(), "externsRoot", null);
        setField(term78876, term78876.getClass(), "jsRoot", null);
        setField(term78876, term78876.getClass(), "externAndJsRoot", null);
        setField(term78876, term78876.getClass(), "inputsByName", null);
        setField(term78876, term78876.getClass(), "sourceMap", null);
        setField(term78876, term78876.getClass(), "externExports", null);
        setIntField(term78876, term78876.getClass(), "uniqueNameId", 0);
        setBooleanField(term78876, term78876.getClass(), "useThreads", false);
        setBooleanField(term78876, term78876.getClass(), "hasRegExpGlobalReferences", false);
        setField(term78876, term78876.getClass(), "functionInformationMap", null);
        setField(term78876, term78876.getClass(), "debugLog", null);
        setField(term78876, term78876.getClass(), "defaultCodingConvention", null);
        setField(term78876, term78876.getClass(), "typeRegistry", null);
        setField(term78876, term78876.getClass(), "parserConfig", null);
        setField(term78876, term78876.getClass(), "abstractInterpreter", null);
        setField(term78876, term78876.getClass(), "typeValidator", null);
        setField(term78876, term78876.getClass(), "tracker", null);
        setField(term78876, term78876.getClass(), "oldErrorReporter", null);
        setField(term78876, term78876.getClass(), "defaultErrorReporter", null);
        setField(term78876, term78876.getClass(), "outStream", null);
        setField(term78876, term78876.getClass(), "sanityCheck", null);
        setField(term78876, term78876.getClass(), "currentTracer", null);
        setField(term78876, term78876.getClass(), "currentPassName", null);
        setField(term78876, term78876.getClass(), "recentChange", null);
        setField(term78876, term78876.getClass(), "codeChangeHandlers", null);
        setField(term78876, term78876.getClass(), "stage", null);
        setField(term78875, term78875.getClass(), "compiler", term78876);
        setField(term78875, term78875.getClass(), "callback", null);
        setField(term78875, term78875.getClass(), "curNode", null);
        setField(term78875, term78875.getClass(), "scopes", null);
        setField(term78875, term78875.getClass(), "scopeRoots", null);
        setField(term78875, term78875.getClass(), "cfgs", null);
        setField(term78875, term78875.getClass(), "sourceName", null);
        setField(term78875, term78875.getClass(), "scopeCreator", null);
        setField(term78875, term78875.getClass(), "scopeCallback", null);
        setField(term78874, term78874.getClass(), "currentTraversal", term78875);
        term78877 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term78877, term78877.getClass(), "type", -40);
        setField(term78877, term78877.getClass(), "next", null);
        setField(term78877, term78877.getClass(), "first", term78877);
        setField(term78877, term78877.getClass(), "last", null);
        setField(term78877, term78877.getClass(), "propListHead", null);
        setIntField(term78877, term78877.getClass(), "sourcePosition", 0);
        setField(term78877, term78877.getClass(), "jsType", null);
        setField(term78877, term78877.getClass(), "parent", null);
        term78838 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term78838, term78838.getClass(), "type", -40);
        setField(term78838, term78838.getClass(), "next", null);
        setField(term78838, term78838.getClass(), "first", term78838);
        setField(term78838, term78838.getClass(), "last", null);
        setField(term78838, term78838.getClass(), "propListHead", null);
        setIntField(term78838, term78838.getClass(), "sourcePosition", 0);
        setField(term78838, term78838.getClass(), "jsType", null);
        setField(term78838, term78838.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term51210;
        Object retValue = callMethod(klass, "tryReduceVoid", argTypes, term50970, args);
        assertTrue(recursiveEquals(term50970, term78874));
        assertTrue(recursiveEquals(term51210, term78877));
        assertTrue(recursiveEquals(retValue, term78838));
    }

};


