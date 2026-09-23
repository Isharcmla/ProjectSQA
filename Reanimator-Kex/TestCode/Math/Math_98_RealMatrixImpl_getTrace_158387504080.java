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
import java.lang.IllegalArgumentException;
import static org.apache.commons.math.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class RealMatrixImpl_getTrace_158387504080 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3362;

    public RealMatrixImpl_getTrace_158387504080() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3362 = newInstance(Class.forName("org.apache.commons.math.linear.RealMatrixImpl"));
        Object[] term3363 = (Object[]) newArray("[D", 5);
        double[] term3364 = (double[]) newDoubleArray(0);
        double[] term3365 = (double[]) newDoubleArray(2);
        double[] term3368 = (double[]) newDoubleArray(6);
        double[] term3375 = (double[]) newDoubleArray(3);
        double[] term3379 = (double[]) newDoubleArray(7);
        Object[] term3387 = (Object[]) newArray("[D", 8);
        double[] term3388 = (double[]) newDoubleArray(3);
        double[] term3392 = (double[]) newDoubleArray(5);
        double[] term3398 = (double[]) newDoubleArray(7);
        double[] term3406 = (double[]) newDoubleArray(6);
        double[] term3413 = (double[]) newDoubleArray(8);
        double[] term3422 = (double[]) newDoubleArray(8);
        double[] term3431 = (double[]) newDoubleArray(5);
        double[] term3437 = (double[]) newDoubleArray(6);
        int[] term3444 = (int[]) newIntArray(6);
        setElement(term3363, 0, term3364);
        setDoubleElement(term3365, 0, 0.6436529669594808);
        setDoubleElement(term3365, 1, 0.8739008473755843);
        setElement(term3363, 1, term3365);
        setDoubleElement(term3368, 0, 0.33020571520378217);
        setDoubleElement(term3368, 1, 0.4400066388974938);
        setDoubleElement(term3368, 2, 0.35751311073636893);
        setDoubleElement(term3368, 3, 0.6265495707567974);
        setDoubleElement(term3368, 4, 0.2149850050932005);
        setDoubleElement(term3368, 5, 0.39734394475804036);
        setElement(term3363, 2, term3368);
        setDoubleElement(term3375, 0, 0.03234340029222138);
        setDoubleElement(term3375, 1, 0.19671648397453156);
        setDoubleElement(term3375, 2, 0.30660613136199666);
        setElement(term3363, 3, term3375);
        setDoubleElement(term3379, 0, 0.6717352294199702);
        setDoubleElement(term3379, 1, 0.24939968658916778);
        setDoubleElement(term3379, 2, 0.039913942834409855);
        setDoubleElement(term3379, 3, 0.5454459427467968);
        setDoubleElement(term3379, 4, 0.2047321158544234);
        setDoubleElement(term3379, 5, 0.7582778924059825);
        setDoubleElement(term3379, 6, 0.20463644910685885);
        setElement(term3363, 4, term3379);
        setField(term3362, term3362.getClass(), "data", term3363);
        setDoubleElement(term3388, 0, 0.6829174717775378);
        setDoubleElement(term3388, 1, 0.28503580900047076);
        setDoubleElement(term3388, 2, 0.6947797782684805);
        setElement(term3387, 0, term3388);
        setDoubleElement(term3392, 0, 0.38236284006262744);
        setDoubleElement(term3392, 1, 0.47495853169088265);
        setDoubleElement(term3392, 2, 0.6328722780022467);
        setDoubleElement(term3392, 3, 0.37793096990014663);
        setDoubleElement(term3392, 4, 0.3979243958051598);
        setElement(term3387, 1, term3392);
        setDoubleElement(term3398, 0, 0.45035410318626456);
        setDoubleElement(term3398, 1, 0.41663054506323705);
        setDoubleElement(term3398, 2, 0.5888915432899102);
        setDoubleElement(term3398, 3, 0.943613874626141);
        setDoubleElement(term3398, 4, 0.24891816914282516);
        setDoubleElement(term3398, 5, 0.9450812156838558);
        setDoubleElement(term3398, 6, 0.27063228250778126);
        setElement(term3387, 2, term3398);
        setDoubleElement(term3406, 0, 0.6543561796867697);
        setDoubleElement(term3406, 1, 0.8888185305615081);
        setDoubleElement(term3406, 2, 0.5255619365560299);
        setDoubleElement(term3406, 3, 0.5296333160336295);
        setDoubleElement(term3406, 4, 0.0714564727239343);
        setDoubleElement(term3406, 5, 0.09283592692654719);
        setElement(term3387, 3, term3406);
        setDoubleElement(term3413, 0, 0.38183705499247544);
        setDoubleElement(term3413, 1, 0.6694932193674669);
        setDoubleElement(term3413, 2, 0.6488870209706011);
        setDoubleElement(term3413, 3, 0.9801062951794595);
        setDoubleElement(term3413, 4, 0.5849091704746101);
        setDoubleElement(term3413, 5, 0.7412210306652769);
        setDoubleElement(term3413, 6, 0.7187689681914144);
        setDoubleElement(term3413, 7, 0.012903380955819);
        setElement(term3387, 4, term3413);
        setDoubleElement(term3422, 0, 0.6658804849092964);
        setDoubleElement(term3422, 1, 0.756115359256126);
        setDoubleElement(term3422, 2, 0.25165131800473484);
        setDoubleElement(term3422, 3, 0.07727592847638232);
        setDoubleElement(term3422, 4, 0.9520320225024602);
        setDoubleElement(term3422, 5, 0.27451792725982416);
        setDoubleElement(term3422, 6, 0.3223838166658701);
        setDoubleElement(term3422, 7, 0.9718625550615242);
        setElement(term3387, 5, term3422);
        setDoubleElement(term3431, 0, 0.6956094243277123);
        setDoubleElement(term3431, 1, 0.5573619522213374);
        setDoubleElement(term3431, 2, 0.42382625246690864);
        setDoubleElement(term3431, 3, 0.3809642138437217);
        setDoubleElement(term3431, 4, 0.7493740389056603);
        setElement(term3387, 6, term3431);
        setDoubleElement(term3437, 0, 0.8473180235516031);
        setDoubleElement(term3437, 1, 0.15833228093630225);
        setDoubleElement(term3437, 2, 0.6159623060552193);
        setDoubleElement(term3437, 3, 0.883798426792428);
        setDoubleElement(term3437, 4, 0.6324735890734227);
        setDoubleElement(term3437, 5, 0.3808902109160499);
        setElement(term3387, 7, term3437);
        setField(term3362, term3362.getClass(), "lu", term3387);
        setIntElement(term3444, 0, 11724947);
        setIntElement(term3444, 1, 1953277050);
        setIntElement(term3444, 2, 1283079251);
        setIntElement(term3444, 3, -523949691);
        setIntElement(term3444, 4, 1398204340);
        setIntElement(term3444, 5, 229204365);
        setField(term3362, term3362.getClass(), "permutation", term3444);
        setIntField(term3362, term3362.getClass(), "parity", 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.RealMatrixImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getTrace", argTypes, term3362, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


