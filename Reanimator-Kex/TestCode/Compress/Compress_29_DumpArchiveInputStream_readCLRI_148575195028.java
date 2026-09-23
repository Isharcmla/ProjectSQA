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

public class DumpArchiveInputStream_readCLRI_148575195028 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7465;

    public DumpArchiveInputStream_readCLRI_148575195028() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7465 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        setField(term7465, term7465.getClass(), "summary", null);
        setField(term7465, term7465.getClass(), "active", null);
        setBooleanField(term7465, term7465.getClass(), "isClosed", false);
        setBooleanField(term7465, term7465.getClass(), "hasHitEOF", false);
        setLongField(term7465, term7465.getClass(), "entrySize", 0L);
        setLongField(term7465, term7465.getClass(), "entryOffset", 0L);
        setIntField(term7465, term7465.getClass(), "readIdx", 0);
        setField(term7465, term7465.getClass(), "readBuf", null);
        setField(term7465, term7465.getClass(), "blockBuffer", null);
        setIntField(term7465, term7465.getClass(), "recordOffset", 0);
        setLongField(term7465, term7465.getClass(), "filepos", 0L);
        setField(term7465, term7465.getClass(), "raw", null);
        setField(term7465, term7465.getClass(), "names", null);
        setField(term7465, term7465.getClass(), "pending", null);
        setField(term7465, term7465.getClass(), "queue", null);
        setField(term7465, term7465.getClass(), "zipEncoding", null);
        setField(term7465, term7465.getClass(), "SINGLE", null);
        setLongField(term7465, term7465.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "readCLRI", argTypes, term7465, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


