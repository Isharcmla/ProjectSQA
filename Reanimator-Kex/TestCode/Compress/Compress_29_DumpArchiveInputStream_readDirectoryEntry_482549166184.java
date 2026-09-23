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

public class DumpArchiveInputStream_readDirectoryEntry_482549166184 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term155898;
     Object term156432;

    public DumpArchiveInputStream_readDirectoryEntry_482549166184() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term155946 = new HashMap();
        term155898 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        byte[] term155647 = (byte[]) newByteArray(0);
        Object term156172 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        Object term156308 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        setField(term155898, term155898.getClass(), "names", term155946);
        setField(term155898, term155898.getClass(), "blockBuffer", term155647);
        setIntField(term156172, term156172.getClass(), "readOffset", 0);
        setIntField(term156172, term156172.getClass(), "blockSize", 0);
        setField(term156172, term156172.getClass(), "in", term156308);
        setField(term155898, term155898.getClass(), "raw", term156172);
        Class<? extends Object> term159914 = Class.forName((String) "org.apache.commons.compress.archivers.dump.DumpArchiveConstants$SEGMENT_TYPE");
        Field term159913 = ((Class) term159914).getDeclaredField((String) "BITS");
        ((Field) term159913).setAccessible(true);
        Object enum31 = ((Field) term159913).get((Object) null);
        term156432 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry"));
        Object term156592 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader"));
        setLongField(term156432, term156432.getClass(), "size", 0L);
        setIntField(term156592, term156592.getClass(), "ino", 0);
        setField(term156592, term156592.getClass(), "type", enum31);
        setIntField(term156592, term156592.getClass(), "count", 0);
        setField(term156432, term156432.getClass(), "header", term156592);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry");
        Object[] args = new Object[1];
        args[0] = term156432;
        try {
            callMethod(klass, "readDirectoryEntry", argTypes, term155898, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


