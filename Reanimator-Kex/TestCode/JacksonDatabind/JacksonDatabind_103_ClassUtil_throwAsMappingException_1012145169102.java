package com.fasterxml.jackson.databind.util;

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
import java.lang.NullPointerException;
import static com.fasterxml.jackson.databind.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class ClassUtil_throwAsMappingException_1012145169102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22631;

    public ClassUtil_throwAsMappingException_1012145169102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term22700 = Class.forName((String) "java.lang.IllegalThreadStateException");
        Class<? extends Object> term22703 = Class.forName((String) "java.nio.DirectCharBufferRU");
        Class<? extends Object> term22705 = Class.forName((String) "com.fasterxml.jackson.databind.deser.DeserializerCache");
        Class<? extends Object> term22709 = Class.forName((String) "com.fasterxml.jackson.core.JsonStreamContext");
        Class<? extends Object> term22714 = Class.forName((String) "java.lang.invoke.AbstractConstantGroup$AsList");
        Class<? extends Object> term22718 = Class.forName((String) "java.util.Vector$ListItr");
        Class<? extends Object> term22722 = Class.forName((String) "java.lang.invoke.SwitchPoint");
        Class<? extends Object> term22726 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonIgnoreProperties$Value");
        Class<? extends Object> term22730 = Class.forName((String) "java.nio.channels.SelectionKey");
        Class<? extends Object> term22734 = Class.forName((String) "java.util.stream.Nodes$SpinedNodeBuilder");
        Class<? extends Object> term22738 = Class.forName((String) "java.io.ObjectInputStream$PeekInputStream");
        Class<? extends Object> term22742 = Class.forName((String) "java.util.Timer$1");
        Class<? extends Object> term22746 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonFormat$Shape");
        Class<? extends Object> term22750 = Class.forName((String) "java.lang.invoke.VarHandleByteArrayAsDoubles$ByteArrayViewVarHandle");
        Class<? extends Object> term22753 = Class.forName((String) "java.util.stream.Nodes$IntArrayNode");
        Class<? extends Object> term22756 = Class.forName((String) "java.lang.invoke.VarHandleLongs$FieldStaticReadWrite");
        Class<? extends Object> term22759 = Class.forName((String) "com.fasterxml.jackson.annotation.JacksonInject$Value");
        Class<? extends Object> term22762 = Class.forName((String) "com.fasterxml.jackson.databind.ser.std.CollectionSerializer");
        Class<? extends Object> term22866 = Class.forName((String) "java.lang.VerifyError");
        Class<? extends Object> term22868 = Class.forName((String) "java.util.stream.SortedOps$SizedIntSortingSink");
        term22631 = newInstance(Class.forName("java.io.IOException"));
        Object[] term22632 = (Object[]) newArray("java.lang.Object", 5);
        short[] term22633 = (short[]) newShortArray(32);
        int[] term22666 = (int[]) newIntArray(32);
        Object[] term22699 = (Object[]) newArray("java.lang.Object", 32);
        long[] term22765 = (long[]) newLongArray(32);
        Object[] term22798 = (Object[]) newArray("java.lang.Object", 5);
        short[] term22799 = (short[]) newShortArray(32);
        int[] term22832 = (int[]) newIntArray(32);
        Object[] term22865 = (Object[]) newArray("java.lang.Object", 32);
        long[] term22870 = (long[]) newLongArray(32);
        Object[] term22915 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term22917 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setShortElement(term22633, 0, (short) 1);
        setShortElement(term22633, 1, (short) 2);
        setShortElement(term22633, 2, (short) 1);
        setShortElement(term22633, 3, (short) 7);
        setShortElement(term22633, 4, (short) 2);
        setShortElement(term22633, 5, (short) 1);
        setShortElement(term22633, 6, (short) 6);
        setShortElement(term22633, 7, (short) 2);
        setShortElement(term22633, 8, (short) 10);
        setShortElement(term22633, 9, (short) 11);
        setShortElement(term22633, 10, (short) 29);
        setShortElement(term22633, 11, (short) 5);
        setShortElement(term22633, 12, (short) 4);
        setShortElement(term22633, 13, (short) 6);
        setShortElement(term22633, 14, (short) 8);
        setShortElement(term22633, 15, (short) 6);
        setShortElement(term22633, 16, (short) 9);
        setShortElement(term22633, 17, (short) 10);
        setShortElement(term22633, 18, (short) 11);
        setShortElement(term22633, 19, (short) 4);
        setShortElement(term22633, 20, (short) 1);
        setShortElement(term22633, 22, (short) 10);
        setShortElement(term22633, 23, (short) 3);
        setShortElement(term22633, 24, (short) 4);
        setShortElement(term22633, 25, (short) 9);
        setShortElement(term22633, 26, (short) 1);
        setShortElement(term22633, 27, (short) 2);
        setShortElement(term22633, 28, (short) 3);
        setShortElement(term22633, 29, (short) 3);
        setShortElement(term22633, 30, (short) 13);
        setShortElement(term22633, 31, (short) 1);
        setElement(term22632, 0, term22633);
        setIntElement(term22666, 1, 5570560);
        setIntElement(term22666, 2, 327680);
        setIntElement(term22666, 3, 4456454);
        setIntElement(term22666, 4, 1769472);
        setIntElement(term22666, 5, 14876672);
        setIntElement(term22666, 6, 6225920);
        setIntElement(term22666, 7, 917504);
        setIntElement(term22666, 8, 327680);
        setIntElement(term22666, 9, 8519680);
        setIntElement(term22666, 10, 917504);
        setIntElement(term22666, 11, 11993088);
        setIntElement(term22666, 12, 655360);
        setIntElement(term22666, 13, 7864320);
        setIntElement(term22666, 14, 3735552);
        setIntElement(term22666, 15, 7143424);
        setIntElement(term22666, 16, 8454144);
        setIntElement(term22666, 17, 9240576);
        setIntElement(term22666, 18, 196608);
        setIntElement(term22666, 19, 3801088);
        setIntElement(term22666, 20, 786432);
        setIntElement(term22666, 21, 589824);
        setIntElement(term22666, 22, 17170432);
        setIntElement(term22666, 23, 1376256);
        setIntElement(term22666, 24, 5242880);
        setIntElement(term22666, 25, 2883584);
        setIntElement(term22666, 26, 20774912);
        setIntElement(term22666, 27, 262144);
        setIntElement(term22666, 28, 2555904);
        setIntElement(term22666, 29, 1835008);
        setIntElement(term22666, 30, 6029312);
        setIntElement(term22666, 31, 327680);
        setElement(term22632, 1, term22666);
        setElement(term22699, 0, term22700);
        setElement(term22699, 1, term22700);
        setElement(term22699, 2, term22703);
        setElement(term22699, 3, term22705);
        setElement(term22699, 4, term22709);
        setElement(term22699, 5, term22709);
        setElement(term22699, 6, term22714);
        setElement(term22699, 7, term22714);
        setElement(term22699, 8, term22718);
        setElement(term22699, 9, term22718);
        setElement(term22699, 10, term22718);
        setElement(term22699, 11, term22718);
        setElement(term22699, 12, term22718);
        setElement(term22699, 13, term22722);
        setElement(term22699, 14, term22722);
        setElement(term22699, 15, term22726);
        setElement(term22699, 16, term22726);
        setElement(term22699, 17, term22726);
        setElement(term22699, 18, term22726);
        setElement(term22699, 19, term22730);
        setElement(term22699, 20, term22730);
        setElement(term22699, 21, term22730);
        setElement(term22699, 22, term22734);
        setElement(term22699, 23, term22726);
        setElement(term22699, 24, term22738);
        setElement(term22699, 25, term22742);
        setElement(term22699, 26, term22746);
        setElement(term22699, 27, term22750);
        setElement(term22699, 28, term22753);
        setElement(term22699, 29, term22756);
        setElement(term22699, 30, term22759);
        setElement(term22699, 31, term22762);
        setElement(term22632, 2, term22699);
        setLongElement(term22765, 0, 34363746224L);
        setLongElement(term22765, 1, 34363775512L);
        setLongElement(term22765, 2, 34363775512L);
        setLongElement(term22765, 3, 34363775512L);
        setLongElement(term22765, 4, 131482375099808L);
        setLongElement(term22765, 5, 34364440080L);
        setLongElement(term22765, 6, 131482375166912L);
        setLongElement(term22765, 7, 131482375009648L);
        setLongElement(term22765, 8, 131482375009536L);
        setLongElement(term22765, 9, 131482375009680L);
        setLongElement(term22765, 10, 131482375053392L);
        setLongElement(term22765, 11, 34363766248L);
        setLongElement(term22765, 12, 34363766248L);
        setLongElement(term22765, 13, 131478873767568L);
        setLongElement(term22765, 14, 131478873767568L);
        setLongElement(term22765, 15, 131478873767424L);
        setLongElement(term22765, 16, 131478873811328L);
        setLongElement(term22765, 17, 131478873812976L);
        setLongElement(term22765, 18, 131478873813744L);
        setLongElement(term22765, 19, 131482377128080L);
        setLongElement(term22765, 20, 34363739368L);
        setLongElement(term22765, 21, 34363739368L);
        setLongElement(term22765, 22, 131478873766064L);
        setLongElement(term22765, 23, 34363829248L);
        setLongElement(term22765, 24, 131482377128080L);
        setLongElement(term22765, 25, 131482377482976L);
        setLongElement(term22765, 26, 34363745472L);
        setLongElement(term22765, 27, 34364710216L);
        setLongElement(term22765, 28, 34363745472L);
        setLongElement(term22765, 29, 34363745472L);
        setLongElement(term22765, 30, 34364896224L);
        setLongElement(term22765, 31, 34363745472L);
        setElement(term22632, 3, term22765);
        setShortElement(term22799, 0, (short) 2);
        setShortElement(term22799, 1, (short) 12);
        setElement(term22798, 0, term22799);
        setIntElement(term22832, 0, 1638400);
        setIntElement(term22832, 1, 720907);
        setElement(term22798, 1, term22832);
        setElement(term22865, 0, term22866);
        setElement(term22865, 1, term22868);
        setElement(term22798, 2, term22865);
        setLongElement(term22870, 0, 34363745472L);
        setLongElement(term22870, 1, 34363745472L);
        setElement(term22798, 3, term22870);
        setElement(term22632, 4, term22798);
        setField(term22631, term22631.getClass(), "backtrace", term22632);
        setField(term22631, term22631.getClass(), "detailMessage", "xOEqzGAmDU");
        setField(term22631, term22631.getClass(), "cause", term22631);
        setField(term22631, term22631.getClass(), "stackTrace", term22915);
        setIntField(term22631, term22631.getClass(), "depth", 34);
        setIntField(term22917, term22917.getClass(), "modCount", 0);
        setField(term22631, term22631.getClass(), "suppressedExceptions", term22917);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.util.ClassUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        argTypes[1] = Class.forName("java.io.IOException");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term22631;
        try {
            callMethod(klass, "throwAsMappingException", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


