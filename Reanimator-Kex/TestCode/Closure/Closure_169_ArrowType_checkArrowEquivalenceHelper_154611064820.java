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
import java.lang.NullPointerException;
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Boolean;

public class ArrowType_checkArrowEquivalenceHelper_154611064820 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term314;
     Object term342;
     Object term370;

    public ArrowType_checkArrowEquivalenceHelper_154611064820() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term314 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term315 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term317 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term319 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term321 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term324 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term327 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term331 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term335 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term315, term315.getClass(), "type", 1328271830);
        setIntField(term317, term317.getClass(), "type", 1596070772);
        setIntField(term319, term319.getClass(), "type", 97029295);
        setIntField(term321, term321.getClass(), "type", -1371869594);
        setField(term321, term321.getClass(), "next", null);
        setField(term321, term321.getClass(), "first", null);
        setField(term321, term321.getClass(), "last", null);
        setField(term321, term321.getClass(), "propListHead", null);
        setIntField(term321, term321.getClass(), "sourcePosition", 0);
        setField(term321, term321.getClass(), "jsType", null);
        setField(term321, term321.getClass(), "parent", null);
        setField(term319, term319.getClass(), "next", term321);
        setIntField(term324, term324.getClass(), "type", -1588772968);
        setField(term324, term324.getClass(), "next", null);
        setField(term324, term324.getClass(), "first", term315);
        setField(term324, term324.getClass(), "last", null);
        setField(term324, term324.getClass(), "propListHead", null);
        setIntField(term324, term324.getClass(), "sourcePosition", 0);
        setField(term324, term324.getClass(), "jsType", null);
        setField(term324, term324.getClass(), "parent", null);
        setField(term319, term319.getClass(), "first", term324);
        setIntField(term327, term327.getClass(), "type", 1225272962);
        setField(term327, term327.getClass(), "next", null);
        setField(term327, term327.getClass(), "first", term317);
        setField(term327, term327.getClass(), "last", null);
        setField(term327, term327.getClass(), "propListHead", null);
        setIntField(term327, term327.getClass(), "sourcePosition", 0);
        setField(term327, term327.getClass(), "jsType", null);
        setField(term327, term327.getClass(), "parent", null);
        setField(term319, term319.getClass(), "last", term327);
        setField(term319, term319.getClass(), "propListHead", null);
        setIntField(term319, term319.getClass(), "sourcePosition", 0);
        setField(term319, term319.getClass(), "jsType", null);
        setField(term319, term319.getClass(), "parent", null);
        setField(term317, term317.getClass(), "next", term319);
        setField(term317, term317.getClass(), "first", term319);
        setIntField(term331, term331.getClass(), "type", -2095575670);
        setField(term331, term331.getClass(), "next", term327);
        setField(term331, term331.getClass(), "first", term324);
        setField(term331, term331.getClass(), "last", term324);
        setField(term331, term331.getClass(), "propListHead", null);
        setIntField(term331, term331.getClass(), "sourcePosition", 0);
        setField(term331, term331.getClass(), "jsType", null);
        setField(term331, term331.getClass(), "parent", null);
        setField(term317, term317.getClass(), "last", term331);
        setField(term317, term317.getClass(), "propListHead", null);
        setIntField(term317, term317.getClass(), "sourcePosition", 0);
        setField(term317, term317.getClass(), "jsType", null);
        setField(term317, term317.getClass(), "parent", null);
        setField(term315, term315.getClass(), "next", term317);
        setField(term315, term315.getClass(), "first", term324);
        setIntField(term335, term335.getClass(), "type", 0);
        setField(term335, term335.getClass(), "next", null);
        setField(term335, term335.getClass(), "first", null);
        setField(term335, term335.getClass(), "last", null);
        setField(term335, term335.getClass(), "propListHead", null);
        setIntField(term335, term335.getClass(), "sourcePosition", 0);
        setField(term335, term335.getClass(), "jsType", null);
        setField(term335, term335.getClass(), "parent", null);
        setField(term315, term315.getClass(), "last", term335);
        setField(term315, term315.getClass(), "propListHead", null);
        setIntField(term315, term315.getClass(), "sourcePosition", 0);
        setField(term315, term315.getClass(), "jsType", null);
        setField(term315, term315.getClass(), "parent", null);
        setField(term314, term314.getClass(), "parameters", term315);
        setField(term314, term314.getClass(), "returnType", null);
        setBooleanField(term314, term314.getClass(), "returnTypeInferred", false);
        setBooleanField(term314, term314.getClass(), "resolved", false);
        setField(term314, term314.getClass(), "resolveResult", null);
        setBooleanField(term314, term314.getClass(), "inTemplatedCheckVisit", false);
        setField(term314, term314.getClass(), "registry", null);
        term342 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term343 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term345 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term347 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term349 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term352 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term355 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term359 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term363 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term343, term343.getClass(), "type", -112921587);
        setIntField(term345, term345.getClass(), "type", 933028652);
        setIntField(term347, term347.getClass(), "type", 287287233);
        setIntField(term349, term349.getClass(), "type", 962840079);
        setField(term349, term349.getClass(), "next", null);
        setField(term349, term349.getClass(), "first", null);
        setField(term349, term349.getClass(), "last", null);
        setField(term349, term349.getClass(), "propListHead", null);
        setIntField(term349, term349.getClass(), "sourcePosition", 0);
        setField(term349, term349.getClass(), "jsType", null);
        setField(term349, term349.getClass(), "parent", null);
        setField(term347, term347.getClass(), "next", term349);
        setIntField(term352, term352.getClass(), "type", 1551099402);
        setField(term352, term352.getClass(), "next", null);
        setField(term352, term352.getClass(), "first", term343);
        setField(term352, term352.getClass(), "last", null);
        setField(term352, term352.getClass(), "propListHead", null);
        setIntField(term352, term352.getClass(), "sourcePosition", 0);
        setField(term352, term352.getClass(), "jsType", null);
        setField(term352, term352.getClass(), "parent", null);
        setField(term347, term347.getClass(), "first", term352);
        setIntField(term355, term355.getClass(), "type", 1265463001);
        setField(term355, term355.getClass(), "next", null);
        setField(term355, term355.getClass(), "first", term345);
        setField(term355, term355.getClass(), "last", null);
        setField(term355, term355.getClass(), "propListHead", null);
        setIntField(term355, term355.getClass(), "sourcePosition", 0);
        setField(term355, term355.getClass(), "jsType", null);
        setField(term355, term355.getClass(), "parent", null);
        setField(term347, term347.getClass(), "last", term355);
        setField(term347, term347.getClass(), "propListHead", null);
        setIntField(term347, term347.getClass(), "sourcePosition", 0);
        setField(term347, term347.getClass(), "jsType", null);
        setField(term347, term347.getClass(), "parent", null);
        setField(term345, term345.getClass(), "next", term347);
        setField(term345, term345.getClass(), "first", term347);
        setIntField(term359, term359.getClass(), "type", 1540719661);
        setField(term359, term359.getClass(), "next", term355);
        setField(term359, term359.getClass(), "first", term352);
        setField(term359, term359.getClass(), "last", term352);
        setField(term359, term359.getClass(), "propListHead", null);
        setIntField(term359, term359.getClass(), "sourcePosition", 0);
        setField(term359, term359.getClass(), "jsType", null);
        setField(term359, term359.getClass(), "parent", null);
        setField(term345, term345.getClass(), "last", term359);
        setField(term345, term345.getClass(), "propListHead", null);
        setIntField(term345, term345.getClass(), "sourcePosition", 0);
        setField(term345, term345.getClass(), "jsType", null);
        setField(term345, term345.getClass(), "parent", null);
        setField(term343, term343.getClass(), "next", term345);
        setField(term343, term343.getClass(), "first", term352);
        setIntField(term363, term363.getClass(), "type", 0);
        setField(term363, term363.getClass(), "next", null);
        setField(term363, term363.getClass(), "first", null);
        setField(term363, term363.getClass(), "last", null);
        setField(term363, term363.getClass(), "propListHead", null);
        setIntField(term363, term363.getClass(), "sourcePosition", 0);
        setField(term363, term363.getClass(), "jsType", null);
        setField(term363, term363.getClass(), "parent", null);
        setField(term343, term343.getClass(), "last", term363);
        setField(term343, term343.getClass(), "propListHead", null);
        setIntField(term343, term343.getClass(), "sourcePosition", 0);
        setField(term343, term343.getClass(), "jsType", null);
        setField(term343, term343.getClass(), "parent", null);
        setField(term342, term342.getClass(), "parameters", term343);
        setField(term342, term342.getClass(), "returnType", null);
        setBooleanField(term342, term342.getClass(), "returnTypeInferred", false);
        setBooleanField(term342, term342.getClass(), "resolved", false);
        setField(term342, term342.getClass(), "resolveResult", null);
        setBooleanField(term342, term342.getClass(), "inTemplatedCheckVisit", false);
        setField(term342, term342.getClass(), "registry", null);
        term370 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.ArrowType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ArrowType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term342;
        args[1] = term370;
        try {
            callMethod(klass, "checkArrowEquivalenceHelper", argTypes, term314, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


