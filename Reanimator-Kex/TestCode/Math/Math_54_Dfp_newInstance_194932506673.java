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
import java.lang.Long;

public class Dfp_newInstance_194932506673 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6386;
     Object term6467;

    public Dfp_newInstance_194932506673() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term82374 = Class.forName((String) "org.apache.commons.math.dfp.DfpField$RoundingMode");
        Field term82373 = ((Class) term82374).getDeclaredField((String) "ROUND_HALF_UP");
        ((Field) term82373).setAccessible(true);
        Object enum173 = ((Field) term82373).get((Object) null);
        Class<? extends Object> term82665 = Class.forName((String) "org.apache.commons.math.dfp.DfpField$RoundingMode");
        Field term82664 = ((Class) term82665).getDeclaredField((String) "ROUND_CEIL");
        ((Field) term82664).setAccessible(true);
        Object enum174 = ((Field) term82664).get((Object) null);
        term6386 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        int[] term6387 = (int[]) newIntArray(2);
        Object term6393 = newInstance(Class.forName("org.apache.commons.math.dfp.DfpField"));
        Object term6395 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        int[] term6396 = (int[]) newIntArray(5);
        Object term6405 = newInstance(Class.forName("org.apache.commons.math.dfp.DfpField"));
        Object term6407 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object term6411 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object term6415 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object[] term6419 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 3);
        Object term6420 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object term6424 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object[] term6428 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 6);
        Object[] term6429 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 7);
        Object term6430 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object[] term6434 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 0);
        Object[] term6435 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 0);
        Object term6439 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object[] term6443 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 9);
        Object term6444 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object[] term6448 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 4);
        Object[] term6449 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 9);
        Object[] term6450 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 0);
        Object[] term6451 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 8);
        setIntElement(term6387, 0, 474518942);
        setIntElement(term6387, 1, -1656687479);
        setField(term6386, term6386.getClass(), "mant", term6387);
        setByteField(term6386, term6386.getClass(), "sign", (byte) -95);
        setIntField(term6386, term6386.getClass(), "exp", -249614216);
        setByteField(term6386, term6386.getClass(), "nans", (byte) -2);
        setIntField(term6393, term6393.getClass(), "radixDigits", 1870727665);
        setIntElement(term6396, 0, -519881101);
        setIntElement(term6396, 1, -680920524);
        setIntElement(term6396, 2, -916335264);
        setIntElement(term6396, 3, -919416536);
        setIntElement(term6396, 4, -43417861);
        setField(term6395, term6395.getClass(), "mant", term6396);
        setByteField(term6395, term6395.getClass(), "sign", (byte) 84);
        setIntField(term6395, term6395.getClass(), "exp", -1533843432);
        setByteField(term6395, term6395.getClass(), "nans", (byte) 85);
        setIntField(term6405, term6405.getClass(), "radixDigits", -123338791);
        setField(term6407, term6407.getClass(), "mant", null);
        setByteField(term6407, term6407.getClass(), "sign", (byte) -83);
        setIntField(term6407, term6407.getClass(), "exp", 413548937);
        setByteField(term6407, term6407.getClass(), "nans", (byte) 48);
        setField(term6407, term6407.getClass(), "field", null);
        setField(term6405, term6405.getClass(), "zero", term6407);
        setField(term6411, term6411.getClass(), "mant", null);
        setByteField(term6411, term6411.getClass(), "sign", (byte) 0);
        setIntField(term6411, term6411.getClass(), "exp", 0);
        setByteField(term6411, term6411.getClass(), "nans", (byte) 0);
        setField(term6411, term6411.getClass(), "field", null);
        setField(term6405, term6405.getClass(), "one", term6411);
        setField(term6405, term6405.getClass(), "two", term6395);
        setField(term6415, term6415.getClass(), "mant", null);
        setByteField(term6415, term6415.getClass(), "sign", (byte) 0);
        setIntField(term6415, term6415.getClass(), "exp", 0);
        setByteField(term6415, term6415.getClass(), "nans", (byte) 0);
        setField(term6415, term6415.getClass(), "field", null);
        setField(term6405, term6405.getClass(), "sqr2", term6415);
        setElement(term6419, 0, term6411);
        setElement(term6419, 1, term6411);
        setField(term6405, term6405.getClass(), "sqr2Split", term6419);
        setField(term6420, term6420.getClass(), "mant", null);
        setByteField(term6420, term6420.getClass(), "sign", (byte) 0);
        setIntField(term6420, term6420.getClass(), "exp", 0);
        setByteField(term6420, term6420.getClass(), "nans", (byte) 0);
        setField(term6420, term6420.getClass(), "field", null);
        setField(term6405, term6405.getClass(), "sqr2Reciprocal", term6420);
        setField(term6405, term6405.getClass(), "sqr3", term6395);
        setField(term6424, term6424.getClass(), "mant", null);
        setByteField(term6424, term6424.getClass(), "sign", (byte) 0);
        setIntField(term6424, term6424.getClass(), "exp", 0);
        setByteField(term6424, term6424.getClass(), "nans", (byte) 0);
        setField(term6424, term6424.getClass(), "field", null);
        setField(term6405, term6405.getClass(), "sqr3Reciprocal", term6424);
        setField(term6405, term6405.getClass(), "pi", term6411);
        setElement(term6428, 2, term6395);
        setElement(term6428, 3, term6420);
        setElement(term6428, 4, term6411);
        setElement(term6428, 5, term6395);
        setField(term6405, term6405.getClass(), "piSplit", term6428);
        setField(term6405, term6405.getClass(), "e", term6415);
        setElement(term6429, 1, term6407);
        setElement(term6429, 2, term6395);
        setElement(term6429, 4, term6424);
        setElement(term6429, 5, term6386);
        setField(term6405, term6405.getClass(), "eSplit", term6429);
        setField(term6430, term6430.getClass(), "mant", null);
        setByteField(term6430, term6430.getClass(), "sign", (byte) 0);
        setIntField(term6430, term6430.getClass(), "exp", 0);
        setByteField(term6430, term6430.getClass(), "nans", (byte) 0);
        setField(term6430, term6430.getClass(), "field", null);
        setField(term6405, term6405.getClass(), "ln2", term6430);
        setField(term6405, term6405.getClass(), "ln2Split", term6434);
        setField(term6405, term6405.getClass(), "ln5", term6420);
        setField(term6405, term6405.getClass(), "ln5Split", term6435);
        setField(term6405, term6405.getClass(), "ln10", term6430);
        setField(term6405, term6405.getClass(), "rMode", enum173);
        setIntField(term6405, term6405.getClass(), "ieeeFlags", -1070592289);
        setField(term6395, term6395.getClass(), "field", term6405);
        setField(term6393, term6393.getClass(), "zero", term6395);
        setField(term6393, term6393.getClass(), "one", term6430);
        setField(term6439, term6439.getClass(), "mant", null);
        setByteField(term6439, term6439.getClass(), "sign", (byte) 0);
        setIntField(term6439, term6439.getClass(), "exp", 0);
        setByteField(term6439, term6439.getClass(), "nans", (byte) 0);
        setField(term6439, term6439.getClass(), "field", null);
        setField(term6393, term6393.getClass(), "two", term6439);
        setField(term6393, term6393.getClass(), "sqr2", term6407);
        setElement(term6443, 0, term6411);
        setElement(term6443, 1, term6424);
        setElement(term6443, 2, term6415);
        setElement(term6443, 3, term6395);
        setElement(term6443, 4, term6430);
        setElement(term6443, 5, term6395);
        setElement(term6443, 6, term6439);
        setElement(term6443, 7, term6420);
        setElement(term6443, 8, term6415);
        setField(term6393, term6393.getClass(), "sqr2Split", term6443);
        setField(term6393, term6393.getClass(), "sqr2Reciprocal", term6420);
        setField(term6393, term6393.getClass(), "sqr3", term6424);
        setField(term6393, term6393.getClass(), "sqr3Reciprocal", term6424);
        setField(term6444, term6444.getClass(), "mant", null);
        setByteField(term6444, term6444.getClass(), "sign", (byte) 0);
        setIntField(term6444, term6444.getClass(), "exp", 0);
        setByteField(term6444, term6444.getClass(), "nans", (byte) 0);
        setField(term6444, term6444.getClass(), "field", null);
        setField(term6393, term6393.getClass(), "pi", term6444);
        setElement(term6448, 0, term6386);
        setElement(term6448, 1, term6386);
        setElement(term6448, 2, term6407);
        setElement(term6448, 3, term6395);
        setField(term6393, term6393.getClass(), "piSplit", term6448);
        setField(term6393, term6393.getClass(), "e", term6424);
        setElement(term6449, 0, term6395);
        setElement(term6449, 1, term6411);
        setElement(term6449, 2, term6444);
        setElement(term6449, 3, term6411);
        setElement(term6449, 4, term6415);
        setElement(term6449, 5, term6444);
        setElement(term6449, 6, term6439);
        setElement(term6449, 7, term6415);
        setElement(term6449, 8, term6439);
        setField(term6393, term6393.getClass(), "eSplit", term6449);
        setField(term6393, term6393.getClass(), "ln2", term6420);
        setField(term6393, term6393.getClass(), "ln2Split", term6450);
        setField(term6393, term6393.getClass(), "ln5", term6439);
        setElement(term6451, 0, term6415);
        setElement(term6451, 1, term6407);
        setElement(term6451, 2, term6430);
        setElement(term6451, 3, term6424);
        setElement(term6451, 4, term6395);
        setElement(term6451, 5, term6420);
        setElement(term6451, 6, term6424);
        setElement(term6451, 7, term6407);
        setField(term6393, term6393.getClass(), "ln5Split", term6451);
        setField(term6393, term6393.getClass(), "ln10", term6420);
        setField(term6393, term6393.getClass(), "rMode", enum174);
        setIntField(term6393, term6393.getClass(), "ieeeFlags", -1464172784);
        setField(term6386, term6386.getClass(), "field", term6393);
        term6467 = new Long(6375119433582206027L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.dfp.Dfp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term6467;
        try {
            callMethod(klass, "newInstance", argTypes, term6386, args);
            assertTrue(false);
        }
        catch (OutOfMemoryError e) {
        }

    }

};


