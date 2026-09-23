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
import org.mockito.exceptions.verification.SmartNullPointerException;
import static org.mockito.exceptions.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class Reporter_smartNullPointerException_184339951789 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31419;
     Object term31420;

    public Reporter_smartNullPointerException_184339951789() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31419 = newInstance(Class.forName("org.mockito.exceptions.Reporter"));
        Class<? extends Object> term31490 = Class.forName((String) "org.fest.assertions.BooleanAssert");
        Class<? extends Object> term31492 = Class.forName((String) "org.hamcrest.generator.qdox.model.annotation.AnnotationGreaterEquals");
        Class<? extends Object> term31494 = Class.forName((String) "org.hamcrest.core.Every");
        Class<? extends Object> term31496 = Class.forName((String) "java.lang.invoke.VarHandleObjects");
        Class<? extends Object> term31498 = Class.forName((String) "org.fest.assertions.DoubleAssert$1");
        Class<? extends Object> term31500 = Class.forName((String) "java.util.stream.DoublePipeline$4$1");
        Class<? extends Object> term31502 = Class.forName((String) "java.lang.invoke.VarHandleByteArrayAsDoubles$ArrayHandle");
        Class<? extends Object> term31504 = Class.forName((String) "java.util.zip.ZipCoder$UTF8");
        Class<? extends Object> term31506 = Class.forName((String) "org.objectweb.asm.xml.ASMContentHandler$InvokeDynamicRule");
        Class<? extends Object> term31508 = Class.forName((String) "java.lang.StackStreamFactory$WalkerState");
        Class<? extends Object> term31510 = Class.forName((String) "net.sourceforge.cobertura.javancss.parser.java15.debug.GTToken");
        Class<? extends Object> term31512 = Class.forName((String) "java.lang.invoke.VarHandleFloats");
        Class<? extends Object> term31514 = Class.forName((String) "java.util.concurrent.ConcurrentHashMap$MapReduceEntriesToIntTask");
        Class<? extends Object> term31516 = Class.forName((String) "java.util.concurrent.RunnableScheduledFuture");
        Class<? extends Object> term31518 = Class.forName((String) "java.util.regex.Pattern$2");
        Class<? extends Object> term31520 = Class.forName((String) "java.io.PrintWriter");
        Class<? extends Object> term31522 = Class.forName((String) "org.mockito.internal.progress.SequenceNumber");
        term31420 = newInstance(Class.forName("org.mockito.internal.debugging.Location"));
        Object term31421 = newInstance(Class.forName("java.lang.Throwable"));
        Object[] term31422 = (Object[]) newArray("java.lang.Object", 5);
        short[] term31423 = (short[]) newShortArray(32);
        int[] term31456 = (int[]) newIntArray(32);
        Object[] term31489 = (Object[]) newArray("java.lang.Object", 32);
        long[] term31524 = (long[]) newLongArray(32);
        Object[] term31557 = (Object[]) newArray("java.lang.Object", 5);
        short[] term31558 = (short[]) newShortArray(32);
        int[] term31591 = (int[]) newIntArray(32);
        Object[] term31624 = (Object[]) newArray("java.lang.Object", 32);
        long[] term31625 = (long[]) newLongArray(32);
        Object[] term31658 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term31660 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        Object term31662 = newInstance(Class.forName("org.mockito.internal.exceptions.base.StackTraceFilter"));
        setShortElement(term31423, 0, (short) 1);
        setShortElement(term31423, 2, (short) 1);
        setShortElement(term31423, 3, (short) 2);
        setShortElement(term31423, 4, (short) 1);
        setShortElement(term31423, 5, (short) 7);
        setShortElement(term31423, 6, (short) 2);
        setShortElement(term31423, 7, (short) 1);
        setShortElement(term31423, 8, (short) 6);
        setShortElement(term31423, 9, (short) 2);
        setShortElement(term31423, 10, (short) 10);
        setShortElement(term31423, 11, (short) 11);
        setShortElement(term31423, 12, (short) 29);
        setShortElement(term31423, 13, (short) 5);
        setShortElement(term31423, 14, (short) 4);
        setShortElement(term31423, 15, (short) 4);
        setShortElement(term31423, 16, (short) 3);
        setShortElement(term31423, 17, (short) 5);
        setShortElement(term31423, 18, (short) 9);
        setShortElement(term31423, 19, (short) 10);
        setShortElement(term31423, 20, (short) 11);
        setShortElement(term31423, 21, (short) 4);
        setShortElement(term31423, 22, (short) 1);
        setShortElement(term31423, 24, (short) 10);
        setShortElement(term31423, 25, (short) 3);
        setShortElement(term31423, 26, (short) 4);
        setShortElement(term31423, 27, (short) 9);
        setShortElement(term31423, 28, (short) 1);
        setShortElement(term31423, 29, (short) 2);
        setShortElement(term31423, 30, (short) 3);
        setShortElement(term31423, 31, (short) 3);
        setElement(term31422, 0, term31423);
        setIntElement(term31456, 0, 917504);
        setIntElement(term31456, 1, 524288);
        setIntElement(term31456, 3, 5570560);
        setIntElement(term31456, 4, 327680);
        setIntElement(term31456, 5, 4456454);
        setIntElement(term31456, 6, 1769472);
        setIntElement(term31456, 7, 14876672);
        setIntElement(term31456, 8, 6225920);
        setIntElement(term31456, 9, 917504);
        setIntElement(term31456, 10, 327680);
        setIntElement(term31456, 11, 8519680);
        setIntElement(term31456, 12, 917504);
        setIntElement(term31456, 13, 11993088);
        setIntElement(term31456, 14, 655360);
        setIntElement(term31456, 15, 7864320);
        setIntElement(term31456, 16, 3735552);
        setIntElement(term31456, 17, 7143424);
        setIntElement(term31456, 18, 8454144);
        setIntElement(term31456, 19, 9240576);
        setIntElement(term31456, 20, 196608);
        setIntElement(term31456, 21, 3801088);
        setIntElement(term31456, 22, 786432);
        setIntElement(term31456, 23, 589824);
        setIntElement(term31456, 24, 17170432);
        setIntElement(term31456, 25, 1376256);
        setIntElement(term31456, 26, 5242880);
        setIntElement(term31456, 27, 2883584);
        setIntElement(term31456, 28, 20774912);
        setIntElement(term31456, 29, 262144);
        setIntElement(term31456, 30, 2555904);
        setIntElement(term31456, 31, 1835008);
        setElement(term31422, 1, term31456);
        setElement(term31489, 0, term31490);
        setElement(term31489, 1, term31490);
        setElement(term31489, 2, term31492);
        setElement(term31489, 3, term31492);
        setElement(term31489, 4, term31494);
        setElement(term31489, 5, term31496);
        setElement(term31489, 6, term31498);
        setElement(term31489, 7, term31498);
        setElement(term31489, 8, term31500);
        setElement(term31489, 9, term31500);
        setElement(term31489, 10, term31502);
        setElement(term31489, 11, term31502);
        setElement(term31489, 12, term31502);
        setElement(term31489, 13, term31502);
        setElement(term31489, 14, term31502);
        setElement(term31489, 15, term31504);
        setElement(term31489, 16, term31504);
        setElement(term31489, 17, term31506);
        setElement(term31489, 18, term31506);
        setElement(term31489, 19, term31506);
        setElement(term31489, 20, term31506);
        setElement(term31489, 21, term31508);
        setElement(term31489, 22, term31508);
        setElement(term31489, 23, term31508);
        setElement(term31489, 24, term31510);
        setElement(term31489, 25, term31506);
        setElement(term31489, 26, term31512);
        setElement(term31489, 27, term31514);
        setElement(term31489, 28, term31516);
        setElement(term31489, 29, term31518);
        setElement(term31489, 30, term31520);
        setElement(term31489, 31, term31522);
        setElement(term31422, 2, term31489);
        setLongElement(term31524, 0, 34363745304L);
        setLongElement(term31524, 1, 34363745304L);
        setLongElement(term31524, 2, 34363746224L);
        setLongElement(term31524, 3, 34363775512L);
        setLongElement(term31524, 4, 34363775512L);
        setLongElement(term31524, 5, 34363775512L);
        setLongElement(term31524, 6, 128809362246416L);
        setLongElement(term31524, 7, 34364440080L);
        setLongElement(term31524, 8, 128809362321008L);
        setLongElement(term31524, 9, 128809362085936L);
        setLongElement(term31524, 10, 128809362085824L);
        setLongElement(term31524, 11, 128809362085968L);
        setLongElement(term31524, 12, 128809362207296L);
        setLongElement(term31524, 13, 34363766248L);
        setLongElement(term31524, 14, 34363766248L);
        setLongElement(term31524, 15, 128806364538672L);
        setLongElement(term31524, 16, 128806364538672L);
        setLongElement(term31524, 17, 128806364538528L);
        setLongElement(term31524, 18, 128806364549760L);
        setLongElement(term31524, 19, 128806364551280L);
        setLongElement(term31524, 20, 128806364552048L);
        setLongElement(term31524, 21, 128806361950816L);
        setLongElement(term31524, 22, 34363739368L);
        setLongElement(term31524, 23, 34363739368L);
        setLongElement(term31524, 24, 128806364546688L);
        setLongElement(term31524, 25, 34363829248L);
        setLongElement(term31524, 26, 128806361950816L);
        setLongElement(term31524, 27, 128809410801520L);
        setLongElement(term31524, 28, 34363745472L);
        setLongElement(term31524, 29, 34364710216L);
        setLongElement(term31524, 30, 34363745472L);
        setLongElement(term31524, 31, 34363745472L);
        setElement(term31422, 3, term31524);
        setShortElement(term31558, 0, (short) 13);
        setShortElement(term31558, 1, (short) 1);
        setShortElement(term31558, 2, (short) 2);
        setShortElement(term31558, 3, (short) 12);
        setElement(term31557, 0, term31558);
        setIntElement(term31591, 0, 6029312);
        setIntElement(term31591, 1, 327680);
        setIntElement(term31591, 2, 1638400);
        setIntElement(term31591, 3, 720907);
        setElement(term31557, 1, term31591);
        setElement(term31557, 2, term31624);
        setLongElement(term31625, 0, 34364896224L);
        setLongElement(term31625, 1, 34363745472L);
        setLongElement(term31625, 2, 34363745472L);
        setLongElement(term31625, 3, 34363745472L);
        setElement(term31557, 3, term31625);
        setElement(term31422, 4, term31557);
        setField(term31421, term31421.getClass(), "backtrace", term31422);
        setField(term31421, term31421.getClass(), "detailMessage", null);
        setField(term31421, term31421.getClass(), "cause", term31421);
        setField(term31421, term31421.getClass(), "stackTrace", term31658);
        setIntField(term31421, term31421.getClass(), "depth", 36);
        setIntField(term31660, term31660.getClass(), "modCount", 0);
        setField(term31421, term31421.getClass(), "suppressedExceptions", term31660);
        setField(term31420, term31420.getClass(), "stackTraceHolder", term31421);
        setField(term31420, term31420.getClass(), "stackTraceFilter", term31662);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.exceptions.Reporter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.mockito.internal.debugging.Location");
        Object[] args = new Object[1];
        args[0] = term31420;
        try {
            callMethod(klass, "smartNullPointerException", argTypes, term31419, args);
            assertTrue(false);
        }
        catch (SmartNullPointerException e) {
        }

    }

};


