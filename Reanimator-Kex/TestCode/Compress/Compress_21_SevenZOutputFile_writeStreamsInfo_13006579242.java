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

public class SevenZOutputFile_writeStreamsInfo_13006579242 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6149;

    public SevenZOutputFile_writeStreamsInfo_13006579242() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term6154 = new ArrayList();
        ((ArrayList) term6154).add((Object)null);
        ((ArrayList) term6154).add((Object)null);
        ((ArrayList) term6154).add((Object)null);
        ((ArrayList) term6154).add((Object)null);
        ((ArrayList) term6154).add((Object)null);
        Object term6177 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        setField(term6177, term6177.getClass(), "name", "");
        setBooleanField(term6177, term6177.getClass(), "hasStream", true);
        setBooleanField(term6177, term6177.getClass(), "isDirectory", false);
        setBooleanField(term6177, term6177.getClass(), "isAntiItem", true);
        setBooleanField(term6177, term6177.getClass(), "hasCreationDate", true);
        setBooleanField(term6177, term6177.getClass(), "hasLastModifiedDate", false);
        setBooleanField(term6177, term6177.getClass(), "hasAccessDate", false);
        setLongField(term6177, term6177.getClass(), "creationDate", -5871746020807491998L);
        setLongField(term6177, term6177.getClass(), "lastModifiedDate", 4742108233936970770L);
        setLongField(term6177, term6177.getClass(), "accessDate", 2722004046017350471L);
        setBooleanField(term6177, term6177.getClass(), "hasWindowsAttributes", true);
        setIntField(term6177, term6177.getClass(), "windowsAttributes", -894662986);
        setBooleanField(term6177, term6177.getClass(), "hasCrc", false);
        setLongField(term6177, term6177.getClass(), "crc", 6636235983121346803L);
        setLongField(term6177, term6177.getClass(), "compressedCrc", 146749226579788091L);
        setLongField(term6177, term6177.getClass(), "size", -1279670138064751276L);
        setLongField(term6177, term6177.getClass(), "compressedSize", -7205236974351118210L);
        Object term6195 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        setField(term6195, term6195.getClass(), "name", "");
        setBooleanField(term6195, term6195.getClass(), "hasStream", false);
        setBooleanField(term6195, term6195.getClass(), "isDirectory", true);
        setBooleanField(term6195, term6195.getClass(), "isAntiItem", false);
        setBooleanField(term6195, term6195.getClass(), "hasCreationDate", false);
        setBooleanField(term6195, term6195.getClass(), "hasLastModifiedDate", false);
        setBooleanField(term6195, term6195.getClass(), "hasAccessDate", false);
        setLongField(term6195, term6195.getClass(), "creationDate", -2136893352275781569L);
        setLongField(term6195, term6195.getClass(), "lastModifiedDate", -9147545274054597570L);
        setLongField(term6195, term6195.getClass(), "accessDate", -8398381579707958144L);
        setBooleanField(term6195, term6195.getClass(), "hasWindowsAttributes", false);
        setIntField(term6195, term6195.getClass(), "windowsAttributes", 304775596);
        setBooleanField(term6195, term6195.getClass(), "hasCrc", false);
        setLongField(term6195, term6195.getClass(), "crc", -2195061939206930224L);
        setLongField(term6195, term6195.getClass(), "compressedCrc", 4525924047960478347L);
        setLongField(term6195, term6195.getClass(), "size", -3225860270104198596L);
        setLongField(term6195, term6195.getClass(), "compressedSize", -1164342036939643746L);
        Object term6213 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        setField(term6213, term6213.getClass(), "name", "");
        setBooleanField(term6213, term6213.getClass(), "hasStream", true);
        setBooleanField(term6213, term6213.getClass(), "isDirectory", false);
        setBooleanField(term6213, term6213.getClass(), "isAntiItem", true);
        setBooleanField(term6213, term6213.getClass(), "hasCreationDate", true);
        setBooleanField(term6213, term6213.getClass(), "hasLastModifiedDate", false);
        setBooleanField(term6213, term6213.getClass(), "hasAccessDate", false);
        setLongField(term6213, term6213.getClass(), "creationDate", -7013378340043571457L);
        setLongField(term6213, term6213.getClass(), "lastModifiedDate", -3279534582096707294L);
        setLongField(term6213, term6213.getClass(), "accessDate", -6490254947459640565L);
        setBooleanField(term6213, term6213.getClass(), "hasWindowsAttributes", true);
        setIntField(term6213, term6213.getClass(), "windowsAttributes", -1347665717);
        setBooleanField(term6213, term6213.getClass(), "hasCrc", true);
        setLongField(term6213, term6213.getClass(), "crc", -7001094993638840490L);
        setLongField(term6213, term6213.getClass(), "compressedCrc", 3077284143733577490L);
        setLongField(term6213, term6213.getClass(), "size", 4458302820344896046L);
        setLongField(term6213, term6213.getClass(), "compressedSize", -432424084523104253L);
        ArrayList term6175 = new ArrayList();
        ((ArrayList) term6175).add(term6177);
        ((ArrayList) term6175).add(term6195);
        ((ArrayList) term6175).add(term6213);
        Class<? extends Object> term27817 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term27816 = ((Class) term27817).getDeclaredField((String) "DEFLATE");
        ((Field) term27816).setAccessible(true);
        Object enum57 = ((Field) term27816).get((Object) null);
        term6149 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        Object term6150 = newInstance(Class.forName("java.io.RandomAccessFile"));
        Object term6151 = newInstance(Class.forName("java.io.FileDescriptor"));
        Object term6173 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicBoolean"));
        Object term6234 = newInstance(Class.forName("java.util.zip.CRC32"));
        Object term6236 = newInstance(Class.forName("java.util.zip.CRC32"));
        Object term6240 = newInstance(Class.forName("org.apache.commons.compress.utils.CountingOutputStream"));
        Object term6243 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term6151, term6151.getClass(), "fd", -1);
        setLongField(term6151, term6151.getClass(), "handle", -1L);
        setField(term6151, term6151.getClass(), "parent", null);
        setField(term6151, term6151.getClass(), "otherParents", term6154);
        setBooleanField(term6151, term6151.getClass(), "closed", true);
        setBooleanField(term6151, term6151.getClass(), "append", true);
        setField(term6151, term6151.getClass(), "cleanup", null);
        setField(term6150, term6150.getClass(), "fd", term6151);
        setField(term6150, term6150.getClass(), "channel", null);
        setBooleanField(term6150, term6150.getClass(), "rw", false);
        setField(term6150, term6150.getClass(), "path", "nHXjMycHlU");
        setIntField(term6173, term6173.getClass(), "value", -1263114719);
        setField(term6150, term6150.getClass(), "closed", term6173);
        setField(term6149, term6149.getClass(), "file", term6150);
        setField(term6149, term6149.getClass(), "files", term6175);
        setIntField(term6149, term6149.getClass(), "numNonEmptyStreams", -1888585309);
        setIntField(term6234, term6234.getClass(), "crc", 683666002);
        setField(term6149, term6149.getClass(), "crc32", term6234);
        setIntField(term6236, term6236.getClass(), "crc", 1596213415);
        setField(term6149, term6149.getClass(), "compressedCrc32", term6236);
        setLongField(term6149, term6149.getClass(), "fileBytesWritten", 6150186973473930616L);
        setBooleanField(term6149, term6149.getClass(), "finished", true);
        setLongField(term6240, term6240.getClass(), "bytesWritten", -3850323135468805420L);
        setField(term6240, term6240.getClass(), "out", null);
        setBooleanField(term6240, term6240.getClass(), "closed", true);
        setField(term6240, term6240.getClass(), "closeLock", term6243);
        setField(term6149, term6149.getClass(), "currentOutputStream", term6240);
        setField(term6149, term6149.getClass(), "contentCompression", enum57);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.DataOutput");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "writeStreamsInfo", argTypes, term6149, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


