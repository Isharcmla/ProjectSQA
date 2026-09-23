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
import java.lang.Long;

public class Dfp_newInstance_117797220281 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6476;
     Object term6557;

    public Dfp_newInstance_117797220281() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term87873 = Class.forName((String) "org.apache.commons.math3.dfp.DfpField$RoundingMode");
        Field term87872 = ((Class) term87873).getDeclaredField((String) "ROUND_FLOOR");
        ((Field) term87872).setAccessible(true);
        Object enum186 = ((Field) term87872).get((Object) null);
        Class<? extends Object> term88163 = Class.forName((String) "org.apache.commons.math3.dfp.DfpField$RoundingMode");
        Field term88162 = ((Class) term88163).getDeclaredField((String) "ROUND_CEIL");
        ((Field) term88162).setAccessible(true);
        Object enum187 = ((Field) term88162).get((Object) null);
        term6476 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        int[] term6477 = (int[]) newIntArray(2);
        Object term6483 = newInstance(Class.forName("org.apache.commons.math3.dfp.DfpField"));
        Object term6485 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        int[] term6486 = (int[]) newIntArray(5);
        Object term6495 = newInstance(Class.forName("org.apache.commons.math3.dfp.DfpField"));
        Object term6497 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object term6501 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object term6505 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object[] term6509 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 3);
        Object term6510 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object term6514 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object[] term6518 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 6);
        Object[] term6519 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 7);
        Object term6520 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object[] term6524 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 0);
        Object[] term6525 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 0);
        Object term6529 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object[] term6533 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 9);
        Object term6534 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object[] term6538 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 4);
        Object[] term6539 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 9);
        Object[] term6540 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 0);
        Object[] term6541 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 8);
        setIntElement(term6477, 0, 474518942);
        setIntElement(term6477, 1, -1656687479);
        setField(term6476, term6476.getClass(), "mant", term6477);
        setByteField(term6476, term6476.getClass(), "sign", (byte) -95);
        setIntField(term6476, term6476.getClass(), "exp", -249614216);
        setByteField(term6476, term6476.getClass(), "nans", (byte) -2);
        setIntField(term6483, term6483.getClass(), "radixDigits", 1870727665);
        setIntElement(term6486, 0, -519881101);
        setIntElement(term6486, 1, -680920524);
        setIntElement(term6486, 2, -916335264);
        setIntElement(term6486, 3, -919416536);
        setIntElement(term6486, 4, -43417861);
        setField(term6485, term6485.getClass(), "mant", term6486);
        setByteField(term6485, term6485.getClass(), "sign", (byte) 84);
        setIntField(term6485, term6485.getClass(), "exp", -1533843432);
        setByteField(term6485, term6485.getClass(), "nans", (byte) 85);
        setIntField(term6495, term6495.getClass(), "radixDigits", -123338791);
        setField(term6497, term6497.getClass(), "mant", null);
        setByteField(term6497, term6497.getClass(), "sign", (byte) -83);
        setIntField(term6497, term6497.getClass(), "exp", 413548937);
        setByteField(term6497, term6497.getClass(), "nans", (byte) 48);
        setField(term6497, term6497.getClass(), "field", null);
        setField(term6495, term6495.getClass(), "zero", term6497);
        setField(term6501, term6501.getClass(), "mant", null);
        setByteField(term6501, term6501.getClass(), "sign", (byte) 0);
        setIntField(term6501, term6501.getClass(), "exp", 0);
        setByteField(term6501, term6501.getClass(), "nans", (byte) 0);
        setField(term6501, term6501.getClass(), "field", null);
        setField(term6495, term6495.getClass(), "one", term6501);
        setField(term6495, term6495.getClass(), "two", term6485);
        setField(term6505, term6505.getClass(), "mant", null);
        setByteField(term6505, term6505.getClass(), "sign", (byte) 0);
        setIntField(term6505, term6505.getClass(), "exp", 0);
        setByteField(term6505, term6505.getClass(), "nans", (byte) 0);
        setField(term6505, term6505.getClass(), "field", null);
        setField(term6495, term6495.getClass(), "sqr2", term6505);
        setElement(term6509, 0, term6501);
        setElement(term6509, 1, term6501);
        setField(term6495, term6495.getClass(), "sqr2Split", term6509);
        setField(term6510, term6510.getClass(), "mant", null);
        setByteField(term6510, term6510.getClass(), "sign", (byte) 0);
        setIntField(term6510, term6510.getClass(), "exp", 0);
        setByteField(term6510, term6510.getClass(), "nans", (byte) 0);
        setField(term6510, term6510.getClass(), "field", null);
        setField(term6495, term6495.getClass(), "sqr2Reciprocal", term6510);
        setField(term6495, term6495.getClass(), "sqr3", term6485);
        setField(term6514, term6514.getClass(), "mant", null);
        setByteField(term6514, term6514.getClass(), "sign", (byte) 0);
        setIntField(term6514, term6514.getClass(), "exp", 0);
        setByteField(term6514, term6514.getClass(), "nans", (byte) 0);
        setField(term6514, term6514.getClass(), "field", null);
        setField(term6495, term6495.getClass(), "sqr3Reciprocal", term6514);
        setField(term6495, term6495.getClass(), "pi", term6501);
        setElement(term6518, 2, term6485);
        setElement(term6518, 3, term6510);
        setElement(term6518, 4, term6501);
        setElement(term6518, 5, term6485);
        setField(term6495, term6495.getClass(), "piSplit", term6518);
        setField(term6495, term6495.getClass(), "e", term6505);
        setElement(term6519, 1, term6497);
        setElement(term6519, 2, term6485);
        setElement(term6519, 4, term6514);
        setElement(term6519, 5, term6476);
        setField(term6495, term6495.getClass(), "eSplit", term6519);
        setField(term6520, term6520.getClass(), "mant", null);
        setByteField(term6520, term6520.getClass(), "sign", (byte) 0);
        setIntField(term6520, term6520.getClass(), "exp", 0);
        setByteField(term6520, term6520.getClass(), "nans", (byte) 0);
        setField(term6520, term6520.getClass(), "field", null);
        setField(term6495, term6495.getClass(), "ln2", term6520);
        setField(term6495, term6495.getClass(), "ln2Split", term6524);
        setField(term6495, term6495.getClass(), "ln5", term6510);
        setField(term6495, term6495.getClass(), "ln5Split", term6525);
        setField(term6495, term6495.getClass(), "ln10", term6520);
        setField(term6495, term6495.getClass(), "rMode", enum186);
        setIntField(term6495, term6495.getClass(), "ieeeFlags", -1070592289);
        setField(term6485, term6485.getClass(), "field", term6495);
        setField(term6483, term6483.getClass(), "zero", term6485);
        setField(term6483, term6483.getClass(), "one", term6520);
        setField(term6529, term6529.getClass(), "mant", null);
        setByteField(term6529, term6529.getClass(), "sign", (byte) 0);
        setIntField(term6529, term6529.getClass(), "exp", 0);
        setByteField(term6529, term6529.getClass(), "nans", (byte) 0);
        setField(term6529, term6529.getClass(), "field", null);
        setField(term6483, term6483.getClass(), "two", term6529);
        setField(term6483, term6483.getClass(), "sqr2", term6497);
        setElement(term6533, 0, term6501);
        setElement(term6533, 1, term6514);
        setElement(term6533, 2, term6505);
        setElement(term6533, 3, term6485);
        setElement(term6533, 4, term6520);
        setElement(term6533, 5, term6485);
        setElement(term6533, 6, term6529);
        setElement(term6533, 7, term6510);
        setElement(term6533, 8, term6505);
        setField(term6483, term6483.getClass(), "sqr2Split", term6533);
        setField(term6483, term6483.getClass(), "sqr2Reciprocal", term6510);
        setField(term6483, term6483.getClass(), "sqr3", term6514);
        setField(term6483, term6483.getClass(), "sqr3Reciprocal", term6514);
        setField(term6534, term6534.getClass(), "mant", null);
        setByteField(term6534, term6534.getClass(), "sign", (byte) 0);
        setIntField(term6534, term6534.getClass(), "exp", 0);
        setByteField(term6534, term6534.getClass(), "nans", (byte) 0);
        setField(term6534, term6534.getClass(), "field", null);
        setField(term6483, term6483.getClass(), "pi", term6534);
        setElement(term6538, 0, term6476);
        setElement(term6538, 1, term6476);
        setElement(term6538, 2, term6497);
        setElement(term6538, 3, term6485);
        setField(term6483, term6483.getClass(), "piSplit", term6538);
        setField(term6483, term6483.getClass(), "e", term6514);
        setElement(term6539, 0, term6485);
        setElement(term6539, 1, term6501);
        setElement(term6539, 2, term6534);
        setElement(term6539, 3, term6501);
        setElement(term6539, 4, term6505);
        setElement(term6539, 5, term6534);
        setElement(term6539, 6, term6529);
        setElement(term6539, 7, term6505);
        setElement(term6539, 8, term6529);
        setField(term6483, term6483.getClass(), "eSplit", term6539);
        setField(term6483, term6483.getClass(), "ln2", term6510);
        setField(term6483, term6483.getClass(), "ln2Split", term6540);
        setField(term6483, term6483.getClass(), "ln5", term6529);
        setElement(term6541, 0, term6505);
        setElement(term6541, 1, term6497);
        setElement(term6541, 2, term6520);
        setElement(term6541, 3, term6514);
        setElement(term6541, 4, term6485);
        setElement(term6541, 5, term6510);
        setElement(term6541, 6, term6514);
        setElement(term6541, 7, term6497);
        setField(term6483, term6483.getClass(), "ln5Split", term6541);
        setField(term6483, term6483.getClass(), "ln10", term6510);
        setField(term6483, term6483.getClass(), "rMode", enum187);
        setIntField(term6483, term6483.getClass(), "ieeeFlags", -1464172784);
        setField(term6476, term6476.getClass(), "field", term6483);
        term6557 = new Long(6375119433582206027L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.dfp.Dfp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term6557;
        try {
            callMethod(klass, "newInstance", argTypes, term6476, args);
            assertTrue(false);
        }
        catch (OutOfMemoryError e) {
        }

    }

};


