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
import static org.apache.commons.math3.dfp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class Dfp_dfp2sci_204356839761 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44153;

    public Dfp_dfp2sci_204356839761() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term44220 = Class.forName((String) "org.apache.commons.math3.dfp.DfpField$RoundingMode");
        Field term44219 = ((Class) term44220).getDeclaredField((String) "ROUND_FLOOR");
        ((Field) term44219).setAccessible(true);
        Object enum127 = ((Field) term44219).get((Object) null);
        term44153 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        int[] term44154 = (int[]) newIntArray(1);
        Object term44159 = newInstance(Class.forName("org.apache.commons.math3.dfp.DfpField"));
        Object term44161 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        int[] term44162 = (int[]) newIntArray(2);
        Object term44168 = newInstance(Class.forName("org.apache.commons.math3.dfp.DfpField"));
        Object term44170 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object term44174 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object term44178 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object term44182 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object[] term44186 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 0);
        Object term44187 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object term44191 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object[] term44195 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 1);
        Object term44196 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object[] term44200 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 1);
        Object[] term44201 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 1);
        Object[] term44202 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 5);
        Object term44203 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object[] term44210 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 2);
        Object[] term44211 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 4);
        Object[] term44212 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 2);
        Object[] term44213 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 6);
        Object[] term44214 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 3);
        setIntElement(term44154, 0, 144872711);
        setField(term44153, term44153.getClass(), "mant", term44154);
        setByteField(term44153, term44153.getClass(), "sign", (byte) -119);
        setIntField(term44153, term44153.getClass(), "exp", -720037395);
        setByteField(term44153, term44153.getClass(), "nans", (byte) 65);
        setIntField(term44159, term44159.getClass(), "radixDigits", 1232105469);
        setIntElement(term44162, 0, -1547322575);
        setIntElement(term44162, 1, -61444233);
        setField(term44161, term44161.getClass(), "mant", term44162);
        setByteField(term44161, term44161.getClass(), "sign", (byte) -126);
        setIntField(term44161, term44161.getClass(), "exp", -400720912);
        setByteField(term44161, term44161.getClass(), "nans", (byte) 80);
        setIntField(term44168, term44168.getClass(), "radixDigits", 1266192397);
        setField(term44170, term44170.getClass(), "mant", null);
        setByteField(term44170, term44170.getClass(), "sign", (byte) -116);
        setIntField(term44170, term44170.getClass(), "exp", -2004794532);
        setByteField(term44170, term44170.getClass(), "nans", (byte) 85);
        setField(term44170, term44170.getClass(), "field", null);
        setField(term44168, term44168.getClass(), "zero", term44170);
        setField(term44174, term44174.getClass(), "mant", null);
        setByteField(term44174, term44174.getClass(), "sign", (byte) 0);
        setIntField(term44174, term44174.getClass(), "exp", 0);
        setByteField(term44174, term44174.getClass(), "nans", (byte) 0);
        setField(term44174, term44174.getClass(), "field", null);
        setField(term44168, term44168.getClass(), "one", term44174);
        setField(term44178, term44178.getClass(), "mant", null);
        setByteField(term44178, term44178.getClass(), "sign", (byte) 0);
        setIntField(term44178, term44178.getClass(), "exp", 0);
        setByteField(term44178, term44178.getClass(), "nans", (byte) 0);
        setField(term44178, term44178.getClass(), "field", null);
        setField(term44168, term44168.getClass(), "two", term44178);
        setField(term44182, term44182.getClass(), "mant", null);
        setByteField(term44182, term44182.getClass(), "sign", (byte) 0);
        setIntField(term44182, term44182.getClass(), "exp", 0);
        setByteField(term44182, term44182.getClass(), "nans", (byte) 0);
        setField(term44182, term44182.getClass(), "field", null);
        setField(term44168, term44168.getClass(), "sqr2", term44182);
        setField(term44168, term44168.getClass(), "sqr2Split", term44186);
        setField(term44187, term44187.getClass(), "mant", null);
        setByteField(term44187, term44187.getClass(), "sign", (byte) 0);
        setIntField(term44187, term44187.getClass(), "exp", 0);
        setByteField(term44187, term44187.getClass(), "nans", (byte) 0);
        setField(term44187, term44187.getClass(), "field", null);
        setField(term44168, term44168.getClass(), "sqr2Reciprocal", term44187);
        setField(term44168, term44168.getClass(), "sqr3", term44161);
        setField(term44191, term44191.getClass(), "mant", null);
        setByteField(term44191, term44191.getClass(), "sign", (byte) 0);
        setIntField(term44191, term44191.getClass(), "exp", 0);
        setByteField(term44191, term44191.getClass(), "nans", (byte) 0);
        setField(term44191, term44191.getClass(), "field", null);
        setField(term44168, term44168.getClass(), "sqr3Reciprocal", term44191);
        setField(term44168, term44168.getClass(), "pi", term44178);
        setElement(term44195, 0, term44161);
        setField(term44168, term44168.getClass(), "piSplit", term44195);
        setField(term44196, term44196.getClass(), "mant", null);
        setByteField(term44196, term44196.getClass(), "sign", (byte) 0);
        setIntField(term44196, term44196.getClass(), "exp", 0);
        setByteField(term44196, term44196.getClass(), "nans", (byte) 0);
        setField(term44196, term44196.getClass(), "field", null);
        setField(term44168, term44168.getClass(), "e", term44196);
        setElement(term44200, 0, term44182);
        setField(term44168, term44168.getClass(), "eSplit", term44200);
        setField(term44168, term44168.getClass(), "ln2", term44170);
        setElement(term44201, 0, term44161);
        setField(term44168, term44168.getClass(), "ln2Split", term44201);
        setField(term44168, term44168.getClass(), "ln5", term44182);
        setElement(term44202, 0, term44174);
        setElement(term44202, 1, term44153);
        setElement(term44202, 2, term44187);
        setElement(term44202, 4, term44191);
        setField(term44168, term44168.getClass(), "ln5Split", term44202);
        setField(term44203, term44203.getClass(), "mant", null);
        setByteField(term44203, term44203.getClass(), "sign", (byte) 0);
        setIntField(term44203, term44203.getClass(), "exp", 0);
        setByteField(term44203, term44203.getClass(), "nans", (byte) 0);
        setField(term44203, term44203.getClass(), "field", null);
        setField(term44168, term44168.getClass(), "ln10", term44203);
        setField(term44168, term44168.getClass(), "rMode", enum127);
        setIntField(term44168, term44168.getClass(), "ieeeFlags", -1786136772);
        setField(term44161, term44161.getClass(), "field", term44168);
        setField(term44159, term44159.getClass(), "zero", term44161);
        setField(term44159, term44159.getClass(), "one", term44203);
        setField(term44159, term44159.getClass(), "two", term44182);
        setField(term44159, term44159.getClass(), "sqr2", term44170);
        setElement(term44210, 0, term44178);
        setElement(term44210, 1, term44174);
        setField(term44159, term44159.getClass(), "sqr2Split", term44210);
        setField(term44159, term44159.getClass(), "sqr2Reciprocal", term44196);
        setField(term44159, term44159.getClass(), "sqr3", term44161);
        setField(term44159, term44159.getClass(), "sqr3Reciprocal", term44203);
        setField(term44159, term44159.getClass(), "pi", term44161);
        setElement(term44211, 0, term44182);
        setElement(term44211, 1, term44191);
        setElement(term44211, 2, term44196);
        setElement(term44211, 3, term44191);
        setField(term44159, term44159.getClass(), "piSplit", term44211);
        setField(term44159, term44159.getClass(), "e", term44174);
        setElement(term44212, 0, term44174);
        setElement(term44212, 1, term44187);
        setField(term44159, term44159.getClass(), "eSplit", term44212);
        setField(term44159, term44159.getClass(), "ln2", term44153);
        setElement(term44213, 0, term44153);
        setElement(term44213, 1, term44170);
        setElement(term44213, 2, term44161);
        setElement(term44213, 3, term44174);
        setElement(term44213, 4, term44161);
        setElement(term44213, 5, term44178);
        setField(term44159, term44159.getClass(), "ln2Split", term44213);
        setField(term44159, term44159.getClass(), "ln5", term44187);
        setElement(term44214, 0, term44178);
        setElement(term44214, 1, term44196);
        setElement(term44214, 2, term44187);
        setField(term44159, term44159.getClass(), "ln5Split", term44214);
        setField(term44159, term44159.getClass(), "ln10", term44182);
        setField(term44159, term44159.getClass(), "rMode", enum127);
        setIntField(term44159, term44159.getClass(), "ieeeFlags", -1510967747);
        setField(term44153, term44153.getClass(), "field", term44159);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.dfp.Dfp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "dfp2sci", argTypes, term44153, args);
    }

};


