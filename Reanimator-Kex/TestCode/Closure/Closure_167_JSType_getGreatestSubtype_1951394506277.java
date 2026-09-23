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

public class JSType_getGreatestSubtype_1951394506277 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38116;
     Object term38224;
     Object term38400;
     Object term38401;
     Object term38350;

    public JSType_getGreatestSubtype_1951394506277() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38116 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        term38224 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        term38400 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        setBooleanField(term38400, term38400.getClass(), "resolved", false);
        setField(term38400, term38400.getClass(), "resolveResult", null);
        setBooleanField(term38400, term38400.getClass(), "inTemplatedCheckVisit", false);
        setField(term38400, term38400.getClass(), "registry", null);
        term38401 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term38401, term38401.getClass(), "this$0", null);
        setField(term38401, term38401.getClass(), "call", null);
        setField(term38401, term38401.getClass(), "prototypeSlot", null);
        setField(term38401, term38401.getClass(), "kind", null);
        setField(term38401, term38401.getClass(), "typeOfThis", null);
        setField(term38401, term38401.getClass(), "source", null);
        setField(term38401, term38401.getClass(), "implementedInterfaces", null);
        setField(term38401, term38401.getClass(), "extendedInterfaces", null);
        setField(term38401, term38401.getClass(), "subTypes", null);
        setField(term38401, term38401.getClass(), "templateTypeNames", null);
        setField(term38401, term38401.getClass(), "className", null);
        setField(term38401, term38401.getClass(), "properties", null);
        setBooleanField(term38401, term38401.getClass(), "nativeType", false);
        setField(term38401, term38401.getClass(), "implicitPrototypeFallback", null);
        setField(term38401, term38401.getClass(), "ownerFunction", null);
        setBooleanField(term38401, term38401.getClass(), "prettyPrint", false);
        setBooleanField(term38401, term38401.getClass(), "visited", false);
        setField(term38401, term38401.getClass(), "docInfo", null);
        setBooleanField(term38401, term38401.getClass(), "unknown", false);
        setBooleanField(term38401, term38401.getClass(), "resolved", false);
        setField(term38401, term38401.getClass(), "resolveResult", null);
        setBooleanField(term38401, term38401.getClass(), "inTemplatedCheckVisit", false);
        setField(term38401, term38401.getClass(), "registry", null);
        term38350 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term38350, term38350.getClass(), "this$0", null);
        setField(term38350, term38350.getClass(), "call", null);
        setField(term38350, term38350.getClass(), "prototypeSlot", null);
        setField(term38350, term38350.getClass(), "kind", null);
        setField(term38350, term38350.getClass(), "typeOfThis", null);
        setField(term38350, term38350.getClass(), "source", null);
        setField(term38350, term38350.getClass(), "implementedInterfaces", null);
        setField(term38350, term38350.getClass(), "extendedInterfaces", null);
        setField(term38350, term38350.getClass(), "subTypes", null);
        setField(term38350, term38350.getClass(), "templateTypeNames", null);
        setField(term38350, term38350.getClass(), "className", null);
        setField(term38350, term38350.getClass(), "properties", null);
        setBooleanField(term38350, term38350.getClass(), "nativeType", false);
        setField(term38350, term38350.getClass(), "implicitPrototypeFallback", null);
        setField(term38350, term38350.getClass(), "ownerFunction", null);
        setBooleanField(term38350, term38350.getClass(), "prettyPrint", false);
        setBooleanField(term38350, term38350.getClass(), "visited", false);
        setField(term38350, term38350.getClass(), "docInfo", null);
        setBooleanField(term38350, term38350.getClass(), "unknown", false);
        setBooleanField(term38350, term38350.getClass(), "resolved", false);
        setField(term38350, term38350.getClass(), "resolveResult", null);
        setBooleanField(term38350, term38350.getClass(), "inTemplatedCheckVisit", false);
        setField(term38350, term38350.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term38116;
        args[1] = term38224;
        Object retValue = callMethod(klass, "getGreatestSubtype", argTypes, null, args);
        assertTrue(recursiveEquals(term38116, term38400));
        assertTrue(recursiveEquals(term38224, term38401));
        assertTrue(recursiveEquals(retValue, term38350));
    }

};


