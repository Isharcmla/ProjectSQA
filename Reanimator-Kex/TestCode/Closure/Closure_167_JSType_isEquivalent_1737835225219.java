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

public class JSType_isEquivalent_1737835225219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27337;
     Object term27620;

    public JSType_isEquivalent_1737835225219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27337 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        term27620 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term27620, term27620.getClass(), "properties", null);
        setBooleanField(term27620, term27620.getClass(), "declared", false);
        setBooleanField(term27620, term27620.getClass(), "isFrozen", false);
        setField(term27620, term27620.getClass(), "className", null);
        setField(term27620, term27620.getClass(), "properties", null);
        setBooleanField(term27620, term27620.getClass(), "nativeType", false);
        setField(term27620, term27620.getClass(), "implicitPrototypeFallback", null);
        setField(term27620, term27620.getClass(), "ownerFunction", null);
        setBooleanField(term27620, term27620.getClass(), "prettyPrint", false);
        setBooleanField(term27620, term27620.getClass(), "visited", false);
        setField(term27620, term27620.getClass(), "docInfo", null);
        setBooleanField(term27620, term27620.getClass(), "unknown", false);
        setBooleanField(term27620, term27620.getClass(), "resolved", false);
        setField(term27620, term27620.getClass(), "resolveResult", null);
        setBooleanField(term27620, term27620.getClass(), "inTemplatedCheckVisit", false);
        setField(term27620, term27620.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term27337;
        args[1] = null;
        Object retValue = callMethod(klass, "isEquivalent", argTypes, null, args);
        assertTrue(recursiveEquals(term27337, term27620));
        assertTrue(recursiveEquals(retValue, false));
    }

};


