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
import java.lang.ArrayIndexOutOfBoundsException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class TypeInference_isAddedAsNumber_162115218261 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1510;

    public TypeInference_isAddedAsNumber_162115218261() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1513 = new HashMap();
        HashMap term1522 = new HashMap();
        Set<Object> term13106 =  ((Map) term1522).keySet();
        HashSet term1521 = new HashSet((Collection<? extends Object>) term13106);
        HashMap term1528 = new HashMap();
        Set<Object> term13107 =  ((Map) term1528).keySet();
        HashSet term1527 = new HashSet((Collection<? extends Object>) term13107);
        HashMap term1535 = new HashMap();
        Set<Object> term13108 =  ((Map) term1535).keySet();
        HashSet term1534 = new HashSet((Collection<? extends Object>) term13108);
        HashMap term1541 = new HashMap();
        HashMap term1549 = new HashMap();
        HashMap term1554 = new HashMap();
        term1510 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        Object term1511 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term1512 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 8);
        setField(term1510, term1510.getClass(), "compiler", null);
        setField(term1511, term1511.getClass(), "reporter", null);
        setField(term1511, term1511.getClass(), "nativeTypes", term1512);
        setField(term1511, term1511.getClass(), "namesToTypes", term1513);
        setField(term1511, term1511.getClass(), "namespaces", term1521);
        setField(term1511, term1511.getClass(), "nonNullableTypeNames", term1527);
        setField(term1511, term1511.getClass(), "forwardDeclaredTypes", term1534);
        setField(term1511, term1511.getClass(), "typesIndexedByProperty", term1541);
        setField(term1511, term1511.getClass(), "eachRefTypeIndexedByProperty", term1549);
        setField(term1511, term1511.getClass(), "greatestSubtypeByProperty", term1554);
        setField(term1511, term1511.getClass(), "interfaceToImplementors", null);
        setField(term1511, term1511.getClass(), "unresolvedNamedTypes", null);
        setField(term1511, term1511.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term1511, term1511.getClass(), "lastGeneration", false);
        setField(term1511, term1511.getClass(), "templateTypeName", null);
        setField(term1511, term1511.getClass(), "templateType", null);
        setBooleanField(term1511, term1511.getClass(), "tolerateUndefinedValues", false);
        setField(term1511, term1511.getClass(), "resolveMode", null);
        setField(term1510, term1510.getClass(), "registry", term1511);
        setField(term1510, term1510.getClass(), "reverseInterpreter", null);
        setField(term1510, term1510.getClass(), "syntacticScope", null);
        setField(term1510, term1510.getClass(), "functionScope", null);
        setField(term1510, term1510.getClass(), "bottomScope", null);
        setField(term1510, term1510.getClass(), "assertionFunctionsMap", null);
        setField(term1510, term1510.getClass(), "cfg", null);
        setField(term1510, term1510.getClass(), "joinOp", null);
        setField(term1510, term1510.getClass(), "orderedWorkSet", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "isAddedAsNumber", argTypes, term1510, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


