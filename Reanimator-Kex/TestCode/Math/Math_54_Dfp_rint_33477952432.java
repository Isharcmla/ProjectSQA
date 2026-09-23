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

public class Dfp_rint_33477952432 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22667;

    public Dfp_rint_33477952432() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term22771 = Class.forName((String) "org.apache.commons.math.dfp.DfpField$RoundingMode");
        Field term22770 = ((Class) term22771).getDeclaredField((String) "ROUND_FLOOR");
        ((Field) term22770).setAccessible(true);
        Object enum66 = ((Field) term22770).get((Object) null);
        Class<? extends Object> term23056 = Class.forName((String) "org.apache.commons.math.dfp.DfpField$RoundingMode");
        Field term23055 = ((Class) term23056).getDeclaredField((String) "ROUND_HALF_UP");
        ((Field) term23055).setAccessible(true);
        Object enum67 = ((Field) term23055).get((Object) null);
        term22667 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        int[] term22668 = (int[]) newIntArray(5);
        Object term22677 = newInstance(Class.forName("org.apache.commons.math.dfp.DfpField"));
        Object term22679 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        int[] term22680 = (int[]) newIntArray(8);
        Object term22692 = newInstance(Class.forName("org.apache.commons.math.dfp.DfpField"));
        Object term22694 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object term22698 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object term22702 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object[] term22706 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 0);
        Object term22707 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object term22711 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object term22715 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object[] term22719 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 6);
        Object[] term22720 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 6);
        Object[] term22721 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 0);
        Object[] term22722 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 4);
        Object term22723 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object[] term22730 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 9);
        Object term22731 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object[] term22735 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 3);
        Object[] term22736 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 2);
        Object[] term22737 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 0);
        Object[] term22738 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 2);
        setIntElement(term22668, 0, 1235045850);
        setIntElement(term22668, 1, -75143033);
        setIntElement(term22668, 2, 797015478);
        setIntElement(term22668, 3, 717574276);
        setIntElement(term22668, 4, 1795369860);
        setField(term22667, term22667.getClass(), "mant", term22668);
        setByteField(term22667, term22667.getClass(), "sign", (byte) 121);
        setIntField(term22667, term22667.getClass(), "exp", -570164389);
        setByteField(term22667, term22667.getClass(), "nans", (byte) -17);
        setIntField(term22677, term22677.getClass(), "radixDigits", 43200329);
        setIntElement(term22680, 0, 998679955);
        setIntElement(term22680, 1, 953741504);
        setIntElement(term22680, 2, 1389452261);
        setIntElement(term22680, 3, 1615957955);
        setIntElement(term22680, 4, 1779370220);
        setIntElement(term22680, 5, -1716046610);
        setIntElement(term22680, 6, 65264024);
        setIntElement(term22680, 7, -252449812);
        setField(term22679, term22679.getClass(), "mant", term22680);
        setByteField(term22679, term22679.getClass(), "sign", (byte) -76);
        setIntField(term22679, term22679.getClass(), "exp", -1885268968);
        setByteField(term22679, term22679.getClass(), "nans", (byte) -46);
        setIntField(term22692, term22692.getClass(), "radixDigits", 277855691);
        setField(term22694, term22694.getClass(), "mant", null);
        setByteField(term22694, term22694.getClass(), "sign", (byte) -105);
        setIntField(term22694, term22694.getClass(), "exp", -979568);
        setByteField(term22694, term22694.getClass(), "nans", (byte) 35);
        setField(term22694, term22694.getClass(), "field", null);
        setField(term22692, term22692.getClass(), "zero", term22694);
        setField(term22698, term22698.getClass(), "mant", null);
        setByteField(term22698, term22698.getClass(), "sign", (byte) 0);
        setIntField(term22698, term22698.getClass(), "exp", 0);
        setByteField(term22698, term22698.getClass(), "nans", (byte) 0);
        setField(term22698, term22698.getClass(), "field", null);
        setField(term22692, term22692.getClass(), "one", term22698);
        setField(term22702, term22702.getClass(), "mant", null);
        setByteField(term22702, term22702.getClass(), "sign", (byte) 0);
        setIntField(term22702, term22702.getClass(), "exp", 0);
        setByteField(term22702, term22702.getClass(), "nans", (byte) 0);
        setField(term22702, term22702.getClass(), "field", null);
        setField(term22692, term22692.getClass(), "two", term22702);
        setField(term22692, term22692.getClass(), "sqr2", term22702);
        setField(term22692, term22692.getClass(), "sqr2Split", term22706);
        setField(term22707, term22707.getClass(), "mant", null);
        setByteField(term22707, term22707.getClass(), "sign", (byte) 0);
        setIntField(term22707, term22707.getClass(), "exp", 0);
        setByteField(term22707, term22707.getClass(), "nans", (byte) 0);
        setField(term22707, term22707.getClass(), "field", null);
        setField(term22692, term22692.getClass(), "sqr2Reciprocal", term22707);
        setField(term22711, term22711.getClass(), "mant", null);
        setByteField(term22711, term22711.getClass(), "sign", (byte) 0);
        setIntField(term22711, term22711.getClass(), "exp", 0);
        setByteField(term22711, term22711.getClass(), "nans", (byte) 0);
        setField(term22711, term22711.getClass(), "field", null);
        setField(term22692, term22692.getClass(), "sqr3", term22711);
        setField(term22692, term22692.getClass(), "sqr3Reciprocal", term22679);
        setField(term22715, term22715.getClass(), "mant", null);
        setByteField(term22715, term22715.getClass(), "sign", (byte) 0);
        setIntField(term22715, term22715.getClass(), "exp", 0);
        setByteField(term22715, term22715.getClass(), "nans", (byte) 0);
        setField(term22715, term22715.getClass(), "field", null);
        setField(term22692, term22692.getClass(), "pi", term22715);
        setElement(term22719, 0, term22702);
        setElement(term22719, 2, term22707);
        setElement(term22719, 3, term22679);
        setElement(term22719, 4, term22711);
        setElement(term22719, 5, term22702);
        setField(term22692, term22692.getClass(), "piSplit", term22719);
        setField(term22692, term22692.getClass(), "e", term22679);
        setElement(term22720, 0, term22698);
        setElement(term22720, 2, term22694);
        setElement(term22720, 3, term22679);
        setElement(term22720, 5, term22715);
        setField(term22692, term22692.getClass(), "eSplit", term22720);
        setField(term22692, term22692.getClass(), "ln2", term22667);
        setField(term22692, term22692.getClass(), "ln2Split", term22721);
        setField(term22692, term22692.getClass(), "ln5", term22707);
        setElement(term22722, 1, term22711);
        setField(term22692, term22692.getClass(), "ln5Split", term22722);
        setField(term22723, term22723.getClass(), "mant", null);
        setByteField(term22723, term22723.getClass(), "sign", (byte) 0);
        setIntField(term22723, term22723.getClass(), "exp", 0);
        setByteField(term22723, term22723.getClass(), "nans", (byte) 0);
        setField(term22723, term22723.getClass(), "field", null);
        setField(term22692, term22692.getClass(), "ln10", term22723);
        setField(term22692, term22692.getClass(), "rMode", enum66);
        setIntField(term22692, term22692.getClass(), "ieeeFlags", -830170410);
        setField(term22679, term22679.getClass(), "field", term22692);
        setField(term22677, term22677.getClass(), "zero", term22679);
        setField(term22677, term22677.getClass(), "one", term22694);
        setField(term22677, term22677.getClass(), "two", term22702);
        setField(term22677, term22677.getClass(), "sqr2", term22715);
        setElement(term22730, 0, term22698);
        setElement(term22730, 1, term22679);
        setField(term22731, term22731.getClass(), "mant", null);
        setByteField(term22731, term22731.getClass(), "sign", (byte) 0);
        setIntField(term22731, term22731.getClass(), "exp", 0);
        setByteField(term22731, term22731.getClass(), "nans", (byte) 0);
        setField(term22731, term22731.getClass(), "field", null);
        setElement(term22730, 2, term22731);
        setElement(term22730, 3, term22679);
        setElement(term22730, 4, term22723);
        setElement(term22730, 5, term22711);
        setElement(term22730, 6, term22698);
        setElement(term22730, 7, term22711);
        setElement(term22730, 8, term22715);
        setField(term22677, term22677.getClass(), "sqr2Split", term22730);
        setField(term22677, term22677.getClass(), "sqr2Reciprocal", term22715);
        setField(term22677, term22677.getClass(), "sqr3", term22707);
        setField(term22677, term22677.getClass(), "sqr3Reciprocal", term22667);
        setField(term22677, term22677.getClass(), "pi", term22667);
        setElement(term22735, 0, term22694);
        setElement(term22735, 1, term22679);
        setElement(term22735, 2, term22715);
        setField(term22677, term22677.getClass(), "piSplit", term22735);
        setField(term22677, term22677.getClass(), "e", term22679);
        setElement(term22736, 0, term22702);
        setElement(term22736, 1, term22707);
        setField(term22677, term22677.getClass(), "eSplit", term22736);
        setField(term22677, term22677.getClass(), "ln2", term22702);
        setField(term22677, term22677.getClass(), "ln2Split", term22737);
        setField(term22677, term22677.getClass(), "ln5", term22698);
        setElement(term22738, 0, term22707);
        setElement(term22738, 1, term22723);
        setField(term22677, term22677.getClass(), "ln5Split", term22738);
        setField(term22677, term22677.getClass(), "ln10", term22698);
        setField(term22677, term22677.getClass(), "rMode", enum67);
        setIntField(term22677, term22677.getClass(), "ieeeFlags", -1742790308);
        setField(term22667, term22667.getClass(), "field", term22677);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.dfp.Dfp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "rint", argTypes, term22667, args);
    }

};


