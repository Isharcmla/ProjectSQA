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

public class FunctionType_getImplementedInterfaces_281458626207 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term102227;
     Object term102963;

    public FunctionType_getImplementedInterfaces_281458626207() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term102970 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term102969 = ((Class) term102970).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term102969).setAccessible(true);
        Object enum207 = ((Field) term102969).get((Object) null);
        term102227 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term102493 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Object term102591 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        setField(term102227, term102227.getClass(), "kind", enum207);
        setField(term102493, term102493.getClass(), "implicitPrototypeFallback", term102591);
        setField(term102227, term102227.getClass(), "prototype", term102493);
        Class<? extends Object> term103270 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term103269 = ((Class) term103270).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term103269).setAccessible(true);
        Object enum208 = ((Field) term103269).get((Object) null);
        term102963 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term102964 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Object term102965 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        setField(term102963, term102963.getClass(), "call", null);
        setField(term102964, term102964.getClass(), "ownerFunction", null);
        setField(term102964, term102964.getClass(), "className", null);
        setField(term102964, term102964.getClass(), "properties", null);
        setBooleanField(term102964, term102964.getClass(), "nativeType", false);
        setField(term102965, term102965.getClass(), "indexType", null);
        setField(term102965, term102965.getClass(), "referencedType", null);
        setField(term102965, term102965.getClass(), "referencedObjType", null);
        setBooleanField(term102965, term102965.getClass(), "visited", false);
        setField(term102965, term102965.getClass(), "docInfo", null);
        setBooleanField(term102965, term102965.getClass(), "unknown", false);
        setBooleanField(term102965, term102965.getClass(), "resolved", false);
        setField(term102965, term102965.getClass(), "resolveResult", null);
        setField(term102965, term102965.getClass(), "registry", null);
        setField(term102964, term102964.getClass(), "implicitPrototypeFallback", term102965);
        setBooleanField(term102964, term102964.getClass(), "prettyPrint", false);
        setBooleanField(term102964, term102964.getClass(), "visited", false);
        setField(term102964, term102964.getClass(), "docInfo", null);
        setBooleanField(term102964, term102964.getClass(), "unknown", false);
        setBooleanField(term102964, term102964.getClass(), "resolved", false);
        setField(term102964, term102964.getClass(), "resolveResult", null);
        setField(term102964, term102964.getClass(), "registry", null);
        setField(term102963, term102963.getClass(), "prototype", term102964);
        setField(term102963, term102963.getClass(), "kind", enum208);
        setField(term102963, term102963.getClass(), "typeOfThis", null);
        setField(term102963, term102963.getClass(), "source", null);
        setField(term102963, term102963.getClass(), "implementedInterfaces", null);
        setField(term102963, term102963.getClass(), "subTypes", null);
        setField(term102963, term102963.getClass(), "templateTypeName", null);
        setField(term102963, term102963.getClass(), "className", null);
        setField(term102963, term102963.getClass(), "properties", null);
        setBooleanField(term102963, term102963.getClass(), "nativeType", false);
        setField(term102963, term102963.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term102963, term102963.getClass(), "prettyPrint", false);
        setBooleanField(term102963, term102963.getClass(), "visited", false);
        setField(term102963, term102963.getClass(), "docInfo", null);
        setBooleanField(term102963, term102963.getClass(), "unknown", false);
        setBooleanField(term102963, term102963.getClass(), "resolved", false);
        setField(term102963, term102963.getClass(), "resolveResult", null);
        setField(term102963, term102963.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getImplementedInterfaces", argTypes, term102227, args);
        assertTrue(recursiveEquals(term102227, term102963));
        assertTrue(recursiveEquals(retValue, null));
    }

};


