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

public class SevenZOutputFile_writePackInfo_31989734043 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6582;

    public SevenZOutputFile_writePackInfo_31989734043() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term6587 = new ArrayList();
        ((ArrayList) term6587).add((Object)null);
        ((ArrayList) term6587).add((Object)null);
        ((ArrayList) term6587).add((Object)null);
        ((ArrayList) term6587).add((Object)null);
        ((ArrayList) term6587).add((Object)null);
        ((ArrayList) term6587).add((Object)null);
        ((ArrayList) term6587).add((Object)null);
        Object term6610 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        setField(term6610, term6610.getClass(), "name", "");
        setBooleanField(term6610, term6610.getClass(), "hasStream", true);
        setBooleanField(term6610, term6610.getClass(), "isDirectory", true);
        setBooleanField(term6610, term6610.getClass(), "isAntiItem", false);
        setBooleanField(term6610, term6610.getClass(), "hasCreationDate", true);
        setBooleanField(term6610, term6610.getClass(), "hasLastModifiedDate", true);
        setBooleanField(term6610, term6610.getClass(), "hasAccessDate", false);
        setLongField(term6610, term6610.getClass(), "creationDate", -5207216109884759743L);
        setLongField(term6610, term6610.getClass(), "lastModifiedDate", 8765880103547975810L);
        setLongField(term6610, term6610.getClass(), "accessDate", 4552367707739103094L);
        setBooleanField(term6610, term6610.getClass(), "hasWindowsAttributes", false);
        setIntField(term6610, term6610.getClass(), "windowsAttributes", -1210583429);
        setBooleanField(term6610, term6610.getClass(), "hasCrc", false);
        setLongField(term6610, term6610.getClass(), "crc", -6001151456088965547L);
        setLongField(term6610, term6610.getClass(), "compressedCrc", 1740732617708040141L);
        setLongField(term6610, term6610.getClass(), "size", 3472971833455746664L);
        setLongField(term6610, term6610.getClass(), "compressedSize", 3731931947533293029L);
        Object term6628 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        setField(term6628, term6628.getClass(), "name", "");
        setBooleanField(term6628, term6628.getClass(), "hasStream", true);
        setBooleanField(term6628, term6628.getClass(), "isDirectory", false);
        setBooleanField(term6628, term6628.getClass(), "isAntiItem", false);
        setBooleanField(term6628, term6628.getClass(), "hasCreationDate", true);
        setBooleanField(term6628, term6628.getClass(), "hasLastModifiedDate", true);
        setBooleanField(term6628, term6628.getClass(), "hasAccessDate", false);
        setLongField(term6628, term6628.getClass(), "creationDate", 9214973322210954344L);
        setLongField(term6628, term6628.getClass(), "lastModifiedDate", 3662777917800385964L);
        setLongField(term6628, term6628.getClass(), "accessDate", -7005300544167632229L);
        setBooleanField(term6628, term6628.getClass(), "hasWindowsAttributes", false);
        setIntField(term6628, term6628.getClass(), "windowsAttributes", -663691365);
        setBooleanField(term6628, term6628.getClass(), "hasCrc", false);
        setLongField(term6628, term6628.getClass(), "crc", -278716491237139968L);
        setLongField(term6628, term6628.getClass(), "compressedCrc", -629491722907628764L);
        setLongField(term6628, term6628.getClass(), "size", -5552123402871285352L);
        setLongField(term6628, term6628.getClass(), "compressedSize", -5587528177305224828L);
        ArrayList term6608 = new ArrayList();
        ((ArrayList) term6608).add(term6610);
        ((ArrayList) term6608).add(term6628);
        Class<? extends Object> term28388 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term28387 = ((Class) term28388).getDeclaredField((String) "LZMA2");
        ((Field) term28387).setAccessible(true);
        Object enum58 = ((Field) term28387).get((Object) null);
        term6582 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        Object term6583 = newInstance(Class.forName("java.io.RandomAccessFile"));
        Object term6584 = newInstance(Class.forName("java.io.FileDescriptor"));
        Object term6606 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicBoolean"));
        Object term6649 = newInstance(Class.forName("java.util.zip.CRC32"));
        Object term6651 = newInstance(Class.forName("java.util.zip.CRC32"));
        Object term6655 = newInstance(Class.forName("org.apache.commons.compress.utils.CountingOutputStream"));
        Object term6658 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term6584, term6584.getClass(), "fd", -1);
        setLongField(term6584, term6584.getClass(), "handle", -1L);
        setField(term6584, term6584.getClass(), "parent", null);
        setField(term6584, term6584.getClass(), "otherParents", term6587);
        setBooleanField(term6584, term6584.getClass(), "closed", false);
        setBooleanField(term6584, term6584.getClass(), "append", false);
        setField(term6584, term6584.getClass(), "cleanup", null);
        setField(term6583, term6583.getClass(), "fd", term6584);
        setField(term6583, term6583.getClass(), "channel", null);
        setBooleanField(term6583, term6583.getClass(), "rw", false);
        setField(term6583, term6583.getClass(), "path", "eqJfYWRaEL");
        setIntField(term6606, term6606.getClass(), "value", -268815336);
        setField(term6583, term6583.getClass(), "closed", term6606);
        setField(term6582, term6582.getClass(), "file", term6583);
        setField(term6582, term6582.getClass(), "files", term6608);
        setIntField(term6582, term6582.getClass(), "numNonEmptyStreams", 339854490);
        setIntField(term6649, term6649.getClass(), "crc", -615654495);
        setField(term6582, term6582.getClass(), "crc32", term6649);
        setIntField(term6651, term6651.getClass(), "crc", -1476117762);
        setField(term6582, term6582.getClass(), "compressedCrc32", term6651);
        setLongField(term6582, term6582.getClass(), "fileBytesWritten", 7950532649535587877L);
        setBooleanField(term6582, term6582.getClass(), "finished", false);
        setLongField(term6655, term6655.getClass(), "bytesWritten", 7799452759993694308L);
        setField(term6655, term6655.getClass(), "out", null);
        setBooleanField(term6655, term6655.getClass(), "closed", false);
        setField(term6655, term6655.getClass(), "closeLock", term6658);
        setField(term6582, term6582.getClass(), "currentOutputStream", term6655);
        setField(term6582, term6582.getClass(), "contentCompression", enum58);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.DataOutput");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "writePackInfo", argTypes, term6582, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


