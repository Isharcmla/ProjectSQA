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

public class PrototypeObjectType_isPropertyTypeInferred_116767719650 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term655;

    public PrototypeObjectType_isPropertyTypeInferred_116767719650() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term668 = new HashMap();
        term655 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term680 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term688 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term655, term655.getClass(), "className", "WzMEhMXkKx");
        setField(term655, term655.getClass(), "properties", term668);
        setBooleanField(term655, term655.getClass(), "nativeType", true);
        setField(term655, term655.getClass(), "implicitPrototypeFallback", null);
        setField(term680, term680.getClass(), "call", null);
        setField(term680, term680.getClass(), "prototypeSlot", null);
        setField(term680, term680.getClass(), "kind", null);
        setField(term680, term680.getClass(), "typeOfThis", null);
        setField(term680, term680.getClass(), "source", null);
        setField(term680, term680.getClass(), "implementedInterfaces", null);
        setField(term680, term680.getClass(), "extendedInterfaces", null);
        setField(term680, term680.getClass(), "subTypes", null);
        setField(term680, term680.getClass(), "templateTypeName", null);
        setField(term680, term680.getClass(), "className", null);
        setField(term680, term680.getClass(), "properties", null);
        setBooleanField(term680, term680.getClass(), "nativeType", false);
        setField(term680, term680.getClass(), "implicitPrototypeFallback", null);
        setField(term680, term680.getClass(), "ownerFunction", null);
        setBooleanField(term680, term680.getClass(), "prettyPrint", false);
        setBooleanField(term680, term680.getClass(), "visited", false);
        setField(term680, term680.getClass(), "docInfo", null);
        setBooleanField(term680, term680.getClass(), "unknown", false);
        setBooleanField(term680, term680.getClass(), "resolved", false);
        setField(term680, term680.getClass(), "resolveResult", null);
        setField(term680, term680.getClass(), "registry", null);
        setField(term655, term655.getClass(), "ownerFunction", term680);
        setBooleanField(term655, term655.getClass(), "prettyPrint", true);
        setBooleanField(term655, term655.getClass(), "visited", false);
        setField(term688, term688.getClass(), "info", null);
        setField(term688, term688.getClass(), "documentation", null);
        setField(term688, term688.getClass(), "associatedNode", null);
        setField(term688, term688.getClass(), "visibility", null);
        setIntField(term688, term688.getClass(), "bitset", 0);
        setField(term688, term688.getClass(), "type", null);
        setField(term688, term688.getClass(), "thisType", null);
        setBooleanField(term688, term688.getClass(), "includeDocumentation", false);
        setField(term655, term655.getClass(), "docInfo", term688);
        setBooleanField(term655, term655.getClass(), "unknown", false);
        setBooleanField(term655, term655.getClass(), "resolved", true);
        setField(term655, term655.getClass(), "resolveResult", null);
        setField(term655, term655.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "lHfTrWKMPk";
        try {
            callMethod(klass, "isPropertyTypeInferred", argTypes, term655, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


