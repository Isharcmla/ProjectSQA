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
import java.lang.Long;

public class SevenZOutputFile_writeUint64_12051481756 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12585;
     Object term12672;

    public SevenZOutputFile_writeUint64_12051481756() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term12590 = new ArrayList();
        Object term12613 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        setField(term12613, term12613.getClass(), "name", "");
        setBooleanField(term12613, term12613.getClass(), "hasStream", true);
        setBooleanField(term12613, term12613.getClass(), "isDirectory", true);
        setBooleanField(term12613, term12613.getClass(), "isAntiItem", false);
        setBooleanField(term12613, term12613.getClass(), "hasCreationDate", false);
        setBooleanField(term12613, term12613.getClass(), "hasLastModifiedDate", true);
        setBooleanField(term12613, term12613.getClass(), "hasAccessDate", true);
        setLongField(term12613, term12613.getClass(), "creationDate", 8242382965219431687L);
        setLongField(term12613, term12613.getClass(), "lastModifiedDate", -3092537062189928451L);
        setLongField(term12613, term12613.getClass(), "accessDate", -6645699856048951433L);
        setBooleanField(term12613, term12613.getClass(), "hasWindowsAttributes", false);
        setIntField(term12613, term12613.getClass(), "windowsAttributes", -159494544);
        setBooleanField(term12613, term12613.getClass(), "hasCrc", true);
        setLongField(term12613, term12613.getClass(), "crc", -1721083210597101555L);
        setLongField(term12613, term12613.getClass(), "compressedCrc", 937792282597213200L);
        setLongField(term12613, term12613.getClass(), "size", -6096027338784768449L);
        setLongField(term12613, term12613.getClass(), "compressedSize", 6338971839666144092L);
        Object term12631 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        setField(term12631, term12631.getClass(), "name", "");
        setBooleanField(term12631, term12631.getClass(), "hasStream", true);
        setBooleanField(term12631, term12631.getClass(), "isDirectory", true);
        setBooleanField(term12631, term12631.getClass(), "isAntiItem", true);
        setBooleanField(term12631, term12631.getClass(), "hasCreationDate", true);
        setBooleanField(term12631, term12631.getClass(), "hasLastModifiedDate", false);
        setBooleanField(term12631, term12631.getClass(), "hasAccessDate", true);
        setLongField(term12631, term12631.getClass(), "creationDate", 5295517562699482299L);
        setLongField(term12631, term12631.getClass(), "lastModifiedDate", -7671399023433976259L);
        setLongField(term12631, term12631.getClass(), "accessDate", -8653467709084853156L);
        setBooleanField(term12631, term12631.getClass(), "hasWindowsAttributes", false);
        setIntField(term12631, term12631.getClass(), "windowsAttributes", -75206835);
        setBooleanField(term12631, term12631.getClass(), "hasCrc", false);
        setLongField(term12631, term12631.getClass(), "crc", 6135782592145916721L);
        setLongField(term12631, term12631.getClass(), "compressedCrc", 7930227263182470549L);
        setLongField(term12631, term12631.getClass(), "size", -2571841019708046378L);
        setLongField(term12631, term12631.getClass(), "compressedSize", -4682102699090617454L);
        ArrayList term12611 = new ArrayList();
        ((ArrayList) term12611).add(term12613);
        ((ArrayList) term12611).add(term12631);
        Class<? extends Object> term36806 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term36805 = ((Class) term36806).getDeclaredField((String) "COPY");
        ((Field) term36805).setAccessible(true);
        Object enum71 = ((Field) term36805).get((Object) null);
        term12585 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        Object term12586 = newInstance(Class.forName("java.io.RandomAccessFile"));
        Object term12587 = newInstance(Class.forName("java.io.FileDescriptor"));
        Object term12609 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicBoolean"));
        Object term12652 = newInstance(Class.forName("java.util.zip.CRC32"));
        Object term12654 = newInstance(Class.forName("java.util.zip.CRC32"));
        Object term12658 = newInstance(Class.forName("org.apache.commons.compress.utils.CountingOutputStream"));
        Object term12661 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term12587, term12587.getClass(), "fd", -1);
        setLongField(term12587, term12587.getClass(), "handle", -1L);
        setField(term12587, term12587.getClass(), "parent", null);
        setField(term12587, term12587.getClass(), "otherParents", term12590);
        setBooleanField(term12587, term12587.getClass(), "closed", false);
        setBooleanField(term12587, term12587.getClass(), "append", true);
        setField(term12587, term12587.getClass(), "cleanup", null);
        setField(term12586, term12586.getClass(), "fd", term12587);
        setField(term12586, term12586.getClass(), "channel", null);
        setBooleanField(term12586, term12586.getClass(), "rw", false);
        setField(term12586, term12586.getClass(), "path", "yVMkkQhvmN");
        setIntField(term12609, term12609.getClass(), "value", 982388293);
        setField(term12586, term12586.getClass(), "closed", term12609);
        setField(term12585, term12585.getClass(), "file", term12586);
        setField(term12585, term12585.getClass(), "files", term12611);
        setIntField(term12585, term12585.getClass(), "numNonEmptyStreams", -1618206977);
        setIntField(term12652, term12652.getClass(), "crc", -1747406163);
        setField(term12585, term12585.getClass(), "crc32", term12652);
        setIntField(term12654, term12654.getClass(), "crc", 388157121);
        setField(term12585, term12585.getClass(), "compressedCrc32", term12654);
        setLongField(term12585, term12585.getClass(), "fileBytesWritten", 8018453258973130416L);
        setBooleanField(term12585, term12585.getClass(), "finished", false);
        setLongField(term12658, term12658.getClass(), "bytesWritten", 5592372218942533021L);
        setField(term12658, term12658.getClass(), "out", null);
        setBooleanField(term12658, term12658.getClass(), "closed", false);
        setField(term12658, term12658.getClass(), "closeLock", term12661);
        setField(term12585, term12585.getClass(), "currentOutputStream", term12658);
        setField(term12585, term12585.getClass(), "contentCompression", enum71);
        term12672 = new Long(8423938983545919786L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.DataOutput");
        argTypes[1] = long.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term12672;
        try {
            callMethod(klass, "writeUint64", argTypes, term12585, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


