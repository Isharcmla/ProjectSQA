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
import java.io.IOException;
import static org.apache.commons.compress.archivers.dump.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.Object;
import java.lang.String;

public class DumpArchiveInputStream_readDirectoryEntry_482549166152 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107165;
     Object term107563;

    public DumpArchiveInputStream_readDirectoryEntry_482549166152() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term107213 = new HashMap();
        term107165 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        byte[] term106916 = (byte[]) newByteArray(0);
        Object term107439 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        setField(term107165, term107165.getClass(), "names", term107213);
        setField(term107165, term107165.getClass(), "blockBuffer", term106916);
        setIntField(term107439, term107439.getClass(), "readOffset", 0);
        setIntField(term107439, term107439.getClass(), "blockSize", 0);
        setField(term107165, term107165.getClass(), "raw", term107439);
        Class<? extends Object> term108732 = Class.forName((String) "org.apache.commons.compress.archivers.dump.DumpArchiveConstants$SEGMENT_TYPE");
        Field term108731 = ((Class) term108732).getDeclaredField((String) "ADDR");
        ((Field) term108731).setAccessible(true);
        Object enum28 = ((Field) term108731).get((Object) null);
        term107563 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry"));
        Object term107723 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader"));
        setLongField(term107563, term107563.getClass(), "size", 0L);
        setIntField(term107723, term107723.getClass(), "ino", 0);
        setField(term107723, term107723.getClass(), "type", enum28);
        setIntField(term107723, term107723.getClass(), "count", 0);
        setField(term107563, term107563.getClass(), "header", term107723);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry");
        Object[] args = new Object[1];
        args[0] = term107563;
        try {
            callMethod(klass, "readDirectoryEntry", argTypes, term107165, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


