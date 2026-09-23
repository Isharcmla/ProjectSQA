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
import java.lang.Integer;

public class Dfp_newInstance_117797319480 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5787;
     Object term5875;

    public Dfp_newInstance_117797319480() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term86370 = Class.forName((String) "org.apache.commons.math3.dfp.DfpField$RoundingMode");
        Field term86369 = ((Class) term86370).getDeclaredField((String) "ROUND_HALF_EVEN");
        ((Field) term86369).setAccessible(true);
        Object enum182 = ((Field) term86369).get((Object) null);
        Class<? extends Object> term86672 = Class.forName((String) "org.apache.commons.math3.dfp.DfpField$RoundingMode");
        Field term86671 = ((Class) term86672).getDeclaredField((String) "ROUND_UP");
        ((Field) term86671).setAccessible(true);
        Object enum183 = ((Field) term86671).get((Object) null);
        term5787 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        int[] term5788 = (int[]) newIntArray(9);
        Object term5801 = newInstance(Class.forName("org.apache.commons.math3.dfp.DfpField"));
        Object term5803 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        int[] term5804 = (int[]) newIntArray(7);
        Object term5815 = newInstance(Class.forName("org.apache.commons.math3.dfp.DfpField"));
        Object term5817 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object term5821 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object term5825 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object[] term5829 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 2);
        Object term5830 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object term5834 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object[] term5838 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 8);
        Object[] term5839 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 8);
        Object term5840 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object[] term5844 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 5);
        Object[] term5845 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 8);
        Object[] term5849 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 9);
        Object term5850 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object term5854 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object[] term5858 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 7);
        Object[] term5859 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 6);
        Object[] term5860 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 5);
        Object[] term5861 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 2);
        setIntElement(term5788, 0, 1507074215);
        setIntElement(term5788, 1, -282881827);
        setIntElement(term5788, 2, -1183353915);
        setIntElement(term5788, 3, -420030135);
        setIntElement(term5788, 4, 267763294);
        setIntElement(term5788, 5, -1497710478);
        setIntElement(term5788, 6, 49950830);
        setIntElement(term5788, 7, -525257914);
        setIntElement(term5788, 8, 147209682);
        setField(term5787, term5787.getClass(), "mant", term5788);
        setByteField(term5787, term5787.getClass(), "sign", (byte) -74);
        setIntField(term5787, term5787.getClass(), "exp", 34470066);
        setByteField(term5787, term5787.getClass(), "nans", (byte) -84);
        setIntField(term5801, term5801.getClass(), "radixDigits", 2058711405);
        setIntElement(term5804, 0, 1743683601);
        setIntElement(term5804, 1, -945116798);
        setIntElement(term5804, 2, 1593461795);
        setIntElement(term5804, 3, 515182546);
        setIntElement(term5804, 4, -936895502);
        setIntElement(term5804, 5, -129547140);
        setIntElement(term5804, 6, 199287428);
        setField(term5803, term5803.getClass(), "mant", term5804);
        setByteField(term5803, term5803.getClass(), "sign", (byte) -93);
        setIntField(term5803, term5803.getClass(), "exp", -1195339592);
        setByteField(term5803, term5803.getClass(), "nans", (byte) 82);
        setIntField(term5815, term5815.getClass(), "radixDigits", -376422566);
        setField(term5817, term5817.getClass(), "mant", null);
        setByteField(term5817, term5817.getClass(), "sign", (byte) 24);
        setIntField(term5817, term5817.getClass(), "exp", 306847454);
        setByteField(term5817, term5817.getClass(), "nans", (byte) 123);
        setField(term5817, term5817.getClass(), "field", null);
        setField(term5815, term5815.getClass(), "zero", term5817);
        setField(term5815, term5815.getClass(), "one", term5817);
        setField(term5821, term5821.getClass(), "mant", null);
        setByteField(term5821, term5821.getClass(), "sign", (byte) 0);
        setIntField(term5821, term5821.getClass(), "exp", 0);
        setByteField(term5821, term5821.getClass(), "nans", (byte) 0);
        setField(term5821, term5821.getClass(), "field", null);
        setField(term5815, term5815.getClass(), "two", term5821);
        setField(term5825, term5825.getClass(), "mant", null);
        setByteField(term5825, term5825.getClass(), "sign", (byte) 0);
        setIntField(term5825, term5825.getClass(), "exp", 0);
        setByteField(term5825, term5825.getClass(), "nans", (byte) 0);
        setField(term5825, term5825.getClass(), "field", null);
        setField(term5815, term5815.getClass(), "sqr2", term5825);
        setElement(term5829, 0, term5803);
        setField(term5815, term5815.getClass(), "sqr2Split", term5829);
        setField(term5815, term5815.getClass(), "sqr2Reciprocal", term5825);
        setField(term5815, term5815.getClass(), "sqr3", term5825);
        setField(term5830, term5830.getClass(), "mant", null);
        setByteField(term5830, term5830.getClass(), "sign", (byte) 0);
        setIntField(term5830, term5830.getClass(), "exp", 0);
        setByteField(term5830, term5830.getClass(), "nans", (byte) 0);
        setField(term5830, term5830.getClass(), "field", null);
        setField(term5815, term5815.getClass(), "sqr3Reciprocal", term5830);
        setField(term5834, term5834.getClass(), "mant", null);
        setByteField(term5834, term5834.getClass(), "sign", (byte) 0);
        setIntField(term5834, term5834.getClass(), "exp", 0);
        setByteField(term5834, term5834.getClass(), "nans", (byte) 0);
        setField(term5834, term5834.getClass(), "field", null);
        setField(term5815, term5815.getClass(), "pi", term5834);
        setElement(term5838, 0, term5803);
        setElement(term5838, 1, term5821);
        setElement(term5838, 2, term5825);
        setElement(term5838, 4, term5830);
        setElement(term5838, 5, term5803);
        setElement(term5838, 6, term5834);
        setElement(term5838, 7, term5825);
        setField(term5815, term5815.getClass(), "piSplit", term5838);
        setField(term5815, term5815.getClass(), "e", term5803);
        setElement(term5839, 2, term5817);
        setElement(term5839, 3, term5803);
        setElement(term5839, 5, term5821);
        setElement(term5839, 6, term5787);
        setElement(term5839, 7, term5830);
        setField(term5815, term5815.getClass(), "eSplit", term5839);
        setField(term5840, term5840.getClass(), "mant", null);
        setByteField(term5840, term5840.getClass(), "sign", (byte) 0);
        setIntField(term5840, term5840.getClass(), "exp", 0);
        setByteField(term5840, term5840.getClass(), "nans", (byte) 0);
        setField(term5840, term5840.getClass(), "field", null);
        setField(term5815, term5815.getClass(), "ln2", term5840);
        setElement(term5844, 0, term5834);
        setElement(term5844, 1, term5840);
        setElement(term5844, 2, term5840);
        setElement(term5844, 4, term5817);
        setField(term5815, term5815.getClass(), "ln2Split", term5844);
        setField(term5815, term5815.getClass(), "ln5", term5825);
        setElement(term5845, 0, term5821);
        setElement(term5845, 2, term5803);
        setElement(term5845, 3, term5840);
        setElement(term5845, 4, term5803);
        setElement(term5845, 6, term5834);
        setField(term5815, term5815.getClass(), "ln5Split", term5845);
        setField(term5815, term5815.getClass(), "ln10", term5834);
        setField(term5815, term5815.getClass(), "rMode", enum182);
        setIntField(term5815, term5815.getClass(), "ieeeFlags", 2049577015);
        setField(term5803, term5803.getClass(), "field", term5815);
        setField(term5801, term5801.getClass(), "zero", term5803);
        setField(term5801, term5801.getClass(), "one", term5821);
        setField(term5801, term5801.getClass(), "two", term5821);
        setField(term5801, term5801.getClass(), "sqr2", term5830);
        setElement(term5849, 0, term5787);
        setElement(term5849, 1, term5787);
        setElement(term5849, 2, term5817);
        setElement(term5849, 3, term5803);
        setElement(term5849, 4, term5821);
        setElement(term5849, 5, term5803);
        setElement(term5849, 6, term5825);
        setElement(term5849, 7, term5830);
        setElement(term5849, 8, term5825);
        setField(term5801, term5801.getClass(), "sqr2Split", term5849);
        setField(term5850, term5850.getClass(), "mant", null);
        setByteField(term5850, term5850.getClass(), "sign", (byte) 0);
        setIntField(term5850, term5850.getClass(), "exp", 0);
        setByteField(term5850, term5850.getClass(), "nans", (byte) 0);
        setField(term5850, term5850.getClass(), "field", null);
        setField(term5801, term5801.getClass(), "sqr2Reciprocal", term5850);
        setField(term5801, term5801.getClass(), "sqr3", term5830);
        setField(term5854, term5854.getClass(), "mant", null);
        setByteField(term5854, term5854.getClass(), "sign", (byte) 0);
        setIntField(term5854, term5854.getClass(), "exp", 0);
        setByteField(term5854, term5854.getClass(), "nans", (byte) 0);
        setField(term5854, term5854.getClass(), "field", null);
        setField(term5801, term5801.getClass(), "sqr3Reciprocal", term5854);
        setField(term5801, term5801.getClass(), "pi", term5850);
        setElement(term5858, 0, term5854);
        setElement(term5858, 1, term5834);
        setElement(term5858, 2, term5854);
        setElement(term5858, 3, term5850);
        setElement(term5858, 4, term5817);
        setElement(term5858, 5, term5840);
        setElement(term5858, 6, term5821);
        setField(term5801, term5801.getClass(), "piSplit", term5858);
        setField(term5801, term5801.getClass(), "e", term5803);
        setElement(term5859, 0, term5834);
        setElement(term5859, 1, term5821);
        setElement(term5859, 2, term5817);
        setElement(term5859, 3, term5834);
        setElement(term5859, 4, term5854);
        setElement(term5859, 5, term5825);
        setField(term5801, term5801.getClass(), "eSplit", term5859);
        setField(term5801, term5801.getClass(), "ln2", term5854);
        setElement(term5860, 0, term5830);
        setElement(term5860, 1, term5840);
        setElement(term5860, 2, term5803);
        setElement(term5860, 3, term5850);
        setElement(term5860, 4, term5787);
        setField(term5801, term5801.getClass(), "ln2Split", term5860);
        setField(term5801, term5801.getClass(), "ln5", term5840);
        setElement(term5861, 0, term5825);
        setElement(term5861, 1, term5825);
        setField(term5801, term5801.getClass(), "ln5Split", term5861);
        setField(term5801, term5801.getClass(), "ln10", term5787);
        setField(term5801, term5801.getClass(), "rMode", enum183);
        setIntField(term5801, term5801.getClass(), "ieeeFlags", 1236004505);
        setField(term5787, term5787.getClass(), "field", term5801);
        term5875 = new Integer(1050765721);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.dfp.Dfp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term5875;
        try {
            callMethod(klass, "newInstance", argTypes, term5787, args);
            assertTrue(false);
        }
        catch (OutOfMemoryError e) {
        }

    }

};


