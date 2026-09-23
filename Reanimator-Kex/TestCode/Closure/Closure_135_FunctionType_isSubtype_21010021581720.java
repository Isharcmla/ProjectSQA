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

public class FunctionType_isSubtype_21010021581720 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2342291;
     Object term2342749;
     Object term2344209;
     Object term2344215;

    public FunctionType_isSubtype_21010021581720() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2344226 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2344225 = ((Class) term2344226).getDeclaredField((String) "ORDINARY");
        ((Field) term2344225).setAccessible(true);
        Object enum4379 = ((Field) term2344225).get((Object) null);
        term2342291 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2342547 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2342641 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term2342291, term2342291.getClass(), "kind", enum4379);
        setField(term2342547, term2342547.getClass(), "kind", enum4379);
        setField(term2342291, term2342291.getClass(), "typeOfThis", term2342547);
        setField(term2342291, term2342291.getClass(), "call", term2342641);
        Class<? extends Object> term2344517 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2344516 = ((Class) term2344517).getDeclaredField((String) "INTERFACE");
        ((Field) term2344516).setAccessible(true);
        Object enum4380 = ((Field) term2344516).get((Object) null);
        term2342749 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2342931 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term2343173 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term2342749, term2342749.getClass(), "kind", enum4379);
        setField(term2342931, term2342931.getClass(), "kind", enum4380);
        setField(term2342749, term2342749.getClass(), "typeOfThis", term2342931);
        setField(term2342749, term2342749.getClass(), "call", term2343173);
        Class<? extends Object> term2344811 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2344810 = ((Class) term2344811).getDeclaredField((String) "ORDINARY");
        ((Field) term2344810).setAccessible(true);
        Object enum4381 = ((Field) term2344810).get((Object) null);
        term2344209 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2344210 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term2344214 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term2344209, term2344209.getClass(), "this$0", null);
        setField(term2344210, term2344210.getClass(), "parameters", null);
        setField(term2344210, term2344210.getClass(), "returnType", null);
        setBooleanField(term2344210, term2344210.getClass(), "resolved", false);
        setField(term2344210, term2344210.getClass(), "resolveResult", null);
        setField(term2344210, term2344210.getClass(), "registry", null);
        setField(term2344209, term2344209.getClass(), "call", term2344210);
        setField(term2344209, term2344209.getClass(), "prototype", null);
        setField(term2344209, term2344209.getClass(), "kind", enum4381);
        setField(term2344214, term2344214.getClass(), "this$0", null);
        setField(term2344214, term2344214.getClass(), "call", null);
        setField(term2344214, term2344214.getClass(), "prototype", null);
        setField(term2344214, term2344214.getClass(), "kind", enum4381);
        setField(term2344214, term2344214.getClass(), "typeOfThis", null);
        setField(term2344214, term2344214.getClass(), "source", null);
        setField(term2344214, term2344214.getClass(), "implementedInterfaces", null);
        setField(term2344214, term2344214.getClass(), "subTypes", null);
        setField(term2344214, term2344214.getClass(), "templateTypeName", null);
        setField(term2344214, term2344214.getClass(), "className", null);
        setField(term2344214, term2344214.getClass(), "properties", null);
        setField(term2344214, term2344214.getClass(), "implicitPrototype", null);
        setBooleanField(term2344214, term2344214.getClass(), "nativeType", false);
        setBooleanField(term2344214, term2344214.getClass(), "visited", false);
        setField(term2344214, term2344214.getClass(), "docInfo", null);
        setBooleanField(term2344214, term2344214.getClass(), "unknown", false);
        setBooleanField(term2344214, term2344214.getClass(), "resolved", false);
        setField(term2344214, term2344214.getClass(), "resolveResult", null);
        setField(term2344214, term2344214.getClass(), "registry", null);
        setField(term2344209, term2344209.getClass(), "typeOfThis", term2344214);
        setField(term2344209, term2344209.getClass(), "source", null);
        setField(term2344209, term2344209.getClass(), "implementedInterfaces", null);
        setField(term2344209, term2344209.getClass(), "subTypes", null);
        setField(term2344209, term2344209.getClass(), "templateTypeName", null);
        setField(term2344209, term2344209.getClass(), "className", null);
        setField(term2344209, term2344209.getClass(), "properties", null);
        setField(term2344209, term2344209.getClass(), "implicitPrototype", null);
        setBooleanField(term2344209, term2344209.getClass(), "nativeType", false);
        setBooleanField(term2344209, term2344209.getClass(), "visited", false);
        setField(term2344209, term2344209.getClass(), "docInfo", null);
        setBooleanField(term2344209, term2344209.getClass(), "unknown", false);
        setBooleanField(term2344209, term2344209.getClass(), "resolved", false);
        setField(term2344209, term2344209.getClass(), "resolveResult", null);
        setField(term2344209, term2344209.getClass(), "registry", null);
        Class<? extends Object> term2345102 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2345101 = ((Class) term2345102).getDeclaredField((String) "ORDINARY");
        ((Field) term2345101).setAccessible(true);
        Object enum4382 = ((Field) term2345101).get((Object) null);
        Class<? extends Object> term2345393 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2345392 = ((Class) term2345393).getDeclaredField((String) "INTERFACE");
        ((Field) term2345392).setAccessible(true);
        Object enum4383 = ((Field) term2345392).get((Object) null);
        term2344215 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2344216 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term2344220 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term2344215, term2344215.getClass(), "this$0", null);
        setField(term2344216, term2344216.getClass(), "parameters", null);
        setField(term2344216, term2344216.getClass(), "returnType", null);
        setBooleanField(term2344216, term2344216.getClass(), "resolved", false);
        setField(term2344216, term2344216.getClass(), "resolveResult", null);
        setField(term2344216, term2344216.getClass(), "registry", null);
        setField(term2344215, term2344215.getClass(), "call", term2344216);
        setField(term2344215, term2344215.getClass(), "prototype", null);
        setField(term2344215, term2344215.getClass(), "kind", enum4382);
        setField(term2344220, term2344220.getClass(), "this$0", null);
        setField(term2344220, term2344220.getClass(), "call", null);
        setField(term2344220, term2344220.getClass(), "prototype", null);
        setField(term2344220, term2344220.getClass(), "kind", enum4383);
        setField(term2344220, term2344220.getClass(), "typeOfThis", null);
        setField(term2344220, term2344220.getClass(), "source", null);
        setField(term2344220, term2344220.getClass(), "implementedInterfaces", null);
        setField(term2344220, term2344220.getClass(), "subTypes", null);
        setField(term2344220, term2344220.getClass(), "templateTypeName", null);
        setField(term2344220, term2344220.getClass(), "className", null);
        setField(term2344220, term2344220.getClass(), "properties", null);
        setField(term2344220, term2344220.getClass(), "implicitPrototype", null);
        setBooleanField(term2344220, term2344220.getClass(), "nativeType", false);
        setBooleanField(term2344220, term2344220.getClass(), "visited", false);
        setField(term2344220, term2344220.getClass(), "docInfo", null);
        setBooleanField(term2344220, term2344220.getClass(), "unknown", false);
        setBooleanField(term2344220, term2344220.getClass(), "resolved", false);
        setField(term2344220, term2344220.getClass(), "resolveResult", null);
        setField(term2344220, term2344220.getClass(), "registry", null);
        setField(term2344215, term2344215.getClass(), "typeOfThis", term2344220);
        setField(term2344215, term2344215.getClass(), "source", null);
        setField(term2344215, term2344215.getClass(), "implementedInterfaces", null);
        setField(term2344215, term2344215.getClass(), "subTypes", null);
        setField(term2344215, term2344215.getClass(), "templateTypeName", null);
        setField(term2344215, term2344215.getClass(), "className", null);
        setField(term2344215, term2344215.getClass(), "properties", null);
        setField(term2344215, term2344215.getClass(), "implicitPrototype", null);
        setBooleanField(term2344215, term2344215.getClass(), "nativeType", false);
        setBooleanField(term2344215, term2344215.getClass(), "visited", false);
        setField(term2344215, term2344215.getClass(), "docInfo", null);
        setBooleanField(term2344215, term2344215.getClass(), "unknown", false);
        setBooleanField(term2344215, term2344215.getClass(), "resolved", false);
        setField(term2344215, term2344215.getClass(), "resolveResult", null);
        setField(term2344215, term2344215.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2342749;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term2342291, args);
        assertTrue(recursiveEquals(term2342291, term2344209));
        assertTrue(recursiveEquals(term2342749, term2344215));
        assertTrue(recursiveEquals(retValue, true));
    }

};


