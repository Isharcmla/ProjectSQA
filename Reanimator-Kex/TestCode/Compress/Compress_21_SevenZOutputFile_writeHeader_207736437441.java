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

public class SevenZOutputFile_writeHeader_207736437441 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5674;

    public SevenZOutputFile_writeHeader_207736437441() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term5679 = new ArrayList();
        ((ArrayList) term5679).add((Object)null);
        ((ArrayList) term5679).add((Object)null);
        ((ArrayList) term5679).add((Object)null);
        ((ArrayList) term5679).add((Object)null);
        ((ArrayList) term5679).add((Object)null);
        Object term5702 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        setField(term5702, term5702.getClass(), "name", "");
        setBooleanField(term5702, term5702.getClass(), "hasStream", true);
        setBooleanField(term5702, term5702.getClass(), "isDirectory", true);
        setBooleanField(term5702, term5702.getClass(), "isAntiItem", false);
        setBooleanField(term5702, term5702.getClass(), "hasCreationDate", true);
        setBooleanField(term5702, term5702.getClass(), "hasLastModifiedDate", true);
        setBooleanField(term5702, term5702.getClass(), "hasAccessDate", false);
        setLongField(term5702, term5702.getClass(), "creationDate", -6078481855513028760L);
        setLongField(term5702, term5702.getClass(), "lastModifiedDate", -6985556670871089725L);
        setLongField(term5702, term5702.getClass(), "accessDate", -8469818909085103606L);
        setBooleanField(term5702, term5702.getClass(), "hasWindowsAttributes", true);
        setIntField(term5702, term5702.getClass(), "windowsAttributes", 1114000454);
        setBooleanField(term5702, term5702.getClass(), "hasCrc", false);
        setLongField(term5702, term5702.getClass(), "crc", 11315815278355083L);
        setLongField(term5702, term5702.getClass(), "compressedCrc", 7735460540091431012L);
        setLongField(term5702, term5702.getClass(), "size", 1346299551708610248L);
        setLongField(term5702, term5702.getClass(), "compressedSize", -7191625829563442696L);
        Object term5720 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        setField(term5720, term5720.getClass(), "name", "");
        setBooleanField(term5720, term5720.getClass(), "hasStream", true);
        setBooleanField(term5720, term5720.getClass(), "isDirectory", false);
        setBooleanField(term5720, term5720.getClass(), "isAntiItem", false);
        setBooleanField(term5720, term5720.getClass(), "hasCreationDate", true);
        setBooleanField(term5720, term5720.getClass(), "hasLastModifiedDate", false);
        setBooleanField(term5720, term5720.getClass(), "hasAccessDate", false);
        setLongField(term5720, term5720.getClass(), "creationDate", 1463379874413441830L);
        setLongField(term5720, term5720.getClass(), "lastModifiedDate", 7998051124369147543L);
        setLongField(term5720, term5720.getClass(), "accessDate", -1481367303699139651L);
        setBooleanField(term5720, term5720.getClass(), "hasWindowsAttributes", true);
        setIntField(term5720, term5720.getClass(), "windowsAttributes", -556405712);
        setBooleanField(term5720, term5720.getClass(), "hasCrc", true);
        setLongField(term5720, term5720.getClass(), "crc", -7709317346333670618L);
        setLongField(term5720, term5720.getClass(), "compressedCrc", -1964501434345816975L);
        setLongField(term5720, term5720.getClass(), "size", 4689907154423223972L);
        setLongField(term5720, term5720.getClass(), "compressedSize", 8512025621149521819L);
        Object term5738 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        setField(term5738, term5738.getClass(), "name", "");
        setBooleanField(term5738, term5738.getClass(), "hasStream", true);
        setBooleanField(term5738, term5738.getClass(), "isDirectory", false);
        setBooleanField(term5738, term5738.getClass(), "isAntiItem", true);
        setBooleanField(term5738, term5738.getClass(), "hasCreationDate", true);
        setBooleanField(term5738, term5738.getClass(), "hasLastModifiedDate", true);
        setBooleanField(term5738, term5738.getClass(), "hasAccessDate", false);
        setLongField(term5738, term5738.getClass(), "creationDate", 2022482096970820459L);
        setLongField(term5738, term5738.getClass(), "lastModifiedDate", 6315101499811179240L);
        setLongField(term5738, term5738.getClass(), "accessDate", -3033337370154155851L);
        setBooleanField(term5738, term5738.getClass(), "hasWindowsAttributes", false);
        setIntField(term5738, term5738.getClass(), "windowsAttributes", -1772434990);
        setBooleanField(term5738, term5738.getClass(), "hasCrc", true);
        setLongField(term5738, term5738.getClass(), "crc", -3130003589475815807L);
        setLongField(term5738, term5738.getClass(), "compressedCrc", -5344598381371854750L);
        setLongField(term5738, term5738.getClass(), "size", -3718250311794019732L);
        setLongField(term5738, term5738.getClass(), "compressedSize", -5935517391653614345L);
        Object term5756 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        setField(term5756, term5756.getClass(), "name", "");
        setBooleanField(term5756, term5756.getClass(), "hasStream", false);
        setBooleanField(term5756, term5756.getClass(), "isDirectory", false);
        setBooleanField(term5756, term5756.getClass(), "isAntiItem", false);
        setBooleanField(term5756, term5756.getClass(), "hasCreationDate", false);
        setBooleanField(term5756, term5756.getClass(), "hasLastModifiedDate", true);
        setBooleanField(term5756, term5756.getClass(), "hasAccessDate", true);
        setLongField(term5756, term5756.getClass(), "creationDate", -6521561238735301071L);
        setLongField(term5756, term5756.getClass(), "lastModifiedDate", -6609679920238945303L);
        setLongField(term5756, term5756.getClass(), "accessDate", -7296330380944173376L);
        setBooleanField(term5756, term5756.getClass(), "hasWindowsAttributes", false);
        setIntField(term5756, term5756.getClass(), "windowsAttributes", -1845499264);
        setBooleanField(term5756, term5756.getClass(), "hasCrc", false);
        setLongField(term5756, term5756.getClass(), "crc", -8890284990655172580L);
        setLongField(term5756, term5756.getClass(), "compressedCrc", -5951743062322506095L);
        setLongField(term5756, term5756.getClass(), "size", 768144790810175653L);
        setLongField(term5756, term5756.getClass(), "compressedSize", -1497280900081695731L);
        Object term5774 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        setField(term5774, term5774.getClass(), "name", "");
        setBooleanField(term5774, term5774.getClass(), "hasStream", false);
        setBooleanField(term5774, term5774.getClass(), "isDirectory", false);
        setBooleanField(term5774, term5774.getClass(), "isAntiItem", false);
        setBooleanField(term5774, term5774.getClass(), "hasCreationDate", false);
        setBooleanField(term5774, term5774.getClass(), "hasLastModifiedDate", false);
        setBooleanField(term5774, term5774.getClass(), "hasAccessDate", false);
        setLongField(term5774, term5774.getClass(), "creationDate", -3602825674339018793L);
        setLongField(term5774, term5774.getClass(), "lastModifiedDate", 3086974592680165932L);
        setLongField(term5774, term5774.getClass(), "accessDate", -532956263280568707L);
        setBooleanField(term5774, term5774.getClass(), "hasWindowsAttributes", true);
        setIntField(term5774, term5774.getClass(), "windowsAttributes", -505439934);
        setBooleanField(term5774, term5774.getClass(), "hasCrc", true);
        setLongField(term5774, term5774.getClass(), "crc", 6073193746616629086L);
        setLongField(term5774, term5774.getClass(), "compressedCrc", -2463629530824341661L);
        setLongField(term5774, term5774.getClass(), "size", 7800835025296877231L);
        setLongField(term5774, term5774.getClass(), "compressedSize", -187772971269812453L);
        Object term5792 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        setField(term5792, term5792.getClass(), "name", "");
        setBooleanField(term5792, term5792.getClass(), "hasStream", true);
        setBooleanField(term5792, term5792.getClass(), "isDirectory", true);
        setBooleanField(term5792, term5792.getClass(), "isAntiItem", false);
        setBooleanField(term5792, term5792.getClass(), "hasCreationDate", false);
        setBooleanField(term5792, term5792.getClass(), "hasLastModifiedDate", false);
        setBooleanField(term5792, term5792.getClass(), "hasAccessDate", true);
        setLongField(term5792, term5792.getClass(), "creationDate", 468487103823886117L);
        setLongField(term5792, term5792.getClass(), "lastModifiedDate", 4139034517298316285L);
        setLongField(term5792, term5792.getClass(), "accessDate", 5797412846146719084L);
        setBooleanField(term5792, term5792.getClass(), "hasWindowsAttributes", false);
        setIntField(term5792, term5792.getClass(), "windowsAttributes", -344842608);
        setBooleanField(term5792, term5792.getClass(), "hasCrc", false);
        setLongField(term5792, term5792.getClass(), "crc", 5319740127125920367L);
        setLongField(term5792, term5792.getClass(), "compressedCrc", 6465987664600701876L);
        setLongField(term5792, term5792.getClass(), "size", -136372844051852955L);
        setLongField(term5792, term5792.getClass(), "compressedSize", -7632759764262745126L);
        ArrayList term5700 = new ArrayList();
        ((ArrayList) term5700).add(term5702);
        ((ArrayList) term5700).add(term5720);
        ((ArrayList) term5700).add(term5738);
        ((ArrayList) term5700).add(term5756);
        ((ArrayList) term5700).add(term5774);
        ((ArrayList) term5700).add(term5792);
        Class<? extends Object> term27254 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term27253 = ((Class) term27254).getDeclaredField((String) "LZMA");
        ((Field) term27253).setAccessible(true);
        Object enum56 = ((Field) term27253).get((Object) null);
        term5674 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        Object term5675 = newInstance(Class.forName("java.io.RandomAccessFile"));
        Object term5676 = newInstance(Class.forName("java.io.FileDescriptor"));
        Object term5698 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicBoolean"));
        Object term5813 = newInstance(Class.forName("java.util.zip.CRC32"));
        Object term5815 = newInstance(Class.forName("java.util.zip.CRC32"));
        Object term5819 = newInstance(Class.forName("org.apache.commons.compress.utils.CountingOutputStream"));
        Object term5822 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term5676, term5676.getClass(), "fd", -1);
        setLongField(term5676, term5676.getClass(), "handle", -1L);
        setField(term5676, term5676.getClass(), "parent", null);
        setField(term5676, term5676.getClass(), "otherParents", term5679);
        setBooleanField(term5676, term5676.getClass(), "closed", true);
        setBooleanField(term5676, term5676.getClass(), "append", false);
        setField(term5676, term5676.getClass(), "cleanup", null);
        setField(term5675, term5675.getClass(), "fd", term5676);
        setField(term5675, term5675.getClass(), "channel", null);
        setBooleanField(term5675, term5675.getClass(), "rw", true);
        setField(term5675, term5675.getClass(), "path", "UoYtihxVaS");
        setIntField(term5698, term5698.getClass(), "value", 1442160736);
        setField(term5675, term5675.getClass(), "closed", term5698);
        setField(term5674, term5674.getClass(), "file", term5675);
        setField(term5674, term5674.getClass(), "files", term5700);
        setIntField(term5674, term5674.getClass(), "numNonEmptyStreams", 941650513);
        setIntField(term5813, term5813.getClass(), "crc", 444029505);
        setField(term5674, term5674.getClass(), "crc32", term5813);
        setIntField(term5815, term5815.getClass(), "crc", -1034506028);
        setField(term5674, term5674.getClass(), "compressedCrc32", term5815);
        setLongField(term5674, term5674.getClass(), "fileBytesWritten", 3746481521207337771L);
        setBooleanField(term5674, term5674.getClass(), "finished", false);
        setLongField(term5819, term5819.getClass(), "bytesWritten", 4341016500855678917L);
        setField(term5819, term5819.getClass(), "out", null);
        setBooleanField(term5819, term5819.getClass(), "closed", false);
        setField(term5819, term5819.getClass(), "closeLock", term5822);
        setField(term5674, term5674.getClass(), "currentOutputStream", term5819);
        setField(term5674, term5674.getClass(), "contentCompression", enum56);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.DataOutput");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "writeHeader", argTypes, term5674, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


