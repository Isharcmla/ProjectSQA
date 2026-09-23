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
import java.lang.NegativeArraySizeException;
import static org.apache.commons.compress.archivers.tar.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;
import java.util.HashMap;

public class TarArchiveInputStream_getRecord_125393720951 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2879;

    public TarArchiveInputStream_getRecord_125393720951() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term18148 = Class.forName((String) "java.io.File$PathStatus");
        Field term18147 = ((Class) term18148).getDeclaredField((String) "CHECKED");
        ((Field) term18147).setAccessible(true);
        Object enum48 = ((Field) term18147).get((Object) null);
        HashMap term2960 = new HashMap();
        term2879 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term2880 = (byte[]) newByteArray(6);
        Object term2892 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term2931 = newInstance(Class.forName("java.io.File"));
        byte[] term2970 = (byte[]) newByteArray(5);
        setByteElement(term2880, 0, (byte) 96);
        setByteElement(term2880, 1, (byte) 70);
        setByteElement(term2880, 2, (byte) 48);
        setByteElement(term2880, 3, (byte) -46);
        setByteElement(term2880, 4, (byte) -128);
        setByteElement(term2880, 5, (byte) 66);
        setField(term2879, term2879.getClass(), "SMALL_BUF", term2880);
        setIntField(term2879, term2879.getClass(), "recordSize", -93135961);
        setIntField(term2879, term2879.getClass(), "blockSize", -112921587);
        setBooleanField(term2879, term2879.getClass(), "hasHitEOF", false);
        setLongField(term2879, term2879.getClass(), "entrySize", 6005241913654469005L);
        setLongField(term2879, term2879.getClass(), "entryOffset", -1983291584002806658L);
        setField(term2879, term2879.getClass(), "is", null);
        setField(term2892, term2892.getClass(), "name", "");
        setBooleanField(term2892, term2892.getClass(), "preserveLeadingSlashes", false);
        setIntField(term2892, term2892.getClass(), "mode", 933028652);
        setLongField(term2892, term2892.getClass(), "userId", 5946780097489996391L);
        setLongField(term2892, term2892.getClass(), "groupId", -8652538484981166496L);
        setLongField(term2892, term2892.getClass(), "size", 2701184207686293431L);
        setLongField(term2892, term2892.getClass(), "modTime", 4474998035090263139L);
        setBooleanField(term2892, term2892.getClass(), "checkSumOK", true);
        setByteField(term2892, term2892.getClass(), "linkFlag", (byte) -112);
        setField(term2892, term2892.getClass(), "linkName", "");
        setField(term2892, term2892.getClass(), "magic", "ustar ");
        setField(term2892, term2892.getClass(), "version", "00");
        setField(term2892, term2892.getClass(), "userName", "root");
        setField(term2892, term2892.getClass(), "groupName", "");
        setIntField(term2892, term2892.getClass(), "devMajor", 287287233);
        setIntField(term2892, term2892.getClass(), "devMinor", 962840079);
        setBooleanField(term2892, term2892.getClass(), "isExtended", true);
        setLongField(term2892, term2892.getClass(), "realSize", 2848819812340321742L);
        setBooleanField(term2892, term2892.getClass(), "paxGNUSparse", false);
        setBooleanField(term2892, term2892.getClass(), "starSparse", false);
        setField(term2931, term2931.getClass(), "path", "hxCBltsObl");
        setField(term2931, term2931.getClass(), "status", enum48);
        setIntField(term2931, term2931.getClass(), "prefixLength", 1540719661);
        setField(term2931, term2931.getClass(), "filePath", null);
        setField(term2892, term2892.getClass(), "file", term2931);
        setField(term2879, term2879.getClass(), "currEntry", term2892);
        setField(term2879, term2879.getClass(), "zipEncoding", null);
        setField(term2879, term2879.getClass(), "encoding", "BndsHwAFMv");
        setField(term2879, term2879.getClass(), "globalPaxHeaders", term2960);
        setByteElement(term2970, 0, (byte) 81);
        setByteElement(term2970, 1, (byte) 65);
        setByteElement(term2970, 2, (byte) -44);
        setByteElement(term2970, 3, (byte) 33);
        setByteElement(term2970, 4, (byte) -74);
        setField(term2879, term2879.getClass(), "SINGLE", term2970);
        setLongField(term2879, term2879.getClass(), "bytesRead", -8876856890348836498L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getRecord", argTypes, term2879, args);
            assertTrue(false);
        }
        catch (NegativeArraySizeException e) {
        }

    }

};


