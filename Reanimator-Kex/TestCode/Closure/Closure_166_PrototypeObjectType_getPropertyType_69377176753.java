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
import java.lang.NullPointerException;
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.Object;

public class PrototypeObjectType_getPropertyType_69377176753 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term741;

    public PrototypeObjectType_getPropertyType_69377176753() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term754 = new HashMap();
        term741 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term766 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term775 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term741, term741.getClass(), "className", "JDaAnsVTGV");
        setField(term741, term741.getClass(), "properties", term754);
        setBooleanField(term741, term741.getClass(), "nativeType", true);
        setField(term741, term741.getClass(), "implicitPrototypeFallback", null);
        setField(term766, term766.getClass(), "call", null);
        setField(term766, term766.getClass(), "prototypeSlot", null);
        setField(term766, term766.getClass(), "kind", null);
        setField(term766, term766.getClass(), "typeOfThis", null);
        setField(term766, term766.getClass(), "source", null);
        setField(term766, term766.getClass(), "implementedInterfaces", null);
        setField(term766, term766.getClass(), "extendedInterfaces", null);
        setField(term766, term766.getClass(), "subTypes", null);
        setField(term766, term766.getClass(), "templateTypeNames", null);
        setField(term766, term766.getClass(), "className", null);
        setField(term766, term766.getClass(), "properties", null);
        setBooleanField(term766, term766.getClass(), "nativeType", false);
        setField(term766, term766.getClass(), "implicitPrototypeFallback", null);
        setField(term766, term766.getClass(), "ownerFunction", null);
        setBooleanField(term766, term766.getClass(), "prettyPrint", false);
        setBooleanField(term766, term766.getClass(), "visited", false);
        setField(term766, term766.getClass(), "docInfo", null);
        setBooleanField(term766, term766.getClass(), "unknown", false);
        setBooleanField(term766, term766.getClass(), "resolved", false);
        setField(term766, term766.getClass(), "resolveResult", null);
        setBooleanField(term766, term766.getClass(), "inTemplatedCheckVisit", false);
        setField(term766, term766.getClass(), "registry", null);
        setField(term741, term741.getClass(), "ownerFunction", term766);
        setBooleanField(term741, term741.getClass(), "prettyPrint", false);
        setBooleanField(term741, term741.getClass(), "visited", false);
        setField(term775, term775.getClass(), "info", null);
        setField(term775, term775.getClass(), "documentation", null);
        setField(term775, term775.getClass(), "associatedNode", null);
        setField(term775, term775.getClass(), "visibility", null);
        setIntField(term775, term775.getClass(), "bitset", 0);
        setField(term775, term775.getClass(), "type", null);
        setField(term775, term775.getClass(), "thisType", null);
        setBooleanField(term775, term775.getClass(), "includeDocumentation", false);
        setField(term741, term741.getClass(), "docInfo", term775);
        setBooleanField(term741, term741.getClass(), "unknown", false);
        setBooleanField(term741, term741.getClass(), "resolved", false);
        setField(term741, term741.getClass(), "resolveResult", null);
        setBooleanField(term741, term741.getClass(), "inTemplatedCheckVisit", false);
        setField(term741, term741.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "SdCKLMIYnX";
        try {
            callMethod(klass, "getPropertyType", argTypes, term741, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


