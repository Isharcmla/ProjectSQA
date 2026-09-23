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

public class FunctionType_isOrdinaryFunction_979887802103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56530;
     Object term57300;

    public FunctionType_isOrdinaryFunction_979887802103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term57306 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term57305 = ((Class) term57306).getDeclaredField((String) "ORDINARY");
        ((Field) term57305).setAccessible(true);
        Object enum141 = ((Field) term57305).get((Object) null);
        term56530 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term56530, term56530.getClass(), "kind", enum141);
        Class<? extends Object> term57597 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term57596 = ((Class) term57597).getDeclaredField((String) "ORDINARY");
        ((Field) term57596).setAccessible(true);
        Object enum142 = ((Field) term57596).get((Object) null);
        term57300 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term57300, term57300.getClass(), "call", null);
        setField(term57300, term57300.getClass(), "prototype", null);
        setField(term57300, term57300.getClass(), "kind", enum142);
        setField(term57300, term57300.getClass(), "typeOfThis", null);
        setField(term57300, term57300.getClass(), "source", null);
        setField(term57300, term57300.getClass(), "implementedInterfaces", null);
        setField(term57300, term57300.getClass(), "subTypes", null);
        setField(term57300, term57300.getClass(), "templateTypeName", null);
        setField(term57300, term57300.getClass(), "className", null);
        setField(term57300, term57300.getClass(), "properties", null);
        setField(term57300, term57300.getClass(), "implicitPrototype", null);
        setBooleanField(term57300, term57300.getClass(), "nativeType", false);
        setBooleanField(term57300, term57300.getClass(), "visited", false);
        setField(term57300, term57300.getClass(), "docInfo", null);
        setBooleanField(term57300, term57300.getClass(), "unknown", false);
        setBooleanField(term57300, term57300.getClass(), "resolved", false);
        setField(term57300, term57300.getClass(), "resolveResult", null);
        setField(term57300, term57300.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isOrdinaryFunction", argTypes, term56530, args);
        assertTrue(recursiveEquals(term56530, term57300));
        assertTrue(recursiveEquals(retValue, true));
    }

};


