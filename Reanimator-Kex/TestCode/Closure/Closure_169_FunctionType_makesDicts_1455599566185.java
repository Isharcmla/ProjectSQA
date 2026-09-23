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

public class FunctionType_makesDicts_1455599566185 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term94920;
     Object term215976;

    public FunctionType_makesDicts_1455599566185() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term215985 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term215984 = ((Class) term215985).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term215984).setAccessible(true);
        Object enum407 = ((Field) term215984).get((Object) null);
        Class<? extends Object> term216285 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$PropAccess");
        Field term216284 = ((Class) term216285).getDeclaredField((String) "DICT");
        ((Field) term216284).setAccessible(true);
        Object enum408 = ((Field) term216284).get((Object) null);
        term94920 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term94920, term94920.getClass(), "kind", enum407);
        setField(term94920, term94920.getClass(), "propAccess", enum408);
        Class<? extends Object> term216594 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term216593 = ((Class) term216594).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term216593).setAccessible(true);
        Object enum409 = ((Field) term216593).get((Object) null);
        Class<? extends Object> term216894 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$PropAccess");
        Field term216893 = ((Class) term216894).getDeclaredField((String) "DICT");
        ((Field) term216893).setAccessible(true);
        Object enum410 = ((Field) term216893).get((Object) null);
        term215976 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term215976, term215976.getClass(), "call", null);
        setField(term215976, term215976.getClass(), "prototypeSlot", null);
        setField(term215976, term215976.getClass(), "kind", enum409);
        setField(term215976, term215976.getClass(), "propAccess", enum410);
        setField(term215976, term215976.getClass(), "typeOfThis", null);
        setField(term215976, term215976.getClass(), "source", null);
        setField(term215976, term215976.getClass(), "implementedInterfaces", null);
        setField(term215976, term215976.getClass(), "extendedInterfaces", null);
        setField(term215976, term215976.getClass(), "subTypes", null);
        setField(term215976, term215976.getClass(), "templateTypeNames", null);
        setField(term215976, term215976.getClass(), "className", null);
        setField(term215976, term215976.getClass(), "properties", null);
        setBooleanField(term215976, term215976.getClass(), "nativeType", false);
        setField(term215976, term215976.getClass(), "implicitPrototypeFallback", null);
        setField(term215976, term215976.getClass(), "ownerFunction", null);
        setBooleanField(term215976, term215976.getClass(), "prettyPrint", false);
        setBooleanField(term215976, term215976.getClass(), "visited", false);
        setField(term215976, term215976.getClass(), "docInfo", null);
        setBooleanField(term215976, term215976.getClass(), "unknown", false);
        setBooleanField(term215976, term215976.getClass(), "resolved", false);
        setField(term215976, term215976.getClass(), "resolveResult", null);
        setBooleanField(term215976, term215976.getClass(), "inTemplatedCheckVisit", false);
        setField(term215976, term215976.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "makesDicts", argTypes, term94920, args);
        assertTrue(recursiveEquals(term94920, term215976));
        assertTrue(recursiveEquals(retValue, true));
    }

};


