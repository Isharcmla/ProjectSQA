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

public class PrototypeObjectType_getOwnPropertyNames_208787190449 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term482;
     Object term5371;
     Object term5336;

    public PrototypeObjectType_getOwnPropertyNames_208787190449() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term495 = new HashMap();
        term482 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term507 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term516 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term482, term482.getClass(), "className", "eVpkWxjuki");
        setField(term482, term482.getClass(), "properties", term495);
        setBooleanField(term482, term482.getClass(), "nativeType", false);
        setField(term482, term482.getClass(), "implicitPrototypeFallback", null);
        setField(term507, term507.getClass(), "call", null);
        setField(term507, term507.getClass(), "prototypeSlot", null);
        setField(term507, term507.getClass(), "kind", null);
        setField(term507, term507.getClass(), "typeOfThis", null);
        setField(term507, term507.getClass(), "source", null);
        setField(term507, term507.getClass(), "implementedInterfaces", null);
        setField(term507, term507.getClass(), "extendedInterfaces", null);
        setField(term507, term507.getClass(), "subTypes", null);
        setField(term507, term507.getClass(), "templateTypeNames", null);
        setField(term507, term507.getClass(), "className", null);
        setField(term507, term507.getClass(), "properties", null);
        setBooleanField(term507, term507.getClass(), "nativeType", false);
        setField(term507, term507.getClass(), "implicitPrototypeFallback", null);
        setField(term507, term507.getClass(), "ownerFunction", null);
        setBooleanField(term507, term507.getClass(), "prettyPrint", false);
        setBooleanField(term507, term507.getClass(), "visited", false);
        setField(term507, term507.getClass(), "docInfo", null);
        setBooleanField(term507, term507.getClass(), "unknown", false);
        setBooleanField(term507, term507.getClass(), "resolved", false);
        setField(term507, term507.getClass(), "resolveResult", null);
        setBooleanField(term507, term507.getClass(), "inTemplatedCheckVisit", false);
        setField(term507, term507.getClass(), "registry", null);
        setField(term482, term482.getClass(), "ownerFunction", term507);
        setBooleanField(term482, term482.getClass(), "prettyPrint", true);
        setBooleanField(term482, term482.getClass(), "visited", true);
        setField(term516, term516.getClass(), "info", null);
        setField(term516, term516.getClass(), "documentation", null);
        setField(term516, term516.getClass(), "associatedNode", null);
        setField(term516, term516.getClass(), "visibility", null);
        setIntField(term516, term516.getClass(), "bitset", 0);
        setField(term516, term516.getClass(), "type", null);
        setField(term516, term516.getClass(), "thisType", null);
        setBooleanField(term516, term516.getClass(), "includeDocumentation", false);
        setField(term482, term482.getClass(), "docInfo", term516);
        setBooleanField(term482, term482.getClass(), "unknown", true);
        setBooleanField(term482, term482.getClass(), "resolved", false);
        setField(term482, term482.getClass(), "resolveResult", null);
        setBooleanField(term482, term482.getClass(), "inTemplatedCheckVisit", false);
        setField(term482, term482.getClass(), "registry", null);
        HashMap term5374 = new HashMap();
        term5371 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term5376 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term5377 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term5371, term5371.getClass(), "className", "eVpkWxjuki");
        setField(term5371, term5371.getClass(), "properties", term5374);
        setBooleanField(term5371, term5371.getClass(), "nativeType", false);
        setField(term5371, term5371.getClass(), "implicitPrototypeFallback", null);
        setField(term5376, term5376.getClass(), "call", null);
        setField(term5376, term5376.getClass(), "prototypeSlot", null);
        setField(term5376, term5376.getClass(), "kind", null);
        setField(term5376, term5376.getClass(), "typeOfThis", null);
        setField(term5376, term5376.getClass(), "source", null);
        setField(term5376, term5376.getClass(), "implementedInterfaces", null);
        setField(term5376, term5376.getClass(), "extendedInterfaces", null);
        setField(term5376, term5376.getClass(), "subTypes", null);
        setField(term5376, term5376.getClass(), "templateTypeNames", null);
        setField(term5376, term5376.getClass(), "className", null);
        setField(term5376, term5376.getClass(), "properties", null);
        setBooleanField(term5376, term5376.getClass(), "nativeType", false);
        setField(term5376, term5376.getClass(), "implicitPrototypeFallback", null);
        setField(term5376, term5376.getClass(), "ownerFunction", null);
        setBooleanField(term5376, term5376.getClass(), "prettyPrint", false);
        setBooleanField(term5376, term5376.getClass(), "visited", false);
        setField(term5376, term5376.getClass(), "docInfo", null);
        setBooleanField(term5376, term5376.getClass(), "unknown", false);
        setBooleanField(term5376, term5376.getClass(), "resolved", false);
        setField(term5376, term5376.getClass(), "resolveResult", null);
        setBooleanField(term5376, term5376.getClass(), "inTemplatedCheckVisit", false);
        setField(term5376, term5376.getClass(), "registry", null);
        setField(term5371, term5371.getClass(), "ownerFunction", term5376);
        setBooleanField(term5371, term5371.getClass(), "prettyPrint", true);
        setBooleanField(term5371, term5371.getClass(), "visited", true);
        setField(term5377, term5377.getClass(), "info", null);
        setField(term5377, term5377.getClass(), "documentation", null);
        setField(term5377, term5377.getClass(), "associatedNode", null);
        setField(term5377, term5377.getClass(), "visibility", null);
        setIntField(term5377, term5377.getClass(), "bitset", 0);
        setField(term5377, term5377.getClass(), "type", null);
        setField(term5377, term5377.getClass(), "thisType", null);
        setBooleanField(term5377, term5377.getClass(), "includeDocumentation", false);
        setField(term5371, term5371.getClass(), "docInfo", term5377);
        setBooleanField(term5371, term5371.getClass(), "unknown", true);
        setBooleanField(term5371, term5371.getClass(), "resolved", false);
        setField(term5371, term5371.getClass(), "resolveResult", null);
        setBooleanField(term5371, term5371.getClass(), "inTemplatedCheckVisit", false);
        setField(term5371, term5371.getClass(), "registry", null);
        HashMap term5337 = new HashMap();
        term5336 = newInstance(Class.forName("java.util.HashMap$KeySet"));
        setField(term5336, term5336.getClass(), "this$0", term5337);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getOwnPropertyNames", argTypes, term482, args);
        assertTrue(recursiveEquals(term482, term5371));
        assertTrue(recursiveEquals(retValue, term5336));
    }

};


