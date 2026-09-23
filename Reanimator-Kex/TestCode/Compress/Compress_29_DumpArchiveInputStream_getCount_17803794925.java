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

public class DumpArchiveInputStream_getCount_17803794925 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1949;

    public DumpArchiveInputStream_getCount_17803794925() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1949 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        setField(term1949, term1949.getClass(), "summary", null);
        setField(term1949, term1949.getClass(), "active", null);
        setBooleanField(term1949, term1949.getClass(), "isClosed", false);
        setBooleanField(term1949, term1949.getClass(), "hasHitEOF", false);
        setLongField(term1949, term1949.getClass(), "entrySize", 0L);
        setLongField(term1949, term1949.getClass(), "entryOffset", 0L);
        setIntField(term1949, term1949.getClass(), "readIdx", 0);
        setField(term1949, term1949.getClass(), "readBuf", null);
        setField(term1949, term1949.getClass(), "blockBuffer", null);
        setIntField(term1949, term1949.getClass(), "recordOffset", 0);
        setLongField(term1949, term1949.getClass(), "filepos", 0L);
        setField(term1949, term1949.getClass(), "raw", null);
        setField(term1949, term1949.getClass(), "names", null);
        setField(term1949, term1949.getClass(), "pending", null);
        setField(term1949, term1949.getClass(), "queue", null);
        setField(term1949, term1949.getClass(), "zipEncoding", null);
        setField(term1949, term1949.getClass(), "SINGLE", null);
        setLongField(term1949, term1949.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getCount", argTypes, term1949, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


