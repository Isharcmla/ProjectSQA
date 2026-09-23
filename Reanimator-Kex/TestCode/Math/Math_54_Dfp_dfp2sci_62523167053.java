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

public class Dfp_dfp2sci_62523167053 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38017;

    public Dfp_dfp2sci_62523167053() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term38109 = Class.forName((String) "org.apache.commons.math.dfp.DfpField$RoundingMode");
        Field term38108 = ((Class) term38109).getDeclaredField((String) "ROUND_HALF_ODD");
        ((Field) term38108).setAccessible(true);
        Object enum111 = ((Field) term38108).get((Object) null);
        Class<? extends Object> term38403 = Class.forName((String) "org.apache.commons.math.dfp.DfpField$RoundingMode");
        Field term38402 = ((Class) term38403).getDeclaredField((String) "ROUND_HALF_EVEN");
        ((Field) term38402).setAccessible(true);
        Object enum112 = ((Field) term38402).get((Object) null);
        term38017 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        int[] term38018 = (int[]) newIntArray(4);
        Object term38026 = newInstance(Class.forName("org.apache.commons.math.dfp.DfpField"));
        Object term38028 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        int[] term38029 = (int[]) newIntArray(2);
        Object term38035 = newInstance(Class.forName("org.apache.commons.math.dfp.DfpField"));
        Object term38037 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object term38041 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object[] term38045 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 5);
        Object term38046 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object term38050 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object term38054 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object[] term38058 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 4);
        Object[] term38059 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 1);
        Object[] term38060 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 1);
        Object term38061 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object[] term38065 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 4);
        Object term38069 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object[] term38073 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 8);
        Object term38074 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object[] term38078 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 0);
        Object[] term38079 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 1);
        Object[] term38080 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 7);
        Object[] term38081 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 5);
        setIntElement(term38018, 0, 694989162);
        setIntElement(term38018, 1, -65504209);
        setIntElement(term38018, 2, 1745199030);
        setIntElement(term38018, 3, -1440013173);
        setField(term38017, term38017.getClass(), "mant", term38018);
        setByteField(term38017, term38017.getClass(), "sign", (byte) -12);
        setIntField(term38017, term38017.getClass(), "exp", -288126597);
        setByteField(term38017, term38017.getClass(), "nans", (byte) 13);
        setIntField(term38026, term38026.getClass(), "radixDigits", -218831961);
        setIntElement(term38029, 0, 826765055);
        setIntElement(term38029, 1, 1358117317);
        setField(term38028, term38028.getClass(), "mant", term38029);
        setByteField(term38028, term38028.getClass(), "sign", (byte) -41);
        setIntField(term38028, term38028.getClass(), "exp", 229989439);
        setByteField(term38028, term38028.getClass(), "nans", (byte) 9);
        setIntField(term38035, term38035.getClass(), "radixDigits", -1620126913);
        setField(term38037, term38037.getClass(), "mant", null);
        setByteField(term38037, term38037.getClass(), "sign", (byte) 26);
        setIntField(term38037, term38037.getClass(), "exp", 1297035285);
        setByteField(term38037, term38037.getClass(), "nans", (byte) 125);
        setField(term38037, term38037.getClass(), "field", null);
        setField(term38035, term38035.getClass(), "zero", term38037);
        setField(term38041, term38041.getClass(), "mant", null);
        setByteField(term38041, term38041.getClass(), "sign", (byte) 0);
        setIntField(term38041, term38041.getClass(), "exp", 0);
        setByteField(term38041, term38041.getClass(), "nans", (byte) 0);
        setField(term38041, term38041.getClass(), "field", null);
        setField(term38035, term38035.getClass(), "one", term38041);
        setField(term38035, term38035.getClass(), "two", term38041);
        setField(term38035, term38035.getClass(), "sqr2", term38028);
        setElement(term38045, 4, term38037);
        setField(term38035, term38035.getClass(), "sqr2Split", term38045);
        setField(term38046, term38046.getClass(), "mant", null);
        setByteField(term38046, term38046.getClass(), "sign", (byte) 0);
        setIntField(term38046, term38046.getClass(), "exp", 0);
        setByteField(term38046, term38046.getClass(), "nans", (byte) 0);
        setField(term38046, term38046.getClass(), "field", null);
        setField(term38035, term38035.getClass(), "sqr2Reciprocal", term38046);
        setField(term38050, term38050.getClass(), "mant", null);
        setByteField(term38050, term38050.getClass(), "sign", (byte) 0);
        setIntField(term38050, term38050.getClass(), "exp", 0);
        setByteField(term38050, term38050.getClass(), "nans", (byte) 0);
        setField(term38050, term38050.getClass(), "field", null);
        setField(term38035, term38035.getClass(), "sqr3", term38050);
        setField(term38035, term38035.getClass(), "sqr3Reciprocal", term38028);
        setField(term38054, term38054.getClass(), "mant", null);
        setByteField(term38054, term38054.getClass(), "sign", (byte) 0);
        setIntField(term38054, term38054.getClass(), "exp", 0);
        setByteField(term38054, term38054.getClass(), "nans", (byte) 0);
        setField(term38054, term38054.getClass(), "field", null);
        setField(term38035, term38035.getClass(), "pi", term38054);
        setElement(term38058, 0, term38050);
        setElement(term38058, 1, term38050);
        setElement(term38058, 3, term38041);
        setField(term38035, term38035.getClass(), "piSplit", term38058);
        setField(term38035, term38035.getClass(), "e", term38028);
        setElement(term38059, 0, term38046);
        setField(term38035, term38035.getClass(), "eSplit", term38059);
        setField(term38035, term38035.getClass(), "ln2", term38050);
        setField(term38035, term38035.getClass(), "ln2Split", term38060);
        setField(term38061, term38061.getClass(), "mant", null);
        setByteField(term38061, term38061.getClass(), "sign", (byte) 0);
        setIntField(term38061, term38061.getClass(), "exp", 0);
        setByteField(term38061, term38061.getClass(), "nans", (byte) 0);
        setField(term38061, term38061.getClass(), "field", null);
        setField(term38035, term38035.getClass(), "ln5", term38061);
        setElement(term38065, 0, term38028);
        setElement(term38065, 1, term38041);
        setElement(term38065, 2, term38050);
        setElement(term38065, 3, term38028);
        setField(term38035, term38035.getClass(), "ln5Split", term38065);
        setField(term38035, term38035.getClass(), "ln10", term38054);
        setField(term38035, term38035.getClass(), "rMode", enum111);
        setIntField(term38035, term38035.getClass(), "ieeeFlags", 370671198);
        setField(term38028, term38028.getClass(), "field", term38035);
        setField(term38026, term38026.getClass(), "zero", term38028);
        setField(term38069, term38069.getClass(), "mant", null);
        setByteField(term38069, term38069.getClass(), "sign", (byte) 0);
        setIntField(term38069, term38069.getClass(), "exp", 0);
        setByteField(term38069, term38069.getClass(), "nans", (byte) 0);
        setField(term38069, term38069.getClass(), "field", null);
        setField(term38026, term38026.getClass(), "one", term38069);
        setField(term38026, term38026.getClass(), "two", term38037);
        setField(term38026, term38026.getClass(), "sqr2", term38028);
        setElement(term38073, 0, term38069);
        setElement(term38073, 1, term38046);
        setElement(term38073, 2, term38017);
        setElement(term38073, 3, term38061);
        setField(term38074, term38074.getClass(), "mant", null);
        setByteField(term38074, term38074.getClass(), "sign", (byte) 0);
        setIntField(term38074, term38074.getClass(), "exp", 0);
        setByteField(term38074, term38074.getClass(), "nans", (byte) 0);
        setField(term38074, term38074.getClass(), "field", null);
        setElement(term38073, 4, term38074);
        setElement(term38073, 5, term38041);
        setElement(term38073, 6, term38074);
        setElement(term38073, 7, term38074);
        setField(term38026, term38026.getClass(), "sqr2Split", term38073);
        setField(term38026, term38026.getClass(), "sqr2Reciprocal", term38069);
        setField(term38026, term38026.getClass(), "sqr3", term38037);
        setField(term38026, term38026.getClass(), "sqr3Reciprocal", term38050);
        setField(term38026, term38026.getClass(), "pi", term38046);
        setField(term38026, term38026.getClass(), "piSplit", term38078);
        setField(term38026, term38026.getClass(), "e", term38054);
        setElement(term38079, 0, term38028);
        setField(term38026, term38026.getClass(), "eSplit", term38079);
        setField(term38026, term38026.getClass(), "ln2", term38074);
        setElement(term38080, 0, term38028);
        setElement(term38080, 1, term38069);
        setElement(term38080, 2, term38041);
        setElement(term38080, 3, term38054);
        setElement(term38080, 4, term38041);
        setElement(term38080, 5, term38046);
        setElement(term38080, 6, term38046);
        setField(term38026, term38026.getClass(), "ln2Split", term38080);
        setField(term38026, term38026.getClass(), "ln5", term38061);
        setElement(term38081, 0, term38017);
        setElement(term38081, 1, term38017);
        setElement(term38081, 2, term38037);
        setElement(term38081, 3, term38028);
        setElement(term38081, 4, term38046);
        setField(term38026, term38026.getClass(), "ln5Split", term38081);
        setField(term38026, term38026.getClass(), "ln10", term38028);
        setField(term38026, term38026.getClass(), "rMode", enum112);
        setIntField(term38026, term38026.getClass(), "ieeeFlags", 1426800646);
        setField(term38017, term38017.getClass(), "field", term38026);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.dfp.Dfp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "dfp2sci", argTypes, term38017, args);
    }

};


