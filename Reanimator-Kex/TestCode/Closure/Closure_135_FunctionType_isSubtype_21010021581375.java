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

public class FunctionType_isSubtype_21010021581375 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1760274;
     Object term1760832;
     Object term1762031;
     Object term1762038;

    public FunctionType_isSubtype_21010021581375() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1762046 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1762045 = ((Class) term1762046).getDeclaredField((String) "ORDINARY");
        ((Field) term1762045).setAccessible(true);
        Object enum3283 = ((Field) term1762045).get((Object) null);
        term1760274 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1760530 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1760630 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1760724 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1760274, term1760274.getClass(), "kind", enum3283);
        setField(term1760530, term1760530.getClass(), "kind", enum3283);
        setField(term1760530, term1760530.getClass(), "typeOfThis", term1760630);
        setField(term1760274, term1760274.getClass(), "typeOfThis", term1760530);
        setField(term1760274, term1760274.getClass(), "call", term1760724);
        Class<? extends Object> term1762337 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1762336 = ((Class) term1762337).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1762336).setAccessible(true);
        Object enum3284 = ((Field) term1762336).get((Object) null);
        term1760832 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1761088 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1761182 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1760832, term1760832.getClass(), "kind", enum3284);
        setField(term1761088, term1761088.getClass(), "kind", enum3284);
        setField(term1761088, term1761088.getClass(), "typeOfThis", null);
        setField(term1760832, term1760832.getClass(), "typeOfThis", term1761088);
        setField(term1760832, term1760832.getClass(), "call", term1761182);
        Class<? extends Object> term1762637 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1762636 = ((Class) term1762637).getDeclaredField((String) "ORDINARY");
        ((Field) term1762636).setAccessible(true);
        Object enum3285 = ((Field) term1762636).get((Object) null);
        term1762031 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1762032 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term1762036 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1762037 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1762031, term1762031.getClass(), "this$0", null);
        setField(term1762032, term1762032.getClass(), "parameters", null);
        setField(term1762032, term1762032.getClass(), "returnType", null);
        setBooleanField(term1762032, term1762032.getClass(), "resolved", false);
        setField(term1762032, term1762032.getClass(), "resolveResult", null);
        setField(term1762032, term1762032.getClass(), "registry", null);
        setField(term1762031, term1762031.getClass(), "call", term1762032);
        setField(term1762031, term1762031.getClass(), "prototype", null);
        setField(term1762031, term1762031.getClass(), "kind", enum3285);
        setField(term1762036, term1762036.getClass(), "this$0", null);
        setField(term1762036, term1762036.getClass(), "call", null);
        setField(term1762036, term1762036.getClass(), "prototype", null);
        setField(term1762036, term1762036.getClass(), "kind", enum3285);
        setField(term1762037, term1762037.getClass(), "call", null);
        setField(term1762037, term1762037.getClass(), "prototype", null);
        setField(term1762037, term1762037.getClass(), "kind", null);
        setField(term1762037, term1762037.getClass(), "typeOfThis", null);
        setField(term1762037, term1762037.getClass(), "source", null);
        setField(term1762037, term1762037.getClass(), "implementedInterfaces", null);
        setField(term1762037, term1762037.getClass(), "subTypes", null);
        setField(term1762037, term1762037.getClass(), "templateTypeName", null);
        setField(term1762037, term1762037.getClass(), "className", null);
        setField(term1762037, term1762037.getClass(), "properties", null);
        setField(term1762037, term1762037.getClass(), "implicitPrototype", null);
        setBooleanField(term1762037, term1762037.getClass(), "nativeType", false);
        setBooleanField(term1762037, term1762037.getClass(), "visited", false);
        setField(term1762037, term1762037.getClass(), "docInfo", null);
        setBooleanField(term1762037, term1762037.getClass(), "unknown", false);
        setBooleanField(term1762037, term1762037.getClass(), "resolved", false);
        setField(term1762037, term1762037.getClass(), "resolveResult", null);
        setField(term1762037, term1762037.getClass(), "registry", null);
        setField(term1762036, term1762036.getClass(), "typeOfThis", term1762037);
        setField(term1762036, term1762036.getClass(), "source", null);
        setField(term1762036, term1762036.getClass(), "implementedInterfaces", null);
        setField(term1762036, term1762036.getClass(), "subTypes", null);
        setField(term1762036, term1762036.getClass(), "templateTypeName", null);
        setField(term1762036, term1762036.getClass(), "className", null);
        setField(term1762036, term1762036.getClass(), "properties", null);
        setField(term1762036, term1762036.getClass(), "implicitPrototype", null);
        setBooleanField(term1762036, term1762036.getClass(), "nativeType", false);
        setBooleanField(term1762036, term1762036.getClass(), "visited", false);
        setField(term1762036, term1762036.getClass(), "docInfo", null);
        setBooleanField(term1762036, term1762036.getClass(), "unknown", false);
        setBooleanField(term1762036, term1762036.getClass(), "resolved", false);
        setField(term1762036, term1762036.getClass(), "resolveResult", null);
        setField(term1762036, term1762036.getClass(), "registry", null);
        setField(term1762031, term1762031.getClass(), "typeOfThis", term1762036);
        setField(term1762031, term1762031.getClass(), "source", null);
        setField(term1762031, term1762031.getClass(), "implementedInterfaces", null);
        setField(term1762031, term1762031.getClass(), "subTypes", null);
        setField(term1762031, term1762031.getClass(), "templateTypeName", null);
        setField(term1762031, term1762031.getClass(), "className", null);
        setField(term1762031, term1762031.getClass(), "properties", null);
        setField(term1762031, term1762031.getClass(), "implicitPrototype", null);
        setBooleanField(term1762031, term1762031.getClass(), "nativeType", false);
        setBooleanField(term1762031, term1762031.getClass(), "visited", false);
        setField(term1762031, term1762031.getClass(), "docInfo", null);
        setBooleanField(term1762031, term1762031.getClass(), "unknown", false);
        setBooleanField(term1762031, term1762031.getClass(), "resolved", false);
        setField(term1762031, term1762031.getClass(), "resolveResult", null);
        setField(term1762031, term1762031.getClass(), "registry", null);
        Class<? extends Object> term1762928 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1762927 = ((Class) term1762928).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1762927).setAccessible(true);
        Object enum3286 = ((Field) term1762927).get((Object) null);
        term1762038 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1762039 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term1762043 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1762038, term1762038.getClass(), "this$0", null);
        setField(term1762039, term1762039.getClass(), "parameters", null);
        setField(term1762039, term1762039.getClass(), "returnType", null);
        setBooleanField(term1762039, term1762039.getClass(), "resolved", false);
        setField(term1762039, term1762039.getClass(), "resolveResult", null);
        setField(term1762039, term1762039.getClass(), "registry", null);
        setField(term1762038, term1762038.getClass(), "call", term1762039);
        setField(term1762038, term1762038.getClass(), "prototype", null);
        setField(term1762038, term1762038.getClass(), "kind", enum3286);
        setField(term1762043, term1762043.getClass(), "this$0", null);
        setField(term1762043, term1762043.getClass(), "call", null);
        setField(term1762043, term1762043.getClass(), "prototype", null);
        setField(term1762043, term1762043.getClass(), "kind", enum3286);
        setField(term1762043, term1762043.getClass(), "typeOfThis", null);
        setField(term1762043, term1762043.getClass(), "source", null);
        setField(term1762043, term1762043.getClass(), "implementedInterfaces", null);
        setField(term1762043, term1762043.getClass(), "subTypes", null);
        setField(term1762043, term1762043.getClass(), "templateTypeName", null);
        setField(term1762043, term1762043.getClass(), "className", null);
        setField(term1762043, term1762043.getClass(), "properties", null);
        setField(term1762043, term1762043.getClass(), "implicitPrototype", null);
        setBooleanField(term1762043, term1762043.getClass(), "nativeType", false);
        setBooleanField(term1762043, term1762043.getClass(), "visited", false);
        setField(term1762043, term1762043.getClass(), "docInfo", null);
        setBooleanField(term1762043, term1762043.getClass(), "unknown", false);
        setBooleanField(term1762043, term1762043.getClass(), "resolved", false);
        setField(term1762043, term1762043.getClass(), "resolveResult", null);
        setField(term1762043, term1762043.getClass(), "registry", null);
        setField(term1762038, term1762038.getClass(), "typeOfThis", term1762043);
        setField(term1762038, term1762038.getClass(), "source", null);
        setField(term1762038, term1762038.getClass(), "implementedInterfaces", null);
        setField(term1762038, term1762038.getClass(), "subTypes", null);
        setField(term1762038, term1762038.getClass(), "templateTypeName", null);
        setField(term1762038, term1762038.getClass(), "className", null);
        setField(term1762038, term1762038.getClass(), "properties", null);
        setField(term1762038, term1762038.getClass(), "implicitPrototype", null);
        setBooleanField(term1762038, term1762038.getClass(), "nativeType", false);
        setBooleanField(term1762038, term1762038.getClass(), "visited", false);
        setField(term1762038, term1762038.getClass(), "docInfo", null);
        setBooleanField(term1762038, term1762038.getClass(), "unknown", false);
        setBooleanField(term1762038, term1762038.getClass(), "resolved", false);
        setField(term1762038, term1762038.getClass(), "resolveResult", null);
        setField(term1762038, term1762038.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1760832;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term1760274, args);
        assertTrue(recursiveEquals(term1760274, term1762031));
        assertTrue(recursiveEquals(term1760832, term1762038));
        assertTrue(recursiveEquals(retValue, true));
    }

};


