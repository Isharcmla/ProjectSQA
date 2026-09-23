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

public class PrototypeObjectType_matchConstraint_76173999383 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3405;
     Object term10198;

    public PrototypeObjectType_matchConstraint_76173999383() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3418 = new HashMap();
        term3405 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term3430 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term3439 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term3405, term3405.getClass(), "className", "vOuMEpOQAg");
        setField(term3405, term3405.getClass(), "properties", term3418);
        setBooleanField(term3405, term3405.getClass(), "nativeType", false);
        setField(term3405, term3405.getClass(), "implicitPrototypeFallback", null);
        setField(term3430, term3430.getClass(), "call", null);
        setField(term3430, term3430.getClass(), "prototypeSlot", null);
        setField(term3430, term3430.getClass(), "kind", null);
        setField(term3430, term3430.getClass(), "typeOfThis", null);
        setField(term3430, term3430.getClass(), "source", null);
        setField(term3430, term3430.getClass(), "implementedInterfaces", null);
        setField(term3430, term3430.getClass(), "extendedInterfaces", null);
        setField(term3430, term3430.getClass(), "subTypes", null);
        setField(term3430, term3430.getClass(), "templateTypeNames", null);
        setField(term3430, term3430.getClass(), "className", null);
        setField(term3430, term3430.getClass(), "properties", null);
        setBooleanField(term3430, term3430.getClass(), "nativeType", false);
        setField(term3430, term3430.getClass(), "implicitPrototypeFallback", null);
        setField(term3430, term3430.getClass(), "ownerFunction", null);
        setBooleanField(term3430, term3430.getClass(), "prettyPrint", false);
        setBooleanField(term3430, term3430.getClass(), "visited", false);
        setField(term3430, term3430.getClass(), "docInfo", null);
        setBooleanField(term3430, term3430.getClass(), "unknown", false);
        setBooleanField(term3430, term3430.getClass(), "resolved", false);
        setField(term3430, term3430.getClass(), "resolveResult", null);
        setBooleanField(term3430, term3430.getClass(), "inTemplatedCheckVisit", false);
        setField(term3430, term3430.getClass(), "registry", null);
        setField(term3405, term3405.getClass(), "ownerFunction", term3430);
        setBooleanField(term3405, term3405.getClass(), "prettyPrint", false);
        setBooleanField(term3405, term3405.getClass(), "visited", true);
        setField(term3439, term3439.getClass(), "info", null);
        setField(term3439, term3439.getClass(), "documentation", null);
        setField(term3439, term3439.getClass(), "associatedNode", null);
        setField(term3439, term3439.getClass(), "visibility", null);
        setIntField(term3439, term3439.getClass(), "bitset", 0);
        setField(term3439, term3439.getClass(), "type", null);
        setField(term3439, term3439.getClass(), "thisType", null);
        setBooleanField(term3439, term3439.getClass(), "includeDocumentation", false);
        setField(term3405, term3405.getClass(), "docInfo", term3439);
        setBooleanField(term3405, term3405.getClass(), "unknown", true);
        setBooleanField(term3405, term3405.getClass(), "resolved", true);
        setField(term3405, term3405.getClass(), "resolveResult", null);
        setBooleanField(term3405, term3405.getClass(), "inTemplatedCheckVisit", false);
        setField(term3405, term3405.getClass(), "registry", null);
        HashMap term10201 = new HashMap();
        term10198 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term10202 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term10203 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term10198, term10198.getClass(), "className", "vOuMEpOQAg");
        setField(term10198, term10198.getClass(), "properties", term10201);
        setBooleanField(term10198, term10198.getClass(), "nativeType", false);
        setField(term10198, term10198.getClass(), "implicitPrototypeFallback", null);
        setField(term10202, term10202.getClass(), "call", null);
        setField(term10202, term10202.getClass(), "prototypeSlot", null);
        setField(term10202, term10202.getClass(), "kind", null);
        setField(term10202, term10202.getClass(), "typeOfThis", null);
        setField(term10202, term10202.getClass(), "source", null);
        setField(term10202, term10202.getClass(), "implementedInterfaces", null);
        setField(term10202, term10202.getClass(), "extendedInterfaces", null);
        setField(term10202, term10202.getClass(), "subTypes", null);
        setField(term10202, term10202.getClass(), "templateTypeNames", null);
        setField(term10202, term10202.getClass(), "className", null);
        setField(term10202, term10202.getClass(), "properties", null);
        setBooleanField(term10202, term10202.getClass(), "nativeType", false);
        setField(term10202, term10202.getClass(), "implicitPrototypeFallback", null);
        setField(term10202, term10202.getClass(), "ownerFunction", null);
        setBooleanField(term10202, term10202.getClass(), "prettyPrint", false);
        setBooleanField(term10202, term10202.getClass(), "visited", false);
        setField(term10202, term10202.getClass(), "docInfo", null);
        setBooleanField(term10202, term10202.getClass(), "unknown", false);
        setBooleanField(term10202, term10202.getClass(), "resolved", false);
        setField(term10202, term10202.getClass(), "resolveResult", null);
        setBooleanField(term10202, term10202.getClass(), "inTemplatedCheckVisit", false);
        setField(term10202, term10202.getClass(), "registry", null);
        setField(term10198, term10198.getClass(), "ownerFunction", term10202);
        setBooleanField(term10198, term10198.getClass(), "prettyPrint", false);
        setBooleanField(term10198, term10198.getClass(), "visited", true);
        setField(term10203, term10203.getClass(), "info", null);
        setField(term10203, term10203.getClass(), "documentation", null);
        setField(term10203, term10203.getClass(), "associatedNode", null);
        setField(term10203, term10203.getClass(), "visibility", null);
        setIntField(term10203, term10203.getClass(), "bitset", 0);
        setField(term10203, term10203.getClass(), "type", null);
        setField(term10203, term10203.getClass(), "thisType", null);
        setBooleanField(term10203, term10203.getClass(), "includeDocumentation", false);
        setField(term10198, term10198.getClass(), "docInfo", term10203);
        setBooleanField(term10198, term10198.getClass(), "unknown", true);
        setBooleanField(term10198, term10198.getClass(), "resolved", true);
        setField(term10198, term10198.getClass(), "resolveResult", null);
        setBooleanField(term10198, term10198.getClass(), "inTemplatedCheckVisit", false);
        setField(term10198, term10198.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "matchConstraint", argTypes, term3405, args);
        assertTrue(recursiveEquals(term3405, term10198));
    }

};


