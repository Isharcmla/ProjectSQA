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

public class FunctionType_isSubtype_2101002158731 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term686059;
     Object term686711;
     Object term687608;
     Object term687616;

    public FunctionType_isSubtype_2101002158731() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term687623 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term687622 = ((Class) term687623).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term687622).setAccessible(true);
        Object enum1274 = ((Field) term687622).get((Object) null);
        Class<? extends Object> term687923 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term687922 = ((Class) term687923).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term687922).setAccessible(true);
        Object enum1275 = ((Field) term687922).get((Object) null);
        term686059 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term686603 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term686059, term686059.getClass(), "kind", enum1274);
        setField(term686603, term686603.getClass(), "kind", enum1275);
        setField(term686059, term686059.getClass(), "typeOfThis", term686603);
        term686711 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term686893 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term686711, term686711.getClass(), "kind", enum1275);
        setField(term686711, term686711.getClass(), "typeOfThis", term686893);
        Class<? extends Object> term688223 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term688222 = ((Class) term688223).getDeclaredField((String) "INTERFACE");
        ((Field) term688222).setAccessible(true);
        Object enum1276 = ((Field) term688222).get((Object) null);
        Class<? extends Object> term688517 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term688516 = ((Class) term688517).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term688516).setAccessible(true);
        Object enum1277 = ((Field) term688516).get((Object) null);
        term687608 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term687612 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term687608, term687608.getClass(), "this$0", null);
        setField(term687608, term687608.getClass(), "call", null);
        setField(term687608, term687608.getClass(), "prototype", null);
        setField(term687608, term687608.getClass(), "kind", enum1276);
        setField(term687612, term687612.getClass(), "call", null);
        setField(term687612, term687612.getClass(), "prototype", null);
        setField(term687612, term687612.getClass(), "kind", enum1277);
        setField(term687612, term687612.getClass(), "typeOfThis", null);
        setField(term687612, term687612.getClass(), "source", null);
        setField(term687612, term687612.getClass(), "implementedInterfaces", null);
        setField(term687612, term687612.getClass(), "subTypes", null);
        setField(term687612, term687612.getClass(), "templateTypeName", null);
        setField(term687612, term687612.getClass(), "className", null);
        setField(term687612, term687612.getClass(), "properties", null);
        setField(term687612, term687612.getClass(), "implicitPrototype", null);
        setBooleanField(term687612, term687612.getClass(), "nativeType", false);
        setBooleanField(term687612, term687612.getClass(), "visited", false);
        setField(term687612, term687612.getClass(), "docInfo", null);
        setBooleanField(term687612, term687612.getClass(), "unknown", false);
        setBooleanField(term687612, term687612.getClass(), "resolved", false);
        setField(term687612, term687612.getClass(), "resolveResult", null);
        setField(term687612, term687612.getClass(), "registry", null);
        setField(term687608, term687608.getClass(), "typeOfThis", term687612);
        setField(term687608, term687608.getClass(), "source", null);
        setField(term687608, term687608.getClass(), "implementedInterfaces", null);
        setField(term687608, term687608.getClass(), "subTypes", null);
        setField(term687608, term687608.getClass(), "templateTypeName", null);
        setField(term687608, term687608.getClass(), "className", null);
        setField(term687608, term687608.getClass(), "properties", null);
        setField(term687608, term687608.getClass(), "implicitPrototype", null);
        setBooleanField(term687608, term687608.getClass(), "nativeType", false);
        setBooleanField(term687608, term687608.getClass(), "visited", false);
        setField(term687608, term687608.getClass(), "docInfo", null);
        setBooleanField(term687608, term687608.getClass(), "unknown", false);
        setBooleanField(term687608, term687608.getClass(), "resolved", false);
        setField(term687608, term687608.getClass(), "resolveResult", null);
        setField(term687608, term687608.getClass(), "registry", null);
        Class<? extends Object> term688817 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term688816 = ((Class) term688817).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term688816).setAccessible(true);
        Object enum1278 = ((Field) term688816).get((Object) null);
        term687616 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term687620 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term687616, term687616.getClass(), "this$0", null);
        setField(term687616, term687616.getClass(), "call", null);
        setField(term687616, term687616.getClass(), "prototype", null);
        setField(term687616, term687616.getClass(), "kind", enum1278);
        setField(term687620, term687620.getClass(), "this$0", null);
        setField(term687620, term687620.getClass(), "call", null);
        setField(term687620, term687620.getClass(), "prototype", null);
        setField(term687620, term687620.getClass(), "kind", null);
        setField(term687620, term687620.getClass(), "typeOfThis", null);
        setField(term687620, term687620.getClass(), "source", null);
        setField(term687620, term687620.getClass(), "implementedInterfaces", null);
        setField(term687620, term687620.getClass(), "subTypes", null);
        setField(term687620, term687620.getClass(), "templateTypeName", null);
        setField(term687620, term687620.getClass(), "className", null);
        setField(term687620, term687620.getClass(), "properties", null);
        setField(term687620, term687620.getClass(), "implicitPrototype", null);
        setBooleanField(term687620, term687620.getClass(), "nativeType", false);
        setBooleanField(term687620, term687620.getClass(), "visited", false);
        setField(term687620, term687620.getClass(), "docInfo", null);
        setBooleanField(term687620, term687620.getClass(), "unknown", false);
        setBooleanField(term687620, term687620.getClass(), "resolved", false);
        setField(term687620, term687620.getClass(), "resolveResult", null);
        setField(term687620, term687620.getClass(), "registry", null);
        setField(term687616, term687616.getClass(), "typeOfThis", term687620);
        setField(term687616, term687616.getClass(), "source", null);
        setField(term687616, term687616.getClass(), "implementedInterfaces", null);
        setField(term687616, term687616.getClass(), "subTypes", null);
        setField(term687616, term687616.getClass(), "templateTypeName", null);
        setField(term687616, term687616.getClass(), "className", null);
        setField(term687616, term687616.getClass(), "properties", null);
        setField(term687616, term687616.getClass(), "implicitPrototype", null);
        setBooleanField(term687616, term687616.getClass(), "nativeType", false);
        setBooleanField(term687616, term687616.getClass(), "visited", false);
        setField(term687616, term687616.getClass(), "docInfo", null);
        setBooleanField(term687616, term687616.getClass(), "unknown", false);
        setBooleanField(term687616, term687616.getClass(), "resolved", false);
        setField(term687616, term687616.getClass(), "resolveResult", null);
        setField(term687616, term687616.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term686711;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term686059, args);
        assertTrue(recursiveEquals(term686059, term687608));
        assertTrue(recursiveEquals(term686711, term687616));
        assertTrue(recursiveEquals(retValue, false));
    }

};


