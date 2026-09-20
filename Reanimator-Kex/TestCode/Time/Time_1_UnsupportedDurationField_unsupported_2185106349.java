package org.joda.time.field;

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
import static org.joda.time.field.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.joda.time.field.EqualityUtils.*;
import java.lang.Object;
import java.lang.String;

public class UnsupportedDurationField_unsupported_2185106349 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64;
     Object term7115;
     Object term6907;

    public UnsupportedDurationField_unsupported_2185106349() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term64 = newInstance(Class.forName("org.joda.time.field.UnsupportedDurationField"));
        setField(term64, term64.getClass(), "iType", null);
        term7115 = newInstance(Class.forName("org.joda.time.field.UnsupportedDurationField"));
        setField(term7115, term7115.getClass(), "iType", null);
        Class<? extends Object> term6976 = Class.forName((String) "org.joda.time.chrono.BasicDayOfYearDateTimeField");
        Class<? extends Object> term6983 = Class.forName((String) "org.joda.time.ReadableDuration");
        Class<? extends Object> term6986 = Class.forName((String) "java.lang.System");
        Class<? extends Object> term6988 = Class.forName((String) "java.util.concurrent.ArrayBlockingQueue$Itr");
        Class<? extends Object> term6992 = Class.forName((String) "java.lang.invoke.VarHandleByteArrayAsDoubles$ArrayHandle");
        Class<? extends Object> term6996 = Class.forName((String) "kex.java.util.concurrent.atomic.AtomicReference");
        Class<? extends Object> term7002 = Class.forName((String) "java.lang.Exception");
        Class<? extends Object> term7007 = Class.forName((String) "java.util.HashMap$EntrySet");
        Class<? extends Object> term7011 = Class.forName((String) "org.joda.time.DateTime");
        Class<? extends Object> term7015 = Class.forName((String) "java.util.stream.ReferencePipeline$4$1");
        Class<? extends Object> term7019 = Class.forName((String) "java.io.RandomAccessFile$2");
        Class<? extends Object> term7023 = Class.forName((String) "java.util.stream.Nodes$ConcNode");
        Class<? extends Object> term7027 = Class.forName((String) "java.util.stream.DoublePipeline$7");
        Class<? extends Object> term7030 = Class.forName((String) "java.util.KeyValueHolder");
        Class<? extends Object> term7033 = Class.forName((String) "java.util.stream.ReferencePipeline$5$1");
        Class<? extends Object> term7036 = Class.forName((String) "java.util.stream.Stream");
        Class<? extends Object> term7039 = Class.forName((String) "java.util.concurrent.ConcurrentLinkedDeque$AbstractItr");
        Class<? extends Object> term7042 = Class.forName((String) "java.util.concurrent.Flow$Subscriber");
        Class<? extends Object> term7046 = Class.forName((String) "org.joda.time.format.DateTimeParserBucket$SavedField");
        term6907 = newInstance(Class.forName("java.lang.UnsupportedOperationException"));
        Object[] term6908 = (Object[]) newArray("java.lang.Object", 5);
        short[] term6909 = (short[]) newShortArray(32);
        int[] term6942 = (int[]) newIntArray(32);
        Object[] term6975 = (Object[]) newArray("java.lang.Object", 32);
        long[] term7050 = (long[]) newLongArray(32);
        Object[] term7110 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term7112 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setShortElement(term6909, 0, (short) 13);
        setShortElement(term6909, 1, (short) 3);
        setShortElement(term6909, 5, (short) 43);
        setShortElement(term6909, 6, (short) 2);
        setShortElement(term6909, 7, (short) 3);
        setShortElement(term6909, 11, (short) 2);
        setShortElement(term6909, 12, (short) 4);
        setShortElement(term6909, 13, (short) 4);
        setShortElement(term6909, 14, (short) 3);
        setShortElement(term6909, 15, (short) 4);
        setShortElement(term6909, 16, (short) 4);
        setShortElement(term6909, 17, (short) 1);
        setShortElement(term6909, 18, (short) 2);
        setShortElement(term6909, 19, (short) 3);
        setShortElement(term6909, 20, (short) 3);
        setShortElement(term6909, 21, (short) 13);
        setShortElement(term6909, 22, (short) 1);
        setShortElement(term6909, 23, (short) 2);
        setShortElement(term6909, 24, (short) 12);
        setElement(term6908, 0, term6909);
        setIntElement(term6942, 0, 42926080);
        setIntElement(term6942, 2, 6553600);
        setIntElement(term6942, 3, 393216);
        setIntElement(term6942, 4, 3866630);
        setIntElement(term6942, 5, 1245184);
        setIntElement(term6942, 6, 1638400);
        setIntElement(term6942, 8, 6553600);
        setIntElement(term6942, 9, 393216);
        setIntElement(term6942, 10, 3866630);
        setIntElement(term6942, 11, 14352384);
        setIntElement(term6942, 12, 10354688);
        setIntElement(term6942, 13, 2883584);
        setIntElement(term6942, 14, 786432);
        setIntElement(term6942, 15, 1441792);
        setIntElement(term6942, 16, 7733248);
        setIntElement(term6942, 17, 20774912);
        setIntElement(term6942, 18, 262144);
        setIntElement(term6942, 19, 2555904);
        setIntElement(term6942, 20, 1835008);
        setIntElement(term6942, 21, 6029312);
        setIntElement(term6942, 22, 327680);
        setIntElement(term6942, 23, 1638400);
        setIntElement(term6942, 24, 720907);
        setElement(term6908, 1, term6942);
        setElement(term6975, 0, term6976);
        setElement(term6975, 1, term6983);
        setElement(term6975, 2, term6983);
        setElement(term6975, 3, term6986);
        setElement(term6975, 4, term6988);
        setElement(term6975, 5, term6992);
        setElement(term6975, 6, term6996);
        setElement(term6975, 7, term6983);
        setElement(term6975, 8, term6983);
        setElement(term6975, 9, term6986);
        setElement(term6975, 10, term6988);
        setElement(term6975, 11, term7002);
        setElement(term6975, 12, term7007);
        setElement(term6975, 13, term7011);
        setElement(term6975, 14, term7015);
        setElement(term6975, 15, term7019);
        setElement(term6975, 16, term7011);
        setElement(term6975, 17, term7023);
        setElement(term6975, 18, term7027);
        setElement(term6975, 19, term7030);
        setElement(term6975, 20, term7033);
        setElement(term6975, 21, term7036);
        setElement(term6975, 22, term7039);
        setElement(term6975, 23, term7042);
        setElement(term6975, 24, term7046);
        setElement(term6908, 2, term6975);
        setLongElement(term7050, 0, 34363891800L);
        setLongElement(term7050, 1, 34364798256L);
        setLongElement(term7050, 2, 34363739368L);
        setLongElement(term7050, 3, 34363739368L);
        setLongElement(term7050, 4, 34363739368L);
        setLongElement(term7050, 5, 135122430468224L);
        setLongElement(term7050, 6, 34363820048L);
        setLongElement(term7050, 7, 34364798256L);
        setLongElement(term7050, 8, 34363739368L);
        setLongElement(term7050, 9, 34363739368L);
        setLongElement(term7050, 10, 34363739368L);
        setLongElement(term7050, 11, 135124408891568L);
        setLongElement(term7050, 12, 135124408960944L);
        setLongElement(term7050, 13, 135124406441952L);
        setLongElement(term7050, 14, 135124409079120L);
        setLongElement(term7050, 15, 135124406441952L);
        setLongElement(term7050, 16, 135124406441952L);
        setLongElement(term7050, 17, 34363745472L);
        setLongElement(term7050, 18, 34364710216L);
        setLongElement(term7050, 19, 34363745472L);
        setLongElement(term7050, 20, 34363745472L);
        setLongElement(term7050, 21, 34364896224L);
        setLongElement(term7050, 22, 34363745472L);
        setLongElement(term7050, 23, 34363745472L);
        setLongElement(term7050, 24, 34363745472L);
        setElement(term6908, 3, term7050);
        setField(term6907, term6907.getClass(), "backtrace", term6908);
        setField(term6907, term6907.getClass(), "detailMessage", "null field is unsupported");
        setField(term6907, term6907.getClass(), "cause", term6907);
        setField(term6907, term6907.getClass(), "stackTrace", term7110);
        setIntField(term6907, term6907.getClass(), "depth", 25);
        setIntField(term7112, term7112.getClass(), "modCount", 0);
        setField(term6907, term6907.getClass(), "suppressedExceptions", term7112);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.field.UnsupportedDurationField");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "unsupported", argTypes, term64, args);
        assertTrue(recursiveEquals(term64, term7115));
        assertTrue(recursiveEquals(retValue, term6907));
    }

};
