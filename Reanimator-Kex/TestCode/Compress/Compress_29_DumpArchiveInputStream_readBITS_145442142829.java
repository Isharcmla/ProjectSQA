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

public class DumpArchiveInputStream_readBITS_145442142829 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9278;

    public DumpArchiveInputStream_readBITS_145442142829() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9278 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        setField(term9278, term9278.getClass(), "summary", null);
        setField(term9278, term9278.getClass(), "active", null);
        setBooleanField(term9278, term9278.getClass(), "isClosed", false);
        setBooleanField(term9278, term9278.getClass(), "hasHitEOF", false);
        setLongField(term9278, term9278.getClass(), "entrySize", 0L);
        setLongField(term9278, term9278.getClass(), "entryOffset", 0L);
        setIntField(term9278, term9278.getClass(), "readIdx", 0);
        setField(term9278, term9278.getClass(), "readBuf", null);
        setField(term9278, term9278.getClass(), "blockBuffer", null);
        setIntField(term9278, term9278.getClass(), "recordOffset", 0);
        setLongField(term9278, term9278.getClass(), "filepos", 0L);
        setField(term9278, term9278.getClass(), "raw", null);
        setField(term9278, term9278.getClass(), "names", null);
        setField(term9278, term9278.getClass(), "pending", null);
        setField(term9278, term9278.getClass(), "queue", null);
        setField(term9278, term9278.getClass(), "zipEncoding", null);
        setField(term9278, term9278.getClass(), "SINGLE", null);
        setLongField(term9278, term9278.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "readBITS", argTypes, term9278, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


