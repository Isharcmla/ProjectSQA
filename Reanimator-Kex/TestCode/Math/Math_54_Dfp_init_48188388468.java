package org.apache.commons.math.dfp;

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
import static org.apache.commons.math.dfp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class Dfp_init_48188388468 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3947;

    public Dfp_init_48188388468() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term76546 = Class.forName((String) "org.apache.commons.math.dfp.DfpField$RoundingMode");
        Field term76545 = ((Class) term76546).getDeclaredField((String) "ROUND_FLOOR");
        ((Field) term76545).setAccessible(true);
        Object enum160 = ((Field) term76545).get((Object) null);
        Class<? extends Object> term76831 = Class.forName((String) "org.apache.commons.math.dfp.DfpField$RoundingMode");
        Field term76830 = ((Class) term76831).getDeclaredField((String) "ROUND_UP");
        ((Field) term76830).setAccessible(true);
        Object enum161 = ((Field) term76830).get((Object) null);
        term3947 = newInstance(Class.forName("org.apache.commons.math.dfp.DfpField"));
        Object term3949 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        int[] term3950 = (int[]) newIntArray(3);
        Object term3957 = newInstance(Class.forName("org.apache.commons.math.dfp.DfpField"));
        Object term3959 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        int[] term3960 = (int[]) newIntArray(2);
        Object term3966 = newInstance(Class.forName("org.apache.commons.math.dfp.DfpField"));
        Object term3969 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object term3973 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object[] term3977 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 5);
        Object term3978 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object term3982 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object term3986 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object[] term3990 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 2);
        Object term3991 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object[] term3995 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 6);
        Object term3996 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object[] term4000 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 1);
        Object term4001 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object[] term4005 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 6);
        Object[] term4010 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 8);
        Object[] term4011 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 5);
        Object[] term4012 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 2);
        Object[] term4013 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 6);
        Object[] term4014 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 1);
        setIntField(term3947, term3947.getClass(), "radixDigits", 1384592638);
        setIntElement(term3950, 0, -1002370457);
        setIntElement(term3950, 1, -2014576105);
        setIntElement(term3950, 2, 1296895584);
        setField(term3949, term3949.getClass(), "mant", term3950);
        setByteField(term3949, term3949.getClass(), "sign", (byte) 61);
        setIntField(term3949, term3949.getClass(), "exp", 628918458);
        setByteField(term3949, term3949.getClass(), "nans", (byte) -92);
        setIntField(term3957, term3957.getClass(), "radixDigits", -1274456137);
        setIntElement(term3960, 0, 1041916673);
        setIntElement(term3960, 1, -601863069);
        setField(term3959, term3959.getClass(), "mant", term3960);
        setByteField(term3959, term3959.getClass(), "sign", (byte) 116);
        setIntField(term3959, term3959.getClass(), "exp", 663292551);
        setByteField(term3959, term3959.getClass(), "nans", (byte) -81);
        setIntField(term3966, term3966.getClass(), "radixDigits", -1885090354);
        setField(term3966, term3966.getClass(), "zero", null);
        setField(term3966, term3966.getClass(), "one", null);
        setField(term3966, term3966.getClass(), "two", null);
        setField(term3966, term3966.getClass(), "sqr2", null);
        setField(term3966, term3966.getClass(), "sqr2Split", null);
        setField(term3966, term3966.getClass(), "sqr2Reciprocal", term3959);
        setField(term3966, term3966.getClass(), "sqr3", null);
        setField(term3966, term3966.getClass(), "sqr3Reciprocal", null);
        setField(term3966, term3966.getClass(), "pi", null);
        setField(term3966, term3966.getClass(), "piSplit", null);
        setField(term3966, term3966.getClass(), "e", null);
        setField(term3966, term3966.getClass(), "eSplit", null);
        setField(term3966, term3966.getClass(), "ln2", null);
        setField(term3966, term3966.getClass(), "ln2Split", null);
        setField(term3966, term3966.getClass(), "ln5", null);
        setField(term3966, term3966.getClass(), "ln5Split", null);
        setField(term3966, term3966.getClass(), "ln10", null);
        setField(term3966, term3966.getClass(), "rMode", null);
        setIntField(term3966, term3966.getClass(), "ieeeFlags", -506958186);
        setField(term3959, term3959.getClass(), "field", term3966);
        setField(term3957, term3957.getClass(), "zero", term3959);
        setField(term3969, term3969.getClass(), "mant", null);
        setByteField(term3969, term3969.getClass(), "sign", (byte) 0);
        setIntField(term3969, term3969.getClass(), "exp", 0);
        setByteField(term3969, term3969.getClass(), "nans", (byte) 0);
        setField(term3969, term3969.getClass(), "field", null);
        setField(term3957, term3957.getClass(), "one", term3969);
        setField(term3973, term3973.getClass(), "mant", null);
        setByteField(term3973, term3973.getClass(), "sign", (byte) 0);
        setIntField(term3973, term3973.getClass(), "exp", 0);
        setByteField(term3973, term3973.getClass(), "nans", (byte) 0);
        setField(term3973, term3973.getClass(), "field", null);
        setField(term3957, term3957.getClass(), "two", term3973);
        setField(term3957, term3957.getClass(), "sqr2", term3973);
        setField(term3978, term3978.getClass(), "mant", null);
        setByteField(term3978, term3978.getClass(), "sign", (byte) 0);
        setIntField(term3978, term3978.getClass(), "exp", 0);
        setByteField(term3978, term3978.getClass(), "nans", (byte) 0);
        setField(term3978, term3978.getClass(), "field", null);
        setElement(term3977, 0, term3978);
        setElement(term3977, 1, term3949);
        setElement(term3977, 2, term3949);
        setField(term3982, term3982.getClass(), "mant", null);
        setByteField(term3982, term3982.getClass(), "sign", (byte) -118);
        setIntField(term3982, term3982.getClass(), "exp", -1504890659);
        setByteField(term3982, term3982.getClass(), "nans", (byte) -126);
        setField(term3982, term3982.getClass(), "field", null);
        setElement(term3977, 3, term3982);
        setElement(term3977, 4, term3959);
        setField(term3957, term3957.getClass(), "sqr2Split", term3977);
        setField(term3957, term3957.getClass(), "sqr2Reciprocal", term3973);
        setField(term3957, term3957.getClass(), "sqr3", term3959);
        setField(term3986, term3986.getClass(), "mant", null);
        setByteField(term3986, term3986.getClass(), "sign", (byte) 0);
        setIntField(term3986, term3986.getClass(), "exp", 0);
        setByteField(term3986, term3986.getClass(), "nans", (byte) 0);
        setField(term3986, term3986.getClass(), "field", null);
        setField(term3957, term3957.getClass(), "sqr3Reciprocal", term3986);
        setField(term3957, term3957.getClass(), "pi", term3978);
        setElement(term3990, 0, term3986);
        setField(term3991, term3991.getClass(), "mant", null);
        setByteField(term3991, term3991.getClass(), "sign", (byte) 0);
        setIntField(term3991, term3991.getClass(), "exp", 0);
        setByteField(term3991, term3991.getClass(), "nans", (byte) 0);
        setField(term3991, term3991.getClass(), "field", null);
        setElement(term3990, 1, term3991);
        setField(term3957, term3957.getClass(), "piSplit", term3990);
        setField(term3957, term3957.getClass(), "e", term3978);
        setField(term3996, term3996.getClass(), "mant", null);
        setByteField(term3996, term3996.getClass(), "sign", (byte) 0);
        setIntField(term3996, term3996.getClass(), "exp", 0);
        setByteField(term3996, term3996.getClass(), "nans", (byte) 0);
        setField(term3996, term3996.getClass(), "field", null);
        setElement(term3995, 0, term3996);
        setElement(term3995, 1, term3991);
        setElement(term3995, 2, term3996);
        setElement(term3995, 3, term3969);
        setElement(term3995, 4, term3996);
        setElement(term3995, 5, term3991);
        setField(term3957, term3957.getClass(), "eSplit", term3995);
        setField(term3957, term3957.getClass(), "ln2", term3982);
        setField(term4001, term4001.getClass(), "mant", null);
        setByteField(term4001, term4001.getClass(), "sign", (byte) 0);
        setIntField(term4001, term4001.getClass(), "exp", 0);
        setByteField(term4001, term4001.getClass(), "nans", (byte) 0);
        setField(term4001, term4001.getClass(), "field", null);
        setElement(term4000, 0, term4001);
        setField(term3957, term3957.getClass(), "ln2Split", term4000);
        setField(term3957, term3957.getClass(), "ln5", term3973);
        setElement(term4005, 0, term3959);
        setElement(term4005, 1, term3969);
        setElement(term4005, 2, term3973);
        setElement(term4005, 3, term3982);
        setElement(term4005, 4, term3969);
        setElement(term4005, 5, term3996);
        setField(term3957, term3957.getClass(), "ln5Split", term4005);
        setField(term3957, term3957.getClass(), "ln10", term3986);
        setField(term3957, term3957.getClass(), "rMode", enum160);
        setIntField(term3957, term3957.getClass(), "ieeeFlags", -507387516);
        setField(term3949, term3949.getClass(), "field", term3957);
        setField(term3947, term3947.getClass(), "zero", term3949);
        setField(term3947, term3947.getClass(), "one", term3996);
        setField(term3947, term3947.getClass(), "two", term3978);
        setField(term3947, term3947.getClass(), "sqr2", term4001);
        setElement(term4010, 0, term3959);
        setElement(term4010, 1, term3991);
        setElement(term4010, 2, term3949);
        setElement(term4010, 3, term4001);
        setElement(term4010, 4, term3986);
        setElement(term4010, 5, term3986);
        setElement(term4010, 6, term3949);
        setElement(term4010, 7, term3991);
        setField(term3947, term3947.getClass(), "sqr2Split", term4010);
        setField(term3947, term3947.getClass(), "sqr2Reciprocal", term3996);
        setField(term3947, term3947.getClass(), "sqr3", term3969);
        setField(term3947, term3947.getClass(), "sqr3Reciprocal", term3973);
        setField(term3947, term3947.getClass(), "pi", term3986);
        setElement(term4011, 0, term3982);
        setElement(term4011, 1, term3973);
        setElement(term4011, 2, term3996);
        setElement(term4011, 3, term3978);
        setElement(term4011, 4, term3973);
        setField(term3947, term3947.getClass(), "piSplit", term4011);
        setField(term3947, term3947.getClass(), "e", term3959);
        setElement(term4012, 0, term3996);
        setElement(term4012, 1, term3959);
        setField(term3947, term3947.getClass(), "eSplit", term4012);
        setField(term3947, term3947.getClass(), "ln2", term3978);
        setElement(term4013, 0, term3973);
        setElement(term4013, 1, term3978);
        setElement(term4013, 2, term3973);
        setElement(term4013, 3, term3978);
        setElement(term4013, 4, term3978);
        setElement(term4013, 5, term3986);
        setField(term3947, term3947.getClass(), "ln2Split", term4013);
        setField(term3947, term3947.getClass(), "ln5", term3991);
        setElement(term4014, 0, term3959);
        setField(term3947, term3947.getClass(), "ln5Split", term4014);
        setField(term3947, term3947.getClass(), "ln10", term3982);
        setField(term3947, term3947.getClass(), "rMode", enum161);
        setIntField(term3947, term3947.getClass(), "ieeeFlags", -1970452551);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.dfp.Dfp");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math.dfp.DfpField");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term3947;
        args[1] = "RMFIsYGgne";
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (OutOfMemoryError e) {
        }

    }

};


