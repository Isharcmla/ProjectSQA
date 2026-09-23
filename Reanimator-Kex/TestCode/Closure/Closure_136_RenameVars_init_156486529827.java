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
import java.util.HashSet;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.Collection;

public class RenameVars_init_156486529827 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16273;
     Object term16397;
     Object term16565;
     Object term16582;
     Object term16585;

    public RenameVars_init_156486529827() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashSet term16025 = new HashSet();
        HashMap term16073 = new HashMap();
        Object term15977 = newInstance(Class.forName("com.google.javascript.jscomp.RenameVars"));
        Object term16113 = newInstance(Class.forName("java.util.TreeMap"));
        Object term16193 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        char[] term15833 = (char[]) newCharArray(0);
        setField(term15977, term15977.getClass(), "globalNameNodes", null);
        setField(term15977, term15977.getClass(), "localNameNodes", null);
        setField(term15977, term15977.getClass(), "localTempNames", null);
        setField(term15977, term15977.getClass(), "externNames", term16025);
        setField(term15977, term15977.getClass(), "renameMap", term16073);
        setIntField(term15977, term15977.getClass(), "assignmentCount", 0);
        setField(term15977, term15977.getClass(), "assignments", term16113);
        setField(term15977, term15977.getClass(), "compiler", term16193);
        setField(term15977, term15977.getClass(), "prefix", null);
        setBooleanField(term15977, term15977.getClass(), "localRenamingOnly", false);
        setBooleanField(term15977, term15977.getClass(), "preserveAnonymousFunctionNames", false);
        setBooleanField(term15977, term15977.getClass(), "generatePseudoNames", false);
        setField(term15977, term15977.getClass(), "prevUsedRenameMap", null);
        setField(term15977, term15977.getClass(), "reservedCharacters", term15833);
        term16273 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        term16397 = newInstance(Class.forName("com.google.javascript.jscomp.VariableMap"));
        ArrayList term16567 = new ArrayList();
        ArrayList term16569 = new ArrayList();
        ArrayList term16571 = new ArrayList();
        HashMap term16574 = new HashMap();
        Set<Object> term16586 =  ((Map) term16574).keySet();
        HashSet term16573 = new HashSet((Collection<? extends Object>) term16586);
        HashMap term16576 = new HashMap();
        Set<Object> term16587 =  ((Map) term16576).keySet();
        HashSet term16575 = new HashSet((Collection<? extends Object>) term16587);
        HashMap term16577 = new HashMap();
        term16565 = newInstance(Class.forName("com.google.javascript.jscomp.RenameVars"));
        Object term16566 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term16578 = newInstance(Class.forName("com.google.javascript.jscomp.VariableMap"));
        Object term16581 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term16566, term16566.getClass(), "options_", null);
        setField(term16566, term16566.getClass(), "passes", null);
        setField(term16566, term16566.getClass(), "externs_", null);
        setField(term16566, term16566.getClass(), "modules_", null);
        setField(term16566, term16566.getClass(), "moduleGraph_", null);
        setField(term16566, term16566.getClass(), "inputs_", null);
        setField(term16566, term16566.getClass(), "errorManager", null);
        setField(term16566, term16566.getClass(), "symbolTable", null);
        setField(term16566, term16566.getClass(), "externsRoot", null);
        setField(term16566, term16566.getClass(), "jsRoot", null);
        setField(term16566, term16566.getClass(), "externAndJsRoot", null);
        setField(term16566, term16566.getClass(), "inputsByName_", null);
        setField(term16566, term16566.getClass(), "sourceMap_", null);
        setField(term16566, term16566.getClass(), "externExports_", null);
        setIntField(term16566, term16566.getClass(), "uniqueNameId", 0);
        setBooleanField(term16566, term16566.getClass(), "normalized", false);
        setBooleanField(term16566, term16566.getClass(), "useThreads", false);
        setField(term16566, term16566.getClass(), "functionInformationMap_", null);
        setField(term16566, term16566.getClass(), "debugLog_", null);
        setField(term16566, term16566.getClass(), "defaultCodingConvention", null);
        setField(term16566, term16566.getClass(), "typeRegistry", null);
        setField(term16566, term16566.getClass(), "parserConfig", null);
        setField(term16566, term16566.getClass(), "abstractInterpreter", null);
        setField(term16566, term16566.getClass(), "typeValidator", null);
        setField(term16566, term16566.getClass(), "tracker", null);
        setField(term16566, term16566.getClass(), "oldErrorReporter", null);
        setField(term16566, term16566.getClass(), "defaultErrorReporter", null);
        setField(term16566, term16566.getClass(), "sanityCheck", null);
        setField(term16566, term16566.getClass(), "currentTracer", null);
        setField(term16566, term16566.getClass(), "currentPassName", null);
        setField(term16566, term16566.getClass(), "recentChange", null);
        setField(term16566, term16566.getClass(), "codeChangeHandlers", null);
        setField(term16565, term16565.getClass(), "compiler", term16566);
        setField(term16565, term16565.getClass(), "globalNameNodes", term16567);
        setField(term16565, term16565.getClass(), "localNameNodes", term16569);
        setField(term16565, term16565.getClass(), "localTempNames", term16571);
        setField(term16565, term16565.getClass(), "externNames", term16573);
        setField(term16565, term16565.getClass(), "reservedNames", term16575);
        setField(term16565, term16565.getClass(), "renameMap", term16577);
        setField(term16578, term16578.getClass(), "map", null);
        setField(term16578, term16578.getClass(), "reverseMap", null);
        setField(term16565, term16565.getClass(), "prevUsedRenameMap", term16578);
        setField(term16565, term16565.getClass(), "prefix", "");
        setIntField(term16565, term16565.getClass(), "assignmentCount", 0);
        setField(term16565, term16565.getClass(), "assignmentLog", null);
        setField(term16581, term16581.getClass(), "comparator", null);
        setField(term16581, term16581.getClass(), "root", null);
        setIntField(term16581, term16581.getClass(), "size", 0);
        setIntField(term16581, term16581.getClass(), "modCount", 0);
        setField(term16581, term16581.getClass(), "entrySet", null);
        setField(term16581, term16581.getClass(), "navigableKeySet", null);
        setField(term16581, term16581.getClass(), "descendingMap", null);
        setField(term16581, term16581.getClass(), "keySet", null);
        setField(term16581, term16581.getClass(), "values", null);
        setField(term16565, term16565.getClass(), "assignments", term16581);
        setBooleanField(term16565, term16565.getClass(), "localRenamingOnly", true);
        setBooleanField(term16565, term16565.getClass(), "preserveAnonymousFunctionNames", true);
        setBooleanField(term16565, term16565.getClass(), "generatePseudoNames", true);
        setField(term16565, term16565.getClass(), "reservedCharacters", null);
        term16582 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term16582, term16582.getClass(), "options_", null);
        setField(term16582, term16582.getClass(), "passes", null);
        setField(term16582, term16582.getClass(), "externs_", null);
        setField(term16582, term16582.getClass(), "modules_", null);
        setField(term16582, term16582.getClass(), "moduleGraph_", null);
        setField(term16582, term16582.getClass(), "inputs_", null);
        setField(term16582, term16582.getClass(), "errorManager", null);
        setField(term16582, term16582.getClass(), "symbolTable", null);
        setField(term16582, term16582.getClass(), "externsRoot", null);
        setField(term16582, term16582.getClass(), "jsRoot", null);
        setField(term16582, term16582.getClass(), "externAndJsRoot", null);
        setField(term16582, term16582.getClass(), "inputsByName_", null);
        setField(term16582, term16582.getClass(), "sourceMap_", null);
        setField(term16582, term16582.getClass(), "externExports_", null);
        setIntField(term16582, term16582.getClass(), "uniqueNameId", 0);
        setBooleanField(term16582, term16582.getClass(), "normalized", false);
        setBooleanField(term16582, term16582.getClass(), "useThreads", false);
        setField(term16582, term16582.getClass(), "functionInformationMap_", null);
        setField(term16582, term16582.getClass(), "debugLog_", null);
        setField(term16582, term16582.getClass(), "defaultCodingConvention", null);
        setField(term16582, term16582.getClass(), "typeRegistry", null);
        setField(term16582, term16582.getClass(), "parserConfig", null);
        setField(term16582, term16582.getClass(), "abstractInterpreter", null);
        setField(term16582, term16582.getClass(), "typeValidator", null);
        setField(term16582, term16582.getClass(), "tracker", null);
        setField(term16582, term16582.getClass(), "oldErrorReporter", null);
        setField(term16582, term16582.getClass(), "defaultErrorReporter", null);
        setField(term16582, term16582.getClass(), "sanityCheck", null);
        setField(term16582, term16582.getClass(), "currentTracer", null);
        setField(term16582, term16582.getClass(), "currentPassName", null);
        setField(term16582, term16582.getClass(), "recentChange", null);
        setField(term16582, term16582.getClass(), "codeChangeHandlers", null);
        term16585 = newInstance(Class.forName("com.google.javascript.jscomp.VariableMap"));
        setField(term16585, term16585.getClass(), "map", null);
        setField(term16585, term16585.getClass(), "reverseMap", null);
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
        args[0] = term16273;
        args[1] = "";
        args[2] = true;
        args[3] = true;
        args[4] = true;
        args[5] = term16397;
        args[6] = null;
        args[7] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term16565));
        assertTrue(recursiveEquals(term16273, term16582));
        assertTrue(recursiveEquals(term16397, term16585));
    }

};


