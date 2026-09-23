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
import java.lang.Integer;

public class TarArchiveInputStream_read_82857799258 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5252;
     Object term5336;
     Object term5341;
     Object term5343;
     Object term21112;
     Object term21135;

    public TarArchiveInputStream_read_82857799258() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term21165 = Class.forName((String) "java.io.File$PathStatus");
        Field term21164 = ((Class) term21165).getDeclaredField((String) "INVALID");
        ((Field) term21164).setAccessible(true);
        Object enum54 = ((Field) term21164).get((Object) null);
        term5252 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term5253 = (byte[]) newByteArray(7);
        Object term5266 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term5302 = newInstance(Class.forName("java.io.File"));
        byte[] term5331 = (byte[]) newByteArray(3);
        setByteElement(term5253, 0, (byte) -35);
        setByteElement(term5253, 1, (byte) 3);
        setByteElement(term5253, 2, (byte) -10);
        setByteElement(term5253, 3, (byte) -106);
        setByteElement(term5253, 4, (byte) -124);
        setByteElement(term5253, 5, (byte) -71);
        setByteElement(term5253, 6, (byte) 113);
        setField(term5252, term5252.getClass(), "SMALL_BUF", term5253);
        setIntField(term5252, term5252.getClass(), "recordSize", 1072005683);
        setIntField(term5252, term5252.getClass(), "blockSize", 1861318859);
        setBooleanField(term5252, term5252.getClass(), "hasHitEOF", true);
        setLongField(term5252, term5252.getClass(), "entrySize", 3452833434644634217L);
        setLongField(term5252, term5252.getClass(), "entryOffset", -8603648071751666348L);
        setField(term5252, term5252.getClass(), "is", null);
        setField(term5266, term5266.getClass(), "name", "");
        setIntField(term5266, term5266.getClass(), "mode", 1474524152);
        setLongField(term5266, term5266.getClass(), "userId", -7884871963229073324L);
        setLongField(term5266, term5266.getClass(), "groupId", -8649738738252714180L);
        setLongField(term5266, term5266.getClass(), "size", -7278883608542636188L);
        setLongField(term5266, term5266.getClass(), "modTime", -1539859611880912454L);
        setBooleanField(term5266, term5266.getClass(), "checkSumOK", false);
        setByteField(term5266, term5266.getClass(), "linkFlag", (byte) -77);
        setField(term5266, term5266.getClass(), "linkName", "");
        setField(term5266, term5266.getClass(), "magic", "ustar ");
        setField(term5266, term5266.getClass(), "version", "00");
        setField(term5266, term5266.getClass(), "userName", "root");
        setField(term5266, term5266.getClass(), "groupName", "");
        setIntField(term5266, term5266.getClass(), "devMajor", 568954359);
        setIntField(term5266, term5266.getClass(), "devMinor", 53410913);
        setBooleanField(term5266, term5266.getClass(), "isExtended", false);
        setLongField(term5266, term5266.getClass(), "realSize", 4100236067313034103L);
        setField(term5302, term5302.getClass(), "path", "UiUYnPrcCi");
        setField(term5302, term5302.getClass(), "status", enum54);
        setIntField(term5302, term5302.getClass(), "prefixLength", -375014958);
        setField(term5302, term5302.getClass(), "filePath", null);
        setField(term5266, term5266.getClass(), "file", term5302);
        setField(term5252, term5252.getClass(), "currEntry", term5266);
        setField(term5252, term5252.getClass(), "zipEncoding", null);
        setField(term5252, term5252.getClass(), "encoding", "UoYtihxVaS");
        setByteElement(term5331, 0, (byte) -12);
        setByteElement(term5331, 1, (byte) 58);
        setByteElement(term5331, 2, (byte) 12);
        setField(term5252, term5252.getClass(), "SINGLE", term5331);
        setLongField(term5252, term5252.getClass(), "bytesRead", 1195529027276497124L);
        term5336 = (byte[]) newByteArray(4);
        setByteElement(term5336, 0, (byte) 79);
        setByteElement(term5336, 1, (byte) -4);
        setByteElement(term5336, 2, (byte) -27);
        setByteElement(term5336, 3, (byte) 120);
        term5341 = new Integer(1107176718);
        term5343 = new Integer(480137250);
        Class<? extends Object> term21354 = Class.forName((String) "java.io.File$PathStatus");
        Field term21353 = ((Class) term21354).getDeclaredField((String) "INVALID");
        ((Field) term21353).setAccessible(true);
        Object enum55 = ((Field) term21353).get((Object) null);
        term21112 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term21113 = (byte[]) newByteArray(7);
        Object term21114 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term21127 = newInstance(Class.forName("java.io.File"));
        byte[] term21134 = (byte[]) newByteArray(3);
        setByteElement(term21113, 0, (byte) -35);
        setByteElement(term21113, 1, (byte) 3);
        setByteElement(term21113, 2, (byte) -10);
        setByteElement(term21113, 3, (byte) -106);
        setByteElement(term21113, 4, (byte) -124);
        setByteElement(term21113, 5, (byte) -71);
        setByteElement(term21113, 6, (byte) 113);
        setField(term21112, term21112.getClass(), "SMALL_BUF", term21113);
        setIntField(term21112, term21112.getClass(), "recordSize", 1072005683);
        setIntField(term21112, term21112.getClass(), "blockSize", 1861318859);
        setBooleanField(term21112, term21112.getClass(), "hasHitEOF", true);
        setLongField(term21112, term21112.getClass(), "entrySize", 3452833434644634217L);
        setLongField(term21112, term21112.getClass(), "entryOffset", -8603648071751666348L);
        setField(term21112, term21112.getClass(), "is", null);
        setField(term21114, term21114.getClass(), "name", "");
        setIntField(term21114, term21114.getClass(), "mode", 1474524152);
        setLongField(term21114, term21114.getClass(), "userId", -7884871963229073324L);
        setLongField(term21114, term21114.getClass(), "groupId", -8649738738252714180L);
        setLongField(term21114, term21114.getClass(), "size", -7278883608542636188L);
        setLongField(term21114, term21114.getClass(), "modTime", -1539859611880912454L);
        setBooleanField(term21114, term21114.getClass(), "checkSumOK", false);
        setByteField(term21114, term21114.getClass(), "linkFlag", (byte) -77);
        setField(term21114, term21114.getClass(), "linkName", "");
        setField(term21114, term21114.getClass(), "magic", "ustar ");
        setField(term21114, term21114.getClass(), "version", "00");
        setField(term21114, term21114.getClass(), "userName", "root");
        setField(term21114, term21114.getClass(), "groupName", "");
        setIntField(term21114, term21114.getClass(), "devMajor", 568954359);
        setIntField(term21114, term21114.getClass(), "devMinor", 53410913);
        setBooleanField(term21114, term21114.getClass(), "isExtended", false);
        setLongField(term21114, term21114.getClass(), "realSize", 4100236067313034103L);
        setField(term21127, term21127.getClass(), "path", "UiUYnPrcCi");
        setField(term21127, term21127.getClass(), "status", enum55);
        setIntField(term21127, term21127.getClass(), "prefixLength", -375014958);
        setField(term21127, term21127.getClass(), "filePath", null);
        setField(term21114, term21114.getClass(), "file", term21127);
        setField(term21112, term21112.getClass(), "currEntry", term21114);
        setField(term21112, term21112.getClass(), "zipEncoding", null);
        setField(term21112, term21112.getClass(), "encoding", "UoYtihxVaS");
        setByteElement(term21134, 0, (byte) -12);
        setByteElement(term21134, 1, (byte) 58);
        setByteElement(term21134, 2, (byte) 12);
        setField(term21112, term21112.getClass(), "SINGLE", term21134);
        setLongField(term21112, term21112.getClass(), "bytesRead", 1195529027276497124L);
        term21135 = (byte[]) newByteArray(4);
        setByteElement(term21135, 0, (byte) 79);
        setByteElement(term21135, 1, (byte) -4);
        setByteElement(term21135, 2, (byte) -27);
        setByteElement(term21135, 3, (byte) 120);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term5336;
        args[1] = term5341;
        args[2] = term5343;
        Object retValue = callMethod(klass, "read", argTypes, term5252, args);
        assertTrue(recursiveEquals(term5252, term21112));
        assertTrue(recursiveEquals(term5336, term21135));
        assertTrue(recursiveEquals(term5341, 1107176718));
        assertTrue(recursiveEquals(term5343, 480137250));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


