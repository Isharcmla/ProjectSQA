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

public class PrototypeObjectType_resolveInternal_52987385381 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3301;
     Object term9915;
     Object term9880;

    public PrototypeObjectType_resolveInternal_52987385381() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3314 = new HashMap();
        term3301 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term3326 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term3334 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term3301, term3301.getClass(), "className", "bxrCBbrrct");
        setField(term3301, term3301.getClass(), "properties", term3314);
        setBooleanField(term3301, term3301.getClass(), "nativeType", false);
        setField(term3301, term3301.getClass(), "implicitPrototypeFallback", null);
        setField(term3326, term3326.getClass(), "call", null);
        setField(term3326, term3326.getClass(), "prototypeSlot", null);
        setField(term3326, term3326.getClass(), "kind", null);
        setField(term3326, term3326.getClass(), "typeOfThis", null);
        setField(term3326, term3326.getClass(), "source", null);
        setField(term3326, term3326.getClass(), "implementedInterfaces", null);
        setField(term3326, term3326.getClass(), "extendedInterfaces", null);
        setField(term3326, term3326.getClass(), "subTypes", null);
        setField(term3326, term3326.getClass(), "templateTypeName", null);
        setField(term3326, term3326.getClass(), "className", null);
        setField(term3326, term3326.getClass(), "properties", null);
        setBooleanField(term3326, term3326.getClass(), "nativeType", false);
        setField(term3326, term3326.getClass(), "implicitPrototypeFallback", null);
        setField(term3326, term3326.getClass(), "ownerFunction", null);
        setBooleanField(term3326, term3326.getClass(), "prettyPrint", false);
        setBooleanField(term3326, term3326.getClass(), "visited", false);
        setField(term3326, term3326.getClass(), "docInfo", null);
        setBooleanField(term3326, term3326.getClass(), "unknown", false);
        setBooleanField(term3326, term3326.getClass(), "resolved", false);
        setField(term3326, term3326.getClass(), "resolveResult", null);
        setField(term3326, term3326.getClass(), "registry", null);
        setField(term3301, term3301.getClass(), "ownerFunction", term3326);
        setBooleanField(term3301, term3301.getClass(), "prettyPrint", false);
        setBooleanField(term3301, term3301.getClass(), "visited", false);
        setField(term3334, term3334.getClass(), "info", null);
        setField(term3334, term3334.getClass(), "documentation", null);
        setField(term3334, term3334.getClass(), "associatedNode", null);
        setField(term3334, term3334.getClass(), "visibility", null);
        setIntField(term3334, term3334.getClass(), "bitset", 0);
        setField(term3334, term3334.getClass(), "type", null);
        setField(term3334, term3334.getClass(), "thisType", null);
        setBooleanField(term3334, term3334.getClass(), "includeDocumentation", false);
        setField(term3301, term3301.getClass(), "docInfo", term3334);
        setBooleanField(term3301, term3301.getClass(), "unknown", false);
        setBooleanField(term3301, term3301.getClass(), "resolved", false);
        setField(term3301, term3301.getClass(), "resolveResult", null);
        setField(term3301, term3301.getClass(), "registry", null);
        HashMap term9918 = new HashMap();
        term9915 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term9920 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term9921 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term9915, term9915.getClass(), "className", "bxrCBbrrct");
        setField(term9915, term9915.getClass(), "properties", term9918);
        setBooleanField(term9915, term9915.getClass(), "nativeType", false);
        setField(term9915, term9915.getClass(), "implicitPrototypeFallback", null);
        setField(term9920, term9920.getClass(), "call", null);
        setField(term9920, term9920.getClass(), "prototypeSlot", null);
        setField(term9920, term9920.getClass(), "kind", null);
        setField(term9920, term9920.getClass(), "typeOfThis", null);
        setField(term9920, term9920.getClass(), "source", null);
        setField(term9920, term9920.getClass(), "implementedInterfaces", null);
        setField(term9920, term9920.getClass(), "extendedInterfaces", null);
        setField(term9920, term9920.getClass(), "subTypes", null);
        setField(term9920, term9920.getClass(), "templateTypeName", null);
        setField(term9920, term9920.getClass(), "className", null);
        setField(term9920, term9920.getClass(), "properties", null);
        setBooleanField(term9920, term9920.getClass(), "nativeType", false);
        setField(term9920, term9920.getClass(), "implicitPrototypeFallback", null);
        setField(term9920, term9920.getClass(), "ownerFunction", null);
        setBooleanField(term9920, term9920.getClass(), "prettyPrint", false);
        setBooleanField(term9920, term9920.getClass(), "visited", false);
        setField(term9920, term9920.getClass(), "docInfo", null);
        setBooleanField(term9920, term9920.getClass(), "unknown", false);
        setBooleanField(term9920, term9920.getClass(), "resolved", false);
        setField(term9920, term9920.getClass(), "resolveResult", null);
        setField(term9920, term9920.getClass(), "registry", null);
        setField(term9915, term9915.getClass(), "ownerFunction", term9920);
        setBooleanField(term9915, term9915.getClass(), "prettyPrint", false);
        setBooleanField(term9915, term9915.getClass(), "visited", false);
        setField(term9921, term9921.getClass(), "info", null);
        setField(term9921, term9921.getClass(), "documentation", null);
        setField(term9921, term9921.getClass(), "associatedNode", null);
        setField(term9921, term9921.getClass(), "visibility", null);
        setIntField(term9921, term9921.getClass(), "bitset", 0);
        setField(term9921, term9921.getClass(), "type", null);
        setField(term9921, term9921.getClass(), "thisType", null);
        setBooleanField(term9921, term9921.getClass(), "includeDocumentation", false);
        setField(term9915, term9915.getClass(), "docInfo", term9921);
        setBooleanField(term9915, term9915.getClass(), "unknown", false);
        setBooleanField(term9915, term9915.getClass(), "resolved", true);
        setField(term9915, term9915.getClass(), "resolveResult", term9915);
        setField(term9915, term9915.getClass(), "registry", null);
        HashMap term9893 = new HashMap();
        term9880 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term9900 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term9908 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term9880, term9880.getClass(), "className", "bxrCBbrrct");
        setField(term9880, term9880.getClass(), "properties", term9893);
        setBooleanField(term9880, term9880.getClass(), "nativeType", false);
        setField(term9880, term9880.getClass(), "implicitPrototypeFallback", null);
        setField(term9900, term9900.getClass(), "call", null);
        setField(term9900, term9900.getClass(), "prototypeSlot", null);
        setField(term9900, term9900.getClass(), "kind", null);
        setField(term9900, term9900.getClass(), "typeOfThis", null);
        setField(term9900, term9900.getClass(), "source", null);
        setField(term9900, term9900.getClass(), "implementedInterfaces", null);
        setField(term9900, term9900.getClass(), "extendedInterfaces", null);
        setField(term9900, term9900.getClass(), "subTypes", null);
        setField(term9900, term9900.getClass(), "templateTypeName", null);
        setField(term9900, term9900.getClass(), "className", null);
        setField(term9900, term9900.getClass(), "properties", null);
        setBooleanField(term9900, term9900.getClass(), "nativeType", false);
        setField(term9900, term9900.getClass(), "implicitPrototypeFallback", null);
        setField(term9900, term9900.getClass(), "ownerFunction", null);
        setBooleanField(term9900, term9900.getClass(), "prettyPrint", false);
        setBooleanField(term9900, term9900.getClass(), "visited", false);
        setField(term9900, term9900.getClass(), "docInfo", null);
        setBooleanField(term9900, term9900.getClass(), "unknown", false);
        setBooleanField(term9900, term9900.getClass(), "resolved", false);
        setField(term9900, term9900.getClass(), "resolveResult", null);
        setField(term9900, term9900.getClass(), "registry", null);
        setField(term9880, term9880.getClass(), "ownerFunction", term9900);
        setBooleanField(term9880, term9880.getClass(), "prettyPrint", false);
        setBooleanField(term9880, term9880.getClass(), "visited", false);
        setField(term9908, term9908.getClass(), "info", null);
        setField(term9908, term9908.getClass(), "documentation", null);
        setField(term9908, term9908.getClass(), "associatedNode", null);
        setField(term9908, term9908.getClass(), "visibility", null);
        setIntField(term9908, term9908.getClass(), "bitset", 0);
        setField(term9908, term9908.getClass(), "type", null);
        setField(term9908, term9908.getClass(), "thisType", null);
        setBooleanField(term9908, term9908.getClass(), "includeDocumentation", false);
        setField(term9880, term9880.getClass(), "docInfo", term9908);
        setBooleanField(term9880, term9880.getClass(), "unknown", false);
        setBooleanField(term9880, term9880.getClass(), "resolved", true);
        setField(term9880, term9880.getClass(), "resolveResult", term9880);
        setField(term9880, term9880.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.ErrorReporter");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.StaticScope");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        Object retValue = callMethod(klass, "resolveInternal", argTypes, term3301, args);
        assertTrue(recursiveEquals(term3301, term9915));
        assertTrue(recursiveEquals(retValue, term9880));
    }

};


