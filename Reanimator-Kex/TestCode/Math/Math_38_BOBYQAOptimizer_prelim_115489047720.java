package org.apache.commons.math.optimization.direct;

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
import org.apache.commons.math.exception.OutOfRangeException;
import static org.apache.commons.math.optimization.direct.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class BOBYQAOptimizer_prelim_115489047720 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1889;
     Object term2028;
     Object term2032;

    public BOBYQAOptimizer_prelim_115489047720() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term32520 = Class.forName((String) "org.apache.commons.math.optimization.GoalType");
        Field term32519 = ((Class) term32520).getDeclaredField((String) "MINIMIZE");
        ((Field) term32519).setAccessible(true);
        Object enum14 = ((Field) term32519).get((Object) null);
        term1889 = newInstance(Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer"));
        Object term1894 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term1895 = (double[]) newDoubleArray(0);
        double[] term1896 = (double[]) newDoubleArray(4);
        Object term1902 = newInstance(Class.forName("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        Object[] term1903 = (Object[]) newArray("[D", 1);
        double[] term1904 = (double[]) newDoubleArray(1);
        Object term1906 = newInstance(Class.forName("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        Object[] term1907 = (Object[]) newArray("[D", 6);
        double[] term1908 = (double[]) newDoubleArray(7);
        double[] term1916 = (double[]) newDoubleArray(0);
        double[] term1917 = (double[]) newDoubleArray(7);
        double[] term1925 = (double[]) newDoubleArray(1);
        double[] term1927 = (double[]) newDoubleArray(6);
        double[] term1934 = (double[]) newDoubleArray(4);
        Object term1939 = newInstance(Class.forName("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        Object[] term1940 = (Object[]) newArray("[D", 6);
        double[] term1941 = (double[]) newDoubleArray(7);
        double[] term1949 = (double[]) newDoubleArray(0);
        double[] term1950 = (double[]) newDoubleArray(9);
        double[] term1960 = (double[]) newDoubleArray(6);
        double[] term1967 = (double[]) newDoubleArray(8);
        double[] term1976 = (double[]) newDoubleArray(6);
        Object term1983 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term1984 = (double[]) newDoubleArray(0);
        Object term1985 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term1986 = (double[]) newDoubleArray(0);
        Object term1987 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term1988 = (double[]) newDoubleArray(0);
        Object term1989 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term1990 = (double[]) newDoubleArray(0);
        Object term1991 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term1992 = (double[]) newDoubleArray(0);
        Object term1993 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term1994 = (double[]) newDoubleArray(0);
        Object term1995 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term1996 = (double[]) newDoubleArray(0);
        Object term1997 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term1998 = (double[]) newDoubleArray(0);
        Object term1999 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term2000 = (double[]) newDoubleArray(0);
        double[] term2001 = (double[]) newDoubleArray(2);
        double[] term2004 = (double[]) newDoubleArray(1);
        Object term2006 = newInstance(Class.forName("org.apache.commons.math.util.Incrementor"));
        Object term2009 = newInstance(Class.forName("org.apache.commons.math.util.Incrementor$1"));
        double[] term2022 = (double[]) newDoubleArray(5);
        setIntField(term1889, term1889.getClass(), "numberOfInterpolationPoints", 1048535127);
        setDoubleField(term1889, term1889.getClass(), "initialTrustRegionRadius", 0.34234234602085223);
        setDoubleField(term1889, term1889.getClass(), "stoppingTrustRegionRadius", 0.8355624480198577);
        setBooleanField(term1889, term1889.getClass(), "isMinimize", true);
        setField(term1894, term1894.getClass(), "data", term1895);
        setField(term1889, term1889.getClass(), "currentBest", term1894);
        setDoubleElement(term1896, 0, 0.8303221706066055);
        setDoubleElement(term1896, 1, 0.7102687477135848);
        setDoubleElement(term1896, 2, 0.7984332537471793);
        setDoubleElement(term1896, 3, 0.6782349539183316);
        setField(term1889, term1889.getClass(), "boundDifference", term1896);
        setIntField(term1889, term1889.getClass(), "trustRegionCenterInterpolationPointIndex", -655067527);
        setDoubleElement(term1904, 0, 0.6464654528667407);
        setElement(term1903, 0, term1904);
        setField(term1902, term1902.getClass(), "data", term1903);
        setField(term1889, term1889.getClass(), "bMatrix", term1902);
        setDoubleElement(term1908, 0, 0.6416885379658445);
        setDoubleElement(term1908, 1, 0.604465128384297);
        setDoubleElement(term1908, 2, 0.5180566811475131);
        setDoubleElement(term1908, 3, 0.6773553630262286);
        setDoubleElement(term1908, 4, 0.0416412064984476);
        setDoubleElement(term1908, 5, 0.9188322321077216);
        setDoubleElement(term1908, 6, 0.8046904246652031);
        setElement(term1907, 0, term1908);
        setElement(term1907, 1, term1916);
        setDoubleElement(term1917, 0, 0.16734523112870836);
        setDoubleElement(term1917, 1, 0.9711083796772954);
        setDoubleElement(term1917, 2, 0.329228491476264);
        setDoubleElement(term1917, 3, 0.8664463700873805);
        setDoubleElement(term1917, 4, 0.4228841212022646);
        setDoubleElement(term1917, 5, 0.9898207968242465);
        setDoubleElement(term1917, 6, 0.025396748287270232);
        setElement(term1907, 2, term1917);
        setDoubleElement(term1925, 0, 0.22437750947699786);
        setElement(term1907, 3, term1925);
        setDoubleElement(term1927, 0, 0.3142783864669928);
        setDoubleElement(term1927, 1, 0.28838369056651414);
        setDoubleElement(term1927, 2, 0.3505219043338702);
        setDoubleElement(term1927, 3, 0.9926072201505048);
        setDoubleElement(term1927, 4, 0.5862272565267508);
        setDoubleElement(term1927, 5, 0.20309716492940588);
        setElement(term1907, 4, term1927);
        setDoubleElement(term1934, 0, 0.2353269756778571);
        setDoubleElement(term1934, 1, 0.6816920131943206);
        setDoubleElement(term1934, 2, 0.2570702043750863);
        setDoubleElement(term1934, 3, 0.1475601354637306);
        setElement(term1907, 5, term1934);
        setField(term1906, term1906.getClass(), "data", term1907);
        setField(term1889, term1889.getClass(), "zMatrix", term1906);
        setDoubleElement(term1941, 0, 0.3597510664032918);
        setDoubleElement(term1941, 1, 0.007955296043747784);
        setDoubleElement(term1941, 2, 0.9306289418004117);
        setDoubleElement(term1941, 3, 0.6094033208961637);
        setDoubleElement(term1941, 4, 0.8841587807231336);
        setDoubleElement(term1941, 5, 0.5041105894588648);
        setDoubleElement(term1941, 6, 0.5447228125601069);
        setElement(term1940, 0, term1941);
        setElement(term1940, 1, term1949);
        setDoubleElement(term1950, 0, 0.881005463515806);
        setDoubleElement(term1950, 1, 0.24535082601257097);
        setDoubleElement(term1950, 2, 0.8251257683961645);
        setDoubleElement(term1950, 3, 0.9368808881355091);
        setDoubleElement(term1950, 4, 0.6198040082983302);
        setDoubleElement(term1950, 5, 0.8222160691812529);
        setDoubleElement(term1950, 6, 0.6481625751444708);
        setDoubleElement(term1950, 7, 0.62046987338639);
        setDoubleElement(term1950, 8, 0.16681991355621673);
        setElement(term1940, 2, term1950);
        setDoubleElement(term1960, 0, 0.24168508149332457);
        setDoubleElement(term1960, 1, 0.9765582392968284);
        setDoubleElement(term1960, 2, 0.33340230026214834);
        setDoubleElement(term1960, 3, 0.7912735654922212);
        setDoubleElement(term1960, 4, 0.7177162541558186);
        setDoubleElement(term1960, 5, 0.4751993224281752);
        setElement(term1940, 3, term1960);
        setDoubleElement(term1967, 0, 0.246784352391756);
        setDoubleElement(term1967, 1, 0.6746769370801629);
        setDoubleElement(term1967, 2, 0.09436531082165778);
        setDoubleElement(term1967, 3, 0.1882701721081318);
        setDoubleElement(term1967, 4, 0.20230843747579808);
        setDoubleElement(term1967, 5, 0.4995447078885714);
        setDoubleElement(term1967, 6, 0.19855958465701706);
        setDoubleElement(term1967, 7, 0.6202418999768349);
        setElement(term1940, 4, term1967);
        setDoubleElement(term1976, 0, 0.9848907582209794);
        setDoubleElement(term1976, 1, 0.9658751931880928);
        setDoubleElement(term1976, 2, 0.6990187833274262);
        setDoubleElement(term1976, 3, 0.6970994777067232);
        setDoubleElement(term1976, 4, 0.4309992370378436);
        setDoubleElement(term1976, 5, 0.4228091725302011);
        setElement(term1940, 5, term1976);
        setField(term1939, term1939.getClass(), "data", term1940);
        setField(term1889, term1889.getClass(), "interpolationPoints", term1939);
        setField(term1983, term1983.getClass(), "data", term1984);
        setField(term1889, term1889.getClass(), "originShift", term1983);
        setField(term1985, term1985.getClass(), "data", term1986);
        setField(term1889, term1889.getClass(), "fAtInterpolationPoints", term1985);
        setField(term1987, term1987.getClass(), "data", term1988);
        setField(term1889, term1889.getClass(), "trustRegionCenterOffset", term1987);
        setField(term1989, term1989.getClass(), "data", term1990);
        setField(term1889, term1889.getClass(), "gradientAtTrustRegionCenter", term1989);
        setField(term1991, term1991.getClass(), "data", term1992);
        setField(term1889, term1889.getClass(), "lowerDifference", term1991);
        setField(term1993, term1993.getClass(), "data", term1994);
        setField(term1889, term1889.getClass(), "upperDifference", term1993);
        setField(term1995, term1995.getClass(), "data", term1996);
        setField(term1889, term1889.getClass(), "modelSecondDerivativesParameters", term1995);
        setField(term1997, term1997.getClass(), "data", term1998);
        setField(term1889, term1889.getClass(), "newPoint", term1997);
        setField(term1999, term1999.getClass(), "data", term2000);
        setField(term1889, term1889.getClass(), "alternativeNewPoint", term1999);
        setField(term1889, term1889.getClass(), "trialStepPoint", term1995);
        setField(term1889, term1889.getClass(), "lagrangeValuesAtNewPoint", term1997);
        setField(term1889, term1889.getClass(), "modelSecondDerivativesValues", term1894);
        setDoubleElement(term2001, 0, 0.9148340457558121);
        setDoubleElement(term2001, 1, 0.5671889474210299);
        setField(term1889, term1889.getClass(), "lowerBound", term2001);
        setDoubleElement(term2004, 0, 0.12331301462770328);
        setField(term1889, term1889.getClass(), "upperBound", term2004);
        setIntField(term2006, term2006.getClass(), "maximalCount", -6029667);
        setIntField(term2006, term2006.getClass(), "count", -2068769794);
        setField(term2006, term2006.getClass(), "maxCountCallback", term2009);
        setField(term1889, term1889.getClass(), "evaluations", term2006);
        setField(term1889, term1889.getClass(), "checker", null);
        setField(term1889, term1889.getClass(), "goal", enum14);
        setDoubleElement(term2022, 0, 0.07338333983034873);
        setDoubleElement(term2022, 1, 0.9205377491648612);
        setDoubleElement(term2022, 2, 0.5496976557562384);
        setDoubleElement(term2022, 3, 0.528799251950027);
        setDoubleElement(term2022, 4, 0.8870518852812378);
        setField(term1889, term1889.getClass(), "start", term2022);
        setField(term1889, term1889.getClass(), "function", null);
        term2028 = (double[]) newDoubleArray(3);
        setDoubleElement(term2028, 0, 0.8540665765438992);
        setDoubleElement(term2028, 1, 0.7936653683273087);
        setDoubleElement(term2028, 2, 0.6999892183282963);
        term2032 = (double[]) newDoubleArray(9);
        setDoubleElement(term2032, 0, 0.4376587023760947);
        setDoubleElement(term2032, 1, 0.5498407122477659);
        setDoubleElement(term2032, 2, 0.3715546102192131);
        setDoubleElement(term2032, 3, 0.07818003953962671);
        setDoubleElement(term2032, 4, 0.3737994354904751);
        setDoubleElement(term2032, 5, 0.4912523542152032);
        setDoubleElement(term2032, 6, 0.5987936532910646);
        setDoubleElement(term2032, 7, 0.5124845253152773);
        setDoubleElement(term2032, 8, 0.12402111287123307);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term2028;
        args[1] = term2032;
        try {
            callMethod(klass, "prelim", argTypes, term1889, args);
            assertTrue(false);
        }
        catch (OutOfRangeException e) {
        }

    }

};


