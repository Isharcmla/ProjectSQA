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
import java.lang.Object;

public class EigenDecompositionImpl_decompose_612309833 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term157;

    public EigenDecompositionImpl_decompose_612309833() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term157 = newInstance(Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] term159 = (double[]) newDoubleArray(8);
        double[] term168 = (double[]) newDoubleArray(6);
        double[] term175 = (double[]) newDoubleArray(2);
        Object term178 = newInstance(Class.forName("org.apache.commons.math.linear.TriDiagonalTransformer"));
        Object[] term179 = (Object[]) newArray("[D", 1);
        double[] term180 = (double[]) newDoubleArray(9);
        double[] term190 = (double[]) newDoubleArray(3);
        double[] term194 = (double[]) newDoubleArray(5);
        double[] term206 = (double[]) newDoubleArray(6);
        double[] term224 = (double[]) newDoubleArray(5);
        double[] term230 = (double[]) newDoubleArray(3);
        Object[] term234 = (Object[]) newArray("org.apache.commons.math.linear.ArrayRealVector", 7);
        Object term235 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term236 = (double[]) newDoubleArray(0);
        Object term237 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term238 = (double[]) newDoubleArray(0);
        Object term239 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term240 = (double[]) newDoubleArray(0);
        Object term241 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term242 = (double[]) newDoubleArray(0);
        Object term243 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term244 = (double[]) newDoubleArray(0);
        Object term245 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term246 = (double[]) newDoubleArray(0);
        Object term247 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term248 = (double[]) newDoubleArray(0);
        setDoubleField(term157, term157.getClass(), "splitTolerance", 0.36226058076369927);
        setDoubleElement(term159, 0, 0.03699061125289671);
        setDoubleElement(term159, 1, 0.6047137830113202);
        setDoubleElement(term159, 2, 0.6767213143579776);
        setDoubleElement(term159, 3, 0.48862955528902696);
        setDoubleElement(term159, 4, 0.426231085465289);
        setDoubleElement(term159, 5, 0.0027299293098262956);
        setDoubleElement(term159, 6, 0.29874017652881824);
        setDoubleElement(term159, 7, 0.32554480512985284);
        setField(term157, term157.getClass(), "main", term159);
        setDoubleElement(term168, 0, 0.8924855581421237);
        setDoubleElement(term168, 1, 0.32237559209193944);
        setDoubleElement(term168, 2, 0.53094494792755);
        setDoubleElement(term168, 3, 0.146431486357265);
        setDoubleElement(term168, 4, 0.24259014218848696);
        setDoubleElement(term168, 5, 0.1544348383112728);
        setField(term157, term157.getClass(), "secondary", term168);
        setDoubleElement(term175, 0, 0.5187846213101265);
        setDoubleElement(term175, 1, 0.045893173090043815);
        setField(term157, term157.getClass(), "squaredSecondary", term175);
        setDoubleElement(term180, 0, 0.3626177854778667);
        setDoubleElement(term180, 1, 0.3163771663728089);
        setDoubleElement(term180, 2, 0.8819646072665548);
        setDoubleElement(term180, 3, 0.5412182593116958);
        setDoubleElement(term180, 4, 0.16988691727397487);
        setDoubleElement(term180, 5, 0.39286935532362843);
        setDoubleElement(term180, 6, 0.11577948268926874);
        setDoubleElement(term180, 7, 0.5617009352394552);
        setDoubleElement(term180, 8, 0.09067063848644474);
        setElement(term179, 0, term180);
        setField(term178, term178.getClass(), "householderVectors", term179);
        setDoubleElement(term190, 0, 0.268304014379393);
        setDoubleElement(term190, 1, 0.7171972879282721);
        setDoubleElement(term190, 2, 0.9006361024877096);
        setField(term178, term178.getClass(), "main", term190);
        setDoubleElement(term194, 0, 0.5644914462415626);
        setDoubleElement(term194, 1, 0.509895859167191);
        setDoubleElement(term194, 2, 0.07417792024383196);
        setDoubleElement(term194, 3, 0.686293604788188);
        setDoubleElement(term194, 4, 0.12764449157430724);
        setField(term178, term178.getClass(), "secondary", term194);
        setField(term178, term178.getClass(), "cachedQ", null);
        setField(term178, term178.getClass(), "cachedQt", null);
        setField(term178, term178.getClass(), "cachedT", null);
        setField(term157, term157.getClass(), "transformer", term178);
        setDoubleField(term157, term157.getClass(), "lowerSpectra", 0.39446728256884744);
        setDoubleField(term157, term157.getClass(), "upperSpectra", 0.7865909711092062);
        setDoubleField(term157, term157.getClass(), "minPivot", 0.06587158449170749);
        setDoubleField(term157, term157.getClass(), "sigma", 0.0865998004187658);
        setDoubleField(term157, term157.getClass(), "sigmaLow", 0.9628647861255637);
        setDoubleField(term157, term157.getClass(), "tau", 0.623231822150205);
        setDoubleElement(term206, 0, 0.09037487793444521);
        setDoubleElement(term206, 1, 0.6561919196821765);
        setDoubleElement(term206, 2, 0.7330178886612495);
        setDoubleElement(term206, 3, 0.7618164754425794);
        setDoubleElement(term206, 4, 0.7385589312559342);
        setDoubleElement(term206, 5, 0.7080134263823477);
        setField(term157, term157.getClass(), "work", term206);
        setIntField(term157, term157.getClass(), "pingPong", 1484323161);
        setDoubleField(term157, term157.getClass(), "qMax", 0.6059734092898602);
        setDoubleField(term157, term157.getClass(), "eMin", 0.3074693824288357);
        setIntField(term157, term157.getClass(), "tType", 391863371);
        setDoubleField(term157, term157.getClass(), "dMin", 0.1245258965512791);
        setDoubleField(term157, term157.getClass(), "dMin1", 0.9511861072660375);
        setDoubleField(term157, term157.getClass(), "dMin2", 0.05880719443135807);
        setDoubleField(term157, term157.getClass(), "dN", 0.34010089048558567);
        setDoubleField(term157, term157.getClass(), "dN1", 0.19625398866403143);
        setDoubleField(term157, term157.getClass(), "dN2", 0.45069204793711093);
        setDoubleField(term157, term157.getClass(), "g", 0.9341364461850963);
        setDoubleElement(term224, 0, 0.9022041121474429);
        setDoubleElement(term224, 1, 0.6512870939318848);
        setDoubleElement(term224, 2, 0.8777038609128434);
        setDoubleElement(term224, 3, 0.008025683154629148);
        setDoubleElement(term224, 4, 0.40598298281353484);
        setField(term157, term157.getClass(), "realEigenvalues", term224);
        setDoubleElement(term230, 0, 0.3710067290060264);
        setDoubleElement(term230, 1, 0.7818620200430967);
        setDoubleElement(term230, 2, 0.04640022995603543);
        setField(term157, term157.getClass(), "imagEigenvalues", term230);
        setField(term235, term235.getClass(), "data", term236);
        setElement(term234, 0, term235);
        setField(term237, term237.getClass(), "data", term238);
        setElement(term234, 1, term237);
        setField(term239, term239.getClass(), "data", term240);
        setElement(term234, 2, term239);
        setField(term241, term241.getClass(), "data", term242);
        setElement(term234, 3, term241);
        setField(term243, term243.getClass(), "data", term244);
        setElement(term234, 4, term243);
        setField(term245, term245.getClass(), "data", term246);
        setElement(term234, 5, term245);
        setField(term247, term247.getClass(), "data", term248);
        setElement(term234, 6, term247);
        setField(term157, term157.getClass(), "eigenvectors", term234);
        setField(term157, term157.getClass(), "cachedV", null);
        setField(term157, term157.getClass(), "cachedD", null);
        setField(term157, term157.getClass(), "cachedVt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "decompose", argTypes, term157, args);
    }

};


