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

public class JsonMappingException_fromUnexpectedIOE_82939965691 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term191008;
     Object term204965;
     Object term204601;

    public JsonMappingException_fromUnexpectedIOE_82939965691() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term191008 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        term204965 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        setField(term204965, term204965.getClass(), "_path", null);
        setField(term204965, term204965.getClass(), "_processor", null);
        setField(term204965, term204965.getClass(), "_location", null);
        setField(term204965, term204965.getClass(), "backtrace", null);
        setField(term204965, term204965.getClass(), "detailMessage", null);
        setField(term204965, term204965.getClass(), "cause", null);
        setField(term204965, term204965.getClass(), "stackTrace", null);
        setIntField(term204965, term204965.getClass(), "depth", 0);
        setField(term204965, term204965.getClass(), "suppressedExceptions", null);
        Class<? extends Object> term204670 = Class.forName((String) "java.util.regex.Pattern$Dollar");
        Class<? extends Object> term204677 = Class.forName((String) "com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver");
        Class<? extends Object> term204680 = Class.forName((String) "java.util.concurrent.ForkJoinTask");
        Class<? extends Object> term204682 = Class.forName((String) "com.fasterxml.jackson.databind.PropertyMetadata");
        Class<? extends Object> term204686 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonSubTypes$Type");
        Class<? extends Object> term204690 = Class.forName((String) "java.nio.file.ProviderMismatchException");
        Class<? extends Object> term204696 = Class.forName((String) "com.fasterxml.jackson.databind.node.ContainerNode");
        Class<? extends Object> term204701 = Class.forName((String) "java.nio.file.AccessDeniedException");
        Class<? extends Object> term204705 = Class.forName((String) "java.io.BufferedWriter");
        Class<? extends Object> term204709 = Class.forName((String) "java.util.Spliterators$LongArraySpliterator");
        Class<? extends Object> term204713 = Class.forName((String) "java.lang.Integer");
        Class<? extends Object> term204717 = Class.forName((String) "java.nio.ByteBufferAsShortBufferB");
        Class<? extends Object> term204721 = Class.forName((String) "com.fasterxml.jackson.core.io.NumberInput");
        Class<? extends Object> term204724 = Class.forName((String) "com.fasterxml.jackson.databind.ser.ContextualSerializer");
        Class<? extends Object> term204727 = Class.forName((String) "java.nio.channels.AsynchronousServerSocketChannel");
        Class<? extends Object> term204731 = Class.forName((String) "com.fasterxml.jackson.databind.deser.std.FactoryBasedEnumDeserializer");
        Class<? extends Object> term204734 = Class.forName((String) "java.nio.channels.InterruptibleChannel");
        Class<? extends Object> term204737 = Class.forName((String) "java.util.concurrent.ConcurrentNavigableMap");
        Class<? extends Object> term204741 = Class.forName((String) "com.fasterxml.jackson.databind.util.ClassUtil$EnumTypeLocator");
        term204601 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        Object[] term204602 = (Object[]) newArray("java.lang.Object", 5);
        short[] term204603 = (short[]) newShortArray(32);
        int[] term204636 = (int[]) newIntArray(32);
        Object[] term204669 = (Object[]) newArray("java.lang.Object", 32);
        long[] term204745 = (long[]) newLongArray(32);
        Object[] term204869 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term204871 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setField(term204601, term204601.getClass(), "_path", null);
        setField(term204601, term204601.getClass(), "_processor", null);
        setField(term204601, term204601.getClass(), "_location", null);
        setShortElement(term204603, 0, (short) 27);
        setShortElement(term204603, 1, (short) 3);
        setShortElement(term204603, 5, (short) 33);
        setShortElement(term204603, 6, (short) 2);
        setShortElement(term204603, 7, (short) 3);
        setShortElement(term204603, 11, (short) 2);
        setShortElement(term204603, 12, (short) 4);
        setShortElement(term204603, 13, (short) 4);
        setShortElement(term204603, 14, (short) 3);
        setShortElement(term204603, 15, (short) 4);
        setShortElement(term204603, 16, (short) 4);
        setShortElement(term204603, 17, (short) 1);
        setShortElement(term204603, 18, (short) 2);
        setShortElement(term204603, 19, (short) 3);
        setShortElement(term204603, 20, (short) 3);
        setShortElement(term204603, 21, (short) 13);
        setShortElement(term204603, 22, (short) 1);
        setShortElement(term204603, 23, (short) 2);
        setShortElement(term204603, 24, (short) 12);
        setElement(term204602, 0, term204603);
        setIntElement(term204636, 0, 57016320);
        setIntElement(term204636, 2, 6553600);
        setIntElement(term204636, 3, 393216);
        setIntElement(term204636, 4, 3866630);
        setIntElement(term204636, 5, 1245184);
        setIntElement(term204636, 6, 2424832);
        setIntElement(term204636, 8, 6553600);
        setIntElement(term204636, 9, 393216);
        setIntElement(term204636, 10, 3866630);
        setIntElement(term204636, 11, 14352384);
        setIntElement(term204636, 12, 10354688);
        setIntElement(term204636, 13, 2883584);
        setIntElement(term204636, 14, 786432);
        setIntElement(term204636, 15, 1441792);
        setIntElement(term204636, 16, 7733248);
        setIntElement(term204636, 17, 20774912);
        setIntElement(term204636, 18, 262144);
        setIntElement(term204636, 19, 2555904);
        setIntElement(term204636, 20, 1835008);
        setIntElement(term204636, 21, 6029312);
        setIntElement(term204636, 22, 327680);
        setIntElement(term204636, 23, 1638400);
        setIntElement(term204636, 24, 720907);
        setElement(term204602, 1, term204636);
        setElement(term204669, 0, term204670);
        setElement(term204669, 1, term204677);
        setElement(term204669, 2, term204677);
        setElement(term204669, 3, term204680);
        setElement(term204669, 4, term204682);
        setElement(term204669, 5, term204686);
        setElement(term204669, 6, term204690);
        setElement(term204669, 7, term204677);
        setElement(term204669, 8, term204677);
        setElement(term204669, 9, term204680);
        setElement(term204669, 10, term204682);
        setElement(term204669, 11, term204696);
        setElement(term204669, 12, term204701);
        setElement(term204669, 13, term204705);
        setElement(term204669, 14, term204709);
        setElement(term204669, 15, term204713);
        setElement(term204669, 16, term204705);
        setElement(term204669, 17, term204717);
        setElement(term204669, 18, term204721);
        setElement(term204669, 19, term204724);
        setElement(term204669, 20, term204727);
        setElement(term204669, 21, term204731);
        setElement(term204669, 22, term204734);
        setElement(term204669, 23, term204737);
        setElement(term204669, 24, term204741);
        setElement(term204602, 2, term204669);
        setLongElement(term204745, 0, 132073604125296L);
        setLongElement(term204745, 1, 34364798256L);
        setLongElement(term204745, 2, 34363739368L);
        setLongElement(term204745, 3, 34363739368L);
        setLongElement(term204745, 4, 34363739368L);
        setLongElement(term204745, 5, 132073603951184L);
        setLongElement(term204745, 6, 34363820048L);
        setLongElement(term204745, 7, 34364798256L);
        setLongElement(term204745, 8, 34363739368L);
        setLongElement(term204745, 9, 34363739368L);
        setLongElement(term204745, 10, 34363739368L);
        setLongElement(term204745, 11, 132077283560208L);
        setLongElement(term204745, 12, 132077283629184L);
        setLongElement(term204745, 13, 132077281112816L);
        setLongElement(term204745, 14, 132077283747392L);
        setLongElement(term204745, 15, 132077281112816L);
        setLongElement(term204745, 16, 132077281112816L);
        setLongElement(term204745, 17, 34363745472L);
        setLongElement(term204745, 18, 34364710216L);
        setLongElement(term204745, 19, 34363745472L);
        setLongElement(term204745, 20, 34363745472L);
        setLongElement(term204745, 21, 34364896224L);
        setLongElement(term204745, 22, 34363745472L);
        setLongElement(term204745, 23, 34363745472L);
        setLongElement(term204745, 24, 34363745472L);
        setElement(term204602, 3, term204745);
        setField(term204601, term204601.getClass(), "backtrace", term204602);
        setField(term204601, term204601.getClass(), "detailMessage", "Unexpected IOException (of type com.fasterxml.jackson.databind.JsonMappingException): N/A");
        setField(term204601, term204601.getClass(), "cause", term204601);
        setField(term204601, term204601.getClass(), "stackTrace", term204869);
        setIntField(term204601, term204601.getClass(), "depth", 25);
        setIntField(term204871, term204871.getClass(), "modCount", 0);
        setField(term204601, term204601.getClass(), "suppressedExceptions", term204871);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.JsonMappingException");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.IOException");
        Object[] args = new Object[1];
        args[0] = term191008;
        Object retValue = callMethod(klass, "fromUnexpectedIOE", argTypes, null, args);
        assertTrue(recursiveEquals(term191008, term204965));
        assertTrue(recursiveEquals(retValue, term204601));
    }

};


