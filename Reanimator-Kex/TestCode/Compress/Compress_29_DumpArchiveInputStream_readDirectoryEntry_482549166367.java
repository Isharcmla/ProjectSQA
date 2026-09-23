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

public class DumpArchiveInputStream_readDirectoryEntry_482549166367 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term579319;
     Object term579853;

    public DumpArchiveInputStream_readDirectoryEntry_482549166367() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term579367 = new HashMap();
        term579319 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        byte[] term578483 = (byte[]) newByteArray(4);
        Object term579593 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        Object term579729 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        byte[] term578525 = (byte[]) newByteArray(521);
        setField(term579319, term579319.getClass(), "names", term579367);
        setByteElement(term578483, 0, (byte) 67);
        setByteElement(term578483, 1, (byte) 76);
        setByteElement(term578483, 2, (byte) 82);
        setByteElement(term578483, 3, (byte) 73);
        setField(term579319, term579319.getClass(), "blockBuffer", term578483);
        setIntField(term579593, term579593.getClass(), "readOffset", 10);
        setIntField(term579593, term579593.getClass(), "blockSize", 10);
        setBooleanField(term579729, term579729.getClass(), "hasHitEOF", false);
        setBooleanField(term579729, term579729.getClass(), "isClosed", true);
        setField(term579593, term579593.getClass(), "in", term579729);
        setBooleanField(term579593, term579593.getClass(), "isCompressed", true);
        setIntField(term579593, term579593.getClass(), "currBlkIdx", -1);
        setField(term579593, term579593.getClass(), "blockBuffer", term578525);
        setField(term579319, term579319.getClass(), "raw", term579593);
        Class<? extends Object> term585276 = Class.forName((String) "org.apache.commons.compress.archivers.dump.DumpArchiveConstants$SEGMENT_TYPE");
        Field term585275 = ((Class) term585276).getDeclaredField((String) "TAPE");
        ((Field) term585275).setAccessible(true);
        Object enum71 = ((Field) term585275).get((Object) null);
        term579853 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry"));
        Object term580013 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader"));
        setLongField(term579853, term579853.getClass(), "size", 0L);
        setIntField(term580013, term580013.getClass(), "ino", 0);
        setField(term580013, term580013.getClass(), "type", enum71);
        setIntField(term580013, term580013.getClass(), "count", 0);
        setField(term579853, term579853.getClass(), "header", term580013);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry");
        Object[] args = new Object[1];
        args[0] = term579853;
        try {
            callMethod(klass, "readDirectoryEntry", argTypes, term579319, args);
            assertTrue(false);
        }
        catch (ShortFileException e) {
        }

    }

};


