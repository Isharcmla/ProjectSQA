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
import java.lang.Object;

public class PrototypeObjectType_setOwnerFunction_1845344753114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15549;
     Object term40866;

    public PrototypeObjectType_setOwnerFunction_1845344753114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15549 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term15649 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term15549, term15549.getClass(), "ownerFunction", term15649);
        term40866 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term40866, term40866.getClass(), "call", null);
        setField(term40866, term40866.getClass(), "prototypeSlot", null);
        setField(term40866, term40866.getClass(), "kind", null);
        setField(term40866, term40866.getClass(), "typeOfThis", null);
        setField(term40866, term40866.getClass(), "source", null);
        setField(term40866, term40866.getClass(), "implementedInterfaces", null);
        setField(term40866, term40866.getClass(), "extendedInterfaces", null);
        setField(term40866, term40866.getClass(), "subTypes", null);
        setField(term40866, term40866.getClass(), "templateTypeName", null);
        setField(term40866, term40866.getClass(), "className", null);
        setField(term40866, term40866.getClass(), "properties", null);
        setBooleanField(term40866, term40866.getClass(), "nativeType", false);
        setField(term40866, term40866.getClass(), "implicitPrototypeFallback", null);
        setField(term40866, term40866.getClass(), "ownerFunction", null);
        setBooleanField(term40866, term40866.getClass(), "prettyPrint", false);
        setBooleanField(term40866, term40866.getClass(), "visited", false);
        setField(term40866, term40866.getClass(), "docInfo", null);
        setBooleanField(term40866, term40866.getClass(), "unknown", false);
        setBooleanField(term40866, term40866.getClass(), "resolved", false);
        setField(term40866, term40866.getClass(), "resolveResult", null);
        setField(term40866, term40866.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setOwnerFunction", argTypes, term15549, args);
        assertTrue(recursiveEquals(term15549, term40866));
    }

};


