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

public class DumpArchiveInputStream_readDirectoryEntry_482549166503 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term890408;
     Object term892288;

    public DumpArchiveInputStream_readDirectoryEntry_482549166503() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term890456 = new HashMap();
        Class<? extends Object> term898268 = Class.forName((String) "org.apache.commons.compress.archivers.dump.DumpArchiveConstants$SEGMENT_TYPE");
        Field term898267 = ((Class) term898268).getDeclaredField((String) "INODE");
        ((Field) term898267).setAccessible(true);
        Object enum142 = ((Field) term898267).get((Object) null);
        term890408 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        byte[] term889565 = (byte[]) newByteArray(0);
        Object term890630 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        Object term890766 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        term892288 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry"));
        Object term892368 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader"));
        byte[] term890090 = (byte[]) newByteArray(0);
        byte[] term889572 = (byte[]) newByteArray(513);
        setField(term890408, term890408.getClass(), "names", term890456);
        setField(term890408, term890408.getClass(), "blockBuffer", term889565);
        setIntField(term890630, term890630.getClass(), "readOffset", 512);
        setIntField(term890630, term890630.getClass(), "blockSize", 512);
        setBooleanField(term890766, term890766.getClass(), "hasHitEOF", false);
        setBooleanField(term890766, term890766.getClass(), "isClosed", false);
        setLongField(term890766, term890766.getClass(), "entryOffset", 41940965130707201L);
        setLongField(term890766, term890766.getClass(), "entrySize", 43911291047789826L);
        setLongField(term892288, term892288.getClass(), "size", 0L);
        setIntField(term892368, term892368.getClass(), "ino", 0);
        setField(term892368, term892368.getClass(), "type", enum142);
        setIntField(term892368, term892368.getClass(), "count", 0);
        setField(term892288, term892288.getClass(), "header", term892368);
        setField(term890766, term890766.getClass(), "active", term892288);
        setField(term890766, term890766.getClass(), "readBuf", term890090);
        setIntField(term890766, term890766.getClass(), "recordOffset", 502753277);
        setIntField(term890766, term890766.getClass(), "readIdx", 512);
        setField(term890630, term890630.getClass(), "in", term890766);
        setBooleanField(term890630, term890630.getClass(), "isCompressed", true);
        setIntField(term890630, term890630.getClass(), "currBlkIdx", -1);
        setField(term890630, term890630.getClass(), "blockBuffer", term889572);
        setField(term890408, term890408.getClass(), "raw", term890630);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry");
        Object[] args = new Object[1];
        args[0] = term892288;
        try {
            callMethod(klass, "readDirectoryEntry", argTypes, term890408, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


