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
import java.lang.StackOverflowError;
import static org.apache.commons.compress.archivers.dump.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.Integer;
import java.lang.Object;

public class DumpArchiveInputStream_readDirectoryEntry_482549166456 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term781363;
     Object term782055;

    public DumpArchiveInputStream_readDirectoryEntry_482549166456() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term781511 = new Integer(0);
        Object term781549 = newInstance(Class.forName("java.lang.Object"));
        HashMap term781411 = new HashMap();
        ((HashMap) term781411).put(term781511, term781511);
        ((HashMap) term781411).put((Object)null, (Object)null);
        ((HashMap) term781411).put((Object)null, (Object)null);
        ((HashMap) term781411).put((Object)null, (Object)null);
        ((HashMap) term781411).put((Object)null, (Object)null);
        ((HashMap) term781411).put((Object)null, (Object)null);
        ((HashMap) term781411).put((Object)null, (Object)null);
        ((HashMap) term781411).put((Object)null, (Object)null);
        ((HashMap) term781411).put((Object)null, (Object)null);
        ((HashMap) term781411).put((Object)null, (Object)null);
        ((HashMap) term781411).put((Object)null, (Object)null);
        ((HashMap) term781411).put((Object)null, (Object)null);
        ((HashMap) term781411).put((Object)null, (Object)null);
        ((HashMap) term781411).put((Object)null, (Object)null);
        ((HashMap) term781411).put((Object)null, (Object)null);
        ((HashMap) term781411).put((Object)null, (Object)null);
        ((HashMap) term781411).put(term781549, term781549);
        ((HashMap) term781411).put((Object)null, (Object)null);
        ((HashMap) term781411).put((Object)null, (Object)null);
        ((HashMap) term781411).put((Object)null, (Object)null);
        ((HashMap) term781411).put((Object)null, (Object)null);
        ((HashMap) term781411).put((Object)null, (Object)null);
        ((HashMap) term781411).put((Object)null, (Object)null);
        ((HashMap) term781411).put((Object)null, (Object)null);
        ((HashMap) term781411).put((Object)null, (Object)null);
        ((HashMap) term781411).put((Object)null, (Object)null);
        ((HashMap) term781411).put((Object)null, (Object)null);
        ((HashMap) term781411).put((Object)null, (Object)null);
        ((HashMap) term781411).put((Object)null, (Object)null);
        ((HashMap) term781411).put((Object)null, (Object)null);
        ((HashMap) term781411).put((Object)null, (Object)null);
        ((HashMap) term781411).put((Object)null, (Object)null);
        ((HashMap) term781411).put((Object)null, (Object)null);
        ((HashMap) term781411).put((Object)null, (Object)null);
        ((HashMap) term781411).put((Object)null, (Object)null);
        ((HashMap) term781411).put((Object)null, (Object)null);
        ((HashMap) term781411).put((Object)null, (Object)null);
        ((HashMap) term781411).put((Object)null, (Object)null);
        ((HashMap) term781411).put((Object)null, (Object)null);
        ((HashMap) term781411).put((Object)null, (Object)null);
        ((HashMap) term781411).put((Object)null, (Object)null);
        ((HashMap) term781411).put((Object)null, (Object)null);
        ((HashMap) term781411).put((Object)null, (Object)null);
        ((HashMap) term781411).put((Object)null, (Object)null);
        ((HashMap) term781411).put((Object)null, (Object)null);
        ((HashMap) term781411).put((Object)null, (Object)null);
        ((HashMap) term781411).put((Object)null, (Object)null);
        ((HashMap) term781411).put((Object)null, (Object)null);
        ((HashMap) term781411).put((Object)null, (Object)null);
        ((HashMap) term781411).put((Object)null, (Object)null);
        ((HashMap) term781411).put((Object)null, (Object)null);
        ((HashMap) term781411).put((Object)null, (Object)null);
        ((HashMap) term781411).put((Object)null, (Object)null);
        ((HashMap) term781411).put((Object)null, (Object)null);
        ((HashMap) term781411).put((Object)null, (Object)null);
        ((HashMap) term781411).put((Object)null, (Object)null);
        ((HashMap) term781411).put((Object)null, (Object)null);
        ((HashMap) term781411).put((Object)null, (Object)null);
        ((HashMap) term781411).put((Object)null, (Object)null);
        ((HashMap) term781411).put((Object)null, (Object)null);
        ((HashMap) term781411).put((Object)null, (Object)null);
        ((HashMap) term781411).put((Object)null, (Object)null);
        ((HashMap) term781411).put((Object)null, (Object)null);
        ((HashMap) term781411).put((Object)null, (Object)null);
        term781363 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        byte[] term780903 = (byte[]) newByteArray(0);
        Object term781723 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        Object term781869 = newInstance(Class.forName("org.apache.commons.compress.compressors.lzma.LZMACompressorInputStream"));
        Object term781931 = newInstance(Class.forName("org.tukaani.xz.XZInputStream"));
        byte[] term780910 = (byte[]) newByteArray(12);
        setField(term781363, term781363.getClass(), "names", term781411);
        setField(term781363, term781363.getClass(), "blockBuffer", term780903);
        setIntField(term781723, term781723.getClass(), "readOffset", 0);
        setIntField(term781723, term781723.getClass(), "blockSize", 0);
        setField(term781931, term781931.getClass(), "in", term781931);
        setField(term781931, term781931.getClass(), "exception", null);
        setBooleanField(term781931, term781931.getClass(), "endReached", false);
        setField(term781931, term781931.getClass(), "xzIn", null);
        setField(term781869, term781869.getClass(), "in", term781931);
        setField(term781723, term781723.getClass(), "in", term781869);
        setBooleanField(term781723, term781723.getClass(), "isCompressed", true);
        setIntField(term781723, term781723.getClass(), "currBlkIdx", 0);
        setField(term781723, term781723.getClass(), "blockBuffer", term780910);
        setField(term781363, term781363.getClass(), "raw", term781723);
        term782055 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry"));
        Object term782215 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader"));
        setLongField(term782055, term782055.getClass(), "size", 0L);
        setIntField(term782215, term782215.getClass(), "ino", 0);
        setIntField(term782215, term782215.getClass(), "count", 0);
        setField(term782055, term782055.getClass(), "header", term782215);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry");
        Object[] args = new Object[1];
        args[0] = term782055;
        try {
            callMethod(klass, "readDirectoryEntry", argTypes, term781363, args);
            assertTrue(false);
        }
        catch (StackOverflowError e) {
        }

    }

};


