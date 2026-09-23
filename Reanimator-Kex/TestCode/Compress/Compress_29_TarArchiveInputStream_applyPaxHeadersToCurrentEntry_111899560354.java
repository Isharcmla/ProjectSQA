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
import java.util.LinkedHashMap;

public class TarArchiveInputStream_applyPaxHeadersToCurrentEntry_111899560354 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3767;
     Object term3837;
     Object term18232;
     Object term18253;

    public TarArchiveInputStream_applyPaxHeadersToCurrentEntry_111899560354() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term18285 = Class.forName((String) "java.io.File$PathStatus");
        Field term18284 = ((Class) term18285).getDeclaredField((String) "INVALID");
        ((Field) term18284).setAccessible(true);
        Object enum49 = ((Field) term18284).get((Object) null);
        term3767 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term3768 = (byte[]) newByteArray(8);
        Object term3782 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term3818 = newInstance(Class.forName("java.io.File"));
        byte[] term3835 = (byte[]) newByteArray(0);
        setByteElement(term3768, 0, (byte) 96);
        setByteElement(term3768, 1, (byte) -41);
        setByteElement(term3768, 2, (byte) -88);
        setByteElement(term3768, 3, (byte) 39);
        setByteElement(term3768, 4, (byte) -1);
        setByteElement(term3768, 5, (byte) 117);
        setByteElement(term3768, 6, (byte) 43);
        setByteElement(term3768, 7, (byte) -27);
        setField(term3767, term3767.getClass(), "SMALL_BUF", term3768);
        setIntField(term3767, term3767.getClass(), "recordSize", 1107176718);
        setIntField(term3767, term3767.getClass(), "blockSize", 480137250);
        setBooleanField(term3767, term3767.getClass(), "hasHitEOF", true);
        setLongField(term3767, term3767.getClass(), "entrySize", 5836128569274066678L);
        setLongField(term3767, term3767.getClass(), "entryOffset", -2177368829816872572L);
        setField(term3767, term3767.getClass(), "is", null);
        setField(term3782, term3782.getClass(), "name", "");
        setIntField(term3782, term3782.getClass(), "mode", -341152642);
        setIntField(term3782, term3782.getClass(), "userId", -2015854073);
        setIntField(term3782, term3782.getClass(), "groupId", 538259104);
        setLongField(term3782, term3782.getClass(), "size", -8463029266761149071L);
        setLongField(term3782, term3782.getClass(), "modTime", 3133860696238261492L);
        setBooleanField(term3782, term3782.getClass(), "checkSumOK", true);
        setByteField(term3782, term3782.getClass(), "linkFlag", (byte) 34);
        setField(term3782, term3782.getClass(), "linkName", "");
        setField(term3782, term3782.getClass(), "magic", "ustar ");
        setField(term3782, term3782.getClass(), "version", "00");
        setField(term3782, term3782.getClass(), "userName", "root");
        setField(term3782, term3782.getClass(), "groupName", "");
        setIntField(term3782, term3782.getClass(), "devMajor", 96566506);
        setIntField(term3782, term3782.getClass(), "devMinor", -343325701);
        setBooleanField(term3782, term3782.getClass(), "isExtended", true);
        setLongField(term3782, term3782.getClass(), "realSize", 7247160664318067468L);
        setField(term3818, term3818.getClass(), "path", "HyxfbSQYBe");
        setField(term3818, term3818.getClass(), "status", enum49);
        setIntField(term3818, term3818.getClass(), "prefixLength", 107945604);
        setField(term3818, term3818.getClass(), "filePath", null);
        setField(term3782, term3782.getClass(), "file", term3818);
        setField(term3767, term3767.getClass(), "currEntry", term3782);
        setField(term3767, term3767.getClass(), "zipEncoding", null);
        setField(term3767, term3767.getClass(), "SINGLE", term3835);
        setLongField(term3767, term3767.getClass(), "bytesRead", 2135754395358000892L);
        term3837 = new LinkedHashMap();
        Class<? extends Object> term18458 = Class.forName((String) "java.io.File$PathStatus");
        Field term18457 = ((Class) term18458).getDeclaredField((String) "INVALID");
        ((Field) term18457).setAccessible(true);
        Object enum50 = ((Field) term18457).get((Object) null);
        term18232 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term18233 = (byte[]) newByteArray(8);
        Object term18234 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term18247 = newInstance(Class.forName("java.io.File"));
        byte[] term18252 = (byte[]) newByteArray(0);
        setByteElement(term18233, 0, (byte) 96);
        setByteElement(term18233, 1, (byte) -41);
        setByteElement(term18233, 2, (byte) -88);
        setByteElement(term18233, 3, (byte) 39);
        setByteElement(term18233, 4, (byte) -1);
        setByteElement(term18233, 5, (byte) 117);
        setByteElement(term18233, 6, (byte) 43);
        setByteElement(term18233, 7, (byte) -27);
        setField(term18232, term18232.getClass(), "SMALL_BUF", term18233);
        setIntField(term18232, term18232.getClass(), "recordSize", 1107176718);
        setIntField(term18232, term18232.getClass(), "blockSize", 480137250);
        setBooleanField(term18232, term18232.getClass(), "hasHitEOF", true);
        setLongField(term18232, term18232.getClass(), "entrySize", 5836128569274066678L);
        setLongField(term18232, term18232.getClass(), "entryOffset", -2177368829816872572L);
        setField(term18232, term18232.getClass(), "is", null);
        setField(term18234, term18234.getClass(), "name", "");
        setIntField(term18234, term18234.getClass(), "mode", -341152642);
        setIntField(term18234, term18234.getClass(), "userId", -2015854073);
        setIntField(term18234, term18234.getClass(), "groupId", 538259104);
        setLongField(term18234, term18234.getClass(), "size", -8463029266761149071L);
        setLongField(term18234, term18234.getClass(), "modTime", 3133860696238261492L);
        setBooleanField(term18234, term18234.getClass(), "checkSumOK", true);
        setByteField(term18234, term18234.getClass(), "linkFlag", (byte) 34);
        setField(term18234, term18234.getClass(), "linkName", "");
        setField(term18234, term18234.getClass(), "magic", "ustar ");
        setField(term18234, term18234.getClass(), "version", "00");
        setField(term18234, term18234.getClass(), "userName", "root");
        setField(term18234, term18234.getClass(), "groupName", "");
        setIntField(term18234, term18234.getClass(), "devMajor", 96566506);
        setIntField(term18234, term18234.getClass(), "devMinor", -343325701);
        setBooleanField(term18234, term18234.getClass(), "isExtended", true);
        setLongField(term18234, term18234.getClass(), "realSize", 7247160664318067468L);
        setField(term18247, term18247.getClass(), "path", "HyxfbSQYBe");
        setField(term18247, term18247.getClass(), "status", enum50);
        setIntField(term18247, term18247.getClass(), "prefixLength", 107945604);
        setField(term18247, term18247.getClass(), "filePath", null);
        setField(term18234, term18234.getClass(), "file", term18247);
        setField(term18232, term18232.getClass(), "currEntry", term18234);
        setField(term18232, term18232.getClass(), "zipEncoding", null);
        setField(term18232, term18232.getClass(), "SINGLE", term18252);
        setLongField(term18232, term18232.getClass(), "bytesRead", 2135754395358000892L);
        term18253 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Map");
        Object[] args = new Object[1];
        args[0] = term3837;
        callMethod(klass, "applyPaxHeadersToCurrentEntry", argTypes, term3767, args);
        assertTrue(recursiveEquals(term3767, term18232));
        assertTrue(recursiveEquals(term3837, term18253));
    }

};


