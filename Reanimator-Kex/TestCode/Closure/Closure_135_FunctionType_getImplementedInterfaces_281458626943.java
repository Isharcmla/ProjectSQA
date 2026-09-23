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

public class FunctionType_getImplementedInterfaces_281458626943 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1031453;
     Object term1032209;

    public FunctionType_getImplementedInterfaces_281458626943() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1032216 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1032215 = ((Class) term1032216).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1032215).setAccessible(true);
        Object enum1924 = ((Field) term1032215).get((Object) null);
        term1031453 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1031719 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Object term1031837 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term1031453, term1031453.getClass(), "kind", enum1924);
        setField(term1031719, term1031719.getClass(), "implicitPrototype", term1031837);
        setField(term1031453, term1031453.getClass(), "prototype", term1031719);
        Class<? extends Object> term1032516 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1032515 = ((Class) term1032516).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1032515).setAccessible(true);
        Object enum1925 = ((Field) term1032515).get((Object) null);
        term1032209 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1032210 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Object term1032211 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term1032209, term1032209.getClass(), "call", null);
        setField(term1032210, term1032210.getClass(), "ownerFunction", null);
        setField(term1032210, term1032210.getClass(), "className", null);
        setField(term1032210, term1032210.getClass(), "properties", null);
        setField(term1032211, term1032211.getClass(), "ownerFunction", null);
        setField(term1032211, term1032211.getClass(), "className", null);
        setField(term1032211, term1032211.getClass(), "properties", null);
        setField(term1032211, term1032211.getClass(), "implicitPrototype", null);
        setBooleanField(term1032211, term1032211.getClass(), "nativeType", false);
        setBooleanField(term1032211, term1032211.getClass(), "visited", false);
        setField(term1032211, term1032211.getClass(), "docInfo", null);
        setBooleanField(term1032211, term1032211.getClass(), "unknown", false);
        setBooleanField(term1032211, term1032211.getClass(), "resolved", false);
        setField(term1032211, term1032211.getClass(), "resolveResult", null);
        setField(term1032211, term1032211.getClass(), "registry", null);
        setField(term1032210, term1032210.getClass(), "implicitPrototype", term1032211);
        setBooleanField(term1032210, term1032210.getClass(), "nativeType", false);
        setBooleanField(term1032210, term1032210.getClass(), "visited", false);
        setField(term1032210, term1032210.getClass(), "docInfo", null);
        setBooleanField(term1032210, term1032210.getClass(), "unknown", false);
        setBooleanField(term1032210, term1032210.getClass(), "resolved", false);
        setField(term1032210, term1032210.getClass(), "resolveResult", null);
        setField(term1032210, term1032210.getClass(), "registry", null);
        setField(term1032209, term1032209.getClass(), "prototype", term1032210);
        setField(term1032209, term1032209.getClass(), "kind", enum1925);
        setField(term1032209, term1032209.getClass(), "typeOfThis", null);
        setField(term1032209, term1032209.getClass(), "source", null);
        setField(term1032209, term1032209.getClass(), "implementedInterfaces", null);
        setField(term1032209, term1032209.getClass(), "subTypes", null);
        setField(term1032209, term1032209.getClass(), "templateTypeName", null);
        setField(term1032209, term1032209.getClass(), "className", null);
        setField(term1032209, term1032209.getClass(), "properties", null);
        setField(term1032209, term1032209.getClass(), "implicitPrototype", null);
        setBooleanField(term1032209, term1032209.getClass(), "nativeType", false);
        setBooleanField(term1032209, term1032209.getClass(), "visited", false);
        setField(term1032209, term1032209.getClass(), "docInfo", null);
        setBooleanField(term1032209, term1032209.getClass(), "unknown", false);
        setBooleanField(term1032209, term1032209.getClass(), "resolved", false);
        setField(term1032209, term1032209.getClass(), "resolveResult", null);
        setField(term1032209, term1032209.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getImplementedInterfaces", argTypes, term1031453, args);
        assertTrue(recursiveEquals(term1031453, term1032209));
        assertTrue(recursiveEquals(retValue, null));
    }

};


