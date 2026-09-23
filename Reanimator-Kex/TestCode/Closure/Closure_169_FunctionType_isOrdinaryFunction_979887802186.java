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

public class FunctionType_isOrdinaryFunction_979887802186 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96006;
     Object term217223;

    public FunctionType_isOrdinaryFunction_979887802186() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term217229 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term217228 = ((Class) term217229).getDeclaredField((String) "INTERFACE");
        ((Field) term217228).setAccessible(true);
        Object enum411 = ((Field) term217228).get((Object) null);
        term96006 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term96006, term96006.getClass(), "kind", enum411);
        Class<? extends Object> term217523 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term217522 = ((Class) term217523).getDeclaredField((String) "ORDINARY");
        ((Field) term217522).setAccessible(true);
        Object enum412 = ((Field) term217522).get((Object) null);
        term217223 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term217223, term217223.getClass(), "call", null);
        setField(term217223, term217223.getClass(), "prototypeSlot", null);
        setField(term217223, term217223.getClass(), "kind", enum412);
        setField(term217223, term217223.getClass(), "propAccess", null);
        setField(term217223, term217223.getClass(), "typeOfThis", null);
        setField(term217223, term217223.getClass(), "source", null);
        setField(term217223, term217223.getClass(), "implementedInterfaces", null);
        setField(term217223, term217223.getClass(), "extendedInterfaces", null);
        setField(term217223, term217223.getClass(), "subTypes", null);
        setField(term217223, term217223.getClass(), "templateTypeNames", null);
        setField(term217223, term217223.getClass(), "className", null);
        setField(term217223, term217223.getClass(), "properties", null);
        setBooleanField(term217223, term217223.getClass(), "nativeType", false);
        setField(term217223, term217223.getClass(), "implicitPrototypeFallback", null);
        setField(term217223, term217223.getClass(), "ownerFunction", null);
        setBooleanField(term217223, term217223.getClass(), "prettyPrint", false);
        setBooleanField(term217223, term217223.getClass(), "visited", false);
        setField(term217223, term217223.getClass(), "docInfo", null);
        setBooleanField(term217223, term217223.getClass(), "unknown", false);
        setBooleanField(term217223, term217223.getClass(), "resolved", false);
        setField(term217223, term217223.getClass(), "resolveResult", null);
        setBooleanField(term217223, term217223.getClass(), "inTemplatedCheckVisit", false);
        setField(term217223, term217223.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isOrdinaryFunction", argTypes, term96006, args);
        assertTrue(recursiveEquals(term96006, term217223));
        assertTrue(recursiveEquals(retValue, true));
    }

};


