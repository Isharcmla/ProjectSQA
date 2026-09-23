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

public class FunctionType_hashCode_1481422575361 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term214173;
     Object term214735;

    public FunctionType_hashCode_1481422575361() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term214741 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term214740 = ((Class) term214741).getDeclaredField((String) "ORDINARY");
        ((Field) term214740).setAccessible(true);
        Object enum390 = ((Field) term214740).get((Object) null);
        term214173 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term214415 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term214173, term214173.getClass(), "kind", enum390);
        setField(term214173, term214173.getClass(), "call", term214415);
        Class<? extends Object> term215032 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term215031 = ((Class) term215032).getDeclaredField((String) "ORDINARY");
        ((Field) term215031).setAccessible(true);
        Object enum391 = ((Field) term215031).get((Object) null);
        term214735 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term214736 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term214736, term214736.getClass(), "parameters", null);
        setField(term214736, term214736.getClass(), "returnType", null);
        setBooleanField(term214736, term214736.getClass(), "resolved", false);
        setField(term214736, term214736.getClass(), "resolveResult", null);
        setField(term214736, term214736.getClass(), "registry", null);
        setField(term214735, term214735.getClass(), "call", term214736);
        setField(term214735, term214735.getClass(), "prototype", null);
        setField(term214735, term214735.getClass(), "kind", enum391);
        setField(term214735, term214735.getClass(), "typeOfThis", null);
        setField(term214735, term214735.getClass(), "source", null);
        setField(term214735, term214735.getClass(), "implementedInterfaces", null);
        setField(term214735, term214735.getClass(), "subTypes", null);
        setField(term214735, term214735.getClass(), "templateTypeName", null);
        setField(term214735, term214735.getClass(), "className", null);
        setField(term214735, term214735.getClass(), "properties", null);
        setField(term214735, term214735.getClass(), "implicitPrototype", null);
        setBooleanField(term214735, term214735.getClass(), "nativeType", false);
        setBooleanField(term214735, term214735.getClass(), "visited", false);
        setField(term214735, term214735.getClass(), "docInfo", null);
        setBooleanField(term214735, term214735.getClass(), "unknown", false);
        setBooleanField(term214735, term214735.getClass(), "resolved", false);
        setField(term214735, term214735.getClass(), "resolveResult", null);
        setField(term214735, term214735.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term214173, args);
        assertTrue(recursiveEquals(term214173, term214735));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


