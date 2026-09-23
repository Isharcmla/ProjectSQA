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

public class FunctionType_equals_1032735900489 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term345956;
     Object term346500;
     Object term347235;
     Object term347239;

    public FunctionType_equals_1032735900489() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term347245 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term347244 = ((Class) term347245).getDeclaredField((String) "ORDINARY");
        ((Field) term347244).setAccessible(true);
        Object enum634 = ((Field) term347244).get((Object) null);
        term345956 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term345956, term345956.getClass(), "kind", enum634);
        Class<? extends Object> term347536 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term347535 = ((Class) term347536).getDeclaredField((String) "INTERFACE");
        ((Field) term347535).setAccessible(true);
        Object enum635 = ((Field) term347535).get((Object) null);
        term346500 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term346500, term346500.getClass(), "kind", enum635);
        Class<? extends Object> term347830 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term347829 = ((Class) term347830).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term347829).setAccessible(true);
        Object enum636 = ((Field) term347829).get((Object) null);
        term347235 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term347235, term347235.getClass(), "call", null);
        setField(term347235, term347235.getClass(), "prototype", null);
        setField(term347235, term347235.getClass(), "kind", enum636);
        setField(term347235, term347235.getClass(), "typeOfThis", null);
        setField(term347235, term347235.getClass(), "source", null);
        setField(term347235, term347235.getClass(), "implementedInterfaces", null);
        setField(term347235, term347235.getClass(), "subTypes", null);
        setField(term347235, term347235.getClass(), "templateTypeName", null);
        setField(term347235, term347235.getClass(), "className", null);
        setField(term347235, term347235.getClass(), "properties", null);
        setField(term347235, term347235.getClass(), "implicitPrototype", null);
        setBooleanField(term347235, term347235.getClass(), "nativeType", false);
        setBooleanField(term347235, term347235.getClass(), "visited", false);
        setField(term347235, term347235.getClass(), "docInfo", null);
        setBooleanField(term347235, term347235.getClass(), "unknown", false);
        setBooleanField(term347235, term347235.getClass(), "resolved", false);
        setField(term347235, term347235.getClass(), "resolveResult", null);
        setField(term347235, term347235.getClass(), "registry", null);
        Class<? extends Object> term348130 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term348129 = ((Class) term348130).getDeclaredField((String) "INTERFACE");
        ((Field) term348129).setAccessible(true);
        Object enum637 = ((Field) term348129).get((Object) null);
        term347239 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term347239, term347239.getClass(), "call", null);
        setField(term347239, term347239.getClass(), "prototype", null);
        setField(term347239, term347239.getClass(), "kind", enum637);
        setField(term347239, term347239.getClass(), "typeOfThis", null);
        setField(term347239, term347239.getClass(), "source", null);
        setField(term347239, term347239.getClass(), "implementedInterfaces", null);
        setField(term347239, term347239.getClass(), "subTypes", null);
        setField(term347239, term347239.getClass(), "templateTypeName", null);
        setField(term347239, term347239.getClass(), "className", null);
        setField(term347239, term347239.getClass(), "properties", null);
        setField(term347239, term347239.getClass(), "implicitPrototype", null);
        setBooleanField(term347239, term347239.getClass(), "nativeType", false);
        setBooleanField(term347239, term347239.getClass(), "visited", false);
        setField(term347239, term347239.getClass(), "docInfo", null);
        setBooleanField(term347239, term347239.getClass(), "unknown", false);
        setBooleanField(term347239, term347239.getClass(), "resolved", false);
        setField(term347239, term347239.getClass(), "resolveResult", null);
        setField(term347239, term347239.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term346500;
        Object retValue = callMethod(klass, "equals", argTypes, term345956, args);
        assertTrue(recursiveEquals(term345956, term347235));
        assertTrue(recursiveEquals(term346500, term347239));
        assertTrue(recursiveEquals(retValue, false));
    }

};


