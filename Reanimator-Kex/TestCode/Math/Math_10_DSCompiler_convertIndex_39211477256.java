package org.apache.commons.math3.analysis.differentiation;

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
import java.lang.OutOfMemoryError;
import static org.apache.commons.math3.analysis.differentiation.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;

public class DSCompiler_convertIndex_39211477256 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6796;
     Object term6798;
     Object term6800;
     Object term6845;
     Object term6847;
     Object term6849;

    public DSCompiler_convertIndex_39211477256() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6796 = new Integer(-125626789);
        term6798 = new Integer(-309827965);
        term6800 = (Object[]) newArray("[I", 7);
        int[] term6801 = (int[]) newIntArray(3);
        int[] term6805 = (int[]) newIntArray(5);
        int[] term6811 = (int[]) newIntArray(4);
        int[] term6816 = (int[]) newIntArray(4);
        int[] term6821 = (int[]) newIntArray(5);
        int[] term6827 = (int[]) newIntArray(7);
        int[] term6835 = (int[]) newIntArray(9);
        setIntElement(term6801, 0, -1534471014);
        setIntElement(term6801, 1, -468720148);
        setIntElement(term6801, 2, 164755425);
        setElement(term6800, 0, term6801);
        setIntElement(term6805, 0, 205469595);
        setIntElement(term6805, 1, -638606539);
        setIntElement(term6805, 2, -172607907);
        setIntElement(term6805, 3, 182656750);
        setIntElement(term6805, 4, -51407538);
        setElement(term6800, 1, term6805);
        setIntElement(term6811, 0, -465783748);
        setIntElement(term6811, 1, 1780832439);
        setIntElement(term6811, 2, 1781593194);
        setIntElement(term6811, 3, -929366947);
        setElement(term6800, 2, term6811);
        setIntElement(term6816, 0, -10579292);
        setIntElement(term6816, 1, 2042788478);
        setIntElement(term6816, 2, -620591021);
        setIntElement(term6816, 3, -766656824);
        setElement(term6800, 3, term6816);
        setIntElement(term6821, 0, 137514813);
        setIntElement(term6821, 1, -590298353);
        setIntElement(term6821, 2, -917544425);
        setIntElement(term6821, 3, -1044762733);
        setIntElement(term6821, 4, 446184231);
        setElement(term6800, 4, term6821);
        setIntElement(term6827, 0, 1313599240);
        setIntElement(term6827, 1, 1889501733);
        setIntElement(term6827, 2, 1316243148);
        setIntElement(term6827, 3, 1524913540);
        setIntElement(term6827, 4, -1924743705);
        setIntElement(term6827, 5, -1829672767);
        setIntElement(term6827, 6, -311098933);
        setElement(term6800, 5, term6827);
        setIntElement(term6835, 0, -1778687889);
        setIntElement(term6835, 1, -1827662352);
        setIntElement(term6835, 2, -1292290537);
        setIntElement(term6835, 3, 1060963259);
        setIntElement(term6835, 4, -1275604693);
        setIntElement(term6835, 5, 455869012);
        setIntElement(term6835, 6, 782841747);
        setIntElement(term6835, 7, 744634969);
        setIntElement(term6835, 8, -13561953);
        setElement(term6800, 6, term6835);
        term6845 = new Integer(2069622671);
        term6847 = new Integer(86341231);
        term6849 = (Object[]) newArray("[I", 1);
        int[] term6850 = (int[]) newIntArray(3);
        setIntElement(term6850, 0, -926119173);
        setIntElement(term6850, 1, 1613936898);
        setIntElement(term6850, 2, -406599151);
        setElement(term6849, 0, term6850);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = Array.newInstance(Array.newInstance(int.class, 0).getClass(), 0).getClass();
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        argTypes[5] = Array.newInstance(Array.newInstance(int.class, 0).getClass(), 0).getClass();
        Object[] args = new Object[6];
        args[0] = term6796;
        args[1] = term6798;
        args[2] = term6800;
        args[3] = term6845;
        args[4] = term6847;
        args[5] = term6849;
        try {
            callMethod(klass, "convertIndex", argTypes, null, args);
            assertTrue(false);
        }
        catch (OutOfMemoryError e) {
        }

    }

};


