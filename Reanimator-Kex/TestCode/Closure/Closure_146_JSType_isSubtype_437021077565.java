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

public class JSType_isSubtype_437021077565 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term157244;
     Object term157338;
     Object term157480;
     Object term157482;

    public JSType_isSubtype_437021077565() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term157244 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        term157338 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term157430 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        setField(term157338, term157338.getClass(), "referencedType", term157430);
        term157480 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term157481 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        setField(term157480, term157480.getClass(), "reference", null);
        setField(term157480, term157480.getClass(), "sourceName", null);
        setIntField(term157480, term157480.getClass(), "lineno", 0);
        setIntField(term157480, term157480.getClass(), "charno", 0);
        setBooleanField(term157480, term157480.getClass(), "forgiving", false);
        setField(term157481, term157481.getClass(), "elementsType", null);
        setField(term157481, term157481.getClass(), "elements", null);
        setField(term157481, term157481.getClass(), "className", null);
        setField(term157481, term157481.getClass(), "properties", null);
        setField(term157481, term157481.getClass(), "implicitPrototype", null);
        setBooleanField(term157481, term157481.getClass(), "nativeType", false);
        setBooleanField(term157481, term157481.getClass(), "prettyPrint", false);
        setBooleanField(term157481, term157481.getClass(), "visited", false);
        setField(term157481, term157481.getClass(), "docInfo", null);
        setBooleanField(term157481, term157481.getClass(), "unknown", false);
        setBooleanField(term157481, term157481.getClass(), "resolved", false);
        setField(term157481, term157481.getClass(), "resolveResult", null);
        setField(term157481, term157481.getClass(), "registry", null);
        setField(term157480, term157480.getClass(), "referencedType", term157481);
        setBooleanField(term157480, term157480.getClass(), "visited", false);
        setField(term157480, term157480.getClass(), "docInfo", null);
        setBooleanField(term157480, term157480.getClass(), "unknown", false);
        setBooleanField(term157480, term157480.getClass(), "resolved", false);
        setField(term157480, term157480.getClass(), "resolveResult", null);
        setField(term157480, term157480.getClass(), "registry", null);
        term157482 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        setBooleanField(term157482, term157482.getClass(), "resolved", false);
        setField(term157482, term157482.getClass(), "resolveResult", null);
        setField(term157482, term157482.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term157244;
        args[1] = term157338;
        Object retValue = callMethod(klass, "isSubtype", argTypes, null, args);
        assertTrue(recursiveEquals(term157244, term157480));
        assertTrue(recursiveEquals(term157338, term157482));
        assertTrue(recursiveEquals(retValue, false));
    }

};


