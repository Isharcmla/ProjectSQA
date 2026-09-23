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
import java.lang.Byte;

public class Dfp_init_65450997177 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4672;
     Object term4750;
     Object term4752;

    public Dfp_init_65450997177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term83342 = Class.forName((String) "org.apache.commons.math3.dfp.DfpField$RoundingMode");
        Field term83341 = ((Class) term83342).getDeclaredField((String) "ROUND_FLOOR");
        ((Field) term83341).setAccessible(true);
        Object enum176 = ((Field) term83341).get((Object) null);
        term4672 = newInstance(Class.forName("org.apache.commons.math3.dfp.DfpField"));
        Object term4674 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        int[] term4675 = (int[]) newIntArray(5);
        Object term4684 = newInstance(Class.forName("org.apache.commons.math3.dfp.DfpField"));
        Object term4686 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        int[] term4687 = (int[]) newIntArray(9);
        Object term4700 = newInstance(Class.forName("org.apache.commons.math3.dfp.DfpField"));
        Object term4703 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object term4707 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object[] term4711 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 4);
        Object term4712 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object term4716 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object term4720 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object term4724 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object[] term4728 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 7);
        Object term4729 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object term4733 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object[] term4737 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 4);
        Object[] term4738 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 6);
        Object[] term4739 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 4);
        Object[] term4744 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 1);
        Object[] term4745 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 2);
        Object[] term4746 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 5);
        Object[] term4747 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 2);
        Object[] term4748 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 3);
        setIntField(term4672, term4672.getClass(), "radixDigits", -1896376975);
        setIntElement(term4675, 0, 729658803);
        setIntElement(term4675, 1, 114754804);
        setIntElement(term4675, 2, 1687361082);
        setIntElement(term4675, 3, 584893196);
        setIntElement(term4675, 4, 497269071);
        setField(term4674, term4674.getClass(), "mant", term4675);
        setByteField(term4674, term4674.getClass(), "sign", (byte) -104);
        setIntField(term4674, term4674.getClass(), "exp", -1899301124);
        setByteField(term4674, term4674.getClass(), "nans", (byte) -89);
        setIntField(term4684, term4684.getClass(), "radixDigits", -1882480155);
        setIntElement(term4687, 0, -1410220680);
        setIntElement(term4687, 1, 389427431);
        setIntElement(term4687, 2, -1945706126);
        setIntElement(term4687, 3, 1152356969);
        setIntElement(term4687, 4, -1667990367);
        setIntElement(term4687, 5, -1214628358);
        setIntElement(term4687, 6, 1102721075);
        setIntElement(term4687, 7, -426764678);
        setIntElement(term4687, 8, -1222614956);
        setField(term4686, term4686.getClass(), "mant", term4687);
        setByteField(term4686, term4686.getClass(), "sign", (byte) 44);
        setIntField(term4686, term4686.getClass(), "exp", -1870495012);
        setByteField(term4686, term4686.getClass(), "nans", (byte) -63);
        setIntField(term4700, term4700.getClass(), "radixDigits", -1310015129);
        setField(term4700, term4700.getClass(), "zero", null);
        setField(term4700, term4700.getClass(), "one", term4686);
        setField(term4700, term4700.getClass(), "two", null);
        setField(term4700, term4700.getClass(), "sqr2", null);
        setField(term4700, term4700.getClass(), "sqr2Split", null);
        setField(term4700, term4700.getClass(), "sqr2Reciprocal", term4686);
        setField(term4700, term4700.getClass(), "sqr3", null);
        setField(term4700, term4700.getClass(), "sqr3Reciprocal", null);
        setField(term4700, term4700.getClass(), "pi", null);
        setField(term4700, term4700.getClass(), "piSplit", null);
        setField(term4700, term4700.getClass(), "e", null);
        setField(term4700, term4700.getClass(), "eSplit", null);
        setField(term4700, term4700.getClass(), "ln2", term4686);
        setField(term4700, term4700.getClass(), "ln2Split", null);
        setField(term4700, term4700.getClass(), "ln5", null);
        setField(term4700, term4700.getClass(), "ln5Split", null);
        setField(term4700, term4700.getClass(), "ln10", null);
        setField(term4700, term4700.getClass(), "rMode", null);
        setIntField(term4700, term4700.getClass(), "ieeeFlags", 548228925);
        setField(term4686, term4686.getClass(), "field", term4700);
        setField(term4684, term4684.getClass(), "zero", term4686);
        setField(term4703, term4703.getClass(), "mant", null);
        setByteField(term4703, term4703.getClass(), "sign", (byte) 0);
        setIntField(term4703, term4703.getClass(), "exp", 0);
        setByteField(term4703, term4703.getClass(), "nans", (byte) 0);
        setField(term4703, term4703.getClass(), "field", null);
        setField(term4684, term4684.getClass(), "one", term4703);
        setField(term4684, term4684.getClass(), "two", term4686);
        setField(term4707, term4707.getClass(), "mant", null);
        setByteField(term4707, term4707.getClass(), "sign", (byte) 0);
        setIntField(term4707, term4707.getClass(), "exp", 0);
        setByteField(term4707, term4707.getClass(), "nans", (byte) 0);
        setField(term4707, term4707.getClass(), "field", null);
        setField(term4684, term4684.getClass(), "sqr2", term4707);
        setElement(term4711, 0, term4686);
        setField(term4712, term4712.getClass(), "mant", null);
        setByteField(term4712, term4712.getClass(), "sign", (byte) 0);
        setIntField(term4712, term4712.getClass(), "exp", 0);
        setByteField(term4712, term4712.getClass(), "nans", (byte) 0);
        setField(term4712, term4712.getClass(), "field", null);
        setElement(term4711, 1, term4712);
        setField(term4716, term4716.getClass(), "mant", null);
        setByteField(term4716, term4716.getClass(), "sign", (byte) 0);
        setIntField(term4716, term4716.getClass(), "exp", 0);
        setByteField(term4716, term4716.getClass(), "nans", (byte) 0);
        setField(term4716, term4716.getClass(), "field", null);
        setElement(term4711, 2, term4716);
        setElement(term4711, 3, term4703);
        setField(term4684, term4684.getClass(), "sqr2Split", term4711);
        setField(term4684, term4684.getClass(), "sqr2Reciprocal", term4716);
        setField(term4720, term4720.getClass(), "mant", null);
        setByteField(term4720, term4720.getClass(), "sign", (byte) 0);
        setIntField(term4720, term4720.getClass(), "exp", 0);
        setByteField(term4720, term4720.getClass(), "nans", (byte) 0);
        setField(term4720, term4720.getClass(), "field", null);
        setField(term4684, term4684.getClass(), "sqr3", term4720);
        setField(term4684, term4684.getClass(), "sqr3Reciprocal", term4720);
        setField(term4724, term4724.getClass(), "mant", null);
        setByteField(term4724, term4724.getClass(), "sign", (byte) 0);
        setIntField(term4724, term4724.getClass(), "exp", 0);
        setByteField(term4724, term4724.getClass(), "nans", (byte) 0);
        setField(term4724, term4724.getClass(), "field", null);
        setField(term4684, term4684.getClass(), "pi", term4724);
        setElement(term4728, 0, term4674);
        setElement(term4728, 1, term4674);
        setField(term4729, term4729.getClass(), "mant", null);
        setByteField(term4729, term4729.getClass(), "sign", (byte) 45);
        setIntField(term4729, term4729.getClass(), "exp", -165587447);
        setByteField(term4729, term4729.getClass(), "nans", (byte) -39);
        setField(term4729, term4729.getClass(), "field", null);
        setElement(term4728, 2, term4729);
        setElement(term4728, 3, term4686);
        setElement(term4728, 4, term4720);
        setElement(term4728, 5, term4686);
        setField(term4733, term4733.getClass(), "mant", null);
        setByteField(term4733, term4733.getClass(), "sign", (byte) 0);
        setIntField(term4733, term4733.getClass(), "exp", 0);
        setByteField(term4733, term4733.getClass(), "nans", (byte) 0);
        setField(term4733, term4733.getClass(), "field", null);
        setElement(term4728, 6, term4733);
        setField(term4684, term4684.getClass(), "piSplit", term4728);
        setField(term4684, term4684.getClass(), "e", term4724);
        setElement(term4737, 0, term4733);
        setElement(term4737, 1, term4703);
        setElement(term4737, 2, term4724);
        setElement(term4737, 3, term4712);
        setField(term4684, term4684.getClass(), "eSplit", term4737);
        setField(term4684, term4684.getClass(), "ln2", term4703);
        setElement(term4738, 0, term4712);
        setElement(term4738, 1, term4716);
        setElement(term4738, 2, term4712);
        setElement(term4738, 3, term4703);
        setElement(term4738, 4, term4729);
        setElement(term4738, 5, term4707);
        setField(term4684, term4684.getClass(), "ln2Split", term4738);
        setField(term4684, term4684.getClass(), "ln5", term4720);
        setElement(term4739, 0, term4686);
        setElement(term4739, 1, term4716);
        setElement(term4739, 2, term4720);
        setElement(term4739, 3, term4729);
        setField(term4684, term4684.getClass(), "ln5Split", term4739);
        setField(term4684, term4684.getClass(), "ln10", term4716);
        setField(term4684, term4684.getClass(), "rMode", enum176);
        setIntField(term4684, term4684.getClass(), "ieeeFlags", -749861210);
        setField(term4674, term4674.getClass(), "field", term4684);
        setField(term4672, term4672.getClass(), "zero", term4674);
        setField(term4672, term4672.getClass(), "one", term4712);
        setField(term4672, term4672.getClass(), "two", term4733);
        setField(term4672, term4672.getClass(), "sqr2", term4712);
        setElement(term4744, 0, term4724);
        setField(term4672, term4672.getClass(), "sqr2Split", term4744);
        setField(term4672, term4672.getClass(), "sqr2Reciprocal", term4707);
        setField(term4672, term4672.getClass(), "sqr3", term4686);
        setField(term4672, term4672.getClass(), "sqr3Reciprocal", term4703);
        setField(term4672, term4672.getClass(), "pi", term4674);
        setElement(term4745, 0, term4707);
        setElement(term4745, 1, term4733);
        setField(term4672, term4672.getClass(), "piSplit", term4745);
        setField(term4672, term4672.getClass(), "e", term4733);
        setElement(term4746, 0, term4674);
        setElement(term4746, 1, term4703);
        setElement(term4746, 2, term4712);
        setElement(term4746, 3, term4716);
        setElement(term4746, 4, term4720);
        setField(term4672, term4672.getClass(), "eSplit", term4746);
        setField(term4672, term4672.getClass(), "ln2", term4733);
        setElement(term4747, 0, term4729);
        setElement(term4747, 1, term4720);
        setField(term4672, term4672.getClass(), "ln2Split", term4747);
        setField(term4672, term4672.getClass(), "ln5", term4712);
        setElement(term4748, 0, term4724);
        setElement(term4748, 1, term4720);
        setElement(term4748, 2, term4686);
        setField(term4672, term4672.getClass(), "ln5Split", term4748);
        setField(term4672, term4672.getClass(), "ln10", term4712);
        setField(term4672, term4672.getClass(), "rMode", enum176);
        setIntField(term4672, term4672.getClass(), "ieeeFlags", 1694224101);
        term4750 = new Byte((byte) -20);
        term4752 = new Byte((byte) 10);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.dfp.Dfp");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.apache.commons.math3.dfp.DfpField");
        argTypes[1] = byte.class;
        argTypes[2] = byte.class;
        Object[] args = new Object[3];
        args[0] = term4672;
        args[1] = term4750;
        args[2] = term4752;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NegativeArraySizeException e) {
        }

    }

};


