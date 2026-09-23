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

public class FunctionType_clearCachedValues_1343537339724 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term732511;

    public FunctionType_clearCachedValues_1343537339724() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term732563 = new ArrayList();
        Class<? extends Object> term733339 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term733338 = ((Class) term733339).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term733338).setAccessible(true);
        Object enum1170 = ((Field) term733338).get((Object) null);
        Class<? extends Object> term733639 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term733638 = ((Class) term733639).getDeclaredField((String) "INTERFACE");
        ((Field) term733638).setAccessible(true);
        Object enum1171 = ((Field) term733638).get((Object) null);
        term732511 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term732819 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term732927 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term733337 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setBooleanField(term732511, term732511.getClass(), "unknown", false);
        setField(term732511, term732511.getClass(), "subTypes", term732563);
        setBooleanField(term732511, term732511.getClass(), "nativeType", false);
        setField(term732511, term732511.getClass(), "kind", enum1170);
        setBooleanField(term732819, term732819.getClass(), "unknown", false);
        setField(term732819, term732819.getClass(), "subTypes", null);
        setBooleanField(term732819, term732819.getClass(), "nativeType", false);
        setField(term732819, term732819.getClass(), "kind", enum1170);
        setBooleanField(term732927, term732927.getClass(), "unknown", false);
        setField(term732927, term732927.getClass(), "subTypes", null);
        setBooleanField(term732927, term732927.getClass(), "nativeType", false);
        setField(term732927, term732927.getClass(), "kind", enum1171);
        setField(term732927, term732927.getClass(), "prototypeSlot", null);
        setField(term732819, term732819.getClass(), "typeOfThis", term732927);
        setField(term732819, term732819.getClass(), "prototypeSlot", term733337);
        setField(term732511, term732511.getClass(), "typeOfThis", term732819);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "clearCachedValues", argTypes, term732511, args);
    }

};


