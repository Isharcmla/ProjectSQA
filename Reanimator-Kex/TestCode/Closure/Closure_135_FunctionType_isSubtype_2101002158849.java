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

public class FunctionType_isSubtype_2101002158849 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term875345;
     Object term875795;
     Object term876806;
     Object term876812;

    public FunctionType_isSubtype_2101002158849() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term876819 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term876818 = ((Class) term876819).getDeclaredField((String) "ORDINARY");
        ((Field) term876818).setAccessible(true);
        Object enum1633 = ((Field) term876818).get((Object) null);
        term875345 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term875593 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term875687 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term875345, term875345.getClass(), "kind", enum1633);
        setField(term875345, term875345.getClass(), "typeOfThis", term875593);
        setField(term875345, term875345.getClass(), "call", term875687);
        Class<? extends Object> term877110 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term877109 = ((Class) term877110).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term877109).setAccessible(true);
        Object enum1634 = ((Field) term877109).get((Object) null);
        term875795 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term876049 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        setField(term875795, term875795.getClass(), "kind", enum1634);
        setField(term875795, term875795.getClass(), "typeOfThis", term876049);
        setField(term875795, term875795.getClass(), "call", null);
        Class<? extends Object> term877410 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term877409 = ((Class) term877410).getDeclaredField((String) "ORDINARY");
        ((Field) term877409).setAccessible(true);
        Object enum1635 = ((Field) term877409).get((Object) null);
        term876806 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term876807 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term876811 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term876806, term876806.getClass(), "this$0", null);
        setField(term876807, term876807.getClass(), "parameters", null);
        setField(term876807, term876807.getClass(), "returnType", null);
        setBooleanField(term876807, term876807.getClass(), "resolved", false);
        setField(term876807, term876807.getClass(), "resolveResult", null);
        setField(term876807, term876807.getClass(), "registry", null);
        setField(term876806, term876806.getClass(), "call", term876807);
        setField(term876806, term876806.getClass(), "prototype", null);
        setField(term876806, term876806.getClass(), "kind", enum1635);
        setField(term876811, term876811.getClass(), "call", null);
        setField(term876811, term876811.getClass(), "prototype", null);
        setField(term876811, term876811.getClass(), "kind", null);
        setField(term876811, term876811.getClass(), "typeOfThis", null);
        setField(term876811, term876811.getClass(), "source", null);
        setField(term876811, term876811.getClass(), "implementedInterfaces", null);
        setField(term876811, term876811.getClass(), "subTypes", null);
        setField(term876811, term876811.getClass(), "templateTypeName", null);
        setField(term876811, term876811.getClass(), "className", null);
        setField(term876811, term876811.getClass(), "properties", null);
        setField(term876811, term876811.getClass(), "implicitPrototype", null);
        setBooleanField(term876811, term876811.getClass(), "nativeType", false);
        setBooleanField(term876811, term876811.getClass(), "visited", false);
        setField(term876811, term876811.getClass(), "docInfo", null);
        setBooleanField(term876811, term876811.getClass(), "unknown", false);
        setBooleanField(term876811, term876811.getClass(), "resolved", false);
        setField(term876811, term876811.getClass(), "resolveResult", null);
        setField(term876811, term876811.getClass(), "registry", null);
        setField(term876806, term876806.getClass(), "typeOfThis", term876811);
        setField(term876806, term876806.getClass(), "source", null);
        setField(term876806, term876806.getClass(), "implementedInterfaces", null);
        setField(term876806, term876806.getClass(), "subTypes", null);
        setField(term876806, term876806.getClass(), "templateTypeName", null);
        setField(term876806, term876806.getClass(), "className", null);
        setField(term876806, term876806.getClass(), "properties", null);
        setField(term876806, term876806.getClass(), "implicitPrototype", null);
        setBooleanField(term876806, term876806.getClass(), "nativeType", false);
        setBooleanField(term876806, term876806.getClass(), "visited", false);
        setField(term876806, term876806.getClass(), "docInfo", null);
        setBooleanField(term876806, term876806.getClass(), "unknown", false);
        setBooleanField(term876806, term876806.getClass(), "resolved", false);
        setField(term876806, term876806.getClass(), "resolveResult", null);
        setField(term876806, term876806.getClass(), "registry", null);
        Class<? extends Object> term877701 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term877700 = ((Class) term877701).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term877700).setAccessible(true);
        Object enum1636 = ((Field) term877700).get((Object) null);
        term876812 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term876816 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        setField(term876812, term876812.getClass(), "this$0", null);
        setField(term876812, term876812.getClass(), "call", null);
        setField(term876812, term876812.getClass(), "prototype", null);
        setField(term876812, term876812.getClass(), "kind", enum1636);
        setField(term876816, term876816.getClass(), "referencedType", null);
        setBooleanField(term876816, term876816.getClass(), "visited", false);
        setField(term876816, term876816.getClass(), "docInfo", null);
        setBooleanField(term876816, term876816.getClass(), "unknown", false);
        setBooleanField(term876816, term876816.getClass(), "resolved", false);
        setField(term876816, term876816.getClass(), "resolveResult", null);
        setField(term876816, term876816.getClass(), "registry", null);
        setField(term876812, term876812.getClass(), "typeOfThis", term876816);
        setField(term876812, term876812.getClass(), "source", null);
        setField(term876812, term876812.getClass(), "implementedInterfaces", null);
        setField(term876812, term876812.getClass(), "subTypes", null);
        setField(term876812, term876812.getClass(), "templateTypeName", null);
        setField(term876812, term876812.getClass(), "className", null);
        setField(term876812, term876812.getClass(), "properties", null);
        setField(term876812, term876812.getClass(), "implicitPrototype", null);
        setBooleanField(term876812, term876812.getClass(), "nativeType", false);
        setBooleanField(term876812, term876812.getClass(), "visited", false);
        setField(term876812, term876812.getClass(), "docInfo", null);
        setBooleanField(term876812, term876812.getClass(), "unknown", false);
        setBooleanField(term876812, term876812.getClass(), "resolved", false);
        setField(term876812, term876812.getClass(), "resolveResult", null);
        setField(term876812, term876812.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term875795;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term875345, args);
        assertTrue(recursiveEquals(term875345, term876806));
        assertTrue(recursiveEquals(term875795, term876812));
        assertTrue(recursiveEquals(retValue, false));
    }

};


