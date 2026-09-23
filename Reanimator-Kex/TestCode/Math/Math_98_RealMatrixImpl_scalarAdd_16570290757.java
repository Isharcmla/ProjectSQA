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

public class RealMatrixImpl_scalarAdd_16570290757 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term728;
     Object term810;

    public RealMatrixImpl_scalarAdd_16570290757() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term728 = newInstance(Class.forName("org.apache.commons.math.linear.RealMatrixImpl"));
        Object[] term729 = (Object[]) newArray("[D", 7);
        double[] term730 = (double[]) newDoubleArray(0);
        double[] term731 = (double[]) newDoubleArray(9);
        double[] term741 = (double[]) newDoubleArray(6);
        double[] term748 = (double[]) newDoubleArray(8);
        double[] term757 = (double[]) newDoubleArray(6);
        double[] term764 = (double[]) newDoubleArray(2);
        double[] term767 = (double[]) newDoubleArray(1);
        Object[] term769 = (Object[]) newArray("[D", 5);
        double[] term770 = (double[]) newDoubleArray(3);
        double[] term774 = (double[]) newDoubleArray(9);
        double[] term784 = (double[]) newDoubleArray(7);
        double[] term792 = (double[]) newDoubleArray(6);
        double[] term799 = (double[]) newDoubleArray(5);
        int[] term805 = (int[]) newIntArray(3);
        setElement(term729, 0, term730);
        setDoubleElement(term731, 0, 0.009446329384675933);
        setDoubleElement(term731, 1, 0.20131600000037786);
        setDoubleElement(term731, 2, 0.332320568233212);
        setDoubleElement(term731, 3, 0.18561351983828822);
        setDoubleElement(term731, 4, 0.9678135126533798);
        setDoubleElement(term731, 5, 0.3275035827937727);
        setDoubleElement(term731, 6, 0.13747524521333288);
        setDoubleElement(term731, 7, 0.7149120009558162);
        setDoubleElement(term731, 8, 0.0013046823258857643);
        setElement(term729, 1, term731);
        setDoubleElement(term741, 0, 0.5404409545293147);
        setDoubleElement(term741, 1, 0.9172358414700745);
        setDoubleElement(term741, 2, 0.3804251745476508);
        setDoubleElement(term741, 3, 0.6704848280926606);
        setDoubleElement(term741, 4, 0.6213122016266206);
        setDoubleElement(term741, 5, 0.540850203722707);
        setElement(term729, 2, term741);
        setDoubleElement(term748, 0, 6.134294677928587E-4);
        setDoubleElement(term748, 1, 0.41934015614685227);
        setDoubleElement(term748, 2, 0.07298304401683597);
        setDoubleElement(term748, 3, 0.6101411757610665);
        setDoubleElement(term748, 4, 0.07932996853888874);
        setDoubleElement(term748, 5, 0.4335752168808029);
        setDoubleElement(term748, 6, 0.9196949182738653);
        setDoubleElement(term748, 7, 0.5820770579753712);
        setElement(term729, 3, term748);
        setDoubleElement(term757, 0, 0.8935041663395363);
        setDoubleElement(term757, 1, 0.2542403704113868);
        setDoubleElement(term757, 2, 0.4614378239284842);
        setDoubleElement(term757, 3, 0.10963898027157926);
        setDoubleElement(term757, 4, 0.34234234602085223);
        setDoubleElement(term757, 5, 0.8355624480198577);
        setElement(term729, 4, term757);
        setDoubleElement(term764, 0, 0.8303221706066055);
        setDoubleElement(term764, 1, 0.7102687477135848);
        setElement(term729, 5, term764);
        setDoubleElement(term767, 0, 0.7984332537471793);
        setElement(term729, 6, term767);
        setField(term728, term728.getClass(), "data", term729);
        setDoubleElement(term770, 0, 0.6782349539183316);
        setDoubleElement(term770, 1, 0.6464654528667407);
        setDoubleElement(term770, 2, 0.6416885379658445);
        setElement(term769, 0, term770);
        setDoubleElement(term774, 0, 0.604465128384297);
        setDoubleElement(term774, 1, 0.5180566811475131);
        setDoubleElement(term774, 2, 0.6773553630262286);
        setDoubleElement(term774, 3, 0.0416412064984476);
        setDoubleElement(term774, 4, 0.9188322321077216);
        setDoubleElement(term774, 5, 0.8046904246652031);
        setDoubleElement(term774, 6, 0.16734523112870836);
        setDoubleElement(term774, 7, 0.9711083796772954);
        setDoubleElement(term774, 8, 0.329228491476264);
        setElement(term769, 1, term774);
        setDoubleElement(term784, 0, 0.8664463700873805);
        setDoubleElement(term784, 1, 0.4228841212022646);
        setDoubleElement(term784, 2, 0.9898207968242465);
        setDoubleElement(term784, 3, 0.025396748287270232);
        setDoubleElement(term784, 4, 0.22437750947699786);
        setDoubleElement(term784, 5, 0.3142783864669928);
        setDoubleElement(term784, 6, 0.28838369056651414);
        setElement(term769, 2, term784);
        setDoubleElement(term792, 0, 0.3505219043338702);
        setDoubleElement(term792, 1, 0.9926072201505048);
        setDoubleElement(term792, 2, 0.5862272565267508);
        setDoubleElement(term792, 3, 0.20309716492940588);
        setDoubleElement(term792, 4, 0.2353269756778571);
        setDoubleElement(term792, 5, 0.6816920131943206);
        setElement(term769, 3, term792);
        setDoubleElement(term799, 0, 0.2570702043750863);
        setDoubleElement(term799, 1, 0.1475601354637306);
        setDoubleElement(term799, 2, 0.3597510664032918);
        setDoubleElement(term799, 3, 0.007955296043747784);
        setDoubleElement(term799, 4, 0.9306289418004117);
        setElement(term769, 4, term799);
        setField(term728, term728.getClass(), "lu", term769);
        setIntElement(term805, 0, -469968304);
        setIntElement(term805, 1, -1145578966);
        setIntElement(term805, 2, 679763016);
        setField(term728, term728.getClass(), "permutation", term805);
        setIntField(term728, term728.getClass(), "parity", 1);
        term810 = new Double(0.6094033208961637);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.RealMatrixImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term810;
        try {
            callMethod(klass, "scalarAdd", argTypes, term728, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


