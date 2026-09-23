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

public class FunctionType_isSubtype_21010021581541 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2043122;
     Object term2043774;
     Object term2044677;
     Object term2044685;

    public FunctionType_isSubtype_21010021581541() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2044692 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2044691 = ((Class) term2044692).getDeclaredField((String) "INTERFACE");
        ((Field) term2044691).setAccessible(true);
        Object enum3807 = ((Field) term2044691).get((Object) null);
        Class<? extends Object> term2044986 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2044985 = ((Class) term2044986).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2044985).setAccessible(true);
        Object enum3808 = ((Field) term2044985).get((Object) null);
        term2043122 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term2043666 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term2043122, term2043122.getClass(), "kind", enum3807);
        setField(term2043666, term2043666.getClass(), "kind", enum3808);
        setField(term2043122, term2043122.getClass(), "typeOfThis", term2043666);
        term2043774 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2043956 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term2043774, term2043774.getClass(), "kind", enum3808);
        setField(term2043774, term2043774.getClass(), "typeOfThis", term2043956);
        Class<? extends Object> term2045286 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2045285 = ((Class) term2045286).getDeclaredField((String) "INTERFACE");
        ((Field) term2045285).setAccessible(true);
        Object enum3809 = ((Field) term2045285).get((Object) null);
        Class<? extends Object> term2045580 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2045579 = ((Class) term2045580).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2045579).setAccessible(true);
        Object enum3810 = ((Field) term2045579).get((Object) null);
        term2044677 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term2044681 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term2044677, term2044677.getClass(), "this$0", null);
        setField(term2044677, term2044677.getClass(), "call", null);
        setField(term2044677, term2044677.getClass(), "prototype", null);
        setField(term2044677, term2044677.getClass(), "kind", enum3809);
        setField(term2044681, term2044681.getClass(), "call", null);
        setField(term2044681, term2044681.getClass(), "prototype", null);
        setField(term2044681, term2044681.getClass(), "kind", enum3810);
        setField(term2044681, term2044681.getClass(), "typeOfThis", null);
        setField(term2044681, term2044681.getClass(), "source", null);
        setField(term2044681, term2044681.getClass(), "implementedInterfaces", null);
        setField(term2044681, term2044681.getClass(), "subTypes", null);
        setField(term2044681, term2044681.getClass(), "templateTypeName", null);
        setField(term2044681, term2044681.getClass(), "className", null);
        setField(term2044681, term2044681.getClass(), "properties", null);
        setField(term2044681, term2044681.getClass(), "implicitPrototype", null);
        setBooleanField(term2044681, term2044681.getClass(), "nativeType", false);
        setBooleanField(term2044681, term2044681.getClass(), "visited", false);
        setField(term2044681, term2044681.getClass(), "docInfo", null);
        setBooleanField(term2044681, term2044681.getClass(), "unknown", false);
        setBooleanField(term2044681, term2044681.getClass(), "resolved", false);
        setField(term2044681, term2044681.getClass(), "resolveResult", null);
        setField(term2044681, term2044681.getClass(), "registry", null);
        setField(term2044677, term2044677.getClass(), "typeOfThis", term2044681);
        setField(term2044677, term2044677.getClass(), "source", null);
        setField(term2044677, term2044677.getClass(), "implementedInterfaces", null);
        setField(term2044677, term2044677.getClass(), "subTypes", null);
        setField(term2044677, term2044677.getClass(), "templateTypeName", null);
        setField(term2044677, term2044677.getClass(), "className", null);
        setField(term2044677, term2044677.getClass(), "properties", null);
        setField(term2044677, term2044677.getClass(), "implicitPrototype", null);
        setBooleanField(term2044677, term2044677.getClass(), "nativeType", false);
        setBooleanField(term2044677, term2044677.getClass(), "visited", false);
        setField(term2044677, term2044677.getClass(), "docInfo", null);
        setBooleanField(term2044677, term2044677.getClass(), "unknown", false);
        setBooleanField(term2044677, term2044677.getClass(), "resolved", false);
        setField(term2044677, term2044677.getClass(), "resolveResult", null);
        setField(term2044677, term2044677.getClass(), "registry", null);
        Class<? extends Object> term2045880 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2045879 = ((Class) term2045880).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2045879).setAccessible(true);
        Object enum3811 = ((Field) term2045879).get((Object) null);
        term2044685 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2044689 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term2044685, term2044685.getClass(), "this$0", null);
        setField(term2044685, term2044685.getClass(), "call", null);
        setField(term2044685, term2044685.getClass(), "prototype", null);
        setField(term2044685, term2044685.getClass(), "kind", enum3811);
        setField(term2044689, term2044689.getClass(), "this$0", null);
        setField(term2044689, term2044689.getClass(), "call", null);
        setField(term2044689, term2044689.getClass(), "prototype", null);
        setField(term2044689, term2044689.getClass(), "kind", null);
        setField(term2044689, term2044689.getClass(), "typeOfThis", null);
        setField(term2044689, term2044689.getClass(), "source", null);
        setField(term2044689, term2044689.getClass(), "implementedInterfaces", null);
        setField(term2044689, term2044689.getClass(), "subTypes", null);
        setField(term2044689, term2044689.getClass(), "templateTypeName", null);
        setField(term2044689, term2044689.getClass(), "className", null);
        setField(term2044689, term2044689.getClass(), "properties", null);
        setField(term2044689, term2044689.getClass(), "implicitPrototype", null);
        setBooleanField(term2044689, term2044689.getClass(), "nativeType", false);
        setBooleanField(term2044689, term2044689.getClass(), "visited", false);
        setField(term2044689, term2044689.getClass(), "docInfo", null);
        setBooleanField(term2044689, term2044689.getClass(), "unknown", false);
        setBooleanField(term2044689, term2044689.getClass(), "resolved", false);
        setField(term2044689, term2044689.getClass(), "resolveResult", null);
        setField(term2044689, term2044689.getClass(), "registry", null);
        setField(term2044685, term2044685.getClass(), "typeOfThis", term2044689);
        setField(term2044685, term2044685.getClass(), "source", null);
        setField(term2044685, term2044685.getClass(), "implementedInterfaces", null);
        setField(term2044685, term2044685.getClass(), "subTypes", null);
        setField(term2044685, term2044685.getClass(), "templateTypeName", null);
        setField(term2044685, term2044685.getClass(), "className", null);
        setField(term2044685, term2044685.getClass(), "properties", null);
        setField(term2044685, term2044685.getClass(), "implicitPrototype", null);
        setBooleanField(term2044685, term2044685.getClass(), "nativeType", false);
        setBooleanField(term2044685, term2044685.getClass(), "visited", false);
        setField(term2044685, term2044685.getClass(), "docInfo", null);
        setBooleanField(term2044685, term2044685.getClass(), "unknown", false);
        setBooleanField(term2044685, term2044685.getClass(), "resolved", false);
        setField(term2044685, term2044685.getClass(), "resolveResult", null);
        setField(term2044685, term2044685.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2043774;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term2043122, args);
        assertTrue(recursiveEquals(term2043122, term2044677));
        assertTrue(recursiveEquals(term2043774, term2044685));
        assertTrue(recursiveEquals(retValue, false));
    }

};


