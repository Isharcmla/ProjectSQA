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
import java.util.ArrayList;
import java.lang.Object;

public class NamedType_getReferenceName_95605668024 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term936;
     Object term4512;

    public NamedType_getReferenceName_95605668024() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term965 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType$PropertyContinuation"));
        Object term968 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term965, term965.getClass(), "propertyName", "");
        setField(term965, term965.getClass(), "type", null);
        setBooleanField(term965, term965.getClass(), "inferred", true);
        setIntField(term968, term968.getClass(), "type", -602026508);
        setField(term968, term968.getClass(), "next", null);
        setField(term968, term968.getClass(), "first", null);
        setField(term968, term968.getClass(), "last", null);
        setField(term968, term968.getClass(), "propListHead", null);
        setIntField(term968, term968.getClass(), "sourcePosition", 0);
        setField(term968, term968.getClass(), "jsType", null);
        setField(term968, term968.getClass(), "parent", null);
        setField(term965, term965.getClass(), "propertyNode", term968);
        Object term971 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType$PropertyContinuation"));
        setField(term971, term971.getClass(), "propertyName", "");
        setField(term971, term971.getClass(), "type", null);
        setBooleanField(term971, term971.getClass(), "inferred", false);
        setField(term971, term971.getClass(), "propertyNode", null);
        Object term974 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType$PropertyContinuation"));
        setField(term974, term974.getClass(), "propertyName", null);
        setField(term974, term974.getClass(), "type", null);
        setBooleanField(term974, term974.getClass(), "inferred", false);
        setField(term974, term974.getClass(), "propertyNode", null);
        Object term976 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType$PropertyContinuation"));
        setField(term976, term976.getClass(), "propertyName", null);
        setField(term976, term976.getClass(), "type", null);
        setBooleanField(term976, term976.getClass(), "inferred", false);
        setField(term976, term976.getClass(), "propertyNode", null);
        Object term978 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType$PropertyContinuation"));
        setField(term978, term978.getClass(), "propertyName", null);
        setField(term978, term978.getClass(), "type", null);
        setBooleanField(term978, term978.getClass(), "inferred", false);
        setField(term978, term978.getClass(), "propertyNode", null);
        ArrayList term963 = new ArrayList();
        ((ArrayList) term963).add(term965);
        ((ArrayList) term963).add(term971);
        ((ArrayList) term963).add(term974);
        ((ArrayList) term963).add(term976);
        ((ArrayList) term963).add(term978);
        term936 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setField(term936, term936.getClass(), "reference", "PkWMRdJcBb");
        setField(term936, term936.getClass(), "sourceName", "jSpAteRute");
        setIntField(term936, term936.getClass(), "lineno", 1962444399);
        setIntField(term936, term936.getClass(), "charno", 767834723);
        setField(term936, term936.getClass(), "validator", null);
        setField(term936, term936.getClass(), "propertyContinuations", term963);
        setField(term936, term936.getClass(), "referencedType", null);
        setField(term936, term936.getClass(), "referencedObjType", null);
        setBooleanField(term936, term936.getClass(), "visited", false);
        setField(term936, term936.getClass(), "docInfo", null);
        setBooleanField(term936, term936.getClass(), "unknown", false);
        setBooleanField(term936, term936.getClass(), "resolved", false);
        setField(term936, term936.getClass(), "resolveResult", null);
        setField(term936, term936.getClass(), "templateKeys", null);
        setField(term936, term936.getClass(), "templatizedTypes", null);
        setBooleanField(term936, term936.getClass(), "inTemplatedCheckVisit", false);
        setField(term936, term936.getClass(), "registry", null);
        Object term4519 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType$PropertyContinuation"));
        Object term4521 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term4519, term4519.getClass(), "propertyName", "");
        setField(term4519, term4519.getClass(), "type", null);
        setBooleanField(term4519, term4519.getClass(), "inferred", true);
        setIntField(term4521, term4521.getClass(), "type", -602026508);
        setField(term4521, term4521.getClass(), "next", null);
        setField(term4521, term4521.getClass(), "first", null);
        setField(term4521, term4521.getClass(), "last", null);
        setField(term4521, term4521.getClass(), "propListHead", null);
        setIntField(term4521, term4521.getClass(), "sourcePosition", 0);
        setField(term4521, term4521.getClass(), "jsType", null);
        setField(term4521, term4521.getClass(), "parent", null);
        setField(term4519, term4519.getClass(), "propertyNode", term4521);
        Object term4522 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType$PropertyContinuation"));
        setField(term4522, term4522.getClass(), "propertyName", "");
        setField(term4522, term4522.getClass(), "type", null);
        setBooleanField(term4522, term4522.getClass(), "inferred", false);
        setField(term4522, term4522.getClass(), "propertyNode", null);
        Object term4524 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType$PropertyContinuation"));
        setField(term4524, term4524.getClass(), "propertyName", null);
        setField(term4524, term4524.getClass(), "type", null);
        setBooleanField(term4524, term4524.getClass(), "inferred", false);
        setField(term4524, term4524.getClass(), "propertyNode", null);
        Object term4525 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType$PropertyContinuation"));
        setField(term4525, term4525.getClass(), "propertyName", null);
        setField(term4525, term4525.getClass(), "type", null);
        setBooleanField(term4525, term4525.getClass(), "inferred", false);
        setField(term4525, term4525.getClass(), "propertyNode", null);
        Object term4526 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType$PropertyContinuation"));
        setField(term4526, term4526.getClass(), "propertyName", null);
        setField(term4526, term4526.getClass(), "type", null);
        setBooleanField(term4526, term4526.getClass(), "inferred", false);
        setField(term4526, term4526.getClass(), "propertyNode", null);
        ArrayList term4517 = new ArrayList();
        ((ArrayList) term4517).add(term4519);
        ((ArrayList) term4517).add(term4522);
        ((ArrayList) term4517).add(term4524);
        ((ArrayList) term4517).add(term4525);
        ((ArrayList) term4517).add(term4526);
        term4512 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setField(term4512, term4512.getClass(), "reference", "PkWMRdJcBb");
        setField(term4512, term4512.getClass(), "sourceName", "jSpAteRute");
        setIntField(term4512, term4512.getClass(), "lineno", 1962444399);
        setIntField(term4512, term4512.getClass(), "charno", 767834723);
        setField(term4512, term4512.getClass(), "validator", null);
        setField(term4512, term4512.getClass(), "propertyContinuations", term4517);
        setField(term4512, term4512.getClass(), "referencedType", null);
        setField(term4512, term4512.getClass(), "referencedObjType", null);
        setBooleanField(term4512, term4512.getClass(), "visited", false);
        setField(term4512, term4512.getClass(), "docInfo", null);
        setBooleanField(term4512, term4512.getClass(), "unknown", false);
        setBooleanField(term4512, term4512.getClass(), "resolved", false);
        setField(term4512, term4512.getClass(), "resolveResult", null);
        setField(term4512, term4512.getClass(), "templateKeys", null);
        setField(term4512, term4512.getClass(), "templatizedTypes", null);
        setBooleanField(term4512, term4512.getClass(), "inTemplatedCheckVisit", false);
        setField(term4512, term4512.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getReferenceName", argTypes, term936, args);
        assertTrue(recursiveEquals(term936, term4512));
        assertTrue(recursiveEquals(retValue, "PkWMRdJcBb"));
    }

};


