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

public class FunctionType_isSubtype_21010021581424 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2027578;
     Object term2028178;
     Object term2032735;
     Object term2032744;

    public FunctionType_isSubtype_21010021581424() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2032754 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2032753 = ((Class) term2032754).getDeclaredField((String) "ORDINARY");
        ((Field) term2032753).setAccessible(true);
        Object enum3609 = ((Field) term2032753).get((Object) null);
        Class<? extends Object> term2033045 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2033044 = ((Class) term2033045).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2033044).setAccessible(true);
        Object enum3610 = ((Field) term2033044).get((Object) null);
        term2027578 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2027826 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2028068 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term2027578, term2027578.getClass(), "kind", enum3609);
        setField(term2027826, term2027826.getClass(), "kind", enum3610);
        setField(term2027578, term2027578.getClass(), "typeOfThis", term2027826);
        setField(term2027578, term2027578.getClass(), "call", term2028068);
        Class<? extends Object> term2033345 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2033344 = ((Class) term2033345).getDeclaredField((String) "INTERFACE");
        ((Field) term2033344).setAccessible(true);
        Object enum3611 = ((Field) term2033344).get((Object) null);
        term2028178 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term2028362 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term2028178, term2028178.getClass(), "kind", enum3610);
        setField(term2028362, term2028362.getClass(), "kind", enum3611);
        setField(term2028178, term2028178.getClass(), "typeOfThis", term2028362);
        setField(term2028178, term2028178.getClass(), "call", null);
        Class<? extends Object> term2033639 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2033638 = ((Class) term2033639).getDeclaredField((String) "ORDINARY");
        ((Field) term2033638).setAccessible(true);
        Object enum3612 = ((Field) term2033638).get((Object) null);
        Class<? extends Object> term2033930 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2033929 = ((Class) term2033930).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2033929).setAccessible(true);
        Object enum3613 = ((Field) term2033929).get((Object) null);
        term2032735 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2032736 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term2032740 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term2032735, term2032735.getClass(), "this$0", null);
        setField(term2032736, term2032736.getClass(), "parameters", null);
        setField(term2032736, term2032736.getClass(), "returnType", null);
        setBooleanField(term2032736, term2032736.getClass(), "returnTypeInferred", false);
        setBooleanField(term2032736, term2032736.getClass(), "resolved", false);
        setField(term2032736, term2032736.getClass(), "resolveResult", null);
        setField(term2032736, term2032736.getClass(), "registry", null);
        setField(term2032735, term2032735.getClass(), "call", term2032736);
        setField(term2032735, term2032735.getClass(), "prototype", null);
        setField(term2032735, term2032735.getClass(), "kind", enum3612);
        setField(term2032740, term2032740.getClass(), "call", null);
        setField(term2032740, term2032740.getClass(), "prototype", null);
        setField(term2032740, term2032740.getClass(), "kind", enum3613);
        setField(term2032740, term2032740.getClass(), "typeOfThis", null);
        setField(term2032740, term2032740.getClass(), "source", null);
        setField(term2032740, term2032740.getClass(), "implementedInterfaces", null);
        setField(term2032740, term2032740.getClass(), "subTypes", null);
        setField(term2032740, term2032740.getClass(), "templateTypeName", null);
        setField(term2032740, term2032740.getClass(), "className", null);
        setField(term2032740, term2032740.getClass(), "properties", null);
        setField(term2032740, term2032740.getClass(), "implicitPrototype", null);
        setBooleanField(term2032740, term2032740.getClass(), "nativeType", false);
        setBooleanField(term2032740, term2032740.getClass(), "prettyPrint", false);
        setBooleanField(term2032740, term2032740.getClass(), "visited", false);
        setField(term2032740, term2032740.getClass(), "docInfo", null);
        setBooleanField(term2032740, term2032740.getClass(), "unknown", false);
        setBooleanField(term2032740, term2032740.getClass(), "resolved", false);
        setField(term2032740, term2032740.getClass(), "resolveResult", null);
        setField(term2032740, term2032740.getClass(), "registry", null);
        setField(term2032735, term2032735.getClass(), "typeOfThis", term2032740);
        setField(term2032735, term2032735.getClass(), "source", null);
        setField(term2032735, term2032735.getClass(), "implementedInterfaces", null);
        setField(term2032735, term2032735.getClass(), "subTypes", null);
        setField(term2032735, term2032735.getClass(), "templateTypeName", null);
        setField(term2032735, term2032735.getClass(), "className", null);
        setField(term2032735, term2032735.getClass(), "properties", null);
        setField(term2032735, term2032735.getClass(), "implicitPrototype", null);
        setBooleanField(term2032735, term2032735.getClass(), "nativeType", false);
        setBooleanField(term2032735, term2032735.getClass(), "prettyPrint", false);
        setBooleanField(term2032735, term2032735.getClass(), "visited", false);
        setField(term2032735, term2032735.getClass(), "docInfo", null);
        setBooleanField(term2032735, term2032735.getClass(), "unknown", false);
        setBooleanField(term2032735, term2032735.getClass(), "resolved", false);
        setField(term2032735, term2032735.getClass(), "resolveResult", null);
        setField(term2032735, term2032735.getClass(), "registry", null);
        Class<? extends Object> term2034230 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2034229 = ((Class) term2034230).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2034229).setAccessible(true);
        Object enum3614 = ((Field) term2034229).get((Object) null);
        Class<? extends Object> term2034530 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2034529 = ((Class) term2034530).getDeclaredField((String) "INTERFACE");
        ((Field) term2034529).setAccessible(true);
        Object enum3615 = ((Field) term2034529).get((Object) null);
        term2032744 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term2032748 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term2032744, term2032744.getClass(), "call", null);
        setField(term2032744, term2032744.getClass(), "prototype", null);
        setField(term2032744, term2032744.getClass(), "kind", enum3614);
        setField(term2032748, term2032748.getClass(), "call", null);
        setField(term2032748, term2032748.getClass(), "prototype", null);
        setField(term2032748, term2032748.getClass(), "kind", enum3615);
        setField(term2032748, term2032748.getClass(), "typeOfThis", null);
        setField(term2032748, term2032748.getClass(), "source", null);
        setField(term2032748, term2032748.getClass(), "implementedInterfaces", null);
        setField(term2032748, term2032748.getClass(), "subTypes", null);
        setField(term2032748, term2032748.getClass(), "templateTypeName", null);
        setField(term2032748, term2032748.getClass(), "className", null);
        setField(term2032748, term2032748.getClass(), "properties", null);
        setField(term2032748, term2032748.getClass(), "implicitPrototype", null);
        setBooleanField(term2032748, term2032748.getClass(), "nativeType", false);
        setBooleanField(term2032748, term2032748.getClass(), "prettyPrint", false);
        setBooleanField(term2032748, term2032748.getClass(), "visited", false);
        setField(term2032748, term2032748.getClass(), "docInfo", null);
        setBooleanField(term2032748, term2032748.getClass(), "unknown", false);
        setBooleanField(term2032748, term2032748.getClass(), "resolved", false);
        setField(term2032748, term2032748.getClass(), "resolveResult", null);
        setField(term2032748, term2032748.getClass(), "registry", null);
        setField(term2032744, term2032744.getClass(), "typeOfThis", term2032748);
        setField(term2032744, term2032744.getClass(), "source", null);
        setField(term2032744, term2032744.getClass(), "implementedInterfaces", null);
        setField(term2032744, term2032744.getClass(), "subTypes", null);
        setField(term2032744, term2032744.getClass(), "templateTypeName", null);
        setField(term2032744, term2032744.getClass(), "className", null);
        setField(term2032744, term2032744.getClass(), "properties", null);
        setField(term2032744, term2032744.getClass(), "implicitPrototype", null);
        setBooleanField(term2032744, term2032744.getClass(), "nativeType", false);
        setBooleanField(term2032744, term2032744.getClass(), "prettyPrint", false);
        setBooleanField(term2032744, term2032744.getClass(), "visited", false);
        setField(term2032744, term2032744.getClass(), "docInfo", null);
        setBooleanField(term2032744, term2032744.getClass(), "unknown", false);
        setBooleanField(term2032744, term2032744.getClass(), "resolved", false);
        setField(term2032744, term2032744.getClass(), "resolveResult", null);
        setField(term2032744, term2032744.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2028178;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term2027578, args);
        assertTrue(recursiveEquals(term2027578, term2032735));
        assertTrue(recursiveEquals(term2028178, term2032744));
        assertTrue(recursiveEquals(retValue, false));
    }

};


