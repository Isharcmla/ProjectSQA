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
import java.lang.OutOfMemoryError;
import static org.apache.commons.math3.dfp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class Dfp_newInstance_117797511678 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5055;

    public Dfp_newInstance_117797511678() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term84365 = Class.forName((String) "org.apache.commons.math3.dfp.DfpField$RoundingMode");
        Field term84364 = ((Class) term84365).getDeclaredField((String) "ROUND_HALF_EVEN");
        ((Field) term84364).setAccessible(true);
        Object enum178 = ((Field) term84364).get((Object) null);
        term5055 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        int[] term5056 = (int[]) newIntArray(5);
        Object term5065 = newInstance(Class.forName("org.apache.commons.math3.dfp.DfpField"));
        Object term5067 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        int[] term5068 = (int[]) newIntArray(1);
        Object term5073 = newInstance(Class.forName("org.apache.commons.math3.dfp.DfpField"));
        Object term5075 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object term5079 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object term5083 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object[] term5087 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 7);
        Object term5088 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object term5092 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object[] term5096 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 8);
        Object[] term5097 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 9);
        Object[] term5098 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 5);
        Object term5099 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object[] term5103 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 9);
        Object term5104 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object[] term5111 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 9);
        Object term5112 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object[] term5116 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 6);
        Object[] term5117 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 1);
        Object[] term5118 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 5);
        Object[] term5119 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 3);
        setIntElement(term5056, 0, 937859191);
        setIntElement(term5056, 1, -916584829);
        setIntElement(term5056, 2, -2131181468);
        setIntElement(term5056, 3, 282916351);
        setIntElement(term5056, 4, 880977281);
        setField(term5055, term5055.getClass(), "mant", term5056);
        setByteField(term5055, term5055.getClass(), "sign", (byte) 14);
        setIntField(term5055, term5055.getClass(), "exp", 371943306);
        setByteField(term5055, term5055.getClass(), "nans", (byte) -101);
        setIntField(term5065, term5065.getClass(), "radixDigits", 982388293);
        setIntElement(term5068, 0, -159494544);
        setField(term5067, term5067.getClass(), "mant", term5068);
        setByteField(term5067, term5067.getClass(), "sign", (byte) 66);
        setIntField(term5067, term5067.getClass(), "exp", -75206835);
        setByteField(term5067, term5067.getClass(), "nans", (byte) 123);
        setIntField(term5073, term5073.getClass(), "radixDigits", -1618206977);
        setField(term5075, term5075.getClass(), "mant", null);
        setByteField(term5075, term5075.getClass(), "sign", (byte) 84);
        setIntField(term5075, term5075.getClass(), "exp", 1684998508);
        setByteField(term5075, term5075.getClass(), "nans", (byte) -97);
        setField(term5075, term5075.getClass(), "field", null);
        setField(term5073, term5073.getClass(), "zero", term5075);
        setField(term5079, term5079.getClass(), "mant", null);
        setByteField(term5079, term5079.getClass(), "sign", (byte) 0);
        setIntField(term5079, term5079.getClass(), "exp", 0);
        setByteField(term5079, term5079.getClass(), "nans", (byte) 0);
        setField(term5079, term5079.getClass(), "field", null);
        setField(term5073, term5073.getClass(), "one", term5079);
        setField(term5073, term5073.getClass(), "two", term5067);
        setField(term5083, term5083.getClass(), "mant", null);
        setByteField(term5083, term5083.getClass(), "sign", (byte) 0);
        setIntField(term5083, term5083.getClass(), "exp", 0);
        setByteField(term5083, term5083.getClass(), "nans", (byte) 0);
        setField(term5083, term5083.getClass(), "field", null);
        setField(term5073, term5073.getClass(), "sqr2", term5083);
        setElement(term5087, 1, term5067);
        setElement(term5087, 4, term5075);
        setElement(term5087, 5, term5067);
        setField(term5073, term5073.getClass(), "sqr2Split", term5087);
        setField(term5088, term5088.getClass(), "mant", null);
        setByteField(term5088, term5088.getClass(), "sign", (byte) 0);
        setIntField(term5088, term5088.getClass(), "exp", 0);
        setByteField(term5088, term5088.getClass(), "nans", (byte) 0);
        setField(term5088, term5088.getClass(), "field", null);
        setField(term5073, term5073.getClass(), "sqr2Reciprocal", term5088);
        setField(term5073, term5073.getClass(), "sqr3", term5055);
        setField(term5073, term5073.getClass(), "sqr3Reciprocal", term5079);
        setField(term5092, term5092.getClass(), "mant", null);
        setByteField(term5092, term5092.getClass(), "sign", (byte) 0);
        setIntField(term5092, term5092.getClass(), "exp", 0);
        setByteField(term5092, term5092.getClass(), "nans", (byte) 0);
        setField(term5092, term5092.getClass(), "field", null);
        setField(term5073, term5073.getClass(), "pi", term5092);
        setElement(term5096, 0, term5083);
        setElement(term5096, 1, term5092);
        setElement(term5096, 2, term5092);
        setElement(term5096, 4, term5075);
        setElement(term5096, 6, term5088);
        setField(term5073, term5073.getClass(), "piSplit", term5096);
        setField(term5073, term5073.getClass(), "e", term5067);
        setElement(term5097, 0, term5092);
        setElement(term5097, 1, term5067);
        setElement(term5097, 3, term5083);
        setElement(term5097, 5, term5083);
        setElement(term5097, 6, term5088);
        setElement(term5097, 7, term5088);
        setElement(term5097, 8, term5079);
        setField(term5073, term5073.getClass(), "eSplit", term5097);
        setField(term5073, term5073.getClass(), "ln2", term5055);
        setElement(term5098, 0, term5055);
        setElement(term5098, 1, term5075);
        setElement(term5098, 2, term5067);
        setElement(term5098, 3, term5088);
        setElement(term5098, 4, term5067);
        setField(term5073, term5073.getClass(), "ln2Split", term5098);
        setField(term5099, term5099.getClass(), "mant", null);
        setByteField(term5099, term5099.getClass(), "sign", (byte) 0);
        setIntField(term5099, term5099.getClass(), "exp", 0);
        setByteField(term5099, term5099.getClass(), "nans", (byte) 0);
        setField(term5099, term5099.getClass(), "field", null);
        setField(term5073, term5073.getClass(), "ln5", term5099);
        setElement(term5103, 0, term5079);
        setElement(term5103, 1, term5099);
        setElement(term5103, 3, term5079);
        setElement(term5103, 7, term5083);
        setField(term5073, term5073.getClass(), "ln5Split", term5103);
        setField(term5104, term5104.getClass(), "mant", null);
        setByteField(term5104, term5104.getClass(), "sign", (byte) 0);
        setIntField(term5104, term5104.getClass(), "exp", 0);
        setByteField(term5104, term5104.getClass(), "nans", (byte) 0);
        setField(term5104, term5104.getClass(), "field", null);
        setField(term5073, term5073.getClass(), "ln10", term5104);
        setField(term5073, term5073.getClass(), "rMode", enum178);
        setIntField(term5073, term5073.getClass(), "ieeeFlags", -1146679443);
        setField(term5067, term5067.getClass(), "field", term5073);
        setField(term5065, term5065.getClass(), "zero", term5067);
        setField(term5065, term5065.getClass(), "one", term5075);
        setField(term5065, term5065.getClass(), "two", term5092);
        setField(term5065, term5065.getClass(), "sqr2", term5088);
        setElement(term5111, 0, term5067);
        setElement(term5111, 1, term5083);
        setElement(term5111, 2, term5088);
        setElement(term5111, 3, term5075);
        setElement(term5111, 4, term5083);
        setField(term5112, term5112.getClass(), "mant", null);
        setByteField(term5112, term5112.getClass(), "sign", (byte) 0);
        setIntField(term5112, term5112.getClass(), "exp", 0);
        setByteField(term5112, term5112.getClass(), "nans", (byte) 0);
        setField(term5112, term5112.getClass(), "field", null);
        setElement(term5111, 5, term5112);
        setElement(term5111, 6, term5099);
        setElement(term5111, 7, term5112);
        setElement(term5111, 8, term5079);
        setField(term5065, term5065.getClass(), "sqr2Split", term5111);
        setField(term5065, term5065.getClass(), "sqr2Reciprocal", term5092);
        setField(term5065, term5065.getClass(), "sqr3", term5067);
        setField(term5065, term5065.getClass(), "sqr3Reciprocal", term5104);
        setField(term5065, term5065.getClass(), "pi", term5055);
        setElement(term5116, 0, term5092);
        setElement(term5116, 1, term5099);
        setElement(term5116, 2, term5099);
        setElement(term5116, 3, term5055);
        setElement(term5116, 4, term5104);
        setElement(term5116, 5, term5112);
        setField(term5065, term5065.getClass(), "piSplit", term5116);
        setField(term5065, term5065.getClass(), "e", term5083);
        setElement(term5117, 0, term5088);
        setField(term5065, term5065.getClass(), "eSplit", term5117);
        setField(term5065, term5065.getClass(), "ln2", term5099);
        setElement(term5118, 0, term5075);
        setElement(term5118, 1, term5088);
        setElement(term5118, 2, term5112);
        setElement(term5118, 3, term5079);
        setElement(term5118, 4, term5088);
        setField(term5065, term5065.getClass(), "ln2Split", term5118);
        setField(term5065, term5065.getClass(), "ln5", term5067);
        setElement(term5119, 0, term5112);
        setElement(term5119, 1, term5067);
        setElement(term5119, 2, term5079);
        setField(term5065, term5065.getClass(), "ln5Split", term5119);
        setField(term5065, term5065.getClass(), "ln10", term5088);
        setField(term5065, term5065.getClass(), "rMode", enum178);
        setIntField(term5065, term5065.getClass(), "ieeeFlags", -860131894);
        setField(term5055, term5055.getClass(), "field", term5065);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.dfp.Dfp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "newInstance", argTypes, term5055, args);
            assertTrue(false);
        }
        catch (OutOfMemoryError e) {
        }

    }

};


