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

public class DumpArchiveInputStream_readDirectoryEntry_482549166534 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term961709;
     Object term962193;

    public DumpArchiveInputStream_readDirectoryEntry_482549166534() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term961757 = new HashMap();
        term961709 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        byte[] term961440 = (byte[]) newByteArray(0);
        Object term961983 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        Object term962069 = newInstance(Class.forName("java.lang.ProcessBuilder$NullInputStream"));
        byte[] term961447 = (byte[]) newByteArray(0);
        setField(term961709, term961709.getClass(), "names", term961757);
        setField(term961709, term961709.getClass(), "blockBuffer", term961440);
        setIntField(term961983, term961983.getClass(), "readOffset", 1);
        setIntField(term961983, term961983.getClass(), "blockSize", 1);
        setField(term961983, term961983.getClass(), "in", term962069);
        setBooleanField(term961983, term961983.getClass(), "isCompressed", true);
        setIntField(term961983, term961983.getClass(), "currBlkIdx", -1);
        setField(term961983, term961983.getClass(), "blockBuffer", term961447);
        setField(term961709, term961709.getClass(), "raw", term961983);
        Class<? extends Object> term965515 = Class.forName((String) "org.apache.commons.compress.archivers.dump.DumpArchiveConstants$SEGMENT_TYPE");
        Field term965514 = ((Class) term965515).getDeclaredField((String) "CLRI");
        ((Field) term965514).setAccessible(true);
        Object enum154 = ((Field) term965514).get((Object) null);
        term962193 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry"));
        Object term962353 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader"));
        setLongField(term962193, term962193.getClass(), "size", 0L);
        setIntField(term962353, term962353.getClass(), "ino", 0);
        setField(term962353, term962353.getClass(), "type", enum154);
        setIntField(term962353, term962353.getClass(), "count", 0);
        setField(term962193, term962193.getClass(), "header", term962353);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry");
        Object[] args = new Object[1];
        args[0] = term962193;
        try {
            callMethod(klass, "readDirectoryEntry", argTypes, term961709, args);
            assertTrue(false);
        }
        catch (IndexOutOfBoundsException e) {
        }

    }

};


