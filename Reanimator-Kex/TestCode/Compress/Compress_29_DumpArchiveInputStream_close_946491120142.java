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

public class DumpArchiveInputStream_close_946491120142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term95815;
     Object term96409;

    public DumpArchiveInputStream_close_946491120142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term95815 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        Object term95937 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        Object term96073 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        Object term96195 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        setBooleanField(term95815, term95815.getClass(), "isClosed", false);
        setBooleanField(term96073, term96073.getClass(), "isClosed", false);
        setField(term96073, term96073.getClass(), "raw", term96195);
        setField(term95937, term95937.getClass(), "in", term96073);
        setField(term95815, term95815.getClass(), "raw", term95937);
        term96409 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        Object term96410 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        Object term96411 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        Object term96412 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        setField(term96409, term96409.getClass(), "summary", null);
        setField(term96409, term96409.getClass(), "active", null);
        setBooleanField(term96409, term96409.getClass(), "isClosed", true);
        setBooleanField(term96409, term96409.getClass(), "hasHitEOF", false);
        setLongField(term96409, term96409.getClass(), "entrySize", 0L);
        setLongField(term96409, term96409.getClass(), "entryOffset", 0L);
        setIntField(term96409, term96409.getClass(), "readIdx", 0);
        setField(term96409, term96409.getClass(), "readBuf", null);
        setField(term96409, term96409.getClass(), "blockBuffer", null);
        setIntField(term96409, term96409.getClass(), "recordOffset", 0);
        setLongField(term96409, term96409.getClass(), "filepos", 0L);
        setField(term96410, term96410.getClass(), "blockBuffer", null);
        setIntField(term96410, term96410.getClass(), "currBlkIdx", 0);
        setIntField(term96410, term96410.getClass(), "blockSize", 0);
        setIntField(term96410, term96410.getClass(), "readOffset", 0);
        setBooleanField(term96410, term96410.getClass(), "isCompressed", false);
        setLongField(term96410, term96410.getClass(), "bytesRead", 0L);
        setField(term96411, term96411.getClass(), "summary", null);
        setField(term96411, term96411.getClass(), "active", null);
        setBooleanField(term96411, term96411.getClass(), "isClosed", true);
        setBooleanField(term96411, term96411.getClass(), "hasHitEOF", false);
        setLongField(term96411, term96411.getClass(), "entrySize", 0L);
        setLongField(term96411, term96411.getClass(), "entryOffset", 0L);
        setIntField(term96411, term96411.getClass(), "readIdx", 0);
        setField(term96411, term96411.getClass(), "readBuf", null);
        setField(term96411, term96411.getClass(), "blockBuffer", null);
        setIntField(term96411, term96411.getClass(), "recordOffset", 0);
        setLongField(term96411, term96411.getClass(), "filepos", 0L);
        setField(term96412, term96412.getClass(), "blockBuffer", null);
        setIntField(term96412, term96412.getClass(), "currBlkIdx", 0);
        setIntField(term96412, term96412.getClass(), "blockSize", 0);
        setIntField(term96412, term96412.getClass(), "readOffset", 0);
        setBooleanField(term96412, term96412.getClass(), "isCompressed", false);
        setLongField(term96412, term96412.getClass(), "bytesRead", 0L);
        setField(term96412, term96412.getClass(), "in", null);
        setField(term96411, term96411.getClass(), "raw", term96412);
        setField(term96411, term96411.getClass(), "names", null);
        setField(term96411, term96411.getClass(), "pending", null);
        setField(term96411, term96411.getClass(), "queue", null);
        setField(term96411, term96411.getClass(), "zipEncoding", null);
        setField(term96411, term96411.getClass(), "SINGLE", null);
        setLongField(term96411, term96411.getClass(), "bytesRead", 0L);
        setField(term96410, term96410.getClass(), "in", term96411);
        setField(term96409, term96409.getClass(), "raw", term96410);
        setField(term96409, term96409.getClass(), "names", null);
        setField(term96409, term96409.getClass(), "pending", null);
        setField(term96409, term96409.getClass(), "queue", null);
        setField(term96409, term96409.getClass(), "zipEncoding", null);
        setField(term96409, term96409.getClass(), "SINGLE", null);
        setLongField(term96409, term96409.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "close", argTypes, term95815, args);
        assertTrue(recursiveEquals(term95815, term96409));
    }

};


