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
import java.lang.OutOfMemoryError;
import static org.apache.commons.math3.analysis.differentiation.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class DSCompiler_log10_181194923096 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15218;
     Object term15318;
     Object term15324;
     Object term15326;
     Object term15331;

    public DSCompiler_log10_181194923096() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15218 = newInstance(Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        Object[] term15221 = (Object[]) newArray("[I", 6);
        int[] term15222 = (int[]) newIntArray(3);
        int[] term15226 = (int[]) newIntArray(6);
        int[] term15233 = (int[]) newIntArray(0);
        int[] term15234 = (int[]) newIntArray(8);
        int[] term15243 = (int[]) newIntArray(7);
        int[] term15251 = (int[]) newIntArray(5);
        Object[] term15257 = (Object[]) newArray("[I", 5);
        int[] term15258 = (int[]) newIntArray(6);
        int[] term15265 = (int[]) newIntArray(7);
        int[] term15273 = (int[]) newIntArray(2);
        int[] term15276 = (int[]) newIntArray(3);
        int[] term15280 = (int[]) newIntArray(0);
        int[] term15281 = (int[]) newIntArray(7);
        Object[] term15289 = (Object[]) newArray("[[I", 1);
        Object[] term15290 = (Object[]) newArray("[I", 7);
        int[] term15291 = (int[]) newIntArray(6);
        int[] term15298 = (int[]) newIntArray(5);
        int[] term15304 = (int[]) newIntArray(2);
        int[] term15307 = (int[]) newIntArray(4);
        int[] term15312 = (int[]) newIntArray(0);
        int[] term15313 = (int[]) newIntArray(0);
        int[] term15314 = (int[]) newIntArray(1);
        Object[] term15316 = (Object[]) newArray("[[I", 1);
        Object[] term15317 = (Object[]) newArray("[I", 0);
        setIntField(term15218, term15218.getClass(), "parameters", 1174830017);
        setIntField(term15218, term15218.getClass(), "order", 2140219446);
        setIntElement(term15222, 0, -417525632);
        setIntElement(term15222, 1, 1228187048);
        setIntElement(term15222, 2, -809028643);
        setElement(term15221, 0, term15222);
        setIntElement(term15226, 0, -1322926388);
        setIntElement(term15226, 1, 701619360);
        setIntElement(term15226, 2, 930820216);
        setIntElement(term15226, 3, -1573368178);
        setIntElement(term15226, 4, -1007994686);
        setIntElement(term15226, 5, -849828336);
        setElement(term15221, 1, term15226);
        setElement(term15221, 2, term15233);
        setIntElement(term15234, 0, 184687223);
        setIntElement(term15234, 1, 1768023420);
        setIntElement(term15234, 2, -409163006);
        setIntElement(term15234, 3, 1632107117);
        setIntElement(term15234, 4, -351038803);
        setIntElement(term15234, 5, 1899735308);
        setIntElement(term15234, 6, -1204343453);
        setIntElement(term15234, 7, 1796650051);
        setElement(term15221, 3, term15234);
        setIntElement(term15243, 0, -1736291750);
        setIntElement(term15243, 1, 490095898);
        setIntElement(term15243, 2, -2115800242);
        setIntElement(term15243, 3, 518344933);
        setIntElement(term15243, 4, -168855495);
        setIntElement(term15243, 5, -810951451);
        setIntElement(term15243, 6, -347223388);
        setElement(term15221, 4, term15243);
        setIntElement(term15251, 0, -1473884288);
        setIntElement(term15251, 1, 995576841);
        setIntElement(term15251, 2, 35377738);
        setIntElement(term15251, 3, -1203460897);
        setIntElement(term15251, 4, 461696366);
        setElement(term15221, 5, term15251);
        setField(term15218, term15218.getClass(), "sizes", term15221);
        setIntElement(term15258, 0, -1208838584);
        setIntElement(term15258, 1, 800934965);
        setIntElement(term15258, 2, -648802697);
        setIntElement(term15258, 3, -1853172793);
        setIntElement(term15258, 4, 1629792321);
        setIntElement(term15258, 5, 1671901268);
        setElement(term15257, 0, term15258);
        setIntElement(term15265, 0, 664189062);
        setIntElement(term15265, 1, 142248510);
        setIntElement(term15265, 2, -216485815);
        setIntElement(term15265, 3, -2089843700);
        setIntElement(term15265, 4, 1415280814);
        setIntElement(term15265, 5, -1126317271);
        setIntElement(term15265, 6, -131983803);
        setElement(term15257, 1, term15265);
        setIntElement(term15273, 0, -939562832);
        setIntElement(term15273, 1, 885547834);
        setElement(term15257, 2, term15273);
        setIntElement(term15276, 0, 950260961);
        setIntElement(term15276, 1, 1260887150);
        setIntElement(term15276, 2, -1320147216);
        setElement(term15257, 3, term15276);
        setElement(term15257, 4, term15280);
        setField(term15218, term15218.getClass(), "derivativesIndirection", term15257);
        setIntElement(term15281, 0, -2003639421);
        setIntElement(term15281, 1, -1986137013);
        setIntElement(term15281, 2, 1067010136);
        setIntElement(term15281, 3, 1093205391);
        setIntElement(term15281, 4, 712406676);
        setIntElement(term15281, 5, -689175370);
        setIntElement(term15281, 6, 1928157231);
        setField(term15218, term15218.getClass(), "lowerIndirection", term15281);
        setIntElement(term15291, 0, -2074171560);
        setIntElement(term15291, 1, -1484133359);
        setIntElement(term15291, 2, -221900568);
        setIntElement(term15291, 3, -660551612);
        setIntElement(term15291, 4, -1263481774);
        setIntElement(term15291, 5, 304959828);
        setElement(term15290, 0, term15291);
        setIntElement(term15298, 0, -398737037);
        setIntElement(term15298, 1, 108801223);
        setIntElement(term15298, 2, 1181798962);
        setIntElement(term15298, 3, 1950935768);
        setIntElement(term15298, 4, -733715380);
        setElement(term15290, 1, term15298);
        setIntElement(term15304, 0, 1537598422);
        setIntElement(term15304, 1, 2011217936);
        setElement(term15290, 2, term15304);
        setIntElement(term15307, 0, 490201050);
        setIntElement(term15307, 1, 1544509853);
        setIntElement(term15307, 2, -837360714);
        setIntElement(term15307, 3, -605017762);
        setElement(term15290, 3, term15307);
        setElement(term15290, 4, term15312);
        setElement(term15290, 5, term15313);
        setIntElement(term15314, 0, -1606452163);
        setElement(term15290, 6, term15314);
        setElement(term15289, 0, term15290);
        setField(term15218, term15218.getClass(), "multIndirection", term15289);
        setElement(term15316, 0, term15317);
        setField(term15218, term15218.getClass(), "compIndirection", term15316);
        term15318 = (double[]) newDoubleArray(5);
        setDoubleElement(term15318, 0, 0.6037093070161561);
        setDoubleElement(term15318, 1, 0.48050706663913145);
        setDoubleElement(term15318, 2, 0.4990217874180345);
        setDoubleElement(term15318, 3, 0.22767631814145395);
        setDoubleElement(term15318, 4, 0.4630082575704827);
        term15324 = new Integer(-1590822439);
        term15326 = (double[]) newDoubleArray(4);
        setDoubleElement(term15326, 0, 0.8732511635701926);
        setDoubleElement(term15326, 1, 0.8977760608415547);
        setDoubleElement(term15326, 2, 0.3107086749915061);
        setDoubleElement(term15326, 3, 0.18330246984174836);
        term15331 = new Integer(-141055649);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = Array.newInstance(double.class, 0).getClass();
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = term15318;
        args[1] = term15324;
        args[2] = term15326;
        args[3] = term15331;
        try {
            callMethod(klass, "log10", argTypes, term15218, args);
            assertTrue(false);
        }
        catch (OutOfMemoryError e) {
        }

    }

};


