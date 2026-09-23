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
import org.mockito.exceptions.verification.NoInteractionsWanted;
import static org.mockito.exceptions.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.LinkedList;

public class Reporter_noMoreInteractionsWanted_100314452481 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28225;
     Object term28226;
     Object term28351;

    public Reporter_noMoreInteractionsWanted_100314452481() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28225 = newInstance(Class.forName("org.mockito.exceptions.Reporter"));
        term28226 = newInstance(Class.forName("org.mockito.internal.invocation.Invocation"));
        Object term28228 = newInstance(Class.forName("java.lang.Object"));
        Object[] term28229 = (Object[]) newArray("java.lang.Object", 5);
        Object term28230 = newInstance(Class.forName("java.lang.Object"));
        Object term28231 = newInstance(Class.forName("java.lang.Object"));
        Object term28232 = newInstance(Class.forName("java.lang.Object"));
        Object term28233 = newInstance(Class.forName("java.lang.Object"));
        Object term28234 = newInstance(Class.forName("java.lang.Object"));
        Object[] term28235 = (Object[]) newArray("java.lang.Object", 9);
        Object term28236 = newInstance(Class.forName("java.lang.Object"));
        Object term28237 = newInstance(Class.forName("java.lang.Object"));
        Object term28238 = newInstance(Class.forName("java.lang.Object"));
        Object term28239 = newInstance(Class.forName("java.lang.Object"));
        Object term28240 = newInstance(Class.forName("org.mockito.internal.debugging.Location"));
        Object term28241 = newInstance(Class.forName("java.lang.Throwable"));
        Object[] term28242 = (Object[]) newArray("java.lang.Object", 5);
        short[] term28243 = (short[]) newShortArray(32);
        int[] term28276 = (int[]) newIntArray(32);
        Object[] term28309 = (Object[]) newArray("java.lang.Object", 32);
        long[] term28310 = (long[]) newLongArray(32);
        Object[] term28343 = (Object[]) newArray("java.lang.Object", 5);
        Object[] term28344 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term28346 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        Object term28348 = newInstance(Class.forName("org.mockito.internal.exceptions.base.StackTraceFilter"));
        Object term28350 = newInstance(Class.forName("org.mockito.internal.invocation.StubInfo"));
        setIntField(term28226, term28226.getClass(), "sequenceNumber", 1585847225);
        setField(term28226, term28226.getClass(), "mock", term28228);
        setField(term28226, term28226.getClass(), "method", null);
        setElement(term28229, 0, term28230);
        setElement(term28229, 1, term28231);
        setElement(term28229, 2, term28232);
        setElement(term28229, 3, term28233);
        setElement(term28229, 4, term28234);
        setField(term28226, term28226.getClass(), "arguments", term28229);
        setElement(term28235, 0, term28236);
        setElement(term28235, 1, term28237);
        setElement(term28235, 2, term28238);
        setElement(term28235, 3, term28239);
        setElement(term28235, 4, term28237);
        setElement(term28235, 5, term28238);
        setElement(term28235, 6, term28228);
        setElement(term28235, 7, term28234);
        setElement(term28235, 8, term28232);
        setField(term28226, term28226.getClass(), "rawArguments", term28235);
        setShortElement(term28243, 0, (short) 1);
        setShortElement(term28243, 2, (short) 1);
        setShortElement(term28243, 3, (short) 2);
        setShortElement(term28243, 4, (short) 1);
        setShortElement(term28243, 5, (short) 7);
        setShortElement(term28243, 6, (short) 2);
        setShortElement(term28243, 7, (short) 1);
        setShortElement(term28243, 8, (short) 6);
        setShortElement(term28243, 9, (short) 3);
        setShortElement(term28243, 10, (short) 2);
        setShortElement(term28243, 11, (short) 8);
        setShortElement(term28243, 12, (short) 7);
        setShortElement(term28243, 13, (short) 6);
        setShortElement(term28243, 14, (short) 2);
        setShortElement(term28243, 15, (short) 10);
        setShortElement(term28243, 16, (short) 11);
        setShortElement(term28243, 17, (short) 29);
        setShortElement(term28243, 18, (short) 5);
        setShortElement(term28243, 19, (short) 4);
        setShortElement(term28243, 20, (short) 4);
        setShortElement(term28243, 21, (short) 3);
        setShortElement(term28243, 22, (short) 5);
        setShortElement(term28243, 23, (short) 9);
        setShortElement(term28243, 24, (short) 10);
        setShortElement(term28243, 25, (short) 11);
        setShortElement(term28243, 26, (short) 4);
        setShortElement(term28243, 27, (short) 1);
        setShortElement(term28243, 29, (short) 10);
        setShortElement(term28243, 30, (short) 3);
        setShortElement(term28243, 31, (short) 4);
        setElement(term28242, 0, term28243);
        setIntElement(term28276, 0, 917504);
        setIntElement(term28276, 1, 524288);
        setIntElement(term28276, 3, 5570560);
        setIntElement(term28276, 4, 327680);
        setIntElement(term28276, 5, 4456454);
        setIntElement(term28276, 6, 1769472);
        setIntElement(term28276, 7, 14876672);
        setIntElement(term28276, 8, 6225920);
        setIntElement(term28276, 9, 15728640);
        setIntElement(term28276, 10, 4980736);
        setIntElement(term28276, 11, 3211264);
        setIntElement(term28276, 12, 2293760);
        setIntElement(term28276, 13, 10354688);
        setIntElement(term28276, 14, 917504);
        setIntElement(term28276, 15, 327680);
        setIntElement(term28276, 16, 8519680);
        setIntElement(term28276, 17, 917504);
        setIntElement(term28276, 18, 11993088);
        setIntElement(term28276, 19, 655360);
        setIntElement(term28276, 20, 7864320);
        setIntElement(term28276, 21, 3735552);
        setIntElement(term28276, 22, 7143424);
        setIntElement(term28276, 23, 8454144);
        setIntElement(term28276, 24, 9240576);
        setIntElement(term28276, 25, 196608);
        setIntElement(term28276, 26, 3801088);
        setIntElement(term28276, 27, 786432);
        setIntElement(term28276, 28, 589824);
        setIntElement(term28276, 29, 17170432);
        setIntElement(term28276, 30, 1376256);
        setIntElement(term28276, 31, 5242880);
        setElement(term28242, 1, term28276);
        setElement(term28242, 2, term28309);
        setLongElement(term28310, 0, 34363745304L);
        setLongElement(term28310, 1, 34363745304L);
        setLongElement(term28310, 2, 34363746224L);
        setLongElement(term28310, 3, 34363775512L);
        setLongElement(term28310, 4, 34363775512L);
        setLongElement(term28310, 5, 34363775512L);
        setLongElement(term28310, 6, 128809362246416L);
        setLongElement(term28310, 7, 34364440080L);
        setLongElement(term28310, 8, 128809362321008L);
        setLongElement(term28310, 9, 128809362618448L);
        setLongElement(term28310, 10, 128809362321632L);
        setLongElement(term28310, 11, 128809362321632L);
        setLongElement(term28310, 12, 128809362321376L);
        setLongElement(term28310, 13, 128809362321008L);
        setLongElement(term28310, 14, 128809362085936L);
        setLongElement(term28310, 15, 128809362085824L);
        setLongElement(term28310, 16, 128809362085968L);
        setLongElement(term28310, 17, 128809362207296L);
        setLongElement(term28310, 18, 34363766248L);
        setLongElement(term28310, 19, 34363766248L);
        setLongElement(term28310, 20, 128806364538672L);
        setLongElement(term28310, 21, 128806364538672L);
        setLongElement(term28310, 22, 128806364538528L);
        setLongElement(term28310, 23, 128806364549760L);
        setLongElement(term28310, 24, 128806364551280L);
        setLongElement(term28310, 25, 128806364552048L);
        setLongElement(term28310, 26, 128806361950816L);
        setLongElement(term28310, 27, 34363739368L);
        setLongElement(term28310, 28, 34363739368L);
        setLongElement(term28310, 29, 128806364546688L);
        setLongElement(term28310, 30, 34363829248L);
        setLongElement(term28310, 31, 128806361950816L);
        setElement(term28242, 3, term28310);
        setElement(term28242, 4, term28343);
        setField(term28241, term28241.getClass(), "backtrace", term28242);
        setField(term28241, term28241.getClass(), "detailMessage", null);
        setField(term28241, term28241.getClass(), "cause", term28241);
        setField(term28241, term28241.getClass(), "stackTrace", term28344);
        setIntField(term28241, term28241.getClass(), "depth", 41);
        setIntField(term28346, term28346.getClass(), "modCount", 0);
        setField(term28241, term28241.getClass(), "suppressedExceptions", term28346);
        setField(term28240, term28240.getClass(), "stackTraceHolder", term28241);
        setField(term28240, term28240.getClass(), "stackTraceFilter", term28348);
        setField(term28226, term28226.getClass(), "location", term28240);
        setBooleanField(term28226, term28226.getClass(), "verified", false);
        setField(term28226, term28226.getClass(), "realMethod", null);
        setField(term28350, term28350.getClass(), "stubbedAt", null);
        setField(term28226, term28226.getClass(), "stubInfo", term28350);
        term28351 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.exceptions.Reporter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.mockito.internal.invocation.Invocation");
        argTypes[1] = Class.forName("java.util.List");
        Object[] args = new Object[2];
        args[0] = term28226;
        args[1] = term28351;
        try {
            callMethod(klass, "noMoreInteractionsWanted", argTypes, term28225, args);
            assertTrue(false);
        }
        catch (NoInteractionsWanted e) {
        }

    }

};


