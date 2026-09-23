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

public class SingularValueDecompositionImpl_getSolver_1804940021153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term123140;

    public SingularValueDecompositionImpl_getSolver_1804940021153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term123140 = newInstance(Class.forName("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        double[] term84688 = (double[]) newDoubleArray(256);
        Object term123248 = newInstance(Class.forName("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        Object term123350 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setDoubleElement(term84688, 0, -8.6468936923653079E18);
        setDoubleElement(term84688, 115, 1.18909986420031488E18);
        setDoubleElement(term84688, 116, -9.223372036854776E18);
        setDoubleElement(term84688, 117, -9.0789753601061868E18);
        setDoubleElement(term84688, 118, -4.5888106446517699E18);
        setDoubleElement(term84688, 119, -8.6446594847376671E18);
        setDoubleElement(term84688, 120, -6.3229294755163668E18);
        setDoubleElement(term84688, 121, -3.4542519612101688E18);
        setDoubleElement(term84688, 123, -9.2222444876804915E18);
        setDoubleElement(term84688, 124, -9.2231911459842908E18);
        setDoubleElement(term84688, 125, -4.6071824188000174E18);
        setDoubleElement(term84688, 126, -9.0791073151975424E18);
        setDoubleElement(term84688, 127, -9.2233631583515116E18);
        setDoubleElement(term84688, 128, -9.0792420053518909E18);
        setDoubleElement(term84688, 129, -2.25605050657931264E18);
        setDoubleElement(term84688, 130, -9.2233588238243441E18);
        setDoubleElement(term84688, 131, -1.81475615890153626E18);
        setDoubleElement(term84688, 132, -8.5522653236323942E18);
        setDoubleElement(term84688, 133, -2.29224862214782976E18);
        setDoubleElement(term84688, 134, -4.6066194688465961E18);
        setDoubleElement(term84688, 135, -3.9360658099729859E18);
        setDoubleElement(term84688, 136, -7.8812992925197926E17);
        setDoubleElement(term84688, 137, -2.26958548740013414E18);
        setDoubleElement(term84688, 138, -8.3541773087722701E18);
        setDoubleElement(term84688, 139, -2.30111508384735386E18);
        setDoubleElement(term84688, 140, -8.7527308671991153E18);
        setDoubleElement(term84688, 141, -1.36455051922766592E18);
        setDoubleElement(term84688, 142, -2.3035912094000087E18);
        setDoubleElement(term84688, 143, -2.28328473099342976E18);
        setDoubleElement(term84688, 144, -6.3365646757102879E18);
        setDoubleElement(term84688, 145, -9.2228101864129823E18);
        setDoubleElement(term84688, 147, -1.04933871317732557E18);
        setDoubleElement(term84688, 148, -6.8182739136932741E18);
        setDoubleElement(term84688, 149, -2.25615385329034854E18);
        setDoubleElement(term84688, 150, -8.6469112845513523E18);
        setDoubleElement(term84688, 151, -9.2177425373205627E18);
        setDoubleElement(term84688, 152, -5.7598873196161925E18);
        setDoubleElement(term84688, 154, -4.5800155990602465E18);
        setDoubleElement(term84688, 155, -2.29183100484594074E18);
        setDoubleElement(term84688, 156, -6.890369056723287E17);
        setDoubleElement(term84688, 157, -4.503599627370488E15);
        setDoubleElement(term84688, 158, 9.219149912204116E18);
        setDoubleElement(term84688, 159, -6.9174938429334487E18);
        setDoubleElement(term84688, 160, -9.1473163160450499E18);
        setDoubleElement(term84688, 161, -9.2208766736261284E18);
        setDoubleElement(term84688, 162, -2.29674784874927104E18);
        setDoubleElement(term84688, 163, -4.503599627370496E15);
        setDoubleElement(term84688, 164, -9.2163892619794033E18);
        setDoubleElement(term84688, 165, -9.2221950030805729E18);
        setDoubleElement(term84688, 166, -8.6411429544060518E17);
        setDoubleElement(term84688, 167, -2.16151671490530509E18);
        setDoubleElement(term84688, 168, -4.503599627370495E15);
        setDoubleElement(term84688, 169, -1.125899906842624E17);
        setDoubleElement(term84688, 170, -2.29669273600838861E18);
        setDoubleElement(term84688, 171, -5.764566839296852E18);
        setDoubleElement(term84688, 172, -2.01520464498850765E18);
        setDoubleElement(term84688, 173, -3.0556725520692675E18);
        setDoubleElement(term84688, 174, -8.6423606808018944E18);
        setDoubleElement(term84688, 175, -9.1557586687911526E18);
        setDoubleElement(term84688, 177, -2.8147360232112128E18);
        setDoubleElement(term84688, 178, -4.349092842161681E15);
        setDoubleElement(term84688, 179, -9.9529489273113139E17);
        setDoubleElement(term84688, 180, -6.6151808897080361E18);
        setDoubleElement(term84688, 181, -9.2206935878748078E18);
        setDoubleElement(term84688, 182, -6.8043707966997074E18);
        setDoubleElement(term84688, 183, -1.7068586875516352E18);
        setDoubleElement(term84688, 184, -9.2233545566316646E18);
        setDoubleElement(term84688, 185, -9.2115495380771144E18);
        setDoubleElement(term84688, 186, -2.22925978236616704E18);
        setDoubleElement(term84688, 187, -1.78750681638631936E18);
        setDoubleElement(term84688, 188, -2.24726101492183859E18);
        setDoubleElement(term84688, 189, -3.4542245998420188E18);
        setDoubleElement(term84688, 191, -6.3049322617414615E18);
        setDoubleElement(term84688, 192, -9.2051687713893253E18);
        setDoubleElement(term84688, 193, -4.3234418406897746E18);
        setDoubleElement(term84688, 194, -2.30101697486860493E18);
        setDoubleElement(term84688, 195, -2.7550770720439009E18);
        setDoubleElement(term84688, 196, -4.5755329677325655E18);
        setDoubleElement(term84688, 199, 9.2189476313576346E18);
        setDoubleElement(term84688, 201, 9.2211202370410906E18);
        setDoubleElement(term84688, 203, -2.097288701003281E15);
        setDoubleElement(term84688, 204, -6.4491546663945503E18);
        setDoubleElement(term84688, 206, -9.2142230006000517E18);
        setDoubleElement(term84688, 207, 9.2188778432057836E18);
        setDoubleElement(term84688, 208, 9.2212249652237435E18);
        setDoubleElement(term84688, 209, -1.15179560470000435E18);
        setDoubleElement(term84688, 210, -9.1780545574806487E18);
        setDoubleElement(term84688, 212, -6.8948570721445478E18);
        setDoubleElement(term84688, 213, -4.503599627370544E15);
        setDoubleElement(term84688, 214, -3.641582511194112E15);
        setDoubleElement(term84688, 215, 9.219431318394238E18);
        setDoubleElement(term84688, 216, 9.2233720368211886E18);
        setDoubleElement(term84688, 217, -9.1873432398358118E18);
        setDoubleElement(term84688, 218, -6.9355434261505638E18);
        setDoubleElement(term84688, 219, -4.503599627370496E15);
        setDoubleElement(term84688, 221, -9.218867886393131E18);
        setDoubleElement(term84688, 222, -4.6161896180547584E18);
        setDoubleElement(term84688, 223, -2.30133940958632346E18);
        setDoubleElement(term84688, 224, -2.30126847325842816E18);
        setDoubleElement(term84688, 225, -5.1611251729665884E18);
        setDoubleElement(term84688, 226, -9.2188684365563167E18);
        setDoubleElement(term84688, 227, -9.2143516187636388E18);
        setDoubleElement(term84688, 228, -4.503462188417024E15);
        setDoubleElement(term84688, 229, 9.2190097342862459E18);
        setDoubleElement(term84688, 230, -8.6018752882776474E17);
        setDoubleElement(term84688, 231, -9.0792430966973266E18);
        setDoubleElement(term84688, 232, -9.0786938988254986E18);
        setDoubleElement(term84688, 233, -9.1648234549925642E18);
        setDoubleElement(term84688, 234, -9.2132301228094116E18);
        setDoubleElement(term84688, 235, -8.734520371052544E15);
        setDoubleElement(term84688, 236, -9.1873432398358118E18);
        setDoubleElement(term84688, 237, -5.5573051451859272E18);
        setDoubleElement(term84688, 238, -9.1513111275047485E18);
        setDoubleElement(term84688, 239, -2.30132511593516237E18);
        setDoubleElement(term84688, 240, -2.16142873035276288E18);
        setDoubleElement(term84688, 242, -4.1431739605293466E17);
        setDoubleElement(term84688, 244, -2.15718903713837875E18);
        setDoubleElement(term84688, 245, -3.7242612226363228E18);
        setDoubleElement(term84688, 247, -6.6923424452630129E18);
        setDoubleElement(term84688, 248, -2.660814784036699E15);
        setDoubleElement(term84688, 249, -9.2233533107970908E18);
        setDoubleElement(term84688, 250, -4.6026788191726469E18);
        setDoubleElement(term84688, 251, -4.499199299158016E15);
        setDoubleElement(term84688, 252, 9.2188684384361574E18);
        setDoubleElement(term84688, 253, -4.349644372967424E15);
        setDoubleElement(term84688, 254, -5.6518767947273994E18);
        setDoubleElement(term84688, 255, -2.16172782113783808E18);
        setField(term123140, term123140.getClass(), "singularValues", term84688);
        setField(term123140, term123140.getClass(), "cachedUt", term123248);
        setField(term123140, term123140.getClass(), "cachedV", term123350);
        setIntField(term123140, term123140.getClass(), "m", -2146426880);
        setIntField(term123140, term123140.getClass(), "n", 131105);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.SingularValueDecompositionImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getSolver", argTypes, term123140, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


