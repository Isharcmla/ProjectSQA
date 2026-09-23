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

public class JSType_safeResolve_2136838325276 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34893;
     Object term35680;
     Object term35675;

    public JSType_safeResolve_2136838325276() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34893 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term34987 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setBooleanField(term34893, term34893.getClass(), "resolved", true);
        setField(term34893, term34893.getClass(), "resolveResult", term34987);
        term35680 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term35681 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term35680, term35680.getClass(), "parameters", null);
        setField(term35680, term35680.getClass(), "returnType", null);
        setBooleanField(term35680, term35680.getClass(), "returnTypeInferred", false);
        setBooleanField(term35680, term35680.getClass(), "resolved", true);
        setField(term35681, term35681.getClass(), "parameters", null);
        setField(term35681, term35681.getClass(), "returnType", null);
        setBooleanField(term35681, term35681.getClass(), "returnTypeInferred", false);
        setBooleanField(term35681, term35681.getClass(), "resolved", false);
        setField(term35681, term35681.getClass(), "resolveResult", null);
        setBooleanField(term35681, term35681.getClass(), "inTemplatedCheckVisit", false);
        setField(term35681, term35681.getClass(), "registry", null);
        setField(term35680, term35680.getClass(), "resolveResult", term35681);
        setBooleanField(term35680, term35680.getClass(), "inTemplatedCheckVisit", false);
        setField(term35680, term35680.getClass(), "registry", null);
        term35675 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term35675, term35675.getClass(), "parameters", null);
        setField(term35675, term35675.getClass(), "returnType", null);
        setBooleanField(term35675, term35675.getClass(), "returnTypeInferred", false);
        setBooleanField(term35675, term35675.getClass(), "resolved", false);
        setField(term35675, term35675.getClass(), "resolveResult", null);
        setBooleanField(term35675, term35675.getClass(), "inTemplatedCheckVisit", false);
        setField(term35675, term35675.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.ErrorReporter");
        argTypes[2] = Class.forName("com.google.javascript.rhino.jstype.StaticScope");
        Object[] args = new Object[3];
        args[0] = term34893;
        args[1] = null;
        args[2] = null;
        Object retValue = callMethod(klass, "safeResolve", argTypes, null, args);
        assertTrue(recursiveEquals(term34893, term35680));
        assertTrue(recursiveEquals(retValue, term35675));
    }

};


