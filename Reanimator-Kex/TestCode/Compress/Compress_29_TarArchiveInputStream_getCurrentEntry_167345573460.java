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

public class TarArchiveInputStream_getCurrentEntry_167345573460 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5337;
     Object term20958;
     Object term20813;

    public TarArchiveInputStream_getCurrentEntry_167345573460() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term21004 = Class.forName((String) "java.io.File$PathStatus");
        Field term21003 = ((Class) term21004).getDeclaredField((String) "CHECKED");
        ((Field) term21003).setAccessible(true);
        Object enum58 = ((Field) term21003).get((Object) null);
        term5337 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term5338 = (byte[]) newByteArray(2);
        Object term5346 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term5382 = newInstance(Class.forName("java.io.File"));
        byte[] term5399 = (byte[]) newByteArray(7);
        setByteElement(term5338, 0, (byte) 103);
        setByteElement(term5338, 1, (byte) -63);
        setField(term5337, term5337.getClass(), "SMALL_BUF", term5338);
        setIntField(term5337, term5337.getClass(), "recordSize", -1731761810);
        setIntField(term5337, term5337.getClass(), "blockSize", 197109649);
        setBooleanField(term5337, term5337.getClass(), "hasHitEOF", true);
        setLongField(term5337, term5337.getClass(), "entrySize", -1214968196781083707L);
        setLongField(term5337, term5337.getClass(), "entryOffset", -1804015692891701666L);
        setField(term5337, term5337.getClass(), "is", null);
        setField(term5346, term5346.getClass(), "name", "");
        setIntField(term5346, term5346.getClass(), "mode", -1239406390);
        setIntField(term5346, term5346.getClass(), "userId", 1557431527);
        setIntField(term5346, term5346.getClass(), "groupId", -1504890659);
        setLongField(term5346, term5346.getClass(), "size", -6432617521836576658L);
        setLongField(term5346, term5346.getClass(), "modTime", -2255965562447970862L);
        setBooleanField(term5346, term5346.getClass(), "checkSumOK", false);
        setByteField(term5346, term5346.getClass(), "linkFlag", (byte) 39);
        setField(term5346, term5346.getClass(), "linkName", "");
        setField(term5346, term5346.getClass(), "magic", "ustar ");
        setField(term5346, term5346.getClass(), "version", "00");
        setField(term5346, term5346.getClass(), "userName", "root");
        setField(term5346, term5346.getClass(), "groupName", "");
        setIntField(term5346, term5346.getClass(), "devMajor", 1358829571);
        setIntField(term5346, term5346.getClass(), "devMinor", 991356662);
        setBooleanField(term5346, term5346.getClass(), "isExtended", false);
        setLongField(term5346, term5346.getClass(), "realSize", 148047808219672941L);
        setField(term5382, term5382.getClass(), "path", "kuTXqwMtDB");
        setField(term5382, term5382.getClass(), "status", enum58);
        setIntField(term5382, term5382.getClass(), "prefixLength", -506958186);
        setField(term5382, term5382.getClass(), "filePath", null);
        setField(term5346, term5346.getClass(), "file", term5382);
        setField(term5337, term5337.getClass(), "currEntry", term5346);
        setField(term5337, term5337.getClass(), "zipEncoding", null);
        setByteElement(term5399, 0, (byte) -54);
        setByteElement(term5399, 1, (byte) 9);
        setByteElement(term5399, 2, (byte) 19);
        setByteElement(term5399, 3, (byte) -103);
        setByteElement(term5399, 4, (byte) 61);
        setByteElement(term5399, 5, (byte) -90);
        setByteElement(term5399, 6, (byte) -27);
        setField(term5337, term5337.getClass(), "SINGLE", term5399);
        setLongField(term5337, term5337.getClass(), "bytesRead", 7489064039921396098L);
        Class<? extends Object> term21178 = Class.forName((String) "java.io.File$PathStatus");
        Field term21177 = ((Class) term21178).getDeclaredField((String) "INVALID");
        ((Field) term21177).setAccessible(true);
        Object enum59 = ((Field) term21177).get((Object) null);
        term20958 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term20959 = (byte[]) newByteArray(2);
        Object term20960 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term20973 = newInstance(Class.forName("java.io.File"));
        byte[] term20979 = (byte[]) newByteArray(7);
        setByteElement(term20959, 0, (byte) 103);
        setByteElement(term20959, 1, (byte) -63);
        setField(term20958, term20958.getClass(), "SMALL_BUF", term20959);
        setIntField(term20958, term20958.getClass(), "recordSize", -1731761810);
        setIntField(term20958, term20958.getClass(), "blockSize", 197109649);
        setBooleanField(term20958, term20958.getClass(), "hasHitEOF", true);
        setLongField(term20958, term20958.getClass(), "entrySize", -1214968196781083707L);
        setLongField(term20958, term20958.getClass(), "entryOffset", -1804015692891701666L);
        setField(term20958, term20958.getClass(), "is", null);
        setField(term20960, term20960.getClass(), "name", "");
        setIntField(term20960, term20960.getClass(), "mode", -1239406390);
        setIntField(term20960, term20960.getClass(), "userId", 1557431527);
        setIntField(term20960, term20960.getClass(), "groupId", -1504890659);
        setLongField(term20960, term20960.getClass(), "size", -6432617521836576658L);
        setLongField(term20960, term20960.getClass(), "modTime", -2255965562447970862L);
        setBooleanField(term20960, term20960.getClass(), "checkSumOK", false);
        setByteField(term20960, term20960.getClass(), "linkFlag", (byte) 39);
        setField(term20960, term20960.getClass(), "linkName", "");
        setField(term20960, term20960.getClass(), "magic", "ustar ");
        setField(term20960, term20960.getClass(), "version", "00");
        setField(term20960, term20960.getClass(), "userName", "root");
        setField(term20960, term20960.getClass(), "groupName", "");
        setIntField(term20960, term20960.getClass(), "devMajor", 1358829571);
        setIntField(term20960, term20960.getClass(), "devMinor", 991356662);
        setBooleanField(term20960, term20960.getClass(), "isExtended", false);
        setLongField(term20960, term20960.getClass(), "realSize", 148047808219672941L);
        setField(term20973, term20973.getClass(), "path", "kuTXqwMtDB");
        setField(term20973, term20973.getClass(), "status", enum59);
        setIntField(term20973, term20973.getClass(), "prefixLength", -506958186);
        setField(term20973, term20973.getClass(), "filePath", null);
        setField(term20960, term20960.getClass(), "file", term20973);
        setField(term20958, term20958.getClass(), "currEntry", term20960);
        setField(term20958, term20958.getClass(), "zipEncoding", null);
        setByteElement(term20979, 0, (byte) -54);
        setByteElement(term20979, 1, (byte) 9);
        setByteElement(term20979, 2, (byte) 19);
        setByteElement(term20979, 3, (byte) -103);
        setByteElement(term20979, 4, (byte) 61);
        setByteElement(term20979, 5, (byte) -90);
        setByteElement(term20979, 6, (byte) -27);
        setField(term20958, term20958.getClass(), "SINGLE", term20979);
        setLongField(term20958, term20958.getClass(), "bytesRead", 7489064039921396098L);
        Class<? extends Object> term21350 = Class.forName((String) "java.io.File$PathStatus");
        Field term21349 = ((Class) term21350).getDeclaredField((String) "INVALID");
        ((Field) term21349).setAccessible(true);
        Object enum60 = ((Field) term21349).get((Object) null);
        term20813 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term20849 = newInstance(Class.forName("java.io.File"));
        setField(term20813, term20813.getClass(), "name", "");
        setIntField(term20813, term20813.getClass(), "mode", -1239406390);
        setIntField(term20813, term20813.getClass(), "userId", 1557431527);
        setIntField(term20813, term20813.getClass(), "groupId", -1504890659);
        setLongField(term20813, term20813.getClass(), "size", -6432617521836576658L);
        setLongField(term20813, term20813.getClass(), "modTime", -2255965562447970862L);
        setBooleanField(term20813, term20813.getClass(), "checkSumOK", false);
        setByteField(term20813, term20813.getClass(), "linkFlag", (byte) 39);
        setField(term20813, term20813.getClass(), "linkName", "");
        setField(term20813, term20813.getClass(), "magic", "ustar ");
        setField(term20813, term20813.getClass(), "version", "00");
        setField(term20813, term20813.getClass(), "userName", "root");
        setField(term20813, term20813.getClass(), "groupName", "");
        setIntField(term20813, term20813.getClass(), "devMajor", 1358829571);
        setIntField(term20813, term20813.getClass(), "devMinor", 991356662);
        setBooleanField(term20813, term20813.getClass(), "isExtended", false);
        setLongField(term20813, term20813.getClass(), "realSize", 148047808219672941L);
        setField(term20849, term20849.getClass(), "path", "kuTXqwMtDB");
        setField(term20849, term20849.getClass(), "status", enum60);
        setIntField(term20849, term20849.getClass(), "prefixLength", -506958186);
        setField(term20849, term20849.getClass(), "filePath", null);
        setField(term20813, term20813.getClass(), "file", term20849);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getCurrentEntry", argTypes, term5337, args);
        assertTrue(recursiveEquals(term5337, term20958));
        assertTrue(recursiveEquals(retValue, term20813));
    }

};


