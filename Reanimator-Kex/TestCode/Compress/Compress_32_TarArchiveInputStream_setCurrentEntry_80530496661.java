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

public class TarArchiveInputStream_setCurrentEntry_80530496661 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6066;
     Object term6144;
     Object term22711;
     Object term22734;

    public TarArchiveInputStream_setCurrentEntry_80530496661() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term22774 = Class.forName((String) "java.io.File$PathStatus");
        Field term22773 = ((Class) term22774).getDeclaredField((String) "CHECKED");
        ((Field) term22773).setAccessible(true);
        Object enum61 = ((Field) term22773).get((Object) null);
        term6066 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term6067 = (byte[]) newByteArray(0);
        Object term6073 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term6109 = newInstance(Class.forName("java.io.File"));
        byte[] term6138 = (byte[]) newByteArray(4);
        setField(term6066, term6066.getClass(), "SMALL_BUF", term6067);
        setIntField(term6066, term6066.getClass(), "recordSize", 2095798786);
        setIntField(term6066, term6066.getClass(), "blockSize", -1565502840);
        setBooleanField(term6066, term6066.getClass(), "hasHitEOF", true);
        setLongField(term6066, term6066.getClass(), "entrySize", 5465527210299101732L);
        setLongField(term6066, term6066.getClass(), "entryOffset", 4699157009689333952L);
        setField(term6066, term6066.getClass(), "is", null);
        setField(term6073, term6073.getClass(), "name", "");
        setIntField(term6073, term6073.getClass(), "mode", 344323424);
        setLongField(term6073, term6073.getClass(), "userId", -78240609295693193L);
        setLongField(term6073, term6073.getClass(), "groupId", 3090901538358721367L);
        setLongField(term6073, term6073.getClass(), "size", -1677189124507026637L);
        setLongField(term6073, term6073.getClass(), "modTime", 4795660804170399986L);
        setBooleanField(term6073, term6073.getClass(), "checkSumOK", true);
        setByteField(term6073, term6073.getClass(), "linkFlag", (byte) 119);
        setField(term6073, term6073.getClass(), "linkName", "");
        setField(term6073, term6073.getClass(), "magic", "ustar ");
        setField(term6073, term6073.getClass(), "version", "00");
        setField(term6073, term6073.getClass(), "userName", "root");
        setField(term6073, term6073.getClass(), "groupName", "");
        setIntField(term6073, term6073.getClass(), "devMajor", 9726679);
        setIntField(term6073, term6073.getClass(), "devMinor", -25637976);
        setBooleanField(term6073, term6073.getClass(), "isExtended", true);
        setLongField(term6073, term6073.getClass(), "realSize", -4030863184426321096L);
        setField(term6109, term6109.getClass(), "path", "MLqYREekMl");
        setField(term6109, term6109.getClass(), "status", enum61);
        setIntField(term6109, term6109.getClass(), "prefixLength", 1555897383);
        setField(term6109, term6109.getClass(), "filePath", null);
        setField(term6073, term6073.getClass(), "file", term6109);
        setField(term6066, term6066.getClass(), "currEntry", term6073);
        setField(term6066, term6066.getClass(), "zipEncoding", null);
        setField(term6066, term6066.getClass(), "encoding", "ytSBIKXogI");
        setByteElement(term6138, 0, (byte) -125);
        setByteElement(term6138, 1, (byte) 100);
        setByteElement(term6138, 2, (byte) -1);
        setByteElement(term6138, 3, (byte) -127);
        setField(term6066, term6066.getClass(), "SINGLE", term6138);
        setLongField(term6066, term6066.getClass(), "bytesRead", -8010214112439224349L);
        term6144 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term6180 = newInstance(Class.forName("java.io.File"));
        setField(term6144, term6144.getClass(), "name", "");
        setIntField(term6144, term6144.getClass(), "mode", 202001407);
        setLongField(term6144, term6144.getClass(), "userId", -6673920710396545553L);
        setLongField(term6144, term6144.getClass(), "groupId", 3412644969878030772L);
        setLongField(term6144, term6144.getClass(), "size", 6698455537431331246L);
        setLongField(term6144, term6144.getClass(), "modTime", -8327432141027603933L);
        setBooleanField(term6144, term6144.getClass(), "checkSumOK", false);
        setByteField(term6144, term6144.getClass(), "linkFlag", (byte) -118);
        setField(term6144, term6144.getClass(), "linkName", "");
        setField(term6144, term6144.getClass(), "magic", "ustar ");
        setField(term6144, term6144.getClass(), "version", "00");
        setField(term6144, term6144.getClass(), "userName", "root");
        setField(term6144, term6144.getClass(), "groupName", "");
        setIntField(term6144, term6144.getClass(), "devMajor", 158873461);
        setIntField(term6144, term6144.getClass(), "devMinor", -430151637);
        setBooleanField(term6144, term6144.getClass(), "isExtended", false);
        setLongField(term6144, term6144.getClass(), "realSize", -433040798405298080L);
        setField(term6180, term6180.getClass(), "path", "nHXjMycHlU");
        setField(term6180, term6180.getClass(), "status", enum61);
        setIntField(term6180, term6180.getClass(), "prefixLength", -1697741339);
        setField(term6180, term6180.getClass(), "filePath", null);
        setField(term6144, term6144.getClass(), "file", term6180);
        Class<? extends Object> term23062 = Class.forName((String) "java.io.File$PathStatus");
        Field term23061 = ((Class) term23062).getDeclaredField((String) "INVALID");
        ((Field) term23061).setAccessible(true);
        Object enum62 = ((Field) term23061).get((Object) null);
        term22711 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term22712 = (byte[]) newByteArray(0);
        Object term22713 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term22726 = newInstance(Class.forName("java.io.File"));
        byte[] term22733 = (byte[]) newByteArray(4);
        setField(term22711, term22711.getClass(), "SMALL_BUF", term22712);
        setIntField(term22711, term22711.getClass(), "recordSize", 2095798786);
        setIntField(term22711, term22711.getClass(), "blockSize", -1565502840);
        setBooleanField(term22711, term22711.getClass(), "hasHitEOF", true);
        setLongField(term22711, term22711.getClass(), "entrySize", 5465527210299101732L);
        setLongField(term22711, term22711.getClass(), "entryOffset", 4699157009689333952L);
        setField(term22711, term22711.getClass(), "is", null);
        setField(term22713, term22713.getClass(), "name", "");
        setIntField(term22713, term22713.getClass(), "mode", 202001407);
        setLongField(term22713, term22713.getClass(), "userId", -6673920710396545553L);
        setLongField(term22713, term22713.getClass(), "groupId", 3412644969878030772L);
        setLongField(term22713, term22713.getClass(), "size", 6698455537431331246L);
        setLongField(term22713, term22713.getClass(), "modTime", -8327432141027603933L);
        setBooleanField(term22713, term22713.getClass(), "checkSumOK", false);
        setByteField(term22713, term22713.getClass(), "linkFlag", (byte) -118);
        setField(term22713, term22713.getClass(), "linkName", "");
        setField(term22713, term22713.getClass(), "magic", "ustar ");
        setField(term22713, term22713.getClass(), "version", "00");
        setField(term22713, term22713.getClass(), "userName", "root");
        setField(term22713, term22713.getClass(), "groupName", "");
        setIntField(term22713, term22713.getClass(), "devMajor", 158873461);
        setIntField(term22713, term22713.getClass(), "devMinor", -430151637);
        setBooleanField(term22713, term22713.getClass(), "isExtended", false);
        setLongField(term22713, term22713.getClass(), "realSize", -433040798405298080L);
        setField(term22726, term22726.getClass(), "path", "nHXjMycHlU");
        setField(term22726, term22726.getClass(), "status", enum62);
        setIntField(term22726, term22726.getClass(), "prefixLength", -1697741339);
        setField(term22726, term22726.getClass(), "filePath", null);
        setField(term22713, term22713.getClass(), "file", term22726);
        setField(term22711, term22711.getClass(), "currEntry", term22713);
        setField(term22711, term22711.getClass(), "zipEncoding", null);
        setField(term22711, term22711.getClass(), "encoding", "ytSBIKXogI");
        setByteElement(term22733, 0, (byte) -125);
        setByteElement(term22733, 1, (byte) 100);
        setByteElement(term22733, 2, (byte) -1);
        setByteElement(term22733, 3, (byte) -127);
        setField(term22711, term22711.getClass(), "SINGLE", term22733);
        setLongField(term22711, term22711.getClass(), "bytesRead", -8010214112439224349L);
        Class<? extends Object> term23433 = Class.forName((String) "java.io.File$PathStatus");
        Field term23432 = ((Class) term23433).getDeclaredField((String) "CHECKED");
        ((Field) term23432).setAccessible(true);
        Object enum64 = ((Field) term23432).get((Object) null);
        term22734 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term22747 = newInstance(Class.forName("java.io.File"));
        setField(term22734, term22734.getClass(), "name", "");
        setIntField(term22734, term22734.getClass(), "mode", 202001407);
        setLongField(term22734, term22734.getClass(), "userId", -6673920710396545553L);
        setLongField(term22734, term22734.getClass(), "groupId", 3412644969878030772L);
        setLongField(term22734, term22734.getClass(), "size", 6698455537431331246L);
        setLongField(term22734, term22734.getClass(), "modTime", -8327432141027603933L);
        setBooleanField(term22734, term22734.getClass(), "checkSumOK", false);
        setByteField(term22734, term22734.getClass(), "linkFlag", (byte) -118);
        setField(term22734, term22734.getClass(), "linkName", "");
        setField(term22734, term22734.getClass(), "magic", "ustar ");
        setField(term22734, term22734.getClass(), "version", "00");
        setField(term22734, term22734.getClass(), "userName", "root");
        setField(term22734, term22734.getClass(), "groupName", "");
        setIntField(term22734, term22734.getClass(), "devMajor", 158873461);
        setIntField(term22734, term22734.getClass(), "devMinor", -430151637);
        setBooleanField(term22734, term22734.getClass(), "isExtended", false);
        setLongField(term22734, term22734.getClass(), "realSize", -433040798405298080L);
        setField(term22747, term22747.getClass(), "path", "nHXjMycHlU");
        setField(term22747, term22747.getClass(), "status", enum64);
        setIntField(term22747, term22747.getClass(), "prefixLength", -1697741339);
        setField(term22747, term22747.getClass(), "filePath", null);
        setField(term22734, term22734.getClass(), "file", term22747);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Object[] args = new Object[1];
        args[0] = term6144;
        callMethod(klass, "setCurrentEntry", argTypes, term6066, args);
        assertTrue(recursiveEquals(term6066, term22711));
        assertTrue(recursiveEquals(term6144, term22734));
    }

};


