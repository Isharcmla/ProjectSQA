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

public class DumpArchiveInputStream_readDirectoryEntry_482549166408 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term663496;
     Object term664052;

    public DumpArchiveInputStream_readDirectoryEntry_482549166408() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term663544 = new HashMap();
        term663496 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        byte[] term662931 = (byte[]) newByteArray(4);
        Object term663770 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        Object term663928 = newInstance(Class.forName("org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream"));
        byte[] term662973 = (byte[]) newByteArray(256);
        setField(term663496, term663496.getClass(), "names", term663544);
        setByteElement(term662931, 0, (byte) 67);
        setByteElement(term662931, 1, (byte) 76);
        setByteElement(term662931, 2, (byte) 82);
        setByteElement(term662931, 3, (byte) 73);
        setField(term663496, term663496.getClass(), "blockBuffer", term662931);
        setIntField(term663770, term663770.getClass(), "readOffset", 1);
        setIntField(term663770, term663770.getClass(), "blockSize", 1);
        setField(term663770, term663770.getClass(), "in", term663928);
        setBooleanField(term663770, term663770.getClass(), "isCompressed", true);
        setIntField(term663770, term663770.getClass(), "currBlkIdx", -1);
        setField(term663770, term663770.getClass(), "blockBuffer", term662973);
        setField(term663496, term663496.getClass(), "raw", term663770);
        Class<? extends Object> term665983 = Class.forName((String) "org.apache.commons.compress.archivers.dump.DumpArchiveConstants$SEGMENT_TYPE");
        Field term665982 = ((Class) term665983).getDeclaredField((String) "END");
        ((Field) term665982).setAccessible(true);
        Object enum85 = ((Field) term665982).get((Object) null);
        term664052 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry"));
        Object term664212 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader"));
        setLongField(term664052, term664052.getClass(), "size", 0L);
        setIntField(term664212, term664212.getClass(), "ino", 0);
        setField(term664212, term664212.getClass(), "type", enum85);
        setIntField(term664212, term664212.getClass(), "count", 0);
        setField(term664052, term664052.getClass(), "header", term664212);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry");
        Object[] args = new Object[1];
        args[0] = term664052;
        try {
            callMethod(klass, "readDirectoryEntry", argTypes, term663496, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


