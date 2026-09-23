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

public class DumpArchiveInputStream_readDirectoryEntry_482549166293 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term384976;
     Object term385682;

    public DumpArchiveInputStream_readDirectoryEntry_482549166293() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term385124 = new Integer(0);
        HashMap term385024 = new HashMap();
        ((HashMap) term385024).put(term385124, term385124);
        term384976 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        byte[] term383692 = (byte[]) newByteArray(9);
        Object term385298 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        Object term385434 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        Object term385558 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry"));
        byte[] term384234 = (byte[]) newByteArray(489);
        byte[] term383716 = (byte[]) newByteArray(512);
        setField(term384976, term384976.getClass(), "names", term385024);
        setByteElement(term383692, 0, (byte) -1);
        setByteElement(term383692, 1, (byte) -1);
        setField(term384976, term384976.getClass(), "blockBuffer", term383692);
        setIntField(term385298, term385298.getClass(), "readOffset", 2);
        setIntField(term385298, term385298.getClass(), "blockSize", 2);
        setBooleanField(term385434, term385434.getClass(), "hasHitEOF", false);
        setBooleanField(term385434, term385434.getClass(), "isClosed", false);
        setLongField(term385434, term385434.getClass(), "entryOffset", 144115188075855872L);
        setLongField(term385434, term385434.getClass(), "entrySize", 144115188075855874L);
        setField(term385434, term385434.getClass(), "active", term385558);
        setByteElement(term384234, 0, (byte) -1);
        setByteElement(term384234, 1, (byte) -1);
        setField(term385434, term385434.getClass(), "readBuf", term384234);
        setIntField(term385434, term385434.getClass(), "recordOffset", 487);
        setField(term385298, term385298.getClass(), "in", term385434);
        setBooleanField(term385298, term385298.getClass(), "isCompressed", false);
        setByteElement(term383716, 0, (byte) -1);
        setByteElement(term383716, 1, (byte) -1);
        setField(term385298, term385298.getClass(), "blockBuffer", term383716);
        setField(term384976, term384976.getClass(), "raw", term385298);
        term385682 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry"));
        Object term385842 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader"));
        setLongField(term385682, term385682.getClass(), "size", 0L);
        setIntField(term385842, term385842.getClass(), "ino", 0);
        setIntField(term385842, term385842.getClass(), "count", 0);
        setField(term385682, term385682.getClass(), "header", term385842);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry");
        Object[] args = new Object[1];
        args[0] = term385682;
        try {
            callMethod(klass, "readDirectoryEntry", argTypes, term384976, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


