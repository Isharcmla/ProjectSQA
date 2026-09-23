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
import org.mockito.exceptions.misusing.InvalidUseOfMatchersException;
import static org.mockito.exceptions.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class Reporter_misplacedArgumentMatcher_193543040288 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28768;
     Object term28769;

    public Reporter_misplacedArgumentMatcher_193543040288() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28768 = newInstance(Class.forName("org.mockito.exceptions.Reporter"));
        Class<? extends Object> term28839 = Class.forName((String) "org.mockito.asm.AnnotationWriter");
        Class<? extends Object> term28841 = Class.forName((String) "java.util.concurrent.Phaser");
        Class<? extends Object> term28843 = Class.forName((String) "java.util.stream.Node");
        Class<? extends Object> term28845 = Class.forName((String) "org.mockito.Answers");
        Class<? extends Object> term28847 = Class.forName((String) "org.hamcrest.Matcher");
        Class<? extends Object> term28849 = Class.forName((String) "org.mockito.exceptions.verification.NeverWantedButInvoked");
        Class<? extends Object> term28851 = Class.forName((String) "org.assertj.core.error.ShouldBeInSameHour");
        Class<? extends Object> term28853 = Class.forName((String) "java.lang.ProcessEnvironment$StringEntrySet$1");
        Class<? extends Object> term28855 = Class.forName((String) "org.mockito.exceptions.verification.TooLittleActualInvocations");
        Class<? extends Object> term28857 = Class.forName((String) "java.nio.file.ClosedFileSystemException");
        Class<? extends Object> term28859 = Class.forName((String) "java.util.stream.SortedOps$OfInt");
        Class<? extends Object> term28861 = Class.forName((String) "org.assertj.core.api.AbstractBooleanArrayAssert");
        Class<? extends Object> term28863 = Class.forName((String) "org.assertj.core.api.filter.NotInFilter");
        Class<? extends Object> term28865 = Class.forName((String) "java.util.Collections$3");
        Class<? extends Object> term28867 = Class.forName((String) "kex.java.util.HashMap");
        Class<? extends Object> term28869 = Class.forName((String) "java.util.regex.Pattern$UnixDollar");
        Class<? extends Object> term28871 = Class.forName((String) "org.mockito.cglib.core.EmitUtils$16");
        term28769 = newInstance(Class.forName("org.mockito.internal.debugging.Location"));
        Object term28770 = newInstance(Class.forName("java.lang.Throwable"));
        Object[] term28771 = (Object[]) newArray("java.lang.Object", 5);
        short[] term28772 = (short[]) newShortArray(32);
        int[] term28805 = (int[]) newIntArray(32);
        Object[] term28838 = (Object[]) newArray("java.lang.Object", 32);
        long[] term28873 = (long[]) newLongArray(32);
        Object[] term28906 = (Object[]) newArray("java.lang.Object", 5);
        short[] term28907 = (short[]) newShortArray(32);
        int[] term28940 = (int[]) newIntArray(32);
        Object[] term28973 = (Object[]) newArray("java.lang.Object", 32);
        long[] term28974 = (long[]) newLongArray(32);
        Object[] term29007 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term29009 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        Object term29011 = newInstance(Class.forName("org.mockito.internal.exceptions.base.StackTraceFilter"));
        setShortElement(term28772, 0, (short) 1);
        setShortElement(term28772, 2, (short) 1);
        setShortElement(term28772, 3, (short) 2);
        setShortElement(term28772, 4, (short) 1);
        setShortElement(term28772, 5, (short) 7);
        setShortElement(term28772, 6, (short) 2);
        setShortElement(term28772, 7, (short) 1);
        setShortElement(term28772, 8, (short) 6);
        setShortElement(term28772, 9, (short) 2);
        setShortElement(term28772, 10, (short) 10);
        setShortElement(term28772, 11, (short) 11);
        setShortElement(term28772, 12, (short) 29);
        setShortElement(term28772, 13, (short) 5);
        setShortElement(term28772, 14, (short) 4);
        setShortElement(term28772, 15, (short) 4);
        setShortElement(term28772, 16, (short) 3);
        setShortElement(term28772, 17, (short) 5);
        setShortElement(term28772, 18, (short) 9);
        setShortElement(term28772, 19, (short) 10);
        setShortElement(term28772, 20, (short) 11);
        setShortElement(term28772, 21, (short) 4);
        setShortElement(term28772, 22, (short) 1);
        setShortElement(term28772, 24, (short) 10);
        setShortElement(term28772, 25, (short) 3);
        setShortElement(term28772, 26, (short) 4);
        setShortElement(term28772, 27, (short) 9);
        setShortElement(term28772, 28, (short) 1);
        setShortElement(term28772, 29, (short) 2);
        setShortElement(term28772, 30, (short) 3);
        setShortElement(term28772, 31, (short) 3);
        setElement(term28771, 0, term28772);
        setIntElement(term28805, 0, 917504);
        setIntElement(term28805, 1, 524288);
        setIntElement(term28805, 3, 5570560);
        setIntElement(term28805, 4, 327680);
        setIntElement(term28805, 5, 4456454);
        setIntElement(term28805, 6, 1769472);
        setIntElement(term28805, 7, 14876672);
        setIntElement(term28805, 8, 6225920);
        setIntElement(term28805, 9, 917504);
        setIntElement(term28805, 10, 327680);
        setIntElement(term28805, 11, 8519680);
        setIntElement(term28805, 12, 917504);
        setIntElement(term28805, 13, 11993088);
        setIntElement(term28805, 14, 655360);
        setIntElement(term28805, 15, 7864320);
        setIntElement(term28805, 16, 3735552);
        setIntElement(term28805, 17, 7143424);
        setIntElement(term28805, 18, 8454144);
        setIntElement(term28805, 19, 9240576);
        setIntElement(term28805, 20, 196608);
        setIntElement(term28805, 21, 3801088);
        setIntElement(term28805, 22, 786432);
        setIntElement(term28805, 23, 589824);
        setIntElement(term28805, 24, 17170432);
        setIntElement(term28805, 25, 1376256);
        setIntElement(term28805, 26, 5242880);
        setIntElement(term28805, 27, 2883584);
        setIntElement(term28805, 28, 20774912);
        setIntElement(term28805, 29, 262144);
        setIntElement(term28805, 30, 2555904);
        setIntElement(term28805, 31, 1835008);
        setElement(term28771, 1, term28805);
        setElement(term28838, 0, term28839);
        setElement(term28838, 1, term28839);
        setElement(term28838, 2, term28841);
        setElement(term28838, 3, term28841);
        setElement(term28838, 4, term28843);
        setElement(term28838, 5, term28845);
        setElement(term28838, 6, term28847);
        setElement(term28838, 7, term28847);
        setElement(term28838, 8, term28849);
        setElement(term28838, 9, term28849);
        setElement(term28838, 10, term28851);
        setElement(term28838, 11, term28851);
        setElement(term28838, 12, term28851);
        setElement(term28838, 13, term28851);
        setElement(term28838, 14, term28851);
        setElement(term28838, 15, term28853);
        setElement(term28838, 16, term28853);
        setElement(term28838, 17, term28855);
        setElement(term28838, 18, term28855);
        setElement(term28838, 19, term28855);
        setElement(term28838, 20, term28855);
        setElement(term28838, 21, term28857);
        setElement(term28838, 22, term28857);
        setElement(term28838, 23, term28857);
        setElement(term28838, 24, term28859);
        setElement(term28838, 25, term28855);
        setElement(term28838, 26, term28861);
        setElement(term28838, 27, term28863);
        setElement(term28838, 28, term28865);
        setElement(term28838, 29, term28867);
        setElement(term28838, 30, term28869);
        setElement(term28838, 31, term28871);
        setElement(term28771, 2, term28838);
        setLongElement(term28873, 0, 34363745304L);
        setLongElement(term28873, 1, 34363745304L);
        setLongElement(term28873, 2, 34363746224L);
        setLongElement(term28873, 3, 34363775512L);
        setLongElement(term28873, 4, 34363775512L);
        setLongElement(term28873, 5, 34363775512L);
        setLongElement(term28873, 6, 128809362246416L);
        setLongElement(term28873, 7, 34364440080L);
        setLongElement(term28873, 8, 128809362321008L);
        setLongElement(term28873, 9, 128809362085936L);
        setLongElement(term28873, 10, 128809362085824L);
        setLongElement(term28873, 11, 128809362085968L);
        setLongElement(term28873, 12, 128809362207296L);
        setLongElement(term28873, 13, 34363766248L);
        setLongElement(term28873, 14, 34363766248L);
        setLongElement(term28873, 15, 128806364538672L);
        setLongElement(term28873, 16, 128806364538672L);
        setLongElement(term28873, 17, 128806364538528L);
        setLongElement(term28873, 18, 128806364549760L);
        setLongElement(term28873, 19, 128806364551280L);
        setLongElement(term28873, 20, 128806364552048L);
        setLongElement(term28873, 21, 128806361950816L);
        setLongElement(term28873, 22, 34363739368L);
        setLongElement(term28873, 23, 34363739368L);
        setLongElement(term28873, 24, 128806364546688L);
        setLongElement(term28873, 25, 34363829248L);
        setLongElement(term28873, 26, 128806361950816L);
        setLongElement(term28873, 27, 128809410801520L);
        setLongElement(term28873, 28, 34363745472L);
        setLongElement(term28873, 29, 34364710216L);
        setLongElement(term28873, 30, 34363745472L);
        setLongElement(term28873, 31, 34363745472L);
        setElement(term28771, 3, term28873);
        setShortElement(term28907, 0, (short) 13);
        setShortElement(term28907, 1, (short) 1);
        setShortElement(term28907, 2, (short) 2);
        setShortElement(term28907, 3, (short) 12);
        setElement(term28906, 0, term28907);
        setIntElement(term28940, 0, 6029312);
        setIntElement(term28940, 1, 327680);
        setIntElement(term28940, 2, 1638400);
        setIntElement(term28940, 3, 720907);
        setElement(term28906, 1, term28940);
        setElement(term28906, 2, term28973);
        setLongElement(term28974, 0, 34364896224L);
        setLongElement(term28974, 1, 34363745472L);
        setLongElement(term28974, 2, 34363745472L);
        setLongElement(term28974, 3, 34363745472L);
        setElement(term28906, 3, term28974);
        setElement(term28771, 4, term28906);
        setField(term28770, term28770.getClass(), "backtrace", term28771);
        setField(term28770, term28770.getClass(), "detailMessage", null);
        setField(term28770, term28770.getClass(), "cause", term28770);
        setField(term28770, term28770.getClass(), "stackTrace", term29007);
        setIntField(term28770, term28770.getClass(), "depth", 36);
        setIntField(term29009, term29009.getClass(), "modCount", 0);
        setField(term28770, term28770.getClass(), "suppressedExceptions", term29009);
        setField(term28769, term28769.getClass(), "stackTraceHolder", term28770);
        setField(term28769, term28769.getClass(), "stackTraceFilter", term29011);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.exceptions.Reporter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.mockito.internal.debugging.Location");
        Object[] args = new Object[1];
        args[0] = term28769;
        try {
            callMethod(klass, "misplacedArgumentMatcher", argTypes, term28768, args);
            assertTrue(false);
        }
        catch (InvalidUseOfMatchersException e) {
        }

    }

};


