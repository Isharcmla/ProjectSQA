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

public class NamedType_getTypedefType_106686040290 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90382;
     Object term90862;
     Object term90954;
     Object term143034;
     Object term143042;
     Object term143043;

    public NamedType_getTypedefType_106686040290() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashSet term90534 = new HashSet();
        term90382 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term90486 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setBooleanField(term90486, term90486.getClass(), "lastGeneration", true);
        setField(term90486, term90486.getClass(), "forwardDeclaredTypes", term90534);
        setField(term90382, term90382.getClass(), "registry", term90486);
        setField(term90382, term90382.getClass(), "reference", "");
        setField(term90382, term90382.getClass(), "sourceName", "");
        setIntField(term90382, term90382.getClass(), "lineno", 0);
        setIntField(term90382, term90382.getClass(), "charno", 0);
        term90862 = newInstance(Class.forName("com.google.javascript.rhino.SimpleErrorReporter"));
        setField(term90862, term90862.getClass(), "warnings", null);
        term90954 = newInstance(Class.forName("com.google.javascript.rhino.jstype.Property"));
        setField(term90954, term90954.getClass(), "type", null);
        HashMap term143041 = new HashMap();
        Set<Object> term143048 =  ((Map) term143041).keySet();
        HashSet term143040 = new HashSet((Collection<? extends Object>) term143048);
        term143034 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term143039 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term143034, term143034.getClass(), "reference", "");
        setField(term143034, term143034.getClass(), "sourceName", "");
        setIntField(term143034, term143034.getClass(), "lineno", 0);
        setIntField(term143034, term143034.getClass(), "charno", 0);
        setField(term143034, term143034.getClass(), "validator", null);
        setField(term143034, term143034.getClass(), "propertyContinuations", null);
        setField(term143034, term143034.getClass(), "referencedType", null);
        setField(term143034, term143034.getClass(), "referencedObjType", null);
        setBooleanField(term143034, term143034.getClass(), "visited", false);
        setField(term143034, term143034.getClass(), "docInfo", null);
        setBooleanField(term143034, term143034.getClass(), "unknown", false);
        setBooleanField(term143034, term143034.getClass(), "resolved", true);
        setField(term143034, term143034.getClass(), "resolveResult", null);
        setField(term143034, term143034.getClass(), "templateKeys", null);
        setField(term143034, term143034.getClass(), "templatizedTypes", null);
        setBooleanField(term143034, term143034.getClass(), "inTemplatedCheckVisit", false);
        setField(term143039, term143039.getClass(), "reporter", null);
        setField(term143039, term143039.getClass(), "nativeTypes", null);
        setField(term143039, term143039.getClass(), "namesToTypes", null);
        setField(term143039, term143039.getClass(), "namespaces", null);
        setField(term143039, term143039.getClass(), "nonNullableTypeNames", null);
        setField(term143039, term143039.getClass(), "forwardDeclaredTypes", term143040);
        setField(term143039, term143039.getClass(), "typesIndexedByProperty", null);
        setField(term143039, term143039.getClass(), "eachRefTypeIndexedByProperty", null);
        setField(term143039, term143039.getClass(), "greatestSubtypeByProperty", null);
        setField(term143039, term143039.getClass(), "interfaceToImplementors", null);
        setField(term143039, term143039.getClass(), "unresolvedNamedTypes", null);
        setField(term143039, term143039.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term143039, term143039.getClass(), "lastGeneration", true);
        setField(term143039, term143039.getClass(), "templateTypes", null);
        setBooleanField(term143039, term143039.getClass(), "tolerateUndefinedValues", false);
        setField(term143039, term143039.getClass(), "resolveMode", null);
        setField(term143034, term143034.getClass(), "registry", term143039);
        term143042 = newInstance(Class.forName("com.google.javascript.rhino.jstype.Property"));
        setField(term143042, term143042.getClass(), "name", null);
        setField(term143042, term143042.getClass(), "type", null);
        setBooleanField(term143042, term143042.getClass(), "inferred", false);
        setField(term143042, term143042.getClass(), "propertyNode", null);
        setField(term143042, term143042.getClass(), "docInfo", null);
        ArrayList term143044 = new ArrayList();
        ((ArrayList) term143044).add("Bad type annotation. Unknown type ");
        term143043 = newInstance(Class.forName("com.google.javascript.rhino.SimpleErrorReporter"));
        setField(term143043, term143043.getClass(), "warnings", term143044);
        setField(term143043, term143043.getClass(), "errors", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.ErrorReporter");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.StaticSlot");
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = term90862;
        args[1] = term90954;
        args[2] = null;
        Object retValue = callMethod(klass, "getTypedefType", argTypes, term90382, args);
        assertTrue(recursiveEquals(term90382, term143034));
        assertTrue(recursiveEquals(term90862, term143042));
        assertTrue(recursiveEquals(term90954, term143043));
        assertTrue(recursiveEquals(retValue, null));
    }

};


