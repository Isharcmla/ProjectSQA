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
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class ProcessClosurePrimitives_init_136705540554 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27195;
     Object term27285;
     Object term27297;

    public ProcessClosurePrimitives_init_136705540554() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term27115 = new ArrayList();
        Object term27063 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        setField(term27063, term27063.getClass(), "providedNames", null);
        setField(term27063, term27063.getClass(), "unrecognizedRequires", term27115);
        setField(term27063, term27063.getClass(), "exportedVariables", null);
        setField(term27063, term27063.getClass(), "compiler", null);
        term27195 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        ArrayList term27293 = new ArrayList();
        HashMap term27296 = new HashMap();
        Set<Object> term27302 =  ((Map) term27296).keySet();
        HashSet term27295 = new HashSet((Collection<? extends Object>) term27302);
        term27285 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Object term27286 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term27287 = newInstance(Class.forName("java.util.TreeMap"));
        Object term27288 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term27291 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives$ProvidedName"));
        setField(term27286, term27286.getClass(), "options", null);
        setField(term27286, term27286.getClass(), "passes", null);
        setField(term27286, term27286.getClass(), "externs", null);
        setField(term27286, term27286.getClass(), "modules", null);
        setField(term27286, term27286.getClass(), "moduleGraph", null);
        setField(term27286, term27286.getClass(), "inputs", null);
        setField(term27286, term27286.getClass(), "errorManager", null);
        setField(term27286, term27286.getClass(), "warningsGuard", null);
        setField(term27286, term27286.getClass(), "externsRoot", null);
        setField(term27286, term27286.getClass(), "jsRoot", null);
        setField(term27286, term27286.getClass(), "externAndJsRoot", null);
        setField(term27286, term27286.getClass(), "inputsByName", null);
        setField(term27286, term27286.getClass(), "sourceMap", null);
        setField(term27286, term27286.getClass(), "externExports", null);
        setIntField(term27286, term27286.getClass(), "uniqueNameId", 0);
        setBooleanField(term27286, term27286.getClass(), "normalized", false);
        setBooleanField(term27286, term27286.getClass(), "useThreads", false);
        setBooleanField(term27286, term27286.getClass(), "hasRegExpGlobalReferences", false);
        setField(term27286, term27286.getClass(), "functionInformationMap", null);
        setField(term27286, term27286.getClass(), "debugLog", null);
        setField(term27286, term27286.getClass(), "defaultCodingConvention", null);
        setField(term27286, term27286.getClass(), "typeRegistry", null);
        setField(term27286, term27286.getClass(), "parserConfig", null);
        setField(term27286, term27286.getClass(), "abstractInterpreter", null);
        setField(term27286, term27286.getClass(), "typeValidator", null);
        setField(term27286, term27286.getClass(), "tracker", null);
        setField(term27286, term27286.getClass(), "oldErrorReporter", null);
        setField(term27286, term27286.getClass(), "defaultErrorReporter", null);
        setField(term27286, term27286.getClass(), "outStream", null);
        setField(term27286, term27286.getClass(), "sanityCheck", null);
        setField(term27286, term27286.getClass(), "currentTracer", null);
        setField(term27286, term27286.getClass(), "currentPassName", null);
        setField(term27286, term27286.getClass(), "recentChange", null);
        setField(term27286, term27286.getClass(), "codeChangeHandlers", null);
        setField(term27285, term27285.getClass(), "compiler", term27286);
        setField(term27285, term27285.getClass(), "moduleGraph", null);
        setField(term27287, term27287.getClass(), "comparator", null);
        setField(term27288, term27288.getClass(), "key", "goog");
        setField(term27291, term27291.getClass(), "namespace", "");
        setField(term27291, term27291.getClass(), "firstNode", null);
        setField(term27291, term27291.getClass(), "firstModule", null);
        setField(term27291, term27291.getClass(), "explicitNode", null);
        setField(term27291, term27291.getClass(), "explicitModule", null);
        setField(term27291, term27291.getClass(), "candidateDefinition", null);
        setField(term27291, term27291.getClass(), "minimumModule", null);
        setField(term27291, term27291.getClass(), "replacementNode", null);
        setField(term27291, term27291.getClass(), "this$0", term27285);
        setField(term27288, term27288.getClass(), "value", term27291);
        setField(term27288, term27288.getClass(), "left", null);
        setField(term27288, term27288.getClass(), "right", null);
        setField(term27288, term27288.getClass(), "parent", null);
        setBooleanField(term27288, term27288.getClass(), "color", true);
        setField(term27287, term27287.getClass(), "root", term27288);
        setIntField(term27287, term27287.getClass(), "size", 1);
        setIntField(term27287, term27287.getClass(), "modCount", 1);
        setField(term27287, term27287.getClass(), "entrySet", null);
        setField(term27287, term27287.getClass(), "navigableKeySet", null);
        setField(term27287, term27287.getClass(), "descendingMap", null);
        setField(term27287, term27287.getClass(), "keySet", null);
        setField(term27287, term27287.getClass(), "values", null);
        setField(term27285, term27285.getClass(), "providedNames", term27287);
        setField(term27285, term27285.getClass(), "unrecognizedRequires", term27293);
        setField(term27285, term27285.getClass(), "exportedVariables", term27295);
        setField(term27285, term27285.getClass(), "requiresLevel", null);
        setBooleanField(term27285, term27285.getClass(), "rewriteNewDateGoogNow", false);
        term27297 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term27297, term27297.getClass(), "options", null);
        setField(term27297, term27297.getClass(), "passes", null);
        setField(term27297, term27297.getClass(), "externs", null);
        setField(term27297, term27297.getClass(), "modules", null);
        setField(term27297, term27297.getClass(), "moduleGraph", null);
        setField(term27297, term27297.getClass(), "inputs", null);
        setField(term27297, term27297.getClass(), "errorManager", null);
        setField(term27297, term27297.getClass(), "warningsGuard", null);
        setField(term27297, term27297.getClass(), "externsRoot", null);
        setField(term27297, term27297.getClass(), "jsRoot", null);
        setField(term27297, term27297.getClass(), "externAndJsRoot", null);
        setField(term27297, term27297.getClass(), "inputsByName", null);
        setField(term27297, term27297.getClass(), "sourceMap", null);
        setField(term27297, term27297.getClass(), "externExports", null);
        setIntField(term27297, term27297.getClass(), "uniqueNameId", 0);
        setBooleanField(term27297, term27297.getClass(), "normalized", false);
        setBooleanField(term27297, term27297.getClass(), "useThreads", false);
        setBooleanField(term27297, term27297.getClass(), "hasRegExpGlobalReferences", false);
        setField(term27297, term27297.getClass(), "functionInformationMap", null);
        setField(term27297, term27297.getClass(), "debugLog", null);
        setField(term27297, term27297.getClass(), "defaultCodingConvention", null);
        setField(term27297, term27297.getClass(), "typeRegistry", null);
        setField(term27297, term27297.getClass(), "parserConfig", null);
        setField(term27297, term27297.getClass(), "abstractInterpreter", null);
        setField(term27297, term27297.getClass(), "typeValidator", null);
        setField(term27297, term27297.getClass(), "tracker", null);
        setField(term27297, term27297.getClass(), "oldErrorReporter", null);
        setField(term27297, term27297.getClass(), "defaultErrorReporter", null);
        setField(term27297, term27297.getClass(), "outStream", null);
        setField(term27297, term27297.getClass(), "sanityCheck", null);
        setField(term27297, term27297.getClass(), "currentTracer", null);
        setField(term27297, term27297.getClass(), "currentPassName", null);
        setField(term27297, term27297.getClass(), "recentChange", null);
        setField(term27297, term27297.getClass(), "codeChangeHandlers", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.CheckLevel");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term27195;
        args[1] = null;
        args[2] = false;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term27285));
        assertTrue(recursiveEquals(term27195, term27297));
    }

};


