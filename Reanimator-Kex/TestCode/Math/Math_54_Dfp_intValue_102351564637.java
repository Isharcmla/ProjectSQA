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

public class Dfp_intValue_102351564637 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26360;

    public Dfp_intValue_102351564637() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term26441 = Class.forName((String) "org.apache.commons.math.dfp.DfpField$RoundingMode");
        Field term26440 = ((Class) term26441).getDeclaredField((String) "ROUND_CEIL");
        ((Field) term26440).setAccessible(true);
        Object enum77 = ((Field) term26440).get((Object) null);
        term26360 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        int[] term26361 = (int[]) newIntArray(9);
        Object term26374 = newInstance(Class.forName("org.apache.commons.math.dfp.DfpField"));
        Object term26376 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        int[] term26377 = (int[]) newIntArray(1);
        Object term26382 = newInstance(Class.forName("org.apache.commons.math.dfp.DfpField"));
        Object term26384 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object term26388 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object term26392 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object term26396 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object[] term26400 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 9);
        Object term26401 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object term26405 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object[] term26409 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 3);
        Object[] term26410 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 2);
        Object term26411 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object[] term26415 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 1);
        Object[] term26416 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 1);
        Object term26420 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object[] term26424 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 0);
        Object[] term26425 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 2);
        Object[] term26426 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 8);
        Object[] term26427 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 4);
        Object[] term26428 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 0);
        setIntElement(term26361, 0, -1389314671);
        setIntElement(term26361, 1, -499699841);
        setIntElement(term26361, 2, 360972386);
        setIntElement(term26361, 3, -2063884849);
        setIntElement(term26361, 4, 1054887169);
        setIntElement(term26361, 5, 692873905);
        setIntElement(term26361, 6, 1734759369);
        setIntElement(term26361, 7, 1841493736);
        setIntElement(term26361, 8, 320739944);
        setField(term26360, term26360.getClass(), "mant", term26361);
        setByteField(term26360, term26360.getClass(), "sign", (byte) -30);
        setIntField(term26360, term26360.getClass(), "exp", 760218111);
        setByteField(term26360, term26360.getClass(), "nans", (byte) -37);
        setIntField(term26374, term26374.getClass(), "radixDigits", -1986366126);
        setIntElement(term26377, 0, -1963228619);
        setField(term26376, term26376.getClass(), "mant", term26377);
        setByteField(term26376, term26376.getClass(), "sign", (byte) 51);
        setIntField(term26376, term26376.getClass(), "exp", -709868952);
        setByteField(term26376, term26376.getClass(), "nans", (byte) 90);
        setIntField(term26382, term26382.getClass(), "radixDigits", 847207929);
        setField(term26384, term26384.getClass(), "mant", null);
        setByteField(term26384, term26384.getClass(), "sign", (byte) -79);
        setIntField(term26384, term26384.getClass(), "exp", -1023366103);
        setByteField(term26384, term26384.getClass(), "nans", (byte) 44);
        setField(term26384, term26384.getClass(), "field", null);
        setField(term26382, term26382.getClass(), "zero", term26384);
        setField(term26388, term26388.getClass(), "mant", null);
        setByteField(term26388, term26388.getClass(), "sign", (byte) 0);
        setIntField(term26388, term26388.getClass(), "exp", 0);
        setByteField(term26388, term26388.getClass(), "nans", (byte) 0);
        setField(term26388, term26388.getClass(), "field", null);
        setField(term26382, term26382.getClass(), "one", term26388);
        setField(term26392, term26392.getClass(), "mant", null);
        setByteField(term26392, term26392.getClass(), "sign", (byte) 0);
        setIntField(term26392, term26392.getClass(), "exp", 0);
        setByteField(term26392, term26392.getClass(), "nans", (byte) 0);
        setField(term26392, term26392.getClass(), "field", null);
        setField(term26382, term26382.getClass(), "two", term26392);
        setField(term26396, term26396.getClass(), "mant", null);
        setByteField(term26396, term26396.getClass(), "sign", (byte) 0);
        setIntField(term26396, term26396.getClass(), "exp", 0);
        setByteField(term26396, term26396.getClass(), "nans", (byte) 0);
        setField(term26396, term26396.getClass(), "field", null);
        setField(term26382, term26382.getClass(), "sqr2", term26396);
        setElement(term26400, 0, term26376);
        setElement(term26400, 2, term26388);
        setElement(term26400, 4, term26392);
        setElement(term26400, 5, term26376);
        setElement(term26400, 6, term26396);
        setElement(term26400, 7, term26388);
        setElement(term26400, 8, term26376);
        setField(term26382, term26382.getClass(), "sqr2Split", term26400);
        setField(term26401, term26401.getClass(), "mant", null);
        setByteField(term26401, term26401.getClass(), "sign", (byte) 0);
        setIntField(term26401, term26401.getClass(), "exp", 0);
        setByteField(term26401, term26401.getClass(), "nans", (byte) 0);
        setField(term26401, term26401.getClass(), "field", null);
        setField(term26382, term26382.getClass(), "sqr2Reciprocal", term26401);
        setField(term26405, term26405.getClass(), "mant", null);
        setByteField(term26405, term26405.getClass(), "sign", (byte) 0);
        setIntField(term26405, term26405.getClass(), "exp", 0);
        setByteField(term26405, term26405.getClass(), "nans", (byte) 0);
        setField(term26405, term26405.getClass(), "field", null);
        setField(term26382, term26382.getClass(), "sqr3", term26405);
        setField(term26382, term26382.getClass(), "sqr3Reciprocal", term26384);
        setField(term26382, term26382.getClass(), "pi", term26376);
        setElement(term26409, 0, term26405);
        setElement(term26409, 2, term26360);
        setField(term26382, term26382.getClass(), "piSplit", term26409);
        setField(term26382, term26382.getClass(), "e", term26392);
        setElement(term26410, 1, term26396);
        setField(term26382, term26382.getClass(), "eSplit", term26410);
        setField(term26411, term26411.getClass(), "mant", null);
        setByteField(term26411, term26411.getClass(), "sign", (byte) 0);
        setIntField(term26411, term26411.getClass(), "exp", 0);
        setByteField(term26411, term26411.getClass(), "nans", (byte) 0);
        setField(term26411, term26411.getClass(), "field", null);
        setField(term26382, term26382.getClass(), "ln2", term26411);
        setElement(term26415, 0, term26411);
        setField(term26382, term26382.getClass(), "ln2Split", term26415);
        setField(term26382, term26382.getClass(), "ln5", term26405);
        setElement(term26416, 0, term26384);
        setField(term26382, term26382.getClass(), "ln5Split", term26416);
        setField(term26382, term26382.getClass(), "ln10", term26388);
        setField(term26382, term26382.getClass(), "rMode", enum77);
        setIntField(term26382, term26382.getClass(), "ieeeFlags", 1175146356);
        setField(term26376, term26376.getClass(), "field", term26382);
        setField(term26374, term26374.getClass(), "zero", term26376);
        setField(term26420, term26420.getClass(), "mant", null);
        setByteField(term26420, term26420.getClass(), "sign", (byte) 0);
        setIntField(term26420, term26420.getClass(), "exp", 0);
        setByteField(term26420, term26420.getClass(), "nans", (byte) 0);
        setField(term26420, term26420.getClass(), "field", null);
        setField(term26374, term26374.getClass(), "one", term26420);
        setField(term26374, term26374.getClass(), "two", term26401);
        setField(term26374, term26374.getClass(), "sqr2", term26376);
        setField(term26374, term26374.getClass(), "sqr2Split", term26424);
        setField(term26374, term26374.getClass(), "sqr2Reciprocal", term26411);
        setField(term26374, term26374.getClass(), "sqr3", term26376);
        setField(term26374, term26374.getClass(), "sqr3Reciprocal", term26405);
        setField(term26374, term26374.getClass(), "pi", term26396);
        setElement(term26425, 0, term26401);
        setElement(term26425, 1, term26396);
        setField(term26374, term26374.getClass(), "piSplit", term26425);
        setField(term26374, term26374.getClass(), "e", term26420);
        setElement(term26426, 0, term26420);
        setElement(term26426, 1, term26392);
        setElement(term26426, 2, term26360);
        setElement(term26426, 3, term26360);
        setElement(term26426, 4, term26384);
        setElement(term26426, 5, term26376);
        setElement(term26426, 6, term26420);
        setElement(term26426, 7, term26376);
        setField(term26374, term26374.getClass(), "eSplit", term26426);
        setField(term26374, term26374.getClass(), "ln2", term26388);
        setElement(term26427, 0, term26392);
        setElement(term26427, 1, term26388);
        setElement(term26427, 2, term26401);
        setElement(term26427, 3, term26392);
        setField(term26374, term26374.getClass(), "ln2Split", term26427);
        setField(term26374, term26374.getClass(), "ln5", term26405);
        setField(term26374, term26374.getClass(), "ln5Split", term26428);
        setField(term26374, term26374.getClass(), "ln10", term26401);
        setField(term26374, term26374.getClass(), "rMode", enum77);
        setIntField(term26374, term26374.getClass(), "ieeeFlags", -2137419728);
        setField(term26360, term26360.getClass(), "field", term26374);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.dfp.Dfp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "intValue", argTypes, term26360, args);
    }

};


