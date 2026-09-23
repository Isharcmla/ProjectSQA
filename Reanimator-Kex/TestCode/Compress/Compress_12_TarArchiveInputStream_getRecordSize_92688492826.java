package org.apache.commons.compress.archivers.tar;

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
import static org.apache.commons.compress.archivers.tar.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.compress.archivers.tar.EqualityUtils.*;
import java.lang.Object;
import java.lang.String;

public class TarArchiveInputStream_getRecordSize_92688492826 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term284;
     Object term95609;

    public TarArchiveInputStream_getRecordSize_92688492826() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term95659 = Class.forName((String) "java.io.File$PathStatus");
        Field term95658 = ((Class) term95659).getDeclaredField((String) "INVALID");
        ((Field) term95658).setAccessible(true);
        Object enum21 = ((Field) term95658).get((Object) null);
        term284 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term288 = (byte[]) newByteArray(5);
        Object term294 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        byte[] term295 = (byte[]) newByteArray(0);
        Object term301 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term336 = newInstance(Class.forName("java.io.File"));
        byte[] term353 = (byte[]) newByteArray(9);
        setBooleanField(term284, term284.getClass(), "hasHitEOF", false);
        setLongField(term284, term284.getClass(), "entrySize", 4872422362414183754L);
        setLongField(term284, term284.getClass(), "entryOffset", 6811161968424632369L);
        setByteElement(term288, 0, (byte) 74);
        setByteElement(term288, 1, (byte) -71);
        setByteElement(term288, 2, (byte) 49);
        setByteElement(term288, 3, (byte) -54);
        setByteElement(term288, 4, (byte) 67);
        setField(term284, term284.getClass(), "readBuf", term288);
        setField(term294, term294.getClass(), "inStream", null);
        setField(term294, term294.getClass(), "outStream", null);
        setField(term294, term294.getClass(), "blockBuffer", term295);
        setIntField(term294, term294.getClass(), "currBlkIdx", 1585847225);
        setIntField(term294, term294.getClass(), "currRecIdx", 597278769);
        setIntField(term294, term294.getClass(), "blockSize", -1685132342);
        setIntField(term294, term294.getClass(), "recordSize", -1456670397);
        setIntField(term294, term294.getClass(), "recsPerBlock", 1622346318);
        setField(term284, term284.getClass(), "buffer", term294);
        setField(term301, term301.getClass(), "name", "");
        setIntField(term301, term301.getClass(), "mode", 1048535127);
        setIntField(term301, term301.getClass(), "userId", -655067527);
        setIntField(term301, term301.getClass(), "groupId", -6029667);
        setLongField(term301, term301.getClass(), "size", -7237588299778557629L);
        setLongField(term301, term301.getClass(), "modTime", 6967924379644551255L);
        setByteField(term301, term301.getClass(), "linkFlag", (byte) 78);
        setField(term301, term301.getClass(), "linkName", "");
        setField(term301, term301.getClass(), "magic", "ustar ");
        setField(term301, term301.getClass(), "version", "00");
        setField(term301, term301.getClass(), "userName", "root");
        setField(term301, term301.getClass(), "groupName", "");
        setIntField(term301, term301.getClass(), "devMajor", -2068769794);
        setIntField(term301, term301.getClass(), "devMinor", -117576464);
        setBooleanField(term301, term301.getClass(), "isExtended", false);
        setLongField(term301, term301.getClass(), "realSize", -2813493605142626659L);
        setField(term336, term336.getClass(), "path", "sjlJAEtRrb");
        setField(term336, term336.getClass(), "status", enum21);
        setIntField(term336, term336.getClass(), "prefixLength", -1007160944);
        setField(term336, term336.getClass(), "filePath", null);
        setField(term301, term301.getClass(), "file", term336);
        setField(term284, term284.getClass(), "currEntry", term301);
        setByteElement(term353, 0, (byte) 87);
        setByteElement(term353, 1, (byte) 121);
        setByteElement(term353, 2, (byte) -99);
        setByteElement(term353, 3, (byte) -2);
        setByteElement(term353, 4, (byte) -16);
        setByteElement(term353, 5, (byte) -112);
        setByteElement(term353, 6, (byte) -111);
        setByteElement(term353, 7, (byte) 23);
        setByteElement(term353, 8, (byte) -15);
        setField(term284, term284.getClass(), "SINGLE", term353);
        setLongField(term284, term284.getClass(), "bytesRead", -8885298608300233488L);
        Class<? extends Object> term95838 = Class.forName((String) "java.io.File$PathStatus");
        Field term95837 = ((Class) term95838).getDeclaredField((String) "INVALID");
        ((Field) term95837).setAccessible(true);
        Object enum22 = ((Field) term95837).get((Object) null);
        term95609 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term95610 = (byte[]) newByteArray(5);
        Object term95611 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        byte[] term95612 = (byte[]) newByteArray(0);
        Object term95613 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term95626 = newInstance(Class.forName("java.io.File"));
        byte[] term95631 = (byte[]) newByteArray(9);
        setBooleanField(term95609, term95609.getClass(), "hasHitEOF", false);
        setLongField(term95609, term95609.getClass(), "entrySize", 4872422362414183754L);
        setLongField(term95609, term95609.getClass(), "entryOffset", 6811161968424632369L);
        setByteElement(term95610, 0, (byte) 74);
        setByteElement(term95610, 1, (byte) -71);
        setByteElement(term95610, 2, (byte) 49);
        setByteElement(term95610, 3, (byte) -54);
        setByteElement(term95610, 4, (byte) 67);
        setField(term95609, term95609.getClass(), "readBuf", term95610);
        setField(term95611, term95611.getClass(), "inStream", null);
        setField(term95611, term95611.getClass(), "outStream", null);
        setField(term95611, term95611.getClass(), "blockBuffer", term95612);
        setIntField(term95611, term95611.getClass(), "currBlkIdx", 1585847225);
        setIntField(term95611, term95611.getClass(), "currRecIdx", 597278769);
        setIntField(term95611, term95611.getClass(), "blockSize", -1685132342);
        setIntField(term95611, term95611.getClass(), "recordSize", -1456670397);
        setIntField(term95611, term95611.getClass(), "recsPerBlock", 1622346318);
        setField(term95609, term95609.getClass(), "buffer", term95611);
        setField(term95613, term95613.getClass(), "name", "");
        setIntField(term95613, term95613.getClass(), "mode", 1048535127);
        setIntField(term95613, term95613.getClass(), "userId", -655067527);
        setIntField(term95613, term95613.getClass(), "groupId", -6029667);
        setLongField(term95613, term95613.getClass(), "size", -7237588299778557629L);
        setLongField(term95613, term95613.getClass(), "modTime", 6967924379644551255L);
        setByteField(term95613, term95613.getClass(), "linkFlag", (byte) 78);
        setField(term95613, term95613.getClass(), "linkName", "");
        setField(term95613, term95613.getClass(), "magic", "ustar ");
        setField(term95613, term95613.getClass(), "version", "00");
        setField(term95613, term95613.getClass(), "userName", "root");
        setField(term95613, term95613.getClass(), "groupName", "");
        setIntField(term95613, term95613.getClass(), "devMajor", -2068769794);
        setIntField(term95613, term95613.getClass(), "devMinor", -117576464);
        setBooleanField(term95613, term95613.getClass(), "isExtended", false);
        setLongField(term95613, term95613.getClass(), "realSize", -2813493605142626659L);
        setField(term95626, term95626.getClass(), "path", "sjlJAEtRrb");
        setField(term95626, term95626.getClass(), "status", enum22);
        setIntField(term95626, term95626.getClass(), "prefixLength", -1007160944);
        setField(term95626, term95626.getClass(), "filePath", null);
        setField(term95613, term95613.getClass(), "file", term95626);
        setField(term95609, term95609.getClass(), "currEntry", term95613);
        setByteElement(term95631, 0, (byte) 87);
        setByteElement(term95631, 1, (byte) 121);
        setByteElement(term95631, 2, (byte) -99);
        setByteElement(term95631, 3, (byte) -2);
        setByteElement(term95631, 4, (byte) -16);
        setByteElement(term95631, 5, (byte) -112);
        setByteElement(term95631, 6, (byte) -111);
        setByteElement(term95631, 7, (byte) 23);
        setByteElement(term95631, 8, (byte) -15);
        setField(term95609, term95609.getClass(), "SINGLE", term95631);
        setLongField(term95609, term95609.getClass(), "bytesRead", -8885298608300233488L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getRecordSize", argTypes, term284, args);
        assertTrue(recursiveEquals(term284, term95609));
        assertTrue(recursiveEquals(retValue, -1456670397));
    }

};


