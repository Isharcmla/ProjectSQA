package com.fasterxml.jackson.databind.deser.std;

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
import static com.fasterxml.jackson.databind.deser.std.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class MapDeserializer_wrapAndThrow_161110489042 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3377;
     Object term3661;

    public MapDeserializer_wrapAndThrow_161110489042() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3446 = Class.forName((String) "com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter");
        Class<? extends Object> term3449 = Class.forName((String) "java.util.Collections$SynchronizedNavigableSet");
        Class<? extends Object> term3451 = Class.forName((String) "java.io.DefaultFileSystem");
        Class<? extends Object> term3455 = Class.forName((String) "java.lang.SecurityManager$2");
        Class<? extends Object> term3460 = Class.forName((String) "java.lang.ProcessBuilder$Redirect$6");
        Class<? extends Object> term3464 = Class.forName((String) "java.util.TimSort");
        Class<? extends Object> term3468 = Class.forName((String) "java.util.stream.ReduceOps$12ReducingSink");
        Class<? extends Object> term3472 = Class.forName((String) "java.util.ResourceBundle$Control$1");
        Class<? extends Object> term3476 = Class.forName((String) "java.lang.reflect.Type");
        Class<? extends Object> term3480 = Class.forName((String) "com.fasterxml.jackson.databind.type.MapLikeType");
        Class<? extends Object> term3484 = Class.forName((String) "java.util.Spliterators$AbstractDoubleSpliterator");
        Class<? extends Object> term3488 = Class.forName((String) "java.util.stream.StreamSpliterators$LongWrappingSpliterator");
        Class<? extends Object> term3492 = Class.forName((String) "java.util.stream.SortedOps$OfInt");
        Class<? extends Object> term3496 = Class.forName((String) "java.lang.invoke.CallSite");
        Class<? extends Object> term3498 = Class.forName((String) "org.vorpal.research.kex.intrinsics.internal.DoubleGenerator");
        Class<? extends Object> term3501 = Class.forName((String) "java.lang.StringBuilder");
        Class<? extends Object> term3503 = Class.forName((String) "java.util.concurrent.ScheduledFuture");
        Class<? extends Object> term3505 = Class.forName((String) "java.util.concurrent.ConcurrentSkipListMap$ValueSpliterator");
        Class<? extends Object> term3608 = Class.forName((String) "java.lang.ProcessImpl$ProcessPipeOutputStream");
        Class<? extends Object> term3610 = Class.forName((String) "java.lang.InterruptedException");
        term3377 = newInstance(Class.forName("java.lang.Throwable"));
        Object[] term3378 = (Object[]) newArray("java.lang.Object", 5);
        short[] term3379 = (short[]) newShortArray(32);
        int[] term3412 = (int[]) newIntArray(32);
        Object[] term3445 = (Object[]) newArray("java.lang.Object", 32);
        long[] term3507 = (long[]) newLongArray(32);
        Object[] term3540 = (Object[]) newArray("java.lang.Object", 5);
        short[] term3541 = (short[]) newShortArray(32);
        int[] term3574 = (int[]) newIntArray(32);
        Object[] term3607 = (Object[]) newArray("java.lang.Object", 32);
        long[] term3612 = (long[]) newLongArray(32);
        Object[] term3657 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term3659 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setShortElement(term3379, 0, (short) 1);
        setShortElement(term3379, 1, (short) 2);
        setShortElement(term3379, 2, (short) 1);
        setShortElement(term3379, 3, (short) 7);
        setShortElement(term3379, 4, (short) 2);
        setShortElement(term3379, 5, (short) 1);
        setShortElement(term3379, 6, (short) 6);
        setShortElement(term3379, 7, (short) 2);
        setShortElement(term3379, 8, (short) 10);
        setShortElement(term3379, 9, (short) 11);
        setShortElement(term3379, 10, (short) 29);
        setShortElement(term3379, 11, (short) 5);
        setShortElement(term3379, 12, (short) 4);
        setShortElement(term3379, 13, (short) 5);
        setShortElement(term3379, 14, (short) 6);
        setShortElement(term3379, 15, (short) 6);
        setShortElement(term3379, 16, (short) 9);
        setShortElement(term3379, 17, (short) 10);
        setShortElement(term3379, 18, (short) 11);
        setShortElement(term3379, 19, (short) 4);
        setShortElement(term3379, 20, (short) 1);
        setShortElement(term3379, 23, (short) 3);
        setShortElement(term3379, 24, (short) 4);
        setShortElement(term3379, 25, (short) 4);
        setShortElement(term3379, 26, (short) 1);
        setShortElement(term3379, 27, (short) 2);
        setShortElement(term3379, 28, (short) 3);
        setShortElement(term3379, 29, (short) 3);
        setShortElement(term3379, 30, (short) 13);
        setShortElement(term3379, 31, (short) 1);
        setElement(term3378, 0, term3379);
        setIntElement(term3412, 1, 5570560);
        setIntElement(term3412, 2, 327680);
        setIntElement(term3412, 3, 4456454);
        setIntElement(term3412, 4, 1769472);
        setIntElement(term3412, 5, 14876672);
        setIntElement(term3412, 6, 6225920);
        setIntElement(term3412, 7, 917504);
        setIntElement(term3412, 8, 327680);
        setIntElement(term3412, 9, 8519680);
        setIntElement(term3412, 10, 917504);
        setIntElement(term3412, 11, 11993088);
        setIntElement(term3412, 12, 655360);
        setIntElement(term3412, 13, 7864320);
        setIntElement(term3412, 14, 3735552);
        setIntElement(term3412, 15, 7143424);
        setIntElement(term3412, 16, 8454144);
        setIntElement(term3412, 17, 9240576);
        setIntElement(term3412, 18, 196608);
        setIntElement(term3412, 19, 3801088);
        setIntElement(term3412, 20, 786432);
        setIntElement(term3412, 21, 589824);
        setIntElement(term3412, 22, 17170432);
        setIntElement(term3412, 23, 1376256);
        setIntElement(term3412, 24, 5242880);
        setIntElement(term3412, 25, 2883584);
        setIntElement(term3412, 26, 20774912);
        setIntElement(term3412, 27, 262144);
        setIntElement(term3412, 28, 2555904);
        setIntElement(term3412, 29, 1835008);
        setIntElement(term3412, 30, 6029312);
        setIntElement(term3412, 31, 327680);
        setElement(term3378, 1, term3412);
        setElement(term3445, 0, term3446);
        setElement(term3445, 1, term3446);
        setElement(term3445, 2, term3449);
        setElement(term3445, 3, term3451);
        setElement(term3445, 4, term3455);
        setElement(term3445, 5, term3455);
        setElement(term3445, 6, term3460);
        setElement(term3445, 7, term3460);
        setElement(term3445, 8, term3464);
        setElement(term3445, 9, term3464);
        setElement(term3445, 10, term3464);
        setElement(term3445, 11, term3464);
        setElement(term3445, 12, term3464);
        setElement(term3445, 13, term3468);
        setElement(term3445, 14, term3468);
        setElement(term3445, 15, term3472);
        setElement(term3445, 16, term3472);
        setElement(term3445, 17, term3472);
        setElement(term3445, 18, term3472);
        setElement(term3445, 19, term3476);
        setElement(term3445, 20, term3476);
        setElement(term3445, 21, term3476);
        setElement(term3445, 22, term3480);
        setElement(term3445, 23, term3472);
        setElement(term3445, 24, term3484);
        setElement(term3445, 25, term3488);
        setElement(term3445, 26, term3492);
        setElement(term3445, 27, term3496);
        setElement(term3445, 28, term3498);
        setElement(term3445, 29, term3501);
        setElement(term3445, 30, term3503);
        setElement(term3445, 31, term3505);
        setElement(term3378, 2, term3445);
        setLongElement(term3507, 0, 34363746224L);
        setLongElement(term3507, 1, 34363775512L);
        setLongElement(term3507, 2, 34363775512L);
        setLongElement(term3507, 3, 34363775512L);
        setLongElement(term3507, 4, 125675713554912L);
        setLongElement(term3507, 5, 34364440080L);
        setLongElement(term3507, 6, 125675713629344L);
        setLongElement(term3507, 7, 125675713468544L);
        setLongElement(term3507, 8, 125675713468432L);
        setLongElement(term3507, 9, 125675713468576L);
        setLongElement(term3507, 10, 125675713515792L);
        setLongElement(term3507, 11, 34363766248L);
        setLongElement(term3507, 12, 34363766248L);
        setLongElement(term3507, 13, 125672590537040L);
        setLongElement(term3507, 14, 125672590537040L);
        setLongElement(term3507, 15, 125672590536896L);
        setLongElement(term3507, 16, 125672590581472L);
        setLongElement(term3507, 17, 125672590583120L);
        setLongElement(term3507, 18, 125672590583888L);
        setLongElement(term3507, 19, 125672587510288L);
        setLongElement(term3507, 20, 34363739368L);
        setLongElement(term3507, 21, 34363739368L);
        setLongElement(term3507, 22, 125672590535536L);
        setLongElement(term3507, 23, 34363829248L);
        setLongElement(term3507, 24, 125672587510288L);
        setLongElement(term3507, 25, 125672586395920L);
        setLongElement(term3507, 26, 34363745472L);
        setLongElement(term3507, 27, 34364710216L);
        setLongElement(term3507, 28, 34363745472L);
        setLongElement(term3507, 29, 34363745472L);
        setLongElement(term3507, 30, 34364896224L);
        setLongElement(term3507, 31, 34363745472L);
        setElement(term3378, 3, term3507);
        setShortElement(term3541, 0, (short) 2);
        setShortElement(term3541, 1, (short) 12);
        setElement(term3540, 0, term3541);
        setIntElement(term3574, 0, 1638400);
        setIntElement(term3574, 1, 720907);
        setElement(term3540, 1, term3574);
        setElement(term3607, 0, term3608);
        setElement(term3607, 1, term3610);
        setElement(term3540, 2, term3607);
        setLongElement(term3612, 0, 34363745472L);
        setLongElement(term3612, 1, 34363745472L);
        setElement(term3540, 3, term3612);
        setElement(term3378, 4, term3540);
        setField(term3377, term3377.getClass(), "backtrace", term3378);
        setField(term3377, term3377.getClass(), "detailMessage", "ZiaGIbnzTs");
        setField(term3377, term3377.getClass(), "cause", term3377);
        setField(term3377, term3377.getClass(), "stackTrace", term3657);
        setIntField(term3377, term3377.getClass(), "depth", 34);
        setIntField(term3659, term3659.getClass(), "modCount", 0);
        setField(term3377, term3377.getClass(), "suppressedExceptions", term3659);
        term3661 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.MapDeserializer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Throwable");
        argTypes[1] = Class.forName("java.lang.Object");
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = term3377;
        args[1] = term3661;
        args[2] = "tbcdzjIfER";
        try {
            callMethod(klass, "wrapAndThrow", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


