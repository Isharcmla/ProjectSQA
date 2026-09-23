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

public class FunctionType_isSubtype_2101002158783 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term769708;
     Object term770466;
     Object term773820;
     Object term773829;

    public FunctionType_isSubtype_2101002158783() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term773839 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term773838 = ((Class) term773839).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term773838).setAccessible(true);
        Object enum1441 = ((Field) term773838).get((Object) null);
        Class<? extends Object> term774139 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term774138 = ((Class) term774139).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term774138).setAccessible(true);
        Object enum1442 = ((Field) term774138).get((Object) null);
        term769708 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term770252 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term770358 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(term769708, term769708.getClass(), "kind", enum1441);
        setField(term770252, term770252.getClass(), "kind", enum1442);
        setField(term770252, term770252.getClass(), "typeOfThis", term770358);
        setField(term769708, term769708.getClass(), "typeOfThis", term770252);
        term770466 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term770796 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term770466, term770466.getClass(), "kind", enum1441);
        setField(term770796, term770796.getClass(), "kind", enum1442);
        setField(term770796, term770796.getClass(), "typeOfThis", null);
        setField(term770466, term770466.getClass(), "typeOfThis", term770796);
        Class<? extends Object> term774439 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term774438 = ((Class) term774439).getDeclaredField((String) "INTERFACE");
        ((Field) term774438).setAccessible(true);
        Object enum1443 = ((Field) term774438).get((Object) null);
        Class<? extends Object> term774733 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term774732 = ((Class) term774733).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term774732).setAccessible(true);
        Object enum1444 = ((Field) term774732).get((Object) null);
        term773820 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term773824 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term773828 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(term773820, term773820.getClass(), "this$0", null);
        setField(term773820, term773820.getClass(), "call", null);
        setField(term773820, term773820.getClass(), "prototype", null);
        setField(term773820, term773820.getClass(), "kind", enum1443);
        setField(term773824, term773824.getClass(), "call", null);
        setField(term773824, term773824.getClass(), "prototype", null);
        setField(term773824, term773824.getClass(), "kind", enum1444);
        setField(term773828, term773828.getClass(), "primitiveType", null);
        setField(term773828, term773828.getClass(), "primitiveObjectType", null);
        setField(term773828, term773828.getClass(), "name", null);
        setBooleanField(term773828, term773828.getClass(), "visited", false);
        setField(term773828, term773828.getClass(), "docInfo", null);
        setBooleanField(term773828, term773828.getClass(), "unknown", false);
        setBooleanField(term773828, term773828.getClass(), "resolved", false);
        setField(term773828, term773828.getClass(), "resolveResult", null);
        setField(term773828, term773828.getClass(), "registry", null);
        setField(term773824, term773824.getClass(), "typeOfThis", term773828);
        setField(term773824, term773824.getClass(), "source", null);
        setField(term773824, term773824.getClass(), "implementedInterfaces", null);
        setField(term773824, term773824.getClass(), "subTypes", null);
        setField(term773824, term773824.getClass(), "templateTypeName", null);
        setField(term773824, term773824.getClass(), "className", null);
        setField(term773824, term773824.getClass(), "properties", null);
        setField(term773824, term773824.getClass(), "implicitPrototype", null);
        setBooleanField(term773824, term773824.getClass(), "nativeType", false);
        setBooleanField(term773824, term773824.getClass(), "visited", false);
        setField(term773824, term773824.getClass(), "docInfo", null);
        setBooleanField(term773824, term773824.getClass(), "unknown", false);
        setBooleanField(term773824, term773824.getClass(), "resolved", false);
        setField(term773824, term773824.getClass(), "resolveResult", null);
        setField(term773824, term773824.getClass(), "registry", null);
        setField(term773820, term773820.getClass(), "typeOfThis", term773824);
        setField(term773820, term773820.getClass(), "source", null);
        setField(term773820, term773820.getClass(), "implementedInterfaces", null);
        setField(term773820, term773820.getClass(), "subTypes", null);
        setField(term773820, term773820.getClass(), "templateTypeName", null);
        setField(term773820, term773820.getClass(), "className", null);
        setField(term773820, term773820.getClass(), "properties", null);
        setField(term773820, term773820.getClass(), "implicitPrototype", null);
        setBooleanField(term773820, term773820.getClass(), "nativeType", false);
        setBooleanField(term773820, term773820.getClass(), "visited", false);
        setField(term773820, term773820.getClass(), "docInfo", null);
        setBooleanField(term773820, term773820.getClass(), "unknown", false);
        setBooleanField(term773820, term773820.getClass(), "resolved", false);
        setField(term773820, term773820.getClass(), "resolveResult", null);
        setField(term773820, term773820.getClass(), "registry", null);
        Class<? extends Object> term775033 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term775032 = ((Class) term775033).getDeclaredField((String) "INTERFACE");
        ((Field) term775032).setAccessible(true);
        Object enum1445 = ((Field) term775032).get((Object) null);
        Class<? extends Object> term775327 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term775326 = ((Class) term775327).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term775326).setAccessible(true);
        Object enum1446 = ((Field) term775326).get((Object) null);
        term773829 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term773833 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term773829, term773829.getClass(), "this$0", null);
        setField(term773829, term773829.getClass(), "call", null);
        setField(term773829, term773829.getClass(), "prototype", null);
        setField(term773829, term773829.getClass(), "kind", enum1445);
        setField(term773833, term773833.getClass(), "this$0", null);
        setField(term773833, term773833.getClass(), "call", null);
        setField(term773833, term773833.getClass(), "prototype", null);
        setField(term773833, term773833.getClass(), "kind", enum1446);
        setField(term773833, term773833.getClass(), "typeOfThis", null);
        setField(term773833, term773833.getClass(), "source", null);
        setField(term773833, term773833.getClass(), "implementedInterfaces", null);
        setField(term773833, term773833.getClass(), "subTypes", null);
        setField(term773833, term773833.getClass(), "templateTypeName", null);
        setField(term773833, term773833.getClass(), "className", null);
        setField(term773833, term773833.getClass(), "properties", null);
        setField(term773833, term773833.getClass(), "implicitPrototype", null);
        setBooleanField(term773833, term773833.getClass(), "nativeType", false);
        setBooleanField(term773833, term773833.getClass(), "visited", false);
        setField(term773833, term773833.getClass(), "docInfo", null);
        setBooleanField(term773833, term773833.getClass(), "unknown", false);
        setBooleanField(term773833, term773833.getClass(), "resolved", false);
        setField(term773833, term773833.getClass(), "resolveResult", null);
        setField(term773833, term773833.getClass(), "registry", null);
        setField(term773829, term773829.getClass(), "typeOfThis", term773833);
        setField(term773829, term773829.getClass(), "source", null);
        setField(term773829, term773829.getClass(), "implementedInterfaces", null);
        setField(term773829, term773829.getClass(), "subTypes", null);
        setField(term773829, term773829.getClass(), "templateTypeName", null);
        setField(term773829, term773829.getClass(), "className", null);
        setField(term773829, term773829.getClass(), "properties", null);
        setField(term773829, term773829.getClass(), "implicitPrototype", null);
        setBooleanField(term773829, term773829.getClass(), "nativeType", false);
        setBooleanField(term773829, term773829.getClass(), "visited", false);
        setField(term773829, term773829.getClass(), "docInfo", null);
        setBooleanField(term773829, term773829.getClass(), "unknown", false);
        setBooleanField(term773829, term773829.getClass(), "resolved", false);
        setField(term773829, term773829.getClass(), "resolveResult", null);
        setField(term773829, term773829.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term770466;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term769708, args);
        assertTrue(recursiveEquals(term769708, term773820));
        assertTrue(recursiveEquals(term770466, term773829));
        assertTrue(recursiveEquals(retValue, true));
    }

};


