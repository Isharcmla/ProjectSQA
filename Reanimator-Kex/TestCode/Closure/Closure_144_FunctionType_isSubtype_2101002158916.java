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

public class FunctionType_isSubtype_2101002158916 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1116440;
     Object term1117190;
     Object term1119854;
     Object term1119860;

    public FunctionType_isSubtype_2101002158916() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1119868 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1119867 = ((Class) term1119868).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1119867).setAccessible(true);
        Object enum2011 = ((Field) term1119867).get((Object) null);
        term1116440 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1116984 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1117080 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term1116440, term1116440.getClass(), "kind", enum2011);
        setField(term1116984, term1116984.getClass(), "kind", enum2011);
        setField(term1116984, term1116984.getClass(), "typeOfThis", term1117080);
        setField(term1116440, term1116440.getClass(), "typeOfThis", term1116984);
        Class<? extends Object> term1120168 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1120167 = ((Class) term1120168).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1120167).setAccessible(true);
        Object enum2012 = ((Field) term1120167).get((Object) null);
        term1117190 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1117374 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1117474 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1117190, term1117190.getClass(), "kind", enum2012);
        setField(term1117374, term1117374.getClass(), "kind", enum2012);
        setField(term1117374, term1117374.getClass(), "typeOfThis", term1117474);
        setField(term1117190, term1117190.getClass(), "typeOfThis", term1117374);
        Class<? extends Object> term1120468 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1120467 = ((Class) term1120468).getDeclaredField((String) "INTERFACE");
        ((Field) term1120467).setAccessible(true);
        Object enum2013 = ((Field) term1120467).get((Object) null);
        term1119854 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1119858 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1119859 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term1119854, term1119854.getClass(), "this$0", null);
        setField(term1119854, term1119854.getClass(), "call", null);
        setField(term1119854, term1119854.getClass(), "prototype", null);
        setField(term1119854, term1119854.getClass(), "kind", enum2013);
        setField(term1119858, term1119858.getClass(), "call", null);
        setField(term1119858, term1119858.getClass(), "prototype", null);
        setField(term1119858, term1119858.getClass(), "kind", enum2013);
        setField(term1119859, term1119859.getClass(), "properties", null);
        setBooleanField(term1119859, term1119859.getClass(), "isFrozen", false);
        setField(term1119859, term1119859.getClass(), "className", null);
        setField(term1119859, term1119859.getClass(), "implicitPrototype", null);
        setBooleanField(term1119859, term1119859.getClass(), "nativeType", false);
        setBooleanField(term1119859, term1119859.getClass(), "prettyPrint", false);
        setBooleanField(term1119859, term1119859.getClass(), "visited", false);
        setField(term1119859, term1119859.getClass(), "docInfo", null);
        setBooleanField(term1119859, term1119859.getClass(), "unknown", false);
        setBooleanField(term1119859, term1119859.getClass(), "resolved", false);
        setField(term1119859, term1119859.getClass(), "resolveResult", null);
        setField(term1119859, term1119859.getClass(), "registry", null);
        setField(term1119858, term1119858.getClass(), "typeOfThis", term1119859);
        setField(term1119858, term1119858.getClass(), "source", null);
        setField(term1119858, term1119858.getClass(), "implementedInterfaces", null);
        setField(term1119858, term1119858.getClass(), "subTypes", null);
        setField(term1119858, term1119858.getClass(), "templateTypeName", null);
        setField(term1119858, term1119858.getClass(), "className", null);
        setField(term1119858, term1119858.getClass(), "properties", null);
        setField(term1119858, term1119858.getClass(), "implicitPrototype", null);
        setBooleanField(term1119858, term1119858.getClass(), "nativeType", false);
        setBooleanField(term1119858, term1119858.getClass(), "prettyPrint", false);
        setBooleanField(term1119858, term1119858.getClass(), "visited", false);
        setField(term1119858, term1119858.getClass(), "docInfo", null);
        setBooleanField(term1119858, term1119858.getClass(), "unknown", false);
        setBooleanField(term1119858, term1119858.getClass(), "resolved", false);
        setField(term1119858, term1119858.getClass(), "resolveResult", null);
        setField(term1119858, term1119858.getClass(), "registry", null);
        setField(term1119854, term1119854.getClass(), "typeOfThis", term1119858);
        setField(term1119854, term1119854.getClass(), "source", null);
        setField(term1119854, term1119854.getClass(), "implementedInterfaces", null);
        setField(term1119854, term1119854.getClass(), "subTypes", null);
        setField(term1119854, term1119854.getClass(), "templateTypeName", null);
        setField(term1119854, term1119854.getClass(), "className", null);
        setField(term1119854, term1119854.getClass(), "properties", null);
        setField(term1119854, term1119854.getClass(), "implicitPrototype", null);
        setBooleanField(term1119854, term1119854.getClass(), "nativeType", false);
        setBooleanField(term1119854, term1119854.getClass(), "prettyPrint", false);
        setBooleanField(term1119854, term1119854.getClass(), "visited", false);
        setField(term1119854, term1119854.getClass(), "docInfo", null);
        setBooleanField(term1119854, term1119854.getClass(), "unknown", false);
        setBooleanField(term1119854, term1119854.getClass(), "resolved", false);
        setField(term1119854, term1119854.getClass(), "resolveResult", null);
        setField(term1119854, term1119854.getClass(), "registry", null);
        Class<? extends Object> term1120762 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1120761 = ((Class) term1120762).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1120761).setAccessible(true);
        Object enum2014 = ((Field) term1120761).get((Object) null);
        term1119860 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1119864 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1119865 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1119860, term1119860.getClass(), "call", null);
        setField(term1119860, term1119860.getClass(), "prototype", null);
        setField(term1119860, term1119860.getClass(), "kind", enum2014);
        setField(term1119864, term1119864.getClass(), "call", null);
        setField(term1119864, term1119864.getClass(), "prototype", null);
        setField(term1119864, term1119864.getClass(), "kind", enum2014);
        setField(term1119865, term1119865.getClass(), "call", null);
        setField(term1119865, term1119865.getClass(), "prototype", null);
        setField(term1119865, term1119865.getClass(), "kind", null);
        setField(term1119865, term1119865.getClass(), "typeOfThis", null);
        setField(term1119865, term1119865.getClass(), "source", null);
        setField(term1119865, term1119865.getClass(), "implementedInterfaces", null);
        setField(term1119865, term1119865.getClass(), "subTypes", null);
        setField(term1119865, term1119865.getClass(), "templateTypeName", null);
        setField(term1119865, term1119865.getClass(), "className", null);
        setField(term1119865, term1119865.getClass(), "properties", null);
        setField(term1119865, term1119865.getClass(), "implicitPrototype", null);
        setBooleanField(term1119865, term1119865.getClass(), "nativeType", false);
        setBooleanField(term1119865, term1119865.getClass(), "prettyPrint", false);
        setBooleanField(term1119865, term1119865.getClass(), "visited", false);
        setField(term1119865, term1119865.getClass(), "docInfo", null);
        setBooleanField(term1119865, term1119865.getClass(), "unknown", false);
        setBooleanField(term1119865, term1119865.getClass(), "resolved", false);
        setField(term1119865, term1119865.getClass(), "resolveResult", null);
        setField(term1119865, term1119865.getClass(), "registry", null);
        setField(term1119864, term1119864.getClass(), "typeOfThis", term1119865);
        setField(term1119864, term1119864.getClass(), "source", null);
        setField(term1119864, term1119864.getClass(), "implementedInterfaces", null);
        setField(term1119864, term1119864.getClass(), "subTypes", null);
        setField(term1119864, term1119864.getClass(), "templateTypeName", null);
        setField(term1119864, term1119864.getClass(), "className", null);
        setField(term1119864, term1119864.getClass(), "properties", null);
        setField(term1119864, term1119864.getClass(), "implicitPrototype", null);
        setBooleanField(term1119864, term1119864.getClass(), "nativeType", false);
        setBooleanField(term1119864, term1119864.getClass(), "prettyPrint", false);
        setBooleanField(term1119864, term1119864.getClass(), "visited", false);
        setField(term1119864, term1119864.getClass(), "docInfo", null);
        setBooleanField(term1119864, term1119864.getClass(), "unknown", false);
        setBooleanField(term1119864, term1119864.getClass(), "resolved", false);
        setField(term1119864, term1119864.getClass(), "resolveResult", null);
        setField(term1119864, term1119864.getClass(), "registry", null);
        setField(term1119860, term1119860.getClass(), "typeOfThis", term1119864);
        setField(term1119860, term1119860.getClass(), "source", null);
        setField(term1119860, term1119860.getClass(), "implementedInterfaces", null);
        setField(term1119860, term1119860.getClass(), "subTypes", null);
        setField(term1119860, term1119860.getClass(), "templateTypeName", null);
        setField(term1119860, term1119860.getClass(), "className", null);
        setField(term1119860, term1119860.getClass(), "properties", null);
        setField(term1119860, term1119860.getClass(), "implicitPrototype", null);
        setBooleanField(term1119860, term1119860.getClass(), "nativeType", false);
        setBooleanField(term1119860, term1119860.getClass(), "prettyPrint", false);
        setBooleanField(term1119860, term1119860.getClass(), "visited", false);
        setField(term1119860, term1119860.getClass(), "docInfo", null);
        setBooleanField(term1119860, term1119860.getClass(), "unknown", false);
        setBooleanField(term1119860, term1119860.getClass(), "resolved", false);
        setField(term1119860, term1119860.getClass(), "resolveResult", null);
        setField(term1119860, term1119860.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1117190;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term1116440, args);
        assertTrue(recursiveEquals(term1116440, term1119854));
        assertTrue(recursiveEquals(term1117190, term1119860));
        assertTrue(recursiveEquals(retValue, false));
    }

};


