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
import static org.apache.commons.math.dfp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class Dfp_toDouble_75126051960 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46038;

    public Dfp_toDouble_75126051960() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term46122 = Class.forName((String) "org.apache.commons.math.dfp.DfpField$RoundingMode");
        Field term46121 = ((Class) term46122).getDeclaredField((String) "ROUND_FLOOR");
        ((Field) term46121).setAccessible(true);
        Object enum134 = ((Field) term46121).get((Object) null);
        Class<? extends Object> term46407 = Class.forName((String) "org.apache.commons.math.dfp.DfpField$RoundingMode");
        Field term46406 = ((Class) term46407).getDeclaredField((String) "ROUND_FLOOR");
        ((Field) term46406).setAccessible(true);
        Object enum135 = ((Field) term46406).get((Object) null);
        term46038 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        int[] term46039 = (int[]) newIntArray(4);
        Object term46047 = newInstance(Class.forName("org.apache.commons.math.dfp.DfpField"));
        Object term46049 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        int[] term46050 = (int[]) newIntArray(0);
        Object term46054 = newInstance(Class.forName("org.apache.commons.math.dfp.DfpField"));
        Object term46056 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object term46060 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object term46064 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object[] term46068 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 0);
        Object term46069 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object term46073 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object[] term46077 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 5);
        Object[] term46078 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 5);
        Object[] term46079 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 6);
        Object[] term46080 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 8);
        Object term46081 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object term46088 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object[] term46092 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 5);
        Object term46093 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object[] term46097 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 7);
        Object[] term46098 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 2);
        Object[] term46099 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 6);
        Object[] term46100 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 0);
        setIntElement(term46039, 0, 1677171453);
        setIntElement(term46039, 1, -2108979704);
        setIntElement(term46039, 2, 1629835601);
        setIntElement(term46039, 3, 1866184476);
        setField(term46038, term46038.getClass(), "mant", term46039);
        setByteField(term46038, term46038.getClass(), "sign", (byte) 127);
        setIntField(term46038, term46038.getClass(), "exp", -17998574);
        setByteField(term46038, term46038.getClass(), "nans", (byte) 97);
        setIntField(term46047, term46047.getClass(), "radixDigits", 145080354);
        setField(term46049, term46049.getClass(), "mant", term46050);
        setByteField(term46049, term46049.getClass(), "sign", (byte) 117);
        setIntField(term46049, term46049.getClass(), "exp", -2087321012);
        setByteField(term46049, term46049.getClass(), "nans", (byte) -20);
        setIntField(term46054, term46054.getClass(), "radixDigits", -1613074612);
        setField(term46056, term46056.getClass(), "mant", null);
        setByteField(term46056, term46056.getClass(), "sign", (byte) 67);
        setIntField(term46056, term46056.getClass(), "exp", 1226377461);
        setByteField(term46056, term46056.getClass(), "nans", (byte) 51);
        setField(term46056, term46056.getClass(), "field", null);
        setField(term46054, term46054.getClass(), "zero", term46056);
        setField(term46060, term46060.getClass(), "mant", null);
        setByteField(term46060, term46060.getClass(), "sign", (byte) 0);
        setIntField(term46060, term46060.getClass(), "exp", 0);
        setByteField(term46060, term46060.getClass(), "nans", (byte) 0);
        setField(term46060, term46060.getClass(), "field", null);
        setField(term46054, term46054.getClass(), "one", term46060);
        setField(term46054, term46054.getClass(), "two", term46049);
        setField(term46064, term46064.getClass(), "mant", null);
        setByteField(term46064, term46064.getClass(), "sign", (byte) 0);
        setIntField(term46064, term46064.getClass(), "exp", 0);
        setByteField(term46064, term46064.getClass(), "nans", (byte) 0);
        setField(term46064, term46064.getClass(), "field", null);
        setField(term46054, term46054.getClass(), "sqr2", term46064);
        setField(term46054, term46054.getClass(), "sqr2Split", term46068);
        setField(term46054, term46054.getClass(), "sqr2Reciprocal", term46060);
        setField(term46054, term46054.getClass(), "sqr3", term46060);
        setField(term46069, term46069.getClass(), "mant", null);
        setByteField(term46069, term46069.getClass(), "sign", (byte) 0);
        setIntField(term46069, term46069.getClass(), "exp", 0);
        setByteField(term46069, term46069.getClass(), "nans", (byte) 0);
        setField(term46069, term46069.getClass(), "field", null);
        setField(term46054, term46054.getClass(), "sqr3Reciprocal", term46069);
        setField(term46073, term46073.getClass(), "mant", null);
        setByteField(term46073, term46073.getClass(), "sign", (byte) 0);
        setIntField(term46073, term46073.getClass(), "exp", 0);
        setByteField(term46073, term46073.getClass(), "nans", (byte) 0);
        setField(term46073, term46073.getClass(), "field", null);
        setField(term46054, term46054.getClass(), "pi", term46073);
        setElement(term46077, 0, term46049);
        setElement(term46077, 2, term46060);
        setElement(term46077, 4, term46069);
        setField(term46054, term46054.getClass(), "piSplit", term46077);
        setField(term46054, term46054.getClass(), "e", term46049);
        setElement(term46078, 0, term46073);
        setElement(term46078, 1, term46060);
        setElement(term46078, 2, term46049);
        setElement(term46078, 3, term46064);
        setField(term46054, term46054.getClass(), "eSplit", term46078);
        setField(term46054, term46054.getClass(), "ln2", term46056);
        setElement(term46079, 0, term46049);
        setElement(term46079, 3, term46038);
        setElement(term46079, 4, term46069);
        setField(term46054, term46054.getClass(), "ln2Split", term46079);
        setField(term46054, term46054.getClass(), "ln5", term46073);
        setElement(term46080, 3, term46056);
        setElement(term46080, 4, term46060);
        setElement(term46080, 6, term46064);
        setElement(term46080, 7, term46049);
        setField(term46054, term46054.getClass(), "ln5Split", term46080);
        setField(term46081, term46081.getClass(), "mant", null);
        setByteField(term46081, term46081.getClass(), "sign", (byte) 0);
        setIntField(term46081, term46081.getClass(), "exp", 0);
        setByteField(term46081, term46081.getClass(), "nans", (byte) 0);
        setField(term46081, term46081.getClass(), "field", null);
        setField(term46054, term46054.getClass(), "ln10", term46081);
        setField(term46054, term46054.getClass(), "rMode", enum134);
        setIntField(term46054, term46054.getClass(), "ieeeFlags", -334716487);
        setField(term46049, term46049.getClass(), "field", term46054);
        setField(term46047, term46047.getClass(), "zero", term46049);
        setField(term46047, term46047.getClass(), "one", term46049);
        setField(term46088, term46088.getClass(), "mant", null);
        setByteField(term46088, term46088.getClass(), "sign", (byte) 0);
        setIntField(term46088, term46088.getClass(), "exp", 0);
        setByteField(term46088, term46088.getClass(), "nans", (byte) 0);
        setField(term46088, term46088.getClass(), "field", null);
        setField(term46047, term46047.getClass(), "two", term46088);
        setField(term46047, term46047.getClass(), "sqr2", term46073);
        setElement(term46092, 0, term46064);
        setElement(term46092, 1, term46073);
        setField(term46093, term46093.getClass(), "mant", null);
        setByteField(term46093, term46093.getClass(), "sign", (byte) 0);
        setIntField(term46093, term46093.getClass(), "exp", 0);
        setByteField(term46093, term46093.getClass(), "nans", (byte) 0);
        setField(term46093, term46093.getClass(), "field", null);
        setElement(term46092, 2, term46093);
        setElement(term46092, 3, term46093);
        setElement(term46092, 4, term46069);
        setField(term46047, term46047.getClass(), "sqr2Split", term46092);
        setField(term46047, term46047.getClass(), "sqr2Reciprocal", term46038);
        setField(term46047, term46047.getClass(), "sqr3", term46038);
        setField(term46047, term46047.getClass(), "sqr3Reciprocal", term46056);
        setField(term46047, term46047.getClass(), "pi", term46049);
        setElement(term46097, 0, term46093);
        setElement(term46097, 1, term46049);
        setElement(term46097, 2, term46060);
        setElement(term46097, 3, term46069);
        setElement(term46097, 4, term46060);
        setElement(term46097, 5, term46064);
        setElement(term46097, 6, term46069);
        setField(term46047, term46047.getClass(), "piSplit", term46097);
        setField(term46047, term46047.getClass(), "e", term46088);
        setElement(term46098, 0, term46064);
        setElement(term46098, 1, term46088);
        setField(term46047, term46047.getClass(), "eSplit", term46098);
        setField(term46047, term46047.getClass(), "ln2", term46073);
        setElement(term46099, 0, term46088);
        setElement(term46099, 1, term46064);
        setElement(term46099, 2, term46056);
        setElement(term46099, 3, term46081);
        setElement(term46099, 4, term46093);
        setElement(term46099, 5, term46049);
        setField(term46047, term46047.getClass(), "ln2Split", term46099);
        setField(term46047, term46047.getClass(), "ln5", term46073);
        setField(term46047, term46047.getClass(), "ln5Split", term46100);
        setField(term46047, term46047.getClass(), "ln10", term46093);
        setField(term46047, term46047.getClass(), "rMode", enum135);
        setIntField(term46047, term46047.getClass(), "ieeeFlags", -1739012814);
        setField(term46038, term46038.getClass(), "field", term46047);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.dfp.Dfp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toDouble", argTypes, term46038, args);
    }

};


