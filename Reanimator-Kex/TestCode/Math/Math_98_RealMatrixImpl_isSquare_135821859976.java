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
import static org.apache.commons.math.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math.linear.EqualityUtils.*;
import java.lang.Object;

public class RealMatrixImpl_isSquare_135821859976 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2857;
     Object term19288;

    public RealMatrixImpl_isSquare_135821859976() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2857 = newInstance(Class.forName("org.apache.commons.math.linear.RealMatrixImpl"));
        Object[] term2858 = (Object[]) newArray("[D", 7);
        double[] term2859 = (double[]) newDoubleArray(3);
        double[] term2863 = (double[]) newDoubleArray(7);
        double[] term2871 = (double[]) newDoubleArray(8);
        double[] term2880 = (double[]) newDoubleArray(4);
        double[] term2885 = (double[]) newDoubleArray(9);
        double[] term2895 = (double[]) newDoubleArray(6);
        double[] term2902 = (double[]) newDoubleArray(3);
        Object[] term2906 = (Object[]) newArray("[D", 3);
        double[] term2907 = (double[]) newDoubleArray(4);
        double[] term2912 = (double[]) newDoubleArray(2);
        double[] term2915 = (double[]) newDoubleArray(4);
        int[] term2920 = (int[]) newIntArray(1);
        setDoubleElement(term2859, 0, 0.1960225801238138);
        setDoubleElement(term2859, 1, 0.5148137742678777);
        setDoubleElement(term2859, 2, 0.8391459612166138);
        setElement(term2858, 0, term2859);
        setDoubleElement(term2863, 0, 0.16703018107140954);
        setDoubleElement(term2863, 1, 0.4586817610515208);
        setDoubleElement(term2863, 2, 0.4514428416311852);
        setDoubleElement(term2863, 3, 0.05035312439979578);
        setDoubleElement(term2863, 4, 0.2030931676384783);
        setDoubleElement(term2863, 5, 0.5220991694127869);
        setDoubleElement(term2863, 6, 0.7431278279525401);
        setElement(term2858, 1, term2863);
        setDoubleElement(term2871, 0, 0.6468277621896449);
        setDoubleElement(term2871, 1, 0.6348426143487798);
        setDoubleElement(term2871, 2, 0.2609298549951239);
        setDoubleElement(term2871, 3, 0.6131087144069463);
        setDoubleElement(term2871, 4, 0.4961600023778727);
        setDoubleElement(term2871, 5, 0.15336192373549007);
        setDoubleElement(term2871, 6, 0.9148125806219113);
        setDoubleElement(term2871, 7, 0.5424105805193429);
        setElement(term2858, 2, term2871);
        setDoubleElement(term2880, 0, 0.961202697260254);
        setDoubleElement(term2880, 1, 0.6198565030073423);
        setDoubleElement(term2880, 2, 0.06523961946138956);
        setDoubleElement(term2880, 3, 0.5651796580837669);
        setElement(term2858, 3, term2880);
        setDoubleElement(term2885, 0, 0.4084300846738409);
        setDoubleElement(term2885, 1, 0.7788960836558265);
        setDoubleElement(term2885, 2, 0.8641629614441709);
        setDoubleElement(term2885, 3, 0.44216771474321837);
        setDoubleElement(term2885, 4, 0.9809266777296007);
        setDoubleElement(term2885, 5, 0.21145399417290445);
        setDoubleElement(term2885, 6, 0.3206424582885071);
        setDoubleElement(term2885, 7, 0.515007129011865);
        setDoubleElement(term2885, 8, 0.6791279697510296);
        setElement(term2858, 4, term2885);
        setDoubleElement(term2895, 0, 0.44610818581404355);
        setDoubleElement(term2895, 1, 0.08953548266482225);
        setDoubleElement(term2895, 2, 0.5019274780721351);
        setDoubleElement(term2895, 3, 0.38325419627935253);
        setDoubleElement(term2895, 4, 0.6829029193256314);
        setDoubleElement(term2895, 5, 1.7403320892983576E-4);
        setElement(term2858, 5, term2895);
        setDoubleElement(term2902, 0, 0.359822327374657);
        setDoubleElement(term2902, 1, 0.6984496238941496);
        setDoubleElement(term2902, 2, 0.026751890106275433);
        setElement(term2858, 6, term2902);
        setField(term2857, term2857.getClass(), "data", term2858);
        setDoubleElement(term2907, 0, 0.5131701879289331);
        setDoubleElement(term2907, 1, 0.6080820676996378);
        setDoubleElement(term2907, 2, 0.40695922365872805);
        setDoubleElement(term2907, 3, 0.475896687259849);
        setElement(term2906, 0, term2907);
        setDoubleElement(term2912, 0, 0.3999358841601842);
        setDoubleElement(term2912, 1, 0.18636713236319624);
        setElement(term2906, 1, term2912);
        setDoubleElement(term2915, 0, 0.8712455774005332);
        setDoubleElement(term2915, 1, 0.16581764143035682);
        setDoubleElement(term2915, 2, 0.20219858593718787);
        setDoubleElement(term2915, 3, 0.0015033902879237893);
        setElement(term2906, 2, term2915);
        setField(term2857, term2857.getClass(), "lu", term2906);
        setIntElement(term2920, 0, 538259104);
        setField(term2857, term2857.getClass(), "permutation", term2920);
        setIntField(term2857, term2857.getClass(), "parity", 1);
        term19288 = newInstance(Class.forName("org.apache.commons.math.linear.RealMatrixImpl"));
        Object[] term19289 = (Object[]) newArray("[D", 7);
        double[] term19290 = (double[]) newDoubleArray(3);
        double[] term19291 = (double[]) newDoubleArray(7);
        double[] term19292 = (double[]) newDoubleArray(8);
        double[] term19293 = (double[]) newDoubleArray(4);
        double[] term19294 = (double[]) newDoubleArray(9);
        double[] term19295 = (double[]) newDoubleArray(6);
        double[] term19296 = (double[]) newDoubleArray(3);
        Object[] term19297 = (Object[]) newArray("[D", 3);
        double[] term19298 = (double[]) newDoubleArray(4);
        double[] term19299 = (double[]) newDoubleArray(2);
        double[] term19300 = (double[]) newDoubleArray(4);
        int[] term19301 = (int[]) newIntArray(1);
        setDoubleElement(term19290, 0, 0.1960225801238138);
        setDoubleElement(term19290, 1, 0.5148137742678777);
        setDoubleElement(term19290, 2, 0.8391459612166138);
        setElement(term19289, 0, term19290);
        setDoubleElement(term19291, 0, 0.16703018107140954);
        setDoubleElement(term19291, 1, 0.4586817610515208);
        setDoubleElement(term19291, 2, 0.4514428416311852);
        setDoubleElement(term19291, 3, 0.05035312439979578);
        setDoubleElement(term19291, 4, 0.2030931676384783);
        setDoubleElement(term19291, 5, 0.5220991694127869);
        setDoubleElement(term19291, 6, 0.7431278279525401);
        setElement(term19289, 1, term19291);
        setDoubleElement(term19292, 0, 0.6468277621896449);
        setDoubleElement(term19292, 1, 0.6348426143487798);
        setDoubleElement(term19292, 2, 0.2609298549951239);
        setDoubleElement(term19292, 3, 0.6131087144069463);
        setDoubleElement(term19292, 4, 0.4961600023778727);
        setDoubleElement(term19292, 5, 0.15336192373549007);
        setDoubleElement(term19292, 6, 0.9148125806219113);
        setDoubleElement(term19292, 7, 0.5424105805193429);
        setElement(term19289, 2, term19292);
        setDoubleElement(term19293, 0, 0.961202697260254);
        setDoubleElement(term19293, 1, 0.6198565030073423);
        setDoubleElement(term19293, 2, 0.06523961946138956);
        setDoubleElement(term19293, 3, 0.5651796580837669);
        setElement(term19289, 3, term19293);
        setDoubleElement(term19294, 0, 0.4084300846738409);
        setDoubleElement(term19294, 1, 0.7788960836558265);
        setDoubleElement(term19294, 2, 0.8641629614441709);
        setDoubleElement(term19294, 3, 0.44216771474321837);
        setDoubleElement(term19294, 4, 0.9809266777296007);
        setDoubleElement(term19294, 5, 0.21145399417290445);
        setDoubleElement(term19294, 6, 0.3206424582885071);
        setDoubleElement(term19294, 7, 0.515007129011865);
        setDoubleElement(term19294, 8, 0.6791279697510296);
        setElement(term19289, 4, term19294);
        setDoubleElement(term19295, 0, 0.44610818581404355);
        setDoubleElement(term19295, 1, 0.08953548266482225);
        setDoubleElement(term19295, 2, 0.5019274780721351);
        setDoubleElement(term19295, 3, 0.38325419627935253);
        setDoubleElement(term19295, 4, 0.6829029193256314);
        setDoubleElement(term19295, 5, 1.7403320892983576E-4);
        setElement(term19289, 5, term19295);
        setDoubleElement(term19296, 0, 0.359822327374657);
        setDoubleElement(term19296, 1, 0.6984496238941496);
        setDoubleElement(term19296, 2, 0.026751890106275433);
        setElement(term19289, 6, term19296);
        setField(term19288, term19288.getClass(), "data", term19289);
        setDoubleElement(term19298, 0, 0.5131701879289331);
        setDoubleElement(term19298, 1, 0.6080820676996378);
        setDoubleElement(term19298, 2, 0.40695922365872805);
        setDoubleElement(term19298, 3, 0.475896687259849);
        setElement(term19297, 0, term19298);
        setDoubleElement(term19299, 0, 0.3999358841601842);
        setDoubleElement(term19299, 1, 0.18636713236319624);
        setElement(term19297, 1, term19299);
        setDoubleElement(term19300, 0, 0.8712455774005332);
        setDoubleElement(term19300, 1, 0.16581764143035682);
        setDoubleElement(term19300, 2, 0.20219858593718787);
        setDoubleElement(term19300, 3, 0.0015033902879237893);
        setElement(term19297, 2, term19300);
        setField(term19288, term19288.getClass(), "lu", term19297);
        setIntElement(term19301, 0, 538259104);
        setField(term19288, term19288.getClass(), "permutation", term19301);
        setIntField(term19288, term19288.getClass(), "parity", 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.RealMatrixImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isSquare", argTypes, term2857, args);
        assertTrue(recursiveEquals(term2857, term19288));
        assertTrue(recursiveEquals(retValue, false));
    }

};


