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

public class NamedType_defineProperty_34641856764 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12499;
     Object term12737;

    public NamedType_defineProperty_34641856764() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12499 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setBooleanField(term12499, term12499.getClass(), "resolved", false);
        setField(term12499, term12499.getClass(), "propertyContinuations", null);
        Object term12740 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType$PropertyContinuation"));
        setField(term12740, term12740.getClass(), "propertyName", null);
        setField(term12740, term12740.getClass(), "type", null);
        setBooleanField(term12740, term12740.getClass(), "inferred", false);
        setField(term12740, term12740.getClass(), "propertyNode", null);
        ArrayList term12738 = new ArrayList();
        ((ArrayList) term12738).add(term12740);
        term12737 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setField(term12737, term12737.getClass(), "reference", null);
        setField(term12737, term12737.getClass(), "sourceName", null);
        setIntField(term12737, term12737.getClass(), "lineno", 0);
        setIntField(term12737, term12737.getClass(), "charno", 0);
        setField(term12737, term12737.getClass(), "validator", null);
        setField(term12737, term12737.getClass(), "propertyContinuations", term12738);
        setField(term12737, term12737.getClass(), "referencedType", null);
        setField(term12737, term12737.getClass(), "referencedObjType", null);
        setBooleanField(term12737, term12737.getClass(), "visited", false);
        setField(term12737, term12737.getClass(), "docInfo", null);
        setBooleanField(term12737, term12737.getClass(), "unknown", false);
        setBooleanField(term12737, term12737.getClass(), "resolved", false);
        setField(term12737, term12737.getClass(), "resolveResult", null);
        setField(term12737, term12737.getClass(), "templateKeys", null);
        setField(term12737, term12737.getClass(), "templatizedTypes", null);
        setBooleanField(term12737, term12737.getClass(), "inTemplatedCheckVisit", false);
        setField(term12737, term12737.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[2] = boolean.class;
        argTypes[3] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = null;
        args[2] = false;
        args[3] = null;
        Object retValue = callMethod(klass, "defineProperty", argTypes, term12499, args);
        assertTrue(recursiveEquals(term12499, term12737));
        assertTrue(recursiveEquals(retValue, true));
    }

};


