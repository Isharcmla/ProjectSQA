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
import java.util.HashMap;
import java.lang.Object;

public class PrototypeObjectType_setImplicitPrototype_172198674871 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2413;

    public PrototypeObjectType_setImplicitPrototype_172198674871() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2426 = new HashMap();
        term2413 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term2438 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2447 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term2413, term2413.getClass(), "className", "izPpKDErnQ");
        setField(term2413, term2413.getClass(), "properties", term2426);
        setBooleanField(term2413, term2413.getClass(), "nativeType", false);
        setField(term2413, term2413.getClass(), "implicitPrototypeFallback", null);
        setField(term2438, term2438.getClass(), "call", null);
        setField(term2438, term2438.getClass(), "prototypeSlot", null);
        setField(term2438, term2438.getClass(), "kind", null);
        setField(term2438, term2438.getClass(), "typeOfThis", null);
        setField(term2438, term2438.getClass(), "source", null);
        setField(term2438, term2438.getClass(), "implementedInterfaces", null);
        setField(term2438, term2438.getClass(), "extendedInterfaces", null);
        setField(term2438, term2438.getClass(), "subTypes", null);
        setField(term2438, term2438.getClass(), "templateTypeNames", null);
        setField(term2438, term2438.getClass(), "className", null);
        setField(term2438, term2438.getClass(), "properties", null);
        setBooleanField(term2438, term2438.getClass(), "nativeType", false);
        setField(term2438, term2438.getClass(), "implicitPrototypeFallback", null);
        setField(term2438, term2438.getClass(), "ownerFunction", null);
        setBooleanField(term2438, term2438.getClass(), "prettyPrint", false);
        setBooleanField(term2438, term2438.getClass(), "visited", false);
        setField(term2438, term2438.getClass(), "docInfo", null);
        setBooleanField(term2438, term2438.getClass(), "unknown", false);
        setBooleanField(term2438, term2438.getClass(), "resolved", false);
        setField(term2438, term2438.getClass(), "resolveResult", null);
        setBooleanField(term2438, term2438.getClass(), "inTemplatedCheckVisit", false);
        setField(term2438, term2438.getClass(), "registry", null);
        setField(term2413, term2413.getClass(), "ownerFunction", term2438);
        setBooleanField(term2413, term2413.getClass(), "prettyPrint", true);
        setBooleanField(term2413, term2413.getClass(), "visited", false);
        setField(term2447, term2447.getClass(), "info", null);
        setField(term2447, term2447.getClass(), "documentation", null);
        setField(term2447, term2447.getClass(), "associatedNode", null);
        setField(term2447, term2447.getClass(), "visibility", null);
        setIntField(term2447, term2447.getClass(), "bitset", 0);
        setField(term2447, term2447.getClass(), "type", null);
        setField(term2447, term2447.getClass(), "thisType", null);
        setBooleanField(term2447, term2447.getClass(), "includeDocumentation", false);
        setField(term2413, term2413.getClass(), "docInfo", term2447);
        setBooleanField(term2413, term2413.getClass(), "unknown", false);
        setBooleanField(term2413, term2413.getClass(), "resolved", true);
        setField(term2413, term2413.getClass(), "resolveResult", null);
        setBooleanField(term2413, term2413.getClass(), "inTemplatedCheckVisit", false);
        setField(term2413, term2413.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "setImplicitPrototype", argTypes, term2413, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


