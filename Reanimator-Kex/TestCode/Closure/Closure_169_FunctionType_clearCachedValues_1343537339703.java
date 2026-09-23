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
import java.util.ArrayList;
import java.lang.String;
import java.lang.Object;

public class FunctionType_clearCachedValues_1343537339703 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term703939;

    public FunctionType_clearCachedValues_1343537339703() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term703991 = new ArrayList();
        Class<? extends Object> term704301 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term704300 = ((Class) term704301).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term704300).setAccessible(true);
        Object enum1143 = ((Field) term704300).get((Object) null);
        ArrayList term704299 = new ArrayList();
        term703939 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term704247 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setBooleanField(term703939, term703939.getClass(), "unknown", false);
        setField(term703939, term703939.getClass(), "subTypes", term703991);
        setBooleanField(term703939, term703939.getClass(), "nativeType", false);
        setField(term703939, term703939.getClass(), "kind", enum1143);
        setBooleanField(term704247, term704247.getClass(), "unknown", false);
        setField(term704247, term704247.getClass(), "subTypes", term704299);
        setField(term703939, term703939.getClass(), "typeOfThis", term704247);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "clearCachedValues", argTypes, term703939, args);
    }

};


