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

public class Dfp_sqrt_29864304151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36664;

    public Dfp_sqrt_29864304151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term36768 = Class.forName((String) "org.apache.commons.math.dfp.DfpField$RoundingMode");
        Field term36767 = ((Class) term36768).getDeclaredField((String) "ROUND_HALF_DOWN");
        ((Field) term36767).setAccessible(true);
        Object enum107 = ((Field) term36767).get((Object) null);
        Class<? extends Object> term37065 = Class.forName((String) "org.apache.commons.math.dfp.DfpField$RoundingMode");
        Field term37064 = ((Class) term37065).getDeclaredField((String) "ROUND_HALF_EVEN");
        ((Field) term37064).setAccessible(true);
        Object enum108 = ((Field) term37064).get((Object) null);
        term36664 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        int[] term36665 = (int[]) newIntArray(9);
        Object term36678 = newInstance(Class.forName("org.apache.commons.math.dfp.DfpField"));
        Object term36680 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        int[] term36681 = (int[]) newIntArray(3);
        Object term36688 = newInstance(Class.forName("org.apache.commons.math.dfp.DfpField"));
        Object term36690 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object term36694 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object term36698 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object[] term36702 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 3);
        Object term36703 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object term36707 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object[] term36711 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 1);
        Object[] term36712 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 7);
        Object term36713 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object[] term36717 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 0);
        Object[] term36718 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 0);
        Object term36719 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object[] term36726 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 3);
        Object[] term36727 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 0);
        Object[] term36728 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 8);
        Object term36729 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object[] term36733 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 3);
        Object[] term36734 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 3);
        setIntElement(term36665, 0, 1846078344);
        setIntElement(term36665, 1, 1692543802);
        setIntElement(term36665, 2, 376341151);
        setIntElement(term36665, 3, -1607267243);
        setIntElement(term36665, 4, 1641377218);
        setIntElement(term36665, 5, 1235375204);
        setIntElement(term36665, 6, 258334639);
        setIntElement(term36665, 7, 1432187207);
        setIntElement(term36665, 8, -91068927);
        setField(term36664, term36664.getClass(), "mant", term36665);
        setByteField(term36664, term36664.getClass(), "sign", (byte) 82);
        setIntField(term36664, term36664.getClass(), "exp", 680714112);
        setByteField(term36664, term36664.getClass(), "nans", (byte) -127);
        setIntField(term36678, term36678.getClass(), "radixDigits", 385297023);
        setIntElement(term36681, 0, -134092543);
        setIntElement(term36681, 1, -1703642288);
        setIntElement(term36681, 2, 2075139747);
        setField(term36680, term36680.getClass(), "mant", term36681);
        setByteField(term36680, term36680.getClass(), "sign", (byte) 98);
        setIntField(term36680, term36680.getClass(), "exp", 2092881418);
        setByteField(term36680, term36680.getClass(), "nans", (byte) 11);
        setIntField(term36688, term36688.getClass(), "radixDigits", 1732410866);
        setField(term36690, term36690.getClass(), "mant", null);
        setByteField(term36690, term36690.getClass(), "sign", (byte) 97);
        setIntField(term36690, term36690.getClass(), "exp", -1897199214);
        setByteField(term36690, term36690.getClass(), "nans", (byte) -9);
        setField(term36690, term36690.getClass(), "field", null);
        setField(term36688, term36688.getClass(), "zero", term36690);
        setField(term36688, term36688.getClass(), "one", term36680);
        setField(term36694, term36694.getClass(), "mant", null);
        setByteField(term36694, term36694.getClass(), "sign", (byte) 0);
        setIntField(term36694, term36694.getClass(), "exp", 0);
        setByteField(term36694, term36694.getClass(), "nans", (byte) 0);
        setField(term36694, term36694.getClass(), "field", null);
        setField(term36688, term36688.getClass(), "two", term36694);
        setField(term36698, term36698.getClass(), "mant", null);
        setByteField(term36698, term36698.getClass(), "sign", (byte) 0);
        setIntField(term36698, term36698.getClass(), "exp", 0);
        setByteField(term36698, term36698.getClass(), "nans", (byte) 0);
        setField(term36698, term36698.getClass(), "field", null);
        setField(term36688, term36688.getClass(), "sqr2", term36698);
        setElement(term36702, 2, term36680);
        setField(term36688, term36688.getClass(), "sqr2Split", term36702);
        setField(term36703, term36703.getClass(), "mant", null);
        setByteField(term36703, term36703.getClass(), "sign", (byte) 0);
        setIntField(term36703, term36703.getClass(), "exp", 0);
        setByteField(term36703, term36703.getClass(), "nans", (byte) 0);
        setField(term36703, term36703.getClass(), "field", null);
        setField(term36688, term36688.getClass(), "sqr2Reciprocal", term36703);
        setField(term36688, term36688.getClass(), "sqr3", term36698);
        setField(term36688, term36688.getClass(), "sqr3Reciprocal", term36680);
        setField(term36707, term36707.getClass(), "mant", null);
        setByteField(term36707, term36707.getClass(), "sign", (byte) 0);
        setIntField(term36707, term36707.getClass(), "exp", 0);
        setByteField(term36707, term36707.getClass(), "nans", (byte) 0);
        setField(term36707, term36707.getClass(), "field", null);
        setField(term36688, term36688.getClass(), "pi", term36707);
        setField(term36688, term36688.getClass(), "piSplit", term36711);
        setField(term36688, term36688.getClass(), "e", term36690);
        setElement(term36712, 0, term36680);
        setElement(term36712, 2, term36694);
        setElement(term36712, 3, term36664);
        setElement(term36712, 6, term36703);
        setField(term36688, term36688.getClass(), "eSplit", term36712);
        setField(term36713, term36713.getClass(), "mant", null);
        setByteField(term36713, term36713.getClass(), "sign", (byte) 0);
        setIntField(term36713, term36713.getClass(), "exp", 0);
        setByteField(term36713, term36713.getClass(), "nans", (byte) 0);
        setField(term36713, term36713.getClass(), "field", null);
        setField(term36688, term36688.getClass(), "ln2", term36713);
        setField(term36688, term36688.getClass(), "ln2Split", term36717);
        setField(term36688, term36688.getClass(), "ln5", term36713);
        setField(term36688, term36688.getClass(), "ln5Split", term36718);
        setField(term36719, term36719.getClass(), "mant", null);
        setByteField(term36719, term36719.getClass(), "sign", (byte) 0);
        setIntField(term36719, term36719.getClass(), "exp", 0);
        setByteField(term36719, term36719.getClass(), "nans", (byte) 0);
        setField(term36719, term36719.getClass(), "field", null);
        setField(term36688, term36688.getClass(), "ln10", term36719);
        setField(term36688, term36688.getClass(), "rMode", enum107);
        setIntField(term36688, term36688.getClass(), "ieeeFlags", 638046409);
        setField(term36680, term36680.getClass(), "field", term36688);
        setField(term36678, term36678.getClass(), "zero", term36680);
        setField(term36678, term36678.getClass(), "one", term36690);
        setField(term36678, term36678.getClass(), "two", term36698);
        setField(term36678, term36678.getClass(), "sqr2", term36694);
        setElement(term36726, 0, term36707);
        setElement(term36726, 1, term36680);
        setElement(term36726, 2, term36713);
        setField(term36678, term36678.getClass(), "sqr2Split", term36726);
        setField(term36678, term36678.getClass(), "sqr2Reciprocal", term36680);
        setField(term36678, term36678.getClass(), "sqr3", term36719);
        setField(term36678, term36678.getClass(), "sqr3Reciprocal", term36703);
        setField(term36678, term36678.getClass(), "pi", term36707);
        setField(term36678, term36678.getClass(), "piSplit", term36727);
        setField(term36678, term36678.getClass(), "e", term36703);
        setElement(term36728, 0, term36694);
        setElement(term36728, 1, term36694);
        setField(term36729, term36729.getClass(), "mant", null);
        setByteField(term36729, term36729.getClass(), "sign", (byte) 0);
        setIntField(term36729, term36729.getClass(), "exp", 0);
        setByteField(term36729, term36729.getClass(), "nans", (byte) 0);
        setField(term36729, term36729.getClass(), "field", null);
        setElement(term36728, 2, term36729);
        setElement(term36728, 3, term36664);
        setElement(term36728, 4, term36664);
        setElement(term36728, 5, term36690);
        setElement(term36728, 6, term36680);
        setElement(term36728, 7, term36694);
        setField(term36678, term36678.getClass(), "eSplit", term36728);
        setField(term36678, term36678.getClass(), "ln2", term36680);
        setElement(term36733, 0, term36698);
        setElement(term36733, 1, term36729);
        setElement(term36733, 2, term36698);
        setField(term36678, term36678.getClass(), "ln2Split", term36733);
        setField(term36678, term36678.getClass(), "ln5", term36707);
        setElement(term36734, 0, term36729);
        setElement(term36734, 1, term36719);
        setElement(term36734, 2, term36707);
        setField(term36678, term36678.getClass(), "ln5Split", term36734);
        setField(term36678, term36678.getClass(), "ln10", term36719);
        setField(term36678, term36678.getClass(), "rMode", enum108);
        setIntField(term36678, term36678.getClass(), "ieeeFlags", 427274898);
        setField(term36664, term36664.getClass(), "field", term36678);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.dfp.Dfp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "sqrt", argTypes, term36664, args);
    }

};


