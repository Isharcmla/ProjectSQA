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
import java.lang.Byte;

public class Dfp_init_32306577969 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4607;
     Object term4685;
     Object term4687;

    public Dfp_init_32306577969() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term77908 = Class.forName((String) "org.apache.commons.math.dfp.DfpField$RoundingMode");
        Field term77907 = ((Class) term77908).getDeclaredField((String) "ROUND_HALF_DOWN");
        ((Field) term77907).setAccessible(true);
        Object enum163 = ((Field) term77907).get((Object) null);
        term4607 = newInstance(Class.forName("org.apache.commons.math.dfp.DfpField"));
        Object term4609 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        int[] term4610 = (int[]) newIntArray(5);
        Object term4619 = newInstance(Class.forName("org.apache.commons.math.dfp.DfpField"));
        Object term4621 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        int[] term4622 = (int[]) newIntArray(9);
        Object term4635 = newInstance(Class.forName("org.apache.commons.math.dfp.DfpField"));
        Object term4638 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object term4642 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object[] term4646 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 4);
        Object term4647 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object term4651 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object term4655 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object term4659 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object[] term4663 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 7);
        Object term4664 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object term4668 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object[] term4672 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 4);
        Object[] term4673 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 6);
        Object[] term4674 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 4);
        Object[] term4679 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 1);
        Object[] term4680 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 2);
        Object[] term4681 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 5);
        Object[] term4682 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 2);
        Object[] term4683 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 3);
        setIntField(term4607, term4607.getClass(), "radixDigits", -1896376975);
        setIntElement(term4610, 0, 729658803);
        setIntElement(term4610, 1, 114754804);
        setIntElement(term4610, 2, 1687361082);
        setIntElement(term4610, 3, 584893196);
        setIntElement(term4610, 4, 497269071);
        setField(term4609, term4609.getClass(), "mant", term4610);
        setByteField(term4609, term4609.getClass(), "sign", (byte) -104);
        setIntField(term4609, term4609.getClass(), "exp", -1899301124);
        setByteField(term4609, term4609.getClass(), "nans", (byte) -89);
        setIntField(term4619, term4619.getClass(), "radixDigits", -1882480155);
        setIntElement(term4622, 0, -1410220680);
        setIntElement(term4622, 1, 389427431);
        setIntElement(term4622, 2, -1945706126);
        setIntElement(term4622, 3, 1152356969);
        setIntElement(term4622, 4, -1667990367);
        setIntElement(term4622, 5, -1214628358);
        setIntElement(term4622, 6, 1102721075);
        setIntElement(term4622, 7, -426764678);
        setIntElement(term4622, 8, -1222614956);
        setField(term4621, term4621.getClass(), "mant", term4622);
        setByteField(term4621, term4621.getClass(), "sign", (byte) 44);
        setIntField(term4621, term4621.getClass(), "exp", -1870495012);
        setByteField(term4621, term4621.getClass(), "nans", (byte) -63);
        setIntField(term4635, term4635.getClass(), "radixDigits", -1310015129);
        setField(term4635, term4635.getClass(), "zero", null);
        setField(term4635, term4635.getClass(), "one", term4621);
        setField(term4635, term4635.getClass(), "two", null);
        setField(term4635, term4635.getClass(), "sqr2", null);
        setField(term4635, term4635.getClass(), "sqr2Split", null);
        setField(term4635, term4635.getClass(), "sqr2Reciprocal", term4621);
        setField(term4635, term4635.getClass(), "sqr3", null);
        setField(term4635, term4635.getClass(), "sqr3Reciprocal", null);
        setField(term4635, term4635.getClass(), "pi", null);
        setField(term4635, term4635.getClass(), "piSplit", null);
        setField(term4635, term4635.getClass(), "e", null);
        setField(term4635, term4635.getClass(), "eSplit", null);
        setField(term4635, term4635.getClass(), "ln2", term4621);
        setField(term4635, term4635.getClass(), "ln2Split", null);
        setField(term4635, term4635.getClass(), "ln5", null);
        setField(term4635, term4635.getClass(), "ln5Split", null);
        setField(term4635, term4635.getClass(), "ln10", null);
        setField(term4635, term4635.getClass(), "rMode", null);
        setIntField(term4635, term4635.getClass(), "ieeeFlags", 548228925);
        setField(term4621, term4621.getClass(), "field", term4635);
        setField(term4619, term4619.getClass(), "zero", term4621);
        setField(term4638, term4638.getClass(), "mant", null);
        setByteField(term4638, term4638.getClass(), "sign", (byte) 0);
        setIntField(term4638, term4638.getClass(), "exp", 0);
        setByteField(term4638, term4638.getClass(), "nans", (byte) 0);
        setField(term4638, term4638.getClass(), "field", null);
        setField(term4619, term4619.getClass(), "one", term4638);
        setField(term4619, term4619.getClass(), "two", term4621);
        setField(term4642, term4642.getClass(), "mant", null);
        setByteField(term4642, term4642.getClass(), "sign", (byte) 0);
        setIntField(term4642, term4642.getClass(), "exp", 0);
        setByteField(term4642, term4642.getClass(), "nans", (byte) 0);
        setField(term4642, term4642.getClass(), "field", null);
        setField(term4619, term4619.getClass(), "sqr2", term4642);
        setElement(term4646, 0, term4621);
        setField(term4647, term4647.getClass(), "mant", null);
        setByteField(term4647, term4647.getClass(), "sign", (byte) 0);
        setIntField(term4647, term4647.getClass(), "exp", 0);
        setByteField(term4647, term4647.getClass(), "nans", (byte) 0);
        setField(term4647, term4647.getClass(), "field", null);
        setElement(term4646, 1, term4647);
        setField(term4651, term4651.getClass(), "mant", null);
        setByteField(term4651, term4651.getClass(), "sign", (byte) 0);
        setIntField(term4651, term4651.getClass(), "exp", 0);
        setByteField(term4651, term4651.getClass(), "nans", (byte) 0);
        setField(term4651, term4651.getClass(), "field", null);
        setElement(term4646, 2, term4651);
        setElement(term4646, 3, term4638);
        setField(term4619, term4619.getClass(), "sqr2Split", term4646);
        setField(term4619, term4619.getClass(), "sqr2Reciprocal", term4651);
        setField(term4655, term4655.getClass(), "mant", null);
        setByteField(term4655, term4655.getClass(), "sign", (byte) 0);
        setIntField(term4655, term4655.getClass(), "exp", 0);
        setByteField(term4655, term4655.getClass(), "nans", (byte) 0);
        setField(term4655, term4655.getClass(), "field", null);
        setField(term4619, term4619.getClass(), "sqr3", term4655);
        setField(term4619, term4619.getClass(), "sqr3Reciprocal", term4655);
        setField(term4659, term4659.getClass(), "mant", null);
        setByteField(term4659, term4659.getClass(), "sign", (byte) 0);
        setIntField(term4659, term4659.getClass(), "exp", 0);
        setByteField(term4659, term4659.getClass(), "nans", (byte) 0);
        setField(term4659, term4659.getClass(), "field", null);
        setField(term4619, term4619.getClass(), "pi", term4659);
        setElement(term4663, 0, term4609);
        setElement(term4663, 1, term4609);
        setField(term4664, term4664.getClass(), "mant", null);
        setByteField(term4664, term4664.getClass(), "sign", (byte) 45);
        setIntField(term4664, term4664.getClass(), "exp", -165587447);
        setByteField(term4664, term4664.getClass(), "nans", (byte) -39);
        setField(term4664, term4664.getClass(), "field", null);
        setElement(term4663, 2, term4664);
        setElement(term4663, 3, term4621);
        setElement(term4663, 4, term4655);
        setElement(term4663, 5, term4621);
        setField(term4668, term4668.getClass(), "mant", null);
        setByteField(term4668, term4668.getClass(), "sign", (byte) 0);
        setIntField(term4668, term4668.getClass(), "exp", 0);
        setByteField(term4668, term4668.getClass(), "nans", (byte) 0);
        setField(term4668, term4668.getClass(), "field", null);
        setElement(term4663, 6, term4668);
        setField(term4619, term4619.getClass(), "piSplit", term4663);
        setField(term4619, term4619.getClass(), "e", term4659);
        setElement(term4672, 0, term4668);
        setElement(term4672, 1, term4638);
        setElement(term4672, 2, term4659);
        setElement(term4672, 3, term4647);
        setField(term4619, term4619.getClass(), "eSplit", term4672);
        setField(term4619, term4619.getClass(), "ln2", term4638);
        setElement(term4673, 0, term4647);
        setElement(term4673, 1, term4651);
        setElement(term4673, 2, term4647);
        setElement(term4673, 3, term4638);
        setElement(term4673, 4, term4664);
        setElement(term4673, 5, term4642);
        setField(term4619, term4619.getClass(), "ln2Split", term4673);
        setField(term4619, term4619.getClass(), "ln5", term4655);
        setElement(term4674, 0, term4621);
        setElement(term4674, 1, term4651);
        setElement(term4674, 2, term4655);
        setElement(term4674, 3, term4664);
        setField(term4619, term4619.getClass(), "ln5Split", term4674);
        setField(term4619, term4619.getClass(), "ln10", term4651);
        setField(term4619, term4619.getClass(), "rMode", enum163);
        setIntField(term4619, term4619.getClass(), "ieeeFlags", -749861210);
        setField(term4609, term4609.getClass(), "field", term4619);
        setField(term4607, term4607.getClass(), "zero", term4609);
        setField(term4607, term4607.getClass(), "one", term4647);
        setField(term4607, term4607.getClass(), "two", term4668);
        setField(term4607, term4607.getClass(), "sqr2", term4647);
        setElement(term4679, 0, term4659);
        setField(term4607, term4607.getClass(), "sqr2Split", term4679);
        setField(term4607, term4607.getClass(), "sqr2Reciprocal", term4642);
        setField(term4607, term4607.getClass(), "sqr3", term4621);
        setField(term4607, term4607.getClass(), "sqr3Reciprocal", term4638);
        setField(term4607, term4607.getClass(), "pi", term4609);
        setElement(term4680, 0, term4642);
        setElement(term4680, 1, term4668);
        setField(term4607, term4607.getClass(), "piSplit", term4680);
        setField(term4607, term4607.getClass(), "e", term4668);
        setElement(term4681, 0, term4609);
        setElement(term4681, 1, term4638);
        setElement(term4681, 2, term4647);
        setElement(term4681, 3, term4651);
        setElement(term4681, 4, term4655);
        setField(term4607, term4607.getClass(), "eSplit", term4681);
        setField(term4607, term4607.getClass(), "ln2", term4668);
        setElement(term4682, 0, term4664);
        setElement(term4682, 1, term4655);
        setField(term4607, term4607.getClass(), "ln2Split", term4682);
        setField(term4607, term4607.getClass(), "ln5", term4647);
        setElement(term4683, 0, term4659);
        setElement(term4683, 1, term4655);
        setElement(term4683, 2, term4621);
        setField(term4607, term4607.getClass(), "ln5Split", term4683);
        setField(term4607, term4607.getClass(), "ln10", term4647);
        setField(term4607, term4607.getClass(), "rMode", enum163);
        setIntField(term4607, term4607.getClass(), "ieeeFlags", 1694224101);
        term4685 = new Byte((byte) -20);
        term4687 = new Byte((byte) 10);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.dfp.Dfp");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.apache.commons.math.dfp.DfpField");
        argTypes[1] = byte.class;
        argTypes[2] = byte.class;
        Object[] args = new Object[3];
        args[0] = term4607;
        args[1] = term4685;
        args[2] = term4687;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NegativeArraySizeException e) {
        }

    }

};


