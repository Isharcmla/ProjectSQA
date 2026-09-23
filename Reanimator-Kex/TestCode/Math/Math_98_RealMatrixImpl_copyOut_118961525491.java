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

public class RealMatrixImpl_copyOut_118961525491 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4736;

    public RealMatrixImpl_copyOut_118961525491() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4736 = newInstance(Class.forName("org.apache.commons.math.linear.RealMatrixImpl"));
        Object[] term4737 = (Object[]) newArray("[D", 2);
        double[] term4738 = (double[]) newDoubleArray(2);
        double[] term4741 = (double[]) newDoubleArray(7);
        Object[] term4749 = (Object[]) newArray("[D", 4);
        double[] term4750 = (double[]) newDoubleArray(4);
        double[] term4755 = (double[]) newDoubleArray(4);
        double[] term4760 = (double[]) newDoubleArray(1);
        double[] term4762 = (double[]) newDoubleArray(7);
        int[] term4770 = (int[]) newIntArray(6);
        setDoubleElement(term4738, 0, 0.08151318020017784);
        setDoubleElement(term4738, 1, 0.9042905845988721);
        setElement(term4737, 0, term4738);
        setDoubleElement(term4741, 0, 0.9076926920606503);
        setDoubleElement(term4741, 1, 0.2629725729946736);
        setDoubleElement(term4741, 2, 0.0978588191776315);
        setDoubleElement(term4741, 3, 0.45826582235668545);
        setDoubleElement(term4741, 4, 0.6904525566843978);
        setDoubleElement(term4741, 5, 0.18560468753172665);
        setDoubleElement(term4741, 6, 0.7356611808890637);
        setElement(term4737, 1, term4741);
        setField(term4736, term4736.getClass(), "data", term4737);
        setDoubleElement(term4750, 0, 0.7147117146060841);
        setDoubleElement(term4750, 1, 0.33975758144309276);
        setDoubleElement(term4750, 2, 0.16116508413978003);
        setDoubleElement(term4750, 3, 0.6714624608522081);
        setElement(term4749, 0, term4750);
        setDoubleElement(term4755, 0, 0.7679444712297933);
        setDoubleElement(term4755, 1, 0.5300449702511889);
        setDoubleElement(term4755, 2, 0.9386867634714298);
        setDoubleElement(term4755, 3, 0.6880862041479128);
        setElement(term4749, 1, term4755);
        setDoubleElement(term4760, 0, 0.9657559077723522);
        setElement(term4749, 2, term4760);
        setDoubleElement(term4762, 0, 0.8836831873692292);
        setDoubleElement(term4762, 1, 0.23658362473895145);
        setDoubleElement(term4762, 2, 0.8725659302223006);
        setDoubleElement(term4762, 3, 0.32657279509087744);
        setDoubleElement(term4762, 4, 0.13845411040576694);
        setDoubleElement(term4762, 5, 0.01980900066820912);
        setDoubleElement(term4762, 6, 0.6814413815228997);
        setElement(term4749, 3, term4762);
        setField(term4736, term4736.getClass(), "lu", term4749);
        setIntElement(term4770, 0, -2131181468);
        setIntElement(term4770, 1, 282916351);
        setIntElement(term4770, 2, 880977281);
        setIntElement(term4770, 3, 371943306);
        setIntElement(term4770, 4, 982388293);
        setIntElement(term4770, 5, -159494544);
        setField(term4736, term4736.getClass(), "permutation", term4770);
        setIntField(term4736, term4736.getClass(), "parity", 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.RealMatrixImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "copyOut", argTypes, term4736, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


