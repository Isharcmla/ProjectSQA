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

public class Reporter_createTooLittleInvocationsMessage_29232475278 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20326;
     Object term20327;
     Object term20330;

    public Reporter_createTooLittleInvocationsMessage_29232475278() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20326 = newInstance(Class.forName("org.mockito.exceptions.Reporter"));
        term20327 = newInstance(Class.forName("org.mockito.exceptions.Discrepancy"));
        setIntField(term20327, term20327.getClass(), "wantedCount", 1227103734);
        setIntField(term20327, term20327.getClass(), "actualCount", -1339778481);
        Class<? extends Object> term20400 = Class.forName((String) "org.objectweb.asm.xml.ASMContentHandler$MethodRule");
        Class<? extends Object> term20402 = Class.forName((String) "java.util.Formatter$Flags");
        Class<? extends Object> term20404 = Class.forName((String) "java.lang.ProcessImpl$Platform");
        Class<? extends Object> term20406 = Class.forName((String) "java.io.ByteArrayOutputStream");
        Class<? extends Object> term20408 = Class.forName((String) "java.lang.Throwable");
        Class<? extends Object> term20410 = Class.forName((String) "java.util.Formatter$BigDecimalLayoutForm");
        Class<? extends Object> term20412 = Class.forName((String) "java.util.stream.LongPipeline$6$1");
        Class<? extends Object> term20414 = Class.forName((String) "java.util.stream.Streams$IntStreamBuilderImpl");
        Class<? extends Object> term20416 = Class.forName((String) "java.lang.IllegalThreadStateException");
        Class<? extends Object> term20418 = Class.forName((String) "java.lang.Module$1");
        Class<? extends Object> term20420 = Class.forName((String) "org.objectweb.asm.xml.ASMContentHandler$LocalVariableAnnotationRule");
        Class<? extends Object> term20422 = Class.forName((String) "org.assertj.core.internal.cglib.core.GeneratorStrategy");
        Class<? extends Object> term20424 = Class.forName((String) "java.util.spi.CalendarDataProvider");
        Class<? extends Object> term20426 = Class.forName((String) "java.util.concurrent.SubmissionPublisher$ConsumerSubscriber");
        Class<? extends Object> term20428 = Class.forName((String) "org.assertj.core.internal.Doubles");
        Class<? extends Object> term20430 = Class.forName((String) "java.util.Locale$LanguageRange");
        Class<? extends Object> term20432 = Class.forName((String) "org.hamcrest.core.AnyOf");
        term20330 = newInstance(Class.forName("org.mockito.internal.debugging.Location"));
        Object term20331 = newInstance(Class.forName("java.lang.Throwable"));
        Object[] term20332 = (Object[]) newArray("java.lang.Object", 5);
        short[] term20333 = (short[]) newShortArray(32);
        int[] term20366 = (int[]) newIntArray(32);
        Object[] term20399 = (Object[]) newArray("java.lang.Object", 32);
        long[] term20434 = (long[]) newLongArray(32);
        Object[] term20467 = (Object[]) newArray("java.lang.Object", 5);
        short[] term20468 = (short[]) newShortArray(32);
        int[] term20501 = (int[]) newIntArray(32);
        Object[] term20534 = (Object[]) newArray("java.lang.Object", 32);
        long[] term20535 = (long[]) newLongArray(32);
        Object[] term20568 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term20570 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        Object term20572 = newInstance(Class.forName("org.mockito.internal.exceptions.base.StackTraceFilter"));
        setShortElement(term20333, 0, (short) 1);
        setShortElement(term20333, 2, (short) 1);
        setShortElement(term20333, 3, (short) 2);
        setShortElement(term20333, 4, (short) 1);
        setShortElement(term20333, 5, (short) 7);
        setShortElement(term20333, 6, (short) 2);
        setShortElement(term20333, 7, (short) 1);
        setShortElement(term20333, 8, (short) 6);
        setShortElement(term20333, 9, (short) 2);
        setShortElement(term20333, 10, (short) 10);
        setShortElement(term20333, 11, (short) 11);
        setShortElement(term20333, 12, (short) 29);
        setShortElement(term20333, 13, (short) 5);
        setShortElement(term20333, 14, (short) 4);
        setShortElement(term20333, 15, (short) 4);
        setShortElement(term20333, 16, (short) 3);
        setShortElement(term20333, 17, (short) 5);
        setShortElement(term20333, 18, (short) 9);
        setShortElement(term20333, 19, (short) 10);
        setShortElement(term20333, 20, (short) 11);
        setShortElement(term20333, 21, (short) 4);
        setShortElement(term20333, 22, (short) 1);
        setShortElement(term20333, 24, (short) 10);
        setShortElement(term20333, 25, (short) 3);
        setShortElement(term20333, 26, (short) 4);
        setShortElement(term20333, 27, (short) 9);
        setShortElement(term20333, 28, (short) 1);
        setShortElement(term20333, 29, (short) 2);
        setShortElement(term20333, 30, (short) 3);
        setShortElement(term20333, 31, (short) 3);
        setElement(term20332, 0, term20333);
        setIntElement(term20366, 0, 917504);
        setIntElement(term20366, 1, 524288);
        setIntElement(term20366, 3, 5570560);
        setIntElement(term20366, 4, 327680);
        setIntElement(term20366, 5, 4456454);
        setIntElement(term20366, 6, 1769472);
        setIntElement(term20366, 7, 14876672);
        setIntElement(term20366, 8, 6225920);
        setIntElement(term20366, 9, 917504);
        setIntElement(term20366, 10, 327680);
        setIntElement(term20366, 11, 8519680);
        setIntElement(term20366, 12, 917504);
        setIntElement(term20366, 13, 11993088);
        setIntElement(term20366, 14, 655360);
        setIntElement(term20366, 15, 7864320);
        setIntElement(term20366, 16, 3735552);
        setIntElement(term20366, 17, 7143424);
        setIntElement(term20366, 18, 8454144);
        setIntElement(term20366, 19, 9240576);
        setIntElement(term20366, 20, 196608);
        setIntElement(term20366, 21, 3801088);
        setIntElement(term20366, 22, 786432);
        setIntElement(term20366, 23, 589824);
        setIntElement(term20366, 24, 17170432);
        setIntElement(term20366, 25, 1376256);
        setIntElement(term20366, 26, 5242880);
        setIntElement(term20366, 27, 2883584);
        setIntElement(term20366, 28, 20774912);
        setIntElement(term20366, 29, 262144);
        setIntElement(term20366, 30, 2555904);
        setIntElement(term20366, 31, 1835008);
        setElement(term20332, 1, term20366);
        setElement(term20399, 0, term20400);
        setElement(term20399, 1, term20400);
        setElement(term20399, 2, term20402);
        setElement(term20399, 3, term20402);
        setElement(term20399, 4, term20404);
        setElement(term20399, 5, term20406);
        setElement(term20399, 6, term20408);
        setElement(term20399, 7, term20408);
        setElement(term20399, 8, term20410);
        setElement(term20399, 9, term20410);
        setElement(term20399, 10, term20412);
        setElement(term20399, 11, term20412);
        setElement(term20399, 12, term20412);
        setElement(term20399, 13, term20412);
        setElement(term20399, 14, term20412);
        setElement(term20399, 15, term20414);
        setElement(term20399, 16, term20414);
        setElement(term20399, 17, term20416);
        setElement(term20399, 18, term20416);
        setElement(term20399, 19, term20416);
        setElement(term20399, 20, term20416);
        setElement(term20399, 21, term20418);
        setElement(term20399, 22, term20418);
        setElement(term20399, 23, term20418);
        setElement(term20399, 24, term20420);
        setElement(term20399, 25, term20416);
        setElement(term20399, 26, term20422);
        setElement(term20399, 27, term20424);
        setElement(term20399, 28, term20426);
        setElement(term20399, 29, term20428);
        setElement(term20399, 30, term20430);
        setElement(term20399, 31, term20432);
        setElement(term20332, 2, term20399);
        setLongElement(term20434, 0, 34363745304L);
        setLongElement(term20434, 1, 34363745304L);
        setLongElement(term20434, 2, 34363746224L);
        setLongElement(term20434, 3, 34363775512L);
        setLongElement(term20434, 4, 34363775512L);
        setLongElement(term20434, 5, 34363775512L);
        setLongElement(term20434, 6, 128809362246416L);
        setLongElement(term20434, 7, 34364440080L);
        setLongElement(term20434, 8, 128809362321008L);
        setLongElement(term20434, 9, 128809362085936L);
        setLongElement(term20434, 10, 128809362085824L);
        setLongElement(term20434, 11, 128809362085968L);
        setLongElement(term20434, 12, 128809362207296L);
        setLongElement(term20434, 13, 34363766248L);
        setLongElement(term20434, 14, 34363766248L);
        setLongElement(term20434, 15, 128806364538672L);
        setLongElement(term20434, 16, 128806364538672L);
        setLongElement(term20434, 17, 128806364538528L);
        setLongElement(term20434, 18, 128806364549760L);
        setLongElement(term20434, 19, 128806364551280L);
        setLongElement(term20434, 20, 128806364552048L);
        setLongElement(term20434, 21, 128806361950816L);
        setLongElement(term20434, 22, 34363739368L);
        setLongElement(term20434, 23, 34363739368L);
        setLongElement(term20434, 24, 128806364546688L);
        setLongElement(term20434, 25, 34363829248L);
        setLongElement(term20434, 26, 128806361950816L);
        setLongElement(term20434, 27, 128809410801520L);
        setLongElement(term20434, 28, 34363745472L);
        setLongElement(term20434, 29, 34364710216L);
        setLongElement(term20434, 30, 34363745472L);
        setLongElement(term20434, 31, 34363745472L);
        setElement(term20332, 3, term20434);
        setShortElement(term20468, 0, (short) 13);
        setShortElement(term20468, 1, (short) 1);
        setShortElement(term20468, 2, (short) 2);
        setShortElement(term20468, 3, (short) 12);
        setElement(term20467, 0, term20468);
        setIntElement(term20501, 0, 6029312);
        setIntElement(term20501, 1, 327680);
        setIntElement(term20501, 2, 1638400);
        setIntElement(term20501, 3, 720907);
        setElement(term20467, 1, term20501);
        setElement(term20467, 2, term20534);
        setLongElement(term20535, 0, 34364896224L);
        setLongElement(term20535, 1, 34363745472L);
        setLongElement(term20535, 2, 34363745472L);
        setLongElement(term20535, 3, 34363745472L);
        setElement(term20467, 3, term20535);
        setElement(term20332, 4, term20467);
        setField(term20331, term20331.getClass(), "backtrace", term20332);
        setField(term20331, term20331.getClass(), "detailMessage", null);
        setField(term20331, term20331.getClass(), "cause", term20331);
        setField(term20331, term20331.getClass(), "stackTrace", term20568);
        setIntField(term20331, term20331.getClass(), "depth", 36);
        setIntField(term20570, term20570.getClass(), "modCount", 0);
        setField(term20331, term20331.getClass(), "suppressedExceptions", term20570);
        setField(term20330, term20330.getClass(), "stackTraceHolder", term20331);
        setField(term20330, term20330.getClass(), "stackTraceFilter", term20572);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.exceptions.Reporter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.mockito.exceptions.Discrepancy");
        argTypes[1] = Class.forName("org.mockito.exceptions.PrintableInvocation");
        argTypes[2] = Class.forName("org.mockito.internal.debugging.Location");
        Object[] args = new Object[3];
        args[0] = term20327;
        args[1] = null;
        args[2] = term20330;
        try {
            callMethod(klass, "createTooLittleInvocationsMessage", argTypes, term20326, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


