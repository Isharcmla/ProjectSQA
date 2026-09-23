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

public class RealMatrixImpl_solve_142931827383 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3767;
     Object term3850;

    public RealMatrixImpl_solve_142931827383() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3767 = newInstance(Class.forName("org.apache.commons.math.linear.RealMatrixImpl"));
        Object[] term3768 = (Object[]) newArray("[D", 9);
        double[] term3769 = (double[]) newDoubleArray(6);
        double[] term3776 = (double[]) newDoubleArray(7);
        double[] term3784 = (double[]) newDoubleArray(0);
        double[] term3785 = (double[]) newDoubleArray(7);
        double[] term3793 = (double[]) newDoubleArray(1);
        double[] term3795 = (double[]) newDoubleArray(5);
        double[] term3801 = (double[]) newDoubleArray(8);
        double[] term3810 = (double[]) newDoubleArray(7);
        double[] term3818 = (double[]) newDoubleArray(8);
        Object[] term3827 = (Object[]) newArray("[D", 2);
        double[] term3828 = (double[]) newDoubleArray(8);
        double[] term3837 = (double[]) newDoubleArray(3);
        int[] term3841 = (int[]) newIntArray(7);
        setDoubleElement(term3769, 0, 0.9218672416580571);
        setDoubleElement(term3769, 1, 0.7496470784921199);
        setDoubleElement(term3769, 2, 0.9242863644075359);
        setDoubleElement(term3769, 3, 0.0973418973835607);
        setDoubleElement(term3769, 4, 0.32541509985477524);
        setDoubleElement(term3769, 5, 0.10624377997246504);
        setElement(term3768, 0, term3769);
        setDoubleElement(term3776, 0, 0.5515266472781634);
        setDoubleElement(term3776, 1, 0.920204482814009);
        setDoubleElement(term3776, 2, 0.18677602647831992);
        setDoubleElement(term3776, 3, 0.5620284908568363);
        setDoubleElement(term3776, 4, 0.4214941757931592);
        setDoubleElement(term3776, 5, 0.9009620538952149);
        setDoubleElement(term3776, 6, 0.09598300824663397);
        setElement(term3768, 1, term3776);
        setElement(term3768, 2, term3784);
        setDoubleElement(term3785, 0, 0.3488342586091009);
        setDoubleElement(term3785, 1, 0.07084009583074191);
        setDoubleElement(term3785, 2, 0.976589553034152);
        setDoubleElement(term3785, 3, 0.9091029161718786);
        setDoubleElement(term3785, 4, 0.3485608451860187);
        setDoubleElement(term3785, 5, 0.8058692746281759);
        setDoubleElement(term3785, 6, 0.09981780078534064);
        setElement(term3768, 3, term3785);
        setDoubleElement(term3793, 0, 0.7820943194486873);
        setElement(term3768, 4, term3793);
        setDoubleElement(term3795, 0, 0.26216865675155776);
        setDoubleElement(term3795, 1, 0.5086784040916195);
        setDoubleElement(term3795, 2, 0.5349035289029883);
        setDoubleElement(term3795, 3, 0.8355679479881373);
        setDoubleElement(term3795, 4, 0.13327625409903998);
        setElement(term3768, 5, term3795);
        setDoubleElement(term3801, 0, 0.46233438925988046);
        setDoubleElement(term3801, 1, 0.8952865943131467);
        setDoubleElement(term3801, 2, 0.9486485257232683);
        setDoubleElement(term3801, 3, 0.9279305067048012);
        setDoubleElement(term3801, 4, 0.8754210616005208);
        setDoubleElement(term3801, 5, 0.9982379295613013);
        setDoubleElement(term3801, 6, 0.8334584355306505);
        setDoubleElement(term3801, 7, 0.9707502413967632);
        setElement(term3768, 6, term3801);
        setDoubleElement(term3810, 0, 0.6427281333635387);
        setDoubleElement(term3810, 1, 0.03836010467767137);
        setDoubleElement(term3810, 2, 0.851312830445343);
        setDoubleElement(term3810, 3, 0.04252809268281976);
        setDoubleElement(term3810, 4, 0.8915512623583132);
        setDoubleElement(term3810, 5, 0.41480949198625816);
        setDoubleElement(term3810, 6, 0.9975368153396807);
        setElement(term3768, 7, term3810);
        setDoubleElement(term3818, 0, 0.8555074009522616);
        setDoubleElement(term3818, 1, 0.032017661073214576);
        setDoubleElement(term3818, 2, 0.7863675468675377);
        setDoubleElement(term3818, 3, 0.1038853571690046);
        setDoubleElement(term3818, 4, 0.43993390063139404);
        setDoubleElement(term3818, 5, 0.3550466083267433);
        setDoubleElement(term3818, 6, 0.5739961255724226);
        setDoubleElement(term3818, 7, 0.5858669515619307);
        setElement(term3768, 8, term3818);
        setField(term3767, term3767.getClass(), "data", term3768);
        setDoubleElement(term3828, 0, 0.699115160808336);
        setDoubleElement(term3828, 1, 0.7030001298508088);
        setDoubleElement(term3828, 2, 0.18226954599281897);
        setDoubleElement(term3828, 3, 0.9968423617165025);
        setDoubleElement(term3828, 4, 0.020102885132596948);
        setDoubleElement(term3828, 5, 0.3757739798028954);
        setDoubleElement(term3828, 6, 0.6690842886241162);
        setDoubleElement(term3828, 7, 0.24159013107052651);
        setElement(term3827, 0, term3828);
        setDoubleElement(term3837, 0, 0.36324671953515286);
        setDoubleElement(term3837, 1, 0.2290241149807456);
        setDoubleElement(term3837, 2, 0.4573043724934611);
        setElement(term3827, 1, term3837);
        setField(term3767, term3767.getClass(), "lu", term3827);
        setIntElement(term3841, 0, 1296895584);
        setIntElement(term3841, 1, 628918458);
        setIntElement(term3841, 2, -1274456137);
        setIntElement(term3841, 3, 1041916673);
        setIntElement(term3841, 4, -601863069);
        setIntElement(term3841, 5, 663292551);
        setIntElement(term3841, 6, -1885090354);
        setField(term3767, term3767.getClass(), "permutation", term3841);
        setIntField(term3767, term3767.getClass(), "parity", 1);
        term3850 = (double[]) newDoubleArray(5);
        setDoubleElement(term3850, 0, 0.5491008007248219);
        setDoubleElement(term3850, 1, 0.6962503987895765);
        setDoubleElement(term3850, 2, 0.8714203144648995);
        setDoubleElement(term3850, 3, 0.9525091173767415);
        setDoubleElement(term3850, 4, 0.2076820298271066);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.RealMatrixImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term3850;
        try {
            callMethod(klass, "solve", argTypes, term3767, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


