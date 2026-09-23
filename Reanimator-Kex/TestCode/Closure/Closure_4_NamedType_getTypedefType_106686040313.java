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
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.ArrayList;

public class NamedType_getTypedefType_106686040313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term151674;
     Object term152078;
     Object term152182;
     Object term152513;
     Object term152518;
     Object term152519;

    public NamedType_getTypedefType_106686040313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        char[] term150845 = (char[]) newCharArray(128);
        HashSet term151826 = new HashSet();
        ((HashSet) term151826).add(term150845);
        term151674 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term151778 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setBooleanField(term151778, term151778.getClass(), "lastGeneration", true);
        setField(term151778, term151778.getClass(), "forwardDeclaredTypes", term151826);
        setField(term151674, term151674.getClass(), "registry", term151778);
        setField(term151674, term151674.getClass(), "reference", null);
        setField(term151674, term151674.getClass(), "sourceName", null);
        setIntField(term151674, term151674.getClass(), "lineno", 0);
        setIntField(term151674, term151674.getClass(), "charno", 0);
        term152078 = newInstance(Class.forName("com.google.javascript.rhino.SimpleErrorReporter"));
        setField(term152078, term152078.getClass(), "warnings", null);
        term152182 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        HashMap term152516 = new HashMap();
        Set<Object> term152652 =  ((Map) term152516).keySet();
        HashSet term152515 = new HashSet((Collection<? extends Object>) term152652);
        term152513 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term152514 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term152513, term152513.getClass(), "reference", null);
        setField(term152513, term152513.getClass(), "sourceName", null);
        setIntField(term152513, term152513.getClass(), "lineno", 0);
        setIntField(term152513, term152513.getClass(), "charno", 0);
        setField(term152513, term152513.getClass(), "validator", null);
        setField(term152513, term152513.getClass(), "propertyContinuations", null);
        setField(term152513, term152513.getClass(), "referencedType", null);
        setField(term152513, term152513.getClass(), "referencedObjType", null);
        setBooleanField(term152513, term152513.getClass(), "visited", false);
        setField(term152513, term152513.getClass(), "docInfo", null);
        setBooleanField(term152513, term152513.getClass(), "unknown", false);
        setBooleanField(term152513, term152513.getClass(), "resolved", true);
        setField(term152513, term152513.getClass(), "resolveResult", null);
        setField(term152513, term152513.getClass(), "templateKeys", null);
        setField(term152513, term152513.getClass(), "templatizedTypes", null);
        setBooleanField(term152513, term152513.getClass(), "inTemplatedCheckVisit", false);
        setField(term152514, term152514.getClass(), "reporter", null);
        setField(term152514, term152514.getClass(), "nativeTypes", null);
        setField(term152514, term152514.getClass(), "namesToTypes", null);
        setField(term152514, term152514.getClass(), "namespaces", null);
        setField(term152514, term152514.getClass(), "nonNullableTypeNames", null);
        setField(term152514, term152514.getClass(), "forwardDeclaredTypes", term152515);
        setField(term152514, term152514.getClass(), "typesIndexedByProperty", null);
        setField(term152514, term152514.getClass(), "eachRefTypeIndexedByProperty", null);
        setField(term152514, term152514.getClass(), "greatestSubtypeByProperty", null);
        setField(term152514, term152514.getClass(), "interfaceToImplementors", null);
        setField(term152514, term152514.getClass(), "unresolvedNamedTypes", null);
        setField(term152514, term152514.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term152514, term152514.getClass(), "lastGeneration", true);
        setField(term152514, term152514.getClass(), "templateTypes", null);
        setBooleanField(term152514, term152514.getClass(), "tolerateUndefinedValues", false);
        setField(term152514, term152514.getClass(), "resolveMode", null);
        setField(term152513, term152513.getClass(), "registry", term152514);
        term152518 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        setField(term152518, term152518.getClass(), "baseName", null);
        setField(term152518, term152518.getClass(), "parent", null);
        setField(term152518, term152518.getClass(), "props", null);
        setField(term152518, term152518.getClass(), "declaration", null);
        setField(term152518, term152518.getClass(), "refs", null);
        setField(term152518, term152518.getClass(), "type", null);
        setBooleanField(term152518, term152518.getClass(), "declaredType", false);
        setBooleanField(term152518, term152518.getClass(), "hasDeclaredTypeDescendant", false);
        setIntField(term152518, term152518.getClass(), "globalSets", 0);
        setIntField(term152518, term152518.getClass(), "localSets", 0);
        setIntField(term152518, term152518.getClass(), "aliasingGets", 0);
        setIntField(term152518, term152518.getClass(), "totalGets", 0);
        setIntField(term152518, term152518.getClass(), "callGets", 0);
        setIntField(term152518, term152518.getClass(), "deleteProps", 0);
        setBooleanField(term152518, term152518.getClass(), "inExterns", false);
        setField(term152518, term152518.getClass(), "docInfo", null);
        ArrayList term152520 = new ArrayList();
        ((ArrayList) term152520).add("Bad type annotation. Unknown type null");
        term152519 = newInstance(Class.forName("com.google.javascript.rhino.SimpleErrorReporter"));
        setField(term152519, term152519.getClass(), "warnings", term152520);
        setField(term152519, term152519.getClass(), "errors", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.ErrorReporter");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.StaticSlot");
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = term152078;
        args[1] = term152182;
        args[2] = null;
        Object retValue = callMethod(klass, "getTypedefType", argTypes, term151674, args);
        assertTrue(recursiveEquals(term151674, term152513));
        assertTrue(recursiveEquals(term152078, term152518));
        assertTrue(recursiveEquals(term152182, term152519));
        assertTrue(recursiveEquals(retValue, null));
    }

};


