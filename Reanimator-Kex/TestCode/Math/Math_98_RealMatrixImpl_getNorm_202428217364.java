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

public class RealMatrixImpl_getNorm_202428217364 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1485;

    public RealMatrixImpl_getNorm_202428217364() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1485 = newInstance(Class.forName("org.apache.commons.math.linear.RealMatrixImpl"));
        Object[] term1486 = (Object[]) newArray("[D", 9);
        double[] term1487 = (double[]) newDoubleArray(5);
        double[] term1493 = (double[]) newDoubleArray(1);
        double[] term1495 = (double[]) newDoubleArray(2);
        double[] term1498 = (double[]) newDoubleArray(8);
        double[] term1507 = (double[]) newDoubleArray(1);
        double[] term1509 = (double[]) newDoubleArray(9);
        double[] term1519 = (double[]) newDoubleArray(8);
        double[] term1528 = (double[]) newDoubleArray(9);
        double[] term1538 = (double[]) newDoubleArray(7);
        Object[] term1546 = (Object[]) newArray("[D", 8);
        double[] term1547 = (double[]) newDoubleArray(9);
        double[] term1557 = (double[]) newDoubleArray(5);
        double[] term1563 = (double[]) newDoubleArray(9);
        double[] term1573 = (double[]) newDoubleArray(9);
        double[] term1583 = (double[]) newDoubleArray(6);
        double[] term1590 = (double[]) newDoubleArray(1);
        double[] term1592 = (double[]) newDoubleArray(5);
        double[] term1598 = (double[]) newDoubleArray(3);
        int[] term1602 = (int[]) newIntArray(9);
        setDoubleElement(term1487, 0, 0.5334986794148128);
        setDoubleElement(term1487, 1, 0.16182948586501322);
        setDoubleElement(term1487, 2, 0.2190694321818214);
        setDoubleElement(term1487, 3, 0.39028347452315004);
        setDoubleElement(term1487, 4, 0.9452756892252447);
        setElement(term1486, 0, term1487);
        setDoubleElement(term1493, 0, 0.7265543616081012);
        setElement(term1486, 1, term1493);
        setDoubleElement(term1495, 0, 0.8691836681752382);
        setDoubleElement(term1495, 1, 0.9553804492342851);
        setElement(term1486, 2, term1495);
        setDoubleElement(term1498, 0, 0.951497914828045);
        setDoubleElement(term1498, 1, 0.5926415532310654);
        setDoubleElement(term1498, 2, 0.011084532735115116);
        setDoubleElement(term1498, 3, 0.7815751235487547);
        setDoubleElement(term1498, 4, 0.27972598243188085);
        setDoubleElement(term1498, 5, 0.2749003034310852);
        setDoubleElement(term1498, 6, 0.6201564110803683);
        setDoubleElement(term1498, 7, 0.5283886615348917);
        setElement(term1486, 3, term1498);
        setDoubleElement(term1507, 0, 0.9679677362359832);
        setElement(term1486, 4, term1507);
        setDoubleElement(term1509, 0, 0.37830789098595463);
        setDoubleElement(term1509, 1, 0.5144161196478283);
        setDoubleElement(term1509, 2, 0.687690824750583);
        setDoubleElement(term1509, 3, 0.026755796057250425);
        setDoubleElement(term1509, 4, 0.47161396910781994);
        setDoubleElement(term1509, 5, 0.4478633017907302);
        setDoubleElement(term1509, 6, 0.7998055139571558);
        setDoubleElement(term1509, 7, 0.2980983794282903);
        setDoubleElement(term1509, 8, 0.6292619847139933);
        setElement(term1486, 5, term1509);
        setDoubleElement(term1519, 0, 0.2682123119817419);
        setDoubleElement(term1519, 1, 0.2465788293643847);
        setDoubleElement(term1519, 2, 0.9194156323780788);
        setDoubleElement(term1519, 3, 0.2589672937578553);
        setDoubleElement(term1519, 4, 0.3503400017331547);
        setDoubleElement(term1519, 5, 0.8271286757001508);
        setDoubleElement(term1519, 6, 0.6335804422604819);
        setDoubleElement(term1519, 7, 0.7981127611687099);
        setElement(term1486, 6, term1519);
        setDoubleElement(term1528, 0, 0.4279162427372558);
        setDoubleElement(term1528, 1, 0.49094002611486065);
        setDoubleElement(term1528, 2, 0.42544116787510533);
        setDoubleElement(term1528, 3, 0.4841923400566003);
        setDoubleElement(term1528, 4, 0.7630673805338225);
        setDoubleElement(term1528, 5, 0.9281656729617184);
        setDoubleElement(term1528, 6, 0.6107111302126562);
        setDoubleElement(term1528, 7, 0.682853703128826);
        setDoubleElement(term1528, 8, 0.3175549148584229);
        setElement(term1486, 7, term1528);
        setDoubleElement(term1538, 0, 0.19843723313022976);
        setDoubleElement(term1538, 1, 0.5548677303832933);
        setDoubleElement(term1538, 2, 0.1916613619544515);
        setDoubleElement(term1538, 3, 0.21883508391220008);
        setDoubleElement(term1538, 4, 0.21718677136334108);
        setDoubleElement(term1538, 5, 0.6577119694943789);
        setDoubleElement(term1538, 6, 0.5285216928887116);
        setElement(term1486, 8, term1538);
        setField(term1485, term1485.getClass(), "data", term1486);
        setDoubleElement(term1547, 0, 0.35049760295845667);
        setDoubleElement(term1547, 1, 0.7124244945678292);
        setDoubleElement(term1547, 2, 0.10349659570695524);
        setDoubleElement(term1547, 3, 0.46078217363073126);
        setDoubleElement(term1547, 4, 0.3389647053819348);
        setDoubleElement(term1547, 5, 0.2151134774049427);
        setDoubleElement(term1547, 6, 0.14703921400520792);
        setDoubleElement(term1547, 7, 0.9343367310647196);
        setDoubleElement(term1547, 8, 0.5569644096083258);
        setElement(term1546, 0, term1547);
        setDoubleElement(term1557, 0, 0.7527275444646349);
        setDoubleElement(term1557, 1, 0.38299462989514377);
        setDoubleElement(term1557, 2, 0.12164012123809098);
        setDoubleElement(term1557, 3, 0.019174439062670467);
        setDoubleElement(term1557, 4, 0.17827385312846922);
        setElement(term1546, 1, term1557);
        setDoubleElement(term1563, 0, 0.5284679973716927);
        setDoubleElement(term1563, 1, 0.5233539642461534);
        setDoubleElement(term1563, 2, 0.2065669149596887);
        setDoubleElement(term1563, 3, 0.48600687227277806);
        setDoubleElement(term1563, 4, 0.7384086133828546);
        setDoubleElement(term1563, 5, 0.9304178842125251);
        setDoubleElement(term1563, 6, 0.9233657088240451);
        setDoubleElement(term1563, 7, 0.04025609521413642);
        setDoubleElement(term1563, 8, 0.3687319853615557);
        setElement(term1546, 2, term1563);
        setDoubleElement(term1573, 0, 0.5816591160182095);
        setDoubleElement(term1573, 1, 0.264161580698845);
        setDoubleElement(term1573, 2, 0.3752345600445256);
        setDoubleElement(term1573, 3, 0.40387522930100916);
        setDoubleElement(term1573, 4, 0.036624440957556126);
        setDoubleElement(term1573, 5, 0.648613673417573);
        setDoubleElement(term1573, 6, 0.1113914162260009);
        setDoubleElement(term1573, 7, 0.47349918501511923);
        setDoubleElement(term1573, 8, 0.1241386580280961);
        setElement(term1546, 3, term1573);
        setDoubleElement(term1583, 0, 0.6672973479140587);
        setDoubleElement(term1583, 1, 0.5778160798576412);
        setDoubleElement(term1583, 2, 0.4973081192159875);
        setDoubleElement(term1583, 3, 0.8241641351050926);
        setDoubleElement(term1583, 4, 0.1746425573030902);
        setDoubleElement(term1583, 5, 0.930397671780162);
        setElement(term1546, 4, term1583);
        setDoubleElement(term1590, 0, 0.5174655391348146);
        setElement(term1546, 5, term1590);
        setDoubleElement(term1592, 0, 0.09385588267689582);
        setDoubleElement(term1592, 1, 0.6635389764920203);
        setDoubleElement(term1592, 2, 0.9118883779077857);
        setDoubleElement(term1592, 3, 0.2048432493719995);
        setDoubleElement(term1592, 4, 0.4582776614492583);
        setElement(term1546, 6, term1592);
        setDoubleElement(term1598, 0, 0.4610669841191467);
        setDoubleElement(term1598, 1, 0.9127147042970267);
        setDoubleElement(term1598, 2, 0.85834735735361);
        setElement(term1546, 7, term1598);
        setField(term1485, term1485.getClass(), "lu", term1546);
        setIntElement(term1602, 0, 97029295);
        setIntElement(term1602, 1, -1371869594);
        setIntElement(term1602, 2, -2095575670);
        setIntElement(term1602, 3, 1225272962);
        setIntElement(term1602, 4, 1324040357);
        setIntElement(term1602, 5, -1588772968);
        setIntElement(term1602, 6, -93135961);
        setIntElement(term1602, 7, -112921587);
        setIntElement(term1602, 8, 933028652);
        setField(term1485, term1485.getClass(), "permutation", term1602);
        setIntField(term1485, term1485.getClass(), "parity", 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.RealMatrixImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getNorm", argTypes, term1485, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


