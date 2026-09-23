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
import org.apache.commons.math.linear.MatrixIndexException;
import static org.apache.commons.math.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class RealMatrixImpl_getSubMatrix_179047675866 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1848;
     Object term1904;
     Object term1913;

    public RealMatrixImpl_getSubMatrix_179047675866() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1848 = newInstance(Class.forName("org.apache.commons.math.linear.RealMatrixImpl"));
        Object[] term1849 = (Object[]) newArray("[D", 0);
        Object[] term1850 = (Object[]) newArray("[D", 9);
        double[] term1851 = (double[]) newDoubleArray(2);
        double[] term1854 = (double[]) newDoubleArray(9);
        double[] term1864 = (double[]) newDoubleArray(7);
        double[] term1872 = (double[]) newDoubleArray(0);
        double[] term1873 = (double[]) newDoubleArray(0);
        double[] term1874 = (double[]) newDoubleArray(7);
        double[] term1882 = (double[]) newDoubleArray(3);
        double[] term1886 = (double[]) newDoubleArray(6);
        double[] term1893 = (double[]) newDoubleArray(6);
        int[] term1900 = (int[]) newIntArray(2);
        setField(term1848, term1848.getClass(), "data", term1849);
        setDoubleElement(term1851, 0, 0.989587731021552);
        setDoubleElement(term1851, 1, 0.7437704061893722);
        setElement(term1850, 0, term1851);
        setDoubleElement(term1854, 0, 0.8101332136663211);
        setDoubleElement(term1854, 1, 0.4183851447671385);
        setDoubleElement(term1854, 2, 0.1530493698346701);
        setDoubleElement(term1854, 3, 0.4358033545982626);
        setDoubleElement(term1854, 4, 0.6157985985337833);
        setDoubleElement(term1854, 5, 0.5597408162966153);
        setDoubleElement(term1854, 6, 0.41169015583506396);
        setDoubleElement(term1854, 7, 0.7573851506992271);
        setDoubleElement(term1854, 8, 0.20772463054672885);
        setElement(term1850, 1, term1854);
        setDoubleElement(term1864, 0, 0.8809303317546562);
        setDoubleElement(term1864, 1, 0.1618147788159342);
        setDoubleElement(term1864, 2, 0.406335810791266);
        setDoubleElement(term1864, 3, 0.9329152993716182);
        setDoubleElement(term1864, 4, 0.19249622994976234);
        setDoubleElement(term1864, 5, 0.05354858372784854);
        setDoubleElement(term1864, 6, 0.7450220526761285);
        setElement(term1850, 2, term1864);
        setElement(term1850, 3, term1872);
        setElement(term1850, 4, term1873);
        setDoubleElement(term1874, 0, 0.559634969030494);
        setDoubleElement(term1874, 1, 0.41495700567487526);
        setDoubleElement(term1874, 2, 0.19574188145979576);
        setDoubleElement(term1874, 3, 0.8076260805596375);
        setDoubleElement(term1874, 4, 0.08630361157958077);
        setDoubleElement(term1874, 5, 0.22217511003992507);
        setDoubleElement(term1874, 6, 0.16960229618566558);
        setElement(term1850, 5, term1874);
        setDoubleElement(term1882, 0, 0.5681156724199693);
        setDoubleElement(term1882, 1, 0.31903537908513446);
        setDoubleElement(term1882, 2, 0.11933076829589284);
        setElement(term1850, 6, term1882);
        setDoubleElement(term1886, 0, 0.2662471534242947);
        setDoubleElement(term1886, 1, 0.9546635450423915);
        setDoubleElement(term1886, 2, 0.7370162765709182);
        setDoubleElement(term1886, 3, 0.6116597961418871);
        setDoubleElement(term1886, 4, 0.6104375911286808);
        setDoubleElement(term1886, 5, 0.5386474507958124);
        setElement(term1850, 7, term1886);
        setDoubleElement(term1893, 0, 0.1151115055344808);
        setDoubleElement(term1893, 1, 0.3906217058116741);
        setDoubleElement(term1893, 2, 0.7360768052849543);
        setDoubleElement(term1893, 3, 0.1749946990463458);
        setDoubleElement(term1893, 4, 0.4795388086922092);
        setDoubleElement(term1893, 5, 0.14092209049948845);
        setElement(term1850, 8, term1893);
        setField(term1848, term1848.getClass(), "lu", term1850);
        setIntElement(term1900, 0, 335112684);
        setIntElement(term1900, 1, 1551099402);
        setField(term1848, term1848.getClass(), "permutation", term1900);
        setIntField(term1848, term1848.getClass(), "parity", 1);
        term1904 = (int[]) newIntArray(8);
        setIntElement(term1904, 0, -2027534003);
        setIntElement(term1904, 1, 1063420942);
        setIntElement(term1904, 2, 1375330971);
        setIntElement(term1904, 3, -478195677);
        setIntElement(term1904, 4, 972867650);
        setIntElement(term1904, 5, 1655935355);
        setIntElement(term1904, 6, -481533957);
        setIntElement(term1904, 7, 1240914516);
        term1913 = (int[]) newIntArray(8);
        setIntElement(term1913, 0, -1465035361);
        setIntElement(term1913, 1, 1090617576);
        setIntElement(term1913, 2, -1547384488);
        setIntElement(term1913, 3, 1442160736);
        setIntElement(term1913, 4, 1114000454);
        setIntElement(term1913, 5, -556405712);
        setIntElement(term1913, 6, -1772434990);
        setIntElement(term1913, 7, -1845499264);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.RealMatrixImpl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term1904;
        args[1] = term1913;
        try {
            callMethod(klass, "getSubMatrix", argTypes, term1848, args);
            assertTrue(false);
        }
        catch (MatrixIndexException e) {
        }

    }

};


