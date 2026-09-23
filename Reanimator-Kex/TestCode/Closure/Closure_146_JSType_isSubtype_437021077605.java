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

public class JSType_isSubtype_437021077605 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term170715;
     Object term170809;
     Object term170947;
     Object term170949;

    public JSType_isSubtype_437021077605() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term170715 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        term170809 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term170897 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term170809, term170809.getClass(), "referencedType", term170897);
        term170947 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term170948 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term170947, term170947.getClass(), "reference", null);
        setField(term170947, term170947.getClass(), "sourceName", null);
        setIntField(term170947, term170947.getClass(), "lineno", 0);
        setIntField(term170947, term170947.getClass(), "charno", 0);
        setBooleanField(term170947, term170947.getClass(), "forgiving", false);
        setField(term170948, term170948.getClass(), "leastSupertypeVisitor", null);
        setField(term170948, term170948.getClass(), "greatestSubtypeVisitor", null);
        setField(term170948, term170948.getClass(), "call", null);
        setField(term170948, term170948.getClass(), "prototype", null);
        setField(term170948, term170948.getClass(), "kind", null);
        setField(term170948, term170948.getClass(), "typeOfThis", null);
        setField(term170948, term170948.getClass(), "source", null);
        setField(term170948, term170948.getClass(), "implementedInterfaces", null);
        setField(term170948, term170948.getClass(), "subTypes", null);
        setField(term170948, term170948.getClass(), "templateTypeName", null);
        setField(term170948, term170948.getClass(), "className", null);
        setField(term170948, term170948.getClass(), "properties", null);
        setField(term170948, term170948.getClass(), "implicitPrototype", null);
        setBooleanField(term170948, term170948.getClass(), "nativeType", false);
        setBooleanField(term170948, term170948.getClass(), "prettyPrint", false);
        setBooleanField(term170948, term170948.getClass(), "visited", false);
        setField(term170948, term170948.getClass(), "docInfo", null);
        setBooleanField(term170948, term170948.getClass(), "unknown", false);
        setBooleanField(term170948, term170948.getClass(), "resolved", false);
        setField(term170948, term170948.getClass(), "resolveResult", null);
        setField(term170948, term170948.getClass(), "registry", null);
        setField(term170947, term170947.getClass(), "referencedType", term170948);
        setBooleanField(term170947, term170947.getClass(), "visited", false);
        setField(term170947, term170947.getClass(), "docInfo", null);
        setBooleanField(term170947, term170947.getClass(), "unknown", false);
        setBooleanField(term170947, term170947.getClass(), "resolved", false);
        setField(term170947, term170947.getClass(), "resolveResult", null);
        setField(term170947, term170947.getClass(), "registry", null);
        term170949 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        setBooleanField(term170949, term170949.getClass(), "resolved", false);
        setField(term170949, term170949.getClass(), "resolveResult", null);
        setField(term170949, term170949.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term170715;
        args[1] = term170809;
        Object retValue = callMethod(klass, "isSubtype", argTypes, null, args);
        assertTrue(recursiveEquals(term170715, term170947));
        assertTrue(recursiveEquals(term170809, term170949));
        assertTrue(recursiveEquals(retValue, false));
    }

};


