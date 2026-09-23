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
import org.apache.commons.math.linear.MatrixIndexException;
import static org.apache.commons.math.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class BigMatrixImpl_getSubMatrix_116711313086 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11007;
     Object term11072;
     Object term11074;
     Object term11076;
     Object term11078;

    public BigMatrixImpl_getSubMatrix_116711313086() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11007 = newInstance(Class.forName("org.apache.commons.math.linear.BigMatrixImpl"));
        Object[] term11008 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.math.BigDecimal"), 0).getClass(), 0);
        Object[] term11009 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.math.BigDecimal"), 0).getClass(), 2);
        Object[] term11010 = (Object[]) newArray("java.math.BigDecimal", 5);
        Object term11011 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term11012 = newInstance(Class.forName("java.math.BigInteger"));
        Object term11021 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term11022 = newInstance(Class.forName("java.math.BigInteger"));
        Object term11031 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term11032 = newInstance(Class.forName("java.math.BigInteger"));
        Object term11041 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term11042 = newInstance(Class.forName("java.math.BigInteger"));
        Object term11051 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term11052 = newInstance(Class.forName("java.math.BigInteger"));
        Object[] term11061 = (Object[]) newArray("java.math.BigDecimal", 0);
        int[] term11062 = (int[]) newIntArray(6);
        setField(term11007, term11007.getClass(), "data", term11008);
        setIntField(term11012, term11012.getClass(), "signum", 1);
        setField(term11012, term11012.getClass(), "mag", null);
        setIntField(term11012, term11012.getClass(), "bitCountPlusOne", 0);
        setIntField(term11012, term11012.getClass(), "bitLengthPlusOne", 0);
        setIntField(term11012, term11012.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term11012, term11012.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term11011, term11011.getClass(), "intVal", term11012);
        setIntField(term11011, term11011.getClass(), "scale", 53);
        setIntField(term11011, term11011.getClass(), "precision", 0);
        setField(term11011, term11011.getClass(), "stringCache", null);
        setLongField(term11011, term11011.getClass(), "intCompact", -9223372036854775808L);
        setElement(term11010, 0, term11011);
        setIntField(term11022, term11022.getClass(), "signum", 1);
        setField(term11022, term11022.getClass(), "mag", null);
        setIntField(term11022, term11022.getClass(), "bitCountPlusOne", 0);
        setIntField(term11022, term11022.getClass(), "bitLengthPlusOne", 0);
        setIntField(term11022, term11022.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term11022, term11022.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term11021, term11021.getClass(), "intVal", term11022);
        setIntField(term11021, term11021.getClass(), "scale", 52);
        setIntField(term11021, term11021.getClass(), "precision", 0);
        setField(term11021, term11021.getClass(), "stringCache", null);
        setLongField(term11021, term11021.getClass(), "intCompact", -9223372036854775808L);
        setElement(term11010, 1, term11021);
        setIntField(term11032, term11032.getClass(), "signum", 1);
        setField(term11032, term11032.getClass(), "mag", null);
        setIntField(term11032, term11032.getClass(), "bitCountPlusOne", 0);
        setIntField(term11032, term11032.getClass(), "bitLengthPlusOne", 0);
        setIntField(term11032, term11032.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term11032, term11032.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term11031, term11031.getClass(), "intVal", term11032);
        setIntField(term11031, term11031.getClass(), "scale", 51);
        setIntField(term11031, term11031.getClass(), "precision", 0);
        setField(term11031, term11031.getClass(), "stringCache", null);
        setLongField(term11031, term11031.getClass(), "intCompact", -9223372036854775808L);
        setElement(term11010, 2, term11031);
        setIntField(term11042, term11042.getClass(), "signum", 1);
        setField(term11042, term11042.getClass(), "mag", null);
        setIntField(term11042, term11042.getClass(), "bitCountPlusOne", 0);
        setIntField(term11042, term11042.getClass(), "bitLengthPlusOne", 0);
        setIntField(term11042, term11042.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term11042, term11042.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term11041, term11041.getClass(), "intVal", term11042);
        setIntField(term11041, term11041.getClass(), "scale", 52);
        setIntField(term11041, term11041.getClass(), "precision", 0);
        setField(term11041, term11041.getClass(), "stringCache", null);
        setLongField(term11041, term11041.getClass(), "intCompact", -9223372036854775808L);
        setElement(term11010, 3, term11041);
        setIntField(term11052, term11052.getClass(), "signum", 1);
        setField(term11052, term11052.getClass(), "mag", null);
        setIntField(term11052, term11052.getClass(), "bitCountPlusOne", 0);
        setIntField(term11052, term11052.getClass(), "bitLengthPlusOne", 0);
        setIntField(term11052, term11052.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term11052, term11052.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term11051, term11051.getClass(), "intVal", term11052);
        setIntField(term11051, term11051.getClass(), "scale", 52);
        setIntField(term11051, term11051.getClass(), "precision", 0);
        setField(term11051, term11051.getClass(), "stringCache", null);
        setLongField(term11051, term11051.getClass(), "intCompact", -9223372036854775808L);
        setElement(term11010, 4, term11051);
        setElement(term11009, 0, term11010);
        setElement(term11009, 1, term11061);
        setField(term11007, term11007.getClass(), "lu", term11009);
        setIntElement(term11062, 0, 1240914516);
        setIntElement(term11062, 1, -1465035361);
        setIntElement(term11062, 2, 1090617576);
        setIntElement(term11062, 3, -1547384488);
        setIntElement(term11062, 4, 1442160736);
        setIntElement(term11062, 5, 1114000454);
        setField(term11007, term11007.getClass(), "permutation", term11062);
        setIntField(term11007, term11007.getClass(), "parity", 1);
        setIntField(term11007, term11007.getClass(), "roundingMode", 4);
        setIntField(term11007, term11007.getClass(), "scale", 64);
        term11072 = new Integer(-556405712);
        term11074 = new Integer(-1772434990);
        term11076 = new Integer(-1845499264);
        term11078 = new Integer(-505439934);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.BigMatrixImpl");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = term11072;
        args[1] = term11074;
        args[2] = term11076;
        args[3] = term11078;
        try {
            callMethod(klass, "getSubMatrix", argTypes, term11007, args);
            assertTrue(false);
        }
        catch (MatrixIndexException e) {
        }

    }

};


