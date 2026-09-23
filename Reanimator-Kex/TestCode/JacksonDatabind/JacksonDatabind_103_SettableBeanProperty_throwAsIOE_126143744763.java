package com.fasterxml.jackson.databind.deser;

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
import static com.fasterxml.jackson.databind.deser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class SettableBeanProperty_throwAsIOE_126143744763 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49;
     Object term337;

    public SettableBeanProperty_throwAsIOE_126143744763() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term118 = Class.forName((String) "java.nio.DirectIntBufferRU");
        Class<? extends Object> term121 = Class.forName((String) "com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper");
        Class<? extends Object> term123 = Class.forName((String) "com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer");
        Class<? extends Object> term127 = Class.forName((String) "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer$StringFactoryKeyDeserializer");
        Class<? extends Object> term132 = Class.forName((String) "java.io.EOFException");
        Class<? extends Object> term136 = Class.forName((String) "java.util.stream.Streams$ConcatSpliterator$OfPrimitive");
        Class<? extends Object> term140 = Class.forName((String) "com.fasterxml.jackson.core.util.DefaultPrettyPrinter");
        Class<? extends Object> term144 = Class.forName((String) "java.lang.invoke.InfoFromMemberName");
        Class<? extends Object> term148 = Class.forName((String) "java.io.UTFDataFormatException");
        Class<? extends Object> term152 = Class.forName((String) "com.fasterxml.jackson.core.JsonpCharacterEscapes");
        Class<? extends Object> term156 = Class.forName((String) "com.fasterxml.jackson.core.JsonGenerationException");
        Class<? extends Object> term160 = Class.forName((String) "java.nio.BufferMismatch");
        Class<? extends Object> term164 = Class.forName((String) "com.fasterxml.jackson.annotation.ObjectIdGenerators$Base");
        Class<? extends Object> term168 = Class.forName((String) "java.nio.channels.ClosedSelectorException");
        Class<? extends Object> term171 = Class.forName((String) "java.nio.file.FileSystemException");
        Class<? extends Object> term174 = Class.forName((String) "java.util.stream.ReduceOps$9ReducingSink");
        Class<? extends Object> term177 = Class.forName((String) "java.util.concurrent.ThreadLocalRandom");
        Class<? extends Object> term180 = Class.forName((String) "java.io.ExpiringCache$1");
        Class<? extends Object> term284 = Class.forName((String) "com.fasterxml.jackson.databind.ser.std.StdKeySerializers$EnumKeySerializer");
        Class<? extends Object> term286 = Class.forName((String) "java.lang.invoke.MethodHandleImpl$LoopClauses");
        term49 = newInstance(Class.forName("java.lang.Exception"));
        Object[] term50 = (Object[]) newArray("java.lang.Object", 5);
        short[] term51 = (short[]) newShortArray(32);
        int[] term84 = (int[]) newIntArray(32);
        Object[] term117 = (Object[]) newArray("java.lang.Object", 32);
        long[] term183 = (long[]) newLongArray(32);
        Object[] term216 = (Object[]) newArray("java.lang.Object", 5);
        short[] term217 = (short[]) newShortArray(32);
        int[] term250 = (int[]) newIntArray(32);
        Object[] term283 = (Object[]) newArray("java.lang.Object", 32);
        long[] term288 = (long[]) newLongArray(32);
        Object[] term333 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term335 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setShortElement(term51, 0, (short) 1);
        setShortElement(term51, 1, (short) 2);
        setShortElement(term51, 2, (short) 1);
        setShortElement(term51, 3, (short) 7);
        setShortElement(term51, 4, (short) 2);
        setShortElement(term51, 5, (short) 1);
        setShortElement(term51, 6, (short) 6);
        setShortElement(term51, 7, (short) 2);
        setShortElement(term51, 8, (short) 10);
        setShortElement(term51, 9, (short) 11);
        setShortElement(term51, 10, (short) 29);
        setShortElement(term51, 11, (short) 5);
        setShortElement(term51, 12, (short) 4);
        setShortElement(term51, 13, (short) 5);
        setShortElement(term51, 14, (short) 6);
        setShortElement(term51, 15, (short) 6);
        setShortElement(term51, 16, (short) 9);
        setShortElement(term51, 17, (short) 10);
        setShortElement(term51, 18, (short) 11);
        setShortElement(term51, 19, (short) 4);
        setShortElement(term51, 20, (short) 1);
        setShortElement(term51, 23, (short) 3);
        setShortElement(term51, 24, (short) 4);
        setShortElement(term51, 25, (short) 4);
        setShortElement(term51, 26, (short) 1);
        setShortElement(term51, 27, (short) 2);
        setShortElement(term51, 28, (short) 3);
        setShortElement(term51, 29, (short) 3);
        setShortElement(term51, 30, (short) 13);
        setShortElement(term51, 31, (short) 1);
        setElement(term50, 0, term51);
        setIntElement(term84, 1, 5570560);
        setIntElement(term84, 2, 327680);
        setIntElement(term84, 3, 4456454);
        setIntElement(term84, 4, 1769472);
        setIntElement(term84, 5, 14876672);
        setIntElement(term84, 6, 6225920);
        setIntElement(term84, 7, 917504);
        setIntElement(term84, 8, 327680);
        setIntElement(term84, 9, 8519680);
        setIntElement(term84, 10, 917504);
        setIntElement(term84, 11, 11993088);
        setIntElement(term84, 12, 655360);
        setIntElement(term84, 13, 7864320);
        setIntElement(term84, 14, 3735552);
        setIntElement(term84, 15, 7143424);
        setIntElement(term84, 16, 8454144);
        setIntElement(term84, 17, 9240576);
        setIntElement(term84, 18, 196608);
        setIntElement(term84, 19, 3801088);
        setIntElement(term84, 20, 786432);
        setIntElement(term84, 21, 589824);
        setIntElement(term84, 22, 17170432);
        setIntElement(term84, 23, 1376256);
        setIntElement(term84, 24, 5242880);
        setIntElement(term84, 25, 2883584);
        setIntElement(term84, 26, 20774912);
        setIntElement(term84, 27, 262144);
        setIntElement(term84, 28, 2555904);
        setIntElement(term84, 29, 1835008);
        setIntElement(term84, 30, 6029312);
        setIntElement(term84, 31, 327680);
        setElement(term50, 1, term84);
        setElement(term117, 0, term118);
        setElement(term117, 1, term118);
        setElement(term117, 2, term121);
        setElement(term117, 3, term123);
        setElement(term117, 4, term127);
        setElement(term117, 5, term127);
        setElement(term117, 6, term132);
        setElement(term117, 7, term132);
        setElement(term117, 8, term136);
        setElement(term117, 9, term136);
        setElement(term117, 10, term136);
        setElement(term117, 11, term136);
        setElement(term117, 12, term136);
        setElement(term117, 13, term140);
        setElement(term117, 14, term140);
        setElement(term117, 15, term144);
        setElement(term117, 16, term144);
        setElement(term117, 17, term144);
        setElement(term117, 18, term144);
        setElement(term117, 19, term148);
        setElement(term117, 20, term148);
        setElement(term117, 21, term148);
        setElement(term117, 22, term152);
        setElement(term117, 23, term144);
        setElement(term117, 24, term156);
        setElement(term117, 25, term160);
        setElement(term117, 26, term164);
        setElement(term117, 27, term168);
        setElement(term117, 28, term171);
        setElement(term117, 29, term174);
        setElement(term117, 30, term177);
        setElement(term117, 31, term180);
        setElement(term50, 2, term117);
        setLongElement(term183, 0, 34363746224L);
        setLongElement(term183, 1, 34363775512L);
        setLongElement(term183, 2, 34363775512L);
        setLongElement(term183, 3, 34363775512L);
        setLongElement(term183, 4, 134804263765536L);
        setLongElement(term183, 5, 34364440080L);
        setLongElement(term183, 6, 134804263832688L);
        setLongElement(term183, 7, 134804263671680L);
        setLongElement(term183, 8, 134804263671568L);
        setLongElement(term183, 9, 134804263671712L);
        setLongElement(term183, 10, 134804263719168L);
        setLongElement(term183, 11, 34363766248L);
        setLongElement(term183, 12, 34363766248L);
        setLongElement(term183, 13, 134800737169776L);
        setLongElement(term183, 14, 134800737169776L);
        setLongElement(term183, 15, 134800737169632L);
        setLongElement(term183, 16, 134800737173936L);
        setLongElement(term183, 17, 134800737175584L);
        setLongElement(term183, 18, 134800737176352L);
        setLongElement(term183, 19, 134804265399984L);
        setLongElement(term183, 20, 34363739368L);
        setLongElement(term183, 21, 34363739368L);
        setLongElement(term183, 22, 134800737127424L);
        setLongElement(term183, 23, 34363829248L);
        setLongElement(term183, 24, 134804265399984L);
        setLongElement(term183, 25, 134800734005568L);
        setLongElement(term183, 26, 34363745472L);
        setLongElement(term183, 27, 34364710216L);
        setLongElement(term183, 28, 34363745472L);
        setLongElement(term183, 29, 34363745472L);
        setLongElement(term183, 30, 34364896224L);
        setLongElement(term183, 31, 34363745472L);
        setElement(term50, 3, term183);
        setShortElement(term217, 0, (short) 2);
        setShortElement(term217, 1, (short) 12);
        setElement(term216, 0, term217);
        setIntElement(term250, 0, 1638400);
        setIntElement(term250, 1, 720907);
        setElement(term216, 1, term250);
        setElement(term283, 0, term284);
        setElement(term283, 1, term286);
        setElement(term216, 2, term283);
        setLongElement(term288, 0, 34363745472L);
        setLongElement(term288, 1, 34363745472L);
        setElement(term216, 3, term288);
        setElement(term50, 4, term216);
        setField(term49, term49.getClass(), "backtrace", term50);
        setField(term49, term49.getClass(), "detailMessage", "MuLcgQHgqz");
        setField(term49, term49.getClass(), "cause", term49);
        setField(term49, term49.getClass(), "stackTrace", term333);
        setIntField(term49, term49.getClass(), "depth", 34);
        setIntField(term335, term335.getClass(), "modCount", 0);
        setField(term49, term49.getClass(), "suppressedExceptions", term335);
        term337 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.SettableBeanProperty");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.JsonParser");
        argTypes[1] = Class.forName("java.lang.Exception");
        argTypes[2] = Class.forName("java.lang.Object");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term49;
        args[2] = term337;
        try {
            callMethod(klass, "_throwAsIOE", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


