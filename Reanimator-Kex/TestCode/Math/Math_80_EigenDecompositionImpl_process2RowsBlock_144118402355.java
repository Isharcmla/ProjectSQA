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
import java.lang.Integer;

public class EigenDecompositionImpl_process2RowsBlock_144118402355 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2583;
     Object term2715;

    public EigenDecompositionImpl_process2RowsBlock_144118402355() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2583 = newInstance(Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] term2585 = (double[]) newDoubleArray(0);
        double[] term2586 = (double[]) newDoubleArray(5);
        double[] term2592 = (double[]) newDoubleArray(6);
        Object term2599 = newInstance(Class.forName("org.apache.commons.math.linear.TriDiagonalTransformer"));
        Object[] term2600 = (Object[]) newArray("[D", 8);
        double[] term2601 = (double[]) newDoubleArray(4);
        double[] term2606 = (double[]) newDoubleArray(0);
        double[] term2607 = (double[]) newDoubleArray(4);
        double[] term2612 = (double[]) newDoubleArray(8);
        double[] term2621 = (double[]) newDoubleArray(8);
        double[] term2630 = (double[]) newDoubleArray(7);
        double[] term2638 = (double[]) newDoubleArray(7);
        double[] term2646 = (double[]) newDoubleArray(7);
        double[] term2654 = (double[]) newDoubleArray(9);
        double[] term2664 = (double[]) newDoubleArray(2);
        double[] term2673 = (double[]) newDoubleArray(3);
        double[] term2688 = (double[]) newDoubleArray(9);
        double[] term2698 = (double[]) newDoubleArray(5);
        Object[] term2704 = (Object[]) newArray("org.apache.commons.math.linear.ArrayRealVector", 5);
        Object term2705 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term2706 = (double[]) newDoubleArray(0);
        Object term2707 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term2708 = (double[]) newDoubleArray(0);
        Object term2709 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term2710 = (double[]) newDoubleArray(0);
        Object term2711 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term2712 = (double[]) newDoubleArray(0);
        Object term2713 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term2714 = (double[]) newDoubleArray(0);
        setDoubleField(term2583, term2583.getClass(), "splitTolerance", 0.45125789063502075);
        setField(term2583, term2583.getClass(), "main", term2585);
        setDoubleElement(term2586, 0, 0.4651628339961664);
        setDoubleElement(term2586, 1, 0.7335000266072508);
        setDoubleElement(term2586, 2, 0.947310784971331);
        setDoubleElement(term2586, 3, 0.6789722913921049);
        setDoubleElement(term2586, 4, 0.8655559834554122);
        setField(term2583, term2583.getClass(), "secondary", term2586);
        setDoubleElement(term2592, 0, 0.468233333654713);
        setDoubleElement(term2592, 1, 0.5010487964484078);
        setDoubleElement(term2592, 2, 0.449352073121681);
        setDoubleElement(term2592, 3, 0.7010269091136693);
        setDoubleElement(term2592, 4, 0.6612253481241203);
        setDoubleElement(term2592, 5, 0.22159627353099653);
        setField(term2583, term2583.getClass(), "squaredSecondary", term2592);
        setDoubleElement(term2601, 0, 0.9679819474184936);
        setDoubleElement(term2601, 1, 0.3343151559079882);
        setDoubleElement(term2601, 2, 0.6973440561579057);
        setDoubleElement(term2601, 3, 0.6981733274274508);
        setElement(term2600, 0, term2601);
        setElement(term2600, 1, term2606);
        setDoubleElement(term2607, 0, 0.5254152993039658);
        setDoubleElement(term2607, 1, 0.6770437436003307);
        setDoubleElement(term2607, 2, 0.015208773428327271);
        setDoubleElement(term2607, 3, 0.0933121742441071);
        setElement(term2600, 2, term2607);
        setDoubleElement(term2612, 0, 0.5371404053867213);
        setDoubleElement(term2612, 1, 0.6372898090980943);
        setDoubleElement(term2612, 2, 0.3206358497126319);
        setDoubleElement(term2612, 3, 0.9134475124119456);
        setDoubleElement(term2612, 4, 0.604005925723234);
        setDoubleElement(term2612, 5, 0.09085716075575845);
        setDoubleElement(term2612, 6, 0.4650292333586332);
        setDoubleElement(term2612, 7, 0.8569953782772801);
        setElement(term2600, 3, term2612);
        setDoubleElement(term2621, 0, 0.08056271554791417);
        setDoubleElement(term2621, 1, 0.44988903312602435);
        setDoubleElement(term2621, 2, 0.23642666354900033);
        setDoubleElement(term2621, 3, 0.8902204907756573);
        setDoubleElement(term2621, 4, 0.6983497475737548);
        setDoubleElement(term2621, 5, 0.6573435107905762);
        setDoubleElement(term2621, 6, 0.07360834017597784);
        setDoubleElement(term2621, 7, 0.2841980317748807);
        setElement(term2600, 4, term2621);
        setDoubleElement(term2630, 0, 0.5069720174604592);
        setDoubleElement(term2630, 1, 0.09698561439601938);
        setDoubleElement(term2630, 2, 0.632619707106301);
        setDoubleElement(term2630, 3, 0.33543520560015705);
        setDoubleElement(term2630, 4, 0.7678885587717854);
        setDoubleElement(term2630, 5, 0.47593360471544055);
        setDoubleElement(term2630, 6, 0.21025535219507407);
        setElement(term2600, 5, term2630);
        setDoubleElement(term2638, 0, 0.888224789174992);
        setDoubleElement(term2638, 1, 0.4641490000883852);
        setDoubleElement(term2638, 2, 0.21042972592161768);
        setDoubleElement(term2638, 3, 0.26049675307990616);
        setDoubleElement(term2638, 4, 0.5785610527240695);
        setDoubleElement(term2638, 5, 0.7738879923484795);
        setDoubleElement(term2638, 6, 0.2253882713638632);
        setElement(term2600, 6, term2638);
        setDoubleElement(term2646, 0, 0.6275914149539582);
        setDoubleElement(term2646, 1, 0.9274562758623592);
        setDoubleElement(term2646, 2, 0.19620586026471565);
        setDoubleElement(term2646, 3, 0.36440672260307005);
        setDoubleElement(term2646, 4, 0.6634063452948586);
        setDoubleElement(term2646, 5, 0.025753664742759197);
        setDoubleElement(term2646, 6, 0.015135741281902426);
        setElement(term2600, 7, term2646);
        setField(term2599, term2599.getClass(), "householderVectors", term2600);
        setDoubleElement(term2654, 0, 0.7993088150810629);
        setDoubleElement(term2654, 1, 0.09688462700292666);
        setDoubleElement(term2654, 2, 0.5730404484037843);
        setDoubleElement(term2654, 3, 0.4407163979395128);
        setDoubleElement(term2654, 4, 0.9269205294879431);
        setDoubleElement(term2654, 5, 0.37987828253629097);
        setDoubleElement(term2654, 6, 0.46002292402012845);
        setDoubleElement(term2654, 7, 0.07576112949826419);
        setDoubleElement(term2654, 8, 0.24566365533636159);
        setField(term2599, term2599.getClass(), "main", term2654);
        setDoubleElement(term2664, 0, 0.2463268413696491);
        setDoubleElement(term2664, 1, 0.9167325608601028);
        setField(term2599, term2599.getClass(), "secondary", term2664);
        setField(term2599, term2599.getClass(), "cachedQ", null);
        setField(term2599, term2599.getClass(), "cachedQt", null);
        setField(term2599, term2599.getClass(), "cachedT", null);
        setField(term2583, term2583.getClass(), "transformer", term2599);
        setDoubleField(term2583, term2583.getClass(), "lowerSpectra", 0.322733130398406);
        setDoubleField(term2583, term2583.getClass(), "upperSpectra", 0.6156836826176545);
        setDoubleField(term2583, term2583.getClass(), "minPivot", 0.39069566378513887);
        setDoubleField(term2583, term2583.getClass(), "sigma", 0.4881905409180768);
        setDoubleField(term2583, term2583.getClass(), "sigmaLow", 0.9672077515558327);
        setDoubleField(term2583, term2583.getClass(), "tau", 0.12361209051522037);
        setDoubleElement(term2673, 0, 0.4967837135289873);
        setDoubleElement(term2673, 1, 0.7446656563882201);
        setDoubleElement(term2673, 2, 0.45272310112422676);
        setField(term2583, term2583.getClass(), "work", term2673);
        setIntField(term2583, term2583.getClass(), "pingPong", -1145578966);
        setDoubleField(term2583, term2583.getClass(), "qMax", 0.4966954285146774);
        setDoubleField(term2583, term2583.getClass(), "eMin", 0.32945572442826243);
        setIntField(term2583, term2583.getClass(), "tType", 679763016);
        setDoubleField(term2583, term2583.getClass(), "dMin", 0.6854184775698091);
        setDoubleField(term2583, term2583.getClass(), "dMin1", 0.296390053884094);
        setDoubleField(term2583, term2583.getClass(), "dMin2", 0.6409069812384914);
        setDoubleField(term2583, term2583.getClass(), "dN", 0.23954904849534175);
        setDoubleField(term2583, term2583.getClass(), "dN1", 0.25283230007791835);
        setDoubleField(term2583, term2583.getClass(), "dN2", 0.685453198432316);
        setDoubleField(term2583, term2583.getClass(), "g", 0.4137890238695421);
        setDoubleElement(term2688, 0, 0.22615059242924673);
        setDoubleElement(term2688, 1, 0.23808939694034947);
        setDoubleElement(term2688, 2, 0.5420652557166548);
        setDoubleElement(term2688, 3, 0.1851570495958219);
        setDoubleElement(term2688, 4, 0.6506349057119887);
        setDoubleElement(term2688, 5, 0.13005892834452748);
        setDoubleElement(term2688, 6, 0.24685644348529212);
        setDoubleElement(term2688, 7, 0.08742954462482633);
        setDoubleElement(term2688, 8, 0.8032994398981518);
        setField(term2583, term2583.getClass(), "realEigenvalues", term2688);
        setDoubleElement(term2698, 0, 0.1358203057417402);
        setDoubleElement(term2698, 1, 0.7714520264828358);
        setDoubleElement(term2698, 2, 0.11223044807975435);
        setDoubleElement(term2698, 3, 0.7861285218058128);
        setDoubleElement(term2698, 4, 0.6842542833308128);
        setField(term2583, term2583.getClass(), "imagEigenvalues", term2698);
        setField(term2705, term2705.getClass(), "data", term2706);
        setElement(term2704, 0, term2705);
        setField(term2707, term2707.getClass(), "data", term2708);
        setElement(term2704, 1, term2707);
        setField(term2709, term2709.getClass(), "data", term2710);
        setElement(term2704, 2, term2709);
        setField(term2711, term2711.getClass(), "data", term2712);
        setElement(term2704, 3, term2711);
        setField(term2713, term2713.getClass(), "data", term2714);
        setElement(term2704, 4, term2713);
        setField(term2583, term2583.getClass(), "eigenvectors", term2704);
        setField(term2583, term2583.getClass(), "cachedV", null);
        setField(term2583, term2583.getClass(), "cachedD", null);
        setField(term2583, term2583.getClass(), "cachedVt", null);
        term2715 = new Integer(1962444399);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2715;
        try {
            callMethod(klass, "process2RowsBlock", argTypes, term2583, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


