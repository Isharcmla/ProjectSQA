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

public class FunctionType_isSubtype_2101002158504 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term365195;
     Object term365855;
     Object term368748;
     Object term368753;

    public FunctionType_isSubtype_2101002158504() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term368763 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term368762 = ((Class) term368763).getDeclaredField((String) "INTERFACE");
        ((Field) term368762).setAccessible(true);
        Object enum672 = ((Field) term368762).get((Object) null);
        term365195 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term365747 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term365195, term365195.getClass(), "kind", enum672);
        setField(term365747, term365747.getClass(), "kind", enum672);
        setField(term365195, term365195.getClass(), "typeOfThis", term365747);
        Class<? extends Object> term369057 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term369056 = ((Class) term369057).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term369056).setAccessible(true);
        Object enum673 = ((Field) term369056).get((Object) null);
        Class<? extends Object> term369357 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term369356 = ((Class) term369357).getDeclaredField((String) "INTERFACE");
        ((Field) term369356).setAccessible(true);
        Object enum674 = ((Field) term369356).get((Object) null);
        term365855 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term366037 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term365855, term365855.getClass(), "kind", enum673);
        setField(term366037, term366037.getClass(), "kind", enum674);
        setField(term365855, term365855.getClass(), "typeOfThis", term366037);
        Class<? extends Object> term369651 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term369650 = ((Class) term369651).getDeclaredField((String) "INTERFACE");
        ((Field) term369650).setAccessible(true);
        Object enum675 = ((Field) term369650).get((Object) null);
        term368748 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term368752 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term368748, term368748.getClass(), "call", null);
        setField(term368748, term368748.getClass(), "prototype", null);
        setField(term368748, term368748.getClass(), "kind", enum675);
        setField(term368752, term368752.getClass(), "this$0", null);
        setField(term368752, term368752.getClass(), "call", null);
        setField(term368752, term368752.getClass(), "prototype", null);
        setField(term368752, term368752.getClass(), "kind", enum675);
        setField(term368752, term368752.getClass(), "typeOfThis", null);
        setField(term368752, term368752.getClass(), "source", null);
        setField(term368752, term368752.getClass(), "implementedInterfaces", null);
        setField(term368752, term368752.getClass(), "subTypes", null);
        setField(term368752, term368752.getClass(), "templateTypeName", null);
        setField(term368752, term368752.getClass(), "className", null);
        setField(term368752, term368752.getClass(), "properties", null);
        setField(term368752, term368752.getClass(), "implicitPrototype", null);
        setBooleanField(term368752, term368752.getClass(), "nativeType", false);
        setBooleanField(term368752, term368752.getClass(), "visited", false);
        setField(term368752, term368752.getClass(), "docInfo", null);
        setBooleanField(term368752, term368752.getClass(), "unknown", false);
        setBooleanField(term368752, term368752.getClass(), "resolved", false);
        setField(term368752, term368752.getClass(), "resolveResult", null);
        setField(term368752, term368752.getClass(), "registry", null);
        setField(term368748, term368748.getClass(), "typeOfThis", term368752);
        setField(term368748, term368748.getClass(), "source", null);
        setField(term368748, term368748.getClass(), "implementedInterfaces", null);
        setField(term368748, term368748.getClass(), "subTypes", null);
        setField(term368748, term368748.getClass(), "templateTypeName", null);
        setField(term368748, term368748.getClass(), "className", null);
        setField(term368748, term368748.getClass(), "properties", null);
        setField(term368748, term368748.getClass(), "implicitPrototype", null);
        setBooleanField(term368748, term368748.getClass(), "nativeType", false);
        setBooleanField(term368748, term368748.getClass(), "visited", false);
        setField(term368748, term368748.getClass(), "docInfo", null);
        setBooleanField(term368748, term368748.getClass(), "unknown", false);
        setBooleanField(term368748, term368748.getClass(), "resolved", false);
        setField(term368748, term368748.getClass(), "resolveResult", null);
        setField(term368748, term368748.getClass(), "registry", null);
        Class<? extends Object> term369945 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term369944 = ((Class) term369945).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term369944).setAccessible(true);
        Object enum676 = ((Field) term369944).get((Object) null);
        Class<? extends Object> term370245 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term370244 = ((Class) term370245).getDeclaredField((String) "INTERFACE");
        ((Field) term370244).setAccessible(true);
        Object enum677 = ((Field) term370244).get((Object) null);
        term368753 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term368757 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term368753, term368753.getClass(), "this$0", null);
        setField(term368753, term368753.getClass(), "call", null);
        setField(term368753, term368753.getClass(), "prototype", null);
        setField(term368753, term368753.getClass(), "kind", enum676);
        setField(term368757, term368757.getClass(), "this$0", null);
        setField(term368757, term368757.getClass(), "call", null);
        setField(term368757, term368757.getClass(), "prototype", null);
        setField(term368757, term368757.getClass(), "kind", enum677);
        setField(term368757, term368757.getClass(), "typeOfThis", null);
        setField(term368757, term368757.getClass(), "source", null);
        setField(term368757, term368757.getClass(), "implementedInterfaces", null);
        setField(term368757, term368757.getClass(), "subTypes", null);
        setField(term368757, term368757.getClass(), "templateTypeName", null);
        setField(term368757, term368757.getClass(), "className", null);
        setField(term368757, term368757.getClass(), "properties", null);
        setField(term368757, term368757.getClass(), "implicitPrototype", null);
        setBooleanField(term368757, term368757.getClass(), "nativeType", false);
        setBooleanField(term368757, term368757.getClass(), "visited", false);
        setField(term368757, term368757.getClass(), "docInfo", null);
        setBooleanField(term368757, term368757.getClass(), "unknown", false);
        setBooleanField(term368757, term368757.getClass(), "resolved", false);
        setField(term368757, term368757.getClass(), "resolveResult", null);
        setField(term368757, term368757.getClass(), "registry", null);
        setField(term368753, term368753.getClass(), "typeOfThis", term368757);
        setField(term368753, term368753.getClass(), "source", null);
        setField(term368753, term368753.getClass(), "implementedInterfaces", null);
        setField(term368753, term368753.getClass(), "subTypes", null);
        setField(term368753, term368753.getClass(), "templateTypeName", null);
        setField(term368753, term368753.getClass(), "className", null);
        setField(term368753, term368753.getClass(), "properties", null);
        setField(term368753, term368753.getClass(), "implicitPrototype", null);
        setBooleanField(term368753, term368753.getClass(), "nativeType", false);
        setBooleanField(term368753, term368753.getClass(), "visited", false);
        setField(term368753, term368753.getClass(), "docInfo", null);
        setBooleanField(term368753, term368753.getClass(), "unknown", false);
        setBooleanField(term368753, term368753.getClass(), "resolved", false);
        setField(term368753, term368753.getClass(), "resolveResult", null);
        setField(term368753, term368753.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term365855;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term365195, args);
        assertTrue(recursiveEquals(term365195, term368748));
        assertTrue(recursiveEquals(term365855, term368753));
        assertTrue(recursiveEquals(retValue, false));
    }

};


