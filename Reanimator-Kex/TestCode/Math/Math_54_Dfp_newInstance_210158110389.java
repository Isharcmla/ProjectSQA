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
import java.lang.NegativeArraySizeException;
import static org.apache.commons.math.dfp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class Dfp_newInstance_210158110389 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9053;

    public Dfp_newInstance_210158110389() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term536516 = Class.forName((String) "org.apache.commons.math.dfp.DfpField$RoundingMode");
        Field term536515 = ((Class) term536516).getDeclaredField((String) "ROUND_HALF_ODD");
        ((Field) term536515).setAccessible(true);
        Object enum184 = ((Field) term536515).get((Object) null);
        Class<? extends Object> term536810 = Class.forName((String) "org.apache.commons.math.dfp.DfpField$RoundingMode");
        Field term536809 = ((Class) term536810).getDeclaredField((String) "ROUND_CEIL");
        ((Field) term536809).setAccessible(true);
        Object enum185 = ((Field) term536809).get((Object) null);
        term9053 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        int[] term9054 = (int[]) newIntArray(4);
        Object term9062 = newInstance(Class.forName("org.apache.commons.math.dfp.DfpField"));
        Object term9064 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        int[] term9065 = (int[]) newIntArray(5);
        Object term9074 = newInstance(Class.forName("org.apache.commons.math.dfp.DfpField"));
        Object term9076 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object term9080 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object term9084 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object[] term9088 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 0);
        Object term9089 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object term9093 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object[] term9097 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 7);
        Object term9098 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object[] term9102 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 2);
        Object[] term9103 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 8);
        Object[] term9104 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 2);
        Object term9105 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object term9112 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object[] term9116 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 4);
        Object[] term9117 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 4);
        Object[] term9118 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 3);
        Object[] term9119 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 4);
        Object[] term9120 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 5);
        setIntElement(term9054, 0, -350454594);
        setIntElement(term9054, 1, -1148142995);
        setIntElement(term9054, 2, -233024044);
        setIntElement(term9054, 3, 1820784228);
        setField(term9053, term9053.getClass(), "mant", term9054);
        setByteField(term9053, term9053.getClass(), "sign", (byte) 117);
        setIntField(term9053, term9053.getClass(), "exp", 1390820006);
        setByteField(term9053, term9053.getClass(), "nans", (byte) 43);
        setIntField(term9062, term9062.getClass(), "radixDigits", -828982065);
        setIntElement(term9065, 0, 1221443226);
        setIntElement(term9065, 1, 908108726);
        setIntElement(term9065, 2, 1023209512);
        setIntElement(term9065, 3, 1084849225);
        setIntElement(term9065, 4, -1702055571);
        setField(term9064, term9064.getClass(), "mant", term9065);
        setByteField(term9064, term9064.getClass(), "sign", (byte) 34);
        setIntField(term9064, term9064.getClass(), "exp", -944542900);
        setByteField(term9064, term9064.getClass(), "nans", (byte) -126);
        setIntField(term9074, term9074.getClass(), "radixDigits", 2063762142);
        setField(term9076, term9076.getClass(), "mant", null);
        setByteField(term9076, term9076.getClass(), "sign", (byte) -75);
        setIntField(term9076, term9076.getClass(), "exp", 808203320);
        setByteField(term9076, term9076.getClass(), "nans", (byte) 69);
        setField(term9076, term9076.getClass(), "field", null);
        setField(term9074, term9074.getClass(), "zero", term9076);
        setField(term9074, term9074.getClass(), "one", term9076);
        setField(term9080, term9080.getClass(), "mant", null);
        setByteField(term9080, term9080.getClass(), "sign", (byte) 0);
        setIntField(term9080, term9080.getClass(), "exp", 0);
        setByteField(term9080, term9080.getClass(), "nans", (byte) 0);
        setField(term9080, term9080.getClass(), "field", null);
        setField(term9074, term9074.getClass(), "two", term9080);
        setField(term9084, term9084.getClass(), "mant", null);
        setByteField(term9084, term9084.getClass(), "sign", (byte) 0);
        setIntField(term9084, term9084.getClass(), "exp", 0);
        setByteField(term9084, term9084.getClass(), "nans", (byte) 0);
        setField(term9084, term9084.getClass(), "field", null);
        setField(term9074, term9074.getClass(), "sqr2", term9084);
        setField(term9074, term9074.getClass(), "sqr2Split", term9088);
        setField(term9089, term9089.getClass(), "mant", null);
        setByteField(term9089, term9089.getClass(), "sign", (byte) 0);
        setIntField(term9089, term9089.getClass(), "exp", 0);
        setByteField(term9089, term9089.getClass(), "nans", (byte) 0);
        setField(term9089, term9089.getClass(), "field", null);
        setField(term9074, term9074.getClass(), "sqr2Reciprocal", term9089);
        setField(term9074, term9074.getClass(), "sqr3", term9089);
        setField(term9093, term9093.getClass(), "mant", null);
        setByteField(term9093, term9093.getClass(), "sign", (byte) 0);
        setIntField(term9093, term9093.getClass(), "exp", 0);
        setByteField(term9093, term9093.getClass(), "nans", (byte) 0);
        setField(term9093, term9093.getClass(), "field", null);
        setField(term9074, term9074.getClass(), "sqr3Reciprocal", term9093);
        setField(term9074, term9074.getClass(), "pi", term9080);
        setElement(term9097, 0, term9080);
        setElement(term9097, 1, term9064);
        setElement(term9097, 5, term9089);
        setElement(term9097, 6, term9076);
        setField(term9074, term9074.getClass(), "piSplit", term9097);
        setField(term9098, term9098.getClass(), "mant", null);
        setByteField(term9098, term9098.getClass(), "sign", (byte) 0);
        setIntField(term9098, term9098.getClass(), "exp", 0);
        setByteField(term9098, term9098.getClass(), "nans", (byte) 0);
        setField(term9098, term9098.getClass(), "field", null);
        setField(term9074, term9074.getClass(), "e", term9098);
        setElement(term9102, 1, term9064);
        setField(term9074, term9074.getClass(), "eSplit", term9102);
        setField(term9074, term9074.getClass(), "ln2", term9084);
        setElement(term9103, 2, term9089);
        setElement(term9103, 3, term9080);
        setElement(term9103, 4, term9064);
        setElement(term9103, 5, term9098);
        setField(term9074, term9074.getClass(), "ln2Split", term9103);
        setField(term9074, term9074.getClass(), "ln5", term9089);
        setElement(term9104, 0, term9064);
        setElement(term9104, 1, term9080);
        setField(term9074, term9074.getClass(), "ln5Split", term9104);
        setField(term9105, term9105.getClass(), "mant", null);
        setByteField(term9105, term9105.getClass(), "sign", (byte) 0);
        setIntField(term9105, term9105.getClass(), "exp", 0);
        setByteField(term9105, term9105.getClass(), "nans", (byte) 0);
        setField(term9105, term9105.getClass(), "field", null);
        setField(term9074, term9074.getClass(), "ln10", term9105);
        setField(term9074, term9074.getClass(), "rMode", enum184);
        setIntField(term9074, term9074.getClass(), "ieeeFlags", -439048495);
        setField(term9064, term9064.getClass(), "field", term9074);
        setField(term9062, term9062.getClass(), "zero", term9064);
        setField(term9062, term9062.getClass(), "one", term9064);
        setField(term9062, term9062.getClass(), "two", term9084);
        setField(term9112, term9112.getClass(), "mant", null);
        setByteField(term9112, term9112.getClass(), "sign", (byte) 0);
        setIntField(term9112, term9112.getClass(), "exp", 0);
        setByteField(term9112, term9112.getClass(), "nans", (byte) 0);
        setField(term9112, term9112.getClass(), "field", null);
        setField(term9062, term9062.getClass(), "sqr2", term9112);
        setElement(term9116, 0, term9076);
        setElement(term9116, 1, term9064);
        setElement(term9116, 2, term9112);
        setElement(term9116, 3, term9098);
        setField(term9062, term9062.getClass(), "sqr2Split", term9116);
        setField(term9062, term9062.getClass(), "sqr2Reciprocal", term9053);
        setField(term9062, term9062.getClass(), "sqr3", term9089);
        setField(term9062, term9062.getClass(), "sqr3Reciprocal", term9093);
        setField(term9062, term9062.getClass(), "pi", term9080);
        setElement(term9117, 0, term9093);
        setElement(term9117, 1, term9093);
        setElement(term9117, 2, term9112);
        setElement(term9117, 3, term9076);
        setField(term9062, term9062.getClass(), "piSplit", term9117);
        setField(term9062, term9062.getClass(), "e", term9105);
        setElement(term9118, 0, term9098);
        setElement(term9118, 1, term9084);
        setElement(term9118, 2, term9064);
        setField(term9062, term9062.getClass(), "eSplit", term9118);
        setField(term9062, term9062.getClass(), "ln2", term9093);
        setElement(term9119, 0, term9064);
        setElement(term9119, 1, term9112);
        setElement(term9119, 2, term9080);
        setElement(term9119, 3, term9084);
        setField(term9062, term9062.getClass(), "ln2Split", term9119);
        setField(term9062, term9062.getClass(), "ln5", term9080);
        setElement(term9120, 0, term9098);
        setElement(term9120, 1, term9098);
        setElement(term9120, 2, term9089);
        setElement(term9120, 3, term9053);
        setElement(term9120, 4, term9053);
        setField(term9062, term9062.getClass(), "ln5Split", term9120);
        setField(term9062, term9062.getClass(), "ln10", term9076);
        setField(term9062, term9062.getClass(), "rMode", enum185);
        setIntField(term9062, term9062.getClass(), "ieeeFlags", -1849105286);
        setField(term9053, term9053.getClass(), "field", term9062);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.dfp.Dfp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "NRdvgJlhkX";
        try {
            callMethod(klass, "newInstance", argTypes, term9053, args);
            assertTrue(false);
        }
        catch (NegativeArraySizeException e) {
        }

    }

};


