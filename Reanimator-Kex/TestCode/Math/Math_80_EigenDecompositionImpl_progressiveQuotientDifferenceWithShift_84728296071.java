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
import java.lang.Double;

public class EigenDecompositionImpl_progressiveQuotientDifferenceWithShift_84728296071 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5400;
     Object term5515;
     Object term5520;
     Object term5530;

    public EigenDecompositionImpl_progressiveQuotientDifferenceWithShift_84728296071() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5400 = newInstance(Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] term5402 = (double[]) newDoubleArray(4);
        double[] term5407 = (double[]) newDoubleArray(9);
        double[] term5417 = (double[]) newDoubleArray(8);
        Object term5426 = newInstance(Class.forName("org.apache.commons.math.linear.TriDiagonalTransformer"));
        Object[] term5427 = (Object[]) newArray("[D", 7);
        double[] term5428 = (double[]) newDoubleArray(9);
        double[] term5438 = (double[]) newDoubleArray(8);
        double[] term5447 = (double[]) newDoubleArray(6);
        double[] term5454 = (double[]) newDoubleArray(8);
        double[] term5463 = (double[]) newDoubleArray(8);
        double[] term5472 = (double[]) newDoubleArray(6);
        double[] term5479 = (double[]) newDoubleArray(1);
        double[] term5481 = (double[]) newDoubleArray(1);
        double[] term5483 = (double[]) newDoubleArray(4);
        double[] term5494 = (double[]) newDoubleArray(1);
        double[] term5507 = (double[]) newDoubleArray(5);
        double[] term5513 = (double[]) newDoubleArray(0);
        Object[] term5514 = (Object[]) newArray("org.apache.commons.math.linear.ArrayRealVector", 0);
        setDoubleField(term5400, term5400.getClass(), "splitTolerance", 0.7456724755746292);
        setDoubleElement(term5402, 0, 0.16042811789550726);
        setDoubleElement(term5402, 1, 0.5835747078656152);
        setDoubleElement(term5402, 2, 0.8100133883198262);
        setDoubleElement(term5402, 3, 0.5165289310272644);
        setField(term5400, term5400.getClass(), "main", term5402);
        setDoubleElement(term5407, 0, 0.03310961026976089);
        setDoubleElement(term5407, 1, 0.6589533781382868);
        setDoubleElement(term5407, 2, 0.8513914801150654);
        setDoubleElement(term5407, 3, 0.3808625119015553);
        setDoubleElement(term5407, 4, 0.9737055238858733);
        setDoubleElement(term5407, 5, 8.517750991728912E-4);
        setDoubleElement(term5407, 6, 0.0048437015417313045);
        setDoubleElement(term5407, 7, 0.6189008543456161);
        setDoubleElement(term5407, 8, 0.2393813709280035);
        setField(term5400, term5400.getClass(), "secondary", term5407);
        setDoubleElement(term5417, 0, 0.8644636952230064);
        setDoubleElement(term5417, 1, 0.1630955286748922);
        setDoubleElement(term5417, 2, 0.5647632564621561);
        setDoubleElement(term5417, 3, 0.269331126038751);
        setDoubleElement(term5417, 4, 0.4683558099471864);
        setDoubleElement(term5417, 5, 0.6368440019867746);
        setDoubleElement(term5417, 6, 0.5228783261268751);
        setDoubleElement(term5417, 7, 0.3749396304305258);
        setField(term5400, term5400.getClass(), "squaredSecondary", term5417);
        setDoubleElement(term5428, 0, 0.21457943495536635);
        setDoubleElement(term5428, 1, 0.19009148060580683);
        setDoubleElement(term5428, 2, 0.8700140667747219);
        setDoubleElement(term5428, 3, 0.08773318359986426);
        setDoubleElement(term5428, 4, 0.9145395623056096);
        setDoubleElement(term5428, 5, 0.4187688172840772);
        setDoubleElement(term5428, 6, 0.023493302697668916);
        setDoubleElement(term5428, 7, 0.8908568866274508);
        setDoubleElement(term5428, 8, 0.11379148555388374);
        setElement(term5427, 0, term5428);
        setDoubleElement(term5438, 0, 0.7711402630780236);
        setDoubleElement(term5438, 1, 0.7579245602359496);
        setDoubleElement(term5438, 2, 0.7443877792201591);
        setDoubleElement(term5438, 3, 0.9888178760191673);
        setDoubleElement(term5438, 4, 0.8961780474783899);
        setDoubleElement(term5438, 5, 0.5607866194424554);
        setDoubleElement(term5438, 6, 0.15561259838664643);
        setDoubleElement(term5438, 7, 0.5749720656013505);
        setElement(term5427, 1, term5438);
        setDoubleElement(term5447, 0, 0.5500394569631515);
        setDoubleElement(term5447, 1, 0.33146254654921115);
        setDoubleElement(term5447, 2, 0.5424699276789116);
        setDoubleElement(term5447, 3, 0.27715630477767816);
        setDoubleElement(term5447, 4, 0.9909750216212674);
        setDoubleElement(term5447, 5, 0.7488273029584377);
        setElement(term5427, 2, term5447);
        setDoubleElement(term5454, 0, 0.291676322401089);
        setDoubleElement(term5454, 1, 0.7134361932131336);
        setDoubleElement(term5454, 2, 0.6494410890478485);
        setDoubleElement(term5454, 3, 0.05925007926887271);
        setDoubleElement(term5454, 4, 0.22262649112411625);
        setDoubleElement(term5454, 5, 0.9466757404352119);
        setDoubleElement(term5454, 6, 0.8728864781655794);
        setDoubleElement(term5454, 7, 0.869880960536284);
        setElement(term5427, 3, term5454);
        setDoubleElement(term5463, 0, 0.13397810179735248);
        setDoubleElement(term5463, 1, 0.07040990651160028);
        setDoubleElement(term5463, 2, 0.7136266522392904);
        setDoubleElement(term5463, 3, 0.7713492755905935);
        setDoubleElement(term5463, 4, 0.7319017848785887);
        setDoubleElement(term5463, 5, 0.9325545473511434);
        setDoubleElement(term5463, 6, 0.053415756474470055);
        setDoubleElement(term5463, 7, 0.2595081529011687);
        setElement(term5427, 4, term5463);
        setDoubleElement(term5472, 0, 0.5172973053806909);
        setDoubleElement(term5472, 1, 0.5041864924497926);
        setDoubleElement(term5472, 2, 0.839771089971044);
        setDoubleElement(term5472, 3, 0.4776187674812845);
        setDoubleElement(term5472, 4, 0.14384741723660366);
        setDoubleElement(term5472, 5, 0.030509118932167123);
        setElement(term5427, 5, term5472);
        setDoubleElement(term5479, 0, 0.8468002818649081);
        setElement(term5427, 6, term5479);
        setField(term5426, term5426.getClass(), "householderVectors", term5427);
        setDoubleElement(term5481, 0, 0.7583742559203879);
        setField(term5426, term5426.getClass(), "main", term5481);
        setDoubleElement(term5483, 0, 0.34960100086818);
        setDoubleElement(term5483, 1, 0.6372518655434818);
        setDoubleElement(term5483, 2, 0.167226799289813);
        setDoubleElement(term5483, 3, 0.8094222768164622);
        setField(term5426, term5426.getClass(), "secondary", term5483);
        setField(term5426, term5426.getClass(), "cachedQ", null);
        setField(term5426, term5426.getClass(), "cachedQt", null);
        setField(term5426, term5426.getClass(), "cachedT", null);
        setField(term5400, term5400.getClass(), "transformer", term5426);
        setDoubleField(term5400, term5400.getClass(), "lowerSpectra", 0.8118472696512443);
        setDoubleField(term5400, term5400.getClass(), "upperSpectra", 0.5081345064365255);
        setDoubleField(term5400, term5400.getClass(), "minPivot", 0.5925047134533268);
        setDoubleField(term5400, term5400.getClass(), "sigma", 0.6565520822905176);
        setDoubleField(term5400, term5400.getClass(), "sigmaLow", 0.1783635750354463);
        setDoubleField(term5400, term5400.getClass(), "tau", 0.09766055472040214);
        setDoubleElement(term5494, 0, 0.14435871082881424);
        setField(term5400, term5400.getClass(), "work", term5494);
        setIntField(term5400, term5400.getClass(), "pingPong", -1845499264);
        setDoubleField(term5400, term5400.getClass(), "qMax", 0.13547049799364475);
        setDoubleField(term5400, term5400.getClass(), "eMin", 0.08768922779250798);
        setIntField(term5400, term5400.getClass(), "tType", -505439934);
        setDoubleField(term5400, term5400.getClass(), "dMin", 0.09838596916429043);
        setDoubleField(term5400, term5400.getClass(), "dMin1", 0.2837810681914955);
        setDoubleField(term5400, term5400.getClass(), "dMin2", 0.8060983740295946);
        setDoubleField(term5400, term5400.getClass(), "dN", 0.2068982892476774);
        setDoubleField(term5400, term5400.getClass(), "dN1", 0.042943283383603204);
        setDoubleField(term5400, term5400.getClass(), "dN2", 0.742462178151085);
        setDoubleField(term5400, term5400.getClass(), "g", 0.6525775050180439);
        setDoubleElement(term5507, 0, 0.18741462203040915);
        setDoubleElement(term5507, 1, 0.4884829694350824);
        setDoubleElement(term5507, 2, 0.4968269295897998);
        setDoubleElement(term5507, 3, 0.8276853995343832);
        setDoubleElement(term5507, 4, 0.9677324907510222);
        setField(term5400, term5400.getClass(), "realEigenvalues", term5507);
        setField(term5400, term5400.getClass(), "imagEigenvalues", term5513);
        setField(term5400, term5400.getClass(), "eigenvectors", term5514);
        setField(term5400, term5400.getClass(), "cachedV", null);
        setField(term5400, term5400.getClass(), "cachedD", null);
        setField(term5400, term5400.getClass(), "cachedVt", null);
        term5515 = (double[]) newDoubleArray(4);
        setDoubleElement(term5515, 0, 0.7048276828541071);
        setDoubleElement(term5515, 1, 0.13629430998538283);
        setDoubleElement(term5515, 2, 0.002112993189067547);
        setDoubleElement(term5515, 3, 0.03647689096557649);
        term5520 = (double[]) newDoubleArray(9);
        setDoubleElement(term5520, 0, 0.667516915962481);
        setDoubleElement(term5520, 1, 0.7650729427573622);
        setDoubleElement(term5520, 2, 0.5870690416996945);
        setDoubleElement(term5520, 3, 0.11005739916307533);
        setDoubleElement(term5520, 4, 0.9430531913450335);
        setDoubleElement(term5520, 5, 0.6207506343001766);
        setDoubleElement(term5520, 6, 0.2129314457240188);
        setDoubleElement(term5520, 7, 0.17624037440752227);
        setDoubleElement(term5520, 8, 0.7460434265178711);
        term5530 = new Double(0.7931312332474052);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = Array.newInstance(double.class, 0).getClass();
        argTypes[2] = double.class;
        Object[] args = new Object[3];
        args[0] = term5515;
        args[1] = term5520;
        args[2] = term5530;
        try {
            callMethod(klass, "progressiveQuotientDifferenceWithShift", argTypes, term5400, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


