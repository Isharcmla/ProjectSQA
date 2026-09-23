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
import java.lang.String;
import java.util.HashMap;
import java.util.ArrayDeque;

public class CrossModuleMethodMotion_init_144140326714 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1943;
     Object term2077;
     Object term8117;
     Object term8151;
     Object term8152;

    public CrossModuleMethodMotion_init_144140326714() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1783 = newInstance(Class.forName("com.google.javascript.jscomp.CrossModuleMethodMotion"));
        Object term1863 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term1783, term1783.getClass(), "compiler", term1863);
        setField(term1783, term1783.getClass(), "idGenerator", null);
        term1943 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        term2077 = newInstance(Class.forName("com.google.javascript.jscomp.CrossModuleMethodMotion$IdGenerator"));
        Class<? extends Object> term8154 = Class.forName((String) "com.google.javascript.jscomp.AnalyzePrototypeProperties$SymbolType");
        Field term8153 = ((Class) term8154).getDeclaredField((String) "PROPERTY");
        ((Field) term8153).setAccessible(true);
        Object enum1 = ((Field) term8153).get((Object) null);
        Class<? extends Object> term8515 = Class.forName((String) "com.google.javascript.jscomp.AnalyzePrototypeProperties$SymbolType");
        Field term8514 = ((Class) term8515).getDeclaredField((String) "VAR");
        ((Field) term8514).setAccessible(true);
        Object enum2 = ((Field) term8514).get((Object) null);
        HashMap term8128 = new HashMap();
        ArrayDeque term8133 = new ArrayDeque();
        ArrayDeque term8138 = new ArrayDeque();
        ArrayDeque term8143 = new ArrayDeque();
        HashMap term8145 = new HashMap();
        HashMap term8150 = new HashMap();
        term8117 = newInstance(Class.forName("com.google.javascript.jscomp.CrossModuleMethodMotion"));
        Object term8118 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term8119 = newInstance(Class.forName("com.google.javascript.jscomp.CrossModuleMethodMotion$IdGenerator"));
        Object term8120 = newInstance(Class.forName("com.google.javascript.jscomp.AnalyzePrototypeProperties"));
        Object term8127 = newInstance(Class.forName("com.google.javascript.jscomp.graph.LinkedDirectedGraph"));
        Object term8130 = newInstance(Class.forName("com.google.javascript.jscomp.AnalyzePrototypeProperties$NameInfo"));
        Object term8135 = newInstance(Class.forName("com.google.javascript.jscomp.AnalyzePrototypeProperties$NameInfo"));
        Object term8140 = newInstance(Class.forName("com.google.javascript.jscomp.AnalyzePrototypeProperties$NameInfo"));
        setField(term8118, term8118.getClass(), "options", null);
        setField(term8118, term8118.getClass(), "passes", null);
        setField(term8118, term8118.getClass(), "externs", null);
        setField(term8118, term8118.getClass(), "modules", null);
        setField(term8118, term8118.getClass(), "moduleGraph", null);
        setField(term8118, term8118.getClass(), "inputs", null);
        setField(term8118, term8118.getClass(), "errorManager", null);
        setField(term8118, term8118.getClass(), "warningsGuard", null);
        setField(term8118, term8118.getClass(), "externsRoot", null);
        setField(term8118, term8118.getClass(), "jsRoot", null);
        setField(term8118, term8118.getClass(), "externAndJsRoot", null);
        setField(term8118, term8118.getClass(), "inputsById", null);
        setField(term8118, term8118.getClass(), "sourceMap", null);
        setField(term8118, term8118.getClass(), "externExports", null);
        setIntField(term8118, term8118.getClass(), "uniqueNameId", 0);
        setBooleanField(term8118, term8118.getClass(), "useThreads", false);
        setBooleanField(term8118, term8118.getClass(), "hasRegExpGlobalReferences", false);
        setField(term8118, term8118.getClass(), "functionInformationMap", null);
        setField(term8118, term8118.getClass(), "debugLog", null);
        setField(term8118, term8118.getClass(), "defaultCodingConvention", null);
        setField(term8118, term8118.getClass(), "typeRegistry", null);
        setField(term8118, term8118.getClass(), "parserConfig", null);
        setField(term8118, term8118.getClass(), "abstractInterpreter", null);
        setField(term8118, term8118.getClass(), "typeValidator", null);
        setField(term8118, term8118.getClass(), "tracker", null);
        setField(term8118, term8118.getClass(), "oldErrorReporter", null);
        setField(term8118, term8118.getClass(), "defaultErrorReporter", null);
        setField(term8118, term8118.getClass(), "outStream", null);
        setField(term8118, term8118.getClass(), "globalRefMap", null);
        setField(term8118, term8118.getClass(), "sanityCheck", null);
        setField(term8118, term8118.getClass(), "currentTracer", null);
        setField(term8118, term8118.getClass(), "currentPassName", null);
        setIntField(term8118, term8118.getClass(), "syntheticCodeId", 0);
        setField(term8118, term8118.getClass(), "recentChange", null);
        setField(term8118, term8118.getClass(), "codeChangeHandlers", null);
        setField(term8118, term8118.getClass(), "stage", null);
        setField(term8117, term8117.getClass(), "compiler", term8118);
        setIntField(term8119, term8119.getClass(), "currentId", 0);
        setField(term8117, term8117.getClass(), "idGenerator", term8119);
        setField(term8120, term8120.getClass(), "PROPERTY", enum1);
        setField(term8120, term8120.getClass(), "VAR", enum2);
        setField(term8120, term8120.getClass(), "compiler", term8118);
        setBooleanField(term8120, term8120.getClass(), "canModifyExterns", false);
        setBooleanField(term8120, term8120.getClass(), "anchorUnusedVars", false);
        setField(term8120, term8120.getClass(), "moduleGraph", null);
        setField(term8120, term8120.getClass(), "firstModule", null);
        setField(term8127, term8127.getClass(), "nodes", term8128);
        setBooleanField(term8127, term8127.getClass(), "useNodeAnnotations", false);
        setBooleanField(term8127, term8127.getClass(), "useEdgeAnnotations", false);
        setField(term8127, term8127.getClass(), "nodeAnnotationStack", null);
        setField(term8127, term8127.getClass(), "edgeAnnotationStack", null);
        setField(term8120, term8120.getClass(), "symbolGraph", term8127);
        setField(term8130, term8130.getClass(), "name", "[global]");
        setBooleanField(term8130, term8130.getClass(), "referenced", true);
        setField(term8130, term8130.getClass(), "declarations", term8133);
        setField(term8130, term8130.getClass(), "deepestCommonModuleRef", null);
        setBooleanField(term8130, term8130.getClass(), "readClosureVariables", false);
        setField(term8130, term8130.getClass(), "this$0", term8120);
        setField(term8120, term8120.getClass(), "globalNode", term8130);
        setField(term8135, term8135.getClass(), "name", "[extern]");
        setBooleanField(term8135, term8135.getClass(), "referenced", true);
        setField(term8135, term8135.getClass(), "declarations", term8138);
        setField(term8135, term8135.getClass(), "deepestCommonModuleRef", null);
        setBooleanField(term8135, term8135.getClass(), "readClosureVariables", false);
        setField(term8135, term8135.getClass(), "this$0", term8120);
        setField(term8120, term8120.getClass(), "externNode", term8135);
        setField(term8140, term8140.getClass(), "name", "[anonymous]");
        setBooleanField(term8140, term8140.getClass(), "referenced", false);
        setField(term8140, term8140.getClass(), "declarations", term8143);
        setField(term8140, term8140.getClass(), "deepestCommonModuleRef", null);
        setBooleanField(term8140, term8140.getClass(), "readClosureVariables", false);
        setField(term8140, term8140.getClass(), "this$0", term8120);
        setField(term8120, term8120.getClass(), "anonymousNode", term8140);
        setField(term8120, term8120.getClass(), "propertyNameInfo", term8145);
        setField(term8120, term8120.getClass(), "varNameInfo", term8150);
        setField(term8117, term8117.getClass(), "analyzer", term8120);
        setField(term8117, term8117.getClass(), "moduleGraph", null);
        term8151 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term8151, term8151.getClass(), "options", null);
        setField(term8151, term8151.getClass(), "passes", null);
        setField(term8151, term8151.getClass(), "externs", null);
        setField(term8151, term8151.getClass(), "modules", null);
        setField(term8151, term8151.getClass(), "moduleGraph", null);
        setField(term8151, term8151.getClass(), "inputs", null);
        setField(term8151, term8151.getClass(), "errorManager", null);
        setField(term8151, term8151.getClass(), "warningsGuard", null);
        setField(term8151, term8151.getClass(), "externsRoot", null);
        setField(term8151, term8151.getClass(), "jsRoot", null);
        setField(term8151, term8151.getClass(), "externAndJsRoot", null);
        setField(term8151, term8151.getClass(), "inputsById", null);
        setField(term8151, term8151.getClass(), "sourceMap", null);
        setField(term8151, term8151.getClass(), "externExports", null);
        setIntField(term8151, term8151.getClass(), "uniqueNameId", 0);
        setBooleanField(term8151, term8151.getClass(), "useThreads", false);
        setBooleanField(term8151, term8151.getClass(), "hasRegExpGlobalReferences", false);
        setField(term8151, term8151.getClass(), "functionInformationMap", null);
        setField(term8151, term8151.getClass(), "debugLog", null);
        setField(term8151, term8151.getClass(), "defaultCodingConvention", null);
        setField(term8151, term8151.getClass(), "typeRegistry", null);
        setField(term8151, term8151.getClass(), "parserConfig", null);
        setField(term8151, term8151.getClass(), "abstractInterpreter", null);
        setField(term8151, term8151.getClass(), "typeValidator", null);
        setField(term8151, term8151.getClass(), "tracker", null);
        setField(term8151, term8151.getClass(), "oldErrorReporter", null);
        setField(term8151, term8151.getClass(), "defaultErrorReporter", null);
        setField(term8151, term8151.getClass(), "outStream", null);
        setField(term8151, term8151.getClass(), "globalRefMap", null);
        setField(term8151, term8151.getClass(), "sanityCheck", null);
        setField(term8151, term8151.getClass(), "currentTracer", null);
        setField(term8151, term8151.getClass(), "currentPassName", null);
        setIntField(term8151, term8151.getClass(), "syntheticCodeId", 0);
        setField(term8151, term8151.getClass(), "recentChange", null);
        setField(term8151, term8151.getClass(), "codeChangeHandlers", null);
        setField(term8151, term8151.getClass(), "stage", null);
        term8152 = newInstance(Class.forName("com.google.javascript.jscomp.CrossModuleMethodMotion$IdGenerator"));
        setIntField(term8152, term8152.getClass(), "currentId", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CrossModuleMethodMotion");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.CrossModuleMethodMotion$IdGenerator");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term1943;
        args[1] = term2077;
        args[2] = false;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term8117));
        assertTrue(recursiveEquals(term1943, term8151));
        assertTrue(recursiveEquals(term2077, false));
    }

};


