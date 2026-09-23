package com.google.javascript.jscomp;

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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.lang.Object;
import java.util.HashSet;

public class DisambiguateProperties_addInvalidatingType_1040538549143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49836;
     Object term50112;
     Object term50161;
     Object term50162;

    public DisambiguateProperties_addInvalidatingType_1040538549143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashSet term50018 = new HashSet();
        term49836 = newInstance(Class.forName("com.google.javascript.jscomp.DisambiguateProperties"));
        Object term49970 = newInstance(Class.forName("com.google.javascript.jscomp.DisambiguateProperties$JSTypeSystem"));
        setField(term49970, term49970.getClass(), "invalidatingTypes", term50018);
        setField(term49836, term49836.getClass(), "typeSystem", term49970);
        term50112 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        term50161 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term50161, term50161.getClass(), "parameters", null);
        setField(term50161, term50161.getClass(), "returnType", null);
        setBooleanField(term50161, term50161.getClass(), "returnTypeInferred", false);
        setBooleanField(term50161, term50161.getClass(), "resolved", false);
        setField(term50161, term50161.getClass(), "resolveResult", null);
        setField(term50161, term50161.getClass(), "templateTypeMap", null);
        setBooleanField(term50161, term50161.getClass(), "inTemplatedCheckVisit", false);
        setField(term50161, term50161.getClass(), "registry", null);
        term50162 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term50162, term50162.getClass(), "parameters", null);
        setField(term50162, term50162.getClass(), "returnType", null);
        setBooleanField(term50162, term50162.getClass(), "returnTypeInferred", false);
        setBooleanField(term50162, term50162.getClass(), "resolved", false);
        setField(term50162, term50162.getClass(), "resolveResult", null);
        setField(term50162, term50162.getClass(), "templateTypeMap", null);
        setBooleanField(term50162, term50162.getClass(), "inTemplatedCheckVisit", false);
        setField(term50162, term50162.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.DisambiguateProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.JSError");
        Object[] args = new Object[2];
        args[0] = term50112;
        args[1] = null;
        callMethod(klass, "addInvalidatingType", argTypes, term49836, args);
        assertTrue(recursiveEquals(term49836, term50161));
        assertTrue(recursiveEquals(term50112, term50162));
    }

};


