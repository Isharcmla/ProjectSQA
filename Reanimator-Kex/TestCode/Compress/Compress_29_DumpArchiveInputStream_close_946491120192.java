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

public class DumpArchiveInputStream_close_946491120192 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term173578;
     Object term173855;

    public DumpArchiveInputStream_close_946491120192() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term173578 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        Object term173700 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        Object term173768 = newInstance(Class.forName("org.tukaani.xz.DeltaInputStream"));
        setBooleanField(term173578, term173578.getClass(), "isClosed", false);
        setField(term173700, term173700.getClass(), "in", term173768);
        setField(term173578, term173578.getClass(), "raw", term173700);
        term173855 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        Object term173856 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        Object term173857 = newInstance(Class.forName("org.tukaani.xz.DeltaInputStream"));
        setField(term173855, term173855.getClass(), "summary", null);
        setField(term173855, term173855.getClass(), "active", null);
        setBooleanField(term173855, term173855.getClass(), "isClosed", true);
        setBooleanField(term173855, term173855.getClass(), "hasHitEOF", false);
        setLongField(term173855, term173855.getClass(), "entrySize", 0L);
        setLongField(term173855, term173855.getClass(), "entryOffset", 0L);
        setIntField(term173855, term173855.getClass(), "readIdx", 0);
        setField(term173855, term173855.getClass(), "readBuf", null);
        setField(term173855, term173855.getClass(), "blockBuffer", null);
        setIntField(term173855, term173855.getClass(), "recordOffset", 0);
        setLongField(term173855, term173855.getClass(), "filepos", 0L);
        setField(term173856, term173856.getClass(), "blockBuffer", null);
        setIntField(term173856, term173856.getClass(), "currBlkIdx", 0);
        setIntField(term173856, term173856.getClass(), "blockSize", 0);
        setIntField(term173856, term173856.getClass(), "readOffset", 0);
        setBooleanField(term173856, term173856.getClass(), "isCompressed", false);
        setLongField(term173856, term173856.getClass(), "bytesRead", 0L);
        setField(term173857, term173857.getClass(), "in", null);
        setField(term173857, term173857.getClass(), "delta", null);
        setField(term173857, term173857.getClass(), "exception", null);
        setField(term173857, term173857.getClass(), "tempBuf", null);
        setField(term173856, term173856.getClass(), "in", term173857);
        setField(term173855, term173855.getClass(), "raw", term173856);
        setField(term173855, term173855.getClass(), "names", null);
        setField(term173855, term173855.getClass(), "pending", null);
        setField(term173855, term173855.getClass(), "queue", null);
        setField(term173855, term173855.getClass(), "zipEncoding", null);
        setField(term173855, term173855.getClass(), "SINGLE", null);
        setLongField(term173855, term173855.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "close", argTypes, term173578, args);
        assertTrue(recursiveEquals(term173578, term173855));
    }

};


