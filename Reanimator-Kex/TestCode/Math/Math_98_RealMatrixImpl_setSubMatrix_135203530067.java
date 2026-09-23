package org.apache.commons.math.linear;

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
import org.apache.commons.math.linear.MatrixIndexException;
import static org.apache.commons.math.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class RealMatrixImpl_setSubMatrix_135203530067 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1980;
     Object term2029;
     Object term2057;
     Object term2059;

    public RealMatrixImpl_setSubMatrix_135203530067() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1980 = newInstance(Class.forName("org.apache.commons.math.linear.RealMatrixImpl"));
        Object[] term1981 = (Object[]) newArray("[D", 5);
        double[] term1982 = (double[]) newDoubleArray(8);
        double[] term1991 = (double[]) newDoubleArray(9);
        double[] term2001 = (double[]) newDoubleArray(7);
        double[] term2009 = (double[]) newDoubleArray(6);
        double[] term2016 = (double[]) newDoubleArray(5);
        Object[] term2022 = (Object[]) newArray("[D", 2);
        double[] term2023 = (double[]) newDoubleArray(2);
        double[] term2026 = (double[]) newDoubleArray(0);
        int[] term2027 = (int[]) newIntArray(0);
        setDoubleElement(term1982, 0, 0.7386250421411282);
        setDoubleElement(term1982, 1, 0.12551786512833385);
        setDoubleElement(term1982, 2, 0.2351393567986032);
        setDoubleElement(term1982, 3, 0.6548215582845707);
        setDoubleElement(term1982, 4, 0.3454040981366687);
        setDoubleElement(term1982, 5, 0.3580213824484402);
        setDoubleElement(term1982, 6, 0.7217228545305664);
        setDoubleElement(term1982, 7, 0.42942019398136533);
        setElement(term1981, 0, term1982);
        setDoubleElement(term1991, 0, 0.11683469250603162);
        setDoubleElement(term1991, 1, 0.7813411062521521);
        setDoubleElement(term1991, 2, 0.03215908136985579);
        setDoubleElement(term1991, 3, 0.8181159806144095);
        setDoubleElement(term1991, 4, 0.5199701231035306);
        setDoubleElement(term1991, 5, 0.15011219154348843);
        setDoubleElement(term1991, 6, 0.6563333099004626);
        setDoubleElement(term1991, 7, 0.10919159770943598);
        setDoubleElement(term1991, 8, 0.8002601612256814);
        setElement(term1981, 1, term1991);
        setDoubleElement(term2001, 0, 0.25294329720523956);
        setDoubleElement(term2001, 1, 0.40277819638118273);
        setDoubleElement(term2001, 2, 0.6124933411357613);
        setDoubleElement(term2001, 3, 0.4182992175150315);
        setDoubleElement(term2001, 4, 0.7838077946639819);
        setDoubleElement(term2001, 5, 0.09374048740922791);
        setDoubleElement(term2001, 6, 0.9494229461907108);
        setElement(term1981, 2, term2001);
        setDoubleElement(term2009, 0, 0.31538328268378013);
        setDoubleElement(term2009, 1, 0.9888455907022821);
        setDoubleElement(term2009, 2, 0.7296354885225688);
        setDoubleElement(term2009, 3, 0.26197094142616373);
        setDoubleElement(term2009, 4, 0.42502044755210044);
        setDoubleElement(term2009, 5, 0.7794021169202232);
        setElement(term1981, 3, term2009);
        setDoubleElement(term2016, 0, 0.17528851201626494);
        setDoubleElement(term2016, 1, 0.9832782789384902);
        setDoubleElement(term2016, 2, 0.6571101155689184);
        setDoubleElement(term2016, 3, 0.5070134415466635);
        setDoubleElement(term2016, 4, 0.9330567218798436);
        setElement(term1981, 4, term2016);
        setField(term1980, term1980.getClass(), "data", term1981);
        setDoubleElement(term2023, 0, 0.1452204834065195);
        setDoubleElement(term2023, 1, 0.04732617365922176);
        setElement(term2022, 0, term2023);
        setElement(term2022, 1, term2026);
        setField(term1980, term1980.getClass(), "lu", term2022);
        setField(term1980, term1980.getClass(), "permutation", term2027);
        setIntField(term1980, term1980.getClass(), "parity", 1);
        term2029 = (Object[]) newArray("[D", 5);
        double[] term2030 = (double[]) newDoubleArray(6);
        double[] term2037 = (double[]) newDoubleArray(8);
        double[] term2046 = (double[]) newDoubleArray(4);
        double[] term2051 = (double[]) newDoubleArray(0);
        double[] term2052 = (double[]) newDoubleArray(4);
        setDoubleElement(term2030, 0, 0.007179961925217526);
        setDoubleElement(term2030, 1, 0.2368712300344461);
        setDoubleElement(term2030, 2, 0.9377667036664316);
        setDoubleElement(term2030, 3, 0.8863099799682007);
        setDoubleElement(term2030, 4, 0.8361530707429777);
        setDoubleElement(term2030, 5, 0.5264336188208859);
        setElement(term2029, 0, term2030);
        setDoubleElement(term2037, 0, 0.3803734512496052);
        setDoubleElement(term2037, 1, 0.4215991359766782);
        setDoubleElement(term2037, 2, 0.8485928043846015);
        setDoubleElement(term2037, 3, 0.3422470250555786);
        setDoubleElement(term2037, 4, 0.5174310198002574);
        setDoubleElement(term2037, 5, 0.15978842530590698);
        setDoubleElement(term2037, 6, 0.3938367676460294);
        setDoubleElement(term2037, 7, 0.8198571367447252);
        setElement(term2029, 1, term2037);
        setDoubleElement(term2046, 0, 0.5077880926168821);
        setDoubleElement(term2046, 1, 0.8872393368594799);
        setDoubleElement(term2046, 2, 0.4446537162968065);
        setDoubleElement(term2046, 3, 0.25562338666414663);
        setElement(term2029, 2, term2046);
        setElement(term2029, 3, term2051);
        setDoubleElement(term2052, 0, 0.3426382336318774);
        setDoubleElement(term2052, 1, 0.27472560177149286);
        setDoubleElement(term2052, 2, 0.9147378755448754);
        setDoubleElement(term2052, 3, 0.6665364546645218);
        setElement(term2029, 4, term2052);
        term2057 = new Integer(-505439934);
        term2059 = new Integer(-344842608);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.RealMatrixImpl");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Array.newInstance(double.class, 0).getClass(), 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term2029;
        args[1] = term2057;
        args[2] = term2059;
        try {
            callMethod(klass, "setSubMatrix", argTypes, term1980, args);
            assertTrue(false);
        }
        catch (MatrixIndexException e) {
        }

    }

};


