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

public class RealMatrixImpl_add_191184285154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term223;
     Object term297;

    public RealMatrixImpl_add_191184285154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term223 = newInstance(Class.forName("org.apache.commons.math.linear.RealMatrixImpl"));
        Object[] term224 = (Object[]) newArray("[D", 7);
        double[] term225 = (double[]) newDoubleArray(2);
        double[] term228 = (double[]) newDoubleArray(6);
        double[] term235 = (double[]) newDoubleArray(6);
        double[] term242 = (double[]) newDoubleArray(2);
        double[] term245 = (double[]) newDoubleArray(5);
        double[] term251 = (double[]) newDoubleArray(3);
        double[] term255 = (double[]) newDoubleArray(5);
        Object[] term261 = (Object[]) newArray("[D", 5);
        double[] term262 = (double[]) newDoubleArray(1);
        double[] term264 = (double[]) newDoubleArray(0);
        double[] term265 = (double[]) newDoubleArray(9);
        double[] term275 = (double[]) newDoubleArray(4);
        double[] term280 = (double[]) newDoubleArray(8);
        int[] term289 = (int[]) newIntArray(6);
        setDoubleElement(term225, 0, 0.1544348383112728);
        setDoubleElement(term225, 1, 0.5187846213101265);
        setElement(term224, 0, term225);
        setDoubleElement(term228, 0, 0.045893173090043815);
        setDoubleElement(term228, 1, 0.3626177854778667);
        setDoubleElement(term228, 2, 0.3163771663728089);
        setDoubleElement(term228, 3, 0.8819646072665548);
        setDoubleElement(term228, 4, 0.5412182593116958);
        setDoubleElement(term228, 5, 0.16988691727397487);
        setElement(term224, 1, term228);
        setDoubleElement(term235, 0, 0.39286935532362843);
        setDoubleElement(term235, 1, 0.11577948268926874);
        setDoubleElement(term235, 2, 0.5617009352394552);
        setDoubleElement(term235, 3, 0.09067063848644474);
        setDoubleElement(term235, 4, 0.268304014379393);
        setDoubleElement(term235, 5, 0.7171972879282721);
        setElement(term224, 2, term235);
        setDoubleElement(term242, 0, 0.9006361024877096);
        setDoubleElement(term242, 1, 0.5644914462415626);
        setElement(term224, 3, term242);
        setDoubleElement(term245, 0, 0.509895859167191);
        setDoubleElement(term245, 1, 0.07417792024383196);
        setDoubleElement(term245, 2, 0.686293604788188);
        setDoubleElement(term245, 3, 0.12764449157430724);
        setDoubleElement(term245, 4, 0.39446728256884744);
        setElement(term224, 4, term245);
        setDoubleElement(term251, 0, 0.7865909711092062);
        setDoubleElement(term251, 1, 0.06587158449170749);
        setDoubleElement(term251, 2, 0.0865998004187658);
        setElement(term224, 5, term251);
        setDoubleElement(term255, 0, 0.9628647861255637);
        setDoubleElement(term255, 1, 0.623231822150205);
        setDoubleElement(term255, 2, 0.09037487793444521);
        setDoubleElement(term255, 3, 0.6561919196821765);
        setDoubleElement(term255, 4, 0.7330178886612495);
        setElement(term224, 6, term255);
        setField(term223, term223.getClass(), "data", term224);
        setDoubleElement(term262, 0, 0.7618164754425794);
        setElement(term261, 0, term262);
        setElement(term261, 1, term264);
        setDoubleElement(term265, 0, 0.7385589312559342);
        setDoubleElement(term265, 1, 0.7080134263823477);
        setDoubleElement(term265, 2, 0.6059734092898602);
        setDoubleElement(term265, 3, 0.3074693824288357);
        setDoubleElement(term265, 4, 0.1245258965512791);
        setDoubleElement(term265, 5, 0.9511861072660375);
        setDoubleElement(term265, 6, 0.05880719443135807);
        setDoubleElement(term265, 7, 0.34010089048558567);
        setDoubleElement(term265, 8, 0.19625398866403143);
        setElement(term261, 2, term265);
        setDoubleElement(term275, 0, 0.45069204793711093);
        setDoubleElement(term275, 1, 0.9341364461850963);
        setDoubleElement(term275, 2, 0.9022041121474429);
        setDoubleElement(term275, 3, 0.6512870939318848);
        setElement(term261, 3, term275);
        setDoubleElement(term280, 0, 0.8777038609128434);
        setDoubleElement(term280, 1, 0.008025683154629148);
        setDoubleElement(term280, 2, 0.40598298281353484);
        setDoubleElement(term280, 3, 0.3710067290060264);
        setDoubleElement(term280, 4, 0.7818620200430967);
        setDoubleElement(term280, 5, 0.04640022995603543);
        setDoubleElement(term280, 6, 0.9123572866833729);
        setDoubleElement(term280, 7, 0.40635376375558196);
        setElement(term261, 4, term280);
        setField(term223, term223.getClass(), "lu", term261);
        setIntElement(term289, 0, -2038273078);
        setIntElement(term289, 1, 1227103734);
        setIntElement(term289, 2, -1339778481);
        setIntElement(term289, 3, 1725571209);
        setIntElement(term289, 4, -522618178);
        setIntElement(term289, 5, 1134449235);
        setField(term223, term223.getClass(), "permutation", term289);
        setIntField(term223, term223.getClass(), "parity", 1);
        term297 = newInstance(Class.forName("org.apache.commons.math.linear.RealMatrixImpl"));
        Object[] term298 = (Object[]) newArray("[D", 2);
        double[] term299 = (double[]) newDoubleArray(8);
        double[] term308 = (double[]) newDoubleArray(3);
        Object[] term312 = (Object[]) newArray("[D", 6);
        double[] term313 = (double[]) newDoubleArray(8);
        double[] term322 = (double[]) newDoubleArray(9);
        double[] term332 = (double[]) newDoubleArray(7);
        double[] term340 = (double[]) newDoubleArray(3);
        double[] term344 = (double[]) newDoubleArray(4);
        double[] term349 = (double[]) newDoubleArray(2);
        int[] term352 = (int[]) newIntArray(5);
        setDoubleElement(term299, 0, 0.4772043271031934);
        setDoubleElement(term299, 1, 0.2446504549754045);
        setDoubleElement(term299, 2, 0.6142723998707854);
        setDoubleElement(term299, 3, 0.4355627280318103);
        setDoubleElement(term299, 4, 0.841460835734741);
        setDoubleElement(term299, 5, 0.7859316615744082);
        setDoubleElement(term299, 6, 0.6428742553484879);
        setDoubleElement(term299, 7, 0.6584165706677267);
        setElement(term298, 0, term299);
        setDoubleElement(term308, 0, 0.44268490778872205);
        setDoubleElement(term308, 1, 0.7507333108648018);
        setDoubleElement(term308, 2, 0.007493740494434409);
        setElement(term298, 1, term308);
        setField(term297, term297.getClass(), "data", term298);
        setDoubleElement(term313, 0, 0.29172553321356776);
        setDoubleElement(term313, 1, 0.9276995636844321);
        setDoubleElement(term313, 2, 0.7636130748477434);
        setDoubleElement(term313, 3, 0.07901636960861558);
        setDoubleElement(term313, 4, 0.18717846301066243);
        setDoubleElement(term313, 5, 0.5335953039331021);
        setDoubleElement(term313, 6, 0.5725602309856443);
        setDoubleElement(term313, 7, 0.5310967137636303);
        setElement(term312, 0, term313);
        setDoubleElement(term322, 0, 0.6054109236809134);
        setDoubleElement(term322, 1, 0.9165240441138934);
        setDoubleElement(term322, 2, 0.22227423914231126);
        setDoubleElement(term322, 3, 0.06480976831423468);
        setDoubleElement(term322, 4, 0.8490790645379176);
        setDoubleElement(term322, 5, 0.23129126164078717);
        setDoubleElement(term322, 6, 0.6047138318674447);
        setDoubleElement(term322, 7, 0.5597136413549945);
        setDoubleElement(term322, 8, 0.28292420012823627);
        setElement(term312, 1, term322);
        setDoubleElement(term332, 0, 0.5407563152320285);
        setDoubleElement(term332, 1, 0.9485929668765458);
        setDoubleElement(term332, 2, 0.5179319342588155);
        setDoubleElement(term332, 3, 0.25025774487844066);
        setDoubleElement(term332, 4, 0.1858089882752998);
        setDoubleElement(term332, 5, 0.2440697646709713);
        setDoubleElement(term332, 6, 0.7977455176064363);
        setElement(term312, 2, term332);
        setDoubleElement(term340, 0, 0.5329919447422633);
        setDoubleElement(term340, 1, 0.7046974927834232);
        setDoubleElement(term340, 2, 0.6896952303224777);
        setElement(term312, 3, term340);
        setDoubleElement(term344, 0, 0.6693176553622628);
        setDoubleElement(term344, 1, 0.2962868255626906);
        setDoubleElement(term344, 2, 0.25474180574060834);
        setDoubleElement(term344, 3, 0.9957585718901875);
        setElement(term312, 4, term344);
        setDoubleElement(term349, 0, 0.16755811343784477);
        setDoubleElement(term349, 1, 0.9090793968999221);
        setElement(term312, 5, term349);
        setField(term297, term297.getClass(), "lu", term312);
        setIntElement(term352, 0, -883034806);
        setIntElement(term352, 1, 1585847225);
        setIntElement(term352, 2, 597278769);
        setIntElement(term352, 3, -1685132342);
        setIntElement(term352, 4, -1456670397);
        setField(term297, term297.getClass(), "permutation", term352);
        setIntField(term297, term297.getClass(), "parity", 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.RealMatrixImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.linear.RealMatrixImpl");
        Object[] args = new Object[1];
        args[0] = term297;
        try {
            callMethod(klass, "add", argTypes, term223, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


