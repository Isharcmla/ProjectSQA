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
import java.util.HashMap;
import java.lang.Object;

public class PrototypeObjectType_matchesObjectContext_140613508064 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2059;
     Object term7954;

    public PrototypeObjectType_matchesObjectContext_140613508064() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2072 = new HashMap();
        term2059 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term2084 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2093 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term2059, term2059.getClass(), "className", "sZdUNdggUW");
        setField(term2059, term2059.getClass(), "properties", term2072);
        setBooleanField(term2059, term2059.getClass(), "nativeType", false);
        setField(term2059, term2059.getClass(), "implicitPrototypeFallback", null);
        setField(term2084, term2084.getClass(), "call", null);
        setField(term2084, term2084.getClass(), "prototypeSlot", null);
        setField(term2084, term2084.getClass(), "kind", null);
        setField(term2084, term2084.getClass(), "typeOfThis", null);
        setField(term2084, term2084.getClass(), "source", null);
        setField(term2084, term2084.getClass(), "implementedInterfaces", null);
        setField(term2084, term2084.getClass(), "extendedInterfaces", null);
        setField(term2084, term2084.getClass(), "subTypes", null);
        setField(term2084, term2084.getClass(), "templateTypeNames", null);
        setField(term2084, term2084.getClass(), "className", null);
        setField(term2084, term2084.getClass(), "properties", null);
        setBooleanField(term2084, term2084.getClass(), "nativeType", false);
        setField(term2084, term2084.getClass(), "implicitPrototypeFallback", null);
        setField(term2084, term2084.getClass(), "ownerFunction", null);
        setBooleanField(term2084, term2084.getClass(), "prettyPrint", false);
        setBooleanField(term2084, term2084.getClass(), "visited", false);
        setField(term2084, term2084.getClass(), "docInfo", null);
        setBooleanField(term2084, term2084.getClass(), "unknown", false);
        setBooleanField(term2084, term2084.getClass(), "resolved", false);
        setField(term2084, term2084.getClass(), "resolveResult", null);
        setBooleanField(term2084, term2084.getClass(), "inTemplatedCheckVisit", false);
        setField(term2084, term2084.getClass(), "registry", null);
        setField(term2059, term2059.getClass(), "ownerFunction", term2084);
        setBooleanField(term2059, term2059.getClass(), "prettyPrint", false);
        setBooleanField(term2059, term2059.getClass(), "visited", true);
        setField(term2093, term2093.getClass(), "info", null);
        setField(term2093, term2093.getClass(), "documentation", null);
        setField(term2093, term2093.getClass(), "associatedNode", null);
        setField(term2093, term2093.getClass(), "visibility", null);
        setIntField(term2093, term2093.getClass(), "bitset", 0);
        setField(term2093, term2093.getClass(), "type", null);
        setField(term2093, term2093.getClass(), "thisType", null);
        setBooleanField(term2093, term2093.getClass(), "includeDocumentation", false);
        setField(term2059, term2059.getClass(), "docInfo", term2093);
        setBooleanField(term2059, term2059.getClass(), "unknown", true);
        setBooleanField(term2059, term2059.getClass(), "resolved", true);
        setField(term2059, term2059.getClass(), "resolveResult", null);
        setBooleanField(term2059, term2059.getClass(), "inTemplatedCheckVisit", false);
        setField(term2059, term2059.getClass(), "registry", null);
        HashMap term7957 = new HashMap();
        term7954 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term7958 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term7959 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term7954, term7954.getClass(), "className", "sZdUNdggUW");
        setField(term7954, term7954.getClass(), "properties", term7957);
        setBooleanField(term7954, term7954.getClass(), "nativeType", false);
        setField(term7954, term7954.getClass(), "implicitPrototypeFallback", null);
        setField(term7958, term7958.getClass(), "call", null);
        setField(term7958, term7958.getClass(), "prototypeSlot", null);
        setField(term7958, term7958.getClass(), "kind", null);
        setField(term7958, term7958.getClass(), "typeOfThis", null);
        setField(term7958, term7958.getClass(), "source", null);
        setField(term7958, term7958.getClass(), "implementedInterfaces", null);
        setField(term7958, term7958.getClass(), "extendedInterfaces", null);
        setField(term7958, term7958.getClass(), "subTypes", null);
        setField(term7958, term7958.getClass(), "templateTypeNames", null);
        setField(term7958, term7958.getClass(), "className", null);
        setField(term7958, term7958.getClass(), "properties", null);
        setBooleanField(term7958, term7958.getClass(), "nativeType", false);
        setField(term7958, term7958.getClass(), "implicitPrototypeFallback", null);
        setField(term7958, term7958.getClass(), "ownerFunction", null);
        setBooleanField(term7958, term7958.getClass(), "prettyPrint", false);
        setBooleanField(term7958, term7958.getClass(), "visited", false);
        setField(term7958, term7958.getClass(), "docInfo", null);
        setBooleanField(term7958, term7958.getClass(), "unknown", false);
        setBooleanField(term7958, term7958.getClass(), "resolved", false);
        setField(term7958, term7958.getClass(), "resolveResult", null);
        setBooleanField(term7958, term7958.getClass(), "inTemplatedCheckVisit", false);
        setField(term7958, term7958.getClass(), "registry", null);
        setField(term7954, term7954.getClass(), "ownerFunction", term7958);
        setBooleanField(term7954, term7954.getClass(), "prettyPrint", false);
        setBooleanField(term7954, term7954.getClass(), "visited", true);
        setField(term7959, term7959.getClass(), "info", null);
        setField(term7959, term7959.getClass(), "documentation", null);
        setField(term7959, term7959.getClass(), "associatedNode", null);
        setField(term7959, term7959.getClass(), "visibility", null);
        setIntField(term7959, term7959.getClass(), "bitset", 0);
        setField(term7959, term7959.getClass(), "type", null);
        setField(term7959, term7959.getClass(), "thisType", null);
        setBooleanField(term7959, term7959.getClass(), "includeDocumentation", false);
        setField(term7954, term7954.getClass(), "docInfo", term7959);
        setBooleanField(term7954, term7954.getClass(), "unknown", true);
        setBooleanField(term7954, term7954.getClass(), "resolved", true);
        setField(term7954, term7954.getClass(), "resolveResult", null);
        setBooleanField(term7954, term7954.getClass(), "inTemplatedCheckVisit", false);
        setField(term7954, term7954.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "matchesObjectContext", argTypes, term2059, args);
        assertTrue(recursiveEquals(term2059, term7954));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


