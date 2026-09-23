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

public class DumpArchiveInputStream_getNextEntry_133083675231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12995;

    public DumpArchiveInputStream_getNextEntry_133083675231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12995 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        setField(term12995, term12995.getClass(), "summary", null);
        setField(term12995, term12995.getClass(), "active", null);
        setBooleanField(term12995, term12995.getClass(), "isClosed", false);
        setBooleanField(term12995, term12995.getClass(), "hasHitEOF", false);
        setLongField(term12995, term12995.getClass(), "entrySize", 0L);
        setLongField(term12995, term12995.getClass(), "entryOffset", 0L);
        setIntField(term12995, term12995.getClass(), "readIdx", 0);
        setField(term12995, term12995.getClass(), "readBuf", null);
        setField(term12995, term12995.getClass(), "blockBuffer", null);
        setIntField(term12995, term12995.getClass(), "recordOffset", 0);
        setLongField(term12995, term12995.getClass(), "filepos", 0L);
        setField(term12995, term12995.getClass(), "raw", null);
        setField(term12995, term12995.getClass(), "names", null);
        setField(term12995, term12995.getClass(), "pending", null);
        setField(term12995, term12995.getClass(), "queue", null);
        setField(term12995, term12995.getClass(), "zipEncoding", null);
        setField(term12995, term12995.getClass(), "SINGLE", null);
        setLongField(term12995, term12995.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getNextEntry", argTypes, term12995, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


