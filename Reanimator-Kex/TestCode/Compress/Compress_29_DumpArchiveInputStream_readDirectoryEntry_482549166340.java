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

public class DumpArchiveInputStream_readDirectoryEntry_482549166340 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term524913;
     Object term525445;

    public DumpArchiveInputStream_readDirectoryEntry_482549166340() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term524961 = new HashMap();
        term524913 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        byte[] term524127 = (byte[]) newByteArray(0);
        Object term525187 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        Object term525321 = newInstance(Class.forName("org.apache.commons.compress.compressors.z.ZCompressorInputStream"));
        byte[] term524134 = (byte[]) newByteArray(512);
        setField(term524913, term524913.getClass(), "names", term524961);
        setField(term524913, term524913.getClass(), "blockBuffer", term524127);
        setIntField(term525187, term525187.getClass(), "readOffset", 0);
        setIntField(term525187, term525187.getClass(), "blockSize", 0);
        setField(term525187, term525187.getClass(), "in", term525321);
        setBooleanField(term525187, term525187.getClass(), "isCompressed", true);
        setIntField(term525187, term525187.getClass(), "currBlkIdx", 0);
        setField(term525187, term525187.getClass(), "blockBuffer", term524134);
        setField(term524913, term524913.getClass(), "raw", term525187);
        Class<? extends Object> term528150 = Class.forName((String) "org.apache.commons.compress.archivers.dump.DumpArchiveConstants$SEGMENT_TYPE");
        Field term528149 = ((Class) term528150).getDeclaredField((String) "CLRI");
        ((Field) term528149).setAccessible(true);
        Object enum61 = ((Field) term528149).get((Object) null);
        term525445 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry"));
        Object term525605 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader"));
        setLongField(term525445, term525445.getClass(), "size", 0L);
        setIntField(term525605, term525605.getClass(), "ino", 0);
        setField(term525605, term525605.getClass(), "type", enum61);
        setIntField(term525605, term525605.getClass(), "count", 0);
        setField(term525445, term525445.getClass(), "header", term525605);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry");
        Object[] args = new Object[1];
        args[0] = term525445;
        try {
            callMethod(klass, "readDirectoryEntry", argTypes, term524913, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


