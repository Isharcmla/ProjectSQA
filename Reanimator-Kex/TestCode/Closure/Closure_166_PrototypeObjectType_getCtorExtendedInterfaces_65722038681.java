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

public class PrototypeObjectType_getCtorExtendedInterfaces_65722038681 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3305;
     Object term10061;

    public PrototypeObjectType_getCtorExtendedInterfaces_65722038681() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3318 = new HashMap();
        term3305 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term3330 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term3339 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term3305, term3305.getClass(), "className", "WBAOTqErtm");
        setField(term3305, term3305.getClass(), "properties", term3318);
        setBooleanField(term3305, term3305.getClass(), "nativeType", false);
        setField(term3305, term3305.getClass(), "implicitPrototypeFallback", null);
        setField(term3330, term3330.getClass(), "call", null);
        setField(term3330, term3330.getClass(), "prototypeSlot", null);
        setField(term3330, term3330.getClass(), "kind", null);
        setField(term3330, term3330.getClass(), "typeOfThis", null);
        setField(term3330, term3330.getClass(), "source", null);
        setField(term3330, term3330.getClass(), "implementedInterfaces", null);
        setField(term3330, term3330.getClass(), "extendedInterfaces", null);
        setField(term3330, term3330.getClass(), "subTypes", null);
        setField(term3330, term3330.getClass(), "templateTypeNames", null);
        setField(term3330, term3330.getClass(), "className", null);
        setField(term3330, term3330.getClass(), "properties", null);
        setBooleanField(term3330, term3330.getClass(), "nativeType", false);
        setField(term3330, term3330.getClass(), "implicitPrototypeFallback", null);
        setField(term3330, term3330.getClass(), "ownerFunction", null);
        setBooleanField(term3330, term3330.getClass(), "prettyPrint", false);
        setBooleanField(term3330, term3330.getClass(), "visited", false);
        setField(term3330, term3330.getClass(), "docInfo", null);
        setBooleanField(term3330, term3330.getClass(), "unknown", false);
        setBooleanField(term3330, term3330.getClass(), "resolved", false);
        setField(term3330, term3330.getClass(), "resolveResult", null);
        setBooleanField(term3330, term3330.getClass(), "inTemplatedCheckVisit", false);
        setField(term3330, term3330.getClass(), "registry", null);
        setField(term3305, term3305.getClass(), "ownerFunction", term3330);
        setBooleanField(term3305, term3305.getClass(), "prettyPrint", true);
        setBooleanField(term3305, term3305.getClass(), "visited", false);
        setField(term3339, term3339.getClass(), "info", null);
        setField(term3339, term3339.getClass(), "documentation", null);
        setField(term3339, term3339.getClass(), "associatedNode", null);
        setField(term3339, term3339.getClass(), "visibility", null);
        setIntField(term3339, term3339.getClass(), "bitset", 0);
        setField(term3339, term3339.getClass(), "type", null);
        setField(term3339, term3339.getClass(), "thisType", null);
        setBooleanField(term3339, term3339.getClass(), "includeDocumentation", false);
        setField(term3305, term3305.getClass(), "docInfo", term3339);
        setBooleanField(term3305, term3305.getClass(), "unknown", false);
        setBooleanField(term3305, term3305.getClass(), "resolved", true);
        setField(term3305, term3305.getClass(), "resolveResult", null);
        setBooleanField(term3305, term3305.getClass(), "inTemplatedCheckVisit", false);
        setField(term3305, term3305.getClass(), "registry", null);
        HashMap term10064 = new HashMap();
        term10061 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term10065 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term10066 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term10061, term10061.getClass(), "className", "WBAOTqErtm");
        setField(term10061, term10061.getClass(), "properties", term10064);
        setBooleanField(term10061, term10061.getClass(), "nativeType", false);
        setField(term10061, term10061.getClass(), "implicitPrototypeFallback", null);
        setField(term10065, term10065.getClass(), "call", null);
        setField(term10065, term10065.getClass(), "prototypeSlot", null);
        setField(term10065, term10065.getClass(), "kind", null);
        setField(term10065, term10065.getClass(), "typeOfThis", null);
        setField(term10065, term10065.getClass(), "source", null);
        setField(term10065, term10065.getClass(), "implementedInterfaces", null);
        setField(term10065, term10065.getClass(), "extendedInterfaces", null);
        setField(term10065, term10065.getClass(), "subTypes", null);
        setField(term10065, term10065.getClass(), "templateTypeNames", null);
        setField(term10065, term10065.getClass(), "className", null);
        setField(term10065, term10065.getClass(), "properties", null);
        setBooleanField(term10065, term10065.getClass(), "nativeType", false);
        setField(term10065, term10065.getClass(), "implicitPrototypeFallback", null);
        setField(term10065, term10065.getClass(), "ownerFunction", null);
        setBooleanField(term10065, term10065.getClass(), "prettyPrint", false);
        setBooleanField(term10065, term10065.getClass(), "visited", false);
        setField(term10065, term10065.getClass(), "docInfo", null);
        setBooleanField(term10065, term10065.getClass(), "unknown", false);
        setBooleanField(term10065, term10065.getClass(), "resolved", false);
        setField(term10065, term10065.getClass(), "resolveResult", null);
        setBooleanField(term10065, term10065.getClass(), "inTemplatedCheckVisit", false);
        setField(term10065, term10065.getClass(), "registry", null);
        setField(term10061, term10061.getClass(), "ownerFunction", term10065);
        setBooleanField(term10061, term10061.getClass(), "prettyPrint", true);
        setBooleanField(term10061, term10061.getClass(), "visited", false);
        setField(term10066, term10066.getClass(), "info", null);
        setField(term10066, term10066.getClass(), "documentation", null);
        setField(term10066, term10066.getClass(), "associatedNode", null);
        setField(term10066, term10066.getClass(), "visibility", null);
        setIntField(term10066, term10066.getClass(), "bitset", 0);
        setField(term10066, term10066.getClass(), "type", null);
        setField(term10066, term10066.getClass(), "thisType", null);
        setBooleanField(term10066, term10066.getClass(), "includeDocumentation", false);
        setField(term10061, term10061.getClass(), "docInfo", term10066);
        setBooleanField(term10061, term10061.getClass(), "unknown", false);
        setBooleanField(term10061, term10061.getClass(), "resolved", true);
        setField(term10061, term10061.getClass(), "resolveResult", null);
        setBooleanField(term10061, term10061.getClass(), "inTemplatedCheckVisit", false);
        setField(term10061, term10061.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getCtorExtendedInterfaces", argTypes, term3305, args);
        assertTrue(recursiveEquals(term3305, term10061));
        assertTrue(recursiveEquals(retValue, null));
    }

};


