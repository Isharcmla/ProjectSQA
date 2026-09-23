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
import java.lang.StringBuilder;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;

public class RenamePrototypes_process_531819914189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term234694;
     Object term235178;
     Object term235270;
     Object term264841;
     Object term264853;
     Object term264854;

    public RenamePrototypes_process_531819914189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term264856 = Class.forName((String) "com.google.javascript.jscomp.AbstractCompiler$LifeCycleStage");
        Field term264855 = ((Class) term264856).getDeclaredField((String) "NORMALIZED");
        ((Field) term264855).setAccessible(true);
        Object enum239 = ((Field) term264855).get((Object) null);
        StringBuilder term234998 = new StringBuilder();
        HashSet term235086 = new HashSet();
        term234694 = newInstance(Class.forName("com.google.javascript.jscomp.RenamePrototypes"));
        Object term234774 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term235038 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term234774, term234774.getClass(), "stage", enum239);
        setField(term234774, term234774.getClass(), "debugLog", term234998);
        setField(term234694, term234694.getClass(), "compiler", term234774);
        setField(term234694, term234694.getClass(), "properties", term235038);
        setField(term234694, term234694.getClass(), "prevUsedRenameMap", null);
        setField(term234694, term234694.getClass(), "reservedNames", null);
        setField(term234694, term234694.getClass(), "reservedCharacters", null);
        setField(term234694, term234694.getClass(), "stringNodes", term235086);
        term235178 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term235178, term235178.getClass(), "type", 0);
        setField(term235178, term235178.getClass(), "first", null);
        term235270 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term235270, term235270.getClass(), "type", 0);
        setField(term235270, term235270.getClass(), "first", null);
        Class<? extends Object> term265227 = Class.forName((String) "com.google.javascript.jscomp.AbstractCompiler$LifeCycleStage");
        Field term265226 = ((Class) term265227).getDeclaredField((String) "NORMALIZED_OBFUSCATED");
        ((Field) term265226).setAccessible(true);
        Object enum240 = ((Field) term265226).get((Object) null);
        HashMap term264849 = new HashMap();
        Set<Object> term265596 =  ((Map) term264849).keySet();
        HashSet term264848 = new HashSet((Collection<? extends Object>) term265596);
        term264841 = newInstance(Class.forName("com.google.javascript.jscomp.RenamePrototypes"));
        Object term264842 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term264843 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term264844 = (byte[]) newByteArray(34);
        Object term264851 = newInstance(Class.forName("java.util.TreeMap"));
        Object term264852 = newInstance(Class.forName("java.util.TreeMap$EntrySet"));
        setField(term264842, term264842.getClass(), "options", null);
        setField(term264842, term264842.getClass(), "passes", null);
        setField(term264842, term264842.getClass(), "externs", null);
        setField(term264842, term264842.getClass(), "modules", null);
        setField(term264842, term264842.getClass(), "moduleGraph", null);
        setField(term264842, term264842.getClass(), "inputs", null);
        setField(term264842, term264842.getClass(), "errorManager", null);
        setField(term264842, term264842.getClass(), "warningsGuard", null);
        setField(term264842, term264842.getClass(), "externsRoot", null);
        setField(term264842, term264842.getClass(), "jsRoot", null);
        setField(term264842, term264842.getClass(), "externAndJsRoot", null);
        setField(term264842, term264842.getClass(), "inputsByName", null);
        setField(term264842, term264842.getClass(), "sourceMap", null);
        setField(term264842, term264842.getClass(), "externExports", null);
        setIntField(term264842, term264842.getClass(), "uniqueNameId", 0);
        setBooleanField(term264842, term264842.getClass(), "useThreads", false);
        setBooleanField(term264842, term264842.getClass(), "hasRegExpGlobalReferences", false);
        setField(term264842, term264842.getClass(), "functionInformationMap", null);
        setByteElement(term264844, 0, (byte) 74);
        setByteElement(term264844, 1, (byte) 83);
        setByteElement(term264844, 2, (byte) 32);
        setByteElement(term264844, 3, (byte) 112);
        setByteElement(term264844, 4, (byte) 114);
        setByteElement(term264844, 5, (byte) 111);
        setByteElement(term264844, 6, (byte) 112);
        setByteElement(term264844, 7, (byte) 101);
        setByteElement(term264844, 8, (byte) 114);
        setByteElement(term264844, 9, (byte) 116);
        setByteElement(term264844, 10, (byte) 121);
        setByteElement(term264844, 11, (byte) 32);
        setByteElement(term264844, 12, (byte) 97);
        setByteElement(term264844, 13, (byte) 115);
        setByteElement(term264844, 14, (byte) 115);
        setByteElement(term264844, 15, (byte) 105);
        setByteElement(term264844, 16, (byte) 103);
        setByteElement(term264844, 17, (byte) 110);
        setByteElement(term264844, 18, (byte) 109);
        setByteElement(term264844, 19, (byte) 101);
        setByteElement(term264844, 20, (byte) 110);
        setByteElement(term264844, 21, (byte) 116);
        setByteElement(term264844, 22, (byte) 115);
        setByteElement(term264844, 23, (byte) 58);
        setByteElement(term264844, 24, (byte) 10);
        setByteElement(term264844, 25, (byte) 10);
        setField(term264843, term264843.getClass(), "value", term264844);
        setByteField(term264843, term264843.getClass(), "coder", (byte) 0);
        setIntField(term264843, term264843.getClass(), "count", 26);
        setField(term264842, term264842.getClass(), "debugLog", term264843);
        setField(term264842, term264842.getClass(), "defaultCodingConvention", null);
        setField(term264842, term264842.getClass(), "typeRegistry", null);
        setField(term264842, term264842.getClass(), "parserConfig", null);
        setField(term264842, term264842.getClass(), "abstractInterpreter", null);
        setField(term264842, term264842.getClass(), "typeValidator", null);
        setField(term264842, term264842.getClass(), "tracker", null);
        setField(term264842, term264842.getClass(), "oldErrorReporter", null);
        setField(term264842, term264842.getClass(), "defaultErrorReporter", null);
        setField(term264842, term264842.getClass(), "outStream", null);
        setField(term264842, term264842.getClass(), "sanityCheck", null);
        setField(term264842, term264842.getClass(), "currentTracer", null);
        setField(term264842, term264842.getClass(), "currentPassName", null);
        setField(term264842, term264842.getClass(), "recentChange", null);
        setField(term264842, term264842.getClass(), "codeChangeHandlers", null);
        setField(term264842, term264842.getClass(), "stage", enum240);
        setField(term264841, term264841.getClass(), "compiler", term264842);
        setBooleanField(term264841, term264841.getClass(), "aggressiveRenaming", false);
        setField(term264841, term264841.getClass(), "reservedCharacters", null);
        setField(term264841, term264841.getClass(), "prevUsedRenameMap", null);
        setField(term264841, term264841.getClass(), "stringNodes", term264848);
        setField(term264851, term264851.getClass(), "comparator", null);
        setField(term264851, term264851.getClass(), "root", null);
        setIntField(term264851, term264851.getClass(), "size", 0);
        setIntField(term264851, term264851.getClass(), "modCount", 0);
        setField(term264852, term264852.getClass(), "this$0", term264851);
        setField(term264851, term264851.getClass(), "entrySet", term264852);
        setField(term264851, term264851.getClass(), "navigableKeySet", null);
        setField(term264851, term264851.getClass(), "descendingMap", null);
        setField(term264851, term264851.getClass(), "keySet", null);
        setField(term264851, term264851.getClass(), "values", null);
        setField(term264841, term264841.getClass(), "properties", term264851);
        setField(term264841, term264841.getClass(), "reservedNames", null);
        setField(term264841, term264841.getClass(), "prototypeObjLits", null);
        term264853 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term264853, term264853.getClass(), "number", 0.0);
        setIntField(term264853, term264853.getClass(), "type", 0);
        setField(term264853, term264853.getClass(), "next", null);
        setField(term264853, term264853.getClass(), "first", null);
        setField(term264853, term264853.getClass(), "last", null);
        setField(term264853, term264853.getClass(), "propListHead", null);
        setIntField(term264853, term264853.getClass(), "sourcePosition", 0);
        setField(term264853, term264853.getClass(), "jsType", null);
        setField(term264853, term264853.getClass(), "parent", null);
        term264854 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term264854, term264854.getClass(), "number", 0.0);
        setIntField(term264854, term264854.getClass(), "type", 0);
        setField(term264854, term264854.getClass(), "next", null);
        setField(term264854, term264854.getClass(), "first", null);
        setField(term264854, term264854.getClass(), "last", null);
        setField(term264854, term264854.getClass(), "propListHead", null);
        setIntField(term264854, term264854.getClass(), "sourcePosition", 0);
        setField(term264854, term264854.getClass(), "jsType", null);
        setField(term264854, term264854.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RenamePrototypes");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term235178;
        args[1] = term235270;
        callMethod(klass, "process", argTypes, term234694, args);
        assertTrue(recursiveEquals(term234694, term264841));
        assertTrue(recursiveEquals(term235178, term264853));
        assertTrue(recursiveEquals(term235270, term264854));
    }

};


