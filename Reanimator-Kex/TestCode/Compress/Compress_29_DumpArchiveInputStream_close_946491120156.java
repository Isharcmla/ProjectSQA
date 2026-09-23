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

public class DumpArchiveInputStream_close_946491120156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term113436;
     Object term113447;

    public DumpArchiveInputStream_close_946491120156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term113436 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        setBooleanField(term113436, term113436.getClass(), "isClosed", true);
        term113447 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        setField(term113447, term113447.getClass(), "summary", null);
        setField(term113447, term113447.getClass(), "active", null);
        setBooleanField(term113447, term113447.getClass(), "isClosed", true);
        setBooleanField(term113447, term113447.getClass(), "hasHitEOF", false);
        setLongField(term113447, term113447.getClass(), "entrySize", 0L);
        setLongField(term113447, term113447.getClass(), "entryOffset", 0L);
        setIntField(term113447, term113447.getClass(), "readIdx", 0);
        setField(term113447, term113447.getClass(), "readBuf", null);
        setField(term113447, term113447.getClass(), "blockBuffer", null);
        setIntField(term113447, term113447.getClass(), "recordOffset", 0);
        setLongField(term113447, term113447.getClass(), "filepos", 0L);
        setField(term113447, term113447.getClass(), "raw", null);
        setField(term113447, term113447.getClass(), "names", null);
        setField(term113447, term113447.getClass(), "pending", null);
        setField(term113447, term113447.getClass(), "queue", null);
        setField(term113447, term113447.getClass(), "zipEncoding", null);
        setField(term113447, term113447.getClass(), "SINGLE", null);
        setLongField(term113447, term113447.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "close", argTypes, term113436, args);
        assertTrue(recursiveEquals(term113436, term113447));
    }

};


