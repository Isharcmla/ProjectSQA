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

public class FunctionType_isSubtype_2101002158727 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term680647;
     Object term681099;
     Object term681990;
     Object term681996;

    public FunctionType_isSubtype_2101002158727() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term682002 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term682001 = ((Class) term682002).getDeclaredField((String) "ORDINARY");
        ((Field) term682001).setAccessible(true);
        Object enum1264 = ((Field) term682001).get((Object) null);
        term680647 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term680895 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        Object term680989 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term680647, term680647.getClass(), "kind", enum1264);
        setField(term680647, term680647.getClass(), "typeOfThis", term680895);
        setField(term680647, term680647.getClass(), "call", term680989);
        Class<? extends Object> term682293 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term682292 = ((Class) term682293).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term682292).setAccessible(true);
        Object enum1265 = ((Field) term682292).get((Object) null);
        term681099 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term681099, term681099.getClass(), "kind", enum1265);
        setField(term681099, term681099.getClass(), "typeOfThis", null);
        setField(term681099, term681099.getClass(), "call", null);
        Class<? extends Object> term682593 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term682592 = ((Class) term682593).getDeclaredField((String) "ORDINARY");
        ((Field) term682592).setAccessible(true);
        Object enum1266 = ((Field) term682592).get((Object) null);
        term681990 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term681991 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term681995 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term681990, term681990.getClass(), "this$0", null);
        setField(term681991, term681991.getClass(), "parameters", null);
        setField(term681991, term681991.getClass(), "returnType", null);
        setBooleanField(term681991, term681991.getClass(), "resolved", false);
        setField(term681991, term681991.getClass(), "resolveResult", null);
        setField(term681991, term681991.getClass(), "registry", null);
        setField(term681990, term681990.getClass(), "call", term681991);
        setField(term681990, term681990.getClass(), "prototype", null);
        setField(term681990, term681990.getClass(), "kind", enum1266);
        setField(term681995, term681995.getClass(), "leastSupertypeVisitor", null);
        setField(term681995, term681995.getClass(), "greatestSubtypeVisitor", null);
        setField(term681995, term681995.getClass(), "call", null);
        setField(term681995, term681995.getClass(), "prototype", null);
        setField(term681995, term681995.getClass(), "kind", null);
        setField(term681995, term681995.getClass(), "typeOfThis", null);
        setField(term681995, term681995.getClass(), "source", null);
        setField(term681995, term681995.getClass(), "implementedInterfaces", null);
        setField(term681995, term681995.getClass(), "subTypes", null);
        setField(term681995, term681995.getClass(), "templateTypeName", null);
        setField(term681995, term681995.getClass(), "className", null);
        setField(term681995, term681995.getClass(), "properties", null);
        setField(term681995, term681995.getClass(), "implicitPrototype", null);
        setBooleanField(term681995, term681995.getClass(), "nativeType", false);
        setBooleanField(term681995, term681995.getClass(), "visited", false);
        setField(term681995, term681995.getClass(), "docInfo", null);
        setBooleanField(term681995, term681995.getClass(), "unknown", false);
        setBooleanField(term681995, term681995.getClass(), "resolved", false);
        setField(term681995, term681995.getClass(), "resolveResult", null);
        setField(term681995, term681995.getClass(), "registry", null);
        setField(term681990, term681990.getClass(), "typeOfThis", term681995);
        setField(term681990, term681990.getClass(), "source", null);
        setField(term681990, term681990.getClass(), "implementedInterfaces", null);
        setField(term681990, term681990.getClass(), "subTypes", null);
        setField(term681990, term681990.getClass(), "templateTypeName", null);
        setField(term681990, term681990.getClass(), "className", null);
        setField(term681990, term681990.getClass(), "properties", null);
        setField(term681990, term681990.getClass(), "implicitPrototype", null);
        setBooleanField(term681990, term681990.getClass(), "nativeType", false);
        setBooleanField(term681990, term681990.getClass(), "visited", false);
        setField(term681990, term681990.getClass(), "docInfo", null);
        setBooleanField(term681990, term681990.getClass(), "unknown", false);
        setBooleanField(term681990, term681990.getClass(), "resolved", false);
        setField(term681990, term681990.getClass(), "resolveResult", null);
        setField(term681990, term681990.getClass(), "registry", null);
        Class<? extends Object> term682884 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term682883 = ((Class) term682884).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term682883).setAccessible(true);
        Object enum1267 = ((Field) term682883).get((Object) null);
        term681996 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term681996, term681996.getClass(), "call", null);
        setField(term681996, term681996.getClass(), "prototype", null);
        setField(term681996, term681996.getClass(), "kind", enum1267);
        setField(term681996, term681996.getClass(), "typeOfThis", null);
        setField(term681996, term681996.getClass(), "source", null);
        setField(term681996, term681996.getClass(), "implementedInterfaces", null);
        setField(term681996, term681996.getClass(), "subTypes", null);
        setField(term681996, term681996.getClass(), "templateTypeName", null);
        setField(term681996, term681996.getClass(), "className", null);
        setField(term681996, term681996.getClass(), "properties", null);
        setField(term681996, term681996.getClass(), "implicitPrototype", null);
        setBooleanField(term681996, term681996.getClass(), "nativeType", false);
        setBooleanField(term681996, term681996.getClass(), "visited", false);
        setField(term681996, term681996.getClass(), "docInfo", null);
        setBooleanField(term681996, term681996.getClass(), "unknown", false);
        setBooleanField(term681996, term681996.getClass(), "resolved", false);
        setField(term681996, term681996.getClass(), "resolveResult", null);
        setField(term681996, term681996.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term681099;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term680647, args);
        assertTrue(recursiveEquals(term680647, term681990));
        assertTrue(recursiveEquals(term681099, term681996));
        assertTrue(recursiveEquals(retValue, false));
    }

};


