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

public class JSType_getGreatestSubtype_1951394506336 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68581;
     Object term68535;
     Object term71720;
     Object term71721;
     Object term71704;

    public JSType_getGreatestSubtype_1951394506336() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term68581 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        term68535 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        setField(term68535, term68535.getClass(), "referencedType", term68581);
        term71720 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        setField(term71720, term71720.getClass(), "elementsType", null);
        setField(term71720, term71720.getClass(), "elements", null);
        setField(term71720, term71720.getClass(), "className", null);
        setField(term71720, term71720.getClass(), "properties", null);
        setBooleanField(term71720, term71720.getClass(), "nativeType", false);
        setField(term71720, term71720.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term71720, term71720.getClass(), "prettyPrint", false);
        setBooleanField(term71720, term71720.getClass(), "visited", false);
        setField(term71720, term71720.getClass(), "docInfo", null);
        setBooleanField(term71720, term71720.getClass(), "unknown", false);
        setBooleanField(term71720, term71720.getClass(), "resolved", false);
        setField(term71720, term71720.getClass(), "resolveResult", null);
        setField(term71720, term71720.getClass(), "registry", null);
        term71721 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term71722 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        setField(term71721, term71721.getClass(), "indexType", null);
        setField(term71722, term71722.getClass(), "elementsType", null);
        setField(term71722, term71722.getClass(), "elements", null);
        setField(term71722, term71722.getClass(), "className", null);
        setField(term71722, term71722.getClass(), "properties", null);
        setBooleanField(term71722, term71722.getClass(), "nativeType", false);
        setField(term71722, term71722.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term71722, term71722.getClass(), "prettyPrint", false);
        setBooleanField(term71722, term71722.getClass(), "visited", false);
        setField(term71722, term71722.getClass(), "docInfo", null);
        setBooleanField(term71722, term71722.getClass(), "unknown", false);
        setBooleanField(term71722, term71722.getClass(), "resolved", false);
        setField(term71722, term71722.getClass(), "resolveResult", null);
        setField(term71722, term71722.getClass(), "registry", null);
        setField(term71721, term71721.getClass(), "referencedType", term71722);
        setField(term71721, term71721.getClass(), "referencedObjType", null);
        setBooleanField(term71721, term71721.getClass(), "visited", false);
        setField(term71721, term71721.getClass(), "docInfo", null);
        setBooleanField(term71721, term71721.getClass(), "unknown", false);
        setBooleanField(term71721, term71721.getClass(), "resolved", false);
        setField(term71721, term71721.getClass(), "resolveResult", null);
        setField(term71721, term71721.getClass(), "registry", null);
        term71704 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        setField(term71704, term71704.getClass(), "elementsType", null);
        setField(term71704, term71704.getClass(), "elements", null);
        setField(term71704, term71704.getClass(), "className", null);
        setField(term71704, term71704.getClass(), "properties", null);
        setBooleanField(term71704, term71704.getClass(), "nativeType", false);
        setField(term71704, term71704.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term71704, term71704.getClass(), "prettyPrint", false);
        setBooleanField(term71704, term71704.getClass(), "visited", false);
        setField(term71704, term71704.getClass(), "docInfo", null);
        setBooleanField(term71704, term71704.getClass(), "unknown", false);
        setBooleanField(term71704, term71704.getClass(), "resolved", false);
        setField(term71704, term71704.getClass(), "resolveResult", null);
        setField(term71704, term71704.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term68581;
        args[1] = term68535;
        Object retValue = callMethod(klass, "getGreatestSubtype", argTypes, null, args);
        assertTrue(recursiveEquals(term68581, term71720));
        assertTrue(recursiveEquals(term68535, term71721));
        assertTrue(recursiveEquals(retValue, term71704));
    }

};


