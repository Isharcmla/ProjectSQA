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

public class DumpArchiveInputStream_readDirectoryEntry_482549166530 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term955709;
     Object term956333;

    public DumpArchiveInputStream_readDirectoryEntry_482549166530() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term955757 = new HashMap();
        term955709 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        byte[] term955149 = (byte[]) newByteArray(0);
        Object term955983 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        Object term956061 = newInstance(Class.forName("org.tukaani.xz.SeekableXZInputStream"));
        Object term956143 = newInstance(Class.forName("org.tukaani.xz.SeekableFileInputStream"));
        Object term956209 = newInstance(Class.forName("org.tukaani.xz.index.BlockInfo"));
        byte[] term955156 = (byte[]) newByteArray(256);
        setField(term955709, term955709.getClass(), "names", term955757);
        setField(term955709, term955709.getClass(), "blockBuffer", term955149);
        setIntField(term955983, term955983.getClass(), "readOffset", 0);
        setIntField(term955983, term955983.getClass(), "blockSize", 0);
        setField(term956061, term956061.getClass(), "in", term956143);
        setField(term956061, term956061.getClass(), "exception", null);
        setBooleanField(term956061, term956061.getClass(), "seekNeeded", false);
        setBooleanField(term956061, term956061.getClass(), "endReached", false);
        setField(term956061, term956061.getClass(), "blockDecoder", null);
        setField(term956061, term956061.getClass(), "curBlockInfo", term956209);
        setField(term955983, term955983.getClass(), "in", term956061);
        setBooleanField(term955983, term955983.getClass(), "isCompressed", true);
        setIntField(term955983, term955983.getClass(), "currBlkIdx", 0);
        setField(term955983, term955983.getClass(), "blockBuffer", term955156);
        setField(term955709, term955709.getClass(), "raw", term955983);
        Class<? extends Object> term958282 = Class.forName((String) "org.apache.commons.compress.archivers.dump.DumpArchiveConstants$SEGMENT_TYPE");
        Field term958281 = ((Class) term958282).getDeclaredField((String) "END");
        ((Field) term958281).setAccessible(true);
        Object enum148 = ((Field) term958281).get((Object) null);
        term956333 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry"));
        Object term956493 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader"));
        setLongField(term956333, term956333.getClass(), "size", 0L);
        setIntField(term956493, term956493.getClass(), "ino", 0);
        setField(term956493, term956493.getClass(), "type", enum148);
        setIntField(term956493, term956493.getClass(), "count", 0);
        setField(term956333, term956333.getClass(), "header", term956493);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry");
        Object[] args = new Object[1];
        args[0] = term956333;
        try {
            callMethod(klass, "readDirectoryEntry", argTypes, term955709, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


