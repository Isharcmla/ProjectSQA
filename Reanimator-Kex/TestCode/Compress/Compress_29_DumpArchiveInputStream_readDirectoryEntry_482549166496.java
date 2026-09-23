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

public class DumpArchiveInputStream_readDirectoryEntry_482549166496 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term874219;
     Object term874739;

    public DumpArchiveInputStream_readDirectoryEntry_482549166496() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term874267 = new HashMap();
        term874219 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        byte[] term873957 = (byte[]) newByteArray(0);
        Object term874493 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        Object term874615 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        setField(term874219, term874219.getClass(), "names", term874267);
        setField(term874219, term874219.getClass(), "blockBuffer", term873957);
        setIntField(term874493, term874493.getClass(), "readOffset", -1);
        setIntField(term874493, term874493.getClass(), "blockSize", -1);
        setField(term874493, term874493.getClass(), "in", term874615);
        setBooleanField(term874493, term874493.getClass(), "isCompressed", true);
        setIntField(term874493, term874493.getClass(), "currBlkIdx", -1);
        setField(term874493, term874493.getClass(), "blockBuffer", null);
        setField(term874219, term874219.getClass(), "raw", term874493);
        Class<? extends Object> term875897 = Class.forName((String) "org.apache.commons.compress.archivers.dump.DumpArchiveConstants$SEGMENT_TYPE");
        Field term875896 = ((Class) term875897).getDeclaredField((String) "BITS");
        ((Field) term875896).setAccessible(true);
        Object enum136 = ((Field) term875896).get((Object) null);
        term874739 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry"));
        Object term874899 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader"));
        setLongField(term874739, term874739.getClass(), "size", 0L);
        setIntField(term874899, term874899.getClass(), "ino", 0);
        setField(term874899, term874899.getClass(), "type", enum136);
        setIntField(term874899, term874899.getClass(), "count", 0);
        setField(term874739, term874739.getClass(), "header", term874899);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry");
        Object[] args = new Object[1];
        args[0] = term874739;
        try {
            callMethod(klass, "readDirectoryEntry", argTypes, term874219, args);
            assertTrue(false);
        }
        catch (IndexOutOfBoundsException e) {
        }

    }

};


