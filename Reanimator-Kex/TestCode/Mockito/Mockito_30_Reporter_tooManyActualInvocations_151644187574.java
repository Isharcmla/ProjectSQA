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
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;

public class Reporter_tooManyActualInvocations_151644187574 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10181;
     Object term10182;
     Object term10184;
     Object term10186;

    public Reporter_tooManyActualInvocations_151644187574() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10181 = newInstance(Class.forName("org.mockito.exceptions.Reporter"));
        term10182 = new Integer(1484323161);
        term10184 = new Integer(391863371);
        Class<? extends Object> term10256 = Class.forName((String) "java.lang.ProcessEnvironment$StringEnvironment");
        Class<? extends Object> term10258 = Class.forName((String) "java.nio.channels.InterruptibleChannel");
        Class<? extends Object> term10260 = Class.forName((String) "java.util.Collections$SynchronizedSortedMap");
        Class<? extends Object> term10262 = Class.forName((String) "net.sourceforge.cobertura.ant.MergeTask");
        Class<? extends Object> term10264 = Class.forName((String) "java.util.stream.ReferencePipeline$2$1");
        Class<? extends Object> term10266 = Class.forName((String) "java.io.RandomAccessFile$2");
        Class<? extends Object> term10268 = Class.forName((String) "java.lang.invoke.VarHandleShorts$Array");
        Class<? extends Object> term10270 = Class.forName((String) "java.lang.invoke.MethodHandleNatives");
        Class<? extends Object> term10272 = Class.forName((String) "org.objectweb.asm.xml.SAXCodeAdapter");
        Class<? extends Object> term10274 = Class.forName((String) "java.util.stream.PipelineHelper");
        Class<? extends Object> term10276 = Class.forName((String) "org.mockito.internal.creation.jmock.ClassImposterizer$2");
        Class<? extends Object> term10278 = Class.forName((String) "java.io.OutputStream");
        Class<? extends Object> term10280 = Class.forName((String) "org.mockito.cglib.transform.TransformingClassGenerator");
        Class<? extends Object> term10282 = Class.forName((String) "java.lang.invoke.VarHandles");
        Class<? extends Object> term10284 = Class.forName((String) "java.util.regex.Pattern$GraphemeBound");
        Class<? extends Object> term10286 = Class.forName((String) "java.util.ArraysParallelSortHelpers");
        Class<? extends Object> term10288 = Class.forName((String) "java.util.stream.SliceOps$SliceTask");
        term10186 = newInstance(Class.forName("org.mockito.internal.debugging.Location"));
        Object term10187 = newInstance(Class.forName("java.lang.Throwable"));
        Object[] term10188 = (Object[]) newArray("java.lang.Object", 5);
        short[] term10189 = (short[]) newShortArray(32);
        int[] term10222 = (int[]) newIntArray(32);
        Object[] term10255 = (Object[]) newArray("java.lang.Object", 32);
        long[] term10290 = (long[]) newLongArray(32);
        Object[] term10323 = (Object[]) newArray("java.lang.Object", 5);
        short[] term10324 = (short[]) newShortArray(32);
        int[] term10357 = (int[]) newIntArray(32);
        Object[] term10390 = (Object[]) newArray("java.lang.Object", 32);
        long[] term10391 = (long[]) newLongArray(32);
        Object[] term10424 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term10426 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        Object term10428 = newInstance(Class.forName("org.mockito.internal.exceptions.base.StackTraceFilter"));
        setShortElement(term10189, 0, (short) 1);
        setShortElement(term10189, 2, (short) 1);
        setShortElement(term10189, 3, (short) 2);
        setShortElement(term10189, 4, (short) 1);
        setShortElement(term10189, 5, (short) 7);
        setShortElement(term10189, 6, (short) 2);
        setShortElement(term10189, 7, (short) 1);
        setShortElement(term10189, 8, (short) 6);
        setShortElement(term10189, 9, (short) 2);
        setShortElement(term10189, 10, (short) 10);
        setShortElement(term10189, 11, (short) 11);
        setShortElement(term10189, 12, (short) 29);
        setShortElement(term10189, 13, (short) 5);
        setShortElement(term10189, 14, (short) 4);
        setShortElement(term10189, 15, (short) 4);
        setShortElement(term10189, 16, (short) 3);
        setShortElement(term10189, 17, (short) 5);
        setShortElement(term10189, 18, (short) 9);
        setShortElement(term10189, 19, (short) 10);
        setShortElement(term10189, 20, (short) 11);
        setShortElement(term10189, 21, (short) 4);
        setShortElement(term10189, 22, (short) 1);
        setShortElement(term10189, 24, (short) 10);
        setShortElement(term10189, 25, (short) 3);
        setShortElement(term10189, 26, (short) 4);
        setShortElement(term10189, 27, (short) 9);
        setShortElement(term10189, 28, (short) 1);
        setShortElement(term10189, 29, (short) 2);
        setShortElement(term10189, 30, (short) 3);
        setShortElement(term10189, 31, (short) 3);
        setElement(term10188, 0, term10189);
        setIntElement(term10222, 0, 917504);
        setIntElement(term10222, 1, 524288);
        setIntElement(term10222, 3, 5570560);
        setIntElement(term10222, 4, 327680);
        setIntElement(term10222, 5, 4456454);
        setIntElement(term10222, 6, 1769472);
        setIntElement(term10222, 7, 14876672);
        setIntElement(term10222, 8, 6225920);
        setIntElement(term10222, 9, 917504);
        setIntElement(term10222, 10, 327680);
        setIntElement(term10222, 11, 8519680);
        setIntElement(term10222, 12, 917504);
        setIntElement(term10222, 13, 11993088);
        setIntElement(term10222, 14, 655360);
        setIntElement(term10222, 15, 7864320);
        setIntElement(term10222, 16, 3735552);
        setIntElement(term10222, 17, 7143424);
        setIntElement(term10222, 18, 8454144);
        setIntElement(term10222, 19, 9240576);
        setIntElement(term10222, 20, 196608);
        setIntElement(term10222, 21, 3801088);
        setIntElement(term10222, 22, 786432);
        setIntElement(term10222, 23, 589824);
        setIntElement(term10222, 24, 17170432);
        setIntElement(term10222, 25, 1376256);
        setIntElement(term10222, 26, 5242880);
        setIntElement(term10222, 27, 2883584);
        setIntElement(term10222, 28, 20774912);
        setIntElement(term10222, 29, 262144);
        setIntElement(term10222, 30, 2555904);
        setIntElement(term10222, 31, 1835008);
        setElement(term10188, 1, term10222);
        setElement(term10255, 0, term10256);
        setElement(term10255, 1, term10256);
        setElement(term10255, 2, term10258);
        setElement(term10255, 3, term10258);
        setElement(term10255, 4, term10260);
        setElement(term10255, 5, term10262);
        setElement(term10255, 6, term10264);
        setElement(term10255, 7, term10264);
        setElement(term10255, 8, term10266);
        setElement(term10255, 9, term10266);
        setElement(term10255, 10, term10268);
        setElement(term10255, 11, term10268);
        setElement(term10255, 12, term10268);
        setElement(term10255, 13, term10268);
        setElement(term10255, 14, term10268);
        setElement(term10255, 15, term10270);
        setElement(term10255, 16, term10270);
        setElement(term10255, 17, term10272);
        setElement(term10255, 18, term10272);
        setElement(term10255, 19, term10272);
        setElement(term10255, 20, term10272);
        setElement(term10255, 21, term10274);
        setElement(term10255, 22, term10274);
        setElement(term10255, 23, term10274);
        setElement(term10255, 24, term10276);
        setElement(term10255, 25, term10272);
        setElement(term10255, 26, term10278);
        setElement(term10255, 27, term10280);
        setElement(term10255, 28, term10282);
        setElement(term10255, 29, term10284);
        setElement(term10255, 30, term10286);
        setElement(term10255, 31, term10288);
        setElement(term10188, 2, term10255);
        setLongElement(term10290, 0, 34363745304L);
        setLongElement(term10290, 1, 34363745304L);
        setLongElement(term10290, 2, 34363746224L);
        setLongElement(term10290, 3, 34363775512L);
        setLongElement(term10290, 4, 34363775512L);
        setLongElement(term10290, 5, 34363775512L);
        setLongElement(term10290, 6, 128809362246416L);
        setLongElement(term10290, 7, 34364440080L);
        setLongElement(term10290, 8, 128809362321008L);
        setLongElement(term10290, 9, 128809362085936L);
        setLongElement(term10290, 10, 128809362085824L);
        setLongElement(term10290, 11, 128809362085968L);
        setLongElement(term10290, 12, 128809362207296L);
        setLongElement(term10290, 13, 34363766248L);
        setLongElement(term10290, 14, 34363766248L);
        setLongElement(term10290, 15, 128806364538672L);
        setLongElement(term10290, 16, 128806364538672L);
        setLongElement(term10290, 17, 128806364538528L);
        setLongElement(term10290, 18, 128806364549760L);
        setLongElement(term10290, 19, 128806364551280L);
        setLongElement(term10290, 20, 128806364552048L);
        setLongElement(term10290, 21, 128806361950816L);
        setLongElement(term10290, 22, 34363739368L);
        setLongElement(term10290, 23, 34363739368L);
        setLongElement(term10290, 24, 128806364546688L);
        setLongElement(term10290, 25, 34363829248L);
        setLongElement(term10290, 26, 128806361950816L);
        setLongElement(term10290, 27, 128809410801520L);
        setLongElement(term10290, 28, 34363745472L);
        setLongElement(term10290, 29, 34364710216L);
        setLongElement(term10290, 30, 34363745472L);
        setLongElement(term10290, 31, 34363745472L);
        setElement(term10188, 3, term10290);
        setShortElement(term10324, 0, (short) 13);
        setShortElement(term10324, 1, (short) 1);
        setShortElement(term10324, 2, (short) 2);
        setShortElement(term10324, 3, (short) 12);
        setElement(term10323, 0, term10324);
        setIntElement(term10357, 0, 6029312);
        setIntElement(term10357, 1, 327680);
        setIntElement(term10357, 2, 1638400);
        setIntElement(term10357, 3, 720907);
        setElement(term10323, 1, term10357);
        setElement(term10323, 2, term10390);
        setLongElement(term10391, 0, 34364896224L);
        setLongElement(term10391, 1, 34363745472L);
        setLongElement(term10391, 2, 34363745472L);
        setLongElement(term10391, 3, 34363745472L);
        setElement(term10323, 3, term10391);
        setElement(term10188, 4, term10323);
        setField(term10187, term10187.getClass(), "backtrace", term10188);
        setField(term10187, term10187.getClass(), "detailMessage", null);
        setField(term10187, term10187.getClass(), "cause", term10187);
        setField(term10187, term10187.getClass(), "stackTrace", term10424);
        setIntField(term10187, term10187.getClass(), "depth", 36);
        setIntField(term10426, term10426.getClass(), "modCount", 0);
        setField(term10187, term10187.getClass(), "suppressedExceptions", term10426);
        setField(term10186, term10186.getClass(), "stackTraceHolder", term10187);
        setField(term10186, term10186.getClass(), "stackTraceFilter", term10428);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.exceptions.Reporter");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("org.mockito.exceptions.PrintableInvocation");
        argTypes[3] = Class.forName("org.mockito.internal.debugging.Location");
        Object[] args = new Object[4];
        args[0] = term10182;
        args[1] = term10184;
        args[2] = null;
        args[3] = term10186;
        try {
            callMethod(klass, "tooManyActualInvocations", argTypes, term10181, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


