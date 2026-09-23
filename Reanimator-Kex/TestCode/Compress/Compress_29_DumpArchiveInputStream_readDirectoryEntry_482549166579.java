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

public class DumpArchiveInputStream_readDirectoryEntry_482549166579 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1055466;
     Object term1055966;

    public DumpArchiveInputStream_readDirectoryEntry_482549166579() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1055514 = new HashMap();
        term1055466 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        byte[] term1054935 = (byte[]) newByteArray(0);
        Object term1055740 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        Object term1055842 = newInstance(Class.forName("java.util.zip.ZipFile$ZipFileInflaterInputStream"));
        byte[] term1054942 = (byte[]) newByteArray(257);
        setField(term1055466, term1055466.getClass(), "names", term1055514);
        setField(term1055466, term1055466.getClass(), "blockBuffer", term1054935);
        setIntField(term1055740, term1055740.getClass(), "readOffset", 0);
        setIntField(term1055740, term1055740.getClass(), "blockSize", 0);
        setField(term1055740, term1055740.getClass(), "in", term1055842);
        setBooleanField(term1055740, term1055740.getClass(), "isCompressed", true);
        setIntField(term1055740, term1055740.getClass(), "currBlkIdx", 0);
        setField(term1055740, term1055740.getClass(), "blockBuffer", term1054942);
        setField(term1055466, term1055466.getClass(), "raw", term1055740);
        Class<? extends Object> term1056581 = Class.forName((String) "org.apache.commons.compress.archivers.dump.DumpArchiveConstants$SEGMENT_TYPE");
        Field term1056580 = ((Class) term1056581).getDeclaredField((String) "CLRI");
        ((Field) term1056580).setAccessible(true);
        Object enum170 = ((Field) term1056580).get((Object) null);
        term1055966 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry"));
        Object term1056126 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader"));
        setLongField(term1055966, term1055966.getClass(), "size", 0L);
        setIntField(term1056126, term1056126.getClass(), "ino", 0);
        setField(term1056126, term1056126.getClass(), "type", enum170);
        setIntField(term1056126, term1056126.getClass(), "count", 0);
        setField(term1055966, term1055966.getClass(), "header", term1056126);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry");
        Object[] args = new Object[1];
        args[0] = term1055966;
        callMethod(klass, "readDirectoryEntry", argTypes, term1055466, args);
    }

};


