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

public class PrototypeObjectType_getCtorImplementedInterfaces_32924375778 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3205;
     Object term9780;

    public PrototypeObjectType_getCtorImplementedInterfaces_32924375778() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3218 = new HashMap();
        term3205 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term3230 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term3238 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term3205, term3205.getClass(), "className", "UKAReurpHG");
        setField(term3205, term3205.getClass(), "properties", term3218);
        setBooleanField(term3205, term3205.getClass(), "nativeType", true);
        setField(term3205, term3205.getClass(), "implicitPrototypeFallback", null);
        setField(term3230, term3230.getClass(), "call", null);
        setField(term3230, term3230.getClass(), "prototypeSlot", null);
        setField(term3230, term3230.getClass(), "kind", null);
        setField(term3230, term3230.getClass(), "typeOfThis", null);
        setField(term3230, term3230.getClass(), "source", null);
        setField(term3230, term3230.getClass(), "implementedInterfaces", null);
        setField(term3230, term3230.getClass(), "extendedInterfaces", null);
        setField(term3230, term3230.getClass(), "subTypes", null);
        setField(term3230, term3230.getClass(), "templateTypeName", null);
        setField(term3230, term3230.getClass(), "className", null);
        setField(term3230, term3230.getClass(), "properties", null);
        setBooleanField(term3230, term3230.getClass(), "nativeType", false);
        setField(term3230, term3230.getClass(), "implicitPrototypeFallback", null);
        setField(term3230, term3230.getClass(), "ownerFunction", null);
        setBooleanField(term3230, term3230.getClass(), "prettyPrint", false);
        setBooleanField(term3230, term3230.getClass(), "visited", false);
        setField(term3230, term3230.getClass(), "docInfo", null);
        setBooleanField(term3230, term3230.getClass(), "unknown", false);
        setBooleanField(term3230, term3230.getClass(), "resolved", false);
        setField(term3230, term3230.getClass(), "resolveResult", null);
        setField(term3230, term3230.getClass(), "registry", null);
        setField(term3205, term3205.getClass(), "ownerFunction", term3230);
        setBooleanField(term3205, term3205.getClass(), "prettyPrint", true);
        setBooleanField(term3205, term3205.getClass(), "visited", true);
        setField(term3238, term3238.getClass(), "info", null);
        setField(term3238, term3238.getClass(), "documentation", null);
        setField(term3238, term3238.getClass(), "associatedNode", null);
        setField(term3238, term3238.getClass(), "visibility", null);
        setIntField(term3238, term3238.getClass(), "bitset", 0);
        setField(term3238, term3238.getClass(), "type", null);
        setField(term3238, term3238.getClass(), "thisType", null);
        setBooleanField(term3238, term3238.getClass(), "includeDocumentation", false);
        setField(term3205, term3205.getClass(), "docInfo", term3238);
        setBooleanField(term3205, term3205.getClass(), "unknown", true);
        setBooleanField(term3205, term3205.getClass(), "resolved", true);
        setField(term3205, term3205.getClass(), "resolveResult", null);
        setField(term3205, term3205.getClass(), "registry", null);
        HashMap term9783 = new HashMap();
        term9780 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term9784 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term9785 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term9780, term9780.getClass(), "className", "UKAReurpHG");
        setField(term9780, term9780.getClass(), "properties", term9783);
        setBooleanField(term9780, term9780.getClass(), "nativeType", true);
        setField(term9780, term9780.getClass(), "implicitPrototypeFallback", null);
        setField(term9784, term9784.getClass(), "call", null);
        setField(term9784, term9784.getClass(), "prototypeSlot", null);
        setField(term9784, term9784.getClass(), "kind", null);
        setField(term9784, term9784.getClass(), "typeOfThis", null);
        setField(term9784, term9784.getClass(), "source", null);
        setField(term9784, term9784.getClass(), "implementedInterfaces", null);
        setField(term9784, term9784.getClass(), "extendedInterfaces", null);
        setField(term9784, term9784.getClass(), "subTypes", null);
        setField(term9784, term9784.getClass(), "templateTypeName", null);
        setField(term9784, term9784.getClass(), "className", null);
        setField(term9784, term9784.getClass(), "properties", null);
        setBooleanField(term9784, term9784.getClass(), "nativeType", false);
        setField(term9784, term9784.getClass(), "implicitPrototypeFallback", null);
        setField(term9784, term9784.getClass(), "ownerFunction", null);
        setBooleanField(term9784, term9784.getClass(), "prettyPrint", false);
        setBooleanField(term9784, term9784.getClass(), "visited", false);
        setField(term9784, term9784.getClass(), "docInfo", null);
        setBooleanField(term9784, term9784.getClass(), "unknown", false);
        setBooleanField(term9784, term9784.getClass(), "resolved", false);
        setField(term9784, term9784.getClass(), "resolveResult", null);
        setField(term9784, term9784.getClass(), "registry", null);
        setField(term9780, term9780.getClass(), "ownerFunction", term9784);
        setBooleanField(term9780, term9780.getClass(), "prettyPrint", true);
        setBooleanField(term9780, term9780.getClass(), "visited", true);
        setField(term9785, term9785.getClass(), "info", null);
        setField(term9785, term9785.getClass(), "documentation", null);
        setField(term9785, term9785.getClass(), "associatedNode", null);
        setField(term9785, term9785.getClass(), "visibility", null);
        setIntField(term9785, term9785.getClass(), "bitset", 0);
        setField(term9785, term9785.getClass(), "type", null);
        setField(term9785, term9785.getClass(), "thisType", null);
        setBooleanField(term9785, term9785.getClass(), "includeDocumentation", false);
        setField(term9780, term9780.getClass(), "docInfo", term9785);
        setBooleanField(term9780, term9780.getClass(), "unknown", true);
        setBooleanField(term9780, term9780.getClass(), "resolved", true);
        setField(term9780, term9780.getClass(), "resolveResult", null);
        setField(term9780, term9780.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getCtorImplementedInterfaces", argTypes, term3205, args);
        assertTrue(recursiveEquals(term3205, term9780));
        assertTrue(recursiveEquals(retValue, null));
    }

};


