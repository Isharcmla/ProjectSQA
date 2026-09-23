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

public class BigMatrixImpl_getSubMatrix_110800778687 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11086;
     Object term11219;
     Object term11225;

    public BigMatrixImpl_getSubMatrix_110800778687() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11086 = newInstance(Class.forName("org.apache.commons.math.linear.BigMatrixImpl"));
        Object[] term11087 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.math.BigDecimal"), 0).getClass(), 2);
        Object[] term11088 = (Object[]) newArray("java.math.BigDecimal", 7);
        Object term11089 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term11090 = newInstance(Class.forName("java.math.BigInteger"));
        Object term11099 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term11100 = newInstance(Class.forName("java.math.BigInteger"));
        Object term11109 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term11110 = newInstance(Class.forName("java.math.BigInteger"));
        Object term11119 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term11120 = newInstance(Class.forName("java.math.BigInteger"));
        Object term11129 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term11130 = newInstance(Class.forName("java.math.BigInteger"));
        Object term11139 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term11140 = newInstance(Class.forName("java.math.BigInteger"));
        Object term11149 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term11150 = newInstance(Class.forName("java.math.BigInteger"));
        Object[] term11159 = (Object[]) newArray("java.math.BigDecimal", 4);
        Object term11160 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term11161 = newInstance(Class.forName("java.math.BigInteger"));
        Object term11170 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term11171 = newInstance(Class.forName("java.math.BigInteger"));
        Object term11180 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term11181 = newInstance(Class.forName("java.math.BigInteger"));
        Object term11190 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term11191 = newInstance(Class.forName("java.math.BigInteger"));
        Object[] term11200 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.math.BigDecimal"), 0).getClass(), 2);
        Object[] term11201 = (Object[]) newArray("java.math.BigDecimal", 1);
        Object term11202 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term11203 = newInstance(Class.forName("java.math.BigInteger"));
        Object[] term11212 = (Object[]) newArray("java.math.BigDecimal", 0);
        int[] term11213 = (int[]) newIntArray(2);
        setIntField(term11090, term11090.getClass(), "signum", 1);
        setField(term11090, term11090.getClass(), "mag", null);
        setIntField(term11090, term11090.getClass(), "bitCountPlusOne", 0);
        setIntField(term11090, term11090.getClass(), "bitLengthPlusOne", 0);
        setIntField(term11090, term11090.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term11090, term11090.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term11089, term11089.getClass(), "intVal", term11090);
        setIntField(term11089, term11089.getClass(), "scale", 52);
        setIntField(term11089, term11089.getClass(), "precision", 0);
        setField(term11089, term11089.getClass(), "stringCache", null);
        setLongField(term11089, term11089.getClass(), "intCompact", -9223372036854775808L);
        setElement(term11088, 0, term11089);
        setIntField(term11100, term11100.getClass(), "signum", 1);
        setField(term11100, term11100.getClass(), "mag", null);
        setIntField(term11100, term11100.getClass(), "bitCountPlusOne", 0);
        setIntField(term11100, term11100.getClass(), "bitLengthPlusOne", 0);
        setIntField(term11100, term11100.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term11100, term11100.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term11099, term11099.getClass(), "intVal", term11100);
        setIntField(term11099, term11099.getClass(), "scale", 53);
        setIntField(term11099, term11099.getClass(), "precision", 0);
        setField(term11099, term11099.getClass(), "stringCache", null);
        setLongField(term11099, term11099.getClass(), "intCompact", -9223372036854775808L);
        setElement(term11088, 1, term11099);
        setIntField(term11110, term11110.getClass(), "signum", 1);
        setField(term11110, term11110.getClass(), "mag", null);
        setIntField(term11110, term11110.getClass(), "bitCountPlusOne", 0);
        setIntField(term11110, term11110.getClass(), "bitLengthPlusOne", 0);
        setIntField(term11110, term11110.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term11110, term11110.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term11109, term11109.getClass(), "intVal", term11110);
        setIntField(term11109, term11109.getClass(), "scale", 51);
        setIntField(term11109, term11109.getClass(), "precision", 0);
        setField(term11109, term11109.getClass(), "stringCache", null);
        setLongField(term11109, term11109.getClass(), "intCompact", -9223372036854775808L);
        setElement(term11088, 2, term11109);
        setIntField(term11120, term11120.getClass(), "signum", 1);
        setField(term11120, term11120.getClass(), "mag", null);
        setIntField(term11120, term11120.getClass(), "bitCountPlusOne", 0);
        setIntField(term11120, term11120.getClass(), "bitLengthPlusOne", 0);
        setIntField(term11120, term11120.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term11120, term11120.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term11119, term11119.getClass(), "intVal", term11120);
        setIntField(term11119, term11119.getClass(), "scale", 53);
        setIntField(term11119, term11119.getClass(), "precision", 0);
        setField(term11119, term11119.getClass(), "stringCache", null);
        setLongField(term11119, term11119.getClass(), "intCompact", -9223372036854775808L);
        setElement(term11088, 3, term11119);
        setIntField(term11130, term11130.getClass(), "signum", 1);
        setField(term11130, term11130.getClass(), "mag", null);
        setIntField(term11130, term11130.getClass(), "bitCountPlusOne", 0);
        setIntField(term11130, term11130.getClass(), "bitLengthPlusOne", 0);
        setIntField(term11130, term11130.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term11130, term11130.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term11129, term11129.getClass(), "intVal", term11130);
        setIntField(term11129, term11129.getClass(), "scale", 52);
        setIntField(term11129, term11129.getClass(), "precision", 0);
        setField(term11129, term11129.getClass(), "stringCache", null);
        setLongField(term11129, term11129.getClass(), "intCompact", -9223372036854775808L);
        setElement(term11088, 4, term11129);
        setIntField(term11140, term11140.getClass(), "signum", 1);
        setField(term11140, term11140.getClass(), "mag", null);
        setIntField(term11140, term11140.getClass(), "bitCountPlusOne", 0);
        setIntField(term11140, term11140.getClass(), "bitLengthPlusOne", 0);
        setIntField(term11140, term11140.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term11140, term11140.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term11139, term11139.getClass(), "intVal", term11140);
        setIntField(term11139, term11139.getClass(), "scale", 52);
        setIntField(term11139, term11139.getClass(), "precision", 0);
        setField(term11139, term11139.getClass(), "stringCache", null);
        setLongField(term11139, term11139.getClass(), "intCompact", -9223372036854775808L);
        setElement(term11088, 5, term11139);
        setIntField(term11150, term11150.getClass(), "signum", 1);
        setField(term11150, term11150.getClass(), "mag", null);
        setIntField(term11150, term11150.getClass(), "bitCountPlusOne", 0);
        setIntField(term11150, term11150.getClass(), "bitLengthPlusOne", 0);
        setIntField(term11150, term11150.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term11150, term11150.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term11149, term11149.getClass(), "intVal", term11150);
        setIntField(term11149, term11149.getClass(), "scale", 51);
        setIntField(term11149, term11149.getClass(), "precision", 0);
        setField(term11149, term11149.getClass(), "stringCache", null);
        setLongField(term11149, term11149.getClass(), "intCompact", -9223372036854775808L);
        setElement(term11088, 6, term11149);
        setElement(term11087, 0, term11088);
        setIntField(term11161, term11161.getClass(), "signum", 1);
        setField(term11161, term11161.getClass(), "mag", null);
        setIntField(term11161, term11161.getClass(), "bitCountPlusOne", 0);
        setIntField(term11161, term11161.getClass(), "bitLengthPlusOne", 0);
        setIntField(term11161, term11161.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term11161, term11161.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term11160, term11160.getClass(), "intVal", term11161);
        setIntField(term11160, term11160.getClass(), "scale", 52);
        setIntField(term11160, term11160.getClass(), "precision", 0);
        setField(term11160, term11160.getClass(), "stringCache", null);
        setLongField(term11160, term11160.getClass(), "intCompact", -9223372036854775808L);
        setElement(term11159, 0, term11160);
        setIntField(term11171, term11171.getClass(), "signum", 1);
        setField(term11171, term11171.getClass(), "mag", null);
        setIntField(term11171, term11171.getClass(), "bitCountPlusOne", 0);
        setIntField(term11171, term11171.getClass(), "bitLengthPlusOne", 0);
        setIntField(term11171, term11171.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term11171, term11171.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term11170, term11170.getClass(), "intVal", term11171);
        setIntField(term11170, term11170.getClass(), "scale", 53);
        setIntField(term11170, term11170.getClass(), "precision", 0);
        setField(term11170, term11170.getClass(), "stringCache", null);
        setLongField(term11170, term11170.getClass(), "intCompact", -9223372036854775808L);
        setElement(term11159, 1, term11170);
        setIntField(term11181, term11181.getClass(), "signum", 1);
        setField(term11181, term11181.getClass(), "mag", null);
        setIntField(term11181, term11181.getClass(), "bitCountPlusOne", 0);
        setIntField(term11181, term11181.getClass(), "bitLengthPlusOne", 0);
        setIntField(term11181, term11181.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term11181, term11181.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term11180, term11180.getClass(), "intVal", term11181);
        setIntField(term11180, term11180.getClass(), "scale", 53);
        setIntField(term11180, term11180.getClass(), "precision", 0);
        setField(term11180, term11180.getClass(), "stringCache", null);
        setLongField(term11180, term11180.getClass(), "intCompact", -9223372036854775808L);
        setElement(term11159, 2, term11180);
        setIntField(term11191, term11191.getClass(), "signum", 1);
        setField(term11191, term11191.getClass(), "mag", null);
        setIntField(term11191, term11191.getClass(), "bitCountPlusOne", 0);
        setIntField(term11191, term11191.getClass(), "bitLengthPlusOne", 0);
        setIntField(term11191, term11191.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term11191, term11191.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term11190, term11190.getClass(), "intVal", term11191);
        setIntField(term11190, term11190.getClass(), "scale", 53);
        setIntField(term11190, term11190.getClass(), "precision", 0);
        setField(term11190, term11190.getClass(), "stringCache", null);
        setLongField(term11190, term11190.getClass(), "intCompact", -9223372036854775808L);
        setElement(term11159, 3, term11190);
        setElement(term11087, 1, term11159);
        setField(term11086, term11086.getClass(), "data", term11087);
        setIntField(term11203, term11203.getClass(), "signum", 1);
        setField(term11203, term11203.getClass(), "mag", null);
        setIntField(term11203, term11203.getClass(), "bitCountPlusOne", 0);
        setIntField(term11203, term11203.getClass(), "bitLengthPlusOne", 0);
        setIntField(term11203, term11203.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term11203, term11203.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term11202, term11202.getClass(), "intVal", term11203);
        setIntField(term11202, term11202.getClass(), "scale", 53);
        setIntField(term11202, term11202.getClass(), "precision", 0);
        setField(term11202, term11202.getClass(), "stringCache", null);
        setLongField(term11202, term11202.getClass(), "intCompact", -9223372036854775808L);
        setElement(term11201, 0, term11202);
        setElement(term11200, 0, term11201);
        setElement(term11200, 1, term11212);
        setField(term11086, term11086.getClass(), "lu", term11200);
        setIntElement(term11213, 0, -344842608);
        setIntElement(term11213, 1, 941650513);
        setField(term11086, term11086.getClass(), "permutation", term11213);
        setIntField(term11086, term11086.getClass(), "parity", 1);
        setIntField(term11086, term11086.getClass(), "roundingMode", 4);
        setIntField(term11086, term11086.getClass(), "scale", 64);
        term11219 = (int[]) newIntArray(5);
        setIntElement(term11219, 0, 444029505);
        setIntElement(term11219, 1, -1034506028);
        setIntElement(term11219, 2, -1263114719);
        setIntElement(term11219, 3, -894662986);
        setIntElement(term11219, 4, 304775596);
        term11225 = (int[]) newIntArray(2);
        setIntElement(term11225, 0, -1347665717);
        setIntElement(term11225, 1, -1888585309);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.BigMatrixImpl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term11219;
        args[1] = term11225;
        try {
            callMethod(klass, "getSubMatrix", argTypes, term11086, args);
            assertTrue(false);
        }
        catch (MatrixIndexException e) {
        }

    }

};


