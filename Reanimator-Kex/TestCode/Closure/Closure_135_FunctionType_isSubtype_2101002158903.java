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

public class FunctionType_isSubtype_2101002158903 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term968496;
     Object term969094;
     Object term970608;
     Object term970617;

    public FunctionType_isSubtype_2101002158903() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term970627 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term970626 = ((Class) term970627).getDeclaredField((String) "ORDINARY");
        ((Field) term970626).setAccessible(true);
        Object enum1807 = ((Field) term970626).get((Object) null);
        Class<? extends Object> term970918 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term970917 = ((Class) term970918).getDeclaredField((String) "INTERFACE");
        ((Field) term970917).setAccessible(true);
        Object enum1808 = ((Field) term970917).get((Object) null);
        term968496 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term968744 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term968986 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term968496, term968496.getClass(), "kind", enum1807);
        setField(term968744, term968744.getClass(), "kind", enum1808);
        setField(term968744, term968744.getClass(), "className", null);
        setField(term968496, term968496.getClass(), "typeOfThis", term968744);
        setField(term968496, term968496.getClass(), "call", term968986);
        Class<? extends Object> term971212 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term971211 = ((Class) term971212).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term971211).setAccessible(true);
        Object enum1809 = ((Field) term971211).get((Object) null);
        term969094 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term969350 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term969094, term969094.getClass(), "kind", enum1809);
        setField(term969350, term969350.getClass(), "kind", enum1808);
        setField(term969350, term969350.getClass(), "className", null);
        setField(term969094, term969094.getClass(), "typeOfThis", term969350);
        setField(term969094, term969094.getClass(), "call", null);
        Class<? extends Object> term971512 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term971511 = ((Class) term971512).getDeclaredField((String) "ORDINARY");
        ((Field) term971511).setAccessible(true);
        Object enum1810 = ((Field) term971511).get((Object) null);
        Class<? extends Object> term971803 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term971802 = ((Class) term971803).getDeclaredField((String) "INTERFACE");
        ((Field) term971802).setAccessible(true);
        Object enum1811 = ((Field) term971802).get((Object) null);
        term970608 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term970609 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term970613 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term970608, term970608.getClass(), "this$0", null);
        setField(term970609, term970609.getClass(), "parameters", null);
        setField(term970609, term970609.getClass(), "returnType", null);
        setBooleanField(term970609, term970609.getClass(), "resolved", false);
        setField(term970609, term970609.getClass(), "resolveResult", null);
        setField(term970609, term970609.getClass(), "registry", null);
        setField(term970608, term970608.getClass(), "call", term970609);
        setField(term970608, term970608.getClass(), "prototype", null);
        setField(term970608, term970608.getClass(), "kind", enum1810);
        setField(term970613, term970613.getClass(), "call", null);
        setField(term970613, term970613.getClass(), "prototype", null);
        setField(term970613, term970613.getClass(), "kind", enum1811);
        setField(term970613, term970613.getClass(), "typeOfThis", null);
        setField(term970613, term970613.getClass(), "source", null);
        setField(term970613, term970613.getClass(), "implementedInterfaces", null);
        setField(term970613, term970613.getClass(), "subTypes", null);
        setField(term970613, term970613.getClass(), "templateTypeName", null);
        setField(term970613, term970613.getClass(), "className", null);
        setField(term970613, term970613.getClass(), "properties", null);
        setField(term970613, term970613.getClass(), "implicitPrototype", null);
        setBooleanField(term970613, term970613.getClass(), "nativeType", false);
        setBooleanField(term970613, term970613.getClass(), "visited", false);
        setField(term970613, term970613.getClass(), "docInfo", null);
        setBooleanField(term970613, term970613.getClass(), "unknown", false);
        setBooleanField(term970613, term970613.getClass(), "resolved", false);
        setField(term970613, term970613.getClass(), "resolveResult", null);
        setField(term970613, term970613.getClass(), "registry", null);
        setField(term970608, term970608.getClass(), "typeOfThis", term970613);
        setField(term970608, term970608.getClass(), "source", null);
        setField(term970608, term970608.getClass(), "implementedInterfaces", null);
        setField(term970608, term970608.getClass(), "subTypes", null);
        setField(term970608, term970608.getClass(), "templateTypeName", null);
        setField(term970608, term970608.getClass(), "className", null);
        setField(term970608, term970608.getClass(), "properties", null);
        setField(term970608, term970608.getClass(), "implicitPrototype", null);
        setBooleanField(term970608, term970608.getClass(), "nativeType", false);
        setBooleanField(term970608, term970608.getClass(), "visited", false);
        setField(term970608, term970608.getClass(), "docInfo", null);
        setBooleanField(term970608, term970608.getClass(), "unknown", false);
        setBooleanField(term970608, term970608.getClass(), "resolved", false);
        setField(term970608, term970608.getClass(), "resolveResult", null);
        setField(term970608, term970608.getClass(), "registry", null);
        Class<? extends Object> term972097 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term972096 = ((Class) term972097).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term972096).setAccessible(true);
        Object enum1812 = ((Field) term972096).get((Object) null);
        Class<? extends Object> term972397 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term972396 = ((Class) term972397).getDeclaredField((String) "INTERFACE");
        ((Field) term972396).setAccessible(true);
        Object enum1813 = ((Field) term972396).get((Object) null);
        term970617 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term970621 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term970617, term970617.getClass(), "this$0", null);
        setField(term970617, term970617.getClass(), "call", null);
        setField(term970617, term970617.getClass(), "prototype", null);
        setField(term970617, term970617.getClass(), "kind", enum1812);
        setField(term970621, term970621.getClass(), "this$0", null);
        setField(term970621, term970621.getClass(), "call", null);
        setField(term970621, term970621.getClass(), "prototype", null);
        setField(term970621, term970621.getClass(), "kind", enum1813);
        setField(term970621, term970621.getClass(), "typeOfThis", null);
        setField(term970621, term970621.getClass(), "source", null);
        setField(term970621, term970621.getClass(), "implementedInterfaces", null);
        setField(term970621, term970621.getClass(), "subTypes", null);
        setField(term970621, term970621.getClass(), "templateTypeName", null);
        setField(term970621, term970621.getClass(), "className", null);
        setField(term970621, term970621.getClass(), "properties", null);
        setField(term970621, term970621.getClass(), "implicitPrototype", null);
        setBooleanField(term970621, term970621.getClass(), "nativeType", false);
        setBooleanField(term970621, term970621.getClass(), "visited", false);
        setField(term970621, term970621.getClass(), "docInfo", null);
        setBooleanField(term970621, term970621.getClass(), "unknown", false);
        setBooleanField(term970621, term970621.getClass(), "resolved", false);
        setField(term970621, term970621.getClass(), "resolveResult", null);
        setField(term970621, term970621.getClass(), "registry", null);
        setField(term970617, term970617.getClass(), "typeOfThis", term970621);
        setField(term970617, term970617.getClass(), "source", null);
        setField(term970617, term970617.getClass(), "implementedInterfaces", null);
        setField(term970617, term970617.getClass(), "subTypes", null);
        setField(term970617, term970617.getClass(), "templateTypeName", null);
        setField(term970617, term970617.getClass(), "className", null);
        setField(term970617, term970617.getClass(), "properties", null);
        setField(term970617, term970617.getClass(), "implicitPrototype", null);
        setBooleanField(term970617, term970617.getClass(), "nativeType", false);
        setBooleanField(term970617, term970617.getClass(), "visited", false);
        setField(term970617, term970617.getClass(), "docInfo", null);
        setBooleanField(term970617, term970617.getClass(), "unknown", false);
        setBooleanField(term970617, term970617.getClass(), "resolved", false);
        setField(term970617, term970617.getClass(), "resolveResult", null);
        setField(term970617, term970617.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term969094;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term968496, args);
        assertTrue(recursiveEquals(term968496, term970608));
        assertTrue(recursiveEquals(term969094, term970617));
        assertTrue(recursiveEquals(retValue, false));
    }

};


