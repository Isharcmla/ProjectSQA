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
import static org.apache.commons.math3.dfp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class Dfp_dfp2string_107036161362 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44509;

    public Dfp_dfp2string_107036161362() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term44598 = Class.forName((String) "org.apache.commons.math3.dfp.DfpField$RoundingMode");
        Field term44597 = ((Class) term44598).getDeclaredField((String) "ROUND_UP");
        ((Field) term44597).setAccessible(true);
        Object enum128 = ((Field) term44597).get((Object) null);
        Class<? extends Object> term44879 = Class.forName((String) "org.apache.commons.math3.dfp.DfpField$RoundingMode");
        Field term44878 = ((Class) term44879).getDeclaredField((String) "ROUND_DOWN");
        ((Field) term44878).setAccessible(true);
        Object enum129 = ((Field) term44878).get((Object) null);
        term44509 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        int[] term44510 = (int[]) newIntArray(3);
        Object term44517 = newInstance(Class.forName("org.apache.commons.math3.dfp.DfpField"));
        Object term44519 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        int[] term44520 = (int[]) newIntArray(4);
        Object term44528 = newInstance(Class.forName("org.apache.commons.math3.dfp.DfpField"));
        Object term44530 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object term44534 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object term44538 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object term44542 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object[] term44546 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 1);
        Object term44547 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object term44551 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object[] term44555 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 2);
        Object[] term44556 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 4);
        Object term44557 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object[] term44561 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 3);
        Object[] term44562 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 9);
        Object[] term44566 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 1);
        Object[] term44567 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 4);
        Object[] term44568 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 2);
        Object term44569 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object[] term44573 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 1);
        Object[] term44574 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 4);
        setIntElement(term44510, 0, -2014792457);
        setIntElement(term44510, 1, 1957633116);
        setIntElement(term44510, 2, 1428598210);
        setField(term44509, term44509.getClass(), "mant", term44510);
        setByteField(term44509, term44509.getClass(), "sign", (byte) 123);
        setIntField(term44509, term44509.getClass(), "exp", 1071776561);
        setByteField(term44509, term44509.getClass(), "nans", (byte) 104);
        setIntField(term44517, term44517.getClass(), "radixDigits", 1846399918);
        setIntElement(term44520, 0, 35388821);
        setIntElement(term44520, 1, -598803400);
        setIntElement(term44520, 2, 25560022);
        setIntElement(term44520, 3, -1090136985);
        setField(term44519, term44519.getClass(), "mant", term44520);
        setByteField(term44519, term44519.getClass(), "sign", (byte) -27);
        setIntField(term44519, term44519.getClass(), "exp", -355574894);
        setByteField(term44519, term44519.getClass(), "nans", (byte) 106);
        setIntField(term44528, term44528.getClass(), "radixDigits", 1866941633);
        setField(term44530, term44530.getClass(), "mant", null);
        setByteField(term44530, term44530.getClass(), "sign", (byte) 28);
        setIntField(term44530, term44530.getClass(), "exp", 1302075623);
        setByteField(term44530, term44530.getClass(), "nans", (byte) -84);
        setField(term44530, term44530.getClass(), "field", null);
        setField(term44528, term44528.getClass(), "zero", term44530);
        setField(term44534, term44534.getClass(), "mant", null);
        setByteField(term44534, term44534.getClass(), "sign", (byte) 0);
        setIntField(term44534, term44534.getClass(), "exp", 0);
        setByteField(term44534, term44534.getClass(), "nans", (byte) 0);
        setField(term44534, term44534.getClass(), "field", null);
        setField(term44528, term44528.getClass(), "one", term44534);
        setField(term44538, term44538.getClass(), "mant", null);
        setByteField(term44538, term44538.getClass(), "sign", (byte) 0);
        setIntField(term44538, term44538.getClass(), "exp", 0);
        setByteField(term44538, term44538.getClass(), "nans", (byte) 0);
        setField(term44538, term44538.getClass(), "field", null);
        setField(term44528, term44528.getClass(), "two", term44538);
        setField(term44542, term44542.getClass(), "mant", null);
        setByteField(term44542, term44542.getClass(), "sign", (byte) 0);
        setIntField(term44542, term44542.getClass(), "exp", 0);
        setByteField(term44542, term44542.getClass(), "nans", (byte) 0);
        setField(term44542, term44542.getClass(), "field", null);
        setField(term44528, term44528.getClass(), "sqr2", term44542);
        setElement(term44546, 0, term44542);
        setField(term44528, term44528.getClass(), "sqr2Split", term44546);
        setField(term44528, term44528.getClass(), "sqr2Reciprocal", term44519);
        setField(term44547, term44547.getClass(), "mant", null);
        setByteField(term44547, term44547.getClass(), "sign", (byte) 0);
        setIntField(term44547, term44547.getClass(), "exp", 0);
        setByteField(term44547, term44547.getClass(), "nans", (byte) 0);
        setField(term44547, term44547.getClass(), "field", null);
        setField(term44528, term44528.getClass(), "sqr3", term44547);
        setField(term44528, term44528.getClass(), "sqr3Reciprocal", term44547);
        setField(term44551, term44551.getClass(), "mant", null);
        setByteField(term44551, term44551.getClass(), "sign", (byte) 0);
        setIntField(term44551, term44551.getClass(), "exp", 0);
        setByteField(term44551, term44551.getClass(), "nans", (byte) 0);
        setField(term44551, term44551.getClass(), "field", null);
        setField(term44528, term44528.getClass(), "pi", term44551);
        setElement(term44555, 0, term44534);
        setElement(term44555, 1, term44530);
        setField(term44528, term44528.getClass(), "piSplit", term44555);
        setField(term44528, term44528.getClass(), "e", term44547);
        setElement(term44556, 1, term44519);
        setField(term44528, term44528.getClass(), "eSplit", term44556);
        setField(term44557, term44557.getClass(), "mant", null);
        setByteField(term44557, term44557.getClass(), "sign", (byte) 0);
        setIntField(term44557, term44557.getClass(), "exp", 0);
        setByteField(term44557, term44557.getClass(), "nans", (byte) 0);
        setField(term44557, term44557.getClass(), "field", null);
        setField(term44528, term44528.getClass(), "ln2", term44557);
        setElement(term44561, 0, term44534);
        setElement(term44561, 1, term44542);
        setElement(term44561, 2, term44519);
        setField(term44528, term44528.getClass(), "ln2Split", term44561);
        setField(term44528, term44528.getClass(), "ln5", term44547);
        setElement(term44562, 0, term44557);
        setElement(term44562, 1, term44551);
        setElement(term44562, 2, term44534);
        setElement(term44562, 3, term44519);
        setElement(term44562, 4, term44542);
        setElement(term44562, 5, term44557);
        setElement(term44562, 6, term44519);
        setElement(term44562, 8, term44551);
        setField(term44528, term44528.getClass(), "ln5Split", term44562);
        setField(term44528, term44528.getClass(), "ln10", term44530);
        setField(term44528, term44528.getClass(), "rMode", enum128);
        setIntField(term44528, term44528.getClass(), "ieeeFlags", -1546528470);
        setField(term44519, term44519.getClass(), "field", term44528);
        setField(term44517, term44517.getClass(), "zero", term44519);
        setField(term44517, term44517.getClass(), "one", term44519);
        setField(term44517, term44517.getClass(), "two", term44551);
        setField(term44517, term44517.getClass(), "sqr2", term44547);
        setElement(term44566, 0, term44509);
        setField(term44517, term44517.getClass(), "sqr2Split", term44566);
        setField(term44517, term44517.getClass(), "sqr2Reciprocal", term44534);
        setField(term44517, term44517.getClass(), "sqr3", term44538);
        setField(term44517, term44517.getClass(), "sqr3Reciprocal", term44542);
        setField(term44517, term44517.getClass(), "pi", term44538);
        setElement(term44567, 0, term44538);
        setElement(term44567, 1, term44551);
        setElement(term44567, 2, term44530);
        setElement(term44567, 3, term44557);
        setField(term44517, term44517.getClass(), "piSplit", term44567);
        setField(term44517, term44517.getClass(), "e", term44547);
        setField(term44569, term44569.getClass(), "mant", null);
        setByteField(term44569, term44569.getClass(), "sign", (byte) 0);
        setIntField(term44569, term44569.getClass(), "exp", 0);
        setByteField(term44569, term44569.getClass(), "nans", (byte) 0);
        setField(term44569, term44569.getClass(), "field", null);
        setElement(term44568, 0, term44569);
        setElement(term44568, 1, term44519);
        setField(term44517, term44517.getClass(), "eSplit", term44568);
        setField(term44517, term44517.getClass(), "ln2", term44538);
        setElement(term44573, 0, term44519);
        setField(term44517, term44517.getClass(), "ln2Split", term44573);
        setField(term44517, term44517.getClass(), "ln5", term44551);
        setElement(term44574, 0, term44542);
        setElement(term44574, 1, term44569);
        setElement(term44574, 2, term44542);
        setElement(term44574, 3, term44547);
        setField(term44517, term44517.getClass(), "ln5Split", term44574);
        setField(term44517, term44517.getClass(), "ln10", term44547);
        setField(term44517, term44517.getClass(), "rMode", enum129);
        setIntField(term44517, term44517.getClass(), "ieeeFlags", -1518971561);
        setField(term44509, term44509.getClass(), "field", term44517);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.dfp.Dfp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "dfp2string", argTypes, term44509, args);
    }

};


