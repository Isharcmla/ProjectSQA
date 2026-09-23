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

public class Dfp_newInstance_194932798070 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4985;

    public Dfp_newInstance_194932798070() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term78933 = Class.forName((String) "org.apache.commons.math.dfp.DfpField$RoundingMode");
        Field term78932 = ((Class) term78933).getDeclaredField((String) "ROUND_FLOOR");
        ((Field) term78932).setAccessible(true);
        Object enum165 = ((Field) term78932).get((Object) null);
        term4985 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        int[] term4986 = (int[]) newIntArray(5);
        Object term4995 = newInstance(Class.forName("org.apache.commons.math.dfp.DfpField"));
        Object term4997 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        int[] term4998 = (int[]) newIntArray(1);
        Object term5003 = newInstance(Class.forName("org.apache.commons.math.dfp.DfpField"));
        Object term5005 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object term5009 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object term5013 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object[] term5017 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 7);
        Object term5018 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object term5022 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object[] term5026 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 8);
        Object[] term5027 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 9);
        Object[] term5028 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 5);
        Object term5029 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object[] term5033 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 9);
        Object term5034 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object[] term5041 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 9);
        Object term5042 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object[] term5046 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 6);
        Object[] term5047 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 1);
        Object[] term5048 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 5);
        Object[] term5049 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 3);
        setIntElement(term4986, 0, 937859191);
        setIntElement(term4986, 1, -916584829);
        setIntElement(term4986, 2, -2131181468);
        setIntElement(term4986, 3, 282916351);
        setIntElement(term4986, 4, 880977281);
        setField(term4985, term4985.getClass(), "mant", term4986);
        setByteField(term4985, term4985.getClass(), "sign", (byte) 14);
        setIntField(term4985, term4985.getClass(), "exp", 371943306);
        setByteField(term4985, term4985.getClass(), "nans", (byte) -101);
        setIntField(term4995, term4995.getClass(), "radixDigits", 982388293);
        setIntElement(term4998, 0, -159494544);
        setField(term4997, term4997.getClass(), "mant", term4998);
        setByteField(term4997, term4997.getClass(), "sign", (byte) 66);
        setIntField(term4997, term4997.getClass(), "exp", -75206835);
        setByteField(term4997, term4997.getClass(), "nans", (byte) 123);
        setIntField(term5003, term5003.getClass(), "radixDigits", -1618206977);
        setField(term5005, term5005.getClass(), "mant", null);
        setByteField(term5005, term5005.getClass(), "sign", (byte) 84);
        setIntField(term5005, term5005.getClass(), "exp", 1684998508);
        setByteField(term5005, term5005.getClass(), "nans", (byte) -97);
        setField(term5005, term5005.getClass(), "field", null);
        setField(term5003, term5003.getClass(), "zero", term5005);
        setField(term5009, term5009.getClass(), "mant", null);
        setByteField(term5009, term5009.getClass(), "sign", (byte) 0);
        setIntField(term5009, term5009.getClass(), "exp", 0);
        setByteField(term5009, term5009.getClass(), "nans", (byte) 0);
        setField(term5009, term5009.getClass(), "field", null);
        setField(term5003, term5003.getClass(), "one", term5009);
        setField(term5003, term5003.getClass(), "two", term4997);
        setField(term5013, term5013.getClass(), "mant", null);
        setByteField(term5013, term5013.getClass(), "sign", (byte) 0);
        setIntField(term5013, term5013.getClass(), "exp", 0);
        setByteField(term5013, term5013.getClass(), "nans", (byte) 0);
        setField(term5013, term5013.getClass(), "field", null);
        setField(term5003, term5003.getClass(), "sqr2", term5013);
        setElement(term5017, 1, term4997);
        setElement(term5017, 4, term5005);
        setElement(term5017, 5, term4997);
        setField(term5003, term5003.getClass(), "sqr2Split", term5017);
        setField(term5018, term5018.getClass(), "mant", null);
        setByteField(term5018, term5018.getClass(), "sign", (byte) 0);
        setIntField(term5018, term5018.getClass(), "exp", 0);
        setByteField(term5018, term5018.getClass(), "nans", (byte) 0);
        setField(term5018, term5018.getClass(), "field", null);
        setField(term5003, term5003.getClass(), "sqr2Reciprocal", term5018);
        setField(term5003, term5003.getClass(), "sqr3", term4985);
        setField(term5003, term5003.getClass(), "sqr3Reciprocal", term5009);
        setField(term5022, term5022.getClass(), "mant", null);
        setByteField(term5022, term5022.getClass(), "sign", (byte) 0);
        setIntField(term5022, term5022.getClass(), "exp", 0);
        setByteField(term5022, term5022.getClass(), "nans", (byte) 0);
        setField(term5022, term5022.getClass(), "field", null);
        setField(term5003, term5003.getClass(), "pi", term5022);
        setElement(term5026, 0, term5013);
        setElement(term5026, 1, term5022);
        setElement(term5026, 2, term5022);
        setElement(term5026, 4, term5005);
        setElement(term5026, 6, term5018);
        setField(term5003, term5003.getClass(), "piSplit", term5026);
        setField(term5003, term5003.getClass(), "e", term4997);
        setElement(term5027, 0, term5022);
        setElement(term5027, 1, term4997);
        setElement(term5027, 3, term5013);
        setElement(term5027, 5, term5013);
        setElement(term5027, 6, term5018);
        setElement(term5027, 7, term5018);
        setElement(term5027, 8, term5009);
        setField(term5003, term5003.getClass(), "eSplit", term5027);
        setField(term5003, term5003.getClass(), "ln2", term4985);
        setElement(term5028, 0, term4985);
        setElement(term5028, 1, term5005);
        setElement(term5028, 2, term4997);
        setElement(term5028, 3, term5018);
        setElement(term5028, 4, term4997);
        setField(term5003, term5003.getClass(), "ln2Split", term5028);
        setField(term5029, term5029.getClass(), "mant", null);
        setByteField(term5029, term5029.getClass(), "sign", (byte) 0);
        setIntField(term5029, term5029.getClass(), "exp", 0);
        setByteField(term5029, term5029.getClass(), "nans", (byte) 0);
        setField(term5029, term5029.getClass(), "field", null);
        setField(term5003, term5003.getClass(), "ln5", term5029);
        setElement(term5033, 0, term5009);
        setElement(term5033, 1, term5029);
        setElement(term5033, 3, term5009);
        setElement(term5033, 7, term5013);
        setField(term5003, term5003.getClass(), "ln5Split", term5033);
        setField(term5034, term5034.getClass(), "mant", null);
        setByteField(term5034, term5034.getClass(), "sign", (byte) 0);
        setIntField(term5034, term5034.getClass(), "exp", 0);
        setByteField(term5034, term5034.getClass(), "nans", (byte) 0);
        setField(term5034, term5034.getClass(), "field", null);
        setField(term5003, term5003.getClass(), "ln10", term5034);
        setField(term5003, term5003.getClass(), "rMode", enum165);
        setIntField(term5003, term5003.getClass(), "ieeeFlags", -1146679443);
        setField(term4997, term4997.getClass(), "field", term5003);
        setField(term4995, term4995.getClass(), "zero", term4997);
        setField(term4995, term4995.getClass(), "one", term5005);
        setField(term4995, term4995.getClass(), "two", term5022);
        setField(term4995, term4995.getClass(), "sqr2", term5018);
        setElement(term5041, 0, term4997);
        setElement(term5041, 1, term5013);
        setElement(term5041, 2, term5018);
        setElement(term5041, 3, term5005);
        setElement(term5041, 4, term5013);
        setField(term5042, term5042.getClass(), "mant", null);
        setByteField(term5042, term5042.getClass(), "sign", (byte) 0);
        setIntField(term5042, term5042.getClass(), "exp", 0);
        setByteField(term5042, term5042.getClass(), "nans", (byte) 0);
        setField(term5042, term5042.getClass(), "field", null);
        setElement(term5041, 5, term5042);
        setElement(term5041, 6, term5029);
        setElement(term5041, 7, term5042);
        setElement(term5041, 8, term5009);
        setField(term4995, term4995.getClass(), "sqr2Split", term5041);
        setField(term4995, term4995.getClass(), "sqr2Reciprocal", term5022);
        setField(term4995, term4995.getClass(), "sqr3", term4997);
        setField(term4995, term4995.getClass(), "sqr3Reciprocal", term5034);
        setField(term4995, term4995.getClass(), "pi", term4985);
        setElement(term5046, 0, term5022);
        setElement(term5046, 1, term5029);
        setElement(term5046, 2, term5029);
        setElement(term5046, 3, term4985);
        setElement(term5046, 4, term5034);
        setElement(term5046, 5, term5042);
        setField(term4995, term4995.getClass(), "piSplit", term5046);
        setField(term4995, term4995.getClass(), "e", term5013);
        setElement(term5047, 0, term5018);
        setField(term4995, term4995.getClass(), "eSplit", term5047);
        setField(term4995, term4995.getClass(), "ln2", term5029);
        setElement(term5048, 0, term5005);
        setElement(term5048, 1, term5018);
        setElement(term5048, 2, term5042);
        setElement(term5048, 3, term5009);
        setElement(term5048, 4, term5018);
        setField(term4995, term4995.getClass(), "ln2Split", term5048);
        setField(term4995, term4995.getClass(), "ln5", term4997);
        setElement(term5049, 0, term5042);
        setElement(term5049, 1, term4997);
        setElement(term5049, 2, term5009);
        setField(term4995, term4995.getClass(), "ln5Split", term5049);
        setField(term4995, term4995.getClass(), "ln10", term5018);
        setField(term4995, term4995.getClass(), "rMode", enum165);
        setIntField(term4995, term4995.getClass(), "ieeeFlags", -860131894);
        setField(term4985, term4985.getClass(), "field", term4995);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.dfp.Dfp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "newInstance", argTypes, term4985, args);
            assertTrue(false);
        }
        catch (OutOfMemoryError e) {
        }

    }

};


