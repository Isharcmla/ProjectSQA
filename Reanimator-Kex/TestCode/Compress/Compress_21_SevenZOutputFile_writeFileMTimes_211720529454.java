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

public class SevenZOutputFile_writeFileMTimes_211720529454 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11679;

    public SevenZOutputFile_writeFileMTimes_211720529454() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term11684 = new ArrayList();
        ((ArrayList) term11684).add((Object)null);
        ((ArrayList) term11684).add((Object)null);
        ((ArrayList) term11684).add((Object)null);
        Object term11707 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        setField(term11707, term11707.getClass(), "name", "");
        setBooleanField(term11707, term11707.getClass(), "hasStream", false);
        setBooleanField(term11707, term11707.getClass(), "isDirectory", false);
        setBooleanField(term11707, term11707.getClass(), "isAntiItem", false);
        setBooleanField(term11707, term11707.getClass(), "hasCreationDate", true);
        setBooleanField(term11707, term11707.getClass(), "hasLastModifiedDate", true);
        setBooleanField(term11707, term11707.getClass(), "hasAccessDate", true);
        setLongField(term11707, term11707.getClass(), "creationDate", -5133307284441518726L);
        setLongField(term11707, term11707.getClass(), "lastModifiedDate", 7921404547326630089L);
        setLongField(term11707, term11707.getClass(), "accessDate", 2155219577693802424L);
        setBooleanField(term11707, term11707.getClass(), "hasWindowsAttributes", true);
        setIntField(term11707, term11707.getClass(), "windowsAttributes", -1310015129);
        setBooleanField(term11707, term11707.getClass(), "hasCrc", false);
        setLongField(term11707, term11707.getClass(), "crc", -4033544645261759750L);
        setLongField(term11707, term11707.getClass(), "compressedCrc", 593230449611047187L);
        setLongField(term11707, term11707.getClass(), "size", -3355167737637002830L);
        setLongField(term11707, term11707.getClass(), "compressedSize", -8854988339892073229L);
        Object term11725 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        setField(term11725, term11725.getClass(), "name", "");
        setBooleanField(term11725, term11725.getClass(), "hasStream", false);
        setBooleanField(term11725, term11725.getClass(), "isDirectory", true);
        setBooleanField(term11725, term11725.getClass(), "isAntiItem", true);
        setBooleanField(term11725, term11725.getClass(), "hasCreationDate", true);
        setBooleanField(term11725, term11725.getClass(), "hasLastModifiedDate", false);
        setBooleanField(term11725, term11725.getClass(), "hasAccessDate", false);
        setLongField(term11725, term11725.getClass(), "creationDate", 2769081086274438111L);
        setLongField(term11725, term11725.getClass(), "lastModifiedDate", -6339531459447942677L);
        setLongField(term11725, term11725.getClass(), "accessDate", 2014229530618878786L);
        setBooleanField(term11725, term11725.getClass(), "hasWindowsAttributes", true);
        setIntField(term11725, term11725.getClass(), "windowsAttributes", -2104981311);
        setBooleanField(term11725, term11725.getClass(), "hasCrc", false);
        setLongField(term11725, term11725.getClass(), "crc", -3684549603148553700L);
        setLongField(term11725, term11725.getClass(), "compressedCrc", 4665980239039735158L);
        setLongField(term11725, term11725.getClass(), "size", 7429946509853918683L);
        setLongField(term11725, term11725.getClass(), "compressedSize", -7148236042086608592L);
        Object term11743 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        setField(term11743, term11743.getClass(), "name", "");
        setBooleanField(term11743, term11743.getClass(), "hasStream", true);
        setBooleanField(term11743, term11743.getClass(), "isDirectory", false);
        setBooleanField(term11743, term11743.getClass(), "isAntiItem", false);
        setBooleanField(term11743, term11743.getClass(), "hasCreationDate", false);
        setBooleanField(term11743, term11743.getClass(), "hasLastModifiedDate", false);
        setBooleanField(term11743, term11743.getClass(), "hasAccessDate", true);
        setLongField(term11743, term11743.getClass(), "creationDate", 7716258711075652753L);
        setLongField(term11743, term11743.getClass(), "lastModifiedDate", -3988042285731673145L);
        setLongField(term11743, term11743.getClass(), "accessDate", 1729206737148270563L);
        setBooleanField(term11743, term11743.getClass(), "hasWindowsAttributes", true);
        setIntField(term11743, term11743.getClass(), "windowsAttributes", -571169753);
        setBooleanField(term11743, term11743.getClass(), "hasCrc", false);
        setLongField(term11743, term11743.getClass(), "crc", -932981811228171529L);
        setLongField(term11743, term11743.getClass(), "compressedCrc", 5817794709356277010L);
        setLongField(term11743, term11743.getClass(), "size", -205762347192500511L);
        setLongField(term11743, term11743.getClass(), "compressedSize", -4987344934532917085L);
        Object term11761 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        setField(term11761, term11761.getClass(), "name", "");
        setBooleanField(term11761, term11761.getClass(), "hasStream", false);
        setBooleanField(term11761, term11761.getClass(), "isDirectory", true);
        setBooleanField(term11761, term11761.getClass(), "isAntiItem", false);
        setBooleanField(term11761, term11761.getClass(), "hasCreationDate", true);
        setBooleanField(term11761, term11761.getClass(), "hasLastModifiedDate", false);
        setBooleanField(term11761, term11761.getClass(), "hasAccessDate", true);
        setLongField(term11761, term11761.getClass(), "creationDate", 4832511106024339541L);
        setLongField(term11761, term11761.getClass(), "lastModifiedDate", 7840243516767232066L);
        setLongField(term11761, term11761.getClass(), "accessDate", -4069312743655862444L);
        setBooleanField(term11761, term11761.getClass(), "hasWindowsAttributes", true);
        setIntField(term11761, term11761.getClass(), "windowsAttributes", 318591690);
        setBooleanField(term11761, term11761.getClass(), "hasCrc", true);
        setLongField(term11761, term11761.getClass(), "crc", 3233502115953753827L);
        setLongField(term11761, term11761.getClass(), "compressedCrc", -308461294344616496L);
        setLongField(term11761, term11761.getClass(), "size", -6325201865655646423L);
        setLongField(term11761, term11761.getClass(), "compressedSize", -9093996849713569099L);
        ArrayList term11705 = new ArrayList();
        ((ArrayList) term11705).add(term11707);
        ((ArrayList) term11705).add(term11725);
        ((ArrayList) term11705).add(term11743);
        ((ArrayList) term11705).add(term11761);
        Class<? extends Object> term35438 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term35437 = ((Class) term35438).getDeclaredField((String) "COPY");
        ((Field) term35437).setAccessible(true);
        Object enum69 = ((Field) term35437).get((Object) null);
        term11679 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        Object term11680 = newInstance(Class.forName("java.io.RandomAccessFile"));
        Object term11681 = newInstance(Class.forName("java.io.FileDescriptor"));
        Object term11703 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicBoolean"));
        Object term11782 = newInstance(Class.forName("java.util.zip.CRC32"));
        Object term11784 = newInstance(Class.forName("java.util.zip.CRC32"));
        Object term11788 = newInstance(Class.forName("org.apache.commons.compress.utils.CountingOutputStream"));
        Object term11791 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term11681, term11681.getClass(), "fd", -1);
        setLongField(term11681, term11681.getClass(), "handle", -1L);
        setField(term11681, term11681.getClass(), "parent", null);
        setField(term11681, term11681.getClass(), "otherParents", term11684);
        setBooleanField(term11681, term11681.getClass(), "closed", true);
        setBooleanField(term11681, term11681.getClass(), "append", true);
        setField(term11681, term11681.getClass(), "cleanup", null);
        setField(term11680, term11680.getClass(), "fd", term11681);
        setField(term11680, term11680.getClass(), "channel", null);
        setBooleanField(term11680, term11680.getClass(), "rw", true);
        setField(term11680, term11680.getClass(), "path", "OJJtVNPyKZ");
        setIntField(term11703, term11703.getClass(), "value", -1870495012);
        setField(term11680, term11680.getClass(), "closed", term11703);
        setField(term11679, term11679.getClass(), "file", term11680);
        setField(term11679, term11679.getClass(), "files", term11705);
        setIntField(term11679, term11679.getClass(), "numNonEmptyStreams", -165587447);
        setIntField(term11782, term11782.getClass(), "crc", -1347358701);
        setField(term11679, term11679.getClass(), "crc32", term11782);
        setIntField(term11784, term11784.getClass(), "crc", 806595993);
        setField(term11679, term11679.getClass(), "compressedCrc32", term11784);
        setLongField(term11679, term11679.getClass(), "fileBytesWritten", -1234885562462779381L);
        setBooleanField(term11679, term11679.getClass(), "finished", false);
        setLongField(term11788, term11788.getClass(), "bytesWritten", 2678845111978352940L);
        setField(term11788, term11788.getClass(), "out", null);
        setBooleanField(term11788, term11788.getClass(), "closed", false);
        setField(term11788, term11788.getClass(), "closeLock", term11791);
        setField(term11679, term11679.getClass(), "currentOutputStream", term11788);
        setField(term11679, term11679.getClass(), "contentCompression", enum69);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.DataOutput");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "writeFileMTimes", argTypes, term11679, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


