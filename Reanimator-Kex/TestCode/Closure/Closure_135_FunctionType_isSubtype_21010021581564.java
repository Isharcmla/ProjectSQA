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

public class FunctionType_isSubtype_21010021581564 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2078347;
     Object term2078999;
     Object term2081690;
     Object term2081698;

    public FunctionType_isSubtype_21010021581564() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2081709 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2081708 = ((Class) term2081709).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2081708).setAccessible(true);
        Object enum3872 = ((Field) term2081708).get((Object) null);
        Class<? extends Object> term2082009 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2082008 = ((Class) term2082009).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2082008).setAccessible(true);
        Object enum3873 = ((Field) term2082008).get((Object) null);
        term2078347 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term2078891 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term2078347, term2078347.getClass(), "kind", enum3872);
        setField(term2078891, term2078891.getClass(), "kind", enum3873);
        setField(term2078891, term2078891.getClass(), "call", null);
        setField(term2078347, term2078347.getClass(), "typeOfThis", term2078891);
        term2078999 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term2079329 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2079423 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term2078999, term2078999.getClass(), "kind", enum3872);
        setField(term2079329, term2079329.getClass(), "kind", enum3873);
        setField(term2079329, term2079329.getClass(), "call", term2079423);
        setField(term2078999, term2078999.getClass(), "typeOfThis", term2079329);
        Class<? extends Object> term2082309 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2082308 = ((Class) term2082309).getDeclaredField((String) "INTERFACE");
        ((Field) term2082308).setAccessible(true);
        Object enum3874 = ((Field) term2082308).get((Object) null);
        Class<? extends Object> term2082603 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2082602 = ((Class) term2082603).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2082602).setAccessible(true);
        Object enum3875 = ((Field) term2082602).get((Object) null);
        term2081690 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term2081694 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term2081690, term2081690.getClass(), "this$0", null);
        setField(term2081690, term2081690.getClass(), "call", null);
        setField(term2081690, term2081690.getClass(), "prototype", null);
        setField(term2081690, term2081690.getClass(), "kind", enum3874);
        setField(term2081694, term2081694.getClass(), "call", null);
        setField(term2081694, term2081694.getClass(), "prototype", null);
        setField(term2081694, term2081694.getClass(), "kind", enum3875);
        setField(term2081694, term2081694.getClass(), "typeOfThis", null);
        setField(term2081694, term2081694.getClass(), "source", null);
        setField(term2081694, term2081694.getClass(), "implementedInterfaces", null);
        setField(term2081694, term2081694.getClass(), "subTypes", null);
        setField(term2081694, term2081694.getClass(), "templateTypeName", null);
        setField(term2081694, term2081694.getClass(), "className", null);
        setField(term2081694, term2081694.getClass(), "properties", null);
        setField(term2081694, term2081694.getClass(), "implicitPrototype", null);
        setBooleanField(term2081694, term2081694.getClass(), "nativeType", false);
        setBooleanField(term2081694, term2081694.getClass(), "visited", false);
        setField(term2081694, term2081694.getClass(), "docInfo", null);
        setBooleanField(term2081694, term2081694.getClass(), "unknown", false);
        setBooleanField(term2081694, term2081694.getClass(), "resolved", false);
        setField(term2081694, term2081694.getClass(), "resolveResult", null);
        setField(term2081694, term2081694.getClass(), "registry", null);
        setField(term2081690, term2081690.getClass(), "typeOfThis", term2081694);
        setField(term2081690, term2081690.getClass(), "source", null);
        setField(term2081690, term2081690.getClass(), "implementedInterfaces", null);
        setField(term2081690, term2081690.getClass(), "subTypes", null);
        setField(term2081690, term2081690.getClass(), "templateTypeName", null);
        setField(term2081690, term2081690.getClass(), "className", null);
        setField(term2081690, term2081690.getClass(), "properties", null);
        setField(term2081690, term2081690.getClass(), "implicitPrototype", null);
        setBooleanField(term2081690, term2081690.getClass(), "nativeType", false);
        setBooleanField(term2081690, term2081690.getClass(), "visited", false);
        setField(term2081690, term2081690.getClass(), "docInfo", null);
        setBooleanField(term2081690, term2081690.getClass(), "unknown", false);
        setBooleanField(term2081690, term2081690.getClass(), "resolved", false);
        setField(term2081690, term2081690.getClass(), "resolveResult", null);
        setField(term2081690, term2081690.getClass(), "registry", null);
        Class<? extends Object> term2082903 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2082902 = ((Class) term2082903).getDeclaredField((String) "INTERFACE");
        ((Field) term2082902).setAccessible(true);
        Object enum3876 = ((Field) term2082902).get((Object) null);
        Class<? extends Object> term2083197 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2083196 = ((Class) term2083197).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2083196).setAccessible(true);
        Object enum3877 = ((Field) term2083196).get((Object) null);
        term2081698 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term2081702 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2081703 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term2081698, term2081698.getClass(), "this$0", null);
        setField(term2081698, term2081698.getClass(), "call", null);
        setField(term2081698, term2081698.getClass(), "prototype", null);
        setField(term2081698, term2081698.getClass(), "kind", enum3876);
        setField(term2081702, term2081702.getClass(), "this$0", null);
        setField(term2081703, term2081703.getClass(), "parameters", null);
        setField(term2081703, term2081703.getClass(), "returnType", null);
        setBooleanField(term2081703, term2081703.getClass(), "resolved", false);
        setField(term2081703, term2081703.getClass(), "resolveResult", null);
        setField(term2081703, term2081703.getClass(), "registry", null);
        setField(term2081702, term2081702.getClass(), "call", term2081703);
        setField(term2081702, term2081702.getClass(), "prototype", null);
        setField(term2081702, term2081702.getClass(), "kind", enum3877);
        setField(term2081702, term2081702.getClass(), "typeOfThis", null);
        setField(term2081702, term2081702.getClass(), "source", null);
        setField(term2081702, term2081702.getClass(), "implementedInterfaces", null);
        setField(term2081702, term2081702.getClass(), "subTypes", null);
        setField(term2081702, term2081702.getClass(), "templateTypeName", null);
        setField(term2081702, term2081702.getClass(), "className", null);
        setField(term2081702, term2081702.getClass(), "properties", null);
        setField(term2081702, term2081702.getClass(), "implicitPrototype", null);
        setBooleanField(term2081702, term2081702.getClass(), "nativeType", false);
        setBooleanField(term2081702, term2081702.getClass(), "visited", false);
        setField(term2081702, term2081702.getClass(), "docInfo", null);
        setBooleanField(term2081702, term2081702.getClass(), "unknown", false);
        setBooleanField(term2081702, term2081702.getClass(), "resolved", false);
        setField(term2081702, term2081702.getClass(), "resolveResult", null);
        setField(term2081702, term2081702.getClass(), "registry", null);
        setField(term2081698, term2081698.getClass(), "typeOfThis", term2081702);
        setField(term2081698, term2081698.getClass(), "source", null);
        setField(term2081698, term2081698.getClass(), "implementedInterfaces", null);
        setField(term2081698, term2081698.getClass(), "subTypes", null);
        setField(term2081698, term2081698.getClass(), "templateTypeName", null);
        setField(term2081698, term2081698.getClass(), "className", null);
        setField(term2081698, term2081698.getClass(), "properties", null);
        setField(term2081698, term2081698.getClass(), "implicitPrototype", null);
        setBooleanField(term2081698, term2081698.getClass(), "nativeType", false);
        setBooleanField(term2081698, term2081698.getClass(), "visited", false);
        setField(term2081698, term2081698.getClass(), "docInfo", null);
        setBooleanField(term2081698, term2081698.getClass(), "unknown", false);
        setBooleanField(term2081698, term2081698.getClass(), "resolved", false);
        setField(term2081698, term2081698.getClass(), "resolveResult", null);
        setField(term2081698, term2081698.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2078999;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term2078347, args);
        assertTrue(recursiveEquals(term2078347, term2081690));
        assertTrue(recursiveEquals(term2078999, term2081698));
        assertTrue(recursiveEquals(retValue, true));
    }

};


