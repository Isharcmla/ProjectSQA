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
import java.lang.Byte;

public class Dfp_newInstance_194929028490 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9731;
     Object term9808;
     Object term9810;

    public Dfp_newInstance_194929028490() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term537760 = Class.forName((String) "org.apache.commons.math.dfp.DfpField$RoundingMode");
        Field term537759 = ((Class) term537760).getDeclaredField((String) "ROUND_DOWN");
        ((Field) term537759).setAccessible(true);
        Object enum186 = ((Field) term537759).get((Object) null);
        Class<? extends Object> term538042 = Class.forName((String) "org.apache.commons.math.dfp.DfpField$RoundingMode");
        Field term538041 = ((Class) term538042).getDeclaredField((String) "ROUND_FLOOR");
        ((Field) term538041).setAccessible(true);
        Object enum187 = ((Field) term538041).get((Object) null);
        term9731 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        int[] term9732 = (int[]) newIntArray(0);
        Object term9736 = newInstance(Class.forName("org.apache.commons.math.dfp.DfpField"));
        Object term9738 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        int[] term9739 = (int[]) newIntArray(2);
        Object term9745 = newInstance(Class.forName("org.apache.commons.math.dfp.DfpField"));
        Object term9747 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object term9751 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object term9755 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object[] term9759 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 8);
        Object term9760 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object term9764 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object[] term9768 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 4);
        Object[] term9769 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 9);
        Object[] term9770 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 6);
        Object term9771 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object[] term9775 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 3);
        Object[] term9779 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 3);
        Object term9780 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object[] term9784 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 4);
        Object[] term9785 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 2);
        Object term9786 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object[] term9790 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 4);
        Object[] term9791 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 1);
        setField(term9731, term9731.getClass(), "mant", term9732);
        setByteField(term9731, term9731.getClass(), "sign", (byte) -109);
        setIntField(term9731, term9731.getClass(), "exp", 1334483645);
        setByteField(term9731, term9731.getClass(), "nans", (byte) 122);
        setIntField(term9736, term9736.getClass(), "radixDigits", 917513193);
        setIntElement(term9739, 0, 787278105);
        setIntElement(term9739, 1, -2063843486);
        setField(term9738, term9738.getClass(), "mant", term9739);
        setByteField(term9738, term9738.getClass(), "sign", (byte) -123);
        setIntField(term9738, term9738.getClass(), "exp", 833762980);
        setByteField(term9738, term9738.getClass(), "nans", (byte) -76);
        setIntField(term9745, term9745.getClass(), "radixDigits", 320711637);
        setField(term9747, term9747.getClass(), "mant", null);
        setByteField(term9747, term9747.getClass(), "sign", (byte) -48);
        setIntField(term9747, term9747.getClass(), "exp", 765766290);
        setByteField(term9747, term9747.getClass(), "nans", (byte) 126);
        setField(term9747, term9747.getClass(), "field", null);
        setField(term9745, term9745.getClass(), "zero", term9747);
        setField(term9751, term9751.getClass(), "mant", null);
        setByteField(term9751, term9751.getClass(), "sign", (byte) 0);
        setIntField(term9751, term9751.getClass(), "exp", 0);
        setByteField(term9751, term9751.getClass(), "nans", (byte) 0);
        setField(term9751, term9751.getClass(), "field", null);
        setField(term9745, term9745.getClass(), "one", term9751);
        setField(term9745, term9745.getClass(), "two", term9751);
        setField(term9755, term9755.getClass(), "mant", null);
        setByteField(term9755, term9755.getClass(), "sign", (byte) 0);
        setIntField(term9755, term9755.getClass(), "exp", 0);
        setByteField(term9755, term9755.getClass(), "nans", (byte) 0);
        setField(term9755, term9755.getClass(), "field", null);
        setField(term9745, term9745.getClass(), "sqr2", term9755);
        setElement(term9759, 1, term9738);
        setElement(term9759, 3, term9751);
        setElement(term9759, 5, term9755);
        setElement(term9759, 6, term9738);
        setField(term9745, term9745.getClass(), "sqr2Split", term9759);
        setField(term9745, term9745.getClass(), "sqr2Reciprocal", term9751);
        setField(term9745, term9745.getClass(), "sqr3", term9738);
        setField(term9760, term9760.getClass(), "mant", null);
        setByteField(term9760, term9760.getClass(), "sign", (byte) 0);
        setIntField(term9760, term9760.getClass(), "exp", 0);
        setByteField(term9760, term9760.getClass(), "nans", (byte) 0);
        setField(term9760, term9760.getClass(), "field", null);
        setField(term9745, term9745.getClass(), "sqr3Reciprocal", term9760);
        setField(term9764, term9764.getClass(), "mant", null);
        setByteField(term9764, term9764.getClass(), "sign", (byte) 0);
        setIntField(term9764, term9764.getClass(), "exp", 0);
        setByteField(term9764, term9764.getClass(), "nans", (byte) 0);
        setField(term9764, term9764.getClass(), "field", null);
        setField(term9745, term9745.getClass(), "pi", term9764);
        setElement(term9768, 0, term9747);
        setElement(term9768, 1, term9738);
        setElement(term9768, 2, term9764);
        setField(term9745, term9745.getClass(), "piSplit", term9768);
        setField(term9745, term9745.getClass(), "e", term9731);
        setElement(term9769, 0, term9755);
        setElement(term9769, 5, term9764);
        setElement(term9769, 6, term9747);
        setElement(term9769, 7, term9751);
        setField(term9745, term9745.getClass(), "eSplit", term9769);
        setField(term9745, term9745.getClass(), "ln2", term9760);
        setElement(term9770, 0, term9738);
        setElement(term9770, 2, term9738);
        setElement(term9770, 3, term9764);
        setElement(term9770, 5, term9760);
        setField(term9745, term9745.getClass(), "ln2Split", term9770);
        setField(term9771, term9771.getClass(), "mant", null);
        setByteField(term9771, term9771.getClass(), "sign", (byte) 0);
        setIntField(term9771, term9771.getClass(), "exp", 0);
        setByteField(term9771, term9771.getClass(), "nans", (byte) 0);
        setField(term9771, term9771.getClass(), "field", null);
        setField(term9745, term9745.getClass(), "ln5", term9771);
        setElement(term9775, 2, term9755);
        setField(term9745, term9745.getClass(), "ln5Split", term9775);
        setField(term9745, term9745.getClass(), "ln10", term9731);
        setField(term9745, term9745.getClass(), "rMode", enum186);
        setIntField(term9745, term9745.getClass(), "ieeeFlags", 947897214);
        setField(term9738, term9738.getClass(), "field", term9745);
        setField(term9736, term9736.getClass(), "zero", term9738);
        setField(term9736, term9736.getClass(), "one", term9731);
        setField(term9736, term9736.getClass(), "two", term9747);
        setField(term9736, term9736.getClass(), "sqr2", term9738);
        setField(term9780, term9780.getClass(), "mant", null);
        setByteField(term9780, term9780.getClass(), "sign", (byte) 0);
        setIntField(term9780, term9780.getClass(), "exp", 0);
        setByteField(term9780, term9780.getClass(), "nans", (byte) 0);
        setField(term9780, term9780.getClass(), "field", null);
        setElement(term9779, 0, term9780);
        setElement(term9779, 1, term9738);
        setElement(term9779, 2, term9751);
        setField(term9736, term9736.getClass(), "sqr2Split", term9779);
        setField(term9736, term9736.getClass(), "sqr2Reciprocal", term9755);
        setField(term9736, term9736.getClass(), "sqr3", term9751);
        setField(term9736, term9736.getClass(), "sqr3Reciprocal", term9760);
        setField(term9736, term9736.getClass(), "pi", term9755);
        setElement(term9784, 0, term9764);
        setElement(term9784, 1, term9760);
        setElement(term9784, 2, term9764);
        setElement(term9784, 3, term9771);
        setField(term9736, term9736.getClass(), "piSplit", term9784);
        setField(term9736, term9736.getClass(), "e", term9764);
        setElement(term9785, 0, term9760);
        setElement(term9785, 1, term9747);
        setField(term9736, term9736.getClass(), "eSplit", term9785);
        setField(term9786, term9786.getClass(), "mant", null);
        setByteField(term9786, term9786.getClass(), "sign", (byte) 0);
        setIntField(term9786, term9786.getClass(), "exp", 0);
        setByteField(term9786, term9786.getClass(), "nans", (byte) 0);
        setField(term9786, term9786.getClass(), "field", null);
        setField(term9736, term9736.getClass(), "ln2", term9786);
        setElement(term9790, 0, term9780);
        setElement(term9790, 1, term9738);
        setElement(term9790, 2, term9771);
        setElement(term9790, 3, term9780);
        setField(term9736, term9736.getClass(), "ln2Split", term9790);
        setField(term9736, term9736.getClass(), "ln5", term9747);
        setElement(term9791, 0, term9771);
        setField(term9736, term9736.getClass(), "ln5Split", term9791);
        setField(term9736, term9736.getClass(), "ln10", term9764);
        setField(term9736, term9736.getClass(), "rMode", enum187);
        setIntField(term9736, term9736.getClass(), "ieeeFlags", 1496340209);
        setField(term9731, term9731.getClass(), "field", term9736);
        term9808 = new Byte((byte) 103);
        term9810 = new Byte((byte) 23);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.dfp.Dfp");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = byte.class;
        argTypes[1] = byte.class;
        Object[] args = new Object[2];
        args[0] = term9808;
        args[1] = term9810;
        try {
            callMethod(klass, "newInstance", argTypes, term9731, args);
            assertTrue(false);
        }
        catch (OutOfMemoryError e) {
        }

    }

};


