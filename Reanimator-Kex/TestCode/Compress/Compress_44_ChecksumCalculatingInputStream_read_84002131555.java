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

public class ChecksumCalculatingInputStream_read_84002131555 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11969;
     Object term12157;

    public ChecksumCalculatingInputStream_read_84002131555() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11969 = newInstance(Class.forName("org.apache.commons.compress.utils.ChecksumCalculatingInputStream"));
        Object term12105 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        setField(term12105, term12105.getClass(), "single", null);
        setBooleanField(term12105, term12105.getClass(), "hasHitEOF", true);
        setField(term11969, term11969.getClass(), "in", term12105);
        term12157 = newInstance(Class.forName("org.apache.commons.compress.utils.ChecksumCalculatingInputStream"));
        Object term12158 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        setField(term12158, term12158.getClass(), "summary", null);
        setField(term12158, term12158.getClass(), "active", null);
        setBooleanField(term12158, term12158.getClass(), "isClosed", false);
        setBooleanField(term12158, term12158.getClass(), "hasHitEOF", true);
        setLongField(term12158, term12158.getClass(), "entrySize", 0L);
        setLongField(term12158, term12158.getClass(), "entryOffset", 0L);
        setIntField(term12158, term12158.getClass(), "readIdx", 0);
        setField(term12158, term12158.getClass(), "readBuf", null);
        setField(term12158, term12158.getClass(), "blockBuffer", null);
        setIntField(term12158, term12158.getClass(), "recordOffset", 0);
        setLongField(term12158, term12158.getClass(), "filepos", 0L);
        setField(term12158, term12158.getClass(), "raw", null);
        setField(term12158, term12158.getClass(), "names", null);
        setField(term12158, term12158.getClass(), "pending", null);
        setField(term12158, term12158.getClass(), "queue", null);
        setField(term12158, term12158.getClass(), "zipEncoding", null);
        setField(term12158, term12158.getClass(), "encoding", null);
        setField(term12158, term12158.getClass(), "single", null);
        setLongField(term12158, term12158.getClass(), "bytesRead", 0L);
        setField(term12157, term12157.getClass(), "in", term12158);
        setField(term12157, term12157.getClass(), "checksum", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.utils.ChecksumCalculatingInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "read", argTypes, term11969, args);
        assertTrue(recursiveEquals(term11969, term12157));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


