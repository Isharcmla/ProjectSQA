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

public class EigenDecompositionImpl_computeSplits_75775256053 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2242;

    public EigenDecompositionImpl_computeSplits_75775256053() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2242 = newInstance(Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] term2244 = (double[]) newDoubleArray(0);
        double[] term2245 = (double[]) newDoubleArray(7);
        double[] term2253 = (double[]) newDoubleArray(9);
        Object term2263 = newInstance(Class.forName("org.apache.commons.math.linear.TriDiagonalTransformer"));
        Object[] term2264 = (Object[]) newArray("[D", 7);
        double[] term2265 = (double[]) newDoubleArray(1);
        double[] term2267 = (double[]) newDoubleArray(5);
        double[] term2273 = (double[]) newDoubleArray(2);
        double[] term2276 = (double[]) newDoubleArray(3);
        double[] term2280 = (double[]) newDoubleArray(1);
        double[] term2282 = (double[]) newDoubleArray(0);
        double[] term2283 = (double[]) newDoubleArray(0);
        double[] term2284 = (double[]) newDoubleArray(9);
        double[] term2294 = (double[]) newDoubleArray(2);
        double[] term2303 = (double[]) newDoubleArray(9);
        double[] term2324 = (double[]) newDoubleArray(7);
        double[] term2332 = (double[]) newDoubleArray(0);
        Object[] term2333 = (Object[]) newArray("org.apache.commons.math.linear.ArrayRealVector", 0);
        setDoubleField(term2242, term2242.getClass(), "splitTolerance", 0.3295962990623761);
        setField(term2242, term2242.getClass(), "main", term2244);
        setDoubleElement(term2245, 0, 1.0850966786768446E-4);
        setDoubleElement(term2245, 1, 0.5094636958219735);
        setDoubleElement(term2245, 2, 0.685767595670629);
        setDoubleElement(term2245, 3, 0.23723706027805036);
        setDoubleElement(term2245, 4, 0.7989546149805499);
        setDoubleElement(term2245, 5, 0.12788897235770702);
        setDoubleElement(term2245, 6, 0.6639975973495241);
        setField(term2242, term2242.getClass(), "secondary", term2245);
        setDoubleElement(term2253, 0, 0.4188231874187631);
        setDoubleElement(term2253, 1, 0.8023118817360049);
        setDoubleElement(term2253, 2, 0.14645177919899588);
        setDoubleElement(term2253, 3, 0.22699862391690062);
        setDoubleElement(term2253, 4, 0.5149544974885987);
        setDoubleElement(term2253, 5, 0.8722279671290181);
        setDoubleElement(term2253, 6, 0.18489050285246944);
        setDoubleElement(term2253, 7, 0.8978351455009401);
        setDoubleElement(term2253, 8, 0.22284027236090087);
        setField(term2242, term2242.getClass(), "squaredSecondary", term2253);
        setDoubleElement(term2265, 0, 0.6079591296036908);
        setElement(term2264, 0, term2265);
        setDoubleElement(term2267, 0, 0.19363089985015014);
        setDoubleElement(term2267, 1, 0.8233117016694336);
        setDoubleElement(term2267, 2, 0.3956991755475209);
        setDoubleElement(term2267, 3, 0.6843477900857968);
        setDoubleElement(term2267, 4, 0.1676561056681828);
        setElement(term2264, 1, term2267);
        setDoubleElement(term2273, 0, 0.6749140448521683);
        setDoubleElement(term2273, 1, 0.9881417714262862);
        setElement(term2264, 2, term2273);
        setDoubleElement(term2276, 0, 0.7337000438080983);
        setDoubleElement(term2276, 1, 0.2877342152446104);
        setDoubleElement(term2276, 2, 0.4579502284885265);
        setElement(term2264, 3, term2276);
        setDoubleElement(term2280, 0, 0.35525650405457);
        setElement(term2264, 4, term2280);
        setElement(term2264, 5, term2282);
        setElement(term2264, 6, term2283);
        setField(term2263, term2263.getClass(), "householderVectors", term2264);
        setDoubleElement(term2284, 0, 0.8474877838604428);
        setDoubleElement(term2284, 1, 0.8936973138508374);
        setDoubleElement(term2284, 2, 0.7373458011239485);
        setDoubleElement(term2284, 3, 0.9336280471224291);
        setDoubleElement(term2284, 4, 0.927519742701973);
        setDoubleElement(term2284, 5, 0.29309791570378785);
        setDoubleElement(term2284, 6, 0.14499093140326424);
        setDoubleElement(term2284, 7, 0.25927427995958796);
        setDoubleElement(term2284, 8, 0.9257970053187846);
        setField(term2263, term2263.getClass(), "main", term2284);
        setDoubleElement(term2294, 0, 0.9134526610201622);
        setDoubleElement(term2294, 1, 0.5462339333311422);
        setField(term2263, term2263.getClass(), "secondary", term2294);
        setField(term2263, term2263.getClass(), "cachedQ", null);
        setField(term2263, term2263.getClass(), "cachedQt", null);
        setField(term2263, term2263.getClass(), "cachedT", null);
        setField(term2242, term2242.getClass(), "transformer", term2263);
        setDoubleField(term2242, term2242.getClass(), "lowerSpectra", 0.6104966841551919);
        setDoubleField(term2242, term2242.getClass(), "upperSpectra", 0.4780880596367493);
        setDoubleField(term2242, term2242.getClass(), "minPivot", 0.7174146280831781);
        setDoubleField(term2242, term2242.getClass(), "sigma", 0.9120605477208);
        setDoubleField(term2242, term2242.getClass(), "sigmaLow", 0.302896023969903);
        setDoubleField(term2242, term2242.getClass(), "tau", 0.5583293703509996);
        setDoubleElement(term2303, 0, 0.11759977190822413);
        setDoubleElement(term2303, 1, 0.768693356879114);
        setDoubleElement(term2303, 2, 0.8093135131302098);
        setDoubleElement(term2303, 3, 0.5592771838075339);
        setDoubleElement(term2303, 4, 0.8514246643563477);
        setDoubleElement(term2303, 5, 0.07779122290725593);
        setDoubleElement(term2303, 6, 0.42921517973104373);
        setDoubleElement(term2303, 7, 0.6394072973636291);
        setDoubleElement(term2303, 8, 0.4061962331925175);
        setField(term2242, term2242.getClass(), "work", term2303);
        setIntField(term2242, term2242.getClass(), "pingPong", -226514366);
        setDoubleField(term2242, term2242.getClass(), "qMax", 0.538124451815847);
        setDoubleField(term2242, term2242.getClass(), "eMin", 0.1900451907417724);
        setIntField(term2242, term2242.getClass(), "tType", 1193880199);
        setDoubleField(term2242, term2242.getClass(), "dMin", 0.26687904044277755);
        setDoubleField(term2242, term2242.getClass(), "dMin1", 0.6208267483985057);
        setDoubleField(term2242, term2242.getClass(), "dMin2", 0.5935456780207055);
        setDoubleField(term2242, term2242.getClass(), "dN", 0.027331340622965494);
        setDoubleField(term2242, term2242.getClass(), "dN1", 0.6384507561235777);
        setDoubleField(term2242, term2242.getClass(), "dN2", 0.032930209231383456);
        setDoubleField(term2242, term2242.getClass(), "g", 0.8822726192631658);
        setDoubleElement(term2324, 0, 0.060834383944714965);
        setDoubleElement(term2324, 1, 0.05455375073513069);
        setDoubleElement(term2324, 2, 0.38868894902156725);
        setDoubleElement(term2324, 3, 0.4689439946635412);
        setDoubleElement(term2324, 4, 0.9607897323439137);
        setDoubleElement(term2324, 5, 0.391302766190016);
        setDoubleElement(term2324, 6, 0.4877622925755275);
        setField(term2242, term2242.getClass(), "realEigenvalues", term2324);
        setField(term2242, term2242.getClass(), "imagEigenvalues", term2332);
        setField(term2242, term2242.getClass(), "eigenvectors", term2333);
        setField(term2242, term2242.getClass(), "cachedV", null);
        setField(term2242, term2242.getClass(), "cachedD", null);
        setField(term2242, term2242.getClass(), "cachedVt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "computeSplits", argTypes, term2242, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


