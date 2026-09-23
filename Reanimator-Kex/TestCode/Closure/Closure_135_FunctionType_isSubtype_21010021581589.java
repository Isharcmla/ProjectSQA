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

public class FunctionType_isSubtype_21010021581589 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2122266;
     Object term2122706;
     Object term2123697;
     Object term2123703;

    public FunctionType_isSubtype_21010021581589() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2123710 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2123709 = ((Class) term2123710).getDeclaredField((String) "ORDINARY");
        ((Field) term2123709).setAccessible(true);
        Object enum3957 = ((Field) term2123709).get((Object) null);
        term2122266 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term2122502 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        Object term2122596 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term2122266, term2122266.getClass(), "kind", enum3957);
        setField(term2122266, term2122266.getClass(), "typeOfThis", term2122502);
        setField(term2122266, term2122266.getClass(), "call", term2122596);
        Class<? extends Object> term2124001 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2124000 = ((Class) term2124001).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2124000).setAccessible(true);
        Object enum3958 = ((Field) term2124000).get((Object) null);
        term2122706 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term2122948 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term2122706, term2122706.getClass(), "kind", enum3958);
        setField(term2122706, term2122706.getClass(), "typeOfThis", null);
        setField(term2122706, term2122706.getClass(), "call", term2122948);
        Class<? extends Object> term2124301 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2124300 = ((Class) term2124301).getDeclaredField((String) "ORDINARY");
        ((Field) term2124300).setAccessible(true);
        Object enum3959 = ((Field) term2124300).get((Object) null);
        term2123697 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term2123698 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term2123702 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term2123697, term2123697.getClass(), "this$0", null);
        setField(term2123698, term2123698.getClass(), "parameters", null);
        setField(term2123698, term2123698.getClass(), "returnType", null);
        setBooleanField(term2123698, term2123698.getClass(), "resolved", false);
        setField(term2123698, term2123698.getClass(), "resolveResult", null);
        setField(term2123698, term2123698.getClass(), "registry", null);
        setField(term2123697, term2123697.getClass(), "call", term2123698);
        setField(term2123697, term2123697.getClass(), "prototype", null);
        setField(term2123697, term2123697.getClass(), "kind", enum3959);
        setField(term2123702, term2123702.getClass(), "leastSupertypeVisitor", null);
        setField(term2123702, term2123702.getClass(), "greatestSubtypeVisitor", null);
        setField(term2123702, term2123702.getClass(), "call", null);
        setField(term2123702, term2123702.getClass(), "prototype", null);
        setField(term2123702, term2123702.getClass(), "kind", null);
        setField(term2123702, term2123702.getClass(), "typeOfThis", null);
        setField(term2123702, term2123702.getClass(), "source", null);
        setField(term2123702, term2123702.getClass(), "implementedInterfaces", null);
        setField(term2123702, term2123702.getClass(), "subTypes", null);
        setField(term2123702, term2123702.getClass(), "templateTypeName", null);
        setField(term2123702, term2123702.getClass(), "className", null);
        setField(term2123702, term2123702.getClass(), "properties", null);
        setField(term2123702, term2123702.getClass(), "implicitPrototype", null);
        setBooleanField(term2123702, term2123702.getClass(), "nativeType", false);
        setBooleanField(term2123702, term2123702.getClass(), "visited", false);
        setField(term2123702, term2123702.getClass(), "docInfo", null);
        setBooleanField(term2123702, term2123702.getClass(), "unknown", false);
        setBooleanField(term2123702, term2123702.getClass(), "resolved", false);
        setField(term2123702, term2123702.getClass(), "resolveResult", null);
        setField(term2123702, term2123702.getClass(), "registry", null);
        setField(term2123697, term2123697.getClass(), "typeOfThis", term2123702);
        setField(term2123697, term2123697.getClass(), "source", null);
        setField(term2123697, term2123697.getClass(), "implementedInterfaces", null);
        setField(term2123697, term2123697.getClass(), "subTypes", null);
        setField(term2123697, term2123697.getClass(), "templateTypeName", null);
        setField(term2123697, term2123697.getClass(), "className", null);
        setField(term2123697, term2123697.getClass(), "properties", null);
        setField(term2123697, term2123697.getClass(), "implicitPrototype", null);
        setBooleanField(term2123697, term2123697.getClass(), "nativeType", false);
        setBooleanField(term2123697, term2123697.getClass(), "visited", false);
        setField(term2123697, term2123697.getClass(), "docInfo", null);
        setBooleanField(term2123697, term2123697.getClass(), "unknown", false);
        setBooleanField(term2123697, term2123697.getClass(), "resolved", false);
        setField(term2123697, term2123697.getClass(), "resolveResult", null);
        setField(term2123697, term2123697.getClass(), "registry", null);
        Class<? extends Object> term2124592 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2124591 = ((Class) term2124592).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2124591).setAccessible(true);
        Object enum3960 = ((Field) term2124591).get((Object) null);
        term2123703 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term2123704 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term2123704, term2123704.getClass(), "parameters", null);
        setField(term2123704, term2123704.getClass(), "returnType", null);
        setBooleanField(term2123704, term2123704.getClass(), "resolved", false);
        setField(term2123704, term2123704.getClass(), "resolveResult", null);
        setField(term2123704, term2123704.getClass(), "registry", null);
        setField(term2123703, term2123703.getClass(), "call", term2123704);
        setField(term2123703, term2123703.getClass(), "prototype", null);
        setField(term2123703, term2123703.getClass(), "kind", enum3960);
        setField(term2123703, term2123703.getClass(), "typeOfThis", null);
        setField(term2123703, term2123703.getClass(), "source", null);
        setField(term2123703, term2123703.getClass(), "implementedInterfaces", null);
        setField(term2123703, term2123703.getClass(), "subTypes", null);
        setField(term2123703, term2123703.getClass(), "templateTypeName", null);
        setField(term2123703, term2123703.getClass(), "className", null);
        setField(term2123703, term2123703.getClass(), "properties", null);
        setField(term2123703, term2123703.getClass(), "implicitPrototype", null);
        setBooleanField(term2123703, term2123703.getClass(), "nativeType", false);
        setBooleanField(term2123703, term2123703.getClass(), "visited", false);
        setField(term2123703, term2123703.getClass(), "docInfo", null);
        setBooleanField(term2123703, term2123703.getClass(), "unknown", false);
        setBooleanField(term2123703, term2123703.getClass(), "resolved", false);
        setField(term2123703, term2123703.getClass(), "resolveResult", null);
        setField(term2123703, term2123703.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2122706;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term2122266, args);
        assertTrue(recursiveEquals(term2122266, term2123697));
        assertTrue(recursiveEquals(term2122706, term2123703));
        assertTrue(recursiveEquals(retValue, true));
    }

};


