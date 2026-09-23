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
import java.io.IOException;
import static org.apache.commons.compress.archivers.tar.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class TarArchiveInputStream_getRecord_125393720931 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1549;

    public TarArchiveInputStream_getRecord_125393720931() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term114791 = Class.forName((String) "java.io.File$PathStatus");
        Field term114790 = ((Class) term114791).getDeclaredField((String) "INVALID");
        ((Field) term114790).setAccessible(true);
        Object enum31 = ((Field) term114790).get((Object) null);
        term1549 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term1553 = (byte[]) newByteArray(1);
        Object term1555 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        byte[] term1556 = (byte[]) newByteArray(9);
        Object term1571 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term1606 = newInstance(Class.forName("java.io.File"));
        byte[] term1623 = (byte[]) newByteArray(3);
        setBooleanField(term1549, term1549.getClass(), "hasHitEOF", false);
        setLongField(term1549, term1549.getClass(), "entrySize", 1439298019805881866L);
        setLongField(term1549, term1549.getClass(), "entryOffset", -8708192233349544946L);
        setByteElement(term1553, 0, (byte) 45);
        setField(term1549, term1549.getClass(), "readBuf", term1553);
        setField(term1555, term1555.getClass(), "inStream", null);
        setField(term1555, term1555.getClass(), "outStream", null);
        setByteElement(term1556, 0, (byte) -39);
        setByteElement(term1556, 1, (byte) -20);
        setByteElement(term1556, 2, (byte) 10);
        setByteElement(term1556, 3, (byte) 77);
        setByteElement(term1556, 4, (byte) 14);
        setByteElement(term1556, 5, (byte) -101);
        setByteElement(term1556, 6, (byte) 35);
        setByteElement(term1556, 7, (byte) 66);
        setByteElement(term1556, 8, (byte) 123);
        setField(term1555, term1555.getClass(), "blockBuffer", term1556);
        setIntField(term1555, term1555.getClass(), "currBlkIdx", 933028652);
        setIntField(term1555, term1555.getClass(), "currRecIdx", 287287233);
        setIntField(term1555, term1555.getClass(), "blockSize", 962840079);
        setIntField(term1555, term1555.getClass(), "recordSize", 1540719661);
        setIntField(term1555, term1555.getClass(), "recsPerBlock", 1265463001);
        setField(term1549, term1549.getClass(), "buffer", term1555);
        setField(term1571, term1571.getClass(), "name", "");
        setIntField(term1571, term1571.getClass(), "mode", 335112684);
        setIntField(term1571, term1571.getClass(), "userId", 1551099402);
        setIntField(term1571, term1571.getClass(), "groupId", -2027534003);
        setLongField(term1571, term1571.getClass(), "size", 5907001541142728739L);
        setLongField(term1571, term1571.getClass(), "modTime", 4178434741742309755L);
        setByteField(term1571, term1571.getClass(), "linkFlag", (byte) -5);
        setField(term1571, term1571.getClass(), "linkName", "");
        setField(term1571, term1571.getClass(), "magic", "ustar ");
        setField(term1571, term1571.getClass(), "version", "00");
        setField(term1571, term1571.getClass(), "userName", "root");
        setField(term1571, term1571.getClass(), "groupName", "");
        setIntField(term1571, term1571.getClass(), "devMajor", 1063420942);
        setIntField(term1571, term1571.getClass(), "devMinor", 1375330971);
        setBooleanField(term1571, term1571.getClass(), "isExtended", true);
        setLongField(term1571, term1571.getClass(), "realSize", -2068172595987555756L);
        setField(term1606, term1606.getClass(), "path", "SzjVpOQTyS");
        setField(term1606, term1606.getClass(), "status", enum31);
        setIntField(term1606, term1606.getClass(), "prefixLength", -478195677);
        setField(term1606, term1606.getClass(), "filePath", null);
        setField(term1571, term1571.getClass(), "file", term1606);
        setField(term1549, term1549.getClass(), "currEntry", term1571);
        setByteElement(term1623, 0, (byte) 84);
        setByteElement(term1623, 1, (byte) -97);
        setByteElement(term1623, 2, (byte) -24);
        setField(term1549, term1549.getClass(), "SINGLE", term1623);
        setLongField(term1549, term1549.getClass(), "bytesRead", -6292278961887936280L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getRecord", argTypes, term1549, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


