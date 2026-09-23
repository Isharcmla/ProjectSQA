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
import java.io.IOException;
import static org.apache.commons.compress.archivers.sevenz.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;

public class SevenZOutputFile_close_156179439531 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1040;

    public SevenZOutputFile_close_156179439531() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1045 = new ArrayList();
        ((ArrayList) term1045).add((Object)null);
        ((ArrayList) term1045).add((Object)null);
        ((ArrayList) term1045).add((Object)null);
        Object term1068 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        setField(term1068, term1068.getClass(), "name", "");
        setBooleanField(term1068, term1068.getClass(), "hasStream", false);
        setBooleanField(term1068, term1068.getClass(), "isDirectory", false);
        setBooleanField(term1068, term1068.getClass(), "isAntiItem", true);
        setBooleanField(term1068, term1068.getClass(), "hasCreationDate", true);
        setBooleanField(term1068, term1068.getClass(), "hasLastModifiedDate", false);
        setBooleanField(term1068, term1068.getClass(), "hasAccessDate", true);
        setLongField(term1068, term1068.getClass(), "creationDate", 6855071767938501807L);
        setLongField(term1068, term1068.getClass(), "lastModifiedDate", -5892135042702373494L);
        setLongField(term1068, term1068.getClass(), "accessDate", 5262507301787091109L);
        setBooleanField(term1068, term1068.getClass(), "hasWindowsAttributes", true);
        setIntField(term1068, term1068.getClass(), "windowsAttributes", 1725571209);
        setBooleanField(term1068, term1068.getClass(), "hasCrc", true);
        setLongField(term1068, term1068.getClass(), "crc", -6823727938421990489L);
        setLongField(term1068, term1068.getClass(), "compressedCrc", -484994522244390100L);
        setLongField(term1068, term1068.getClass(), "size", 1233889271256172047L);
        setLongField(term1068, term1068.getClass(), "compressedSize", 6617340557564669657L);
        Object term1086 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        setField(term1086, term1086.getClass(), "name", "");
        setBooleanField(term1086, term1086.getClass(), "hasStream", false);
        setBooleanField(term1086, term1086.getClass(), "isDirectory", true);
        setBooleanField(term1086, term1086.getClass(), "isAntiItem", false);
        setBooleanField(term1086, term1086.getClass(), "hasCreationDate", false);
        setBooleanField(term1086, term1086.getClass(), "hasLastModifiedDate", true);
        setBooleanField(term1086, term1086.getClass(), "hasAccessDate", false);
        setLongField(term1086, term1086.getClass(), "creationDate", 1439298019805881866L);
        setLongField(term1086, term1086.getClass(), "lastModifiedDate", -8708192233349544946L);
        setLongField(term1086, term1086.getClass(), "accessDate", 5907001541142728739L);
        setBooleanField(term1086, term1086.getClass(), "hasWindowsAttributes", true);
        setIntField(term1086, term1086.getClass(), "windowsAttributes", -522618178);
        setBooleanField(term1086, term1086.getClass(), "hasCrc", false);
        setLongField(term1086, term1086.getClass(), "crc", 4178434741742309755L);
        setLongField(term1086, term1086.getClass(), "compressedCrc", -2068172595987555756L);
        setLongField(term1086, term1086.getClass(), "size", -6292278961887936280L);
        setLongField(term1086, term1086.getClass(), "compressedSize", -6645965768855543712L);
        Object term1104 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        setField(term1104, term1104.getClass(), "name", "");
        setBooleanField(term1104, term1104.getClass(), "hasStream", false);
        setBooleanField(term1104, term1104.getClass(), "isDirectory", true);
        setBooleanField(term1104, term1104.getClass(), "isAntiItem", false);
        setBooleanField(term1104, term1104.getClass(), "hasCreationDate", false);
        setBooleanField(term1104, term1104.getClass(), "hasLastModifiedDate", false);
        setBooleanField(term1104, term1104.getClass(), "hasAccessDate", false);
        setLongField(term1104, term1104.getClass(), "creationDate", 4784595517102746672L);
        setLongField(term1104, term1104.getClass(), "lastModifiedDate", -7612550318181586304L);
        setLongField(term1104, term1104.getClass(), "accessDate", -2170847986967241072L);
        setBooleanField(term1104, term1104.getClass(), "hasWindowsAttributes", true);
        setIntField(term1104, term1104.getClass(), "windowsAttributes", 1134449235);
        setBooleanField(term1104, term1104.getClass(), "hasCrc", true);
        setLongField(term1104, term1104.getClass(), "crc", 4044358158040652353L);
        setLongField(term1104, term1104.getClass(), "compressedCrc", -4443169559037975007L);
        setLongField(term1104, term1104.getClass(), "size", -3842548265506930260L);
        setLongField(term1104, term1104.getClass(), "compressedSize", -5788180182343976541L);
        Object term1122 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        setField(term1122, term1122.getClass(), "name", "");
        setBooleanField(term1122, term1122.getClass(), "hasStream", false);
        setBooleanField(term1122, term1122.getClass(), "isDirectory", false);
        setBooleanField(term1122, term1122.getClass(), "isAntiItem", true);
        setBooleanField(term1122, term1122.getClass(), "hasCreationDate", true);
        setBooleanField(term1122, term1122.getClass(), "hasLastModifiedDate", true);
        setBooleanField(term1122, term1122.getClass(), "hasAccessDate", false);
        setLongField(term1122, term1122.getClass(), "creationDate", 2936323121573284007L);
        setLongField(term1122, term1122.getClass(), "lastModifiedDate", -1154553077993834885L);
        setLongField(term1122, term1122.getClass(), "accessDate", -2850532706972744550L);
        setBooleanField(term1122, term1122.getClass(), "hasWindowsAttributes", false);
        setIntField(term1122, term1122.getClass(), "windowsAttributes", -883034806);
        setBooleanField(term1122, term1122.getClass(), "hasCrc", false);
        setLongField(term1122, term1122.getClass(), "crc", -2644215923136513282L);
        setLongField(term1122, term1122.getClass(), "compressedCrc", -1468719814009985452L);
        setLongField(term1122, term1122.getClass(), "size", -7738503207562305297L);
        setLongField(term1122, term1122.getClass(), "compressedSize", 3825396310311739952L);
        ArrayList term1066 = new ArrayList();
        ((ArrayList) term1066).add(term1068);
        ((ArrayList) term1066).add(term1086);
        ((ArrayList) term1066).add(term1104);
        ((ArrayList) term1066).add(term1122);
        Class<? extends Object> term15608 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term15607 = ((Class) term15608).getDeclaredField((String) "BZIP2");
        ((Field) term15607).setAccessible(true);
        Object enum36 = ((Field) term15607).get((Object) null);
        term1040 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        Object term1041 = newInstance(Class.forName("java.io.RandomAccessFile"));
        Object term1042 = newInstance(Class.forName("java.io.FileDescriptor"));
        Object term1064 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicBoolean"));
        Object term1143 = newInstance(Class.forName("java.util.zip.CRC32"));
        Object term1145 = newInstance(Class.forName("java.util.zip.CRC32"));
        Object term1149 = newInstance(Class.forName("org.apache.commons.compress.utils.CountingOutputStream"));
        Object term1152 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term1042, term1042.getClass(), "fd", -1);
        setLongField(term1042, term1042.getClass(), "handle", -1L);
        setField(term1042, term1042.getClass(), "parent", null);
        setField(term1042, term1042.getClass(), "otherParents", term1045);
        setBooleanField(term1042, term1042.getClass(), "closed", true);
        setBooleanField(term1042, term1042.getClass(), "append", true);
        setField(term1042, term1042.getClass(), "cleanup", null);
        setField(term1041, term1041.getClass(), "fd", term1042);
        setField(term1041, term1041.getClass(), "channel", null);
        setBooleanField(term1041, term1041.getClass(), "rw", false);
        setField(term1041, term1041.getClass(), "path", "SzjVpOQTyS");
        setIntField(term1064, term1064.getClass(), "value", -1339778481);
        setField(term1041, term1041.getClass(), "closed", term1064);
        setField(term1040, term1040.getClass(), "file", term1041);
        setField(term1040, term1040.getClass(), "files", term1066);
        setIntField(term1040, term1040.getClass(), "numNonEmptyStreams", 1585847225);
        setIntField(term1143, term1143.getClass(), "crc", 597278769);
        setField(term1040, term1040.getClass(), "crc32", term1143);
        setIntField(term1145, term1145.getClass(), "crc", -1685132342);
        setField(term1040, term1040.getClass(), "compressedCrc32", term1145);
        setLongField(term1040, term1040.getClass(), "fileBytesWritten", -3838084482494604218L);
        setBooleanField(term1040, term1040.getClass(), "finished", false);
        setLongField(term1149, term1149.getClass(), "bytesWritten", 3892018155439224435L);
        setField(term1149, term1149.getClass(), "out", null);
        setBooleanField(term1149, term1149.getClass(), "closed", false);
        setField(term1149, term1149.getClass(), "closeLock", term1152);
        setField(term1040, term1040.getClass(), "currentOutputStream", term1149);
        setField(term1040, term1040.getClass(), "contentCompression", enum36);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "close", argTypes, term1040, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


