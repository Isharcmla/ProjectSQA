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

public class JSType_isSubtype_437021077301 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57402;
     Object term57508;
     Object term57913;
     Object term57915;

    public JSType_isSubtype_437021077301() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57402 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        term57508 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        Object term57604 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setBooleanField(term57604, term57604.getClass(), "unknown", false);
        setField(term57508, term57508.getClass(), "referencedType", term57604);
        term57913 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        Object term57914 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term57914, term57914.getClass(), "properties", null);
        setBooleanField(term57914, term57914.getClass(), "isFrozen", false);
        setField(term57914, term57914.getClass(), "className", null);
        setField(term57914, term57914.getClass(), "implicitPrototype", null);
        setBooleanField(term57914, term57914.getClass(), "nativeType", false);
        setBooleanField(term57914, term57914.getClass(), "prettyPrint", false);
        setBooleanField(term57914, term57914.getClass(), "visited", false);
        setField(term57914, term57914.getClass(), "docInfo", null);
        setBooleanField(term57914, term57914.getClass(), "unknown", false);
        setBooleanField(term57914, term57914.getClass(), "resolved", false);
        setField(term57914, term57914.getClass(), "resolveResult", null);
        setField(term57914, term57914.getClass(), "registry", null);
        setField(term57913, term57913.getClass(), "referencedType", term57914);
        setBooleanField(term57913, term57913.getClass(), "visited", false);
        setField(term57913, term57913.getClass(), "docInfo", null);
        setBooleanField(term57913, term57913.getClass(), "unknown", false);
        setBooleanField(term57913, term57913.getClass(), "resolved", false);
        setField(term57913, term57913.getClass(), "resolveResult", null);
        setField(term57913, term57913.getClass(), "registry", null);
        term57915 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        setField(term57915, term57915.getClass(), "elementsType", null);
        setField(term57915, term57915.getClass(), "elements", null);
        setField(term57915, term57915.getClass(), "className", null);
        setField(term57915, term57915.getClass(), "properties", null);
        setField(term57915, term57915.getClass(), "implicitPrototype", null);
        setBooleanField(term57915, term57915.getClass(), "nativeType", false);
        setBooleanField(term57915, term57915.getClass(), "prettyPrint", false);
        setBooleanField(term57915, term57915.getClass(), "visited", false);
        setField(term57915, term57915.getClass(), "docInfo", null);
        setBooleanField(term57915, term57915.getClass(), "unknown", false);
        setBooleanField(term57915, term57915.getClass(), "resolved", false);
        setField(term57915, term57915.getClass(), "resolveResult", null);
        setField(term57915, term57915.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term57402;
        args[1] = term57508;
        Object retValue = callMethod(klass, "isSubtype", argTypes, null, args);
        assertTrue(recursiveEquals(term57402, term57913));
        assertTrue(recursiveEquals(term57508, term57915));
        assertTrue(recursiveEquals(retValue, false));
    }

};


