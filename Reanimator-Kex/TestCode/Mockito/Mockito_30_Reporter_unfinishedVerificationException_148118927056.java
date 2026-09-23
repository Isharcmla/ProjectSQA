package org.mockito.exceptions;

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
import org.mockito.exceptions.misusing.UnfinishedVerificationException;
import static org.mockito.exceptions.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class Reporter_unfinishedVerificationException_148118927056 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5254;
     Object term5255;

    public Reporter_unfinishedVerificationException_148118927056() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5254 = newInstance(Class.forName("org.mockito.exceptions.Reporter"));
        Class<? extends Object> term5325 = Class.forName((String) "org.hamcrest.text.IsEqualIgnoringWhiteSpace");
        Class<? extends Object> term5327 = Class.forName((String) "java.util.ServiceLoader$ModuleServicesLookupIterator");
        Class<? extends Object> term5329 = Class.forName((String) "java.io.ObjectInputStream$BlockDataInputStream");
        Class<? extends Object> term5331 = Class.forName((String) "java.nio.channels.ReadableByteChannel");
        Class<? extends Object> term5333 = Class.forName((String) "org.assertj.core.api.IterableAssert$LazyIteratorToIterableWrapper");
        Class<? extends Object> term5335 = Class.forName((String) "org.fest.assertions.FileContentComparator");
        Class<? extends Object> term5337 = Class.forName((String) "java.util.ArrayPrefixHelpers$IntCumulateTask");
        Class<? extends Object> term5339 = Class.forName((String) "org.fest.assertions.AssertExtension");
        Class<? extends Object> term5341 = Class.forName((String) "java.util.concurrent.CompletableFuture$UniAccept");
        Class<? extends Object> term5343 = Class.forName((String) "java.lang.Character$Subset");
        Class<? extends Object> term5345 = Class.forName((String) "java.util.stream.Nodes$EmptyNode$OfRef");
        Class<? extends Object> term5347 = Class.forName((String) "java.lang.invoke.BootstrapMethodInvoker$VM_BSCI");
        Class<? extends Object> term5349 = Class.forName((String) "java.lang.invoke.MethodHandleImpl$BindCaller");
        Class<? extends Object> term5351 = Class.forName((String) "java.lang.PublicMethods$MethodList");
        Class<? extends Object> term5353 = Class.forName((String) "java.lang.invoke.VarHandleBytes$FieldStaticReadWrite");
        Class<? extends Object> term5355 = Class.forName((String) "org.objectweb.asm.tree.AbstractInsnNode");
        Class<? extends Object> term5357 = Class.forName((String) "java.util.regex.Pattern$Loop");
        term5255 = newInstance(Class.forName("org.mockito.internal.debugging.Location"));
        Object term5256 = newInstance(Class.forName("java.lang.Throwable"));
        Object[] term5257 = (Object[]) newArray("java.lang.Object", 5);
        short[] term5258 = (short[]) newShortArray(32);
        int[] term5291 = (int[]) newIntArray(32);
        Object[] term5324 = (Object[]) newArray("java.lang.Object", 32);
        long[] term5359 = (long[]) newLongArray(32);
        Object[] term5392 = (Object[]) newArray("java.lang.Object", 5);
        short[] term5393 = (short[]) newShortArray(32);
        int[] term5426 = (int[]) newIntArray(32);
        Object[] term5459 = (Object[]) newArray("java.lang.Object", 32);
        long[] term5460 = (long[]) newLongArray(32);
        Object[] term5493 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term5495 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        Object term5497 = newInstance(Class.forName("org.mockito.internal.exceptions.base.StackTraceFilter"));
        setShortElement(term5258, 0, (short) 1);
        setShortElement(term5258, 2, (short) 1);
        setShortElement(term5258, 3, (short) 2);
        setShortElement(term5258, 4, (short) 1);
        setShortElement(term5258, 5, (short) 7);
        setShortElement(term5258, 6, (short) 2);
        setShortElement(term5258, 7, (short) 1);
        setShortElement(term5258, 8, (short) 6);
        setShortElement(term5258, 9, (short) 2);
        setShortElement(term5258, 10, (short) 10);
        setShortElement(term5258, 11, (short) 11);
        setShortElement(term5258, 12, (short) 29);
        setShortElement(term5258, 13, (short) 5);
        setShortElement(term5258, 14, (short) 4);
        setShortElement(term5258, 15, (short) 4);
        setShortElement(term5258, 16, (short) 3);
        setShortElement(term5258, 17, (short) 5);
        setShortElement(term5258, 18, (short) 9);
        setShortElement(term5258, 19, (short) 10);
        setShortElement(term5258, 20, (short) 11);
        setShortElement(term5258, 21, (short) 4);
        setShortElement(term5258, 22, (short) 1);
        setShortElement(term5258, 24, (short) 10);
        setShortElement(term5258, 25, (short) 3);
        setShortElement(term5258, 26, (short) 4);
        setShortElement(term5258, 27, (short) 9);
        setShortElement(term5258, 28, (short) 1);
        setShortElement(term5258, 29, (short) 2);
        setShortElement(term5258, 30, (short) 3);
        setShortElement(term5258, 31, (short) 3);
        setElement(term5257, 0, term5258);
        setIntElement(term5291, 0, 917504);
        setIntElement(term5291, 1, 524288);
        setIntElement(term5291, 3, 5570560);
        setIntElement(term5291, 4, 327680);
        setIntElement(term5291, 5, 4456454);
        setIntElement(term5291, 6, 1769472);
        setIntElement(term5291, 7, 14876672);
        setIntElement(term5291, 8, 6225920);
        setIntElement(term5291, 9, 917504);
        setIntElement(term5291, 10, 327680);
        setIntElement(term5291, 11, 8519680);
        setIntElement(term5291, 12, 917504);
        setIntElement(term5291, 13, 11993088);
        setIntElement(term5291, 14, 655360);
        setIntElement(term5291, 15, 7864320);
        setIntElement(term5291, 16, 3735552);
        setIntElement(term5291, 17, 7143424);
        setIntElement(term5291, 18, 8454144);
        setIntElement(term5291, 19, 9240576);
        setIntElement(term5291, 20, 196608);
        setIntElement(term5291, 21, 3801088);
        setIntElement(term5291, 22, 786432);
        setIntElement(term5291, 23, 589824);
        setIntElement(term5291, 24, 17170432);
        setIntElement(term5291, 25, 1376256);
        setIntElement(term5291, 26, 5242880);
        setIntElement(term5291, 27, 2883584);
        setIntElement(term5291, 28, 20774912);
        setIntElement(term5291, 29, 262144);
        setIntElement(term5291, 30, 2555904);
        setIntElement(term5291, 31, 1835008);
        setElement(term5257, 1, term5291);
        setElement(term5324, 0, term5325);
        setElement(term5324, 1, term5325);
        setElement(term5324, 2, term5327);
        setElement(term5324, 3, term5327);
        setElement(term5324, 4, term5329);
        setElement(term5324, 5, term5331);
        setElement(term5324, 6, term5333);
        setElement(term5324, 7, term5333);
        setElement(term5324, 8, term5335);
        setElement(term5324, 9, term5335);
        setElement(term5324, 10, term5337);
        setElement(term5324, 11, term5337);
        setElement(term5324, 12, term5337);
        setElement(term5324, 13, term5337);
        setElement(term5324, 14, term5337);
        setElement(term5324, 15, term5339);
        setElement(term5324, 16, term5339);
        setElement(term5324, 17, term5341);
        setElement(term5324, 18, term5341);
        setElement(term5324, 19, term5341);
        setElement(term5324, 20, term5341);
        setElement(term5324, 21, term5343);
        setElement(term5324, 22, term5343);
        setElement(term5324, 23, term5343);
        setElement(term5324, 24, term5345);
        setElement(term5324, 25, term5341);
        setElement(term5324, 26, term5347);
        setElement(term5324, 27, term5349);
        setElement(term5324, 28, term5351);
        setElement(term5324, 29, term5353);
        setElement(term5324, 30, term5355);
        setElement(term5324, 31, term5357);
        setElement(term5257, 2, term5324);
        setLongElement(term5359, 0, 34363745304L);
        setLongElement(term5359, 1, 34363745304L);
        setLongElement(term5359, 2, 34363746224L);
        setLongElement(term5359, 3, 34363775512L);
        setLongElement(term5359, 4, 34363775512L);
        setLongElement(term5359, 5, 34363775512L);
        setLongElement(term5359, 6, 128809362246416L);
        setLongElement(term5359, 7, 34364440080L);
        setLongElement(term5359, 8, 128809362321008L);
        setLongElement(term5359, 9, 128809362085936L);
        setLongElement(term5359, 10, 128809362085824L);
        setLongElement(term5359, 11, 128809362085968L);
        setLongElement(term5359, 12, 128809362207296L);
        setLongElement(term5359, 13, 34363766248L);
        setLongElement(term5359, 14, 34363766248L);
        setLongElement(term5359, 15, 128806364538672L);
        setLongElement(term5359, 16, 128806364538672L);
        setLongElement(term5359, 17, 128806364538528L);
        setLongElement(term5359, 18, 128806364549760L);
        setLongElement(term5359, 19, 128806364551280L);
        setLongElement(term5359, 20, 128806364552048L);
        setLongElement(term5359, 21, 128806361950816L);
        setLongElement(term5359, 22, 34363739368L);
        setLongElement(term5359, 23, 34363739368L);
        setLongElement(term5359, 24, 128806364546688L);
        setLongElement(term5359, 25, 34363829248L);
        setLongElement(term5359, 26, 128806361950816L);
        setLongElement(term5359, 27, 128809410801520L);
        setLongElement(term5359, 28, 34363745472L);
        setLongElement(term5359, 29, 34364710216L);
        setLongElement(term5359, 30, 34363745472L);
        setLongElement(term5359, 31, 34363745472L);
        setElement(term5257, 3, term5359);
        setShortElement(term5393, 0, (short) 13);
        setShortElement(term5393, 1, (short) 1);
        setShortElement(term5393, 2, (short) 2);
        setShortElement(term5393, 3, (short) 12);
        setElement(term5392, 0, term5393);
        setIntElement(term5426, 0, 6029312);
        setIntElement(term5426, 1, 327680);
        setIntElement(term5426, 2, 1638400);
        setIntElement(term5426, 3, 720907);
        setElement(term5392, 1, term5426);
        setElement(term5392, 2, term5459);
        setLongElement(term5460, 0, 34364896224L);
        setLongElement(term5460, 1, 34363745472L);
        setLongElement(term5460, 2, 34363745472L);
        setLongElement(term5460, 3, 34363745472L);
        setElement(term5392, 3, term5460);
        setElement(term5257, 4, term5392);
        setField(term5256, term5256.getClass(), "backtrace", term5257);
        setField(term5256, term5256.getClass(), "detailMessage", null);
        setField(term5256, term5256.getClass(), "cause", term5256);
        setField(term5256, term5256.getClass(), "stackTrace", term5493);
        setIntField(term5256, term5256.getClass(), "depth", 36);
        setIntField(term5495, term5495.getClass(), "modCount", 0);
        setField(term5256, term5256.getClass(), "suppressedExceptions", term5495);
        setField(term5255, term5255.getClass(), "stackTraceHolder", term5256);
        setField(term5255, term5255.getClass(), "stackTraceFilter", term5497);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.exceptions.Reporter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.mockito.internal.debugging.Location");
        Object[] args = new Object[1];
        args[0] = term5255;
        try {
            callMethod(klass, "unfinishedVerificationException", argTypes, term5254, args);
            assertTrue(false);
        }
        catch (UnfinishedVerificationException e) {
        }

    }

};


