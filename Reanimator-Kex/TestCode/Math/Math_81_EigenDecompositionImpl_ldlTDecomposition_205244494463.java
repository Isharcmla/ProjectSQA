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

public class EigenDecompositionImpl_ldlTDecomposition_205244494463 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3832;
     Object term3957;
     Object term3959;
     Object term3961;

    public EigenDecompositionImpl_ldlTDecomposition_205244494463() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3832 = newInstance(Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] term3834 = (double[]) newDoubleArray(4);
        double[] term3839 = (double[]) newDoubleArray(9);
        double[] term3849 = (double[]) newDoubleArray(8);
        Object term3858 = newInstance(Class.forName("org.apache.commons.math.linear.TriDiagonalTransformer"));
        Object[] term3859 = (Object[]) newArray("[D", 7);
        double[] term3860 = (double[]) newDoubleArray(8);
        double[] term3869 = (double[]) newDoubleArray(2);
        double[] term3872 = (double[]) newDoubleArray(5);
        double[] term3878 = (double[]) newDoubleArray(7);
        double[] term3886 = (double[]) newDoubleArray(3);
        double[] term3890 = (double[]) newDoubleArray(9);
        double[] term3900 = (double[]) newDoubleArray(0);
        double[] term3901 = (double[]) newDoubleArray(7);
        double[] term3909 = (double[]) newDoubleArray(6);
        double[] term3922 = (double[]) newDoubleArray(4);
        double[] term3938 = (double[]) newDoubleArray(2);
        double[] term3941 = (double[]) newDoubleArray(8);
        Object[] term3950 = (Object[]) newArray("org.apache.commons.math.linear.ArrayRealVector", 3);
        Object term3951 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term3952 = (double[]) newDoubleArray(0);
        Object term3953 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term3954 = (double[]) newDoubleArray(0);
        Object term3955 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term3956 = (double[]) newDoubleArray(0);
        setDoubleField(term3832, term3832.getClass(), "splitTolerance", 0.10381603222584945);
        setDoubleElement(term3834, 0, 0.7261189187916395);
        setDoubleElement(term3834, 1, 0.9948921909237972);
        setDoubleElement(term3834, 2, 0.8826676677418305);
        setDoubleElement(term3834, 3, 0.3515594618290028);
        setField(term3832, term3832.getClass(), "main", term3834);
        setDoubleElement(term3839, 0, 0.33705928226360893);
        setDoubleElement(term3839, 1, 0.2586931188724769);
        setDoubleElement(term3839, 2, 0.7172855866461255);
        setDoubleElement(term3839, 3, 0.863939500507578);
        setDoubleElement(term3839, 4, 0.7341124480529497);
        setDoubleElement(term3839, 5, 0.8568697336359051);
        setDoubleElement(term3839, 6, 0.670426474495622);
        setDoubleElement(term3839, 7, 0.7946992397818603);
        setDoubleElement(term3839, 8, 0.1875008638949398);
        setField(term3832, term3832.getClass(), "secondary", term3839);
        setDoubleElement(term3849, 0, 0.9863263105761877);
        setDoubleElement(term3849, 1, 0.7702717047713711);
        setDoubleElement(term3849, 2, 0.8081136617195611);
        setDoubleElement(term3849, 3, 0.9860913241292346);
        setDoubleElement(term3849, 4, 0.9042927054903839);
        setDoubleElement(term3849, 5, 0.9825423463658146);
        setDoubleElement(term3849, 6, 0.9535587012378192);
        setDoubleElement(term3849, 7, 0.10151513381457755);
        setField(term3832, term3832.getClass(), "squaredSecondary", term3849);
        setDoubleElement(term3860, 0, 0.2459118546787431);
        setDoubleElement(term3860, 1, 0.5187522941250506);
        setDoubleElement(term3860, 2, 0.5977863032810627);
        setDoubleElement(term3860, 3, 0.6384563119859914);
        setDoubleElement(term3860, 4, 0.47980964634221257);
        setDoubleElement(term3860, 5, 0.8674736307280658);
        setDoubleElement(term3860, 6, 0.1841006601291062);
        setDoubleElement(term3860, 7, 0.9772662571898173);
        setElement(term3859, 0, term3860);
        setDoubleElement(term3869, 0, 0.4139091920768172);
        setDoubleElement(term3869, 1, 0.7267446644246186);
        setElement(term3859, 1, term3869);
        setDoubleElement(term3872, 0, 0.537827096227626);
        setDoubleElement(term3872, 1, 0.7855714534403968);
        setDoubleElement(term3872, 2, 0.5670716603510538);
        setDoubleElement(term3872, 3, 0.36438526312425923);
        setDoubleElement(term3872, 4, 0.5439091451647288);
        setElement(term3859, 2, term3872);
        setDoubleElement(term3878, 0, 0.7522977618486756);
        setDoubleElement(term3878, 1, 0.7817162133058004);
        setDoubleElement(term3878, 2, 0.1878658491508698);
        setDoubleElement(term3878, 3, 0.2851657656957063);
        setDoubleElement(term3878, 4, 0.980543751621402);
        setDoubleElement(term3878, 5, 0.668392288510234);
        setDoubleElement(term3878, 6, 0.4665094559404003);
        setElement(term3859, 3, term3878);
        setDoubleElement(term3886, 0, 0.1486853030262536);
        setDoubleElement(term3886, 1, 0.46499223139707646);
        setDoubleElement(term3886, 2, 0.3453468493141325);
        setElement(term3859, 4, term3886);
        setDoubleElement(term3890, 0, 0.21618975850029776);
        setDoubleElement(term3890, 1, 0.9830283554079381);
        setDoubleElement(term3890, 2, 0.9750579395058171);
        setDoubleElement(term3890, 3, 0.46445076312727607);
        setDoubleElement(term3890, 4, 0.2303194999747199);
        setDoubleElement(term3890, 5, 0.12035700708914543);
        setDoubleElement(term3890, 6, 0.966726469721044);
        setDoubleElement(term3890, 7, 0.6994177008832577);
        setDoubleElement(term3890, 8, 0.12080795593692062);
        setElement(term3859, 5, term3890);
        setElement(term3859, 6, term3900);
        setField(term3858, term3858.getClass(), "householderVectors", term3859);
        setDoubleElement(term3901, 0, 0.9653030709105326);
        setDoubleElement(term3901, 1, 0.8540476296203835);
        setDoubleElement(term3901, 2, 0.7130699064213868);
        setDoubleElement(term3901, 3, 0.01879777575163344);
        setDoubleElement(term3901, 4, 0.8963335539756794);
        setDoubleElement(term3901, 5, 0.08550409147763638);
        setDoubleElement(term3901, 6, 0.11747519423867014);
        setField(term3858, term3858.getClass(), "main", term3901);
        setDoubleElement(term3909, 0, 0.27737512725954117);
        setDoubleElement(term3909, 1, 0.425566549289661);
        setDoubleElement(term3909, 2, 0.9909842947367329);
        setDoubleElement(term3909, 3, 0.09410007323903957);
        setDoubleElement(term3909, 4, 0.11707925397642116);
        setDoubleElement(term3909, 5, 0.9194364465405396);
        setField(term3858, term3858.getClass(), "secondary", term3909);
        setField(term3858, term3858.getClass(), "cachedQ", null);
        setField(term3858, term3858.getClass(), "cachedQt", null);
        setField(term3858, term3858.getClass(), "cachedT", null);
        setField(term3832, term3832.getClass(), "transformer", term3858);
        setDoubleField(term3832, term3832.getClass(), "lowerSpectra", 0.2918460514910114);
        setDoubleField(term3832, term3832.getClass(), "upperSpectra", 0.15069406866938573);
        setDoubleField(term3832, term3832.getClass(), "minPivot", 0.6599209406744684);
        setDoubleField(term3832, term3832.getClass(), "sigma", 0.6953021816793507);
        setDoubleField(term3832, term3832.getClass(), "sigmaLow", 0.4995650264719439);
        setDoubleField(term3832, term3832.getClass(), "tau", 0.9574403478989912);
        setDoubleElement(term3922, 0, 0.20875173844846828);
        setDoubleElement(term3922, 1, 0.9780380255747271);
        setDoubleElement(term3922, 2, 0.16772094099748935);
        setDoubleElement(term3922, 3, 0.3269789444716278);
        setField(term3832, term3832.getClass(), "work", term3922);
        setIntField(term3832, term3832.getClass(), "pingPong", -1588772968);
        setDoubleField(term3832, term3832.getClass(), "qMax", 0.9462090166123803);
        setDoubleField(term3832, term3832.getClass(), "eMin", 0.025841507651104934);
        setIntField(term3832, term3832.getClass(), "tType", -93135961);
        setDoubleField(term3832, term3832.getClass(), "dMin", 0.10758051417101444);
        setDoubleField(term3832, term3832.getClass(), "dMin1", 0.18122798538594065);
        setDoubleField(term3832, term3832.getClass(), "dMin2", 0.45109413827851297);
        setDoubleField(term3832, term3832.getClass(), "dN", 0.7159384496399914);
        setDoubleField(term3832, term3832.getClass(), "dN1", 0.22929607774606342);
        setDoubleField(term3832, term3832.getClass(), "dN2", 0.7824997546823239);
        setDoubleField(term3832, term3832.getClass(), "g", 0.559924713229934);
        setDoubleElement(term3938, 0, 0.018560091730935646);
        setDoubleElement(term3938, 1, 0.6287445113589258);
        setField(term3832, term3832.getClass(), "realEigenvalues", term3938);
        setDoubleElement(term3941, 0, 0.5972278507965504);
        setDoubleElement(term3941, 1, 0.1375338215620644);
        setDoubleElement(term3941, 2, 0.08151318020017784);
        setDoubleElement(term3941, 3, 0.9042905845988721);
        setDoubleElement(term3941, 4, 0.9076926920606503);
        setDoubleElement(term3941, 5, 0.2629725729946736);
        setDoubleElement(term3941, 6, 0.0978588191776315);
        setDoubleElement(term3941, 7, 0.45826582235668545);
        setField(term3832, term3832.getClass(), "imagEigenvalues", term3941);
        setField(term3951, term3951.getClass(), "data", term3952);
        setElement(term3950, 0, term3951);
        setField(term3953, term3953.getClass(), "data", term3954);
        setElement(term3950, 1, term3953);
        setField(term3955, term3955.getClass(), "data", term3956);
        setElement(term3950, 2, term3955);
        setField(term3832, term3832.getClass(), "eigenvectors", term3950);
        setField(term3832, term3832.getClass(), "cachedV", null);
        setField(term3832, term3832.getClass(), "cachedD", null);
        setField(term3832, term3832.getClass(), "cachedVt", null);
        term3957 = new Double(0.6904525566843978);
        term3959 = new Integer(-112921587);
        term3961 = new Integer(933028652);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = double.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term3957;
        args[1] = term3959;
        args[2] = term3961;
        try {
            callMethod(klass, "ldlTDecomposition", argTypes, term3832, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


