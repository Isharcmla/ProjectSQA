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

public class NamedType_getTypedefType_106686040304 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term102417;
     Object term102859;
     Object term102963;
     Object term146286;
     Object term146292;
     Object term146293;

    public NamedType_getTypedefType_106686040304() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashSet term102569 = new HashSet();
        term102417 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term102521 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setBooleanField(term102521, term102521.getClass(), "lastGeneration", true);
        setField(term102521, term102521.getClass(), "forwardDeclaredTypes", term102569);
        setField(term102417, term102417.getClass(), "registry", term102521);
        setField(term102417, term102417.getClass(), "reference", null);
        setField(term102417, term102417.getClass(), "sourceName", "");
        setIntField(term102417, term102417.getClass(), "lineno", 0);
        setIntField(term102417, term102417.getClass(), "charno", 0);
        term102859 = newInstance(Class.forName("com.google.javascript.rhino.SimpleErrorReporter"));
        term102963 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        HashMap term146291 = new HashMap();
        Set<Object> term146298 =  ((Map) term146291).keySet();
        HashSet term146290 = new HashSet((Collection<? extends Object>) term146298);
        term146286 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term146289 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term146286, term146286.getClass(), "reference", null);
        setField(term146286, term146286.getClass(), "sourceName", "");
        setIntField(term146286, term146286.getClass(), "lineno", 0);
        setIntField(term146286, term146286.getClass(), "charno", 0);
        setField(term146286, term146286.getClass(), "validator", null);
        setField(term146286, term146286.getClass(), "propertyContinuations", null);
        setField(term146286, term146286.getClass(), "referencedType", null);
        setField(term146286, term146286.getClass(), "referencedObjType", null);
        setBooleanField(term146286, term146286.getClass(), "visited", false);
        setField(term146286, term146286.getClass(), "docInfo", null);
        setBooleanField(term146286, term146286.getClass(), "unknown", false);
        setBooleanField(term146286, term146286.getClass(), "resolved", true);
        setField(term146286, term146286.getClass(), "resolveResult", null);
        setField(term146286, term146286.getClass(), "templateKeys", null);
        setField(term146286, term146286.getClass(), "templatizedTypes", null);
        setBooleanField(term146286, term146286.getClass(), "inTemplatedCheckVisit", false);
        setField(term146289, term146289.getClass(), "reporter", null);
        setField(term146289, term146289.getClass(), "nativeTypes", null);
        setField(term146289, term146289.getClass(), "namesToTypes", null);
        setField(term146289, term146289.getClass(), "namespaces", null);
        setField(term146289, term146289.getClass(), "nonNullableTypeNames", null);
        setField(term146289, term146289.getClass(), "forwardDeclaredTypes", term146290);
        setField(term146289, term146289.getClass(), "typesIndexedByProperty", null);
        setField(term146289, term146289.getClass(), "eachRefTypeIndexedByProperty", null);
        setField(term146289, term146289.getClass(), "greatestSubtypeByProperty", null);
        setField(term146289, term146289.getClass(), "interfaceToImplementors", null);
        setField(term146289, term146289.getClass(), "unresolvedNamedTypes", null);
        setField(term146289, term146289.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term146289, term146289.getClass(), "lastGeneration", true);
        setField(term146289, term146289.getClass(), "templateTypes", null);
        setBooleanField(term146289, term146289.getClass(), "tolerateUndefinedValues", false);
        setField(term146289, term146289.getClass(), "resolveMode", null);
        setField(term146286, term146286.getClass(), "registry", term146289);
        term146292 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        setField(term146292, term146292.getClass(), "baseName", null);
        setField(term146292, term146292.getClass(), "parent", null);
        setField(term146292, term146292.getClass(), "props", null);
        setField(term146292, term146292.getClass(), "declaration", null);
        setField(term146292, term146292.getClass(), "refs", null);
        setField(term146292, term146292.getClass(), "type", null);
        setBooleanField(term146292, term146292.getClass(), "declaredType", false);
        setBooleanField(term146292, term146292.getClass(), "hasDeclaredTypeDescendant", false);
        setIntField(term146292, term146292.getClass(), "globalSets", 0);
        setIntField(term146292, term146292.getClass(), "localSets", 0);
        setIntField(term146292, term146292.getClass(), "aliasingGets", 0);
        setIntField(term146292, term146292.getClass(), "totalGets", 0);
        setIntField(term146292, term146292.getClass(), "callGets", 0);
        setIntField(term146292, term146292.getClass(), "deleteProps", 0);
        setBooleanField(term146292, term146292.getClass(), "inExterns", false);
        setField(term146292, term146292.getClass(), "docInfo", null);
        ArrayList term146294 = new ArrayList();
        ((ArrayList) term146294).add("Bad type annotation. Unknown type null");
        term146293 = newInstance(Class.forName("com.google.javascript.rhino.SimpleErrorReporter"));
        setField(term146293, term146293.getClass(), "warnings", term146294);
        setField(term146293, term146293.getClass(), "errors", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.ErrorReporter");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.StaticSlot");
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = term102859;
        args[1] = term102963;
        args[2] = null;
        Object retValue = callMethod(klass, "getTypedefType", argTypes, term102417, args);
        assertTrue(recursiveEquals(term102417, term146286));
        assertTrue(recursiveEquals(term102859, term146292));
        assertTrue(recursiveEquals(term102963, term146293));
        assertTrue(recursiveEquals(retValue, null));
    }

};


