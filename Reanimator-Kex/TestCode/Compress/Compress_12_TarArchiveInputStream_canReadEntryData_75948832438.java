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

public class TarArchiveInputStream_canReadEntryData_75948832438 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3404;
     Object term150795;

    public TarArchiveInputStream_canReadEntryData_75948832438() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term150858 = Class.forName((String) "java.io.File$PathStatus");
        Field term150857 = ((Class) term150858).getDeclaredField((String) "CHECKED");
        ((Field) term150857).setAccessible(true);
        Object enum41 = ((Field) term150857).get((Object) null);
        term3404 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term3408 = (byte[]) newByteArray(8);
        Object term3417 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        byte[] term3418 = (byte[]) newByteArray(9);
        Object term3433 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term3468 = newInstance(Class.forName("java.io.File"));
        byte[] term3485 = (byte[]) newByteArray(7);
        setBooleanField(term3404, term3404.getClass(), "hasHitEOF", false);
        setLongField(term3404, term3404.getClass(), "entrySize", 50358265865610362L);
        setLongField(term3404, term3404.getClass(), "entryOffset", 5510783420697225605L);
        setByteElement(term3408, 0, (byte) -2);
        setByteElement(term3408, 1, (byte) 103);
        setByteElement(term3408, 2, (byte) 23);
        setByteElement(term3408, 3, (byte) 96);
        setByteElement(term3408, 4, (byte) -70);
        setByteElement(term3408, 5, (byte) -73);
        setByteElement(term3408, 6, (byte) 1);
        setByteElement(term3408, 7, (byte) 99);
        setField(term3404, term3404.getClass(), "readBuf", term3408);
        setField(term3417, term3417.getClass(), "inStream", null);
        setField(term3417, term3417.getClass(), "outStream", null);
        setByteElement(term3418, 0, (byte) -121);
        setByteElement(term3418, 1, (byte) -50);
        setByteElement(term3418, 2, (byte) -79);
        setByteElement(term3418, 3, (byte) 110);
        setByteElement(term3418, 4, (byte) -111);
        setByteElement(term3418, 5, (byte) -54);
        setByteElement(term3418, 6, (byte) -25);
        setByteElement(term3418, 7, (byte) -35);
        setByteElement(term3418, 8, (byte) 3);
        setField(term3417, term3417.getClass(), "blockBuffer", term3418);
        setIntField(term3417, term3417.getClass(), "currBlkIdx", 158873461);
        setIntField(term3417, term3417.getClass(), "currRecIdx", -430151637);
        setIntField(term3417, term3417.getClass(), "blockSize", -1697741339);
        setIntField(term3417, term3417.getClass(), "recordSize", 98922530);
        setIntField(term3417, term3417.getClass(), "recsPerBlock", -1388471422);
        setField(term3404, term3404.getClass(), "buffer", term3417);
        setField(term3433, term3433.getClass(), "name", "");
        setIntField(term3433, term3433.getClass(), "mode", -1498296052);
        setIntField(term3433, term3433.getClass(), "userId", 2098647989);
        setIntField(term3433, term3433.getClass(), "groupId", 1598895173);
        setLongField(term3433, term3433.getClass(), "size", 6005241913654469005L);
        setLongField(term3433, term3433.getClass(), "modTime", -1983291584002806658L);
        setByteField(term3433, term3433.getClass(), "linkFlag", (byte) -10);
        setField(term3433, term3433.getClass(), "linkName", "");
        setField(term3433, term3433.getClass(), "magic", "ustar ");
        setField(term3433, term3433.getClass(), "version", "00");
        setField(term3433, term3433.getClass(), "userName", "root");
        setField(term3433, term3433.getClass(), "groupName", "");
        setIntField(term3433, term3433.getClass(), "devMajor", 1830648570);
        setIntField(term3433, term3433.getClass(), "devMinor", -227365013);
        setBooleanField(term3433, term3433.getClass(), "isExtended", false);
        setLongField(term3433, term3433.getClass(), "realSize", 5946780097489996391L);
        setField(term3468, term3468.getClass(), "path", "tbcdzjIfER");
        setField(term3468, term3468.getClass(), "status", enum41);
        setIntField(term3468, term3468.getClass(), "prefixLength", 11724947);
        setField(term3468, term3468.getClass(), "filePath", null);
        setField(term3433, term3433.getClass(), "file", term3468);
        setField(term3404, term3404.getClass(), "currEntry", term3433);
        setByteElement(term3485, 0, (byte) -106);
        setByteElement(term3485, 1, (byte) -124);
        setByteElement(term3485, 2, (byte) -71);
        setByteElement(term3485, 3, (byte) 113);
        setByteElement(term3485, 4, (byte) -77);
        setByteElement(term3485, 5, (byte) -12);
        setByteElement(term3485, 6, (byte) 58);
        setField(term3404, term3404.getClass(), "SINGLE", term3485);
        setLongField(term3404, term3404.getClass(), "bytesRead", -8652538484981166496L);
        Class<? extends Object> term152030 = Class.forName((String) "java.io.File$PathStatus");
        Field term152029 = ((Class) term152030).getDeclaredField((String) "INVALID");
        ((Field) term152029).setAccessible(true);
        Object enum46 = ((Field) term152029).get((Object) null);
        term150795 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term150796 = (byte[]) newByteArray(8);
        Object term150797 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        byte[] term150798 = (byte[]) newByteArray(9);
        Object term150799 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term150812 = newInstance(Class.forName("java.io.File"));
        byte[] term150817 = (byte[]) newByteArray(7);
        setBooleanField(term150795, term150795.getClass(), "hasHitEOF", false);
        setLongField(term150795, term150795.getClass(), "entrySize", 50358265865610362L);
        setLongField(term150795, term150795.getClass(), "entryOffset", 5510783420697225605L);
        setByteElement(term150796, 0, (byte) -2);
        setByteElement(term150796, 1, (byte) 103);
        setByteElement(term150796, 2, (byte) 23);
        setByteElement(term150796, 3, (byte) 96);
        setByteElement(term150796, 4, (byte) -70);
        setByteElement(term150796, 5, (byte) -73);
        setByteElement(term150796, 6, (byte) 1);
        setByteElement(term150796, 7, (byte) 99);
        setField(term150795, term150795.getClass(), "readBuf", term150796);
        setField(term150797, term150797.getClass(), "inStream", null);
        setField(term150797, term150797.getClass(), "outStream", null);
        setByteElement(term150798, 0, (byte) -121);
        setByteElement(term150798, 1, (byte) -50);
        setByteElement(term150798, 2, (byte) -79);
        setByteElement(term150798, 3, (byte) 110);
        setByteElement(term150798, 4, (byte) -111);
        setByteElement(term150798, 5, (byte) -54);
        setByteElement(term150798, 6, (byte) -25);
        setByteElement(term150798, 7, (byte) -35);
        setByteElement(term150798, 8, (byte) 3);
        setField(term150797, term150797.getClass(), "blockBuffer", term150798);
        setIntField(term150797, term150797.getClass(), "currBlkIdx", 158873461);
        setIntField(term150797, term150797.getClass(), "currRecIdx", -430151637);
        setIntField(term150797, term150797.getClass(), "blockSize", -1697741339);
        setIntField(term150797, term150797.getClass(), "recordSize", 98922530);
        setIntField(term150797, term150797.getClass(), "recsPerBlock", -1388471422);
        setField(term150795, term150795.getClass(), "buffer", term150797);
        setField(term150799, term150799.getClass(), "name", "");
        setIntField(term150799, term150799.getClass(), "mode", -1498296052);
        setIntField(term150799, term150799.getClass(), "userId", 2098647989);
        setIntField(term150799, term150799.getClass(), "groupId", 1598895173);
        setLongField(term150799, term150799.getClass(), "size", 6005241913654469005L);
        setLongField(term150799, term150799.getClass(), "modTime", -1983291584002806658L);
        setByteField(term150799, term150799.getClass(), "linkFlag", (byte) -10);
        setField(term150799, term150799.getClass(), "linkName", "");
        setField(term150799, term150799.getClass(), "magic", "ustar ");
        setField(term150799, term150799.getClass(), "version", "00");
        setField(term150799, term150799.getClass(), "userName", "root");
        setField(term150799, term150799.getClass(), "groupName", "");
        setIntField(term150799, term150799.getClass(), "devMajor", 1830648570);
        setIntField(term150799, term150799.getClass(), "devMinor", -227365013);
        setBooleanField(term150799, term150799.getClass(), "isExtended", false);
        setLongField(term150799, term150799.getClass(), "realSize", 5946780097489996391L);
        setField(term150812, term150812.getClass(), "path", "tbcdzjIfER");
        setField(term150812, term150812.getClass(), "status", enum46);
        setIntField(term150812, term150812.getClass(), "prefixLength", 11724947);
        setField(term150812, term150812.getClass(), "filePath", null);
        setField(term150799, term150799.getClass(), "file", term150812);
        setField(term150795, term150795.getClass(), "currEntry", term150799);
        setByteElement(term150817, 0, (byte) -106);
        setByteElement(term150817, 1, (byte) -124);
        setByteElement(term150817, 2, (byte) -71);
        setByteElement(term150817, 3, (byte) 113);
        setByteElement(term150817, 4, (byte) -77);
        setByteElement(term150817, 5, (byte) -12);
        setByteElement(term150817, 6, (byte) 58);
        setField(term150795, term150795.getClass(), "SINGLE", term150817);
        setLongField(term150795, term150795.getClass(), "bytesRead", -8652538484981166496L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.ArchiveEntry");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "canReadEntryData", argTypes, term3404, args);
        assertTrue(recursiveEquals(term3404, term150795));
        assertTrue(recursiveEquals(retValue, false));
    }

};


