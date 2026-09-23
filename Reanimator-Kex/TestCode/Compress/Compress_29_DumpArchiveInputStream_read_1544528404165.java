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

public class DumpArchiveInputStream_read_1544528404165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term119861;
     Object term123302;

    public DumpArchiveInputStream_read_1544528404165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term119861 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        setBooleanField(term119861, term119861.getClass(), "hasHitEOF", false);
        setBooleanField(term119861, term119861.getClass(), "isClosed", true);
        term123302 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        setField(term123302, term123302.getClass(), "summary", null);
        setField(term123302, term123302.getClass(), "active", null);
        setBooleanField(term123302, term123302.getClass(), "isClosed", true);
        setBooleanField(term123302, term123302.getClass(), "hasHitEOF", false);
        setLongField(term123302, term123302.getClass(), "entrySize", 0L);
        setLongField(term123302, term123302.getClass(), "entryOffset", 0L);
        setIntField(term123302, term123302.getClass(), "readIdx", 0);
        setField(term123302, term123302.getClass(), "readBuf", null);
        setField(term123302, term123302.getClass(), "blockBuffer", null);
        setIntField(term123302, term123302.getClass(), "recordOffset", 0);
        setLongField(term123302, term123302.getClass(), "filepos", 0L);
        setField(term123302, term123302.getClass(), "raw", null);
        setField(term123302, term123302.getClass(), "names", null);
        setField(term123302, term123302.getClass(), "pending", null);
        setField(term123302, term123302.getClass(), "queue", null);
        setField(term123302, term123302.getClass(), "zipEncoding", null);
        setField(term123302, term123302.getClass(), "SINGLE", null);
        setLongField(term123302, term123302.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = 0;
        args[2] = 0;
        Object retValue = callMethod(klass, "read", argTypes, term119861, args);
        assertTrue(recursiveEquals(term119861, term123302));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


