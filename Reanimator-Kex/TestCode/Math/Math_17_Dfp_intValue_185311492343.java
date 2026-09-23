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

public class Dfp_intValue_185311492343 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29994;

    public Dfp_intValue_185311492343() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term30090 = Class.forName((String) "org.apache.commons.math3.dfp.DfpField$RoundingMode");
        Field term30089 = ((Class) term30090).getDeclaredField((String) "ROUND_HALF_ODD");
        ((Field) term30089).setAccessible(true);
        Object enum86 = ((Field) term30089).get((Object) null);
        Class<? extends Object> term30389 = Class.forName((String) "org.apache.commons.math3.dfp.DfpField$RoundingMode");
        Field term30388 = ((Class) term30389).getDeclaredField((String) "ROUND_FLOOR");
        ((Field) term30388).setAccessible(true);
        Object enum87 = ((Field) term30388).get((Object) null);
        term29994 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        int[] term29995 = (int[]) newIntArray(3);
        Object term30002 = newInstance(Class.forName("org.apache.commons.math3.dfp.DfpField"));
        Object term30004 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        int[] term30005 = (int[]) newIntArray(7);
        Object term30016 = newInstance(Class.forName("org.apache.commons.math3.dfp.DfpField"));
        Object term30018 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object term30022 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object term30026 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object[] term30030 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 0);
        Object term30031 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object term30035 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object[] term30039 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 5);
        Object[] term30040 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 5);
        Object[] term30041 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 6);
        Object term30042 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object[] term30046 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 3);
        Object term30047 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object term30054 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object[] term30058 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 2);
        Object[] term30059 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 5);
        Object[] term30060 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 0);
        Object[] term30061 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 2);
        Object[] term30062 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 1);
        setIntElement(term29995, 0, -1320402633);
        setIntElement(term29995, 1, 919602316);
        setIntElement(term29995, 2, 1833713431);
        setField(term29994, term29994.getClass(), "mant", term29995);
        setByteField(term29994, term29994.getClass(), "sign", (byte) 15);
        setIntField(term29994, term29994.getClass(), "exp", -706222608);
        setByteField(term29994, term29994.getClass(), "nans", (byte) 38);
        setIntField(term30002, term30002.getClass(), "radixDigits", -2003607923);
        setIntElement(term30005, 0, 1378805929);
        setIntElement(term30005, 1, 695052304);
        setIntElement(term30005, 2, -179937218);
        setIntElement(term30005, 3, 940896043);
        setIntElement(term30005, 4, -1156002984);
        setIntElement(term30005, 5, 1676254730);
        setIntElement(term30005, 6, -1661200819);
        setField(term30004, term30004.getClass(), "mant", term30005);
        setByteField(term30004, term30004.getClass(), "sign", (byte) -51);
        setIntField(term30004, term30004.getClass(), "exp", -235039141);
        setByteField(term30004, term30004.getClass(), "nans", (byte) 101);
        setIntField(term30016, term30016.getClass(), "radixDigits", -1414233013);
        setField(term30018, term30018.getClass(), "mant", null);
        setByteField(term30018, term30018.getClass(), "sign", (byte) 83);
        setIntField(term30018, term30018.getClass(), "exp", -679614653);
        setByteField(term30018, term30018.getClass(), "nans", (byte) -41);
        setField(term30018, term30018.getClass(), "field", null);
        setField(term30016, term30016.getClass(), "zero", term30018);
        setField(term30022, term30022.getClass(), "mant", null);
        setByteField(term30022, term30022.getClass(), "sign", (byte) 0);
        setIntField(term30022, term30022.getClass(), "exp", 0);
        setByteField(term30022, term30022.getClass(), "nans", (byte) 0);
        setField(term30022, term30022.getClass(), "field", null);
        setField(term30016, term30016.getClass(), "one", term30022);
        setField(term30016, term30016.getClass(), "two", term30022);
        setField(term30026, term30026.getClass(), "mant", null);
        setByteField(term30026, term30026.getClass(), "sign", (byte) 0);
        setIntField(term30026, term30026.getClass(), "exp", 0);
        setByteField(term30026, term30026.getClass(), "nans", (byte) 0);
        setField(term30026, term30026.getClass(), "field", null);
        setField(term30016, term30016.getClass(), "sqr2", term30026);
        setField(term30016, term30016.getClass(), "sqr2Split", term30030);
        setField(term30031, term30031.getClass(), "mant", null);
        setByteField(term30031, term30031.getClass(), "sign", (byte) 0);
        setIntField(term30031, term30031.getClass(), "exp", 0);
        setByteField(term30031, term30031.getClass(), "nans", (byte) 0);
        setField(term30031, term30031.getClass(), "field", null);
        setField(term30016, term30016.getClass(), "sqr2Reciprocal", term30031);
        setField(term30016, term30016.getClass(), "sqr3", term30004);
        setField(term30035, term30035.getClass(), "mant", null);
        setByteField(term30035, term30035.getClass(), "sign", (byte) 0);
        setIntField(term30035, term30035.getClass(), "exp", 0);
        setByteField(term30035, term30035.getClass(), "nans", (byte) 0);
        setField(term30035, term30035.getClass(), "field", null);
        setField(term30016, term30016.getClass(), "sqr3Reciprocal", term30035);
        setField(term30016, term30016.getClass(), "pi", term30022);
        setElement(term30039, 1, term30026);
        setElement(term30039, 2, term30004);
        setElement(term30039, 3, term30031);
        setElement(term30039, 4, term30022);
        setField(term30016, term30016.getClass(), "piSplit", term30039);
        setField(term30016, term30016.getClass(), "e", term30004);
        setElement(term30040, 2, term30018);
        setElement(term30040, 3, term30004);
        setField(term30016, term30016.getClass(), "eSplit", term30040);
        setField(term30016, term30016.getClass(), "ln2", term30035);
        setElement(term30041, 0, term29994);
        setElement(term30041, 1, term30026);
        setElement(term30041, 3, term30031);
        setField(term30016, term30016.getClass(), "ln2Split", term30041);
        setField(term30042, term30042.getClass(), "mant", null);
        setByteField(term30042, term30042.getClass(), "sign", (byte) 0);
        setIntField(term30042, term30042.getClass(), "exp", 0);
        setByteField(term30042, term30042.getClass(), "nans", (byte) 0);
        setField(term30042, term30042.getClass(), "field", null);
        setField(term30016, term30016.getClass(), "ln5", term30042);
        setElement(term30046, 0, term30018);
        setElement(term30046, 1, term30022);
        setElement(term30046, 2, term30035);
        setField(term30016, term30016.getClass(), "ln5Split", term30046);
        setField(term30047, term30047.getClass(), "mant", null);
        setByteField(term30047, term30047.getClass(), "sign", (byte) 0);
        setIntField(term30047, term30047.getClass(), "exp", 0);
        setByteField(term30047, term30047.getClass(), "nans", (byte) 0);
        setField(term30047, term30047.getClass(), "field", null);
        setField(term30016, term30016.getClass(), "ln10", term30047);
        setField(term30016, term30016.getClass(), "rMode", enum86);
        setIntField(term30016, term30016.getClass(), "ieeeFlags", -191639503);
        setField(term30004, term30004.getClass(), "field", term30016);
        setField(term30002, term30002.getClass(), "zero", term30004);
        setField(term30002, term30002.getClass(), "one", term30004);
        setField(term30054, term30054.getClass(), "mant", null);
        setByteField(term30054, term30054.getClass(), "sign", (byte) 0);
        setIntField(term30054, term30054.getClass(), "exp", 0);
        setByteField(term30054, term30054.getClass(), "nans", (byte) 0);
        setField(term30054, term30054.getClass(), "field", null);
        setField(term30002, term30002.getClass(), "two", term30054);
        setField(term30002, term30002.getClass(), "sqr2", term30004);
        setElement(term30058, 0, term30042);
        setElement(term30058, 1, term30031);
        setField(term30002, term30002.getClass(), "sqr2Split", term30058);
        setField(term30002, term30002.getClass(), "sqr2Reciprocal", term30047);
        setField(term30002, term30002.getClass(), "sqr3", term30031);
        setField(term30002, term30002.getClass(), "sqr3Reciprocal", term30035);
        setField(term30002, term30002.getClass(), "pi", term30035);
        setElement(term30059, 0, term30026);
        setElement(term30059, 1, term29994);
        setElement(term30059, 2, term29994);
        setElement(term30059, 3, term30018);
        setElement(term30059, 4, term30004);
        setField(term30002, term30002.getClass(), "piSplit", term30059);
        setField(term30002, term30002.getClass(), "e", term30035);
        setField(term30002, term30002.getClass(), "eSplit", term30060);
        setField(term30002, term30002.getClass(), "ln2", term30004);
        setElement(term30061, 0, term30022);
        setElement(term30061, 1, term30026);
        setField(term30002, term30002.getClass(), "ln2Split", term30061);
        setField(term30002, term30002.getClass(), "ln5", term30022);
        setElement(term30062, 0, term30047);
        setField(term30002, term30002.getClass(), "ln5Split", term30062);
        setField(term30002, term30002.getClass(), "ln10", term30026);
        setField(term30002, term30002.getClass(), "rMode", enum87);
        setIntField(term30002, term30002.getClass(), "ieeeFlags", -1563700756);
        setField(term29994, term29994.getClass(), "field", term30002);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.dfp.Dfp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "intValue", argTypes, term29994, args);
    }

};


