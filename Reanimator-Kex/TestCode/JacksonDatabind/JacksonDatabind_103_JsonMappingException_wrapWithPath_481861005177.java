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

public class JsonMappingException_wrapWithPath_481861005177 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term338501;
     Object term339041;
     Object term338802;

    public JsonMappingException_wrapWithPath_481861005177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term338501 = newInstance(Class.forName("java.nio.channels.NoConnectionPendingException"));
        term339041 = newInstance(Class.forName("java.nio.channels.NoConnectionPendingException"));
        setField(term339041, term339041.getClass(), "backtrace", null);
        setField(term339041, term339041.getClass(), "detailMessage", null);
        setField(term339041, term339041.getClass(), "cause", null);
        setField(term339041, term339041.getClass(), "stackTrace", null);
        setIntField(term339041, term339041.getClass(), "depth", 0);
        setField(term339041, term339041.getClass(), "suppressedExceptions", null);
        LinkedList term338803 = new LinkedList();
        ((LinkedList) term338803).add((Object)null);
        Class<? extends Object> term338875 = Class.forName((String) "java.lang.invoke.BootstrapCallInfo");
        Class<? extends Object> term338882 = Class.forName((String) "java.lang.CharSequence");
        Class<? extends Object> term338885 = Class.forName((String) "java.util.stream.Nodes$EmptyNode");
        Class<? extends Object> term338887 = Class.forName((String) "java.util.regex.Pattern$Caret");
        Class<? extends Object> term338891 = Class.forName((String) "java.util.concurrent.Executors$2");
        Class<? extends Object> term338895 = Class.forName((String) "com.fasterxml.jackson.databind.deser.impl.PropertyValue$Any");
        Class<? extends Object> term338901 = Class.forName((String) "com.fasterxml.jackson.core.io.NumberOutput");
        Class<? extends Object> term338906 = Class.forName((String) "java.util.stream.PipelineHelper");
        Class<? extends Object> term338910 = Class.forName((String) "java.lang.invoke.VarHandle");
        Class<? extends Object> term338914 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonInclude$Include");
        Class<? extends Object> term338918 = Class.forName((String) "java.io.BufferedReader$1");
        Class<? extends Object> term338922 = Class.forName((String) "java.util.InputMismatchException");
        Class<? extends Object> term338926 = Class.forName((String) "java.nio.channels.NotYetConnectedException");
        Class<? extends Object> term338929 = Class.forName((String) "java.lang.invoke.VarHandle$2");
        Class<? extends Object> term338932 = Class.forName((String) "java.util.stream.ReferencePipeline$StatefulOp");
        Class<? extends Object> term338936 = Class.forName((String) "java.util.ResourceBundle$Control$CandidateListCache");
        Class<? extends Object> term338939 = Class.forName((String) "java.lang.PublicMethods$MethodList");
        Class<? extends Object> term338942 = Class.forName((String) "java.nio.file.spi.FileSystemProvider");
        Class<? extends Object> term338946 = Class.forName((String) "java.lang.invoke.VarHandle$AccessDescriptor");
        term338802 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        Object[] term338807 = (Object[]) newArray("java.lang.Object", 5);
        short[] term338808 = (short[]) newShortArray(32);
        int[] term338841 = (int[]) newIntArray(32);
        Object[] term338874 = (Object[]) newArray("java.lang.Object", 32);
        long[] term338950 = (long[]) newLongArray(32);
        Object term338797 = newInstance(Class.forName("java.nio.channels.NoConnectionPendingException"));
        Object[] term339037 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term339039 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setField(term338802, term338802.getClass(), "_path", term338803);
        setField(term338802, term338802.getClass(), "_processor", null);
        setField(term338802, term338802.getClass(), "_location", null);
        setShortElement(term338808, 0, (short) 30);
        setShortElement(term338808, 1, (short) 3);
        setShortElement(term338808, 5, (short) 33);
        setShortElement(term338808, 6, (short) 2);
        setShortElement(term338808, 7, (short) 3);
        setShortElement(term338808, 11, (short) 2);
        setShortElement(term338808, 12, (short) 4);
        setShortElement(term338808, 13, (short) 4);
        setShortElement(term338808, 14, (short) 3);
        setShortElement(term338808, 15, (short) 4);
        setShortElement(term338808, 16, (short) 4);
        setShortElement(term338808, 17, (short) 1);
        setShortElement(term338808, 18, (short) 2);
        setShortElement(term338808, 19, (short) 3);
        setShortElement(term338808, 20, (short) 3);
        setShortElement(term338808, 21, (short) 13);
        setShortElement(term338808, 22, (short) 1);
        setShortElement(term338808, 23, (short) 2);
        setShortElement(term338808, 24, (short) 12);
        setElement(term338807, 0, term338808);
        setIntElement(term338841, 0, 128385024);
        setIntElement(term338841, 2, 6553600);
        setIntElement(term338841, 3, 393216);
        setIntElement(term338841, 4, 3866630);
        setIntElement(term338841, 5, 1245184);
        setIntElement(term338841, 6, 3211264);
        setIntElement(term338841, 8, 6553600);
        setIntElement(term338841, 9, 393216);
        setIntElement(term338841, 10, 3866630);
        setIntElement(term338841, 11, 14352384);
        setIntElement(term338841, 12, 10354688);
        setIntElement(term338841, 13, 2883584);
        setIntElement(term338841, 14, 786432);
        setIntElement(term338841, 15, 1441792);
        setIntElement(term338841, 16, 7733248);
        setIntElement(term338841, 17, 20774912);
        setIntElement(term338841, 18, 262144);
        setIntElement(term338841, 19, 2555904);
        setIntElement(term338841, 20, 1835008);
        setIntElement(term338841, 21, 6029312);
        setIntElement(term338841, 22, 327680);
        setIntElement(term338841, 23, 1638400);
        setIntElement(term338841, 24, 720907);
        setElement(term338807, 1, term338841);
        setElement(term338874, 0, term338875);
        setElement(term338874, 1, term338882);
        setElement(term338874, 2, term338882);
        setElement(term338874, 3, term338885);
        setElement(term338874, 4, term338887);
        setElement(term338874, 5, term338891);
        setElement(term338874, 6, term338895);
        setElement(term338874, 7, term338882);
        setElement(term338874, 8, term338882);
        setElement(term338874, 9, term338885);
        setElement(term338874, 10, term338887);
        setElement(term338874, 11, term338901);
        setElement(term338874, 12, term338906);
        setElement(term338874, 13, term338910);
        setElement(term338874, 14, term338914);
        setElement(term338874, 15, term338918);
        setElement(term338874, 16, term338910);
        setElement(term338874, 17, term338922);
        setElement(term338874, 18, term338926);
        setElement(term338874, 19, term338929);
        setElement(term338874, 20, term338932);
        setElement(term338874, 21, term338936);
        setElement(term338874, 22, term338939);
        setElement(term338874, 23, term338942);
        setElement(term338874, 24, term338946);
        setElement(term338807, 2, term338874);
        setLongElement(term338950, 0, 132073604125776L);
        setLongElement(term338950, 1, 34364798256L);
        setLongElement(term338950, 2, 34363739368L);
        setLongElement(term338950, 3, 34363739368L);
        setLongElement(term338950, 4, 34363739368L);
        setLongElement(term338950, 5, 132073603951184L);
        setLongElement(term338950, 6, 34363820048L);
        setLongElement(term338950, 7, 34364798256L);
        setLongElement(term338950, 8, 34363739368L);
        setLongElement(term338950, 9, 34363739368L);
        setLongElement(term338950, 10, 34363739368L);
        setLongElement(term338950, 11, 132077283560208L);
        setLongElement(term338950, 12, 132077283629184L);
        setLongElement(term338950, 13, 132077281112816L);
        setLongElement(term338950, 14, 132077283747392L);
        setLongElement(term338950, 15, 132077281112816L);
        setLongElement(term338950, 16, 132077281112816L);
        setLongElement(term338950, 17, 34363745472L);
        setLongElement(term338950, 18, 34364710216L);
        setLongElement(term338950, 19, 34363745472L);
        setLongElement(term338950, 20, 34363745472L);
        setLongElement(term338950, 21, 34364896224L);
        setLongElement(term338950, 22, 34363745472L);
        setLongElement(term338950, 23, 34363745472L);
        setLongElement(term338950, 24, 34363745472L);
        setElement(term338807, 3, term338950);
        setField(term338802, term338802.getClass(), "backtrace", term338807);
        setField(term338802, term338802.getClass(), "detailMessage", "(was java.nio.channels.NoConnectionPendingException)");
        setField(term338797, term338797.getClass(), "backtrace", null);
        setField(term338797, term338797.getClass(), "detailMessage", null);
        setField(term338797, term338797.getClass(), "cause", null);
        setField(term338797, term338797.getClass(), "stackTrace", null);
        setIntField(term338797, term338797.getClass(), "depth", 0);
        setField(term338797, term338797.getClass(), "suppressedExceptions", null);
        setField(term338802, term338802.getClass(), "cause", term338797);
        setField(term338802, term338802.getClass(), "stackTrace", term339037);
        setIntField(term338802, term338802.getClass(), "depth", 25);
        setIntField(term339039, term339039.getClass(), "modCount", 0);
        setField(term338802, term338802.getClass(), "suppressedExceptions", term339039);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.JsonMappingException");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Throwable");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JsonMappingException$Reference");
        Object[] args = new Object[2];
        args[0] = term338501;
        args[1] = null;
        Object retValue = callMethod(klass, "wrapWithPath", argTypes, null, args);
        assertTrue(recursiveEquals(term338501, term339041));
        assertTrue(recursiveEquals(retValue, term338802));
    }

};


