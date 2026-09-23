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

public class JSType_isSubtype_437021077507 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term139649;
     Object term139955;
     Object term140010;
     Object term140011;

    public JSType_isSubtype_437021077507() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term139649 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        Object term139759 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        Object term139855 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term139759, term139759.getClass(), "referencedType", term139855);
        setField(term139649, term139649.getClass(), "referencedType", term139759);
        term139955 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setBooleanField(term139955, term139955.getClass(), "unknown", false);
        term140010 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term140010, term140010.getClass(), "call", null);
        setField(term140010, term140010.getClass(), "prototype", null);
        setField(term140010, term140010.getClass(), "kind", null);
        setField(term140010, term140010.getClass(), "typeOfThis", null);
        setField(term140010, term140010.getClass(), "source", null);
        setField(term140010, term140010.getClass(), "implementedInterfaces", null);
        setField(term140010, term140010.getClass(), "subTypes", null);
        setField(term140010, term140010.getClass(), "templateTypeName", null);
        setField(term140010, term140010.getClass(), "className", null);
        setField(term140010, term140010.getClass(), "properties", null);
        setField(term140010, term140010.getClass(), "implicitPrototype", null);
        setBooleanField(term140010, term140010.getClass(), "nativeType", false);
        setBooleanField(term140010, term140010.getClass(), "prettyPrint", false);
        setBooleanField(term140010, term140010.getClass(), "visited", false);
        setField(term140010, term140010.getClass(), "docInfo", null);
        setBooleanField(term140010, term140010.getClass(), "unknown", false);
        setBooleanField(term140010, term140010.getClass(), "resolved", false);
        setField(term140010, term140010.getClass(), "resolveResult", null);
        setField(term140010, term140010.getClass(), "registry", null);
        term140011 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        Object term140012 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        Object term140013 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term140011, term140011.getClass(), "parameterType", null);
        setField(term140012, term140012.getClass(), "parameterType", null);
        setField(term140013, term140013.getClass(), "properties", null);
        setBooleanField(term140013, term140013.getClass(), "isFrozen", false);
        setField(term140013, term140013.getClass(), "className", null);
        setField(term140013, term140013.getClass(), "implicitPrototype", null);
        setBooleanField(term140013, term140013.getClass(), "nativeType", false);
        setBooleanField(term140013, term140013.getClass(), "prettyPrint", false);
        setBooleanField(term140013, term140013.getClass(), "visited", false);
        setField(term140013, term140013.getClass(), "docInfo", null);
        setBooleanField(term140013, term140013.getClass(), "unknown", false);
        setBooleanField(term140013, term140013.getClass(), "resolved", false);
        setField(term140013, term140013.getClass(), "resolveResult", null);
        setField(term140013, term140013.getClass(), "registry", null);
        setField(term140012, term140012.getClass(), "referencedType", term140013);
        setBooleanField(term140012, term140012.getClass(), "visited", false);
        setField(term140012, term140012.getClass(), "docInfo", null);
        setBooleanField(term140012, term140012.getClass(), "unknown", false);
        setBooleanField(term140012, term140012.getClass(), "resolved", false);
        setField(term140012, term140012.getClass(), "resolveResult", null);
        setField(term140012, term140012.getClass(), "registry", null);
        setField(term140011, term140011.getClass(), "referencedType", term140012);
        setBooleanField(term140011, term140011.getClass(), "visited", false);
        setField(term140011, term140011.getClass(), "docInfo", null);
        setBooleanField(term140011, term140011.getClass(), "unknown", false);
        setBooleanField(term140011, term140011.getClass(), "resolved", false);
        setField(term140011, term140011.getClass(), "resolveResult", null);
        setField(term140011, term140011.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term139649;
        args[1] = term139955;
        Object retValue = callMethod(klass, "isSubtype", argTypes, null, args);
        assertTrue(recursiveEquals(term139649, term140010));
        assertTrue(recursiveEquals(term139955, term140011));
        assertTrue(recursiveEquals(retValue, false));
    }

};


