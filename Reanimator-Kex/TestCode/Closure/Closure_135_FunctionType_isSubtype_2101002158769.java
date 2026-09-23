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

public class FunctionType_isSubtype_2101002158769 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term743605;
     Object term743955;
     Object term749156;
     Object term749161;

    public FunctionType_isSubtype_2101002158769() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term749167 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term749166 = ((Class) term749167).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term749166).setAccessible(true);
        Object enum1392 = ((Field) term749166).get((Object) null);
        term743605 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term743847 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term743605, term743605.getClass(), "kind", enum1392);
        setField(term743605, term743605.getClass(), "call", term743847);
        Class<? extends Object> term749467 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term749466 = ((Class) term749467).getDeclaredField((String) "ORDINARY");
        ((Field) term749466).setAccessible(true);
        Object enum1393 = ((Field) term749466).get((Object) null);
        term743955 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term743955, term743955.getClass(), "kind", enum1393);
        setField(term743955, term743955.getClass(), "call", null);
        Class<? extends Object> term749758 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term749757 = ((Class) term749758).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term749757).setAccessible(true);
        Object enum1394 = ((Field) term749757).get((Object) null);
        term749156 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term749157 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term749156, term749156.getClass(), "this$0", null);
        setField(term749157, term749157.getClass(), "parameters", null);
        setField(term749157, term749157.getClass(), "returnType", null);
        setBooleanField(term749157, term749157.getClass(), "resolved", false);
        setField(term749157, term749157.getClass(), "resolveResult", null);
        setField(term749157, term749157.getClass(), "registry", null);
        setField(term749156, term749156.getClass(), "call", term749157);
        setField(term749156, term749156.getClass(), "prototype", null);
        setField(term749156, term749156.getClass(), "kind", enum1394);
        setField(term749156, term749156.getClass(), "typeOfThis", null);
        setField(term749156, term749156.getClass(), "source", null);
        setField(term749156, term749156.getClass(), "implementedInterfaces", null);
        setField(term749156, term749156.getClass(), "subTypes", null);
        setField(term749156, term749156.getClass(), "templateTypeName", null);
        setField(term749156, term749156.getClass(), "className", null);
        setField(term749156, term749156.getClass(), "properties", null);
        setField(term749156, term749156.getClass(), "implicitPrototype", null);
        setBooleanField(term749156, term749156.getClass(), "nativeType", false);
        setBooleanField(term749156, term749156.getClass(), "visited", false);
        setField(term749156, term749156.getClass(), "docInfo", null);
        setBooleanField(term749156, term749156.getClass(), "unknown", false);
        setBooleanField(term749156, term749156.getClass(), "resolved", false);
        setField(term749156, term749156.getClass(), "resolveResult", null);
        setField(term749156, term749156.getClass(), "registry", null);
        Class<? extends Object> term750058 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term750057 = ((Class) term750058).getDeclaredField((String) "ORDINARY");
        ((Field) term750057).setAccessible(true);
        Object enum1395 = ((Field) term750057).get((Object) null);
        term749161 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term749161, term749161.getClass(), "this$0", null);
        setField(term749161, term749161.getClass(), "call", null);
        setField(term749161, term749161.getClass(), "prototype", null);
        setField(term749161, term749161.getClass(), "kind", enum1395);
        setField(term749161, term749161.getClass(), "typeOfThis", null);
        setField(term749161, term749161.getClass(), "source", null);
        setField(term749161, term749161.getClass(), "implementedInterfaces", null);
        setField(term749161, term749161.getClass(), "subTypes", null);
        setField(term749161, term749161.getClass(), "templateTypeName", null);
        setField(term749161, term749161.getClass(), "className", null);
        setField(term749161, term749161.getClass(), "properties", null);
        setField(term749161, term749161.getClass(), "implicitPrototype", null);
        setBooleanField(term749161, term749161.getClass(), "nativeType", false);
        setBooleanField(term749161, term749161.getClass(), "visited", false);
        setField(term749161, term749161.getClass(), "docInfo", null);
        setBooleanField(term749161, term749161.getClass(), "unknown", false);
        setBooleanField(term749161, term749161.getClass(), "resolved", false);
        setField(term749161, term749161.getClass(), "resolveResult", null);
        setField(term749161, term749161.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term743955;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term743605, args);
        assertTrue(recursiveEquals(term743605, term749156));
        assertTrue(recursiveEquals(term743955, term749161));
        assertTrue(recursiveEquals(retValue, false));
    }

};


