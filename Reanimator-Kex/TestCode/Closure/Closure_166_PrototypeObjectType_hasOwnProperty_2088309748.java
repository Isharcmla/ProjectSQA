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

public class PrototypeObjectType_hasOwnProperty_2088309748 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term410;
     Object term5287;

    public PrototypeObjectType_hasOwnProperty_2088309748() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term423 = new HashMap();
        term410 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term435 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term444 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term410, term410.getClass(), "className", "xBsXSDjXYK");
        setField(term410, term410.getClass(), "properties", term423);
        setBooleanField(term410, term410.getClass(), "nativeType", true);
        setField(term410, term410.getClass(), "implicitPrototypeFallback", null);
        setField(term435, term435.getClass(), "call", null);
        setField(term435, term435.getClass(), "prototypeSlot", null);
        setField(term435, term435.getClass(), "kind", null);
        setField(term435, term435.getClass(), "typeOfThis", null);
        setField(term435, term435.getClass(), "source", null);
        setField(term435, term435.getClass(), "implementedInterfaces", null);
        setField(term435, term435.getClass(), "extendedInterfaces", null);
        setField(term435, term435.getClass(), "subTypes", null);
        setField(term435, term435.getClass(), "templateTypeNames", null);
        setField(term435, term435.getClass(), "className", null);
        setField(term435, term435.getClass(), "properties", null);
        setBooleanField(term435, term435.getClass(), "nativeType", false);
        setField(term435, term435.getClass(), "implicitPrototypeFallback", null);
        setField(term435, term435.getClass(), "ownerFunction", null);
        setBooleanField(term435, term435.getClass(), "prettyPrint", false);
        setBooleanField(term435, term435.getClass(), "visited", false);
        setField(term435, term435.getClass(), "docInfo", null);
        setBooleanField(term435, term435.getClass(), "unknown", false);
        setBooleanField(term435, term435.getClass(), "resolved", false);
        setField(term435, term435.getClass(), "resolveResult", null);
        setBooleanField(term435, term435.getClass(), "inTemplatedCheckVisit", false);
        setField(term435, term435.getClass(), "registry", null);
        setField(term410, term410.getClass(), "ownerFunction", term435);
        setBooleanField(term410, term410.getClass(), "prettyPrint", false);
        setBooleanField(term410, term410.getClass(), "visited", false);
        setField(term444, term444.getClass(), "info", null);
        setField(term444, term444.getClass(), "documentation", null);
        setField(term444, term444.getClass(), "associatedNode", null);
        setField(term444, term444.getClass(), "visibility", null);
        setIntField(term444, term444.getClass(), "bitset", 0);
        setField(term444, term444.getClass(), "type", null);
        setField(term444, term444.getClass(), "thisType", null);
        setBooleanField(term444, term444.getClass(), "includeDocumentation", false);
        setField(term410, term410.getClass(), "docInfo", term444);
        setBooleanField(term410, term410.getClass(), "unknown", false);
        setBooleanField(term410, term410.getClass(), "resolved", true);
        setField(term410, term410.getClass(), "resolveResult", null);
        setBooleanField(term410, term410.getClass(), "inTemplatedCheckVisit", false);
        setField(term410, term410.getClass(), "registry", null);
        HashMap term5290 = new HashMap();
        term5287 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term5291 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term5292 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term5287, term5287.getClass(), "className", "xBsXSDjXYK");
        setField(term5287, term5287.getClass(), "properties", term5290);
        setBooleanField(term5287, term5287.getClass(), "nativeType", true);
        setField(term5287, term5287.getClass(), "implicitPrototypeFallback", null);
        setField(term5291, term5291.getClass(), "call", null);
        setField(term5291, term5291.getClass(), "prototypeSlot", null);
        setField(term5291, term5291.getClass(), "kind", null);
        setField(term5291, term5291.getClass(), "typeOfThis", null);
        setField(term5291, term5291.getClass(), "source", null);
        setField(term5291, term5291.getClass(), "implementedInterfaces", null);
        setField(term5291, term5291.getClass(), "extendedInterfaces", null);
        setField(term5291, term5291.getClass(), "subTypes", null);
        setField(term5291, term5291.getClass(), "templateTypeNames", null);
        setField(term5291, term5291.getClass(), "className", null);
        setField(term5291, term5291.getClass(), "properties", null);
        setBooleanField(term5291, term5291.getClass(), "nativeType", false);
        setField(term5291, term5291.getClass(), "implicitPrototypeFallback", null);
        setField(term5291, term5291.getClass(), "ownerFunction", null);
        setBooleanField(term5291, term5291.getClass(), "prettyPrint", false);
        setBooleanField(term5291, term5291.getClass(), "visited", false);
        setField(term5291, term5291.getClass(), "docInfo", null);
        setBooleanField(term5291, term5291.getClass(), "unknown", false);
        setBooleanField(term5291, term5291.getClass(), "resolved", false);
        setField(term5291, term5291.getClass(), "resolveResult", null);
        setBooleanField(term5291, term5291.getClass(), "inTemplatedCheckVisit", false);
        setField(term5291, term5291.getClass(), "registry", null);
        setField(term5287, term5287.getClass(), "ownerFunction", term5291);
        setBooleanField(term5287, term5287.getClass(), "prettyPrint", false);
        setBooleanField(term5287, term5287.getClass(), "visited", false);
        setField(term5292, term5292.getClass(), "info", null);
        setField(term5292, term5292.getClass(), "documentation", null);
        setField(term5292, term5292.getClass(), "associatedNode", null);
        setField(term5292, term5292.getClass(), "visibility", null);
        setIntField(term5292, term5292.getClass(), "bitset", 0);
        setField(term5292, term5292.getClass(), "type", null);
        setField(term5292, term5292.getClass(), "thisType", null);
        setBooleanField(term5292, term5292.getClass(), "includeDocumentation", false);
        setField(term5287, term5287.getClass(), "docInfo", term5292);
        setBooleanField(term5287, term5287.getClass(), "unknown", false);
        setBooleanField(term5287, term5287.getClass(), "resolved", true);
        setField(term5287, term5287.getClass(), "resolveResult", null);
        setBooleanField(term5287, term5287.getClass(), "inTemplatedCheckVisit", false);
        setField(term5287, term5287.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "fztQhjqwdP";
        Object retValue = callMethod(klass, "hasOwnProperty", argTypes, term410, args);
        assertTrue(recursiveEquals(term410, term5287));
        assertTrue(recursiveEquals(retValue, false));
    }

};


