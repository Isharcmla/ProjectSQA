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

public class PrototypeObjectType_getCtorImplementedInterfaces_32924375780 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3255;
     Object term9977;

    public PrototypeObjectType_getCtorImplementedInterfaces_32924375780() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3268 = new HashMap();
        term3255 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term3280 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term3289 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term3255, term3255.getClass(), "className", "pJbnHTYrxn");
        setField(term3255, term3255.getClass(), "properties", term3268);
        setBooleanField(term3255, term3255.getClass(), "nativeType", true);
        setField(term3255, term3255.getClass(), "implicitPrototypeFallback", null);
        setField(term3280, term3280.getClass(), "call", null);
        setField(term3280, term3280.getClass(), "prototypeSlot", null);
        setField(term3280, term3280.getClass(), "kind", null);
        setField(term3280, term3280.getClass(), "typeOfThis", null);
        setField(term3280, term3280.getClass(), "source", null);
        setField(term3280, term3280.getClass(), "implementedInterfaces", null);
        setField(term3280, term3280.getClass(), "extendedInterfaces", null);
        setField(term3280, term3280.getClass(), "subTypes", null);
        setField(term3280, term3280.getClass(), "templateTypeNames", null);
        setField(term3280, term3280.getClass(), "className", null);
        setField(term3280, term3280.getClass(), "properties", null);
        setBooleanField(term3280, term3280.getClass(), "nativeType", false);
        setField(term3280, term3280.getClass(), "implicitPrototypeFallback", null);
        setField(term3280, term3280.getClass(), "ownerFunction", null);
        setBooleanField(term3280, term3280.getClass(), "prettyPrint", false);
        setBooleanField(term3280, term3280.getClass(), "visited", false);
        setField(term3280, term3280.getClass(), "docInfo", null);
        setBooleanField(term3280, term3280.getClass(), "unknown", false);
        setBooleanField(term3280, term3280.getClass(), "resolved", false);
        setField(term3280, term3280.getClass(), "resolveResult", null);
        setBooleanField(term3280, term3280.getClass(), "inTemplatedCheckVisit", false);
        setField(term3280, term3280.getClass(), "registry", null);
        setField(term3255, term3255.getClass(), "ownerFunction", term3280);
        setBooleanField(term3255, term3255.getClass(), "prettyPrint", true);
        setBooleanField(term3255, term3255.getClass(), "visited", true);
        setField(term3289, term3289.getClass(), "info", null);
        setField(term3289, term3289.getClass(), "documentation", null);
        setField(term3289, term3289.getClass(), "associatedNode", null);
        setField(term3289, term3289.getClass(), "visibility", null);
        setIntField(term3289, term3289.getClass(), "bitset", 0);
        setField(term3289, term3289.getClass(), "type", null);
        setField(term3289, term3289.getClass(), "thisType", null);
        setBooleanField(term3289, term3289.getClass(), "includeDocumentation", false);
        setField(term3255, term3255.getClass(), "docInfo", term3289);
        setBooleanField(term3255, term3255.getClass(), "unknown", true);
        setBooleanField(term3255, term3255.getClass(), "resolved", true);
        setField(term3255, term3255.getClass(), "resolveResult", null);
        setBooleanField(term3255, term3255.getClass(), "inTemplatedCheckVisit", false);
        setField(term3255, term3255.getClass(), "registry", null);
        HashMap term9980 = new HashMap();
        term9977 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term9981 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term9982 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term9977, term9977.getClass(), "className", "pJbnHTYrxn");
        setField(term9977, term9977.getClass(), "properties", term9980);
        setBooleanField(term9977, term9977.getClass(), "nativeType", true);
        setField(term9977, term9977.getClass(), "implicitPrototypeFallback", null);
        setField(term9981, term9981.getClass(), "call", null);
        setField(term9981, term9981.getClass(), "prototypeSlot", null);
        setField(term9981, term9981.getClass(), "kind", null);
        setField(term9981, term9981.getClass(), "typeOfThis", null);
        setField(term9981, term9981.getClass(), "source", null);
        setField(term9981, term9981.getClass(), "implementedInterfaces", null);
        setField(term9981, term9981.getClass(), "extendedInterfaces", null);
        setField(term9981, term9981.getClass(), "subTypes", null);
        setField(term9981, term9981.getClass(), "templateTypeNames", null);
        setField(term9981, term9981.getClass(), "className", null);
        setField(term9981, term9981.getClass(), "properties", null);
        setBooleanField(term9981, term9981.getClass(), "nativeType", false);
        setField(term9981, term9981.getClass(), "implicitPrototypeFallback", null);
        setField(term9981, term9981.getClass(), "ownerFunction", null);
        setBooleanField(term9981, term9981.getClass(), "prettyPrint", false);
        setBooleanField(term9981, term9981.getClass(), "visited", false);
        setField(term9981, term9981.getClass(), "docInfo", null);
        setBooleanField(term9981, term9981.getClass(), "unknown", false);
        setBooleanField(term9981, term9981.getClass(), "resolved", false);
        setField(term9981, term9981.getClass(), "resolveResult", null);
        setBooleanField(term9981, term9981.getClass(), "inTemplatedCheckVisit", false);
        setField(term9981, term9981.getClass(), "registry", null);
        setField(term9977, term9977.getClass(), "ownerFunction", term9981);
        setBooleanField(term9977, term9977.getClass(), "prettyPrint", true);
        setBooleanField(term9977, term9977.getClass(), "visited", true);
        setField(term9982, term9982.getClass(), "info", null);
        setField(term9982, term9982.getClass(), "documentation", null);
        setField(term9982, term9982.getClass(), "associatedNode", null);
        setField(term9982, term9982.getClass(), "visibility", null);
        setIntField(term9982, term9982.getClass(), "bitset", 0);
        setField(term9982, term9982.getClass(), "type", null);
        setField(term9982, term9982.getClass(), "thisType", null);
        setBooleanField(term9982, term9982.getClass(), "includeDocumentation", false);
        setField(term9977, term9977.getClass(), "docInfo", term9982);
        setBooleanField(term9977, term9977.getClass(), "unknown", true);
        setBooleanField(term9977, term9977.getClass(), "resolved", true);
        setField(term9977, term9977.getClass(), "resolveResult", null);
        setBooleanField(term9977, term9977.getClass(), "inTemplatedCheckVisit", false);
        setField(term9977, term9977.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getCtorImplementedInterfaces", argTypes, term3255, args);
        assertTrue(recursiveEquals(term3255, term9977));
        assertTrue(recursiveEquals(retValue, null));
    }

};


