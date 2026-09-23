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

public class NamedType_defineProperty_34641856742 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8484;
     Object term8659;

    public NamedType_defineProperty_34641856742() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8484 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setBooleanField(term8484, term8484.getClass(), "resolved", true);
        term8659 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setField(term8659, term8659.getClass(), "reference", null);
        setField(term8659, term8659.getClass(), "sourceName", null);
        setIntField(term8659, term8659.getClass(), "lineno", 0);
        setIntField(term8659, term8659.getClass(), "charno", 0);
        setField(term8659, term8659.getClass(), "validator", null);
        setField(term8659, term8659.getClass(), "propertyContinuations", null);
        setField(term8659, term8659.getClass(), "referencedType", null);
        setField(term8659, term8659.getClass(), "referencedObjType", null);
        setBooleanField(term8659, term8659.getClass(), "visited", false);
        setField(term8659, term8659.getClass(), "docInfo", null);
        setBooleanField(term8659, term8659.getClass(), "unknown", false);
        setBooleanField(term8659, term8659.getClass(), "resolved", true);
        setField(term8659, term8659.getClass(), "resolveResult", null);
        setField(term8659, term8659.getClass(), "templateKeys", null);
        setField(term8659, term8659.getClass(), "templatizedTypes", null);
        setBooleanField(term8659, term8659.getClass(), "inTemplatedCheckVisit", false);
        setField(term8659, term8659.getClass(), "registry", null);
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
        Object retValue = callMethod(klass, "defineProperty", argTypes, term8484, args);
        assertTrue(recursiveEquals(term8484, term8659));
        assertTrue(recursiveEquals(retValue, true));
    }

};


