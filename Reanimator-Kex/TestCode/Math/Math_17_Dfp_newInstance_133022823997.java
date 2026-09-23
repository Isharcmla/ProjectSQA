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
import java.lang.NegativeArraySizeException;
import static org.apache.commons.math3.dfp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class Dfp_newInstance_133022823997 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9183;

    public Dfp_newInstance_133022823997() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term542060 = Class.forName((String) "org.apache.commons.math3.dfp.DfpField$RoundingMode");
        Field term542059 = ((Class) term542060).getDeclaredField((String) "ROUND_HALF_EVEN");
        ((Field) term542059).setAccessible(true);
        Object enum197 = ((Field) term542059).get((Object) null);
        Class<? extends Object> term542362 = Class.forName((String) "org.apache.commons.math3.dfp.DfpField$RoundingMode");
        Field term542361 = ((Class) term542362).getDeclaredField((String) "ROUND_CEIL");
        ((Field) term542361).setAccessible(true);
        Object enum198 = ((Field) term542361).get((Object) null);
        term9183 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        int[] term9184 = (int[]) newIntArray(4);
        Object term9192 = newInstance(Class.forName("org.apache.commons.math3.dfp.DfpField"));
        Object term9194 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        int[] term9195 = (int[]) newIntArray(5);
        Object term9204 = newInstance(Class.forName("org.apache.commons.math3.dfp.DfpField"));
        Object term9206 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object term9210 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object term9214 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object[] term9218 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 0);
        Object term9219 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object term9223 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object[] term9227 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 7);
        Object term9228 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object[] term9232 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 2);
        Object[] term9233 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 8);
        Object[] term9234 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 2);
        Object term9235 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object term9242 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object[] term9246 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 4);
        Object[] term9247 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 4);
        Object[] term9248 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 3);
        Object[] term9249 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 4);
        Object[] term9250 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 5);
        setIntElement(term9184, 0, -350454594);
        setIntElement(term9184, 1, -1148142995);
        setIntElement(term9184, 2, -233024044);
        setIntElement(term9184, 3, 1820784228);
        setField(term9183, term9183.getClass(), "mant", term9184);
        setByteField(term9183, term9183.getClass(), "sign", (byte) 117);
        setIntField(term9183, term9183.getClass(), "exp", 1390820006);
        setByteField(term9183, term9183.getClass(), "nans", (byte) 43);
        setIntField(term9192, term9192.getClass(), "radixDigits", -828982065);
        setIntElement(term9195, 0, 1221443226);
        setIntElement(term9195, 1, 908108726);
        setIntElement(term9195, 2, 1023209512);
        setIntElement(term9195, 3, 1084849225);
        setIntElement(term9195, 4, -1702055571);
        setField(term9194, term9194.getClass(), "mant", term9195);
        setByteField(term9194, term9194.getClass(), "sign", (byte) 34);
        setIntField(term9194, term9194.getClass(), "exp", -944542900);
        setByteField(term9194, term9194.getClass(), "nans", (byte) -126);
        setIntField(term9204, term9204.getClass(), "radixDigits", 2063762142);
        setField(term9206, term9206.getClass(), "mant", null);
        setByteField(term9206, term9206.getClass(), "sign", (byte) -75);
        setIntField(term9206, term9206.getClass(), "exp", 808203320);
        setByteField(term9206, term9206.getClass(), "nans", (byte) 69);
        setField(term9206, term9206.getClass(), "field", null);
        setField(term9204, term9204.getClass(), "zero", term9206);
        setField(term9204, term9204.getClass(), "one", term9206);
        setField(term9210, term9210.getClass(), "mant", null);
        setByteField(term9210, term9210.getClass(), "sign", (byte) 0);
        setIntField(term9210, term9210.getClass(), "exp", 0);
        setByteField(term9210, term9210.getClass(), "nans", (byte) 0);
        setField(term9210, term9210.getClass(), "field", null);
        setField(term9204, term9204.getClass(), "two", term9210);
        setField(term9214, term9214.getClass(), "mant", null);
        setByteField(term9214, term9214.getClass(), "sign", (byte) 0);
        setIntField(term9214, term9214.getClass(), "exp", 0);
        setByteField(term9214, term9214.getClass(), "nans", (byte) 0);
        setField(term9214, term9214.getClass(), "field", null);
        setField(term9204, term9204.getClass(), "sqr2", term9214);
        setField(term9204, term9204.getClass(), "sqr2Split", term9218);
        setField(term9219, term9219.getClass(), "mant", null);
        setByteField(term9219, term9219.getClass(), "sign", (byte) 0);
        setIntField(term9219, term9219.getClass(), "exp", 0);
        setByteField(term9219, term9219.getClass(), "nans", (byte) 0);
        setField(term9219, term9219.getClass(), "field", null);
        setField(term9204, term9204.getClass(), "sqr2Reciprocal", term9219);
        setField(term9204, term9204.getClass(), "sqr3", term9219);
        setField(term9223, term9223.getClass(), "mant", null);
        setByteField(term9223, term9223.getClass(), "sign", (byte) 0);
        setIntField(term9223, term9223.getClass(), "exp", 0);
        setByteField(term9223, term9223.getClass(), "nans", (byte) 0);
        setField(term9223, term9223.getClass(), "field", null);
        setField(term9204, term9204.getClass(), "sqr3Reciprocal", term9223);
        setField(term9204, term9204.getClass(), "pi", term9210);
        setElement(term9227, 0, term9210);
        setElement(term9227, 1, term9194);
        setElement(term9227, 5, term9219);
        setElement(term9227, 6, term9206);
        setField(term9204, term9204.getClass(), "piSplit", term9227);
        setField(term9228, term9228.getClass(), "mant", null);
        setByteField(term9228, term9228.getClass(), "sign", (byte) 0);
        setIntField(term9228, term9228.getClass(), "exp", 0);
        setByteField(term9228, term9228.getClass(), "nans", (byte) 0);
        setField(term9228, term9228.getClass(), "field", null);
        setField(term9204, term9204.getClass(), "e", term9228);
        setElement(term9232, 1, term9194);
        setField(term9204, term9204.getClass(), "eSplit", term9232);
        setField(term9204, term9204.getClass(), "ln2", term9214);
        setElement(term9233, 2, term9219);
        setElement(term9233, 3, term9210);
        setElement(term9233, 4, term9194);
        setElement(term9233, 5, term9228);
        setField(term9204, term9204.getClass(), "ln2Split", term9233);
        setField(term9204, term9204.getClass(), "ln5", term9219);
        setElement(term9234, 0, term9194);
        setElement(term9234, 1, term9210);
        setField(term9204, term9204.getClass(), "ln5Split", term9234);
        setField(term9235, term9235.getClass(), "mant", null);
        setByteField(term9235, term9235.getClass(), "sign", (byte) 0);
        setIntField(term9235, term9235.getClass(), "exp", 0);
        setByteField(term9235, term9235.getClass(), "nans", (byte) 0);
        setField(term9235, term9235.getClass(), "field", null);
        setField(term9204, term9204.getClass(), "ln10", term9235);
        setField(term9204, term9204.getClass(), "rMode", enum197);
        setIntField(term9204, term9204.getClass(), "ieeeFlags", -439048495);
        setField(term9194, term9194.getClass(), "field", term9204);
        setField(term9192, term9192.getClass(), "zero", term9194);
        setField(term9192, term9192.getClass(), "one", term9194);
        setField(term9192, term9192.getClass(), "two", term9214);
        setField(term9242, term9242.getClass(), "mant", null);
        setByteField(term9242, term9242.getClass(), "sign", (byte) 0);
        setIntField(term9242, term9242.getClass(), "exp", 0);
        setByteField(term9242, term9242.getClass(), "nans", (byte) 0);
        setField(term9242, term9242.getClass(), "field", null);
        setField(term9192, term9192.getClass(), "sqr2", term9242);
        setElement(term9246, 0, term9206);
        setElement(term9246, 1, term9194);
        setElement(term9246, 2, term9242);
        setElement(term9246, 3, term9228);
        setField(term9192, term9192.getClass(), "sqr2Split", term9246);
        setField(term9192, term9192.getClass(), "sqr2Reciprocal", term9183);
        setField(term9192, term9192.getClass(), "sqr3", term9219);
        setField(term9192, term9192.getClass(), "sqr3Reciprocal", term9223);
        setField(term9192, term9192.getClass(), "pi", term9210);
        setElement(term9247, 0, term9223);
        setElement(term9247, 1, term9223);
        setElement(term9247, 2, term9242);
        setElement(term9247, 3, term9206);
        setField(term9192, term9192.getClass(), "piSplit", term9247);
        setField(term9192, term9192.getClass(), "e", term9235);
        setElement(term9248, 0, term9228);
        setElement(term9248, 1, term9214);
        setElement(term9248, 2, term9194);
        setField(term9192, term9192.getClass(), "eSplit", term9248);
        setField(term9192, term9192.getClass(), "ln2", term9223);
        setElement(term9249, 0, term9194);
        setElement(term9249, 1, term9242);
        setElement(term9249, 2, term9210);
        setElement(term9249, 3, term9214);
        setField(term9192, term9192.getClass(), "ln2Split", term9249);
        setField(term9192, term9192.getClass(), "ln5", term9210);
        setElement(term9250, 0, term9228);
        setElement(term9250, 1, term9228);
        setElement(term9250, 2, term9219);
        setElement(term9250, 3, term9183);
        setElement(term9250, 4, term9183);
        setField(term9192, term9192.getClass(), "ln5Split", term9250);
        setField(term9192, term9192.getClass(), "ln10", term9206);
        setField(term9192, term9192.getClass(), "rMode", enum198);
        setIntField(term9192, term9192.getClass(), "ieeeFlags", -1849105286);
        setField(term9183, term9183.getClass(), "field", term9192);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.dfp.Dfp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "NRdvgJlhkX";
        try {
            callMethod(klass, "newInstance", argTypes, term9183, args);
            assertTrue(false);
        }
        catch (NegativeArraySizeException e) {
        }

    }

};


