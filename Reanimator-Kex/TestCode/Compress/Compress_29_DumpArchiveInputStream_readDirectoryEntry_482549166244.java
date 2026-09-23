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
import java.lang.IndexOutOfBoundsException;
import static org.apache.commons.compress.archivers.dump.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.Object;
import java.lang.String;

public class DumpArchiveInputStream_readDirectoryEntry_482549166244 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term269978;
     Object term270432;

    public DumpArchiveInputStream_readDirectoryEntry_482549166244() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term270026 = new HashMap();
        term269978 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        byte[] term269711 = (byte[]) newByteArray(0);
        Object term270252 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        Object term270308 = newInstance(Class.forName("java.io.FilterInputStream"));
        byte[] term269718 = (byte[]) newByteArray(0);
        setField(term269978, term269978.getClass(), "names", term270026);
        setField(term269978, term269978.getClass(), "blockBuffer", term269711);
        setIntField(term270252, term270252.getClass(), "readOffset", 0);
        setIntField(term270252, term270252.getClass(), "blockSize", 0);
        setField(term270252, term270252.getClass(), "in", term270308);
        setBooleanField(term270252, term270252.getClass(), "isCompressed", true);
        setIntField(term270252, term270252.getClass(), "currBlkIdx", 0);
        setField(term270252, term270252.getClass(), "blockBuffer", term269718);
        setField(term269978, term269978.getClass(), "raw", term270252);
        Class<? extends Object> term271588 = Class.forName((String) "org.apache.commons.compress.archivers.dump.DumpArchiveConstants$SEGMENT_TYPE");
        Field term271587 = ((Class) term271588).getDeclaredField((String) "BITS");
        ((Field) term271587).setAccessible(true);
        Object enum43 = ((Field) term271587).get((Object) null);
        term270432 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry"));
        Object term270592 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader"));
        setLongField(term270432, term270432.getClass(), "size", 0L);
        setIntField(term270592, term270592.getClass(), "ino", 0);
        setField(term270592, term270592.getClass(), "type", enum43);
        setIntField(term270592, term270592.getClass(), "count", 0);
        setField(term270432, term270432.getClass(), "header", term270592);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry");
        Object[] args = new Object[1];
        args[0] = term270432;
        try {
            callMethod(klass, "readDirectoryEntry", argTypes, term269978, args);
            assertTrue(false);
        }
        catch (IndexOutOfBoundsException e) {
        }

    }

};


