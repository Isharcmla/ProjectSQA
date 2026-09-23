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
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;

public class RenameVars_init_156486529824 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15545;
     Object term16452;
     Object term16468;

    public RenameVars_init_156486529824() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term15145 = new ArrayList();
        ArrayList term15197 = new ArrayList();
        ArrayList term15249 = new ArrayList();
        HashSet term15297 = new HashSet();
        HashMap term15345 = new HashMap();
        Object term15093 = newInstance(Class.forName("com.google.javascript.jscomp.RenameVars"));
        Object term15385 = newInstance(Class.forName("java.util.TreeMap"));
        Object term15465 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term15093, term15093.getClass(), "globalNameNodes", term15145);
        setField(term15093, term15093.getClass(), "localNameNodes", term15197);
        setField(term15093, term15093.getClass(), "localTempNames", term15249);
        setField(term15093, term15093.getClass(), "externNames", term15297);
        setField(term15093, term15093.getClass(), "renameMap", term15345);
        setIntField(term15093, term15093.getClass(), "assignmentCount", 0);
        setField(term15093, term15093.getClass(), "assignments", term15385);
        setField(term15093, term15093.getClass(), "compiler", term15465);
        term15545 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        ArrayList term16454 = new ArrayList();
        ArrayList term16456 = new ArrayList();
        ArrayList term16458 = new ArrayList();
        HashMap term16461 = new HashMap();
        Set<Object> term16469 =  ((Map) term16461).keySet();
        HashSet term16460 = new HashSet((Collection<? extends Object>) term16469);
        HashMap term16463 = new HashMap();
        Set<Object> term16470 =  ((Map) term16463).keySet();
        HashSet term16462 = new HashSet((Collection<? extends Object>) term16470);
        HashMap term16464 = new HashMap();
        term16452 = newInstance(Class.forName("com.google.javascript.jscomp.RenameVars"));
        Object term16453 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term16467 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term16453, term16453.getClass(), "options_", null);
        setField(term16453, term16453.getClass(), "passes", null);
        setField(term16453, term16453.getClass(), "externs_", null);
        setField(term16453, term16453.getClass(), "modules_", null);
        setField(term16453, term16453.getClass(), "moduleGraph_", null);
        setField(term16453, term16453.getClass(), "inputs_", null);
        setField(term16453, term16453.getClass(), "errorManager", null);
        setField(term16453, term16453.getClass(), "symbolTable", null);
        setField(term16453, term16453.getClass(), "externsRoot", null);
        setField(term16453, term16453.getClass(), "jsRoot", null);
        setField(term16453, term16453.getClass(), "externAndJsRoot", null);
        setField(term16453, term16453.getClass(), "inputsByName_", null);
        setField(term16453, term16453.getClass(), "sourceMap_", null);
        setField(term16453, term16453.getClass(), "externExports_", null);
        setIntField(term16453, term16453.getClass(), "uniqueNameId", 0);
        setBooleanField(term16453, term16453.getClass(), "normalized", false);
        setBooleanField(term16453, term16453.getClass(), "useThreads", false);
        setField(term16453, term16453.getClass(), "functionInformationMap_", null);
        setField(term16453, term16453.getClass(), "debugLog_", null);
        setField(term16453, term16453.getClass(), "defaultCodingConvention", null);
        setField(term16453, term16453.getClass(), "typeRegistry", null);
        setField(term16453, term16453.getClass(), "parserConfig", null);
        setField(term16453, term16453.getClass(), "abstractInterpreter", null);
        setField(term16453, term16453.getClass(), "typeValidator", null);
        setField(term16453, term16453.getClass(), "tracker", null);
        setField(term16453, term16453.getClass(), "oldErrorReporter", null);
        setField(term16453, term16453.getClass(), "defaultErrorReporter", null);
        setField(term16453, term16453.getClass(), "sanityCheck", null);
        setField(term16453, term16453.getClass(), "currentTracer", null);
        setField(term16453, term16453.getClass(), "currentPassName", null);
        setField(term16453, term16453.getClass(), "recentChange", null);
        setField(term16453, term16453.getClass(), "codeChangeHandlers", null);
        setField(term16452, term16452.getClass(), "compiler", term16453);
        setField(term16452, term16452.getClass(), "globalNameNodes", term16454);
        setField(term16452, term16452.getClass(), "localNameNodes", term16456);
        setField(term16452, term16452.getClass(), "localTempNames", term16458);
        setField(term16452, term16452.getClass(), "externNames", term16460);
        setField(term16452, term16452.getClass(), "reservedNames", term16462);
        setField(term16452, term16452.getClass(), "renameMap", term16464);
        setField(term16452, term16452.getClass(), "prevUsedRenameMap", null);
        setField(term16452, term16452.getClass(), "prefix", "");
        setIntField(term16452, term16452.getClass(), "assignmentCount", 0);
        setField(term16452, term16452.getClass(), "assignmentLog", null);
        setField(term16467, term16467.getClass(), "comparator", null);
        setField(term16467, term16467.getClass(), "root", null);
        setIntField(term16467, term16467.getClass(), "size", 0);
        setIntField(term16467, term16467.getClass(), "modCount", 0);
        setField(term16467, term16467.getClass(), "entrySet", null);
        setField(term16467, term16467.getClass(), "navigableKeySet", null);
        setField(term16467, term16467.getClass(), "descendingMap", null);
        setField(term16467, term16467.getClass(), "keySet", null);
        setField(term16467, term16467.getClass(), "values", null);
        setField(term16452, term16452.getClass(), "assignments", term16467);
        setBooleanField(term16452, term16452.getClass(), "localRenamingOnly", false);
        setBooleanField(term16452, term16452.getClass(), "preserveAnonymousFunctionNames", false);
        setBooleanField(term16452, term16452.getClass(), "generatePseudoNames", false);
        setField(term16452, term16452.getClass(), "reservedCharacters", null);
        term16468 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term16468, term16468.getClass(), "options_", null);
        setField(term16468, term16468.getClass(), "passes", null);
        setField(term16468, term16468.getClass(), "externs_", null);
        setField(term16468, term16468.getClass(), "modules_", null);
        setField(term16468, term16468.getClass(), "moduleGraph_", null);
        setField(term16468, term16468.getClass(), "inputs_", null);
        setField(term16468, term16468.getClass(), "errorManager", null);
        setField(term16468, term16468.getClass(), "symbolTable", null);
        setField(term16468, term16468.getClass(), "externsRoot", null);
        setField(term16468, term16468.getClass(), "jsRoot", null);
        setField(term16468, term16468.getClass(), "externAndJsRoot", null);
        setField(term16468, term16468.getClass(), "inputsByName_", null);
        setField(term16468, term16468.getClass(), "sourceMap_", null);
        setField(term16468, term16468.getClass(), "externExports_", null);
        setIntField(term16468, term16468.getClass(), "uniqueNameId", 0);
        setBooleanField(term16468, term16468.getClass(), "normalized", false);
        setBooleanField(term16468, term16468.getClass(), "useThreads", false);
        setField(term16468, term16468.getClass(), "functionInformationMap_", null);
        setField(term16468, term16468.getClass(), "debugLog_", null);
        setField(term16468, term16468.getClass(), "defaultCodingConvention", null);
        setField(term16468, term16468.getClass(), "typeRegistry", null);
        setField(term16468, term16468.getClass(), "parserConfig", null);
        setField(term16468, term16468.getClass(), "abstractInterpreter", null);
        setField(term16468, term16468.getClass(), "typeValidator", null);
        setField(term16468, term16468.getClass(), "tracker", null);
        setField(term16468, term16468.getClass(), "oldErrorReporter", null);
        setField(term16468, term16468.getClass(), "defaultErrorReporter", null);
        setField(term16468, term16468.getClass(), "sanityCheck", null);
        setField(term16468, term16468.getClass(), "currentTracer", null);
        setField(term16468, term16468.getClass(), "currentPassName", null);
        setField(term16468, term16468.getClass(), "recentChange", null);
        setField(term16468, term16468.getClass(), "codeChangeHandlers", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RenameVars");
        Class<?>[] argTypes = new Class<?>[8];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = boolean.class;
        argTypes[3] = boolean.class;
        argTypes[4] = boolean.class;
        argTypes[5] = Class.forName("com.google.javascript.jscomp.VariableMap");
        argTypes[6] = Array.newInstance(char.class, 0).getClass();
        argTypes[7] = Class.forName("java.util.Set");
        Object[] args = new Object[8];
        args[0] = term15545;
        args[1] = null;
        args[2] = false;
        args[3] = false;
        args[4] = false;
        args[5] = null;
        args[6] = null;
        args[7] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term16452));
        assertTrue(recursiveEquals(term15545, term16468));
    }

};


