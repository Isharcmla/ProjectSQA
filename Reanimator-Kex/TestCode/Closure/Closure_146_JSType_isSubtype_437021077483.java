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

public class JSType_isSubtype_437021077483 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term128478;
     Object term128572;
     Object term128714;
     Object term128716;

    public JSType_isSubtype_437021077483() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term128478 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        term128572 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term128664 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        setField(term128572, term128572.getClass(), "referencedType", term128664);
        term128714 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term128715 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        setField(term128714, term128714.getClass(), "reference", null);
        setField(term128714, term128714.getClass(), "sourceName", null);
        setIntField(term128714, term128714.getClass(), "lineno", 0);
        setIntField(term128714, term128714.getClass(), "charno", 0);
        setBooleanField(term128714, term128714.getClass(), "forgiving", false);
        setField(term128715, term128715.getClass(), "elementsType", null);
        setField(term128715, term128715.getClass(), "elements", null);
        setField(term128715, term128715.getClass(), "className", null);
        setField(term128715, term128715.getClass(), "properties", null);
        setField(term128715, term128715.getClass(), "implicitPrototype", null);
        setBooleanField(term128715, term128715.getClass(), "nativeType", false);
        setBooleanField(term128715, term128715.getClass(), "prettyPrint", false);
        setBooleanField(term128715, term128715.getClass(), "visited", false);
        setField(term128715, term128715.getClass(), "docInfo", null);
        setBooleanField(term128715, term128715.getClass(), "unknown", false);
        setBooleanField(term128715, term128715.getClass(), "resolved", false);
        setField(term128715, term128715.getClass(), "resolveResult", null);
        setField(term128715, term128715.getClass(), "registry", null);
        setField(term128714, term128714.getClass(), "referencedType", term128715);
        setBooleanField(term128714, term128714.getClass(), "visited", false);
        setField(term128714, term128714.getClass(), "docInfo", null);
        setBooleanField(term128714, term128714.getClass(), "unknown", false);
        setBooleanField(term128714, term128714.getClass(), "resolved", false);
        setField(term128714, term128714.getClass(), "resolveResult", null);
        setField(term128714, term128714.getClass(), "registry", null);
        term128716 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        setBooleanField(term128716, term128716.getClass(), "resolved", false);
        setField(term128716, term128716.getClass(), "resolveResult", null);
        setField(term128716, term128716.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term128478;
        args[1] = term128572;
        Object retValue = callMethod(klass, "isSubtype", argTypes, null, args);
        assertTrue(recursiveEquals(term128478, term128714));
        assertTrue(recursiveEquals(term128572, term128716));
        assertTrue(recursiveEquals(retValue, false));
    }

};


