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

public class SingularValueDecompositionImpl_getVT_91805574120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term525;

    public SingularValueDecompositionImpl_getVT_91805574120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term525 = newInstance(Class.forName("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        Object term528 = newInstance(Class.forName("org.apache.commons.math.linear.BiDiagonalTransformer"));
        Object[] term529 = (Object[]) newArray("[D", 7);
        double[] term530 = (double[]) newDoubleArray(2);
        double[] term533 = (double[]) newDoubleArray(9);
        double[] term543 = (double[]) newDoubleArray(7);
        double[] term551 = (double[]) newDoubleArray(6);
        double[] term558 = (double[]) newDoubleArray(7);
        double[] term566 = (double[]) newDoubleArray(9);
        double[] term576 = (double[]) newDoubleArray(7);
        double[] term584 = (double[]) newDoubleArray(6);
        double[] term591 = (double[]) newDoubleArray(6);
        double[] term598 = (double[]) newDoubleArray(0);
        double[] term599 = (double[]) newDoubleArray(6);
        double[] term606 = (double[]) newDoubleArray(5);
        double[] term612 = (double[]) newDoubleArray(1);
        double[] term614 = (double[]) newDoubleArray(0);
        setIntField(term525, term525.getClass(), "m", -522618178);
        setIntField(term525, term525.getClass(), "n", 1134449235);
        setDoubleElement(term530, 0, 0.1755673139619638);
        setDoubleElement(term530, 1, 0.9136597256674437);
        setElement(term529, 0, term530);
        setDoubleElement(term533, 0, 0.3741779691002205);
        setDoubleElement(term533, 1, 0.5652495059647745);
        setDoubleElement(term533, 2, 0.021410850431387685);
        setDoubleElement(term533, 3, 0.8397628091272534);
        setDoubleElement(term533, 4, 0.01784667720947175);
        setDoubleElement(term533, 5, 0.4395312828193261);
        setDoubleElement(term533, 6, 0.5715204226647931);
        setDoubleElement(term533, 7, 0.6420798930164424);
        setDoubleElement(term533, 8, 0.0011409626665044303);
        setElement(term529, 1, term533);
        setDoubleElement(term543, 0, 0.5195852993308188);
        setDoubleElement(term543, 1, 0.6533293939565151);
        setDoubleElement(term543, 2, 0.7361083671494018);
        setDoubleElement(term543, 3, 0.056643259984349825);
        setDoubleElement(term543, 4, 0.5984863932443171);
        setDoubleElement(term543, 5, 0.04708163975594959);
        setDoubleElement(term543, 6, 0.8223115496053149);
        setElement(term529, 2, term543);
        setDoubleElement(term551, 0, 0.06795505641704636);
        setDoubleElement(term551, 1, 0.198746516614277);
        setDoubleElement(term551, 2, 0.16852568658760048);
        setDoubleElement(term551, 3, 0.20341461558365515);
        setDoubleElement(term551, 4, 0.10087360265456191);
        setDoubleElement(term551, 5, 0.5957631946929023);
        setElement(term529, 3, term551);
        setDoubleElement(term558, 0, 0.9963416078314885);
        setDoubleElement(term558, 1, 0.3147638130628596);
        setDoubleElement(term558, 2, 0.24810335047389354);
        setDoubleElement(term558, 3, 0.9113409083257852);
        setDoubleElement(term558, 4, 0.7444535250398684);
        setDoubleElement(term558, 5, 0.37439559220953034);
        setDoubleElement(term558, 6, 0.5010337159337968);
        setElement(term529, 4, term558);
        setDoubleElement(term566, 0, 0.33871772875627537);
        setDoubleElement(term566, 1, 0.9952003100858836);
        setDoubleElement(term566, 2, 0.22059525284415726);
        setDoubleElement(term566, 3, 0.281059649526194);
        setDoubleElement(term566, 4, 0.049786419821445604);
        setDoubleElement(term566, 5, 0.8814078959581401);
        setDoubleElement(term566, 6, 0.47210750955444725);
        setDoubleElement(term566, 7, 0.8381176594884352);
        setDoubleElement(term566, 8, 0.23070800524236523);
        setElement(term529, 5, term566);
        setDoubleElement(term576, 0, 0.4337266793917268);
        setDoubleElement(term576, 1, 0.11979392765421404);
        setDoubleElement(term576, 2, 0.4555542221910589);
        setDoubleElement(term576, 3, 0.9938727080758785);
        setDoubleElement(term576, 4, 0.39416780533640805);
        setDoubleElement(term576, 5, 0.5384156574050297);
        setDoubleElement(term576, 6, 0.28813953022653416);
        setElement(term529, 6, term576);
        setField(term528, term528.getClass(), "householderVectors", term529);
        setDoubleElement(term584, 0, 0.6221715730666386);
        setDoubleElement(term584, 1, 0.6375926466054153);
        setDoubleElement(term584, 2, 0.6933516214415875);
        setDoubleElement(term584, 3, 0.7039847711405768);
        setDoubleElement(term584, 4, 0.7157998497507287);
        setDoubleElement(term584, 5, 0.8399796378537906);
        setField(term528, term528.getClass(), "main", term584);
        setDoubleElement(term591, 0, 0.009446329384675933);
        setDoubleElement(term591, 1, 0.20131600000037786);
        setDoubleElement(term591, 2, 0.332320568233212);
        setDoubleElement(term591, 3, 0.18561351983828822);
        setDoubleElement(term591, 4, 0.9678135126533798);
        setDoubleElement(term591, 5, 0.3275035827937727);
        setField(term528, term528.getClass(), "secondary", term591);
        setField(term528, term528.getClass(), "cachedU", null);
        setField(term528, term528.getClass(), "cachedB", null);
        setField(term528, term528.getClass(), "cachedV", null);
        setField(term525, term525.getClass(), "transformer", term528);
        setField(term525, term525.getClass(), "mainBidiagonal", term598);
        setDoubleElement(term599, 0, 0.13747524521333288);
        setDoubleElement(term599, 1, 0.7149120009558162);
        setDoubleElement(term599, 2, 0.0013046823258857643);
        setDoubleElement(term599, 3, 0.5404409545293147);
        setDoubleElement(term599, 4, 0.9172358414700745);
        setDoubleElement(term599, 5, 0.3804251745476508);
        setField(term525, term525.getClass(), "secondaryBidiagonal", term599);
        setDoubleElement(term606, 0, 0.6704848280926606);
        setDoubleElement(term606, 1, 0.6213122016266206);
        setDoubleElement(term606, 2, 0.540850203722707);
        setDoubleElement(term606, 3, 6.134294677928587E-4);
        setDoubleElement(term606, 4, 0.41934015614685227);
        setField(term525, term525.getClass(), "mainTridiagonal", term606);
        setDoubleElement(term612, 0, 0.07298304401683597);
        setField(term525, term525.getClass(), "secondaryTridiagonal", term612);
        setField(term525, term525.getClass(), "eigenDecomposition", null);
        setField(term525, term525.getClass(), "singularValues", term614);
        setField(term525, term525.getClass(), "cachedU", null);
        setField(term525, term525.getClass(), "cachedUt", null);
        setField(term525, term525.getClass(), "cachedS", null);
        setField(term525, term525.getClass(), "cachedV", null);
        setField(term525, term525.getClass(), "cachedVt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.SingularValueDecompositionImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getVT", argTypes, term525, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


