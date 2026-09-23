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

public class DumpArchiveInputStream_readDirectoryEntry_482549166472 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term810952;
     Object term811510;

    public DumpArchiveInputStream_readDirectoryEntry_482549166472() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term811000 = new HashMap();
        term810952 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        byte[] term810597 = (byte[]) newByteArray(0);
        Object term811226 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        Object term811304 = newInstance(Class.forName("org.tukaani.xz.SeekableXZInputStream"));
        Object term811386 = newInstance(Class.forName("org.tukaani.xz.SeekableFileInputStream"));
        byte[] term810604 = (byte[]) newByteArray(64);
        setField(term810952, term810952.getClass(), "names", term811000);
        setField(term810952, term810952.getClass(), "blockBuffer", term810597);
        setIntField(term811226, term811226.getClass(), "readOffset", 0);
        setIntField(term811226, term811226.getClass(), "blockSize", 0);
        setField(term811304, term811304.getClass(), "in", term811386);
        setField(term811304, term811304.getClass(), "exception", null);
        setBooleanField(term811304, term811304.getClass(), "seekNeeded", true);
        setField(term811226, term811226.getClass(), "in", term811304);
        setBooleanField(term811226, term811226.getClass(), "isCompressed", true);
        setIntField(term811226, term811226.getClass(), "currBlkIdx", 0);
        setField(term811226, term811226.getClass(), "blockBuffer", term810604);
        setField(term810952, term810952.getClass(), "raw", term811226);
        Class<? extends Object> term813229 = Class.forName((String) "org.apache.commons.compress.archivers.dump.DumpArchiveConstants$SEGMENT_TYPE");
        Field term813228 = ((Class) term813229).getDeclaredField((String) "CLRI");
        ((Field) term813228).setAccessible(true);
        Object enum127 = ((Field) term813228).get((Object) null);
        term811510 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry"));
        Object term811670 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader"));
        setLongField(term811510, term811510.getClass(), "size", 0L);
        setIntField(term811670, term811670.getClass(), "ino", 0);
        setField(term811670, term811670.getClass(), "type", enum127);
        setIntField(term811670, term811670.getClass(), "count", 0);
        setField(term811510, term811510.getClass(), "header", term811670);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry");
        Object[] args = new Object[1];
        args[0] = term811510;
        try {
            callMethod(klass, "readDirectoryEntry", argTypes, term810952, args);
            assertTrue(false);
        }
        catch (ShortFileException e) {
        }

    }

};


