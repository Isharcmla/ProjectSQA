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
import static com.fasterxml.jackson.databind.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.databind.EqualityUtils.*;
import java.lang.Object;
import java.lang.String;

public class JsonMappingException_init_129192110237 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68584;

    public JsonMappingException_init_129192110237() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term68589 = Class.forName((String) "java.lang.invoke.StringConcatFactory$MethodHandleStringBuilderStrategy");
        Class<? extends Object> term68591 = Class.forName((String) "java.io.StringReader");
        Class<? extends Object> term68592 = Class.forName((String) "kex.java.lang.Character");
        Class<? extends Object> term68595 = Class.forName((String) "java.util.stream.StreamSpliterators$DelegatingSpliterator$OfInt");
        Class<? extends Object> term68599 = Class.forName((String) "java.util.Collections$UnmodifiableCollection");
        Class<? extends Object> term68603 = Class.forName((String) "com.fasterxml.jackson.core.SerializableString");
        Class<? extends Object> term68604 = Class.forName((String) "java.lang.StackStreamFactory");
        Class<? extends Object> term68605 = Class.forName((String) "java.nio.channels.Channels$WritableByteChannelImpl");
        Class<? extends Object> term68608 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonClassDescription");
        Class<? extends Object> term68612 = Class.forName((String) "java.util.stream.WhileOps$UnorderedWhileSpliterator$OfInt");
        Class<? extends Object> term68615 = Class.forName((String) "java.lang.Throwable$PrintStreamOrWriter");
        Class<? extends Object> term68618 = Class.forName((String) "java.lang.ref.FinalReference");
        Class<? extends Object> term68621 = Class.forName((String) "java.util.concurrent.LinkedBlockingDeque$Node");
        Class<? extends Object> term68624 = Class.forName((String) "java.util.stream.SortedOps$AbstractRefSortingSink");
        Class<? extends Object> term68627 = Class.forName((String) "java.util.concurrent.ThreadLocalRandom");
        Class<? extends Object> term68629 = Class.forName((String) "java.lang.invoke.ProxyClassesDumper$1");
        Class<? extends Object> term68631 = Class.forName((String) "java.util.stream.Nodes$IntSpinedNodeBuilder");
        Class<? extends Object> term68633 = Class.forName((String) "java.util.zip.ZipFile$CleanableResource$FinalizableResource");
        Class<? extends Object> term68635 = Class.forName((String) "com.fasterxml.jackson.databind.node.package-info");
        Class<? extends Object> term68637 = Class.forName((String) "java.util.stream.ReferencePipeline$6");
        Class<? extends Object> term68640 = Class.forName((String) "com.fasterxml.jackson.core.async.NonBlockingInputFeeder");
        term68584 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        Object[] term68585 = (Object[]) newArray("java.lang.Object", 5);
        short[] term68586 = (short[]) newShortArray(32);
        int[] term68587 = (int[]) newIntArray(32);
        Object[] term68588 = (Object[]) newArray("java.lang.Object", 32);
        long[] term68643 = (long[]) newLongArray(32);
        Object[] term68646 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term68647 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setField(term68584, term68584.getClass(), "_path", null);
        setField(term68584, term68584.getClass(), "_processor", null);
        setField(term68584, term68584.getClass(), "_location", null);
        setShortElement(term68586, 0, (short) 1);
        setShortElement(term68586, 1, (short) 2);
        setShortElement(term68586, 2, (short) 1);
        setShortElement(term68586, 3, (short) 7);
        setShortElement(term68586, 4, (short) 6);
        setShortElement(term68586, 5, (short) 2);
        setShortElement(term68586, 6, (short) 3);
        setShortElement(term68586, 10, (short) 2);
        setShortElement(term68586, 11, (short) 4);
        setShortElement(term68586, 12, (short) 4);
        setShortElement(term68586, 13, (short) 3);
        setShortElement(term68586, 14, (short) 4);
        setShortElement(term68586, 15, (short) 4);
        setShortElement(term68586, 16, (short) 1);
        setShortElement(term68586, 17, (short) 2);
        setShortElement(term68586, 18, (short) 3);
        setShortElement(term68586, 19, (short) 3);
        setShortElement(term68586, 20, (short) 13);
        setShortElement(term68586, 21, (short) 1);
        setShortElement(term68586, 22, (short) 2);
        setShortElement(term68586, 23, (short) 12);
        setElement(term68585, 0, term68586);
        setIntElement(term68587, 1, 5570560);
        setIntElement(term68587, 2, 327680);
        setIntElement(term68587, 3, 4456454);
        setIntElement(term68587, 4, 851968);
        setIntElement(term68587, 5, 3670016);
        setIntElement(term68587, 7, 6553600);
        setIntElement(term68587, 8, 393216);
        setIntElement(term68587, 9, 3866630);
        setIntElement(term68587, 10, 14352384);
        setIntElement(term68587, 11, 10354688);
        setIntElement(term68587, 12, 2883584);
        setIntElement(term68587, 13, 786432);
        setIntElement(term68587, 14, 1441792);
        setIntElement(term68587, 15, 7733248);
        setIntElement(term68587, 16, 20774912);
        setIntElement(term68587, 17, 262144);
        setIntElement(term68587, 18, 2555904);
        setIntElement(term68587, 19, 1835008);
        setIntElement(term68587, 20, 6029312);
        setIntElement(term68587, 21, 327680);
        setIntElement(term68587, 22, 1638400);
        setIntElement(term68587, 23, 720907);
        setElement(term68585, 1, term68587);
        setElement(term68588, 0, term68589);
        setElement(term68588, 1, term68589);
        setElement(term68588, 2, term68591);
        setElement(term68588, 3, term68592);
        setElement(term68588, 4, term68595);
        setElement(term68588, 5, term68599);
        setElement(term68588, 6, term68603);
        setElement(term68588, 7, term68603);
        setElement(term68588, 8, term68604);
        setElement(term68588, 9, term68605);
        setElement(term68588, 10, term68608);
        setElement(term68588, 11, term68612);
        setElement(term68588, 12, term68615);
        setElement(term68588, 13, term68618);
        setElement(term68588, 14, term68621);
        setElement(term68588, 15, term68615);
        setElement(term68588, 16, term68624);
        setElement(term68588, 17, term68627);
        setElement(term68588, 18, term68629);
        setElement(term68588, 19, term68631);
        setElement(term68588, 20, term68633);
        setElement(term68588, 21, term68635);
        setElement(term68588, 22, term68637);
        setElement(term68588, 23, term68640);
        setElement(term68585, 2, term68588);
        setLongElement(term68643, 0, 34363746224L);
        setLongElement(term68643, 1, 34363775512L);
        setLongElement(term68643, 2, 34363775512L);
        setLongElement(term68643, 3, 34363775512L);
        setLongElement(term68643, 4, 132073600938288L);
        setLongElement(term68643, 5, 34363820048L);
        setLongElement(term68643, 6, 34364798256L);
        setLongElement(term68643, 7, 34363739368L);
        setLongElement(term68643, 8, 34363739368L);
        setLongElement(term68643, 9, 34363739368L);
        setLongElement(term68643, 10, 132077283560208L);
        setLongElement(term68643, 11, 132077283629184L);
        setLongElement(term68643, 12, 132077281112816L);
        setLongElement(term68643, 13, 132077283747392L);
        setLongElement(term68643, 14, 132077281112816L);
        setLongElement(term68643, 15, 132077281112816L);
        setLongElement(term68643, 16, 34363745472L);
        setLongElement(term68643, 17, 34364710216L);
        setLongElement(term68643, 18, 34363745472L);
        setLongElement(term68643, 19, 34363745472L);
        setLongElement(term68643, 20, 34364896224L);
        setLongElement(term68643, 21, 34363745472L);
        setLongElement(term68643, 22, 34363745472L);
        setLongElement(term68643, 23, 34363745472L);
        setElement(term68585, 3, term68643);
        setField(term68584, term68584.getClass(), "backtrace", term68585);
        setField(term68584, term68584.getClass(), "detailMessage", "RMFIsYGgne");
        setField(term68584, term68584.getClass(), "cause", term68584);
        setField(term68584, term68584.getClass(), "stackTrace", term68646);
        setIntField(term68584, term68584.getClass(), "depth", 24);
        setIntField(term68647, term68647.getClass(), "modCount", 0);
        setField(term68584, term68584.getClass(), "suppressedExceptions", term68647);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.JsonMappingException");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.io.Closeable");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("com.fasterxml.jackson.core.JsonLocation");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = "RMFIsYGgne";
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term68584));
    }

};


