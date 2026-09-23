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

public class Dfp_log10K_120447386038 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26722;

    public Dfp_log10K_120447386038() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term26807 = Class.forName((String) "org.apache.commons.math.dfp.DfpField$RoundingMode");
        Field term26806 = ((Class) term26807).getDeclaredField((String) "ROUND_DOWN");
        ((Field) term26806).setAccessible(true);
        Object enum78 = ((Field) term26806).get((Object) null);
        Class<? extends Object> term27089 = Class.forName((String) "org.apache.commons.math.dfp.DfpField$RoundingMode");
        Field term27088 = ((Class) term27089).getDeclaredField((String) "ROUND_HALF_ODD");
        ((Field) term27088).setAccessible(true);
        Object enum79 = ((Field) term27088).get((Object) null);
        term26722 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        int[] term26723 = (int[]) newIntArray(3);
        Object term26730 = newInstance(Class.forName("org.apache.commons.math.dfp.DfpField"));
        Object term26732 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        int[] term26733 = (int[]) newIntArray(0);
        Object term26737 = newInstance(Class.forName("org.apache.commons.math.dfp.DfpField"));
        Object term26739 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object term26743 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object[] term26747 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 2);
        Object term26748 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object term26752 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object term26756 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object[] term26760 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 1);
        Object[] term26761 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 4);
        Object[] term26762 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 4);
        Object[] term26763 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 4);
        Object term26764 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object[] term26771 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 0);
        Object[] term26772 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 5);
        Object term26773 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object[] term26777 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 8);
        Object term26778 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object[] term26782 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 5);
        Object[] term26783 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 4);
        setIntElement(term26723, 0, 1558810715);
        setIntElement(term26723, 1, -382652403);
        setIntElement(term26723, 2, -2126539433);
        setField(term26722, term26722.getClass(), "mant", term26723);
        setByteField(term26722, term26722.getClass(), "sign", (byte) -30);
        setIntField(term26722, term26722.getClass(), "exp", 196952878);
        setByteField(term26722, term26722.getClass(), "nans", (byte) 102);
        setIntField(term26730, term26730.getClass(), "radixDigits", 802673242);
        setField(term26732, term26732.getClass(), "mant", term26733);
        setByteField(term26732, term26732.getClass(), "sign", (byte) -79);
        setIntField(term26732, term26732.getClass(), "exp", -1808638031);
        setByteField(term26732, term26732.getClass(), "nans", (byte) -33);
        setIntField(term26737, term26737.getClass(), "radixDigits", -1514240086);
        setField(term26739, term26739.getClass(), "mant", null);
        setByteField(term26739, term26739.getClass(), "sign", (byte) -88);
        setIntField(term26739, term26739.getClass(), "exp", -1954937310);
        setByteField(term26739, term26739.getClass(), "nans", (byte) -53);
        setField(term26739, term26739.getClass(), "field", null);
        setField(term26737, term26737.getClass(), "zero", term26739);
        setField(term26743, term26743.getClass(), "mant", null);
        setByteField(term26743, term26743.getClass(), "sign", (byte) 0);
        setIntField(term26743, term26743.getClass(), "exp", 0);
        setByteField(term26743, term26743.getClass(), "nans", (byte) 0);
        setField(term26743, term26743.getClass(), "field", null);
        setField(term26737, term26737.getClass(), "one", term26743);
        setField(term26737, term26737.getClass(), "two", term26743);
        setField(term26737, term26737.getClass(), "sqr2", term26732);
        setField(term26737, term26737.getClass(), "sqr2Split", term26747);
        setField(term26748, term26748.getClass(), "mant", null);
        setByteField(term26748, term26748.getClass(), "sign", (byte) 0);
        setIntField(term26748, term26748.getClass(), "exp", 0);
        setByteField(term26748, term26748.getClass(), "nans", (byte) 0);
        setField(term26748, term26748.getClass(), "field", null);
        setField(term26737, term26737.getClass(), "sqr2Reciprocal", term26748);
        setField(term26752, term26752.getClass(), "mant", null);
        setByteField(term26752, term26752.getClass(), "sign", (byte) 0);
        setIntField(term26752, term26752.getClass(), "exp", 0);
        setByteField(term26752, term26752.getClass(), "nans", (byte) 0);
        setField(term26752, term26752.getClass(), "field", null);
        setField(term26737, term26737.getClass(), "sqr3", term26752);
        setField(term26737, term26737.getClass(), "sqr3Reciprocal", term26739);
        setField(term26756, term26756.getClass(), "mant", null);
        setByteField(term26756, term26756.getClass(), "sign", (byte) 0);
        setIntField(term26756, term26756.getClass(), "exp", 0);
        setByteField(term26756, term26756.getClass(), "nans", (byte) 0);
        setField(term26756, term26756.getClass(), "field", null);
        setField(term26737, term26737.getClass(), "pi", term26756);
        setField(term26737, term26737.getClass(), "piSplit", term26760);
        setField(term26737, term26737.getClass(), "e", term26732);
        setElement(term26761, 3, term26752);
        setField(term26737, term26737.getClass(), "eSplit", term26761);
        setField(term26737, term26737.getClass(), "ln2", term26743);
        setElement(term26762, 0, term26732);
        setElement(term26762, 1, term26756);
        setElement(term26762, 3, term26748);
        setField(term26737, term26737.getClass(), "ln2Split", term26762);
        setField(term26737, term26737.getClass(), "ln5", term26752);
        setElement(term26763, 0, term26732);
        setElement(term26763, 1, term26743);
        setElement(term26763, 3, term26732);
        setField(term26737, term26737.getClass(), "ln5Split", term26763);
        setField(term26764, term26764.getClass(), "mant", null);
        setByteField(term26764, term26764.getClass(), "sign", (byte) 0);
        setIntField(term26764, term26764.getClass(), "exp", 0);
        setByteField(term26764, term26764.getClass(), "nans", (byte) 0);
        setField(term26764, term26764.getClass(), "field", null);
        setField(term26737, term26737.getClass(), "ln10", term26764);
        setField(term26737, term26737.getClass(), "rMode", enum78);
        setIntField(term26737, term26737.getClass(), "ieeeFlags", -1825624890);
        setField(term26732, term26732.getClass(), "field", term26737);
        setField(term26730, term26730.getClass(), "zero", term26732);
        setField(term26730, term26730.getClass(), "one", term26748);
        setField(term26730, term26730.getClass(), "two", term26739);
        setField(term26730, term26730.getClass(), "sqr2", term26732);
        setField(term26730, term26730.getClass(), "sqr2Split", term26771);
        setField(term26730, term26730.getClass(), "sqr2Reciprocal", term26748);
        setField(term26730, term26730.getClass(), "sqr3", term26756);
        setField(term26730, term26730.getClass(), "sqr3Reciprocal", term26722);
        setField(term26730, term26730.getClass(), "pi", term26752);
        setField(term26773, term26773.getClass(), "mant", null);
        setByteField(term26773, term26773.getClass(), "sign", (byte) 0);
        setIntField(term26773, term26773.getClass(), "exp", 0);
        setByteField(term26773, term26773.getClass(), "nans", (byte) 0);
        setField(term26773, term26773.getClass(), "field", null);
        setElement(term26772, 0, term26773);
        setElement(term26772, 1, term26743);
        setElement(term26772, 2, term26773);
        setElement(term26772, 3, term26773);
        setElement(term26772, 4, term26748);
        setField(term26730, term26730.getClass(), "piSplit", term26772);
        setField(term26730, term26730.getClass(), "e", term26739);
        setField(term26778, term26778.getClass(), "mant", null);
        setByteField(term26778, term26778.getClass(), "sign", (byte) 0);
        setIntField(term26778, term26778.getClass(), "exp", 0);
        setByteField(term26778, term26778.getClass(), "nans", (byte) 0);
        setField(term26778, term26778.getClass(), "field", null);
        setElement(term26777, 0, term26778);
        setElement(term26777, 1, term26756);
        setElement(term26777, 2, term26764);
        setElement(term26777, 3, term26732);
        setElement(term26777, 4, term26773);
        setElement(term26777, 5, term26732);
        setElement(term26777, 6, term26748);
        setElement(term26777, 7, term26743);
        setField(term26730, term26730.getClass(), "eSplit", term26777);
        setField(term26730, term26730.getClass(), "ln2", term26764);
        setElement(term26782, 0, term26743);
        setElement(term26782, 1, term26756);
        setElement(term26782, 2, term26756);
        setElement(term26782, 3, term26752);
        setElement(term26782, 4, term26722);
        setField(term26730, term26730.getClass(), "ln2Split", term26782);
        setField(term26730, term26730.getClass(), "ln5", term26722);
        setElement(term26783, 0, term26739);
        setElement(term26783, 1, term26732);
        setElement(term26783, 2, term26756);
        setElement(term26783, 3, term26732);
        setField(term26730, term26730.getClass(), "ln5Split", term26783);
        setField(term26730, term26730.getClass(), "ln10", term26778);
        setField(term26730, term26730.getClass(), "rMode", enum79);
        setIntField(term26730, term26730.getClass(), "ieeeFlags", 413214164);
        setField(term26722, term26722.getClass(), "field", term26730);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.dfp.Dfp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "log10K", argTypes, term26722, args);
    }

};


