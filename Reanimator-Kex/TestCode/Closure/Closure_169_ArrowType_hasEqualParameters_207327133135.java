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
import java.lang.Object;

public class ArrowType_hasEqualParameters_207327133135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4664;
     Object term4898;
     Object term5440;
     Object term5443;

    public ArrowType_hasEqualParameters_207327133135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4664 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term4734 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4804 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term4804, term4804.getClass(), "jsType", null);
        setField(term4734, term4734.getClass(), "first", term4804);
        setField(term4664, term4664.getClass(), "parameters", term4734);
        term4898 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term4968 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5038 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5132 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term5038, term5038.getClass(), "jsType", term5132);
        setField(term4968, term4968.getClass(), "first", term5038);
        setField(term4898, term4898.getClass(), "parameters", term4968);
        term5440 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term5441 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5442 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term5441, term5441.getClass(), "type", 0);
        setField(term5441, term5441.getClass(), "next", null);
        setIntField(term5442, term5442.getClass(), "type", 0);
        setField(term5442, term5442.getClass(), "next", null);
        setField(term5442, term5442.getClass(), "first", null);
        setField(term5442, term5442.getClass(), "last", null);
        setField(term5442, term5442.getClass(), "propListHead", null);
        setIntField(term5442, term5442.getClass(), "sourcePosition", 0);
        setField(term5442, term5442.getClass(), "jsType", null);
        setField(term5442, term5442.getClass(), "parent", null);
        setField(term5441, term5441.getClass(), "first", term5442);
        setField(term5441, term5441.getClass(), "last", null);
        setField(term5441, term5441.getClass(), "propListHead", null);
        setIntField(term5441, term5441.getClass(), "sourcePosition", 0);
        setField(term5441, term5441.getClass(), "jsType", null);
        setField(term5441, term5441.getClass(), "parent", null);
        setField(term5440, term5440.getClass(), "parameters", term5441);
        setField(term5440, term5440.getClass(), "returnType", null);
        setBooleanField(term5440, term5440.getClass(), "returnTypeInferred", false);
        setBooleanField(term5440, term5440.getClass(), "resolved", false);
        setField(term5440, term5440.getClass(), "resolveResult", null);
        setBooleanField(term5440, term5440.getClass(), "inTemplatedCheckVisit", false);
        setField(term5440, term5440.getClass(), "registry", null);
        term5443 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term5444 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5445 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5446 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setIntField(term5444, term5444.getClass(), "type", 0);
        setField(term5444, term5444.getClass(), "next", null);
        setIntField(term5445, term5445.getClass(), "type", 0);
        setField(term5445, term5445.getClass(), "next", null);
        setField(term5445, term5445.getClass(), "first", null);
        setField(term5445, term5445.getClass(), "last", null);
        setField(term5445, term5445.getClass(), "propListHead", null);
        setIntField(term5445, term5445.getClass(), "sourcePosition", 0);
        setField(term5446, term5446.getClass(), "parameters", null);
        setField(term5446, term5446.getClass(), "returnType", null);
        setBooleanField(term5446, term5446.getClass(), "returnTypeInferred", false);
        setBooleanField(term5446, term5446.getClass(), "resolved", false);
        setField(term5446, term5446.getClass(), "resolveResult", null);
        setBooleanField(term5446, term5446.getClass(), "inTemplatedCheckVisit", false);
        setField(term5446, term5446.getClass(), "registry", null);
        setField(term5445, term5445.getClass(), "jsType", term5446);
        setField(term5445, term5445.getClass(), "parent", null);
        setField(term5444, term5444.getClass(), "first", term5445);
        setField(term5444, term5444.getClass(), "last", null);
        setField(term5444, term5444.getClass(), "propListHead", null);
        setIntField(term5444, term5444.getClass(), "sourcePosition", 0);
        setField(term5444, term5444.getClass(), "jsType", null);
        setField(term5444, term5444.getClass(), "parent", null);
        setField(term5443, term5443.getClass(), "parameters", term5444);
        setField(term5443, term5443.getClass(), "returnType", null);
        setBooleanField(term5443, term5443.getClass(), "returnTypeInferred", false);
        setBooleanField(term5443, term5443.getClass(), "resolved", false);
        setField(term5443, term5443.getClass(), "resolveResult", null);
        setBooleanField(term5443, term5443.getClass(), "inTemplatedCheckVisit", false);
        setField(term5443, term5443.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.ArrowType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ArrowType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term4898;
        args[1] = false;
        Object retValue = callMethod(klass, "hasEqualParameters", argTypes, term4664, args);
        assertTrue(recursiveEquals(term4664, term5440));
        assertTrue(recursiveEquals(term4898, term5443));
        assertTrue(recursiveEquals(retValue, false));
    }

};


