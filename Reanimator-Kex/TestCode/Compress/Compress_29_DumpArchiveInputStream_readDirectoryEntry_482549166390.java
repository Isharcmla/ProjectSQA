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

public class DumpArchiveInputStream_readDirectoryEntry_482549166390 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term638473;
     Object term638957;

    public DumpArchiveInputStream_readDirectoryEntry_482549166390() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term638521 = new HashMap();
        term638473 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        byte[] term637687 = (byte[]) newByteArray(0);
        Object term638747 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        Object term638833 = newInstance(Class.forName("java.util.zip.ZipFile$ZipFileInputStream"));
        byte[] term637694 = (byte[]) newByteArray(512);
        setField(term638473, term638473.getClass(), "names", term638521);
        setField(term638473, term638473.getClass(), "blockBuffer", term637687);
        setIntField(term638747, term638747.getClass(), "readOffset", 0);
        setIntField(term638747, term638747.getClass(), "blockSize", 0);
        setField(term638747, term638747.getClass(), "in", term638833);
        setBooleanField(term638747, term638747.getClass(), "isCompressed", true);
        setIntField(term638747, term638747.getClass(), "currBlkIdx", 0);
        setField(term638747, term638747.getClass(), "blockBuffer", term637694);
        setField(term638473, term638473.getClass(), "raw", term638747);
        Class<? extends Object> term641674 = Class.forName((String) "org.apache.commons.compress.archivers.dump.DumpArchiveConstants$SEGMENT_TYPE");
        Field term641673 = ((Class) term641674).getDeclaredField((String) "CLRI");
        ((Field) term641673).setAccessible(true);
        Object enum79 = ((Field) term641673).get((Object) null);
        term638957 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry"));
        Object term639117 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader"));
        setLongField(term638957, term638957.getClass(), "size", 0L);
        setIntField(term639117, term639117.getClass(), "ino", 0);
        setField(term639117, term639117.getClass(), "type", enum79);
        setIntField(term639117, term639117.getClass(), "count", 0);
        setField(term638957, term638957.getClass(), "header", term639117);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry");
        Object[] args = new Object[1];
        args[0] = term638957;
        try {
            callMethod(klass, "readDirectoryEntry", argTypes, term638473, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


