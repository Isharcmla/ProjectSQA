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

public class PrototypeObjectType_getPropertyType_69377176752 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term725;

    public PrototypeObjectType_getPropertyType_69377176752() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term738 = new HashMap();
        term725 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term750 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term758 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term725, term725.getClass(), "className", "JDaAnsVTGV");
        setField(term725, term725.getClass(), "properties", term738);
        setBooleanField(term725, term725.getClass(), "nativeType", true);
        setField(term725, term725.getClass(), "implicitPrototypeFallback", null);
        setField(term750, term750.getClass(), "call", null);
        setField(term750, term750.getClass(), "prototypeSlot", null);
        setField(term750, term750.getClass(), "kind", null);
        setField(term750, term750.getClass(), "typeOfThis", null);
        setField(term750, term750.getClass(), "source", null);
        setField(term750, term750.getClass(), "implementedInterfaces", null);
        setField(term750, term750.getClass(), "extendedInterfaces", null);
        setField(term750, term750.getClass(), "subTypes", null);
        setField(term750, term750.getClass(), "templateTypeName", null);
        setField(term750, term750.getClass(), "className", null);
        setField(term750, term750.getClass(), "properties", null);
        setBooleanField(term750, term750.getClass(), "nativeType", false);
        setField(term750, term750.getClass(), "implicitPrototypeFallback", null);
        setField(term750, term750.getClass(), "ownerFunction", null);
        setBooleanField(term750, term750.getClass(), "prettyPrint", false);
        setBooleanField(term750, term750.getClass(), "visited", false);
        setField(term750, term750.getClass(), "docInfo", null);
        setBooleanField(term750, term750.getClass(), "unknown", false);
        setBooleanField(term750, term750.getClass(), "resolved", false);
        setField(term750, term750.getClass(), "resolveResult", null);
        setField(term750, term750.getClass(), "registry", null);
        setField(term725, term725.getClass(), "ownerFunction", term750);
        setBooleanField(term725, term725.getClass(), "prettyPrint", false);
        setBooleanField(term725, term725.getClass(), "visited", false);
        setField(term758, term758.getClass(), "info", null);
        setField(term758, term758.getClass(), "documentation", null);
        setField(term758, term758.getClass(), "associatedNode", null);
        setField(term758, term758.getClass(), "visibility", null);
        setIntField(term758, term758.getClass(), "bitset", 0);
        setField(term758, term758.getClass(), "type", null);
        setField(term758, term758.getClass(), "thisType", null);
        setBooleanField(term758, term758.getClass(), "includeDocumentation", false);
        setField(term725, term725.getClass(), "docInfo", term758);
        setBooleanField(term725, term725.getClass(), "unknown", false);
        setBooleanField(term725, term725.getClass(), "resolved", false);
        setField(term725, term725.getClass(), "resolveResult", null);
        setField(term725, term725.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "SdCKLMIYnX";
        try {
            callMethod(klass, "getPropertyType", argTypes, term725, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


