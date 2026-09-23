package org.mockito.exceptions;

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
import static org.mockito.exceptions.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class Reporter_tooLittleActualInvocations_84106525679 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22818;
     Object term22819;
     Object term22822;

    public Reporter_tooLittleActualInvocations_84106525679() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22818 = newInstance(Class.forName("org.mockito.exceptions.Reporter"));
        term22819 = newInstance(Class.forName("org.mockito.exceptions.Discrepancy"));
        setIntField(term22819, term22819.getClass(), "wantedCount", 1725571209);
        setIntField(term22819, term22819.getClass(), "actualCount", -522618178);
        Class<? extends Object> term22892 = Class.forName((String) "java.lang.invoke.VarHandleDoubles$FieldInstanceReadWrite");
        Class<? extends Object> term22894 = Class.forName((String) "java.util.ArrayList$SubList");
        Class<? extends Object> term22896 = Class.forName((String) "java.nio.file.FileChannelLinesSpliterator$1");
        Class<? extends Object> term22898 = Class.forName((String) "java.io.ObjectOutputStream$ReplaceTable");
        Class<? extends Object> term22900 = Class.forName((String) "java.util.concurrent.CancellationException");
        Class<? extends Object> term22902 = Class.forName((String) "net.sourceforge.cobertura.instrument.Main$1");
        Class<? extends Object> term22904 = Class.forName((String) "java.nio.ByteBufferAsShortBufferL");
        Class<? extends Object> term22906 = Class.forName((String) "org.hamcrest.collection.IsArrayWithSize");
        Class<? extends Object> term22908 = Class.forName((String) "org.mockito.cglib.core.DebuggingClassWriter$1");
        Class<? extends Object> term22910 = Class.forName((String) "kex.java.util.ArrayList$ListItr");
        Class<? extends Object> term22912 = Class.forName((String) "java.nio.file.attribute.FileTime");
        Class<? extends Object> term22914 = Class.forName((String) "java.nio.DirectCharBufferU");
        Class<? extends Object> term22916 = Class.forName((String) "java.util.HashMap");
        Class<? extends Object> term22918 = Class.forName((String) "java.lang.ClassLoader$ParallelLoaders");
        Class<? extends Object> term22920 = Class.forName((String) "net.sourceforge.cobertura.instrument.CoberturaClassWriter");
        Class<? extends Object> term22922 = Class.forName((String) "kex.java.util.LinkedHashSet");
        Class<? extends Object> term22924 = Class.forName((String) "java.nio.file.FileSystems");
        term22822 = newInstance(Class.forName("org.mockito.internal.debugging.Location"));
        Object term22823 = newInstance(Class.forName("java.lang.Throwable"));
        Object[] term22824 = (Object[]) newArray("java.lang.Object", 5);
        short[] term22825 = (short[]) newShortArray(32);
        int[] term22858 = (int[]) newIntArray(32);
        Object[] term22891 = (Object[]) newArray("java.lang.Object", 32);
        long[] term22926 = (long[]) newLongArray(32);
        Object[] term22959 = (Object[]) newArray("java.lang.Object", 5);
        short[] term22960 = (short[]) newShortArray(32);
        int[] term22993 = (int[]) newIntArray(32);
        Object[] term23026 = (Object[]) newArray("java.lang.Object", 32);
        long[] term23027 = (long[]) newLongArray(32);
        Object[] term23060 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term23062 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        Object term23064 = newInstance(Class.forName("org.mockito.internal.exceptions.base.StackTraceFilter"));
        setShortElement(term22825, 0, (short) 1);
        setShortElement(term22825, 2, (short) 1);
        setShortElement(term22825, 3, (short) 2);
        setShortElement(term22825, 4, (short) 1);
        setShortElement(term22825, 5, (short) 7);
        setShortElement(term22825, 6, (short) 2);
        setShortElement(term22825, 7, (short) 1);
        setShortElement(term22825, 8, (short) 6);
        setShortElement(term22825, 9, (short) 2);
        setShortElement(term22825, 10, (short) 10);
        setShortElement(term22825, 11, (short) 11);
        setShortElement(term22825, 12, (short) 29);
        setShortElement(term22825, 13, (short) 5);
        setShortElement(term22825, 14, (short) 4);
        setShortElement(term22825, 15, (short) 4);
        setShortElement(term22825, 16, (short) 3);
        setShortElement(term22825, 17, (short) 5);
        setShortElement(term22825, 18, (short) 9);
        setShortElement(term22825, 19, (short) 10);
        setShortElement(term22825, 20, (short) 11);
        setShortElement(term22825, 21, (short) 4);
        setShortElement(term22825, 22, (short) 1);
        setShortElement(term22825, 24, (short) 10);
        setShortElement(term22825, 25, (short) 3);
        setShortElement(term22825, 26, (short) 4);
        setShortElement(term22825, 27, (short) 9);
        setShortElement(term22825, 28, (short) 1);
        setShortElement(term22825, 29, (short) 2);
        setShortElement(term22825, 30, (short) 3);
        setShortElement(term22825, 31, (short) 3);
        setElement(term22824, 0, term22825);
        setIntElement(term22858, 0, 917504);
        setIntElement(term22858, 1, 524288);
        setIntElement(term22858, 3, 5570560);
        setIntElement(term22858, 4, 327680);
        setIntElement(term22858, 5, 4456454);
        setIntElement(term22858, 6, 1769472);
        setIntElement(term22858, 7, 14876672);
        setIntElement(term22858, 8, 6225920);
        setIntElement(term22858, 9, 917504);
        setIntElement(term22858, 10, 327680);
        setIntElement(term22858, 11, 8519680);
        setIntElement(term22858, 12, 917504);
        setIntElement(term22858, 13, 11993088);
        setIntElement(term22858, 14, 655360);
        setIntElement(term22858, 15, 7864320);
        setIntElement(term22858, 16, 3735552);
        setIntElement(term22858, 17, 7143424);
        setIntElement(term22858, 18, 8454144);
        setIntElement(term22858, 19, 9240576);
        setIntElement(term22858, 20, 196608);
        setIntElement(term22858, 21, 3801088);
        setIntElement(term22858, 22, 786432);
        setIntElement(term22858, 23, 589824);
        setIntElement(term22858, 24, 17170432);
        setIntElement(term22858, 25, 1376256);
        setIntElement(term22858, 26, 5242880);
        setIntElement(term22858, 27, 2883584);
        setIntElement(term22858, 28, 20774912);
        setIntElement(term22858, 29, 262144);
        setIntElement(term22858, 30, 2555904);
        setIntElement(term22858, 31, 1835008);
        setElement(term22824, 1, term22858);
        setElement(term22891, 0, term22892);
        setElement(term22891, 1, term22892);
        setElement(term22891, 2, term22894);
        setElement(term22891, 3, term22894);
        setElement(term22891, 4, term22896);
        setElement(term22891, 5, term22898);
        setElement(term22891, 6, term22900);
        setElement(term22891, 7, term22900);
        setElement(term22891, 8, term22902);
        setElement(term22891, 9, term22902);
        setElement(term22891, 10, term22904);
        setElement(term22891, 11, term22904);
        setElement(term22891, 12, term22904);
        setElement(term22891, 13, term22904);
        setElement(term22891, 14, term22904);
        setElement(term22891, 15, term22906);
        setElement(term22891, 16, term22906);
        setElement(term22891, 17, term22908);
        setElement(term22891, 18, term22908);
        setElement(term22891, 19, term22908);
        setElement(term22891, 20, term22908);
        setElement(term22891, 21, term22910);
        setElement(term22891, 22, term22910);
        setElement(term22891, 23, term22910);
        setElement(term22891, 24, term22912);
        setElement(term22891, 25, term22908);
        setElement(term22891, 26, term22914);
        setElement(term22891, 27, term22916);
        setElement(term22891, 28, term22918);
        setElement(term22891, 29, term22920);
        setElement(term22891, 30, term22922);
        setElement(term22891, 31, term22924);
        setElement(term22824, 2, term22891);
        setLongElement(term22926, 0, 34363745304L);
        setLongElement(term22926, 1, 34363745304L);
        setLongElement(term22926, 2, 34363746224L);
        setLongElement(term22926, 3, 34363775512L);
        setLongElement(term22926, 4, 34363775512L);
        setLongElement(term22926, 5, 34363775512L);
        setLongElement(term22926, 6, 128809362246416L);
        setLongElement(term22926, 7, 34364440080L);
        setLongElement(term22926, 8, 128809362321008L);
        setLongElement(term22926, 9, 128809362085936L);
        setLongElement(term22926, 10, 128809362085824L);
        setLongElement(term22926, 11, 128809362085968L);
        setLongElement(term22926, 12, 128809362207296L);
        setLongElement(term22926, 13, 34363766248L);
        setLongElement(term22926, 14, 34363766248L);
        setLongElement(term22926, 15, 128806364538672L);
        setLongElement(term22926, 16, 128806364538672L);
        setLongElement(term22926, 17, 128806364538528L);
        setLongElement(term22926, 18, 128806364549760L);
        setLongElement(term22926, 19, 128806364551280L);
        setLongElement(term22926, 20, 128806364552048L);
        setLongElement(term22926, 21, 128806361950816L);
        setLongElement(term22926, 22, 34363739368L);
        setLongElement(term22926, 23, 34363739368L);
        setLongElement(term22926, 24, 128806364546688L);
        setLongElement(term22926, 25, 34363829248L);
        setLongElement(term22926, 26, 128806361950816L);
        setLongElement(term22926, 27, 128809410801520L);
        setLongElement(term22926, 28, 34363745472L);
        setLongElement(term22926, 29, 34364710216L);
        setLongElement(term22926, 30, 34363745472L);
        setLongElement(term22926, 31, 34363745472L);
        setElement(term22824, 3, term22926);
        setShortElement(term22960, 0, (short) 13);
        setShortElement(term22960, 1, (short) 1);
        setShortElement(term22960, 2, (short) 2);
        setShortElement(term22960, 3, (short) 12);
        setElement(term22959, 0, term22960);
        setIntElement(term22993, 0, 6029312);
        setIntElement(term22993, 1, 327680);
        setIntElement(term22993, 2, 1638400);
        setIntElement(term22993, 3, 720907);
        setElement(term22959, 1, term22993);
        setElement(term22959, 2, term23026);
        setLongElement(term23027, 0, 34364896224L);
        setLongElement(term23027, 1, 34363745472L);
        setLongElement(term23027, 2, 34363745472L);
        setLongElement(term23027, 3, 34363745472L);
        setElement(term22959, 3, term23027);
        setElement(term22824, 4, term22959);
        setField(term22823, term22823.getClass(), "backtrace", term22824);
        setField(term22823, term22823.getClass(), "detailMessage", null);
        setField(term22823, term22823.getClass(), "cause", term22823);
        setField(term22823, term22823.getClass(), "stackTrace", term23060);
        setIntField(term22823, term22823.getClass(), "depth", 36);
        setIntField(term23062, term23062.getClass(), "modCount", 0);
        setField(term22823, term22823.getClass(), "suppressedExceptions", term23062);
        setField(term22822, term22822.getClass(), "stackTraceHolder", term22823);
        setField(term22822, term22822.getClass(), "stackTraceFilter", term23064);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.exceptions.Reporter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.mockito.exceptions.Discrepancy");
        argTypes[1] = Class.forName("org.mockito.exceptions.PrintableInvocation");
        argTypes[2] = Class.forName("org.mockito.internal.debugging.Location");
        Object[] args = new Object[3];
        args[0] = term22819;
        args[1] = null;
        args[2] = term22822;
        try {
            callMethod(klass, "tooLittleActualInvocations", argTypes, term22818, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


