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
import org.apache.commons.math.linear.InvalidMatrixException;
import static org.apache.commons.math.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class EigenDecompositionImpl_getVT_193577698142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term624;

    public EigenDecompositionImpl_getVT_193577698142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term624 = newInstance(Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] term626 = (double[]) newDoubleArray(7);
        double[] term634 = (double[]) newDoubleArray(6);
        double[] term641 = (double[]) newDoubleArray(7);
        Object term649 = newInstance(Class.forName("org.apache.commons.math.linear.TriDiagonalTransformer"));
        Object[] term650 = (Object[]) newArray("[D", 9);
        double[] term651 = (double[]) newDoubleArray(7);
        double[] term659 = (double[]) newDoubleArray(6);
        double[] term666 = (double[]) newDoubleArray(6);
        double[] term673 = (double[]) newDoubleArray(0);
        double[] term674 = (double[]) newDoubleArray(6);
        double[] term681 = (double[]) newDoubleArray(5);
        double[] term687 = (double[]) newDoubleArray(1);
        double[] term689 = (double[]) newDoubleArray(0);
        double[] term690 = (double[]) newDoubleArray(6);
        double[] term697 = (double[]) newDoubleArray(5);
        double[] term703 = (double[]) newDoubleArray(1);
        double[] term711 = (double[]) newDoubleArray(4);
        double[] term727 = (double[]) newDoubleArray(1);
        double[] term729 = (double[]) newDoubleArray(1);
        Object[] term731 = (Object[]) newArray("org.apache.commons.math.linear.ArrayRealVector", 6);
        Object term732 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term733 = (double[]) newDoubleArray(0);
        Object term734 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term735 = (double[]) newDoubleArray(0);
        Object term736 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term737 = (double[]) newDoubleArray(0);
        Object term738 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term739 = (double[]) newDoubleArray(0);
        Object term740 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term741 = (double[]) newDoubleArray(0);
        Object term742 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term743 = (double[]) newDoubleArray(0);
        setDoubleField(term624, term624.getClass(), "splitTolerance", 0.0013046823258857643);
        setDoubleElement(term626, 0, 0.5404409545293147);
        setDoubleElement(term626, 1, 0.9172358414700745);
        setDoubleElement(term626, 2, 0.3804251745476508);
        setDoubleElement(term626, 3, 0.6704848280926606);
        setDoubleElement(term626, 4, 0.6213122016266206);
        setDoubleElement(term626, 5, 0.540850203722707);
        setDoubleElement(term626, 6, 6.134294677928587E-4);
        setField(term624, term624.getClass(), "main", term626);
        setDoubleElement(term634, 0, 0.41934015614685227);
        setDoubleElement(term634, 1, 0.07298304401683597);
        setDoubleElement(term634, 2, 0.6101411757610665);
        setDoubleElement(term634, 3, 0.07932996853888874);
        setDoubleElement(term634, 4, 0.4335752168808029);
        setDoubleElement(term634, 5, 0.9196949182738653);
        setField(term624, term624.getClass(), "secondary", term634);
        setDoubleElement(term641, 0, 0.5820770579753712);
        setDoubleElement(term641, 1, 0.8935041663395363);
        setDoubleElement(term641, 2, 0.2542403704113868);
        setDoubleElement(term641, 3, 0.4614378239284842);
        setDoubleElement(term641, 4, 0.10963898027157926);
        setDoubleElement(term641, 5, 0.34234234602085223);
        setDoubleElement(term641, 6, 0.8355624480198577);
        setField(term624, term624.getClass(), "squaredSecondary", term641);
        setDoubleElement(term651, 0, 0.8303221706066055);
        setDoubleElement(term651, 1, 0.7102687477135848);
        setDoubleElement(term651, 2, 0.7984332537471793);
        setDoubleElement(term651, 3, 0.6782349539183316);
        setDoubleElement(term651, 4, 0.6464654528667407);
        setDoubleElement(term651, 5, 0.6416885379658445);
        setDoubleElement(term651, 6, 0.604465128384297);
        setElement(term650, 0, term651);
        setDoubleElement(term659, 0, 0.5180566811475131);
        setDoubleElement(term659, 1, 0.6773553630262286);
        setDoubleElement(term659, 2, 0.0416412064984476);
        setDoubleElement(term659, 3, 0.9188322321077216);
        setDoubleElement(term659, 4, 0.8046904246652031);
        setDoubleElement(term659, 5, 0.16734523112870836);
        setElement(term650, 1, term659);
        setDoubleElement(term666, 0, 0.9711083796772954);
        setDoubleElement(term666, 1, 0.329228491476264);
        setDoubleElement(term666, 2, 0.8664463700873805);
        setDoubleElement(term666, 3, 0.4228841212022646);
        setDoubleElement(term666, 4, 0.9898207968242465);
        setDoubleElement(term666, 5, 0.025396748287270232);
        setElement(term650, 2, term666);
        setElement(term650, 3, term673);
        setDoubleElement(term674, 0, 0.22437750947699786);
        setDoubleElement(term674, 1, 0.3142783864669928);
        setDoubleElement(term674, 2, 0.28838369056651414);
        setDoubleElement(term674, 3, 0.3505219043338702);
        setDoubleElement(term674, 4, 0.9926072201505048);
        setDoubleElement(term674, 5, 0.5862272565267508);
        setElement(term650, 4, term674);
        setDoubleElement(term681, 0, 0.20309716492940588);
        setDoubleElement(term681, 1, 0.2353269756778571);
        setDoubleElement(term681, 2, 0.6816920131943206);
        setDoubleElement(term681, 3, 0.2570702043750863);
        setDoubleElement(term681, 4, 0.1475601354637306);
        setElement(term650, 5, term681);
        setDoubleElement(term687, 0, 0.3597510664032918);
        setElement(term650, 6, term687);
        setElement(term650, 7, term689);
        setDoubleElement(term690, 0, 0.007955296043747784);
        setDoubleElement(term690, 1, 0.9306289418004117);
        setDoubleElement(term690, 2, 0.6094033208961637);
        setDoubleElement(term690, 3, 0.8841587807231336);
        setDoubleElement(term690, 4, 0.5041105894588648);
        setDoubleElement(term690, 5, 0.5447228125601069);
        setElement(term650, 8, term690);
        setField(term649, term649.getClass(), "householderVectors", term650);
        setDoubleElement(term697, 0, 0.881005463515806);
        setDoubleElement(term697, 1, 0.24535082601257097);
        setDoubleElement(term697, 2, 0.8251257683961645);
        setDoubleElement(term697, 3, 0.9368808881355091);
        setDoubleElement(term697, 4, 0.6198040082983302);
        setField(term649, term649.getClass(), "main", term697);
        setDoubleElement(term703, 0, 0.8222160691812529);
        setField(term649, term649.getClass(), "secondary", term703);
        setField(term649, term649.getClass(), "cachedQ", null);
        setField(term649, term649.getClass(), "cachedQt", null);
        setField(term649, term649.getClass(), "cachedT", null);
        setField(term624, term624.getClass(), "transformer", term649);
        setDoubleField(term624, term624.getClass(), "lowerSpectra", 0.6481625751444708);
        setDoubleField(term624, term624.getClass(), "upperSpectra", 0.62046987338639);
        setDoubleField(term624, term624.getClass(), "minPivot", 0.16681991355621673);
        setDoubleField(term624, term624.getClass(), "sigma", 0.24168508149332457);
        setDoubleField(term624, term624.getClass(), "sigmaLow", 0.9765582392968284);
        setDoubleField(term624, term624.getClass(), "tau", 0.33340230026214834);
        setDoubleElement(term711, 0, 0.7912735654922212);
        setDoubleElement(term711, 1, 0.7177162541558186);
        setDoubleElement(term711, 2, 0.4751993224281752);
        setDoubleElement(term711, 3, 0.246784352391756);
        setField(term624, term624.getClass(), "work", term711);
        setIntField(term624, term624.getClass(), "pingPong", 1227103734);
        setDoubleField(term624, term624.getClass(), "qMax", 0.6746769370801629);
        setDoubleField(term624, term624.getClass(), "eMin", 0.09436531082165778);
        setIntField(term624, term624.getClass(), "tType", -1339778481);
        setDoubleField(term624, term624.getClass(), "dMin", 0.1882701721081318);
        setDoubleField(term624, term624.getClass(), "dMin1", 0.20230843747579808);
        setDoubleField(term624, term624.getClass(), "dMin2", 0.4995447078885714);
        setDoubleField(term624, term624.getClass(), "dN", 0.19855958465701706);
        setDoubleField(term624, term624.getClass(), "dN1", 0.6202418999768349);
        setDoubleField(term624, term624.getClass(), "dN2", 0.9848907582209794);
        setDoubleField(term624, term624.getClass(), "g", 0.9658751931880928);
        setDoubleElement(term727, 0, 0.6990187833274262);
        setField(term624, term624.getClass(), "realEigenvalues", term727);
        setDoubleElement(term729, 0, 0.6970994777067232);
        setField(term624, term624.getClass(), "imagEigenvalues", term729);
        setField(term732, term732.getClass(), "data", term733);
        setElement(term731, 0, term732);
        setField(term734, term734.getClass(), "data", term735);
        setElement(term731, 1, term734);
        setField(term736, term736.getClass(), "data", term737);
        setElement(term731, 2, term736);
        setField(term738, term738.getClass(), "data", term739);
        setElement(term731, 3, term738);
        setField(term740, term740.getClass(), "data", term741);
        setElement(term731, 4, term740);
        setField(term742, term742.getClass(), "data", term743);
        setElement(term731, 5, term742);
        setField(term624, term624.getClass(), "eigenvectors", term731);
        setField(term624, term624.getClass(), "cachedV", null);
        setField(term624, term624.getClass(), "cachedD", null);
        setField(term624, term624.getClass(), "cachedVt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getVT", argTypes, term624, args);
            assertTrue(false);
        }
        catch (InvalidMatrixException e) {
        }

    }

};


