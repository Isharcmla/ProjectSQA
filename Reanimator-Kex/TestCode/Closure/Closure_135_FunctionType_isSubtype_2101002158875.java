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

public class FunctionType_isSubtype_2101002158875 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term918853;
     Object term919611;
     Object term920686;
     Object term920692;

    public FunctionType_isSubtype_2101002158875() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term920702 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term920701 = ((Class) term920702).getDeclaredField((String) "ORDINARY");
        ((Field) term920701).setAccessible(true);
        Object enum1713 = ((Field) term920701).get((Object) null);
        term918853 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term919397 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term919503 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(term918853, term918853.getClass(), "kind", enum1713);
        setField(term919397, term919397.getClass(), "kind", enum1713);
        setField(term919397, term919397.getClass(), "typeOfThis", term919503);
        setField(term918853, term918853.getClass(), "typeOfThis", term919397);
        Class<? extends Object> term920993 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term920992 = ((Class) term920993).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term920992).setAccessible(true);
        Object enum1714 = ((Field) term920992).get((Object) null);
        term919611 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term919793 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term919611, term919611.getClass(), "kind", enum1714);
        setField(term919793, term919793.getClass(), "kind", enum1713);
        setField(term919793, term919793.getClass(), "typeOfThis", null);
        setField(term919611, term919611.getClass(), "typeOfThis", term919793);
        Class<? extends Object> term921293 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term921292 = ((Class) term921293).getDeclaredField((String) "INTERFACE");
        ((Field) term921292).setAccessible(true);
        Object enum1715 = ((Field) term921292).get((Object) null);
        term920686 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term920690 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term920691 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(term920686, term920686.getClass(), "this$0", null);
        setField(term920686, term920686.getClass(), "call", null);
        setField(term920686, term920686.getClass(), "prototype", null);
        setField(term920686, term920686.getClass(), "kind", enum1715);
        setField(term920690, term920690.getClass(), "call", null);
        setField(term920690, term920690.getClass(), "prototype", null);
        setField(term920690, term920690.getClass(), "kind", enum1715);
        setField(term920691, term920691.getClass(), "primitiveType", null);
        setField(term920691, term920691.getClass(), "primitiveObjectType", null);
        setField(term920691, term920691.getClass(), "name", null);
        setBooleanField(term920691, term920691.getClass(), "visited", false);
        setField(term920691, term920691.getClass(), "docInfo", null);
        setBooleanField(term920691, term920691.getClass(), "unknown", false);
        setBooleanField(term920691, term920691.getClass(), "resolved", false);
        setField(term920691, term920691.getClass(), "resolveResult", null);
        setField(term920691, term920691.getClass(), "registry", null);
        setField(term920690, term920690.getClass(), "typeOfThis", term920691);
        setField(term920690, term920690.getClass(), "source", null);
        setField(term920690, term920690.getClass(), "implementedInterfaces", null);
        setField(term920690, term920690.getClass(), "subTypes", null);
        setField(term920690, term920690.getClass(), "templateTypeName", null);
        setField(term920690, term920690.getClass(), "className", null);
        setField(term920690, term920690.getClass(), "properties", null);
        setField(term920690, term920690.getClass(), "implicitPrototype", null);
        setBooleanField(term920690, term920690.getClass(), "nativeType", false);
        setBooleanField(term920690, term920690.getClass(), "visited", false);
        setField(term920690, term920690.getClass(), "docInfo", null);
        setBooleanField(term920690, term920690.getClass(), "unknown", false);
        setBooleanField(term920690, term920690.getClass(), "resolved", false);
        setField(term920690, term920690.getClass(), "resolveResult", null);
        setField(term920690, term920690.getClass(), "registry", null);
        setField(term920686, term920686.getClass(), "typeOfThis", term920690);
        setField(term920686, term920686.getClass(), "source", null);
        setField(term920686, term920686.getClass(), "implementedInterfaces", null);
        setField(term920686, term920686.getClass(), "subTypes", null);
        setField(term920686, term920686.getClass(), "templateTypeName", null);
        setField(term920686, term920686.getClass(), "className", null);
        setField(term920686, term920686.getClass(), "properties", null);
        setField(term920686, term920686.getClass(), "implicitPrototype", null);
        setBooleanField(term920686, term920686.getClass(), "nativeType", false);
        setBooleanField(term920686, term920686.getClass(), "visited", false);
        setField(term920686, term920686.getClass(), "docInfo", null);
        setBooleanField(term920686, term920686.getClass(), "unknown", false);
        setBooleanField(term920686, term920686.getClass(), "resolved", false);
        setField(term920686, term920686.getClass(), "resolveResult", null);
        setField(term920686, term920686.getClass(), "registry", null);
        Class<? extends Object> term921587 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term921586 = ((Class) term921587).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term921586).setAccessible(true);
        Object enum1716 = ((Field) term921586).get((Object) null);
        Class<? extends Object> term921887 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term921886 = ((Class) term921887).getDeclaredField((String) "INTERFACE");
        ((Field) term921886).setAccessible(true);
        Object enum1717 = ((Field) term921886).get((Object) null);
        term920692 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term920696 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term920692, term920692.getClass(), "this$0", null);
        setField(term920692, term920692.getClass(), "call", null);
        setField(term920692, term920692.getClass(), "prototype", null);
        setField(term920692, term920692.getClass(), "kind", enum1716);
        setField(term920696, term920696.getClass(), "this$0", null);
        setField(term920696, term920696.getClass(), "call", null);
        setField(term920696, term920696.getClass(), "prototype", null);
        setField(term920696, term920696.getClass(), "kind", enum1717);
        setField(term920696, term920696.getClass(), "typeOfThis", null);
        setField(term920696, term920696.getClass(), "source", null);
        setField(term920696, term920696.getClass(), "implementedInterfaces", null);
        setField(term920696, term920696.getClass(), "subTypes", null);
        setField(term920696, term920696.getClass(), "templateTypeName", null);
        setField(term920696, term920696.getClass(), "className", null);
        setField(term920696, term920696.getClass(), "properties", null);
        setField(term920696, term920696.getClass(), "implicitPrototype", null);
        setBooleanField(term920696, term920696.getClass(), "nativeType", false);
        setBooleanField(term920696, term920696.getClass(), "visited", false);
        setField(term920696, term920696.getClass(), "docInfo", null);
        setBooleanField(term920696, term920696.getClass(), "unknown", false);
        setBooleanField(term920696, term920696.getClass(), "resolved", false);
        setField(term920696, term920696.getClass(), "resolveResult", null);
        setField(term920696, term920696.getClass(), "registry", null);
        setField(term920692, term920692.getClass(), "typeOfThis", term920696);
        setField(term920692, term920692.getClass(), "source", null);
        setField(term920692, term920692.getClass(), "implementedInterfaces", null);
        setField(term920692, term920692.getClass(), "subTypes", null);
        setField(term920692, term920692.getClass(), "templateTypeName", null);
        setField(term920692, term920692.getClass(), "className", null);
        setField(term920692, term920692.getClass(), "properties", null);
        setField(term920692, term920692.getClass(), "implicitPrototype", null);
        setBooleanField(term920692, term920692.getClass(), "nativeType", false);
        setBooleanField(term920692, term920692.getClass(), "visited", false);
        setField(term920692, term920692.getClass(), "docInfo", null);
        setBooleanField(term920692, term920692.getClass(), "unknown", false);
        setBooleanField(term920692, term920692.getClass(), "resolved", false);
        setField(term920692, term920692.getClass(), "resolveResult", null);
        setField(term920692, term920692.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term919611;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term918853, args);
        assertTrue(recursiveEquals(term918853, term920686));
        assertTrue(recursiveEquals(term919611, term920692));
        assertTrue(recursiveEquals(retValue, false));
    }

};


