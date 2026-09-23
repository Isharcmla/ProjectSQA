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

public class EigenDecompositionImpl_dqd_76359429165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4211;
     Object term4354;
     Object term4356;

    public EigenDecompositionImpl_dqd_76359429165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4211 = newInstance(Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] term4213 = (double[]) newDoubleArray(6);
        double[] term4220 = (double[]) newDoubleArray(3);
        double[] term4224 = (double[]) newDoubleArray(7);
        Object term4232 = newInstance(Class.forName("org.apache.commons.math.linear.TriDiagonalTransformer"));
        Object[] term4233 = (Object[]) newArray("[D", 8);
        double[] term4234 = (double[]) newDoubleArray(3);
        double[] term4238 = (double[]) newDoubleArray(5);
        double[] term4244 = (double[]) newDoubleArray(7);
        double[] term4252 = (double[]) newDoubleArray(6);
        double[] term4259 = (double[]) newDoubleArray(8);
        double[] term4268 = (double[]) newDoubleArray(8);
        double[] term4277 = (double[]) newDoubleArray(5);
        double[] term4283 = (double[]) newDoubleArray(6);
        double[] term4290 = (double[]) newDoubleArray(6);
        double[] term4297 = (double[]) newDoubleArray(5);
        double[] term4309 = (double[]) newDoubleArray(9);
        double[] term4330 = (double[]) newDoubleArray(3);
        double[] term4334 = (double[]) newDoubleArray(8);
        Object[] term4343 = (Object[]) newArray("org.apache.commons.math.linear.ArrayRealVector", 5);
        Object term4344 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term4345 = (double[]) newDoubleArray(0);
        Object term4346 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term4347 = (double[]) newDoubleArray(0);
        Object term4348 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term4349 = (double[]) newDoubleArray(0);
        Object term4350 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term4351 = (double[]) newDoubleArray(0);
        Object term4352 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term4353 = (double[]) newDoubleArray(0);
        setDoubleField(term4211, term4211.getClass(), "splitTolerance", 0.1695508466986878);
        setDoubleElement(term4213, 0, 0.472658101295364);
        setDoubleElement(term4213, 1, 0.833009199279674);
        setDoubleElement(term4213, 2, 0.748186545291172);
        setDoubleElement(term4213, 3, 0.6088846358210241);
        setDoubleElement(term4213, 4, 0.45161257515911524);
        setDoubleElement(term4213, 5, 0.744229304833858);
        setField(term4211, term4211.getClass(), "main", term4213);
        setDoubleElement(term4220, 0, 0.29112078490840676);
        setDoubleElement(term4220, 1, 0.8976777038298248);
        setDoubleElement(term4220, 2, 0.24604603567238703);
        setField(term4211, term4211.getClass(), "secondary", term4220);
        setDoubleElement(term4224, 0, 0.4690179135770387);
        setDoubleElement(term4224, 1, 0.8722664294323148);
        setDoubleElement(term4224, 2, 0.26671699744008304);
        setDoubleElement(term4224, 3, 0.7240732539038799);
        setDoubleElement(term4224, 4, 0.8046804592509608);
        setDoubleElement(term4224, 5, 0.6538006148276369);
        setDoubleElement(term4224, 6, 0.5478653030741516);
        setField(term4211, term4211.getClass(), "squaredSecondary", term4224);
        setDoubleElement(term4234, 0, 0.2749618643648508);
        setDoubleElement(term4234, 1, 0.12200291174203359);
        setDoubleElement(term4234, 2, 0.7465763848976307);
        setElement(term4233, 0, term4234);
        setDoubleElement(term4238, 0, 0.21425458242008177);
        setDoubleElement(term4238, 1, 0.3622254215968558);
        setDoubleElement(term4238, 2, 0.2958780756753986);
        setDoubleElement(term4238, 3, 0.7667201074263599);
        setDoubleElement(term4238, 4, 0.649808575802068);
        setElement(term4233, 1, term4238);
        setDoubleElement(term4244, 0, 0.2387925045816025);
        setDoubleElement(term4244, 1, 0.5684623038577817);
        setDoubleElement(term4244, 2, 0.5857531996955357);
        setDoubleElement(term4244, 3, 0.16118654728307136);
        setDoubleElement(term4244, 4, 0.21454117227433023);
        setDoubleElement(term4244, 5, 0.46586481983387695);
        setDoubleElement(term4244, 6, 0.7450939404554896);
        setElement(term4233, 2, term4244);
        setDoubleElement(term4252, 0, 0.5626230381451691);
        setDoubleElement(term4252, 1, 0.691683258601906);
        setDoubleElement(term4252, 2, 0.03487955738253701);
        setDoubleElement(term4252, 3, 0.7841154033456191);
        setDoubleElement(term4252, 4, 0.38777118683579215);
        setDoubleElement(term4252, 5, 0.16492853840013189);
        setElement(term4233, 3, term4252);
        setDoubleElement(term4259, 0, 0.21802764917100825);
        setDoubleElement(term4259, 1, 0.1655057678881775);
        setDoubleElement(term4259, 2, 0.9125403831916415);
        setDoubleElement(term4259, 3, 0.5210540264393367);
        setDoubleElement(term4259, 4, 0.14318570347313864);
        setDoubleElement(term4259, 5, 0.5724978508519074);
        setDoubleElement(term4259, 6, 0.20905115833247412);
        setDoubleElement(term4259, 7, 0.26644888792640953);
        setElement(term4233, 4, term4259);
        setDoubleElement(term4268, 0, 0.4683337919743189);
        setDoubleElement(term4268, 1, 0.09960446090587338);
        setDoubleElement(term4268, 2, 0.39321378735034407);
        setDoubleElement(term4268, 3, 0.7614009834017179);
        setDoubleElement(term4268, 4, 0.6924641910636379);
        setDoubleElement(term4268, 5, 0.26181731843076583);
        setDoubleElement(term4268, 6, 0.07706926858567276);
        setDoubleElement(term4268, 7, 0.14633587088724542);
        setElement(term4233, 5, term4268);
        setDoubleElement(term4277, 0, 0.5204498621462832);
        setDoubleElement(term4277, 1, 0.8067967304857403);
        setDoubleElement(term4277, 2, 0.7919144654608262);
        setDoubleElement(term4277, 3, 0.4079153488596283);
        setDoubleElement(term4277, 4, 0.9526798422512842);
        setElement(term4233, 6, term4277);
        setDoubleElement(term4283, 0, 0.03040018689432178);
        setDoubleElement(term4283, 1, 0.8093660326394945);
        setDoubleElement(term4283, 2, 0.9518466347294469);
        setDoubleElement(term4283, 3, 0.7595257736544744);
        setDoubleElement(term4283, 4, 0.6679678799052108);
        setDoubleElement(term4283, 5, 0.3549004318065442);
        setElement(term4233, 7, term4283);
        setField(term4232, term4232.getClass(), "householderVectors", term4233);
        setDoubleElement(term4290, 0, 0.124450071598591);
        setDoubleElement(term4290, 1, 0.39621272551742337);
        setDoubleElement(term4290, 2, 0.46210382875739175);
        setDoubleElement(term4290, 3, 0.6820400822344057);
        setDoubleElement(term4290, 4, 0.3564769700832985);
        setDoubleElement(term4290, 5, 0.21542404953260907);
        setField(term4232, term4232.getClass(), "main", term4290);
        setDoubleElement(term4297, 0, 0.19226136632115187);
        setDoubleElement(term4297, 1, 0.855238964355623);
        setDoubleElement(term4297, 2, 0.9903661251227007);
        setDoubleElement(term4297, 3, 0.04297866110581505);
        setDoubleElement(term4297, 4, 0.2922622757798957);
        setField(term4232, term4232.getClass(), "secondary", term4297);
        setField(term4232, term4232.getClass(), "cachedQ", null);
        setField(term4232, term4232.getClass(), "cachedQt", null);
        setField(term4232, term4232.getClass(), "cachedT", null);
        setField(term4211, term4211.getClass(), "transformer", term4232);
        setDoubleField(term4211, term4211.getClass(), "lowerSpectra", 0.3756529679541024);
        setDoubleField(term4211, term4211.getClass(), "upperSpectra", 0.39607142655258365);
        setDoubleField(term4211, term4211.getClass(), "minPivot", 0.7961767184548012);
        setDoubleField(term4211, term4211.getClass(), "sigma", 0.17894877817839372);
        setDoubleField(term4211, term4211.getClass(), "sigmaLow", 0.9763640199590684);
        setDoubleField(term4211, term4211.getClass(), "tau", 0.6807893202411869);
        setDoubleElement(term4309, 0, 0.8449173464492756);
        setDoubleElement(term4309, 1, 0.06848840141093038);
        setDoubleElement(term4309, 2, 0.012259306623765509);
        setDoubleElement(term4309, 3, 0.15435966534588652);
        setDoubleElement(term4309, 4, 0.24245004357851174);
        setDoubleElement(term4309, 5, 0.36642160050908623);
        setDoubleElement(term4309, 6, 0.8746495688395557);
        setDoubleElement(term4309, 7, 0.7248089781283789);
        setDoubleElement(term4309, 8, 0.785629286975934);
        setField(term4211, term4211.getClass(), "work", term4309);
        setIntField(term4211, term4211.getClass(), "pingPong", 335112684);
        setDoubleField(term4211, term4211.getClass(), "qMax", 0.6833628148668747);
        setDoubleField(term4211, term4211.getClass(), "eMin", 0.7718438253007611);
        setIntField(term4211, term4211.getClass(), "tType", 1551099402);
        setDoubleField(term4211, term4211.getClass(), "dMin", 0.5674504087034486);
        setDoubleField(term4211, term4211.getClass(), "dMin1", 0.10379904571051224);
        setDoubleField(term4211, term4211.getClass(), "dMin2", 0.15033538395041912);
        setDoubleField(term4211, term4211.getClass(), "dN", 0.034280356871018935);
        setDoubleField(term4211, term4211.getClass(), "dN1", 0.7361499597844404);
        setDoubleField(term4211, term4211.getClass(), "dN2", 0.6209430640783861);
        setDoubleField(term4211, term4211.getClass(), "g", 0.9860414852428611);
        setDoubleElement(term4330, 0, 0.8264462459765279);
        setDoubleElement(term4330, 1, 0.8668140964793999);
        setDoubleElement(term4330, 2, 0.28749272859302133);
        setField(term4211, term4211.getClass(), "realEigenvalues", term4330);
        setDoubleElement(term4334, 0, 0.20293842714964738);
        setDoubleElement(term4334, 1, 0.7777014737641005);
        setDoubleElement(term4334, 2, 0.7608487766891494);
        setDoubleElement(term4334, 3, 0.43619402871948965);
        setDoubleElement(term4334, 4, 0.9298129703928225);
        setDoubleElement(term4334, 5, 0.5802554803743262);
        setDoubleElement(term4334, 6, 0.43028557258073274);
        setDoubleElement(term4334, 7, 0.9806914691754327);
        setField(term4211, term4211.getClass(), "imagEigenvalues", term4334);
        setField(term4344, term4344.getClass(), "data", term4345);
        setElement(term4343, 0, term4344);
        setField(term4346, term4346.getClass(), "data", term4347);
        setElement(term4343, 1, term4346);
        setField(term4348, term4348.getClass(), "data", term4349);
        setElement(term4343, 2, term4348);
        setField(term4350, term4350.getClass(), "data", term4351);
        setElement(term4343, 3, term4350);
        setField(term4352, term4352.getClass(), "data", term4353);
        setElement(term4343, 4, term4352);
        setField(term4211, term4211.getClass(), "eigenvectors", term4343);
        setField(term4211, term4211.getClass(), "cachedV", null);
        setField(term4211, term4211.getClass(), "cachedD", null);
        setField(term4211, term4211.getClass(), "cachedVt", null);
        term4354 = new Integer(-2027534003);
        term4356 = new Integer(1063420942);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term4354;
        args[1] = term4356;
        try {
            callMethod(klass, "dqd", argTypes, term4211, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


