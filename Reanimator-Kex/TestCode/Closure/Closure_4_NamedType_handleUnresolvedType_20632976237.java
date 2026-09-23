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
import java.lang.Boolean;

public class NamedType_handleUnresolvedType_20632976237 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2344;
     Object term2400;

    public NamedType_handleUnresolvedType_20632976237() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term2373 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType$PropertyContinuation"));
        Object term2376 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term2373, term2373.getClass(), "propertyName", "");
        setField(term2373, term2373.getClass(), "type", null);
        setBooleanField(term2373, term2373.getClass(), "inferred", true);
        setIntField(term2376, term2376.getClass(), "type", 9726679);
        setField(term2376, term2376.getClass(), "next", null);
        setField(term2376, term2376.getClass(), "first", null);
        setField(term2376, term2376.getClass(), "last", null);
        setField(term2376, term2376.getClass(), "propListHead", null);
        setIntField(term2376, term2376.getClass(), "sourcePosition", 0);
        setField(term2376, term2376.getClass(), "jsType", null);
        setField(term2376, term2376.getClass(), "parent", null);
        setField(term2373, term2373.getClass(), "propertyNode", term2376);
        Object term2379 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType$PropertyContinuation"));
        setField(term2379, term2379.getClass(), "propertyName", "");
        setField(term2379, term2379.getClass(), "type", null);
        setBooleanField(term2379, term2379.getClass(), "inferred", false);
        setField(term2379, term2379.getClass(), "propertyNode", null);
        Object term2382 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType$PropertyContinuation"));
        setField(term2382, term2382.getClass(), "propertyName", null);
        setField(term2382, term2382.getClass(), "type", null);
        setBooleanField(term2382, term2382.getClass(), "inferred", false);
        setField(term2382, term2382.getClass(), "propertyNode", null);
        Object term2384 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType$PropertyContinuation"));
        setField(term2384, term2384.getClass(), "propertyName", null);
        setField(term2384, term2384.getClass(), "type", null);
        setBooleanField(term2384, term2384.getClass(), "inferred", false);
        setField(term2384, term2384.getClass(), "propertyNode", null);
        Object term2386 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType$PropertyContinuation"));
        setField(term2386, term2386.getClass(), "propertyName", null);
        setField(term2386, term2386.getClass(), "type", null);
        setBooleanField(term2386, term2386.getClass(), "inferred", false);
        setField(term2386, term2386.getClass(), "propertyNode", null);
        Object term2388 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType$PropertyContinuation"));
        setField(term2388, term2388.getClass(), "propertyName", null);
        setField(term2388, term2388.getClass(), "type", null);
        setBooleanField(term2388, term2388.getClass(), "inferred", false);
        setField(term2388, term2388.getClass(), "propertyNode", null);
        Object term2390 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType$PropertyContinuation"));
        setField(term2390, term2390.getClass(), "propertyName", null);
        setField(term2390, term2390.getClass(), "type", null);
        setBooleanField(term2390, term2390.getClass(), "inferred", false);
        setField(term2390, term2390.getClass(), "propertyNode", null);
        Object term2392 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType$PropertyContinuation"));
        setField(term2392, term2392.getClass(), "propertyName", null);
        setField(term2392, term2392.getClass(), "type", null);
        setBooleanField(term2392, term2392.getClass(), "inferred", false);
        setField(term2392, term2392.getClass(), "propertyNode", null);
        ArrayList term2371 = new ArrayList();
        ((ArrayList) term2371).add(term2373);
        ((ArrayList) term2371).add(term2379);
        ((ArrayList) term2371).add(term2382);
        ((ArrayList) term2371).add(term2384);
        ((ArrayList) term2371).add(term2386);
        ((ArrayList) term2371).add(term2388);
        ((ArrayList) term2371).add(term2390);
        ((ArrayList) term2371).add(term2392);
        term2344 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setField(term2344, term2344.getClass(), "reference", "XYtryyobou");
        setField(term2344, term2344.getClass(), "sourceName", "OYbzXylRWW");
        setIntField(term2344, term2344.getClass(), "lineno", -1565502840);
        setIntField(term2344, term2344.getClass(), "charno", 344323424);
        setField(term2344, term2344.getClass(), "validator", null);
        setField(term2344, term2344.getClass(), "propertyContinuations", term2371);
        setField(term2344, term2344.getClass(), "referencedType", null);
        setField(term2344, term2344.getClass(), "referencedObjType", null);
        setBooleanField(term2344, term2344.getClass(), "visited", false);
        setField(term2344, term2344.getClass(), "docInfo", null);
        setBooleanField(term2344, term2344.getClass(), "unknown", false);
        setBooleanField(term2344, term2344.getClass(), "resolved", false);
        setField(term2344, term2344.getClass(), "resolveResult", null);
        setField(term2344, term2344.getClass(), "templateKeys", null);
        setField(term2344, term2344.getClass(), "templatizedTypes", null);
        setBooleanField(term2344, term2344.getClass(), "inTemplatedCheckVisit", false);
        setField(term2344, term2344.getClass(), "registry", null);
        term2400 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.ErrorReporter");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term2400;
        try {
            callMethod(klass, "handleUnresolvedType", argTypes, term2344, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


