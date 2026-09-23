package org.apache.commons.math3.analysis.differentiation;

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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.apache.commons.math3.analysis.differentiation.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class DSCompiler_remainder_105240656168 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11263;
     Object term11370;
     Object term11372;
     Object term11374;
     Object term11381;
     Object term11383;
     Object term11386;

    public DSCompiler_remainder_105240656168() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11263 = newInstance(Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        Object[] term11266 = (Object[]) newArray("[I", 1);
        int[] term11267 = (int[]) newIntArray(2);
        Object[] term11270 = (Object[]) newArray("[I", 4);
        int[] term11271 = (int[]) newIntArray(3);
        int[] term11275 = (int[]) newIntArray(9);
        int[] term11285 = (int[]) newIntArray(1);
        int[] term11287 = (int[]) newIntArray(4);
        int[] term11292 = (int[]) newIntArray(2);
        Object[] term11295 = (Object[]) newArray("[[I", 1);
        Object[] term11296 = (Object[]) newArray("[I", 4);
        int[] term11297 = (int[]) newIntArray(8);
        int[] term11306 = (int[]) newIntArray(3);
        int[] term11310 = (int[]) newIntArray(2);
        int[] term11313 = (int[]) newIntArray(7);
        Object[] term11321 = (Object[]) newArray("[[I", 2);
        Object[] term11322 = (Object[]) newArray("[I", 6);
        int[] term11323 = (int[]) newIntArray(0);
        int[] term11324 = (int[]) newIntArray(6);
        int[] term11331 = (int[]) newIntArray(8);
        int[] term11340 = (int[]) newIntArray(6);
        int[] term11347 = (int[]) newIntArray(5);
        int[] term11353 = (int[]) newIntArray(1);
        Object[] term11355 = (Object[]) newArray("[I", 4);
        int[] term11356 = (int[]) newIntArray(0);
        int[] term11357 = (int[]) newIntArray(6);
        int[] term11364 = (int[]) newIntArray(4);
        int[] term11369 = (int[]) newIntArray(0);
        setIntField(term11263, term11263.getClass(), "parameters", -80072701);
        setIntField(term11263, term11263.getClass(), "order", -224845635);
        setIntElement(term11267, 0, 115902179);
        setIntElement(term11267, 1, 930979700);
        setElement(term11266, 0, term11267);
        setField(term11263, term11263.getClass(), "sizes", term11266);
        setIntElement(term11271, 0, 630565003);
        setIntElement(term11271, 1, -1966988507);
        setIntElement(term11271, 2, -1089838622);
        setElement(term11270, 0, term11271);
        setIntElement(term11275, 0, -937178869);
        setIntElement(term11275, 1, -1952449836);
        setIntElement(term11275, 2, -405260008);
        setIntElement(term11275, 3, -468459707);
        setIntElement(term11275, 4, -1652639905);
        setIntElement(term11275, 5, -1461889742);
        setIntElement(term11275, 6, 1948939030);
        setIntElement(term11275, 7, -1707167847);
        setIntElement(term11275, 8, 1083097092);
        setElement(term11270, 1, term11275);
        setIntElement(term11285, 0, -352580386);
        setElement(term11270, 2, term11285);
        setIntElement(term11287, 0, 1000158617);
        setIntElement(term11287, 1, 776700097);
        setIntElement(term11287, 2, -147634418);
        setIntElement(term11287, 3, 1734729002);
        setElement(term11270, 3, term11287);
        setField(term11263, term11263.getClass(), "derivativesIndirection", term11270);
        setIntElement(term11292, 0, 356178482);
        setIntElement(term11292, 1, 2114777679);
        setField(term11263, term11263.getClass(), "lowerIndirection", term11292);
        setIntElement(term11297, 0, 877149909);
        setIntElement(term11297, 1, -649501188);
        setIntElement(term11297, 2, 2143993585);
        setIntElement(term11297, 3, -2067989740);
        setIntElement(term11297, 4, 229990395);
        setIntElement(term11297, 5, -1374118535);
        setIntElement(term11297, 6, 2009032714);
        setIntElement(term11297, 7, -1630891015);
        setElement(term11296, 0, term11297);
        setIntElement(term11306, 0, 904551854);
        setIntElement(term11306, 1, -49272576);
        setIntElement(term11306, 2, 246585268);
        setElement(term11296, 1, term11306);
        setIntElement(term11310, 0, 1163312144);
        setIntElement(term11310, 1, 1010014762);
        setElement(term11296, 2, term11310);
        setIntElement(term11313, 0, -416886439);
        setIntElement(term11313, 1, -1632599980);
        setIntElement(term11313, 2, -445306395);
        setIntElement(term11313, 3, -1543037055);
        setIntElement(term11313, 4, -150763986);
        setIntElement(term11313, 5, 1946252506);
        setIntElement(term11313, 6, -1279902182);
        setElement(term11296, 3, term11313);
        setElement(term11295, 0, term11296);
        setField(term11263, term11263.getClass(), "multIndirection", term11295);
        setElement(term11322, 0, term11323);
        setIntElement(term11324, 0, -551427938);
        setIntElement(term11324, 1, 1334551737);
        setIntElement(term11324, 2, -1187792021);
        setIntElement(term11324, 3, 1724189490);
        setIntElement(term11324, 4, -850819450);
        setIntElement(term11324, 5, 1652716990);
        setElement(term11322, 1, term11324);
        setIntElement(term11331, 0, 958228032);
        setIntElement(term11331, 1, 624789164);
        setIntElement(term11331, 2, 117919201);
        setIntElement(term11331, 3, 1389237948);
        setIntElement(term11331, 4, 866670285);
        setIntElement(term11331, 5, -2004076717);
        setIntElement(term11331, 6, -1695237959);
        setIntElement(term11331, 7, 1317356126);
        setElement(term11322, 2, term11331);
        setIntElement(term11340, 0, 2058932005);
        setIntElement(term11340, 1, -773196588);
        setIntElement(term11340, 2, -1082451840);
        setIntElement(term11340, 3, 120368183);
        setIntElement(term11340, 4, 1721841052);
        setIntElement(term11340, 5, -1801745263);
        setElement(term11322, 3, term11340);
        setIntElement(term11347, 0, 1232286807);
        setIntElement(term11347, 1, -507386961);
        setIntElement(term11347, 2, -476320083);
        setIntElement(term11347, 3, -2100928588);
        setIntElement(term11347, 4, -81621107);
        setElement(term11322, 4, term11347);
        setIntElement(term11353, 0, -1617104329);
        setElement(term11322, 5, term11353);
        setElement(term11321, 0, term11322);
        setElement(term11355, 0, term11356);
        setIntElement(term11357, 0, -34705122);
        setIntElement(term11357, 1, 1705528966);
        setIntElement(term11357, 2, 988288101);
        setIntElement(term11357, 3, -1408161596);
        setIntElement(term11357, 4, 1726412898);
        setIntElement(term11357, 5, -669874944);
        setElement(term11355, 1, term11357);
        setIntElement(term11364, 0, -1111349476);
        setIntElement(term11364, 1, 742969465);
        setIntElement(term11364, 2, -1810335427);
        setIntElement(term11364, 3, 803994786);
        setElement(term11355, 2, term11364);
        setElement(term11355, 3, term11369);
        setElement(term11321, 1, term11355);
        setField(term11263, term11263.getClass(), "compIndirection", term11321);
        term11370 = (double[]) newDoubleArray(1);
        setDoubleElement(term11370, 0, 0.0865998004187658);
        term11372 = new Integer(-1141611223);
        term11374 = (double[]) newDoubleArray(6);
        setDoubleElement(term11374, 0, 0.9628647861255637);
        setDoubleElement(term11374, 1, 0.623231822150205);
        setDoubleElement(term11374, 2, 0.09037487793444521);
        setDoubleElement(term11374, 3, 0.6561919196821765);
        setDoubleElement(term11374, 4, 0.7330178886612495);
        setDoubleElement(term11374, 5, 0.7618164754425794);
        term11381 = new Integer(-1637961050);
        term11383 = (double[]) newDoubleArray(2);
        setDoubleElement(term11383, 0, 0.7385589312559342);
        setDoubleElement(term11383, 1, 0.7080134263823477);
        term11386 = new Integer(1515109550);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = Array.newInstance(double.class, 0).getClass();
        argTypes[3] = int.class;
        argTypes[4] = Array.newInstance(double.class, 0).getClass();
        argTypes[5] = int.class;
        Object[] args = new Object[6];
        args[0] = term11370;
        args[1] = term11372;
        args[2] = term11374;
        args[3] = term11381;
        args[4] = term11383;
        args[5] = term11386;
        try {
            callMethod(klass, "remainder", argTypes, term11263, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


