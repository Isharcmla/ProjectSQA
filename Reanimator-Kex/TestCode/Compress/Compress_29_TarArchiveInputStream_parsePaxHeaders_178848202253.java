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

public class TarArchiveInputStream_parsePaxHeaders_178848202253 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3528;

    public TarArchiveInputStream_parsePaxHeaders_178848202253() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term18011 = Class.forName((String) "java.io.File$PathStatus");
        Field term18010 = ((Class) term18011).getDeclaredField((String) "CHECKED");
        ((Field) term18010).setAccessible(true);
        Object enum48 = ((Field) term18010).get((Object) null);
        term3528 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term3529 = (byte[]) newByteArray(5);
        Object term3540 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term3576 = newInstance(Class.forName("java.io.File"));
        byte[] term3593 = (byte[]) newByteArray(1);
        setByteElement(term3529, 0, (byte) 25);
        setByteElement(term3529, 1, (byte) 16);
        setByteElement(term3529, 2, (byte) 39);
        setByteElement(term3529, 3, (byte) 123);
        setByteElement(term3529, 4, (byte) 16);
        setField(term3528, term3528.getClass(), "SMALL_BUF", term3529);
        setIntField(term3528, term3528.getClass(), "recordSize", 1045657203);
        setIntField(term3528, term3528.getClass(), "blockSize", 1386130016);
        setBooleanField(term3528, term3528.getClass(), "hasHitEOF", true);
        setLongField(term3528, term3528.getClass(), "entrySize", 2701184207686293431L);
        setLongField(term3528, term3528.getClass(), "entryOffset", 4474998035090263139L);
        setField(term3528, term3528.getClass(), "is", null);
        setField(term3540, term3540.getClass(), "name", "");
        setIntField(term3540, term3540.getClass(), "mode", 1072005683);
        setIntField(term3540, term3540.getClass(), "userId", 1861318859);
        setIntField(term3540, term3540.getClass(), "groupId", 1474524152);
        setLongField(term3540, term3540.getClass(), "size", 2848819812340321742L);
        setLongField(term3540, term3540.getClass(), "modTime", -8876856890348836498L);
        setBooleanField(term3540, term3540.getClass(), "checkSumOK", true);
        setByteField(term3540, term3540.getClass(), "linkFlag", (byte) 2);
        setField(term3540, term3540.getClass(), "linkName", "");
        setField(term3540, term3540.getClass(), "magic", "ustar ");
        setField(term3540, term3540.getClass(), "version", "00");
        setField(term3540, term3540.getClass(), "userName", "root");
        setField(term3540, term3540.getClass(), "groupName", "");
        setIntField(term3540, term3540.getClass(), "devMajor", 568954359);
        setIntField(term3540, term3540.getClass(), "devMinor", 53410913);
        setBooleanField(term3540, term3540.getClass(), "isExtended", false);
        setLongField(term3540, term3540.getClass(), "realSize", 846579494941632714L);
        setField(term3576, term3576.getClass(), "path", "tbcdzjIfER");
        setField(term3576, term3576.getClass(), "status", enum48);
        setIntField(term3576, term3576.getClass(), "prefixLength", -375014958);
        setField(term3576, term3576.getClass(), "filePath", null);
        setField(term3540, term3540.getClass(), "file", term3576);
        setField(term3528, term3528.getClass(), "currEntry", term3540);
        setField(term3528, term3528.getClass(), "zipEncoding", null);
        setByteElement(term3593, 0, (byte) -120);
        setField(term3528, term3528.getClass(), "SINGLE", term3593);
        setLongField(term3528, term3528.getClass(), "bytesRead", 6689117472719450333L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.InputStream");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "parsePaxHeaders", argTypes, term3528, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


