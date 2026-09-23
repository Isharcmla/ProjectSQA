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
import java.lang.NullPointerException;
import static org.apache.commons.math.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class SingularValueDecompositionImpl_getV_209232052919 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term418;

    public SingularValueDecompositionImpl_getV_209232052919() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term418 = newInstance(Class.forName("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        Object term421 = newInstance(Class.forName("org.apache.commons.math.linear.BiDiagonalTransformer"));
        Object[] term422 = (Object[]) newArray("[D", 3);
        double[] term423 = (double[]) newDoubleArray(6);
        double[] term430 = (double[]) newDoubleArray(8);
        double[] term439 = (double[]) newDoubleArray(9);
        double[] term449 = (double[]) newDoubleArray(7);
        double[] term457 = (double[]) newDoubleArray(3);
        double[] term461 = (double[]) newDoubleArray(4);
        double[] term466 = (double[]) newDoubleArray(2);
        double[] term469 = (double[]) newDoubleArray(5);
        double[] term475 = (double[]) newDoubleArray(0);
        double[] term476 = (double[]) newDoubleArray(2);
        setIntField(term418, term418.getClass(), "m", -1339778481);
        setIntField(term418, term418.getClass(), "n", 1725571209);
        setDoubleElement(term423, 0, 0.2962868255626906);
        setDoubleElement(term423, 1, 0.25474180574060834);
        setDoubleElement(term423, 2, 0.9957585718901875);
        setDoubleElement(term423, 3, 0.16755811343784477);
        setDoubleElement(term423, 4, 0.9090793968999221);
        setDoubleElement(term423, 5, 0.25997329921466494);
        setElement(term422, 0, term423);
        setDoubleElement(term430, 0, 0.7814864708383836);
        setDoubleElement(term430, 1, 0.5657654165545906);
        setDoubleElement(term430, 2, 0.6382060245198228);
        setDoubleElement(term430, 3, 0.1849998667663698);
        setDoubleElement(term430, 4, 0.36312400202399575);
        setDoubleElement(term430, 5, 0.5485690030548175);
        setDoubleElement(term430, 6, 0.9765248027281291);
        setDoubleElement(term430, 7, 0.9184034277897645);
        setElement(term422, 1, term430);
        setDoubleElement(term439, 0, 0.9457448635091538);
        setDoubleElement(term439, 1, 0.3238255203811462);
        setDoubleElement(term439, 2, 0.2843894095932772);
        setDoubleElement(term439, 3, 0.2382345237223229);
        setDoubleElement(term439, 4, 0.6037093070161561);
        setDoubleElement(term439, 5, 0.48050706663913145);
        setDoubleElement(term439, 6, 0.4990217874180345);
        setDoubleElement(term439, 7, 0.22767631814145395);
        setDoubleElement(term439, 8, 0.4630082575704827);
        setElement(term422, 2, term439);
        setField(term421, term421.getClass(), "householderVectors", term422);
        setDoubleElement(term449, 0, 0.8732511635701926);
        setDoubleElement(term449, 1, 0.8977760608415547);
        setDoubleElement(term449, 2, 0.3107086749915061);
        setDoubleElement(term449, 3, 0.18330246984174836);
        setDoubleElement(term449, 4, 0.1941255640189572);
        setDoubleElement(term449, 5, 0.2889811903417371);
        setDoubleElement(term449, 6, 0.7856101337088763);
        setField(term421, term421.getClass(), "main", term449);
        setDoubleElement(term457, 0, 0.1782857269567425);
        setDoubleElement(term457, 1, 0.17829386444171214);
        setDoubleElement(term457, 2, 0.547995853732519);
        setField(term421, term421.getClass(), "secondary", term457);
        setField(term421, term421.getClass(), "cachedU", null);
        setField(term421, term421.getClass(), "cachedB", null);
        setField(term421, term421.getClass(), "cachedV", null);
        setField(term418, term418.getClass(), "transformer", term421);
        setDoubleElement(term461, 0, 0.3483938514131425);
        setDoubleElement(term461, 1, 0.0100718646868041);
        setDoubleElement(term461, 2, 0.58265008665336);
        setDoubleElement(term461, 3, 0.1163034938203874);
        setField(term418, term418.getClass(), "mainBidiagonal", term461);
        setDoubleElement(term466, 0, 0.1187814206908886);
        setDoubleElement(term466, 1, 0.04662501176438627);
        setField(term418, term418.getClass(), "secondaryBidiagonal", term466);
        setDoubleElement(term469, 0, 0.17512426723256447);
        setDoubleElement(term469, 1, 0.9379214810416256);
        setDoubleElement(term469, 2, 0.10807577760679721);
        setDoubleElement(term469, 3, 0.7808234535616719);
        setDoubleElement(term469, 4, 0.9772425797816359);
        setField(term418, term418.getClass(), "mainTridiagonal", term469);
        setField(term418, term418.getClass(), "secondaryTridiagonal", term475);
        setField(term418, term418.getClass(), "eigenDecomposition", null);
        setDoubleElement(term476, 0, 0.32009327814110977);
        setDoubleElement(term476, 1, 0.9013029318694921);
        setField(term418, term418.getClass(), "singularValues", term476);
        setField(term418, term418.getClass(), "cachedU", null);
        setField(term418, term418.getClass(), "cachedUt", null);
        setField(term418, term418.getClass(), "cachedS", null);
        setField(term418, term418.getClass(), "cachedV", null);
        setField(term418, term418.getClass(), "cachedVt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.SingularValueDecompositionImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getV", argTypes, term418, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


