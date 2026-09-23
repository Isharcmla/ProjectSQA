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
import java.lang.Integer;
import java.lang.Object;

public class DumpArchiveInputStream_readDirectoryEntry_482549166476 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term821685;
     Object term822635;

    public DumpArchiveInputStream_readDirectoryEntry_482549166476() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term821833 = new Integer(0);
        HashMap term821733 = new HashMap();
        ((HashMap) term821733).put(term821833, term821833);
        term821685 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        byte[] term820144 = (byte[]) newByteArray(492);
        Object term822007 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        Object term822153 = newInstance(Class.forName("org.apache.commons.compress.compressors.lzma.LZMACompressorInputStream"));
        Object term822289 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        term822635 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry"));
        Object term822715 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader"));
        byte[] term821398 = (byte[]) newByteArray(0);
        byte[] term821135 = (byte[]) newByteArray(257);
        setField(term821685, term821685.getClass(), "names", term821733);
        setByteElement(term820144, 0, (byte) -1);
        setByteElement(term820144, 1, (byte) -1);
        setField(term821685, term821685.getClass(), "blockBuffer", term820144);
        setIntField(term822007, term822007.getClass(), "readOffset", 0);
        setIntField(term822007, term822007.getClass(), "blockSize", 0);
        setBooleanField(term822289, term822289.getClass(), "hasHitEOF", false);
        setBooleanField(term822289, term822289.getClass(), "isClosed", false);
        setLongField(term822289, term822289.getClass(), "entryOffset", 6917529027641081852L);
        setLongField(term822289, term822289.getClass(), "entrySize", 6917529027641081853L);
        setLongField(term822635, term822635.getClass(), "size", 0L);
        setIntField(term822715, term822715.getClass(), "ino", 0);
        setIntField(term822715, term822715.getClass(), "count", 0);
        setField(term822635, term822635.getClass(), "header", term822715);
        setField(term822289, term822289.getClass(), "active", term822635);
        setField(term822289, term822289.getClass(), "readBuf", term821398);
        setIntField(term822289, term822289.getClass(), "recordOffset", 2046869504);
        setIntField(term822289, term822289.getClass(), "readIdx", 512);
        setField(term822153, term822153.getClass(), "in", term822289);
        setField(term822007, term822007.getClass(), "in", term822153);
        setBooleanField(term822007, term822007.getClass(), "isCompressed", true);
        setIntField(term822007, term822007.getClass(), "currBlkIdx", 0);
        setByteElement(term821135, 0, (byte) -1);
        setByteElement(term821135, 1, (byte) -1);
        setField(term822007, term822007.getClass(), "blockBuffer", term821135);
        setField(term821685, term821685.getClass(), "raw", term822007);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry");
        Object[] args = new Object[1];
        args[0] = term822635;
        try {
            callMethod(klass, "readDirectoryEntry", argTypes, term821685, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


