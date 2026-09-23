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

public class _Gson_Types_resolve_1298521219187 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term319112;
     Object term325865;
     Object term325860;

    public _Gson_Types_resolve_1298521219187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term319112 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term319232 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term319352 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term319472 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term319592 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term319712 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term319832 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term319952 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term320072 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term320192 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term320312 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term320432 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term320552 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term320672 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term320792 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term320912 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term321032 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term321152 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term321272 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term321392 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term321512 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term318794 = Mockito.mock(Class.forName("java.lang.reflect.TypeVariable"));
        setField(term321512, term321512.getClass(), "componentType", term318794);
        setField(term321392, term321392.getClass(), "componentType", term321512);
        setField(term321272, term321272.getClass(), "componentType", term321392);
        setField(term321152, term321152.getClass(), "componentType", term321272);
        setField(term321032, term321032.getClass(), "componentType", term321152);
        setField(term320912, term320912.getClass(), "componentType", term321032);
        setField(term320792, term320792.getClass(), "componentType", term320912);
        setField(term320672, term320672.getClass(), "componentType", term320792);
        setField(term320552, term320552.getClass(), "componentType", term320672);
        setField(term320432, term320432.getClass(), "componentType", term320552);
        setField(term320312, term320312.getClass(), "componentType", term320432);
        setField(term320192, term320192.getClass(), "componentType", term320312);
        setField(term320072, term320072.getClass(), "componentType", term320192);
        setField(term319952, term319952.getClass(), "componentType", term320072);
        setField(term319832, term319832.getClass(), "componentType", term319952);
        setField(term319712, term319712.getClass(), "componentType", term319832);
        setField(term319592, term319592.getClass(), "componentType", term319712);
        setField(term319472, term319472.getClass(), "componentType", term319592);
        setField(term319352, term319352.getClass(), "componentType", term319472);
        setField(term319232, term319232.getClass(), "componentType", term319352);
        setField(term319112, term319112.getClass(), "componentType", term319232);
        term325865 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term325866 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term325867 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term325868 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term325869 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        setField(term325869, term325869.getClass(), "componentType", null);
        setField(term325868, term325868.getClass(), "componentType", term325869);
        setField(term325867, term325867.getClass(), "componentType", term325868);
        setField(term325866, term325866.getClass(), "componentType", term325867);
        setField(term325865, term325865.getClass(), "componentType", term325866);
        term325860 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term325861 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term325862 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term325863 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term325864 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        setField(term325864, term325864.getClass(), "componentType", null);
        setField(term325863, term325863.getClass(), "componentType", term325864);
        setField(term325862, term325862.getClass(), "componentType", term325863);
        setField(term325861, term325861.getClass(), "componentType", term325862);
        setField(term325860, term325860.getClass(), "componentType", term325861);
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
        args[2] = term319112;
        Object retValue = callMethod(klass, "resolve", argTypes, null, args);
        assertTrue(recursiveEquals(term319112, term325865));
        assertTrue(recursiveEquals(retValue, term325860));
    }

};


