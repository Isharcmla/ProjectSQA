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
import java.lang.NullPointerException;
import static org.apache.commons.math.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Double;

public class SingularValueDecompositionImpl_getCovariance_191630612521 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term686;
     Object term753;

    public SingularValueDecompositionImpl_getCovariance_191630612521() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term686 = newInstance(Class.forName("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        Object term689 = newInstance(Class.forName("org.apache.commons.math.linear.BiDiagonalTransformer"));
        Object[] term690 = (Object[]) newArray("[D", 6);
        double[] term691 = (double[]) newDoubleArray(5);
        double[] term697 = (double[]) newDoubleArray(1);
        double[] term699 = (double[]) newDoubleArray(4);
        double[] term704 = (double[]) newDoubleArray(1);
        double[] term706 = (double[]) newDoubleArray(1);
        double[] term708 = (double[]) newDoubleArray(6);
        double[] term715 = (double[]) newDoubleArray(7);
        double[] term723 = (double[]) newDoubleArray(0);
        double[] term724 = (double[]) newDoubleArray(7);
        double[] term732 = (double[]) newDoubleArray(1);
        double[] term734 = (double[]) newDoubleArray(6);
        double[] term741 = (double[]) newDoubleArray(4);
        double[] term746 = (double[]) newDoubleArray(6);
        setIntField(term686, term686.getClass(), "m", -883034806);
        setIntField(term686, term686.getClass(), "n", 1585847225);
        setDoubleElement(term691, 0, 0.6101411757610665);
        setDoubleElement(term691, 1, 0.07932996853888874);
        setDoubleElement(term691, 2, 0.4335752168808029);
        setDoubleElement(term691, 3, 0.9196949182738653);
        setDoubleElement(term691, 4, 0.5820770579753712);
        setElement(term690, 0, term691);
        setDoubleElement(term697, 0, 0.8935041663395363);
        setElement(term690, 1, term697);
        setDoubleElement(term699, 0, 0.2542403704113868);
        setDoubleElement(term699, 1, 0.4614378239284842);
        setDoubleElement(term699, 2, 0.10963898027157926);
        setDoubleElement(term699, 3, 0.34234234602085223);
        setElement(term690, 2, term699);
        setDoubleElement(term704, 0, 0.8355624480198577);
        setElement(term690, 3, term704);
        setDoubleElement(term706, 0, 0.8303221706066055);
        setElement(term690, 4, term706);
        setDoubleElement(term708, 0, 0.7102687477135848);
        setDoubleElement(term708, 1, 0.7984332537471793);
        setDoubleElement(term708, 2, 0.6782349539183316);
        setDoubleElement(term708, 3, 0.6464654528667407);
        setDoubleElement(term708, 4, 0.6416885379658445);
        setDoubleElement(term708, 5, 0.604465128384297);
        setElement(term690, 5, term708);
        setField(term689, term689.getClass(), "householderVectors", term690);
        setDoubleElement(term715, 0, 0.5180566811475131);
        setDoubleElement(term715, 1, 0.6773553630262286);
        setDoubleElement(term715, 2, 0.0416412064984476);
        setDoubleElement(term715, 3, 0.9188322321077216);
        setDoubleElement(term715, 4, 0.8046904246652031);
        setDoubleElement(term715, 5, 0.16734523112870836);
        setDoubleElement(term715, 6, 0.9711083796772954);
        setField(term689, term689.getClass(), "main", term715);
        setField(term689, term689.getClass(), "secondary", term723);
        setField(term689, term689.getClass(), "cachedU", null);
        setField(term689, term689.getClass(), "cachedB", null);
        setField(term689, term689.getClass(), "cachedV", null);
        setField(term686, term686.getClass(), "transformer", term689);
        setDoubleElement(term724, 0, 0.329228491476264);
        setDoubleElement(term724, 1, 0.8664463700873805);
        setDoubleElement(term724, 2, 0.4228841212022646);
        setDoubleElement(term724, 3, 0.9898207968242465);
        setDoubleElement(term724, 4, 0.025396748287270232);
        setDoubleElement(term724, 5, 0.22437750947699786);
        setDoubleElement(term724, 6, 0.3142783864669928);
        setField(term686, term686.getClass(), "mainBidiagonal", term724);
        setDoubleElement(term732, 0, 0.28838369056651414);
        setField(term686, term686.getClass(), "secondaryBidiagonal", term732);
        setDoubleElement(term734, 0, 0.3505219043338702);
        setDoubleElement(term734, 1, 0.9926072201505048);
        setDoubleElement(term734, 2, 0.5862272565267508);
        setDoubleElement(term734, 3, 0.20309716492940588);
        setDoubleElement(term734, 4, 0.2353269756778571);
        setDoubleElement(term734, 5, 0.6816920131943206);
        setField(term686, term686.getClass(), "mainTridiagonal", term734);
        setDoubleElement(term741, 0, 0.2570702043750863);
        setDoubleElement(term741, 1, 0.1475601354637306);
        setDoubleElement(term741, 2, 0.3597510664032918);
        setDoubleElement(term741, 3, 0.007955296043747784);
        setField(term686, term686.getClass(), "secondaryTridiagonal", term741);
        setField(term686, term686.getClass(), "eigenDecomposition", null);
        setDoubleElement(term746, 0, 0.9306289418004117);
        setDoubleElement(term746, 1, 0.6094033208961637);
        setDoubleElement(term746, 2, 0.8841587807231336);
        setDoubleElement(term746, 3, 0.5041105894588648);
        setDoubleElement(term746, 4, 0.5447228125601069);
        setDoubleElement(term746, 5, 0.881005463515806);
        setField(term686, term686.getClass(), "singularValues", term746);
        setField(term686, term686.getClass(), "cachedU", null);
        setField(term686, term686.getClass(), "cachedUt", null);
        setField(term686, term686.getClass(), "cachedS", null);
        setField(term686, term686.getClass(), "cachedV", null);
        setField(term686, term686.getClass(), "cachedVt", null);
        term753 = new Double(0.24535082601257097);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.SingularValueDecompositionImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term753;
        try {
            callMethod(klass, "getCovariance", argTypes, term686, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


