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

public class Compiler_getFunctionalInformationMap_1101075313292 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term330356;
     Object term2309169;

    public Compiler_getFunctionalInformationMap_1101075313292() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term330356 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term330356, term330356.getClass(), "options", null);
        setField(term330356, term330356.getClass(), "passes", null);
        setField(term330356, term330356.getClass(), "externs", null);
        setField(term330356, term330356.getClass(), "modules", null);
        setField(term330356, term330356.getClass(), "moduleGraph", null);
        setField(term330356, term330356.getClass(), "inputs", null);
        setField(term330356, term330356.getClass(), "errorManager", null);
        setField(term330356, term330356.getClass(), "symbolTable", null);
        setField(term330356, term330356.getClass(), "externsRoot", null);
        setField(term330356, term330356.getClass(), "jsRoot", null);
        setField(term330356, term330356.getClass(), "externAndJsRoot", null);
        setField(term330356, term330356.getClass(), "inputsByName", null);
        setField(term330356, term330356.getClass(), "sourceMap", null);
        setField(term330356, term330356.getClass(), "externExports", null);
        setIntField(term330356, term330356.getClass(), "uniqueNameId", 0);
        setBooleanField(term330356, term330356.getClass(), "normalized", false);
        setBooleanField(term330356, term330356.getClass(), "useThreads", false);
        setField(term330356, term330356.getClass(), "functionInformationMap", null);
        setField(term330356, term330356.getClass(), "debugLog", null);
        setField(term330356, term330356.getClass(), "defaultCodingConvention", null);
        setField(term330356, term330356.getClass(), "typeRegistry", null);
        setField(term330356, term330356.getClass(), "parserConfig", null);
        setField(term330356, term330356.getClass(), "abstractInterpreter", null);
        setField(term330356, term330356.getClass(), "typeValidator", null);
        setField(term330356, term330356.getClass(), "tracker", null);
        setField(term330356, term330356.getClass(), "oldErrorReporter", null);
        setField(term330356, term330356.getClass(), "defaultErrorReporter", null);
        setField(term330356, term330356.getClass(), "outStream", null);
        setField(term330356, term330356.getClass(), "sanityCheck", null);
        setField(term330356, term330356.getClass(), "currentTracer", null);
        setField(term330356, term330356.getClass(), "currentPassName", null);
        setField(term330356, term330356.getClass(), "recentChange", null);
        setField(term330356, term330356.getClass(), "codeChangeHandlers", null);
        term2309169 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term2309169, term2309169.getClass(), "options", null);
        setField(term2309169, term2309169.getClass(), "passes", null);
        setField(term2309169, term2309169.getClass(), "externs", null);
        setField(term2309169, term2309169.getClass(), "modules", null);
        setField(term2309169, term2309169.getClass(), "moduleGraph", null);
        setField(term2309169, term2309169.getClass(), "inputs", null);
        setField(term2309169, term2309169.getClass(), "errorManager", null);
        setField(term2309169, term2309169.getClass(), "symbolTable", null);
        setField(term2309169, term2309169.getClass(), "externsRoot", null);
        setField(term2309169, term2309169.getClass(), "jsRoot", null);
        setField(term2309169, term2309169.getClass(), "externAndJsRoot", null);
        setField(term2309169, term2309169.getClass(), "inputsByName", null);
        setField(term2309169, term2309169.getClass(), "sourceMap", null);
        setField(term2309169, term2309169.getClass(), "externExports", null);
        setIntField(term2309169, term2309169.getClass(), "uniqueNameId", 0);
        setBooleanField(term2309169, term2309169.getClass(), "normalized", false);
        setBooleanField(term2309169, term2309169.getClass(), "useThreads", false);
        setField(term2309169, term2309169.getClass(), "functionInformationMap", null);
        setField(term2309169, term2309169.getClass(), "debugLog", null);
        setField(term2309169, term2309169.getClass(), "defaultCodingConvention", null);
        setField(term2309169, term2309169.getClass(), "typeRegistry", null);
        setField(term2309169, term2309169.getClass(), "parserConfig", null);
        setField(term2309169, term2309169.getClass(), "abstractInterpreter", null);
        setField(term2309169, term2309169.getClass(), "typeValidator", null);
        setField(term2309169, term2309169.getClass(), "tracker", null);
        setField(term2309169, term2309169.getClass(), "oldErrorReporter", null);
        setField(term2309169, term2309169.getClass(), "defaultErrorReporter", null);
        setField(term2309169, term2309169.getClass(), "outStream", null);
        setField(term2309169, term2309169.getClass(), "sanityCheck", null);
        setField(term2309169, term2309169.getClass(), "currentTracer", null);
        setField(term2309169, term2309169.getClass(), "currentPassName", null);
        setField(term2309169, term2309169.getClass(), "recentChange", null);
        setField(term2309169, term2309169.getClass(), "codeChangeHandlers", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getFunctionalInformationMap", argTypes, term330356, args);
        assertTrue(recursiveEquals(term330356, term2309169));
        assertTrue(recursiveEquals(retValue, null));
    }

};


