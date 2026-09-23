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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.apache.commons.math3.dfp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class Dfp_positiveOrNull_416288746110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18957;

    public Dfp_positiveOrNull_416288746110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term957491 = Class.forName((String) "org.apache.commons.math3.dfp.DfpField$RoundingMode");
        Field term957490 = ((Class) term957491).getDeclaredField((String) "ROUND_HALF_DOWN");
        ((Field) term957490).setAccessible(true);
        Object enum242 = ((Field) term957490).get((Object) null);
        Class<? extends Object> term957793 = Class.forName((String) "org.apache.commons.math3.dfp.DfpField$RoundingMode");
        Field term957792 = ((Class) term957793).getDeclaredField((String) "ROUND_UP");
        ((Field) term957792).setAccessible(true);
        Object enum243 = ((Field) term957792).get((Object) null);
        term18957 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        int[] term18958 = (int[]) newIntArray(0);
        Object term18962 = newInstance(Class.forName("org.apache.commons.math3.dfp.DfpField"));
        Object term18964 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        int[] term18965 = (int[]) newIntArray(3);
        Object term18972 = newInstance(Class.forName("org.apache.commons.math3.dfp.DfpField"));
        Object term18974 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object term18978 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object term18982 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object[] term18986 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 5);
        Object term18987 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object term18991 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object term18995 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object[] term18999 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 7);
        Object term19000 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object[] term19004 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 4);
        Object[] term19005 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 2);
        Object[] term19006 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 3);
        Object term19010 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object[] term19014 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 7);
        Object[] term19015 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 4);
        Object[] term19016 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 1);
        Object[] term19017 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 9);
        Object[] term19018 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 6);
        setField(term18957, term18957.getClass(), "mant", term18958);
        setByteField(term18957, term18957.getClass(), "sign", (byte) -70);
        setIntField(term18957, term18957.getClass(), "exp", 1991858584);
        setByteField(term18957, term18957.getClass(), "nans", (byte) 84);
        setIntField(term18962, term18962.getClass(), "radixDigits", -1300947782);
        setIntElement(term18965, 0, 188512644);
        setIntElement(term18965, 1, 1851127634);
        setIntElement(term18965, 2, 783730213);
        setField(term18964, term18964.getClass(), "mant", term18965);
        setByteField(term18964, term18964.getClass(), "sign", (byte) 60);
        setIntField(term18964, term18964.getClass(), "exp", 1815951606);
        setByteField(term18964, term18964.getClass(), "nans", (byte) -20);
        setIntField(term18972, term18972.getClass(), "radixDigits", 1105016932);
        setField(term18974, term18974.getClass(), "mant", null);
        setByteField(term18974, term18974.getClass(), "sign", (byte) -41);
        setIntField(term18974, term18974.getClass(), "exp", 315179039);
        setByteField(term18974, term18974.getClass(), "nans", (byte) -70);
        setField(term18974, term18974.getClass(), "field", null);
        setField(term18972, term18972.getClass(), "zero", term18974);
        setField(term18978, term18978.getClass(), "mant", null);
        setByteField(term18978, term18978.getClass(), "sign", (byte) 0);
        setIntField(term18978, term18978.getClass(), "exp", 0);
        setByteField(term18978, term18978.getClass(), "nans", (byte) 0);
        setField(term18978, term18978.getClass(), "field", null);
        setField(term18972, term18972.getClass(), "one", term18978);
        setField(term18972, term18972.getClass(), "two", term18978);
        setField(term18982, term18982.getClass(), "mant", null);
        setByteField(term18982, term18982.getClass(), "sign", (byte) 0);
        setIntField(term18982, term18982.getClass(), "exp", 0);
        setByteField(term18982, term18982.getClass(), "nans", (byte) 0);
        setField(term18982, term18982.getClass(), "field", null);
        setField(term18972, term18972.getClass(), "sqr2", term18982);
        setElement(term18986, 1, term18974);
        setElement(term18986, 2, term18978);
        setElement(term18986, 4, term18964);
        setField(term18972, term18972.getClass(), "sqr2Split", term18986);
        setField(term18987, term18987.getClass(), "mant", null);
        setByteField(term18987, term18987.getClass(), "sign", (byte) 0);
        setIntField(term18987, term18987.getClass(), "exp", 0);
        setByteField(term18987, term18987.getClass(), "nans", (byte) 0);
        setField(term18987, term18987.getClass(), "field", null);
        setField(term18972, term18972.getClass(), "sqr2Reciprocal", term18987);
        setField(term18991, term18991.getClass(), "mant", null);
        setByteField(term18991, term18991.getClass(), "sign", (byte) 0);
        setIntField(term18991, term18991.getClass(), "exp", 0);
        setByteField(term18991, term18991.getClass(), "nans", (byte) 0);
        setField(term18991, term18991.getClass(), "field", null);
        setField(term18972, term18972.getClass(), "sqr3", term18991);
        setField(term18972, term18972.getClass(), "sqr3Reciprocal", term18991);
        setField(term18995, term18995.getClass(), "mant", null);
        setByteField(term18995, term18995.getClass(), "sign", (byte) 0);
        setIntField(term18995, term18995.getClass(), "exp", 0);
        setByteField(term18995, term18995.getClass(), "nans", (byte) 0);
        setField(term18995, term18995.getClass(), "field", null);
        setField(term18972, term18972.getClass(), "pi", term18995);
        setElement(term18999, 1, term18964);
        setElement(term18999, 2, term18978);
        setElement(term18999, 3, term18991);
        setElement(term18999, 4, term18982);
        setElement(term18999, 5, term18995);
        setElement(term18999, 6, term18964);
        setField(term18972, term18972.getClass(), "piSplit", term18999);
        setField(term19000, term19000.getClass(), "mant", null);
        setByteField(term19000, term19000.getClass(), "sign", (byte) 0);
        setIntField(term19000, term19000.getClass(), "exp", 0);
        setByteField(term19000, term19000.getClass(), "nans", (byte) 0);
        setField(term19000, term19000.getClass(), "field", null);
        setField(term18972, term18972.getClass(), "e", term19000);
        setElement(term19004, 0, term18991);
        setElement(term19004, 1, term18964);
        setElement(term19004, 2, term18987);
        setElement(term19004, 3, term18982);
        setField(term18972, term18972.getClass(), "eSplit", term19004);
        setField(term18972, term18972.getClass(), "ln2", term18974);
        setElement(term19005, 0, term18964);
        setElement(term19005, 1, term18982);
        setField(term18972, term18972.getClass(), "ln2Split", term19005);
        setField(term18972, term18972.getClass(), "ln5", term18978);
        setElement(term19006, 0, term18957);
        setElement(term19006, 1, term18995);
        setField(term18972, term18972.getClass(), "ln5Split", term19006);
        setField(term18972, term18972.getClass(), "ln10", term19000);
        setField(term18972, term18972.getClass(), "rMode", enum242);
        setIntField(term18972, term18972.getClass(), "ieeeFlags", -1651110911);
        setField(term18964, term18964.getClass(), "field", term18972);
        setField(term18962, term18962.getClass(), "zero", term18964);
        setField(term19010, term19010.getClass(), "mant", null);
        setByteField(term19010, term19010.getClass(), "sign", (byte) 0);
        setIntField(term19010, term19010.getClass(), "exp", 0);
        setByteField(term19010, term19010.getClass(), "nans", (byte) 0);
        setField(term19010, term19010.getClass(), "field", null);
        setField(term18962, term18962.getClass(), "one", term19010);
        setField(term18962, term18962.getClass(), "two", term19010);
        setField(term18962, term18962.getClass(), "sqr2", term18982);
        setElement(term19014, 0, term18974);
        setElement(term19014, 1, term18991);
        setElement(term19014, 2, term18978);
        setElement(term19014, 3, term18987);
        setElement(term19014, 4, term18964);
        setElement(term19014, 5, term19010);
        setElement(term19014, 6, term18964);
        setField(term18962, term18962.getClass(), "sqr2Split", term19014);
        setField(term18962, term18962.getClass(), "sqr2Reciprocal", term18982);
        setField(term18962, term18962.getClass(), "sqr3", term19000);
        setField(term18962, term18962.getClass(), "sqr3Reciprocal", term18987);
        setField(term18962, term18962.getClass(), "pi", term19000);
        setElement(term19015, 0, term18978);
        setElement(term19015, 1, term18978);
        setElement(term19015, 2, term18995);
        setElement(term19015, 3, term18957);
        setField(term18962, term18962.getClass(), "piSplit", term19015);
        setField(term18962, term18962.getClass(), "e", term18957);
        setElement(term19016, 0, term18974);
        setField(term18962, term18962.getClass(), "eSplit", term19016);
        setField(term18962, term18962.getClass(), "ln2", term18964);
        setElement(term19017, 0, term18978);
        setElement(term19017, 1, term18964);
        setElement(term19017, 2, term18991);
        setElement(term19017, 3, term18995);
        setElement(term19017, 4, term18991);
        setElement(term19017, 5, term18987);
        setElement(term19017, 6, term18995);
        setElement(term19017, 7, term18982);
        setElement(term19017, 8, term18987);
        setField(term18962, term18962.getClass(), "ln2Split", term19017);
        setField(term18962, term18962.getClass(), "ln5", term18982);
        setElement(term19018, 0, term19000);
        setElement(term19018, 1, term18982);
        setElement(term19018, 2, term18987);
        setElement(term19018, 3, term18974);
        setElement(term19018, 4, term19010);
        setElement(term19018, 5, term18978);
        setField(term18962, term18962.getClass(), "ln5Split", term19018);
        setField(term18962, term18962.getClass(), "ln10", term18964);
        setField(term18962, term18962.getClass(), "rMode", enum243);
        setIntField(term18962, term18962.getClass(), "ieeeFlags", -1934033808);
        setField(term18957, term18957.getClass(), "field", term18962);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.dfp.Dfp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "positiveOrNull", argTypes, term18957, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


