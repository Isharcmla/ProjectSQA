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
import java.lang.Boolean;

public class TarArchiveInputStream_setAtEOF_27463930763 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6142;
     Object term6212;
     Object term22399;

    public TarArchiveInputStream_setAtEOF_27463930763() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term22514 = Class.forName((String) "java.io.File$PathStatus");
        Field term22513 = ((Class) term22514).getDeclaredField((String) "INVALID");
        ((Field) term22513).setAccessible(true);
        Object enum66 = ((Field) term22513).get((Object) null);
        term6142 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term6143 = (byte[]) newByteArray(8);
        Object term6157 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term6193 = newInstance(Class.forName("java.io.File"));
        byte[] term6210 = (byte[]) newByteArray(0);
        setByteElement(term6143, 0, (byte) 90);
        setByteElement(term6143, 1, (byte) 10);
        setByteElement(term6143, 2, (byte) 87);
        setByteElement(term6143, 3, (byte) -35);
        setByteElement(term6143, 4, (byte) -14);
        setByteElement(term6143, 5, (byte) 10);
        setByteElement(term6143, 6, (byte) 65);
        setByteElement(term6143, 7, (byte) -44);
        setField(term6142, term6142.getClass(), "SMALL_BUF", term6143);
        setIntField(term6142, term6142.getClass(), "recordSize", -571169753);
        setIntField(term6142, term6142.getClass(), "blockSize", 318591690);
        setBooleanField(term6142, term6142.getClass(), "hasHitEOF", false);
        setLongField(term6142, term6142.getClass(), "entrySize", 138235087558060686L);
        setLongField(term6142, term6142.getClass(), "entryOffset", 5381386339318883012L);
        setField(term6142, term6142.getClass(), "is", null);
        setField(term6157, term6157.getClass(), "name", "");
        setIntField(term6157, term6157.getClass(), "mode", -165587447);
        setIntField(term6157, term6157.getClass(), "userId", -1347358701);
        setIntField(term6157, term6157.getClass(), "groupId", 806595993);
        setLongField(term6157, term6157.getClass(), "size", -1333707622307134180L);
        setLongField(term6157, term6157.getClass(), "modTime", -4360569253593381888L);
        setBooleanField(term6157, term6157.getClass(), "checkSumOK", false);
        setByteField(term6157, term6157.getClass(), "linkFlag", (byte) 115);
        setField(term6157, term6157.getClass(), "linkName", "");
        setField(term6157, term6157.getClass(), "magic", "ustar ");
        setField(term6157, term6157.getClass(), "version", "00");
        setField(term6157, term6157.getClass(), "userName", "root");
        setField(term6157, term6157.getClass(), "groupName", "");
        setIntField(term6157, term6157.getClass(), "devMajor", 548228925);
        setIntField(term6157, term6157.getClass(), "devMinor", -749861210);
        setBooleanField(term6157, term6157.getClass(), "isExtended", true);
        setLongField(term6157, term6157.getClass(), "realSize", 1457594663983990440L);
        setField(term6193, term6193.getClass(), "path", "nyiiPDVjAc");
        setField(term6193, term6193.getClass(), "status", enum66);
        setIntField(term6193, term6193.getClass(), "prefixLength", 1694224101);
        setField(term6193, term6193.getClass(), "filePath", null);
        setField(term6157, term6157.getClass(), "file", term6193);
        setField(term6142, term6142.getClass(), "currEntry", term6157);
        setField(term6142, term6142.getClass(), "zipEncoding", null);
        setField(term6142, term6142.getClass(), "SINGLE", term6210);
        setLongField(term6142, term6142.getClass(), "bytesRead", 3452833434644634217L);
        term6212 = new Boolean(false);
        Class<? extends Object> term22797 = Class.forName((String) "java.io.File$PathStatus");
        Field term22796 = ((Class) term22797).getDeclaredField((String) "INVALID");
        ((Field) term22796).setAccessible(true);
        Object enum67 = ((Field) term22796).get((Object) null);
        term22399 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term22400 = (byte[]) newByteArray(8);
        Object term22401 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term22419 = newInstance(Class.forName("java.io.File"));
        byte[] term22424 = (byte[]) newByteArray(0);
        setByteElement(term22400, 0, (byte) 90);
        setByteElement(term22400, 1, (byte) 10);
        setByteElement(term22400, 2, (byte) 87);
        setByteElement(term22400, 3, (byte) -35);
        setByteElement(term22400, 4, (byte) -14);
        setByteElement(term22400, 5, (byte) 10);
        setByteElement(term22400, 6, (byte) 65);
        setByteElement(term22400, 7, (byte) -44);
        setField(term22399, term22399.getClass(), "SMALL_BUF", term22400);
        setIntField(term22399, term22399.getClass(), "recordSize", -571169753);
        setIntField(term22399, term22399.getClass(), "blockSize", 318591690);
        setBooleanField(term22399, term22399.getClass(), "hasHitEOF", false);
        setLongField(term22399, term22399.getClass(), "entrySize", 138235087558060686L);
        setLongField(term22399, term22399.getClass(), "entryOffset", 5381386339318883012L);
        setField(term22399, term22399.getClass(), "is", null);
        setField(term22401, term22401.getClass(), "name", "");
        setIntField(term22401, term22401.getClass(), "mode", -165587447);
        setIntField(term22401, term22401.getClass(), "userId", -1347358701);
        setIntField(term22401, term22401.getClass(), "groupId", 806595993);
        setLongField(term22401, term22401.getClass(), "size", -1333707622307134180L);
        setLongField(term22401, term22401.getClass(), "modTime", -4360569253593381888L);
        setBooleanField(term22401, term22401.getClass(), "checkSumOK", false);
        setByteField(term22401, term22401.getClass(), "linkFlag", (byte) 115);
        setField(term22401, term22401.getClass(), "linkName", "");
        setField(term22401, term22401.getClass(), "magic", "ustar ");
        setField(term22401, term22401.getClass(), "version", "00");
        setField(term22401, term22401.getClass(), "userName", "root");
        setField(term22401, term22401.getClass(), "groupName", "");
        setIntField(term22401, term22401.getClass(), "devMajor", 548228925);
        setIntField(term22401, term22401.getClass(), "devMinor", -749861210);
        setBooleanField(term22401, term22401.getClass(), "isExtended", true);
        setLongField(term22401, term22401.getClass(), "realSize", 1457594663983990440L);
        setField(term22419, term22419.getClass(), "path", "nyiiPDVjAc");
        setField(term22419, term22419.getClass(), "status", enum67);
        setIntField(term22419, term22419.getClass(), "prefixLength", 1694224101);
        setField(term22419, term22419.getClass(), "filePath", null);
        setField(term22401, term22401.getClass(), "file", term22419);
        setField(term22399, term22399.getClass(), "currEntry", term22401);
        setField(term22399, term22399.getClass(), "zipEncoding", null);
        setField(term22399, term22399.getClass(), "SINGLE", term22424);
        setLongField(term22399, term22399.getClass(), "bytesRead", 3452833434644634217L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term6212;
        callMethod(klass, "setAtEOF", argTypes, term6142, args);
        assertTrue(recursiveEquals(term6142, term22399));
        assertTrue(recursiveEquals(term6212, false));
    }

};


