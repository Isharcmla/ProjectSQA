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
import java.util.ArrayList;

public class UnionType_isSubtype_1058891493187 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37943;
     Object term37985;
     Object term37988;

    public UnionType_isSubtype_1058891493187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term37969 = new ArrayList();
        term37943 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        setField(term37943, term37943.getClass(), "alternates", term37969);
        ArrayList term37986 = new ArrayList();
        term37985 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        setField(term37985, term37985.getClass(), "alternates", term37986);
        setIntField(term37985, term37985.getClass(), "hashcode", 0);
        setBooleanField(term37985, term37985.getClass(), "resolved", false);
        setField(term37985, term37985.getClass(), "resolveResult", null);
        setBooleanField(term37985, term37985.getClass(), "inTemplatedCheckVisit", false);
        setField(term37985, term37985.getClass(), "registry", null);
        ArrayList term37989 = new ArrayList();
        term37988 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        setField(term37988, term37988.getClass(), "alternates", term37989);
        setIntField(term37988, term37988.getClass(), "hashcode", 0);
        setBooleanField(term37988, term37988.getClass(), "resolved", false);
        setField(term37988, term37988.getClass(), "resolveResult", null);
        setBooleanField(term37988, term37988.getClass(), "inTemplatedCheckVisit", false);
        setField(term37988, term37988.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term37943;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term37943, args);
        assertTrue(recursiveEquals(term37943, term37985));
        assertTrue(recursiveEquals(term37943, term37988));
        assertTrue(recursiveEquals(retValue, true));
    }

};


