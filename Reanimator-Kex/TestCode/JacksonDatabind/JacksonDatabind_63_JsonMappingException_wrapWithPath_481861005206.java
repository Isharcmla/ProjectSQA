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

public class JsonMappingException_wrapWithPath_481861005206 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term334505;
     Object term335027;
     Object term334793;

    public JsonMappingException_wrapWithPath_481861005206() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term334505 = newInstance(Class.forName("java.lang.ReflectiveOperationException"));
        term335027 = newInstance(Class.forName("java.lang.ReflectiveOperationException"));
        setField(term335027, term335027.getClass(), "backtrace", null);
        setField(term335027, term335027.getClass(), "detailMessage", null);
        setField(term335027, term335027.getClass(), "cause", null);
        setField(term335027, term335027.getClass(), "stackTrace", null);
        setIntField(term335027, term335027.getClass(), "depth", 0);
        setField(term335027, term335027.getClass(), "suppressedExceptions", null);
        LinkedList term334794 = new LinkedList();
        ((LinkedList) term334794).add((Object)null);
        Class<? extends Object> term334866 = Class.forName((String) "java.lang.LiveStackFrame");
        Class<? extends Object> term334873 = Class.forName((String) "java.lang.StackWalker");
        Class<? extends Object> term334877 = Class.forName((String) "kex.java.lang.Integer");
        Class<? extends Object> term334880 = Class.forName((String) "java.lang.reflect.ProxyGenerator$ConstantPool");
        Class<? extends Object> term334884 = Class.forName((String) "java.lang.invoke.LambdaForm$NamedFunction");
        Class<? extends Object> term334888 = Class.forName((String) "com.fasterxml.jackson.databind.util.RawValue");
        Class<? extends Object> term334894 = Class.forName((String) "java.lang.ClassLoaderHelper");
        Class<? extends Object> term334899 = Class.forName((String) "java.util.regex.Pattern$1");
        Class<? extends Object> term334903 = Class.forName((String) "com.fasterxml.jackson.core.io.SerializedString");
        Class<? extends Object> term334907 = Class.forName((String) "java.util.PropertyPermission");
        Class<? extends Object> term334911 = Class.forName((String) "java.util.IllegalFormatConversionException");
        Class<? extends Object> term334915 = Class.forName((String) "java.util.concurrent.Executors$FinalizableDelegatedExecutorService");
        Class<? extends Object> term334919 = Class.forName((String) "java.util.zip.ZipFile$ZipFileInputStream");
        Class<? extends Object> term334922 = Class.forName((String) "java.util.concurrent.locks.AbstractQueuedSynchronizer$Node");
        Class<? extends Object> term334925 = Class.forName((String) "java.lang.reflect.AnnotatedTypeVariable");
        Class<? extends Object> term334929 = Class.forName((String) "java.util.concurrent.CompletableFuture$UniWhenComplete");
        Class<? extends Object> term334933 = Class.forName((String) "java.util.concurrent.LinkedBlockingDeque$DescendingItr");
        Class<? extends Object> term334936 = Class.forName((String) "java.io.RandomAccessFile$1");
        Class<? extends Object> term334940 = Class.forName((String) "com.fasterxml.jackson.core.JsonGenerator");
        term334793 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        Object[] term334798 = (Object[]) newArray("java.lang.Object", 5);
        short[] term334799 = (short[]) newShortArray(32);
        int[] term334832 = (int[]) newIntArray(32);
        Object[] term334865 = (Object[]) newArray("java.lang.Object", 32);
        long[] term334944 = (long[]) newLongArray(32);
        Object term334788 = newInstance(Class.forName("java.lang.ReflectiveOperationException"));
        Object[] term335023 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term335025 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setField(term334793, term334793.getClass(), "_path", term334794);
        setField(term334793, term334793.getClass(), "_processor", null);
        setField(term334793, term334793.getClass(), "_location", null);
        setShortElement(term334799, 0, (short) 20);
        setShortElement(term334799, 1, (short) 3);
        setShortElement(term334799, 5, (short) 27);
        setShortElement(term334799, 6, (short) 2);
        setShortElement(term334799, 7, (short) 3);
        setShortElement(term334799, 11, (short) 2);
        setShortElement(term334799, 12, (short) 4);
        setShortElement(term334799, 13, (short) 4);
        setShortElement(term334799, 14, (short) 3);
        setShortElement(term334799, 15, (short) 4);
        setShortElement(term334799, 16, (short) 4);
        setShortElement(term334799, 17, (short) 1);
        setShortElement(term334799, 18, (short) 2);
        setShortElement(term334799, 19, (short) 3);
        setShortElement(term334799, 20, (short) 3);
        setShortElement(term334799, 21, (short) 13);
        setShortElement(term334799, 22, (short) 1);
        setShortElement(term334799, 23, (short) 2);
        setShortElement(term334799, 24, (short) 12);
        setElement(term334798, 0, term334799);
        setIntElement(term334832, 0, 128385024);
        setIntElement(term334832, 2, 6553600);
        setIntElement(term334832, 3, 393216);
        setIntElement(term334832, 4, 3866630);
        setIntElement(term334832, 5, 1245184);
        setIntElement(term334832, 6, 3211264);
        setIntElement(term334832, 8, 6553600);
        setIntElement(term334832, 9, 393216);
        setIntElement(term334832, 10, 3866630);
        setIntElement(term334832, 11, 14352384);
        setIntElement(term334832, 12, 10354688);
        setIntElement(term334832, 13, 2883584);
        setIntElement(term334832, 14, 786432);
        setIntElement(term334832, 15, 1441792);
        setIntElement(term334832, 16, 7733248);
        setIntElement(term334832, 17, 20774912);
        setIntElement(term334832, 18, 262144);
        setIntElement(term334832, 19, 2555904);
        setIntElement(term334832, 20, 1835008);
        setIntElement(term334832, 21, 6029312);
        setIntElement(term334832, 22, 327680);
        setIntElement(term334832, 23, 1638400);
        setIntElement(term334832, 24, 720907);
        setElement(term334798, 1, term334832);
        setElement(term334865, 0, term334866);
        setElement(term334865, 1, term334873);
        setElement(term334865, 2, term334873);
        setElement(term334865, 3, term334877);
        setElement(term334865, 4, term334880);
        setElement(term334865, 5, term334884);
        setElement(term334865, 6, term334888);
        setElement(term334865, 7, term334873);
        setElement(term334865, 8, term334873);
        setElement(term334865, 9, term334877);
        setElement(term334865, 10, term334880);
        setElement(term334865, 11, term334894);
        setElement(term334865, 12, term334899);
        setElement(term334865, 13, term334903);
        setElement(term334865, 14, term334907);
        setElement(term334865, 15, term334911);
        setElement(term334865, 16, term334903);
        setElement(term334865, 17, term334915);
        setElement(term334865, 18, term334919);
        setElement(term334865, 19, term334922);
        setElement(term334865, 20, term334925);
        setElement(term334865, 21, term334929);
        setElement(term334865, 22, term334933);
        setElement(term334865, 23, term334936);
        setElement(term334865, 24, term334940);
        setElement(term334798, 2, term334865);
        setLongElement(term334944, 0, 132578328546864L);
        setLongElement(term334944, 1, 34364798256L);
        setLongElement(term334944, 2, 34363739368L);
        setLongElement(term334944, 3, 34363739368L);
        setLongElement(term334944, 4, 34363739368L);
        setLongElement(term334944, 5, 132578328998496L);
        setLongElement(term334944, 6, 34363820048L);
        setLongElement(term334944, 7, 34364798256L);
        setLongElement(term334944, 8, 34363739368L);
        setLongElement(term334944, 9, 34363739368L);
        setLongElement(term334944, 10, 34363739368L);
        setLongElement(term334944, 11, 132582552571296L);
        setLongElement(term334944, 12, 132582552640272L);
        setLongElement(term334944, 13, 132582550089488L);
        setLongElement(term334944, 14, 132582552759024L);
        setLongElement(term334944, 15, 132582550089488L);
        setLongElement(term334944, 16, 132582550089488L);
        setLongElement(term334944, 17, 34363745472L);
        setLongElement(term334944, 18, 34364710216L);
        setLongElement(term334944, 19, 34363745472L);
        setLongElement(term334944, 20, 34363745472L);
        setLongElement(term334944, 21, 34364896224L);
        setLongElement(term334944, 22, 34363745472L);
        setLongElement(term334944, 23, 34363745472L);
        setLongElement(term334944, 24, 34363745472L);
        setElement(term334798, 3, term334944);
        setField(term334793, term334793.getClass(), "backtrace", term334798);
        setField(term334793, term334793.getClass(), "detailMessage", "(was java.lang.ReflectiveOperationException)");
        setField(term334788, term334788.getClass(), "backtrace", null);
        setField(term334788, term334788.getClass(), "detailMessage", null);
        setField(term334788, term334788.getClass(), "cause", null);
        setField(term334788, term334788.getClass(), "stackTrace", null);
        setIntField(term334788, term334788.getClass(), "depth", 0);
        setField(term334788, term334788.getClass(), "suppressedExceptions", null);
        setField(term334793, term334793.getClass(), "cause", term334788);
        setField(term334793, term334793.getClass(), "stackTrace", term335023);
        setIntField(term334793, term334793.getClass(), "depth", 25);
        setIntField(term335025, term335025.getClass(), "modCount", 0);
        setField(term334793, term334793.getClass(), "suppressedExceptions", term335025);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.JsonMappingException");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Throwable");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JsonMappingException$Reference");
        Object[] args = new Object[2];
        args[0] = term334505;
        args[1] = null;
        Object retValue = callMethod(klass, "wrapWithPath", argTypes, null, args);
        assertTrue(recursiveEquals(term334505, term335027));
        assertTrue(recursiveEquals(retValue, term334793));
    }

};


