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

public class FunctionType_hasUnknownSupertype_259494629471 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term328752;
     Object term329530;

    public FunctionType_hasUnknownSupertype_259494629471() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term329538 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term329537 = ((Class) term329538).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term329537).setAccessible(true);
        Object enum602 = ((Field) term329537).get((Object) null);
        term328752 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term329018 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Object term329132 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setField(term328752, term328752.getClass(), "kind", enum602);
        setBooleanField(term328752, term328752.getClass(), "unknown", false);
        setField(term329018, term329018.getClass(), "implicitPrototype", term329132);
        setField(term328752, term328752.getClass(), "prototype", term329018);
        Class<? extends Object> term329838 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term329837 = ((Class) term329838).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term329837).setAccessible(true);
        Object enum603 = ((Field) term329837).get((Object) null);
        term329530 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term329531 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Object term329532 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setField(term329530, term329530.getClass(), "call", null);
        setField(term329531, term329531.getClass(), "ownerFunction", null);
        setField(term329531, term329531.getClass(), "className", null);
        setField(term329531, term329531.getClass(), "properties", null);
        setField(term329532, term329532.getClass(), "className", null);
        setField(term329532, term329532.getClass(), "properties", null);
        setField(term329532, term329532.getClass(), "implicitPrototype", null);
        setBooleanField(term329532, term329532.getClass(), "nativeType", false);
        setBooleanField(term329532, term329532.getClass(), "visited", false);
        setField(term329532, term329532.getClass(), "docInfo", null);
        setBooleanField(term329532, term329532.getClass(), "unknown", false);
        setBooleanField(term329532, term329532.getClass(), "resolved", false);
        setField(term329532, term329532.getClass(), "resolveResult", null);
        setField(term329532, term329532.getClass(), "registry", null);
        setField(term329531, term329531.getClass(), "implicitPrototype", term329532);
        setBooleanField(term329531, term329531.getClass(), "nativeType", false);
        setBooleanField(term329531, term329531.getClass(), "visited", false);
        setField(term329531, term329531.getClass(), "docInfo", null);
        setBooleanField(term329531, term329531.getClass(), "unknown", false);
        setBooleanField(term329531, term329531.getClass(), "resolved", false);
        setField(term329531, term329531.getClass(), "resolveResult", null);
        setField(term329531, term329531.getClass(), "registry", null);
        setField(term329530, term329530.getClass(), "prototype", term329531);
        setField(term329530, term329530.getClass(), "kind", enum603);
        setField(term329530, term329530.getClass(), "typeOfThis", null);
        setField(term329530, term329530.getClass(), "source", null);
        setField(term329530, term329530.getClass(), "implementedInterfaces", null);
        setField(term329530, term329530.getClass(), "subTypes", null);
        setField(term329530, term329530.getClass(), "templateTypeName", null);
        setField(term329530, term329530.getClass(), "className", null);
        setField(term329530, term329530.getClass(), "properties", null);
        setField(term329530, term329530.getClass(), "implicitPrototype", null);
        setBooleanField(term329530, term329530.getClass(), "nativeType", false);
        setBooleanField(term329530, term329530.getClass(), "visited", false);
        setField(term329530, term329530.getClass(), "docInfo", null);
        setBooleanField(term329530, term329530.getClass(), "unknown", false);
        setBooleanField(term329530, term329530.getClass(), "resolved", false);
        setField(term329530, term329530.getClass(), "resolveResult", null);
        setField(term329530, term329530.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hasUnknownSupertype", argTypes, term328752, args);
        assertTrue(recursiveEquals(term328752, term329530));
        assertTrue(recursiveEquals(retValue, false));
    }

};


