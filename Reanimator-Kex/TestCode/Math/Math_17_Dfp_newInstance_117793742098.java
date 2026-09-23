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
import java.lang.Byte;

public class Dfp_newInstance_117793742098 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9871;
     Object term9948;
     Object term9950;

    public Dfp_newInstance_117793742098() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term542922 = Class.forName((String) "org.apache.commons.math3.dfp.DfpField$RoundingMode");
        Field term542921 = ((Class) term542922).getDeclaredField((String) "ROUND_CEIL");
        ((Field) term542921).setAccessible(true);
        Object enum199 = ((Field) term542921).get((Object) null);
        Class<? extends Object> term543209 = Class.forName((String) "org.apache.commons.math3.dfp.DfpField$RoundingMode");
        Field term543208 = ((Class) term543209).getDeclaredField((String) "ROUND_FLOOR");
        ((Field) term543208).setAccessible(true);
        Object enum200 = ((Field) term543208).get((Object) null);
        term9871 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        int[] term9872 = (int[]) newIntArray(0);
        Object term9876 = newInstance(Class.forName("org.apache.commons.math3.dfp.DfpField"));
        Object term9878 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        int[] term9879 = (int[]) newIntArray(2);
        Object term9885 = newInstance(Class.forName("org.apache.commons.math3.dfp.DfpField"));
        Object term9887 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object term9891 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object term9895 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object[] term9899 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 8);
        Object term9900 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object term9904 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object[] term9908 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 4);
        Object[] term9909 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 9);
        Object[] term9910 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 6);
        Object term9911 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object[] term9915 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 3);
        Object[] term9919 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 3);
        Object term9920 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object[] term9924 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 4);
        Object[] term9925 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 2);
        Object term9926 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object[] term9930 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 4);
        Object[] term9931 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 1);
        setField(term9871, term9871.getClass(), "mant", term9872);
        setByteField(term9871, term9871.getClass(), "sign", (byte) -109);
        setIntField(term9871, term9871.getClass(), "exp", 1334483645);
        setByteField(term9871, term9871.getClass(), "nans", (byte) 122);
        setIntField(term9876, term9876.getClass(), "radixDigits", 917513193);
        setIntElement(term9879, 0, 787278105);
        setIntElement(term9879, 1, -2063843486);
        setField(term9878, term9878.getClass(), "mant", term9879);
        setByteField(term9878, term9878.getClass(), "sign", (byte) -123);
        setIntField(term9878, term9878.getClass(), "exp", 833762980);
        setByteField(term9878, term9878.getClass(), "nans", (byte) -76);
        setIntField(term9885, term9885.getClass(), "radixDigits", 320711637);
        setField(term9887, term9887.getClass(), "mant", null);
        setByteField(term9887, term9887.getClass(), "sign", (byte) -48);
        setIntField(term9887, term9887.getClass(), "exp", 765766290);
        setByteField(term9887, term9887.getClass(), "nans", (byte) 126);
        setField(term9887, term9887.getClass(), "field", null);
        setField(term9885, term9885.getClass(), "zero", term9887);
        setField(term9891, term9891.getClass(), "mant", null);
        setByteField(term9891, term9891.getClass(), "sign", (byte) 0);
        setIntField(term9891, term9891.getClass(), "exp", 0);
        setByteField(term9891, term9891.getClass(), "nans", (byte) 0);
        setField(term9891, term9891.getClass(), "field", null);
        setField(term9885, term9885.getClass(), "one", term9891);
        setField(term9885, term9885.getClass(), "two", term9891);
        setField(term9895, term9895.getClass(), "mant", null);
        setByteField(term9895, term9895.getClass(), "sign", (byte) 0);
        setIntField(term9895, term9895.getClass(), "exp", 0);
        setByteField(term9895, term9895.getClass(), "nans", (byte) 0);
        setField(term9895, term9895.getClass(), "field", null);
        setField(term9885, term9885.getClass(), "sqr2", term9895);
        setElement(term9899, 1, term9878);
        setElement(term9899, 3, term9891);
        setElement(term9899, 5, term9895);
        setElement(term9899, 6, term9878);
        setField(term9885, term9885.getClass(), "sqr2Split", term9899);
        setField(term9885, term9885.getClass(), "sqr2Reciprocal", term9891);
        setField(term9885, term9885.getClass(), "sqr3", term9878);
        setField(term9900, term9900.getClass(), "mant", null);
        setByteField(term9900, term9900.getClass(), "sign", (byte) 0);
        setIntField(term9900, term9900.getClass(), "exp", 0);
        setByteField(term9900, term9900.getClass(), "nans", (byte) 0);
        setField(term9900, term9900.getClass(), "field", null);
        setField(term9885, term9885.getClass(), "sqr3Reciprocal", term9900);
        setField(term9904, term9904.getClass(), "mant", null);
        setByteField(term9904, term9904.getClass(), "sign", (byte) 0);
        setIntField(term9904, term9904.getClass(), "exp", 0);
        setByteField(term9904, term9904.getClass(), "nans", (byte) 0);
        setField(term9904, term9904.getClass(), "field", null);
        setField(term9885, term9885.getClass(), "pi", term9904);
        setElement(term9908, 0, term9887);
        setElement(term9908, 1, term9878);
        setElement(term9908, 2, term9904);
        setField(term9885, term9885.getClass(), "piSplit", term9908);
        setField(term9885, term9885.getClass(), "e", term9871);
        setElement(term9909, 0, term9895);
        setElement(term9909, 5, term9904);
        setElement(term9909, 6, term9887);
        setElement(term9909, 7, term9891);
        setField(term9885, term9885.getClass(), "eSplit", term9909);
        setField(term9885, term9885.getClass(), "ln2", term9900);
        setElement(term9910, 0, term9878);
        setElement(term9910, 2, term9878);
        setElement(term9910, 3, term9904);
        setElement(term9910, 5, term9900);
        setField(term9885, term9885.getClass(), "ln2Split", term9910);
        setField(term9911, term9911.getClass(), "mant", null);
        setByteField(term9911, term9911.getClass(), "sign", (byte) 0);
        setIntField(term9911, term9911.getClass(), "exp", 0);
        setByteField(term9911, term9911.getClass(), "nans", (byte) 0);
        setField(term9911, term9911.getClass(), "field", null);
        setField(term9885, term9885.getClass(), "ln5", term9911);
        setElement(term9915, 2, term9895);
        setField(term9885, term9885.getClass(), "ln5Split", term9915);
        setField(term9885, term9885.getClass(), "ln10", term9871);
        setField(term9885, term9885.getClass(), "rMode", enum199);
        setIntField(term9885, term9885.getClass(), "ieeeFlags", 947897214);
        setField(term9878, term9878.getClass(), "field", term9885);
        setField(term9876, term9876.getClass(), "zero", term9878);
        setField(term9876, term9876.getClass(), "one", term9871);
        setField(term9876, term9876.getClass(), "two", term9887);
        setField(term9876, term9876.getClass(), "sqr2", term9878);
        setField(term9920, term9920.getClass(), "mant", null);
        setByteField(term9920, term9920.getClass(), "sign", (byte) 0);
        setIntField(term9920, term9920.getClass(), "exp", 0);
        setByteField(term9920, term9920.getClass(), "nans", (byte) 0);
        setField(term9920, term9920.getClass(), "field", null);
        setElement(term9919, 0, term9920);
        setElement(term9919, 1, term9878);
        setElement(term9919, 2, term9891);
        setField(term9876, term9876.getClass(), "sqr2Split", term9919);
        setField(term9876, term9876.getClass(), "sqr2Reciprocal", term9895);
        setField(term9876, term9876.getClass(), "sqr3", term9891);
        setField(term9876, term9876.getClass(), "sqr3Reciprocal", term9900);
        setField(term9876, term9876.getClass(), "pi", term9895);
        setElement(term9924, 0, term9904);
        setElement(term9924, 1, term9900);
        setElement(term9924, 2, term9904);
        setElement(term9924, 3, term9911);
        setField(term9876, term9876.getClass(), "piSplit", term9924);
        setField(term9876, term9876.getClass(), "e", term9904);
        setElement(term9925, 0, term9900);
        setElement(term9925, 1, term9887);
        setField(term9876, term9876.getClass(), "eSplit", term9925);
        setField(term9926, term9926.getClass(), "mant", null);
        setByteField(term9926, term9926.getClass(), "sign", (byte) 0);
        setIntField(term9926, term9926.getClass(), "exp", 0);
        setByteField(term9926, term9926.getClass(), "nans", (byte) 0);
        setField(term9926, term9926.getClass(), "field", null);
        setField(term9876, term9876.getClass(), "ln2", term9926);
        setElement(term9930, 0, term9920);
        setElement(term9930, 1, term9878);
        setElement(term9930, 2, term9911);
        setElement(term9930, 3, term9920);
        setField(term9876, term9876.getClass(), "ln2Split", term9930);
        setField(term9876, term9876.getClass(), "ln5", term9887);
        setElement(term9931, 0, term9911);
        setField(term9876, term9876.getClass(), "ln5Split", term9931);
        setField(term9876, term9876.getClass(), "ln10", term9904);
        setField(term9876, term9876.getClass(), "rMode", enum200);
        setIntField(term9876, term9876.getClass(), "ieeeFlags", 1496340209);
        setField(term9871, term9871.getClass(), "field", term9876);
        term9948 = new Byte((byte) 103);
        term9950 = new Byte((byte) 23);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.dfp.Dfp");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = byte.class;
        argTypes[1] = byte.class;
        Object[] args = new Object[2];
        args[0] = term9948;
        args[1] = term9950;
        try {
            callMethod(klass, "newInstance", argTypes, term9871, args);
            assertTrue(false);
        }
        catch (OutOfMemoryError e) {
        }

    }

};


