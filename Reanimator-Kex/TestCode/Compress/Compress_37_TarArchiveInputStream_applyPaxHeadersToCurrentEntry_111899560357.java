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
import java.util.HashMap;
import java.util.LinkedHashMap;

public class TarArchiveInputStream_applyPaxHeadersToCurrentEntry_111899560357 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4570;
     Object term4671;
     Object term20896;
     Object term20920;

    public TarArchiveInputStream_applyPaxHeadersToCurrentEntry_111899560357() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term20952 = Class.forName((String) "java.io.File$PathStatus");
        Field term20951 = ((Class) term20952).getDeclaredField((String) "INVALID");
        ((Field) term20951).setAccessible(true);
        Object enum55 = ((Field) term20951).get((Object) null);
        HashMap term4653 = new HashMap();
        term4570 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term4571 = (byte[]) newByteArray(8);
        Object term4585 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term4624 = newInstance(Class.forName("java.io.File"));
        byte[] term4663 = (byte[]) newByteArray(6);
        setByteElement(term4571, 0, (byte) -126);
        setByteElement(term4571, 1, (byte) 12);
        setByteElement(term4571, 2, (byte) -75);
        setByteElement(term4571, 3, (byte) 69);
        setByteElement(term4571, 4, (byte) -6);
        setByteElement(term4571, 5, (byte) 107);
        setByteElement(term4571, 6, (byte) -109);
        setByteElement(term4571, 7, (byte) 122);
        setField(term4570, term4570.getClass(), "SMALL_BUF", term4571);
        setIntField(term4570, term4570.getClass(), "recordSize", 1596213415);
        setIntField(term4570, term4570.getClass(), "blockSize", -268815336);
        setBooleanField(term4570, term4570.getClass(), "hasHitEOF", true);
        setLongField(term4570, term4570.getClass(), "entrySize", -6432617521836576658L);
        setLongField(term4570, term4570.getClass(), "entryOffset", -2255965562447970862L);
        setField(term4570, term4570.getClass(), "is", null);
        setField(term4585, term4585.getClass(), "name", "");
        setBooleanField(term4585, term4585.getClass(), "preserveLeadingSlashes", true);
        setIntField(term4585, term4585.getClass(), "mode", -1210583429);
        setLongField(term4585, term4585.getClass(), "userId", 148047808219672941L);
        setLongField(term4585, term4585.getClass(), "groupId", 7489064039921396098L);
        setLongField(term4585, term4585.getClass(), "size", 6843866297465638866L);
        setLongField(term4585, term4585.getClass(), "modTime", -4023935540989049732L);
        setBooleanField(term4585, term4585.getClass(), "checkSumOK", true);
        setByteField(term4585, term4585.getClass(), "linkFlag", (byte) 83);
        setField(term4585, term4585.getClass(), "linkName", "");
        setField(term4585, term4585.getClass(), "magic", "ustar ");
        setField(term4585, term4585.getClass(), "version", "00");
        setField(term4585, term4585.getClass(), "userName", "root");
        setField(term4585, term4585.getClass(), "groupName", "");
        setIntField(term4585, term4585.getClass(), "devMajor", -663691365);
        setIntField(term4585, term4585.getClass(), "devMinor", 339854490);
        setBooleanField(term4585, term4585.getClass(), "isExtended", false);
        setLongField(term4585, term4585.getClass(), "realSize", 855932984568615096L);
        setBooleanField(term4585, term4585.getClass(), "paxGNUSparse", true);
        setBooleanField(term4585, term4585.getClass(), "starSparse", true);
        setField(term4624, term4624.getClass(), "path", "TJmVBGfTML");
        setField(term4624, term4624.getClass(), "status", enum55);
        setIntField(term4624, term4624.getClass(), "prefixLength", -615654495);
        setField(term4624, term4624.getClass(), "filePath", null);
        setField(term4585, term4585.getClass(), "file", term4624);
        setField(term4570, term4570.getClass(), "currEntry", term4585);
        setField(term4570, term4570.getClass(), "zipEncoding", null);
        setField(term4570, term4570.getClass(), "encoding", "tPlsykYBqO");
        setField(term4570, term4570.getClass(), "globalPaxHeaders", term4653);
        setByteElement(term4663, 0, (byte) -123);
        setByteElement(term4663, 1, (byte) -76);
        setByteElement(term4663, 2, (byte) -115);
        setByteElement(term4663, 3, (byte) -48);
        setByteElement(term4663, 4, (byte) 126);
        setByteElement(term4663, 5, (byte) -2);
        setField(term4570, term4570.getClass(), "SINGLE", term4663);
        setLongField(term4570, term4570.getClass(), "bytesRead", -1616722610139554082L);
        term4671 = new LinkedHashMap();
        Class<? extends Object> term21141 = Class.forName((String) "java.io.File$PathStatus");
        Field term21140 = ((Class) term21141).getDeclaredField((String) "INVALID");
        ((Field) term21140).setAccessible(true);
        Object enum56 = ((Field) term21140).get((Object) null);
        HashMap term20918 = new HashMap();
        term20896 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term20897 = (byte[]) newByteArray(8);
        Object term20898 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term20911 = newInstance(Class.forName("java.io.File"));
        byte[] term20919 = (byte[]) newByteArray(6);
        setByteElement(term20897, 0, (byte) -126);
        setByteElement(term20897, 1, (byte) 12);
        setByteElement(term20897, 2, (byte) -75);
        setByteElement(term20897, 3, (byte) 69);
        setByteElement(term20897, 4, (byte) -6);
        setByteElement(term20897, 5, (byte) 107);
        setByteElement(term20897, 6, (byte) -109);
        setByteElement(term20897, 7, (byte) 122);
        setField(term20896, term20896.getClass(), "SMALL_BUF", term20897);
        setIntField(term20896, term20896.getClass(), "recordSize", 1596213415);
        setIntField(term20896, term20896.getClass(), "blockSize", -268815336);
        setBooleanField(term20896, term20896.getClass(), "hasHitEOF", true);
        setLongField(term20896, term20896.getClass(), "entrySize", -6432617521836576658L);
        setLongField(term20896, term20896.getClass(), "entryOffset", -2255965562447970862L);
        setField(term20896, term20896.getClass(), "is", null);
        setField(term20898, term20898.getClass(), "name", "");
        setBooleanField(term20898, term20898.getClass(), "preserveLeadingSlashes", true);
        setIntField(term20898, term20898.getClass(), "mode", -1210583429);
        setLongField(term20898, term20898.getClass(), "userId", 148047808219672941L);
        setLongField(term20898, term20898.getClass(), "groupId", 7489064039921396098L);
        setLongField(term20898, term20898.getClass(), "size", 6843866297465638866L);
        setLongField(term20898, term20898.getClass(), "modTime", -4023935540989049732L);
        setBooleanField(term20898, term20898.getClass(), "checkSumOK", true);
        setByteField(term20898, term20898.getClass(), "linkFlag", (byte) 83);
        setField(term20898, term20898.getClass(), "linkName", "");
        setField(term20898, term20898.getClass(), "magic", "ustar ");
        setField(term20898, term20898.getClass(), "version", "00");
        setField(term20898, term20898.getClass(), "userName", "root");
        setField(term20898, term20898.getClass(), "groupName", "");
        setIntField(term20898, term20898.getClass(), "devMajor", -663691365);
        setIntField(term20898, term20898.getClass(), "devMinor", 339854490);
        setBooleanField(term20898, term20898.getClass(), "isExtended", false);
        setLongField(term20898, term20898.getClass(), "realSize", 855932984568615096L);
        setBooleanField(term20898, term20898.getClass(), "paxGNUSparse", true);
        setBooleanField(term20898, term20898.getClass(), "starSparse", true);
        setField(term20911, term20911.getClass(), "path", "TJmVBGfTML");
        setField(term20911, term20911.getClass(), "status", enum56);
        setIntField(term20911, term20911.getClass(), "prefixLength", -615654495);
        setField(term20911, term20911.getClass(), "filePath", null);
        setField(term20898, term20898.getClass(), "file", term20911);
        setField(term20896, term20896.getClass(), "currEntry", term20898);
        setField(term20896, term20896.getClass(), "zipEncoding", null);
        setField(term20896, term20896.getClass(), "encoding", "tPlsykYBqO");
        setField(term20896, term20896.getClass(), "globalPaxHeaders", term20918);
        setByteElement(term20919, 0, (byte) -123);
        setByteElement(term20919, 1, (byte) -76);
        setByteElement(term20919, 2, (byte) -115);
        setByteElement(term20919, 3, (byte) -48);
        setByteElement(term20919, 4, (byte) 126);
        setByteElement(term20919, 5, (byte) -2);
        setField(term20896, term20896.getClass(), "SINGLE", term20919);
        setLongField(term20896, term20896.getClass(), "bytesRead", -1616722610139554082L);
        term20920 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Map");
        Object[] args = new Object[1];
        args[0] = term4671;
        callMethod(klass, "applyPaxHeadersToCurrentEntry", argTypes, term4570, args);
        assertTrue(recursiveEquals(term4570, term20896));
        assertTrue(recursiveEquals(term4671, term20920));
    }

};


