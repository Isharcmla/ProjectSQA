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

public class JsonMappingException_from_172999405543 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15000;

    public JsonMappingException_from_172999405543() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term15069 = Class.forName((String) "java.lang.ProcessImpl");
        Class<? extends Object> term15072 = Class.forName((String) "java.nio.Buffer");
        Class<? extends Object> term15074 = Class.forName((String) "com.fasterxml.jackson.databind.util.ArrayBuilders");
        Class<? extends Object> term15078 = Class.forName((String) "java.util.regex.Pattern$GroupTail");
        Class<? extends Object> term15083 = Class.forName((String) "java.util.ArrayPrefixHelpers$LongCumulateTask");
        Class<? extends Object> term15087 = Class.forName((String) "com.fasterxml.jackson.databind.ser.BeanSerializerBuilder");
        Class<? extends Object> term15091 = Class.forName((String) "java.util.TreeMap$DescendingSubMap$DescendingEntrySetView");
        Class<? extends Object> term15095 = Class.forName((String) "org.vorpal.research.kex.intrinsics.IntrinsicInvocationException");
        Class<? extends Object> term15099 = Class.forName((String) "java.nio.ByteBufferAsShortBufferRL");
        Class<? extends Object> term15103 = Class.forName((String) "java.util.concurrent.ConcurrentLinkedDeque");
        Class<? extends Object> term15107 = Class.forName((String) "com.fasterxml.jackson.databind.node.JsonNodeFactory");
        Class<? extends Object> term15111 = Class.forName((String) "com.fasterxml.jackson.core.base.ParserBase");
        Class<? extends Object> term15115 = Class.forName((String) "java.util.Spliterators$ArraySpliterator");
        Class<? extends Object> term15119 = Class.forName((String) "java.nio.DirectByteBuffer");
        Class<? extends Object> term15121 = Class.forName((String) "java.io.BufferedReader");
        Class<? extends Object> term15124 = Class.forName((String) "com.fasterxml.jackson.databind.jsontype.impl.package-info");
        Class<? extends Object> term15126 = Class.forName((String) "java.util.Collections$UnmodifiableRandomAccessList");
        Class<? extends Object> term15128 = Class.forName((String) "java.lang.invoke.VarHandleInts$FieldStaticReadWrite");
        Class<? extends Object> term15231 = Class.forName((String) "java.util.stream.Nodes$EmptyNode$OfLong");
        Class<? extends Object> term15233 = Class.forName((String) "java.lang.InternalError");
        term15000 = newInstance(Class.forName("java.lang.Throwable"));
        Object[] term15001 = (Object[]) newArray("java.lang.Object", 5);
        short[] term15002 = (short[]) newShortArray(32);
        int[] term15035 = (int[]) newIntArray(32);
        Object[] term15068 = (Object[]) newArray("java.lang.Object", 32);
        long[] term15130 = (long[]) newLongArray(32);
        Object[] term15163 = (Object[]) newArray("java.lang.Object", 5);
        short[] term15164 = (short[]) newShortArray(32);
        int[] term15197 = (int[]) newIntArray(32);
        Object[] term15230 = (Object[]) newArray("java.lang.Object", 32);
        long[] term15235 = (long[]) newLongArray(32);
        Object[] term15280 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term15282 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setShortElement(term15002, 0, (short) 1);
        setShortElement(term15002, 1, (short) 2);
        setShortElement(term15002, 2, (short) 1);
        setShortElement(term15002, 3, (short) 7);
        setShortElement(term15002, 4, (short) 2);
        setShortElement(term15002, 5, (short) 1);
        setShortElement(term15002, 6, (short) 6);
        setShortElement(term15002, 7, (short) 2);
        setShortElement(term15002, 8, (short) 10);
        setShortElement(term15002, 9, (short) 11);
        setShortElement(term15002, 10, (short) 29);
        setShortElement(term15002, 11, (short) 5);
        setShortElement(term15002, 12, (short) 4);
        setShortElement(term15002, 13, (short) 6);
        setShortElement(term15002, 14, (short) 8);
        setShortElement(term15002, 15, (short) 6);
        setShortElement(term15002, 16, (short) 9);
        setShortElement(term15002, 17, (short) 10);
        setShortElement(term15002, 18, (short) 11);
        setShortElement(term15002, 19, (short) 4);
        setShortElement(term15002, 20, (short) 1);
        setShortElement(term15002, 22, (short) 10);
        setShortElement(term15002, 23, (short) 3);
        setShortElement(term15002, 24, (short) 4);
        setShortElement(term15002, 25, (short) 4);
        setShortElement(term15002, 26, (short) 1);
        setShortElement(term15002, 27, (short) 2);
        setShortElement(term15002, 28, (short) 3);
        setShortElement(term15002, 29, (short) 3);
        setShortElement(term15002, 30, (short) 13);
        setShortElement(term15002, 31, (short) 1);
        setElement(term15001, 0, term15002);
        setIntElement(term15035, 1, 5570560);
        setIntElement(term15035, 2, 327680);
        setIntElement(term15035, 3, 4456454);
        setIntElement(term15035, 4, 1769472);
        setIntElement(term15035, 5, 14876672);
        setIntElement(term15035, 6, 6225920);
        setIntElement(term15035, 7, 917504);
        setIntElement(term15035, 8, 327680);
        setIntElement(term15035, 9, 8519680);
        setIntElement(term15035, 10, 917504);
        setIntElement(term15035, 11, 11993088);
        setIntElement(term15035, 12, 655360);
        setIntElement(term15035, 13, 7864320);
        setIntElement(term15035, 14, 3735552);
        setIntElement(term15035, 15, 7143424);
        setIntElement(term15035, 16, 8454144);
        setIntElement(term15035, 17, 9240576);
        setIntElement(term15035, 18, 196608);
        setIntElement(term15035, 19, 3801088);
        setIntElement(term15035, 20, 786432);
        setIntElement(term15035, 21, 589824);
        setIntElement(term15035, 22, 17170432);
        setIntElement(term15035, 23, 1376256);
        setIntElement(term15035, 24, 5242880);
        setIntElement(term15035, 25, 2883584);
        setIntElement(term15035, 26, 20774912);
        setIntElement(term15035, 27, 262144);
        setIntElement(term15035, 28, 2555904);
        setIntElement(term15035, 29, 1835008);
        setIntElement(term15035, 30, 6029312);
        setIntElement(term15035, 31, 327680);
        setElement(term15001, 1, term15035);
        setElement(term15068, 0, term15069);
        setElement(term15068, 1, term15069);
        setElement(term15068, 2, term15072);
        setElement(term15068, 3, term15074);
        setElement(term15068, 4, term15078);
        setElement(term15068, 5, term15078);
        setElement(term15068, 6, term15083);
        setElement(term15068, 7, term15083);
        setElement(term15068, 8, term15087);
        setElement(term15068, 9, term15087);
        setElement(term15068, 10, term15087);
        setElement(term15068, 11, term15087);
        setElement(term15068, 12, term15087);
        setElement(term15068, 13, term15091);
        setElement(term15068, 14, term15091);
        setElement(term15068, 15, term15095);
        setElement(term15068, 16, term15095);
        setElement(term15068, 17, term15095);
        setElement(term15068, 18, term15095);
        setElement(term15068, 19, term15099);
        setElement(term15068, 20, term15099);
        setElement(term15068, 21, term15099);
        setElement(term15068, 22, term15103);
        setElement(term15068, 23, term15095);
        setElement(term15068, 24, term15107);
        setElement(term15068, 25, term15111);
        setElement(term15068, 26, term15115);
        setElement(term15068, 27, term15119);
        setElement(term15068, 28, term15121);
        setElement(term15068, 29, term15124);
        setElement(term15068, 30, term15126);
        setElement(term15068, 31, term15128);
        setElement(term15001, 2, term15068);
        setLongElement(term15130, 0, 34363746224L);
        setLongElement(term15130, 1, 34363775512L);
        setLongElement(term15130, 2, 34363775512L);
        setLongElement(term15130, 3, 34363775512L);
        setLongElement(term15130, 4, 137160187801520L);
        setLongElement(term15130, 5, 34364440080L);
        setLongElement(term15130, 6, 137160187868672L);
        setLongElement(term15130, 7, 137160187711024L);
        setLongElement(term15130, 8, 137160187710912L);
        setLongElement(term15130, 9, 137160187711056L);
        setLongElement(term15130, 10, 137160187755152L);
        setLongElement(term15130, 11, 34363766248L);
        setLongElement(term15130, 12, 34363766248L);
        setLongElement(term15130, 13, 137157266191152L);
        setLongElement(term15130, 14, 137157266191152L);
        setLongElement(term15130, 15, 137157266191008L);
        setLongElement(term15130, 16, 137157266235568L);
        setLongElement(term15130, 17, 137157266237216L);
        setLongElement(term15130, 18, 137157266237984L);
        setLongElement(term15130, 19, 137157263167376L);
        setLongElement(term15130, 20, 34363739368L);
        setLongElement(term15130, 21, 34363739368L);
        setLongElement(term15130, 22, 137157266189648L);
        setLongElement(term15130, 23, 34363829248L);
        setLongElement(term15130, 24, 137157263167376L);
        setLongElement(term15130, 25, 137157262310128L);
        setLongElement(term15130, 26, 34363745472L);
        setLongElement(term15130, 27, 34364710216L);
        setLongElement(term15130, 28, 34363745472L);
        setLongElement(term15130, 29, 34363745472L);
        setLongElement(term15130, 30, 34364896224L);
        setLongElement(term15130, 31, 34363745472L);
        setElement(term15001, 3, term15130);
        setShortElement(term15164, 0, (short) 2);
        setShortElement(term15164, 1, (short) 12);
        setElement(term15163, 0, term15164);
        setIntElement(term15197, 0, 1638400);
        setIntElement(term15197, 1, 720907);
        setElement(term15163, 1, term15197);
        setElement(term15230, 0, term15231);
        setElement(term15230, 1, term15233);
        setElement(term15163, 2, term15230);
        setLongElement(term15235, 0, 34363745472L);
        setLongElement(term15235, 1, 34363745472L);
        setElement(term15163, 3, term15235);
        setElement(term15001, 4, term15163);
        setField(term15000, term15000.getClass(), "backtrace", term15001);
        setField(term15000, term15000.getClass(), "detailMessage", "HyxfbSQYBe");
        setField(term15000, term15000.getClass(), "cause", term15000);
        setField(term15000, term15000.getClass(), "stackTrace", term15280);
        setIntField(term15000, term15000.getClass(), "depth", 34);
        setIntField(term15282, term15282.getClass(), "modCount", 0);
        setField(term15000, term15000.getClass(), "suppressedExceptions", term15282);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.JsonMappingException");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.Throwable");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = "tbcdzjIfER";
        args[2] = term15000;
        try {
            callMethod(klass, "from", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


