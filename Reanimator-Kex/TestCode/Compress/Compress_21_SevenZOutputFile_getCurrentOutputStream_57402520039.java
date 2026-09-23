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
import static org.apache.commons.compress.archivers.sevenz.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.compress.archivers.sevenz.EqualityUtils.*;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;

public class SevenZOutputFile_getCurrentOutputStream_57402520039 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4852;
     Object term22369;
     Object term22297;

    public SevenZOutputFile_getCurrentOutputStream_57402520039() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4857 = new ArrayList();
        ((ArrayList) term4857).add((Object)null);
        ((ArrayList) term4857).add((Object)null);
        Object term4880 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        setField(term4880, term4880.getClass(), "name", "");
        setBooleanField(term4880, term4880.getClass(), "hasStream", false);
        setBooleanField(term4880, term4880.getClass(), "isDirectory", true);
        setBooleanField(term4880, term4880.getClass(), "isAntiItem", true);
        setBooleanField(term4880, term4880.getClass(), "hasCreationDate", false);
        setBooleanField(term4880, term4880.getClass(), "hasLastModifiedDate", false);
        setBooleanField(term4880, term4880.getClass(), "hasAccessDate", true);
        setLongField(term4880, term4880.getClass(), "creationDate", 4069264186851023313L);
        setLongField(term4880, term4880.getClass(), "lastModifiedDate", 5184635470881147510L);
        setLongField(term4880, term4880.getClass(), "accessDate", 918397384129253729L);
        setBooleanField(term4880, term4880.getClass(), "hasWindowsAttributes", true);
        setIntField(term4880, term4880.getClass(), "windowsAttributes", -2027534003);
        setBooleanField(term4880, term4880.getClass(), "hasCrc", false);
        setLongField(term4880, term4880.getClass(), "crc", -2187638136407967948L);
        setLongField(term4880, term4880.getClass(), "compressedCrc", 8708846223293804408L);
        setLongField(term4880, term4880.getClass(), "size", -2986201902216133814L);
        setLongField(term4880, term4880.getClass(), "compressedSize", 4255811647459029682L);
        ArrayList term4878 = new ArrayList();
        ((ArrayList) term4878).add(term4880);
        Class<? extends Object> term22400 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term22399 = ((Class) term22400).getDeclaredField((String) "BZIP2");
        ((Field) term22399).setAccessible(true);
        Object enum51 = ((Field) term22399).get((Object) null);
        term4852 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        Object term4853 = newInstance(Class.forName("java.io.RandomAccessFile"));
        Object term4854 = newInstance(Class.forName("java.io.FileDescriptor"));
        Object term4876 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicBoolean"));
        Object term4901 = newInstance(Class.forName("java.util.zip.CRC32"));
        Object term4903 = newInstance(Class.forName("java.util.zip.CRC32"));
        Object term4907 = newInstance(Class.forName("org.apache.commons.compress.utils.CountingOutputStream"));
        Object term4910 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term4854, term4854.getClass(), "fd", -1);
        setLongField(term4854, term4854.getClass(), "handle", -1L);
        setField(term4854, term4854.getClass(), "parent", null);
        setField(term4854, term4854.getClass(), "otherParents", term4857);
        setBooleanField(term4854, term4854.getClass(), "closed", false);
        setBooleanField(term4854, term4854.getClass(), "append", false);
        setField(term4854, term4854.getClass(), "cleanup", null);
        setField(term4853, term4853.getClass(), "fd", term4854);
        setField(term4853, term4853.getClass(), "channel", null);
        setBooleanField(term4853, term4853.getClass(), "rw", true);
        setField(term4853, term4853.getClass(), "path", "tShwQLRGNe");
        setIntField(term4876, term4876.getClass(), "value", 1551099402);
        setField(term4853, term4853.getClass(), "closed", term4876);
        setField(term4852, term4852.getClass(), "file", term4853);
        setField(term4852, term4852.getClass(), "files", term4878);
        setIntField(term4852, term4852.getClass(), "numNonEmptyStreams", 1063420942);
        setIntField(term4901, term4901.getClass(), "crc", 1375330971);
        setField(term4852, term4852.getClass(), "crc32", term4901);
        setIntField(term4903, term4903.getClass(), "crc", -478195677);
        setField(term4852, term4852.getClass(), "compressedCrc32", term4903);
        setLongField(term4852, term4852.getClass(), "fileBytesWritten", 8000844860910174690L);
        setBooleanField(term4852, term4852.getClass(), "finished", true);
        setLongField(term4907, term4907.getClass(), "bytesWritten", 2209808079059619773L);
        setField(term4907, term4907.getClass(), "out", null);
        setBooleanField(term4907, term4907.getClass(), "closed", true);
        setField(term4907, term4907.getClass(), "closeLock", term4910);
        setField(term4852, term4852.getClass(), "currentOutputStream", term4907);
        setField(term4852, term4852.getClass(), "contentCompression", enum51);
        ArrayList term22372 = new ArrayList();
        ((ArrayList) term22372).add((Object)null);
        ((ArrayList) term22372).add((Object)null);
        Object term22379 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        setField(term22379, term22379.getClass(), "name", "");
        setBooleanField(term22379, term22379.getClass(), "hasStream", false);
        setBooleanField(term22379, term22379.getClass(), "isDirectory", true);
        setBooleanField(term22379, term22379.getClass(), "isAntiItem", true);
        setBooleanField(term22379, term22379.getClass(), "hasCreationDate", false);
        setBooleanField(term22379, term22379.getClass(), "hasLastModifiedDate", false);
        setBooleanField(term22379, term22379.getClass(), "hasAccessDate", true);
        setLongField(term22379, term22379.getClass(), "creationDate", 4069264186851023313L);
        setLongField(term22379, term22379.getClass(), "lastModifiedDate", 5184635470881147510L);
        setLongField(term22379, term22379.getClass(), "accessDate", 918397384129253729L);
        setBooleanField(term22379, term22379.getClass(), "hasWindowsAttributes", true);
        setIntField(term22379, term22379.getClass(), "windowsAttributes", -2027534003);
        setBooleanField(term22379, term22379.getClass(), "hasCrc", false);
        setLongField(term22379, term22379.getClass(), "crc", -2187638136407967948L);
        setLongField(term22379, term22379.getClass(), "compressedCrc", 8708846223293804408L);
        setLongField(term22379, term22379.getClass(), "size", -2986201902216133814L);
        setLongField(term22379, term22379.getClass(), "compressedSize", 4255811647459029682L);
        ArrayList term22377 = new ArrayList();
        ((ArrayList) term22377).add(term22379);
        Class<? extends Object> term22717 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term22716 = ((Class) term22717).getDeclaredField((String) "BZIP2");
        ((Field) term22716).setAccessible(true);
        Object enum52 = ((Field) term22716).get((Object) null);
        term22369 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        Object term22370 = newInstance(Class.forName("java.io.RandomAccessFile"));
        Object term22371 = newInstance(Class.forName("java.io.FileDescriptor"));
        Object term22376 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicBoolean"));
        Object term22381 = newInstance(Class.forName("java.util.zip.CRC32"));
        Object term22382 = newInstance(Class.forName("java.util.zip.CRC32"));
        Object term22383 = newInstance(Class.forName("org.apache.commons.compress.utils.CountingOutputStream"));
        Object term22384 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term22371, term22371.getClass(), "fd", -1);
        setLongField(term22371, term22371.getClass(), "handle", -1L);
        setField(term22371, term22371.getClass(), "parent", null);
        setField(term22371, term22371.getClass(), "otherParents", term22372);
        setBooleanField(term22371, term22371.getClass(), "closed", false);
        setBooleanField(term22371, term22371.getClass(), "append", false);
        setField(term22371, term22371.getClass(), "cleanup", null);
        setField(term22370, term22370.getClass(), "fd", term22371);
        setField(term22370, term22370.getClass(), "channel", null);
        setBooleanField(term22370, term22370.getClass(), "rw", true);
        setField(term22370, term22370.getClass(), "path", "tShwQLRGNe");
        setIntField(term22376, term22376.getClass(), "value", 1551099402);
        setField(term22370, term22370.getClass(), "closed", term22376);
        setField(term22369, term22369.getClass(), "file", term22370);
        setField(term22369, term22369.getClass(), "files", term22377);
        setIntField(term22369, term22369.getClass(), "numNonEmptyStreams", 1063420942);
        setIntField(term22381, term22381.getClass(), "crc", 1375330971);
        setField(term22369, term22369.getClass(), "crc32", term22381);
        setIntField(term22382, term22382.getClass(), "crc", -478195677);
        setField(term22369, term22369.getClass(), "compressedCrc32", term22382);
        setLongField(term22369, term22369.getClass(), "fileBytesWritten", 8000844860910174690L);
        setBooleanField(term22369, term22369.getClass(), "finished", true);
        setLongField(term22383, term22383.getClass(), "bytesWritten", 2209808079059619773L);
        setField(term22383, term22383.getClass(), "out", null);
        setBooleanField(term22383, term22383.getClass(), "closed", true);
        setField(term22383, term22383.getClass(), "closeLock", term22384);
        setField(term22369, term22369.getClass(), "currentOutputStream", term22383);
        setField(term22369, term22369.getClass(), "contentCompression", enum52);
        term22297 = newInstance(Class.forName("org.apache.commons.compress.utils.CountingOutputStream"));
        Object term22300 = newInstance(Class.forName("java.lang.Object"));
        setLongField(term22297, term22297.getClass(), "bytesWritten", 2209808079059619773L);
        setField(term22297, term22297.getClass(), "out", null);
        setBooleanField(term22297, term22297.getClass(), "closed", true);
        setField(term22297, term22297.getClass(), "closeLock", term22300);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getCurrentOutputStream", argTypes, term4852, args);
        assertTrue(recursiveEquals(term4852, term22369));
        assertTrue(recursiveEquals(retValue, term22297));
    }

};


