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

public class JSType_isSubtype_437021077463 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term122541;
     Object term122635;
     Object term122777;
     Object term122779;

    public JSType_isSubtype_437021077463() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term122541 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        term122635 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term122727 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        setField(term122635, term122635.getClass(), "referencedType", term122727);
        term122777 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term122778 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        setField(term122777, term122777.getClass(), "reference", null);
        setField(term122777, term122777.getClass(), "sourceName", null);
        setIntField(term122777, term122777.getClass(), "lineno", 0);
        setIntField(term122777, term122777.getClass(), "charno", 0);
        setBooleanField(term122777, term122777.getClass(), "forgiving", false);
        setField(term122778, term122778.getClass(), "elementsType", null);
        setField(term122778, term122778.getClass(), "elements", null);
        setField(term122778, term122778.getClass(), "className", null);
        setField(term122778, term122778.getClass(), "properties", null);
        setField(term122778, term122778.getClass(), "implicitPrototype", null);
        setBooleanField(term122778, term122778.getClass(), "nativeType", false);
        setBooleanField(term122778, term122778.getClass(), "prettyPrint", false);
        setBooleanField(term122778, term122778.getClass(), "visited", false);
        setField(term122778, term122778.getClass(), "docInfo", null);
        setBooleanField(term122778, term122778.getClass(), "unknown", false);
        setBooleanField(term122778, term122778.getClass(), "resolved", false);
        setField(term122778, term122778.getClass(), "resolveResult", null);
        setField(term122778, term122778.getClass(), "registry", null);
        setField(term122777, term122777.getClass(), "referencedType", term122778);
        setBooleanField(term122777, term122777.getClass(), "visited", false);
        setField(term122777, term122777.getClass(), "docInfo", null);
        setBooleanField(term122777, term122777.getClass(), "unknown", false);
        setBooleanField(term122777, term122777.getClass(), "resolved", false);
        setField(term122777, term122777.getClass(), "resolveResult", null);
        setField(term122777, term122777.getClass(), "registry", null);
        term122779 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        setBooleanField(term122779, term122779.getClass(), "resolved", false);
        setField(term122779, term122779.getClass(), "resolveResult", null);
        setField(term122779, term122779.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term122541;
        args[1] = term122635;
        Object retValue = callMethod(klass, "isSubtype", argTypes, null, args);
        assertTrue(recursiveEquals(term122541, term122777));
        assertTrue(recursiveEquals(term122635, term122779));
        assertTrue(recursiveEquals(retValue, false));
    }

};


