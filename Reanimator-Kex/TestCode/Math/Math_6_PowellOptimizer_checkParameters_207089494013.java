package org.apache.commons.math3.optim.nonlinear.scalar.noderiv;

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
import org.apache.commons.math3.exception.MathUnsupportedOperationException;
import static org.apache.commons.math3.optim.nonlinear.scalar.noderiv.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class PowellOptimizer_checkParameters_207089494013 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term841;

    public PowellOptimizer_checkParameters_207089494013() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6003 = Class.forName((String) "org.apache.commons.math3.optim.nonlinear.scalar.GoalType");
        Field term6002 = ((Class) term6003).getDeclaredField((String) "MINIMIZE");
        ((Field) term6002).setAccessible(true);
        Object enum7 = ((Field) term6002).get((Object) null);
        term841 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer"));
        Object term844 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer$LineSearch"));
        Object term845 = newInstance(Class.forName("org.apache.commons.math3.optim.univariate.BracketFinder"));
        Object term847 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor"));
        Object term850 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor$1"));
        Object term874 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor"));
        Object term877 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor$1"));
        Object term878 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor"));
        Object term881 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor$1"));
        double[] term882 = (double[]) newDoubleArray(7);
        double[] term890 = (double[]) newDoubleArray(1);
        double[] term892 = (double[]) newDoubleArray(6);
        Object term899 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor"));
        Object term902 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor$1"));
        Object term903 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor"));
        Object term906 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor$1"));
        setDoubleField(term841, term841.getClass(), "relativeThreshold", 0.7154795600170818);
        setDoubleField(term841, term841.getClass(), "absoluteThreshold", 0.6355029654528058);
        setDoubleField(term845, term845.getClass(), "growLimit", 100.0);
        setIntField(term847, term847.getClass(), "maximalCount", 50);
        setIntField(term847, term847.getClass(), "count", 0);
        setField(term847, term847.getClass(), "maxCountCallback", term850);
        setField(term845, term845.getClass(), "evaluations", term847);
        setDoubleField(term845, term845.getClass(), "lo", 0.0022646783892913414);
        setDoubleField(term845, term845.getClass(), "hi", 0.36226058076369927);
        setDoubleField(term845, term845.getClass(), "mid", 0.03699061125289671);
        setDoubleField(term845, term845.getClass(), "fLo", 0.6047137830113202);
        setDoubleField(term845, term845.getClass(), "fHi", 0.6767213143579776);
        setDoubleField(term845, term845.getClass(), "fMid", 0.48862955528902696);
        setField(term844, term844.getClass(), "bracket", term845);
        setField(term844, term844.getClass(), "this$0", null);
        setDoubleField(term844, term844.getClass(), "relativeThreshold", 0.426231085465289);
        setDoubleField(term844, term844.getClass(), "absoluteThreshold", 0.0027299293098262956);
        setField(term844, term844.getClass(), "function", null);
        setField(term844, term844.getClass(), "goal", enum7);
        setDoubleField(term844, term844.getClass(), "start", 0.29874017652881824);
        setDoubleField(term844, term844.getClass(), "min", 0.32554480512985284);
        setDoubleField(term844, term844.getClass(), "max", 0.8924855581421237);
        setIntField(term874, term874.getClass(), "maximalCount", -1685132342);
        setIntField(term874, term874.getClass(), "count", -1456670397);
        setField(term874, term874.getClass(), "maxCountCallback", term877);
        setField(term844, term844.getClass(), "evaluations", term874);
        setIntField(term878, term878.getClass(), "maximalCount", 1622346318);
        setIntField(term878, term878.getClass(), "count", 1048535127);
        setField(term878, term878.getClass(), "maxCountCallback", term881);
        setField(term844, term844.getClass(), "iterations", term878);
        setField(term844, term844.getClass(), "checker", null);
        setField(term841, term841.getClass(), "line", term844);
        setField(term841, term841.getClass(), "function", null);
        setField(term841, term841.getClass(), "goal", enum7);
        setDoubleElement(term882, 0, 0.32237559209193944);
        setDoubleElement(term882, 1, 0.53094494792755);
        setDoubleElement(term882, 2, 0.146431486357265);
        setDoubleElement(term882, 3, 0.24259014218848696);
        setDoubleElement(term882, 4, 0.1544348383112728);
        setDoubleElement(term882, 5, 0.5187846213101265);
        setDoubleElement(term882, 6, 0.045893173090043815);
        setField(term841, term841.getClass(), "start", term882);
        setDoubleElement(term890, 0, 0.3626177854778667);
        setField(term841, term841.getClass(), "lowerBound", term890);
        setDoubleElement(term892, 0, 0.3163771663728089);
        setDoubleElement(term892, 1, 0.8819646072665548);
        setDoubleElement(term892, 2, 0.5412182593116958);
        setDoubleElement(term892, 3, 0.16988691727397487);
        setDoubleElement(term892, 4, 0.39286935532362843);
        setDoubleElement(term892, 5, 0.11577948268926874);
        setField(term841, term841.getClass(), "upperBound", term892);
        setIntField(term899, term899.getClass(), "maximalCount", -655067527);
        setIntField(term899, term899.getClass(), "count", -6029667);
        setField(term899, term899.getClass(), "maxCountCallback", term902);
        setField(term841, term841.getClass(), "evaluations", term899);
        setIntField(term903, term903.getClass(), "maximalCount", -2068769794);
        setIntField(term903, term903.getClass(), "count", -117576464);
        setField(term903, term903.getClass(), "maxCountCallback", term906);
        setField(term841, term841.getClass(), "iterations", term903);
        setField(term841, term841.getClass(), "checker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "checkParameters", argTypes, term841, args);
            assertTrue(false);
        }
        catch (MathUnsupportedOperationException e) {
        }

    }

};


