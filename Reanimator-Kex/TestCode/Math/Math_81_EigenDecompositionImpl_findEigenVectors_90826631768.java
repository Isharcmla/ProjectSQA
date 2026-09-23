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

public class EigenDecompositionImpl_findEigenVectors_90826631768 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4749;

    public EigenDecompositionImpl_findEigenVectors_90826631768() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4749 = newInstance(Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] term4751 = (double[]) newDoubleArray(7);
        double[] term4759 = (double[]) newDoubleArray(1);
        double[] term4761 = (double[]) newDoubleArray(5);
        Object term4767 = newInstance(Class.forName("org.apache.commons.math.linear.TriDiagonalTransformer"));
        Object[] term4768 = (Object[]) newArray("[D", 8);
        double[] term4769 = (double[]) newDoubleArray(7);
        double[] term4777 = (double[]) newDoubleArray(8);
        double[] term4786 = (double[]) newDoubleArray(2);
        double[] term4789 = (double[]) newDoubleArray(8);
        double[] term4798 = (double[]) newDoubleArray(3);
        double[] term4802 = (double[]) newDoubleArray(7);
        double[] term4810 = (double[]) newDoubleArray(5);
        double[] term4816 = (double[]) newDoubleArray(3);
        double[] term4820 = (double[]) newDoubleArray(8);
        double[] term4829 = (double[]) newDoubleArray(6);
        double[] term4842 = (double[]) newDoubleArray(3);
        double[] term4857 = (double[]) newDoubleArray(7);
        double[] term4865 = (double[]) newDoubleArray(7);
        Object[] term4873 = (Object[]) newArray("org.apache.commons.math.linear.ArrayRealVector", 6);
        Object term4874 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term4875 = (double[]) newDoubleArray(0);
        Object term4876 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term4877 = (double[]) newDoubleArray(0);
        Object term4878 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term4879 = (double[]) newDoubleArray(0);
        Object term4880 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term4881 = (double[]) newDoubleArray(0);
        Object term4882 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term4883 = (double[]) newDoubleArray(0);
        Object term4884 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term4885 = (double[]) newDoubleArray(0);
        setDoubleField(term4749, term4749.getClass(), "splitTolerance", 0.9088789712296786);
        setDoubleElement(term4751, 0, 0.0622260334224668);
        setDoubleElement(term4751, 1, 0.7534658756674337);
        setDoubleElement(term4751, 2, 0.8266535520676014);
        setDoubleElement(term4751, 3, 0.34831817591256586);
        setDoubleElement(term4751, 4, 0.9665836247275379);
        setDoubleElement(term4751, 5, 0.5614249362990958);
        setDoubleElement(term4751, 6, 0.7082484066898346);
        setField(term4749, term4749.getClass(), "main", term4751);
        setDoubleElement(term4759, 0, 0.7857751182130955);
        setField(term4749, term4749.getClass(), "secondary", term4759);
        setDoubleElement(term4761, 0, 0.20628076592924016);
        setDoubleElement(term4761, 1, 0.16672620259187543);
        setDoubleElement(term4761, 2, 0.6197194182962104);
        setDoubleElement(term4761, 3, 0.7160391120375453);
        setDoubleElement(term4761, 4, 0.8723288008928582);
        setField(term4749, term4749.getClass(), "squaredSecondary", term4761);
        setDoubleElement(term4769, 0, 0.5936110668328244);
        setDoubleElement(term4769, 1, 0.5471058935424563);
        setDoubleElement(term4769, 2, 0.9664671818847023);
        setDoubleElement(term4769, 3, 0.8935521947489894);
        setDoubleElement(term4769, 4, 0.8549866764294501);
        setDoubleElement(term4769, 5, 0.034400491312272075);
        setDoubleElement(term4769, 6, 0.4957135859416001);
        setElement(term4768, 0, term4769);
        setDoubleElement(term4777, 0, 0.5883891057978492);
        setDoubleElement(term4777, 1, 0.9386273929473176);
        setDoubleElement(term4777, 2, 0.3478743797984428);
        setDoubleElement(term4777, 3, 0.7577489052812953);
        setDoubleElement(term4777, 4, 0.7132025883820788);
        setDoubleElement(term4777, 5, 0.9938738471810814);
        setDoubleElement(term4777, 6, 0.9665791052626924);
        setDoubleElement(term4777, 7, 0.3266337094192928);
        setElement(term4768, 1, term4777);
        setDoubleElement(term4786, 0, 0.421561424803641);
        setDoubleElement(term4786, 1, 0.2526736279611844);
        setElement(term4768, 2, term4786);
        setDoubleElement(term4789, 0, 0.09326927086958081);
        setDoubleElement(term4789, 1, 0.9433321846789665);
        setDoubleElement(term4789, 2, 0.9600828187640723);
        setDoubleElement(term4789, 3, 0.8877528865772201);
        setDoubleElement(term4789, 4, 0.6192487125288333);
        setDoubleElement(term4789, 5, 0.2679214363216502);
        setDoubleElement(term4789, 6, 0.2438116092887026);
        setDoubleElement(term4789, 7, 0.8359034876515007);
        setElement(term4768, 3, term4789);
        setDoubleElement(term4798, 0, 0.12214972287583126);
        setDoubleElement(term4798, 1, 0.3988726270279356);
        setDoubleElement(term4798, 2, 0.6777439515845167);
        setElement(term4768, 4, term4798);
        setDoubleElement(term4802, 0, 0.5958157016157475);
        setDoubleElement(term4802, 1, 0.02741339693517919);
        setDoubleElement(term4802, 2, 0.6556499778173672);
        setDoubleElement(term4802, 3, 0.7209855481213597);
        setDoubleElement(term4802, 4, 0.14758145600213812);
        setDoubleElement(term4802, 5, 0.022246611833629748);
        setDoubleElement(term4802, 6, 0.21169473590468513);
        setElement(term4768, 5, term4802);
        setDoubleElement(term4810, 0, 0.7261681667250225);
        setDoubleElement(term4810, 1, 0.434939079353607);
        setDoubleElement(term4810, 2, 0.1750892962955467);
        setDoubleElement(term4810, 3, 0.9119305866844153);
        setDoubleElement(term4810, 4, 0.5291301488787364);
        setElement(term4768, 6, term4810);
        setDoubleElement(term4816, 0, 0.30152507731542666);
        setDoubleElement(term4816, 1, 0.984132899142262);
        setDoubleElement(term4816, 2, 0.012248155784860604);
        setElement(term4768, 7, term4816);
        setField(term4767, term4767.getClass(), "householderVectors", term4768);
        setDoubleElement(term4820, 0, 0.11250015410105907);
        setDoubleElement(term4820, 1, 0.37884418937882003);
        setDoubleElement(term4820, 2, 0.7551895051956722);
        setDoubleElement(term4820, 3, 0.6379959783853909);
        setDoubleElement(term4820, 4, 0.42170552497079794);
        setDoubleElement(term4820, 5, 0.18636438609851413);
        setDoubleElement(term4820, 6, 0.2922182045483741);
        setDoubleElement(term4820, 7, 0.4743259909331766);
        setField(term4767, term4767.getClass(), "main", term4820);
        setDoubleElement(term4829, 0, 0.0730602531264618);
        setDoubleElement(term4829, 1, 0.6230884462892928);
        setDoubleElement(term4829, 2, 0.8730734961944997);
        setDoubleElement(term4829, 3, 0.5733115411959432);
        setDoubleElement(term4829, 4, 0.26096939053023327);
        setDoubleElement(term4829, 5, 0.10514922559373319);
        setField(term4767, term4767.getClass(), "secondary", term4829);
        setField(term4767, term4767.getClass(), "cachedQ", null);
        setField(term4767, term4767.getClass(), "cachedQt", null);
        setField(term4767, term4767.getClass(), "cachedT", null);
        setField(term4749, term4749.getClass(), "transformer", term4767);
        setDoubleField(term4749, term4749.getClass(), "lowerSpectra", 0.8785483882150054);
        setDoubleField(term4749, term4749.getClass(), "upperSpectra", 0.19107674047250423);
        setDoubleField(term4749, term4749.getClass(), "minPivot", 0.6449205630414567);
        setDoubleField(term4749, term4749.getClass(), "sigma", 0.8354212746719061);
        setDoubleField(term4749, term4749.getClass(), "sigmaLow", 0.24454223546223186);
        setDoubleField(term4749, term4749.getClass(), "tau", 0.25274562549135593);
        setDoubleElement(term4842, 0, 0.37681516039253227);
        setDoubleElement(term4842, 1, 0.07883611851840377);
        setDoubleElement(term4842, 2, 0.11519164760139777);
        setField(term4749, term4749.getClass(), "work", term4842);
        setIntField(term4749, term4749.getClass(), "pingPong", 1090617576);
        setDoubleField(term4749, term4749.getClass(), "qMax", 0.38384076907083264);
        setDoubleField(term4749, term4749.getClass(), "eMin", 0.7153252997737799);
        setIntField(term4749, term4749.getClass(), "tType", -1547384488);
        setDoubleField(term4749, term4749.getClass(), "dMin", 0.8610348310623582);
        setDoubleField(term4749, term4749.getClass(), "dMin1", 0.6890604259182374);
        setDoubleField(term4749, term4749.getClass(), "dMin2", 0.4438301613181722);
        setDoubleField(term4749, term4749.getClass(), "dN", 0.866344928390349);
        setDoubleField(term4749, term4749.getClass(), "dN1", 0.20818571655486384);
        setDoubleField(term4749, term4749.getClass(), "dN2", 0.2709921468468077);
        setDoubleField(term4749, term4749.getClass(), "g", 0.1508428473576966);
        setDoubleElement(term4857, 0, 0.7872366489254393);
        setDoubleElement(term4857, 1, 0.9022410838182242);
        setDoubleElement(term4857, 2, 0.9689871060409417);
        setDoubleElement(term4857, 3, 0.6961428571030355);
        setDoubleElement(term4857, 4, 0.697458471109218);
        setDoubleElement(term4857, 5, 0.73860215688003);
        setDoubleElement(term4857, 6, 0.3084728408267664);
        setField(term4749, term4749.getClass(), "realEigenvalues", term4857);
        setDoubleElement(term4865, 0, 0.21277195718024777);
        setDoubleElement(term4865, 1, 0.9492873384006324);
        setDoubleElement(term4865, 2, 0.44210620852815063);
        setDoubleElement(term4865, 3, 0.27559565743318604);
        setDoubleElement(term4865, 4, 0.5848422807796964);
        setDoubleElement(term4865, 5, 0.7297396812967131);
        setDoubleElement(term4865, 6, 0.7224456279467597);
        setField(term4749, term4749.getClass(), "imagEigenvalues", term4865);
        setField(term4874, term4874.getClass(), "data", term4875);
        setElement(term4873, 0, term4874);
        setField(term4876, term4876.getClass(), "data", term4877);
        setElement(term4873, 1, term4876);
        setField(term4878, term4878.getClass(), "data", term4879);
        setElement(term4873, 2, term4878);
        setField(term4880, term4880.getClass(), "data", term4881);
        setElement(term4873, 3, term4880);
        setField(term4882, term4882.getClass(), "data", term4883);
        setElement(term4873, 4, term4882);
        setField(term4884, term4884.getClass(), "data", term4885);
        setElement(term4873, 5, term4884);
        setField(term4749, term4749.getClass(), "eigenvectors", term4873);
        setField(term4749, term4749.getClass(), "cachedV", null);
        setField(term4749, term4749.getClass(), "cachedD", null);
        setField(term4749, term4749.getClass(), "cachedVt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "findEigenVectors", argTypes, term4749, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


