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

public class SevenZOutputFile_writeFileEmptyFiles_85746672349 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9318;

    public SevenZOutputFile_writeFileEmptyFiles_85746672349() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term9323 = new ArrayList();
        ((ArrayList) term9323).add((Object)null);
        ((ArrayList) term9323).add((Object)null);
        ((ArrayList) term9323).add((Object)null);
        ((ArrayList) term9323).add((Object)null);
        Object term9346 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        setField(term9346, term9346.getClass(), "name", "");
        setBooleanField(term9346, term9346.getClass(), "hasStream", true);
        setBooleanField(term9346, term9346.getClass(), "isDirectory", false);
        setBooleanField(term9346, term9346.getClass(), "isAntiItem", false);
        setBooleanField(term9346, term9346.getClass(), "hasCreationDate", true);
        setBooleanField(term9346, term9346.getClass(), "hasLastModifiedDate", false);
        setBooleanField(term9346, term9346.getClass(), "hasAccessDate", false);
        setLongField(term9346, term9346.getClass(), "creationDate", -159468133651974975L);
        setLongField(term9346, term9346.getClass(), "lastModifiedDate", 9160882370265093763L);
        setLongField(term9346, term9346.getClass(), "accessDate", 6848008460134431064L);
        setBooleanField(term9346, term9346.getClass(), "hasWindowsAttributes", true);
        setIntField(term9346, term9346.getClass(), "windowsAttributes", -227365013);
        setBooleanField(term9346, term9346.getClass(), "hasCrc", false);
        setLongField(term9346, term9346.getClass(), "crc", -5338413783740215067L);
        setLongField(term9346, term9346.getClass(), "compressedCrc", -814922776357887557L);
        setLongField(term9346, term9346.getClass(), "size", 800893933628130392L);
        setLongField(term9346, term9346.getClass(), "compressedSize", -6983938899150831997L);
        Object term9364 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        setField(term9364, term9364.getClass(), "name", "");
        setBooleanField(term9364, term9364.getClass(), "hasStream", false);
        setBooleanField(term9364, term9364.getClass(), "isDirectory", true);
        setBooleanField(term9364, term9364.getClass(), "isAntiItem", true);
        setBooleanField(term9364, term9364.getClass(), "hasCreationDate", false);
        setBooleanField(term9364, term9364.getClass(), "hasLastModifiedDate", true);
        setBooleanField(term9364, term9364.getClass(), "hasAccessDate", false);
        setLongField(term9364, term9364.getClass(), "creationDate", -2720964670491002091L);
        setLongField(term9364, term9364.getClass(), "lastModifiedDate", -723697646775816649L);
        setLongField(term9364, term9364.getClass(), "accessDate", -5671086125367688052L);
        setBooleanField(term9364, term9364.getClass(), "hasWindowsAttributes", false);
        setIntField(term9364, term9364.getClass(), "windowsAttributes", 11724947);
        setBooleanField(term9364, term9364.getClass(), "hasCrc", true);
        setLongField(term9364, term9364.getClass(), "crc", 7875739215674729968L);
        setLongField(term9364, term9364.getClass(), "compressedCrc", -8605430501912680279L);
        setLongField(term9364, term9364.getClass(), "size", 2985226914509512766L);
        setLongField(term9364, term9364.getClass(), "compressedSize", 4041117732464806744L);
        Object term9382 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        setField(term9382, term9382.getClass(), "name", "");
        setBooleanField(term9382, term9382.getClass(), "hasStream", false);
        setBooleanField(term9382, term9382.getClass(), "isDirectory", true);
        setBooleanField(term9382, term9382.getClass(), "isAntiItem", true);
        setBooleanField(term9382, term9382.getClass(), "hasCreationDate", true);
        setBooleanField(term9382, term9382.getClass(), "hasLastModifiedDate", false);
        setBooleanField(term9382, term9382.getClass(), "hasAccessDate", true);
        setLongField(term9382, term9382.getClass(), "creationDate", 7199459243454109261L);
        setLongField(term9382, term9382.getClass(), "lastModifiedDate", -1009485425289165749L);
        setLongField(term9382, term9382.getClass(), "accessDate", -5044181804110715069L);
        setBooleanField(term9382, term9382.getClass(), "hasWindowsAttributes", false);
        setIntField(term9382, term9382.getClass(), "windowsAttributes", 1953277050);
        setBooleanField(term9382, term9382.getClass(), "hasCrc", false);
        setLongField(term9382, term9382.getClass(), "crc", -2413135395771470086L);
        setLongField(term9382, term9382.getClass(), "compressedCrc", -823085399570394644L);
        setLongField(term9382, term9382.getClass(), "size", -894705411488729365L);
        setLongField(term9382, term9382.getClass(), "compressedSize", -7514437039500876647L);
        Object term9400 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        setField(term9400, term9400.getClass(), "name", "");
        setBooleanField(term9400, term9400.getClass(), "hasStream", false);
        setBooleanField(term9400, term9400.getClass(), "isDirectory", false);
        setBooleanField(term9400, term9400.getClass(), "isAntiItem", false);
        setBooleanField(term9400, term9400.getClass(), "hasCreationDate", true);
        setBooleanField(term9400, term9400.getClass(), "hasLastModifiedDate", false);
        setBooleanField(term9400, term9400.getClass(), "hasAccessDate", false);
        setLongField(term9400, term9400.getClass(), "creationDate", 204473662283899955L);
        setLongField(term9400, term9400.getClass(), "lastModifiedDate", -4029227951294167228L);
        setLongField(term9400, term9400.getClass(), "accessDate", 5160033404788124731L);
        setBooleanField(term9400, term9400.getClass(), "hasWindowsAttributes", true);
        setIntField(term9400, term9400.getClass(), "windowsAttributes", 1283079251);
        setBooleanField(term9400, term9400.getClass(), "hasCrc", false);
        setLongField(term9400, term9400.getClass(), "crc", 5071015720043054072L);
        setLongField(term9400, term9400.getClass(), "compressedCrc", -7006877527579112761L);
        setLongField(term9400, term9400.getClass(), "size", -8699693633047465617L);
        setLongField(term9400, term9400.getClass(), "compressedSize", -590890905395927244L);
        Object term9418 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        setField(term9418, term9418.getClass(), "name", "");
        setBooleanField(term9418, term9418.getClass(), "hasStream", true);
        setBooleanField(term9418, term9418.getClass(), "isDirectory", true);
        setBooleanField(term9418, term9418.getClass(), "isAntiItem", true);
        setBooleanField(term9418, term9418.getClass(), "hasCreationDate", true);
        setBooleanField(term9418, term9418.getClass(), "hasLastModifiedDate", true);
        setBooleanField(term9418, term9418.getClass(), "hasAccessDate", false);
        setLongField(term9418, term9418.getClass(), "creationDate", 6978548804004471804L);
        setLongField(term9418, term9418.getClass(), "lastModifiedDate", -8957441653116712448L);
        setLongField(term9418, term9418.getClass(), "accessDate", -5761087225966065493L);
        setBooleanField(term9418, term9418.getClass(), "hasWindowsAttributes", true);
        setIntField(term9418, term9418.getClass(), "windowsAttributes", -523949691);
        setBooleanField(term9418, term9418.getClass(), "hasCrc", false);
        setLongField(term9418, term9418.getClass(), "crc", 493557348274366095L);
        setLongField(term9418, term9418.getClass(), "compressedCrc", 8699742215739444902L);
        setLongField(term9418, term9418.getClass(), "size", 8261619652909874476L);
        setLongField(term9418, term9418.getClass(), "compressedSize", -3692936312179064102L);
        Object term9436 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        setField(term9436, term9436.getClass(), "name", "");
        setBooleanField(term9436, term9436.getClass(), "hasStream", false);
        setBooleanField(term9436, term9436.getClass(), "isDirectory", false);
        setBooleanField(term9436, term9436.getClass(), "isAntiItem", false);
        setBooleanField(term9436, term9436.getClass(), "hasCreationDate", false);
        setBooleanField(term9436, term9436.getClass(), "hasLastModifiedDate", true);
        setBooleanField(term9436, term9436.getClass(), "hasAccessDate", true);
        setLongField(term9436, term9436.getClass(), "creationDate", 5498944509671266637L);
        setLongField(term9436, term9436.getClass(), "lastModifiedDate", -6838909359433858599L);
        setLongField(term9436, term9436.getClass(), "accessDate", 4947643967691976731L);
        setBooleanField(term9436, term9436.getClass(), "hasWindowsAttributes", true);
        setIntField(term9436, term9436.getClass(), "windowsAttributes", 1398204340);
        setBooleanField(term9436, term9436.getClass(), "hasCrc", true);
        setLongField(term9436, term9436.getClass(), "crc", 4548576710115075073L);
        setLongField(term9436, term9436.getClass(), "compressedCrc", -1486519351300660432L);
        setLongField(term9436, term9436.getClass(), "size", 4777103307547199454L);
        setLongField(term9436, term9436.getClass(), "compressedSize", 6462632207326555041L);
        Object term9454 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        setField(term9454, term9454.getClass(), "name", "");
        setBooleanField(term9454, term9454.getClass(), "hasStream", false);
        setBooleanField(term9454, term9454.getClass(), "isDirectory", false);
        setBooleanField(term9454, term9454.getClass(), "isAntiItem", false);
        setBooleanField(term9454, term9454.getClass(), "hasCreationDate", true);
        setBooleanField(term9454, term9454.getClass(), "hasLastModifiedDate", true);
        setBooleanField(term9454, term9454.getClass(), "hasAccessDate", true);
        setLongField(term9454, term9454.getClass(), "creationDate", -3188913050877092148L);
        setLongField(term9454, term9454.getClass(), "lastModifiedDate", -6759247883224780481L);
        setLongField(term9454, term9454.getClass(), "accessDate", -3724162247917461536L);
        setBooleanField(term9454, term9454.getClass(), "hasWindowsAttributes", true);
        setIntField(term9454, term9454.getClass(), "windowsAttributes", 229204365);
        setBooleanField(term9454, term9454.getClass(), "hasCrc", false);
        setLongField(term9454, term9454.getClass(), "crc", 7893661350133453338L);
        setLongField(term9454, term9454.getClass(), "compressedCrc", 9056245012917372169L);
        setLongField(term9454, term9454.getClass(), "size", 7848004402682338886L);
        setLongField(term9454, term9454.getClass(), "compressedSize", 8931772176819893873L);
        Object term9472 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        setField(term9472, term9472.getClass(), "name", "");
        setBooleanField(term9472, term9472.getClass(), "hasStream", true);
        setBooleanField(term9472, term9472.getClass(), "isDirectory", false);
        setBooleanField(term9472, term9472.getClass(), "isAntiItem", true);
        setBooleanField(term9472, term9472.getClass(), "hasCreationDate", false);
        setBooleanField(term9472, term9472.getClass(), "hasLastModifiedDate", true);
        setBooleanField(term9472, term9472.getClass(), "hasAccessDate", true);
        setLongField(term9472, term9472.getClass(), "creationDate", -4370635295110591519L);
        setLongField(term9472, term9472.getClass(), "lastModifiedDate", -1325109462577461208L);
        setLongField(term9472, term9472.getClass(), "accessDate", -7181112149072926893L);
        setBooleanField(term9472, term9472.getClass(), "hasWindowsAttributes", true);
        setIntField(term9472, term9472.getClass(), "windowsAttributes", -461771056);
        setBooleanField(term9472, term9472.getClass(), "hasCrc", false);
        setLongField(term9472, term9472.getClass(), "crc", -5850316381591949820L);
        setLongField(term9472, term9472.getClass(), "compressedCrc", 5857854340777182167L);
        setLongField(term9472, term9472.getClass(), "size", 3660520943100987842L);
        setLongField(term9472, term9472.getClass(), "compressedSize", -8211240904293846981L);
        ArrayList term9344 = new ArrayList();
        ((ArrayList) term9344).add(term9346);
        ((ArrayList) term9344).add(term9364);
        ((ArrayList) term9344).add(term9382);
        ((ArrayList) term9344).add(term9400);
        ((ArrayList) term9344).add(term9418);
        ((ArrayList) term9344).add(term9436);
        ((ArrayList) term9344).add(term9454);
        ((ArrayList) term9344).add(term9472);
        Class<? extends Object> term32120 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term32119 = ((Class) term32120).getDeclaredField((String) "BZIP2");
        ((Field) term32119).setAccessible(true);
        Object enum64 = ((Field) term32119).get((Object) null);
        term9318 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        Object term9319 = newInstance(Class.forName("java.io.RandomAccessFile"));
        Object term9320 = newInstance(Class.forName("java.io.FileDescriptor"));
        Object term9342 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicBoolean"));
        Object term9493 = newInstance(Class.forName("java.util.zip.CRC32"));
        Object term9495 = newInstance(Class.forName("java.util.zip.CRC32"));
        Object term9499 = newInstance(Class.forName("org.apache.commons.compress.utils.CountingOutputStream"));
        Object term9502 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term9320, term9320.getClass(), "fd", -1);
        setLongField(term9320, term9320.getClass(), "handle", -1L);
        setField(term9320, term9320.getClass(), "parent", null);
        setField(term9320, term9320.getClass(), "otherParents", term9323);
        setBooleanField(term9320, term9320.getClass(), "closed", false);
        setBooleanField(term9320, term9320.getClass(), "append", true);
        setField(term9320, term9320.getClass(), "cleanup", null);
        setField(term9319, term9319.getClass(), "fd", term9320);
        setField(term9319, term9319.getClass(), "channel", null);
        setBooleanField(term9319, term9319.getClass(), "rw", false);
        setField(term9319, term9319.getClass(), "path", "JiVRgTZvKc");
        setIntField(term9342, term9342.getClass(), "value", 1830648570);
        setField(term9319, term9319.getClass(), "closed", term9342);
        setField(term9318, term9318.getClass(), "file", term9319);
        setField(term9318, term9318.getClass(), "files", term9344);
        setIntField(term9318, term9318.getClass(), "numNonEmptyStreams", -243422082);
        setIntField(term9493, term9493.getClass(), "crc", 1384592638);
        setField(term9318, term9318.getClass(), "crc32", term9493);
        setIntField(term9495, term9495.getClass(), "crc", -1002370457);
        setField(term9318, term9318.getClass(), "compressedCrc32", term9495);
        setLongField(term9318, term9318.getClass(), "fileBytesWritten", 3535528164828723056L);
        setBooleanField(term9318, term9318.getClass(), "finished", true);
        setLongField(term9499, term9499.getClass(), "bytesWritten", 4036794646678680547L);
        setField(term9499, term9499.getClass(), "out", null);
        setBooleanField(term9499, term9499.getClass(), "closed", false);
        setField(term9499, term9499.getClass(), "closeLock", term9502);
        setField(term9318, term9318.getClass(), "currentOutputStream", term9499);
        setField(term9318, term9318.getClass(), "contentCompression", enum64);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.DataOutput");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "writeFileEmptyFiles", argTypes, term9318, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


