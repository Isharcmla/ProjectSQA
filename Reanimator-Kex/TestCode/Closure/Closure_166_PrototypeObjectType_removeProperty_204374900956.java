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

public class PrototypeObjectType_removeProperty_204374900956 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term986;
     Object term6836;

    public PrototypeObjectType_removeProperty_204374900956() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term999 = new HashMap();
        term986 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term1011 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1020 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term986, term986.getClass(), "className", "PznxWXsZME");
        setField(term986, term986.getClass(), "properties", term999);
        setBooleanField(term986, term986.getClass(), "nativeType", false);
        setField(term986, term986.getClass(), "implicitPrototypeFallback", null);
        setField(term1011, term1011.getClass(), "call", null);
        setField(term1011, term1011.getClass(), "prototypeSlot", null);
        setField(term1011, term1011.getClass(), "kind", null);
        setField(term1011, term1011.getClass(), "typeOfThis", null);
        setField(term1011, term1011.getClass(), "source", null);
        setField(term1011, term1011.getClass(), "implementedInterfaces", null);
        setField(term1011, term1011.getClass(), "extendedInterfaces", null);
        setField(term1011, term1011.getClass(), "subTypes", null);
        setField(term1011, term1011.getClass(), "templateTypeNames", null);
        setField(term1011, term1011.getClass(), "className", null);
        setField(term1011, term1011.getClass(), "properties", null);
        setBooleanField(term1011, term1011.getClass(), "nativeType", false);
        setField(term1011, term1011.getClass(), "implicitPrototypeFallback", null);
        setField(term1011, term1011.getClass(), "ownerFunction", null);
        setBooleanField(term1011, term1011.getClass(), "prettyPrint", false);
        setBooleanField(term1011, term1011.getClass(), "visited", false);
        setField(term1011, term1011.getClass(), "docInfo", null);
        setBooleanField(term1011, term1011.getClass(), "unknown", false);
        setBooleanField(term1011, term1011.getClass(), "resolved", false);
        setField(term1011, term1011.getClass(), "resolveResult", null);
        setBooleanField(term1011, term1011.getClass(), "inTemplatedCheckVisit", false);
        setField(term1011, term1011.getClass(), "registry", null);
        setField(term986, term986.getClass(), "ownerFunction", term1011);
        setBooleanField(term986, term986.getClass(), "prettyPrint", false);
        setBooleanField(term986, term986.getClass(), "visited", true);
        setField(term1020, term1020.getClass(), "info", null);
        setField(term1020, term1020.getClass(), "documentation", null);
        setField(term1020, term1020.getClass(), "associatedNode", null);
        setField(term1020, term1020.getClass(), "visibility", null);
        setIntField(term1020, term1020.getClass(), "bitset", 0);
        setField(term1020, term1020.getClass(), "type", null);
        setField(term1020, term1020.getClass(), "thisType", null);
        setBooleanField(term1020, term1020.getClass(), "includeDocumentation", false);
        setField(term986, term986.getClass(), "docInfo", term1020);
        setBooleanField(term986, term986.getClass(), "unknown", true);
        setBooleanField(term986, term986.getClass(), "resolved", true);
        setField(term986, term986.getClass(), "resolveResult", null);
        setBooleanField(term986, term986.getClass(), "inTemplatedCheckVisit", false);
        setField(term986, term986.getClass(), "registry", null);
        HashMap term6839 = new HashMap();
        term6836 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term6840 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term6841 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term6836, term6836.getClass(), "className", "PznxWXsZME");
        setField(term6836, term6836.getClass(), "properties", term6839);
        setBooleanField(term6836, term6836.getClass(), "nativeType", false);
        setField(term6836, term6836.getClass(), "implicitPrototypeFallback", null);
        setField(term6840, term6840.getClass(), "call", null);
        setField(term6840, term6840.getClass(), "prototypeSlot", null);
        setField(term6840, term6840.getClass(), "kind", null);
        setField(term6840, term6840.getClass(), "typeOfThis", null);
        setField(term6840, term6840.getClass(), "source", null);
        setField(term6840, term6840.getClass(), "implementedInterfaces", null);
        setField(term6840, term6840.getClass(), "extendedInterfaces", null);
        setField(term6840, term6840.getClass(), "subTypes", null);
        setField(term6840, term6840.getClass(), "templateTypeNames", null);
        setField(term6840, term6840.getClass(), "className", null);
        setField(term6840, term6840.getClass(), "properties", null);
        setBooleanField(term6840, term6840.getClass(), "nativeType", false);
        setField(term6840, term6840.getClass(), "implicitPrototypeFallback", null);
        setField(term6840, term6840.getClass(), "ownerFunction", null);
        setBooleanField(term6840, term6840.getClass(), "prettyPrint", false);
        setBooleanField(term6840, term6840.getClass(), "visited", false);
        setField(term6840, term6840.getClass(), "docInfo", null);
        setBooleanField(term6840, term6840.getClass(), "unknown", false);
        setBooleanField(term6840, term6840.getClass(), "resolved", false);
        setField(term6840, term6840.getClass(), "resolveResult", null);
        setBooleanField(term6840, term6840.getClass(), "inTemplatedCheckVisit", false);
        setField(term6840, term6840.getClass(), "registry", null);
        setField(term6836, term6836.getClass(), "ownerFunction", term6840);
        setBooleanField(term6836, term6836.getClass(), "prettyPrint", false);
        setBooleanField(term6836, term6836.getClass(), "visited", true);
        setField(term6841, term6841.getClass(), "info", null);
        setField(term6841, term6841.getClass(), "documentation", null);
        setField(term6841, term6841.getClass(), "associatedNode", null);
        setField(term6841, term6841.getClass(), "visibility", null);
        setIntField(term6841, term6841.getClass(), "bitset", 0);
        setField(term6841, term6841.getClass(), "type", null);
        setField(term6841, term6841.getClass(), "thisType", null);
        setBooleanField(term6841, term6841.getClass(), "includeDocumentation", false);
        setField(term6836, term6836.getClass(), "docInfo", term6841);
        setBooleanField(term6836, term6836.getClass(), "unknown", true);
        setBooleanField(term6836, term6836.getClass(), "resolved", true);
        setField(term6836, term6836.getClass(), "resolveResult", null);
        setBooleanField(term6836, term6836.getClass(), "inTemplatedCheckVisit", false);
        setField(term6836, term6836.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "yVMkkQhvmN";
        Object retValue = callMethod(klass, "removeProperty", argTypes, term986, args);
        assertTrue(recursiveEquals(term986, term6836));
        assertTrue(recursiveEquals(retValue, false));
    }

};


