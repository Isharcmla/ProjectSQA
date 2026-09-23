package org.apache.commons.math.dfp;

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
import static org.apache.commons.math.dfp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class Dfp_ceil_76806751634 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24019;

    public Dfp_ceil_76806751634() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term24105 = Class.forName((String) "org.apache.commons.math.dfp.DfpField$RoundingMode");
        Field term24104 = ((Class) term24105).getDeclaredField((String) "ROUND_CEIL");
        ((Field) term24104).setAccessible(true);
        Object enum70 = ((Field) term24104).get((Object) null);
        Class<? extends Object> term24387 = Class.forName((String) "org.apache.commons.math.dfp.DfpField$RoundingMode");
        Field term24386 = ((Class) term24387).getDeclaredField((String) "ROUND_FLOOR");
        ((Field) term24386).setAccessible(true);
        Object enum71 = ((Field) term24386).get((Object) null);
        term24019 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        int[] term24020 = (int[]) newIntArray(0);
        Object term24024 = newInstance(Class.forName("org.apache.commons.math.dfp.DfpField"));
        Object term24026 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        int[] term24027 = (int[]) newIntArray(5);
        Object term24036 = newInstance(Class.forName("org.apache.commons.math.dfp.DfpField"));
        Object term24038 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object term24042 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object term24046 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object term24050 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object[] term24054 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 4);
        Object term24055 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object[] term24059 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 3);
        Object[] term24060 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 4);
        Object[] term24061 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 0);
        Object[] term24062 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 0);
        Object term24066 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object[] term24070 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 6);
        Object term24071 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object term24075 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object[] term24079 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 2);
        Object[] term24080 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 1);
        Object[] term24081 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 0);
        Object[] term24082 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 9);
        setField(term24019, term24019.getClass(), "mant", term24020);
        setByteField(term24019, term24019.getClass(), "sign", (byte) 109);
        setIntField(term24019, term24019.getClass(), "exp", -139694079);
        setByteField(term24019, term24019.getClass(), "nans", (byte) 76);
        setIntField(term24024, term24024.getClass(), "radixDigits", -1602072035);
        setIntElement(term24027, 0, 1902624392);
        setIntElement(term24027, 1, 904607217);
        setIntElement(term24027, 2, 434914590);
        setIntElement(term24027, 3, 1983756621);
        setIntElement(term24027, 4, -2134711835);
        setField(term24026, term24026.getClass(), "mant", term24027);
        setByteField(term24026, term24026.getClass(), "sign", (byte) -92);
        setIntField(term24026, term24026.getClass(), "exp", -1641244494);
        setByteField(term24026, term24026.getClass(), "nans", (byte) 124);
        setIntField(term24036, term24036.getClass(), "radixDigits", 1124282188);
        setField(term24038, term24038.getClass(), "mant", null);
        setByteField(term24038, term24038.getClass(), "sign", (byte) -7);
        setIntField(term24038, term24038.getClass(), "exp", -689879283);
        setByteField(term24038, term24038.getClass(), "nans", (byte) -74);
        setField(term24038, term24038.getClass(), "field", null);
        setField(term24036, term24036.getClass(), "zero", term24038);
        setField(term24042, term24042.getClass(), "mant", null);
        setByteField(term24042, term24042.getClass(), "sign", (byte) 0);
        setIntField(term24042, term24042.getClass(), "exp", 0);
        setByteField(term24042, term24042.getClass(), "nans", (byte) 0);
        setField(term24042, term24042.getClass(), "field", null);
        setField(term24036, term24036.getClass(), "one", term24042);
        setField(term24046, term24046.getClass(), "mant", null);
        setByteField(term24046, term24046.getClass(), "sign", (byte) 0);
        setIntField(term24046, term24046.getClass(), "exp", 0);
        setByteField(term24046, term24046.getClass(), "nans", (byte) 0);
        setField(term24046, term24046.getClass(), "field", null);
        setField(term24036, term24036.getClass(), "two", term24046);
        setField(term24050, term24050.getClass(), "mant", null);
        setByteField(term24050, term24050.getClass(), "sign", (byte) 0);
        setIntField(term24050, term24050.getClass(), "exp", 0);
        setByteField(term24050, term24050.getClass(), "nans", (byte) 0);
        setField(term24050, term24050.getClass(), "field", null);
        setField(term24036, term24036.getClass(), "sqr2", term24050);
        setElement(term24054, 0, term24026);
        setElement(term24054, 2, term24042);
        setElement(term24054, 3, term24026);
        setField(term24036, term24036.getClass(), "sqr2Split", term24054);
        setField(term24055, term24055.getClass(), "mant", null);
        setByteField(term24055, term24055.getClass(), "sign", (byte) 0);
        setIntField(term24055, term24055.getClass(), "exp", 0);
        setByteField(term24055, term24055.getClass(), "nans", (byte) 0);
        setField(term24055, term24055.getClass(), "field", null);
        setField(term24036, term24036.getClass(), "sqr2Reciprocal", term24055);
        setField(term24036, term24036.getClass(), "sqr3", term24046);
        setField(term24036, term24036.getClass(), "sqr3Reciprocal", term24038);
        setField(term24036, term24036.getClass(), "pi", term24026);
        setElement(term24059, 0, term24046);
        setElement(term24059, 2, term24019);
        setField(term24036, term24036.getClass(), "piSplit", term24059);
        setField(term24036, term24036.getClass(), "e", term24050);
        setField(term24036, term24036.getClass(), "eSplit", term24060);
        setField(term24036, term24036.getClass(), "ln2", term24046);
        setField(term24036, term24036.getClass(), "ln2Split", term24061);
        setField(term24036, term24036.getClass(), "ln5", term24038);
        setField(term24036, term24036.getClass(), "ln5Split", term24062);
        setField(term24036, term24036.getClass(), "ln10", term24042);
        setField(term24036, term24036.getClass(), "rMode", enum70);
        setIntField(term24036, term24036.getClass(), "ieeeFlags", -1510932472);
        setField(term24026, term24026.getClass(), "field", term24036);
        setField(term24024, term24024.getClass(), "zero", term24026);
        setField(term24066, term24066.getClass(), "mant", null);
        setByteField(term24066, term24066.getClass(), "sign", (byte) 0);
        setIntField(term24066, term24066.getClass(), "exp", 0);
        setByteField(term24066, term24066.getClass(), "nans", (byte) 0);
        setField(term24066, term24066.getClass(), "field", null);
        setField(term24024, term24024.getClass(), "one", term24066);
        setField(term24024, term24024.getClass(), "two", term24055);
        setField(term24024, term24024.getClass(), "sqr2", term24026);
        setField(term24071, term24071.getClass(), "mant", null);
        setByteField(term24071, term24071.getClass(), "sign", (byte) 0);
        setIntField(term24071, term24071.getClass(), "exp", 0);
        setByteField(term24071, term24071.getClass(), "nans", (byte) 0);
        setField(term24071, term24071.getClass(), "field", null);
        setElement(term24070, 0, term24071);
        setElement(term24070, 1, term24026);
        setElement(term24070, 2, term24046);
        setField(term24075, term24075.getClass(), "mant", null);
        setByteField(term24075, term24075.getClass(), "sign", (byte) 0);
        setIntField(term24075, term24075.getClass(), "exp", 0);
        setByteField(term24075, term24075.getClass(), "nans", (byte) 0);
        setField(term24075, term24075.getClass(), "field", null);
        setElement(term24070, 3, term24075);
        setElement(term24070, 4, term24055);
        setElement(term24070, 5, term24075);
        setField(term24024, term24024.getClass(), "sqr2Split", term24070);
        setField(term24024, term24024.getClass(), "sqr2Reciprocal", term24066);
        setField(term24024, term24024.getClass(), "sqr3", term24066);
        setField(term24024, term24024.getClass(), "sqr3Reciprocal", term24050);
        setField(term24024, term24024.getClass(), "pi", term24019);
        setElement(term24079, 0, term24019);
        setElement(term24079, 1, term24038);
        setField(term24024, term24024.getClass(), "piSplit", term24079);
        setField(term24024, term24024.getClass(), "e", term24026);
        setElement(term24080, 0, term24066);
        setField(term24024, term24024.getClass(), "eSplit", term24080);
        setField(term24024, term24024.getClass(), "ln2", term24026);
        setField(term24024, term24024.getClass(), "ln2Split", term24081);
        setField(term24024, term24024.getClass(), "ln5", term24042);
        setElement(term24082, 0, term24050);
        setElement(term24082, 1, term24042);
        setElement(term24082, 2, term24055);
        setElement(term24082, 3, term24050);
        setElement(term24082, 4, term24046);
        setElement(term24082, 5, term24055);
        setElement(term24082, 6, term24046);
        setElement(term24082, 7, term24075);
        setElement(term24082, 8, term24046);
        setField(term24024, term24024.getClass(), "ln5Split", term24082);
        setField(term24024, term24024.getClass(), "ln10", term24055);
        setField(term24024, term24024.getClass(), "rMode", enum71);
        setIntField(term24024, term24024.getClass(), "ieeeFlags", 1970654816);
        setField(term24019, term24019.getClass(), "field", term24024);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.dfp.Dfp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "ceil", argTypes, term24019, args);
    }

};


