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

public class FunctionType_isSubtype_2101002158957 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1057127;
     Object term1057779;
     Object term1058799;
     Object term1058804;

    public FunctionType_isSubtype_2101002158957() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1058811 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1058810 = ((Class) term1058811).getDeclaredField((String) "INTERFACE");
        ((Field) term1058810).setAccessible(true);
        Object enum1975 = ((Field) term1058810).get((Object) null);
        Class<? extends Object> term1059105 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1059104 = ((Class) term1059105).getDeclaredField((String) "INTERFACE");
        ((Field) term1059104).setAccessible(true);
        Object enum1976 = ((Field) term1059104).get((Object) null);
        term1057127 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1057671 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1057127, term1057127.getClass(), "kind", enum1975);
        setField(term1057671, term1057671.getClass(), "kind", enum1976);
        setField(term1057127, term1057127.getClass(), "typeOfThis", term1057671);
        term1057779 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1058109 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1057779, term1057779.getClass(), "kind", enum1975);
        setField(term1058109, term1058109.getClass(), "kind", enum1975);
        setField(term1057779, term1057779.getClass(), "typeOfThis", term1058109);
        Class<? extends Object> term1059399 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1059398 = ((Class) term1059399).getDeclaredField((String) "INTERFACE");
        ((Field) term1059398).setAccessible(true);
        Object enum1977 = ((Field) term1059398).get((Object) null);
        term1058799 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1058803 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1058799, term1058799.getClass(), "this$0", null);
        setField(term1058799, term1058799.getClass(), "call", null);
        setField(term1058799, term1058799.getClass(), "prototype", null);
        setField(term1058799, term1058799.getClass(), "kind", enum1977);
        setField(term1058803, term1058803.getClass(), "call", null);
        setField(term1058803, term1058803.getClass(), "prototype", null);
        setField(term1058803, term1058803.getClass(), "kind", enum1977);
        setField(term1058803, term1058803.getClass(), "typeOfThis", null);
        setField(term1058803, term1058803.getClass(), "source", null);
        setField(term1058803, term1058803.getClass(), "implementedInterfaces", null);
        setField(term1058803, term1058803.getClass(), "subTypes", null);
        setField(term1058803, term1058803.getClass(), "templateTypeName", null);
        setField(term1058803, term1058803.getClass(), "className", null);
        setField(term1058803, term1058803.getClass(), "properties", null);
        setField(term1058803, term1058803.getClass(), "implicitPrototype", null);
        setBooleanField(term1058803, term1058803.getClass(), "nativeType", false);
        setBooleanField(term1058803, term1058803.getClass(), "visited", false);
        setField(term1058803, term1058803.getClass(), "docInfo", null);
        setBooleanField(term1058803, term1058803.getClass(), "unknown", false);
        setBooleanField(term1058803, term1058803.getClass(), "resolved", false);
        setField(term1058803, term1058803.getClass(), "resolveResult", null);
        setField(term1058803, term1058803.getClass(), "registry", null);
        setField(term1058799, term1058799.getClass(), "typeOfThis", term1058803);
        setField(term1058799, term1058799.getClass(), "source", null);
        setField(term1058799, term1058799.getClass(), "implementedInterfaces", null);
        setField(term1058799, term1058799.getClass(), "subTypes", null);
        setField(term1058799, term1058799.getClass(), "templateTypeName", null);
        setField(term1058799, term1058799.getClass(), "className", null);
        setField(term1058799, term1058799.getClass(), "properties", null);
        setField(term1058799, term1058799.getClass(), "implicitPrototype", null);
        setBooleanField(term1058799, term1058799.getClass(), "nativeType", false);
        setBooleanField(term1058799, term1058799.getClass(), "visited", false);
        setField(term1058799, term1058799.getClass(), "docInfo", null);
        setBooleanField(term1058799, term1058799.getClass(), "unknown", false);
        setBooleanField(term1058799, term1058799.getClass(), "resolved", false);
        setField(term1058799, term1058799.getClass(), "resolveResult", null);
        setField(term1058799, term1058799.getClass(), "registry", null);
        Class<? extends Object> term1059693 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1059692 = ((Class) term1059693).getDeclaredField((String) "INTERFACE");
        ((Field) term1059692).setAccessible(true);
        Object enum1978 = ((Field) term1059692).get((Object) null);
        term1058804 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1058808 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1058804, term1058804.getClass(), "this$0", null);
        setField(term1058804, term1058804.getClass(), "call", null);
        setField(term1058804, term1058804.getClass(), "prototype", null);
        setField(term1058804, term1058804.getClass(), "kind", enum1978);
        setField(term1058808, term1058808.getClass(), "this$0", null);
        setField(term1058808, term1058808.getClass(), "call", null);
        setField(term1058808, term1058808.getClass(), "prototype", null);
        setField(term1058808, term1058808.getClass(), "kind", enum1978);
        setField(term1058808, term1058808.getClass(), "typeOfThis", null);
        setField(term1058808, term1058808.getClass(), "source", null);
        setField(term1058808, term1058808.getClass(), "implementedInterfaces", null);
        setField(term1058808, term1058808.getClass(), "subTypes", null);
        setField(term1058808, term1058808.getClass(), "templateTypeName", null);
        setField(term1058808, term1058808.getClass(), "className", null);
        setField(term1058808, term1058808.getClass(), "properties", null);
        setField(term1058808, term1058808.getClass(), "implicitPrototype", null);
        setBooleanField(term1058808, term1058808.getClass(), "nativeType", false);
        setBooleanField(term1058808, term1058808.getClass(), "visited", false);
        setField(term1058808, term1058808.getClass(), "docInfo", null);
        setBooleanField(term1058808, term1058808.getClass(), "unknown", false);
        setBooleanField(term1058808, term1058808.getClass(), "resolved", false);
        setField(term1058808, term1058808.getClass(), "resolveResult", null);
        setField(term1058808, term1058808.getClass(), "registry", null);
        setField(term1058804, term1058804.getClass(), "typeOfThis", term1058808);
        setField(term1058804, term1058804.getClass(), "source", null);
        setField(term1058804, term1058804.getClass(), "implementedInterfaces", null);
        setField(term1058804, term1058804.getClass(), "subTypes", null);
        setField(term1058804, term1058804.getClass(), "templateTypeName", null);
        setField(term1058804, term1058804.getClass(), "className", null);
        setField(term1058804, term1058804.getClass(), "properties", null);
        setField(term1058804, term1058804.getClass(), "implicitPrototype", null);
        setBooleanField(term1058804, term1058804.getClass(), "nativeType", false);
        setBooleanField(term1058804, term1058804.getClass(), "visited", false);
        setField(term1058804, term1058804.getClass(), "docInfo", null);
        setBooleanField(term1058804, term1058804.getClass(), "unknown", false);
        setBooleanField(term1058804, term1058804.getClass(), "resolved", false);
        setField(term1058804, term1058804.getClass(), "resolveResult", null);
        setField(term1058804, term1058804.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1057779;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term1057127, args);
        assertTrue(recursiveEquals(term1057127, term1058799));
        assertTrue(recursiveEquals(term1057779, term1058804));
        assertTrue(recursiveEquals(retValue, true));
    }

};


