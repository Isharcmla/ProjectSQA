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

public class FunctionType_isSubtype_21010021581649 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2222739;
     Object term2223391;
     Object term2226405;
     Object term2226410;

    public FunctionType_isSubtype_21010021581649() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2226417 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2226416 = ((Class) term2226417).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2226416).setAccessible(true);
        Object enum4148 = ((Field) term2226416).get((Object) null);
        Class<? extends Object> term2226717 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2226716 = ((Class) term2226717).getDeclaredField((String) "INTERFACE");
        ((Field) term2226716).setAccessible(true);
        Object enum4149 = ((Field) term2226716).get((Object) null);
        term2222739 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2223283 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term2222739, term2222739.getClass(), "kind", enum4148);
        setField(term2223283, term2223283.getClass(), "kind", enum4149);
        setField(term2222739, term2222739.getClass(), "typeOfThis", term2223283);
        term2223391 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2223721 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term2223391, term2223391.getClass(), "kind", enum4148);
        setField(term2223721, term2223721.getClass(), "kind", enum4149);
        setField(term2223391, term2223391.getClass(), "typeOfThis", term2223721);
        Class<? extends Object> term2227011 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2227010 = ((Class) term2227011).getDeclaredField((String) "INTERFACE");
        ((Field) term2227010).setAccessible(true);
        Object enum4150 = ((Field) term2227010).get((Object) null);
        term2226405 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2226409 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term2226405, term2226405.getClass(), "this$0", null);
        setField(term2226405, term2226405.getClass(), "call", null);
        setField(term2226405, term2226405.getClass(), "prototype", null);
        setField(term2226405, term2226405.getClass(), "kind", enum4150);
        setField(term2226409, term2226409.getClass(), "call", null);
        setField(term2226409, term2226409.getClass(), "prototype", null);
        setField(term2226409, term2226409.getClass(), "kind", enum4150);
        setField(term2226409, term2226409.getClass(), "typeOfThis", null);
        setField(term2226409, term2226409.getClass(), "source", null);
        setField(term2226409, term2226409.getClass(), "implementedInterfaces", null);
        setField(term2226409, term2226409.getClass(), "subTypes", null);
        setField(term2226409, term2226409.getClass(), "templateTypeName", null);
        setField(term2226409, term2226409.getClass(), "className", null);
        setField(term2226409, term2226409.getClass(), "properties", null);
        setField(term2226409, term2226409.getClass(), "implicitPrototype", null);
        setBooleanField(term2226409, term2226409.getClass(), "nativeType", false);
        setBooleanField(term2226409, term2226409.getClass(), "visited", false);
        setField(term2226409, term2226409.getClass(), "docInfo", null);
        setBooleanField(term2226409, term2226409.getClass(), "unknown", false);
        setBooleanField(term2226409, term2226409.getClass(), "resolved", false);
        setField(term2226409, term2226409.getClass(), "resolveResult", null);
        setField(term2226409, term2226409.getClass(), "registry", null);
        setField(term2226405, term2226405.getClass(), "typeOfThis", term2226409);
        setField(term2226405, term2226405.getClass(), "source", null);
        setField(term2226405, term2226405.getClass(), "implementedInterfaces", null);
        setField(term2226405, term2226405.getClass(), "subTypes", null);
        setField(term2226405, term2226405.getClass(), "templateTypeName", null);
        setField(term2226405, term2226405.getClass(), "className", null);
        setField(term2226405, term2226405.getClass(), "properties", null);
        setField(term2226405, term2226405.getClass(), "implicitPrototype", null);
        setBooleanField(term2226405, term2226405.getClass(), "nativeType", false);
        setBooleanField(term2226405, term2226405.getClass(), "visited", false);
        setField(term2226405, term2226405.getClass(), "docInfo", null);
        setBooleanField(term2226405, term2226405.getClass(), "unknown", false);
        setBooleanField(term2226405, term2226405.getClass(), "resolved", false);
        setField(term2226405, term2226405.getClass(), "resolveResult", null);
        setField(term2226405, term2226405.getClass(), "registry", null);
        Class<? extends Object> term2227305 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2227304 = ((Class) term2227305).getDeclaredField((String) "INTERFACE");
        ((Field) term2227304).setAccessible(true);
        Object enum4151 = ((Field) term2227304).get((Object) null);
        term2226410 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2226414 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term2226410, term2226410.getClass(), "this$0", null);
        setField(term2226410, term2226410.getClass(), "call", null);
        setField(term2226410, term2226410.getClass(), "prototype", null);
        setField(term2226410, term2226410.getClass(), "kind", enum4151);
        setField(term2226414, term2226414.getClass(), "this$0", null);
        setField(term2226414, term2226414.getClass(), "call", null);
        setField(term2226414, term2226414.getClass(), "prototype", null);
        setField(term2226414, term2226414.getClass(), "kind", enum4151);
        setField(term2226414, term2226414.getClass(), "typeOfThis", null);
        setField(term2226414, term2226414.getClass(), "source", null);
        setField(term2226414, term2226414.getClass(), "implementedInterfaces", null);
        setField(term2226414, term2226414.getClass(), "subTypes", null);
        setField(term2226414, term2226414.getClass(), "templateTypeName", null);
        setField(term2226414, term2226414.getClass(), "className", null);
        setField(term2226414, term2226414.getClass(), "properties", null);
        setField(term2226414, term2226414.getClass(), "implicitPrototype", null);
        setBooleanField(term2226414, term2226414.getClass(), "nativeType", false);
        setBooleanField(term2226414, term2226414.getClass(), "visited", false);
        setField(term2226414, term2226414.getClass(), "docInfo", null);
        setBooleanField(term2226414, term2226414.getClass(), "unknown", false);
        setBooleanField(term2226414, term2226414.getClass(), "resolved", false);
        setField(term2226414, term2226414.getClass(), "resolveResult", null);
        setField(term2226414, term2226414.getClass(), "registry", null);
        setField(term2226410, term2226410.getClass(), "typeOfThis", term2226414);
        setField(term2226410, term2226410.getClass(), "source", null);
        setField(term2226410, term2226410.getClass(), "implementedInterfaces", null);
        setField(term2226410, term2226410.getClass(), "subTypes", null);
        setField(term2226410, term2226410.getClass(), "templateTypeName", null);
        setField(term2226410, term2226410.getClass(), "className", null);
        setField(term2226410, term2226410.getClass(), "properties", null);
        setField(term2226410, term2226410.getClass(), "implicitPrototype", null);
        setBooleanField(term2226410, term2226410.getClass(), "nativeType", false);
        setBooleanField(term2226410, term2226410.getClass(), "visited", false);
        setField(term2226410, term2226410.getClass(), "docInfo", null);
        setBooleanField(term2226410, term2226410.getClass(), "unknown", false);
        setBooleanField(term2226410, term2226410.getClass(), "resolved", false);
        setField(term2226410, term2226410.getClass(), "resolveResult", null);
        setField(term2226410, term2226410.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2223391;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term2222739, args);
        assertTrue(recursiveEquals(term2222739, term2226405));
        assertTrue(recursiveEquals(term2223391, term2226410));
        assertTrue(recursiveEquals(retValue, true));
    }

};


