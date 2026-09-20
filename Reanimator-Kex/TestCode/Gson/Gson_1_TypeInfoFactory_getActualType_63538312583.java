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
import java.lang.IllegalArgumentException;
import static com.google.gson.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TypeInfoFactory_getActualType_63538312583 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24499;

    public TypeInfoFactory_getActualType_63538312583() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24499 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term24577 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term24655 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term24733 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term24811 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term24889 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term24967 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term25045 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term25123 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term25201 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term25279 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term25357 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term25435 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term25513 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term25591 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term25669 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term25747 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term25825 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term25903 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term25981 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term26059 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term26137 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term26215 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term26293 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term26371 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term26449 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term26527 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term26605 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term26683 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term26761 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term26839 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term26917 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term26995 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term27073 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term27151 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term27229 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term27307 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term27385 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term27463 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term27541 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term27619 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term27697 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term27775 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term27853 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term27931 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term28009 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term28087 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term28165 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term28243 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term28321 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term28399 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term28477 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term28555 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term28633 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term28711 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term28789 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term28867 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term28945 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term29023 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term29101 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term29179 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term29257 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term29335 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term29413 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term29491 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term29569 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term29647 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term29725 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term29803 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term29881 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term29959 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term30037 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term30115 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term30193 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term30271 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term30349 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term30429 = newInstance(Class.forName("com.google.gson.ParameterizedTypeImpl"));
        setField(term30349, term30349.getClass(), "genericComponentType", term30429);
        setField(term30271, term30271.getClass(), "genericComponentType", term30349);
        setField(term30193, term30193.getClass(), "genericComponentType", term30271);
        setField(term30115, term30115.getClass(), "genericComponentType", term30193);
        setField(term30037, term30037.getClass(), "genericComponentType", term30115);
        setField(term29959, term29959.getClass(), "genericComponentType", term30037);
        setField(term29881, term29881.getClass(), "genericComponentType", term29959);
        setField(term29803, term29803.getClass(), "genericComponentType", term29881);
        setField(term29725, term29725.getClass(), "genericComponentType", term29803);
        setField(term29647, term29647.getClass(), "genericComponentType", term29725);
        setField(term29569, term29569.getClass(), "genericComponentType", term29647);
        setField(term29491, term29491.getClass(), "genericComponentType", term29569);
        setField(term29413, term29413.getClass(), "genericComponentType", term29491);
        setField(term29335, term29335.getClass(), "genericComponentType", term29413);
        setField(term29257, term29257.getClass(), "genericComponentType", term29335);
        setField(term29179, term29179.getClass(), "genericComponentType", term29257);
        setField(term29101, term29101.getClass(), "genericComponentType", term29179);
        setField(term29023, term29023.getClass(), "genericComponentType", term29101);
        setField(term28945, term28945.getClass(), "genericComponentType", term29023);
        setField(term28867, term28867.getClass(), "genericComponentType", term28945);
        setField(term28789, term28789.getClass(), "genericComponentType", term28867);
        setField(term28711, term28711.getClass(), "genericComponentType", term28789);
        setField(term28633, term28633.getClass(), "genericComponentType", term28711);
        setField(term28555, term28555.getClass(), "genericComponentType", term28633);
        setField(term28477, term28477.getClass(), "genericComponentType", term28555);
        setField(term28399, term28399.getClass(), "genericComponentType", term28477);
        setField(term28321, term28321.getClass(), "genericComponentType", term28399);
        setField(term28243, term28243.getClass(), "genericComponentType", term28321);
        setField(term28165, term28165.getClass(), "genericComponentType", term28243);
        setField(term28087, term28087.getClass(), "genericComponentType", term28165);
        setField(term28009, term28009.getClass(), "genericComponentType", term28087);
        setField(term27931, term27931.getClass(), "genericComponentType", term28009);
        setField(term27853, term27853.getClass(), "genericComponentType", term27931);
        setField(term27775, term27775.getClass(), "genericComponentType", term27853);
        setField(term27697, term27697.getClass(), "genericComponentType", term27775);
        setField(term27619, term27619.getClass(), "genericComponentType", term27697);
        setField(term27541, term27541.getClass(), "genericComponentType", term27619);
        setField(term27463, term27463.getClass(), "genericComponentType", term27541);
        setField(term27385, term27385.getClass(), "genericComponentType", term27463);
        setField(term27307, term27307.getClass(), "genericComponentType", term27385);
        setField(term27229, term27229.getClass(), "genericComponentType", term27307);
        setField(term27151, term27151.getClass(), "genericComponentType", term27229);
        setField(term27073, term27073.getClass(), "genericComponentType", term27151);
        setField(term26995, term26995.getClass(), "genericComponentType", term27073);
        setField(term26917, term26917.getClass(), "genericComponentType", term26995);
        setField(term26839, term26839.getClass(), "genericComponentType", term26917);
        setField(term26761, term26761.getClass(), "genericComponentType", term26839);
        setField(term26683, term26683.getClass(), "genericComponentType", term26761);
        setField(term26605, term26605.getClass(), "genericComponentType", term26683);
        setField(term26527, term26527.getClass(), "genericComponentType", term26605);
        setField(term26449, term26449.getClass(), "genericComponentType", term26527);
        setField(term26371, term26371.getClass(), "genericComponentType", term26449);
        setField(term26293, term26293.getClass(), "genericComponentType", term26371);
        setField(term26215, term26215.getClass(), "genericComponentType", term26293);
        setField(term26137, term26137.getClass(), "genericComponentType", term26215);
        setField(term26059, term26059.getClass(), "genericComponentType", term26137);
        setField(term25981, term25981.getClass(), "genericComponentType", term26059);
        setField(term25903, term25903.getClass(), "genericComponentType", term25981);
        setField(term25825, term25825.getClass(), "genericComponentType", term25903);
        setField(term25747, term25747.getClass(), "genericComponentType", term25825);
        setField(term25669, term25669.getClass(), "genericComponentType", term25747);
        setField(term25591, term25591.getClass(), "genericComponentType", term25669);
        setField(term25513, term25513.getClass(), "genericComponentType", term25591);
        setField(term25435, term25435.getClass(), "genericComponentType", term25513);
        setField(term25357, term25357.getClass(), "genericComponentType", term25435);
        setField(term25279, term25279.getClass(), "genericComponentType", term25357);
        setField(term25201, term25201.getClass(), "genericComponentType", term25279);
        setField(term25123, term25123.getClass(), "genericComponentType", term25201);
        setField(term25045, term25045.getClass(), "genericComponentType", term25123);
        setField(term24967, term24967.getClass(), "genericComponentType", term25045);
        setField(term24889, term24889.getClass(), "genericComponentType", term24967);
        setField(term24811, term24811.getClass(), "genericComponentType", term24889);
        setField(term24733, term24733.getClass(), "genericComponentType", term24811);
        setField(term24655, term24655.getClass(), "genericComponentType", term24733);
        setField(term24577, term24577.getClass(), "genericComponentType", term24655);
        setField(term24499, term24499.getClass(), "genericComponentType", term24577);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.TypeInfoFactory");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.reflect.Type");
        argTypes[1] = Class.forName("java.lang.reflect.Type");
        argTypes[2] = Class.forName("java.lang.Class");
        Object[] args = new Object[3];
        args[0] = term24499;
        args[1] = null;
        args[2] = null;
        try {
            callMethod(klass, "getActualType", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};
