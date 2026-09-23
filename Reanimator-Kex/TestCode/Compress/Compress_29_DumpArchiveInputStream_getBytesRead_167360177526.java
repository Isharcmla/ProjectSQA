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

public class DumpArchiveInputStream_getBytesRead_167360177526 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3805;

    public DumpArchiveInputStream_getBytesRead_167360177526() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3805 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        setField(term3805, term3805.getClass(), "summary", null);
        setField(term3805, term3805.getClass(), "active", null);
        setBooleanField(term3805, term3805.getClass(), "isClosed", false);
        setBooleanField(term3805, term3805.getClass(), "hasHitEOF", false);
        setLongField(term3805, term3805.getClass(), "entrySize", 0L);
        setLongField(term3805, term3805.getClass(), "entryOffset", 0L);
        setIntField(term3805, term3805.getClass(), "readIdx", 0);
        setField(term3805, term3805.getClass(), "readBuf", null);
        setField(term3805, term3805.getClass(), "blockBuffer", null);
        setIntField(term3805, term3805.getClass(), "recordOffset", 0);
        setLongField(term3805, term3805.getClass(), "filepos", 0L);
        setField(term3805, term3805.getClass(), "raw", null);
        setField(term3805, term3805.getClass(), "names", null);
        setField(term3805, term3805.getClass(), "pending", null);
        setField(term3805, term3805.getClass(), "queue", null);
        setField(term3805, term3805.getClass(), "zipEncoding", null);
        setField(term3805, term3805.getClass(), "SINGLE", null);
        setLongField(term3805, term3805.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getBytesRead", argTypes, term3805, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


