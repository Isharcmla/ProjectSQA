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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.apache.commons.math.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Double;
import java.lang.Integer;

public class EigenDecompositionImpl_countEigenValues_96563137462 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3609;
     Object term3738;
     Object term3740;
     Object term3742;

    public EigenDecompositionImpl_countEigenValues_96563137462() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3609 = newInstance(Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] term3611 = (double[]) newDoubleArray(7);
        double[] term3619 = (double[]) newDoubleArray(8);
        double[] term3628 = (double[]) newDoubleArray(4);
        Object term3633 = newInstance(Class.forName("org.apache.commons.math.linear.TriDiagonalTransformer"));
        Object[] term3634 = (Object[]) newArray("[D", 9);
        double[] term3635 = (double[]) newDoubleArray(6);
        double[] term3642 = (double[]) newDoubleArray(3);
        double[] term3646 = (double[]) newDoubleArray(3);
        double[] term3650 = (double[]) newDoubleArray(4);
        double[] term3655 = (double[]) newDoubleArray(2);
        double[] term3658 = (double[]) newDoubleArray(4);
        double[] term3663 = (double[]) newDoubleArray(1);
        double[] term3665 = (double[]) newDoubleArray(6);
        double[] term3672 = (double[]) newDoubleArray(8);
        double[] term3681 = (double[]) newDoubleArray(6);
        double[] term3688 = (double[]) newDoubleArray(8);
        double[] term3703 = (double[]) newDoubleArray(6);
        double[] term3721 = (double[]) newDoubleArray(3);
        double[] term3725 = (double[]) newDoubleArray(9);
        Object[] term3735 = (Object[]) newArray("org.apache.commons.math.linear.ArrayRealVector", 1);
        Object term3736 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term3737 = (double[]) newDoubleArray(0);
        setDoubleField(term3609, term3609.getClass(), "splitTolerance", 0.7201803211069798);
        setDoubleElement(term3611, 0, 0.6500197748826614);
        setDoubleElement(term3611, 1, 0.946211618813987);
        setDoubleElement(term3611, 2, 0.8896721147742989);
        setDoubleElement(term3611, 3, 0.9757334596651891);
        setDoubleElement(term3611, 4, 0.7898661714152403);
        setDoubleElement(term3611, 5, 0.011900111538757252);
        setDoubleElement(term3611, 6, 0.08402068319025136);
        setField(term3609, term3609.getClass(), "main", term3611);
        setDoubleElement(term3619, 0, 0.09647925132289159);
        setDoubleElement(term3619, 1, 0.6506123772888653);
        setDoubleElement(term3619, 2, 0.7501385925844105);
        setDoubleElement(term3619, 3, 0.2497320017073733);
        setDoubleElement(term3619, 4, 0.06408311287687929);
        setDoubleElement(term3619, 5, 0.5781748232301926);
        setDoubleElement(term3619, 6, 0.9050658066338464);
        setDoubleElement(term3619, 7, 0.4339052897775906);
        setField(term3609, term3609.getClass(), "secondary", term3619);
        setDoubleElement(term3628, 0, 0.3208630345467227);
        setDoubleElement(term3628, 1, 0.586692763250887);
        setDoubleElement(term3628, 2, 0.11082607348088147);
        setDoubleElement(term3628, 3, 0.5465528774415719);
        setField(term3609, term3609.getClass(), "squaredSecondary", term3628);
        setDoubleElement(term3635, 0, 0.7672297485346153);
        setDoubleElement(term3635, 1, 0.9742910752220957);
        setDoubleElement(term3635, 2, 0.8370900141444069);
        setDoubleElement(term3635, 3, 0.6110011448268153);
        setDoubleElement(term3635, 4, 0.018302261391212493);
        setDoubleElement(term3635, 5, 0.6410193852146185);
        setElement(term3634, 0, term3635);
        setDoubleElement(term3642, 0, 0.6338660920761878);
        setDoubleElement(term3642, 1, 0.6238929519140947);
        setDoubleElement(term3642, 2, 0.24724392457453415);
        setElement(term3634, 1, term3642);
        setDoubleElement(term3646, 0, 0.01683435405886269);
        setDoubleElement(term3646, 1, 0.14230806046570932);
        setDoubleElement(term3646, 2, 0.7944745155049505);
        setElement(term3634, 2, term3646);
        setDoubleElement(term3650, 0, 0.822746872244374);
        setDoubleElement(term3650, 1, 0.39518853263245735);
        setDoubleElement(term3650, 2, 0.04623139308451618);
        setDoubleElement(term3650, 3, 0.7736715547701163);
        setElement(term3634, 3, term3650);
        setDoubleElement(term3655, 0, 0.7342256643582769);
        setDoubleElement(term3655, 1, 0.5117334512228887);
        setElement(term3634, 4, term3655);
        setDoubleElement(term3658, 0, 0.25330994555642383);
        setDoubleElement(term3658, 1, 0.98052877651785);
        setDoubleElement(term3658, 2, 0.4906639639979675);
        setDoubleElement(term3658, 3, 0.4078402832279562);
        setElement(term3634, 5, term3658);
        setDoubleElement(term3663, 0, 0.11543135860402265);
        setElement(term3634, 6, term3663);
        setDoubleElement(term3665, 0, 0.2869076979265147);
        setDoubleElement(term3665, 1, 0.777690186289802);
        setDoubleElement(term3665, 2, 0.9750871435414475);
        setDoubleElement(term3665, 3, 0.4244479522523773);
        setDoubleElement(term3665, 4, 0.13090766612376525);
        setDoubleElement(term3665, 5, 0.6623418154867594);
        setElement(term3634, 7, term3665);
        setDoubleElement(term3672, 0, 0.08955649121950282);
        setDoubleElement(term3672, 1, 0.25256714791793244);
        setDoubleElement(term3672, 2, 0.5952958317290666);
        setDoubleElement(term3672, 3, 0.5461102482995668);
        setDoubleElement(term3672, 4, 0.9137323783820119);
        setDoubleElement(term3672, 5, 0.4458842375648203);
        setDoubleElement(term3672, 6, 0.10930138312122684);
        setDoubleElement(term3672, 7, 0.3842409546853731);
        setElement(term3634, 8, term3672);
        setField(term3633, term3633.getClass(), "householderVectors", term3634);
        setDoubleElement(term3681, 0, 0.7689818911978834);
        setDoubleElement(term3681, 1, 0.7250667809747515);
        setDoubleElement(term3681, 2, 0.21045027666063687);
        setDoubleElement(term3681, 3, 0.9128966771635857);
        setDoubleElement(term3681, 4, 0.9630509997618707);
        setDoubleElement(term3681, 5, 0.8989590306383064);
        setField(term3633, term3633.getClass(), "main", term3681);
        setDoubleElement(term3688, 0, 0.23768685961979785);
        setDoubleElement(term3688, 1, 0.755674197120759);
        setDoubleElement(term3688, 2, 0.09469959379296888);
        setDoubleElement(term3688, 3, 0.6548817606608114);
        setDoubleElement(term3688, 4, 0.917848996719316);
        setDoubleElement(term3688, 5, 0.3170978963909493);
        setDoubleElement(term3688, 6, 0.6515468596140501);
        setDoubleElement(term3688, 7, 0.7536609151347575);
        setField(term3633, term3633.getClass(), "secondary", term3688);
        setField(term3633, term3633.getClass(), "cachedQ", null);
        setField(term3633, term3633.getClass(), "cachedQt", null);
        setField(term3633, term3633.getClass(), "cachedT", null);
        setField(term3609, term3609.getClass(), "transformer", term3633);
        setDoubleField(term3609, term3609.getClass(), "lowerSpectra", 0.5546333544124585);
        setDoubleField(term3609, term3609.getClass(), "upperSpectra", 0.3130962773814131);
        setDoubleField(term3609, term3609.getClass(), "minPivot", 0.1673922529900559);
        setDoubleField(term3609, term3609.getClass(), "sigma", 0.22792641547114512);
        setDoubleField(term3609, term3609.getClass(), "sigmaLow", 0.9325087254152569);
        setDoubleField(term3609, term3609.getClass(), "tau", 0.6371002089118303);
        setDoubleElement(term3703, 0, 0.8117238508746569);
        setDoubleElement(term3703, 1, 0.35898034971003856);
        setDoubleElement(term3703, 2, 0.10760444098786104);
        setDoubleElement(term3703, 3, 0.01528483181801743);
        setDoubleElement(term3703, 4, 0.04682003967006809);
        setDoubleElement(term3703, 5, 0.7905409988983721);
        setField(term3609, term3609.getClass(), "work", term3703);
        setIntField(term3609, term3609.getClass(), "pingPong", -1371869594);
        setDoubleField(term3609, term3609.getClass(), "qMax", 0.9734219689441325);
        setDoubleField(term3609, term3609.getClass(), "eMin", 0.5656095365408487);
        setIntField(term3609, term3609.getClass(), "tType", -2095575670);
        setDoubleField(term3609, term3609.getClass(), "dMin", 0.9067966842819112);
        setDoubleField(term3609, term3609.getClass(), "dMin1", 0.12692792670135955);
        setDoubleField(term3609, term3609.getClass(), "dMin2", 0.8612880788935964);
        setDoubleField(term3609, term3609.getClass(), "dN", 0.942693451174182);
        setDoubleField(term3609, term3609.getClass(), "dN1", 0.5281468576963442);
        setDoubleField(term3609, term3609.getClass(), "dN2", 0.7587601518286838);
        setDoubleField(term3609, term3609.getClass(), "g", 0.4637876814191275);
        setDoubleElement(term3721, 0, 0.22419640970072618);
        setDoubleElement(term3721, 1, 0.7927653255315935);
        setDoubleElement(term3721, 2, 0.46099818741569987);
        setField(term3609, term3609.getClass(), "realEigenvalues", term3721);
        setDoubleElement(term3725, 0, 0.0539856711253599);
        setDoubleElement(term3725, 1, 0.07425867300066613);
        setDoubleElement(term3725, 2, 0.3321459296716357);
        setDoubleElement(term3725, 3, 0.5161676525058972);
        setDoubleElement(term3725, 4, 0.3140665316001605);
        setDoubleElement(term3725, 5, 0.005684976436328371);
        setDoubleElement(term3725, 6, 0.6853845048972451);
        setDoubleElement(term3725, 7, 0.7298606953032495);
        setDoubleElement(term3725, 8, 0.08409138647122327);
        setField(term3609, term3609.getClass(), "imagEigenvalues", term3725);
        setField(term3736, term3736.getClass(), "data", term3737);
        setElement(term3735, 0, term3736);
        setField(term3609, term3609.getClass(), "eigenvectors", term3735);
        setField(term3609, term3609.getClass(), "cachedV", null);
        setField(term3609, term3609.getClass(), "cachedD", null);
        setField(term3609, term3609.getClass(), "cachedVt", null);
        term3738 = new Double(0.7549415655365366);
        term3740 = new Integer(1225272962);
        term3742 = new Integer(1324040357);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = double.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term3738;
        args[1] = term3740;
        args[2] = term3742;
        try {
            callMethod(klass, "countEigenValues", argTypes, term3609, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


