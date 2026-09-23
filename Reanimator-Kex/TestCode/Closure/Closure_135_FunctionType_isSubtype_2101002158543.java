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

public class FunctionType_isSubtype_2101002158543 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term416023;
     Object term416281;
     Object term417336;
     Object term417340;

    public FunctionType_isSubtype_2101002158543() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term417346 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term417345 = ((Class) term417346).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term417345).setAccessible(true);
        Object enum772 = ((Field) term417345).get((Object) null);
        term416023 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term416023, term416023.getClass(), "kind", enum772);
        Class<? extends Object> term417646 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term417645 = ((Class) term417646).getDeclaredField((String) "ORDINARY");
        ((Field) term417645).setAccessible(true);
        Object enum773 = ((Field) term417645).get((Object) null);
        term416281 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term416281, term416281.getClass(), "kind", enum773);
        Class<? extends Object> term417937 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term417936 = ((Class) term417937).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term417936).setAccessible(true);
        Object enum774 = ((Field) term417936).get((Object) null);
        term417336 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term417336, term417336.getClass(), "this$0", null);
        setField(term417336, term417336.getClass(), "call", null);
        setField(term417336, term417336.getClass(), "prototype", null);
        setField(term417336, term417336.getClass(), "kind", enum774);
        setField(term417336, term417336.getClass(), "typeOfThis", null);
        setField(term417336, term417336.getClass(), "source", null);
        setField(term417336, term417336.getClass(), "implementedInterfaces", null);
        setField(term417336, term417336.getClass(), "subTypes", null);
        setField(term417336, term417336.getClass(), "templateTypeName", null);
        setField(term417336, term417336.getClass(), "className", null);
        setField(term417336, term417336.getClass(), "properties", null);
        setField(term417336, term417336.getClass(), "implicitPrototype", null);
        setBooleanField(term417336, term417336.getClass(), "nativeType", false);
        setBooleanField(term417336, term417336.getClass(), "visited", false);
        setField(term417336, term417336.getClass(), "docInfo", null);
        setBooleanField(term417336, term417336.getClass(), "unknown", false);
        setBooleanField(term417336, term417336.getClass(), "resolved", false);
        setField(term417336, term417336.getClass(), "resolveResult", null);
        setField(term417336, term417336.getClass(), "registry", null);
        Class<? extends Object> term418237 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term418236 = ((Class) term418237).getDeclaredField((String) "INTERFACE");
        ((Field) term418236).setAccessible(true);
        Object enum775 = ((Field) term418236).get((Object) null);
        term417340 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term417340, term417340.getClass(), "call", null);
        setField(term417340, term417340.getClass(), "prototype", null);
        setField(term417340, term417340.getClass(), "kind", enum775);
        setField(term417340, term417340.getClass(), "typeOfThis", null);
        setField(term417340, term417340.getClass(), "source", null);
        setField(term417340, term417340.getClass(), "implementedInterfaces", null);
        setField(term417340, term417340.getClass(), "subTypes", null);
        setField(term417340, term417340.getClass(), "templateTypeName", null);
        setField(term417340, term417340.getClass(), "className", null);
        setField(term417340, term417340.getClass(), "properties", null);
        setField(term417340, term417340.getClass(), "implicitPrototype", null);
        setBooleanField(term417340, term417340.getClass(), "nativeType", false);
        setBooleanField(term417340, term417340.getClass(), "visited", false);
        setField(term417340, term417340.getClass(), "docInfo", null);
        setBooleanField(term417340, term417340.getClass(), "unknown", false);
        setBooleanField(term417340, term417340.getClass(), "resolved", false);
        setField(term417340, term417340.getClass(), "resolveResult", null);
        setField(term417340, term417340.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term416281;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term416023, args);
        assertTrue(recursiveEquals(term416023, term417336));
        assertTrue(recursiveEquals(term416281, term417340));
        assertTrue(recursiveEquals(retValue, true));
    }

};


