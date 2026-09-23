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

public class TarArchiveInputStream_getCurrentEntry_167345573464 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6686;
     Object term24235;
     Object term24134;

    public TarArchiveInputStream_getCurrentEntry_167345573464() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term24289 = Class.forName((String) "java.io.File$PathStatus");
        Field term24288 = ((Class) term24289).getDeclaredField((String) "INVALID");
        ((Field) term24288).setAccessible(true);
        Object enum64 = ((Field) term24288).get((Object) null);
        HashMap term6768 = new HashMap();
        term6686 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term6687 = (byte[]) newByteArray(7);
        Object term6700 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term6739 = newInstance(Class.forName("java.io.File"));
        byte[] term6778 = (byte[]) newByteArray(4);
        setByteElement(term6687, 0, (byte) -14);
        setByteElement(term6687, 1, (byte) 10);
        setByteElement(term6687, 2, (byte) 65);
        setByteElement(term6687, 3, (byte) -44);
        setByteElement(term6687, 4, (byte) 115);
        setByteElement(term6687, 5, (byte) -32);
        setByteElement(term6687, 6, (byte) -52);
        setField(term6686, term6686.getClass(), "SMALL_BUF", term6687);
        setIntField(term6686, term6686.getClass(), "recordSize", 202001407);
        setIntField(term6686, term6686.getClass(), "blockSize", 158873461);
        setBooleanField(term6686, term6686.getClass(), "hasHitEOF", true);
        setLongField(term6686, term6686.getClass(), "entrySize", -6673920710396545553L);
        setLongField(term6686, term6686.getClass(), "entryOffset", 3412644969878030772L);
        setField(term6686, term6686.getClass(), "is", null);
        setField(term6700, term6700.getClass(), "name", "");
        setBooleanField(term6700, term6700.getClass(), "preserveLeadingSlashes", true);
        setIntField(term6700, term6700.getClass(), "mode", -430151637);
        setLongField(term6700, term6700.getClass(), "userId", 6698455537431331246L);
        setLongField(term6700, term6700.getClass(), "groupId", -8327432141027603933L);
        setLongField(term6700, term6700.getClass(), "size", -433040798405298080L);
        setLongField(term6700, term6700.getClass(), "modTime", -1505191021111100819L);
        setBooleanField(term6700, term6700.getClass(), "checkSumOK", true);
        setByteField(term6700, term6700.getClass(), "linkFlag", (byte) 53);
        setField(term6700, term6700.getClass(), "linkName", "");
        setField(term6700, term6700.getClass(), "magic", "ustar ");
        setField(term6700, term6700.getClass(), "version", "00");
        setField(term6700, term6700.getClass(), "userName", "root");
        setField(term6700, term6700.getClass(), "groupName", "");
        setIntField(term6700, term6700.getClass(), "devMajor", -1697741339);
        setIntField(term6700, term6700.getClass(), "devMinor", 98922530);
        setBooleanField(term6700, term6700.getClass(), "isExtended", false);
        setLongField(term6700, term6700.getClass(), "realSize", -1000830646340880796L);
        setBooleanField(term6700, term6700.getClass(), "paxGNUSparse", true);
        setBooleanField(term6700, term6700.getClass(), "starSparse", false);
        setField(term6739, term6739.getClass(), "path", "sEnIVFtZuQ");
        setField(term6739, term6739.getClass(), "status", enum64);
        setIntField(term6739, term6739.getClass(), "prefixLength", -1388471422);
        setField(term6739, term6739.getClass(), "filePath", null);
        setField(term6700, term6700.getClass(), "file", term6739);
        setField(term6686, term6686.getClass(), "currEntry", term6700);
        setField(term6686, term6686.getClass(), "zipEncoding", null);
        setField(term6686, term6686.getClass(), "encoding", "ZVecLZMLHF");
        setField(term6686, term6686.getClass(), "globalPaxHeaders", term6768);
        setByteElement(term6778, 0, (byte) 44);
        setByteElement(term6778, 1, (byte) 49);
        setByteElement(term6778, 2, (byte) 114);
        setByteElement(term6778, 3, (byte) -81);
        setField(term6686, term6686.getClass(), "SINGLE", term6778);
        setLongField(term6686, term6686.getClass(), "bytesRead", 5973526439563541711L);
        Class<? extends Object> term24475 = Class.forName((String) "java.io.File$PathStatus");
        Field term24474 = ((Class) term24475).getDeclaredField((String) "INVALID");
        ((Field) term24474).setAccessible(true);
        Object enum65 = ((Field) term24474).get((Object) null);
        HashMap term24258 = new HashMap();
        term24235 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term24236 = (byte[]) newByteArray(7);
        Object term24237 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term24250 = newInstance(Class.forName("java.io.File"));
        byte[] term24259 = (byte[]) newByteArray(4);
        setByteElement(term24236, 0, (byte) -14);
        setByteElement(term24236, 1, (byte) 10);
        setByteElement(term24236, 2, (byte) 65);
        setByteElement(term24236, 3, (byte) -44);
        setByteElement(term24236, 4, (byte) 115);
        setByteElement(term24236, 5, (byte) -32);
        setByteElement(term24236, 6, (byte) -52);
        setField(term24235, term24235.getClass(), "SMALL_BUF", term24236);
        setIntField(term24235, term24235.getClass(), "recordSize", 202001407);
        setIntField(term24235, term24235.getClass(), "blockSize", 158873461);
        setBooleanField(term24235, term24235.getClass(), "hasHitEOF", true);
        setLongField(term24235, term24235.getClass(), "entrySize", -6673920710396545553L);
        setLongField(term24235, term24235.getClass(), "entryOffset", 3412644969878030772L);
        setField(term24235, term24235.getClass(), "is", null);
        setField(term24237, term24237.getClass(), "name", "");
        setBooleanField(term24237, term24237.getClass(), "preserveLeadingSlashes", true);
        setIntField(term24237, term24237.getClass(), "mode", -430151637);
        setLongField(term24237, term24237.getClass(), "userId", 6698455537431331246L);
        setLongField(term24237, term24237.getClass(), "groupId", -8327432141027603933L);
        setLongField(term24237, term24237.getClass(), "size", -433040798405298080L);
        setLongField(term24237, term24237.getClass(), "modTime", -1505191021111100819L);
        setBooleanField(term24237, term24237.getClass(), "checkSumOK", true);
        setByteField(term24237, term24237.getClass(), "linkFlag", (byte) 53);
        setField(term24237, term24237.getClass(), "linkName", "");
        setField(term24237, term24237.getClass(), "magic", "ustar ");
        setField(term24237, term24237.getClass(), "version", "00");
        setField(term24237, term24237.getClass(), "userName", "root");
        setField(term24237, term24237.getClass(), "groupName", "");
        setIntField(term24237, term24237.getClass(), "devMajor", -1697741339);
        setIntField(term24237, term24237.getClass(), "devMinor", 98922530);
        setBooleanField(term24237, term24237.getClass(), "isExtended", false);
        setLongField(term24237, term24237.getClass(), "realSize", -1000830646340880796L);
        setBooleanField(term24237, term24237.getClass(), "paxGNUSparse", true);
        setBooleanField(term24237, term24237.getClass(), "starSparse", false);
        setField(term24250, term24250.getClass(), "path", "sEnIVFtZuQ");
        setField(term24250, term24250.getClass(), "status", enum65);
        setIntField(term24250, term24250.getClass(), "prefixLength", -1388471422);
        setField(term24250, term24250.getClass(), "filePath", null);
        setField(term24237, term24237.getClass(), "file", term24250);
        setField(term24235, term24235.getClass(), "currEntry", term24237);
        setField(term24235, term24235.getClass(), "zipEncoding", null);
        setField(term24235, term24235.getClass(), "encoding", "ZVecLZMLHF");
        setField(term24235, term24235.getClass(), "globalPaxHeaders", term24258);
        setByteElement(term24259, 0, (byte) 44);
        setByteElement(term24259, 1, (byte) 49);
        setByteElement(term24259, 2, (byte) 114);
        setByteElement(term24259, 3, (byte) -81);
        setField(term24235, term24235.getClass(), "SINGLE", term24259);
        setLongField(term24235, term24235.getClass(), "bytesRead", 5973526439563541711L);
        Class<? extends Object> term24654 = Class.forName((String) "java.io.File$PathStatus");
        Field term24653 = ((Class) term24654).getDeclaredField((String) "INVALID");
        ((Field) term24653).setAccessible(true);
        Object enum66 = ((Field) term24653).get((Object) null);
        term24134 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term24173 = newInstance(Class.forName("java.io.File"));
        setField(term24134, term24134.getClass(), "name", "");
        setBooleanField(term24134, term24134.getClass(), "preserveLeadingSlashes", true);
        setIntField(term24134, term24134.getClass(), "mode", -430151637);
        setLongField(term24134, term24134.getClass(), "userId", 6698455537431331246L);
        setLongField(term24134, term24134.getClass(), "groupId", -8327432141027603933L);
        setLongField(term24134, term24134.getClass(), "size", -433040798405298080L);
        setLongField(term24134, term24134.getClass(), "modTime", -1505191021111100819L);
        setBooleanField(term24134, term24134.getClass(), "checkSumOK", true);
        setByteField(term24134, term24134.getClass(), "linkFlag", (byte) 53);
        setField(term24134, term24134.getClass(), "linkName", "");
        setField(term24134, term24134.getClass(), "magic", "ustar ");
        setField(term24134, term24134.getClass(), "version", "00");
        setField(term24134, term24134.getClass(), "userName", "root");
        setField(term24134, term24134.getClass(), "groupName", "");
        setIntField(term24134, term24134.getClass(), "devMajor", -1697741339);
        setIntField(term24134, term24134.getClass(), "devMinor", 98922530);
        setBooleanField(term24134, term24134.getClass(), "isExtended", false);
        setLongField(term24134, term24134.getClass(), "realSize", -1000830646340880796L);
        setBooleanField(term24134, term24134.getClass(), "paxGNUSparse", true);
        setBooleanField(term24134, term24134.getClass(), "starSparse", false);
        setField(term24173, term24173.getClass(), "path", "sEnIVFtZuQ");
        setField(term24173, term24173.getClass(), "status", enum66);
        setIntField(term24173, term24173.getClass(), "prefixLength", -1388471422);
        setField(term24173, term24173.getClass(), "filePath", null);
        setField(term24134, term24134.getClass(), "file", term24173);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getCurrentEntry", argTypes, term6686, args);
        assertTrue(recursiveEquals(term6686, term24235));
        assertTrue(recursiveEquals(retValue, term24134));
    }

};


