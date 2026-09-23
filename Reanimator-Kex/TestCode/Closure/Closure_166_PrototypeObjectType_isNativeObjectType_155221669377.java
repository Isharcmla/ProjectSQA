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

public class PrototypeObjectType_isNativeObjectType_155221669377 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2713;
     Object term9266;

    public PrototypeObjectType_isNativeObjectType_155221669377() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2726 = new HashMap();
        term2713 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term2738 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2747 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term2713, term2713.getClass(), "className", "aSkmSwTnEw");
        setField(term2713, term2713.getClass(), "properties", term2726);
        setBooleanField(term2713, term2713.getClass(), "nativeType", true);
        setField(term2713, term2713.getClass(), "implicitPrototypeFallback", null);
        setField(term2738, term2738.getClass(), "call", null);
        setField(term2738, term2738.getClass(), "prototypeSlot", null);
        setField(term2738, term2738.getClass(), "kind", null);
        setField(term2738, term2738.getClass(), "typeOfThis", null);
        setField(term2738, term2738.getClass(), "source", null);
        setField(term2738, term2738.getClass(), "implementedInterfaces", null);
        setField(term2738, term2738.getClass(), "extendedInterfaces", null);
        setField(term2738, term2738.getClass(), "subTypes", null);
        setField(term2738, term2738.getClass(), "templateTypeNames", null);
        setField(term2738, term2738.getClass(), "className", null);
        setField(term2738, term2738.getClass(), "properties", null);
        setBooleanField(term2738, term2738.getClass(), "nativeType", false);
        setField(term2738, term2738.getClass(), "implicitPrototypeFallback", null);
        setField(term2738, term2738.getClass(), "ownerFunction", null);
        setBooleanField(term2738, term2738.getClass(), "prettyPrint", false);
        setBooleanField(term2738, term2738.getClass(), "visited", false);
        setField(term2738, term2738.getClass(), "docInfo", null);
        setBooleanField(term2738, term2738.getClass(), "unknown", false);
        setBooleanField(term2738, term2738.getClass(), "resolved", false);
        setField(term2738, term2738.getClass(), "resolveResult", null);
        setBooleanField(term2738, term2738.getClass(), "inTemplatedCheckVisit", false);
        setField(term2738, term2738.getClass(), "registry", null);
        setField(term2713, term2713.getClass(), "ownerFunction", term2738);
        setBooleanField(term2713, term2713.getClass(), "prettyPrint", true);
        setBooleanField(term2713, term2713.getClass(), "visited", false);
        setField(term2747, term2747.getClass(), "info", null);
        setField(term2747, term2747.getClass(), "documentation", null);
        setField(term2747, term2747.getClass(), "associatedNode", null);
        setField(term2747, term2747.getClass(), "visibility", null);
        setIntField(term2747, term2747.getClass(), "bitset", 0);
        setField(term2747, term2747.getClass(), "type", null);
        setField(term2747, term2747.getClass(), "thisType", null);
        setBooleanField(term2747, term2747.getClass(), "includeDocumentation", false);
        setField(term2713, term2713.getClass(), "docInfo", term2747);
        setBooleanField(term2713, term2713.getClass(), "unknown", false);
        setBooleanField(term2713, term2713.getClass(), "resolved", false);
        setField(term2713, term2713.getClass(), "resolveResult", null);
        setBooleanField(term2713, term2713.getClass(), "inTemplatedCheckVisit", false);
        setField(term2713, term2713.getClass(), "registry", null);
        HashMap term9269 = new HashMap();
        term9266 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term9270 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term9271 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term9266, term9266.getClass(), "className", "aSkmSwTnEw");
        setField(term9266, term9266.getClass(), "properties", term9269);
        setBooleanField(term9266, term9266.getClass(), "nativeType", true);
        setField(term9266, term9266.getClass(), "implicitPrototypeFallback", null);
        setField(term9270, term9270.getClass(), "call", null);
        setField(term9270, term9270.getClass(), "prototypeSlot", null);
        setField(term9270, term9270.getClass(), "kind", null);
        setField(term9270, term9270.getClass(), "typeOfThis", null);
        setField(term9270, term9270.getClass(), "source", null);
        setField(term9270, term9270.getClass(), "implementedInterfaces", null);
        setField(term9270, term9270.getClass(), "extendedInterfaces", null);
        setField(term9270, term9270.getClass(), "subTypes", null);
        setField(term9270, term9270.getClass(), "templateTypeNames", null);
        setField(term9270, term9270.getClass(), "className", null);
        setField(term9270, term9270.getClass(), "properties", null);
        setBooleanField(term9270, term9270.getClass(), "nativeType", false);
        setField(term9270, term9270.getClass(), "implicitPrototypeFallback", null);
        setField(term9270, term9270.getClass(), "ownerFunction", null);
        setBooleanField(term9270, term9270.getClass(), "prettyPrint", false);
        setBooleanField(term9270, term9270.getClass(), "visited", false);
        setField(term9270, term9270.getClass(), "docInfo", null);
        setBooleanField(term9270, term9270.getClass(), "unknown", false);
        setBooleanField(term9270, term9270.getClass(), "resolved", false);
        setField(term9270, term9270.getClass(), "resolveResult", null);
        setBooleanField(term9270, term9270.getClass(), "inTemplatedCheckVisit", false);
        setField(term9270, term9270.getClass(), "registry", null);
        setField(term9266, term9266.getClass(), "ownerFunction", term9270);
        setBooleanField(term9266, term9266.getClass(), "prettyPrint", true);
        setBooleanField(term9266, term9266.getClass(), "visited", false);
        setField(term9271, term9271.getClass(), "info", null);
        setField(term9271, term9271.getClass(), "documentation", null);
        setField(term9271, term9271.getClass(), "associatedNode", null);
        setField(term9271, term9271.getClass(), "visibility", null);
        setIntField(term9271, term9271.getClass(), "bitset", 0);
        setField(term9271, term9271.getClass(), "type", null);
        setField(term9271, term9271.getClass(), "thisType", null);
        setBooleanField(term9271, term9271.getClass(), "includeDocumentation", false);
        setField(term9266, term9266.getClass(), "docInfo", term9271);
        setBooleanField(term9266, term9266.getClass(), "unknown", false);
        setBooleanField(term9266, term9266.getClass(), "resolved", false);
        setField(term9266, term9266.getClass(), "resolveResult", null);
        setBooleanField(term9266, term9266.getClass(), "inTemplatedCheckVisit", false);
        setField(term9266, term9266.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isNativeObjectType", argTypes, term2713, args);
        assertTrue(recursiveEquals(term2713, term9266));
    }

};


