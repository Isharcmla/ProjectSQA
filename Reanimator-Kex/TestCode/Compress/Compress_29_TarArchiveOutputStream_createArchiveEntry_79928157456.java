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
import java.lang.String;
import java.lang.Object;

public class TarArchiveOutputStream_createArchiveEntry_79928157456 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1441;
     Object term1484;
     Object term58045;
     Object term58051;
     Object term57923;

    public TarArchiveOutputStream_createArchiveEntry_79928157456() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1441 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term1456 = (byte[]) newByteArray(6);
        byte[] term1464 = (byte[]) newByteArray(1);
        byte[] term1475 = (byte[]) newByteArray(7);
        setLongField(term1441, term1441.getClass(), "currSize", 2936323121573284007L);
        setField(term1441, term1441.getClass(), "currName", "OWDIEULEFu");
        setLongField(term1441, term1441.getClass(), "currBytes", -1154553077993834885L);
        setByteElement(term1456, 0, (byte) -124);
        setByteElement(term1456, 1, (byte) -71);
        setByteElement(term1456, 2, (byte) 113);
        setByteElement(term1456, 3, (byte) -77);
        setByteElement(term1456, 4, (byte) -12);
        setByteElement(term1456, 5, (byte) 58);
        setField(term1441, term1441.getClass(), "recordBuf", term1456);
        setIntField(term1441, term1441.getClass(), "assemLen", 1555897383);
        setByteElement(term1464, 0, (byte) 12);
        setField(term1441, term1441.getClass(), "assemBuf", term1464);
        setIntField(term1441, term1441.getClass(), "longFileMode", 202001407);
        setIntField(term1441, term1441.getClass(), "bigNumberMode", 158873461);
        setIntField(term1441, term1441.getClass(), "recordsWritten", -430151637);
        setIntField(term1441, term1441.getClass(), "recordsPerBlock", -1697741339);
        setIntField(term1441, term1441.getClass(), "recordSize", 98922530);
        setBooleanField(term1441, term1441.getClass(), "closed", true);
        setBooleanField(term1441, term1441.getClass(), "haveUnclosedEntry", true);
        setBooleanField(term1441, term1441.getClass(), "finished", false);
        setField(term1441, term1441.getClass(), "out", null);
        setField(term1441, term1441.getClass(), "zipEncoding", null);
        setBooleanField(term1441, term1441.getClass(), "addPaxHeadersForNonAsciiNames", false);
        setByteElement(term1475, 0, (byte) 79);
        setByteElement(term1475, 1, (byte) -4);
        setByteElement(term1475, 2, (byte) -27);
        setByteElement(term1475, 3, (byte) 120);
        setByteElement(term1475, 4, (byte) -25);
        setByteElement(term1475, 5, (byte) 114);
        setByteElement(term1475, 6, (byte) 105);
        setField(term1441, term1441.getClass(), "oneByte", term1475);
        setLongField(term1441, term1441.getClass(), "bytesWritten", -2850532706972744550L);
        Class<? extends Object> term58094 = Class.forName((String) "java.io.File$PathStatus");
        Field term58093 = ((Class) term58094).getDeclaredField((String) "INVALID");
        ((Field) term58093).setAccessible(true);
        Object enum6 = ((Field) term58093).get((Object) null);
        term1484 = newInstance(Class.forName("java.io.File"));
        setField(term1484, term1484.getClass(), "path", "dWRymuLBtr");
        setField(term1484, term1484.getClass(), "status", enum6);
        setIntField(term1484, term1484.getClass(), "prefixLength", -1388471422);
        setField(term1484, term1484.getClass(), "filePath", null);
        term58045 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term58048 = (byte[]) newByteArray(6);
        byte[] term58049 = (byte[]) newByteArray(1);
        byte[] term58050 = (byte[]) newByteArray(7);
        setLongField(term58045, term58045.getClass(), "currSize", 2936323121573284007L);
        setField(term58045, term58045.getClass(), "currName", "OWDIEULEFu");
        setLongField(term58045, term58045.getClass(), "currBytes", -1154553077993834885L);
        setByteElement(term58048, 0, (byte) -124);
        setByteElement(term58048, 1, (byte) -71);
        setByteElement(term58048, 2, (byte) 113);
        setByteElement(term58048, 3, (byte) -77);
        setByteElement(term58048, 4, (byte) -12);
        setByteElement(term58048, 5, (byte) 58);
        setField(term58045, term58045.getClass(), "recordBuf", term58048);
        setIntField(term58045, term58045.getClass(), "assemLen", 1555897383);
        setByteElement(term58049, 0, (byte) 12);
        setField(term58045, term58045.getClass(), "assemBuf", term58049);
        setIntField(term58045, term58045.getClass(), "longFileMode", 202001407);
        setIntField(term58045, term58045.getClass(), "bigNumberMode", 158873461);
        setIntField(term58045, term58045.getClass(), "recordsWritten", -430151637);
        setIntField(term58045, term58045.getClass(), "recordsPerBlock", -1697741339);
        setIntField(term58045, term58045.getClass(), "recordSize", 98922530);
        setBooleanField(term58045, term58045.getClass(), "closed", true);
        setBooleanField(term58045, term58045.getClass(), "haveUnclosedEntry", true);
        setBooleanField(term58045, term58045.getClass(), "finished", false);
        setField(term58045, term58045.getClass(), "out", null);
        setField(term58045, term58045.getClass(), "zipEncoding", null);
        setBooleanField(term58045, term58045.getClass(), "addPaxHeadersForNonAsciiNames", false);
        setByteElement(term58050, 0, (byte) 79);
        setByteElement(term58050, 1, (byte) -4);
        setByteElement(term58050, 2, (byte) -27);
        setByteElement(term58050, 3, (byte) 120);
        setByteElement(term58050, 4, (byte) -25);
        setByteElement(term58050, 5, (byte) 114);
        setByteElement(term58050, 6, (byte) 105);
        setField(term58045, term58045.getClass(), "oneByte", term58050);
        setLongField(term58045, term58045.getClass(), "bytesWritten", -2850532706972744550L);
        Class<? extends Object> term58281 = Class.forName((String) "java.io.File$PathStatus");
        Field term58280 = ((Class) term58281).getDeclaredField((String) "INVALID");
        ((Field) term58280).setAccessible(true);
        Object enum7 = ((Field) term58280).get((Object) null);
        term58051 = newInstance(Class.forName("java.io.File"));
        setField(term58051, term58051.getClass(), "path", "dWRymuLBtr");
        setField(term58051, term58051.getClass(), "status", enum7);
        setIntField(term58051, term58051.getClass(), "prefixLength", -1388471422);
        setField(term58051, term58051.getClass(), "filePath", null);
        Class<? extends Object> term58462 = Class.forName((String) "java.io.File$PathStatus");
        Field term58461 = ((Class) term58462).getDeclaredField((String) "INVALID");
        ((Field) term58461).setAccessible(true);
        Object enum8 = ((Field) term58461).get((Object) null);
        term57923 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term57965 = newInstance(Class.forName("java.io.File"));
        setField(term57923, term57923.getClass(), "name", "AijpHYOFuy");
        setIntField(term57923, term57923.getClass(), "mode", 33188);
        setIntField(term57923, term57923.getClass(), "userId", 0);
        setIntField(term57923, term57923.getClass(), "groupId", 0);
        setLongField(term57923, term57923.getClass(), "size", 0L);
        setLongField(term57923, term57923.getClass(), "modTime", 0L);
        setBooleanField(term57923, term57923.getClass(), "checkSumOK", false);
        setByteField(term57923, term57923.getClass(), "linkFlag", (byte) 48);
        setField(term57923, term57923.getClass(), "linkName", "");
        setField(term57923, term57923.getClass(), "magic", "ustar ");
        setField(term57923, term57923.getClass(), "version", "00");
        setField(term57923, term57923.getClass(), "userName", "");
        setField(term57923, term57923.getClass(), "groupName", "");
        setIntField(term57923, term57923.getClass(), "devMajor", 0);
        setIntField(term57923, term57923.getClass(), "devMinor", 0);
        setBooleanField(term57923, term57923.getClass(), "isExtended", false);
        setLongField(term57923, term57923.getClass(), "realSize", 0L);
        setField(term57965, term57965.getClass(), "path", "dWRymuLBtr");
        setField(term57965, term57965.getClass(), "status", enum8);
        setIntField(term57965, term57965.getClass(), "prefixLength", -1388471422);
        setField(term57965, term57965.getClass(), "filePath", null);
        setField(term57923, term57923.getClass(), "file", term57965);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.File");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term1484;
        args[1] = "AijpHYOFuy";
        Object retValue = callMethod(klass, "createArchiveEntry", argTypes, term1441, args);
        assertTrue(recursiveEquals(term1441, term58045));
        assertTrue(recursiveEquals(term1484, term58051));
        assertTrue(recursiveEquals(retValue, term57923));
    }

};


