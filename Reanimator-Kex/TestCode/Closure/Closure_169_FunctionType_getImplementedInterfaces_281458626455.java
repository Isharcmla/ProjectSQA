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

public class FunctionType_getImplementedInterfaces_281458626455 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term416897;
     Object term417635;

    public FunctionType_getImplementedInterfaces_281458626455() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term417642 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term417641 = ((Class) term417642).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term417641).setAccessible(true);
        Object enum687 = ((Field) term417641).get((Object) null);
        term416897 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term417159 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term417269 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term416897, term416897.getClass(), "kind", enum687);
        setField(term417159, term417159.getClass(), "type", term417269);
        setField(term416897, term416897.getClass(), "prototypeSlot", term417159);
        Class<? extends Object> term417942 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term417941 = ((Class) term417942).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term417941).setAccessible(true);
        Object enum688 = ((Field) term417941).get((Object) null);
        term417635 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term417636 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term417637 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term417635, term417635.getClass(), "call", null);
        setField(term417636, term417636.getClass(), "name", null);
        setField(term417637, term417637.getClass(), "call", null);
        setField(term417637, term417637.getClass(), "prototypeSlot", null);
        setField(term417637, term417637.getClass(), "kind", null);
        setField(term417637, term417637.getClass(), "propAccess", null);
        setField(term417637, term417637.getClass(), "typeOfThis", null);
        setField(term417637, term417637.getClass(), "source", null);
        setField(term417637, term417637.getClass(), "implementedInterfaces", null);
        setField(term417637, term417637.getClass(), "extendedInterfaces", null);
        setField(term417637, term417637.getClass(), "subTypes", null);
        setField(term417637, term417637.getClass(), "templateTypeNames", null);
        setField(term417637, term417637.getClass(), "className", null);
        setField(term417637, term417637.getClass(), "properties", null);
        setBooleanField(term417637, term417637.getClass(), "nativeType", false);
        setField(term417637, term417637.getClass(), "implicitPrototypeFallback", null);
        setField(term417637, term417637.getClass(), "ownerFunction", null);
        setBooleanField(term417637, term417637.getClass(), "prettyPrint", false);
        setBooleanField(term417637, term417637.getClass(), "visited", false);
        setField(term417637, term417637.getClass(), "docInfo", null);
        setBooleanField(term417637, term417637.getClass(), "unknown", false);
        setBooleanField(term417637, term417637.getClass(), "resolved", false);
        setField(term417637, term417637.getClass(), "resolveResult", null);
        setBooleanField(term417637, term417637.getClass(), "inTemplatedCheckVisit", false);
        setField(term417637, term417637.getClass(), "registry", null);
        setField(term417636, term417636.getClass(), "type", term417637);
        setBooleanField(term417636, term417636.getClass(), "inferred", false);
        setField(term417636, term417636.getClass(), "propertyNode", null);
        setField(term417636, term417636.getClass(), "docInfo", null);
        setField(term417635, term417635.getClass(), "prototypeSlot", term417636);
        setField(term417635, term417635.getClass(), "kind", enum688);
        setField(term417635, term417635.getClass(), "propAccess", null);
        setField(term417635, term417635.getClass(), "typeOfThis", null);
        setField(term417635, term417635.getClass(), "source", null);
        setField(term417635, term417635.getClass(), "implementedInterfaces", null);
        setField(term417635, term417635.getClass(), "extendedInterfaces", null);
        setField(term417635, term417635.getClass(), "subTypes", null);
        setField(term417635, term417635.getClass(), "templateTypeNames", null);
        setField(term417635, term417635.getClass(), "className", null);
        setField(term417635, term417635.getClass(), "properties", null);
        setBooleanField(term417635, term417635.getClass(), "nativeType", false);
        setField(term417635, term417635.getClass(), "implicitPrototypeFallback", null);
        setField(term417635, term417635.getClass(), "ownerFunction", null);
        setBooleanField(term417635, term417635.getClass(), "prettyPrint", false);
        setBooleanField(term417635, term417635.getClass(), "visited", false);
        setField(term417635, term417635.getClass(), "docInfo", null);
        setBooleanField(term417635, term417635.getClass(), "unknown", false);
        setBooleanField(term417635, term417635.getClass(), "resolved", false);
        setField(term417635, term417635.getClass(), "resolveResult", null);
        setBooleanField(term417635, term417635.getClass(), "inTemplatedCheckVisit", false);
        setField(term417635, term417635.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getImplementedInterfaces", argTypes, term416897, args);
        assertTrue(recursiveEquals(term416897, term417635));
        assertTrue(recursiveEquals(retValue, null));
    }

};


