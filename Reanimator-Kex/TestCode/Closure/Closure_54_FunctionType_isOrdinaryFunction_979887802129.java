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

public class FunctionType_isOrdinaryFunction_979887802129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66218;
     Object term66986;

    public FunctionType_isOrdinaryFunction_979887802129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term66992 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term66991 = ((Class) term66992).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term66991).setAccessible(true);
        Object enum167 = ((Field) term66991).get((Object) null);
        term66218 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term66218, term66218.getClass(), "kind", enum167);
        Class<? extends Object> term67292 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term67291 = ((Class) term67292).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term67291).setAccessible(true);
        Object enum168 = ((Field) term67291).get((Object) null);
        term66986 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term66986, term66986.getClass(), "call", null);
        setField(term66986, term66986.getClass(), "prototype", null);
        setField(term66986, term66986.getClass(), "prototypeSlot", null);
        setField(term66986, term66986.getClass(), "kind", enum168);
        setField(term66986, term66986.getClass(), "typeOfThis", null);
        setField(term66986, term66986.getClass(), "source", null);
        setField(term66986, term66986.getClass(), "implementedInterfaces", null);
        setField(term66986, term66986.getClass(), "extendedInterfaces", null);
        setField(term66986, term66986.getClass(), "subTypes", null);
        setField(term66986, term66986.getClass(), "templateTypeName", null);
        setField(term66986, term66986.getClass(), "className", null);
        setField(term66986, term66986.getClass(), "properties", null);
        setBooleanField(term66986, term66986.getClass(), "nativeType", false);
        setField(term66986, term66986.getClass(), "implicitPrototypeFallback", null);
        setField(term66986, term66986.getClass(), "ownerFunction", null);
        setBooleanField(term66986, term66986.getClass(), "prettyPrint", false);
        setBooleanField(term66986, term66986.getClass(), "visited", false);
        setField(term66986, term66986.getClass(), "docInfo", null);
        setBooleanField(term66986, term66986.getClass(), "unknown", false);
        setBooleanField(term66986, term66986.getClass(), "resolved", false);
        setField(term66986, term66986.getClass(), "resolveResult", null);
        setField(term66986, term66986.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isOrdinaryFunction", argTypes, term66218, args);
        assertTrue(recursiveEquals(term66218, term66986));
        assertTrue(recursiveEquals(retValue, false));
    }

};


