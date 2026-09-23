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

public class JSType_isSubtype_437021077535 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term147426;
     Object term147520;
     Object term147688;
     Object term147690;

    public JSType_isSubtype_437021077535() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term147426 = newInstance(Class.forName("com.google.javascript.rhino.jstype.BooleanType"));
        term147520 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term147630 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setBooleanField(term147630, term147630.getClass(), "unknown", false);
        setField(term147520, term147520.getClass(), "referencedType", term147630);
        term147688 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term147689 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term147688, term147688.getClass(), "reference", null);
        setField(term147688, term147688.getClass(), "sourceName", null);
        setIntField(term147688, term147688.getClass(), "lineno", 0);
        setIntField(term147688, term147688.getClass(), "charno", 0);
        setBooleanField(term147688, term147688.getClass(), "forgiving", false);
        setField(term147689, term147689.getClass(), "call", null);
        setField(term147689, term147689.getClass(), "prototype", null);
        setField(term147689, term147689.getClass(), "kind", null);
        setField(term147689, term147689.getClass(), "typeOfThis", null);
        setField(term147689, term147689.getClass(), "source", null);
        setField(term147689, term147689.getClass(), "implementedInterfaces", null);
        setField(term147689, term147689.getClass(), "subTypes", null);
        setField(term147689, term147689.getClass(), "templateTypeName", null);
        setField(term147689, term147689.getClass(), "className", null);
        setField(term147689, term147689.getClass(), "properties", null);
        setField(term147689, term147689.getClass(), "implicitPrototype", null);
        setBooleanField(term147689, term147689.getClass(), "nativeType", false);
        setBooleanField(term147689, term147689.getClass(), "prettyPrint", false);
        setBooleanField(term147689, term147689.getClass(), "visited", false);
        setField(term147689, term147689.getClass(), "docInfo", null);
        setBooleanField(term147689, term147689.getClass(), "unknown", false);
        setBooleanField(term147689, term147689.getClass(), "resolved", false);
        setField(term147689, term147689.getClass(), "resolveResult", null);
        setField(term147689, term147689.getClass(), "registry", null);
        setField(term147688, term147688.getClass(), "referencedType", term147689);
        setBooleanField(term147688, term147688.getClass(), "visited", false);
        setField(term147688, term147688.getClass(), "docInfo", null);
        setBooleanField(term147688, term147688.getClass(), "unknown", false);
        setBooleanField(term147688, term147688.getClass(), "resolved", false);
        setField(term147688, term147688.getClass(), "resolveResult", null);
        setField(term147688, term147688.getClass(), "registry", null);
        term147690 = newInstance(Class.forName("com.google.javascript.rhino.jstype.BooleanType"));
        setBooleanField(term147690, term147690.getClass(), "resolved", false);
        setField(term147690, term147690.getClass(), "resolveResult", null);
        setField(term147690, term147690.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term147426;
        args[1] = term147520;
        Object retValue = callMethod(klass, "isSubtype", argTypes, null, args);
        assertTrue(recursiveEquals(term147426, term147688));
        assertTrue(recursiveEquals(term147520, term147690));
        assertTrue(recursiveEquals(retValue, false));
    }

};


