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

public class DumpArchiveInputStream_readDirectoryEntry_482549166519 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term936863;
     Object term937497;

    public DumpArchiveInputStream_readDirectoryEntry_482549166519() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term936911 = new HashMap();
        term936863 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        byte[] term935548 = (byte[]) newByteArray(0);
        Object term937137 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        Object term937271 = newInstance(Class.forName("org.apache.commons.compress.compressors.z.ZCompressorInputStream"));
        byte[] term935555 = (byte[]) newByteArray(512);
        Object term937373 = newInstance(Class.forName("org.apache.commons.compress.utils.BitInputStream"));
        setField(term936863, term936863.getClass(), "names", term936911);
        setField(term936863, term936863.getClass(), "blockBuffer", term935548);
        setIntField(term937137, term937137.getClass(), "readOffset", 0);
        setIntField(term937137, term937137.getClass(), "blockSize", 0);
        setField(term937271, term937271.getClass(), "outputStack", term935555);
        setIntField(term937271, term937271.getClass(), "outputStackLocation", 512);
        setIntField(term937271, term937271.getClass(), "codeSize", 31);
        setField(term937271, term937271.getClass(), "in", term937373);
        setField(term937137, term937137.getClass(), "in", term937271);
        setBooleanField(term937137, term937137.getClass(), "isCompressed", true);
        setIntField(term937137, term937137.getClass(), "currBlkIdx", 0);
        setField(term937137, term937137.getClass(), "blockBuffer", term935555);
        setField(term936863, term936863.getClass(), "raw", term937137);
        Class<? extends Object> term942561 = Class.forName((String) "org.apache.commons.compress.archivers.dump.DumpArchiveConstants$SEGMENT_TYPE");
        Field term942560 = ((Class) term942561).getDeclaredField((String) "CLRI");
        ((Field) term942560).setAccessible(true);
        Object enum145 = ((Field) term942560).get((Object) null);
        term937497 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry"));
        Object term937657 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader"));
        setLongField(term937497, term937497.getClass(), "size", 0L);
        setIntField(term937657, term937657.getClass(), "ino", 0);
        setField(term937657, term937657.getClass(), "type", enum145);
        setIntField(term937657, term937657.getClass(), "count", 0);
        setField(term937497, term937497.getClass(), "header", term937657);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry");
        Object[] args = new Object[1];
        args[0] = term937497;
        try {
            callMethod(klass, "readDirectoryEntry", argTypes, term936863, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


