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
import static org.apache.commons.compress.archivers.dump.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.Object;
import java.lang.String;

public class DumpArchiveInputStream_readDirectoryEntry_482549166573 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1045370;
     Object term1045902;

    public DumpArchiveInputStream_readDirectoryEntry_482549166573() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1045418 = new HashMap();
        term1045370 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        byte[] term1045025 = (byte[]) newByteArray(0);
        Object term1045644 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        Object term1045778 = newInstance(Class.forName("org.apache.commons.compress.compressors.z.ZCompressorInputStream"));
        byte[] term1045097 = (byte[]) newByteArray(0);
        byte[] term1045032 = (byte[]) newByteArray(64);
        setField(term1045370, term1045370.getClass(), "names", term1045418);
        setField(term1045370, term1045370.getClass(), "blockBuffer", term1045025);
        setIntField(term1045644, term1045644.getClass(), "readOffset", 0);
        setIntField(term1045644, term1045644.getClass(), "blockSize", 0);
        setField(term1045778, term1045778.getClass(), "outputStack", term1045097);
        setIntField(term1045778, term1045778.getClass(), "outputStackLocation", -1);
        setField(term1045644, term1045644.getClass(), "in", term1045778);
        setBooleanField(term1045644, term1045644.getClass(), "isCompressed", true);
        setIntField(term1045644, term1045644.getClass(), "currBlkIdx", 0);
        setField(term1045644, term1045644.getClass(), "blockBuffer", term1045032);
        setField(term1045370, term1045370.getClass(), "raw", term1045644);
        Class<? extends Object> term1047304 = Class.forName((String) "org.apache.commons.compress.archivers.dump.DumpArchiveConstants$SEGMENT_TYPE");
        Field term1047303 = ((Class) term1047304).getDeclaredField((String) "END");
        ((Field) term1047303).setAccessible(true);
        Object enum168 = ((Field) term1047303).get((Object) null);
        term1045902 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry"));
        Object term1046062 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader"));
        setLongField(term1045902, term1045902.getClass(), "size", 0L);
        setIntField(term1046062, term1046062.getClass(), "ino", 0);
        setField(term1046062, term1046062.getClass(), "type", enum168);
        setIntField(term1046062, term1046062.getClass(), "count", 0);
        setField(term1045902, term1045902.getClass(), "header", term1046062);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry");
        Object[] args = new Object[1];
        args[0] = term1045902;
        callMethod(klass, "readDirectoryEntry", argTypes, term1045370, args);
    }

};


