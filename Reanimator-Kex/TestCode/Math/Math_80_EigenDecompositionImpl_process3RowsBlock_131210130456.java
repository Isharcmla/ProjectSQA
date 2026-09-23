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
import java.lang.Integer;

public class EigenDecompositionImpl_process3RowsBlock_131210130456 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2801;
     Object term2933;

    public EigenDecompositionImpl_process3RowsBlock_131210130456() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2801 = newInstance(Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] term2803 = (double[]) newDoubleArray(5);
        double[] term2809 = (double[]) newDoubleArray(4);
        double[] term2814 = (double[]) newDoubleArray(7);
        Object term2822 = newInstance(Class.forName("org.apache.commons.math.linear.TriDiagonalTransformer"));
        Object[] term2823 = (Object[]) newArray("[D", 8);
        double[] term2824 = (double[]) newDoubleArray(5);
        double[] term2830 = (double[]) newDoubleArray(9);
        double[] term2840 = (double[]) newDoubleArray(0);
        double[] term2841 = (double[]) newDoubleArray(4);
        double[] term2846 = (double[]) newDoubleArray(4);
        double[] term2851 = (double[]) newDoubleArray(9);
        double[] term2861 = (double[]) newDoubleArray(3);
        double[] term2865 = (double[]) newDoubleArray(1);
        double[] term2867 = (double[]) newDoubleArray(5);
        double[] term2873 = (double[]) newDoubleArray(5);
        double[] term2885 = (double[]) newDoubleArray(8);
        double[] term2905 = (double[]) newDoubleArray(3);
        double[] term2909 = (double[]) newDoubleArray(6);
        Object[] term2916 = (Object[]) newArray("org.apache.commons.math.linear.ArrayRealVector", 8);
        Object term2917 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term2918 = (double[]) newDoubleArray(0);
        Object term2919 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term2920 = (double[]) newDoubleArray(0);
        Object term2921 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term2922 = (double[]) newDoubleArray(0);
        Object term2923 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term2924 = (double[]) newDoubleArray(0);
        Object term2925 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term2926 = (double[]) newDoubleArray(0);
        Object term2927 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term2928 = (double[]) newDoubleArray(0);
        Object term2929 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term2930 = (double[]) newDoubleArray(0);
        Object term2931 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term2932 = (double[]) newDoubleArray(0);
        setDoubleField(term2801, term2801.getClass(), "splitTolerance", 0.18591063651254836);
        setDoubleElement(term2803, 0, 0.37104341307048727);
        setDoubleElement(term2803, 1, 0.5941630025842942);
        setDoubleElement(term2803, 2, 0.21339098072821405);
        setDoubleElement(term2803, 3, 0.3791266695959429);
        setDoubleElement(term2803, 4, 0.9050806149824263);
        setField(term2801, term2801.getClass(), "main", term2803);
        setDoubleElement(term2809, 0, 0.8531473832220273);
        setDoubleElement(term2809, 1, 0.937712942560723);
        setDoubleElement(term2809, 2, 0.35856029184904714);
        setDoubleElement(term2809, 3, 0.4031608999936618);
        setField(term2801, term2801.getClass(), "secondary", term2809);
        setDoubleElement(term2814, 0, 0.40257209919252257);
        setDoubleElement(term2814, 1, 0.5933679520580496);
        setDoubleElement(term2814, 2, 0.6802287136909007);
        setDoubleElement(term2814, 3, 0.06627571986412484);
        setDoubleElement(term2814, 4, 0.8009236950717997);
        setDoubleElement(term2814, 5, 0.867255255836157);
        setDoubleElement(term2814, 6, 0.4007133474762271);
        setField(term2801, term2801.getClass(), "squaredSecondary", term2814);
        setDoubleElement(term2824, 0, 0.6436529669594808);
        setDoubleElement(term2824, 1, 0.8739008473755843);
        setDoubleElement(term2824, 2, 0.33020571520378217);
        setDoubleElement(term2824, 3, 0.4400066388974938);
        setDoubleElement(term2824, 4, 0.35751311073636893);
        setElement(term2823, 0, term2824);
        setDoubleElement(term2830, 0, 0.6265495707567974);
        setDoubleElement(term2830, 1, 0.2149850050932005);
        setDoubleElement(term2830, 2, 0.39734394475804036);
        setDoubleElement(term2830, 3, 0.03234340029222138);
        setDoubleElement(term2830, 4, 0.19671648397453156);
        setDoubleElement(term2830, 5, 0.30660613136199666);
        setDoubleElement(term2830, 6, 0.6717352294199702);
        setDoubleElement(term2830, 7, 0.24939968658916778);
        setDoubleElement(term2830, 8, 0.039913942834409855);
        setElement(term2823, 1, term2830);
        setElement(term2823, 2, term2840);
        setDoubleElement(term2841, 0, 0.5454459427467968);
        setDoubleElement(term2841, 1, 0.2047321158544234);
        setDoubleElement(term2841, 2, 0.7582778924059825);
        setDoubleElement(term2841, 3, 0.20463644910685885);
        setElement(term2823, 3, term2841);
        setDoubleElement(term2846, 0, 0.6829174717775378);
        setDoubleElement(term2846, 1, 0.28503580900047076);
        setDoubleElement(term2846, 2, 0.6947797782684805);
        setDoubleElement(term2846, 3, 0.38236284006262744);
        setElement(term2823, 4, term2846);
        setDoubleElement(term2851, 0, 0.47495853169088265);
        setDoubleElement(term2851, 1, 0.6328722780022467);
        setDoubleElement(term2851, 2, 0.37793096990014663);
        setDoubleElement(term2851, 3, 0.3979243958051598);
        setDoubleElement(term2851, 4, 0.45035410318626456);
        setDoubleElement(term2851, 5, 0.41663054506323705);
        setDoubleElement(term2851, 6, 0.5888915432899102);
        setDoubleElement(term2851, 7, 0.943613874626141);
        setDoubleElement(term2851, 8, 0.24891816914282516);
        setElement(term2823, 5, term2851);
        setDoubleElement(term2861, 0, 0.9450812156838558);
        setDoubleElement(term2861, 1, 0.27063228250778126);
        setDoubleElement(term2861, 2, 0.6543561796867697);
        setElement(term2823, 6, term2861);
        setDoubleElement(term2865, 0, 0.8888185305615081);
        setElement(term2823, 7, term2865);
        setField(term2822, term2822.getClass(), "householderVectors", term2823);
        setDoubleElement(term2867, 0, 0.5255619365560299);
        setDoubleElement(term2867, 1, 0.5296333160336295);
        setDoubleElement(term2867, 2, 0.0714564727239343);
        setDoubleElement(term2867, 3, 0.09283592692654719);
        setDoubleElement(term2867, 4, 0.38183705499247544);
        setField(term2822, term2822.getClass(), "main", term2867);
        setDoubleElement(term2873, 0, 0.6694932193674669);
        setDoubleElement(term2873, 1, 0.6488870209706011);
        setDoubleElement(term2873, 2, 0.9801062951794595);
        setDoubleElement(term2873, 3, 0.5849091704746101);
        setDoubleElement(term2873, 4, 0.7412210306652769);
        setField(term2822, term2822.getClass(), "secondary", term2873);
        setField(term2822, term2822.getClass(), "cachedQ", null);
        setField(term2822, term2822.getClass(), "cachedQt", null);
        setField(term2822, term2822.getClass(), "cachedT", null);
        setField(term2801, term2801.getClass(), "transformer", term2822);
        setDoubleField(term2801, term2801.getClass(), "lowerSpectra", 0.7187689681914144);
        setDoubleField(term2801, term2801.getClass(), "upperSpectra", 0.012903380955819);
        setDoubleField(term2801, term2801.getClass(), "minPivot", 0.6658804849092964);
        setDoubleField(term2801, term2801.getClass(), "sigma", 0.756115359256126);
        setDoubleField(term2801, term2801.getClass(), "sigmaLow", 0.25165131800473484);
        setDoubleField(term2801, term2801.getClass(), "tau", 0.07727592847638232);
        setDoubleElement(term2885, 0, 0.9520320225024602);
        setDoubleElement(term2885, 1, 0.27451792725982416);
        setDoubleElement(term2885, 2, 0.3223838166658701);
        setDoubleElement(term2885, 3, 0.9718625550615242);
        setDoubleElement(term2885, 4, 0.6956094243277123);
        setDoubleElement(term2885, 5, 0.5573619522213374);
        setDoubleElement(term2885, 6, 0.42382625246690864);
        setDoubleElement(term2885, 7, 0.3809642138437217);
        setField(term2801, term2801.getClass(), "work", term2885);
        setIntField(term2801, term2801.getClass(), "pingPong", 767834723);
        setDoubleField(term2801, term2801.getClass(), "qMax", 0.7493740389056603);
        setDoubleField(term2801, term2801.getClass(), "eMin", 0.8473180235516031);
        setIntField(term2801, term2801.getClass(), "tType", -602026508);
        setDoubleField(term2801, term2801.getClass(), "dMin", 0.15833228093630225);
        setDoubleField(term2801, term2801.getClass(), "dMin1", 0.6159623060552193);
        setDoubleField(term2801, term2801.getClass(), "dMin2", 0.883798426792428);
        setDoubleField(term2801, term2801.getClass(), "dN", 0.6324735890734227);
        setDoubleField(term2801, term2801.getClass(), "dN1", 0.3808902109160499);
        setDoubleField(term2801, term2801.getClass(), "dN2", 0.02342888977877522);
        setDoubleField(term2801, term2801.getClass(), "g", 0.8378559358854193);
        setDoubleElement(term2905, 0, 0.9378643616218147);
        setDoubleElement(term2905, 1, 0.567999688524224);
        setDoubleElement(term2905, 2, 0.9787822422280171);
        setField(term2801, term2801.getClass(), "realEigenvalues", term2905);
        setDoubleElement(term2909, 0, 0.8486739100301995);
        setDoubleElement(term2909, 1, 0.7888093083298529);
        setDoubleElement(term2909, 2, 0.04280766204589481);
        setDoubleElement(term2909, 3, 0.811099486121254);
        setDoubleElement(term2909, 4, 0.7148906778566934);
        setDoubleElement(term2909, 5, 0.9948833256821954);
        setField(term2801, term2801.getClass(), "imagEigenvalues", term2909);
        setField(term2917, term2917.getClass(), "data", term2918);
        setElement(term2916, 0, term2917);
        setField(term2919, term2919.getClass(), "data", term2920);
        setElement(term2916, 1, term2919);
        setField(term2921, term2921.getClass(), "data", term2922);
        setElement(term2916, 2, term2921);
        setField(term2923, term2923.getClass(), "data", term2924);
        setElement(term2916, 3, term2923);
        setField(term2925, term2925.getClass(), "data", term2926);
        setElement(term2916, 4, term2925);
        setField(term2927, term2927.getClass(), "data", term2928);
        setElement(term2916, 5, term2927);
        setField(term2929, term2929.getClass(), "data", term2930);
        setElement(term2916, 6, term2929);
        setField(term2931, term2931.getClass(), "data", term2932);
        setElement(term2916, 7, term2931);
        setField(term2801, term2801.getClass(), "eigenvectors", term2916);
        setField(term2801, term2801.getClass(), "cachedV", null);
        setField(term2801, term2801.getClass(), "cachedD", null);
        setField(term2801, term2801.getClass(), "cachedVt", null);
        term2933 = new Integer(-157887805);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2933;
        try {
            callMethod(klass, "process3RowsBlock", argTypes, term2801, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


