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

public class SevenZOutputFile_writeFileWindowsAttributes_45977775755 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12116;

    public SevenZOutputFile_writeFileWindowsAttributes_45977775755() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term12121 = new ArrayList();
        ((ArrayList) term12121).add((Object)null);
        ((ArrayList) term12121).add((Object)null);
        Object term12144 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        setField(term12144, term12144.getClass(), "name", "");
        setBooleanField(term12144, term12144.getClass(), "hasStream", false);
        setBooleanField(term12144, term12144.getClass(), "isDirectory", false);
        setBooleanField(term12144, term12144.getClass(), "isAntiItem", false);
        setBooleanField(term12144, term12144.getClass(), "hasCreationDate", true);
        setBooleanField(term12144, term12144.getClass(), "hasLastModifiedDate", true);
        setBooleanField(term12144, term12144.getClass(), "hasAccessDate", true);
        setLongField(term12144, term12144.getClass(), "creationDate", 873013799050926004L);
        setLongField(term12144, term12144.getClass(), "lastModifiedDate", 132446939133186077L);
        setLongField(term12144, term12144.getClass(), "accessDate", 4369503082568083627L);
        setBooleanField(term12144, term12144.getClass(), "hasWindowsAttributes", false);
        setIntField(term12144, term12144.getClass(), "windowsAttributes", -749861210);
        setBooleanField(term12144, term12144.getClass(), "hasCrc", true);
        setLongField(term12144, term12144.getClass(), "crc", -1148001666040486410L);
        setLongField(term12144, term12144.getClass(), "compressedCrc", -2097210721190032076L);
        setLongField(term12144, term12144.getClass(), "size", -3022442322233520981L);
        setLongField(term12144, term12144.getClass(), "compressedSize", -8735757853649335051L);
        Object term12162 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        setField(term12162, term12162.getClass(), "name", "");
        setBooleanField(term12162, term12162.getClass(), "hasStream", true);
        setBooleanField(term12162, term12162.getClass(), "isDirectory", false);
        setBooleanField(term12162, term12162.getClass(), "isAntiItem", true);
        setBooleanField(term12162, term12162.getClass(), "hasCreationDate", true);
        setBooleanField(term12162, term12162.getClass(), "hasLastModifiedDate", false);
        setBooleanField(term12162, term12162.getClass(), "hasAccessDate", false);
        setLongField(term12162, term12162.getClass(), "creationDate", 7016651719770171901L);
        setLongField(term12162, term12162.getClass(), "lastModifiedDate", 7777131569376571611L);
        setLongField(term12162, term12162.getClass(), "accessDate", -2792969772767139843L);
        setBooleanField(term12162, term12162.getClass(), "hasWindowsAttributes", false);
        setIntField(term12162, term12162.getClass(), "windowsAttributes", 1694224101);
        setBooleanField(term12162, term12162.getClass(), "hasCrc", false);
        setLongField(term12162, term12162.getClass(), "crc", 6313343355456678206L);
        setLongField(term12162, term12162.getClass(), "compressedCrc", -8901826621860118061L);
        setLongField(term12162, term12162.getClass(), "size", 2947576061864407618L);
        setLongField(term12162, term12162.getClass(), "compressedSize", 7265006047025305787L);
        Object term12180 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        setField(term12180, term12180.getClass(), "name", "");
        setBooleanField(term12180, term12180.getClass(), "hasStream", true);
        setBooleanField(term12180, term12180.getClass(), "isDirectory", true);
        setBooleanField(term12180, term12180.getClass(), "isAntiItem", false);
        setBooleanField(term12180, term12180.getClass(), "hasCreationDate", false);
        setBooleanField(term12180, term12180.getClass(), "hasLastModifiedDate", true);
        setBooleanField(term12180, term12180.getClass(), "hasAccessDate", true);
        setLongField(term12180, term12180.getClass(), "creationDate", -3323049156110984575L);
        setLongField(term12180, term12180.getClass(), "lastModifiedDate", -9079706905309751984L);
        setLongField(term12180, term12180.getClass(), "accessDate", -2080067238602928154L);
        setBooleanField(term12180, term12180.getClass(), "hasWindowsAttributes", true);
        setIntField(term12180, term12180.getClass(), "windowsAttributes", 937859191);
        setBooleanField(term12180, term12180.getClass(), "hasCrc", true);
        setLongField(term12180, term12180.getClass(), "crc", 8202413349907503373L);
        setLongField(term12180, term12180.getClass(), "compressedCrc", 4715419421865334491L);
        setLongField(term12180, term12180.getClass(), "size", 6320559761926095887L);
        setLongField(term12180, term12180.getClass(), "compressedSize", 5067793047038594982L);
        Object term12198 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        setField(term12198, term12198.getClass(), "name", "");
        setBooleanField(term12198, term12198.getClass(), "hasStream", false);
        setBooleanField(term12198, term12198.getClass(), "isDirectory", true);
        setBooleanField(term12198, term12198.getClass(), "isAntiItem", false);
        setBooleanField(term12198, term12198.getClass(), "hasCreationDate", false);
        setBooleanField(term12198, term12198.getClass(), "hasLastModifiedDate", false);
        setBooleanField(term12198, term12198.getClass(), "hasAccessDate", false);
        setLongField(term12198, term12198.getClass(), "creationDate", -1572808624189549793L);
        setLongField(term12198, term12198.getClass(), "lastModifiedDate", -6151316713456472560L);
        setLongField(term12198, term12198.getClass(), "accessDate", -5597498165246748176L);
        setBooleanField(term12198, term12198.getClass(), "hasWindowsAttributes", false);
        setIntField(term12198, term12198.getClass(), "windowsAttributes", -916584829);
        setBooleanField(term12198, term12198.getClass(), "hasCrc", false);
        setLongField(term12198, term12198.getClass(), "crc", 6174523862926526279L);
        setLongField(term12198, term12198.getClass(), "compressedCrc", 4977537501907213732L);
        setLongField(term12198, term12198.getClass(), "size", -2341942457089205755L);
        setLongField(term12198, term12198.getClass(), "compressedSize", -7503147844796296300L);
        Object term12216 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        setField(term12216, term12216.getClass(), "name", "");
        setBooleanField(term12216, term12216.getClass(), "hasStream", true);
        setBooleanField(term12216, term12216.getClass(), "isDirectory", true);
        setBooleanField(term12216, term12216.getClass(), "isAntiItem", true);
        setBooleanField(term12216, term12216.getClass(), "hasCreationDate", false);
        setBooleanField(term12216, term12216.getClass(), "hasLastModifiedDate", true);
        setBooleanField(term12216, term12216.getClass(), "hasAccessDate", false);
        setLongField(term12216, term12216.getClass(), "creationDate", 1099634235456795888L);
        setLongField(term12216, term12216.getClass(), "lastModifiedDate", 5391189846186870864L);
        setLongField(term12216, term12216.getClass(), "accessDate", 7314774835988078404L);
        setBooleanField(term12216, term12216.getClass(), "hasWindowsAttributes", true);
        setIntField(term12216, term12216.getClass(), "windowsAttributes", -2131181468);
        setBooleanField(term12216, term12216.getClass(), "hasCrc", true);
        setLongField(term12216, term12216.getClass(), "crc", 2777168805269959396L);
        setLongField(term12216, term12216.getClass(), "compressedCrc", 5255768275907389358L);
        setLongField(term12216, term12216.getClass(), "size", -8859332911664940963L);
        setLongField(term12216, term12216.getClass(), "compressedSize", 7048544371106200955L);
        ArrayList term12142 = new ArrayList();
        ((ArrayList) term12142).add(term12144);
        ((ArrayList) term12142).add(term12162);
        ((ArrayList) term12142).add(term12180);
        ((ArrayList) term12142).add(term12198);
        ((ArrayList) term12142).add(term12216);
        Class<? extends Object> term36112 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term36111 = ((Class) term36112).getDeclaredField((String) "DEFLATE");
        ((Field) term36111).setAccessible(true);
        Object enum70 = ((Field) term36111).get((Object) null);
        term12116 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        Object term12117 = newInstance(Class.forName("java.io.RandomAccessFile"));
        Object term12118 = newInstance(Class.forName("java.io.FileDescriptor"));
        Object term12140 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicBoolean"));
        Object term12237 = newInstance(Class.forName("java.util.zip.CRC32"));
        Object term12239 = newInstance(Class.forName("java.util.zip.CRC32"));
        Object term12243 = newInstance(Class.forName("org.apache.commons.compress.utils.CountingOutputStream"));
        Object term12246 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term12118, term12118.getClass(), "fd", -1);
        setLongField(term12118, term12118.getClass(), "handle", -1L);
        setField(term12118, term12118.getClass(), "parent", null);
        setField(term12118, term12118.getClass(), "otherParents", term12121);
        setBooleanField(term12118, term12118.getClass(), "closed", false);
        setBooleanField(term12118, term12118.getClass(), "append", true);
        setField(term12118, term12118.getClass(), "cleanup", null);
        setField(term12117, term12117.getClass(), "fd", term12118);
        setField(term12117, term12117.getClass(), "channel", null);
        setBooleanField(term12117, term12117.getClass(), "rw", false);
        setField(term12117, term12117.getClass(), "path", "fWKJoSoCwE");
        setIntField(term12140, term12140.getClass(), "value", 548228925);
        setField(term12117, term12117.getClass(), "closed", term12140);
        setField(term12116, term12116.getClass(), "file", term12117);
        setField(term12116, term12116.getClass(), "files", term12142);
        setIntField(term12116, term12116.getClass(), "numNonEmptyStreams", 282916351);
        setIntField(term12237, term12237.getClass(), "crc", 880977281);
        setField(term12116, term12116.getClass(), "crc32", term12237);
        setIntField(term12239, term12239.getClass(), "crc", 371943306);
        setField(term12116, term12116.getClass(), "compressedCrc32", term12239);
        setLongField(term12116, term12116.getClass(), "fileBytesWritten", -6299955839293054069L);
        setBooleanField(term12116, term12116.getClass(), "finished", false);
        setLongField(term12243, term12243.getClass(), "bytesWritten", 3573273176206440433L);
        setField(term12243, term12243.getClass(), "out", null);
        setBooleanField(term12243, term12243.getClass(), "closed", false);
        setField(term12243, term12243.getClass(), "closeLock", term12246);
        setField(term12116, term12116.getClass(), "currentOutputStream", term12243);
        setField(term12116, term12116.getClass(), "contentCompression", enum70);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.DataOutput");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "writeFileWindowsAttributes", argTypes, term12116, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


