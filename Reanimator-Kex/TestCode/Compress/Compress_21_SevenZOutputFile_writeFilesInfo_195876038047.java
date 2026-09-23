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

public class SevenZOutputFile_writeFilesInfo_195876038047 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8392;

    public SevenZOutputFile_writeFilesInfo_195876038047() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term8397 = new ArrayList();
        ((ArrayList) term8397).add((Object)null);
        ((ArrayList) term8397).add((Object)null);
        ((ArrayList) term8397).add((Object)null);
        ((ArrayList) term8397).add((Object)null);
        ((ArrayList) term8397).add((Object)null);
        Object term8420 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        setField(term8420, term8420.getClass(), "name", "");
        setBooleanField(term8420, term8420.getClass(), "hasStream", true);
        setBooleanField(term8420, term8420.getClass(), "isDirectory", true);
        setBooleanField(term8420, term8420.getClass(), "isAntiItem", true);
        setBooleanField(term8420, term8420.getClass(), "hasCreationDate", true);
        setBooleanField(term8420, term8420.getClass(), "hasLastModifiedDate", true);
        setBooleanField(term8420, term8420.getClass(), "hasAccessDate", true);
        setLongField(term8420, term8420.getClass(), "creationDate", -6254265799185295775L);
        setLongField(term8420, term8420.getClass(), "lastModifiedDate", 3831994970480278159L);
        setLongField(term8420, term8420.getClass(), "accessDate", -5714578622746827780L);
        setBooleanField(term8420, term8420.getClass(), "hasWindowsAttributes", true);
        setIntField(term8420, term8420.getClass(), "windowsAttributes", -2063457669);
        setBooleanField(term8420, term8420.getClass(), "hasCrc", true);
        setLongField(term8420, term8420.getClass(), "crc", 8918129626022907229L);
        setLongField(term8420, term8420.getClass(), "compressedCrc", 6269054578518955349L);
        setLongField(term8420, term8420.getClass(), "size", -143609946830350439L);
        setLongField(term8420, term8420.getClass(), "compressedSize", 2018084438165711668L);
        ArrayList term8418 = new ArrayList();
        ((ArrayList) term8418).add(term8420);
        Class<? extends Object> term30654 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term30653 = ((Class) term30654).getDeclaredField((String) "DEFLATE");
        ((Field) term30653).setAccessible(true);
        Object enum62 = ((Field) term30653).get((Object) null);
        term8392 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        Object term8393 = newInstance(Class.forName("java.io.RandomAccessFile"));
        Object term8394 = newInstance(Class.forName("java.io.FileDescriptor"));
        Object term8416 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicBoolean"));
        Object term8441 = newInstance(Class.forName("java.util.zip.CRC32"));
        Object term8443 = newInstance(Class.forName("java.util.zip.CRC32"));
        Object term8447 = newInstance(Class.forName("org.apache.commons.compress.utils.CountingOutputStream"));
        Object term8450 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term8394, term8394.getClass(), "fd", -1);
        setLongField(term8394, term8394.getClass(), "handle", -1L);
        setField(term8394, term8394.getClass(), "parent", null);
        setField(term8394, term8394.getClass(), "otherParents", term8397);
        setBooleanField(term8394, term8394.getClass(), "closed", false);
        setBooleanField(term8394, term8394.getClass(), "append", false);
        setField(term8394, term8394.getClass(), "cleanup", null);
        setField(term8393, term8393.getClass(), "fd", term8394);
        setField(term8393, term8393.getClass(), "channel", null);
        setBooleanField(term8393, term8393.getClass(), "rw", true);
        setField(term8393, term8393.getClass(), "path", "LvJFtLBaxj");
        setIntField(term8416, term8416.getClass(), "value", -2015048153);
        setField(term8393, term8393.getClass(), "closed", term8416);
        setField(term8392, term8392.getClass(), "file", term8393);
        setField(term8392, term8392.getClass(), "files", term8418);
        setIntField(term8392, term8392.getClass(), "numNonEmptyStreams", -1222006000);
        setIntField(term8441, term8441.getClass(), "crc", 2095798786);
        setField(term8392, term8392.getClass(), "crc32", term8441);
        setIntField(term8443, term8443.getClass(), "crc", -1565502840);
        setField(term8392, term8392.getClass(), "compressedCrc32", term8443);
        setLongField(term8392, term8392.getClass(), "fileBytesWritten", -8705953038984862378L);
        setBooleanField(term8392, term8392.getClass(), "finished", true);
        setLongField(term8447, term8447.getClass(), "bytesWritten", -7589547201844161961L);
        setField(term8447, term8447.getClass(), "out", null);
        setBooleanField(term8447, term8447.getClass(), "closed", false);
        setField(term8447, term8447.getClass(), "closeLock", term8450);
        setField(term8392, term8392.getClass(), "currentOutputStream", term8447);
        setField(term8392, term8392.getClass(), "contentCompression", enum62);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.DataOutput");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "writeFilesInfo", argTypes, term8392, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


