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

public class ChecksumCalculatingInputStream_read_84002131560 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12864;
     Object term13695;

    public ChecksumCalculatingInputStream_read_84002131560() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12864 = newInstance(Class.forName("org.apache.commons.compress.utils.ChecksumCalculatingInputStream"));
        Object term13000 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        setField(term13000, term13000.getClass(), "single", null);
        setBooleanField(term13000, term13000.getClass(), "hasHitEOF", false);
        setBooleanField(term13000, term13000.getClass(), "isClosed", true);
        setField(term12864, term12864.getClass(), "in", term13000);
        term13695 = newInstance(Class.forName("org.apache.commons.compress.utils.ChecksumCalculatingInputStream"));
        Object term13696 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        setField(term13696, term13696.getClass(), "summary", null);
        setField(term13696, term13696.getClass(), "active", null);
        setBooleanField(term13696, term13696.getClass(), "isClosed", true);
        setBooleanField(term13696, term13696.getClass(), "hasHitEOF", false);
        setLongField(term13696, term13696.getClass(), "entrySize", 0L);
        setLongField(term13696, term13696.getClass(), "entryOffset", 0L);
        setIntField(term13696, term13696.getClass(), "readIdx", 0);
        setField(term13696, term13696.getClass(), "readBuf", null);
        setField(term13696, term13696.getClass(), "blockBuffer", null);
        setIntField(term13696, term13696.getClass(), "recordOffset", 0);
        setLongField(term13696, term13696.getClass(), "filepos", 0L);
        setField(term13696, term13696.getClass(), "raw", null);
        setField(term13696, term13696.getClass(), "names", null);
        setField(term13696, term13696.getClass(), "pending", null);
        setField(term13696, term13696.getClass(), "queue", null);
        setField(term13696, term13696.getClass(), "zipEncoding", null);
        setField(term13696, term13696.getClass(), "encoding", null);
        setField(term13696, term13696.getClass(), "single", null);
        setLongField(term13696, term13696.getClass(), "bytesRead", 0L);
        setField(term13695, term13695.getClass(), "in", term13696);
        setField(term13695, term13695.getClass(), "checksum", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.utils.ChecksumCalculatingInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "read", argTypes, term12864, args);
        assertTrue(recursiveEquals(term12864, term13695));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


