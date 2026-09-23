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

public class DumpArchiveInputStream_close_946491120191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term169999;
     Object term173818;

    public DumpArchiveInputStream_close_946491120191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term169999 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        Object term170121 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        Object term170243 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        setBooleanField(term169999, term169999.getClass(), "isClosed", false);
        setField(term170121, term170121.getClass(), "in", term170243);
        setField(term169999, term169999.getClass(), "raw", term170121);
        term173818 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        Object term173819 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        Object term173820 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        setField(term173818, term173818.getClass(), "summary", null);
        setField(term173818, term173818.getClass(), "active", null);
        setBooleanField(term173818, term173818.getClass(), "isClosed", true);
        setBooleanField(term173818, term173818.getClass(), "hasHitEOF", false);
        setLongField(term173818, term173818.getClass(), "entrySize", 0L);
        setLongField(term173818, term173818.getClass(), "entryOffset", 0L);
        setIntField(term173818, term173818.getClass(), "readIdx", 0);
        setField(term173818, term173818.getClass(), "readBuf", null);
        setField(term173818, term173818.getClass(), "blockBuffer", null);
        setIntField(term173818, term173818.getClass(), "recordOffset", 0);
        setLongField(term173818, term173818.getClass(), "filepos", 0L);
        setField(term173819, term173819.getClass(), "blockBuffer", null);
        setIntField(term173819, term173819.getClass(), "currBlkIdx", 0);
        setIntField(term173819, term173819.getClass(), "blockSize", 0);
        setIntField(term173819, term173819.getClass(), "readOffset", 0);
        setBooleanField(term173819, term173819.getClass(), "isCompressed", false);
        setLongField(term173819, term173819.getClass(), "bytesRead", 0L);
        setField(term173820, term173820.getClass(), "blockBuffer", null);
        setIntField(term173820, term173820.getClass(), "currBlkIdx", 0);
        setIntField(term173820, term173820.getClass(), "blockSize", 0);
        setIntField(term173820, term173820.getClass(), "readOffset", 0);
        setBooleanField(term173820, term173820.getClass(), "isCompressed", false);
        setLongField(term173820, term173820.getClass(), "bytesRead", 0L);
        setField(term173820, term173820.getClass(), "in", null);
        setField(term173819, term173819.getClass(), "in", term173820);
        setField(term173818, term173818.getClass(), "raw", term173819);
        setField(term173818, term173818.getClass(), "names", null);
        setField(term173818, term173818.getClass(), "pending", null);
        setField(term173818, term173818.getClass(), "queue", null);
        setField(term173818, term173818.getClass(), "zipEncoding", null);
        setField(term173818, term173818.getClass(), "SINGLE", null);
        setLongField(term173818, term173818.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "close", argTypes, term169999, args);
        assertTrue(recursiveEquals(term169999, term173818));
    }

};


