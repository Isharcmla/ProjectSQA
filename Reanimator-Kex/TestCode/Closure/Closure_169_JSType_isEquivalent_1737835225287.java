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

public class JSType_isEquivalent_1737835225287 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38399;
     Object term38543;
     Object term38659;
     Object term38662;

    public JSType_isEquivalent_1737835225287() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38399 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        setBooleanField(term38399, term38399.getClass(), "unknown", false);
        setField(term38399, term38399.getClass(), "name", "");
        term38543 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        setBooleanField(term38543, term38543.getClass(), "unknown", false);
        setField(term38543, term38543.getClass(), "name", "");
        term38659 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(term38659, term38659.getClass(), "primitiveType", null);
        setField(term38659, term38659.getClass(), "primitiveObjectType", null);
        setField(term38659, term38659.getClass(), "name", "");
        setBooleanField(term38659, term38659.getClass(), "visited", false);
        setField(term38659, term38659.getClass(), "docInfo", null);
        setBooleanField(term38659, term38659.getClass(), "unknown", false);
        setBooleanField(term38659, term38659.getClass(), "resolved", false);
        setField(term38659, term38659.getClass(), "resolveResult", null);
        setBooleanField(term38659, term38659.getClass(), "inTemplatedCheckVisit", false);
        setField(term38659, term38659.getClass(), "registry", null);
        term38662 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(term38662, term38662.getClass(), "primitiveType", null);
        setField(term38662, term38662.getClass(), "primitiveObjectType", null);
        setField(term38662, term38662.getClass(), "name", "");
        setBooleanField(term38662, term38662.getClass(), "visited", false);
        setField(term38662, term38662.getClass(), "docInfo", null);
        setBooleanField(term38662, term38662.getClass(), "unknown", false);
        setBooleanField(term38662, term38662.getClass(), "resolved", false);
        setField(term38662, term38662.getClass(), "resolveResult", null);
        setBooleanField(term38662, term38662.getClass(), "inTemplatedCheckVisit", false);
        setField(term38662, term38662.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term38399;
        args[1] = term38543;
        Object retValue = callMethod(klass, "isEquivalent", argTypes, null, args);
        assertTrue(recursiveEquals(term38399, term38659));
        assertTrue(recursiveEquals(term38543, term38662));
        assertTrue(recursiveEquals(retValue, true));
    }

};


