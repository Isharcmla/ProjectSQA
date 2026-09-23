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

public class DumpArchiveInputStream_getBytesRead_167360177556 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44733;
     Object term46057;

    public DumpArchiveInputStream_getBytesRead_167360177556() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44733 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        Object term44855 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        setField(term44733, term44733.getClass(), "raw", term44855);
        term46057 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        Object term46058 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        setField(term46057, term46057.getClass(), "summary", null);
        setField(term46057, term46057.getClass(), "active", null);
        setBooleanField(term46057, term46057.getClass(), "isClosed", false);
        setBooleanField(term46057, term46057.getClass(), "hasHitEOF", false);
        setLongField(term46057, term46057.getClass(), "entrySize", 0L);
        setLongField(term46057, term46057.getClass(), "entryOffset", 0L);
        setIntField(term46057, term46057.getClass(), "readIdx", 0);
        setField(term46057, term46057.getClass(), "readBuf", null);
        setField(term46057, term46057.getClass(), "blockBuffer", null);
        setIntField(term46057, term46057.getClass(), "recordOffset", 0);
        setLongField(term46057, term46057.getClass(), "filepos", 0L);
        setField(term46058, term46058.getClass(), "blockBuffer", null);
        setIntField(term46058, term46058.getClass(), "currBlkIdx", 0);
        setIntField(term46058, term46058.getClass(), "blockSize", 0);
        setIntField(term46058, term46058.getClass(), "readOffset", 0);
        setBooleanField(term46058, term46058.getClass(), "isCompressed", false);
        setLongField(term46058, term46058.getClass(), "bytesRead", 0L);
        setField(term46058, term46058.getClass(), "in", null);
        setField(term46057, term46057.getClass(), "raw", term46058);
        setField(term46057, term46057.getClass(), "names", null);
        setField(term46057, term46057.getClass(), "pending", null);
        setField(term46057, term46057.getClass(), "queue", null);
        setField(term46057, term46057.getClass(), "zipEncoding", null);
        setField(term46057, term46057.getClass(), "SINGLE", null);
        setLongField(term46057, term46057.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getBytesRead", argTypes, term44733, args);
        assertTrue(recursiveEquals(term44733, term46057));
        assertTrue(recursiveEquals(retValue, 0L));
    }

};


