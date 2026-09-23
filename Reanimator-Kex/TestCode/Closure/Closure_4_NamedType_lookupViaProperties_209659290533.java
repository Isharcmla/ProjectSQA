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

public class NamedType_lookupViaProperties_209659290533 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1556;

    public NamedType_lookupViaProperties_209659290533() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1585 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType$PropertyContinuation"));
        Object term1588 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term1585, term1585.getClass(), "propertyName", "");
        setField(term1585, term1585.getClass(), "type", null);
        setBooleanField(term1585, term1585.getClass(), "inferred", false);
        setIntField(term1588, term1588.getClass(), "type", 890669485);
        setField(term1588, term1588.getClass(), "next", null);
        setField(term1588, term1588.getClass(), "first", null);
        setField(term1588, term1588.getClass(), "last", null);
        setField(term1588, term1588.getClass(), "propListHead", null);
        setIntField(term1588, term1588.getClass(), "sourcePosition", 0);
        setField(term1588, term1588.getClass(), "jsType", null);
        setField(term1588, term1588.getClass(), "parent", null);
        setField(term1585, term1585.getClass(), "propertyNode", term1588);
        Object term1591 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType$PropertyContinuation"));
        setField(term1591, term1591.getClass(), "propertyName", "");
        setField(term1591, term1591.getClass(), "type", null);
        setBooleanField(term1591, term1591.getClass(), "inferred", false);
        setField(term1591, term1591.getClass(), "propertyNode", null);
        Object term1594 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType$PropertyContinuation"));
        setField(term1594, term1594.getClass(), "propertyName", null);
        setField(term1594, term1594.getClass(), "type", null);
        setBooleanField(term1594, term1594.getClass(), "inferred", false);
        setField(term1594, term1594.getClass(), "propertyNode", null);
        Object term1596 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType$PropertyContinuation"));
        setField(term1596, term1596.getClass(), "propertyName", null);
        setField(term1596, term1596.getClass(), "type", null);
        setBooleanField(term1596, term1596.getClass(), "inferred", false);
        setField(term1596, term1596.getClass(), "propertyNode", null);
        Object term1598 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType$PropertyContinuation"));
        setField(term1598, term1598.getClass(), "propertyName", null);
        setField(term1598, term1598.getClass(), "type", null);
        setBooleanField(term1598, term1598.getClass(), "inferred", false);
        setField(term1598, term1598.getClass(), "propertyNode", null);
        ArrayList term1583 = new ArrayList();
        ((ArrayList) term1583).add(term1585);
        ((ArrayList) term1583).add(term1591);
        ((ArrayList) term1583).add(term1594);
        ((ArrayList) term1583).add(term1596);
        ((ArrayList) term1583).add(term1598);
        term1556 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setField(term1556, term1556.getClass(), "reference", "AdxvLJhNLe");
        setField(term1556, term1556.getClass(), "sourceName", "lHfTrWKMPk");
        setIntField(term1556, term1556.getClass(), "lineno", -1801760683);
        setIntField(term1556, term1556.getClass(), "charno", 1141317871);
        setField(term1556, term1556.getClass(), "validator", null);
        setField(term1556, term1556.getClass(), "propertyContinuations", term1583);
        setField(term1556, term1556.getClass(), "referencedType", null);
        setField(term1556, term1556.getClass(), "referencedObjType", null);
        setBooleanField(term1556, term1556.getClass(), "visited", false);
        setField(term1556, term1556.getClass(), "docInfo", null);
        setBooleanField(term1556, term1556.getClass(), "unknown", false);
        setBooleanField(term1556, term1556.getClass(), "resolved", false);
        setField(term1556, term1556.getClass(), "resolveResult", null);
        setField(term1556, term1556.getClass(), "templateKeys", null);
        setField(term1556, term1556.getClass(), "templatizedTypes", null);
        setBooleanField(term1556, term1556.getClass(), "inTemplatedCheckVisit", false);
        setField(term1556, term1556.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.ErrorReporter");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.StaticScope");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        try {
            callMethod(klass, "lookupViaProperties", argTypes, term1556, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


