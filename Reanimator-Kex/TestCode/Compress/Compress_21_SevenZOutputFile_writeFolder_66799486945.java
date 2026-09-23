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

public class SevenZOutputFile_writeFolder_66799486945 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7466;

    public SevenZOutputFile_writeFolder_66799486945() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term7471 = new ArrayList();
        ((ArrayList) term7471).add((Object)null);
        ((ArrayList) term7471).add((Object)null);
        Object term7494 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        setField(term7494, term7494.getClass(), "name", "");
        setBooleanField(term7494, term7494.getClass(), "hasStream", true);
        setBooleanField(term7494, term7494.getClass(), "isDirectory", true);
        setBooleanField(term7494, term7494.getClass(), "isAntiItem", false);
        setBooleanField(term7494, term7494.getClass(), "hasCreationDate", true);
        setBooleanField(term7494, term7494.getClass(), "hasLastModifiedDate", true);
        setBooleanField(term7494, term7494.getClass(), "hasAccessDate", false);
        setLongField(term7494, term7494.getClass(), "creationDate", -7423063312741500355L);
        setLongField(term7494, term7494.getClass(), "lastModifiedDate", -8992404862613425105L);
        setLongField(term7494, term7494.getClass(), "accessDate", 3103198349031409063L);
        setBooleanField(term7494, term7494.getClass(), "hasWindowsAttributes", false);
        setIntField(term7494, term7494.getClass(), "windowsAttributes", 1072005683);
        setBooleanField(term7494, term7494.getClass(), "hasCrc", false);
        setLongField(term7494, term7494.getClass(), "crc", 753095050088595263L);
        setLongField(term7494, term7494.getClass(), "compressedCrc", 3643973882575578879L);
        setLongField(term7494, term7494.getClass(), "size", -1750555031444556464L);
        setLongField(term7494, term7494.getClass(), "compressedSize", -3231440836116263235L);
        Object term7512 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        setField(term7512, term7512.getClass(), "name", "");
        setBooleanField(term7512, term7512.getClass(), "hasStream", false);
        setBooleanField(term7512, term7512.getClass(), "isDirectory", true);
        setBooleanField(term7512, term7512.getClass(), "isAntiItem", false);
        setBooleanField(term7512, term7512.getClass(), "hasCreationDate", false);
        setBooleanField(term7512, term7512.getClass(), "hasLastModifiedDate", false);
        setBooleanField(term7512, term7512.getClass(), "hasAccessDate", false);
        setLongField(term7512, term7512.getClass(), "creationDate", 8010417010297313651L);
        setLongField(term7512, term7512.getClass(), "lastModifiedDate", 5845993504299821981L);
        setLongField(term7512, term7512.getClass(), "accessDate", -1528017371096319990L);
        setBooleanField(term7512, term7512.getClass(), "hasWindowsAttributes", true);
        setIntField(term7512, term7512.getClass(), "windowsAttributes", 1861318859);
        setBooleanField(term7512, term7512.getClass(), "hasCrc", false);
        setLongField(term7512, term7512.getClass(), "crc", -1526328443223793465L);
        setLongField(term7512, term7512.getClass(), "compressedCrc", -412186147449928821L);
        setLongField(term7512, term7512.getClass(), "size", -1449569009562240465L);
        setLongField(term7512, term7512.getClass(), "compressedSize", 2287449183416662404L);
        Object term7530 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        setField(term7530, term7530.getClass(), "name", "");
        setBooleanField(term7530, term7530.getClass(), "hasStream", false);
        setBooleanField(term7530, term7530.getClass(), "isDirectory", true);
        setBooleanField(term7530, term7530.getClass(), "isAntiItem", true);
        setBooleanField(term7530, term7530.getClass(), "hasCreationDate", false);
        setBooleanField(term7530, term7530.getClass(), "hasLastModifiedDate", false);
        setBooleanField(term7530, term7530.getClass(), "hasAccessDate", true);
        setLongField(term7530, term7530.getClass(), "creationDate", -1223573843683081410L);
        setLongField(term7530, term7530.getClass(), "lastModifiedDate", 3453457027014743006L);
        setLongField(term7530, term7530.getClass(), "accessDate", 3931473624300151730L);
        setBooleanField(term7530, term7530.getClass(), "hasWindowsAttributes", true);
        setIntField(term7530, term7530.getClass(), "windowsAttributes", 1474524152);
        setBooleanField(term7530, term7530.getClass(), "hasCrc", false);
        setLongField(term7530, term7530.getClass(), "crc", 661905373566913125L);
        setLongField(term7530, term7530.getClass(), "compressedCrc", -3753621038448351550L);
        setLongField(term7530, term7530.getClass(), "size", 5304481534735378567L);
        setLongField(term7530, term7530.getClass(), "compressedSize", 3423155413133381764L);
        Object term7548 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        setField(term7548, term7548.getClass(), "name", "");
        setBooleanField(term7548, term7548.getClass(), "hasStream", true);
        setBooleanField(term7548, term7548.getClass(), "isDirectory", false);
        setBooleanField(term7548, term7548.getClass(), "isAntiItem", true);
        setBooleanField(term7548, term7548.getClass(), "hasCreationDate", true);
        setBooleanField(term7548, term7548.getClass(), "hasLastModifiedDate", true);
        setBooleanField(term7548, term7548.getClass(), "hasAccessDate", false);
        setLongField(term7548, term7548.getClass(), "creationDate", 7711054832353934171L);
        setLongField(term7548, term7548.getClass(), "lastModifiedDate", 185544001230120339L);
        setLongField(term7548, term7548.getClass(), "accessDate", 4096288569907305445L);
        setBooleanField(term7548, term7548.getClass(), "hasWindowsAttributes", true);
        setIntField(term7548, term7548.getClass(), "windowsAttributes", 568954359);
        setBooleanField(term7548, term7548.getClass(), "hasCrc", true);
        setLongField(term7548, term7548.getClass(), "crc", 6940486570215409900L);
        setLongField(term7548, term7548.getClass(), "compressedCrc", -7370364068296402536L);
        setLongField(term7548, term7548.getClass(), "size", -1084263688306617320L);
        setLongField(term7548, term7548.getClass(), "compressedSize", 1193381106528373019L);
        Object term7566 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        setField(term7566, term7566.getClass(), "name", "");
        setBooleanField(term7566, term7566.getClass(), "hasStream", true);
        setBooleanField(term7566, term7566.getClass(), "isDirectory", false);
        setBooleanField(term7566, term7566.getClass(), "isAntiItem", false);
        setBooleanField(term7566, term7566.getClass(), "hasCreationDate", false);
        setBooleanField(term7566, term7566.getClass(), "hasLastModifiedDate", false);
        setBooleanField(term7566, term7566.getClass(), "hasAccessDate", false);
        setLongField(term7566, term7566.getClass(), "creationDate", -1365372122034008688L);
        setLongField(term7566, term7566.getClass(), "lastModifiedDate", -6108006981756732593L);
        setLongField(term7566, term7566.getClass(), "accessDate", -3565554762799701668L);
        setBooleanField(term7566, term7566.getClass(), "hasWindowsAttributes", false);
        setIntField(term7566, term7566.getClass(), "windowsAttributes", 53410913);
        setBooleanField(term7566, term7566.getClass(), "hasCrc", true);
        setLongField(term7566, term7566.getClass(), "crc", -6837989212848250735L);
        setLongField(term7566, term7566.getClass(), "compressedCrc", -4231979631084175364L);
        setLongField(term7566, term7566.getClass(), "size", 1634166935474035772L);
        setLongField(term7566, term7566.getClass(), "compressedSize", -2614906266506360948L);
        ArrayList term7492 = new ArrayList();
        ((ArrayList) term7492).add(term7494);
        ((ArrayList) term7492).add(term7512);
        ((ArrayList) term7492).add(term7530);
        ((ArrayList) term7492).add(term7548);
        ((ArrayList) term7492).add(term7566);
        Class<? extends Object> term29521 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term29520 = ((Class) term29521).getDeclaredField((String) "LZMA");
        ((Field) term29520).setAccessible(true);
        Object enum60 = ((Field) term29520).get((Object) null);
        term7466 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        Object term7467 = newInstance(Class.forName("java.io.RandomAccessFile"));
        Object term7468 = newInstance(Class.forName("java.io.FileDescriptor"));
        Object term7490 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicBoolean"));
        Object term7587 = newInstance(Class.forName("java.util.zip.CRC32"));
        Object term7589 = newInstance(Class.forName("java.util.zip.CRC32"));
        Object term7593 = newInstance(Class.forName("org.apache.commons.compress.utils.CountingOutputStream"));
        Object term7596 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term7468, term7468.getClass(), "fd", -1);
        setLongField(term7468, term7468.getClass(), "handle", -1L);
        setField(term7468, term7468.getClass(), "parent", null);
        setField(term7468, term7468.getClass(), "otherParents", term7471);
        setBooleanField(term7468, term7468.getClass(), "closed", true);
        setBooleanField(term7468, term7468.getClass(), "append", false);
        setField(term7468, term7468.getClass(), "cleanup", null);
        setField(term7467, term7467.getClass(), "fd", term7468);
        setField(term7467, term7467.getClass(), "channel", null);
        setBooleanField(term7467, term7467.getClass(), "rw", false);
        setField(term7467, term7467.getClass(), "path", "KoyGrUJeJW");
        setIntField(term7490, term7490.getClass(), "value", 1386130016);
        setField(term7467, term7467.getClass(), "closed", term7490);
        setField(term7466, term7466.getClass(), "file", term7467);
        setField(term7466, term7466.getClass(), "files", term7492);
        setIntField(term7466, term7466.getClass(), "numNonEmptyStreams", -375014958);
        setIntField(term7587, term7587.getClass(), "crc", 1107176718);
        setField(term7466, term7466.getClass(), "crc32", term7587);
        setIntField(term7589, term7589.getClass(), "crc", 480137250);
        setField(term7466, term7466.getClass(), "compressedCrc32", term7589);
        setLongField(term7466, term7466.getClass(), "fileBytesWritten", 1133267598258375793L);
        setBooleanField(term7466, term7466.getClass(), "finished", false);
        setLongField(term7593, term7593.getClass(), "bytesWritten", 2990264647913003810L);
        setField(term7593, term7593.getClass(), "out", null);
        setBooleanField(term7593, term7593.getClass(), "closed", false);
        setField(term7593, term7593.getClass(), "closeLock", term7596);
        setField(term7466, term7466.getClass(), "currentOutputStream", term7593);
        setField(term7466, term7466.getClass(), "contentCompression", enum60);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.DataOutput");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "writeFolder", argTypes, term7466, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


