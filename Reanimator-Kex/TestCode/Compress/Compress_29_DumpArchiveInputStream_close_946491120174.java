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

public class DumpArchiveInputStream_close_946491120174 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term138971;
     Object term139262;

    public DumpArchiveInputStream_close_946491120174() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term138971 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        Object term139093 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        Object term139231 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.AES256SHA256Decoder$1"));
        setBooleanField(term138971, term138971.getClass(), "isClosed", false);
        setField(term139093, term139093.getClass(), "in", term139231);
        setField(term138971, term138971.getClass(), "raw", term139093);
        term139262 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        Object term139263 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        Object term139264 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.AES256SHA256Decoder$1"));
        setField(term139262, term139262.getClass(), "summary", null);
        setField(term139262, term139262.getClass(), "active", null);
        setBooleanField(term139262, term139262.getClass(), "isClosed", true);
        setBooleanField(term139262, term139262.getClass(), "hasHitEOF", false);
        setLongField(term139262, term139262.getClass(), "entrySize", 0L);
        setLongField(term139262, term139262.getClass(), "entryOffset", 0L);
        setIntField(term139262, term139262.getClass(), "readIdx", 0);
        setField(term139262, term139262.getClass(), "readBuf", null);
        setField(term139262, term139262.getClass(), "blockBuffer", null);
        setIntField(term139262, term139262.getClass(), "recordOffset", 0);
        setLongField(term139262, term139262.getClass(), "filepos", 0L);
        setField(term139263, term139263.getClass(), "blockBuffer", null);
        setIntField(term139263, term139263.getClass(), "currBlkIdx", 0);
        setIntField(term139263, term139263.getClass(), "blockSize", 0);
        setIntField(term139263, term139263.getClass(), "readOffset", 0);
        setBooleanField(term139263, term139263.getClass(), "isCompressed", false);
        setLongField(term139263, term139263.getClass(), "bytesRead", 0L);
        setBooleanField(term139264, term139264.getClass(), "isInitialized", false);
        setField(term139264, term139264.getClass(), "cipherInputStream", null);
        setField(term139264, term139264.getClass(), "val$coder", null);
        setField(term139264, term139264.getClass(), "val$archiveName", null);
        setField(term139264, term139264.getClass(), "val$passwordBytes", null);
        setField(term139264, term139264.getClass(), "val$in", null);
        setField(term139264, term139264.getClass(), "this$0", null);
        setField(term139263, term139263.getClass(), "in", term139264);
        setField(term139262, term139262.getClass(), "raw", term139263);
        setField(term139262, term139262.getClass(), "names", null);
        setField(term139262, term139262.getClass(), "pending", null);
        setField(term139262, term139262.getClass(), "queue", null);
        setField(term139262, term139262.getClass(), "zipEncoding", null);
        setField(term139262, term139262.getClass(), "SINGLE", null);
        setLongField(term139262, term139262.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "close", argTypes, term138971, args);
        assertTrue(recursiveEquals(term138971, term139262));
    }

};


