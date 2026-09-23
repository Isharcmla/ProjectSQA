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

public class FunctionType_isSubtype_2101002158397 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term247261;
     Object term247813;
     Object term248841;
     Object term248845;

    public FunctionType_isSubtype_2101002158397() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term248851 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term248850 = ((Class) term248851).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term248850).setAccessible(true);
        Object enum449 = ((Field) term248850).get((Object) null);
        term247261 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term247261, term247261.getClass(), "kind", enum449);
        Class<? extends Object> term249151 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term249150 = ((Class) term249151).getDeclaredField((String) "INTERFACE");
        ((Field) term249150).setAccessible(true);
        Object enum450 = ((Field) term249150).get((Object) null);
        term247813 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term247813, term247813.getClass(), "kind", enum450);
        Class<? extends Object> term249445 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term249444 = ((Class) term249445).getDeclaredField((String) "INTERFACE");
        ((Field) term249444).setAccessible(true);
        Object enum451 = ((Field) term249444).get((Object) null);
        term248841 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term248841, term248841.getClass(), "this$0", null);
        setField(term248841, term248841.getClass(), "call", null);
        setField(term248841, term248841.getClass(), "prototype", null);
        setField(term248841, term248841.getClass(), "kind", enum451);
        setField(term248841, term248841.getClass(), "typeOfThis", null);
        setField(term248841, term248841.getClass(), "source", null);
        setField(term248841, term248841.getClass(), "implementedInterfaces", null);
        setField(term248841, term248841.getClass(), "subTypes", null);
        setField(term248841, term248841.getClass(), "templateTypeName", null);
        setField(term248841, term248841.getClass(), "className", null);
        setField(term248841, term248841.getClass(), "properties", null);
        setField(term248841, term248841.getClass(), "implicitPrototype", null);
        setBooleanField(term248841, term248841.getClass(), "nativeType", false);
        setBooleanField(term248841, term248841.getClass(), "visited", false);
        setField(term248841, term248841.getClass(), "docInfo", null);
        setBooleanField(term248841, term248841.getClass(), "unknown", false);
        setBooleanField(term248841, term248841.getClass(), "resolved", false);
        setField(term248841, term248841.getClass(), "resolveResult", null);
        setField(term248841, term248841.getClass(), "registry", null);
        Class<? extends Object> term249739 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term249738 = ((Class) term249739).getDeclaredField((String) "INTERFACE");
        ((Field) term249738).setAccessible(true);
        Object enum452 = ((Field) term249738).get((Object) null);
        term248845 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term248845, term248845.getClass(), "this$0", null);
        setField(term248845, term248845.getClass(), "call", null);
        setField(term248845, term248845.getClass(), "prototype", null);
        setField(term248845, term248845.getClass(), "kind", enum452);
        setField(term248845, term248845.getClass(), "typeOfThis", null);
        setField(term248845, term248845.getClass(), "source", null);
        setField(term248845, term248845.getClass(), "implementedInterfaces", null);
        setField(term248845, term248845.getClass(), "subTypes", null);
        setField(term248845, term248845.getClass(), "templateTypeName", null);
        setField(term248845, term248845.getClass(), "className", null);
        setField(term248845, term248845.getClass(), "properties", null);
        setField(term248845, term248845.getClass(), "implicitPrototype", null);
        setBooleanField(term248845, term248845.getClass(), "nativeType", false);
        setBooleanField(term248845, term248845.getClass(), "visited", false);
        setField(term248845, term248845.getClass(), "docInfo", null);
        setBooleanField(term248845, term248845.getClass(), "unknown", false);
        setBooleanField(term248845, term248845.getClass(), "resolved", false);
        setField(term248845, term248845.getClass(), "resolveResult", null);
        setField(term248845, term248845.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term247813;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term247261, args);
        assertTrue(recursiveEquals(term247261, term248841));
        assertTrue(recursiveEquals(term247813, term248845));
        assertTrue(recursiveEquals(retValue, true));
    }

};


