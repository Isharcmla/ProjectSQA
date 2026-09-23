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

public class JSType_safeResolve_2136838325220 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27093;
     Object term27616;
     Object term27604;

    public JSType_safeResolve_2136838325220() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27093 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        term27616 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term27616, term27616.getClass(), "parameters", null);
        setField(term27616, term27616.getClass(), "returnType", null);
        setBooleanField(term27616, term27616.getClass(), "returnTypeInferred", false);
        setBooleanField(term27616, term27616.getClass(), "resolved", true);
        setField(term27616, term27616.getClass(), "resolveResult", term27616);
        setBooleanField(term27616, term27616.getClass(), "inTemplatedCheckVisit", false);
        setField(term27616, term27616.getClass(), "registry", null);
        term27604 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term27604, term27604.getClass(), "parameters", null);
        setField(term27604, term27604.getClass(), "returnType", null);
        setBooleanField(term27604, term27604.getClass(), "returnTypeInferred", false);
        setBooleanField(term27604, term27604.getClass(), "resolved", true);
        setField(term27604, term27604.getClass(), "resolveResult", term27604);
        setBooleanField(term27604, term27604.getClass(), "inTemplatedCheckVisit", false);
        setField(term27604, term27604.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.ErrorReporter");
        argTypes[2] = Class.forName("com.google.javascript.rhino.jstype.StaticScope");
        Object[] args = new Object[3];
        args[0] = term27093;
        args[1] = null;
        args[2] = null;
        Object retValue = callMethod(klass, "safeResolve", argTypes, null, args);
        assertTrue(recursiveEquals(term27093, null));
        assertTrue(recursiveEquals(retValue, term27604));
    }

};


