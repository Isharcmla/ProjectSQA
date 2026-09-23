package org.apache.commons.math3.dfp;

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
import static org.apache.commons.math3.dfp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class Dfp_ceil_328534840 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27553;

    public Dfp_ceil_328534840() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term27640 = Class.forName((String) "org.apache.commons.math3.dfp.DfpField$RoundingMode");
        Field term27639 = ((Class) term27640).getDeclaredField((String) "ROUND_UP");
        ((Field) term27639).setAccessible(true);
        Object enum79 = ((Field) term27639).get((Object) null);
        term27553 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        int[] term27554 = (int[]) newIntArray(7);
        Object term27565 = newInstance(Class.forName("org.apache.commons.math3.dfp.DfpField"));
        Object term27567 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        int[] term27568 = (int[]) newIntArray(6);
        Object term27578 = newInstance(Class.forName("org.apache.commons.math3.dfp.DfpField"));
        Object term27580 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object term27584 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object term27588 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object[] term27592 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 2);
        Object term27593 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object term27597 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object[] term27601 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 0);
        Object[] term27602 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 5);
        Object[] term27603 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 5);
        Object[] term27604 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 4);
        Object term27605 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object[] term27612 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 1);
        Object term27613 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object term27617 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object[] term27621 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 5);
        Object[] term27622 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 2);
        Object[] term27623 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 8);
        Object[] term27624 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 2);
        setIntElement(term27554, 0, -460657407);
        setIntElement(term27554, 1, 941003590);
        setIntElement(term27554, 2, -1825624890);
        setIntElement(term27554, 3, 413214164);
        setIntElement(term27554, 4, 355911655);
        setIntElement(term27554, 5, 1811833766);
        setIntElement(term27554, 6, 735987104);
        setField(term27553, term27553.getClass(), "mant", term27554);
        setByteField(term27553, term27553.getClass(), "sign", (byte) -76);
        setIntField(term27553, term27553.getClass(), "exp", -1784072578);
        setByteField(term27553, term27553.getClass(), "nans", (byte) -122);
        setIntField(term27565, term27565.getClass(), "radixDigits", 2011764585);
        setIntElement(term27568, 0, -860680764);
        setIntElement(term27568, 1, -963198667);
        setIntElement(term27568, 2, -1007935918);
        setIntElement(term27568, 3, 1485731037);
        setIntElement(term27568, 4, 1304396087);
        setIntElement(term27568, 5, 1782600602);
        setField(term27567, term27567.getClass(), "mant", term27568);
        setByteField(term27567, term27567.getClass(), "sign", (byte) -31);
        setIntField(term27567, term27567.getClass(), "exp", -185892708);
        setByteField(term27567, term27567.getClass(), "nans", (byte) 95);
        setIntField(term27578, term27578.getClass(), "radixDigits", -203163250);
        setField(term27580, term27580.getClass(), "mant", null);
        setByteField(term27580, term27580.getClass(), "sign", (byte) 21);
        setIntField(term27580, term27580.getClass(), "exp", 2140388634);
        setByteField(term27580, term27580.getClass(), "nans", (byte) -8);
        setField(term27580, term27580.getClass(), "field", null);
        setField(term27578, term27578.getClass(), "zero", term27580);
        setField(term27578, term27578.getClass(), "one", term27580);
        setField(term27584, term27584.getClass(), "mant", null);
        setByteField(term27584, term27584.getClass(), "sign", (byte) 0);
        setIntField(term27584, term27584.getClass(), "exp", 0);
        setByteField(term27584, term27584.getClass(), "nans", (byte) 0);
        setField(term27584, term27584.getClass(), "field", null);
        setField(term27578, term27578.getClass(), "two", term27584);
        setField(term27588, term27588.getClass(), "mant", null);
        setByteField(term27588, term27588.getClass(), "sign", (byte) 0);
        setIntField(term27588, term27588.getClass(), "exp", 0);
        setByteField(term27588, term27588.getClass(), "nans", (byte) 0);
        setField(term27588, term27588.getClass(), "field", null);
        setField(term27578, term27578.getClass(), "sqr2", term27588);
        setElement(term27592, 0, term27567);
        setField(term27578, term27578.getClass(), "sqr2Split", term27592);
        setField(term27578, term27578.getClass(), "sqr2Reciprocal", term27588);
        setField(term27578, term27578.getClass(), "sqr3", term27588);
        setField(term27593, term27593.getClass(), "mant", null);
        setByteField(term27593, term27593.getClass(), "sign", (byte) 0);
        setIntField(term27593, term27593.getClass(), "exp", 0);
        setByteField(term27593, term27593.getClass(), "nans", (byte) 0);
        setField(term27593, term27593.getClass(), "field", null);
        setField(term27578, term27578.getClass(), "sqr3Reciprocal", term27593);
        setField(term27597, term27597.getClass(), "mant", null);
        setByteField(term27597, term27597.getClass(), "sign", (byte) 0);
        setIntField(term27597, term27597.getClass(), "exp", 0);
        setByteField(term27597, term27597.getClass(), "nans", (byte) 0);
        setField(term27597, term27597.getClass(), "field", null);
        setField(term27578, term27578.getClass(), "pi", term27597);
        setField(term27578, term27578.getClass(), "piSplit", term27601);
        setField(term27578, term27578.getClass(), "e", term27567);
        setElement(term27602, 0, term27584);
        setElement(term27602, 1, term27588);
        setElement(term27602, 3, term27593);
        setElement(term27602, 4, term27567);
        setField(term27578, term27578.getClass(), "eSplit", term27602);
        setField(term27578, term27578.getClass(), "ln2", term27597);
        setElement(term27603, 0, term27588);
        setElement(term27603, 1, term27567);
        setElement(term27603, 4, term27580);
        setField(term27578, term27578.getClass(), "ln2Split", term27603);
        setField(term27578, term27578.getClass(), "ln5", term27567);
        setElement(term27604, 1, term27584);
        setElement(term27604, 2, term27553);
        setElement(term27604, 3, term27593);
        setField(term27578, term27578.getClass(), "ln5Split", term27604);
        setField(term27605, term27605.getClass(), "mant", null);
        setByteField(term27605, term27605.getClass(), "sign", (byte) 0);
        setIntField(term27605, term27605.getClass(), "exp", 0);
        setByteField(term27605, term27605.getClass(), "nans", (byte) 0);
        setField(term27605, term27605.getClass(), "field", null);
        setField(term27578, term27578.getClass(), "ln10", term27605);
        setField(term27578, term27578.getClass(), "rMode", enum79);
        setIntField(term27578, term27578.getClass(), "ieeeFlags", -1271598018);
        setField(term27567, term27567.getClass(), "field", term27578);
        setField(term27565, term27565.getClass(), "zero", term27567);
        setField(term27565, term27565.getClass(), "one", term27597);
        setField(term27565, term27565.getClass(), "two", term27605);
        setField(term27565, term27565.getClass(), "sqr2", term27605);
        setField(term27613, term27613.getClass(), "mant", null);
        setByteField(term27613, term27613.getClass(), "sign", (byte) 0);
        setIntField(term27613, term27613.getClass(), "exp", 0);
        setByteField(term27613, term27613.getClass(), "nans", (byte) 0);
        setField(term27613, term27613.getClass(), "field", null);
        setElement(term27612, 0, term27613);
        setField(term27565, term27565.getClass(), "sqr2Split", term27612);
        setField(term27565, term27565.getClass(), "sqr2Reciprocal", term27580);
        setField(term27565, term27565.getClass(), "sqr3", term27588);
        setField(term27565, term27565.getClass(), "sqr3Reciprocal", term27584);
        setField(term27617, term27617.getClass(), "mant", null);
        setByteField(term27617, term27617.getClass(), "sign", (byte) 0);
        setIntField(term27617, term27617.getClass(), "exp", 0);
        setByteField(term27617, term27617.getClass(), "nans", (byte) 0);
        setField(term27617, term27617.getClass(), "field", null);
        setField(term27565, term27565.getClass(), "pi", term27617);
        setElement(term27621, 0, term27567);
        setElement(term27621, 1, term27605);
        setElement(term27621, 2, term27567);
        setElement(term27621, 3, term27613);
        setElement(term27621, 4, term27597);
        setField(term27565, term27565.getClass(), "piSplit", term27621);
        setField(term27565, term27565.getClass(), "e", term27617);
        setElement(term27622, 0, term27597);
        setElement(term27622, 1, term27584);
        setField(term27565, term27565.getClass(), "eSplit", term27622);
        setField(term27565, term27565.getClass(), "ln2", term27584);
        setElement(term27623, 0, term27593);
        setElement(term27623, 1, term27553);
        setElement(term27623, 2, term27553);
        setElement(term27623, 3, term27580);
        setElement(term27623, 4, term27567);
        setElement(term27623, 5, term27584);
        setElement(term27623, 6, term27567);
        setElement(term27623, 7, term27588);
        setField(term27565, term27565.getClass(), "ln2Split", term27623);
        setField(term27565, term27565.getClass(), "ln5", term27593);
        setElement(term27624, 0, term27588);
        setElement(term27624, 1, term27617);
        setField(term27565, term27565.getClass(), "ln5Split", term27624);
        setField(term27565, term27565.getClass(), "ln10", term27593);
        setField(term27565, term27565.getClass(), "rMode", enum79);
        setIntField(term27565, term27565.getClass(), "ieeeFlags", 157967613);
        setField(term27553, term27553.getClass(), "field", term27565);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.dfp.Dfp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "ceil", argTypes, term27553, args);
    }

};


