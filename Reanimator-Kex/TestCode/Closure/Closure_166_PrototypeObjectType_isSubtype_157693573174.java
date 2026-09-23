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

public class PrototypeObjectType_isSubtype_157693573174 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2563;

    public PrototypeObjectType_isSubtype_157693573174() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2576 = new HashMap();
        term2563 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term2588 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2597 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term2563, term2563.getClass(), "className", "OIHoJeysUi");
        setField(term2563, term2563.getClass(), "properties", term2576);
        setBooleanField(term2563, term2563.getClass(), "nativeType", false);
        setField(term2563, term2563.getClass(), "implicitPrototypeFallback", null);
        setField(term2588, term2588.getClass(), "call", null);
        setField(term2588, term2588.getClass(), "prototypeSlot", null);
        setField(term2588, term2588.getClass(), "kind", null);
        setField(term2588, term2588.getClass(), "typeOfThis", null);
        setField(term2588, term2588.getClass(), "source", null);
        setField(term2588, term2588.getClass(), "implementedInterfaces", null);
        setField(term2588, term2588.getClass(), "extendedInterfaces", null);
        setField(term2588, term2588.getClass(), "subTypes", null);
        setField(term2588, term2588.getClass(), "templateTypeNames", null);
        setField(term2588, term2588.getClass(), "className", null);
        setField(term2588, term2588.getClass(), "properties", null);
        setBooleanField(term2588, term2588.getClass(), "nativeType", false);
        setField(term2588, term2588.getClass(), "implicitPrototypeFallback", null);
        setField(term2588, term2588.getClass(), "ownerFunction", null);
        setBooleanField(term2588, term2588.getClass(), "prettyPrint", false);
        setBooleanField(term2588, term2588.getClass(), "visited", false);
        setField(term2588, term2588.getClass(), "docInfo", null);
        setBooleanField(term2588, term2588.getClass(), "unknown", false);
        setBooleanField(term2588, term2588.getClass(), "resolved", false);
        setField(term2588, term2588.getClass(), "resolveResult", null);
        setBooleanField(term2588, term2588.getClass(), "inTemplatedCheckVisit", false);
        setField(term2588, term2588.getClass(), "registry", null);
        setField(term2563, term2563.getClass(), "ownerFunction", term2588);
        setBooleanField(term2563, term2563.getClass(), "prettyPrint", true);
        setBooleanField(term2563, term2563.getClass(), "visited", true);
        setField(term2597, term2597.getClass(), "info", null);
        setField(term2597, term2597.getClass(), "documentation", null);
        setField(term2597, term2597.getClass(), "associatedNode", null);
        setField(term2597, term2597.getClass(), "visibility", null);
        setIntField(term2597, term2597.getClass(), "bitset", 0);
        setField(term2597, term2597.getClass(), "type", null);
        setField(term2597, term2597.getClass(), "thisType", null);
        setBooleanField(term2597, term2597.getClass(), "includeDocumentation", false);
        setField(term2563, term2563.getClass(), "docInfo", term2597);
        setBooleanField(term2563, term2563.getClass(), "unknown", false);
        setBooleanField(term2563, term2563.getClass(), "resolved", true);
        setField(term2563, term2563.getClass(), "resolveResult", null);
        setBooleanField(term2563, term2563.getClass(), "inTemplatedCheckVisit", false);
        setField(term2563, term2563.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "isSubtype", argTypes, term2563, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


