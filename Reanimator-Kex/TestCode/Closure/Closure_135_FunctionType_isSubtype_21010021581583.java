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

public class FunctionType_isSubtype_21010021581583 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2108612;
     Object term2109362;
     Object term2111787;
     Object term2111793;

    public FunctionType_isSubtype_21010021581583() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2111803 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2111802 = ((Class) term2111803).getDeclaredField((String) "ORDINARY");
        ((Field) term2111802).setAccessible(true);
        Object enum3932 = ((Field) term2111802).get((Object) null);
        term2108612 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term2109156 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2109254 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        setField(term2108612, term2108612.getClass(), "kind", enum3932);
        setField(term2109156, term2109156.getClass(), "kind", enum3932);
        setField(term2109156, term2109156.getClass(), "typeOfThis", term2109254);
        setField(term2108612, term2108612.getClass(), "typeOfThis", term2109156);
        Class<? extends Object> term2112094 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2112093 = ((Class) term2112094).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2112093).setAccessible(true);
        Object enum3933 = ((Field) term2112093).get((Object) null);
        term2109362 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2109692 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term2109362, term2109362.getClass(), "kind", enum3932);
        setField(term2109692, term2109692.getClass(), "kind", enum3933);
        setField(term2109692, term2109692.getClass(), "typeOfThis", null);
        setField(term2109362, term2109362.getClass(), "typeOfThis", term2109692);
        Class<? extends Object> term2112394 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2112393 = ((Class) term2112394).getDeclaredField((String) "INTERFACE");
        ((Field) term2112393).setAccessible(true);
        Object enum3934 = ((Field) term2112393).get((Object) null);
        term2111787 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term2111791 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2111792 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        setField(term2111787, term2111787.getClass(), "this$0", null);
        setField(term2111787, term2111787.getClass(), "call", null);
        setField(term2111787, term2111787.getClass(), "prototype", null);
        setField(term2111787, term2111787.getClass(), "kind", enum3934);
        setField(term2111791, term2111791.getClass(), "call", null);
        setField(term2111791, term2111791.getClass(), "prototype", null);
        setField(term2111791, term2111791.getClass(), "kind", enum3934);
        setField(term2111792, term2111792.getClass(), "indexType", null);
        setField(term2111792, term2111792.getClass(), "referencedType", null);
        setBooleanField(term2111792, term2111792.getClass(), "visited", false);
        setField(term2111792, term2111792.getClass(), "docInfo", null);
        setBooleanField(term2111792, term2111792.getClass(), "unknown", false);
        setBooleanField(term2111792, term2111792.getClass(), "resolved", false);
        setField(term2111792, term2111792.getClass(), "resolveResult", null);
        setField(term2111792, term2111792.getClass(), "registry", null);
        setField(term2111791, term2111791.getClass(), "typeOfThis", term2111792);
        setField(term2111791, term2111791.getClass(), "source", null);
        setField(term2111791, term2111791.getClass(), "implementedInterfaces", null);
        setField(term2111791, term2111791.getClass(), "subTypes", null);
        setField(term2111791, term2111791.getClass(), "templateTypeName", null);
        setField(term2111791, term2111791.getClass(), "className", null);
        setField(term2111791, term2111791.getClass(), "properties", null);
        setField(term2111791, term2111791.getClass(), "implicitPrototype", null);
        setBooleanField(term2111791, term2111791.getClass(), "nativeType", false);
        setBooleanField(term2111791, term2111791.getClass(), "visited", false);
        setField(term2111791, term2111791.getClass(), "docInfo", null);
        setBooleanField(term2111791, term2111791.getClass(), "unknown", false);
        setBooleanField(term2111791, term2111791.getClass(), "resolved", false);
        setField(term2111791, term2111791.getClass(), "resolveResult", null);
        setField(term2111791, term2111791.getClass(), "registry", null);
        setField(term2111787, term2111787.getClass(), "typeOfThis", term2111791);
        setField(term2111787, term2111787.getClass(), "source", null);
        setField(term2111787, term2111787.getClass(), "implementedInterfaces", null);
        setField(term2111787, term2111787.getClass(), "subTypes", null);
        setField(term2111787, term2111787.getClass(), "templateTypeName", null);
        setField(term2111787, term2111787.getClass(), "className", null);
        setField(term2111787, term2111787.getClass(), "properties", null);
        setField(term2111787, term2111787.getClass(), "implicitPrototype", null);
        setBooleanField(term2111787, term2111787.getClass(), "nativeType", false);
        setBooleanField(term2111787, term2111787.getClass(), "visited", false);
        setField(term2111787, term2111787.getClass(), "docInfo", null);
        setBooleanField(term2111787, term2111787.getClass(), "unknown", false);
        setBooleanField(term2111787, term2111787.getClass(), "resolved", false);
        setField(term2111787, term2111787.getClass(), "resolveResult", null);
        setField(term2111787, term2111787.getClass(), "registry", null);
        Class<? extends Object> term2112688 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2112687 = ((Class) term2112688).getDeclaredField((String) "INTERFACE");
        ((Field) term2112687).setAccessible(true);
        Object enum3935 = ((Field) term2112687).get((Object) null);
        Class<? extends Object> term2112982 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2112981 = ((Class) term2112982).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2112981).setAccessible(true);
        Object enum3936 = ((Field) term2112981).get((Object) null);
        term2111793 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2111797 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term2111793, term2111793.getClass(), "this$0", null);
        setField(term2111793, term2111793.getClass(), "call", null);
        setField(term2111793, term2111793.getClass(), "prototype", null);
        setField(term2111793, term2111793.getClass(), "kind", enum3935);
        setField(term2111797, term2111797.getClass(), "this$0", null);
        setField(term2111797, term2111797.getClass(), "call", null);
        setField(term2111797, term2111797.getClass(), "prototype", null);
        setField(term2111797, term2111797.getClass(), "kind", enum3936);
        setField(term2111797, term2111797.getClass(), "typeOfThis", null);
        setField(term2111797, term2111797.getClass(), "source", null);
        setField(term2111797, term2111797.getClass(), "implementedInterfaces", null);
        setField(term2111797, term2111797.getClass(), "subTypes", null);
        setField(term2111797, term2111797.getClass(), "templateTypeName", null);
        setField(term2111797, term2111797.getClass(), "className", null);
        setField(term2111797, term2111797.getClass(), "properties", null);
        setField(term2111797, term2111797.getClass(), "implicitPrototype", null);
        setBooleanField(term2111797, term2111797.getClass(), "nativeType", false);
        setBooleanField(term2111797, term2111797.getClass(), "visited", false);
        setField(term2111797, term2111797.getClass(), "docInfo", null);
        setBooleanField(term2111797, term2111797.getClass(), "unknown", false);
        setBooleanField(term2111797, term2111797.getClass(), "resolved", false);
        setField(term2111797, term2111797.getClass(), "resolveResult", null);
        setField(term2111797, term2111797.getClass(), "registry", null);
        setField(term2111793, term2111793.getClass(), "typeOfThis", term2111797);
        setField(term2111793, term2111793.getClass(), "source", null);
        setField(term2111793, term2111793.getClass(), "implementedInterfaces", null);
        setField(term2111793, term2111793.getClass(), "subTypes", null);
        setField(term2111793, term2111793.getClass(), "templateTypeName", null);
        setField(term2111793, term2111793.getClass(), "className", null);
        setField(term2111793, term2111793.getClass(), "properties", null);
        setField(term2111793, term2111793.getClass(), "implicitPrototype", null);
        setBooleanField(term2111793, term2111793.getClass(), "nativeType", false);
        setBooleanField(term2111793, term2111793.getClass(), "visited", false);
        setField(term2111793, term2111793.getClass(), "docInfo", null);
        setBooleanField(term2111793, term2111793.getClass(), "unknown", false);
        setBooleanField(term2111793, term2111793.getClass(), "resolved", false);
        setField(term2111793, term2111793.getClass(), "resolveResult", null);
        setField(term2111793, term2111793.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2109362;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term2108612, args);
        assertTrue(recursiveEquals(term2108612, term2111787));
        assertTrue(recursiveEquals(term2109362, term2111793));
        assertTrue(recursiveEquals(retValue, true));
    }

};


