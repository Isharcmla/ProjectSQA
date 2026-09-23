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

public class JSType_isSubtype_437021077420 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104046;
     Object term104140;
     Object term104585;
     Object term104587;

    public JSType_isSubtype_437021077420() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term104046 = newInstance(Class.forName("com.google.javascript.rhino.jstype.VoidType"));
        term104140 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term104248 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setBooleanField(term104248, term104248.getClass(), "unknown", false);
        setField(term104140, term104140.getClass(), "referencedType", term104248);
        term104585 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term104586 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term104585, term104585.getClass(), "reference", null);
        setField(term104585, term104585.getClass(), "sourceName", null);
        setIntField(term104585, term104585.getClass(), "lineno", 0);
        setIntField(term104585, term104585.getClass(), "charno", 0);
        setBooleanField(term104585, term104585.getClass(), "forgiving", false);
        setField(term104586, term104586.getClass(), "this$0", null);
        setField(term104586, term104586.getClass(), "call", null);
        setField(term104586, term104586.getClass(), "prototype", null);
        setField(term104586, term104586.getClass(), "kind", null);
        setField(term104586, term104586.getClass(), "typeOfThis", null);
        setField(term104586, term104586.getClass(), "source", null);
        setField(term104586, term104586.getClass(), "implementedInterfaces", null);
        setField(term104586, term104586.getClass(), "subTypes", null);
        setField(term104586, term104586.getClass(), "templateTypeName", null);
        setField(term104586, term104586.getClass(), "className", null);
        setField(term104586, term104586.getClass(), "properties", null);
        setField(term104586, term104586.getClass(), "implicitPrototype", null);
        setBooleanField(term104586, term104586.getClass(), "nativeType", false);
        setBooleanField(term104586, term104586.getClass(), "prettyPrint", false);
        setBooleanField(term104586, term104586.getClass(), "visited", false);
        setField(term104586, term104586.getClass(), "docInfo", null);
        setBooleanField(term104586, term104586.getClass(), "unknown", false);
        setBooleanField(term104586, term104586.getClass(), "resolved", false);
        setField(term104586, term104586.getClass(), "resolveResult", null);
        setField(term104586, term104586.getClass(), "registry", null);
        setField(term104585, term104585.getClass(), "referencedType", term104586);
        setBooleanField(term104585, term104585.getClass(), "visited", false);
        setField(term104585, term104585.getClass(), "docInfo", null);
        setBooleanField(term104585, term104585.getClass(), "unknown", false);
        setBooleanField(term104585, term104585.getClass(), "resolved", false);
        setField(term104585, term104585.getClass(), "resolveResult", null);
        setField(term104585, term104585.getClass(), "registry", null);
        term104587 = newInstance(Class.forName("com.google.javascript.rhino.jstype.VoidType"));
        setBooleanField(term104587, term104587.getClass(), "resolved", false);
        setField(term104587, term104587.getClass(), "resolveResult", null);
        setField(term104587, term104587.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term104046;
        args[1] = term104140;
        Object retValue = callMethod(klass, "isSubtype", argTypes, null, args);
        assertTrue(recursiveEquals(term104046, term104585));
        assertTrue(recursiveEquals(term104140, term104587));
        assertTrue(recursiveEquals(retValue, false));
    }

};


