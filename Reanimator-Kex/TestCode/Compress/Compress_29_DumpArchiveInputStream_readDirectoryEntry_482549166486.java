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

public class DumpArchiveInputStream_readDirectoryEntry_482549166486 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term846161;
     Object term846715;

    public DumpArchiveInputStream_readDirectoryEntry_482549166486() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term846209 = new HashMap();
        term846161 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        byte[] term845836 = (byte[]) newByteArray(0);
        Object term846435 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        Object term846513 = newInstance(Class.forName("org.tukaani.xz.SeekableXZInputStream"));
        Object term846591 = newInstance(Class.forName("org.tukaani.xz.SeekableXZInputStream"));
        byte[] term845843 = (byte[]) newByteArray(32);
        setField(term846161, term846161.getClass(), "names", term846209);
        setField(term846161, term846161.getClass(), "blockBuffer", term845836);
        setIntField(term846435, term846435.getClass(), "readOffset", 0);
        setIntField(term846435, term846435.getClass(), "blockSize", 0);
        setField(term846513, term846513.getClass(), "in", term846591);
        setField(term846513, term846513.getClass(), "exception", null);
        setBooleanField(term846513, term846513.getClass(), "seekNeeded", false);
        setBooleanField(term846513, term846513.getClass(), "endReached", true);
        setField(term846435, term846435.getClass(), "in", term846513);
        setBooleanField(term846435, term846435.getClass(), "isCompressed", true);
        setIntField(term846435, term846435.getClass(), "currBlkIdx", 0);
        setField(term846435, term846435.getClass(), "blockBuffer", term845843);
        setField(term846161, term846161.getClass(), "raw", term846435);
        Class<? extends Object> term848311 = Class.forName((String) "org.apache.commons.compress.archivers.dump.DumpArchiveConstants$SEGMENT_TYPE");
        Field term848310 = ((Class) term848311).getDeclaredField((String) "ADDR");
        ((Field) term848310).setAccessible(true);
        Object enum133 = ((Field) term848310).get((Object) null);
        term846715 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry"));
        Object term846875 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader"));
        setLongField(term846715, term846715.getClass(), "size", 0L);
        setIntField(term846875, term846875.getClass(), "ino", 0);
        setField(term846875, term846875.getClass(), "type", enum133);
        setIntField(term846875, term846875.getClass(), "count", 0);
        setField(term846715, term846715.getClass(), "header", term846875);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry");
        Object[] args = new Object[1];
        args[0] = term846715;
        try {
            callMethod(klass, "readDirectoryEntry", argTypes, term846161, args);
            assertTrue(false);
        }
        catch (ShortFileException e) {
        }

    }

};


