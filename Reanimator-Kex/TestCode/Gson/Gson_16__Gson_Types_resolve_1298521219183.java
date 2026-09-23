package com.google.gson.internal;

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
import static com.google.gson.internal.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.gson.internal.EqualityUtils.*;
import java.lang.Object;
import org.mockito.Mockito;

public class _Gson_Types_resolve_1298521219183 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term264781;
     Object term273069;
     Object term273064;

    public _Gson_Types_resolve_1298521219183() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term264781 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term264901 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term265021 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term265141 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term265261 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term265381 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term265501 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term265621 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term265741 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term265861 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term265981 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term266101 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term266221 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term266341 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term266461 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term266581 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term266701 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term266821 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term266941 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term267061 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term267181 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term267301 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term267421 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term267541 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term267661 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term267781 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term267901 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term268021 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term268141 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term264400 = Mockito.mock(Class.forName("java.lang.reflect.TypeVariable"));
        setField(term268141, term268141.getClass(), "componentType", term264400);
        setField(term268021, term268021.getClass(), "componentType", term268141);
        setField(term267901, term267901.getClass(), "componentType", term268021);
        setField(term267781, term267781.getClass(), "componentType", term267901);
        setField(term267661, term267661.getClass(), "componentType", term267781);
        setField(term267541, term267541.getClass(), "componentType", term267661);
        setField(term267421, term267421.getClass(), "componentType", term267541);
        setField(term267301, term267301.getClass(), "componentType", term267421);
        setField(term267181, term267181.getClass(), "componentType", term267301);
        setField(term267061, term267061.getClass(), "componentType", term267181);
        setField(term266941, term266941.getClass(), "componentType", term267061);
        setField(term266821, term266821.getClass(), "componentType", term266941);
        setField(term266701, term266701.getClass(), "componentType", term266821);
        setField(term266581, term266581.getClass(), "componentType", term266701);
        setField(term266461, term266461.getClass(), "componentType", term266581);
        setField(term266341, term266341.getClass(), "componentType", term266461);
        setField(term266221, term266221.getClass(), "componentType", term266341);
        setField(term266101, term266101.getClass(), "componentType", term266221);
        setField(term265981, term265981.getClass(), "componentType", term266101);
        setField(term265861, term265861.getClass(), "componentType", term265981);
        setField(term265741, term265741.getClass(), "componentType", term265861);
        setField(term265621, term265621.getClass(), "componentType", term265741);
        setField(term265501, term265501.getClass(), "componentType", term265621);
        setField(term265381, term265381.getClass(), "componentType", term265501);
        setField(term265261, term265261.getClass(), "componentType", term265381);
        setField(term265141, term265141.getClass(), "componentType", term265261);
        setField(term265021, term265021.getClass(), "componentType", term265141);
        setField(term264901, term264901.getClass(), "componentType", term265021);
        setField(term264781, term264781.getClass(), "componentType", term264901);
        term273069 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term273070 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term273071 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term273072 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term273073 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        setField(term273073, term273073.getClass(), "componentType", null);
        setField(term273072, term273072.getClass(), "componentType", term273073);
        setField(term273071, term273071.getClass(), "componentType", term273072);
        setField(term273070, term273070.getClass(), "componentType", term273071);
        setField(term273069, term273069.getClass(), "componentType", term273070);
        term273064 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term273065 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term273066 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term273067 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term273068 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        setField(term273068, term273068.getClass(), "componentType", null);
        setField(term273067, term273067.getClass(), "componentType", term273068);
        setField(term273066, term273066.getClass(), "componentType", term273067);
        setField(term273065, term273065.getClass(), "componentType", term273066);
        setField(term273064, term273064.getClass(), "componentType", term273065);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.$Gson$Types");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.reflect.Type");
        argTypes[1] = Class.forName("java.lang.Class");
        argTypes[2] = Class.forName("java.lang.reflect.Type");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = term264781;
        Object retValue = callMethod(klass, "resolve", argTypes, null, args);
        assertTrue(recursiveEquals(term264781, term273069));
        assertTrue(recursiveEquals(retValue, term273064));
    }

};


