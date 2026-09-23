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

public class TarArchiveInputStream_canReadEntryData_75948832455 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4650;
     Object term18584;

    public TarArchiveInputStream_canReadEntryData_75948832455() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term18630 = Class.forName((String) "java.io.File$PathStatus");
        Field term18629 = ((Class) term18630).getDeclaredField((String) "CHECKED");
        ((Field) term18629).setAccessible(true);
        Object enum51 = ((Field) term18629).get((Object) null);
        term4650 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term4651 = (byte[]) newByteArray(2);
        Object term4659 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term4695 = newInstance(Class.forName("java.io.File"));
        byte[] term4712 = (byte[]) newByteArray(1);
        setByteElement(term4651, 0, (byte) -73);
        setByteElement(term4651, 1, (byte) 1);
        setField(term4650, term4650.getClass(), "SMALL_BUF", term4651);
        setIntField(term4650, term4650.getClass(), "recordSize", -1388471422);
        setIntField(term4650, term4650.getClass(), "blockSize", -1498296052);
        setBooleanField(term4650, term4650.getClass(), "hasHitEOF", true);
        setLongField(term4650, term4650.getClass(), "entrySize", 1215116475929634177L);
        setLongField(term4650, term4650.getClass(), "entryOffset", 1597484336218508869L);
        setField(term4650, term4650.getClass(), "is", null);
        setField(term4659, term4659.getClass(), "name", "");
        setIntField(term4659, term4659.getClass(), "mode", 2098647989);
        setIntField(term4659, term4659.getClass(), "userId", 1598895173);
        setIntField(term4659, term4659.getClass(), "groupId", 1830648570);
        setLongField(term4659, term4659.getClass(), "size", -685023850445639859L);
        setLongField(term4659, term4659.getClass(), "modTime", -6950146046121430355L);
        setBooleanField(term4659, term4659.getClass(), "checkSumOK", false);
        setByteField(term4659, term4659.getClass(), "linkFlag", (byte) 99);
        setField(term4659, term4659.getClass(), "linkName", "");
        setField(term4659, term4659.getClass(), "magic", "ustar ");
        setField(term4659, term4659.getClass(), "version", "00");
        setField(term4659, term4659.getClass(), "userName", "root");
        setField(term4659, term4659.getClass(), "groupName", "");
        setIntField(term4659, term4659.getClass(), "devMajor", -227365013);
        setIntField(term4659, term4659.getClass(), "devMinor", 11724947);
        setBooleanField(term4659, term4659.getClass(), "isExtended", false);
        setLongField(term4659, term4659.getClass(), "realSize", 1667122142089513324L);
        setField(term4695, term4695.getClass(), "path", "aKnKipADSo");
        setField(term4695, term4695.getClass(), "status", enum51);
        setIntField(term4695, term4695.getClass(), "prefixLength", 1953277050);
        setField(term4695, term4695.getClass(), "filePath", null);
        setField(term4659, term4659.getClass(), "file", term4695);
        setField(term4650, term4650.getClass(), "currEntry", term4659);
        setField(term4650, term4650.getClass(), "encoding", null);
        setByteElement(term4712, 0, (byte) -121);
        setField(term4650, term4650.getClass(), "SINGLE", term4712);
        setLongField(term4650, term4650.getClass(), "bytesRead", -6342139649364011743L);
        Class<? extends Object> term18798 = Class.forName((String) "java.io.File$PathStatus");
        Field term18797 = ((Class) term18798).getDeclaredField((String) "CHECKED");
        ((Field) term18797).setAccessible(true);
        Object enum52 = ((Field) term18797).get((Object) null);
        term18584 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term18585 = (byte[]) newByteArray(2);
        Object term18586 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term18599 = newInstance(Class.forName("java.io.File"));
        byte[] term18604 = (byte[]) newByteArray(1);
        setByteElement(term18585, 0, (byte) -73);
        setByteElement(term18585, 1, (byte) 1);
        setField(term18584, term18584.getClass(), "SMALL_BUF", term18585);
        setIntField(term18584, term18584.getClass(), "recordSize", -1388471422);
        setIntField(term18584, term18584.getClass(), "blockSize", -1498296052);
        setBooleanField(term18584, term18584.getClass(), "hasHitEOF", true);
        setLongField(term18584, term18584.getClass(), "entrySize", 1215116475929634177L);
        setLongField(term18584, term18584.getClass(), "entryOffset", 1597484336218508869L);
        setField(term18584, term18584.getClass(), "is", null);
        setField(term18586, term18586.getClass(), "name", "");
        setIntField(term18586, term18586.getClass(), "mode", 2098647989);
        setIntField(term18586, term18586.getClass(), "userId", 1598895173);
        setIntField(term18586, term18586.getClass(), "groupId", 1830648570);
        setLongField(term18586, term18586.getClass(), "size", -685023850445639859L);
        setLongField(term18586, term18586.getClass(), "modTime", -6950146046121430355L);
        setBooleanField(term18586, term18586.getClass(), "checkSumOK", false);
        setByteField(term18586, term18586.getClass(), "linkFlag", (byte) 99);
        setField(term18586, term18586.getClass(), "linkName", "");
        setField(term18586, term18586.getClass(), "magic", "ustar ");
        setField(term18586, term18586.getClass(), "version", "00");
        setField(term18586, term18586.getClass(), "userName", "root");
        setField(term18586, term18586.getClass(), "groupName", "");
        setIntField(term18586, term18586.getClass(), "devMajor", -227365013);
        setIntField(term18586, term18586.getClass(), "devMinor", 11724947);
        setBooleanField(term18586, term18586.getClass(), "isExtended", false);
        setLongField(term18586, term18586.getClass(), "realSize", 1667122142089513324L);
        setField(term18599, term18599.getClass(), "path", "aKnKipADSo");
        setField(term18599, term18599.getClass(), "status", enum52);
        setIntField(term18599, term18599.getClass(), "prefixLength", 1953277050);
        setField(term18599, term18599.getClass(), "filePath", null);
        setField(term18586, term18586.getClass(), "file", term18599);
        setField(term18584, term18584.getClass(), "currEntry", term18586);
        setField(term18584, term18584.getClass(), "encoding", null);
        setByteElement(term18604, 0, (byte) -121);
        setField(term18584, term18584.getClass(), "SINGLE", term18604);
        setLongField(term18584, term18584.getClass(), "bytesRead", -6342139649364011743L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.ArchiveEntry");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "canReadEntryData", argTypes, term4650, args);
        assertTrue(recursiveEquals(term4650, term18584));
        assertTrue(recursiveEquals(retValue, false));
    }

};


