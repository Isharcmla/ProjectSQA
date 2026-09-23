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

public class DumpArchiveInputStream_close_946491120512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term927213;
     Object term928154;

    public DumpArchiveInputStream_close_946491120512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term927213 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        Object term927335 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        Object term927471 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        Object term927593 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        Object term927729 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        Object term927851 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        Object term927905 = newInstance(Class.forName("java.io.PipedInputStream"));
        setBooleanField(term927213, term927213.getClass(), "isClosed", false);
        setBooleanField(term927471, term927471.getClass(), "isClosed", false);
        setBooleanField(term927729, term927729.getClass(), "isClosed", false);
        setField(term927851, term927851.getClass(), "in", term927905);
        setField(term927729, term927729.getClass(), "raw", term927851);
        setField(term927593, term927593.getClass(), "in", term927729);
        setField(term927471, term927471.getClass(), "raw", term927593);
        setField(term927335, term927335.getClass(), "in", term927471);
        setField(term927213, term927213.getClass(), "raw", term927335);
        term928154 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        Object term928155 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        Object term928156 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        Object term928157 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        Object term928158 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        setField(term928154, term928154.getClass(), "summary", null);
        setField(term928154, term928154.getClass(), "active", null);
        setBooleanField(term928154, term928154.getClass(), "isClosed", true);
        setBooleanField(term928154, term928154.getClass(), "hasHitEOF", false);
        setLongField(term928154, term928154.getClass(), "entrySize", 0L);
        setLongField(term928154, term928154.getClass(), "entryOffset", 0L);
        setIntField(term928154, term928154.getClass(), "readIdx", 0);
        setField(term928154, term928154.getClass(), "readBuf", null);
        setField(term928154, term928154.getClass(), "blockBuffer", null);
        setIntField(term928154, term928154.getClass(), "recordOffset", 0);
        setLongField(term928154, term928154.getClass(), "filepos", 0L);
        setField(term928155, term928155.getClass(), "blockBuffer", null);
        setIntField(term928155, term928155.getClass(), "currBlkIdx", 0);
        setIntField(term928155, term928155.getClass(), "blockSize", 0);
        setIntField(term928155, term928155.getClass(), "readOffset", 0);
        setBooleanField(term928155, term928155.getClass(), "isCompressed", false);
        setLongField(term928155, term928155.getClass(), "bytesRead", 0L);
        setField(term928156, term928156.getClass(), "summary", null);
        setField(term928156, term928156.getClass(), "active", null);
        setBooleanField(term928156, term928156.getClass(), "isClosed", true);
        setBooleanField(term928156, term928156.getClass(), "hasHitEOF", false);
        setLongField(term928156, term928156.getClass(), "entrySize", 0L);
        setLongField(term928156, term928156.getClass(), "entryOffset", 0L);
        setIntField(term928156, term928156.getClass(), "readIdx", 0);
        setField(term928156, term928156.getClass(), "readBuf", null);
        setField(term928156, term928156.getClass(), "blockBuffer", null);
        setIntField(term928156, term928156.getClass(), "recordOffset", 0);
        setLongField(term928156, term928156.getClass(), "filepos", 0L);
        setField(term928157, term928157.getClass(), "blockBuffer", null);
        setIntField(term928157, term928157.getClass(), "currBlkIdx", 0);
        setIntField(term928157, term928157.getClass(), "blockSize", 0);
        setIntField(term928157, term928157.getClass(), "readOffset", 0);
        setBooleanField(term928157, term928157.getClass(), "isCompressed", false);
        setLongField(term928157, term928157.getClass(), "bytesRead", 0L);
        setField(term928158, term928158.getClass(), "summary", null);
        setField(term928158, term928158.getClass(), "active", null);
        setBooleanField(term928158, term928158.getClass(), "isClosed", true);
        setBooleanField(term928158, term928158.getClass(), "hasHitEOF", false);
        setLongField(term928158, term928158.getClass(), "entrySize", 0L);
        setLongField(term928158, term928158.getClass(), "entryOffset", 0L);
        setIntField(term928158, term928158.getClass(), "readIdx", 0);
        setField(term928158, term928158.getClass(), "readBuf", null);
        setField(term928158, term928158.getClass(), "blockBuffer", null);
        setIntField(term928158, term928158.getClass(), "recordOffset", 0);
        setLongField(term928158, term928158.getClass(), "filepos", 0L);
        setField(term928158, term928158.getClass(), "raw", null);
        setField(term928158, term928158.getClass(), "names", null);
        setField(term928158, term928158.getClass(), "pending", null);
        setField(term928158, term928158.getClass(), "queue", null);
        setField(term928158, term928158.getClass(), "zipEncoding", null);
        setField(term928158, term928158.getClass(), "SINGLE", null);
        setLongField(term928158, term928158.getClass(), "bytesRead", 0L);
        setField(term928157, term928157.getClass(), "in", term928158);
        setField(term928156, term928156.getClass(), "raw", term928157);
        setField(term928156, term928156.getClass(), "names", null);
        setField(term928156, term928156.getClass(), "pending", null);
        setField(term928156, term928156.getClass(), "queue", null);
        setField(term928156, term928156.getClass(), "zipEncoding", null);
        setField(term928156, term928156.getClass(), "SINGLE", null);
        setLongField(term928156, term928156.getClass(), "bytesRead", 0L);
        setField(term928155, term928155.getClass(), "in", term928156);
        setField(term928154, term928154.getClass(), "raw", term928155);
        setField(term928154, term928154.getClass(), "names", null);
        setField(term928154, term928154.getClass(), "pending", null);
        setField(term928154, term928154.getClass(), "queue", null);
        setField(term928154, term928154.getClass(), "zipEncoding", null);
        setField(term928154, term928154.getClass(), "SINGLE", null);
        setLongField(term928154, term928154.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "close", argTypes, term927213, args);
        assertTrue(recursiveEquals(term927213, term928154));
    }

};


