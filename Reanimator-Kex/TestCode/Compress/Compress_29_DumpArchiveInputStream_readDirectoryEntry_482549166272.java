package org.apache.commons.compress.archivers.dump;

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
import java.lang.IllegalArgumentException;
import static org.apache.commons.compress.archivers.dump.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.Object;
import java.lang.String;

public class DumpArchiveInputStream_readDirectoryEntry_482549166272 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term332158;
     Object term332678;

    public DumpArchiveInputStream_readDirectoryEntry_482549166272() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term332206 = new HashMap();
        term332158 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        byte[] term331400 = (byte[]) newByteArray(0);
        Object term332432 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        Object term332554 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        byte[] term331407 = (byte[]) newByteArray(490);
        setField(term332158, term332158.getClass(), "names", term332206);
        setField(term332158, term332158.getClass(), "blockBuffer", term331400);
        setIntField(term332432, term332432.getClass(), "readOffset", 0);
        setIntField(term332432, term332432.getClass(), "blockSize", 0);
        setField(term332432, term332432.getClass(), "in", term332554);
        setBooleanField(term332432, term332432.getClass(), "isCompressed", true);
        setIntField(term332432, term332432.getClass(), "currBlkIdx", 0);
        setField(term332432, term332432.getClass(), "blockBuffer", term331407);
        setField(term332158, term332158.getClass(), "raw", term332432);
        Class<? extends Object> term335367 = Class.forName((String) "org.apache.commons.compress.archivers.dump.DumpArchiveConstants$SEGMENT_TYPE");
        Field term335366 = ((Class) term335367).getDeclaredField((String) "ADDR");
        ((Field) term335366).setAccessible(true);
        Object enum49 = ((Field) term335366).get((Object) null);
        term332678 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry"));
        Object term332838 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader"));
        setLongField(term332678, term332678.getClass(), "size", 0L);
        setIntField(term332838, term332838.getClass(), "ino", 0);
        setField(term332838, term332838.getClass(), "type", enum49);
        setIntField(term332838, term332838.getClass(), "count", 0);
        setField(term332678, term332678.getClass(), "header", term332838);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry");
        Object[] args = new Object[1];
        args[0] = term332678;
        try {
            callMethod(klass, "readDirectoryEntry", argTypes, term332158, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


