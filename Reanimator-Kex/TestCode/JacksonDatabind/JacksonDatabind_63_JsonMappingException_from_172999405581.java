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

public class JsonMappingException_from_172999405581 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term172464;
     Object term172716;
     Object term172531;

    public JsonMappingException_from_172999405581() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term172464 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        term172716 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(term172716, term172716.getClass(), "_objectIds", null);
        setField(term172716, term172716.getClass(), "_objectIdResolvers", null);
        setField(term172716, term172716.getClass(), "_cache", null);
        setField(term172716, term172716.getClass(), "_factory", null);
        setField(term172716, term172716.getClass(), "_config", null);
        setIntField(term172716, term172716.getClass(), "_featureFlags", 0);
        setField(term172716, term172716.getClass(), "_view", null);
        setField(term172716, term172716.getClass(), "_parser", null);
        setField(term172716, term172716.getClass(), "_injectableValues", null);
        setField(term172716, term172716.getClass(), "_arrayBuilders", null);
        setField(term172716, term172716.getClass(), "_objectBuffer", null);
        setField(term172716, term172716.getClass(), "_dateFormat", null);
        setField(term172716, term172716.getClass(), "_attributes", null);
        setField(term172716, term172716.getClass(), "_currentType", null);
        Class<? extends Object> term172600 = Class.forName((String) "java.util.regex.Pattern$CIBackRef");
        Class<? extends Object> term172607 = Class.forName((String) "java.lang.invoke.VarHandle$AccessMode");
        Class<? extends Object> term172611 = Class.forName((String) "java.lang.CharacterName");
        Class<? extends Object> term172614 = Class.forName((String) "java.util.concurrent.SynchronousQueue$TransferStack");
        Class<? extends Object> term172618 = Class.forName((String) "com.fasterxml.jackson.databind.util.NameTransformer$1");
        Class<? extends Object> term172622 = Class.forName((String) "java.lang.invoke.MethodHandleImpl");
        Class<? extends Object> term172628 = Class.forName((String) "java.lang.invoke.InvokerBytecodeGenerator$2");
        Class<? extends Object> term172633 = Class.forName((String) "com.fasterxml.jackson.core.util.DefaultPrettyPrinter$Indenter");
        Class<? extends Object> term172637 = Class.forName((String) "java.io.FilterOutputStream");
        Class<? extends Object> term172641 = Class.forName((String) "com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter");
        Class<? extends Object> term172645 = Class.forName((String) "java.util.concurrent.SynchronousQueue$FifoWaitQueue");
        Class<? extends Object> term172649 = Class.forName((String) "java.util.Locale$IsoCountryCode$1");
        Class<? extends Object> term172653 = Class.forName((String) "java.lang.ProcessHandleImpl$ExitCompletion");
        Class<? extends Object> term172656 = Class.forName((String) "java.util.zip.ZipCoder");
        Class<? extends Object> term172659 = Class.forName((String) "java.util.concurrent.CountDownLatch");
        Class<? extends Object> term172663 = Class.forName((String) "java.util.stream.ReferencePipeline$10$1");
        Class<? extends Object> term172667 = Class.forName((String) "java.util.concurrent.ConcurrentHashMap$TreeBin");
        Class<? extends Object> term172670 = Class.forName((String) "java.lang.invoke.BootstrapCallInfo");
        Class<? extends Object> term172674 = Class.forName((String) "java.util.stream.Nodes$ConcNode");
        term172531 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        Object[] term172532 = (Object[]) newArray("java.lang.Object", 5);
        short[] term172533 = (short[]) newShortArray(32);
        int[] term172566 = (int[]) newIntArray(32);
        Object[] term172599 = (Object[]) newArray("java.lang.Object", 32);
        long[] term172678 = (long[]) newLongArray(32);
        Object[] term172711 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term172713 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setField(term172531, term172531.getClass(), "_path", null);
        setField(term172531, term172531.getClass(), "_processor", null);
        setField(term172531, term172531.getClass(), "_location", null);
        setShortElement(term172533, 0, (short) 9);
        setShortElement(term172533, 1, (short) 3);
        setShortElement(term172533, 5, (short) 27);
        setShortElement(term172533, 6, (short) 2);
        setShortElement(term172533, 7, (short) 3);
        setShortElement(term172533, 11, (short) 2);
        setShortElement(term172533, 12, (short) 4);
        setShortElement(term172533, 13, (short) 4);
        setShortElement(term172533, 14, (short) 3);
        setShortElement(term172533, 15, (short) 4);
        setShortElement(term172533, 16, (short) 4);
        setShortElement(term172533, 17, (short) 1);
        setShortElement(term172533, 18, (short) 2);
        setShortElement(term172533, 19, (short) 3);
        setShortElement(term172533, 20, (short) 3);
        setShortElement(term172533, 21, (short) 13);
        setShortElement(term172533, 22, (short) 1);
        setShortElement(term172533, 23, (short) 2);
        setShortElement(term172533, 24, (short) 12);
        setElement(term172532, 0, term172533);
        setIntElement(term172566, 0, 22937600);
        setIntElement(term172566, 2, 6553600);
        setIntElement(term172566, 3, 393216);
        setIntElement(term172566, 4, 3866630);
        setIntElement(term172566, 5, 1245184);
        setIntElement(term172566, 6, 3997696);
        setIntElement(term172566, 8, 6553600);
        setIntElement(term172566, 9, 393216);
        setIntElement(term172566, 10, 3866630);
        setIntElement(term172566, 11, 14352384);
        setIntElement(term172566, 12, 10354688);
        setIntElement(term172566, 13, 2883584);
        setIntElement(term172566, 14, 786432);
        setIntElement(term172566, 15, 1441792);
        setIntElement(term172566, 16, 7733248);
        setIntElement(term172566, 17, 20774912);
        setIntElement(term172566, 18, 262144);
        setIntElement(term172566, 19, 2555904);
        setIntElement(term172566, 20, 1835008);
        setIntElement(term172566, 21, 6029312);
        setIntElement(term172566, 22, 327680);
        setIntElement(term172566, 23, 1638400);
        setIntElement(term172566, 24, 720907);
        setElement(term172532, 1, term172566);
        setElement(term172599, 0, term172600);
        setElement(term172599, 1, term172607);
        setElement(term172599, 2, term172607);
        setElement(term172599, 3, term172611);
        setElement(term172599, 4, term172614);
        setElement(term172599, 5, term172618);
        setElement(term172599, 6, term172622);
        setElement(term172599, 7, term172607);
        setElement(term172599, 8, term172607);
        setElement(term172599, 9, term172611);
        setElement(term172599, 10, term172614);
        setElement(term172599, 11, term172628);
        setElement(term172599, 12, term172633);
        setElement(term172599, 13, term172637);
        setElement(term172599, 14, term172641);
        setElement(term172599, 15, term172645);
        setElement(term172599, 16, term172637);
        setElement(term172599, 17, term172649);
        setElement(term172599, 18, term172653);
        setElement(term172599, 19, term172656);
        setElement(term172599, 20, term172659);
        setElement(term172599, 21, term172663);
        setElement(term172599, 22, term172667);
        setElement(term172599, 23, term172670);
        setElement(term172599, 24, term172674);
        setElement(term172532, 2, term172599);
        setLongElement(term172678, 0, 34363800864L);
        setLongElement(term172678, 1, 34364798256L);
        setLongElement(term172678, 2, 34363739368L);
        setLongElement(term172678, 3, 34363739368L);
        setLongElement(term172678, 4, 34363739368L);
        setLongElement(term172678, 5, 132578328998496L);
        setLongElement(term172678, 6, 34363820048L);
        setLongElement(term172678, 7, 34364798256L);
        setLongElement(term172678, 8, 34363739368L);
        setLongElement(term172678, 9, 34363739368L);
        setLongElement(term172678, 10, 34363739368L);
        setLongElement(term172678, 11, 132582552571296L);
        setLongElement(term172678, 12, 132582552640272L);
        setLongElement(term172678, 13, 132582550089488L);
        setLongElement(term172678, 14, 132582552759024L);
        setLongElement(term172678, 15, 132582550089488L);
        setLongElement(term172678, 16, 132582550089488L);
        setLongElement(term172678, 17, 34363745472L);
        setLongElement(term172678, 18, 34364710216L);
        setLongElement(term172678, 19, 34363745472L);
        setLongElement(term172678, 20, 34363745472L);
        setLongElement(term172678, 21, 34364896224L);
        setLongElement(term172678, 22, 34363745472L);
        setLongElement(term172678, 23, 34363745472L);
        setLongElement(term172678, 24, 34363745472L);
        setElement(term172532, 3, term172678);
        setField(term172531, term172531.getClass(), "backtrace", term172532);
        setField(term172531, term172531.getClass(), "detailMessage", null);
        setField(term172531, term172531.getClass(), "cause", term172531);
        setField(term172531, term172531.getClass(), "stackTrace", term172711);
        setIntField(term172531, term172531.getClass(), "depth", 25);
        setIntField(term172713, term172713.getClass(), "modCount", 0);
        setField(term172531, term172531.getClass(), "suppressedExceptions", term172713);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.JsonMappingException");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.Throwable");
        Object[] args = new Object[3];
        args[0] = term172464;
        args[1] = null;
        args[2] = null;
        Object retValue = callMethod(klass, "from", argTypes, null, args);
        assertTrue(recursiveEquals(term172464, term172716));
        assertTrue(recursiveEquals(retValue, term172531));
    }

};


