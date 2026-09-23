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
import java.lang.NegativeArraySizeException;
import static org.apache.commons.math.dfp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;
import java.lang.Double;

public class Dfp_newInstance_10435801174 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7040;
     Object term7124;

    public Dfp_newInstance_10435801174() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term83676 = Class.forName((String) "org.apache.commons.math.dfp.DfpField$RoundingMode");
        Field term83675 = ((Class) term83676).getDeclaredField((String) "ROUND_FLOOR");
        ((Field) term83675).setAccessible(true);
        Object enum176 = ((Field) term83675).get((Object) null);
        Class<? extends Object> term83961 = Class.forName((String) "org.apache.commons.math.dfp.DfpField$RoundingMode");
        Field term83960 = ((Class) term83961).getDeclaredField((String) "ROUND_CEIL");
        ((Field) term83960).setAccessible(true);
        Object enum177 = ((Field) term83960).get((Object) null);
        term7040 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        int[] term7041 = (int[]) newIntArray(5);
        Object term7050 = newInstance(Class.forName("org.apache.commons.math.dfp.DfpField"));
        Object term7052 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        int[] term7053 = (int[]) newIntArray(5);
        Object term7062 = newInstance(Class.forName("org.apache.commons.math.dfp.DfpField"));
        Object term7064 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object term7068 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object term7072 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object[] term7076 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 4);
        Object term7077 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object[] term7081 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 4);
        Object term7082 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object[] term7086 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 9);
        Object[] term7087 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 3);
        Object term7088 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object[] term7092 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 1);
        Object term7096 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object[] term7100 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 5);
        Object term7101 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object[] term7105 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 5);
        Object[] term7106 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 8);
        Object[] term7107 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 3);
        Object[] term7108 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 6);
        setIntElement(term7041, 0, 32185364);
        setIntElement(term7041, 1, 1768204942);
        setIntElement(term7041, 2, 1252951645);
        setIntElement(term7041, 3, 574481092);
        setIntElement(term7041, 4, -310528004);
        setField(term7040, term7040.getClass(), "mant", term7041);
        setByteField(term7040, term7040.getClass(), "sign", (byte) -28);
        setIntField(term7040, term7040.getClass(), "exp", -634976996);
        setByteField(term7040, term7040.getClass(), "nans", (byte) 115);
        setIntField(term7050, term7050.getClass(), "radixDigits", -1015274146);
        setIntElement(term7053, 0, -49052672);
        setIntElement(term7053, 1, 339372704);
        setIntElement(term7053, 2, -851097944);
        setIntElement(term7053, 3, 803925431);
        setIntElement(term7053, 4, 76929641);
        setField(term7052, term7052.getClass(), "mant", term7053);
        setByteField(term7052, term7052.getClass(), "sign", (byte) 51);
        setIntField(term7052, term7052.getClass(), "exp", -2003192918);
        setByteField(term7052, term7052.getClass(), "nans", (byte) -53);
        setIntField(term7062, term7062.getClass(), "radixDigits", -1362856620);
        setField(term7064, term7064.getClass(), "mant", null);
        setByteField(term7064, term7064.getClass(), "sign", (byte) -9);
        setIntField(term7064, term7064.getClass(), "exp", -1694747156);
        setByteField(term7064, term7064.getClass(), "nans", (byte) 97);
        setField(term7064, term7064.getClass(), "field", null);
        setField(term7062, term7062.getClass(), "zero", term7064);
        setField(term7068, term7068.getClass(), "mant", null);
        setByteField(term7068, term7068.getClass(), "sign", (byte) 0);
        setIntField(term7068, term7068.getClass(), "exp", 0);
        setByteField(term7068, term7068.getClass(), "nans", (byte) 0);
        setField(term7068, term7068.getClass(), "field", null);
        setField(term7062, term7062.getClass(), "one", term7068);
        setField(term7072, term7072.getClass(), "mant", null);
        setByteField(term7072, term7072.getClass(), "sign", (byte) 0);
        setIntField(term7072, term7072.getClass(), "exp", 0);
        setByteField(term7072, term7072.getClass(), "nans", (byte) 0);
        setField(term7072, term7072.getClass(), "field", null);
        setField(term7062, term7062.getClass(), "two", term7072);
        setField(term7062, term7062.getClass(), "sqr2", term7052);
        setElement(term7076, 3, term7068);
        setField(term7062, term7062.getClass(), "sqr2Split", term7076);
        setField(term7062, term7062.getClass(), "sqr2Reciprocal", term7052);
        setField(term7062, term7062.getClass(), "sqr3", term7072);
        setField(term7077, term7077.getClass(), "mant", null);
        setByteField(term7077, term7077.getClass(), "sign", (byte) 0);
        setIntField(term7077, term7077.getClass(), "exp", 0);
        setByteField(term7077, term7077.getClass(), "nans", (byte) 0);
        setField(term7077, term7077.getClass(), "field", null);
        setField(term7062, term7062.getClass(), "sqr3Reciprocal", term7077);
        setField(term7062, term7062.getClass(), "pi", term7052);
        setElement(term7081, 2, term7064);
        setElement(term7081, 3, term7052);
        setField(term7062, term7062.getClass(), "piSplit", term7081);
        setField(term7082, term7082.getClass(), "mant", null);
        setByteField(term7082, term7082.getClass(), "sign", (byte) 0);
        setIntField(term7082, term7082.getClass(), "exp", 0);
        setByteField(term7082, term7082.getClass(), "nans", (byte) 0);
        setField(term7082, term7082.getClass(), "field", null);
        setField(term7062, term7062.getClass(), "e", term7082);
        setElement(term7086, 1, term7040);
        setElement(term7086, 2, term7068);
        setElement(term7086, 4, term7072);
        setElement(term7086, 7, term7082);
        setElement(term7086, 8, term7064);
        setField(term7062, term7062.getClass(), "eSplit", term7086);
        setField(term7062, term7062.getClass(), "ln2", term7077);
        setElement(term7087, 2, term7052);
        setField(term7062, term7062.getClass(), "ln2Split", term7087);
        setField(term7088, term7088.getClass(), "mant", null);
        setByteField(term7088, term7088.getClass(), "sign", (byte) 0);
        setIntField(term7088, term7088.getClass(), "exp", 0);
        setByteField(term7088, term7088.getClass(), "nans", (byte) 0);
        setField(term7088, term7088.getClass(), "field", null);
        setField(term7062, term7062.getClass(), "ln5", term7088);
        setElement(term7092, 0, term7052);
        setField(term7062, term7062.getClass(), "ln5Split", term7092);
        setField(term7062, term7062.getClass(), "ln10", term7082);
        setField(term7062, term7062.getClass(), "rMode", enum176);
        setIntField(term7062, term7062.getClass(), "ieeeFlags", 1843268026);
        setField(term7052, term7052.getClass(), "field", term7062);
        setField(term7050, term7050.getClass(), "zero", term7052);
        setField(term7050, term7050.getClass(), "one", term7072);
        setField(term7096, term7096.getClass(), "mant", null);
        setByteField(term7096, term7096.getClass(), "sign", (byte) 0);
        setIntField(term7096, term7096.getClass(), "exp", 0);
        setByteField(term7096, term7096.getClass(), "nans", (byte) 0);
        setField(term7096, term7096.getClass(), "field", null);
        setField(term7050, term7050.getClass(), "two", term7096);
        setField(term7050, term7050.getClass(), "sqr2", term7072);
        setField(term7101, term7101.getClass(), "mant", null);
        setByteField(term7101, term7101.getClass(), "sign", (byte) 0);
        setIntField(term7101, term7101.getClass(), "exp", 0);
        setByteField(term7101, term7101.getClass(), "nans", (byte) 0);
        setField(term7101, term7101.getClass(), "field", null);
        setElement(term7100, 0, term7101);
        setElement(term7100, 1, term7101);
        setElement(term7100, 2, term7068);
        setElement(term7100, 3, term7040);
        setElement(term7100, 4, term7040);
        setField(term7050, term7050.getClass(), "sqr2Split", term7100);
        setField(term7050, term7050.getClass(), "sqr2Reciprocal", term7064);
        setField(term7050, term7050.getClass(), "sqr3", term7052);
        setField(term7050, term7050.getClass(), "sqr3Reciprocal", term7101);
        setField(term7050, term7050.getClass(), "pi", term7052);
        setElement(term7105, 0, term7077);
        setElement(term7105, 1, term7068);
        setElement(term7105, 2, term7077);
        setElement(term7105, 3, term7096);
        setElement(term7105, 4, term7068);
        setField(term7050, term7050.getClass(), "piSplit", term7105);
        setField(term7050, term7050.getClass(), "e", term7082);
        setElement(term7106, 0, term7096);
        setElement(term7106, 1, term7082);
        setElement(term7106, 2, term7072);
        setElement(term7106, 3, term7082);
        setElement(term7106, 4, term7096);
        setElement(term7106, 5, term7064);
        setElement(term7106, 6, term7088);
        setElement(term7106, 7, term7101);
        setField(term7050, term7050.getClass(), "eSplit", term7106);
        setField(term7050, term7050.getClass(), "ln2", term7052);
        setElement(term7107, 0, term7072);
        setElement(term7107, 1, term7101);
        setElement(term7107, 2, term7064);
        setField(term7050, term7050.getClass(), "ln2Split", term7107);
        setField(term7050, term7050.getClass(), "ln5", term7072);
        setElement(term7108, 0, term7082);
        setElement(term7108, 1, term7077);
        setElement(term7108, 2, term7082);
        setElement(term7108, 3, term7068);
        setElement(term7108, 4, term7088);
        setElement(term7108, 5, term7052);
        setField(term7050, term7050.getClass(), "ln5Split", term7108);
        setField(term7050, term7050.getClass(), "ln10", term7096);
        setField(term7050, term7050.getClass(), "rMode", enum177);
        setIntField(term7050, term7050.getClass(), "ieeeFlags", 954660603);
        setField(term7040, term7040.getClass(), "field", term7050);
        term7124 = new Double(0.3455959125047594);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.dfp.Dfp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term7124;
        try {
            callMethod(klass, "newInstance", argTypes, term7040, args);
            assertTrue(false);
        }
        catch (NegativeArraySizeException e) {
        }

    }

};


