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

public class DumpArchiveInputStream_getPath_139365558733 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19000;

    public DumpArchiveInputStream_getPath_139365558733() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19000 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        setField(term19000, term19000.getClass(), "summary", null);
        setField(term19000, term19000.getClass(), "active", null);
        setBooleanField(term19000, term19000.getClass(), "isClosed", false);
        setBooleanField(term19000, term19000.getClass(), "hasHitEOF", false);
        setLongField(term19000, term19000.getClass(), "entrySize", 0L);
        setLongField(term19000, term19000.getClass(), "entryOffset", 0L);
        setIntField(term19000, term19000.getClass(), "readIdx", 0);
        setField(term19000, term19000.getClass(), "readBuf", null);
        setField(term19000, term19000.getClass(), "blockBuffer", null);
        setIntField(term19000, term19000.getClass(), "recordOffset", 0);
        setLongField(term19000, term19000.getClass(), "filepos", 0L);
        setField(term19000, term19000.getClass(), "raw", null);
        setField(term19000, term19000.getClass(), "names", null);
        setField(term19000, term19000.getClass(), "pending", null);
        setField(term19000, term19000.getClass(), "queue", null);
        setField(term19000, term19000.getClass(), "zipEncoding", null);
        setField(term19000, term19000.getClass(), "SINGLE", null);
        setLongField(term19000, term19000.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "getPath", argTypes, term19000, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


