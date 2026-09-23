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

public class JSType_isEquivalent_1737835225243 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30688;
     Object term30742;
     Object term30743;

    public JSType_isEquivalent_1737835225243() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30688 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        term30742 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        setField(term30742, term30742.getClass(), "indexType", null);
        setField(term30742, term30742.getClass(), "referencedType", null);
        setField(term30742, term30742.getClass(), "referencedObjType", null);
        setBooleanField(term30742, term30742.getClass(), "visited", false);
        setField(term30742, term30742.getClass(), "docInfo", null);
        setBooleanField(term30742, term30742.getClass(), "unknown", false);
        setBooleanField(term30742, term30742.getClass(), "resolved", false);
        setField(term30742, term30742.getClass(), "resolveResult", null);
        setBooleanField(term30742, term30742.getClass(), "inTemplatedCheckVisit", false);
        setField(term30742, term30742.getClass(), "registry", null);
        term30743 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        setField(term30743, term30743.getClass(), "indexType", null);
        setField(term30743, term30743.getClass(), "referencedType", null);
        setField(term30743, term30743.getClass(), "referencedObjType", null);
        setBooleanField(term30743, term30743.getClass(), "visited", false);
        setField(term30743, term30743.getClass(), "docInfo", null);
        setBooleanField(term30743, term30743.getClass(), "unknown", false);
        setBooleanField(term30743, term30743.getClass(), "resolved", false);
        setField(term30743, term30743.getClass(), "resolveResult", null);
        setBooleanField(term30743, term30743.getClass(), "inTemplatedCheckVisit", false);
        setField(term30743, term30743.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term30688;
        args[1] = term30688;
        Object retValue = callMethod(klass, "isEquivalent", argTypes, null, args);
        assertTrue(recursiveEquals(term30688, term30742));
        assertTrue(recursiveEquals(term30688, term30743));
        assertTrue(recursiveEquals(retValue, true));
    }

};


