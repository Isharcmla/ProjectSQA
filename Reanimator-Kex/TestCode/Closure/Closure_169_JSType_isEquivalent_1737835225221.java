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

public class JSType_isEquivalent_1737835225221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27191;
     Object term27628;

    public JSType_isEquivalent_1737835225221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27191 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        term27628 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        setField(term27628, term27628.getClass(), "source", null);
        setField(term27628, term27628.getClass(), "elementsType", null);
        setField(term27628, term27628.getClass(), "elements", null);
        setField(term27628, term27628.getClass(), "className", null);
        setField(term27628, term27628.getClass(), "properties", null);
        setBooleanField(term27628, term27628.getClass(), "nativeType", false);
        setField(term27628, term27628.getClass(), "implicitPrototypeFallback", null);
        setField(term27628, term27628.getClass(), "ownerFunction", null);
        setBooleanField(term27628, term27628.getClass(), "prettyPrint", false);
        setBooleanField(term27628, term27628.getClass(), "visited", false);
        setField(term27628, term27628.getClass(), "docInfo", null);
        setBooleanField(term27628, term27628.getClass(), "unknown", false);
        setBooleanField(term27628, term27628.getClass(), "resolved", false);
        setField(term27628, term27628.getClass(), "resolveResult", null);
        setBooleanField(term27628, term27628.getClass(), "inTemplatedCheckVisit", false);
        setField(term27628, term27628.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term27191;
        args[1] = null;
        Object retValue = callMethod(klass, "isEquivalent", argTypes, null, args);
        assertTrue(recursiveEquals(term27191, term27628));
        assertTrue(recursiveEquals(retValue, false));
    }

};


