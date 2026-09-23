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

public class PrototypeObjectType_canBeCalled_28799249165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2109;
     Object term7996;

    public PrototypeObjectType_canBeCalled_28799249165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2122 = new HashMap();
        term2109 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term2134 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2143 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term2109, term2109.getClass(), "className", "DhjNLmRMCu");
        setField(term2109, term2109.getClass(), "properties", term2122);
        setBooleanField(term2109, term2109.getClass(), "nativeType", true);
        setField(term2109, term2109.getClass(), "implicitPrototypeFallback", null);
        setField(term2134, term2134.getClass(), "call", null);
        setField(term2134, term2134.getClass(), "prototypeSlot", null);
        setField(term2134, term2134.getClass(), "kind", null);
        setField(term2134, term2134.getClass(), "typeOfThis", null);
        setField(term2134, term2134.getClass(), "source", null);
        setField(term2134, term2134.getClass(), "implementedInterfaces", null);
        setField(term2134, term2134.getClass(), "extendedInterfaces", null);
        setField(term2134, term2134.getClass(), "subTypes", null);
        setField(term2134, term2134.getClass(), "templateTypeNames", null);
        setField(term2134, term2134.getClass(), "className", null);
        setField(term2134, term2134.getClass(), "properties", null);
        setBooleanField(term2134, term2134.getClass(), "nativeType", false);
        setField(term2134, term2134.getClass(), "implicitPrototypeFallback", null);
        setField(term2134, term2134.getClass(), "ownerFunction", null);
        setBooleanField(term2134, term2134.getClass(), "prettyPrint", false);
        setBooleanField(term2134, term2134.getClass(), "visited", false);
        setField(term2134, term2134.getClass(), "docInfo", null);
        setBooleanField(term2134, term2134.getClass(), "unknown", false);
        setBooleanField(term2134, term2134.getClass(), "resolved", false);
        setField(term2134, term2134.getClass(), "resolveResult", null);
        setBooleanField(term2134, term2134.getClass(), "inTemplatedCheckVisit", false);
        setField(term2134, term2134.getClass(), "registry", null);
        setField(term2109, term2109.getClass(), "ownerFunction", term2134);
        setBooleanField(term2109, term2109.getClass(), "prettyPrint", false);
        setBooleanField(term2109, term2109.getClass(), "visited", false);
        setField(term2143, term2143.getClass(), "info", null);
        setField(term2143, term2143.getClass(), "documentation", null);
        setField(term2143, term2143.getClass(), "associatedNode", null);
        setField(term2143, term2143.getClass(), "visibility", null);
        setIntField(term2143, term2143.getClass(), "bitset", 0);
        setField(term2143, term2143.getClass(), "type", null);
        setField(term2143, term2143.getClass(), "thisType", null);
        setBooleanField(term2143, term2143.getClass(), "includeDocumentation", false);
        setField(term2109, term2109.getClass(), "docInfo", term2143);
        setBooleanField(term2109, term2109.getClass(), "unknown", true);
        setBooleanField(term2109, term2109.getClass(), "resolved", false);
        setField(term2109, term2109.getClass(), "resolveResult", null);
        setBooleanField(term2109, term2109.getClass(), "inTemplatedCheckVisit", false);
        setField(term2109, term2109.getClass(), "registry", null);
        HashMap term7999 = new HashMap();
        term7996 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term8000 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term8001 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term7996, term7996.getClass(), "className", "DhjNLmRMCu");
        setField(term7996, term7996.getClass(), "properties", term7999);
        setBooleanField(term7996, term7996.getClass(), "nativeType", true);
        setField(term7996, term7996.getClass(), "implicitPrototypeFallback", null);
        setField(term8000, term8000.getClass(), "call", null);
        setField(term8000, term8000.getClass(), "prototypeSlot", null);
        setField(term8000, term8000.getClass(), "kind", null);
        setField(term8000, term8000.getClass(), "typeOfThis", null);
        setField(term8000, term8000.getClass(), "source", null);
        setField(term8000, term8000.getClass(), "implementedInterfaces", null);
        setField(term8000, term8000.getClass(), "extendedInterfaces", null);
        setField(term8000, term8000.getClass(), "subTypes", null);
        setField(term8000, term8000.getClass(), "templateTypeNames", null);
        setField(term8000, term8000.getClass(), "className", null);
        setField(term8000, term8000.getClass(), "properties", null);
        setBooleanField(term8000, term8000.getClass(), "nativeType", false);
        setField(term8000, term8000.getClass(), "implicitPrototypeFallback", null);
        setField(term8000, term8000.getClass(), "ownerFunction", null);
        setBooleanField(term8000, term8000.getClass(), "prettyPrint", false);
        setBooleanField(term8000, term8000.getClass(), "visited", false);
        setField(term8000, term8000.getClass(), "docInfo", null);
        setBooleanField(term8000, term8000.getClass(), "unknown", false);
        setBooleanField(term8000, term8000.getClass(), "resolved", false);
        setField(term8000, term8000.getClass(), "resolveResult", null);
        setBooleanField(term8000, term8000.getClass(), "inTemplatedCheckVisit", false);
        setField(term8000, term8000.getClass(), "registry", null);
        setField(term7996, term7996.getClass(), "ownerFunction", term8000);
        setBooleanField(term7996, term7996.getClass(), "prettyPrint", false);
        setBooleanField(term7996, term7996.getClass(), "visited", false);
        setField(term8001, term8001.getClass(), "info", null);
        setField(term8001, term8001.getClass(), "documentation", null);
        setField(term8001, term8001.getClass(), "associatedNode", null);
        setField(term8001, term8001.getClass(), "visibility", null);
        setIntField(term8001, term8001.getClass(), "bitset", 0);
        setField(term8001, term8001.getClass(), "type", null);
        setField(term8001, term8001.getClass(), "thisType", null);
        setBooleanField(term8001, term8001.getClass(), "includeDocumentation", false);
        setField(term7996, term7996.getClass(), "docInfo", term8001);
        setBooleanField(term7996, term7996.getClass(), "unknown", true);
        setBooleanField(term7996, term7996.getClass(), "resolved", false);
        setField(term7996, term7996.getClass(), "resolveResult", null);
        setBooleanField(term7996, term7996.getClass(), "inTemplatedCheckVisit", false);
        setField(term7996, term7996.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "canBeCalled", argTypes, term2109, args);
        assertTrue(recursiveEquals(term2109, term7996));
    }

};


