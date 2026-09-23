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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.apache.commons.math.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class BigMatrixImpl_getRow_36256088191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12151;
     Object term12248;

    public BigMatrixImpl_getRow_36256088191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12151 = newInstance(Class.forName("org.apache.commons.math.linear.BigMatrixImpl"));
        Object[] term12152 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.math.BigDecimal"), 0).getClass(), 0);
        Object[] term12153 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.math.BigDecimal"), 0).getClass(), 2);
        Object[] term12154 = (Object[]) newArray("java.math.BigDecimal", 6);
        Object term12155 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term12156 = newInstance(Class.forName("java.math.BigInteger"));
        Object term12165 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term12166 = newInstance(Class.forName("java.math.BigInteger"));
        Object term12175 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term12176 = newInstance(Class.forName("java.math.BigInteger"));
        Object term12185 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term12186 = newInstance(Class.forName("java.math.BigInteger"));
        Object term12195 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term12196 = newInstance(Class.forName("java.math.BigInteger"));
        Object term12205 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term12206 = newInstance(Class.forName("java.math.BigInteger"));
        Object[] term12215 = (Object[]) newArray("java.math.BigDecimal", 2);
        Object term12216 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term12217 = newInstance(Class.forName("java.math.BigInteger"));
        Object term12226 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term12227 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term12236 = (int[]) newIntArray(8);
        setField(term12151, term12151.getClass(), "data", term12152);
        setIntField(term12156, term12156.getClass(), "signum", 1);
        setField(term12156, term12156.getClass(), "mag", null);
        setIntField(term12156, term12156.getClass(), "bitCountPlusOne", 0);
        setIntField(term12156, term12156.getClass(), "bitLengthPlusOne", 0);
        setIntField(term12156, term12156.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term12156, term12156.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term12155, term12155.getClass(), "intVal", term12156);
        setIntField(term12155, term12155.getClass(), "scale", 52);
        setIntField(term12155, term12155.getClass(), "precision", 0);
        setField(term12155, term12155.getClass(), "stringCache", null);
        setLongField(term12155, term12155.getClass(), "intCompact", -9223372036854775808L);
        setElement(term12154, 0, term12155);
        setIntField(term12166, term12166.getClass(), "signum", 1);
        setField(term12166, term12166.getClass(), "mag", null);
        setIntField(term12166, term12166.getClass(), "bitCountPlusOne", 0);
        setIntField(term12166, term12166.getClass(), "bitLengthPlusOne", 0);
        setIntField(term12166, term12166.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term12166, term12166.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term12165, term12165.getClass(), "intVal", term12166);
        setIntField(term12165, term12165.getClass(), "scale", 52);
        setIntField(term12165, term12165.getClass(), "precision", 0);
        setField(term12165, term12165.getClass(), "stringCache", null);
        setLongField(term12165, term12165.getClass(), "intCompact", -9223372036854775808L);
        setElement(term12154, 1, term12165);
        setIntField(term12176, term12176.getClass(), "signum", 1);
        setField(term12176, term12176.getClass(), "mag", null);
        setIntField(term12176, term12176.getClass(), "bitCountPlusOne", 0);
        setIntField(term12176, term12176.getClass(), "bitLengthPlusOne", 0);
        setIntField(term12176, term12176.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term12176, term12176.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term12175, term12175.getClass(), "intVal", term12176);
        setIntField(term12175, term12175.getClass(), "scale", 50);
        setIntField(term12175, term12175.getClass(), "precision", 0);
        setField(term12175, term12175.getClass(), "stringCache", null);
        setLongField(term12175, term12175.getClass(), "intCompact", -9223372036854775808L);
        setElement(term12154, 2, term12175);
        setIntField(term12186, term12186.getClass(), "signum", 1);
        setField(term12186, term12186.getClass(), "mag", null);
        setIntField(term12186, term12186.getClass(), "bitCountPlusOne", 0);
        setIntField(term12186, term12186.getClass(), "bitLengthPlusOne", 0);
        setIntField(term12186, term12186.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term12186, term12186.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term12185, term12185.getClass(), "intVal", term12186);
        setIntField(term12185, term12185.getClass(), "scale", 53);
        setIntField(term12185, term12185.getClass(), "precision", 0);
        setField(term12185, term12185.getClass(), "stringCache", null);
        setLongField(term12185, term12185.getClass(), "intCompact", -9223372036854775808L);
        setElement(term12154, 3, term12185);
        setIntField(term12196, term12196.getClass(), "signum", 1);
        setField(term12196, term12196.getClass(), "mag", null);
        setIntField(term12196, term12196.getClass(), "bitCountPlusOne", 0);
        setIntField(term12196, term12196.getClass(), "bitLengthPlusOne", 0);
        setIntField(term12196, term12196.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term12196, term12196.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term12195, term12195.getClass(), "intVal", term12196);
        setIntField(term12195, term12195.getClass(), "scale", 48);
        setIntField(term12195, term12195.getClass(), "precision", 0);
        setField(term12195, term12195.getClass(), "stringCache", null);
        setLongField(term12195, term12195.getClass(), "intCompact", -9223372036854775808L);
        setElement(term12154, 4, term12195);
        setIntField(term12206, term12206.getClass(), "signum", 1);
        setField(term12206, term12206.getClass(), "mag", null);
        setIntField(term12206, term12206.getClass(), "bitCountPlusOne", 0);
        setIntField(term12206, term12206.getClass(), "bitLengthPlusOne", 0);
        setIntField(term12206, term12206.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term12206, term12206.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term12205, term12205.getClass(), "intVal", term12206);
        setIntField(term12205, term12205.getClass(), "scale", 50);
        setIntField(term12205, term12205.getClass(), "precision", 0);
        setField(term12205, term12205.getClass(), "stringCache", null);
        setLongField(term12205, term12205.getClass(), "intCompact", -9223372036854775808L);
        setElement(term12154, 5, term12205);
        setElement(term12153, 0, term12154);
        setIntField(term12217, term12217.getClass(), "signum", 1);
        setField(term12217, term12217.getClass(), "mag", null);
        setIntField(term12217, term12217.getClass(), "bitCountPlusOne", 0);
        setIntField(term12217, term12217.getClass(), "bitLengthPlusOne", 0);
        setIntField(term12217, term12217.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term12217, term12217.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term12216, term12216.getClass(), "intVal", term12217);
        setIntField(term12216, term12216.getClass(), "scale", 53);
        setIntField(term12216, term12216.getClass(), "precision", 0);
        setField(term12216, term12216.getClass(), "stringCache", null);
        setLongField(term12216, term12216.getClass(), "intCompact", -9223372036854775808L);
        setElement(term12215, 0, term12216);
        setIntField(term12227, term12227.getClass(), "signum", 1);
        setField(term12227, term12227.getClass(), "mag", null);
        setIntField(term12227, term12227.getClass(), "bitCountPlusOne", 0);
        setIntField(term12227, term12227.getClass(), "bitLengthPlusOne", 0);
        setIntField(term12227, term12227.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term12227, term12227.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term12226, term12226.getClass(), "intVal", term12227);
        setIntField(term12226, term12226.getClass(), "scale", 53);
        setIntField(term12226, term12226.getClass(), "precision", 0);
        setField(term12226, term12226.getClass(), "stringCache", null);
        setLongField(term12226, term12226.getClass(), "intCompact", -9223372036854775808L);
        setElement(term12215, 1, term12226);
        setElement(term12153, 1, term12215);
        setField(term12151, term12151.getClass(), "lu", term12153);
        setIntElement(term12236, 0, 1474524152);
        setIntElement(term12236, 1, 568954359);
        setIntElement(term12236, 2, 53410913);
        setIntElement(term12236, 3, -375014958);
        setIntElement(term12236, 4, 1107176718);
        setIntElement(term12236, 5, 480137250);
        setIntElement(term12236, 6, -341152642);
        setIntElement(term12236, 7, -2015854073);
        setField(term12151, term12151.getClass(), "permutation", term12236);
        setIntField(term12151, term12151.getClass(), "parity", 1);
        setIntField(term12151, term12151.getClass(), "roundingMode", 4);
        setIntField(term12151, term12151.getClass(), "scale", 64);
        term12248 = new Integer(538259104);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.BigMatrixImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term12248;
        try {
            callMethod(klass, "getRow", argTypes, term12151, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


