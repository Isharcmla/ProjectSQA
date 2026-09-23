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

public class JSType_isSubtype_437021077322 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65057;
     Object term65151;
     Object term65611;
     Object term65613;

    public JSType_isSubtype_437021077322() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65057 = newInstance(Class.forName("com.google.javascript.rhino.jstype.VoidType"));
        term65151 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term65239 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setBooleanField(term65239, term65239.getClass(), "unknown", false);
        setField(term65151, term65151.getClass(), "referencedType", term65239);
        term65611 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term65612 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term65611, term65611.getClass(), "reference", null);
        setField(term65611, term65611.getClass(), "sourceName", null);
        setIntField(term65611, term65611.getClass(), "lineno", 0);
        setIntField(term65611, term65611.getClass(), "charno", 0);
        setBooleanField(term65611, term65611.getClass(), "forgiving", false);
        setField(term65612, term65612.getClass(), "leastSupertypeVisitor", null);
        setField(term65612, term65612.getClass(), "greatestSubtypeVisitor", null);
        setField(term65612, term65612.getClass(), "call", null);
        setField(term65612, term65612.getClass(), "prototype", null);
        setField(term65612, term65612.getClass(), "kind", null);
        setField(term65612, term65612.getClass(), "typeOfThis", null);
        setField(term65612, term65612.getClass(), "source", null);
        setField(term65612, term65612.getClass(), "implementedInterfaces", null);
        setField(term65612, term65612.getClass(), "subTypes", null);
        setField(term65612, term65612.getClass(), "templateTypeName", null);
        setField(term65612, term65612.getClass(), "className", null);
        setField(term65612, term65612.getClass(), "properties", null);
        setField(term65612, term65612.getClass(), "implicitPrototype", null);
        setBooleanField(term65612, term65612.getClass(), "nativeType", false);
        setBooleanField(term65612, term65612.getClass(), "prettyPrint", false);
        setBooleanField(term65612, term65612.getClass(), "visited", false);
        setField(term65612, term65612.getClass(), "docInfo", null);
        setBooleanField(term65612, term65612.getClass(), "unknown", false);
        setBooleanField(term65612, term65612.getClass(), "resolved", false);
        setField(term65612, term65612.getClass(), "resolveResult", null);
        setField(term65612, term65612.getClass(), "registry", null);
        setField(term65611, term65611.getClass(), "referencedType", term65612);
        setBooleanField(term65611, term65611.getClass(), "visited", false);
        setField(term65611, term65611.getClass(), "docInfo", null);
        setBooleanField(term65611, term65611.getClass(), "unknown", false);
        setBooleanField(term65611, term65611.getClass(), "resolved", false);
        setField(term65611, term65611.getClass(), "resolveResult", null);
        setField(term65611, term65611.getClass(), "registry", null);
        term65613 = newInstance(Class.forName("com.google.javascript.rhino.jstype.VoidType"));
        setBooleanField(term65613, term65613.getClass(), "resolved", false);
        setField(term65613, term65613.getClass(), "resolveResult", null);
        setField(term65613, term65613.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term65057;
        args[1] = term65151;
        Object retValue = callMethod(klass, "isSubtype", argTypes, null, args);
        assertTrue(recursiveEquals(term65057, term65611));
        assertTrue(recursiveEquals(term65151, term65613));
        assertTrue(recursiveEquals(retValue, false));
    }

};


