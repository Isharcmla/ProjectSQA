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

public class FunctionType_isEquivalentTo_230708275229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term125503;
     Object term125869;
     Object term126697;
     Object term126702;

    public FunctionType_isEquivalentTo_230708275229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term126708 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term126707 = ((Class) term126708).getDeclaredField((String) "ORDINARY");
        ((Field) term126707).setAccessible(true);
        Object enum241 = ((Field) term126707).get((Object) null);
        term125503 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term125759 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term125503, term125503.getClass(), "kind", enum241);
        setField(term125503, term125503.getClass(), "typeOfThis", term125759);
        Class<? extends Object> term126999 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term126998 = ((Class) term126999).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term126998).setAccessible(true);
        Object enum242 = ((Field) term126998).get((Object) null);
        term125869 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term125869, term125869.getClass(), "kind", enum242);
        setField(term125869, term125869.getClass(), "typeOfThis", null);
        Class<? extends Object> term127299 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term127298 = ((Class) term127299).getDeclaredField((String) "ORDINARY");
        ((Field) term127298).setAccessible(true);
        Object enum243 = ((Field) term127298).get((Object) null);
        term126697 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term126701 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term126697, term126697.getClass(), "call", null);
        setField(term126697, term126697.getClass(), "prototype", null);
        setField(term126697, term126697.getClass(), "kind", enum243);
        setField(term126701, term126701.getClass(), "this$0", null);
        setField(term126701, term126701.getClass(), "call", null);
        setField(term126701, term126701.getClass(), "prototype", null);
        setField(term126701, term126701.getClass(), "kind", null);
        setField(term126701, term126701.getClass(), "typeOfThis", null);
        setField(term126701, term126701.getClass(), "source", null);
        setField(term126701, term126701.getClass(), "implementedInterfaces", null);
        setField(term126701, term126701.getClass(), "subTypes", null);
        setField(term126701, term126701.getClass(), "templateTypeName", null);
        setField(term126701, term126701.getClass(), "className", null);
        setField(term126701, term126701.getClass(), "properties", null);
        setBooleanField(term126701, term126701.getClass(), "nativeType", false);
        setField(term126701, term126701.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term126701, term126701.getClass(), "prettyPrint", false);
        setBooleanField(term126701, term126701.getClass(), "visited", false);
        setField(term126701, term126701.getClass(), "docInfo", null);
        setBooleanField(term126701, term126701.getClass(), "unknown", false);
        setBooleanField(term126701, term126701.getClass(), "resolved", false);
        setField(term126701, term126701.getClass(), "resolveResult", null);
        setField(term126701, term126701.getClass(), "registry", null);
        setField(term126697, term126697.getClass(), "typeOfThis", term126701);
        setField(term126697, term126697.getClass(), "source", null);
        setField(term126697, term126697.getClass(), "implementedInterfaces", null);
        setField(term126697, term126697.getClass(), "subTypes", null);
        setField(term126697, term126697.getClass(), "templateTypeName", null);
        setField(term126697, term126697.getClass(), "className", null);
        setField(term126697, term126697.getClass(), "properties", null);
        setBooleanField(term126697, term126697.getClass(), "nativeType", false);
        setField(term126697, term126697.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term126697, term126697.getClass(), "prettyPrint", false);
        setBooleanField(term126697, term126697.getClass(), "visited", false);
        setField(term126697, term126697.getClass(), "docInfo", null);
        setBooleanField(term126697, term126697.getClass(), "unknown", false);
        setBooleanField(term126697, term126697.getClass(), "resolved", false);
        setField(term126697, term126697.getClass(), "resolveResult", null);
        setField(term126697, term126697.getClass(), "registry", null);
        Class<? extends Object> term127590 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term127589 = ((Class) term127590).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term127589).setAccessible(true);
        Object enum244 = ((Field) term127589).get((Object) null);
        term126702 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term126702, term126702.getClass(), "call", null);
        setField(term126702, term126702.getClass(), "prototype", null);
        setField(term126702, term126702.getClass(), "kind", enum244);
        setField(term126702, term126702.getClass(), "typeOfThis", null);
        setField(term126702, term126702.getClass(), "source", null);
        setField(term126702, term126702.getClass(), "implementedInterfaces", null);
        setField(term126702, term126702.getClass(), "subTypes", null);
        setField(term126702, term126702.getClass(), "templateTypeName", null);
        setField(term126702, term126702.getClass(), "className", null);
        setField(term126702, term126702.getClass(), "properties", null);
        setBooleanField(term126702, term126702.getClass(), "nativeType", false);
        setField(term126702, term126702.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term126702, term126702.getClass(), "prettyPrint", false);
        setBooleanField(term126702, term126702.getClass(), "visited", false);
        setField(term126702, term126702.getClass(), "docInfo", null);
        setBooleanField(term126702, term126702.getClass(), "unknown", false);
        setBooleanField(term126702, term126702.getClass(), "resolved", false);
        setField(term126702, term126702.getClass(), "resolveResult", null);
        setField(term126702, term126702.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term125869;
        Object retValue = callMethod(klass, "isEquivalentTo", argTypes, term125503, args);
        assertTrue(recursiveEquals(term125503, term126697));
        assertTrue(recursiveEquals(term125869, term126702));
        assertTrue(recursiveEquals(retValue, false));
    }

};


