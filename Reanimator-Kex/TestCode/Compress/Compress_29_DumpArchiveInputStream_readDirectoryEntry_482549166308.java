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

public class DumpArchiveInputStream_readDirectoryEntry_482549166308 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term429981;
     Object term430515;

    public DumpArchiveInputStream_readDirectoryEntry_482549166308() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term430029 = new HashMap();
        term429981 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        byte[] term429328 = (byte[]) newByteArray(128);
        Object term430255 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        Object term430391 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        setField(term429981, term429981.getClass(), "names", term430029);
        setField(term429981, term429981.getClass(), "blockBuffer", term429328);
        setIntField(term430255, term430255.getClass(), "readOffset", 1);
        setIntField(term430255, term430255.getClass(), "blockSize", 1);
        setField(term430255, term430255.getClass(), "in", term430391);
        setBooleanField(term430255, term430255.getClass(), "isCompressed", true);
        setIntField(term430255, term430255.getClass(), "currBlkIdx", -1);
        setField(term430255, term430255.getClass(), "blockBuffer", term429328);
        setField(term429981, term429981.getClass(), "raw", term430255);
        Class<? extends Object> term432586 = Class.forName((String) "org.apache.commons.compress.archivers.dump.DumpArchiveConstants$SEGMENT_TYPE");
        Field term432585 = ((Class) term432586).getDeclaredField((String) "ADDR");
        ((Field) term432585).setAccessible(true);
        Object enum55 = ((Field) term432585).get((Object) null);
        term430515 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry"));
        Object term430675 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader"));
        setLongField(term430515, term430515.getClass(), "size", 0L);
        setIntField(term430675, term430675.getClass(), "ino", 0);
        setField(term430675, term430675.getClass(), "type", enum55);
        setIntField(term430675, term430675.getClass(), "count", 0);
        setField(term430515, term430515.getClass(), "header", term430675);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry");
        Object[] args = new Object[1];
        args[0] = term430515;
        try {
            callMethod(klass, "readDirectoryEntry", argTypes, term429981, args);
            assertTrue(false);
        }
        catch (ShortFileException e) {
        }

    }

};


