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

public class TarArchiveInputStream_getNextEntry_36885160352 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3892;
     Object term17450;

    public TarArchiveInputStream_getNextEntry_36885160352() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term17502 = Class.forName((String) "java.io.File$PathStatus");
        Field term17501 = ((Class) term17502).getDeclaredField((String) "INVALID");
        ((Field) term17501).setAccessible(true);
        Object enum47 = ((Field) term17501).get((Object) null);
        term3892 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term3893 = (byte[]) newByteArray(9);
        Object term3908 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term3944 = newInstance(Class.forName("java.io.File"));
        byte[] term3961 = (byte[]) newByteArray(4);
        setByteElement(term3893, 0, (byte) -22);
        setByteElement(term3893, 1, (byte) -5);
        setByteElement(term3893, 2, (byte) -124);
        setByteElement(term3893, 3, (byte) -105);
        setByteElement(term3893, 4, (byte) 25);
        setByteElement(term3893, 5, (byte) 16);
        setByteElement(term3893, 6, (byte) 39);
        setByteElement(term3893, 7, (byte) 123);
        setByteElement(term3893, 8, (byte) 16);
        setField(term3892, term3892.getClass(), "SMALL_BUF", term3893);
        setIntField(term3892, term3892.getClass(), "recordSize", -375014958);
        setIntField(term3892, term3892.getClass(), "blockSize", 1107176718);
        setBooleanField(term3892, term3892.getClass(), "hasHitEOF", true);
        setLongField(term3892, term3892.getClass(), "entrySize", 5836128569274066678L);
        setLongField(term3892, term3892.getClass(), "entryOffset", -2177368829816872572L);
        setField(term3892, term3892.getClass(), "is", null);
        setField(term3908, term3908.getClass(), "name", "");
        setIntField(term3908, term3908.getClass(), "mode", 480137250);
        setIntField(term3908, term3908.getClass(), "userId", -341152642);
        setIntField(term3908, term3908.getClass(), "groupId", -2015854073);
        setLongField(term3908, term3908.getClass(), "size", -8463029266761149071L);
        setLongField(term3908, term3908.getClass(), "modTime", 3133860696238261492L);
        setBooleanField(term3908, term3908.getClass(), "checkSumOK", true);
        setByteField(term3908, term3908.getClass(), "linkFlag", (byte) 2);
        setField(term3908, term3908.getClass(), "linkName", "");
        setField(term3908, term3908.getClass(), "magic", "ustar ");
        setField(term3908, term3908.getClass(), "version", "00");
        setField(term3908, term3908.getClass(), "userName", "root");
        setField(term3908, term3908.getClass(), "groupName", "");
        setIntField(term3908, term3908.getClass(), "devMajor", 538259104);
        setIntField(term3908, term3908.getClass(), "devMinor", 96566506);
        setBooleanField(term3908, term3908.getClass(), "isExtended", true);
        setLongField(term3908, term3908.getClass(), "realSize", 7247160664318067468L);
        setField(term3944, term3944.getClass(), "path", "xrwlQZdwCp");
        setField(term3944, term3944.getClass(), "status", enum47);
        setIntField(term3944, term3944.getClass(), "prefixLength", -343325701);
        setField(term3944, term3944.getClass(), "filePath", null);
        setField(term3908, term3908.getClass(), "file", term3944);
        setField(term3892, term3892.getClass(), "currEntry", term3908);
        setField(term3892, term3892.getClass(), "encoding", null);
        setByteElement(term3961, 0, (byte) -120);
        setByteElement(term3961, 1, (byte) 96);
        setByteElement(term3961, 2, (byte) -41);
        setByteElement(term3961, 3, (byte) -88);
        setField(term3892, term3892.getClass(), "SINGLE", term3961);
        setLongField(term3892, term3892.getClass(), "bytesRead", 2135754395358000892L);
        Class<? extends Object> term17680 = Class.forName((String) "java.io.File$PathStatus");
        Field term17679 = ((Class) term17680).getDeclaredField((String) "INVALID");
        ((Field) term17679).setAccessible(true);
        Object enum48 = ((Field) term17679).get((Object) null);
        term17450 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term17451 = (byte[]) newByteArray(9);
        Object term17452 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term17465 = newInstance(Class.forName("java.io.File"));
        byte[] term17470 = (byte[]) newByteArray(4);
        setByteElement(term17451, 0, (byte) -22);
        setByteElement(term17451, 1, (byte) -5);
        setByteElement(term17451, 2, (byte) -124);
        setByteElement(term17451, 3, (byte) -105);
        setByteElement(term17451, 4, (byte) 25);
        setByteElement(term17451, 5, (byte) 16);
        setByteElement(term17451, 6, (byte) 39);
        setByteElement(term17451, 7, (byte) 123);
        setByteElement(term17451, 8, (byte) 16);
        setField(term17450, term17450.getClass(), "SMALL_BUF", term17451);
        setIntField(term17450, term17450.getClass(), "recordSize", -375014958);
        setIntField(term17450, term17450.getClass(), "blockSize", 1107176718);
        setBooleanField(term17450, term17450.getClass(), "hasHitEOF", true);
        setLongField(term17450, term17450.getClass(), "entrySize", 5836128569274066678L);
        setLongField(term17450, term17450.getClass(), "entryOffset", -2177368829816872572L);
        setField(term17450, term17450.getClass(), "is", null);
        setField(term17452, term17452.getClass(), "name", "");
        setIntField(term17452, term17452.getClass(), "mode", 480137250);
        setIntField(term17452, term17452.getClass(), "userId", -341152642);
        setIntField(term17452, term17452.getClass(), "groupId", -2015854073);
        setLongField(term17452, term17452.getClass(), "size", -8463029266761149071L);
        setLongField(term17452, term17452.getClass(), "modTime", 3133860696238261492L);
        setBooleanField(term17452, term17452.getClass(), "checkSumOK", true);
        setByteField(term17452, term17452.getClass(), "linkFlag", (byte) 2);
        setField(term17452, term17452.getClass(), "linkName", "");
        setField(term17452, term17452.getClass(), "magic", "ustar ");
        setField(term17452, term17452.getClass(), "version", "00");
        setField(term17452, term17452.getClass(), "userName", "root");
        setField(term17452, term17452.getClass(), "groupName", "");
        setIntField(term17452, term17452.getClass(), "devMajor", 538259104);
        setIntField(term17452, term17452.getClass(), "devMinor", 96566506);
        setBooleanField(term17452, term17452.getClass(), "isExtended", true);
        setLongField(term17452, term17452.getClass(), "realSize", 7247160664318067468L);
        setField(term17465, term17465.getClass(), "path", "xrwlQZdwCp");
        setField(term17465, term17465.getClass(), "status", enum48);
        setIntField(term17465, term17465.getClass(), "prefixLength", -343325701);
        setField(term17465, term17465.getClass(), "filePath", null);
        setField(term17452, term17452.getClass(), "file", term17465);
        setField(term17450, term17450.getClass(), "currEntry", term17452);
        setField(term17450, term17450.getClass(), "encoding", null);
        setByteElement(term17470, 0, (byte) -120);
        setByteElement(term17470, 1, (byte) 96);
        setByteElement(term17470, 2, (byte) -41);
        setByteElement(term17470, 3, (byte) -88);
        setField(term17450, term17450.getClass(), "SINGLE", term17470);
        setLongField(term17450, term17450.getClass(), "bytesRead", 2135754395358000892L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getNextEntry", argTypes, term3892, args);
        assertTrue(recursiveEquals(term3892, term17450));
        assertTrue(recursiveEquals(retValue, null));
    }

};


