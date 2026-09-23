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

public class DumpArchiveInputStream_readDirectoryEntry_482549166351 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term539372;
     Object term540078;

    public DumpArchiveInputStream_readDirectoryEntry_482549166351() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term539520 = new Integer(0);
        HashMap term539420 = new HashMap();
        ((HashMap) term539420).put(term539520, term539520);
        ((HashMap) term539420).put(term539520, term539520);
        ((HashMap) term539420).put(term539520, term539520);
        ((HashMap) term539420).put(term539520, term539520);
        ((HashMap) term539420).put(term539520, term539520);
        ((HashMap) term539420).put(term539520, term539520);
        ((HashMap) term539420).put(term539520, term539520);
        ((HashMap) term539420).put(term539520, term539520);
        ((HashMap) term539420).put(term539520, term539520);
        ((HashMap) term539420).put(term539520, term539520);
        ((HashMap) term539420).put(term539520, term539520);
        ((HashMap) term539420).put(term539520, term539520);
        ((HashMap) term539420).put(term539520, term539520);
        ((HashMap) term539420).put(term539520, term539520);
        ((HashMap) term539420).put(term539520, term539520);
        ((HashMap) term539420).put(term539520, term539520);
        ((HashMap) term539420).put(term539520, term539520);
        ((HashMap) term539420).put(term539520, term539520);
        ((HashMap) term539420).put(term539520, term539520);
        ((HashMap) term539420).put(term539520, term539520);
        ((HashMap) term539420).put(term539520, term539520);
        ((HashMap) term539420).put(term539520, term539520);
        ((HashMap) term539420).put(term539520, term539520);
        ((HashMap) term539420).put(term539520, term539520);
        ((HashMap) term539420).put(term539520, term539520);
        ((HashMap) term539420).put(term539520, term539520);
        ((HashMap) term539420).put(term539520, term539520);
        ((HashMap) term539420).put(term539520, term539520);
        ((HashMap) term539420).put(term539520, term539520);
        ((HashMap) term539420).put(term539520, term539520);
        ((HashMap) term539420).put(term539520, term539520);
        ((HashMap) term539420).put(term539520, term539520);
        ((HashMap) term539420).put(term539520, term539520);
        ((HashMap) term539420).put(term539520, term539520);
        ((HashMap) term539420).put(term539520, term539520);
        ((HashMap) term539420).put(term539520, term539520);
        ((HashMap) term539420).put(term539520, term539520);
        ((HashMap) term539420).put(term539520, term539520);
        ((HashMap) term539420).put(term539520, term539520);
        ((HashMap) term539420).put(term539520, term539520);
        ((HashMap) term539420).put(term539520, term539520);
        ((HashMap) term539420).put(term539520, term539520);
        ((HashMap) term539420).put(term539520, term539520);
        ((HashMap) term539420).put(term539520, term539520);
        ((HashMap) term539420).put(term539520, term539520);
        ((HashMap) term539420).put(term539520, term539520);
        ((HashMap) term539420).put(term539520, term539520);
        ((HashMap) term539420).put(term539520, term539520);
        ((HashMap) term539420).put(term539520, term539520);
        term539372 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        byte[] term536159 = (byte[]) newByteArray(12);
        Object term539694 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        Object term539830 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        Object term539954 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry"));
        byte[] term536836 = (byte[]) newByteArray(562);
        byte[] term536190 = (byte[]) newByteArray(640);
        setField(term539372, term539372.getClass(), "names", term539420);
        setByteElement(term536159, 0, (byte) -1);
        setByteElement(term536159, 1, (byte) -1);
        setByteElement(term536159, 2, (byte) -1);
        setByteElement(term536159, 3, (byte) -1);
        setByteElement(term536159, 4, (byte) -1);
        setByteElement(term536159, 5, (byte) -1);
        setByteElement(term536159, 6, (byte) -1);
        setByteElement(term536159, 7, (byte) -1);
        setByteElement(term536159, 8, (byte) -1);
        setByteElement(term536159, 9, (byte) -1);
        setByteElement(term536159, 10, (byte) -1);
        setByteElement(term536159, 11, (byte) -1);
        setField(term539372, term539372.getClass(), "blockBuffer", term536159);
        setIntField(term539694, term539694.getClass(), "readOffset", 578);
        setIntField(term539694, term539694.getClass(), "blockSize", 578);
        setBooleanField(term539830, term539830.getClass(), "hasHitEOF", false);
        setBooleanField(term539830, term539830.getClass(), "isClosed", false);
        setLongField(term539830, term539830.getClass(), "entryOffset", 3481840507313716962L);
        setLongField(term539830, term539830.getClass(), "entrySize", 3481840507313717174L);
        setField(term539830, term539830.getClass(), "active", term539954);
        setByteElement(term536836, 0, (byte) -1);
        setByteElement(term536836, 1, (byte) -1);
        setByteElement(term536836, 2, (byte) -1);
        setByteElement(term536836, 3, (byte) -1);
        setByteElement(term536836, 4, (byte) -1);
        setByteElement(term536836, 5, (byte) -1);
        setByteElement(term536836, 6, (byte) -1);
        setByteElement(term536836, 7, (byte) -1);
        setByteElement(term536836, 8, (byte) -1);
        setByteElement(term536836, 9, (byte) -1);
        setByteElement(term536836, 10, (byte) -1);
        setByteElement(term536836, 11, (byte) -1);
        setByteElement(term536836, 12, (byte) -1);
        setByteElement(term536836, 13, (byte) -1);
        setByteElement(term536836, 14, (byte) -1);
        setByteElement(term536836, 15, (byte) -1);
        setByteElement(term536836, 16, (byte) -1);
        setByteElement(term536836, 17, (byte) -1);
        setByteElement(term536836, 18, (byte) -1);
        setByteElement(term536836, 19, (byte) -1);
        setByteElement(term536836, 20, (byte) -1);
        setByteElement(term536836, 21, (byte) -1);
        setByteElement(term536836, 22, (byte) -1);
        setByteElement(term536836, 23, (byte) -1);
        setByteElement(term536836, 24, (byte) -1);
        setByteElement(term536836, 25, (byte) -1);
        setByteElement(term536836, 26, (byte) -1);
        setByteElement(term536836, 27, (byte) -1);
        setByteElement(term536836, 28, (byte) -1);
        setByteElement(term536836, 29, (byte) -1);
        setByteElement(term536836, 30, (byte) -1);
        setByteElement(term536836, 31, (byte) -1);
        setByteElement(term536836, 32, (byte) -1);
        setByteElement(term536836, 33, (byte) -1);
        setByteElement(term536836, 34, (byte) -1);
        setByteElement(term536836, 35, (byte) -1);
        setByteElement(term536836, 36, (byte) -1);
        setByteElement(term536836, 37, (byte) -1);
        setByteElement(term536836, 38, (byte) -1);
        setByteElement(term536836, 39, (byte) -1);
        setByteElement(term536836, 40, (byte) -1);
        setByteElement(term536836, 41, (byte) -1);
        setByteElement(term536836, 42, (byte) -1);
        setByteElement(term536836, 43, (byte) -1);
        setByteElement(term536836, 44, (byte) -1);
        setByteElement(term536836, 45, (byte) -1);
        setByteElement(term536836, 46, (byte) -1);
        setByteElement(term536836, 47, (byte) -1);
        setByteElement(term536836, 48, (byte) -1);
        setByteElement(term536836, 49, (byte) -1);
        setField(term539830, term539830.getClass(), "readBuf", term536836);
        setIntField(term539830, term539830.getClass(), "recordOffset", 746587225);
        setIntField(term539830, term539830.getClass(), "readIdx", 512);
        setField(term539694, term539694.getClass(), "in", term539830);
        setBooleanField(term539694, term539694.getClass(), "isCompressed", true);
        setIntField(term539694, term539694.getClass(), "currBlkIdx", -1);
        setByteElement(term536190, 0, (byte) -1);
        setByteElement(term536190, 1, (byte) -1);
        setByteElement(term536190, 2, (byte) -1);
        setByteElement(term536190, 3, (byte) -1);
        setByteElement(term536190, 4, (byte) -1);
        setByteElement(term536190, 5, (byte) -1);
        setByteElement(term536190, 6, (byte) -1);
        setByteElement(term536190, 7, (byte) -1);
        setByteElement(term536190, 8, (byte) -1);
        setByteElement(term536190, 9, (byte) -1);
        setByteElement(term536190, 10, (byte) -1);
        setByteElement(term536190, 11, (byte) -1);
        setByteElement(term536190, 12, (byte) -1);
        setByteElement(term536190, 13, (byte) -1);
        setByteElement(term536190, 14, (byte) -1);
        setByteElement(term536190, 15, (byte) -1);
        setByteElement(term536190, 16, (byte) -1);
        setByteElement(term536190, 17, (byte) -1);
        setByteElement(term536190, 18, (byte) -1);
        setByteElement(term536190, 19, (byte) -1);
        setByteElement(term536190, 20, (byte) -1);
        setByteElement(term536190, 21, (byte) -1);
        setByteElement(term536190, 22, (byte) -1);
        setByteElement(term536190, 23, (byte) -1);
        setByteElement(term536190, 24, (byte) -1);
        setByteElement(term536190, 25, (byte) -1);
        setByteElement(term536190, 26, (byte) -1);
        setByteElement(term536190, 27, (byte) -1);
        setByteElement(term536190, 28, (byte) -1);
        setByteElement(term536190, 29, (byte) -1);
        setByteElement(term536190, 30, (byte) -1);
        setByteElement(term536190, 31, (byte) -1);
        setByteElement(term536190, 32, (byte) -1);
        setByteElement(term536190, 33, (byte) -1);
        setByteElement(term536190, 34, (byte) -1);
        setByteElement(term536190, 35, (byte) -1);
        setByteElement(term536190, 36, (byte) -1);
        setByteElement(term536190, 37, (byte) -1);
        setByteElement(term536190, 38, (byte) -1);
        setByteElement(term536190, 39, (byte) -1);
        setByteElement(term536190, 40, (byte) -1);
        setByteElement(term536190, 41, (byte) -1);
        setByteElement(term536190, 42, (byte) -1);
        setByteElement(term536190, 43, (byte) -1);
        setByteElement(term536190, 44, (byte) -1);
        setByteElement(term536190, 45, (byte) -1);
        setByteElement(term536190, 46, (byte) -1);
        setByteElement(term536190, 47, (byte) -1);
        setByteElement(term536190, 48, (byte) -1);
        setByteElement(term536190, 49, (byte) -1);
        setField(term539694, term539694.getClass(), "blockBuffer", term536190);
        setField(term539372, term539372.getClass(), "raw", term539694);
        term540078 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry"));
        Object term540238 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader"));
        setLongField(term540078, term540078.getClass(), "size", 0L);
        setIntField(term540238, term540238.getClass(), "ino", 0);
        setIntField(term540238, term540238.getClass(), "count", 0);
        setField(term540078, term540078.getClass(), "header", term540238);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry");
        Object[] args = new Object[1];
        args[0] = term540078;
        try {
            callMethod(klass, "readDirectoryEntry", argTypes, term539372, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


