package org.apache.commons.math3.analysis.differentiation;

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
import static org.apache.commons.math3.analysis.differentiation.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class DSCompiler_taylor_1220410903111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22593;
     Object term22707;
     Object term22712;
     Object term22714;

    public DSCompiler_taylor_1220410903111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22593 = newInstance(Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        Object[] term22596 = (Object[]) newArray("[I", 9);
        int[] term22597 = (int[]) newIntArray(1);
        int[] term22599 = (int[]) newIntArray(3);
        int[] term22603 = (int[]) newIntArray(0);
        int[] term22604 = (int[]) newIntArray(0);
        int[] term22605 = (int[]) newIntArray(9);
        int[] term22615 = (int[]) newIntArray(6);
        int[] term22622 = (int[]) newIntArray(1);
        int[] term22624 = (int[]) newIntArray(4);
        int[] term22629 = (int[]) newIntArray(3);
        Object[] term22633 = (Object[]) newArray("[I", 9);
        int[] term22634 = (int[]) newIntArray(2);
        int[] term22637 = (int[]) newIntArray(0);
        int[] term22638 = (int[]) newIntArray(4);
        int[] term22643 = (int[]) newIntArray(8);
        int[] term22652 = (int[]) newIntArray(7);
        int[] term22660 = (int[]) newIntArray(1);
        int[] term22662 = (int[]) newIntArray(7);
        int[] term22670 = (int[]) newIntArray(4);
        int[] term22675 = (int[]) newIntArray(4);
        int[] term22680 = (int[]) newIntArray(8);
        Object[] term22689 = (Object[]) newArray("[[I", 0);
        Object[] term22690 = (Object[]) newArray("[[I", 1);
        Object[] term22691 = (Object[]) newArray("[I", 4);
        int[] term22692 = (int[]) newIntArray(7);
        int[] term22700 = (int[]) newIntArray(0);
        int[] term22701 = (int[]) newIntArray(2);
        int[] term22704 = (int[]) newIntArray(2);
        setIntField(term22593, term22593.getClass(), "parameters", -1168985350);
        setIntField(term22593, term22593.getClass(), "order", 736504530);
        setIntElement(term22597, 0, -1151578095);
        setElement(term22596, 0, term22597);
        setIntElement(term22599, 0, -666674757);
        setIntElement(term22599, 1, -618304525);
        setIntElement(term22599, 2, 1975532031);
        setElement(term22596, 1, term22599);
        setElement(term22596, 2, term22603);
        setElement(term22596, 3, term22604);
        setIntElement(term22605, 0, -1548999687);
        setIntElement(term22605, 1, 1593514066);
        setIntElement(term22605, 2, 1329551874);
        setIntElement(term22605, 3, -378332024);
        setIntElement(term22605, 4, 77686011);
        setIntElement(term22605, 5, 132651471);
        setIntElement(term22605, 6, 1315153287);
        setIntElement(term22605, 7, 760555251);
        setIntElement(term22605, 8, -706677210);
        setElement(term22596, 4, term22605);
        setIntElement(term22615, 0, -468204040);
        setIntElement(term22615, 1, -1236041569);
        setIntElement(term22615, 2, -1932056684);
        setIntElement(term22615, 3, -1418002835);
        setIntElement(term22615, 4, -1020428732);
        setIntElement(term22615, 5, -1341267836);
        setElement(term22596, 5, term22615);
        setIntElement(term22622, 0, 895888926);
        setElement(term22596, 6, term22622);
        setIntElement(term22624, 0, -808723798);
        setIntElement(term22624, 1, -448183926);
        setIntElement(term22624, 2, -1475942094);
        setIntElement(term22624, 3, 602519677);
        setElement(term22596, 7, term22624);
        setIntElement(term22629, 0, -370431003);
        setIntElement(term22629, 1, 822630139);
        setIntElement(term22629, 2, 385347406);
        setElement(term22596, 8, term22629);
        setField(term22593, term22593.getClass(), "sizes", term22596);
        setIntElement(term22634, 0, -46704413);
        setIntElement(term22634, 1, -2137913899);
        setElement(term22633, 0, term22634);
        setElement(term22633, 1, term22637);
        setIntElement(term22638, 0, -688835502);
        setIntElement(term22638, 1, 1469264963);
        setIntElement(term22638, 2, 802302241);
        setIntElement(term22638, 3, -2086174298);
        setElement(term22633, 2, term22638);
        setIntElement(term22643, 0, -218426551);
        setIntElement(term22643, 1, -1670070098);
        setIntElement(term22643, 2, 467509047);
        setIntElement(term22643, 3, -904447748);
        setIntElement(term22643, 4, 854911566);
        setIntElement(term22643, 5, -1420033797);
        setIntElement(term22643, 6, 747673390);
        setIntElement(term22643, 7, 705588535);
        setElement(term22633, 3, term22643);
        setIntElement(term22652, 0, -2070496137);
        setIntElement(term22652, 1, -716175280);
        setIntElement(term22652, 2, 1978574372);
        setIntElement(term22652, 3, 267968248);
        setIntElement(term22652, 4, 994276530);
        setIntElement(term22652, 5, 1628085673);
        setIntElement(term22652, 6, -2024076633);
        setElement(term22633, 4, term22652);
        setIntElement(term22660, 0, -1871930908);
        setElement(term22633, 5, term22660);
        setIntElement(term22662, 0, 1529921600);
        setIntElement(term22662, 1, 1411675971);
        setIntElement(term22662, 2, 1224330822);
        setIntElement(term22662, 3, 991967399);
        setIntElement(term22662, 4, -653419421);
        setIntElement(term22662, 5, -364951490);
        setIntElement(term22662, 6, 1275653221);
        setElement(term22633, 6, term22662);
        setIntElement(term22670, 0, 221439292);
        setIntElement(term22670, 1, -1449686187);
        setIntElement(term22670, 2, -1374649219);
        setIntElement(term22670, 3, 1856279121);
        setElement(term22633, 7, term22670);
        setIntElement(term22675, 0, -407004822);
        setIntElement(term22675, 1, -1357273988);
        setIntElement(term22675, 2, -923140400);
        setIntElement(term22675, 3, -553202541);
        setElement(term22633, 8, term22675);
        setField(term22593, term22593.getClass(), "derivativesIndirection", term22633);
        setIntElement(term22680, 0, -921082991);
        setIntElement(term22680, 1, -1697647652);
        setIntElement(term22680, 2, -653540011);
        setIntElement(term22680, 3, -897305207);
        setIntElement(term22680, 4, -1682000986);
        setIntElement(term22680, 5, 417127629);
        setIntElement(term22680, 6, 891084826);
        setIntElement(term22680, 7, -1903396559);
        setField(term22593, term22593.getClass(), "lowerIndirection", term22680);
        setField(term22593, term22593.getClass(), "multIndirection", term22689);
        setIntElement(term22692, 0, -379718533);
        setIntElement(term22692, 1, 1847948269);
        setIntElement(term22692, 2, -1587620345);
        setIntElement(term22692, 3, 1594802760);
        setIntElement(term22692, 4, -737020605);
        setIntElement(term22692, 5, -1689975721);
        setIntElement(term22692, 6, -559277061);
        setElement(term22691, 0, term22692);
        setElement(term22691, 1, term22700);
        setIntElement(term22701, 0, -1559272301);
        setIntElement(term22701, 1, -695146667);
        setElement(term22691, 2, term22701);
        setIntElement(term22704, 0, 504837140);
        setIntElement(term22704, 1, 1644155444);
        setElement(term22691, 3, term22704);
        setElement(term22690, 0, term22691);
        setField(term22593, term22593.getClass(), "compIndirection", term22690);
        term22707 = (double[]) newDoubleArray(4);
        setDoubleElement(term22707, 0, 0.16734523112870836);
        setDoubleElement(term22707, 1, 0.9711083796772954);
        setDoubleElement(term22707, 2, 0.329228491476264);
        setDoubleElement(term22707, 3, 0.8664463700873805);
        term22712 = new Integer(-146974597);
        term22714 = (double[]) newDoubleArray(5);
        setDoubleElement(term22714, 0, 0.4228841212022646);
        setDoubleElement(term22714, 1, 0.9898207968242465);
        setDoubleElement(term22714, 2, 0.025396748287270232);
        setDoubleElement(term22714, 3, 0.22437750947699786);
        setDoubleElement(term22714, 4, 0.3142783864669928);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[3];
        args[0] = term22707;
        args[1] = term22712;
        args[2] = term22714;
        try {
            callMethod(klass, "taylor", argTypes, term22593, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


