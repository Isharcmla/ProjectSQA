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

public class JSType_isSubtypeHelper_677825053315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44872;
     Object term44968;
     Object term45015;
     Object term45016;

    public JSType_isSubtypeHelper_677825053315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44872 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        term44968 = newInstance(Class.forName("com.google.javascript.rhino.jstype.StringType"));
        term45015 = newInstance(Class.forName("com.google.javascript.rhino.jstype.StringType"));
        setBooleanField(term45015, term45015.getClass(), "resolved", false);
        setField(term45015, term45015.getClass(), "resolveResult", null);
        setBooleanField(term45015, term45015.getClass(), "inTemplatedCheckVisit", false);
        setField(term45015, term45015.getClass(), "registry", null);
        term45016 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term45016, term45016.getClass(), "properties", null);
        setBooleanField(term45016, term45016.getClass(), "declared", false);
        setBooleanField(term45016, term45016.getClass(), "isFrozen", false);
        setField(term45016, term45016.getClass(), "className", null);
        setField(term45016, term45016.getClass(), "properties", null);
        setBooleanField(term45016, term45016.getClass(), "nativeType", false);
        setField(term45016, term45016.getClass(), "implicitPrototypeFallback", null);
        setField(term45016, term45016.getClass(), "ownerFunction", null);
        setBooleanField(term45016, term45016.getClass(), "prettyPrint", false);
        setBooleanField(term45016, term45016.getClass(), "visited", false);
        setField(term45016, term45016.getClass(), "docInfo", null);
        setBooleanField(term45016, term45016.getClass(), "unknown", false);
        setBooleanField(term45016, term45016.getClass(), "resolved", false);
        setField(term45016, term45016.getClass(), "resolveResult", null);
        setBooleanField(term45016, term45016.getClass(), "inTemplatedCheckVisit", false);
        setField(term45016, term45016.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term44872;
        args[1] = term44968;
        Object retValue = callMethod(klass, "isSubtypeHelper", argTypes, null, args);
        assertTrue(recursiveEquals(term44872, term45015));
        assertTrue(recursiveEquals(term44968, term45016));
        assertTrue(recursiveEquals(retValue, false));
    }

};


