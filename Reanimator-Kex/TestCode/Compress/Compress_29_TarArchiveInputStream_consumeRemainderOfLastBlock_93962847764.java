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

public class TarArchiveInputStream_consumeRemainderOfLastBlock_93962847764 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6387;
     Object term23019;

    public TarArchiveInputStream_consumeRemainderOfLastBlock_93962847764() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term23068 = Class.forName((String) "java.io.File$PathStatus");
        Field term23067 = ((Class) term23068).getDeclaredField((String) "CHECKED");
        ((Field) term23067).setAccessible(true);
        Object enum68 = ((Field) term23067).get((Object) null);
        term6387 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term6388 = (byte[]) newByteArray(6);
        Object term6400 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term6436 = newInstance(Class.forName("java.io.File"));
        byte[] term6453 = (byte[]) newByteArray(0);
        setByteElement(term6388, 0, (byte) -32);
        setByteElement(term6388, 1, (byte) -52);
        setByteElement(term6388, 2, (byte) 53);
        setByteElement(term6388, 3, (byte) 44);
        setByteElement(term6388, 4, (byte) 49);
        setByteElement(term6388, 5, (byte) 114);
        setField(term6387, term6387.getClass(), "SMALL_BUF", term6388);
        setIntField(term6387, term6387.getClass(), "recordSize", 937859191);
        setIntField(term6387, term6387.getClass(), "blockSize", -916584829);
        setBooleanField(term6387, term6387.getClass(), "hasHitEOF", false);
        setLongField(term6387, term6387.getClass(), "entrySize", -8603648071751666348L);
        setLongField(term6387, term6387.getClass(), "entryOffset", -7884871963229073324L);
        setField(term6387, term6387.getClass(), "is", null);
        setField(term6400, term6400.getClass(), "name", "");
        setIntField(term6400, term6400.getClass(), "mode", -2131181468);
        setIntField(term6400, term6400.getClass(), "userId", 282916351);
        setIntField(term6400, term6400.getClass(), "groupId", 880977281);
        setLongField(term6400, term6400.getClass(), "size", -8649738738252714180L);
        setLongField(term6400, term6400.getClass(), "modTime", -7278883608542636188L);
        setBooleanField(term6400, term6400.getClass(), "checkSumOK", true);
        setByteField(term6400, term6400.getClass(), "linkFlag", (byte) -81);
        setField(term6400, term6400.getClass(), "linkName", "");
        setField(term6400, term6400.getClass(), "magic", "ustar ");
        setField(term6400, term6400.getClass(), "version", "00");
        setField(term6400, term6400.getClass(), "userName", "root");
        setField(term6400, term6400.getClass(), "groupName", "");
        setIntField(term6400, term6400.getClass(), "devMajor", 371943306);
        setIntField(term6400, term6400.getClass(), "devMinor", 982388293);
        setBooleanField(term6400, term6400.getClass(), "isExtended", false);
        setLongField(term6400, term6400.getClass(), "realSize", -1539859611880912454L);
        setField(term6436, term6436.getClass(), "path", "aKnKipADSo");
        setField(term6436, term6436.getClass(), "status", enum68);
        setIntField(term6436, term6436.getClass(), "prefixLength", -159494544);
        setField(term6436, term6436.getClass(), "filePath", null);
        setField(term6400, term6400.getClass(), "file", term6436);
        setField(term6387, term6387.getClass(), "currEntry", term6400);
        setField(term6387, term6387.getClass(), "zipEncoding", null);
        setField(term6387, term6387.getClass(), "SINGLE", term6453);
        setLongField(term6387, term6387.getClass(), "bytesRead", 4100236067313034103L);
        Class<? extends Object> term23239 = Class.forName((String) "java.io.File$PathStatus");
        Field term23238 = ((Class) term23239).getDeclaredField((String) "CHECKED");
        ((Field) term23238).setAccessible(true);
        Object enum69 = ((Field) term23238).get((Object) null);
        term23019 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term23020 = (byte[]) newByteArray(6);
        Object term23021 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term23034 = newInstance(Class.forName("java.io.File"));
        byte[] term23039 = (byte[]) newByteArray(0);
        setByteElement(term23020, 0, (byte) -32);
        setByteElement(term23020, 1, (byte) -52);
        setByteElement(term23020, 2, (byte) 53);
        setByteElement(term23020, 3, (byte) 44);
        setByteElement(term23020, 4, (byte) 49);
        setByteElement(term23020, 5, (byte) 114);
        setField(term23019, term23019.getClass(), "SMALL_BUF", term23020);
        setIntField(term23019, term23019.getClass(), "recordSize", 937859191);
        setIntField(term23019, term23019.getClass(), "blockSize", -916584829);
        setBooleanField(term23019, term23019.getClass(), "hasHitEOF", false);
        setLongField(term23019, term23019.getClass(), "entrySize", -8603648071751666348L);
        setLongField(term23019, term23019.getClass(), "entryOffset", -7884871963229073324L);
        setField(term23019, term23019.getClass(), "is", null);
        setField(term23021, term23021.getClass(), "name", "");
        setIntField(term23021, term23021.getClass(), "mode", -2131181468);
        setIntField(term23021, term23021.getClass(), "userId", 282916351);
        setIntField(term23021, term23021.getClass(), "groupId", 880977281);
        setLongField(term23021, term23021.getClass(), "size", -8649738738252714180L);
        setLongField(term23021, term23021.getClass(), "modTime", -7278883608542636188L);
        setBooleanField(term23021, term23021.getClass(), "checkSumOK", true);
        setByteField(term23021, term23021.getClass(), "linkFlag", (byte) -81);
        setField(term23021, term23021.getClass(), "linkName", "");
        setField(term23021, term23021.getClass(), "magic", "ustar ");
        setField(term23021, term23021.getClass(), "version", "00");
        setField(term23021, term23021.getClass(), "userName", "root");
        setField(term23021, term23021.getClass(), "groupName", "");
        setIntField(term23021, term23021.getClass(), "devMajor", 371943306);
        setIntField(term23021, term23021.getClass(), "devMinor", 982388293);
        setBooleanField(term23021, term23021.getClass(), "isExtended", false);
        setLongField(term23021, term23021.getClass(), "realSize", -1539859611880912454L);
        setField(term23034, term23034.getClass(), "path", "aKnKipADSo");
        setField(term23034, term23034.getClass(), "status", enum69);
        setIntField(term23034, term23034.getClass(), "prefixLength", -159494544);
        setField(term23034, term23034.getClass(), "filePath", null);
        setField(term23021, term23021.getClass(), "file", term23034);
        setField(term23019, term23019.getClass(), "currEntry", term23021);
        setField(term23019, term23019.getClass(), "zipEncoding", null);
        setField(term23019, term23019.getClass(), "SINGLE", term23039);
        setLongField(term23019, term23019.getClass(), "bytesRead", 4100236067313034103L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "consumeRemainderOfLastBlock", argTypes, term6387, args);
        assertTrue(recursiveEquals(term6387, term23019));
    }

};


