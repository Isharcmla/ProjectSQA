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

public class PrototypeObjectType_getPropertyNode_82444409257 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1058;
     Object term6933;

    public PrototypeObjectType_getPropertyNode_82444409257() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1071 = new HashMap();
        term1058 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term1083 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1092 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term1058, term1058.getClass(), "className", "mvrkADEgpp");
        setField(term1058, term1058.getClass(), "properties", term1071);
        setBooleanField(term1058, term1058.getClass(), "nativeType", true);
        setField(term1058, term1058.getClass(), "implicitPrototypeFallback", null);
        setField(term1083, term1083.getClass(), "call", null);
        setField(term1083, term1083.getClass(), "prototypeSlot", null);
        setField(term1083, term1083.getClass(), "kind", null);
        setField(term1083, term1083.getClass(), "typeOfThis", null);
        setField(term1083, term1083.getClass(), "source", null);
        setField(term1083, term1083.getClass(), "implementedInterfaces", null);
        setField(term1083, term1083.getClass(), "extendedInterfaces", null);
        setField(term1083, term1083.getClass(), "subTypes", null);
        setField(term1083, term1083.getClass(), "templateTypeNames", null);
        setField(term1083, term1083.getClass(), "className", null);
        setField(term1083, term1083.getClass(), "properties", null);
        setBooleanField(term1083, term1083.getClass(), "nativeType", false);
        setField(term1083, term1083.getClass(), "implicitPrototypeFallback", null);
        setField(term1083, term1083.getClass(), "ownerFunction", null);
        setBooleanField(term1083, term1083.getClass(), "prettyPrint", false);
        setBooleanField(term1083, term1083.getClass(), "visited", false);
        setField(term1083, term1083.getClass(), "docInfo", null);
        setBooleanField(term1083, term1083.getClass(), "unknown", false);
        setBooleanField(term1083, term1083.getClass(), "resolved", false);
        setField(term1083, term1083.getClass(), "resolveResult", null);
        setBooleanField(term1083, term1083.getClass(), "inTemplatedCheckVisit", false);
        setField(term1083, term1083.getClass(), "registry", null);
        setField(term1058, term1058.getClass(), "ownerFunction", term1083);
        setBooleanField(term1058, term1058.getClass(), "prettyPrint", false);
        setBooleanField(term1058, term1058.getClass(), "visited", false);
        setField(term1092, term1092.getClass(), "info", null);
        setField(term1092, term1092.getClass(), "documentation", null);
        setField(term1092, term1092.getClass(), "associatedNode", null);
        setField(term1092, term1092.getClass(), "visibility", null);
        setIntField(term1092, term1092.getClass(), "bitset", 0);
        setField(term1092, term1092.getClass(), "type", null);
        setField(term1092, term1092.getClass(), "thisType", null);
        setBooleanField(term1092, term1092.getClass(), "includeDocumentation", false);
        setField(term1058, term1058.getClass(), "docInfo", term1092);
        setBooleanField(term1058, term1058.getClass(), "unknown", true);
        setBooleanField(term1058, term1058.getClass(), "resolved", true);
        setField(term1058, term1058.getClass(), "resolveResult", null);
        setBooleanField(term1058, term1058.getClass(), "inTemplatedCheckVisit", false);
        setField(term1058, term1058.getClass(), "registry", null);
        HashMap term6936 = new HashMap();
        term6933 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term6937 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term6938 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term6933, term6933.getClass(), "className", "mvrkADEgpp");
        setField(term6933, term6933.getClass(), "properties", term6936);
        setBooleanField(term6933, term6933.getClass(), "nativeType", true);
        setField(term6933, term6933.getClass(), "implicitPrototypeFallback", null);
        setField(term6937, term6937.getClass(), "call", null);
        setField(term6937, term6937.getClass(), "prototypeSlot", null);
        setField(term6937, term6937.getClass(), "kind", null);
        setField(term6937, term6937.getClass(), "typeOfThis", null);
        setField(term6937, term6937.getClass(), "source", null);
        setField(term6937, term6937.getClass(), "implementedInterfaces", null);
        setField(term6937, term6937.getClass(), "extendedInterfaces", null);
        setField(term6937, term6937.getClass(), "subTypes", null);
        setField(term6937, term6937.getClass(), "templateTypeNames", null);
        setField(term6937, term6937.getClass(), "className", null);
        setField(term6937, term6937.getClass(), "properties", null);
        setBooleanField(term6937, term6937.getClass(), "nativeType", false);
        setField(term6937, term6937.getClass(), "implicitPrototypeFallback", null);
        setField(term6937, term6937.getClass(), "ownerFunction", null);
        setBooleanField(term6937, term6937.getClass(), "prettyPrint", false);
        setBooleanField(term6937, term6937.getClass(), "visited", false);
        setField(term6937, term6937.getClass(), "docInfo", null);
        setBooleanField(term6937, term6937.getClass(), "unknown", false);
        setBooleanField(term6937, term6937.getClass(), "resolved", false);
        setField(term6937, term6937.getClass(), "resolveResult", null);
        setBooleanField(term6937, term6937.getClass(), "inTemplatedCheckVisit", false);
        setField(term6937, term6937.getClass(), "registry", null);
        setField(term6933, term6933.getClass(), "ownerFunction", term6937);
        setBooleanField(term6933, term6933.getClass(), "prettyPrint", false);
        setBooleanField(term6933, term6933.getClass(), "visited", false);
        setField(term6938, term6938.getClass(), "info", null);
        setField(term6938, term6938.getClass(), "documentation", null);
        setField(term6938, term6938.getClass(), "associatedNode", null);
        setField(term6938, term6938.getClass(), "visibility", null);
        setIntField(term6938, term6938.getClass(), "bitset", 0);
        setField(term6938, term6938.getClass(), "type", null);
        setField(term6938, term6938.getClass(), "thisType", null);
        setBooleanField(term6938, term6938.getClass(), "includeDocumentation", false);
        setField(term6933, term6933.getClass(), "docInfo", term6938);
        setBooleanField(term6933, term6933.getClass(), "unknown", true);
        setBooleanField(term6933, term6933.getClass(), "resolved", true);
        setField(term6933, term6933.getClass(), "resolveResult", null);
        setBooleanField(term6933, term6933.getClass(), "inTemplatedCheckVisit", false);
        setField(term6933, term6933.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "EeBVbzjcCI";
        Object retValue = callMethod(klass, "getPropertyNode", argTypes, term1058, args);
        assertTrue(recursiveEquals(term1058, term6933));
        assertTrue(recursiveEquals(retValue, null));
    }

};


