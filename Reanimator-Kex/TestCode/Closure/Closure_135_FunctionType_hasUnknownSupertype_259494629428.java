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
import java.lang.String;
import java.lang.Object;

public class FunctionType_hasUnknownSupertype_259494629428 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term283580;
     Object term285036;

    public FunctionType_hasUnknownSupertype_259494629428() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term285043 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term285042 = ((Class) term285043).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term285042).setAccessible(true);
        Object enum520 = ((Field) term285042).get((Object) null);
        term283580 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term283846 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term283580, term283580.getClass(), "kind", enum520);
        setBooleanField(term283580, term283580.getClass(), "unknown", false);
        setField(term283580, term283580.getClass(), "prototype", term283846);
        Class<? extends Object> term285343 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term285342 = ((Class) term285343).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term285342).setAccessible(true);
        Object enum521 = ((Field) term285342).get((Object) null);
        term285036 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term285037 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term285036, term285036.getClass(), "call", null);
        setField(term285037, term285037.getClass(), "ownerFunction", null);
        setField(term285037, term285037.getClass(), "className", null);
        setField(term285037, term285037.getClass(), "properties", null);
        setField(term285037, term285037.getClass(), "implicitPrototype", null);
        setBooleanField(term285037, term285037.getClass(), "nativeType", false);
        setBooleanField(term285037, term285037.getClass(), "visited", false);
        setField(term285037, term285037.getClass(), "docInfo", null);
        setBooleanField(term285037, term285037.getClass(), "unknown", false);
        setBooleanField(term285037, term285037.getClass(), "resolved", false);
        setField(term285037, term285037.getClass(), "resolveResult", null);
        setField(term285037, term285037.getClass(), "registry", null);
        setField(term285036, term285036.getClass(), "prototype", term285037);
        setField(term285036, term285036.getClass(), "kind", enum521);
        setField(term285036, term285036.getClass(), "typeOfThis", null);
        setField(term285036, term285036.getClass(), "source", null);
        setField(term285036, term285036.getClass(), "implementedInterfaces", null);
        setField(term285036, term285036.getClass(), "subTypes", null);
        setField(term285036, term285036.getClass(), "templateTypeName", null);
        setField(term285036, term285036.getClass(), "className", null);
        setField(term285036, term285036.getClass(), "properties", null);
        setField(term285036, term285036.getClass(), "implicitPrototype", null);
        setBooleanField(term285036, term285036.getClass(), "nativeType", false);
        setBooleanField(term285036, term285036.getClass(), "visited", false);
        setField(term285036, term285036.getClass(), "docInfo", null);
        setBooleanField(term285036, term285036.getClass(), "unknown", false);
        setBooleanField(term285036, term285036.getClass(), "resolved", false);
        setField(term285036, term285036.getClass(), "resolveResult", null);
        setField(term285036, term285036.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hasUnknownSupertype", argTypes, term283580, args);
        assertTrue(recursiveEquals(term283580, term285036));
        assertTrue(recursiveEquals(retValue, false));
    }

};


