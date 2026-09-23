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
import java.lang.NullPointerException;
import static org.apache.commons.compress.archivers.tar.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class TarArchiveInputStream_parsePaxHeaders_31633666333 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2049;

    public TarArchiveInputStream_parsePaxHeaders_31633666333() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term148836 = Class.forName((String) "java.io.File$PathStatus");
        Field term148835 = ((Class) term148836).getDeclaredField((String) "CHECKED");
        ((Field) term148835).setAccessible(true);
        Object enum34 = ((Field) term148835).get((Object) null);
        term2049 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term2053 = (byte[]) newByteArray(7);
        Object term2061 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        byte[] term2062 = (byte[]) newByteArray(2);
        Object term2070 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term2105 = newInstance(Class.forName("java.io.File"));
        byte[] term2122 = (byte[]) newByteArray(6);
        setBooleanField(term2049, term2049.getClass(), "hasHitEOF", true);
        setLongField(term2049, term2049.getClass(), "entrySize", -3842548265506930260L);
        setLongField(term2049, term2049.getClass(), "entryOffset", -5788180182343976541L);
        setByteElement(term2053, 0, (byte) -112);
        setByteElement(term2053, 1, (byte) 81);
        setByteElement(term2053, 2, (byte) 65);
        setByteElement(term2053, 3, (byte) -44);
        setByteElement(term2053, 4, (byte) 33);
        setByteElement(term2053, 5, (byte) -74);
        setByteElement(term2053, 6, (byte) -84);
        setField(term2049, term2049.getClass(), "readBuf", term2053);
        setField(term2061, term2061.getClass(), "inStream", null);
        setField(term2061, term2061.getClass(), "outStream", null);
        setByteElement(term2062, 0, (byte) -53);
        setByteElement(term2062, 1, (byte) -93);
        setField(term2061, term2061.getClass(), "blockBuffer", term2062);
        setIntField(term2061, term2061.getClass(), "currBlkIdx", -1845499264);
        setIntField(term2061, term2061.getClass(), "currRecIdx", -505439934);
        setIntField(term2061, term2061.getClass(), "blockSize", -344842608);
        setIntField(term2061, term2061.getClass(), "recordSize", 941650513);
        setIntField(term2061, term2061.getClass(), "recsPerBlock", 444029505);
        setField(term2049, term2049.getClass(), "buffer", term2061);
        setField(term2070, term2070.getClass(), "name", "");
        setIntField(term2070, term2070.getClass(), "mode", -1034506028);
        setIntField(term2070, term2070.getClass(), "userId", -1263114719);
        setIntField(term2070, term2070.getClass(), "groupId", -894662986);
        setLongField(term2070, term2070.getClass(), "size", 2936323121573284007L);
        setLongField(term2070, term2070.getClass(), "modTime", -1154553077993834885L);
        setByteField(term2070, term2070.getClass(), "linkFlag", (byte) 82);
        setField(term2070, term2070.getClass(), "linkName", "");
        setField(term2070, term2070.getClass(), "magic", "ustar ");
        setField(term2070, term2070.getClass(), "version", "00");
        setField(term2070, term2070.getClass(), "userName", "root");
        setField(term2070, term2070.getClass(), "groupName", "");
        setIntField(term2070, term2070.getClass(), "devMajor", 304775596);
        setIntField(term2070, term2070.getClass(), "devMinor", -1347665717);
        setBooleanField(term2070, term2070.getClass(), "isExtended", true);
        setLongField(term2070, term2070.getClass(), "realSize", -2850532706972744550L);
        setField(term2105, term2105.getClass(), "path", "hRNSzYYIrc");
        setField(term2105, term2105.getClass(), "status", enum34);
        setIntField(term2105, term2105.getClass(), "prefixLength", -1888585309);
        setField(term2105, term2105.getClass(), "filePath", null);
        setField(term2070, term2070.getClass(), "file", term2105);
        setField(term2049, term2049.getClass(), "currEntry", term2070);
        setByteElement(term2122, 0, (byte) -89);
        setByteElement(term2122, 1, (byte) 24);
        setByteElement(term2122, 2, (byte) 123);
        setByteElement(term2122, 3, (byte) -101);
        setByteElement(term2122, 4, (byte) -102);
        setByteElement(term2122, 5, (byte) -95);
        setField(term2049, term2049.getClass(), "SINGLE", term2122);
        setLongField(term2049, term2049.getClass(), "bytesRead", -2644215923136513282L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.Reader");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "parsePaxHeaders", argTypes, term2049, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


