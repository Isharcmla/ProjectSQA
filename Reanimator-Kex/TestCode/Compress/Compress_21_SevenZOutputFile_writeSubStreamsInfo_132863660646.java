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

public class SevenZOutputFile_writeSubStreamsInfo_132863660646 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7923;

    public SevenZOutputFile_writeSubStreamsInfo_132863660646() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term7928 = new ArrayList();
        ((ArrayList) term7928).add((Object)null);
        ((ArrayList) term7928).add((Object)null);
        ((ArrayList) term7928).add((Object)null);
        Object term7951 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        setField(term7951, term7951.getClass(), "name", "");
        setBooleanField(term7951, term7951.getClass(), "hasStream", false);
        setBooleanField(term7951, term7951.getClass(), "isDirectory", false);
        setBooleanField(term7951, term7951.getClass(), "isAntiItem", true);
        setBooleanField(term7951, term7951.getClass(), "hasCreationDate", true);
        setBooleanField(term7951, term7951.getClass(), "hasLastModifiedDate", false);
        setBooleanField(term7951, term7951.getClass(), "hasAccessDate", false);
        setLongField(term7951, term7951.getClass(), "creationDate", -2195794659127490022L);
        setLongField(term7951, term7951.getClass(), "lastModifiedDate", 6142089107139955834L);
        setLongField(term7951, term7951.getClass(), "accessDate", -7506365302323354325L);
        setBooleanField(term7951, term7951.getClass(), "hasWindowsAttributes", true);
        setIntField(term7951, term7951.getClass(), "windowsAttributes", -2015854073);
        setBooleanField(term7951, term7951.getClass(), "hasCrc", true);
        setLongField(term7951, term7951.getClass(), "crc", -4693900822622913579L);
        setLongField(term7951, term7951.getClass(), "compressedCrc", -997945615782059734L);
        setLongField(term7951, term7951.getClass(), "size", -599981502351912419L);
        setLongField(term7951, term7951.getClass(), "compressedSize", 8171709541116491249L);
        Object term7969 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        setField(term7969, term7969.getClass(), "name", "");
        setBooleanField(term7969, term7969.getClass(), "hasStream", true);
        setBooleanField(term7969, term7969.getClass(), "isDirectory", true);
        setBooleanField(term7969, term7969.getClass(), "isAntiItem", false);
        setBooleanField(term7969, term7969.getClass(), "hasCreationDate", false);
        setBooleanField(term7969, term7969.getClass(), "hasLastModifiedDate", false);
        setBooleanField(term7969, term7969.getClass(), "hasAccessDate", true);
        setLongField(term7969, term7969.getClass(), "creationDate", 1867943942587005261L);
        setLongField(term7969, term7969.getClass(), "lastModifiedDate", -9168517519350392654L);
        setLongField(term7969, term7969.getClass(), "accessDate", 4828755228445882127L);
        setBooleanField(term7969, term7969.getClass(), "hasWindowsAttributes", false);
        setIntField(term7969, term7969.getClass(), "windowsAttributes", 538259104);
        setBooleanField(term7969, term7969.getClass(), "hasCrc", true);
        setLongField(term7969, term7969.getClass(), "crc", 970120292495348028L);
        setLongField(term7969, term7969.getClass(), "compressedCrc", 77619432202128806L);
        setLongField(term7969, term7969.getClass(), "size", -1647156882669215876L);
        setLongField(term7969, term7969.getClass(), "compressedSize", 4115148503664117517L);
        Object term7987 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        setField(term7987, term7987.getClass(), "name", "");
        setBooleanField(term7987, term7987.getClass(), "hasStream", false);
        setBooleanField(term7987, term7987.getClass(), "isDirectory", true);
        setBooleanField(term7987, term7987.getClass(), "isAntiItem", true);
        setBooleanField(term7987, term7987.getClass(), "hasCreationDate", false);
        setBooleanField(term7987, term7987.getClass(), "hasLastModifiedDate", true);
        setBooleanField(term7987, term7987.getClass(), "hasAccessDate", false);
        setLongField(term7987, term7987.getClass(), "creationDate", 8527367353497875781L);
        setLongField(term7987, term7987.getClass(), "lastModifiedDate", -6489405551733780896L);
        setLongField(term7987, term7987.getClass(), "accessDate", 5818741986224130131L);
        setBooleanField(term7987, term7987.getClass(), "hasWindowsAttributes", true);
        setIntField(term7987, term7987.getClass(), "windowsAttributes", 96566506);
        setBooleanField(term7987, term7987.getClass(), "hasCrc", false);
        setLongField(term7987, term7987.getClass(), "crc", 370847120687610747L);
        setLongField(term7987, term7987.getClass(), "compressedCrc", -6399462725251497844L);
        setLongField(term7987, term7987.getClass(), "size", -4855037955202452256L);
        setLongField(term7987, term7987.getClass(), "compressedSize", -5903549884298836343L);
        Object term8005 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        setField(term8005, term8005.getClass(), "name", "");
        setBooleanField(term8005, term8005.getClass(), "hasStream", false);
        setBooleanField(term8005, term8005.getClass(), "isDirectory", true);
        setBooleanField(term8005, term8005.getClass(), "isAntiItem", false);
        setBooleanField(term8005, term8005.getClass(), "hasCreationDate", false);
        setBooleanField(term8005, term8005.getClass(), "hasLastModifiedDate", false);
        setBooleanField(term8005, term8005.getClass(), "hasAccessDate", false);
        setLongField(term8005, term8005.getClass(), "creationDate", -3058119213533262883L);
        setLongField(term8005, term8005.getClass(), "lastModifiedDate", 1950957495500453461L);
        setLongField(term8005, term8005.getClass(), "accessDate", -6423955170741487890L);
        setBooleanField(term8005, term8005.getClass(), "hasWindowsAttributes", false);
        setIntField(term8005, term8005.getClass(), "windowsAttributes", -343325701);
        setBooleanField(term8005, term8005.getClass(), "hasCrc", true);
        setLongField(term8005, term8005.getClass(), "crc", -4663904610228258188L);
        setLongField(term8005, term8005.getClass(), "compressedCrc", 3824691451696451167L);
        setLongField(term8005, term8005.getClass(), "size", -6237686742902369498L);
        setLongField(term8005, term8005.getClass(), "compressedSize", -2286229228641472715L);
        Object term8023 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        setField(term8023, term8023.getClass(), "name", "");
        setBooleanField(term8023, term8023.getClass(), "hasStream", false);
        setBooleanField(term8023, term8023.getClass(), "isDirectory", true);
        setBooleanField(term8023, term8023.getClass(), "isAntiItem", false);
        setBooleanField(term8023, term8023.getClass(), "hasCreationDate", true);
        setBooleanField(term8023, term8023.getClass(), "hasLastModifiedDate", true);
        setBooleanField(term8023, term8023.getClass(), "hasAccessDate", false);
        setLongField(term8023, term8023.getClass(), "creationDate", 7464122056779140588L);
        setLongField(term8023, term8023.getClass(), "lastModifiedDate", 6542357174275680335L);
        setLongField(term8023, term8023.getClass(), "accessDate", 206360660645917003L);
        setBooleanField(term8023, term8023.getClass(), "hasWindowsAttributes", false);
        setIntField(term8023, term8023.getClass(), "windowsAttributes", 107945604);
        setBooleanField(term8023, term8023.getClass(), "hasCrc", false);
        setLongField(term8023, term8023.getClass(), "crc", 8680715663951713735L);
        setLongField(term8023, term8023.getClass(), "compressedCrc", -4905558793519537969L);
        setLongField(term8023, term8023.getClass(), "size", 4354242424632479389L);
        setLongField(term8023, term8023.getClass(), "compressedSize", -4146453776626172590L);
        ArrayList term7949 = new ArrayList();
        ((ArrayList) term7949).add(term7951);
        ((ArrayList) term7949).add(term7969);
        ((ArrayList) term7949).add(term7987);
        ((ArrayList) term7949).add(term8005);
        ((ArrayList) term7949).add(term8023);
        Class<? extends Object> term30083 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term30082 = ((Class) term30083).getDeclaredField((String) "DEFLATE");
        ((Field) term30082).setAccessible(true);
        Object enum61 = ((Field) term30082).get((Object) null);
        term7923 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        Object term7924 = newInstance(Class.forName("java.io.RandomAccessFile"));
        Object term7925 = newInstance(Class.forName("java.io.FileDescriptor"));
        Object term7947 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicBoolean"));
        Object term8044 = newInstance(Class.forName("java.util.zip.CRC32"));
        Object term8046 = newInstance(Class.forName("java.util.zip.CRC32"));
        Object term8050 = newInstance(Class.forName("org.apache.commons.compress.utils.CountingOutputStream"));
        Object term8053 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term7925, term7925.getClass(), "fd", -1);
        setLongField(term7925, term7925.getClass(), "handle", -1L);
        setField(term7925, term7925.getClass(), "parent", null);
        setField(term7925, term7925.getClass(), "otherParents", term7928);
        setBooleanField(term7925, term7925.getClass(), "closed", true);
        setBooleanField(term7925, term7925.getClass(), "append", false);
        setField(term7925, term7925.getClass(), "cleanup", null);
        setField(term7924, term7924.getClass(), "fd", term7925);
        setField(term7924, term7924.getClass(), "channel", null);
        setBooleanField(term7924, term7924.getClass(), "rw", false);
        setField(term7924, term7924.getClass(), "path", "wGmYcqUkgE");
        setIntField(term7947, term7947.getClass(), "value", -341152642);
        setField(term7924, term7924.getClass(), "closed", term7947);
        setField(term7923, term7923.getClass(), "file", term7924);
        setField(term7923, term7923.getClass(), "files", term7949);
        setIntField(term7923, term7923.getClass(), "numNonEmptyStreams", -1963464809);
        setIntField(term8044, term8044.getClass(), "crc", 71190297);
        setField(term7923, term7923.getClass(), "crc32", term8044);
        setIntField(term8046, term8046.getClass(), "crc", 1202361360);
        setField(term7923, term7923.getClass(), "compressedCrc32", term8046);
        setLongField(term7923, term7923.getClass(), "fileBytesWritten", -5876259280451647338L);
        setBooleanField(term7923, term7923.getClass(), "finished", false);
        setLongField(term8050, term8050.getClass(), "bytesWritten", -4562564710769146498L);
        setField(term8050, term8050.getClass(), "out", null);
        setBooleanField(term8050, term8050.getClass(), "closed", false);
        setField(term8050, term8050.getClass(), "closeLock", term8053);
        setField(term7923, term7923.getClass(), "currentOutputStream", term8050);
        setField(term7923, term7923.getClass(), "contentCompression", enum61);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.DataOutput");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "writeSubStreamsInfo", argTypes, term7923, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


