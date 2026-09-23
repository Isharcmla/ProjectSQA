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
import org.tukaani.xz.XZIOException;
import static org.apache.commons.compress.archivers.dump.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.Object;
import java.lang.String;

public class DumpArchiveInputStream_readDirectoryEntry_482549166378 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term611030;
     Object term611506;

    public DumpArchiveInputStream_readDirectoryEntry_482549166378() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term611078 = new HashMap();
        term611030 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        byte[] term610244 = (byte[]) newByteArray(0);
        Object term611304 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        Object term611382 = newInstance(Class.forName("org.tukaani.xz.SeekableXZInputStream"));
        byte[] term610251 = (byte[]) newByteArray(512);
        setField(term611030, term611030.getClass(), "names", term611078);
        setField(term611030, term611030.getClass(), "blockBuffer", term610244);
        setIntField(term611304, term611304.getClass(), "readOffset", 0);
        setIntField(term611304, term611304.getClass(), "blockSize", 0);
        setField(term611304, term611304.getClass(), "in", term611382);
        setBooleanField(term611304, term611304.getClass(), "isCompressed", true);
        setIntField(term611304, term611304.getClass(), "currBlkIdx", 0);
        setField(term611304, term611304.getClass(), "blockBuffer", term610251);
        setField(term611030, term611030.getClass(), "raw", term611304);
        Class<? extends Object> term617890 = Class.forName((String) "org.apache.commons.compress.archivers.dump.DumpArchiveConstants$SEGMENT_TYPE");
        Field term617889 = ((Class) term617890).getDeclaredField((String) "CLRI");
        ((Field) term617889).setAccessible(true);
        Object enum76 = ((Field) term617889).get((Object) null);
        term611506 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry"));
        Object term611666 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader"));
        setLongField(term611506, term611506.getClass(), "size", 0L);
        setIntField(term611666, term611666.getClass(), "ino", 0);
        setField(term611666, term611666.getClass(), "type", enum76);
        setIntField(term611666, term611666.getClass(), "count", 0);
        setField(term611506, term611506.getClass(), "header", term611666);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry");
        Object[] args = new Object[1];
        args[0] = term611506;
        try {
            callMethod(klass, "readDirectoryEntry", argTypes, term611030, args);
            assertTrue(false);
        }
        catch (XZIOException e) {
        }

    }

};


