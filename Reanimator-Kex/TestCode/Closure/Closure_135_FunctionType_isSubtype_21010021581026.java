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

public class FunctionType_isSubtype_21010021581026 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1162195;
     Object term1162855;
     Object term1165996;
     Object term1166004;

    public FunctionType_isSubtype_21010021581026() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1166011 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1166010 = ((Class) term1166011).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1166010).setAccessible(true);
        Object enum2169 = ((Field) term1166010).get((Object) null);
        Class<? extends Object> term1166311 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1166310 = ((Class) term1166311).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1166310).setAccessible(true);
        Object enum2170 = ((Field) term1166310).get((Object) null);
        term1162195 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1162747 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1162195, term1162195.getClass(), "kind", enum2169);
        setField(term1162747, term1162747.getClass(), "kind", enum2170);
        setField(term1162195, term1162195.getClass(), "typeOfThis", term1162747);
        Class<? extends Object> term1166611 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1166610 = ((Class) term1166611).getDeclaredField((String) "INTERFACE");
        ((Field) term1166610).setAccessible(true);
        Object enum2171 = ((Field) term1166610).get((Object) null);
        term1162855 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1163185 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1162855, term1162855.getClass(), "kind", enum2169);
        setField(term1163185, term1163185.getClass(), "kind", enum2171);
        setField(term1162855, term1162855.getClass(), "typeOfThis", term1163185);
        Class<? extends Object> term1166905 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1166904 = ((Class) term1166905).getDeclaredField((String) "INTERFACE");
        ((Field) term1166904).setAccessible(true);
        Object enum2172 = ((Field) term1166904).get((Object) null);
        Class<? extends Object> term1167199 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1167198 = ((Class) term1167199).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1167198).setAccessible(true);
        Object enum2173 = ((Field) term1167198).get((Object) null);
        term1165996 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1166000 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1165996, term1165996.getClass(), "call", null);
        setField(term1165996, term1165996.getClass(), "prototype", null);
        setField(term1165996, term1165996.getClass(), "kind", enum2172);
        setField(term1166000, term1166000.getClass(), "this$0", null);
        setField(term1166000, term1166000.getClass(), "call", null);
        setField(term1166000, term1166000.getClass(), "prototype", null);
        setField(term1166000, term1166000.getClass(), "kind", enum2173);
        setField(term1166000, term1166000.getClass(), "typeOfThis", null);
        setField(term1166000, term1166000.getClass(), "source", null);
        setField(term1166000, term1166000.getClass(), "implementedInterfaces", null);
        setField(term1166000, term1166000.getClass(), "subTypes", null);
        setField(term1166000, term1166000.getClass(), "templateTypeName", null);
        setField(term1166000, term1166000.getClass(), "className", null);
        setField(term1166000, term1166000.getClass(), "properties", null);
        setField(term1166000, term1166000.getClass(), "implicitPrototype", null);
        setBooleanField(term1166000, term1166000.getClass(), "nativeType", false);
        setBooleanField(term1166000, term1166000.getClass(), "visited", false);
        setField(term1166000, term1166000.getClass(), "docInfo", null);
        setBooleanField(term1166000, term1166000.getClass(), "unknown", false);
        setBooleanField(term1166000, term1166000.getClass(), "resolved", false);
        setField(term1166000, term1166000.getClass(), "resolveResult", null);
        setField(term1166000, term1166000.getClass(), "registry", null);
        setField(term1165996, term1165996.getClass(), "typeOfThis", term1166000);
        setField(term1165996, term1165996.getClass(), "source", null);
        setField(term1165996, term1165996.getClass(), "implementedInterfaces", null);
        setField(term1165996, term1165996.getClass(), "subTypes", null);
        setField(term1165996, term1165996.getClass(), "templateTypeName", null);
        setField(term1165996, term1165996.getClass(), "className", null);
        setField(term1165996, term1165996.getClass(), "properties", null);
        setField(term1165996, term1165996.getClass(), "implicitPrototype", null);
        setBooleanField(term1165996, term1165996.getClass(), "nativeType", false);
        setBooleanField(term1165996, term1165996.getClass(), "visited", false);
        setField(term1165996, term1165996.getClass(), "docInfo", null);
        setBooleanField(term1165996, term1165996.getClass(), "unknown", false);
        setBooleanField(term1165996, term1165996.getClass(), "resolved", false);
        setField(term1165996, term1165996.getClass(), "resolveResult", null);
        setField(term1165996, term1165996.getClass(), "registry", null);
        Class<? extends Object> term1167499 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1167498 = ((Class) term1167499).getDeclaredField((String) "INTERFACE");
        ((Field) term1167498).setAccessible(true);
        Object enum2174 = ((Field) term1167498).get((Object) null);
        term1166004 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1166008 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1166004, term1166004.getClass(), "this$0", null);
        setField(term1166004, term1166004.getClass(), "call", null);
        setField(term1166004, term1166004.getClass(), "prototype", null);
        setField(term1166004, term1166004.getClass(), "kind", enum2174);
        setField(term1166008, term1166008.getClass(), "this$0", null);
        setField(term1166008, term1166008.getClass(), "call", null);
        setField(term1166008, term1166008.getClass(), "prototype", null);
        setField(term1166008, term1166008.getClass(), "kind", enum2174);
        setField(term1166008, term1166008.getClass(), "typeOfThis", null);
        setField(term1166008, term1166008.getClass(), "source", null);
        setField(term1166008, term1166008.getClass(), "implementedInterfaces", null);
        setField(term1166008, term1166008.getClass(), "subTypes", null);
        setField(term1166008, term1166008.getClass(), "templateTypeName", null);
        setField(term1166008, term1166008.getClass(), "className", null);
        setField(term1166008, term1166008.getClass(), "properties", null);
        setField(term1166008, term1166008.getClass(), "implicitPrototype", null);
        setBooleanField(term1166008, term1166008.getClass(), "nativeType", false);
        setBooleanField(term1166008, term1166008.getClass(), "visited", false);
        setField(term1166008, term1166008.getClass(), "docInfo", null);
        setBooleanField(term1166008, term1166008.getClass(), "unknown", false);
        setBooleanField(term1166008, term1166008.getClass(), "resolved", false);
        setField(term1166008, term1166008.getClass(), "resolveResult", null);
        setField(term1166008, term1166008.getClass(), "registry", null);
        setField(term1166004, term1166004.getClass(), "typeOfThis", term1166008);
        setField(term1166004, term1166004.getClass(), "source", null);
        setField(term1166004, term1166004.getClass(), "implementedInterfaces", null);
        setField(term1166004, term1166004.getClass(), "subTypes", null);
        setField(term1166004, term1166004.getClass(), "templateTypeName", null);
        setField(term1166004, term1166004.getClass(), "className", null);
        setField(term1166004, term1166004.getClass(), "properties", null);
        setField(term1166004, term1166004.getClass(), "implicitPrototype", null);
        setBooleanField(term1166004, term1166004.getClass(), "nativeType", false);
        setBooleanField(term1166004, term1166004.getClass(), "visited", false);
        setField(term1166004, term1166004.getClass(), "docInfo", null);
        setBooleanField(term1166004, term1166004.getClass(), "unknown", false);
        setBooleanField(term1166004, term1166004.getClass(), "resolved", false);
        setField(term1166004, term1166004.getClass(), "resolveResult", null);
        setField(term1166004, term1166004.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1162855;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term1162195, args);
        assertTrue(recursiveEquals(term1162195, term1165996));
        assertTrue(recursiveEquals(term1162855, term1166004));
        assertTrue(recursiveEquals(retValue, true));
    }

};


