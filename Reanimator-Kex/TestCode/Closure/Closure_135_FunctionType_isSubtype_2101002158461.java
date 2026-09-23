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

public class FunctionType_isSubtype_2101002158461 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term317431;
     Object term317983;
     Object term318742;
     Object term318746;

    public FunctionType_isSubtype_2101002158461() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term318752 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term318751 = ((Class) term318752).getDeclaredField((String) "INTERFACE");
        ((Field) term318751).setAccessible(true);
        Object enum579 = ((Field) term318751).get((Object) null);
        term317431 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term317431, term317431.getClass(), "kind", enum579);
        Class<? extends Object> term319046 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term319045 = ((Class) term319046).getDeclaredField((String) "INTERFACE");
        ((Field) term319045).setAccessible(true);
        Object enum580 = ((Field) term319045).get((Object) null);
        term317983 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term317983, term317983.getClass(), "kind", enum580);
        Class<? extends Object> term319340 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term319339 = ((Class) term319340).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term319339).setAccessible(true);
        Object enum581 = ((Field) term319339).get((Object) null);
        term318742 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term318742, term318742.getClass(), "this$0", null);
        setField(term318742, term318742.getClass(), "call", null);
        setField(term318742, term318742.getClass(), "prototype", null);
        setField(term318742, term318742.getClass(), "kind", enum581);
        setField(term318742, term318742.getClass(), "typeOfThis", null);
        setField(term318742, term318742.getClass(), "source", null);
        setField(term318742, term318742.getClass(), "implementedInterfaces", null);
        setField(term318742, term318742.getClass(), "subTypes", null);
        setField(term318742, term318742.getClass(), "templateTypeName", null);
        setField(term318742, term318742.getClass(), "className", null);
        setField(term318742, term318742.getClass(), "properties", null);
        setField(term318742, term318742.getClass(), "implicitPrototype", null);
        setBooleanField(term318742, term318742.getClass(), "nativeType", false);
        setBooleanField(term318742, term318742.getClass(), "visited", false);
        setField(term318742, term318742.getClass(), "docInfo", null);
        setBooleanField(term318742, term318742.getClass(), "unknown", false);
        setBooleanField(term318742, term318742.getClass(), "resolved", false);
        setField(term318742, term318742.getClass(), "resolveResult", null);
        setField(term318742, term318742.getClass(), "registry", null);
        Class<? extends Object> term319640 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term319639 = ((Class) term319640).getDeclaredField((String) "INTERFACE");
        ((Field) term319639).setAccessible(true);
        Object enum582 = ((Field) term319639).get((Object) null);
        term318746 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term318746, term318746.getClass(), "this$0", null);
        setField(term318746, term318746.getClass(), "call", null);
        setField(term318746, term318746.getClass(), "prototype", null);
        setField(term318746, term318746.getClass(), "kind", enum582);
        setField(term318746, term318746.getClass(), "typeOfThis", null);
        setField(term318746, term318746.getClass(), "source", null);
        setField(term318746, term318746.getClass(), "implementedInterfaces", null);
        setField(term318746, term318746.getClass(), "subTypes", null);
        setField(term318746, term318746.getClass(), "templateTypeName", null);
        setField(term318746, term318746.getClass(), "className", null);
        setField(term318746, term318746.getClass(), "properties", null);
        setField(term318746, term318746.getClass(), "implicitPrototype", null);
        setBooleanField(term318746, term318746.getClass(), "nativeType", false);
        setBooleanField(term318746, term318746.getClass(), "visited", false);
        setField(term318746, term318746.getClass(), "docInfo", null);
        setBooleanField(term318746, term318746.getClass(), "unknown", false);
        setBooleanField(term318746, term318746.getClass(), "resolved", false);
        setField(term318746, term318746.getClass(), "resolveResult", null);
        setField(term318746, term318746.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term317983;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term317431, args);
        assertTrue(recursiveEquals(term317431, term318742));
        assertTrue(recursiveEquals(term317983, term318746));
        assertTrue(recursiveEquals(retValue, true));
    }

};


