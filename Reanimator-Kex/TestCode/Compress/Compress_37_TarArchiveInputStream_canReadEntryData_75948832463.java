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

public class TarArchiveInputStream_canReadEntryData_75948832463 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6392;
     Object term23728;

    public TarArchiveInputStream_canReadEntryData_75948832463() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term23784 = Class.forName((String) "java.io.File$PathStatus");
        Field term23783 = ((Class) term23784).getDeclaredField((String) "CHECKED");
        ((Field) term23783).setAccessible(true);
        Object enum62 = ((Field) term23783).get((Object) null);
        HashMap term6476 = new HashMap();
        term6392 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term6393 = (byte[]) newByteArray(9);
        Object term6408 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term6447 = newInstance(Class.forName("java.io.File"));
        byte[] term6486 = (byte[]) newByteArray(7);
        setByteElement(term6393, 0, (byte) 112);
        setByteElement(term6393, 1, (byte) 77);
        setByteElement(term6393, 2, (byte) -1);
        setByteElement(term6393, 3, (byte) -83);
        setByteElement(term6393, 4, (byte) -63);
        setByteElement(term6393, 5, (byte) 108);
        setByteElement(term6393, 6, (byte) -105);
        setByteElement(term6393, 7, (byte) 33);
        setByteElement(term6393, 8, (byte) 109);
        setField(term6392, term6392.getClass(), "SMALL_BUF", term6393);
        setIntField(term6392, term6392.getClass(), "recordSize", 2095798786);
        setIntField(term6392, term6392.getClass(), "blockSize", -1565502840);
        setBooleanField(term6392, term6392.getClass(), "hasHitEOF", false);
        setLongField(term6392, term6392.getClass(), "entrySize", 5465527210299101732L);
        setLongField(term6392, term6392.getClass(), "entryOffset", 4699157009689333952L);
        setField(term6392, term6392.getClass(), "is", null);
        setField(term6408, term6408.getClass(), "name", "");
        setBooleanField(term6408, term6408.getClass(), "preserveLeadingSlashes", true);
        setIntField(term6408, term6408.getClass(), "mode", 344323424);
        setLongField(term6408, term6408.getClass(), "userId", -78240609295693193L);
        setLongField(term6408, term6408.getClass(), "groupId", 3090901538358721367L);
        setLongField(term6408, term6408.getClass(), "size", -1677189124507026637L);
        setLongField(term6408, term6408.getClass(), "modTime", 4795660804170399986L);
        setBooleanField(term6408, term6408.getClass(), "checkSumOK", false);
        setByteField(term6408, term6408.getClass(), "linkFlag", (byte) -54);
        setField(term6408, term6408.getClass(), "linkName", "");
        setField(term6408, term6408.getClass(), "magic", "ustar ");
        setField(term6408, term6408.getClass(), "version", "00");
        setField(term6408, term6408.getClass(), "userName", "root");
        setField(term6408, term6408.getClass(), "groupName", "");
        setIntField(term6408, term6408.getClass(), "devMajor", 9726679);
        setIntField(term6408, term6408.getClass(), "devMinor", -25637976);
        setBooleanField(term6408, term6408.getClass(), "isExtended", true);
        setLongField(term6408, term6408.getClass(), "realSize", -4030863184426321096L);
        setBooleanField(term6408, term6408.getClass(), "paxGNUSparse", false);
        setBooleanField(term6408, term6408.getClass(), "starSparse", false);
        setField(term6447, term6447.getClass(), "path", "vjxIhXHxGR");
        setField(term6447, term6447.getClass(), "status", enum62);
        setIntField(term6447, term6447.getClass(), "prefixLength", 1555897383);
        setField(term6447, term6447.getClass(), "filePath", null);
        setField(term6408, term6408.getClass(), "file", term6447);
        setField(term6392, term6392.getClass(), "currEntry", term6408);
        setField(term6392, term6392.getClass(), "zipEncoding", null);
        setField(term6392, term6392.getClass(), "encoding", "QXzGXbEXMu");
        setField(term6392, term6392.getClass(), "globalPaxHeaders", term6476);
        setByteElement(term6486, 0, (byte) -85);
        setByteElement(term6486, 1, (byte) 81);
        setByteElement(term6486, 2, (byte) -113);
        setByteElement(term6486, 3, (byte) 90);
        setByteElement(term6486, 4, (byte) 10);
        setByteElement(term6486, 5, (byte) 87);
        setByteElement(term6486, 6, (byte) -35);
        setField(term6392, term6392.getClass(), "SINGLE", term6486);
        setLongField(term6392, term6392.getClass(), "bytesRead", -8010214112439224349L);
        Class<? extends Object> term23975 = Class.forName((String) "java.io.File$PathStatus");
        Field term23974 = ((Class) term23975).getDeclaredField((String) "CHECKED");
        ((Field) term23974).setAccessible(true);
        Object enum63 = ((Field) term23974).get((Object) null);
        HashMap term23750 = new HashMap();
        term23728 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term23729 = (byte[]) newByteArray(9);
        Object term23730 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term23743 = newInstance(Class.forName("java.io.File"));
        byte[] term23751 = (byte[]) newByteArray(7);
        setByteElement(term23729, 0, (byte) 112);
        setByteElement(term23729, 1, (byte) 77);
        setByteElement(term23729, 2, (byte) -1);
        setByteElement(term23729, 3, (byte) -83);
        setByteElement(term23729, 4, (byte) -63);
        setByteElement(term23729, 5, (byte) 108);
        setByteElement(term23729, 6, (byte) -105);
        setByteElement(term23729, 7, (byte) 33);
        setByteElement(term23729, 8, (byte) 109);
        setField(term23728, term23728.getClass(), "SMALL_BUF", term23729);
        setIntField(term23728, term23728.getClass(), "recordSize", 2095798786);
        setIntField(term23728, term23728.getClass(), "blockSize", -1565502840);
        setBooleanField(term23728, term23728.getClass(), "hasHitEOF", false);
        setLongField(term23728, term23728.getClass(), "entrySize", 5465527210299101732L);
        setLongField(term23728, term23728.getClass(), "entryOffset", 4699157009689333952L);
        setField(term23728, term23728.getClass(), "is", null);
        setField(term23730, term23730.getClass(), "name", "");
        setBooleanField(term23730, term23730.getClass(), "preserveLeadingSlashes", true);
        setIntField(term23730, term23730.getClass(), "mode", 344323424);
        setLongField(term23730, term23730.getClass(), "userId", -78240609295693193L);
        setLongField(term23730, term23730.getClass(), "groupId", 3090901538358721367L);
        setLongField(term23730, term23730.getClass(), "size", -1677189124507026637L);
        setLongField(term23730, term23730.getClass(), "modTime", 4795660804170399986L);
        setBooleanField(term23730, term23730.getClass(), "checkSumOK", false);
        setByteField(term23730, term23730.getClass(), "linkFlag", (byte) -54);
        setField(term23730, term23730.getClass(), "linkName", "");
        setField(term23730, term23730.getClass(), "magic", "ustar ");
        setField(term23730, term23730.getClass(), "version", "00");
        setField(term23730, term23730.getClass(), "userName", "root");
        setField(term23730, term23730.getClass(), "groupName", "");
        setIntField(term23730, term23730.getClass(), "devMajor", 9726679);
        setIntField(term23730, term23730.getClass(), "devMinor", -25637976);
        setBooleanField(term23730, term23730.getClass(), "isExtended", true);
        setLongField(term23730, term23730.getClass(), "realSize", -4030863184426321096L);
        setBooleanField(term23730, term23730.getClass(), "paxGNUSparse", false);
        setBooleanField(term23730, term23730.getClass(), "starSparse", false);
        setField(term23743, term23743.getClass(), "path", "vjxIhXHxGR");
        setField(term23743, term23743.getClass(), "status", enum63);
        setIntField(term23743, term23743.getClass(), "prefixLength", 1555897383);
        setField(term23743, term23743.getClass(), "filePath", null);
        setField(term23730, term23730.getClass(), "file", term23743);
        setField(term23728, term23728.getClass(), "currEntry", term23730);
        setField(term23728, term23728.getClass(), "zipEncoding", null);
        setField(term23728, term23728.getClass(), "encoding", "QXzGXbEXMu");
        setField(term23728, term23728.getClass(), "globalPaxHeaders", term23750);
        setByteElement(term23751, 0, (byte) -85);
        setByteElement(term23751, 1, (byte) 81);
        setByteElement(term23751, 2, (byte) -113);
        setByteElement(term23751, 3, (byte) 90);
        setByteElement(term23751, 4, (byte) 10);
        setByteElement(term23751, 5, (byte) 87);
        setByteElement(term23751, 6, (byte) -35);
        setField(term23728, term23728.getClass(), "SINGLE", term23751);
        setLongField(term23728, term23728.getClass(), "bytesRead", -8010214112439224349L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.ArchiveEntry");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "canReadEntryData", argTypes, term6392, args);
        assertTrue(recursiveEquals(term6392, term23728));
        assertTrue(recursiveEquals(retValue, false));
    }

};


