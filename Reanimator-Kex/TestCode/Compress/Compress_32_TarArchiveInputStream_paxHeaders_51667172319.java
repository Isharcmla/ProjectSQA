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
import java.lang.Object;
import java.lang.String;

public class TarArchiveInputStream_paxHeaders_51667172319 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3569;

    public TarArchiveInputStream_paxHeaders_51667172319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3682 = Class.forName((String) "java.io.File$PathStatus");
        Field term3681 = ((Class) term3682).getDeclaredField((String) "INVALID");
        ((Field) term3681).setAccessible(true);
        Object enum13 = ((Field) term3681).get((Object) null);
        term3569 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term3570 = (byte[]) newByteArray(7);
        Object term3583 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term3619 = newInstance(Class.forName("java.io.File"));
        byte[] term3648 = (byte[]) newByteArray(2);
        setByteElement(term3570, 0, (byte) -46);
        setByteElement(term3570, 1, (byte) 14);
        setByteElement(term3570, 2, (byte) 34);
        setByteElement(term3570, 3, (byte) 126);
        setByteElement(term3570, 4, (byte) 7);
        setByteElement(term3570, 5, (byte) -96);
        setByteElement(term3570, 6, (byte) -22);
        setField(term3569, term3569.getClass(), "SMALL_BUF", term3570);
        setIntField(term3569, term3569.getClass(), "recordSize", 1090617576);
        setIntField(term3569, term3569.getClass(), "blockSize", -1547384488);
        setBooleanField(term3569, term3569.getClass(), "hasHitEOF", false);
        setLongField(term3569, term3569.getClass(), "entrySize", -5786861555969446503L);
        setLongField(term3569, term3569.getClass(), "entryOffset", 2354625302846375590L);
        setField(term3569, term3569.getClass(), "is", null);
        setField(term3583, term3583.getClass(), "name", "");
        setIntField(term3583, term3583.getClass(), "mode", 1442160736);
        setLongField(term3583, term3583.getClass(), "userId", 7276637106827860087L);
        setLongField(term3583, term3583.getClass(), "groupId", -3936701866695933852L);
        setLongField(term3583, term3583.getClass(), "size", 1215116475929634177L);
        setLongField(term3583, term3583.getClass(), "modTime", 1597484336218508869L);
        setBooleanField(term3583, term3583.getClass(), "checkSumOK", false);
        setByteField(term3583, term3583.getClass(), "linkFlag", (byte) -5);
        setField(term3583, term3583.getClass(), "linkName", "");
        setField(term3583, term3583.getClass(), "magic", "ustar ");
        setField(term3583, term3583.getClass(), "version", "00");
        setField(term3583, term3583.getClass(), "userName", "root");
        setField(term3583, term3583.getClass(), "groupName", "");
        setIntField(term3583, term3583.getClass(), "devMajor", 1114000454);
        setIntField(term3583, term3583.getClass(), "devMinor", -556405712);
        setBooleanField(term3583, term3583.getClass(), "isExtended", false);
        setLongField(term3583, term3583.getClass(), "realSize", -685023850445639859L);
        setField(term3619, term3619.getClass(), "path", "TEParAifyi");
        setField(term3619, term3619.getClass(), "status", enum13);
        setIntField(term3619, term3619.getClass(), "prefixLength", -1772434990);
        setField(term3619, term3619.getClass(), "filePath", null);
        setField(term3583, term3583.getClass(), "file", term3619);
        setField(term3569, term3569.getClass(), "currEntry", term3583);
        setField(term3569, term3569.getClass(), "zipEncoding", null);
        setField(term3569, term3569.getClass(), "encoding", "OWDIEULEFu");
        setByteElement(term3648, 0, (byte) -124);
        setByteElement(term3648, 1, (byte) -105);
        setField(term3569, term3569.getClass(), "SINGLE", term3648);
        setLongField(term3569, term3569.getClass(), "bytesRead", -6950146046121430355L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "paxHeaders", argTypes, term3569, args);
    }

};


