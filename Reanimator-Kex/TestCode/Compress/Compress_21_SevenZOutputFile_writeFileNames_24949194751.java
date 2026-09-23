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

public class SevenZOutputFile_writeFileNames_24949194751 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10234;

    public SevenZOutputFile_writeFileNames_24949194751() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term10239 = new ArrayList();
        ((ArrayList) term10239).add((Object)null);
        ((ArrayList) term10239).add((Object)null);
        ((ArrayList) term10239).add((Object)null);
        ((ArrayList) term10239).add((Object)null);
        ((ArrayList) term10239).add((Object)null);
        ((ArrayList) term10239).add((Object)null);
        ((ArrayList) term10239).add((Object)null);
        ((ArrayList) term10239).add((Object)null);
        Object term10262 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        setField(term10262, term10262.getClass(), "name", "");
        setBooleanField(term10262, term10262.getClass(), "hasStream", true);
        setBooleanField(term10262, term10262.getClass(), "isDirectory", false);
        setBooleanField(term10262, term10262.getClass(), "isAntiItem", true);
        setBooleanField(term10262, term10262.getClass(), "hasCreationDate", false);
        setBooleanField(term10262, term10262.getClass(), "hasLastModifiedDate", true);
        setBooleanField(term10262, term10262.getClass(), "hasAccessDate", true);
        setLongField(term10262, term10262.getClass(), "creationDate", 3288572082902580031L);
        setLongField(term10262, term10262.getClass(), "lastModifiedDate", -8698230272673009418L);
        setLongField(term10262, term10262.getClass(), "accessDate", -8792567429538693571L);
        setBooleanField(term10262, term10262.getClass(), "hasWindowsAttributes", false);
        setIntField(term10262, term10262.getClass(), "windowsAttributes", -1885090354);
        setBooleanField(term10262, term10262.getClass(), "hasCrc", true);
        setLongField(term10262, term10262.getClass(), "crc", 3810487266967550400L);
        setLongField(term10262, term10262.getClass(), "compressedCrc", 8965244485590834147L);
        setLongField(term10262, term10262.getClass(), "size", -4825509285016265943L);
        setLongField(term10262, term10262.getClass(), "compressedSize", -1283563319051310751L);
        Object term10280 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        setField(term10280, term10280.getClass(), "name", "");
        setBooleanField(term10280, term10280.getClass(), "hasStream", false);
        setBooleanField(term10280, term10280.getClass(), "isDirectory", false);
        setBooleanField(term10280, term10280.getClass(), "isAntiItem", false);
        setBooleanField(term10280, term10280.getClass(), "hasCreationDate", false);
        setBooleanField(term10280, term10280.getClass(), "hasLastModifiedDate", false);
        setBooleanField(term10280, term10280.getClass(), "hasAccessDate", false);
        setLongField(term10280, term10280.getClass(), "creationDate", -1413653349314156044L);
        setLongField(term10280, term10280.getClass(), "lastModifiedDate", 742593745847006219L);
        setLongField(term10280, term10280.getClass(), "accessDate", 6801904611028883308L);
        setBooleanField(term10280, term10280.getClass(), "hasWindowsAttributes", true);
        setIntField(term10280, term10280.getClass(), "windowsAttributes", -2066804303);
        setBooleanField(term10280, term10280.getClass(), "hasCrc", false);
        setLongField(term10280, term10280.getClass(), "crc", -7717027128782374599L);
        setLongField(term10280, term10280.getClass(), "compressedCrc", 4872921045907555824L);
        setLongField(term10280, term10280.getClass(), "size", 6921855906793748590L);
        setLongField(term10280, term10280.getClass(), "compressedSize", 7450182989722198450L);
        Object term10298 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        setField(term10298, term10298.getClass(), "name", "");
        setBooleanField(term10298, term10298.getClass(), "hasStream", true);
        setBooleanField(term10298, term10298.getClass(), "isDirectory", true);
        setBooleanField(term10298, term10298.getClass(), "isAntiItem", true);
        setBooleanField(term10298, term10298.getClass(), "hasCreationDate", true);
        setBooleanField(term10298, term10298.getClass(), "hasLastModifiedDate", false);
        setBooleanField(term10298, term10298.getClass(), "hasAccessDate", false);
        setLongField(term10298, term10298.getClass(), "creationDate", 675601558105654203L);
        setLongField(term10298, term10298.getClass(), "lastModifiedDate", -6481933642917183045L);
        setLongField(term10298, term10298.getClass(), "accessDate", 2054808971423494757L);
        setBooleanField(term10298, term10298.getClass(), "hasWindowsAttributes", false);
        setIntField(term10298, term10298.getClass(), "windowsAttributes", -1731761810);
        setBooleanField(term10298, term10298.getClass(), "hasCrc", false);
        setLongField(term10298, term10298.getClass(), "crc", 8734518435788772658L);
        setLongField(term10298, term10298.getClass(), "compressedCrc", 2289954139848415685L);
        setLongField(term10298, term10298.getClass(), "size", -6137280723045949220L);
        setLongField(term10298, term10298.getClass(), "compressedSize", -7787918913179897745L);
        ArrayList term10260 = new ArrayList();
        ((ArrayList) term10260).add(term10262);
        ((ArrayList) term10260).add(term10280);
        ((ArrayList) term10260).add(term10298);
        Class<? extends Object> term33313 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term33312 = ((Class) term33313).getDeclaredField((String) "DEFLATE");
        ((Field) term33312).setAccessible(true);
        Object enum66 = ((Field) term33312).get((Object) null);
        term10234 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        Object term10235 = newInstance(Class.forName("java.io.RandomAccessFile"));
        Object term10236 = newInstance(Class.forName("java.io.FileDescriptor"));
        Object term10258 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicBoolean"));
        Object term10319 = newInstance(Class.forName("java.util.zip.CRC32"));
        Object term10321 = newInstance(Class.forName("java.util.zip.CRC32"));
        Object term10325 = newInstance(Class.forName("org.apache.commons.compress.utils.CountingOutputStream"));
        Object term10328 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term10236, term10236.getClass(), "fd", -1);
        setLongField(term10236, term10236.getClass(), "handle", -1L);
        setField(term10236, term10236.getClass(), "parent", null);
        setField(term10236, term10236.getClass(), "otherParents", term10239);
        setBooleanField(term10236, term10236.getClass(), "closed", false);
        setBooleanField(term10236, term10236.getClass(), "append", false);
        setField(term10236, term10236.getClass(), "cleanup", null);
        setField(term10235, term10235.getClass(), "fd", term10236);
        setField(term10235, term10235.getClass(), "channel", null);
        setBooleanField(term10235, term10235.getClass(), "rw", true);
        setField(term10235, term10235.getClass(), "path", "fztQhjqwdP");
        setIntField(term10258, term10258.getClass(), "value", 663292551);
        setField(term10235, term10235.getClass(), "closed", term10258);
        setField(term10234, term10234.getClass(), "file", term10235);
        setField(term10234, term10234.getClass(), "files", term10260);
        setIntField(term10234, term10234.getClass(), "numNonEmptyStreams", 197109649);
        setIntField(term10319, term10319.getClass(), "crc", -1239406390);
        setField(term10234, term10234.getClass(), "crc32", term10319);
        setIntField(term10321, term10321.getClass(), "crc", 1557431527);
        setField(term10234, term10234.getClass(), "compressedCrc32", term10321);
        setLongField(term10234, term10234.getClass(), "fileBytesWritten", 9173715346996433126L);
        setBooleanField(term10234, term10234.getClass(), "finished", true);
        setLongField(term10325, term10325.getClass(), "bytesWritten", -3243599172737171562L);
        setField(term10325, term10325.getClass(), "out", null);
        setBooleanField(term10325, term10325.getClass(), "closed", false);
        setField(term10325, term10325.getClass(), "closeLock", term10328);
        setField(term10234, term10234.getClass(), "currentOutputStream", term10325);
        setField(term10234, term10234.getClass(), "contentCompression", enum66);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.DataOutput");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "writeFileNames", argTypes, term10234, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


