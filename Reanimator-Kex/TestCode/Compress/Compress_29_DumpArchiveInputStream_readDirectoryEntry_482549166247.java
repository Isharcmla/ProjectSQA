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

public class DumpArchiveInputStream_readDirectoryEntry_482549166247 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term272710;
     Object term273164;

    public DumpArchiveInputStream_readDirectoryEntry_482549166247() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term272758 = new HashMap();
        term272710 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        byte[] term272451 = (byte[]) newByteArray(0);
        Object term272984 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        Object term273040 = newInstance(Class.forName("java.io.FilterInputStream"));
        setField(term272710, term272710.getClass(), "names", term272758);
        setField(term272710, term272710.getClass(), "blockBuffer", term272451);
        setIntField(term272984, term272984.getClass(), "readOffset", 0);
        setIntField(term272984, term272984.getClass(), "blockSize", 0);
        setField(term272984, term272984.getClass(), "in", term273040);
        setBooleanField(term272984, term272984.getClass(), "isCompressed", true);
        setIntField(term272984, term272984.getClass(), "currBlkIdx", -1);
        setField(term272710, term272710.getClass(), "raw", term272984);
        Class<? extends Object> term275667 = Class.forName((String) "org.apache.commons.compress.archivers.dump.DumpArchiveConstants$SEGMENT_TYPE");
        Field term275666 = ((Class) term275667).getDeclaredField((String) "INODE");
        ((Field) term275666).setAccessible(true);
        Object enum46 = ((Field) term275666).get((Object) null);
        term273164 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry"));
        Object term273324 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader"));
        setLongField(term273164, term273164.getClass(), "size", 0L);
        setIntField(term273324, term273324.getClass(), "ino", 0);
        setField(term273324, term273324.getClass(), "type", enum46);
        setIntField(term273324, term273324.getClass(), "count", 0);
        setField(term273164, term273164.getClass(), "header", term273324);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry");
        Object[] args = new Object[1];
        args[0] = term273164;
        try {
            callMethod(klass, "readDirectoryEntry", argTypes, term272710, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


