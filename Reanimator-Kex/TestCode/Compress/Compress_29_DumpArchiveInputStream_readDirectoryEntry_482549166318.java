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

public class DumpArchiveInputStream_readDirectoryEntry_482549166318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term453577;
     Object term454283;

    public DumpArchiveInputStream_readDirectoryEntry_482549166318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term453725 = new Integer(0);
        HashMap term453625 = new HashMap();
        ((HashMap) term453625).put(term453725, term453725);
        ((HashMap) term453625).put(term453725, term453725);
        ((HashMap) term453625).put(term453725, term453725);
        ((HashMap) term453625).put(term453725, term453725);
        ((HashMap) term453625).put(term453725, term453725);
        ((HashMap) term453625).put(term453725, term453725);
        ((HashMap) term453625).put(term453725, term453725);
        ((HashMap) term453625).put(term453725, term453725);
        ((HashMap) term453625).put(term453725, term453725);
        term453577 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        byte[] term453023 = (byte[]) newByteArray(2);
        Object term453899 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        Object term454035 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        Object term454159 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry"));
        byte[] term453298 = (byte[]) newByteArray(0);
        byte[] term453034 = (byte[]) newByteArray(258);
        setField(term453577, term453577.getClass(), "names", term453625);
        setByteElement(term453023, 0, (byte) -1);
        setByteElement(term453023, 1, (byte) -1);
        setField(term453577, term453577.getClass(), "blockBuffer", term453023);
        setIntField(term453899, term453899.getClass(), "readOffset", 0);
        setIntField(term453899, term453899.getClass(), "blockSize", 0);
        setBooleanField(term454035, term454035.getClass(), "hasHitEOF", false);
        setBooleanField(term454035, term454035.getClass(), "isClosed", false);
        setLongField(term454035, term454035.getClass(), "entryOffset", 1008806316530991100L);
        setLongField(term454035, term454035.getClass(), "entrySize", 1008806316530991101L);
        setField(term454035, term454035.getClass(), "active", term454159);
        setField(term454035, term454035.getClass(), "readBuf", term453298);
        setIntField(term454035, term454035.getClass(), "recordOffset", -2147483648);
        setField(term453899, term453899.getClass(), "in", term454035);
        setBooleanField(term453899, term453899.getClass(), "isCompressed", true);
        setIntField(term453899, term453899.getClass(), "currBlkIdx", 0);
        setByteElement(term453034, 0, (byte) -1);
        setByteElement(term453034, 1, (byte) -1);
        setByteElement(term453034, 2, (byte) -1);
        setByteElement(term453034, 3, (byte) -1);
        setByteElement(term453034, 4, (byte) -1);
        setByteElement(term453034, 5, (byte) -1);
        setByteElement(term453034, 6, (byte) -1);
        setByteElement(term453034, 7, (byte) -1);
        setByteElement(term453034, 8, (byte) -1);
        setByteElement(term453034, 9, (byte) -1);
        setField(term453899, term453899.getClass(), "blockBuffer", term453034);
        setField(term453577, term453577.getClass(), "raw", term453899);
        term454283 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry"));
        Object term454443 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader"));
        setLongField(term454283, term454283.getClass(), "size", 0L);
        setIntField(term454443, term454443.getClass(), "ino", 0);
        setIntField(term454443, term454443.getClass(), "count", 0);
        setField(term454283, term454283.getClass(), "header", term454443);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry");
        Object[] args = new Object[1];
        args[0] = term454283;
        try {
            callMethod(klass, "readDirectoryEntry", argTypes, term453577, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


