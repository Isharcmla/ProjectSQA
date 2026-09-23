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

public class EigenDecompositionImpl_dqds_211095371464 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4045;
     Object term4147;
     Object term4149;

    public EigenDecompositionImpl_dqds_211095371464() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4045 = newInstance(Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] term4047 = (double[]) newDoubleArray(7);
        double[] term4055 = (double[]) newDoubleArray(3);
        double[] term4059 = (double[]) newDoubleArray(9);
        Object term4069 = newInstance(Class.forName("org.apache.commons.math.linear.TriDiagonalTransformer"));
        Object[] term4070 = (Object[]) newArray("[D", 8);
        double[] term4071 = (double[]) newDoubleArray(8);
        double[] term4080 = (double[]) newDoubleArray(1);
        double[] term4082 = (double[]) newDoubleArray(1);
        double[] term4084 = (double[]) newDoubleArray(9);
        double[] term4094 = (double[]) newDoubleArray(1);
        double[] term4096 = (double[]) newDoubleArray(4);
        double[] term4101 = (double[]) newDoubleArray(0);
        double[] term4102 = (double[]) newDoubleArray(2);
        double[] term4105 = (double[]) newDoubleArray(1);
        double[] term4107 = (double[]) newDoubleArray(1);
        double[] term4115 = (double[]) newDoubleArray(8);
        double[] term4135 = (double[]) newDoubleArray(5);
        double[] term4141 = (double[]) newDoubleArray(0);
        Object[] term4142 = (Object[]) newArray("org.apache.commons.math.linear.ArrayRealVector", 2);
        Object term4143 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term4144 = (double[]) newDoubleArray(0);
        Object term4145 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term4146 = (double[]) newDoubleArray(0);
        setDoubleField(term4045, term4045.getClass(), "splitTolerance", 0.18560468753172665);
        setDoubleElement(term4047, 0, 0.7356611808890637);
        setDoubleElement(term4047, 1, 0.7147117146060841);
        setDoubleElement(term4047, 2, 0.33975758144309276);
        setDoubleElement(term4047, 3, 0.16116508413978003);
        setDoubleElement(term4047, 4, 0.6714624608522081);
        setDoubleElement(term4047, 5, 0.7679444712297933);
        setDoubleElement(term4047, 6, 0.5300449702511889);
        setField(term4045, term4045.getClass(), "main", term4047);
        setDoubleElement(term4055, 0, 0.9386867634714298);
        setDoubleElement(term4055, 1, 0.6880862041479128);
        setDoubleElement(term4055, 2, 0.9657559077723522);
        setField(term4045, term4045.getClass(), "secondary", term4055);
        setDoubleElement(term4059, 0, 0.8836831873692292);
        setDoubleElement(term4059, 1, 0.23658362473895145);
        setDoubleElement(term4059, 2, 0.8725659302223006);
        setDoubleElement(term4059, 3, 0.32657279509087744);
        setDoubleElement(term4059, 4, 0.13845411040576694);
        setDoubleElement(term4059, 5, 0.01980900066820912);
        setDoubleElement(term4059, 6, 0.6814413815228997);
        setDoubleElement(term4059, 7, 0.49165542770735404);
        setDoubleElement(term4059, 8, 0.19383156826937886);
        setField(term4045, term4045.getClass(), "squaredSecondary", term4059);
        setDoubleElement(term4071, 0, 0.7698932357373801);
        setDoubleElement(term4071, 1, 0.02836037290408877);
        setDoubleElement(term4071, 2, 0.12142304196855824);
        setDoubleElement(term4071, 3, 0.7559357862632843);
        setDoubleElement(term4071, 4, 0.22579605333279118);
        setDoubleElement(term4071, 5, 0.09286912577718698);
        setDoubleElement(term4071, 6, 0.2592522943455753);
        setDoubleElement(term4071, 7, 0.29811280084680813);
        setElement(term4070, 0, term4071);
        setDoubleElement(term4080, 0, 0.26589199383156603);
        setElement(term4070, 1, term4080);
        setDoubleElement(term4082, 0, 0.24946956393957898);
        setElement(term4070, 2, term4082);
        setDoubleElement(term4084, 0, 0.20660269955202237);
        setDoubleElement(term4084, 1, 0.7074091088647776);
        setDoubleElement(term4084, 2, 0.7000407967210135);
        setDoubleElement(term4084, 3, 0.3724671795059947);
        setDoubleElement(term4084, 4, 0.8800802342679814);
        setDoubleElement(term4084, 5, 0.2967811635938967);
        setDoubleElement(term4084, 6, 0.7455766528856747);
        setDoubleElement(term4084, 7, 0.7848284328368673);
        setDoubleElement(term4084, 8, 0.45405874014259684);
        setElement(term4070, 3, term4084);
        setDoubleElement(term4094, 0, 0.8287003692505468);
        setElement(term4070, 4, term4094);
        setDoubleElement(term4096, 0, 0.872183435442562);
        setDoubleElement(term4096, 1, 0.2882121702089331);
        setDoubleElement(term4096, 2, 0.33173641696480016);
        setDoubleElement(term4096, 3, 0.8178843489441128);
        setElement(term4070, 5, term4096);
        setElement(term4070, 6, term4101);
        setDoubleElement(term4102, 0, 0.5180057494602744);
        setDoubleElement(term4102, 1, 0.03653451194617485);
        setElement(term4070, 7, term4102);
        setField(term4069, term4069.getClass(), "householderVectors", term4070);
        setDoubleElement(term4105, 0, 0.1330120006712231);
        setField(term4069, term4069.getClass(), "main", term4105);
        setDoubleElement(term4107, 0, 0.6592051986007408);
        setField(term4069, term4069.getClass(), "secondary", term4107);
        setField(term4069, term4069.getClass(), "cachedQ", null);
        setField(term4069, term4069.getClass(), "cachedQt", null);
        setField(term4069, term4069.getClass(), "cachedT", null);
        setField(term4045, term4045.getClass(), "transformer", term4069);
        setDoubleField(term4045, term4045.getClass(), "lowerSpectra", 0.9029786080117671);
        setDoubleField(term4045, term4045.getClass(), "upperSpectra", 0.49687206530148353);
        setDoubleField(term4045, term4045.getClass(), "minPivot", 0.4393239742435411);
        setDoubleField(term4045, term4045.getClass(), "sigma", 0.061396562031202806);
        setDoubleField(term4045, term4045.getClass(), "sigmaLow", 0.7952410141267131);
        setDoubleField(term4045, term4045.getClass(), "tau", 0.3792040313417304);
        setDoubleElement(term4115, 0, 0.4936029650695076);
        setDoubleElement(term4115, 1, 0.8580005557306133);
        setDoubleElement(term4115, 2, 0.6226318229146778);
        setDoubleElement(term4115, 3, 0.21043841763332094);
        setDoubleElement(term4115, 4, 0.9177463037116731);
        setDoubleElement(term4115, 5, 0.5140671128103492);
        setDoubleElement(term4115, 6, 0.7636490217504489);
        setDoubleElement(term4115, 7, 0.17836343343055017);
        setField(term4045, term4045.getClass(), "work", term4115);
        setIntField(term4045, term4045.getClass(), "pingPong", 287287233);
        setDoubleField(term4045, term4045.getClass(), "qMax", 0.7805302796119583);
        setDoubleField(term4045, term4045.getClass(), "eMin", 0.5504375992148846);
        setIntField(term4045, term4045.getClass(), "tType", 962840079);
        setDoubleField(term4045, term4045.getClass(), "dMin", 0.20088626716870783);
        setDoubleField(term4045, term4045.getClass(), "dMin1", 0.9776101302714891);
        setDoubleField(term4045, term4045.getClass(), "dMin2", 0.02563505505833974);
        setDoubleField(term4045, term4045.getClass(), "dN", 0.6670154414690855);
        setDoubleField(term4045, term4045.getClass(), "dN1", 0.9748435871404681);
        setDoubleField(term4045, term4045.getClass(), "dN2", 0.6524079186994814);
        setDoubleField(term4045, term4045.getClass(), "g", 0.35246320146185783);
        setDoubleElement(term4135, 0, 0.5622467882629956);
        setDoubleElement(term4135, 1, 0.0371414195066222);
        setDoubleElement(term4135, 2, 0.8498595938632192);
        setDoubleElement(term4135, 3, 0.1316924349860824);
        setDoubleElement(term4135, 4, 0.31810411682749784);
        setField(term4045, term4045.getClass(), "realEigenvalues", term4135);
        setField(term4045, term4045.getClass(), "imagEigenvalues", term4141);
        setField(term4143, term4143.getClass(), "data", term4144);
        setElement(term4142, 0, term4143);
        setField(term4145, term4145.getClass(), "data", term4146);
        setElement(term4142, 1, term4145);
        setField(term4045, term4045.getClass(), "eigenvectors", term4142);
        setField(term4045, term4045.getClass(), "cachedV", null);
        setField(term4045, term4045.getClass(), "cachedD", null);
        setField(term4045, term4045.getClass(), "cachedVt", null);
        term4147 = new Integer(1540719661);
        term4149 = new Integer(1265463001);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term4147;
        args[1] = term4149;
        try {
            callMethod(klass, "dqds", argTypes, term4045, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


