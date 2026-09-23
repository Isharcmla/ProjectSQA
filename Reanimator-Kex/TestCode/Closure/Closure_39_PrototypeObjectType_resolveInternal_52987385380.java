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

public class PrototypeObjectType_resolveInternal_52987385380 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3301;
     Object term9867;
     Object term9832;

    public PrototypeObjectType_resolveInternal_52987385380() {
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
        HashMap term9870 = new HashMap();
        term9867 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term9872 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term9873 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term9867, term9867.getClass(), "className", "bxrCBbrrct");
        setField(term9867, term9867.getClass(), "properties", term9870);
        setBooleanField(term9867, term9867.getClass(), "nativeType", false);
        setField(term9867, term9867.getClass(), "implicitPrototypeFallback", null);
        setField(term9872, term9872.getClass(), "call", null);
        setField(term9872, term9872.getClass(), "prototypeSlot", null);
        setField(term9872, term9872.getClass(), "kind", null);
        setField(term9872, term9872.getClass(), "typeOfThis", null);
        setField(term9872, term9872.getClass(), "source", null);
        setField(term9872, term9872.getClass(), "implementedInterfaces", null);
        setField(term9872, term9872.getClass(), "extendedInterfaces", null);
        setField(term9872, term9872.getClass(), "subTypes", null);
        setField(term9872, term9872.getClass(), "templateTypeName", null);
        setField(term9872, term9872.getClass(), "className", null);
        setField(term9872, term9872.getClass(), "properties", null);
        setBooleanField(term9872, term9872.getClass(), "nativeType", false);
        setField(term9872, term9872.getClass(), "implicitPrototypeFallback", null);
        setField(term9872, term9872.getClass(), "ownerFunction", null);
        setBooleanField(term9872, term9872.getClass(), "prettyPrint", false);
        setBooleanField(term9872, term9872.getClass(), "visited", false);
        setField(term9872, term9872.getClass(), "docInfo", null);
        setBooleanField(term9872, term9872.getClass(), "unknown", false);
        setBooleanField(term9872, term9872.getClass(), "resolved", false);
        setField(term9872, term9872.getClass(), "resolveResult", null);
        setField(term9872, term9872.getClass(), "registry", null);
        setField(term9867, term9867.getClass(), "ownerFunction", term9872);
        setBooleanField(term9867, term9867.getClass(), "prettyPrint", false);
        setBooleanField(term9867, term9867.getClass(), "visited", false);
        setField(term9873, term9873.getClass(), "info", null);
        setField(term9873, term9873.getClass(), "documentation", null);
        setField(term9873, term9873.getClass(), "associatedNode", null);
        setField(term9873, term9873.getClass(), "visibility", null);
        setIntField(term9873, term9873.getClass(), "bitset", 0);
        setField(term9873, term9873.getClass(), "type", null);
        setField(term9873, term9873.getClass(), "thisType", null);
        setBooleanField(term9873, term9873.getClass(), "includeDocumentation", false);
        setField(term9867, term9867.getClass(), "docInfo", term9873);
        setBooleanField(term9867, term9867.getClass(), "unknown", false);
        setBooleanField(term9867, term9867.getClass(), "resolved", true);
        setField(term9867, term9867.getClass(), "resolveResult", term9867);
        setField(term9867, term9867.getClass(), "registry", null);
        HashMap term9845 = new HashMap();
        term9832 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term9852 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term9860 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term9832, term9832.getClass(), "className", "bxrCBbrrct");
        setField(term9832, term9832.getClass(), "properties", term9845);
        setBooleanField(term9832, term9832.getClass(), "nativeType", false);
        setField(term9832, term9832.getClass(), "implicitPrototypeFallback", null);
        setField(term9852, term9852.getClass(), "call", null);
        setField(term9852, term9852.getClass(), "prototypeSlot", null);
        setField(term9852, term9852.getClass(), "kind", null);
        setField(term9852, term9852.getClass(), "typeOfThis", null);
        setField(term9852, term9852.getClass(), "source", null);
        setField(term9852, term9852.getClass(), "implementedInterfaces", null);
        setField(term9852, term9852.getClass(), "extendedInterfaces", null);
        setField(term9852, term9852.getClass(), "subTypes", null);
        setField(term9852, term9852.getClass(), "templateTypeName", null);
        setField(term9852, term9852.getClass(), "className", null);
        setField(term9852, term9852.getClass(), "properties", null);
        setBooleanField(term9852, term9852.getClass(), "nativeType", false);
        setField(term9852, term9852.getClass(), "implicitPrototypeFallback", null);
        setField(term9852, term9852.getClass(), "ownerFunction", null);
        setBooleanField(term9852, term9852.getClass(), "prettyPrint", false);
        setBooleanField(term9852, term9852.getClass(), "visited", false);
        setField(term9852, term9852.getClass(), "docInfo", null);
        setBooleanField(term9852, term9852.getClass(), "unknown", false);
        setBooleanField(term9852, term9852.getClass(), "resolved", false);
        setField(term9852, term9852.getClass(), "resolveResult", null);
        setField(term9852, term9852.getClass(), "registry", null);
        setField(term9832, term9832.getClass(), "ownerFunction", term9852);
        setBooleanField(term9832, term9832.getClass(), "prettyPrint", false);
        setBooleanField(term9832, term9832.getClass(), "visited", false);
        setField(term9860, term9860.getClass(), "info", null);
        setField(term9860, term9860.getClass(), "documentation", null);
        setField(term9860, term9860.getClass(), "associatedNode", null);
        setField(term9860, term9860.getClass(), "visibility", null);
        setIntField(term9860, term9860.getClass(), "bitset", 0);
        setField(term9860, term9860.getClass(), "type", null);
        setField(term9860, term9860.getClass(), "thisType", null);
        setBooleanField(term9860, term9860.getClass(), "includeDocumentation", false);
        setField(term9832, term9832.getClass(), "docInfo", term9860);
        setBooleanField(term9832, term9832.getClass(), "unknown", false);
        setBooleanField(term9832, term9832.getClass(), "resolved", true);
        setField(term9832, term9832.getClass(), "resolveResult", term9832);
        setField(term9832, term9832.getClass(), "registry", null);
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
        assertTrue(recursiveEquals(term3301, term9867));
        assertTrue(recursiveEquals(retValue, term9832));
    }

};


