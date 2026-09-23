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

public class Compiler_getUniqueNameIdSupplier_2027312330214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term149136;
     Object term888953;
     Object term888948;

    public Compiler_getUniqueNameIdSupplier_2027312330214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term149136 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term149136, term149136.getClass(), "options", null);
        setField(term149136, term149136.getClass(), "passes", null);
        setField(term149136, term149136.getClass(), "externs", null);
        setField(term149136, term149136.getClass(), "modules", null);
        setField(term149136, term149136.getClass(), "moduleGraph", null);
        setField(term149136, term149136.getClass(), "inputs", null);
        setField(term149136, term149136.getClass(), "errorManager", null);
        setField(term149136, term149136.getClass(), "symbolTable", null);
        setField(term149136, term149136.getClass(), "externsRoot", null);
        setField(term149136, term149136.getClass(), "jsRoot", null);
        setField(term149136, term149136.getClass(), "externAndJsRoot", null);
        setField(term149136, term149136.getClass(), "inputsByName", null);
        setField(term149136, term149136.getClass(), "sourceMap", null);
        setField(term149136, term149136.getClass(), "externExports", null);
        setIntField(term149136, term149136.getClass(), "uniqueNameId", 0);
        setBooleanField(term149136, term149136.getClass(), "normalized", false);
        setBooleanField(term149136, term149136.getClass(), "useThreads", false);
        setField(term149136, term149136.getClass(), "functionInformationMap", null);
        setField(term149136, term149136.getClass(), "debugLog", null);
        setField(term149136, term149136.getClass(), "defaultCodingConvention", null);
        setField(term149136, term149136.getClass(), "typeRegistry", null);
        setField(term149136, term149136.getClass(), "parserConfig", null);
        setField(term149136, term149136.getClass(), "abstractInterpreter", null);
        setField(term149136, term149136.getClass(), "typeValidator", null);
        setField(term149136, term149136.getClass(), "tracker", null);
        setField(term149136, term149136.getClass(), "oldErrorReporter", null);
        setField(term149136, term149136.getClass(), "defaultErrorReporter", null);
        setField(term149136, term149136.getClass(), "outStream", null);
        setField(term149136, term149136.getClass(), "sanityCheck", null);
        setField(term149136, term149136.getClass(), "currentTracer", null);
        setField(term149136, term149136.getClass(), "currentPassName", null);
        setField(term149136, term149136.getClass(), "recentChange", null);
        setField(term149136, term149136.getClass(), "codeChangeHandlers", null);
        term888953 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term888953, term888953.getClass(), "options", null);
        setField(term888953, term888953.getClass(), "passes", null);
        setField(term888953, term888953.getClass(), "externs", null);
        setField(term888953, term888953.getClass(), "modules", null);
        setField(term888953, term888953.getClass(), "moduleGraph", null);
        setField(term888953, term888953.getClass(), "inputs", null);
        setField(term888953, term888953.getClass(), "errorManager", null);
        setField(term888953, term888953.getClass(), "symbolTable", null);
        setField(term888953, term888953.getClass(), "externsRoot", null);
        setField(term888953, term888953.getClass(), "jsRoot", null);
        setField(term888953, term888953.getClass(), "externAndJsRoot", null);
        setField(term888953, term888953.getClass(), "inputsByName", null);
        setField(term888953, term888953.getClass(), "sourceMap", null);
        setField(term888953, term888953.getClass(), "externExports", null);
        setIntField(term888953, term888953.getClass(), "uniqueNameId", 0);
        setBooleanField(term888953, term888953.getClass(), "normalized", false);
        setBooleanField(term888953, term888953.getClass(), "useThreads", false);
        setField(term888953, term888953.getClass(), "functionInformationMap", null);
        setField(term888953, term888953.getClass(), "debugLog", null);
        setField(term888953, term888953.getClass(), "defaultCodingConvention", null);
        setField(term888953, term888953.getClass(), "typeRegistry", null);
        setField(term888953, term888953.getClass(), "parserConfig", null);
        setField(term888953, term888953.getClass(), "abstractInterpreter", null);
        setField(term888953, term888953.getClass(), "typeValidator", null);
        setField(term888953, term888953.getClass(), "tracker", null);
        setField(term888953, term888953.getClass(), "oldErrorReporter", null);
        setField(term888953, term888953.getClass(), "defaultErrorReporter", null);
        setField(term888953, term888953.getClass(), "outStream", null);
        setField(term888953, term888953.getClass(), "sanityCheck", null);
        setField(term888953, term888953.getClass(), "currentTracer", null);
        setField(term888953, term888953.getClass(), "currentPassName", null);
        setField(term888953, term888953.getClass(), "recentChange", null);
        setField(term888953, term888953.getClass(), "codeChangeHandlers", null);
        term888948 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler$4"));
        Object term888949 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term888949, term888949.getClass(), "options", null);
        setField(term888949, term888949.getClass(), "passes", null);
        setField(term888949, term888949.getClass(), "externs", null);
        setField(term888949, term888949.getClass(), "modules", null);
        setField(term888949, term888949.getClass(), "moduleGraph", null);
        setField(term888949, term888949.getClass(), "inputs", null);
        setField(term888949, term888949.getClass(), "errorManager", null);
        setField(term888949, term888949.getClass(), "symbolTable", null);
        setField(term888949, term888949.getClass(), "externsRoot", null);
        setField(term888949, term888949.getClass(), "jsRoot", null);
        setField(term888949, term888949.getClass(), "externAndJsRoot", null);
        setField(term888949, term888949.getClass(), "inputsByName", null);
        setField(term888949, term888949.getClass(), "sourceMap", null);
        setField(term888949, term888949.getClass(), "externExports", null);
        setIntField(term888949, term888949.getClass(), "uniqueNameId", 0);
        setBooleanField(term888949, term888949.getClass(), "normalized", false);
        setBooleanField(term888949, term888949.getClass(), "useThreads", false);
        setField(term888949, term888949.getClass(), "functionInformationMap", null);
        setField(term888949, term888949.getClass(), "debugLog", null);
        setField(term888949, term888949.getClass(), "defaultCodingConvention", null);
        setField(term888949, term888949.getClass(), "typeRegistry", null);
        setField(term888949, term888949.getClass(), "parserConfig", null);
        setField(term888949, term888949.getClass(), "abstractInterpreter", null);
        setField(term888949, term888949.getClass(), "typeValidator", null);
        setField(term888949, term888949.getClass(), "tracker", null);
        setField(term888949, term888949.getClass(), "oldErrorReporter", null);
        setField(term888949, term888949.getClass(), "defaultErrorReporter", null);
        setField(term888949, term888949.getClass(), "outStream", null);
        setField(term888949, term888949.getClass(), "sanityCheck", null);
        setField(term888949, term888949.getClass(), "currentTracer", null);
        setField(term888949, term888949.getClass(), "currentPassName", null);
        setField(term888949, term888949.getClass(), "recentChange", null);
        setField(term888949, term888949.getClass(), "codeChangeHandlers", null);
        setField(term888948, term888948.getClass(), "val$self", term888949);
        setField(term888948, term888948.getClass(), "this$0", term888949);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getUniqueNameIdSupplier", argTypes, term149136, args);
        assertTrue(recursiveEquals(term149136, term888953));
        assertTrue(recursiveEquals(retValue, term888948));
    }

};


