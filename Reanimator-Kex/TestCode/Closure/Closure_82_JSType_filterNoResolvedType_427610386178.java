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

public class JSType_filterNoResolvedType_427610386178 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23075;
     Object term23250;
     Object term23241;

    public JSType_filterNoResolvedType_427610386178() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23075 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        term23250 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term23250, term23250.getClass(), "properties", null);
        setBooleanField(term23250, term23250.getClass(), "isFrozen", false);
        setField(term23250, term23250.getClass(), "className", null);
        setField(term23250, term23250.getClass(), "properties", null);
        setBooleanField(term23250, term23250.getClass(), "nativeType", false);
        setField(term23250, term23250.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term23250, term23250.getClass(), "prettyPrint", false);
        setBooleanField(term23250, term23250.getClass(), "visited", false);
        setField(term23250, term23250.getClass(), "docInfo", null);
        setBooleanField(term23250, term23250.getClass(), "unknown", false);
        setBooleanField(term23250, term23250.getClass(), "resolved", false);
        setField(term23250, term23250.getClass(), "resolveResult", null);
        setField(term23250, term23250.getClass(), "registry", null);
        term23241 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term23241, term23241.getClass(), "properties", null);
        setBooleanField(term23241, term23241.getClass(), "isFrozen", false);
        setField(term23241, term23241.getClass(), "className", null);
        setField(term23241, term23241.getClass(), "properties", null);
        setBooleanField(term23241, term23241.getClass(), "nativeType", false);
        setField(term23241, term23241.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term23241, term23241.getClass(), "prettyPrint", false);
        setBooleanField(term23241, term23241.getClass(), "visited", false);
        setField(term23241, term23241.getClass(), "docInfo", null);
        setBooleanField(term23241, term23241.getClass(), "unknown", false);
        setBooleanField(term23241, term23241.getClass(), "resolved", false);
        setField(term23241, term23241.getClass(), "resolveResult", null);
        setField(term23241, term23241.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term23075;
        Object retValue = callMethod(klass, "filterNoResolvedType", argTypes, null, args);
        assertTrue(recursiveEquals(term23075, term23250));
        assertTrue(recursiveEquals(retValue, term23241));
    }

};


