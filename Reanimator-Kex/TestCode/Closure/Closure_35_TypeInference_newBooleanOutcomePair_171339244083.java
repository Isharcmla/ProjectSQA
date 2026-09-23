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
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.String;

public class TypeInference_newBooleanOutcomePair_171339244083 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5845;
     Object term25867;
     Object term25858;

    public TypeInference_newBooleanOutcomePair_171339244083() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5848 = new HashMap();
        HashMap term5857 = new HashMap();
        Set<Object> term25880 =  ((Map) term5857).keySet();
        HashSet term5856 = new HashSet((Collection<? extends Object>) term25880);
        HashMap term5864 = new HashMap();
        Set<Object> term25881 =  ((Map) term5864).keySet();
        HashSet term5863 = new HashSet((Collection<? extends Object>) term25881);
        HashMap term5871 = new HashMap();
        Set<Object> term25882 =  ((Map) term5871).keySet();
        HashSet term5870 = new HashSet((Collection<? extends Object>) term25882);
        HashMap term5877 = new HashMap();
        HashMap term5885 = new HashMap();
        HashMap term5890 = new HashMap();
        term5845 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        Object term5846 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term5847 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 1);
        setField(term5845, term5845.getClass(), "compiler", null);
        setField(term5846, term5846.getClass(), "reporter", null);
        setField(term5846, term5846.getClass(), "nativeTypes", term5847);
        setField(term5846, term5846.getClass(), "namesToTypes", term5848);
        setField(term5846, term5846.getClass(), "namespaces", term5856);
        setField(term5846, term5846.getClass(), "nonNullableTypeNames", term5863);
        setField(term5846, term5846.getClass(), "forwardDeclaredTypes", term5870);
        setField(term5846, term5846.getClass(), "typesIndexedByProperty", term5877);
        setField(term5846, term5846.getClass(), "eachRefTypeIndexedByProperty", term5885);
        setField(term5846, term5846.getClass(), "greatestSubtypeByProperty", term5890);
        setField(term5846, term5846.getClass(), "interfaceToImplementors", null);
        setField(term5846, term5846.getClass(), "unresolvedNamedTypes", null);
        setField(term5846, term5846.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term5846, term5846.getClass(), "lastGeneration", false);
        setField(term5846, term5846.getClass(), "templateTypeName", null);
        setField(term5846, term5846.getClass(), "templateType", null);
        setBooleanField(term5846, term5846.getClass(), "tolerateUndefinedValues", false);
        setField(term5846, term5846.getClass(), "resolveMode", null);
        setField(term5845, term5845.getClass(), "registry", term5846);
        setField(term5845, term5845.getClass(), "reverseInterpreter", null);
        setField(term5845, term5845.getClass(), "syntacticScope", null);
        setField(term5845, term5845.getClass(), "functionScope", null);
        setField(term5845, term5845.getClass(), "bottomScope", null);
        setField(term5845, term5845.getClass(), "assertionFunctionsMap", null);
        setField(term5845, term5845.getClass(), "cfg", null);
        setField(term5845, term5845.getClass(), "joinOp", null);
        setField(term5845, term5845.getClass(), "orderedWorkSet", null);
        HashMap term25870 = new HashMap();
        HashMap term25872 = new HashMap();
        Set<Object> term25883 =  ((Map) term25872).keySet();
        HashSet term25871 = new HashSet((Collection<? extends Object>) term25883);
        HashMap term25874 = new HashMap();
        Set<Object> term25884 =  ((Map) term25874).keySet();
        HashSet term25873 = new HashSet((Collection<? extends Object>) term25884);
        HashMap term25876 = new HashMap();
        Set<Object> term25885 =  ((Map) term25876).keySet();
        HashSet term25875 = new HashSet((Collection<? extends Object>) term25885);
        HashMap term25877 = new HashMap();
        HashMap term25878 = new HashMap();
        HashMap term25879 = new HashMap();
        term25867 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        Object term25868 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term25869 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 1);
        setField(term25867, term25867.getClass(), "compiler", null);
        setField(term25868, term25868.getClass(), "reporter", null);
        setField(term25868, term25868.getClass(), "nativeTypes", term25869);
        setField(term25868, term25868.getClass(), "namesToTypes", term25870);
        setField(term25868, term25868.getClass(), "namespaces", term25871);
        setField(term25868, term25868.getClass(), "nonNullableTypeNames", term25873);
        setField(term25868, term25868.getClass(), "forwardDeclaredTypes", term25875);
        setField(term25868, term25868.getClass(), "typesIndexedByProperty", term25877);
        setField(term25868, term25868.getClass(), "eachRefTypeIndexedByProperty", term25878);
        setField(term25868, term25868.getClass(), "greatestSubtypeByProperty", term25879);
        setField(term25868, term25868.getClass(), "interfaceToImplementors", null);
        setField(term25868, term25868.getClass(), "unresolvedNamedTypes", null);
        setField(term25868, term25868.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term25868, term25868.getClass(), "lastGeneration", false);
        setField(term25868, term25868.getClass(), "templateTypeName", null);
        setField(term25868, term25868.getClass(), "templateType", null);
        setBooleanField(term25868, term25868.getClass(), "tolerateUndefinedValues", false);
        setField(term25868, term25868.getClass(), "resolveMode", null);
        setField(term25867, term25867.getClass(), "registry", term25868);
        setField(term25867, term25867.getClass(), "reverseInterpreter", null);
        setField(term25867, term25867.getClass(), "syntacticScope", null);
        setField(term25867, term25867.getClass(), "functionScope", null);
        setField(term25867, term25867.getClass(), "bottomScope", null);
        setField(term25867, term25867.getClass(), "assertionFunctionsMap", null);
        setField(term25867, term25867.getClass(), "cfg", null);
        setField(term25867, term25867.getClass(), "joinOp", null);
        setField(term25867, term25867.getClass(), "orderedWorkSet", null);
        Class<? extends Object> term25887 = Class.forName((String) "com.google.javascript.rhino.jstype.BooleanLiteralSet");
        Field term25886 = ((Class) term25887).getDeclaredField((String) "BOTH");
        ((Field) term25886).setAccessible(true);
        Object enum31 = ((Field) term25886).get((Object) null);
        HashMap term25818 = new HashMap();
        HashMap term25824 = new HashMap();
        Set<Object> term26165 =  ((Map) term25824).keySet();
        HashSet term25823 = new HashSet((Collection<? extends Object>) term26165);
        HashMap term25830 = new HashMap();
        Set<Object> term26166 =  ((Map) term25830).keySet();
        HashSet term25829 = new HashSet((Collection<? extends Object>) term26166);
        HashMap term25836 = new HashMap();
        Set<Object> term26167 =  ((Map) term25836).keySet();
        HashSet term25835 = new HashSet((Collection<? extends Object>) term26167);
        HashMap term25841 = new HashMap();
        HashMap term25846 = new HashMap();
        HashMap term25851 = new HashMap();
        term25858 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference$BooleanOutcomePair"));
        Object term25815 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        Object term25816 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term25817 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 1);
        setField(term25858, term25858.getClass(), "toBooleanOutcomes", enum31);
        setField(term25858, term25858.getClass(), "booleanValues", enum31);
        setField(term25858, term25858.getClass(), "leftScope", null);
        setField(term25858, term25858.getClass(), "rightScope", null);
        setField(term25858, term25858.getClass(), "joinedScope", null);
        setField(term25815, term25815.getClass(), "compiler", null);
        setField(term25816, term25816.getClass(), "reporter", null);
        setField(term25816, term25816.getClass(), "nativeTypes", term25817);
        setField(term25816, term25816.getClass(), "namesToTypes", term25818);
        setField(term25816, term25816.getClass(), "namespaces", term25823);
        setField(term25816, term25816.getClass(), "nonNullableTypeNames", term25829);
        setField(term25816, term25816.getClass(), "forwardDeclaredTypes", term25835);
        setField(term25816, term25816.getClass(), "typesIndexedByProperty", term25841);
        setField(term25816, term25816.getClass(), "eachRefTypeIndexedByProperty", term25846);
        setField(term25816, term25816.getClass(), "greatestSubtypeByProperty", term25851);
        setField(term25816, term25816.getClass(), "interfaceToImplementors", null);
        setField(term25816, term25816.getClass(), "unresolvedNamedTypes", null);
        setField(term25816, term25816.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term25816, term25816.getClass(), "lastGeneration", false);
        setField(term25816, term25816.getClass(), "templateTypeName", null);
        setField(term25816, term25816.getClass(), "templateType", null);
        setBooleanField(term25816, term25816.getClass(), "tolerateUndefinedValues", false);
        setField(term25816, term25816.getClass(), "resolveMode", null);
        setField(term25815, term25815.getClass(), "registry", term25816);
        setField(term25815, term25815.getClass(), "reverseInterpreter", null);
        setField(term25815, term25815.getClass(), "syntacticScope", null);
        setField(term25815, term25815.getClass(), "functionScope", null);
        setField(term25815, term25815.getClass(), "bottomScope", null);
        setField(term25815, term25815.getClass(), "assertionFunctionsMap", null);
        setField(term25815, term25815.getClass(), "cfg", null);
        setField(term25815, term25815.getClass(), "joinOp", null);
        setField(term25815, term25815.getClass(), "orderedWorkSet", null);
        setField(term25858, term25858.getClass(), "this$0", term25815);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.FlowScope");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        Object retValue = callMethod(klass, "newBooleanOutcomePair", argTypes, term5845, args);
        assertTrue(recursiveEquals(term5845, term25867));
        assertTrue(recursiveEquals(retValue, term25858));
    }

};


