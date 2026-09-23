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

public class JSType_isSubtypeHelper_677825053309 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41844;
     Object term41940;
     Object term41982;
     Object term41983;

    public JSType_isSubtypeHelper_677825053309() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41844 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        term41940 = newInstance(Class.forName("com.google.javascript.rhino.jstype.StringType"));
        term41982 = newInstance(Class.forName("com.google.javascript.rhino.jstype.StringType"));
        setBooleanField(term41982, term41982.getClass(), "resolved", false);
        setField(term41982, term41982.getClass(), "resolveResult", null);
        setBooleanField(term41982, term41982.getClass(), "inTemplatedCheckVisit", false);
        setField(term41982, term41982.getClass(), "registry", null);
        term41983 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        setField(term41983, term41983.getClass(), "source", null);
        setField(term41983, term41983.getClass(), "elementsType", null);
        setField(term41983, term41983.getClass(), "elements", null);
        setField(term41983, term41983.getClass(), "className", null);
        setField(term41983, term41983.getClass(), "properties", null);
        setBooleanField(term41983, term41983.getClass(), "nativeType", false);
        setField(term41983, term41983.getClass(), "implicitPrototypeFallback", null);
        setField(term41983, term41983.getClass(), "ownerFunction", null);
        setBooleanField(term41983, term41983.getClass(), "prettyPrint", false);
        setBooleanField(term41983, term41983.getClass(), "visited", false);
        setField(term41983, term41983.getClass(), "docInfo", null);
        setBooleanField(term41983, term41983.getClass(), "unknown", false);
        setBooleanField(term41983, term41983.getClass(), "resolved", false);
        setField(term41983, term41983.getClass(), "resolveResult", null);
        setBooleanField(term41983, term41983.getClass(), "inTemplatedCheckVisit", false);
        setField(term41983, term41983.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term41844;
        args[1] = term41940;
        Object retValue = callMethod(klass, "isSubtypeHelper", argTypes, null, args);
        assertTrue(recursiveEquals(term41844, term41982));
        assertTrue(recursiveEquals(term41940, term41983));
        assertTrue(recursiveEquals(retValue, false));
    }

};


