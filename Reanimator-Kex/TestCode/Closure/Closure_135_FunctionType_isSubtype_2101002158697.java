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

public class FunctionType_isSubtype_2101002158697 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term637771;
     Object term638423;
     Object term640999;
     Object term641004;

    public FunctionType_isSubtype_2101002158697() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term641014 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term641013 = ((Class) term641014).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term641013).setAccessible(true);
        Object enum1191 = ((Field) term641013).get((Object) null);
        term637771 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term638315 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term637771, term637771.getClass(), "kind", enum1191);
        setField(term638315, term638315.getClass(), "kind", enum1191);
        setField(term637771, term637771.getClass(), "typeOfThis", term638315);
        Class<? extends Object> term641314 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term641313 = ((Class) term641314).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term641313).setAccessible(true);
        Object enum1192 = ((Field) term641313).get((Object) null);
        Class<? extends Object> term641614 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term641613 = ((Class) term641614).getDeclaredField((String) "INTERFACE");
        ((Field) term641613).setAccessible(true);
        Object enum1193 = ((Field) term641613).get((Object) null);
        term638423 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term638597 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term638423, term638423.getClass(), "kind", enum1192);
        setField(term638597, term638597.getClass(), "kind", enum1193);
        setField(term638423, term638423.getClass(), "typeOfThis", term638597);
        Class<? extends Object> term641908 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term641907 = ((Class) term641908).getDeclaredField((String) "INTERFACE");
        ((Field) term641907).setAccessible(true);
        Object enum1194 = ((Field) term641907).get((Object) null);
        term640999 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term641003 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term640999, term640999.getClass(), "this$0", null);
        setField(term640999, term640999.getClass(), "call", null);
        setField(term640999, term640999.getClass(), "prototype", null);
        setField(term640999, term640999.getClass(), "kind", enum1194);
        setField(term641003, term641003.getClass(), "call", null);
        setField(term641003, term641003.getClass(), "prototype", null);
        setField(term641003, term641003.getClass(), "kind", enum1194);
        setField(term641003, term641003.getClass(), "typeOfThis", null);
        setField(term641003, term641003.getClass(), "source", null);
        setField(term641003, term641003.getClass(), "implementedInterfaces", null);
        setField(term641003, term641003.getClass(), "subTypes", null);
        setField(term641003, term641003.getClass(), "templateTypeName", null);
        setField(term641003, term641003.getClass(), "className", null);
        setField(term641003, term641003.getClass(), "properties", null);
        setField(term641003, term641003.getClass(), "implicitPrototype", null);
        setBooleanField(term641003, term641003.getClass(), "nativeType", false);
        setBooleanField(term641003, term641003.getClass(), "visited", false);
        setField(term641003, term641003.getClass(), "docInfo", null);
        setBooleanField(term641003, term641003.getClass(), "unknown", false);
        setBooleanField(term641003, term641003.getClass(), "resolved", false);
        setField(term641003, term641003.getClass(), "resolveResult", null);
        setField(term641003, term641003.getClass(), "registry", null);
        setField(term640999, term640999.getClass(), "typeOfThis", term641003);
        setField(term640999, term640999.getClass(), "source", null);
        setField(term640999, term640999.getClass(), "implementedInterfaces", null);
        setField(term640999, term640999.getClass(), "subTypes", null);
        setField(term640999, term640999.getClass(), "templateTypeName", null);
        setField(term640999, term640999.getClass(), "className", null);
        setField(term640999, term640999.getClass(), "properties", null);
        setField(term640999, term640999.getClass(), "implicitPrototype", null);
        setBooleanField(term640999, term640999.getClass(), "nativeType", false);
        setBooleanField(term640999, term640999.getClass(), "visited", false);
        setField(term640999, term640999.getClass(), "docInfo", null);
        setBooleanField(term640999, term640999.getClass(), "unknown", false);
        setBooleanField(term640999, term640999.getClass(), "resolved", false);
        setField(term640999, term640999.getClass(), "resolveResult", null);
        setField(term640999, term640999.getClass(), "registry", null);
        Class<? extends Object> term642202 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term642201 = ((Class) term642202).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term642201).setAccessible(true);
        Object enum1195 = ((Field) term642201).get((Object) null);
        Class<? extends Object> term642502 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term642501 = ((Class) term642502).getDeclaredField((String) "INTERFACE");
        ((Field) term642501).setAccessible(true);
        Object enum1196 = ((Field) term642501).get((Object) null);
        term641004 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term641008 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term641004, term641004.getClass(), "this$0", null);
        setField(term641004, term641004.getClass(), "call", null);
        setField(term641004, term641004.getClass(), "prototype", null);
        setField(term641004, term641004.getClass(), "kind", enum1195);
        setField(term641008, term641008.getClass(), "call", null);
        setField(term641008, term641008.getClass(), "prototype", null);
        setField(term641008, term641008.getClass(), "kind", enum1196);
        setField(term641008, term641008.getClass(), "typeOfThis", null);
        setField(term641008, term641008.getClass(), "source", null);
        setField(term641008, term641008.getClass(), "implementedInterfaces", null);
        setField(term641008, term641008.getClass(), "subTypes", null);
        setField(term641008, term641008.getClass(), "templateTypeName", null);
        setField(term641008, term641008.getClass(), "className", null);
        setField(term641008, term641008.getClass(), "properties", null);
        setField(term641008, term641008.getClass(), "implicitPrototype", null);
        setBooleanField(term641008, term641008.getClass(), "nativeType", false);
        setBooleanField(term641008, term641008.getClass(), "visited", false);
        setField(term641008, term641008.getClass(), "docInfo", null);
        setBooleanField(term641008, term641008.getClass(), "unknown", false);
        setBooleanField(term641008, term641008.getClass(), "resolved", false);
        setField(term641008, term641008.getClass(), "resolveResult", null);
        setField(term641008, term641008.getClass(), "registry", null);
        setField(term641004, term641004.getClass(), "typeOfThis", term641008);
        setField(term641004, term641004.getClass(), "source", null);
        setField(term641004, term641004.getClass(), "implementedInterfaces", null);
        setField(term641004, term641004.getClass(), "subTypes", null);
        setField(term641004, term641004.getClass(), "templateTypeName", null);
        setField(term641004, term641004.getClass(), "className", null);
        setField(term641004, term641004.getClass(), "properties", null);
        setField(term641004, term641004.getClass(), "implicitPrototype", null);
        setBooleanField(term641004, term641004.getClass(), "nativeType", false);
        setBooleanField(term641004, term641004.getClass(), "visited", false);
        setField(term641004, term641004.getClass(), "docInfo", null);
        setBooleanField(term641004, term641004.getClass(), "unknown", false);
        setBooleanField(term641004, term641004.getClass(), "resolved", false);
        setField(term641004, term641004.getClass(), "resolveResult", null);
        setField(term641004, term641004.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term638423;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term637771, args);
        assertTrue(recursiveEquals(term637771, term640999));
        assertTrue(recursiveEquals(term638423, term641004));
        assertTrue(recursiveEquals(retValue, false));
    }

};


