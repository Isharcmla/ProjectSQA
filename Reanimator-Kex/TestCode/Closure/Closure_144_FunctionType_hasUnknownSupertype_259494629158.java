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

public class FunctionType_hasUnknownSupertype_259494629158 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77366;
     Object term78770;

    public FunctionType_hasUnknownSupertype_259494629158() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term78778 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term78777 = ((Class) term78778).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term78777).setAccessible(true);
        Object enum181 = ((Field) term78777).get((Object) null);
        term77366 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term77632 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Object term77746 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setField(term77366, term77366.getClass(), "kind", enum181);
        setBooleanField(term77366, term77366.getClass(), "unknown", false);
        setField(term77632, term77632.getClass(), "implicitPrototype", term77746);
        setField(term77366, term77366.getClass(), "prototype", term77632);
        Class<? extends Object> term79078 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term79077 = ((Class) term79078).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term79077).setAccessible(true);
        Object enum182 = ((Field) term79077).get((Object) null);
        term78770 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term78771 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Object term78772 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setField(term78770, term78770.getClass(), "call", null);
        setField(term78771, term78771.getClass(), "ownerFunction", null);
        setField(term78771, term78771.getClass(), "className", null);
        setField(term78771, term78771.getClass(), "properties", null);
        setField(term78772, term78772.getClass(), "className", null);
        setField(term78772, term78772.getClass(), "properties", null);
        setField(term78772, term78772.getClass(), "implicitPrototype", null);
        setBooleanField(term78772, term78772.getClass(), "nativeType", false);
        setBooleanField(term78772, term78772.getClass(), "prettyPrint", false);
        setBooleanField(term78772, term78772.getClass(), "visited", false);
        setField(term78772, term78772.getClass(), "docInfo", null);
        setBooleanField(term78772, term78772.getClass(), "unknown", false);
        setBooleanField(term78772, term78772.getClass(), "resolved", false);
        setField(term78772, term78772.getClass(), "resolveResult", null);
        setField(term78772, term78772.getClass(), "registry", null);
        setField(term78771, term78771.getClass(), "implicitPrototype", term78772);
        setBooleanField(term78771, term78771.getClass(), "nativeType", false);
        setBooleanField(term78771, term78771.getClass(), "prettyPrint", false);
        setBooleanField(term78771, term78771.getClass(), "visited", false);
        setField(term78771, term78771.getClass(), "docInfo", null);
        setBooleanField(term78771, term78771.getClass(), "unknown", false);
        setBooleanField(term78771, term78771.getClass(), "resolved", false);
        setField(term78771, term78771.getClass(), "resolveResult", null);
        setField(term78771, term78771.getClass(), "registry", null);
        setField(term78770, term78770.getClass(), "prototype", term78771);
        setField(term78770, term78770.getClass(), "kind", enum182);
        setField(term78770, term78770.getClass(), "typeOfThis", null);
        setField(term78770, term78770.getClass(), "source", null);
        setField(term78770, term78770.getClass(), "implementedInterfaces", null);
        setField(term78770, term78770.getClass(), "subTypes", null);
        setField(term78770, term78770.getClass(), "templateTypeName", null);
        setField(term78770, term78770.getClass(), "className", null);
        setField(term78770, term78770.getClass(), "properties", null);
        setField(term78770, term78770.getClass(), "implicitPrototype", null);
        setBooleanField(term78770, term78770.getClass(), "nativeType", false);
        setBooleanField(term78770, term78770.getClass(), "prettyPrint", false);
        setBooleanField(term78770, term78770.getClass(), "visited", false);
        setField(term78770, term78770.getClass(), "docInfo", null);
        setBooleanField(term78770, term78770.getClass(), "unknown", false);
        setBooleanField(term78770, term78770.getClass(), "resolved", false);
        setField(term78770, term78770.getClass(), "resolveResult", null);
        setField(term78770, term78770.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hasUnknownSupertype", argTypes, term77366, args);
        assertTrue(recursiveEquals(term77366, term78770));
        assertTrue(recursiveEquals(retValue, false));
    }

};


