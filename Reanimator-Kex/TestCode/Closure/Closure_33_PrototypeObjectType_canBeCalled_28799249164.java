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

public class PrototypeObjectType_canBeCalled_28799249164 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2091;
     Object term7845;

    public PrototypeObjectType_canBeCalled_28799249164() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2104 = new HashMap();
        term2091 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term2116 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2124 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term2091, term2091.getClass(), "className", "iikZEapDlu");
        setField(term2091, term2091.getClass(), "properties", term2104);
        setBooleanField(term2091, term2091.getClass(), "nativeType", true);
        setField(term2091, term2091.getClass(), "implicitPrototypeFallback", null);
        setField(term2116, term2116.getClass(), "call", null);
        setField(term2116, term2116.getClass(), "prototypeSlot", null);
        setField(term2116, term2116.getClass(), "kind", null);
        setField(term2116, term2116.getClass(), "typeOfThis", null);
        setField(term2116, term2116.getClass(), "source", null);
        setField(term2116, term2116.getClass(), "implementedInterfaces", null);
        setField(term2116, term2116.getClass(), "extendedInterfaces", null);
        setField(term2116, term2116.getClass(), "subTypes", null);
        setField(term2116, term2116.getClass(), "templateTypeName", null);
        setField(term2116, term2116.getClass(), "className", null);
        setField(term2116, term2116.getClass(), "properties", null);
        setBooleanField(term2116, term2116.getClass(), "nativeType", false);
        setField(term2116, term2116.getClass(), "implicitPrototypeFallback", null);
        setField(term2116, term2116.getClass(), "ownerFunction", null);
        setBooleanField(term2116, term2116.getClass(), "prettyPrint", false);
        setBooleanField(term2116, term2116.getClass(), "visited", false);
        setField(term2116, term2116.getClass(), "docInfo", null);
        setBooleanField(term2116, term2116.getClass(), "unknown", false);
        setBooleanField(term2116, term2116.getClass(), "resolved", false);
        setField(term2116, term2116.getClass(), "resolveResult", null);
        setField(term2116, term2116.getClass(), "registry", null);
        setField(term2091, term2091.getClass(), "ownerFunction", term2116);
        setBooleanField(term2091, term2091.getClass(), "prettyPrint", false);
        setBooleanField(term2091, term2091.getClass(), "visited", false);
        setField(term2124, term2124.getClass(), "info", null);
        setField(term2124, term2124.getClass(), "documentation", null);
        setField(term2124, term2124.getClass(), "associatedNode", null);
        setField(term2124, term2124.getClass(), "visibility", null);
        setIntField(term2124, term2124.getClass(), "bitset", 0);
        setField(term2124, term2124.getClass(), "type", null);
        setField(term2124, term2124.getClass(), "thisType", null);
        setBooleanField(term2124, term2124.getClass(), "includeDocumentation", false);
        setField(term2091, term2091.getClass(), "docInfo", term2124);
        setBooleanField(term2091, term2091.getClass(), "unknown", true);
        setBooleanField(term2091, term2091.getClass(), "resolved", false);
        setField(term2091, term2091.getClass(), "resolveResult", null);
        setField(term2091, term2091.getClass(), "registry", null);
        HashMap term7848 = new HashMap();
        term7845 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term7849 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term7850 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term7845, term7845.getClass(), "className", "iikZEapDlu");
        setField(term7845, term7845.getClass(), "properties", term7848);
        setBooleanField(term7845, term7845.getClass(), "nativeType", true);
        setField(term7845, term7845.getClass(), "implicitPrototypeFallback", null);
        setField(term7849, term7849.getClass(), "call", null);
        setField(term7849, term7849.getClass(), "prototypeSlot", null);
        setField(term7849, term7849.getClass(), "kind", null);
        setField(term7849, term7849.getClass(), "typeOfThis", null);
        setField(term7849, term7849.getClass(), "source", null);
        setField(term7849, term7849.getClass(), "implementedInterfaces", null);
        setField(term7849, term7849.getClass(), "extendedInterfaces", null);
        setField(term7849, term7849.getClass(), "subTypes", null);
        setField(term7849, term7849.getClass(), "templateTypeName", null);
        setField(term7849, term7849.getClass(), "className", null);
        setField(term7849, term7849.getClass(), "properties", null);
        setBooleanField(term7849, term7849.getClass(), "nativeType", false);
        setField(term7849, term7849.getClass(), "implicitPrototypeFallback", null);
        setField(term7849, term7849.getClass(), "ownerFunction", null);
        setBooleanField(term7849, term7849.getClass(), "prettyPrint", false);
        setBooleanField(term7849, term7849.getClass(), "visited", false);
        setField(term7849, term7849.getClass(), "docInfo", null);
        setBooleanField(term7849, term7849.getClass(), "unknown", false);
        setBooleanField(term7849, term7849.getClass(), "resolved", false);
        setField(term7849, term7849.getClass(), "resolveResult", null);
        setField(term7849, term7849.getClass(), "registry", null);
        setField(term7845, term7845.getClass(), "ownerFunction", term7849);
        setBooleanField(term7845, term7845.getClass(), "prettyPrint", false);
        setBooleanField(term7845, term7845.getClass(), "visited", false);
        setField(term7850, term7850.getClass(), "info", null);
        setField(term7850, term7850.getClass(), "documentation", null);
        setField(term7850, term7850.getClass(), "associatedNode", null);
        setField(term7850, term7850.getClass(), "visibility", null);
        setIntField(term7850, term7850.getClass(), "bitset", 0);
        setField(term7850, term7850.getClass(), "type", null);
        setField(term7850, term7850.getClass(), "thisType", null);
        setBooleanField(term7850, term7850.getClass(), "includeDocumentation", false);
        setField(term7845, term7845.getClass(), "docInfo", term7850);
        setBooleanField(term7845, term7845.getClass(), "unknown", true);
        setBooleanField(term7845, term7845.getClass(), "resolved", false);
        setField(term7845, term7845.getClass(), "resolveResult", null);
        setField(term7845, term7845.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "canBeCalled", argTypes, term2091, args);
        assertTrue(recursiveEquals(term2091, term7845));
    }

};


