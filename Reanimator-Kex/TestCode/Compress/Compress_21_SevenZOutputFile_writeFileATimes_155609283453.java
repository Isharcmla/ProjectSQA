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

public class SevenZOutputFile_writeFileATimes_155609283453 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11182;

    public SevenZOutputFile_writeFileATimes_155609283453() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term11187 = new ArrayList();
        ((ArrayList) term11187).add((Object)null);
        ((ArrayList) term11187).add((Object)null);
        ((ArrayList) term11187).add((Object)null);
        ((ArrayList) term11187).add((Object)null);
        ((ArrayList) term11187).add((Object)null);
        ((ArrayList) term11187).add((Object)null);
        ((ArrayList) term11187).add((Object)null);
        ((ArrayList) term11187).add((Object)null);
        ((ArrayList) term11187).add((Object)null);
        Object term11210 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        setField(term11210, term11210.getClass(), "name", "");
        setBooleanField(term11210, term11210.getClass(), "hasStream", true);
        setBooleanField(term11210, term11210.getClass(), "isDirectory", true);
        setBooleanField(term11210, term11210.getClass(), "isAntiItem", true);
        setBooleanField(term11210, term11210.getClass(), "hasCreationDate", true);
        setBooleanField(term11210, term11210.getClass(), "hasLastModifiedDate", true);
        setBooleanField(term11210, term11210.getClass(), "hasAccessDate", true);
        setLongField(term11210, term11210.getClass(), "creationDate", 5307445998877056304L);
        setLongField(term11210, term11210.getClass(), "lastModifiedDate", -8148408579143384073L);
        setLongField(term11210, term11210.getClass(), "accessDate", -888581501148999479L);
        setBooleanField(term11210, term11210.getClass(), "hasWindowsAttributes", true);
        setIntField(term11210, term11210.getClass(), "windowsAttributes", -1882480155);
        setBooleanField(term11210, term11210.getClass(), "hasCrc", false);
        setLongField(term11210, term11210.getClass(), "crc", 1835131711657183788L);
        setLongField(term11210, term11210.getClass(), "compressedCrc", -4507768716367203234L);
        setLongField(term11210, term11210.getClass(), "size", -192072503176550129L);
        setLongField(term11210, term11210.getClass(), "compressedSize", -4726601557653351735L);
        Object term11228 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        setField(term11228, term11228.getClass(), "name", "");
        setBooleanField(term11228, term11228.getClass(), "hasStream", true);
        setBooleanField(term11228, term11228.getClass(), "isDirectory", true);
        setBooleanField(term11228, term11228.getClass(), "isAntiItem", false);
        setBooleanField(term11228, term11228.getClass(), "hasCreationDate", false);
        setBooleanField(term11228, term11228.getClass(), "hasLastModifiedDate", true);
        setBooleanField(term11228, term11228.getClass(), "hasAccessDate", true);
        setLongField(term11228, term11228.getClass(), "creationDate", -3502423991725415780L);
        setLongField(term11228, term11228.getClass(), "lastModifiedDate", 7717843551775677202L);
        setLongField(term11228, term11228.getClass(), "accessDate", 2823262561274956150L);
        setBooleanField(term11228, term11228.getClass(), "hasWindowsAttributes", false);
        setIntField(term11228, term11228.getClass(), "windowsAttributes", -1410220680);
        setBooleanField(term11228, term11228.getClass(), "hasCrc", false);
        setLongField(term11228, term11228.getClass(), "crc", 8039153062846287600L);
        setLongField(term11228, term11228.getClass(), "compressedCrc", -7087265016767824631L);
        setLongField(term11228, term11228.getClass(), "size", -8121348431673567857L);
        setLongField(term11228, term11228.getClass(), "compressedSize", 7594342965038171122L);
        Object term11246 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        setField(term11246, term11246.getClass(), "name", "");
        setBooleanField(term11246, term11246.getClass(), "hasStream", false);
        setBooleanField(term11246, term11246.getClass(), "isDirectory", true);
        setBooleanField(term11246, term11246.getClass(), "isAntiItem", true);
        setBooleanField(term11246, term11246.getClass(), "hasCreationDate", false);
        setBooleanField(term11246, term11246.getClass(), "hasLastModifiedDate", false);
        setBooleanField(term11246, term11246.getClass(), "hasAccessDate", false);
        setLongField(term11246, term11246.getClass(), "creationDate", -4475453924678388077L);
        setLongField(term11246, term11246.getClass(), "lastModifiedDate", 3831842879355381917L);
        setLongField(term11246, term11246.getClass(), "accessDate", -2196447813514870436L);
        setBooleanField(term11246, term11246.getClass(), "hasWindowsAttributes", true);
        setIntField(term11246, term11246.getClass(), "windowsAttributes", 389427431);
        setBooleanField(term11246, term11246.getClass(), "hasCrc", false);
        setLongField(term11246, term11246.getClass(), "crc", 2984955721798941743L);
        setLongField(term11246, term11246.getClass(), "compressedCrc", 7495572757420909707L);
        setLongField(term11246, term11246.getClass(), "size", -1237494311441603673L);
        setLongField(term11246, term11246.getClass(), "compressedSize", 3550928874058758597L);
        Object term11264 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        setField(term11264, term11264.getClass(), "name", "");
        setBooleanField(term11264, term11264.getClass(), "hasStream", true);
        setBooleanField(term11264, term11264.getClass(), "isDirectory", false);
        setBooleanField(term11264, term11264.getClass(), "isAntiItem", true);
        setBooleanField(term11264, term11264.getClass(), "hasCreationDate", true);
        setBooleanField(term11264, term11264.getClass(), "hasLastModifiedDate", true);
        setBooleanField(term11264, term11264.getClass(), "hasAccessDate", true);
        setLongField(term11264, term11264.getClass(), "creationDate", 987797117310260031L);
        setLongField(term11264, term11264.getClass(), "lastModifiedDate", -4703513086610650698L);
        setLongField(term11264, term11264.getClass(), "accessDate", -8123300791906968552L);
        setBooleanField(term11264, term11264.getClass(), "hasWindowsAttributes", false);
        setIntField(term11264, term11264.getClass(), "windowsAttributes", -1945706126);
        setBooleanField(term11264, term11264.getClass(), "hasCrc", false);
        setLongField(term11264, term11264.getClass(), "crc", 7654605795400256601L);
        setLongField(term11264, term11264.getClass(), "compressedCrc", 3610800451815944213L);
        setLongField(term11264, term11264.getClass(), "size", -3548672426577893003L);
        setLongField(term11264, term11264.getClass(), "compressedSize", 1592020674405941254L);
        Object term11282 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        setField(term11282, term11282.getClass(), "name", "");
        setBooleanField(term11282, term11282.getClass(), "hasStream", false);
        setBooleanField(term11282, term11282.getClass(), "isDirectory", false);
        setBooleanField(term11282, term11282.getClass(), "isAntiItem", true);
        setBooleanField(term11282, term11282.getClass(), "hasCreationDate", true);
        setBooleanField(term11282, term11282.getClass(), "hasLastModifiedDate", false);
        setBooleanField(term11282, term11282.getClass(), "hasAccessDate", true);
        setLongField(term11282, term11282.getClass(), "creationDate", 4098407345651793258L);
        setLongField(term11282, term11282.getClass(), "lastModifiedDate", 3128610259359668233L);
        setLongField(term11282, term11282.getClass(), "accessDate", -7966859634511305171L);
        setBooleanField(term11282, term11282.getClass(), "hasWindowsAttributes", false);
        setIntField(term11282, term11282.getClass(), "windowsAttributes", 1152356969);
        setBooleanField(term11282, term11282.getClass(), "hasCrc", false);
        setLongField(term11282, term11282.getClass(), "crc", 5885163998873132588L);
        setLongField(term11282, term11282.getClass(), "compressedCrc", 2201264121669950608L);
        setLongField(term11282, term11282.getClass(), "size", 4911393165710268247L);
        setLongField(term11282, term11282.getClass(), "compressedSize", -836309941570511418L);
        Object term11300 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        setField(term11300, term11300.getClass(), "name", "");
        setBooleanField(term11300, term11300.getClass(), "hasStream", false);
        setBooleanField(term11300, term11300.getClass(), "isDirectory", false);
        setBooleanField(term11300, term11300.getClass(), "isAntiItem", true);
        setBooleanField(term11300, term11300.getClass(), "hasCreationDate", true);
        setBooleanField(term11300, term11300.getClass(), "hasLastModifiedDate", false);
        setBooleanField(term11300, term11300.getClass(), "hasAccessDate", true);
        setLongField(term11300, term11300.getClass(), "creationDate", -4851193391918639512L);
        setLongField(term11300, term11300.getClass(), "lastModifiedDate", -7163612258041042650L);
        setLongField(term11300, term11300.getClass(), "accessDate", -7186158121023817313L);
        setBooleanField(term11300, term11300.getClass(), "hasWindowsAttributes", false);
        setIntField(term11300, term11300.getClass(), "windowsAttributes", -1667990367);
        setBooleanField(term11300, term11300.getClass(), "hasCrc", true);
        setLongField(term11300, term11300.getClass(), "crc", -8510452367371037137L);
        setLongField(term11300, term11300.getClass(), "compressedCrc", 2123432481270520381L);
        setLongField(term11300, term11300.getClass(), "size", 7205698466499430091L);
        setLongField(term11300, term11300.getClass(), "compressedSize", -4868523627266698649L);
        Object term11318 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        setField(term11318, term11318.getClass(), "name", "");
        setBooleanField(term11318, term11318.getClass(), "hasStream", true);
        setBooleanField(term11318, term11318.getClass(), "isDirectory", false);
        setBooleanField(term11318, term11318.getClass(), "isAntiItem", false);
        setBooleanField(term11318, term11318.getClass(), "hasCreationDate", true);
        setBooleanField(term11318, term11318.getClass(), "hasLastModifiedDate", false);
        setBooleanField(term11318, term11318.getClass(), "hasAccessDate", true);
        setLongField(term11318, term11318.getClass(), "creationDate", 3228082303360203224L);
        setLongField(term11318, term11318.getClass(), "lastModifiedDate", 8845929725457841487L);
        setLongField(term11318, term11318.getClass(), "accessDate", 2599553846982918627L);
        setBooleanField(term11318, term11318.getClass(), "hasWindowsAttributes", true);
        setIntField(term11318, term11318.getClass(), "windowsAttributes", -1214628358);
        setBooleanField(term11318, term11318.getClass(), "hasCrc", true);
        setLongField(term11318, term11318.getClass(), "crc", -4821516944173509228L);
        setLongField(term11318, term11318.getClass(), "compressedCrc", 2315395988604904502L);
        setLongField(term11318, term11318.getClass(), "size", 4337555582321907177L);
        setLongField(term11318, term11318.getClass(), "compressedSize", -6367418587326372844L);
        ArrayList term11208 = new ArrayList();
        ((ArrayList) term11208).add(term11210);
        ((ArrayList) term11208).add(term11228);
        ((ArrayList) term11208).add(term11246);
        ((ArrayList) term11208).add(term11264);
        ((ArrayList) term11208).add(term11282);
        ((ArrayList) term11208).add(term11300);
        ((ArrayList) term11208).add(term11318);
        Class<? extends Object> term34783 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term34782 = ((Class) term34783).getDeclaredField((String) "BZIP2");
        ((Field) term34782).setAccessible(true);
        Object enum68 = ((Field) term34782).get((Object) null);
        term11182 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        Object term11183 = newInstance(Class.forName("java.io.RandomAccessFile"));
        Object term11184 = newInstance(Class.forName("java.io.FileDescriptor"));
        Object term11206 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicBoolean"));
        Object term11339 = newInstance(Class.forName("java.util.zip.CRC32"));
        Object term11341 = newInstance(Class.forName("java.util.zip.CRC32"));
        Object term11345 = newInstance(Class.forName("org.apache.commons.compress.utils.CountingOutputStream"));
        Object term11348 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term11184, term11184.getClass(), "fd", -1);
        setLongField(term11184, term11184.getClass(), "handle", -1L);
        setField(term11184, term11184.getClass(), "parent", null);
        setField(term11184, term11184.getClass(), "otherParents", term11187);
        setBooleanField(term11184, term11184.getClass(), "closed", true);
        setBooleanField(term11184, term11184.getClass(), "append", false);
        setField(term11184, term11184.getClass(), "cleanup", null);
        setField(term11183, term11183.getClass(), "fd", term11184);
        setField(term11183, term11183.getClass(), "channel", null);
        setBooleanField(term11183, term11183.getClass(), "rw", false);
        setField(term11183, term11183.getClass(), "path", "WzMEhMXkKx");
        setIntField(term11206, term11206.getClass(), "value", -1899301124);
        setField(term11183, term11183.getClass(), "closed", term11206);
        setField(term11182, term11182.getClass(), "file", term11183);
        setField(term11182, term11182.getClass(), "files", term11208);
        setIntField(term11182, term11182.getClass(), "numNonEmptyStreams", 1102721075);
        setIntField(term11339, term11339.getClass(), "crc", -426764678);
        setField(term11182, term11182.getClass(), "crc32", term11339);
        setIntField(term11341, term11341.getClass(), "crc", -1222614956);
        setField(term11182, term11182.getClass(), "compressedCrc32", term11341);
        setLongField(term11182, term11182.getClass(), "fileBytesWritten", 6371581018571997173L);
        setBooleanField(term11182, term11182.getClass(), "finished", true);
        setLongField(term11345, term11345.getClass(), "bytesWritten", 6604328992663797314L);
        setField(term11345, term11345.getClass(), "out", null);
        setBooleanField(term11345, term11345.getClass(), "closed", true);
        setField(term11345, term11345.getClass(), "closeLock", term11348);
        setField(term11182, term11182.getClass(), "currentOutputStream", term11345);
        setField(term11182, term11182.getClass(), "contentCompression", enum68);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.DataOutput");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "writeFileATimes", argTypes, term11182, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


