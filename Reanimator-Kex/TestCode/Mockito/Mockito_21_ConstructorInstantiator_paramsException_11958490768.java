package org.mockito.internal.creation.instance;

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
import static org.mockito.internal.creation.instance.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class ConstructorInstantiator_paramsException_11958490768 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6;

    public ConstructorInstantiator_paramsException_11958490768() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term75 = Class.forName((String) "kex.java.util.concurrent.atomic.AtomicLongArray");
        Class<? extends Object> term78 = Class.forName((String) "org.hamcrest.CustomTypeSafeMatcher");
        Class<? extends Object> term80 = Class.forName((String) "org.assertj.core.internal.Comparables");
        Class<? extends Object> term84 = Class.forName((String) "org.mockito.plugins.StackTraceCleanerProvider");
        Class<? extends Object> term89 = Class.forName((String) "java.nio.file.StandardWatchEventKinds");
        Class<? extends Object> term93 = Class.forName((String) "java.lang.annotation.Retention");
        Class<? extends Object> term97 = Class.forName((String) "org.assertj.core.api.MapAssert");
        Class<? extends Object> term101 = Class.forName((String) "net.sourceforge.cobertura.reporting.Main");
        Class<? extends Object> term105 = Class.forName((String) "java.util.Spliterators$4Adapter");
        Class<? extends Object> term109 = Class.forName((String) "org.assertj.core.internal.cglib.core.Signature");
        Class<? extends Object> term113 = Class.forName((String) "org.mockito.internal.matchers.Or");
        Class<? extends Object> term117 = Class.forName((String) "org.mockito.BDDMockito$BDDStubber");
        Class<? extends Object> term121 = Class.forName((String) "java.lang.invoke.VarHandleObjects$Array");
        Class<? extends Object> term125 = Class.forName((String) "org.assertj.core.internal.cglib.proxy.Enhancer$4");
        Class<? extends Object> term127 = Class.forName((String) "java.util.concurrent.SubmissionPublisher");
        Class<? extends Object> term130 = Class.forName((String) "org.objenesis.instantiator.basic.ObjectInputStreamInstantiator");
        Class<? extends Object> term132 = Class.forName((String) "java.nio.file.ClosedFileSystemException");
        Class<? extends Object> term134 = Class.forName((String) "org.assertj.core.presentation.DefaultToString");
        Class<? extends Object> term237 = Class.forName((String) "java.util.stream.FindOps$FindTask");
        Class<? extends Object> term239 = Class.forName((String) "java.util.IllegalFormatConversionException");
        term6 = newInstance(Class.forName("java.lang.Exception"));
        Object[] term7 = (Object[]) newArray("java.lang.Object", 5);
        short[] term8 = (short[]) newShortArray(32);
        int[] term41 = (int[]) newIntArray(32);
        Object[] term74 = (Object[]) newArray("java.lang.Object", 32);
        long[] term136 = (long[]) newLongArray(32);
        Object[] term169 = (Object[]) newArray("java.lang.Object", 5);
        short[] term170 = (short[]) newShortArray(32);
        int[] term203 = (int[]) newIntArray(32);
        Object[] term236 = (Object[]) newArray("java.lang.Object", 32);
        long[] term241 = (long[]) newLongArray(32);
        Object[] term286 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term288 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setShortElement(term8, 0, (short) 1);
        setShortElement(term8, 1, (short) 2);
        setShortElement(term8, 2, (short) 1);
        setShortElement(term8, 3, (short) 7);
        setShortElement(term8, 4, (short) 2);
        setShortElement(term8, 5, (short) 1);
        setShortElement(term8, 6, (short) 6);
        setShortElement(term8, 7, (short) 2);
        setShortElement(term8, 8, (short) 9);
        setShortElement(term8, 9, (short) 10);
        setShortElement(term8, 10, (short) 29);
        setShortElement(term8, 11, (short) 5);
        setShortElement(term8, 12, (short) 4);
        setShortElement(term8, 13, (short) 6);
        setShortElement(term8, 14, (short) 8);
        setShortElement(term8, 15, (short) 7);
        setShortElement(term8, 16, (short) 10);
        setShortElement(term8, 17, (short) 11);
        setShortElement(term8, 18, (short) 12);
        setShortElement(term8, 19, (short) 4);
        setShortElement(term8, 20, (short) 1);
        setShortElement(term8, 22, (short) 10);
        setShortElement(term8, 23, (short) 3);
        setShortElement(term8, 24, (short) 4);
        setShortElement(term8, 25, (short) 5);
        setShortElement(term8, 26, (short) 1);
        setShortElement(term8, 27, (short) 2);
        setShortElement(term8, 28, (short) 3);
        setShortElement(term8, 29, (short) 3);
        setShortElement(term8, 30, (short) 13);
        setShortElement(term8, 31, (short) 1);
        setElement(term7, 0, term8);
        setIntElement(term41, 1, 5570560);
        setIntElement(term41, 2, 327680);
        setIntElement(term41, 3, 4456454);
        setIntElement(term41, 4, 1769472);
        setIntElement(term41, 5, 14876672);
        setIntElement(term41, 6, 6225920);
        setIntElement(term41, 7, 917504);
        setIntElement(term41, 8, 327680);
        setIntElement(term41, 9, 8519680);
        setIntElement(term41, 10, 917504);
        setIntElement(term41, 11, 11993088);
        setIntElement(term41, 12, 655360);
        setIntElement(term41, 13, 7864320);
        setIntElement(term41, 14, 3735552);
        setIntElement(term41, 15, 7143424);
        setIntElement(term41, 16, 8454144);
        setIntElement(term41, 17, 9240576);
        setIntElement(term41, 18, 196608);
        setIntElement(term41, 19, 3801088);
        setIntElement(term41, 20, 786432);
        setIntElement(term41, 21, 589824);
        setIntElement(term41, 22, 17170432);
        setIntElement(term41, 23, 1376256);
        setIntElement(term41, 24, 5242880);
        setIntElement(term41, 25, 2883584);
        setIntElement(term41, 26, 20774912);
        setIntElement(term41, 27, 262144);
        setIntElement(term41, 28, 2555904);
        setIntElement(term41, 29, 1835008);
        setIntElement(term41, 30, 6029312);
        setIntElement(term41, 31, 327680);
        setElement(term7, 1, term41);
        setElement(term74, 0, term75);
        setElement(term74, 1, term75);
        setElement(term74, 2, term78);
        setElement(term74, 3, term80);
        setElement(term74, 4, term84);
        setElement(term74, 5, term84);
        setElement(term74, 6, term89);
        setElement(term74, 7, term89);
        setElement(term74, 8, term93);
        setElement(term74, 9, term93);
        setElement(term74, 10, term93);
        setElement(term74, 11, term93);
        setElement(term74, 12, term93);
        setElement(term74, 13, term97);
        setElement(term74, 14, term97);
        setElement(term74, 15, term101);
        setElement(term74, 16, term101);
        setElement(term74, 17, term101);
        setElement(term74, 18, term101);
        setElement(term74, 19, term105);
        setElement(term74, 20, term105);
        setElement(term74, 21, term105);
        setElement(term74, 22, term109);
        setElement(term74, 23, term101);
        setElement(term74, 24, term113);
        setElement(term74, 25, term117);
        setElement(term74, 26, term121);
        setElement(term74, 27, term125);
        setElement(term74, 28, term127);
        setElement(term74, 29, term130);
        setElement(term74, 30, term132);
        setElement(term74, 31, term134);
        setElement(term7, 2, term74);
        setLongElement(term136, 0, 34363746224L);
        setLongElement(term136, 1, 34363775512L);
        setLongElement(term136, 2, 34363775512L);
        setLongElement(term136, 3, 34363775512L);
        setLongElement(term136, 4, 126964539510464L);
        setLongElement(term136, 5, 34364440080L);
        setLongElement(term136, 6, 126964539584896L);
        setLongElement(term136, 7, 126964538323984L);
        setLongElement(term136, 8, 126964538323872L);
        setLongElement(term136, 9, 126964538324016L);
        setLongElement(term136, 10, 126964539471344L);
        setLongElement(term136, 11, 34363766248L);
        setLongElement(term136, 12, 34363766248L);
        setLongElement(term136, 13, 126961483499216L);
        setLongElement(term136, 14, 126961483499216L);
        setLongElement(term136, 15, 126961483499072L);
        setLongElement(term136, 16, 126961483535168L);
        setLongElement(term136, 17, 126961483536816L);
        setLongElement(term136, 18, 126961483537584L);
        setLongElement(term136, 19, 126961480350832L);
        setLongElement(term136, 20, 34363739368L);
        setLongElement(term136, 21, 34363739368L);
        setLongElement(term136, 22, 126961483497712L);
        setLongElement(term136, 23, 34363829248L);
        setLongElement(term136, 24, 126961480350832L);
        setLongElement(term136, 25, 126961480372544L);
        setLongElement(term136, 26, 34363745472L);
        setLongElement(term136, 27, 34364710216L);
        setLongElement(term136, 28, 34363745472L);
        setLongElement(term136, 29, 34363745472L);
        setLongElement(term136, 30, 34364896224L);
        setLongElement(term136, 31, 34363745472L);
        setElement(term7, 3, term136);
        setShortElement(term170, 0, (short) 2);
        setShortElement(term170, 1, (short) 12);
        setElement(term169, 0, term170);
        setIntElement(term203, 0, 1638400);
        setIntElement(term203, 1, 720907);
        setElement(term169, 1, term203);
        setElement(term236, 0, term237);
        setElement(term236, 1, term239);
        setElement(term169, 2, term236);
        setLongElement(term241, 0, 34363745472L);
        setLongElement(term241, 1, 34363745472L);
        setElement(term169, 3, term241);
        setElement(term7, 4, term169);
        setField(term6, term6.getClass(), "backtrace", term7);
        setField(term6, term6.getClass(), "detailMessage", "PAEBtnZtTD");
        setField(term6, term6.getClass(), "cause", term6);
        setField(term6, term6.getClass(), "stackTrace", term286);
        setIntField(term6, term6.getClass(), "depth", 34);
        setIntField(term288, term288.getClass(), "modCount", 0);
        setField(term6, term6.getClass(), "suppressedExceptions", term288);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.creation.instance.ConstructorInstantiator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Class");
        argTypes[1] = Class.forName("java.lang.Exception");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term6;
        try {
            callMethod(klass, "paramsException", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


