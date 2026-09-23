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
import java.lang.NullPointerException;
import static org.apache.commons.compress.archivers.dump.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.Integer;
import java.lang.Object;

public class DumpArchiveInputStream_readDirectoryEntry_482549166492 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term859215;
     Object term860081;

    public DumpArchiveInputStream_readDirectoryEntry_482549166492() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term859363 = new Integer(0);
        HashMap term859263 = new HashMap();
        ((HashMap) term859263).put(term859363, term859363);
        ((HashMap) term859263).put(term859363, term859363);
        ((HashMap) term859263).put(term859363, term859363);
        ((HashMap) term859263).put(term859363, term859363);
        ((HashMap) term859263).put(term859363, term859363);
        ((HashMap) term859263).put(term859363, term859363);
        ((HashMap) term859263).put(term859363, term859363);
        ((HashMap) term859263).put(term859363, term859363);
        ((HashMap) term859263).put(term859363, term859363);
        ((HashMap) term859263).put(term859363, term859363);
        ((HashMap) term859263).put(term859363, term859363);
        ((HashMap) term859263).put(term859363, term859363);
        ((HashMap) term859263).put(term859363, term859363);
        ((HashMap) term859263).put(term859363, term859363);
        ((HashMap) term859263).put(term859363, term859363);
        ((HashMap) term859263).put(term859363, term859363);
        term859215 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        byte[] term857947 = (byte[]) newByteArray(0);
        Object term859537 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        Object term859673 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        Object term859797 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry"));
        Object term860161 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader"));
        byte[] term858482 = (byte[]) newByteArray(110);
        byte[] term857954 = (byte[]) newByteArray(522);
        setField(term859215, term859215.getClass(), "names", term859263);
        setField(term859215, term859215.getClass(), "blockBuffer", term857947);
        setIntField(term859537, term859537.getClass(), "readOffset", 513);
        setIntField(term859537, term859537.getClass(), "blockSize", 513);
        setBooleanField(term859673, term859673.getClass(), "hasHitEOF", false);
        setBooleanField(term859673, term859673.getClass(), "isClosed", false);
        setLongField(term859673, term859673.getClass(), "entryOffset", -6L);
        setLongField(term859673, term859673.getClass(), "entrySize", 151L);
        setIntField(term860161, term860161.getClass(), "ino", 0);
        setIntField(term860161, term860161.getClass(), "count", 0);
        setField(term859797, term859797.getClass(), "header", term860161);
        setField(term859673, term859673.getClass(), "active", term859797);
        setByteElement(term858482, 0, (byte) -1);
        setByteElement(term858482, 1, (byte) -1);
        setByteElement(term858482, 2, (byte) -1);
        setByteElement(term858482, 3, (byte) -1);
        setByteElement(term858482, 4, (byte) -1);
        setByteElement(term858482, 5, (byte) -1);
        setByteElement(term858482, 6, (byte) -1);
        setByteElement(term858482, 7, (byte) -1);
        setByteElement(term858482, 8, (byte) -1);
        setByteElement(term858482, 9, (byte) -1);
        setByteElement(term858482, 10, (byte) -1);
        setByteElement(term858482, 11, (byte) -1);
        setByteElement(term858482, 12, (byte) -1);
        setByteElement(term858482, 13, (byte) -1);
        setByteElement(term858482, 14, (byte) -1);
        setByteElement(term858482, 15, (byte) -1);
        setByteElement(term858482, 16, (byte) -1);
        setField(term859673, term859673.getClass(), "readBuf", term858482);
        setIntField(term859673, term859673.getClass(), "recordOffset", 0);
        setIntField(term859673, term859673.getClass(), "readIdx", 511);
        setField(term859537, term859537.getClass(), "in", term859673);
        setBooleanField(term859537, term859537.getClass(), "isCompressed", true);
        setIntField(term859537, term859537.getClass(), "currBlkIdx", -1);
        setByteElement(term857954, 0, (byte) -1);
        setByteElement(term857954, 1, (byte) -1);
        setByteElement(term857954, 2, (byte) -1);
        setByteElement(term857954, 3, (byte) -1);
        setByteElement(term857954, 4, (byte) -1);
        setByteElement(term857954, 5, (byte) -1);
        setByteElement(term857954, 6, (byte) -1);
        setByteElement(term857954, 7, (byte) -1);
        setByteElement(term857954, 8, (byte) -1);
        setByteElement(term857954, 9, (byte) -1);
        setByteElement(term857954, 10, (byte) -1);
        setByteElement(term857954, 11, (byte) -1);
        setByteElement(term857954, 12, (byte) -1);
        setByteElement(term857954, 13, (byte) -1);
        setByteElement(term857954, 14, (byte) -1);
        setByteElement(term857954, 15, (byte) -1);
        setByteElement(term857954, 16, (byte) -1);
        setField(term859537, term859537.getClass(), "blockBuffer", term857954);
        setField(term859215, term859215.getClass(), "raw", term859537);
        term860081 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry"));
        setLongField(term860081, term860081.getClass(), "size", 0L);
        setField(term860081, term860081.getClass(), "header", term860161);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry");
        Object[] args = new Object[1];
        args[0] = term860081;
        try {
            callMethod(klass, "readDirectoryEntry", argTypes, term859215, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


