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
import org.mockito.exceptions.verification.VerificationInOrderFailure;
import static org.mockito.exceptions.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Reporter_noMoreInteractionsWantedInOrder_188726590582 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28450;
     Object term28451;

    public Reporter_noMoreInteractionsWantedInOrder_188726590582() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28450 = newInstance(Class.forName("org.mockito.exceptions.Reporter"));
        term28451 = newInstance(Class.forName("org.mockito.internal.invocation.Invocation"));
        Object term28453 = newInstance(Class.forName("java.lang.Object"));
        Object[] term28454 = (Object[]) newArray("java.lang.Object", 5);
        Object term28455 = newInstance(Class.forName("java.lang.Object"));
        Object term28456 = newInstance(Class.forName("java.lang.Object"));
        Object term28457 = newInstance(Class.forName("java.lang.Object"));
        Object term28458 = newInstance(Class.forName("java.lang.Object"));
        Object term28459 = newInstance(Class.forName("java.lang.Object"));
        Object[] term28460 = (Object[]) newArray("java.lang.Object", 3);
        Object term28461 = newInstance(Class.forName("java.lang.Object"));
        Object term28462 = newInstance(Class.forName("java.lang.Object"));
        Object term28463 = newInstance(Class.forName("java.lang.Object"));
        Object term28464 = newInstance(Class.forName("org.mockito.internal.debugging.Location"));
        Object term28465 = newInstance(Class.forName("java.lang.Throwable"));
        Object[] term28466 = (Object[]) newArray("java.lang.Object", 5);
        short[] term28467 = (short[]) newShortArray(32);
        int[] term28500 = (int[]) newIntArray(32);
        Object[] term28533 = (Object[]) newArray("java.lang.Object", 32);
        long[] term28534 = (long[]) newLongArray(32);
        Object[] term28567 = (Object[]) newArray("java.lang.Object", 5);
        Object[] term28568 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term28570 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        Object term28572 = newInstance(Class.forName("org.mockito.internal.exceptions.base.StackTraceFilter"));
        Object term28574 = newInstance(Class.forName("org.mockito.internal.invocation.StubInfo"));
        setIntField(term28451, term28451.getClass(), "sequenceNumber", 597278769);
        setField(term28451, term28451.getClass(), "mock", term28453);
        setField(term28451, term28451.getClass(), "method", null);
        setElement(term28454, 0, term28455);
        setElement(term28454, 1, term28456);
        setElement(term28454, 2, term28457);
        setElement(term28454, 3, term28458);
        setElement(term28454, 4, term28459);
        setField(term28451, term28451.getClass(), "arguments", term28454);
        setElement(term28460, 0, term28461);
        setElement(term28460, 1, term28462);
        setElement(term28460, 2, term28463);
        setField(term28451, term28451.getClass(), "rawArguments", term28460);
        setShortElement(term28467, 0, (short) 1);
        setShortElement(term28467, 2, (short) 1);
        setShortElement(term28467, 3, (short) 2);
        setShortElement(term28467, 4, (short) 1);
        setShortElement(term28467, 5, (short) 7);
        setShortElement(term28467, 6, (short) 2);
        setShortElement(term28467, 7, (short) 1);
        setShortElement(term28467, 8, (short) 6);
        setShortElement(term28467, 9, (short) 3);
        setShortElement(term28467, 10, (short) 2);
        setShortElement(term28467, 11, (short) 8);
        setShortElement(term28467, 12, (short) 7);
        setShortElement(term28467, 13, (short) 6);
        setShortElement(term28467, 14, (short) 2);
        setShortElement(term28467, 15, (short) 10);
        setShortElement(term28467, 16, (short) 11);
        setShortElement(term28467, 17, (short) 29);
        setShortElement(term28467, 18, (short) 5);
        setShortElement(term28467, 19, (short) 4);
        setShortElement(term28467, 20, (short) 4);
        setShortElement(term28467, 21, (short) 3);
        setShortElement(term28467, 22, (short) 5);
        setShortElement(term28467, 23, (short) 9);
        setShortElement(term28467, 24, (short) 10);
        setShortElement(term28467, 25, (short) 11);
        setShortElement(term28467, 26, (short) 4);
        setShortElement(term28467, 27, (short) 1);
        setShortElement(term28467, 29, (short) 10);
        setShortElement(term28467, 30, (short) 3);
        setShortElement(term28467, 31, (short) 4);
        setElement(term28466, 0, term28467);
        setIntElement(term28500, 0, 917504);
        setIntElement(term28500, 1, 524288);
        setIntElement(term28500, 3, 5570560);
        setIntElement(term28500, 4, 327680);
        setIntElement(term28500, 5, 4456454);
        setIntElement(term28500, 6, 1769472);
        setIntElement(term28500, 7, 14876672);
        setIntElement(term28500, 8, 6225920);
        setIntElement(term28500, 9, 15728640);
        setIntElement(term28500, 10, 4980736);
        setIntElement(term28500, 11, 3211264);
        setIntElement(term28500, 12, 2293760);
        setIntElement(term28500, 13, 10354688);
        setIntElement(term28500, 14, 917504);
        setIntElement(term28500, 15, 327680);
        setIntElement(term28500, 16, 8519680);
        setIntElement(term28500, 17, 917504);
        setIntElement(term28500, 18, 11993088);
        setIntElement(term28500, 19, 655360);
        setIntElement(term28500, 20, 7864320);
        setIntElement(term28500, 21, 3735552);
        setIntElement(term28500, 22, 7143424);
        setIntElement(term28500, 23, 8454144);
        setIntElement(term28500, 24, 9240576);
        setIntElement(term28500, 25, 196608);
        setIntElement(term28500, 26, 3801088);
        setIntElement(term28500, 27, 786432);
        setIntElement(term28500, 28, 589824);
        setIntElement(term28500, 29, 17170432);
        setIntElement(term28500, 30, 1376256);
        setIntElement(term28500, 31, 5242880);
        setElement(term28466, 1, term28500);
        setElement(term28466, 2, term28533);
        setLongElement(term28534, 0, 34363745304L);
        setLongElement(term28534, 1, 34363745304L);
        setLongElement(term28534, 2, 34363746224L);
        setLongElement(term28534, 3, 34363775512L);
        setLongElement(term28534, 4, 34363775512L);
        setLongElement(term28534, 5, 34363775512L);
        setLongElement(term28534, 6, 128809362246416L);
        setLongElement(term28534, 7, 34364440080L);
        setLongElement(term28534, 8, 128809362321008L);
        setLongElement(term28534, 9, 128809362618448L);
        setLongElement(term28534, 10, 128809362321632L);
        setLongElement(term28534, 11, 128809362321632L);
        setLongElement(term28534, 12, 128809362321376L);
        setLongElement(term28534, 13, 128809362321008L);
        setLongElement(term28534, 14, 128809362085936L);
        setLongElement(term28534, 15, 128809362085824L);
        setLongElement(term28534, 16, 128809362085968L);
        setLongElement(term28534, 17, 128809362207296L);
        setLongElement(term28534, 18, 34363766248L);
        setLongElement(term28534, 19, 34363766248L);
        setLongElement(term28534, 20, 128806364538672L);
        setLongElement(term28534, 21, 128806364538672L);
        setLongElement(term28534, 22, 128806364538528L);
        setLongElement(term28534, 23, 128806364549760L);
        setLongElement(term28534, 24, 128806364551280L);
        setLongElement(term28534, 25, 128806364552048L);
        setLongElement(term28534, 26, 128806361950816L);
        setLongElement(term28534, 27, 34363739368L);
        setLongElement(term28534, 28, 34363739368L);
        setLongElement(term28534, 29, 128806364546688L);
        setLongElement(term28534, 30, 34363829248L);
        setLongElement(term28534, 31, 128806361950816L);
        setElement(term28466, 3, term28534);
        setElement(term28466, 4, term28567);
        setField(term28465, term28465.getClass(), "backtrace", term28466);
        setField(term28465, term28465.getClass(), "detailMessage", null);
        setField(term28465, term28465.getClass(), "cause", term28465);
        setField(term28465, term28465.getClass(), "stackTrace", term28568);
        setIntField(term28465, term28465.getClass(), "depth", 41);
        setIntField(term28570, term28570.getClass(), "modCount", 0);
        setField(term28465, term28465.getClass(), "suppressedExceptions", term28570);
        setField(term28464, term28464.getClass(), "stackTraceHolder", term28465);
        setField(term28464, term28464.getClass(), "stackTraceFilter", term28572);
        setField(term28451, term28451.getClass(), "location", term28464);
        setBooleanField(term28451, term28451.getClass(), "verified", false);
        setField(term28451, term28451.getClass(), "realMethod", null);
        setField(term28574, term28574.getClass(), "stubbedAt", null);
        setField(term28451, term28451.getClass(), "stubInfo", term28574);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.exceptions.Reporter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.mockito.internal.invocation.Invocation");
        Object[] args = new Object[1];
        args[0] = term28451;
        try {
            callMethod(klass, "noMoreInteractionsWantedInOrder", argTypes, term28450, args);
            assertTrue(false);
        }
        catch (VerificationInOrderFailure e) {
        }

    }

};


