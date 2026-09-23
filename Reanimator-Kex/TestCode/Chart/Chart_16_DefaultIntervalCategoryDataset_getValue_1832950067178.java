package org.jfree.data.category;

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
import org.jfree.data.UnknownKeyException;
import static org.jfree.data.category.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class DefaultIntervalCategoryDataset_getValue_1832950067178 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63459;
     Object enum69;

    public DefaultIntervalCategoryDataset_getValue_1832950067178() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term66000 = Class.forName((String) "java.util.Formatter$BigDecimalLayoutForm");
        Field term65999 = ((Class) term66000).getDeclaredField((String) "SCIENTIFIC");
        ((Field) term65999).setAccessible(true);
        Object enum66 = ((Field) term65999).get((Object) null);
        Class<? extends Object> term66237 = Class.forName((String) "java.nio.file.attribute.AclEntryFlag");
        Field term66236 = ((Class) term66237).getDeclaredField((String) "FILE_INHERIT");
        ((Field) term66236).setAccessible(true);
        Object enum67 = ((Field) term66236).get((Object) null);
        Class<? extends Object> term66460 = Class.forName((String) "java.util.stream.StreamSpliterators$UnorderedSliceSpliterator$PermitStatus");
        Field term66459 = ((Class) term66460).getDeclaredField((String) "NO_MORE");
        ((Field) term66459).setAccessible(true);
        Object enum68 = ((Field) term66459).get((Object) null);
        term63459 = newInstance(Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        Object[] term62945 = (Object[]) newArray("java.lang.Comparable", 42);
        Object term63681 = newInstance(Class.forName("java.nio.DirectCharBufferU"));
        Object term63751 = newInstance(Class.forName("java.nio.ByteBufferAsLongBufferB"));
        Object term63805 = newInstance(Class.forName("org.jfree.data.time.Hour"));
        Object term63851 = newInstance(Class.forName("java.math.BigDecimal"));
        setElement(term62945, 0, enum66);
        setElement(term62945, 1, enum67);
        setElement(term62945, 2, term63681);
        setElement(term62945, 3, enum66);
        setElement(term62945, 4, enum66);
        setElement(term62945, 5, enum66);
        setElement(term62945, 6, term63751);
        setElement(term62945, 7, term63805);
        setElement(term62945, 8, term63851);
        setElement(term62945, 9, term63851);
        setElement(term62945, 10, term63851);
        setElement(term62945, 11, term63851);
        setElement(term62945, 12, term63851);
        setElement(term62945, 13, term63851);
        setElement(term62945, 14, term63851);
        setElement(term62945, 15, enum68);
        setElement(term62945, 16, term63851);
        setElement(term62945, 17, term63851);
        setElement(term62945, 18, term63851);
        setElement(term62945, 19, term63851);
        setElement(term62945, 20, term63851);
        setElement(term62945, 21, term63851);
        setElement(term62945, 22, term63851);
        setElement(term62945, 23, term63851);
        setElement(term62945, 24, term63851);
        setElement(term62945, 25, term63851);
        setElement(term62945, 26, term63851);
        setElement(term62945, 27, term63851);
        setElement(term62945, 28, term63851);
        setElement(term62945, 29, term63851);
        setElement(term62945, 30, term63851);
        setElement(term62945, 31, term63851);
        setElement(term62945, 32, term63851);
        setElement(term62945, 33, term63851);
        setElement(term62945, 34, term63851);
        setElement(term62945, 35, term63851);
        setElement(term62945, 36, term63851);
        setElement(term62945, 37, term63851);
        setElement(term62945, 38, term63851);
        setElement(term62945, 39, term63851);
        setElement(term62945, 40, term63851);
        setElement(term62945, 41, term63851);
        setField(term63459, term63459.getClass(), "seriesKeys", term62945);
        Class<? extends Object> term66858 = Class.forName((String) "java.util.stream.Collector$Characteristics");
        Field term66857 = ((Class) term66858).getDeclaredField((String) "CONCURRENT");
        ((Field) term66857).setAccessible(true);
        enum69 = ((Field) term66857).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Comparable");
        argTypes[1] = Class.forName("java.lang.Comparable");
        Object[] args = new Object[2];
        args[0] = enum69;
        args[1] = null;
        try {
            callMethod(klass, "getValue", argTypes, term63459, args);
            assertTrue(false);
        }
        catch (UnknownKeyException e) {
        }

    }

};


