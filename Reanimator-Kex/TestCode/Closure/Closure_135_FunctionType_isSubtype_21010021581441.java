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

public class FunctionType_isSubtype_21010021581441 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1869992;
     Object term1870744;
     Object term1871880;
     Object term1871886;

    public FunctionType_isSubtype_21010021581441() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1871897 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1871896 = ((Class) term1871897).getDeclaredField((String) "ORDINARY");
        ((Field) term1871896).setAccessible(true);
        Object enum3485 = ((Field) term1871896).get((Object) null);
        term1869992 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1870536 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1871124 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1869992, term1869992.getClass(), "kind", enum3485);
        setField(term1870536, term1870536.getClass(), "kind", enum3485);
        setField(term1870536, term1870536.getClass(), "typeOfThis", term1871124);
        setField(term1869992, term1869992.getClass(), "typeOfThis", term1870536);
        Class<? extends Object> term1872188 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1872187 = ((Class) term1872188).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1872187).setAccessible(true);
        Object enum3486 = ((Field) term1872187).get((Object) null);
        term1870744 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1870926 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1870744, term1870744.getClass(), "kind", enum3486);
        setField(term1870926, term1870926.getClass(), "kind", enum3485);
        setField(term1870926, term1870926.getClass(), "typeOfThis", term1871124);
        setField(term1870744, term1870744.getClass(), "typeOfThis", term1870926);
        Class<? extends Object> term1872488 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1872487 = ((Class) term1872488).getDeclaredField((String) "INTERFACE");
        ((Field) term1872487).setAccessible(true);
        Object enum3487 = ((Field) term1872487).get((Object) null);
        term1871880 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1871884 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1871885 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1871880, term1871880.getClass(), "this$0", null);
        setField(term1871880, term1871880.getClass(), "call", null);
        setField(term1871880, term1871880.getClass(), "prototype", null);
        setField(term1871880, term1871880.getClass(), "kind", enum3487);
        setField(term1871884, term1871884.getClass(), "call", null);
        setField(term1871884, term1871884.getClass(), "prototype", null);
        setField(term1871884, term1871884.getClass(), "kind", enum3487);
        setField(term1871885, term1871885.getClass(), "call", null);
        setField(term1871885, term1871885.getClass(), "prototype", null);
        setField(term1871885, term1871885.getClass(), "kind", null);
        setField(term1871885, term1871885.getClass(), "typeOfThis", null);
        setField(term1871885, term1871885.getClass(), "source", null);
        setField(term1871885, term1871885.getClass(), "implementedInterfaces", null);
        setField(term1871885, term1871885.getClass(), "subTypes", null);
        setField(term1871885, term1871885.getClass(), "templateTypeName", null);
        setField(term1871885, term1871885.getClass(), "className", null);
        setField(term1871885, term1871885.getClass(), "properties", null);
        setField(term1871885, term1871885.getClass(), "implicitPrototype", null);
        setBooleanField(term1871885, term1871885.getClass(), "nativeType", false);
        setBooleanField(term1871885, term1871885.getClass(), "visited", false);
        setField(term1871885, term1871885.getClass(), "docInfo", null);
        setBooleanField(term1871885, term1871885.getClass(), "unknown", false);
        setBooleanField(term1871885, term1871885.getClass(), "resolved", false);
        setField(term1871885, term1871885.getClass(), "resolveResult", null);
        setField(term1871885, term1871885.getClass(), "registry", null);
        setField(term1871884, term1871884.getClass(), "typeOfThis", term1871885);
        setField(term1871884, term1871884.getClass(), "source", null);
        setField(term1871884, term1871884.getClass(), "implementedInterfaces", null);
        setField(term1871884, term1871884.getClass(), "subTypes", null);
        setField(term1871884, term1871884.getClass(), "templateTypeName", null);
        setField(term1871884, term1871884.getClass(), "className", null);
        setField(term1871884, term1871884.getClass(), "properties", null);
        setField(term1871884, term1871884.getClass(), "implicitPrototype", null);
        setBooleanField(term1871884, term1871884.getClass(), "nativeType", false);
        setBooleanField(term1871884, term1871884.getClass(), "visited", false);
        setField(term1871884, term1871884.getClass(), "docInfo", null);
        setBooleanField(term1871884, term1871884.getClass(), "unknown", false);
        setBooleanField(term1871884, term1871884.getClass(), "resolved", false);
        setField(term1871884, term1871884.getClass(), "resolveResult", null);
        setField(term1871884, term1871884.getClass(), "registry", null);
        setField(term1871880, term1871880.getClass(), "typeOfThis", term1871884);
        setField(term1871880, term1871880.getClass(), "source", null);
        setField(term1871880, term1871880.getClass(), "implementedInterfaces", null);
        setField(term1871880, term1871880.getClass(), "subTypes", null);
        setField(term1871880, term1871880.getClass(), "templateTypeName", null);
        setField(term1871880, term1871880.getClass(), "className", null);
        setField(term1871880, term1871880.getClass(), "properties", null);
        setField(term1871880, term1871880.getClass(), "implicitPrototype", null);
        setBooleanField(term1871880, term1871880.getClass(), "nativeType", false);
        setBooleanField(term1871880, term1871880.getClass(), "visited", false);
        setField(term1871880, term1871880.getClass(), "docInfo", null);
        setBooleanField(term1871880, term1871880.getClass(), "unknown", false);
        setBooleanField(term1871880, term1871880.getClass(), "resolved", false);
        setField(term1871880, term1871880.getClass(), "resolveResult", null);
        setField(term1871880, term1871880.getClass(), "registry", null);
        Class<? extends Object> term1872782 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1872781 = ((Class) term1872782).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1872781).setAccessible(true);
        Object enum3488 = ((Field) term1872781).get((Object) null);
        Class<? extends Object> term1873082 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1873081 = ((Class) term1873082).getDeclaredField((String) "INTERFACE");
        ((Field) term1873081).setAccessible(true);
        Object enum3489 = ((Field) term1873081).get((Object) null);
        term1871886 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1871890 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1871894 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1871886, term1871886.getClass(), "this$0", null);
        setField(term1871886, term1871886.getClass(), "call", null);
        setField(term1871886, term1871886.getClass(), "prototype", null);
        setField(term1871886, term1871886.getClass(), "kind", enum3488);
        setField(term1871890, term1871890.getClass(), "this$0", null);
        setField(term1871890, term1871890.getClass(), "call", null);
        setField(term1871890, term1871890.getClass(), "prototype", null);
        setField(term1871890, term1871890.getClass(), "kind", enum3489);
        setField(term1871894, term1871894.getClass(), "call", null);
        setField(term1871894, term1871894.getClass(), "prototype", null);
        setField(term1871894, term1871894.getClass(), "kind", null);
        setField(term1871894, term1871894.getClass(), "typeOfThis", null);
        setField(term1871894, term1871894.getClass(), "source", null);
        setField(term1871894, term1871894.getClass(), "implementedInterfaces", null);
        setField(term1871894, term1871894.getClass(), "subTypes", null);
        setField(term1871894, term1871894.getClass(), "templateTypeName", null);
        setField(term1871894, term1871894.getClass(), "className", null);
        setField(term1871894, term1871894.getClass(), "properties", null);
        setField(term1871894, term1871894.getClass(), "implicitPrototype", null);
        setBooleanField(term1871894, term1871894.getClass(), "nativeType", false);
        setBooleanField(term1871894, term1871894.getClass(), "visited", false);
        setField(term1871894, term1871894.getClass(), "docInfo", null);
        setBooleanField(term1871894, term1871894.getClass(), "unknown", false);
        setBooleanField(term1871894, term1871894.getClass(), "resolved", false);
        setField(term1871894, term1871894.getClass(), "resolveResult", null);
        setField(term1871894, term1871894.getClass(), "registry", null);
        setField(term1871890, term1871890.getClass(), "typeOfThis", term1871894);
        setField(term1871890, term1871890.getClass(), "source", null);
        setField(term1871890, term1871890.getClass(), "implementedInterfaces", null);
        setField(term1871890, term1871890.getClass(), "subTypes", null);
        setField(term1871890, term1871890.getClass(), "templateTypeName", null);
        setField(term1871890, term1871890.getClass(), "className", null);
        setField(term1871890, term1871890.getClass(), "properties", null);
        setField(term1871890, term1871890.getClass(), "implicitPrototype", null);
        setBooleanField(term1871890, term1871890.getClass(), "nativeType", false);
        setBooleanField(term1871890, term1871890.getClass(), "visited", false);
        setField(term1871890, term1871890.getClass(), "docInfo", null);
        setBooleanField(term1871890, term1871890.getClass(), "unknown", false);
        setBooleanField(term1871890, term1871890.getClass(), "resolved", false);
        setField(term1871890, term1871890.getClass(), "resolveResult", null);
        setField(term1871890, term1871890.getClass(), "registry", null);
        setField(term1871886, term1871886.getClass(), "typeOfThis", term1871890);
        setField(term1871886, term1871886.getClass(), "source", null);
        setField(term1871886, term1871886.getClass(), "implementedInterfaces", null);
        setField(term1871886, term1871886.getClass(), "subTypes", null);
        setField(term1871886, term1871886.getClass(), "templateTypeName", null);
        setField(term1871886, term1871886.getClass(), "className", null);
        setField(term1871886, term1871886.getClass(), "properties", null);
        setField(term1871886, term1871886.getClass(), "implicitPrototype", null);
        setBooleanField(term1871886, term1871886.getClass(), "nativeType", false);
        setBooleanField(term1871886, term1871886.getClass(), "visited", false);
        setField(term1871886, term1871886.getClass(), "docInfo", null);
        setBooleanField(term1871886, term1871886.getClass(), "unknown", false);
        setBooleanField(term1871886, term1871886.getClass(), "resolved", false);
        setField(term1871886, term1871886.getClass(), "resolveResult", null);
        setField(term1871886, term1871886.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1870744;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term1869992, args);
        assertTrue(recursiveEquals(term1869992, term1871880));
        assertTrue(recursiveEquals(term1870744, term1871886));
        assertTrue(recursiveEquals(retValue, false));
    }

};


