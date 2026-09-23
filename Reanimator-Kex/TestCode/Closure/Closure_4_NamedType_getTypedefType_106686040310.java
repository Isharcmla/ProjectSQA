package com.google.javascript.rhino.jstype;

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
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.rhino.jstype.EqualityUtils.*;
import java.lang.Object;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;

public class NamedType_getTypedefType_106686040310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term148841;
     Object term149283;
     Object term149459;
     Object term150488;
     Object term150494;
     Object term150495;

    public NamedType_getTypedefType_106686040310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashSet term148993 = new HashSet();
        term148841 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term148945 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setBooleanField(term148945, term148945.getClass(), "lastGeneration", true);
        setField(term148945, term148945.getClass(), "forwardDeclaredTypes", term148993);
        setField(term148841, term148841.getClass(), "registry", term148945);
        setField(term148841, term148841.getClass(), "reference", null);
        setField(term148841, term148841.getClass(), "sourceName", "");
        setIntField(term148841, term148841.getClass(), "lineno", 0);
        setIntField(term148841, term148841.getClass(), "charno", 0);
        ArrayList term149335 = new ArrayList();
        term149283 = newInstance(Class.forName("com.google.javascript.rhino.SimpleErrorReporter"));
        setField(term149283, term149283.getClass(), "warnings", term149335);
        term149459 = newInstance(Class.forName("com.google.javascript.jscomp.LinkedFlowScope$LinkedFlowSlot"));
        setField(term149459, term149459.getClass(), "type", null);
        HashMap term150493 = new HashMap();
        Set<Object> term150500 =  ((Map) term150493).keySet();
        HashSet term150492 = new HashSet((Collection<? extends Object>) term150500);
        term150488 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term150491 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term150488, term150488.getClass(), "reference", null);
        setField(term150488, term150488.getClass(), "sourceName", "");
        setIntField(term150488, term150488.getClass(), "lineno", 0);
        setIntField(term150488, term150488.getClass(), "charno", 0);
        setField(term150488, term150488.getClass(), "validator", null);
        setField(term150488, term150488.getClass(), "propertyContinuations", null);
        setField(term150488, term150488.getClass(), "referencedType", null);
        setField(term150488, term150488.getClass(), "referencedObjType", null);
        setBooleanField(term150488, term150488.getClass(), "visited", false);
        setField(term150488, term150488.getClass(), "docInfo", null);
        setBooleanField(term150488, term150488.getClass(), "unknown", false);
        setBooleanField(term150488, term150488.getClass(), "resolved", true);
        setField(term150488, term150488.getClass(), "resolveResult", null);
        setField(term150488, term150488.getClass(), "templateKeys", null);
        setField(term150488, term150488.getClass(), "templatizedTypes", null);
        setBooleanField(term150488, term150488.getClass(), "inTemplatedCheckVisit", false);
        setField(term150491, term150491.getClass(), "reporter", null);
        setField(term150491, term150491.getClass(), "nativeTypes", null);
        setField(term150491, term150491.getClass(), "namesToTypes", null);
        setField(term150491, term150491.getClass(), "namespaces", null);
        setField(term150491, term150491.getClass(), "nonNullableTypeNames", null);
        setField(term150491, term150491.getClass(), "forwardDeclaredTypes", term150492);
        setField(term150491, term150491.getClass(), "typesIndexedByProperty", null);
        setField(term150491, term150491.getClass(), "eachRefTypeIndexedByProperty", null);
        setField(term150491, term150491.getClass(), "greatestSubtypeByProperty", null);
        setField(term150491, term150491.getClass(), "interfaceToImplementors", null);
        setField(term150491, term150491.getClass(), "unresolvedNamedTypes", null);
        setField(term150491, term150491.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term150491, term150491.getClass(), "lastGeneration", true);
        setField(term150491, term150491.getClass(), "templateTypes", null);
        setBooleanField(term150491, term150491.getClass(), "tolerateUndefinedValues", false);
        setField(term150491, term150491.getClass(), "resolveMode", null);
        setField(term150488, term150488.getClass(), "registry", term150491);
        term150494 = newInstance(Class.forName("com.google.javascript.jscomp.LinkedFlowScope$LinkedFlowSlot"));
        setField(term150494, term150494.getClass(), "parent", null);
        setField(term150494, term150494.getClass(), "name", null);
        setField(term150494, term150494.getClass(), "type", null);
        setBooleanField(term150494, term150494.getClass(), "inferred", false);
        ArrayList term150496 = new ArrayList();
        ((ArrayList) term150496).add("Bad type annotation. Unknown type null");
        term150495 = newInstance(Class.forName("com.google.javascript.rhino.SimpleErrorReporter"));
        setField(term150495, term150495.getClass(), "warnings", term150496);
        setField(term150495, term150495.getClass(), "errors", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.ErrorReporter");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.StaticSlot");
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = term149283;
        args[1] = term149459;
        args[2] = null;
        Object retValue = callMethod(klass, "getTypedefType", argTypes, term148841, args);
        assertTrue(recursiveEquals(term148841, term150488));
        assertTrue(recursiveEquals(term149283, term150494));
        assertTrue(recursiveEquals(term149459, term150495));
        assertTrue(recursiveEquals(retValue, null));
    }

};


