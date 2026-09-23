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

public class JSType_isSubtypeHelper_677825053242 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30441;
     Object term30533;
     Object term30729;
     Object term30730;

    public JSType_isSubtypeHelper_677825053242() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30441 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        term30533 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        setBooleanField(term30533, term30533.getClass(), "unknown", false);
        term30729 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        setField(term30729, term30729.getClass(), "source", null);
        setField(term30729, term30729.getClass(), "elementsType", null);
        setField(term30729, term30729.getClass(), "elements", null);
        setField(term30729, term30729.getClass(), "className", null);
        setField(term30729, term30729.getClass(), "properties", null);
        setBooleanField(term30729, term30729.getClass(), "nativeType", false);
        setField(term30729, term30729.getClass(), "implicitPrototypeFallback", null);
        setField(term30729, term30729.getClass(), "ownerFunction", null);
        setBooleanField(term30729, term30729.getClass(), "prettyPrint", false);
        setBooleanField(term30729, term30729.getClass(), "visited", false);
        setField(term30729, term30729.getClass(), "docInfo", null);
        setBooleanField(term30729, term30729.getClass(), "unknown", false);
        setBooleanField(term30729, term30729.getClass(), "resolved", false);
        setField(term30729, term30729.getClass(), "resolveResult", null);
        setBooleanField(term30729, term30729.getClass(), "inTemplatedCheckVisit", false);
        setField(term30729, term30729.getClass(), "registry", null);
        term30730 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        setField(term30730, term30730.getClass(), "source", null);
        setField(term30730, term30730.getClass(), "elementsType", null);
        setField(term30730, term30730.getClass(), "elements", null);
        setField(term30730, term30730.getClass(), "className", null);
        setField(term30730, term30730.getClass(), "properties", null);
        setBooleanField(term30730, term30730.getClass(), "nativeType", false);
        setField(term30730, term30730.getClass(), "implicitPrototypeFallback", null);
        setField(term30730, term30730.getClass(), "ownerFunction", null);
        setBooleanField(term30730, term30730.getClass(), "prettyPrint", false);
        setBooleanField(term30730, term30730.getClass(), "visited", false);
        setField(term30730, term30730.getClass(), "docInfo", null);
        setBooleanField(term30730, term30730.getClass(), "unknown", false);
        setBooleanField(term30730, term30730.getClass(), "resolved", false);
        setField(term30730, term30730.getClass(), "resolveResult", null);
        setBooleanField(term30730, term30730.getClass(), "inTemplatedCheckVisit", false);
        setField(term30730, term30730.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term30441;
        args[1] = term30533;
        Object retValue = callMethod(klass, "isSubtypeHelper", argTypes, null, args);
        assertTrue(recursiveEquals(term30441, term30729));
        assertTrue(recursiveEquals(term30533, term30730));
        assertTrue(recursiveEquals(retValue, false));
    }

};


