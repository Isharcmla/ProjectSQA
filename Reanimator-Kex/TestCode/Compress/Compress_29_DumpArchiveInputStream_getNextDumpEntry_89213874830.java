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

public class DumpArchiveInputStream_getNextDumpEntry_89213874830 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11136;

    public DumpArchiveInputStream_getNextDumpEntry_89213874830() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11136 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        setField(term11136, term11136.getClass(), "summary", null);
        setField(term11136, term11136.getClass(), "active", null);
        setBooleanField(term11136, term11136.getClass(), "isClosed", false);
        setBooleanField(term11136, term11136.getClass(), "hasHitEOF", false);
        setLongField(term11136, term11136.getClass(), "entrySize", 0L);
        setLongField(term11136, term11136.getClass(), "entryOffset", 0L);
        setIntField(term11136, term11136.getClass(), "readIdx", 0);
        setField(term11136, term11136.getClass(), "readBuf", null);
        setField(term11136, term11136.getClass(), "blockBuffer", null);
        setIntField(term11136, term11136.getClass(), "recordOffset", 0);
        setLongField(term11136, term11136.getClass(), "filepos", 0L);
        setField(term11136, term11136.getClass(), "raw", null);
        setField(term11136, term11136.getClass(), "names", null);
        setField(term11136, term11136.getClass(), "pending", null);
        setField(term11136, term11136.getClass(), "queue", null);
        setField(term11136, term11136.getClass(), "zipEncoding", null);
        setField(term11136, term11136.getClass(), "SINGLE", null);
        setLongField(term11136, term11136.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getNextDumpEntry", argTypes, term11136, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


