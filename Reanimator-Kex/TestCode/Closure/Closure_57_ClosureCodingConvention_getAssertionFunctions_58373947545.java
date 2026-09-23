package com.google.javascript.jscomp;

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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.lang.Object;
import java.lang.String;

public class ClosureCodingConvention_getAssertionFunctions_58373947545 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12214;
     Object term35205;
     Object term32212;

    public ClosureCodingConvention_getAssertionFunctions_58373947545() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12214 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        Object term12215 = newInstance(Class.forName("com.google.common.collect.RegularImmutableSet"));
        Object[] term12216 = (Object[]) newArray("java.lang.Object", 32);
        Object[] term12357 = (Object[]) newArray("java.lang.Object", 9);
        setElement(term12216, 1, "goog.isBoolean");
        setElement(term12216, 2, "goog.isFunction");
        setElement(term12216, 13, "goog.isDefAndNotNull");
        setElement(term12216, 14, "goog.isDef");
        setElement(term12216, 15, "goog.isNull");
        setElement(term12216, 16, "goog.isNumber");
        setElement(term12216, 17, "goog.isObject");
        setElement(term12216, 21, "goog.isArray");
        setElement(term12216, 31, "goog.isString");
        setField(term12215, term12215.getClass(), "table", term12216);
        setIntField(term12215, term12215.getClass(), "mask", 31);
        setElement(term12357, 0, "goog.isDef");
        setElement(term12357, 1, "goog.isNull");
        setElement(term12357, 2, "goog.isDefAndNotNull");
        setElement(term12357, 3, "goog.isString");
        setElement(term12357, 4, "goog.isNumber");
        setElement(term12357, 5, "goog.isBoolean");
        setElement(term12357, 6, "goog.isFunction");
        setElement(term12357, 7, "goog.isArray");
        setElement(term12357, 8, "goog.isObject");
        setField(term12215, term12215.getClass(), "elements", term12357);
        setField(term12215, term12215.getClass(), "asList", null);
        setField(term12214, term12214.getClass(), "propertyTestFunctions", term12215);
        term35205 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        Object term35206 = newInstance(Class.forName("com.google.common.collect.RegularImmutableSet"));
        Object[] term35207 = (Object[]) newArray("java.lang.Object", 32);
        Object[] term35226 = (Object[]) newArray("java.lang.Object", 9);
        setElement(term35207, 1, "goog.isBoolean");
        setElement(term35207, 2, "goog.isFunction");
        setElement(term35207, 13, "goog.isDefAndNotNull");
        setElement(term35207, 14, "goog.isDef");
        setElement(term35207, 15, "goog.isNull");
        setElement(term35207, 16, "goog.isNumber");
        setElement(term35207, 17, "goog.isObject");
        setElement(term35207, 21, "goog.isArray");
        setElement(term35207, 31, "goog.isString");
        setField(term35206, term35206.getClass(), "table", term35207);
        setIntField(term35206, term35206.getClass(), "mask", 31);
        setElement(term35226, 0, "goog.isDef");
        setElement(term35226, 1, "goog.isNull");
        setElement(term35226, 2, "goog.isDefAndNotNull");
        setElement(term35226, 3, "goog.isString");
        setElement(term35226, 4, "goog.isNumber");
        setElement(term35226, 5, "goog.isBoolean");
        setElement(term35226, 6, "goog.isFunction");
        setElement(term35226, 7, "goog.isArray");
        setElement(term35226, 8, "goog.isObject");
        setField(term35206, term35206.getClass(), "elements", term35226);
        setField(term35206, term35206.getClass(), "asList", null);
        setField(term35205, term35205.getClass(), "propertyTestFunctions", term35206);
        Class<? extends Object> term37501 = Class.forName((String) "com.google.javascript.rhino.jstype.JSTypeNative");
        Field term37494 = ((Class) term37501).getDeclaredField((String) "ERROR_FUNCTION_TYPE");
        ((Field) term37494).setAccessible(true);
        Object enum12 = ((Field) term37494).get((Object) null);
        Class<? extends Object> term37831 = Class.forName((String) "com.google.javascript.rhino.jstype.JSTypeNative");
        Field term37830 = ((Class) term37831).getDeclaredField((String) "ARRAY_FUNCTION_TYPE");
        ((Field) term37830).setAccessible(true);
        Object enum13 = ((Field) term37830).get((Object) null);
        Class<? extends Object> term38157 = Class.forName((String) "com.google.javascript.rhino.jstype.JSTypeNative");
        Field term38156 = ((Class) term38157).getDeclaredField((String) "OBJECT_FUNCTION_TYPE");
        ((Field) term38156).setAccessible(true);
        Object enum14 = ((Field) term38156).get((Object) null);
        Class<? extends Object> term38484 = Class.forName((String) "com.google.javascript.rhino.jstype.JSTypeNative");
        Field term38483 = ((Class) term38484).getDeclaredField((String) "VOID_TYPE");
        ((Field) term38483).setAccessible(true);
        Object enum15 = ((Field) term38483).get((Object) null);
        Class<? extends Object> term38777 = Class.forName((String) "com.google.javascript.rhino.jstype.JSTypeNative");
        Field term38776 = ((Class) term38777).getDeclaredField((String) "ALL_TYPE");
        ((Field) term38776).setAccessible(true);
        Object enum16 = ((Field) term38776).get((Object) null);
        term32212 = newInstance(Class.forName("com.google.common.collect.RegularImmutableList"));
        Object[] term32215 = (Object[]) newArray("java.lang.Object", 7);
        Object term32216 = newInstance(Class.forName("com.google.javascript.jscomp.CodingConvention$AssertionFunctionSpec"));
        Object term32238 = newInstance(Class.forName("com.google.javascript.jscomp.CodingConvention$AssertionFunctionSpec"));
        Object term32269 = newInstance(Class.forName("com.google.javascript.jscomp.CodingConvention$AssertionFunctionSpec"));
        Object term32300 = newInstance(Class.forName("com.google.javascript.jscomp.CodingConvention$AssertionFunctionSpec"));
        Object term32333 = newInstance(Class.forName("com.google.javascript.jscomp.CodingConvention$AssertionFunctionSpec"));
        Object term32364 = newInstance(Class.forName("com.google.javascript.jscomp.CodingConvention$AssertionFunctionSpec"));
        Object term32394 = newInstance(Class.forName("com.google.javascript.jscomp.CodingConvention$AssertionFunctionSpec"));
        setIntField(term32212, term32212.getClass(), "offset", 0);
        setIntField(term32212, term32212.getClass(), "size", 7);
        setField(term32216, term32216.getClass(), "functionName", "goog.asserts.assert");
        setField(term32216, term32216.getClass(), "assertedType", null);
        setElement(term32215, 0, term32216);
        setField(term32238, term32238.getClass(), "functionName", "goog.asserts.assertNumber");
        setField(term32238, term32238.getClass(), "assertedType", enum12);
        setElement(term32215, 1, term32238);
        setField(term32269, term32269.getClass(), "functionName", "goog.asserts.assertString");
        setField(term32269, term32269.getClass(), "assertedType", enum13);
        setElement(term32215, 2, term32269);
        setField(term32300, term32300.getClass(), "functionName", "goog.asserts.assertFunction");
        setField(term32300, term32300.getClass(), "assertedType", enum14);
        setElement(term32215, 3, term32300);
        setField(term32333, term32333.getClass(), "functionName", "goog.asserts.assertObject");
        setField(term32333, term32333.getClass(), "assertedType", enum15);
        setElement(term32215, 4, term32333);
        setField(term32364, term32364.getClass(), "functionName", "goog.asserts.assertArray");
        setField(term32364, term32364.getClass(), "assertedType", enum16);
        setElement(term32215, 5, term32364);
        setField(term32394, term32394.getClass(), "functionName", "goog.asserts.assertInstanceof");
        setField(term32394, term32394.getClass(), "assertedType", enum15);
        setElement(term32215, 6, term32394);
        setField(term32212, term32212.getClass(), "array", term32215);
        setField(term32212, term32212.getClass(), "asList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getAssertionFunctions", argTypes, term12214, args);
        assertTrue(recursiveEquals(term12214, term35205));
        assertTrue(recursiveEquals(retValue, term32212));
    }

};


