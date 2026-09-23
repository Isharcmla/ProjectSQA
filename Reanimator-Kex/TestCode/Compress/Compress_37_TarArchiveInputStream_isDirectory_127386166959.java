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
import java.lang.StringIndexOutOfBoundsException;
import static org.apache.commons.compress.archivers.tar.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;
import java.util.HashMap;

public class TarArchiveInputStream_isDirectory_127386166959 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5247;

    public TarArchiveInputStream_isDirectory_127386166959() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term22132 = Class.forName((String) "java.io.File$PathStatus");
        Field term22131 = ((Class) term22132).getDeclaredField((String) "INVALID");
        ((Field) term22131).setAccessible(true);
        Object enum58 = ((Field) term22131).get((Object) null);
        HashMap term5330 = new HashMap();
        term5247 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term5248 = (byte[]) newByteArray(8);
        Object term5262 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term5301 = newInstance(Class.forName("java.io.File"));
        byte[] term5340 = (byte[]) newByteArray(9);
        setByteElement(term5248, 0, (byte) 1);
        setByteElement(term5248, 1, (byte) 99);
        setByteElement(term5248, 2, (byte) -121);
        setByteElement(term5248, 3, (byte) -50);
        setByteElement(term5248, 4, (byte) -79);
        setByteElement(term5248, 5, (byte) 110);
        setByteElement(term5248, 6, (byte) -111);
        setByteElement(term5248, 7, (byte) -54);
        setField(term5247, term5247.getClass(), "SMALL_BUF", term5248);
        setIntField(term5247, term5247.getClass(), "recordSize", 691577392);
        setIntField(term5247, term5247.getClass(), "blockSize", -893623680);
        setBooleanField(term5247, term5247.getClass(), "hasHitEOF", true);
        setLongField(term5247, term5247.getClass(), "entrySize", -6301101997917060727L);
        setLongField(term5247, term5247.getClass(), "entryOffset", 8166095254618543564L);
        setField(term5247, term5247.getClass(), "is", null);
        setField(term5262, term5262.getClass(), "name", "");
        setBooleanField(term5262, term5262.getClass(), "preserveLeadingSlashes", true);
        setIntField(term5262, term5262.getClass(), "mode", -1963434938);
        setLongField(term5262, term5262.getClass(), "userId", -4598158870068953328L);
        setLongField(term5262, term5262.getClass(), "groupId", 138235087558060686L);
        setLongField(term5262, term5262.getClass(), "size", 5381386339318883012L);
        setLongField(term5262, term5262.getClass(), "modTime", -1333707622307134180L);
        setBooleanField(term5262, term5262.getClass(), "checkSumOK", true);
        setByteField(term5262, term5262.getClass(), "linkFlag", (byte) -25);
        setField(term5262, term5262.getClass(), "linkName", "");
        setField(term5262, term5262.getClass(), "magic", "ustar ");
        setField(term5262, term5262.getClass(), "version", "00");
        setField(term5262, term5262.getClass(), "userName", "root");
        setField(term5262, term5262.getClass(), "groupName", "");
        setIntField(term5262, term5262.getClass(), "devMajor", 906181092);
        setIntField(term5262, term5262.getClass(), "devMinor", 1045657203);
        setBooleanField(term5262, term5262.getClass(), "isExtended", false);
        setLongField(term5262, term5262.getClass(), "realSize", -4360569253593381888L);
        setBooleanField(term5262, term5262.getClass(), "paxGNUSparse", true);
        setBooleanField(term5262, term5262.getClass(), "starSparse", false);
        setField(term5301, term5301.getClass(), "path", "TimdotUuNC");
        setField(term5301, term5301.getClass(), "status", enum58);
        setIntField(term5301, term5301.getClass(), "prefixLength", 1386130016);
        setField(term5301, term5301.getClass(), "filePath", null);
        setField(term5262, term5262.getClass(), "file", term5301);
        setField(term5247, term5247.getClass(), "currEntry", term5262);
        setField(term5247, term5247.getClass(), "zipEncoding", null);
        setField(term5247, term5247.getClass(), "encoding", "PkWMRdJcBb");
        setField(term5247, term5247.getClass(), "globalPaxHeaders", term5330);
        setByteElement(term5340, 0, (byte) -35);
        setByteElement(term5340, 1, (byte) 3);
        setByteElement(term5340, 2, (byte) -10);
        setByteElement(term5340, 3, (byte) -106);
        setByteElement(term5340, 4, (byte) -124);
        setByteElement(term5340, 5, (byte) -71);
        setByteElement(term5340, 6, (byte) 113);
        setByteElement(term5340, 7, (byte) -77);
        setByteElement(term5340, 8, (byte) -12);
        setField(term5247, term5247.getClass(), "SINGLE", term5340);
        setLongField(term5247, term5247.getClass(), "bytesRead", 1457594663983990440L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "isDirectory", argTypes, term5247, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};


