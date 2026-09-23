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
     Object term16100;

    public JsonMappingException_from_172999405543() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term16169 = Class.forName((String) "java.util.stream.Nodes$InternalNodeSpliterator$OfRef");
        Class<? extends Object> term16172 = Class.forName((String) "java.lang.invoke.VarHandleByteArrayAsFloats$ArrayHandle");
        Class<? extends Object> term16174 = Class.forName((String) "com.fasterxml.jackson.databind.introspect.ObjectIdInfo");
        Class<? extends Object> term16178 = Class.forName((String) "java.util.stream.SpinedBuffer$OfDouble$1Splitr");
        Class<? extends Object> term16183 = Class.forName((String) "java.util.stream.LongPipeline$StatelessOp");
        Class<? extends Object> term16187 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonMerge");
        Class<? extends Object> term16191 = Class.forName((String) "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$MemberIterator");
        Class<? extends Object> term16195 = Class.forName((String) "java.nio.file.attribute.PosixFileAttributes");
        Class<? extends Object> term16199 = Class.forName((String) "java.nio.channels.spi.AbstractSelector$1");
        Class<? extends Object> term16203 = Class.forName((String) "java.util.IllegalFormatConversionException");
        Class<? extends Object> term16207 = Class.forName((String) "com.fasterxml.jackson.core.io.CharTypes");
        Class<? extends Object> term16211 = Class.forName((String) "java.nio.channels.Pipe");
        Class<? extends Object> term16215 = Class.forName((String) "java.util.concurrent.locks.ReentrantReadWriteLock$FairSync");
        Class<? extends Object> term16219 = Class.forName((String) "java.lang.ProcessHandleImpl$Info");
        Class<? extends Object> term16222 = Class.forName((String) "java.util.function.LongSupplier");
        Class<? extends Object> term16225 = Class.forName((String) "com.fasterxml.jackson.databind.SequenceWriter");
        Class<? extends Object> term16228 = Class.forName((String) "java.util.stream.MatchOps$MatchOp");
        Class<? extends Object> term16231 = Class.forName((String) "java.nio.channels.NoConnectionPendingException");
        Class<? extends Object> term16335 = Class.forName((String) "com.fasterxml.jackson.databind.ser.std.StdSerializer");
        Class<? extends Object> term16337 = Class.forName((String) "java.nio.file.attribute.UserPrincipalLookupService");
        term16100 = newInstance(Class.forName("java.lang.Throwable"));
        Object[] term16101 = (Object[]) newArray("java.lang.Object", 5);
        short[] term16102 = (short[]) newShortArray(32);
        int[] term16135 = (int[]) newIntArray(32);
        Object[] term16168 = (Object[]) newArray("java.lang.Object", 32);
        long[] term16234 = (long[]) newLongArray(32);
        Object[] term16267 = (Object[]) newArray("java.lang.Object", 5);
        short[] term16268 = (short[]) newShortArray(32);
        int[] term16301 = (int[]) newIntArray(32);
        Object[] term16334 = (Object[]) newArray("java.lang.Object", 32);
        long[] term16339 = (long[]) newLongArray(32);
        Object[] term16384 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term16386 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setShortElement(term16102, 0, (short) 1);
        setShortElement(term16102, 1, (short) 2);
        setShortElement(term16102, 2, (short) 1);
        setShortElement(term16102, 3, (short) 7);
        setShortElement(term16102, 4, (short) 2);
        setShortElement(term16102, 5, (short) 1);
        setShortElement(term16102, 6, (short) 6);
        setShortElement(term16102, 7, (short) 2);
        setShortElement(term16102, 8, (short) 10);
        setShortElement(term16102, 9, (short) 11);
        setShortElement(term16102, 10, (short) 29);
        setShortElement(term16102, 11, (short) 5);
        setShortElement(term16102, 12, (short) 4);
        setShortElement(term16102, 13, (short) 5);
        setShortElement(term16102, 14, (short) 6);
        setShortElement(term16102, 15, (short) 6);
        setShortElement(term16102, 16, (short) 9);
        setShortElement(term16102, 17, (short) 10);
        setShortElement(term16102, 18, (short) 11);
        setShortElement(term16102, 19, (short) 4);
        setShortElement(term16102, 20, (short) 1);
        setShortElement(term16102, 23, (short) 3);
        setShortElement(term16102, 24, (short) 4);
        setShortElement(term16102, 25, (short) 4);
        setShortElement(term16102, 26, (short) 1);
        setShortElement(term16102, 27, (short) 2);
        setShortElement(term16102, 28, (short) 3);
        setShortElement(term16102, 29, (short) 3);
        setShortElement(term16102, 30, (short) 13);
        setShortElement(term16102, 31, (short) 1);
        setElement(term16101, 0, term16102);
        setIntElement(term16135, 1, 5570560);
        setIntElement(term16135, 2, 327680);
        setIntElement(term16135, 3, 4456454);
        setIntElement(term16135, 4, 1769472);
        setIntElement(term16135, 5, 14876672);
        setIntElement(term16135, 6, 6225920);
        setIntElement(term16135, 7, 917504);
        setIntElement(term16135, 8, 327680);
        setIntElement(term16135, 9, 8519680);
        setIntElement(term16135, 10, 917504);
        setIntElement(term16135, 11, 11993088);
        setIntElement(term16135, 12, 655360);
        setIntElement(term16135, 13, 7864320);
        setIntElement(term16135, 14, 3735552);
        setIntElement(term16135, 15, 7143424);
        setIntElement(term16135, 16, 8454144);
        setIntElement(term16135, 17, 9240576);
        setIntElement(term16135, 18, 196608);
        setIntElement(term16135, 19, 3801088);
        setIntElement(term16135, 20, 786432);
        setIntElement(term16135, 21, 589824);
        setIntElement(term16135, 22, 17170432);
        setIntElement(term16135, 23, 1376256);
        setIntElement(term16135, 24, 5242880);
        setIntElement(term16135, 25, 2883584);
        setIntElement(term16135, 26, 20774912);
        setIntElement(term16135, 27, 262144);
        setIntElement(term16135, 28, 2555904);
        setIntElement(term16135, 29, 1835008);
        setIntElement(term16135, 30, 6029312);
        setIntElement(term16135, 31, 327680);
        setElement(term16101, 1, term16135);
        setElement(term16168, 0, term16169);
        setElement(term16168, 1, term16169);
        setElement(term16168, 2, term16172);
        setElement(term16168, 3, term16174);
        setElement(term16168, 4, term16178);
        setElement(term16168, 5, term16178);
        setElement(term16168, 6, term16183);
        setElement(term16168, 7, term16183);
        setElement(term16168, 8, term16187);
        setElement(term16168, 9, term16187);
        setElement(term16168, 10, term16187);
        setElement(term16168, 11, term16187);
        setElement(term16168, 12, term16187);
        setElement(term16168, 13, term16191);
        setElement(term16168, 14, term16191);
        setElement(term16168, 15, term16195);
        setElement(term16168, 16, term16195);
        setElement(term16168, 17, term16195);
        setElement(term16168, 18, term16195);
        setElement(term16168, 19, term16199);
        setElement(term16168, 20, term16199);
        setElement(term16168, 21, term16199);
        setElement(term16168, 22, term16203);
        setElement(term16168, 23, term16195);
        setElement(term16168, 24, term16207);
        setElement(term16168, 25, term16211);
        setElement(term16168, 26, term16215);
        setElement(term16168, 27, term16219);
        setElement(term16168, 28, term16222);
        setElement(term16168, 29, term16225);
        setElement(term16168, 30, term16228);
        setElement(term16168, 31, term16231);
        setElement(term16101, 2, term16168);
        setLongElement(term16234, 0, 34363746224L);
        setLongElement(term16234, 1, 34363775512L);
        setLongElement(term16234, 2, 34363775512L);
        setLongElement(term16234, 3, 34363775512L);
        setLongElement(term16234, 4, 137704038008160L);
        setLongElement(term16234, 5, 34364440080L);
        setLongElement(term16234, 6, 137704038075264L);
        setLongElement(term16234, 7, 137704037917728L);
        setLongElement(term16234, 8, 137704037917616L);
        setLongElement(term16234, 9, 137704037917760L);
        setLongElement(term16234, 10, 137704037961744L);
        setLongElement(term16234, 11, 34363766248L);
        setLongElement(term16234, 12, 34363766248L);
        setLongElement(term16234, 13, 137700514237344L);
        setLongElement(term16234, 14, 137700514237344L);
        setLongElement(term16234, 15, 137700514237200L);
        setLongElement(term16234, 16, 137700514280496L);
        setLongElement(term16234, 17, 137700514282144L);
        setLongElement(term16234, 18, 137700514282912L);
        setLongElement(term16234, 19, 137704040228208L);
        setLongElement(term16234, 20, 34363739368L);
        setLongElement(term16234, 21, 34363739368L);
        setLongElement(term16234, 22, 137700514235840L);
        setLongElement(term16234, 23, 34363829248L);
        setLongElement(term16234, 24, 137704040228208L);
        setLongElement(term16234, 25, 137704040203680L);
        setLongElement(term16234, 26, 34363745472L);
        setLongElement(term16234, 27, 34364710216L);
        setLongElement(term16234, 28, 34363745472L);
        setLongElement(term16234, 29, 34363745472L);
        setLongElement(term16234, 30, 34364896224L);
        setLongElement(term16234, 31, 34363745472L);
        setElement(term16101, 3, term16234);
        setShortElement(term16268, 0, (short) 2);
        setShortElement(term16268, 1, (short) 12);
        setElement(term16267, 0, term16268);
        setIntElement(term16301, 0, 1638400);
        setIntElement(term16301, 1, 720907);
        setElement(term16267, 1, term16301);
        setElement(term16334, 0, term16335);
        setElement(term16334, 1, term16337);
        setElement(term16267, 2, term16334);
        setLongElement(term16339, 0, 34363745472L);
        setLongElement(term16339, 1, 34363745472L);
        setElement(term16267, 3, term16339);
        setElement(term16101, 4, term16267);
        setField(term16100, term16100.getClass(), "backtrace", term16101);
        setField(term16100, term16100.getClass(), "detailMessage", "HyxfbSQYBe");
        setField(term16100, term16100.getClass(), "cause", term16100);
        setField(term16100, term16100.getClass(), "stackTrace", term16384);
        setIntField(term16100, term16100.getClass(), "depth", 34);
        setIntField(term16386, term16386.getClass(), "modCount", 0);
        setField(term16100, term16100.getClass(), "suppressedExceptions", term16386);
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
        args[2] = term16100;
        try {
            callMethod(klass, "from", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


