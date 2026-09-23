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

public class NamedType_getTypedefType_106686040311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term149764;
     Object term150206;
     Object term150298;
     Object term150740;
     Object term150746;
     Object term150747;

    public NamedType_getTypedefType_106686040311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashSet term149916 = new HashSet();
        term149764 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term149868 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setBooleanField(term149868, term149868.getClass(), "lastGeneration", true);
        setField(term149868, term149868.getClass(), "forwardDeclaredTypes", term149916);
        setField(term149764, term149764.getClass(), "registry", term149868);
        setField(term149764, term149764.getClass(), "reference", null);
        setField(term149764, term149764.getClass(), "sourceName", "");
        setIntField(term149764, term149764.getClass(), "lineno", 1);
        setIntField(term149764, term149764.getClass(), "charno", 0);
        term150206 = newInstance(Class.forName("com.google.javascript.rhino.SimpleErrorReporter"));
        setField(term150206, term150206.getClass(), "warnings", null);
        term150298 = newInstance(Class.forName("com.google.javascript.rhino.jstype.Property"));
        setField(term150298, term150298.getClass(), "type", null);
        HashMap term150745 = new HashMap();
        Set<Object> term150752 =  ((Map) term150745).keySet();
        HashSet term150744 = new HashSet((Collection<? extends Object>) term150752);
        term150740 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term150743 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term150740, term150740.getClass(), "reference", null);
        setField(term150740, term150740.getClass(), "sourceName", "");
        setIntField(term150740, term150740.getClass(), "lineno", 1);
        setIntField(term150740, term150740.getClass(), "charno", 0);
        setField(term150740, term150740.getClass(), "validator", null);
        setField(term150740, term150740.getClass(), "propertyContinuations", null);
        setField(term150740, term150740.getClass(), "referencedType", null);
        setField(term150740, term150740.getClass(), "referencedObjType", null);
        setBooleanField(term150740, term150740.getClass(), "visited", false);
        setField(term150740, term150740.getClass(), "docInfo", null);
        setBooleanField(term150740, term150740.getClass(), "unknown", false);
        setBooleanField(term150740, term150740.getClass(), "resolved", true);
        setField(term150740, term150740.getClass(), "resolveResult", null);
        setField(term150740, term150740.getClass(), "templateKeys", null);
        setField(term150740, term150740.getClass(), "templatizedTypes", null);
        setBooleanField(term150740, term150740.getClass(), "inTemplatedCheckVisit", false);
        setField(term150743, term150743.getClass(), "reporter", null);
        setField(term150743, term150743.getClass(), "nativeTypes", null);
        setField(term150743, term150743.getClass(), "namesToTypes", null);
        setField(term150743, term150743.getClass(), "namespaces", null);
        setField(term150743, term150743.getClass(), "nonNullableTypeNames", null);
        setField(term150743, term150743.getClass(), "forwardDeclaredTypes", term150744);
        setField(term150743, term150743.getClass(), "typesIndexedByProperty", null);
        setField(term150743, term150743.getClass(), "eachRefTypeIndexedByProperty", null);
        setField(term150743, term150743.getClass(), "greatestSubtypeByProperty", null);
        setField(term150743, term150743.getClass(), "interfaceToImplementors", null);
        setField(term150743, term150743.getClass(), "unresolvedNamedTypes", null);
        setField(term150743, term150743.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term150743, term150743.getClass(), "lastGeneration", true);
        setField(term150743, term150743.getClass(), "templateTypes", null);
        setBooleanField(term150743, term150743.getClass(), "tolerateUndefinedValues", false);
        setField(term150743, term150743.getClass(), "resolveMode", null);
        setField(term150740, term150740.getClass(), "registry", term150743);
        term150746 = newInstance(Class.forName("com.google.javascript.rhino.jstype.Property"));
        setField(term150746, term150746.getClass(), "name", null);
        setField(term150746, term150746.getClass(), "type", null);
        setBooleanField(term150746, term150746.getClass(), "inferred", false);
        setField(term150746, term150746.getClass(), "propertyNode", null);
        setField(term150746, term150746.getClass(), "docInfo", null);
        ArrayList term150748 = new ArrayList();
        ((ArrayList) term150748).add("Bad type annotation. Unknown type null (#1)");
        term150747 = newInstance(Class.forName("com.google.javascript.rhino.SimpleErrorReporter"));
        setField(term150747, term150747.getClass(), "warnings", term150748);
        setField(term150747, term150747.getClass(), "errors", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.ErrorReporter");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.StaticSlot");
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = term150206;
        args[1] = term150298;
        args[2] = null;
        Object retValue = callMethod(klass, "getTypedefType", argTypes, term149764, args);
        assertTrue(recursiveEquals(term149764, term150740));
        assertTrue(recursiveEquals(term150206, term150746));
        assertTrue(recursiveEquals(term150298, term150747));
        assertTrue(recursiveEquals(retValue, null));
    }

};


