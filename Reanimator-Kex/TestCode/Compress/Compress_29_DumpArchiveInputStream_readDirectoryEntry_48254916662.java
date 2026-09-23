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
import java.io.EOFException;
import static org.apache.commons.compress.archivers.dump.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.Object;
import java.lang.String;

public class DumpArchiveInputStream_readDirectoryEntry_48254916662 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47128;
     Object term47526;

    public DumpArchiveInputStream_readDirectoryEntry_48254916662() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term47176 = new HashMap();
        term47128 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        byte[] term46887 = (byte[]) newByteArray(0);
        Object term47402 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        setField(term47128, term47128.getClass(), "names", term47176);
        setField(term47128, term47128.getClass(), "blockBuffer", term46887);
        setField(term47128, term47128.getClass(), "raw", term47402);
        Class<? extends Object> term48944 = Class.forName((String) "org.apache.commons.compress.archivers.dump.DumpArchiveConstants$SEGMENT_TYPE");
        Field term48943 = ((Class) term48944).getDeclaredField((String) "ADDR");
        ((Field) term48943).setAccessible(true);
        Object enum22 = ((Field) term48943).get((Object) null);
        term47526 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry"));
        Object term47686 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader"));
        setLongField(term47526, term47526.getClass(), "size", 0L);
        setIntField(term47686, term47686.getClass(), "ino", 0);
        setField(term47686, term47686.getClass(), "type", enum22);
        setIntField(term47686, term47686.getClass(), "count", 2097153);
        setField(term47526, term47526.getClass(), "header", term47686);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry");
        Object[] args = new Object[1];
        args[0] = term47526;
        try {
            callMethod(klass, "readDirectoryEntry", argTypes, term47128, args);
            assertTrue(false);
        }
        catch (EOFException e) {
        }

    }

};


