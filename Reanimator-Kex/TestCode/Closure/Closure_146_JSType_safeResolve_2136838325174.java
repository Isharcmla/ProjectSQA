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

public class JSType_safeResolve_2136838325174 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22679;
     Object term23422;
     Object term23407;

    public JSType_safeResolve_2136838325174() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22679 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnknownType"));
        term23422 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnknownType"));
        setBooleanField(term23422, term23422.getClass(), "isChecked", false);
        setBooleanField(term23422, term23422.getClass(), "visited", false);
        setField(term23422, term23422.getClass(), "docInfo", null);
        setBooleanField(term23422, term23422.getClass(), "unknown", false);
        setBooleanField(term23422, term23422.getClass(), "resolved", true);
        setField(term23422, term23422.getClass(), "resolveResult", term23422);
        setField(term23422, term23422.getClass(), "registry", null);
        term23407 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnknownType"));
        setBooleanField(term23407, term23407.getClass(), "isChecked", false);
        setBooleanField(term23407, term23407.getClass(), "visited", false);
        setField(term23407, term23407.getClass(), "docInfo", null);
        setBooleanField(term23407, term23407.getClass(), "unknown", false);
        setBooleanField(term23407, term23407.getClass(), "resolved", true);
        setField(term23407, term23407.getClass(), "resolveResult", term23407);
        setField(term23407, term23407.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.ErrorReporter");
        argTypes[2] = Class.forName("com.google.javascript.rhino.jstype.StaticScope");
        Object[] args = new Object[3];
        args[0] = term22679;
        args[1] = null;
        args[2] = null;
        Object retValue = callMethod(klass, "safeResolve", argTypes, null, args);
        assertTrue(recursiveEquals(term22679, term23422));
        assertTrue(recursiveEquals(retValue, term23407));
    }

};


