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

public class NamedType_isNamedType_95053681227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1148;
     Object term4857;

    public NamedType_isNamedType_95053681227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1177 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType$PropertyContinuation"));
        Object term1180 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term1177, term1177.getClass(), "propertyName", "");
        setField(term1177, term1177.getClass(), "type", null);
        setBooleanField(term1177, term1177.getClass(), "inferred", true);
        setIntField(term1180, term1180.getClass(), "type", -1588772968);
        setField(term1180, term1180.getClass(), "next", null);
        setField(term1180, term1180.getClass(), "first", null);
        setField(term1180, term1180.getClass(), "last", null);
        setField(term1180, term1180.getClass(), "propListHead", null);
        setIntField(term1180, term1180.getClass(), "sourcePosition", 0);
        setField(term1180, term1180.getClass(), "jsType", null);
        setField(term1180, term1180.getClass(), "parent", null);
        setField(term1177, term1177.getClass(), "propertyNode", term1180);
        Object term1183 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType$PropertyContinuation"));
        setField(term1183, term1183.getClass(), "propertyName", "");
        setField(term1183, term1183.getClass(), "type", null);
        setBooleanField(term1183, term1183.getClass(), "inferred", false);
        setField(term1183, term1183.getClass(), "propertyNode", null);
        ArrayList term1175 = new ArrayList();
        ((ArrayList) term1175).add(term1177);
        ((ArrayList) term1175).add(term1183);
        term1148 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setField(term1148, term1148.getClass(), "reference", "SPpkrGcPRr");
        setField(term1148, term1148.getClass(), "sourceName", "sEccwbJKYE");
        setIntField(term1148, term1148.getClass(), "lineno", 1225272962);
        setIntField(term1148, term1148.getClass(), "charno", 1324040357);
        setField(term1148, term1148.getClass(), "validator", null);
        setField(term1148, term1148.getClass(), "propertyContinuations", term1175);
        setField(term1148, term1148.getClass(), "referencedType", null);
        setField(term1148, term1148.getClass(), "referencedObjType", null);
        setBooleanField(term1148, term1148.getClass(), "visited", false);
        setField(term1148, term1148.getClass(), "docInfo", null);
        setBooleanField(term1148, term1148.getClass(), "unknown", false);
        setBooleanField(term1148, term1148.getClass(), "resolved", false);
        setField(term1148, term1148.getClass(), "resolveResult", null);
        setField(term1148, term1148.getClass(), "templateKeys", null);
        setField(term1148, term1148.getClass(), "templatizedTypes", null);
        setBooleanField(term1148, term1148.getClass(), "inTemplatedCheckVisit", false);
        setField(term1148, term1148.getClass(), "registry", null);
        Object term4864 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType$PropertyContinuation"));
        Object term4866 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term4864, term4864.getClass(), "propertyName", "");
        setField(term4864, term4864.getClass(), "type", null);
        setBooleanField(term4864, term4864.getClass(), "inferred", true);
        setIntField(term4866, term4866.getClass(), "type", -1588772968);
        setField(term4866, term4866.getClass(), "next", null);
        setField(term4866, term4866.getClass(), "first", null);
        setField(term4866, term4866.getClass(), "last", null);
        setField(term4866, term4866.getClass(), "propListHead", null);
        setIntField(term4866, term4866.getClass(), "sourcePosition", 0);
        setField(term4866, term4866.getClass(), "jsType", null);
        setField(term4866, term4866.getClass(), "parent", null);
        setField(term4864, term4864.getClass(), "propertyNode", term4866);
        Object term4867 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType$PropertyContinuation"));
        setField(term4867, term4867.getClass(), "propertyName", "");
        setField(term4867, term4867.getClass(), "type", null);
        setBooleanField(term4867, term4867.getClass(), "inferred", false);
        setField(term4867, term4867.getClass(), "propertyNode", null);
        ArrayList term4862 = new ArrayList();
        ((ArrayList) term4862).add(term4864);
        ((ArrayList) term4862).add(term4867);
        term4857 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setField(term4857, term4857.getClass(), "reference", "SPpkrGcPRr");
        setField(term4857, term4857.getClass(), "sourceName", "sEccwbJKYE");
        setIntField(term4857, term4857.getClass(), "lineno", 1225272962);
        setIntField(term4857, term4857.getClass(), "charno", 1324040357);
        setField(term4857, term4857.getClass(), "validator", null);
        setField(term4857, term4857.getClass(), "propertyContinuations", term4862);
        setField(term4857, term4857.getClass(), "referencedType", null);
        setField(term4857, term4857.getClass(), "referencedObjType", null);
        setBooleanField(term4857, term4857.getClass(), "visited", false);
        setField(term4857, term4857.getClass(), "docInfo", null);
        setBooleanField(term4857, term4857.getClass(), "unknown", false);
        setBooleanField(term4857, term4857.getClass(), "resolved", false);
        setField(term4857, term4857.getClass(), "resolveResult", null);
        setField(term4857, term4857.getClass(), "templateKeys", null);
        setField(term4857, term4857.getClass(), "templatizedTypes", null);
        setBooleanField(term4857, term4857.getClass(), "inTemplatedCheckVisit", false);
        setField(term4857, term4857.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isNamedType", argTypes, term1148, args);
        assertTrue(recursiveEquals(term1148, term4857));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


