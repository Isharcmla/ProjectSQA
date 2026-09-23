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
import java.util.ArrayList;
import java.lang.Object;

public class NamedType_getTypedefType_10668604038 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2422;

    public NamedType_getTypedefType_10668604038() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term2451 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType$PropertyContinuation"));
        Object term2454 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term2451, term2451.getClass(), "propertyName", "");
        setField(term2451, term2451.getClass(), "type", null);
        setBooleanField(term2451, term2451.getClass(), "inferred", true);
        setIntField(term2454, term2454.getClass(), "type", -1388471422);
        setField(term2454, term2454.getClass(), "next", null);
        setField(term2454, term2454.getClass(), "first", null);
        setField(term2454, term2454.getClass(), "last", null);
        setField(term2454, term2454.getClass(), "propListHead", null);
        setIntField(term2454, term2454.getClass(), "sourcePosition", 0);
        setField(term2454, term2454.getClass(), "jsType", null);
        setField(term2454, term2454.getClass(), "parent", null);
        setField(term2451, term2451.getClass(), "propertyNode", term2454);
        Object term2457 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType$PropertyContinuation"));
        setField(term2457, term2457.getClass(), "propertyName", "");
        setField(term2457, term2457.getClass(), "type", null);
        setBooleanField(term2457, term2457.getClass(), "inferred", false);
        setField(term2457, term2457.getClass(), "propertyNode", null);
        Object term2460 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType$PropertyContinuation"));
        setField(term2460, term2460.getClass(), "propertyName", null);
        setField(term2460, term2460.getClass(), "type", null);
        setBooleanField(term2460, term2460.getClass(), "inferred", false);
        setField(term2460, term2460.getClass(), "propertyNode", null);
        Object term2462 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType$PropertyContinuation"));
        setField(term2462, term2462.getClass(), "propertyName", null);
        setField(term2462, term2462.getClass(), "type", null);
        setBooleanField(term2462, term2462.getClass(), "inferred", false);
        setField(term2462, term2462.getClass(), "propertyNode", null);
        Object term2464 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType$PropertyContinuation"));
        setField(term2464, term2464.getClass(), "propertyName", null);
        setField(term2464, term2464.getClass(), "type", null);
        setBooleanField(term2464, term2464.getClass(), "inferred", false);
        setField(term2464, term2464.getClass(), "propertyNode", null);
        Object term2466 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType$PropertyContinuation"));
        setField(term2466, term2466.getClass(), "propertyName", null);
        setField(term2466, term2466.getClass(), "type", null);
        setBooleanField(term2466, term2466.getClass(), "inferred", false);
        setField(term2466, term2466.getClass(), "propertyNode", null);
        Object term2468 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType$PropertyContinuation"));
        setField(term2468, term2468.getClass(), "propertyName", null);
        setField(term2468, term2468.getClass(), "type", null);
        setBooleanField(term2468, term2468.getClass(), "inferred", false);
        setField(term2468, term2468.getClass(), "propertyNode", null);
        Object term2470 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType$PropertyContinuation"));
        setField(term2470, term2470.getClass(), "propertyName", null);
        setField(term2470, term2470.getClass(), "type", null);
        setBooleanField(term2470, term2470.getClass(), "inferred", false);
        setField(term2470, term2470.getClass(), "propertyNode", null);
        Object term2472 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType$PropertyContinuation"));
        setField(term2472, term2472.getClass(), "propertyName", null);
        setField(term2472, term2472.getClass(), "type", null);
        setBooleanField(term2472, term2472.getClass(), "inferred", false);
        setField(term2472, term2472.getClass(), "propertyNode", null);
        ArrayList term2449 = new ArrayList();
        ((ArrayList) term2449).add(term2451);
        ((ArrayList) term2449).add(term2457);
        ((ArrayList) term2449).add(term2460);
        ((ArrayList) term2449).add(term2462);
        ((ArrayList) term2449).add(term2464);
        ((ArrayList) term2449).add(term2466);
        ((ArrayList) term2449).add(term2468);
        ((ArrayList) term2449).add(term2470);
        ((ArrayList) term2449).add(term2472);
        term2422 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setField(term2422, term2422.getClass(), "reference", "rLHAoqXgPh");
        setField(term2422, term2422.getClass(), "sourceName", "zUlRdimJtU");
        setIntField(term2422, term2422.getClass(), "lineno", -1697741339);
        setIntField(term2422, term2422.getClass(), "charno", 98922530);
        setField(term2422, term2422.getClass(), "validator", null);
        setField(term2422, term2422.getClass(), "propertyContinuations", term2449);
        setField(term2422, term2422.getClass(), "referencedType", null);
        setField(term2422, term2422.getClass(), "referencedObjType", null);
        setBooleanField(term2422, term2422.getClass(), "visited", false);
        setField(term2422, term2422.getClass(), "docInfo", null);
        setBooleanField(term2422, term2422.getClass(), "unknown", false);
        setBooleanField(term2422, term2422.getClass(), "resolved", false);
        setField(term2422, term2422.getClass(), "resolveResult", null);
        setField(term2422, term2422.getClass(), "templateKeys", null);
        setField(term2422, term2422.getClass(), "templatizedTypes", null);
        setBooleanField(term2422, term2422.getClass(), "inTemplatedCheckVisit", false);
        setField(term2422, term2422.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.ErrorReporter");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.StaticSlot");
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = "cudZvLMQon";
        try {
            callMethod(klass, "getTypedefType", argTypes, term2422, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


