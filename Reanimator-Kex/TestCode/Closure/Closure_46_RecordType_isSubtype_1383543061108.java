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

public class RecordType_isSubtype_1383543061108 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28139;
     Object term28275;
     Object term28276;

    public RecordType_isSubtype_1383543061108() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28139 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setBooleanField(term28139, term28139.getClass(), "unknown", false);
        term28275 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term28275, term28275.getClass(), "properties", null);
        setBooleanField(term28275, term28275.getClass(), "isFrozen", false);
        setField(term28275, term28275.getClass(), "className", null);
        setField(term28275, term28275.getClass(), "properties", null);
        setBooleanField(term28275, term28275.getClass(), "nativeType", false);
        setField(term28275, term28275.getClass(), "implicitPrototypeFallback", null);
        setField(term28275, term28275.getClass(), "ownerFunction", null);
        setBooleanField(term28275, term28275.getClass(), "prettyPrint", false);
        setBooleanField(term28275, term28275.getClass(), "visited", false);
        setField(term28275, term28275.getClass(), "docInfo", null);
        setBooleanField(term28275, term28275.getClass(), "unknown", false);
        setBooleanField(term28275, term28275.getClass(), "resolved", false);
        setField(term28275, term28275.getClass(), "resolveResult", null);
        setField(term28275, term28275.getClass(), "registry", null);
        term28276 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term28276, term28276.getClass(), "properties", null);
        setBooleanField(term28276, term28276.getClass(), "isFrozen", false);
        setField(term28276, term28276.getClass(), "className", null);
        setField(term28276, term28276.getClass(), "properties", null);
        setBooleanField(term28276, term28276.getClass(), "nativeType", false);
        setField(term28276, term28276.getClass(), "implicitPrototypeFallback", null);
        setField(term28276, term28276.getClass(), "ownerFunction", null);
        setBooleanField(term28276, term28276.getClass(), "prettyPrint", false);
        setBooleanField(term28276, term28276.getClass(), "visited", false);
        setField(term28276, term28276.getClass(), "docInfo", null);
        setBooleanField(term28276, term28276.getClass(), "unknown", false);
        setBooleanField(term28276, term28276.getClass(), "resolved", false);
        setField(term28276, term28276.getClass(), "resolveResult", null);
        setField(term28276, term28276.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term28139;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term28139, args);
        assertTrue(recursiveEquals(term28139, term28275));
        assertTrue(recursiveEquals(term28139, term28276));
        assertTrue(recursiveEquals(retValue, true));
    }

};


