package org.apache.commons.compress.utils;

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
import static org.apache.commons.compress.utils.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.compress.utils.EqualityUtils.*;
import java.lang.Object;

public class ChecksumCalculatingInputStream_read_84002131548 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8907;
     Object term11033;

    public ChecksumCalculatingInputStream_read_84002131548() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8907 = newInstance(Class.forName("org.apache.commons.compress.utils.ChecksumCalculatingInputStream"));
        Object term9043 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        setField(term8907, term8907.getClass(), "in", term9043);
        term11033 = newInstance(Class.forName("org.apache.commons.compress.utils.ChecksumCalculatingInputStream"));
        Object term11034 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        setField(term11034, term11034.getClass(), "summary", null);
        setField(term11034, term11034.getClass(), "active", null);
        setBooleanField(term11034, term11034.getClass(), "isClosed", false);
        setBooleanField(term11034, term11034.getClass(), "hasHitEOF", false);
        setLongField(term11034, term11034.getClass(), "entrySize", 0L);
        setLongField(term11034, term11034.getClass(), "entryOffset", 0L);
        setIntField(term11034, term11034.getClass(), "readIdx", 0);
        setField(term11034, term11034.getClass(), "readBuf", null);
        setField(term11034, term11034.getClass(), "blockBuffer", null);
        setIntField(term11034, term11034.getClass(), "recordOffset", 0);
        setLongField(term11034, term11034.getClass(), "filepos", 0L);
        setField(term11034, term11034.getClass(), "raw", null);
        setField(term11034, term11034.getClass(), "names", null);
        setField(term11034, term11034.getClass(), "pending", null);
        setField(term11034, term11034.getClass(), "queue", null);
        setField(term11034, term11034.getClass(), "zipEncoding", null);
        setField(term11034, term11034.getClass(), "encoding", null);
        setField(term11034, term11034.getClass(), "single", null);
        setLongField(term11034, term11034.getClass(), "bytesRead", 0L);
        setField(term11033, term11033.getClass(), "in", term11034);
        setField(term11033, term11033.getClass(), "checksum", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.utils.ChecksumCalculatingInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "read", argTypes, term8907, args);
        assertTrue(recursiveEquals(term8907, term11033));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


