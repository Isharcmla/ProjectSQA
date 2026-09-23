package org.mockito.internal.verification;

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
import java.lang.IllegalArgumentException;
import static org.mockito.internal.verification.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class VerificationOverTimeImpl_handleVerifyException_209928001512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23;
     Object term30;

    public VerificationOverTimeImpl_handleVerifyException_209928001512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23 = newInstance(Class.forName("org.mockito.internal.verification.VerificationOverTimeImpl"));
        Object term27 = newInstance(Class.forName("org.mockito.internal.util.Timer"));
        setLongField(term23, term23.getClass(), "pollingPeriodMillis", -2813493605142626659L);
        setLongField(term23, term23.getClass(), "durationMillis", -8885298608300233488L);
        setField(term23, term23.getClass(), "delegate", null);
        setBooleanField(term23, term23.getClass(), "returnOnSuccess", false);
        setLongField(term27, term27.getClass(), "durationMillis", -4325723315152823407L);
        setLongField(term27, term27.getClass(), "startTime", 2535595959091595249L);
        setField(term23, term23.getClass(), "timer", term27);
        Class<? extends Object> term99 = Class.forName((String) "java.util.concurrent.CompletableFuture$UniExceptionally");
        Class<? extends Object> term102 = Class.forName((String) "java.lang.IllegalCallerException");
        Class<? extends Object> term104 = Class.forName((String) "java.util.concurrent.SynchronousQueue");
        Class<? extends Object> term108 = Class.forName((String) "java.util.stream.IntPipeline$4$1");
        Class<? extends Object> term113 = Class.forName((String) "java.util.regex.IntHashSet");
        Class<? extends Object> term117 = Class.forName((String) "org.mockito.cglib.core.DefaultNamingPolicy");
        Class<? extends Object> term121 = Class.forName((String) "org.mockito.exceptions.PrintableInvocation");
        Class<? extends Object> term125 = Class.forName((String) "org.assertj.core.condition.AllOf");
        Class<? extends Object> term129 = Class.forName((String) "java.util.concurrent.CompletionStage");
        Class<? extends Object> term133 = Class.forName((String) "java.util.spi.LocaleServiceProvider");
        Class<? extends Object> term137 = Class.forName((String) "java.math.BigDecimal$LongOverflow");
        Class<? extends Object> term141 = Class.forName((String) "org.assertj.core.error.ShouldContainExactly");
        Class<? extends Object> term145 = Class.forName((String) "org.mockito.asm.tree.LdcInsnNode");
        Class<? extends Object> term149 = Class.forName((String) "org.assertj.core.extractor.Extractors");
        Class<? extends Object> term151 = Class.forName((String) "java.nio.channels.FileChannel$MapMode");
        Class<? extends Object> term154 = Class.forName((String) "java.lang.ThreadLocal$ThreadLocalMap");
        Class<? extends Object> term156 = Class.forName((String) "java.util.stream.StreamSpliterators$UnorderedSliceSpliterator$OfDouble");
        Class<? extends Object> term158 = Class.forName((String) "org.hamcrest.core.IsNot");
        Class<? extends Object> term261 = Class.forName((String) "org.objectweb.asm.tree.analysis.BasicInterpreter");
        Class<? extends Object> term263 = Class.forName((String) "java.util.stream.LongStream$1");
        term30 = newInstance(Class.forName("java.lang.AssertionError"));
        Object[] term31 = (Object[]) newArray("java.lang.Object", 5);
        short[] term32 = (short[]) newShortArray(32);
        int[] term65 = (int[]) newIntArray(32);
        Object[] term98 = (Object[]) newArray("java.lang.Object", 32);
        long[] term160 = (long[]) newLongArray(32);
        Object[] term193 = (Object[]) newArray("java.lang.Object", 5);
        short[] term194 = (short[]) newShortArray(32);
        int[] term227 = (int[]) newIntArray(32);
        Object[] term260 = (Object[]) newArray("java.lang.Object", 32);
        long[] term265 = (long[]) newLongArray(32);
        Object[] term310 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term312 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setShortElement(term32, 0, (short) 1);
        setShortElement(term32, 1, (short) 2);
        setShortElement(term32, 2, (short) 1);
        setShortElement(term32, 3, (short) 7);
        setShortElement(term32, 4, (short) 2);
        setShortElement(term32, 5, (short) 1);
        setShortElement(term32, 6, (short) 6);
        setShortElement(term32, 7, (short) 2);
        setShortElement(term32, 8, (short) 10);
        setShortElement(term32, 9, (short) 11);
        setShortElement(term32, 10, (short) 29);
        setShortElement(term32, 11, (short) 5);
        setShortElement(term32, 12, (short) 4);
        setShortElement(term32, 13, (short) 6);
        setShortElement(term32, 14, (short) 8);
        setShortElement(term32, 15, (short) 6);
        setShortElement(term32, 16, (short) 9);
        setShortElement(term32, 17, (short) 10);
        setShortElement(term32, 18, (short) 11);
        setShortElement(term32, 19, (short) 4);
        setShortElement(term32, 20, (short) 1);
        setShortElement(term32, 22, (short) 10);
        setShortElement(term32, 23, (short) 3);
        setShortElement(term32, 24, (short) 4);
        setShortElement(term32, 25, (short) 9);
        setShortElement(term32, 26, (short) 1);
        setShortElement(term32, 27, (short) 2);
        setShortElement(term32, 28, (short) 3);
        setShortElement(term32, 29, (short) 3);
        setShortElement(term32, 30, (short) 13);
        setShortElement(term32, 31, (short) 1);
        setElement(term31, 0, term32);
        setIntElement(term65, 1, 5570560);
        setIntElement(term65, 2, 327680);
        setIntElement(term65, 3, 4456454);
        setIntElement(term65, 4, 1769472);
        setIntElement(term65, 5, 14876672);
        setIntElement(term65, 6, 6225920);
        setIntElement(term65, 7, 917504);
        setIntElement(term65, 8, 327680);
        setIntElement(term65, 9, 8519680);
        setIntElement(term65, 10, 917504);
        setIntElement(term65, 11, 11993088);
        setIntElement(term65, 12, 655360);
        setIntElement(term65, 13, 7864320);
        setIntElement(term65, 14, 3735552);
        setIntElement(term65, 15, 7143424);
        setIntElement(term65, 16, 8454144);
        setIntElement(term65, 17, 9240576);
        setIntElement(term65, 18, 196608);
        setIntElement(term65, 19, 3801088);
        setIntElement(term65, 20, 786432);
        setIntElement(term65, 21, 589824);
        setIntElement(term65, 22, 17170432);
        setIntElement(term65, 23, 1376256);
        setIntElement(term65, 24, 5242880);
        setIntElement(term65, 25, 2883584);
        setIntElement(term65, 26, 20774912);
        setIntElement(term65, 27, 262144);
        setIntElement(term65, 28, 2555904);
        setIntElement(term65, 29, 1835008);
        setIntElement(term65, 30, 6029312);
        setIntElement(term65, 31, 327680);
        setElement(term31, 1, term65);
        setElement(term98, 0, term99);
        setElement(term98, 1, term99);
        setElement(term98, 2, term102);
        setElement(term98, 3, term104);
        setElement(term98, 4, term108);
        setElement(term98, 5, term108);
        setElement(term98, 6, term113);
        setElement(term98, 7, term113);
        setElement(term98, 8, term117);
        setElement(term98, 9, term117);
        setElement(term98, 10, term117);
        setElement(term98, 11, term117);
        setElement(term98, 12, term117);
        setElement(term98, 13, term121);
        setElement(term98, 14, term121);
        setElement(term98, 15, term125);
        setElement(term98, 16, term125);
        setElement(term98, 17, term125);
        setElement(term98, 18, term125);
        setElement(term98, 19, term129);
        setElement(term98, 20, term129);
        setElement(term98, 21, term129);
        setElement(term98, 22, term133);
        setElement(term98, 23, term125);
        setElement(term98, 24, term137);
        setElement(term98, 25, term141);
        setElement(term98, 26, term145);
        setElement(term98, 27, term149);
        setElement(term98, 28, term151);
        setElement(term98, 29, term154);
        setElement(term98, 30, term156);
        setElement(term98, 31, term158);
        setElement(term31, 2, term98);
        setLongElement(term160, 0, 34363746224L);
        setLongElement(term160, 1, 34363775512L);
        setLongElement(term160, 2, 34363775512L);
        setLongElement(term160, 3, 34363775512L);
        setLongElement(term160, 4, 130205226553424L);
        setLongElement(term160, 5, 34364440080L);
        setLongElement(term160, 6, 130205226627856L);
        setLongElement(term160, 7, 130205225965216L);
        setLongElement(term160, 8, 130205225965104L);
        setLongElement(term160, 9, 130205225965248L);
        setLongElement(term160, 10, 130205226514304L);
        setLongElement(term160, 11, 34363766248L);
        setLongElement(term160, 12, 34363766248L);
        setLongElement(term160, 13, 130202170760944L);
        setLongElement(term160, 14, 130202170760944L);
        setLongElement(term160, 15, 130202170760800L);
        setLongElement(term160, 16, 130202170771904L);
        setLongElement(term160, 17, 130202170773552L);
        setLongElement(term160, 18, 130202170774320L);
        setLongElement(term160, 19, 130202167746608L);
        setLongElement(term160, 20, 34363739368L);
        setLongElement(term160, 21, 34363739368L);
        setLongElement(term160, 22, 130202170759440L);
        setLongElement(term160, 23, 34363829248L);
        setLongElement(term160, 24, 130202167746608L);
        setLongElement(term160, 25, 130205249897920L);
        setLongElement(term160, 26, 34363745472L);
        setLongElement(term160, 27, 34364710216L);
        setLongElement(term160, 28, 34363745472L);
        setLongElement(term160, 29, 34363745472L);
        setLongElement(term160, 30, 34364896224L);
        setLongElement(term160, 31, 34363745472L);
        setElement(term31, 3, term160);
        setShortElement(term194, 0, (short) 2);
        setShortElement(term194, 1, (short) 12);
        setElement(term193, 0, term194);
        setIntElement(term227, 0, 1638400);
        setIntElement(term227, 1, 720907);
        setElement(term193, 1, term227);
        setElement(term260, 0, term261);
        setElement(term260, 1, term263);
        setElement(term193, 2, term260);
        setLongElement(term265, 0, 34363745472L);
        setLongElement(term265, 1, 34363745472L);
        setElement(term193, 3, term265);
        setElement(term31, 4, term193);
        setField(term30, term30.getClass(), "backtrace", term31);
        setField(term30, term30.getClass(), "detailMessage", "PAEBtnZtTD");
        setField(term30, term30.getClass(), "cause", term30);
        setField(term30, term30.getClass(), "stackTrace", term310);
        setIntField(term30, term30.getClass(), "depth", 34);
        setIntField(term312, term312.getClass(), "modCount", 0);
        setField(term30, term30.getClass(), "suppressedExceptions", term312);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.verification.VerificationOverTimeImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.AssertionError");
        Object[] args = new Object[1];
        args[0] = term30;
        try {
            callMethod(klass, "handleVerifyException", argTypes, term23, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


