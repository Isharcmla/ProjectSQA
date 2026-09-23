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

public class NamedType_handleTypeCycle_48051223335 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1696;

    public NamedType_handleTypeCycle_48051223335() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1725 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType$PropertyContinuation"));
        Object term1728 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term1725, term1725.getClass(), "propertyName", "");
        setField(term1725, term1725.getClass(), "type", null);
        setBooleanField(term1725, term1725.getClass(), "inferred", true);
        setIntField(term1728, term1728.getClass(), "type", -2015854073);
        setField(term1728, term1728.getClass(), "next", null);
        setField(term1728, term1728.getClass(), "first", null);
        setField(term1728, term1728.getClass(), "last", null);
        setField(term1728, term1728.getClass(), "propListHead", null);
        setIntField(term1728, term1728.getClass(), "sourcePosition", 0);
        setField(term1728, term1728.getClass(), "jsType", null);
        setField(term1728, term1728.getClass(), "parent", null);
        setField(term1725, term1725.getClass(), "propertyNode", term1728);
        ArrayList term1723 = new ArrayList();
        ((ArrayList) term1723).add(term1725);
        term1696 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setField(term1696, term1696.getClass(), "reference", "xJgPlLxpgC");
        setField(term1696, term1696.getClass(), "sourceName", "EYtfuJaxiM");
        setIntField(term1696, term1696.getClass(), "lineno", 480137250);
        setIntField(term1696, term1696.getClass(), "charno", -341152642);
        setField(term1696, term1696.getClass(), "validator", null);
        setField(term1696, term1696.getClass(), "propertyContinuations", term1723);
        setField(term1696, term1696.getClass(), "referencedType", null);
        setField(term1696, term1696.getClass(), "referencedObjType", null);
        setBooleanField(term1696, term1696.getClass(), "visited", false);
        setField(term1696, term1696.getClass(), "docInfo", null);
        setBooleanField(term1696, term1696.getClass(), "unknown", false);
        setBooleanField(term1696, term1696.getClass(), "resolved", false);
        setField(term1696, term1696.getClass(), "resolveResult", null);
        setField(term1696, term1696.getClass(), "templateKeys", null);
        setField(term1696, term1696.getClass(), "templatizedTypes", null);
        setBooleanField(term1696, term1696.getClass(), "inTemplatedCheckVisit", false);
        setField(term1696, term1696.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.ErrorReporter");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "handleTypeCycle", argTypes, term1696, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


