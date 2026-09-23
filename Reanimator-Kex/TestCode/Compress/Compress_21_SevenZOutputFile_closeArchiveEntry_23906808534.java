package org.apache.commons.compress.archivers.sevenz;

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
import static org.apache.commons.compress.archivers.sevenz.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;

public class SevenZOutputFile_closeArchiveEntry_23906808534 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2678;

    public SevenZOutputFile_closeArchiveEntry_23906808534() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2683 = new ArrayList();
        ((ArrayList) term2683).add((Object)null);
        ((ArrayList) term2683).add((Object)null);
        ((ArrayList) term2683).add((Object)null);
        ((ArrayList) term2683).add((Object)null);
        ((ArrayList) term2683).add((Object)null);
        ((ArrayList) term2683).add((Object)null);
        ((ArrayList) term2683).add((Object)null);
        Object term2706 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        setField(term2706, term2706.getClass(), "name", "");
        setBooleanField(term2706, term2706.getClass(), "hasStream", false);
        setBooleanField(term2706, term2706.getClass(), "isDirectory", true);
        setBooleanField(term2706, term2706.getClass(), "isAntiItem", true);
        setBooleanField(term2706, term2706.getClass(), "hasCreationDate", true);
        setBooleanField(term2706, term2706.getClass(), "hasLastModifiedDate", true);
        setBooleanField(term2706, term2706.getClass(), "hasAccessDate", false);
        setLongField(term2706, term2706.getClass(), "creationDate", 138235087558060686L);
        setLongField(term2706, term2706.getClass(), "lastModifiedDate", 5381386339318883012L);
        setLongField(term2706, term2706.getClass(), "accessDate", -1333707622307134180L);
        setBooleanField(term2706, term2706.getClass(), "hasWindowsAttributes", false);
        setIntField(term2706, term2706.getClass(), "windowsAttributes", 679763016);
        setBooleanField(term2706, term2706.getClass(), "hasCrc", false);
        setLongField(term2706, term2706.getClass(), "crc", -4360569253593381888L);
        setLongField(term2706, term2706.getClass(), "compressedCrc", 1457594663983990440L);
        setLongField(term2706, term2706.getClass(), "size", 3452833434644634217L);
        setLongField(term2706, term2706.getClass(), "compressedSize", -8603648071751666348L);
        ArrayList term2704 = new ArrayList();
        ((ArrayList) term2704).add(term2706);
        Class<? extends Object> term18308 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term18307 = ((Class) term18308).getDeclaredField((String) "LZMA");
        ((Field) term18307).setAccessible(true);
        Object enum43 = ((Field) term18307).get((Object) null);
        term2678 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        Object term2679 = newInstance(Class.forName("java.io.RandomAccessFile"));
        Object term2680 = newInstance(Class.forName("java.io.FileDescriptor"));
        Object term2702 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicBoolean"));
        Object term2727 = newInstance(Class.forName("java.util.zip.CRC32"));
        Object term2729 = newInstance(Class.forName("java.util.zip.CRC32"));
        Object term2733 = newInstance(Class.forName("org.apache.commons.compress.utils.CountingOutputStream"));
        Object term2736 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term2680, term2680.getClass(), "fd", -1);
        setLongField(term2680, term2680.getClass(), "handle", -1L);
        setField(term2680, term2680.getClass(), "parent", null);
        setField(term2680, term2680.getClass(), "otherParents", term2683);
        setBooleanField(term2680, term2680.getClass(), "closed", false);
        setBooleanField(term2680, term2680.getClass(), "append", true);
        setField(term2680, term2680.getClass(), "cleanup", null);
        setField(term2679, term2679.getClass(), "fd", term2680);
        setField(term2679, term2679.getClass(), "channel", null);
        setBooleanField(term2679, term2679.getClass(), "rw", false);
        setField(term2679, term2679.getClass(), "path", "OclPbYPkcH");
        setIntField(term2702, term2702.getClass(), "value", -1145578966);
        setField(term2679, term2679.getClass(), "closed", term2702);
        setField(term2678, term2678.getClass(), "file", term2679);
        setField(term2678, term2678.getClass(), "files", term2704);
        setIntField(term2678, term2678.getClass(), "numNonEmptyStreams", 1962444399);
        setIntField(term2727, term2727.getClass(), "crc", 767834723);
        setField(term2678, term2678.getClass(), "crc32", term2727);
        setIntField(term2729, term2729.getClass(), "crc", -602026508);
        setField(term2678, term2678.getClass(), "compressedCrc32", term2729);
        setLongField(term2678, term2678.getClass(), "fileBytesWritten", -7884871963229073324L);
        setBooleanField(term2678, term2678.getClass(), "finished", false);
        setLongField(term2733, term2733.getClass(), "bytesWritten", -8649738738252714180L);
        setField(term2733, term2733.getClass(), "out", null);
        setBooleanField(term2733, term2733.getClass(), "closed", false);
        setField(term2733, term2733.getClass(), "closeLock", term2736);
        setField(term2678, term2678.getClass(), "currentOutputStream", term2733);
        setField(term2678, term2678.getClass(), "contentCompression", enum43);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "closeArchiveEntry", argTypes, term2678, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


