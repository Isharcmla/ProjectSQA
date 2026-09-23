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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.apache.commons.compress.archivers.dump.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.Object;
import java.lang.String;

public class DumpArchiveInputStream_readDirectoryEntry_482549166448 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term760351;
     Object term761009;

    public DumpArchiveInputStream_readDirectoryEntry_482549166448() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term760399 = new HashMap();
        term760351 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        byte[] term759970 = (byte[]) newByteArray(0);
        Object term760625 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        Object term760761 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        Object term760885 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry"));
        byte[] term760047 = (byte[]) newByteArray(0);
        byte[] term759977 = (byte[]) newByteArray(64);
        setField(term760351, term760351.getClass(), "names", term760399);
        setField(term760351, term760351.getClass(), "blockBuffer", term759970);
        setIntField(term760625, term760625.getClass(), "readOffset", 5);
        setIntField(term760625, term760625.getClass(), "blockSize", 5);
        setBooleanField(term760761, term760761.getClass(), "hasHitEOF", false);
        setBooleanField(term760761, term760761.getClass(), "isClosed", false);
        setLongField(term760761, term760761.getClass(), "entryOffset", 4503599627370491L);
        setLongField(term760761, term760761.getClass(), "entrySize", 4503599627370494L);
        setField(term760761, term760761.getClass(), "active", term760885);
        setField(term760761, term760761.getClass(), "readBuf", term760047);
        setIntField(term760761, term760761.getClass(), "recordOffset", -3);
        setField(term760625, term760625.getClass(), "in", term760761);
        setBooleanField(term760625, term760625.getClass(), "isCompressed", true);
        setIntField(term760625, term760625.getClass(), "currBlkIdx", -1);
        setByteElement(term759977, 0, (byte) -2);
        setByteElement(term759977, 1, (byte) -2);
        setByteElement(term759977, 2, (byte) -2);
        setByteElement(term759977, 3, (byte) -2);
        setByteElement(term759977, 4, (byte) -2);
        setByteElement(term759977, 5, (byte) -2);
        setByteElement(term759977, 6, (byte) -2);
        setByteElement(term759977, 7, (byte) -2);
        setByteElement(term759977, 8, (byte) -2);
        setByteElement(term759977, 9, (byte) -2);
        setByteElement(term759977, 10, (byte) -2);
        setByteElement(term759977, 11, (byte) -2);
        setByteElement(term759977, 12, (byte) -2);
        setByteElement(term759977, 13, (byte) -2);
        setByteElement(term759977, 14, (byte) -2);
        setByteElement(term759977, 15, (byte) -2);
        setByteElement(term759977, 16, (byte) -2);
        setByteElement(term759977, 17, (byte) -2);
        setByteElement(term759977, 18, (byte) -2);
        setByteElement(term759977, 19, (byte) -2);
        setByteElement(term759977, 20, (byte) -2);
        setByteElement(term759977, 21, (byte) -2);
        setByteElement(term759977, 22, (byte) -2);
        setByteElement(term759977, 23, (byte) -2);
        setByteElement(term759977, 24, (byte) -2);
        setByteElement(term759977, 25, (byte) -2);
        setByteElement(term759977, 26, (byte) -2);
        setByteElement(term759977, 27, (byte) -2);
        setByteElement(term759977, 28, (byte) -2);
        setByteElement(term759977, 29, (byte) -2);
        setByteElement(term759977, 30, (byte) -2);
        setByteElement(term759977, 31, (byte) -2);
        setByteElement(term759977, 32, (byte) -2);
        setByteElement(term759977, 33, (byte) -2);
        setByteElement(term759977, 34, (byte) -2);
        setByteElement(term759977, 35, (byte) -2);
        setByteElement(term759977, 36, (byte) -2);
        setByteElement(term759977, 37, (byte) -2);
        setByteElement(term759977, 38, (byte) -2);
        setByteElement(term759977, 39, (byte) -2);
        setByteElement(term759977, 40, (byte) -2);
        setByteElement(term759977, 41, (byte) -2);
        setByteElement(term759977, 42, (byte) -2);
        setByteElement(term759977, 43, (byte) -2);
        setByteElement(term759977, 44, (byte) -2);
        setByteElement(term759977, 45, (byte) -2);
        setByteElement(term759977, 46, (byte) -2);
        setByteElement(term759977, 47, (byte) -2);
        setByteElement(term759977, 48, (byte) -2);
        setByteElement(term759977, 49, (byte) -2);
        setByteElement(term759977, 50, (byte) -2);
        setByteElement(term759977, 51, (byte) -2);
        setByteElement(term759977, 52, (byte) -2);
        setByteElement(term759977, 53, (byte) -2);
        setByteElement(term759977, 54, (byte) -2);
        setByteElement(term759977, 55, (byte) -2);
        setByteElement(term759977, 56, (byte) -2);
        setByteElement(term759977, 57, (byte) -2);
        setByteElement(term759977, 58, (byte) -2);
        setByteElement(term759977, 59, (byte) -2);
        setByteElement(term759977, 60, (byte) -2);
        setByteElement(term759977, 61, (byte) -2);
        setByteElement(term759977, 62, (byte) -2);
        setByteElement(term759977, 63, (byte) -2);
        setField(term760625, term760625.getClass(), "blockBuffer", term759977);
        setField(term760351, term760351.getClass(), "raw", term760625);
        Class<? extends Object> term762453 = Class.forName((String) "org.apache.commons.compress.archivers.dump.DumpArchiveConstants$SEGMENT_TYPE");
        Field term762452 = ((Class) term762453).getDeclaredField((String) "BITS");
        ((Field) term762452).setAccessible(true);
        Object enum112 = ((Field) term762452).get((Object) null);
        term761009 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry"));
        Object term761169 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader"));
        setLongField(term761009, term761009.getClass(), "size", 0L);
        setIntField(term761169, term761169.getClass(), "ino", 0);
        setField(term761169, term761169.getClass(), "type", enum112);
        setIntField(term761169, term761169.getClass(), "count", 0);
        setField(term761009, term761009.getClass(), "header", term761169);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry");
        Object[] args = new Object[1];
        args[0] = term761009;
        try {
            callMethod(klass, "readDirectoryEntry", argTypes, term760351, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


