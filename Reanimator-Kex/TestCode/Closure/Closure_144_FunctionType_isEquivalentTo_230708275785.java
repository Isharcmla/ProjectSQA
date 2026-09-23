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

public class FunctionType_isEquivalentTo_230708275785 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term892104;
     Object term892764;
     Object term893502;
     Object term893507;

    public FunctionType_isEquivalentTo_230708275785() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term893513 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term893512 = ((Class) term893513).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term893512).setAccessible(true);
        Object enum1615 = ((Field) term893512).get((Object) null);
        term892104 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term892654 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        setField(term892104, term892104.getClass(), "kind", enum1615);
        setField(term892104, term892104.getClass(), "typeOfThis", term892654);
        Class<? extends Object> term893813 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term893812 = ((Class) term893813).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term893812).setAccessible(true);
        Object enum1616 = ((Field) term893812).get((Object) null);
        term892764 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term892764, term892764.getClass(), "kind", enum1616);
        setField(term892764, term892764.getClass(), "typeOfThis", null);
        Class<? extends Object> term894113 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term894112 = ((Class) term894113).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term894112).setAccessible(true);
        Object enum1617 = ((Field) term894112).get((Object) null);
        term893502 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term893506 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        setField(term893502, term893502.getClass(), "call", null);
        setField(term893502, term893502.getClass(), "prototype", null);
        setField(term893502, term893502.getClass(), "kind", enum1617);
        setField(term893506, term893506.getClass(), "referencedType", null);
        setBooleanField(term893506, term893506.getClass(), "visited", false);
        setField(term893506, term893506.getClass(), "docInfo", null);
        setBooleanField(term893506, term893506.getClass(), "unknown", false);
        setBooleanField(term893506, term893506.getClass(), "resolved", false);
        setField(term893506, term893506.getClass(), "resolveResult", null);
        setField(term893506, term893506.getClass(), "registry", null);
        setField(term893502, term893502.getClass(), "typeOfThis", term893506);
        setField(term893502, term893502.getClass(), "source", null);
        setField(term893502, term893502.getClass(), "implementedInterfaces", null);
        setField(term893502, term893502.getClass(), "subTypes", null);
        setField(term893502, term893502.getClass(), "templateTypeName", null);
        setField(term893502, term893502.getClass(), "className", null);
        setField(term893502, term893502.getClass(), "properties", null);
        setField(term893502, term893502.getClass(), "implicitPrototype", null);
        setBooleanField(term893502, term893502.getClass(), "nativeType", false);
        setBooleanField(term893502, term893502.getClass(), "prettyPrint", false);
        setBooleanField(term893502, term893502.getClass(), "visited", false);
        setField(term893502, term893502.getClass(), "docInfo", null);
        setBooleanField(term893502, term893502.getClass(), "unknown", false);
        setBooleanField(term893502, term893502.getClass(), "resolved", false);
        setField(term893502, term893502.getClass(), "resolveResult", null);
        setField(term893502, term893502.getClass(), "registry", null);
        Class<? extends Object> term894413 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term894412 = ((Class) term894413).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term894412).setAccessible(true);
        Object enum1618 = ((Field) term894412).get((Object) null);
        term893507 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term893507, term893507.getClass(), "call", null);
        setField(term893507, term893507.getClass(), "prototype", null);
        setField(term893507, term893507.getClass(), "kind", enum1618);
        setField(term893507, term893507.getClass(), "typeOfThis", null);
        setField(term893507, term893507.getClass(), "source", null);
        setField(term893507, term893507.getClass(), "implementedInterfaces", null);
        setField(term893507, term893507.getClass(), "subTypes", null);
        setField(term893507, term893507.getClass(), "templateTypeName", null);
        setField(term893507, term893507.getClass(), "className", null);
        setField(term893507, term893507.getClass(), "properties", null);
        setField(term893507, term893507.getClass(), "implicitPrototype", null);
        setBooleanField(term893507, term893507.getClass(), "nativeType", false);
        setBooleanField(term893507, term893507.getClass(), "prettyPrint", false);
        setBooleanField(term893507, term893507.getClass(), "visited", false);
        setField(term893507, term893507.getClass(), "docInfo", null);
        setBooleanField(term893507, term893507.getClass(), "unknown", false);
        setBooleanField(term893507, term893507.getClass(), "resolved", false);
        setField(term893507, term893507.getClass(), "resolveResult", null);
        setField(term893507, term893507.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term892764;
        Object retValue = callMethod(klass, "isEquivalentTo", argTypes, term892104, args);
        assertTrue(recursiveEquals(term892104, term893502));
        assertTrue(recursiveEquals(term892764, term893507));
        assertTrue(recursiveEquals(retValue, false));
    }

};


