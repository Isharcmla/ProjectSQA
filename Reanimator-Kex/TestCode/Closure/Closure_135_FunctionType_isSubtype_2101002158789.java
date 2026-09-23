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

public class FunctionType_isSubtype_2101002158789 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term781411;
     Object term781839;
     Object term781843;

    public FunctionType_isSubtype_2101002158789() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term781849 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term781848 = ((Class) term781849).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term781848).setAccessible(true);
        Object enum1458 = ((Field) term781848).get((Object) null);
        term781411 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term781411, term781411.getClass(), "kind", enum1458);
        Class<? extends Object> term782149 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term782148 = ((Class) term782149).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term782148).setAccessible(true);
        Object enum1459 = ((Field) term782148).get((Object) null);
        term781839 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term781839, term781839.getClass(), "this$0", null);
        setField(term781839, term781839.getClass(), "call", null);
        setField(term781839, term781839.getClass(), "prototype", null);
        setField(term781839, term781839.getClass(), "kind", enum1459);
        setField(term781839, term781839.getClass(), "typeOfThis", null);
        setField(term781839, term781839.getClass(), "source", null);
        setField(term781839, term781839.getClass(), "implementedInterfaces", null);
        setField(term781839, term781839.getClass(), "subTypes", null);
        setField(term781839, term781839.getClass(), "templateTypeName", null);
        setField(term781839, term781839.getClass(), "className", null);
        setField(term781839, term781839.getClass(), "properties", null);
        setField(term781839, term781839.getClass(), "implicitPrototype", null);
        setBooleanField(term781839, term781839.getClass(), "nativeType", false);
        setBooleanField(term781839, term781839.getClass(), "visited", false);
        setField(term781839, term781839.getClass(), "docInfo", null);
        setBooleanField(term781839, term781839.getClass(), "unknown", false);
        setBooleanField(term781839, term781839.getClass(), "resolved", false);
        setField(term781839, term781839.getClass(), "resolveResult", null);
        setField(term781839, term781839.getClass(), "registry", null);
        Class<? extends Object> term782449 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term782448 = ((Class) term782449).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term782448).setAccessible(true);
        Object enum1460 = ((Field) term782448).get((Object) null);
        term781843 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term781843, term781843.getClass(), "this$0", null);
        setField(term781843, term781843.getClass(), "call", null);
        setField(term781843, term781843.getClass(), "prototype", null);
        setField(term781843, term781843.getClass(), "kind", enum1460);
        setField(term781843, term781843.getClass(), "typeOfThis", null);
        setField(term781843, term781843.getClass(), "source", null);
        setField(term781843, term781843.getClass(), "implementedInterfaces", null);
        setField(term781843, term781843.getClass(), "subTypes", null);
        setField(term781843, term781843.getClass(), "templateTypeName", null);
        setField(term781843, term781843.getClass(), "className", null);
        setField(term781843, term781843.getClass(), "properties", null);
        setField(term781843, term781843.getClass(), "implicitPrototype", null);
        setBooleanField(term781843, term781843.getClass(), "nativeType", false);
        setBooleanField(term781843, term781843.getClass(), "visited", false);
        setField(term781843, term781843.getClass(), "docInfo", null);
        setBooleanField(term781843, term781843.getClass(), "unknown", false);
        setBooleanField(term781843, term781843.getClass(), "resolved", false);
        setField(term781843, term781843.getClass(), "resolveResult", null);
        setField(term781843, term781843.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term781411;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term781411, args);
        assertTrue(recursiveEquals(term781411, term781839));
        assertTrue(recursiveEquals(term781411, term781843));
        assertTrue(recursiveEquals(retValue, true));
    }

};


