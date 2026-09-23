package com.google.javascript.jscomp;

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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.lang.Object;

public class TypeValidator_getReadableJSTypeName_850599436264 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75675;
     Object term75767;
     Object term76198;
     Object term76199;

    public TypeValidator_getReadableJSTypeName_850599436264() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75675 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term75767 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term75859 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        Object term75959 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setIntField(term75767, term75767.getClass(), "type", 0);
        setField(term75859, term75859.getClass(), "ownerFunction", term75959);
        setField(term75767, term75767.getClass(), "jsType", term75859);
        term76198 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term76198, term76198.getClass(), "compiler", null);
        setField(term76198, term76198.getClass(), "typeRegistry", null);
        setField(term76198, term76198.getClass(), "allValueTypes", null);
        setBooleanField(term76198, term76198.getClass(), "shouldReport", false);
        setField(term76198, term76198.getClass(), "nullOrUndefined", null);
        setField(term76198, term76198.getClass(), "mismatches", null);
        term76199 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term76200 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        Object term76201 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term76199, term76199.getClass(), "str", null);
        setIntField(term76199, term76199.getClass(), "type", 0);
        setField(term76199, term76199.getClass(), "next", null);
        setField(term76199, term76199.getClass(), "first", null);
        setField(term76199, term76199.getClass(), "last", null);
        setField(term76199, term76199.getClass(), "propListHead", null);
        setIntField(term76199, term76199.getClass(), "sourcePosition", 0);
        setField(term76200, term76200.getClass(), "source", null);
        setField(term76200, term76200.getClass(), "elementsType", null);
        setField(term76200, term76200.getClass(), "elements", null);
        setField(term76200, term76200.getClass(), "className", null);
        setField(term76200, term76200.getClass(), "properties", null);
        setBooleanField(term76200, term76200.getClass(), "nativeType", false);
        setField(term76200, term76200.getClass(), "implicitPrototypeFallback", null);
        setField(term76201, term76201.getClass(), "call", null);
        setField(term76201, term76201.getClass(), "prototypeSlot", null);
        setField(term76201, term76201.getClass(), "kind", null);
        setField(term76201, term76201.getClass(), "propAccess", null);
        setField(term76201, term76201.getClass(), "typeOfThis", null);
        setField(term76201, term76201.getClass(), "source", null);
        setField(term76201, term76201.getClass(), "implementedInterfaces", null);
        setField(term76201, term76201.getClass(), "extendedInterfaces", null);
        setField(term76201, term76201.getClass(), "subTypes", null);
        setField(term76201, term76201.getClass(), "className", null);
        setField(term76201, term76201.getClass(), "properties", null);
        setBooleanField(term76201, term76201.getClass(), "nativeType", false);
        setField(term76201, term76201.getClass(), "implicitPrototypeFallback", null);
        setField(term76201, term76201.getClass(), "ownerFunction", null);
        setBooleanField(term76201, term76201.getClass(), "prettyPrint", false);
        setBooleanField(term76201, term76201.getClass(), "visited", false);
        setField(term76201, term76201.getClass(), "docInfo", null);
        setBooleanField(term76201, term76201.getClass(), "unknown", false);
        setBooleanField(term76201, term76201.getClass(), "resolved", false);
        setField(term76201, term76201.getClass(), "resolveResult", null);
        setField(term76201, term76201.getClass(), "templateKeys", null);
        setField(term76201, term76201.getClass(), "templatizedTypes", null);
        setBooleanField(term76201, term76201.getClass(), "inTemplatedCheckVisit", false);
        setField(term76201, term76201.getClass(), "registry", null);
        setField(term76200, term76200.getClass(), "ownerFunction", term76201);
        setBooleanField(term76200, term76200.getClass(), "prettyPrint", false);
        setBooleanField(term76200, term76200.getClass(), "visited", false);
        setField(term76200, term76200.getClass(), "docInfo", null);
        setBooleanField(term76200, term76200.getClass(), "unknown", false);
        setBooleanField(term76200, term76200.getClass(), "resolved", false);
        setField(term76200, term76200.getClass(), "resolveResult", null);
        setField(term76200, term76200.getClass(), "templateKeys", null);
        setField(term76200, term76200.getClass(), "templatizedTypes", null);
        setBooleanField(term76200, term76200.getClass(), "inTemplatedCheckVisit", false);
        setField(term76200, term76200.getClass(), "registry", null);
        setField(term76199, term76199.getClass(), "jsType", term76200);
        setField(term76199, term76199.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term75767;
        args[1] = true;
        Object retValue = callMethod(klass, "getReadableJSTypeName", argTypes, term75675, args);
        assertTrue(recursiveEquals(term75675, term76198));
        assertTrue(recursiveEquals(term75767, term76199));
        assertTrue(recursiveEquals(retValue, "null.prototype"));
    }

};


