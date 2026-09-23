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

public class SevenZOutputFile_writeFileAntiItems_23756079950 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9833;

    public SevenZOutputFile_writeFileAntiItems_23756079950() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term9838 = new ArrayList();
        ((ArrayList) term9838).add((Object)null);
        ((ArrayList) term9838).add((Object)null);
        ((ArrayList) term9838).add((Object)null);
        ((ArrayList) term9838).add((Object)null);
        ((ArrayList) term9838).add((Object)null);
        ((ArrayList) term9838).add((Object)null);
        Object term9861 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        setField(term9861, term9861.getClass(), "name", "");
        setBooleanField(term9861, term9861.getClass(), "hasStream", true);
        setBooleanField(term9861, term9861.getClass(), "isDirectory", false);
        setBooleanField(term9861, term9861.getClass(), "isAntiItem", true);
        setBooleanField(term9861, term9861.getClass(), "hasCreationDate", false);
        setBooleanField(term9861, term9861.getClass(), "hasLastModifiedDate", true);
        setBooleanField(term9861, term9861.getClass(), "hasAccessDate", false);
        setLongField(term9861, term9861.getClass(), "creationDate", 4006388896509492239L);
        setLongField(term9861, term9861.getClass(), "lastModifiedDate", -6314099457945626605L);
        setLongField(term9861, term9861.getClass(), "accessDate", -8697239524885136781L);
        setBooleanField(term9861, term9861.getClass(), "hasWindowsAttributes", false);
        setIntField(term9861, term9861.getClass(), "windowsAttributes", 1296895584);
        setBooleanField(term9861, term9861.getClass(), "hasCrc", false);
        setLongField(term9861, term9861.getClass(), "crc", 6465539339431559532L);
        setLongField(term9861, term9861.getClass(), "compressedCrc", -5304831679802174866L);
        setLongField(term9861, term9861.getClass(), "size", 1909175111101717943L);
        setLongField(term9861, term9861.getClass(), "compressedSize", 8499930868919012909L);
        Object term9879 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        setField(term9879, term9879.getClass(), "name", "");
        setBooleanField(term9879, term9879.getClass(), "hasStream", false);
        setBooleanField(term9879, term9879.getClass(), "isDirectory", true);
        setBooleanField(term9879, term9879.getClass(), "isAntiItem", true);
        setBooleanField(term9879, term9879.getClass(), "hasCreationDate", true);
        setBooleanField(term9879, term9879.getClass(), "hasLastModifiedDate", false);
        setBooleanField(term9879, term9879.getClass(), "hasAccessDate", false);
        setLongField(term9879, term9879.getClass(), "creationDate", 6252795312796363233L);
        setLongField(term9879, term9879.getClass(), "lastModifiedDate", 3968143267572761057L);
        setLongField(term9879, term9879.getClass(), "accessDate", 2712394591642260550L);
        setBooleanField(term9879, term9879.getClass(), "hasWindowsAttributes", true);
        setIntField(term9879, term9879.getClass(), "windowsAttributes", 628918458);
        setBooleanField(term9879, term9879.getClass(), "hasCrc", true);
        setLongField(term9879, term9879.getClass(), "crc", -1211273460223868511L);
        setLongField(term9879, term9879.getClass(), "compressedCrc", -8172564209423941839L);
        setLongField(term9879, term9879.getClass(), "size", -4561371668792438386L);
        setLongField(term9879, term9879.getClass(), "compressedSize", 7065003857377879971L);
        ArrayList term9859 = new ArrayList();
        ((ArrayList) term9859).add(term9861);
        ((ArrayList) term9859).add(term9879);
        Class<? extends Object> term32751 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term32750 = ((Class) term32751).getDeclaredField((String) "COPY");
        ((Field) term32750).setAccessible(true);
        Object enum65 = ((Field) term32750).get((Object) null);
        term9833 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        Object term9834 = newInstance(Class.forName("java.io.RandomAccessFile"));
        Object term9835 = newInstance(Class.forName("java.io.FileDescriptor"));
        Object term9857 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicBoolean"));
        Object term9900 = newInstance(Class.forName("java.util.zip.CRC32"));
        Object term9902 = newInstance(Class.forName("java.util.zip.CRC32"));
        Object term9906 = newInstance(Class.forName("org.apache.commons.compress.utils.CountingOutputStream"));
        Object term9909 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term9835, term9835.getClass(), "fd", -1);
        setLongField(term9835, term9835.getClass(), "handle", -1L);
        setField(term9835, term9835.getClass(), "parent", null);
        setField(term9835, term9835.getClass(), "otherParents", term9838);
        setBooleanField(term9835, term9835.getClass(), "closed", false);
        setBooleanField(term9835, term9835.getClass(), "append", false);
        setField(term9835, term9835.getClass(), "cleanup", null);
        setField(term9834, term9834.getClass(), "fd", term9835);
        setField(term9834, term9834.getClass(), "channel", null);
        setBooleanField(term9834, term9834.getClass(), "rw", true);
        setField(term9834, term9834.getClass(), "path", "xBsXSDjXYK");
        setIntField(term9857, term9857.getClass(), "value", -2014576105);
        setField(term9834, term9834.getClass(), "closed", term9857);
        setField(term9833, term9833.getClass(), "file", term9834);
        setField(term9833, term9833.getClass(), "files", term9859);
        setIntField(term9833, term9833.getClass(), "numNonEmptyStreams", -1274456137);
        setIntField(term9900, term9900.getClass(), "crc", 1041916673);
        setField(term9833, term9833.getClass(), "crc32", term9900);
        setIntField(term9902, term9902.getClass(), "crc", -601863069);
        setField(term9833, term9833.getClass(), "compressedCrc32", term9902);
        setLongField(term9833, term9833.getClass(), "fileBytesWritten", 2243864141567980599L);
        setBooleanField(term9833, term9833.getClass(), "finished", false);
        setLongField(term9906, term9906.getClass(), "bytesWritten", 353705949229610067L);
        setField(term9906, term9906.getClass(), "out", null);
        setBooleanField(term9906, term9906.getClass(), "closed", false);
        setField(term9906, term9906.getClass(), "closeLock", term9909);
        setField(term9833, term9833.getClass(), "currentOutputStream", term9906);
        setField(term9833, term9833.getClass(), "contentCompression", enum65);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.DataOutput");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "writeFileAntiItems", argTypes, term9833, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


