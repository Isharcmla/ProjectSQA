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
import java.util.HashMap;
import java.lang.Object;
import java.lang.String;

public class DumpArchiveInputStream_readDirectoryEntry_482549166426 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term702203;
     Object term702735;

    public DumpArchiveInputStream_readDirectoryEntry_482549166426() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term702251 = new HashMap();
        term702203 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        byte[] term701797 = (byte[]) newByteArray(0);
        Object term702477 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        Object term702611 = newInstance(Class.forName("org.apache.commons.compress.compressors.z.ZCompressorInputStream"));
        byte[] term701934 = (byte[]) newByteArray(0);
        byte[] term701804 = (byte[]) newByteArray(129);
        setField(term702203, term702203.getClass(), "names", term702251);
        setField(term702203, term702203.getClass(), "blockBuffer", term701797);
        setIntField(term702477, term702477.getClass(), "readOffset", 0);
        setIntField(term702477, term702477.getClass(), "blockSize", 0);
        setField(term702611, term702611.getClass(), "outputStack", term701934);
        setField(term702477, term702477.getClass(), "in", term702611);
        setBooleanField(term702477, term702477.getClass(), "isCompressed", true);
        setIntField(term702477, term702477.getClass(), "currBlkIdx", 0);
        setField(term702477, term702477.getClass(), "blockBuffer", term701804);
        setField(term702203, term702203.getClass(), "raw", term702477);
        Class<? extends Object> term710058 = Class.forName((String) "org.apache.commons.compress.archivers.dump.DumpArchiveConstants$SEGMENT_TYPE");
        Field term710057 = ((Class) term710058).getDeclaredField((String) "BITS");
        ((Field) term710057).setAccessible(true);
        Object enum97 = ((Field) term710057).get((Object) null);
        term702735 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry"));
        Object term702895 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader"));
        setLongField(term702735, term702735.getClass(), "size", 0L);
        setIntField(term702895, term702895.getClass(), "ino", 0);
        setField(term702895, term702895.getClass(), "type", enum97);
        setIntField(term702895, term702895.getClass(), "count", 0);
        setField(term702735, term702735.getClass(), "header", term702895);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry");
        Object[] args = new Object[1];
        args[0] = term702735;
        try {
            callMethod(klass, "readDirectoryEntry", argTypes, term702203, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


