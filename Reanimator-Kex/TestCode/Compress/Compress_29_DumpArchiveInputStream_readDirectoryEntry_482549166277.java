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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.apache.commons.compress.archivers.dump.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.Object;
import java.lang.String;

public class DumpArchiveInputStream_readDirectoryEntry_482549166277 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term340578;
     Object term341032;

    public DumpArchiveInputStream_readDirectoryEntry_482549166277() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term340626 = new HashMap();
        term340578 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        byte[] term340313 = (byte[]) newByteArray(0);
        Object term340852 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        Object term340908 = newInstance(Class.forName("java.io.FilterInputStream"));
        byte[] term340320 = (byte[]) newByteArray(0);
        setField(term340578, term340578.getClass(), "names", term340626);
        setField(term340578, term340578.getClass(), "blockBuffer", term340313);
        setIntField(term340852, term340852.getClass(), "readOffset", 0);
        setIntField(term340852, term340852.getClass(), "blockSize", 0);
        setField(term340852, term340852.getClass(), "in", term340908);
        setBooleanField(term340852, term340852.getClass(), "isCompressed", true);
        setIntField(term340852, term340852.getClass(), "currBlkIdx", -1);
        setField(term340852, term340852.getClass(), "blockBuffer", term340320);
        setField(term340578, term340578.getClass(), "raw", term340852);
        Class<? extends Object> term351640 = Class.forName((String) "org.apache.commons.compress.archivers.dump.DumpArchiveConstants$SEGMENT_TYPE");
        Field term351639 = ((Class) term351640).getDeclaredField((String) "CLRI");
        ((Field) term351639).setAccessible(true);
        Object enum52 = ((Field) term351639).get((Object) null);
        term341032 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry"));
        Object term341192 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader"));
        setLongField(term341032, term341032.getClass(), "size", 0L);
        setIntField(term341192, term341192.getClass(), "ino", 0);
        setField(term341192, term341192.getClass(), "type", enum52);
        setIntField(term341192, term341192.getClass(), "count", 0);
        setField(term341032, term341032.getClass(), "header", term341192);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry");
        Object[] args = new Object[1];
        args[0] = term341032;
        try {
            callMethod(klass, "readDirectoryEntry", argTypes, term340578, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


