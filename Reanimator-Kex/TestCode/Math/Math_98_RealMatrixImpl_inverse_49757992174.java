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

public class RealMatrixImpl_inverse_49757992174 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2659;

    public RealMatrixImpl_inverse_49757992174() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2659 = newInstance(Class.forName("org.apache.commons.math.linear.RealMatrixImpl"));
        Object[] term2660 = (Object[]) newArray("[D", 6);
        double[] term2661 = (double[]) newDoubleArray(7);
        double[] term2669 = (double[]) newDoubleArray(5);
        double[] term2675 = (double[]) newDoubleArray(8);
        double[] term2684 = (double[]) newDoubleArray(2);
        double[] term2687 = (double[]) newDoubleArray(4);
        double[] term2692 = (double[]) newDoubleArray(2);
        Object[] term2695 = (Object[]) newArray("[D", 6);
        double[] term2696 = (double[]) newDoubleArray(4);
        double[] term2701 = (double[]) newDoubleArray(0);
        double[] term2702 = (double[]) newDoubleArray(3);
        double[] term2706 = (double[]) newDoubleArray(4);
        double[] term2711 = (double[]) newDoubleArray(9);
        double[] term2721 = (double[]) newDoubleArray(4);
        int[] term2726 = (int[]) newIntArray(6);
        setDoubleElement(term2661, 0, 0.22284027236090087);
        setDoubleElement(term2661, 1, 0.6079591296036908);
        setDoubleElement(term2661, 2, 0.19363089985015014);
        setDoubleElement(term2661, 3, 0.8233117016694336);
        setDoubleElement(term2661, 4, 0.3956991755475209);
        setDoubleElement(term2661, 5, 0.6843477900857968);
        setDoubleElement(term2661, 6, 0.1676561056681828);
        setElement(term2660, 0, term2661);
        setDoubleElement(term2669, 0, 0.6749140448521683);
        setDoubleElement(term2669, 1, 0.9881417714262862);
        setDoubleElement(term2669, 2, 0.7337000438080983);
        setDoubleElement(term2669, 3, 0.2877342152446104);
        setDoubleElement(term2669, 4, 0.4579502284885265);
        setElement(term2660, 1, term2669);
        setDoubleElement(term2675, 0, 0.35525650405457);
        setDoubleElement(term2675, 1, 0.8474877838604428);
        setDoubleElement(term2675, 2, 0.8936973138508374);
        setDoubleElement(term2675, 3, 0.7373458011239485);
        setDoubleElement(term2675, 4, 0.9336280471224291);
        setDoubleElement(term2675, 5, 0.927519742701973);
        setDoubleElement(term2675, 6, 0.29309791570378785);
        setDoubleElement(term2675, 7, 0.14499093140326424);
        setElement(term2660, 2, term2675);
        setDoubleElement(term2684, 0, 0.25927427995958796);
        setDoubleElement(term2684, 1, 0.9257970053187846);
        setElement(term2660, 3, term2684);
        setDoubleElement(term2687, 0, 0.9134526610201622);
        setDoubleElement(term2687, 1, 0.5462339333311422);
        setDoubleElement(term2687, 2, 0.6104966841551919);
        setDoubleElement(term2687, 3, 0.4780880596367493);
        setElement(term2660, 4, term2687);
        setDoubleElement(term2692, 0, 0.7174146280831781);
        setDoubleElement(term2692, 1, 0.9120605477208);
        setElement(term2660, 5, term2692);
        setField(term2659, term2659.getClass(), "data", term2660);
        setDoubleElement(term2696, 0, 0.302896023969903);
        setDoubleElement(term2696, 1, 0.5583293703509996);
        setDoubleElement(term2696, 2, 0.11759977190822413);
        setDoubleElement(term2696, 3, 0.768693356879114);
        setElement(term2695, 0, term2696);
        setElement(term2695, 1, term2701);
        setDoubleElement(term2702, 0, 0.8093135131302098);
        setDoubleElement(term2702, 1, 0.5592771838075339);
        setDoubleElement(term2702, 2, 0.8514246643563477);
        setElement(term2695, 2, term2702);
        setDoubleElement(term2706, 0, 0.07779122290725593);
        setDoubleElement(term2706, 1, 0.42921517973104373);
        setDoubleElement(term2706, 2, 0.6394072973636291);
        setDoubleElement(term2706, 3, 0.4061962331925175);
        setElement(term2695, 3, term2706);
        setDoubleElement(term2711, 0, 0.538124451815847);
        setDoubleElement(term2711, 1, 0.1900451907417724);
        setDoubleElement(term2711, 2, 0.26687904044277755);
        setDoubleElement(term2711, 3, 0.6208267483985057);
        setDoubleElement(term2711, 4, 0.5935456780207055);
        setDoubleElement(term2711, 5, 0.027331340622965494);
        setDoubleElement(term2711, 6, 0.6384507561235777);
        setDoubleElement(term2711, 7, 0.032930209231383456);
        setDoubleElement(term2711, 8, 0.8822726192631658);
        setElement(term2695, 4, term2711);
        setDoubleElement(term2721, 0, 0.060834383944714965);
        setDoubleElement(term2721, 1, 0.05455375073513069);
        setDoubleElement(term2721, 2, 0.38868894902156725);
        setDoubleElement(term2721, 3, 0.4689439946635412);
        setElement(term2695, 5, term2721);
        setField(term2659, term2659.getClass(), "lu", term2695);
        setIntElement(term2726, 0, -1963434938);
        setIntElement(term2726, 1, 906181092);
        setIntElement(term2726, 2, 1045657203);
        setIntElement(term2726, 3, 1386130016);
        setIntElement(term2726, 4, 1072005683);
        setIntElement(term2726, 5, 1861318859);
        setField(term2659, term2659.getClass(), "permutation", term2726);
        setIntField(term2659, term2659.getClass(), "parity", 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.RealMatrixImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "inverse", argTypes, term2659, args);
            assertTrue(false);
        }
        catch (InvalidMatrixException e) {
        }

    }

};


