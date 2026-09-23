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

public class PrototypeObjectType_hasReferenceName_74483355971 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2479;
     Object term8581;

    public PrototypeObjectType_hasReferenceName_74483355971() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2492 = new HashMap();
        term2479 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term2504 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2512 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term2479, term2479.getClass(), "className", "NzBMMhkhpT");
        setField(term2479, term2479.getClass(), "properties", term2492);
        setBooleanField(term2479, term2479.getClass(), "nativeType", false);
        setField(term2479, term2479.getClass(), "implicitPrototypeFallback", null);
        setField(term2504, term2504.getClass(), "call", null);
        setField(term2504, term2504.getClass(), "prototypeSlot", null);
        setField(term2504, term2504.getClass(), "kind", null);
        setField(term2504, term2504.getClass(), "typeOfThis", null);
        setField(term2504, term2504.getClass(), "source", null);
        setField(term2504, term2504.getClass(), "implementedInterfaces", null);
        setField(term2504, term2504.getClass(), "extendedInterfaces", null);
        setField(term2504, term2504.getClass(), "subTypes", null);
        setField(term2504, term2504.getClass(), "templateTypeName", null);
        setField(term2504, term2504.getClass(), "className", null);
        setField(term2504, term2504.getClass(), "properties", null);
        setBooleanField(term2504, term2504.getClass(), "nativeType", false);
        setField(term2504, term2504.getClass(), "implicitPrototypeFallback", null);
        setField(term2504, term2504.getClass(), "ownerFunction", null);
        setBooleanField(term2504, term2504.getClass(), "prettyPrint", false);
        setBooleanField(term2504, term2504.getClass(), "visited", false);
        setField(term2504, term2504.getClass(), "docInfo", null);
        setBooleanField(term2504, term2504.getClass(), "unknown", false);
        setBooleanField(term2504, term2504.getClass(), "resolved", false);
        setField(term2504, term2504.getClass(), "resolveResult", null);
        setField(term2504, term2504.getClass(), "registry", null);
        setField(term2479, term2479.getClass(), "ownerFunction", term2504);
        setBooleanField(term2479, term2479.getClass(), "prettyPrint", true);
        setBooleanField(term2479, term2479.getClass(), "visited", true);
        setField(term2512, term2512.getClass(), "info", null);
        setField(term2512, term2512.getClass(), "documentation", null);
        setField(term2512, term2512.getClass(), "associatedNode", null);
        setField(term2512, term2512.getClass(), "visibility", null);
        setIntField(term2512, term2512.getClass(), "bitset", 0);
        setField(term2512, term2512.getClass(), "type", null);
        setField(term2512, term2512.getClass(), "thisType", null);
        setBooleanField(term2512, term2512.getClass(), "includeDocumentation", false);
        setField(term2479, term2479.getClass(), "docInfo", term2512);
        setBooleanField(term2479, term2479.getClass(), "unknown", true);
        setBooleanField(term2479, term2479.getClass(), "resolved", false);
        setField(term2479, term2479.getClass(), "resolveResult", null);
        setField(term2479, term2479.getClass(), "registry", null);
        HashMap term8584 = new HashMap();
        term8581 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term8585 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term8586 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term8581, term8581.getClass(), "className", "NzBMMhkhpT");
        setField(term8581, term8581.getClass(), "properties", term8584);
        setBooleanField(term8581, term8581.getClass(), "nativeType", false);
        setField(term8581, term8581.getClass(), "implicitPrototypeFallback", null);
        setField(term8585, term8585.getClass(), "call", null);
        setField(term8585, term8585.getClass(), "prototypeSlot", null);
        setField(term8585, term8585.getClass(), "kind", null);
        setField(term8585, term8585.getClass(), "typeOfThis", null);
        setField(term8585, term8585.getClass(), "source", null);
        setField(term8585, term8585.getClass(), "implementedInterfaces", null);
        setField(term8585, term8585.getClass(), "extendedInterfaces", null);
        setField(term8585, term8585.getClass(), "subTypes", null);
        setField(term8585, term8585.getClass(), "templateTypeName", null);
        setField(term8585, term8585.getClass(), "className", null);
        setField(term8585, term8585.getClass(), "properties", null);
        setBooleanField(term8585, term8585.getClass(), "nativeType", false);
        setField(term8585, term8585.getClass(), "implicitPrototypeFallback", null);
        setField(term8585, term8585.getClass(), "ownerFunction", null);
        setBooleanField(term8585, term8585.getClass(), "prettyPrint", false);
        setBooleanField(term8585, term8585.getClass(), "visited", false);
        setField(term8585, term8585.getClass(), "docInfo", null);
        setBooleanField(term8585, term8585.getClass(), "unknown", false);
        setBooleanField(term8585, term8585.getClass(), "resolved", false);
        setField(term8585, term8585.getClass(), "resolveResult", null);
        setField(term8585, term8585.getClass(), "registry", null);
        setField(term8581, term8581.getClass(), "ownerFunction", term8585);
        setBooleanField(term8581, term8581.getClass(), "prettyPrint", true);
        setBooleanField(term8581, term8581.getClass(), "visited", true);
        setField(term8586, term8586.getClass(), "info", null);
        setField(term8586, term8586.getClass(), "documentation", null);
        setField(term8586, term8586.getClass(), "associatedNode", null);
        setField(term8586, term8586.getClass(), "visibility", null);
        setIntField(term8586, term8586.getClass(), "bitset", 0);
        setField(term8586, term8586.getClass(), "type", null);
        setField(term8586, term8586.getClass(), "thisType", null);
        setBooleanField(term8586, term8586.getClass(), "includeDocumentation", false);
        setField(term8581, term8581.getClass(), "docInfo", term8586);
        setBooleanField(term8581, term8581.getClass(), "unknown", true);
        setBooleanField(term8581, term8581.getClass(), "resolved", false);
        setField(term8581, term8581.getClass(), "resolveResult", null);
        setField(term8581, term8581.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hasReferenceName", argTypes, term2479, args);
        assertTrue(recursiveEquals(term2479, term8581));
        assertTrue(recursiveEquals(retValue, true));
    }

};


