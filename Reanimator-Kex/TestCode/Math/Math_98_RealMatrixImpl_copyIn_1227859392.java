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

public class RealMatrixImpl_copyIn_1227859392 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4809;
     Object term4905;

    public RealMatrixImpl_copyIn_1227859392() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4809 = newInstance(Class.forName("org.apache.commons.math.linear.RealMatrixImpl"));
        Object[] term4810 = (Object[]) newArray("[D", 6);
        double[] term4811 = (double[]) newDoubleArray(0);
        double[] term4812 = (double[]) newDoubleArray(5);
        double[] term4818 = (double[]) newDoubleArray(4);
        double[] term4823 = (double[]) newDoubleArray(3);
        double[] term4827 = (double[]) newDoubleArray(5);
        double[] term4833 = (double[]) newDoubleArray(2);
        Object[] term4836 = (Object[]) newArray("[D", 9);
        double[] term4837 = (double[]) newDoubleArray(8);
        double[] term4846 = (double[]) newDoubleArray(6);
        double[] term4853 = (double[]) newDoubleArray(1);
        double[] term4855 = (double[]) newDoubleArray(0);
        double[] term4856 = (double[]) newDoubleArray(4);
        double[] term4861 = (double[]) newDoubleArray(8);
        double[] term4870 = (double[]) newDoubleArray(8);
        double[] term4879 = (double[]) newDoubleArray(8);
        double[] term4888 = (double[]) newDoubleArray(9);
        int[] term4898 = (int[]) newIntArray(5);
        setElement(term4810, 0, term4811);
        setDoubleElement(term4812, 0, 0.49165542770735404);
        setDoubleElement(term4812, 1, 0.19383156826937886);
        setDoubleElement(term4812, 2, 0.7698932357373801);
        setDoubleElement(term4812, 3, 0.02836037290408877);
        setDoubleElement(term4812, 4, 0.12142304196855824);
        setElement(term4810, 1, term4812);
        setDoubleElement(term4818, 0, 0.7559357862632843);
        setDoubleElement(term4818, 1, 0.22579605333279118);
        setDoubleElement(term4818, 2, 0.09286912577718698);
        setDoubleElement(term4818, 3, 0.2592522943455753);
        setElement(term4810, 2, term4818);
        setDoubleElement(term4823, 0, 0.29811280084680813);
        setDoubleElement(term4823, 1, 0.26589199383156603);
        setDoubleElement(term4823, 2, 0.24946956393957898);
        setElement(term4810, 3, term4823);
        setDoubleElement(term4827, 0, 0.20660269955202237);
        setDoubleElement(term4827, 1, 0.7074091088647776);
        setDoubleElement(term4827, 2, 0.7000407967210135);
        setDoubleElement(term4827, 3, 0.3724671795059947);
        setDoubleElement(term4827, 4, 0.8800802342679814);
        setElement(term4810, 4, term4827);
        setDoubleElement(term4833, 0, 0.2967811635938967);
        setDoubleElement(term4833, 1, 0.7455766528856747);
        setElement(term4810, 5, term4833);
        setField(term4809, term4809.getClass(), "data", term4810);
        setDoubleElement(term4837, 0, 0.7848284328368673);
        setDoubleElement(term4837, 1, 0.45405874014259684);
        setDoubleElement(term4837, 2, 0.8287003692505468);
        setDoubleElement(term4837, 3, 0.872183435442562);
        setDoubleElement(term4837, 4, 0.2882121702089331);
        setDoubleElement(term4837, 5, 0.33173641696480016);
        setDoubleElement(term4837, 6, 0.8178843489441128);
        setDoubleElement(term4837, 7, 0.5180057494602744);
        setElement(term4836, 0, term4837);
        setDoubleElement(term4846, 0, 0.03653451194617485);
        setDoubleElement(term4846, 1, 0.1330120006712231);
        setDoubleElement(term4846, 2, 0.6592051986007408);
        setDoubleElement(term4846, 3, 0.9029786080117671);
        setDoubleElement(term4846, 4, 0.49687206530148353);
        setDoubleElement(term4846, 5, 0.4393239742435411);
        setElement(term4836, 1, term4846);
        setDoubleElement(term4853, 0, 0.061396562031202806);
        setElement(term4836, 2, term4853);
        setElement(term4836, 3, term4855);
        setDoubleElement(term4856, 0, 0.7952410141267131);
        setDoubleElement(term4856, 1, 0.3792040313417304);
        setDoubleElement(term4856, 2, 0.4936029650695076);
        setDoubleElement(term4856, 3, 0.8580005557306133);
        setElement(term4836, 4, term4856);
        setDoubleElement(term4861, 0, 0.6226318229146778);
        setDoubleElement(term4861, 1, 0.21043841763332094);
        setDoubleElement(term4861, 2, 0.9177463037116731);
        setDoubleElement(term4861, 3, 0.5140671128103492);
        setDoubleElement(term4861, 4, 0.7636490217504489);
        setDoubleElement(term4861, 5, 0.17836343343055017);
        setDoubleElement(term4861, 6, 0.7805302796119583);
        setDoubleElement(term4861, 7, 0.5504375992148846);
        setElement(term4836, 5, term4861);
        setDoubleElement(term4870, 0, 0.20088626716870783);
        setDoubleElement(term4870, 1, 0.9776101302714891);
        setDoubleElement(term4870, 2, 0.02563505505833974);
        setDoubleElement(term4870, 3, 0.6670154414690855);
        setDoubleElement(term4870, 4, 0.9748435871404681);
        setDoubleElement(term4870, 5, 0.6524079186994814);
        setDoubleElement(term4870, 6, 0.35246320146185783);
        setDoubleElement(term4870, 7, 0.5622467882629956);
        setElement(term4836, 6, term4870);
        setDoubleElement(term4879, 0, 0.0371414195066222);
        setDoubleElement(term4879, 1, 0.8498595938632192);
        setDoubleElement(term4879, 2, 0.1316924349860824);
        setDoubleElement(term4879, 3, 0.31810411682749784);
        setDoubleElement(term4879, 4, 0.1695508466986878);
        setDoubleElement(term4879, 5, 0.472658101295364);
        setDoubleElement(term4879, 6, 0.833009199279674);
        setDoubleElement(term4879, 7, 0.748186545291172);
        setElement(term4836, 7, term4879);
        setDoubleElement(term4888, 0, 0.6088846358210241);
        setDoubleElement(term4888, 1, 0.45161257515911524);
        setDoubleElement(term4888, 2, 0.744229304833858);
        setDoubleElement(term4888, 3, 0.29112078490840676);
        setDoubleElement(term4888, 4, 0.8976777038298248);
        setDoubleElement(term4888, 5, 0.24604603567238703);
        setDoubleElement(term4888, 6, 0.4690179135770387);
        setDoubleElement(term4888, 7, 0.8722664294323148);
        setDoubleElement(term4888, 8, 0.26671699744008304);
        setElement(term4836, 8, term4888);
        setField(term4809, term4809.getClass(), "lu", term4836);
        setIntElement(term4898, 0, -75206835);
        setIntElement(term4898, 1, -1618206977);
        setIntElement(term4898, 2, -1747406163);
        setIntElement(term4898, 3, 388157121);
        setIntElement(term4898, 4, 1684998508);
        setField(term4809, term4809.getClass(), "permutation", term4898);
        setIntField(term4809, term4809.getClass(), "parity", 1);
        term4905 = (Object[]) newArray("[D", 2);
        double[] term4906 = (double[]) newDoubleArray(7);
        double[] term4914 = (double[]) newDoubleArray(8);
        setDoubleElement(term4906, 0, 0.7240732539038799);
        setDoubleElement(term4906, 1, 0.8046804592509608);
        setDoubleElement(term4906, 2, 0.6538006148276369);
        setDoubleElement(term4906, 3, 0.5478653030741516);
        setDoubleElement(term4906, 4, 0.2749618643648508);
        setDoubleElement(term4906, 5, 0.12200291174203359);
        setDoubleElement(term4906, 6, 0.7465763848976307);
        setElement(term4905, 0, term4906);
        setDoubleElement(term4914, 0, 0.21425458242008177);
        setDoubleElement(term4914, 1, 0.3622254215968558);
        setDoubleElement(term4914, 2, 0.2958780756753986);
        setDoubleElement(term4914, 3, 0.7667201074263599);
        setDoubleElement(term4914, 4, 0.649808575802068);
        setDoubleElement(term4914, 5, 0.2387925045816025);
        setDoubleElement(term4914, 6, 0.5684623038577817);
        setDoubleElement(term4914, 7, 0.5857531996955357);
        setElement(term4905, 1, term4914);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.RealMatrixImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Array.newInstance(double.class, 0).getClass(), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term4905;
        try {
            callMethod(klass, "copyIn", argTypes, term4809, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


