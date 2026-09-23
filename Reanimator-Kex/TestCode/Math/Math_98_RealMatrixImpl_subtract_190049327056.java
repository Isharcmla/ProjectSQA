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

public class RealMatrixImpl_subtract_190049327056 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term508;
     Object term589;

    public RealMatrixImpl_subtract_190049327056() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term508 = newInstance(Class.forName("org.apache.commons.math.linear.RealMatrixImpl"));
        Object[] term509 = (Object[]) newArray("[D", 7);
        double[] term510 = (double[]) newDoubleArray(6);
        double[] term517 = (double[]) newDoubleArray(7);
        double[] term525 = (double[]) newDoubleArray(9);
        double[] term535 = (double[]) newDoubleArray(7);
        double[] term543 = (double[]) newDoubleArray(6);
        double[] term550 = (double[]) newDoubleArray(6);
        double[] term557 = (double[]) newDoubleArray(0);
        Object[] term558 = (Object[]) newArray("[D", 6);
        double[] term559 = (double[]) newDoubleArray(5);
        double[] term565 = (double[]) newDoubleArray(1);
        double[] term567 = (double[]) newDoubleArray(0);
        double[] term568 = (double[]) newDoubleArray(6);
        double[] term575 = (double[]) newDoubleArray(5);
        double[] term581 = (double[]) newDoubleArray(1);
        int[] term583 = (int[]) newIntArray(4);
        setDoubleElement(term510, 0, 0.9457448635091538);
        setDoubleElement(term510, 1, 0.3238255203811462);
        setDoubleElement(term510, 2, 0.2843894095932772);
        setDoubleElement(term510, 3, 0.2382345237223229);
        setDoubleElement(term510, 4, 0.6037093070161561);
        setDoubleElement(term510, 5, 0.48050706663913145);
        setElement(term509, 0, term510);
        setDoubleElement(term517, 0, 0.4990217874180345);
        setDoubleElement(term517, 1, 0.22767631814145395);
        setDoubleElement(term517, 2, 0.4630082575704827);
        setDoubleElement(term517, 3, 0.8732511635701926);
        setDoubleElement(term517, 4, 0.8977760608415547);
        setDoubleElement(term517, 5, 0.3107086749915061);
        setDoubleElement(term517, 6, 0.18330246984174836);
        setElement(term509, 1, term517);
        setDoubleElement(term525, 0, 0.1941255640189572);
        setDoubleElement(term525, 1, 0.2889811903417371);
        setDoubleElement(term525, 2, 0.7856101337088763);
        setDoubleElement(term525, 3, 0.1782857269567425);
        setDoubleElement(term525, 4, 0.17829386444171214);
        setDoubleElement(term525, 5, 0.547995853732519);
        setDoubleElement(term525, 6, 0.3483938514131425);
        setDoubleElement(term525, 7, 0.0100718646868041);
        setDoubleElement(term525, 8, 0.58265008665336);
        setElement(term509, 2, term525);
        setDoubleElement(term535, 0, 0.1163034938203874);
        setDoubleElement(term535, 1, 0.1187814206908886);
        setDoubleElement(term535, 2, 0.04662501176438627);
        setDoubleElement(term535, 3, 0.17512426723256447);
        setDoubleElement(term535, 4, 0.9379214810416256);
        setDoubleElement(term535, 5, 0.10807577760679721);
        setDoubleElement(term535, 6, 0.7808234535616719);
        setElement(term509, 3, term535);
        setDoubleElement(term543, 0, 0.9772425797816359);
        setDoubleElement(term543, 1, 0.32009327814110977);
        setDoubleElement(term543, 2, 0.9013029318694921);
        setDoubleElement(term543, 3, 0.1755673139619638);
        setDoubleElement(term543, 4, 0.9136597256674437);
        setDoubleElement(term543, 5, 0.3741779691002205);
        setElement(term509, 4, term543);
        setDoubleElement(term550, 0, 0.5652495059647745);
        setDoubleElement(term550, 1, 0.021410850431387685);
        setDoubleElement(term550, 2, 0.8397628091272534);
        setDoubleElement(term550, 3, 0.01784667720947175);
        setDoubleElement(term550, 4, 0.4395312828193261);
        setDoubleElement(term550, 5, 0.5715204226647931);
        setElement(term509, 5, term550);
        setElement(term509, 6, term557);
        setField(term508, term508.getClass(), "data", term509);
        setDoubleElement(term559, 0, 0.6420798930164424);
        setDoubleElement(term559, 1, 0.0011409626665044303);
        setDoubleElement(term559, 2, 0.5195852993308188);
        setDoubleElement(term559, 3, 0.6533293939565151);
        setDoubleElement(term559, 4, 0.7361083671494018);
        setElement(term558, 0, term559);
        setDoubleElement(term565, 0, 0.056643259984349825);
        setElement(term558, 1, term565);
        setElement(term558, 2, term567);
        setDoubleElement(term568, 0, 0.5984863932443171);
        setDoubleElement(term568, 1, 0.04708163975594959);
        setDoubleElement(term568, 2, 0.8223115496053149);
        setDoubleElement(term568, 3, 0.06795505641704636);
        setDoubleElement(term568, 4, 0.198746516614277);
        setDoubleElement(term568, 5, 0.16852568658760048);
        setElement(term558, 3, term568);
        setDoubleElement(term575, 0, 0.20341461558365515);
        setDoubleElement(term575, 1, 0.10087360265456191);
        setDoubleElement(term575, 2, 0.5957631946929023);
        setDoubleElement(term575, 3, 0.9963416078314885);
        setDoubleElement(term575, 4, 0.3147638130628596);
        setElement(term558, 4, term575);
        setDoubleElement(term581, 0, 0.24810335047389354);
        setElement(term558, 5, term581);
        setField(term508, term508.getClass(), "lu", term558);
        setIntElement(term583, 0, 865208305);
        setIntElement(term583, 1, -1275173084);
        setIntElement(term583, 2, -244121226);
        setIntElement(term583, 3, -203030934);
        setField(term508, term508.getClass(), "permutation", term583);
        setIntField(term508, term508.getClass(), "parity", 1);
        term589 = newInstance(Class.forName("org.apache.commons.math.linear.RealMatrixImpl"));
        Object[] term590 = (Object[]) newArray("[D", 1);
        double[] term591 = (double[]) newDoubleArray(1);
        Object[] term593 = (Object[]) newArray("[D", 6);
        double[] term594 = (double[]) newDoubleArray(7);
        double[] term602 = (double[]) newDoubleArray(0);
        double[] term603 = (double[]) newDoubleArray(7);
        double[] term611 = (double[]) newDoubleArray(1);
        double[] term613 = (double[]) newDoubleArray(6);
        double[] term620 = (double[]) newDoubleArray(4);
        int[] term625 = (int[]) newIntArray(6);
        setDoubleElement(term591, 0, 0.9113409083257852);
        setElement(term590, 0, term591);
        setField(term589, term589.getClass(), "data", term590);
        setDoubleElement(term594, 0, 0.7444535250398684);
        setDoubleElement(term594, 1, 0.37439559220953034);
        setDoubleElement(term594, 2, 0.5010337159337968);
        setDoubleElement(term594, 3, 0.33871772875627537);
        setDoubleElement(term594, 4, 0.9952003100858836);
        setDoubleElement(term594, 5, 0.22059525284415726);
        setDoubleElement(term594, 6, 0.281059649526194);
        setElement(term593, 0, term594);
        setElement(term593, 1, term602);
        setDoubleElement(term603, 0, 0.049786419821445604);
        setDoubleElement(term603, 1, 0.8814078959581401);
        setDoubleElement(term603, 2, 0.47210750955444725);
        setDoubleElement(term603, 3, 0.8381176594884352);
        setDoubleElement(term603, 4, 0.23070800524236523);
        setDoubleElement(term603, 5, 0.4337266793917268);
        setDoubleElement(term603, 6, 0.11979392765421404);
        setElement(term593, 2, term603);
        setDoubleElement(term611, 0, 0.4555542221910589);
        setElement(term593, 3, term611);
        setDoubleElement(term613, 0, 0.9938727080758785);
        setDoubleElement(term613, 1, 0.39416780533640805);
        setDoubleElement(term613, 2, 0.5384156574050297);
        setDoubleElement(term613, 3, 0.28813953022653416);
        setDoubleElement(term613, 4, 0.6221715730666386);
        setDoubleElement(term613, 5, 0.6375926466054153);
        setElement(term593, 4, term613);
        setDoubleElement(term620, 0, 0.6933516214415875);
        setDoubleElement(term620, 1, 0.7039847711405768);
        setDoubleElement(term620, 2, 0.7157998497507287);
        setDoubleElement(term620, 3, 0.8399796378537906);
        setElement(term593, 5, term620);
        setField(term589, term589.getClass(), "lu", term593);
        setIntElement(term625, 0, -1179120542);
        setIntElement(term625, 1, -73683645);
        setIntElement(term625, 2, -226514366);
        setIntElement(term625, 3, 1193880199);
        setIntElement(term625, 4, -1087774327);
        setIntElement(term625, 5, -1530420153);
        setField(term589, term589.getClass(), "permutation", term625);
        setIntField(term589, term589.getClass(), "parity", 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.RealMatrixImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.linear.RealMatrixImpl");
        Object[] args = new Object[1];
        args[0] = term589;
        try {
            callMethod(klass, "subtract", argTypes, term508, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


