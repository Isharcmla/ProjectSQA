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

public class DumpArchiveInputStream_readDirectoryEntry_482549166419 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term682866;
     Object term683420;

    public DumpArchiveInputStream_readDirectoryEntry_482549166419() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term682914 = new HashMap();
        term682866 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        byte[] term682323 = (byte[]) newByteArray(0);
        Object term683140 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        Object term683218 = newInstance(Class.forName("org.tukaani.xz.SeekableXZInputStream"));
        Object term683296 = newInstance(Class.forName("org.tukaani.xz.SeekableXZInputStream"));
        byte[] term682330 = (byte[]) newByteArray(256);
        setField(term682866, term682866.getClass(), "names", term682914);
        setField(term682866, term682866.getClass(), "blockBuffer", term682323);
        setIntField(term683140, term683140.getClass(), "readOffset", 0);
        setIntField(term683140, term683140.getClass(), "blockSize", 0);
        setField(term683218, term683218.getClass(), "in", term683296);
        setField(term683140, term683140.getClass(), "in", term683218);
        setBooleanField(term683140, term683140.getClass(), "isCompressed", true);
        setIntField(term683140, term683140.getClass(), "currBlkIdx", 0);
        setField(term683140, term683140.getClass(), "blockBuffer", term682330);
        setField(term682866, term682866.getClass(), "raw", term683140);
        Class<? extends Object> term688502 = Class.forName((String) "org.apache.commons.compress.archivers.dump.DumpArchiveConstants$SEGMENT_TYPE");
        Field term688501 = ((Class) term688502).getDeclaredField((String) "END");
        ((Field) term688501).setAccessible(true);
        Object enum94 = ((Field) term688501).get((Object) null);
        term683420 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry"));
        Object term683580 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader"));
        setLongField(term683420, term683420.getClass(), "size", 0L);
        setIntField(term683580, term683580.getClass(), "ino", 0);
        setField(term683580, term683580.getClass(), "type", enum94);
        setIntField(term683580, term683580.getClass(), "count", 0);
        setField(term683420, term683420.getClass(), "header", term683580);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry");
        Object[] args = new Object[1];
        args[0] = term683420;
        try {
            callMethod(klass, "readDirectoryEntry", argTypes, term682866, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


