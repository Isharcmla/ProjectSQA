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
import java.util.LinkedList;
import java.lang.Object;
import java.lang.String;

public class JsonMappingException_wrapWithPath_481861005450 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term694516;
     Object term694975;
     Object term694758;

    public JsonMappingException_wrapWithPath_481861005450() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term694516 = newInstance(Class.forName("java.util.IllegalFormatFlagsException"));
        term694975 = newInstance(Class.forName("java.util.IllegalFormatFlagsException"));
        setField(term694975, term694975.getClass(), "flags", null);
        setField(term694975, term694975.getClass(), "backtrace", null);
        setField(term694975, term694975.getClass(), "detailMessage", null);
        setField(term694975, term694975.getClass(), "cause", null);
        setField(term694975, term694975.getClass(), "stackTrace", null);
        setIntField(term694975, term694975.getClass(), "depth", 0);
        setField(term694975, term694975.getClass(), "suppressedExceptions", null);
        LinkedList term694759 = new LinkedList();
        ((LinkedList) term694759).add((Object)null);
        Class<? extends Object> term694831 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonFormat$Shape");
        Class<? extends Object> term694838 = Class.forName((String) "java.util.regex.Pattern$BehindS");
        Class<? extends Object> term694851 = Class.forName((String) "java.nio.file.WatchEvent$Modifier");
        Class<? extends Object> term694855 = Class.forName((String) "java.util.Collections$3");
        Class<? extends Object> term694859 = Class.forName((String) "com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer$TableInfo");
        Class<? extends Object> term694863 = Class.forName((String) "java.util.Collections$CheckedNavigableMap");
        Class<? extends Object> term694869 = Class.forName((String) "java.io.PipedOutputStream");
        Class<? extends Object> term694872 = Class.forName((String) "java.nio.charset.Charset$ExtendedProviderHolder");
        Class<? extends Object> term694877 = Class.forName((String) "java.util.Collections$SynchronizedSortedMap");
        Class<? extends Object> term694881 = Class.forName((String) "java.util.concurrent.CancellationException");
        Class<? extends Object> term694885 = Class.forName((String) "java.util.ServiceLoader$ProviderSpliterator");
        Class<? extends Object> term694889 = Class.forName((String) "java.util.EnumMap$EntryIterator");
        Class<? extends Object> term694893 = Class.forName((String) "java.util.KeyValueHolder");
        Class<? extends Object> term694897 = Class.forName((String) "java.util.FormatFlagsConversionMismatchException");
        Class<? extends Object> term694900 = Class.forName((String) "java.util.stream.IntPipeline$StatefulOp");
        Class<? extends Object> term694903 = Class.forName((String) "com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder");
        Class<? extends Object> term694907 = Class.forName((String) "java.util.IllegalFormatException");
        Class<? extends Object> term694911 = Class.forName((String) "java.util.stream.PipelineHelper");
        Class<? extends Object> term694914 = Class.forName((String) "com.fasterxml.jackson.databind.jsontype.NamedType");
        Class<? extends Object> term694918 = Class.forName((String) "java.util.ArraysParallelSortHelpers$FJObject$Sorter");
        term694758 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        Object[] term694763 = (Object[]) newArray("java.lang.Object", 5);
        short[] term694764 = (short[]) newShortArray(32);
        int[] term694797 = (int[]) newIntArray(32);
        Object[] term694830 = (Object[]) newArray("java.lang.Object", 32);
        long[] term694922 = (long[]) newLongArray(32);
        Object term694753 = newInstance(Class.forName("java.util.IllegalFormatFlagsException"));
        Object[] term694971 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term694973 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setField(term694758, term694758.getClass(), "_path", term694759);
        setField(term694758, term694758.getClass(), "_processor", null);
        setField(term694758, term694758.getClass(), "_location", null);
        setShortElement(term694764, 0, (short) 20);
        setShortElement(term694764, 4, (short) 27);
        setShortElement(term694764, 5, (short) 2);
        setShortElement(term694764, 6, (short) 3);
        setShortElement(term694764, 10, (short) 2);
        setShortElement(term694764, 11, (short) 4);
        setShortElement(term694764, 12, (short) 4);
        setShortElement(term694764, 13, (short) 3);
        setShortElement(term694764, 14, (short) 4);
        setShortElement(term694764, 15, (short) 4);
        setShortElement(term694764, 16, (short) 1);
        setShortElement(term694764, 17, (short) 2);
        setShortElement(term694764, 18, (short) 3);
        setShortElement(term694764, 19, (short) 3);
        setShortElement(term694764, 20, (short) 13);
        setShortElement(term694764, 21, (short) 1);
        setShortElement(term694764, 22, (short) 2);
        setShortElement(term694764, 23, (short) 12);
        setElement(term694763, 0, term694764);
        setIntElement(term694797, 0, 128385024);
        setIntElement(term694797, 1, 2097152);
        setIntElement(term694797, 2, 393216);
        setIntElement(term694797, 3, 3866630);
        setIntElement(term694797, 4, 1245184);
        setIntElement(term694797, 5, 3211264);
        setIntElement(term694797, 7, 6553600);
        setIntElement(term694797, 8, 393216);
        setIntElement(term694797, 9, 3866630);
        setIntElement(term694797, 10, 14352384);
        setIntElement(term694797, 11, 10354688);
        setIntElement(term694797, 12, 2883584);
        setIntElement(term694797, 13, 786432);
        setIntElement(term694797, 14, 1441792);
        setIntElement(term694797, 15, 7733248);
        setIntElement(term694797, 16, 20774912);
        setIntElement(term694797, 17, 262144);
        setIntElement(term694797, 18, 2555904);
        setIntElement(term694797, 19, 1835008);
        setIntElement(term694797, 20, 6029312);
        setIntElement(term694797, 21, 327680);
        setIntElement(term694797, 22, 1638400);
        setIntElement(term694797, 23, 720907);
        setElement(term694763, 1, term694797);
        setElement(term694830, 0, term694831);
        setElement(term694830, 1, term694838);
        setElement(term694830, 2, term694851);
        setElement(term694830, 3, term694855);
        setElement(term694830, 4, term694859);
        setElement(term694830, 5, term694863);
        setElement(term694830, 6, term694869);
        setElement(term694830, 7, term694869);
        setElement(term694830, 8, term694851);
        setElement(term694830, 9, term694855);
        setElement(term694830, 10, term694872);
        setElement(term694830, 11, term694877);
        setElement(term694830, 12, term694881);
        setElement(term694830, 13, term694885);
        setElement(term694830, 14, term694889);
        setElement(term694830, 15, term694881);
        setElement(term694830, 16, term694893);
        setElement(term694830, 17, term694897);
        setElement(term694830, 18, term694900);
        setElement(term694830, 19, term694903);
        setElement(term694830, 20, term694907);
        setElement(term694830, 21, term694911);
        setElement(term694830, 22, term694914);
        setElement(term694830, 23, term694918);
        setElement(term694763, 2, term694830);
        setLongElement(term694922, 0, 132578328546864L);
        setLongElement(term694922, 1, 34363739368L);
        setLongElement(term694922, 2, 34363739368L);
        setLongElement(term694922, 3, 34363739368L);
        setLongElement(term694922, 4, 132578328998496L);
        setLongElement(term694922, 5, 34363820048L);
        setLongElement(term694922, 6, 34364798256L);
        setLongElement(term694922, 7, 34363739368L);
        setLongElement(term694922, 8, 34363739368L);
        setLongElement(term694922, 9, 34363739368L);
        setLongElement(term694922, 10, 132582552571296L);
        setLongElement(term694922, 11, 132582552640272L);
        setLongElement(term694922, 12, 132582550089488L);
        setLongElement(term694922, 13, 132582552759024L);
        setLongElement(term694922, 14, 132582550089488L);
        setLongElement(term694922, 15, 132582550089488L);
        setLongElement(term694922, 16, 34363745472L);
        setLongElement(term694922, 17, 34364710216L);
        setLongElement(term694922, 18, 34363745472L);
        setLongElement(term694922, 19, 34363745472L);
        setLongElement(term694922, 20, 34364896224L);
        setLongElement(term694922, 21, 34363745472L);
        setLongElement(term694922, 22, 34363745472L);
        setLongElement(term694922, 23, 34363745472L);
        setElement(term694763, 3, term694922);
        setField(term694758, term694758.getClass(), "backtrace", term694763);
        setField(term694758, term694758.getClass(), "detailMessage", "Flags = \'null\'");
        setField(term694753, term694753.getClass(), "flags", null);
        setField(term694753, term694753.getClass(), "backtrace", null);
        setField(term694753, term694753.getClass(), "detailMessage", null);
        setField(term694753, term694753.getClass(), "cause", null);
        setField(term694753, term694753.getClass(), "stackTrace", null);
        setIntField(term694753, term694753.getClass(), "depth", 0);
        setField(term694753, term694753.getClass(), "suppressedExceptions", null);
        setField(term694758, term694758.getClass(), "cause", term694753);
        setField(term694758, term694758.getClass(), "stackTrace", term694971);
        setIntField(term694758, term694758.getClass(), "depth", 24);
        setIntField(term694973, term694973.getClass(), "modCount", 0);
        setField(term694758, term694758.getClass(), "suppressedExceptions", term694973);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.JsonMappingException");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Throwable");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JsonMappingException$Reference");
        Object[] args = new Object[2];
        args[0] = term694516;
        args[1] = null;
        Object retValue = callMethod(klass, "wrapWithPath", argTypes, null, args);
        assertTrue(recursiveEquals(term694516, term694975));
        assertTrue(recursiveEquals(retValue, term694758));
    }

};


