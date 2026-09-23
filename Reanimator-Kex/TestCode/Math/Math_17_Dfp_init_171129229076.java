package org.apache.commons.math3.dfp;

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
import java.lang.OutOfMemoryError;
import static org.apache.commons.math3.dfp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class Dfp_init_171129229076 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4002;

    public Dfp_init_171129229076() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term81968 = Class.forName((String) "org.apache.commons.math3.dfp.DfpField$RoundingMode");
        Field term81967 = ((Class) term81968).getDeclaredField((String) "ROUND_HALF_DOWN");
        ((Field) term81967).setAccessible(true);
        Object enum173 = ((Field) term81967).get((Object) null);
        Class<? extends Object> term82270 = Class.forName((String) "org.apache.commons.math3.dfp.DfpField$RoundingMode");
        Field term82269 = ((Class) term82270).getDeclaredField((String) "ROUND_UP");
        ((Field) term82269).setAccessible(true);
        Object enum174 = ((Field) term82269).get((Object) null);
        term4002 = newInstance(Class.forName("org.apache.commons.math3.dfp.DfpField"));
        Object term4004 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        int[] term4005 = (int[]) newIntArray(3);
        Object term4012 = newInstance(Class.forName("org.apache.commons.math3.dfp.DfpField"));
        Object term4014 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        int[] term4015 = (int[]) newIntArray(2);
        Object term4021 = newInstance(Class.forName("org.apache.commons.math3.dfp.DfpField"));
        Object term4024 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object term4028 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object[] term4032 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 5);
        Object term4033 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object term4037 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object term4041 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object[] term4045 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 2);
        Object term4046 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object[] term4050 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 6);
        Object term4051 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object[] term4055 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 1);
        Object term4056 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object[] term4060 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 6);
        Object[] term4065 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 8);
        Object[] term4066 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 5);
        Object[] term4067 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 2);
        Object[] term4068 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 6);
        Object[] term4069 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 1);
        setIntField(term4002, term4002.getClass(), "radixDigits", 1384592638);
        setIntElement(term4005, 0, -1002370457);
        setIntElement(term4005, 1, -2014576105);
        setIntElement(term4005, 2, 1296895584);
        setField(term4004, term4004.getClass(), "mant", term4005);
        setByteField(term4004, term4004.getClass(), "sign", (byte) 61);
        setIntField(term4004, term4004.getClass(), "exp", 628918458);
        setByteField(term4004, term4004.getClass(), "nans", (byte) -92);
        setIntField(term4012, term4012.getClass(), "radixDigits", -1274456137);
        setIntElement(term4015, 0, 1041916673);
        setIntElement(term4015, 1, -601863069);
        setField(term4014, term4014.getClass(), "mant", term4015);
        setByteField(term4014, term4014.getClass(), "sign", (byte) 116);
        setIntField(term4014, term4014.getClass(), "exp", 663292551);
        setByteField(term4014, term4014.getClass(), "nans", (byte) -81);
        setIntField(term4021, term4021.getClass(), "radixDigits", -1885090354);
        setField(term4021, term4021.getClass(), "zero", null);
        setField(term4021, term4021.getClass(), "one", null);
        setField(term4021, term4021.getClass(), "two", null);
        setField(term4021, term4021.getClass(), "sqr2", null);
        setField(term4021, term4021.getClass(), "sqr2Split", null);
        setField(term4021, term4021.getClass(), "sqr2Reciprocal", term4014);
        setField(term4021, term4021.getClass(), "sqr3", null);
        setField(term4021, term4021.getClass(), "sqr3Reciprocal", null);
        setField(term4021, term4021.getClass(), "pi", null);
        setField(term4021, term4021.getClass(), "piSplit", null);
        setField(term4021, term4021.getClass(), "e", null);
        setField(term4021, term4021.getClass(), "eSplit", null);
        setField(term4021, term4021.getClass(), "ln2", null);
        setField(term4021, term4021.getClass(), "ln2Split", null);
        setField(term4021, term4021.getClass(), "ln5", null);
        setField(term4021, term4021.getClass(), "ln5Split", null);
        setField(term4021, term4021.getClass(), "ln10", null);
        setField(term4021, term4021.getClass(), "rMode", null);
        setIntField(term4021, term4021.getClass(), "ieeeFlags", -506958186);
        setField(term4014, term4014.getClass(), "field", term4021);
        setField(term4012, term4012.getClass(), "zero", term4014);
        setField(term4024, term4024.getClass(), "mant", null);
        setByteField(term4024, term4024.getClass(), "sign", (byte) 0);
        setIntField(term4024, term4024.getClass(), "exp", 0);
        setByteField(term4024, term4024.getClass(), "nans", (byte) 0);
        setField(term4024, term4024.getClass(), "field", null);
        setField(term4012, term4012.getClass(), "one", term4024);
        setField(term4028, term4028.getClass(), "mant", null);
        setByteField(term4028, term4028.getClass(), "sign", (byte) 0);
        setIntField(term4028, term4028.getClass(), "exp", 0);
        setByteField(term4028, term4028.getClass(), "nans", (byte) 0);
        setField(term4028, term4028.getClass(), "field", null);
        setField(term4012, term4012.getClass(), "two", term4028);
        setField(term4012, term4012.getClass(), "sqr2", term4028);
        setField(term4033, term4033.getClass(), "mant", null);
        setByteField(term4033, term4033.getClass(), "sign", (byte) 0);
        setIntField(term4033, term4033.getClass(), "exp", 0);
        setByteField(term4033, term4033.getClass(), "nans", (byte) 0);
        setField(term4033, term4033.getClass(), "field", null);
        setElement(term4032, 0, term4033);
        setElement(term4032, 1, term4004);
        setElement(term4032, 2, term4004);
        setField(term4037, term4037.getClass(), "mant", null);
        setByteField(term4037, term4037.getClass(), "sign", (byte) -118);
        setIntField(term4037, term4037.getClass(), "exp", -1504890659);
        setByteField(term4037, term4037.getClass(), "nans", (byte) -126);
        setField(term4037, term4037.getClass(), "field", null);
        setElement(term4032, 3, term4037);
        setElement(term4032, 4, term4014);
        setField(term4012, term4012.getClass(), "sqr2Split", term4032);
        setField(term4012, term4012.getClass(), "sqr2Reciprocal", term4028);
        setField(term4012, term4012.getClass(), "sqr3", term4014);
        setField(term4041, term4041.getClass(), "mant", null);
        setByteField(term4041, term4041.getClass(), "sign", (byte) 0);
        setIntField(term4041, term4041.getClass(), "exp", 0);
        setByteField(term4041, term4041.getClass(), "nans", (byte) 0);
        setField(term4041, term4041.getClass(), "field", null);
        setField(term4012, term4012.getClass(), "sqr3Reciprocal", term4041);
        setField(term4012, term4012.getClass(), "pi", term4033);
        setElement(term4045, 0, term4041);
        setField(term4046, term4046.getClass(), "mant", null);
        setByteField(term4046, term4046.getClass(), "sign", (byte) 0);
        setIntField(term4046, term4046.getClass(), "exp", 0);
        setByteField(term4046, term4046.getClass(), "nans", (byte) 0);
        setField(term4046, term4046.getClass(), "field", null);
        setElement(term4045, 1, term4046);
        setField(term4012, term4012.getClass(), "piSplit", term4045);
        setField(term4012, term4012.getClass(), "e", term4033);
        setField(term4051, term4051.getClass(), "mant", null);
        setByteField(term4051, term4051.getClass(), "sign", (byte) 0);
        setIntField(term4051, term4051.getClass(), "exp", 0);
        setByteField(term4051, term4051.getClass(), "nans", (byte) 0);
        setField(term4051, term4051.getClass(), "field", null);
        setElement(term4050, 0, term4051);
        setElement(term4050, 1, term4046);
        setElement(term4050, 2, term4051);
        setElement(term4050, 3, term4024);
        setElement(term4050, 4, term4051);
        setElement(term4050, 5, term4046);
        setField(term4012, term4012.getClass(), "eSplit", term4050);
        setField(term4012, term4012.getClass(), "ln2", term4037);
        setField(term4056, term4056.getClass(), "mant", null);
        setByteField(term4056, term4056.getClass(), "sign", (byte) 0);
        setIntField(term4056, term4056.getClass(), "exp", 0);
        setByteField(term4056, term4056.getClass(), "nans", (byte) 0);
        setField(term4056, term4056.getClass(), "field", null);
        setElement(term4055, 0, term4056);
        setField(term4012, term4012.getClass(), "ln2Split", term4055);
        setField(term4012, term4012.getClass(), "ln5", term4028);
        setElement(term4060, 0, term4014);
        setElement(term4060, 1, term4024);
        setElement(term4060, 2, term4028);
        setElement(term4060, 3, term4037);
        setElement(term4060, 4, term4024);
        setElement(term4060, 5, term4051);
        setField(term4012, term4012.getClass(), "ln5Split", term4060);
        setField(term4012, term4012.getClass(), "ln10", term4041);
        setField(term4012, term4012.getClass(), "rMode", enum173);
        setIntField(term4012, term4012.getClass(), "ieeeFlags", -507387516);
        setField(term4004, term4004.getClass(), "field", term4012);
        setField(term4002, term4002.getClass(), "zero", term4004);
        setField(term4002, term4002.getClass(), "one", term4051);
        setField(term4002, term4002.getClass(), "two", term4033);
        setField(term4002, term4002.getClass(), "sqr2", term4056);
        setElement(term4065, 0, term4014);
        setElement(term4065, 1, term4046);
        setElement(term4065, 2, term4004);
        setElement(term4065, 3, term4056);
        setElement(term4065, 4, term4041);
        setElement(term4065, 5, term4041);
        setElement(term4065, 6, term4004);
        setElement(term4065, 7, term4046);
        setField(term4002, term4002.getClass(), "sqr2Split", term4065);
        setField(term4002, term4002.getClass(), "sqr2Reciprocal", term4051);
        setField(term4002, term4002.getClass(), "sqr3", term4024);
        setField(term4002, term4002.getClass(), "sqr3Reciprocal", term4028);
        setField(term4002, term4002.getClass(), "pi", term4041);
        setElement(term4066, 0, term4037);
        setElement(term4066, 1, term4028);
        setElement(term4066, 2, term4051);
        setElement(term4066, 3, term4033);
        setElement(term4066, 4, term4028);
        setField(term4002, term4002.getClass(), "piSplit", term4066);
        setField(term4002, term4002.getClass(), "e", term4014);
        setElement(term4067, 0, term4051);
        setElement(term4067, 1, term4014);
        setField(term4002, term4002.getClass(), "eSplit", term4067);
        setField(term4002, term4002.getClass(), "ln2", term4033);
        setElement(term4068, 0, term4028);
        setElement(term4068, 1, term4033);
        setElement(term4068, 2, term4028);
        setElement(term4068, 3, term4033);
        setElement(term4068, 4, term4033);
        setElement(term4068, 5, term4041);
        setField(term4002, term4002.getClass(), "ln2Split", term4068);
        setField(term4002, term4002.getClass(), "ln5", term4046);
        setElement(term4069, 0, term4014);
        setField(term4002, term4002.getClass(), "ln5Split", term4069);
        setField(term4002, term4002.getClass(), "ln10", term4037);
        setField(term4002, term4002.getClass(), "rMode", enum174);
        setIntField(term4002, term4002.getClass(), "ieeeFlags", -1970452551);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.dfp.Dfp");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math3.dfp.DfpField");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term4002;
        args[1] = "RMFIsYGgne";
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (OutOfMemoryError e) {
        }

    }

};


