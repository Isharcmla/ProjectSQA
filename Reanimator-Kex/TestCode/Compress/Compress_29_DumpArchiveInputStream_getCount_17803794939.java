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
import static org.apache.commons.compress.archivers.dump.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.compress.archivers.dump.EqualityUtils.*;
import java.lang.Object;

public class DumpArchiveInputStream_getCount_17803794939 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37314;
     Object term37746;

    public DumpArchiveInputStream_getCount_17803794939() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37314 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        Object term37436 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        setField(term37314, term37314.getClass(), "raw", term37436);
        term37746 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        Object term37747 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        setField(term37746, term37746.getClass(), "summary", null);
        setField(term37746, term37746.getClass(), "active", null);
        setBooleanField(term37746, term37746.getClass(), "isClosed", false);
        setBooleanField(term37746, term37746.getClass(), "hasHitEOF", false);
        setLongField(term37746, term37746.getClass(), "entrySize", 0L);
        setLongField(term37746, term37746.getClass(), "entryOffset", 0L);
        setIntField(term37746, term37746.getClass(), "readIdx", 0);
        setField(term37746, term37746.getClass(), "readBuf", null);
        setField(term37746, term37746.getClass(), "blockBuffer", null);
        setIntField(term37746, term37746.getClass(), "recordOffset", 0);
        setLongField(term37746, term37746.getClass(), "filepos", 0L);
        setField(term37747, term37747.getClass(), "blockBuffer", null);
        setIntField(term37747, term37747.getClass(), "currBlkIdx", 0);
        setIntField(term37747, term37747.getClass(), "blockSize", 0);
        setIntField(term37747, term37747.getClass(), "readOffset", 0);
        setBooleanField(term37747, term37747.getClass(), "isCompressed", false);
        setLongField(term37747, term37747.getClass(), "bytesRead", 0L);
        setField(term37747, term37747.getClass(), "in", null);
        setField(term37746, term37746.getClass(), "raw", term37747);
        setField(term37746, term37746.getClass(), "names", null);
        setField(term37746, term37746.getClass(), "pending", null);
        setField(term37746, term37746.getClass(), "queue", null);
        setField(term37746, term37746.getClass(), "zipEncoding", null);
        setField(term37746, term37746.getClass(), "SINGLE", null);
        setLongField(term37746, term37746.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getCount", argTypes, term37314, args);
        assertTrue(recursiveEquals(term37314, term37746));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


