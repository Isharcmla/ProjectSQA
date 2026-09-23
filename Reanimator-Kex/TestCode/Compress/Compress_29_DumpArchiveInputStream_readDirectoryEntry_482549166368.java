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
import org.apache.commons.compress.archivers.dump.ShortFileException;
import static org.apache.commons.compress.archivers.dump.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.Object;
import java.lang.String;

public class DumpArchiveInputStream_readDirectoryEntry_482549166368 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term581740;
     Object term582274;

    public DumpArchiveInputStream_readDirectoryEntry_482549166368() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term581788 = new HashMap();
        term581740 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        byte[] term581458 = (byte[]) newByteArray(2);
        Object term582014 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        Object term582150 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        setField(term581740, term581740.getClass(), "names", term581788);
        setField(term581740, term581740.getClass(), "blockBuffer", term581458);
        setIntField(term582014, term582014.getClass(), "readOffset", 2);
        setIntField(term582014, term582014.getClass(), "blockSize", 2);
        setBooleanField(term582150, term582150.getClass(), "hasHitEOF", true);
        setField(term582014, term582014.getClass(), "in", term582150);
        setBooleanField(term582014, term582014.getClass(), "isCompressed", true);
        setIntField(term582014, term582014.getClass(), "currBlkIdx", -1);
        setField(term582014, term582014.getClass(), "blockBuffer", term581458);
        setField(term581740, term581740.getClass(), "raw", term582014);
        Class<? extends Object> term586765 = Class.forName((String) "org.apache.commons.compress.archivers.dump.DumpArchiveConstants$SEGMENT_TYPE");
        Field term586764 = ((Class) term586765).getDeclaredField((String) "BITS");
        ((Field) term586764).setAccessible(true);
        Object enum73 = ((Field) term586764).get((Object) null);
        term582274 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry"));
        Object term582434 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader"));
        setLongField(term582274, term582274.getClass(), "size", 0L);
        setIntField(term582434, term582434.getClass(), "ino", 0);
        setField(term582434, term582434.getClass(), "type", enum73);
        setIntField(term582434, term582434.getClass(), "count", 0);
        setField(term582274, term582274.getClass(), "header", term582434);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry");
        Object[] args = new Object[1];
        args[0] = term582274;
        try {
            callMethod(klass, "readDirectoryEntry", argTypes, term581740, args);
            assertTrue(false);
        }
        catch (ShortFileException e) {
        }

    }

};


