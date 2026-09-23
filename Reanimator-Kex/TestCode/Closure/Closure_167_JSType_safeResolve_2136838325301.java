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

public class JSType_safeResolve_2136838325301 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44937;
     Object term44958;
     Object term44940;

    public JSType_safeResolve_2136838325301() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44937 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnknownType"));
        term44958 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnknownType"));
        setBooleanField(term44958, term44958.getClass(), "isChecked", false);
        setBooleanField(term44958, term44958.getClass(), "visited", false);
        setField(term44958, term44958.getClass(), "docInfo", null);
        setBooleanField(term44958, term44958.getClass(), "unknown", false);
        setBooleanField(term44958, term44958.getClass(), "resolved", true);
        setField(term44958, term44958.getClass(), "resolveResult", term44958);
        setBooleanField(term44958, term44958.getClass(), "inTemplatedCheckVisit", false);
        setField(term44958, term44958.getClass(), "registry", null);
        term44940 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnknownType"));
        setBooleanField(term44940, term44940.getClass(), "isChecked", false);
        setBooleanField(term44940, term44940.getClass(), "visited", false);
        setField(term44940, term44940.getClass(), "docInfo", null);
        setBooleanField(term44940, term44940.getClass(), "unknown", false);
        setBooleanField(term44940, term44940.getClass(), "resolved", true);
        setField(term44940, term44940.getClass(), "resolveResult", term44940);
        setBooleanField(term44940, term44940.getClass(), "inTemplatedCheckVisit", false);
        setField(term44940, term44940.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.ErrorReporter");
        argTypes[2] = Class.forName("com.google.javascript.rhino.jstype.StaticScope");
        Object[] args = new Object[3];
        args[0] = term44937;
        args[1] = null;
        args[2] = null;
        Object retValue = callMethod(klass, "safeResolve", argTypes, null, args);
        assertTrue(recursiveEquals(term44937, term44958));
        assertTrue(recursiveEquals(retValue, term44940));
    }

};


