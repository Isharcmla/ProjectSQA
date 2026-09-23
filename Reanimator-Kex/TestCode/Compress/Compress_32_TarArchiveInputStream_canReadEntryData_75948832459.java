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

public class TarArchiveInputStream_canReadEntryData_75948832459 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5534;
     Object term21597;

    public TarArchiveInputStream_canReadEntryData_75948832459() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term21650 = Class.forName((String) "java.io.File$PathStatus");
        Field term21649 = ((Class) term21650).getDeclaredField((String) "INVALID");
        ((Field) term21649).setAccessible(true);
        Object enum56 = ((Field) term21649).get((Object) null);
        term5534 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term5535 = (byte[]) newByteArray(7);
        Object term5548 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term5584 = newInstance(Class.forName("java.io.File"));
        byte[] term5613 = (byte[]) newByteArray(1);
        setByteElement(term5535, 0, (byte) -25);
        setByteElement(term5535, 1, (byte) 114);
        setByteElement(term5535, 2, (byte) 105);
        setByteElement(term5535, 3, (byte) -95);
        setByteElement(term5535, 4, (byte) -6);
        setByteElement(term5535, 5, (byte) 51);
        setByteElement(term5535, 6, (byte) 122);
        setField(term5534, term5534.getClass(), "SMALL_BUF", term5535);
        setIntField(term5534, term5534.getClass(), "recordSize", -341152642);
        setIntField(term5534, term5534.getClass(), "blockSize", -2015854073);
        setBooleanField(term5534, term5534.getClass(), "hasHitEOF", false);
        setLongField(term5534, term5534.getClass(), "entrySize", -2783999800714825789L);
        setLongField(term5534, term5534.getClass(), "entryOffset", 4266570509071948633L);
        setField(term5534, term5534.getClass(), "is", null);
        setField(term5548, term5548.getClass(), "name", "");
        setIntField(term5548, term5548.getClass(), "mode", 538259104);
        setLongField(term5548, term5548.getClass(), "userId", -7291742736502427077L);
        setLongField(term5548, term5548.getClass(), "groupId", -8121849829073967555L);
        setLongField(term5548, term5548.getClass(), "size", 5219030281405653303L);
        setLongField(term5548, term5548.getClass(), "modTime", -8471550651709805183L);
        setBooleanField(term5548, term5548.getClass(), "checkSumOK", false);
        setByteField(term5548, term5548.getClass(), "linkFlag", (byte) 84);
        setField(term5548, term5548.getClass(), "linkName", "");
        setField(term5548, term5548.getClass(), "magic", "ustar ");
        setField(term5548, term5548.getClass(), "version", "00");
        setField(term5548, term5548.getClass(), "userName", "root");
        setField(term5548, term5548.getClass(), "groupName", "");
        setIntField(term5548, term5548.getClass(), "devMajor", 96566506);
        setIntField(term5548, term5548.getClass(), "devMinor", -343325701);
        setBooleanField(term5548, term5548.getClass(), "isExtended", true);
        setLongField(term5548, term5548.getClass(), "realSize", -948292411727204525L);
        setField(term5584, term5584.getClass(), "path", "JDswTTCZHV");
        setField(term5584, term5584.getClass(), "status", enum56);
        setIntField(term5584, term5584.getClass(), "prefixLength", 107945604);
        setField(term5584, term5584.getClass(), "filePath", null);
        setField(term5548, term5548.getClass(), "file", term5584);
        setField(term5534, term5534.getClass(), "currEntry", term5548);
        setField(term5534, term5534.getClass(), "zipEncoding", null);
        setField(term5534, term5534.getClass(), "encoding", "onpbIeEKoi");
        setByteElement(term5613, 0, (byte) -36);
        setField(term5534, term5534.getClass(), "SINGLE", term5613);
        setLongField(term5534, term5534.getClass(), "bytesRead", -8892586408602479513L);
        Class<? extends Object> term21833 = Class.forName((String) "java.io.File$PathStatus");
        Field term21832 = ((Class) term21833).getDeclaredField((String) "CHECKED");
        ((Field) term21832).setAccessible(true);
        Object enum57 = ((Field) term21832).get((Object) null);
        term21597 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term21598 = (byte[]) newByteArray(7);
        Object term21599 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term21612 = newInstance(Class.forName("java.io.File"));
        byte[] term21619 = (byte[]) newByteArray(1);
        setByteElement(term21598, 0, (byte) -25);
        setByteElement(term21598, 1, (byte) 114);
        setByteElement(term21598, 2, (byte) 105);
        setByteElement(term21598, 3, (byte) -95);
        setByteElement(term21598, 4, (byte) -6);
        setByteElement(term21598, 5, (byte) 51);
        setByteElement(term21598, 6, (byte) 122);
        setField(term21597, term21597.getClass(), "SMALL_BUF", term21598);
        setIntField(term21597, term21597.getClass(), "recordSize", -341152642);
        setIntField(term21597, term21597.getClass(), "blockSize", -2015854073);
        setBooleanField(term21597, term21597.getClass(), "hasHitEOF", false);
        setLongField(term21597, term21597.getClass(), "entrySize", -2783999800714825789L);
        setLongField(term21597, term21597.getClass(), "entryOffset", 4266570509071948633L);
        setField(term21597, term21597.getClass(), "is", null);
        setField(term21599, term21599.getClass(), "name", "");
        setIntField(term21599, term21599.getClass(), "mode", 538259104);
        setLongField(term21599, term21599.getClass(), "userId", -7291742736502427077L);
        setLongField(term21599, term21599.getClass(), "groupId", -8121849829073967555L);
        setLongField(term21599, term21599.getClass(), "size", 5219030281405653303L);
        setLongField(term21599, term21599.getClass(), "modTime", -8471550651709805183L);
        setBooleanField(term21599, term21599.getClass(), "checkSumOK", false);
        setByteField(term21599, term21599.getClass(), "linkFlag", (byte) 84);
        setField(term21599, term21599.getClass(), "linkName", "");
        setField(term21599, term21599.getClass(), "magic", "ustar ");
        setField(term21599, term21599.getClass(), "version", "00");
        setField(term21599, term21599.getClass(), "userName", "root");
        setField(term21599, term21599.getClass(), "groupName", "");
        setIntField(term21599, term21599.getClass(), "devMajor", 96566506);
        setIntField(term21599, term21599.getClass(), "devMinor", -343325701);
        setBooleanField(term21599, term21599.getClass(), "isExtended", true);
        setLongField(term21599, term21599.getClass(), "realSize", -948292411727204525L);
        setField(term21612, term21612.getClass(), "path", "JDswTTCZHV");
        setField(term21612, term21612.getClass(), "status", enum57);
        setIntField(term21612, term21612.getClass(), "prefixLength", 107945604);
        setField(term21612, term21612.getClass(), "filePath", null);
        setField(term21599, term21599.getClass(), "file", term21612);
        setField(term21597, term21597.getClass(), "currEntry", term21599);
        setField(term21597, term21597.getClass(), "zipEncoding", null);
        setField(term21597, term21597.getClass(), "encoding", "onpbIeEKoi");
        setByteElement(term21619, 0, (byte) -36);
        setField(term21597, term21597.getClass(), "SINGLE", term21619);
        setLongField(term21597, term21597.getClass(), "bytesRead", -8892586408602479513L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.ArchiveEntry");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "canReadEntryData", argTypes, term5534, args);
        assertTrue(recursiveEquals(term5534, term21597));
        assertTrue(recursiveEquals(retValue, false));
    }

};


