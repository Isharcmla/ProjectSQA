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
import java.lang.RuntimeException;
import static org.apache.commons.compress.archivers.tar.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class TarArchiveInputStream_paxHeaders_51667172332 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1806;

    public TarArchiveInputStream_paxHeaders_51667172332() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term140049 = Class.forName((String) "java.io.File$PathStatus");
        Field term140048 = ((Class) term140049).getDeclaredField((String) "INVALID");
        ((Field) term140048).setAccessible(true);
        Object enum32 = ((Field) term140048).get((Object) null);
        term1806 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term1810 = (byte[]) newByteArray(1);
        Object term1812 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        byte[] term1813 = (byte[]) newByteArray(2);
        Object term1821 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term1856 = newInstance(Class.forName("java.io.File"));
        byte[] term1873 = (byte[]) newByteArray(3);
        setBooleanField(term1806, term1806.getClass(), "hasHitEOF", false);
        setLongField(term1806, term1806.getClass(), "entrySize", -6645965768855543712L);
        setLongField(term1806, term1806.getClass(), "entryOffset", 4784595517102746672L);
        setByteElement(term1810, 0, (byte) 88);
        setField(term1806, term1806.getClass(), "readBuf", term1810);
        setField(term1812, term1812.getClass(), "inStream", null);
        setField(term1812, term1812.getClass(), "outStream", null);
        setByteElement(term1813, 0, (byte) 96);
        setByteElement(term1813, 1, (byte) 70);
        setField(term1812, term1812.getClass(), "blockBuffer", term1813);
        setIntField(term1812, term1812.getClass(), "currBlkIdx", 972867650);
        setIntField(term1812, term1812.getClass(), "currRecIdx", 1655935355);
        setIntField(term1812, term1812.getClass(), "blockSize", -481533957);
        setIntField(term1812, term1812.getClass(), "recordSize", 1240914516);
        setIntField(term1812, term1812.getClass(), "recsPerBlock", -1465035361);
        setField(term1806, term1806.getClass(), "buffer", term1812);
        setField(term1821, term1821.getClass(), "name", "");
        setIntField(term1821, term1821.getClass(), "mode", 1090617576);
        setIntField(term1821, term1821.getClass(), "userId", -1547384488);
        setIntField(term1821, term1821.getClass(), "groupId", 1442160736);
        setLongField(term1821, term1821.getClass(), "size", -7612550318181586304L);
        setLongField(term1821, term1821.getClass(), "modTime", -2170847986967241072L);
        setByteField(term1821, term1821.getClass(), "linkFlag", (byte) 48);
        setField(term1821, term1821.getClass(), "linkName", "");
        setField(term1821, term1821.getClass(), "magic", "ustar ");
        setField(term1821, term1821.getClass(), "version", "00");
        setField(term1821, term1821.getClass(), "userName", "root");
        setField(term1821, term1821.getClass(), "groupName", "");
        setIntField(term1821, term1821.getClass(), "devMajor", 1114000454);
        setIntField(term1821, term1821.getClass(), "devMinor", -556405712);
        setBooleanField(term1821, term1821.getClass(), "isExtended", false);
        setLongField(term1821, term1821.getClass(), "realSize", 4044358158040652353L);
        setField(term1856, term1856.getClass(), "path", "MjGYSRKTNF");
        setField(term1856, term1856.getClass(), "status", enum32);
        setIntField(term1856, term1856.getClass(), "prefixLength", -1772434990);
        setField(term1856, term1856.getClass(), "filePath", null);
        setField(term1821, term1821.getClass(), "file", term1856);
        setField(term1806, term1806.getClass(), "currEntry", term1821);
        setByteElement(term1873, 0, (byte) -46);
        setByteElement(term1873, 1, (byte) -128);
        setByteElement(term1873, 2, (byte) 66);
        setField(term1806, term1806.getClass(), "SINGLE", term1873);
        setLongField(term1806, term1806.getClass(), "bytesRead", -4443169559037975007L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "paxHeaders", argTypes, term1806, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


