package com.fasterxml.jackson.databind.ser;

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
import static com.fasterxml.jackson.databind.ser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class PropertyBuilder_throwWrapped_135316616115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27;
     Object term323;

    public PropertyBuilder_throwWrapped_135316616115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term96 = Class.forName((String) "com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1");
        Class<? extends Object> term99 = Class.forName((String) "java.util.Spliterators$3Adapter");
        Class<? extends Object> term101 = Class.forName((String) "java.lang.ConditionalSpecialCasing$Entry");
        Class<? extends Object> term105 = Class.forName((String) "java.util.concurrent.Executors$PrivilegedThreadFactory$1$1");
        Class<? extends Object> term110 = Class.forName((String) "java.util.concurrent.ConcurrentHashMap$EntrySpliterator");
        Class<? extends Object> term114 = Class.forName((String) "java.util.concurrent.ConcurrentSkipListMap$Index");
        Class<? extends Object> term118 = Class.forName((String) "java.io.ObjectOutputStream$BlockDataOutputStream");
        Class<? extends Object> term122 = Class.forName((String) "java.util.stream.ReduceOps$12ReducingSink");
        Class<? extends Object> term126 = Class.forName((String) "java.util.Collections$CheckedMap$CheckedEntrySet");
        Class<? extends Object> term130 = Class.forName((String) "java.lang.invoke.VarHandleDoubles$FieldInstanceReadOnly");
        Class<? extends Object> term134 = Class.forName((String) "java.lang.ProcessImpl$Platform");
        Class<? extends Object> term138 = Class.forName((String) "java.util.Base64$Encoder");
        Class<? extends Object> term142 = Class.forName((String) "java.util.Arrays$ArrayList");
        Class<? extends Object> term146 = Class.forName((String) "java.lang.invoke.ProxyClassesDumper$1");
        Class<? extends Object> term148 = Class.forName((String) "java.lang.SecurityException");
        Class<? extends Object> term151 = Class.forName((String) "java.io.ObjectInputStream$GetField");
        Class<? extends Object> term153 = Class.forName((String) "java.nio.channels.spi.AsynchronousChannelProvider$ProviderHolder$1");
        Class<? extends Object> term155 = Class.forName((String) "com.fasterxml.jackson.databind.JsonMappingException");
        Class<? extends Object> term258 = Class.forName((String) "java.util.HashMap$EntrySpliterator");
        Class<? extends Object> term260 = Class.forName((String) "com.fasterxml.jackson.databind.PropertyNamingStrategy$PropertyNamingStrategyBase");
        term27 = newInstance(Class.forName("java.lang.Exception"));
        Object[] term28 = (Object[]) newArray("java.lang.Object", 5);
        short[] term29 = (short[]) newShortArray(32);
        int[] term62 = (int[]) newIntArray(32);
        Object[] term95 = (Object[]) newArray("java.lang.Object", 32);
        long[] term157 = (long[]) newLongArray(32);
        Object[] term190 = (Object[]) newArray("java.lang.Object", 5);
        short[] term191 = (short[]) newShortArray(32);
        int[] term224 = (int[]) newIntArray(32);
        Object[] term257 = (Object[]) newArray("java.lang.Object", 32);
        long[] term262 = (long[]) newLongArray(32);
        Object[] term307 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term309 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setShortElement(term29, 0, (short) 1);
        setShortElement(term29, 1, (short) 2);
        setShortElement(term29, 2, (short) 1);
        setShortElement(term29, 3, (short) 7);
        setShortElement(term29, 4, (short) 2);
        setShortElement(term29, 5, (short) 1);
        setShortElement(term29, 6, (short) 6);
        setShortElement(term29, 7, (short) 2);
        setShortElement(term29, 8, (short) 10);
        setShortElement(term29, 9, (short) 11);
        setShortElement(term29, 10, (short) 29);
        setShortElement(term29, 11, (short) 5);
        setShortElement(term29, 12, (short) 4);
        setShortElement(term29, 13, (short) 5);
        setShortElement(term29, 14, (short) 6);
        setShortElement(term29, 15, (short) 7);
        setShortElement(term29, 16, (short) 10);
        setShortElement(term29, 17, (short) 11);
        setShortElement(term29, 18, (short) 12);
        setShortElement(term29, 19, (short) 4);
        setShortElement(term29, 20, (short) 1);
        setShortElement(term29, 23, (short) 3);
        setShortElement(term29, 24, (short) 4);
        setShortElement(term29, 25, (short) 4);
        setShortElement(term29, 26, (short) 1);
        setShortElement(term29, 27, (short) 2);
        setShortElement(term29, 28, (short) 3);
        setShortElement(term29, 29, (short) 3);
        setShortElement(term29, 30, (short) 13);
        setShortElement(term29, 31, (short) 1);
        setElement(term28, 0, term29);
        setIntElement(term62, 1, 5570560);
        setIntElement(term62, 2, 327680);
        setIntElement(term62, 3, 4456454);
        setIntElement(term62, 4, 1769472);
        setIntElement(term62, 5, 14876672);
        setIntElement(term62, 6, 6225920);
        setIntElement(term62, 7, 917504);
        setIntElement(term62, 8, 327680);
        setIntElement(term62, 9, 8519680);
        setIntElement(term62, 10, 917504);
        setIntElement(term62, 11, 11993088);
        setIntElement(term62, 12, 655360);
        setIntElement(term62, 13, 7864320);
        setIntElement(term62, 14, 3735552);
        setIntElement(term62, 15, 7143424);
        setIntElement(term62, 16, 8454144);
        setIntElement(term62, 17, 9240576);
        setIntElement(term62, 18, 196608);
        setIntElement(term62, 19, 3801088);
        setIntElement(term62, 20, 786432);
        setIntElement(term62, 21, 589824);
        setIntElement(term62, 22, 17170432);
        setIntElement(term62, 23, 1376256);
        setIntElement(term62, 24, 5242880);
        setIntElement(term62, 25, 2883584);
        setIntElement(term62, 26, 20774912);
        setIntElement(term62, 27, 262144);
        setIntElement(term62, 28, 2555904);
        setIntElement(term62, 29, 1835008);
        setIntElement(term62, 30, 6029312);
        setIntElement(term62, 31, 327680);
        setElement(term28, 1, term62);
        setElement(term95, 0, term96);
        setElement(term95, 1, term96);
        setElement(term95, 2, term99);
        setElement(term95, 3, term101);
        setElement(term95, 4, term105);
        setElement(term95, 5, term105);
        setElement(term95, 6, term110);
        setElement(term95, 7, term110);
        setElement(term95, 8, term114);
        setElement(term95, 9, term114);
        setElement(term95, 10, term114);
        setElement(term95, 11, term114);
        setElement(term95, 12, term114);
        setElement(term95, 13, term118);
        setElement(term95, 14, term118);
        setElement(term95, 15, term122);
        setElement(term95, 16, term122);
        setElement(term95, 17, term122);
        setElement(term95, 18, term122);
        setElement(term95, 19, term126);
        setElement(term95, 20, term126);
        setElement(term95, 21, term126);
        setElement(term95, 22, term130);
        setElement(term95, 23, term122);
        setElement(term95, 24, term134);
        setElement(term95, 25, term138);
        setElement(term95, 26, term142);
        setElement(term95, 27, term146);
        setElement(term95, 28, term148);
        setElement(term95, 29, term151);
        setElement(term95, 30, term153);
        setElement(term95, 31, term155);
        setElement(term28, 2, term95);
        setLongElement(term157, 0, 34363746224L);
        setLongElement(term157, 1, 34363775512L);
        setLongElement(term157, 2, 34363775512L);
        setLongElement(term157, 3, 34363775512L);
        setLongElement(term157, 4, 129674864757344L);
        setLongElement(term157, 5, 34364440080L);
        setLongElement(term157, 6, 129674864824496L);
        setLongElement(term157, 7, 129674864663456L);
        setLongElement(term157, 8, 129674864663344L);
        setLongElement(term157, 9, 129674864663488L);
        setLongElement(term157, 10, 129674864710928L);
        setLongElement(term157, 11, 34363766248L);
        setLongElement(term157, 12, 34363766248L);
        setLongElement(term157, 13, 129671392997600L);
        setLongElement(term157, 14, 129671392997600L);
        setLongElement(term157, 15, 129671392997456L);
        setLongElement(term157, 16, 129671393042016L);
        setLongElement(term157, 17, 129671393043664L);
        setLongElement(term157, 18, 129671393044432L);
        setLongElement(term157, 19, 129674866399280L);
        setLongElement(term157, 20, 34363739368L);
        setLongElement(term157, 21, 34363739368L);
        setLongElement(term157, 22, 129671392996096L);
        setLongElement(term157, 23, 34363829248L);
        setLongElement(term157, 24, 129674866399280L);
        setLongElement(term157, 25, 129674866069456L);
        setLongElement(term157, 26, 34363745472L);
        setLongElement(term157, 27, 34364710216L);
        setLongElement(term157, 28, 34363745472L);
        setLongElement(term157, 29, 34363745472L);
        setLongElement(term157, 30, 34364896224L);
        setLongElement(term157, 31, 34363745472L);
        setElement(term28, 3, term157);
        setShortElement(term191, 0, (short) 2);
        setShortElement(term191, 1, (short) 12);
        setElement(term190, 0, term191);
        setIntElement(term224, 0, 1638400);
        setIntElement(term224, 1, 720907);
        setElement(term190, 1, term224);
        setElement(term257, 0, term258);
        setElement(term257, 1, term260);
        setElement(term190, 2, term257);
        setLongElement(term262, 0, 34363745472L);
        setLongElement(term262, 1, 34363745472L);
        setElement(term190, 3, term262);
        setElement(term28, 4, term190);
        setField(term27, term27.getClass(), "backtrace", term28);
        setField(term27, term27.getClass(), "detailMessage", "sjlJAEtRrb");
        setField(term27, term27.getClass(), "cause", term27);
        setField(term27, term27.getClass(), "stackTrace", term307);
        setIntField(term27, term27.getClass(), "depth", 34);
        setIntField(term309, term309.getClass(), "modCount", 0);
        setField(term27, term27.getClass(), "suppressedExceptions", term309);
        term323 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Exception");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.Object");
        Object[] args = new Object[3];
        args[0] = term27;
        args[1] = "MuLcgQHgqz";
        args[2] = term323;
        try {
            callMethod(klass, "_throwWrapped", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


