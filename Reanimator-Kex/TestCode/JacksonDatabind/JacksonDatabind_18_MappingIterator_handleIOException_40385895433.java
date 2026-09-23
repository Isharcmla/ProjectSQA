package com.fasterxml.jackson.databind;

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
import static com.fasterxml.jackson.databind.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class MappingIterator_handleIOException_40385895433 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19;

    public MappingIterator_handleIOException_40385895433() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term88 = Class.forName((String) "java.util.concurrent.TimeUnit$1");
        Class<? extends Object> term91 = Class.forName((String) "com.fasterxml.jackson.core.format.InputAccessor$Std");
        Class<? extends Object> term93 = Class.forName((String) "java.lang.invoke.VarHandleDoubles$Array");
        Class<? extends Object> term97 = Class.forName((String) "java.nio.file.CopyMoveHelper$CopyOptions");
        Class<? extends Object> term102 = Class.forName((String) "java.util.EventListenerProxy");
        Class<? extends Object> term106 = Class.forName((String) "java.util.ServiceLoader");
        Class<? extends Object> term110 = Class.forName((String) "java.util.regex.PrintPattern");
        Class<? extends Object> term114 = Class.forName((String) "com.fasterxml.jackson.databind.ser.std.CalendarSerializer");
        Class<? extends Object> term118 = Class.forName((String) "java.io.PushbackReader");
        Class<? extends Object> term122 = Class.forName((String) "java.lang.invoke.VarHandleFloats");
        Class<? extends Object> term126 = Class.forName((String) "java.nio.charset.Charset$2");
        Class<? extends Object> term130 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonFormat$Value");
        Class<? extends Object> term134 = Class.forName((String) "java.nio.channels.GatheringByteChannel");
        Class<? extends Object> term138 = Class.forName((String) "java.util.stream.Streams$IntStreamBuilderImpl");
        Class<? extends Object> term140 = Class.forName((String) "com.fasterxml.jackson.databind.ext.DOMDeserializer$DocumentDeserializer");
        Class<? extends Object> term143 = Class.forName((String) "com.fasterxml.jackson.databind.introspect.MemberKey");
        Class<? extends Object> term145 = Class.forName((String) "java.io.ObjectInputFilter$Status");
        Class<? extends Object> term147 = Class.forName((String) "java.lang.WeakPairMap$Pair");
        Class<? extends Object> term250 = Class.forName((String) "java.lang.reflect.Parameter");
        Class<? extends Object> term252 = Class.forName((String) "java.lang.InheritableThreadLocal");
        term19 = newInstance(Class.forName("java.io.IOException"));
        Object[] term20 = (Object[]) newArray("java.lang.Object", 5);
        short[] term21 = (short[]) newShortArray(32);
        int[] term54 = (int[]) newIntArray(32);
        Object[] term87 = (Object[]) newArray("java.lang.Object", 32);
        long[] term149 = (long[]) newLongArray(32);
        Object[] term182 = (Object[]) newArray("java.lang.Object", 5);
        short[] term183 = (short[]) newShortArray(32);
        int[] term216 = (int[]) newIntArray(32);
        Object[] term249 = (Object[]) newArray("java.lang.Object", 32);
        long[] term254 = (long[]) newLongArray(32);
        Object[] term299 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term301 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setShortElement(term21, 0, (short) 1);
        setShortElement(term21, 1, (short) 2);
        setShortElement(term21, 2, (short) 1);
        setShortElement(term21, 3, (short) 7);
        setShortElement(term21, 4, (short) 2);
        setShortElement(term21, 5, (short) 1);
        setShortElement(term21, 6, (short) 6);
        setShortElement(term21, 7, (short) 2);
        setShortElement(term21, 8, (short) 10);
        setShortElement(term21, 9, (short) 11);
        setShortElement(term21, 10, (short) 29);
        setShortElement(term21, 11, (short) 5);
        setShortElement(term21, 12, (short) 4);
        setShortElement(term21, 13, (short) 6);
        setShortElement(term21, 14, (short) 8);
        setShortElement(term21, 15, (short) 7);
        setShortElement(term21, 16, (short) 10);
        setShortElement(term21, 17, (short) 11);
        setShortElement(term21, 18, (short) 12);
        setShortElement(term21, 19, (short) 4);
        setShortElement(term21, 20, (short) 1);
        setShortElement(term21, 22, (short) 10);
        setShortElement(term21, 23, (short) 3);
        setShortElement(term21, 24, (short) 4);
        setShortElement(term21, 25, (short) 4);
        setShortElement(term21, 26, (short) 1);
        setShortElement(term21, 27, (short) 2);
        setShortElement(term21, 28, (short) 3);
        setShortElement(term21, 29, (short) 3);
        setShortElement(term21, 30, (short) 13);
        setShortElement(term21, 31, (short) 1);
        setElement(term20, 0, term21);
        setIntElement(term54, 1, 5570560);
        setIntElement(term54, 2, 327680);
        setIntElement(term54, 3, 4456454);
        setIntElement(term54, 4, 1769472);
        setIntElement(term54, 5, 14876672);
        setIntElement(term54, 6, 6225920);
        setIntElement(term54, 7, 917504);
        setIntElement(term54, 8, 327680);
        setIntElement(term54, 9, 8519680);
        setIntElement(term54, 10, 917504);
        setIntElement(term54, 11, 11993088);
        setIntElement(term54, 12, 655360);
        setIntElement(term54, 13, 7864320);
        setIntElement(term54, 14, 3735552);
        setIntElement(term54, 15, 7143424);
        setIntElement(term54, 16, 8454144);
        setIntElement(term54, 17, 9240576);
        setIntElement(term54, 18, 196608);
        setIntElement(term54, 19, 3801088);
        setIntElement(term54, 20, 786432);
        setIntElement(term54, 21, 589824);
        setIntElement(term54, 22, 17170432);
        setIntElement(term54, 23, 1376256);
        setIntElement(term54, 24, 5242880);
        setIntElement(term54, 25, 2883584);
        setIntElement(term54, 26, 20774912);
        setIntElement(term54, 27, 262144);
        setIntElement(term54, 28, 2555904);
        setIntElement(term54, 29, 1835008);
        setIntElement(term54, 30, 6029312);
        setIntElement(term54, 31, 327680);
        setElement(term20, 1, term54);
        setElement(term87, 0, term88);
        setElement(term87, 1, term88);
        setElement(term87, 2, term91);
        setElement(term87, 3, term93);
        setElement(term87, 4, term97);
        setElement(term87, 5, term97);
        setElement(term87, 6, term102);
        setElement(term87, 7, term102);
        setElement(term87, 8, term106);
        setElement(term87, 9, term106);
        setElement(term87, 10, term106);
        setElement(term87, 11, term106);
        setElement(term87, 12, term106);
        setElement(term87, 13, term110);
        setElement(term87, 14, term110);
        setElement(term87, 15, term114);
        setElement(term87, 16, term114);
        setElement(term87, 17, term114);
        setElement(term87, 18, term114);
        setElement(term87, 19, term118);
        setElement(term87, 20, term118);
        setElement(term87, 21, term118);
        setElement(term87, 22, term122);
        setElement(term87, 23, term114);
        setElement(term87, 24, term126);
        setElement(term87, 25, term130);
        setElement(term87, 26, term134);
        setElement(term87, 27, term138);
        setElement(term87, 28, term140);
        setElement(term87, 29, term143);
        setElement(term87, 30, term145);
        setElement(term87, 31, term147);
        setElement(term20, 2, term87);
        setLongElement(term149, 0, 34363746224L);
        setLongElement(term149, 1, 34363775512L);
        setLongElement(term149, 2, 34363775512L);
        setLongElement(term149, 3, 34363775512L);
        setLongElement(term149, 4, 133739917216320L);
        setLongElement(term149, 5, 34364440080L);
        setLongElement(term149, 6, 133739917283424L);
        setLongElement(term149, 7, 133739916908128L);
        setLongElement(term149, 8, 133739916908016L);
        setLongElement(term149, 9, 133739916908160L);
        setLongElement(term149, 10, 133739917169904L);
        setLongElement(term149, 11, 34363766248L);
        setLongElement(term149, 12, 34363766248L);
        setLongElement(term149, 13, 133736938686080L);
        setLongElement(term149, 14, 133736938686080L);
        setLongElement(term149, 15, 133736938685936L);
        setLongElement(term149, 16, 133736938729344L);
        setLongElement(term149, 17, 133736938730992L);
        setLongElement(term149, 18, 133736938731760L);
        setLongElement(term149, 19, 133736935666976L);
        setLongElement(term149, 20, 34363739368L);
        setLongElement(term149, 21, 34363739368L);
        setLongElement(term149, 22, 133736938698720L);
        setLongElement(term149, 23, 34363829248L);
        setLongElement(term149, 24, 133736935666976L);
        setLongElement(term149, 25, 133736934846432L);
        setLongElement(term149, 26, 34363745472L);
        setLongElement(term149, 27, 34364710216L);
        setLongElement(term149, 28, 34363745472L);
        setLongElement(term149, 29, 34363745472L);
        setLongElement(term149, 30, 34364896224L);
        setLongElement(term149, 31, 34363745472L);
        setElement(term20, 3, term149);
        setShortElement(term183, 0, (short) 2);
        setShortElement(term183, 1, (short) 12);
        setElement(term182, 0, term183);
        setIntElement(term216, 0, 1638400);
        setIntElement(term216, 1, 720907);
        setElement(term182, 1, term216);
        setElement(term249, 0, term250);
        setElement(term249, 1, term252);
        setElement(term182, 2, term249);
        setLongElement(term254, 0, 34363745472L);
        setLongElement(term254, 1, 34363745472L);
        setElement(term182, 3, term254);
        setElement(term20, 4, term182);
        setField(term19, term19.getClass(), "backtrace", term20);
        setField(term19, term19.getClass(), "detailMessage", "PAEBtnZtTD");
        setField(term19, term19.getClass(), "cause", term19);
        setField(term19, term19.getClass(), "stackTrace", term299);
        setIntField(term19, term19.getClass(), "depth", 34);
        setIntField(term301, term301.getClass(), "modCount", 0);
        setField(term19, term19.getClass(), "suppressedExceptions", term301);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.MappingIterator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.IOException");
        Object[] args = new Object[1];
        args[0] = term19;
        try {
            callMethod(klass, "_handleIOException", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


