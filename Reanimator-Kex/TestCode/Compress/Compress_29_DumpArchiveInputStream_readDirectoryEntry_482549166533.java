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
import java.lang.IllegalArgumentException;
import static org.apache.commons.compress.archivers.dump.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.Object;
import java.lang.String;

public class DumpArchiveInputStream_readDirectoryEntry_482549166533 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term959733;
     Object term960367;

    public DumpArchiveInputStream_readDirectoryEntry_482549166533() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term959781 = new HashMap();
        term959733 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        byte[] term959182 = (byte[]) newByteArray(0);
        Object term960007 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        Object term960141 = newInstance(Class.forName("org.apache.commons.compress.compressors.z.ZCompressorInputStream"));
        byte[] term959446 = (byte[]) newByteArray(0);
        Object term960243 = newInstance(Class.forName("org.apache.commons.compress.utils.BitInputStream"));
        byte[] term959189 = (byte[]) newByteArray(256);
        setField(term959733, term959733.getClass(), "names", term959781);
        setField(term959733, term959733.getClass(), "blockBuffer", term959182);
        setIntField(term960007, term960007.getClass(), "readOffset", 0);
        setIntField(term960007, term960007.getClass(), "blockSize", 0);
        setField(term960141, term960141.getClass(), "outputStack", term959446);
        setIntField(term960141, term960141.getClass(), "outputStackLocation", 0);
        setIntField(term960141, term960141.getClass(), "codeSize", -2147483392);
        setField(term960141, term960141.getClass(), "in", term960243);
        setField(term960007, term960007.getClass(), "in", term960141);
        setBooleanField(term960007, term960007.getClass(), "isCompressed", true);
        setIntField(term960007, term960007.getClass(), "currBlkIdx", 0);
        setField(term960007, term960007.getClass(), "blockBuffer", term959189);
        setField(term959733, term959733.getClass(), "raw", term960007);
        Class<? extends Object> term964312 = Class.forName((String) "org.apache.commons.compress.archivers.dump.DumpArchiveConstants$SEGMENT_TYPE");
        Field term964311 = ((Class) term964312).getDeclaredField((String) "ADDR");
        ((Field) term964311).setAccessible(true);
        Object enum152 = ((Field) term964311).get((Object) null);
        term960367 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry"));
        Object term960527 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader"));
        setLongField(term960367, term960367.getClass(), "size", 0L);
        setIntField(term960527, term960527.getClass(), "ino", 0);
        setField(term960527, term960527.getClass(), "type", enum152);
        setIntField(term960527, term960527.getClass(), "count", 0);
        setField(term960367, term960367.getClass(), "header", term960527);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry");
        Object[] args = new Object[1];
        args[0] = term960367;
        try {
            callMethod(klass, "readDirectoryEntry", argTypes, term959733, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


