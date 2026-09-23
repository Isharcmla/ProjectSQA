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

public class DumpArchiveInputStream_readDirectoryEntry_482549166577 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1052736;
     Object term1053428;

    public DumpArchiveInputStream_readDirectoryEntry_482549166577() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1052784 = new HashMap();
        term1052736 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        byte[] term1052410 = (byte[]) newByteArray(0);
        Object term1053010 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        Object term1053088 = newInstance(Class.forName("org.tukaani.xz.SeekableXZInputStream"));
        Object term1053166 = newInstance(Class.forName("org.tukaani.xz.SeekableXZInputStream"));
        Object term1053232 = newInstance(Class.forName("org.tukaani.xz.index.BlockInfo"));
        Object term1053304 = newInstance(Class.forName("org.tukaani.xz.index.IndexDecoder"));
        byte[] term1052417 = (byte[]) newByteArray(16);
        setField(term1052736, term1052736.getClass(), "names", term1052784);
        setField(term1052736, term1052736.getClass(), "blockBuffer", term1052410);
        setIntField(term1053010, term1053010.getClass(), "readOffset", 0);
        setIntField(term1053010, term1053010.getClass(), "blockSize", 0);
        setField(term1053088, term1053088.getClass(), "in", term1053166);
        setField(term1053088, term1053088.getClass(), "exception", null);
        setBooleanField(term1053088, term1053088.getClass(), "seekNeeded", false);
        setBooleanField(term1053088, term1053088.getClass(), "endReached", false);
        setField(term1053088, term1053088.getClass(), "blockDecoder", null);
        setField(term1053232, term1053232.getClass(), "index", term1053304);
        setIntField(term1053232, term1053232.getClass(), "blockNumber", 0);
        setField(term1053088, term1053088.getClass(), "curBlockInfo", term1053232);
        setField(term1053010, term1053010.getClass(), "in", term1053088);
        setBooleanField(term1053010, term1053010.getClass(), "isCompressed", true);
        setIntField(term1053010, term1053010.getClass(), "currBlkIdx", 0);
        setField(term1053010, term1053010.getClass(), "blockBuffer", term1052417);
        setField(term1052736, term1052736.getClass(), "raw", term1053010);
        Class<? extends Object> term1053802 = Class.forName((String) "org.apache.commons.compress.archivers.dump.DumpArchiveConstants$SEGMENT_TYPE");
        Field term1053801 = ((Class) term1053802).getDeclaredField((String) "CLRI");
        ((Field) term1053801).setAccessible(true);
        Object enum169 = ((Field) term1053801).get((Object) null);
        term1053428 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry"));
        Object term1053588 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader"));
        setLongField(term1053428, term1053428.getClass(), "size", 0L);
        setIntField(term1053588, term1053588.getClass(), "ino", 0);
        setField(term1053588, term1053588.getClass(), "type", enum169);
        setIntField(term1053588, term1053588.getClass(), "count", 0);
        setField(term1053428, term1053428.getClass(), "header", term1053588);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry");
        Object[] args = new Object[1];
        args[0] = term1053428;
        callMethod(klass, "readDirectoryEntry", argTypes, term1052736, args);
    }

};


