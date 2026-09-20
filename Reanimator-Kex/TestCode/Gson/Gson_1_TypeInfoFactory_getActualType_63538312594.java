package com.google.gson;

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
import static com.google.gson.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class TypeInfoFactory_getActualType_63538312594 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term225583;

    public TypeInfoFactory_getActualType_63538312594() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term230845 = Class.forName((String) "java.nio.ByteBufferAsShortBufferRL");
        term225583 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term225661 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term225739 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term225817 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term225895 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term225973 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term226051 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term226129 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term226207 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term226285 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term226363 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term226441 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term226519 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term226597 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term226675 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term226753 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term226831 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term226909 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term226987 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term227065 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term227143 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term227221 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term227299 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term227377 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term227455 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term227533 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term227611 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term227689 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term227767 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term227845 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term227923 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term228001 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term228079 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term228157 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term228235 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term228313 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term228391 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term228469 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term228547 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term228625 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term228703 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term228781 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term228859 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term228937 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term229015 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term229093 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term229171 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term229249 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term229327 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term229405 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term229483 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term229561 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term229639 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term229717 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term229795 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term229873 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term229951 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term230029 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term230107 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term230185 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term230263 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term230341 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term230419 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term230497 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term230575 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term230653 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term230731 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term230809 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        setField(term230809, term230809.getClass(), "genericComponentType", term230845);
        setField(term230731, term230731.getClass(), "genericComponentType", term230809);
        setField(term230653, term230653.getClass(), "genericComponentType", term230731);
        setField(term230575, term230575.getClass(), "genericComponentType", term230653);
        setField(term230497, term230497.getClass(), "genericComponentType", term230575);
        setField(term230419, term230419.getClass(), "genericComponentType", term230497);
        setField(term230341, term230341.getClass(), "genericComponentType", term230419);
        setField(term230263, term230263.getClass(), "genericComponentType", term230341);
        setField(term230185, term230185.getClass(), "genericComponentType", term230263);
        setField(term230107, term230107.getClass(), "genericComponentType", term230185);
        setField(term230029, term230029.getClass(), "genericComponentType", term230107);
        setField(term229951, term229951.getClass(), "genericComponentType", term230029);
        setField(term229873, term229873.getClass(), "genericComponentType", term229951);
        setField(term229795, term229795.getClass(), "genericComponentType", term229873);
        setField(term229717, term229717.getClass(), "genericComponentType", term229795);
        setField(term229639, term229639.getClass(), "genericComponentType", term229717);
        setField(term229561, term229561.getClass(), "genericComponentType", term229639);
        setField(term229483, term229483.getClass(), "genericComponentType", term229561);
        setField(term229405, term229405.getClass(), "genericComponentType", term229483);
        setField(term229327, term229327.getClass(), "genericComponentType", term229405);
        setField(term229249, term229249.getClass(), "genericComponentType", term229327);
        setField(term229171, term229171.getClass(), "genericComponentType", term229249);
        setField(term229093, term229093.getClass(), "genericComponentType", term229171);
        setField(term229015, term229015.getClass(), "genericComponentType", term229093);
        setField(term228937, term228937.getClass(), "genericComponentType", term229015);
        setField(term228859, term228859.getClass(), "genericComponentType", term228937);
        setField(term228781, term228781.getClass(), "genericComponentType", term228859);
        setField(term228703, term228703.getClass(), "genericComponentType", term228781);
        setField(term228625, term228625.getClass(), "genericComponentType", term228703);
        setField(term228547, term228547.getClass(), "genericComponentType", term228625);
        setField(term228469, term228469.getClass(), "genericComponentType", term228547);
        setField(term228391, term228391.getClass(), "genericComponentType", term228469);
        setField(term228313, term228313.getClass(), "genericComponentType", term228391);
        setField(term228235, term228235.getClass(), "genericComponentType", term228313);
        setField(term228157, term228157.getClass(), "genericComponentType", term228235);
        setField(term228079, term228079.getClass(), "genericComponentType", term228157);
        setField(term228001, term228001.getClass(), "genericComponentType", term228079);
        setField(term227923, term227923.getClass(), "genericComponentType", term228001);
        setField(term227845, term227845.getClass(), "genericComponentType", term227923);
        setField(term227767, term227767.getClass(), "genericComponentType", term227845);
        setField(term227689, term227689.getClass(), "genericComponentType", term227767);
        setField(term227611, term227611.getClass(), "genericComponentType", term227689);
        setField(term227533, term227533.getClass(), "genericComponentType", term227611);
        setField(term227455, term227455.getClass(), "genericComponentType", term227533);
        setField(term227377, term227377.getClass(), "genericComponentType", term227455);
        setField(term227299, term227299.getClass(), "genericComponentType", term227377);
        setField(term227221, term227221.getClass(), "genericComponentType", term227299);
        setField(term227143, term227143.getClass(), "genericComponentType", term227221);
        setField(term227065, term227065.getClass(), "genericComponentType", term227143);
        setField(term226987, term226987.getClass(), "genericComponentType", term227065);
        setField(term226909, term226909.getClass(), "genericComponentType", term226987);
        setField(term226831, term226831.getClass(), "genericComponentType", term226909);
        setField(term226753, term226753.getClass(), "genericComponentType", term226831);
        setField(term226675, term226675.getClass(), "genericComponentType", term226753);
        setField(term226597, term226597.getClass(), "genericComponentType", term226675);
        setField(term226519, term226519.getClass(), "genericComponentType", term226597);
        setField(term226441, term226441.getClass(), "genericComponentType", term226519);
        setField(term226363, term226363.getClass(), "genericComponentType", term226441);
        setField(term226285, term226285.getClass(), "genericComponentType", term226363);
        setField(term226207, term226207.getClass(), "genericComponentType", term226285);
        setField(term226129, term226129.getClass(), "genericComponentType", term226207);
        setField(term226051, term226051.getClass(), "genericComponentType", term226129);
        setField(term225973, term225973.getClass(), "genericComponentType", term226051);
        setField(term225895, term225895.getClass(), "genericComponentType", term225973);
        setField(term225817, term225817.getClass(), "genericComponentType", term225895);
        setField(term225739, term225739.getClass(), "genericComponentType", term225817);
        setField(term225661, term225661.getClass(), "genericComponentType", term225739);
        setField(term225583, term225583.getClass(), "genericComponentType", term225661);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.TypeInfoFactory");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.reflect.Type");
        argTypes[1] = Class.forName("java.lang.reflect.Type");
        argTypes[2] = Class.forName("java.lang.Class");
        Object[] args = new Object[3];
        args[0] = term225583;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "getActualType", argTypes, null, args);
    }

};
