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
import java.util.HashMap;

public class TarArchiveInputStream_reset_143190083747 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1789;
     Object term15969;

    public TarArchiveInputStream_reset_143190083747() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term16017 = Class.forName((String) "java.io.File$PathStatus");
        Field term16016 = ((Class) term16017).getDeclaredField((String) "INVALID");
        ((Field) term16016).setAccessible(true);
        Object enum40 = ((Field) term16016).get((Object) null);
        HashMap term1865 = new HashMap();
        term1789 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term1790 = (byte[]) newByteArray(1);
        Object term1797 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term1836 = newInstance(Class.forName("java.io.File"));
        byte[] term1875 = (byte[]) newByteArray(0);
        setByteElement(term1790, 0, (byte) 102);
        setField(term1789, term1789.getClass(), "SMALL_BUF", term1790);
        setIntField(term1789, term1789.getClass(), "recordSize", -157887805);
        setIntField(term1789, term1789.getClass(), "blockSize", 1876565163);
        setBooleanField(term1789, term1789.getClass(), "hasHitEOF", true);
        setLongField(term1789, term1789.getClass(), "entrySize", -3842548265506930260L);
        setLongField(term1789, term1789.getClass(), "entryOffset", -5788180182343976541L);
        setField(term1789, term1789.getClass(), "is", null);
        setField(term1797, term1797.getClass(), "name", "");
        setBooleanField(term1797, term1797.getClass(), "preserveLeadingSlashes", true);
        setIntField(term1797, term1797.getClass(), "mode", -817164822);
        setLongField(term1797, term1797.getClass(), "userId", 2936323121573284007L);
        setLongField(term1797, term1797.getClass(), "groupId", -1154553077993834885L);
        setLongField(term1797, term1797.getClass(), "size", -2850532706972744550L);
        setLongField(term1797, term1797.getClass(), "modTime", -2644215923136513282L);
        setBooleanField(term1797, term1797.getClass(), "checkSumOK", true);
        setByteField(term1797, term1797.getClass(), "linkFlag", (byte) -118);
        setField(term1797, term1797.getClass(), "linkName", "");
        setField(term1797, term1797.getClass(), "magic", "ustar ");
        setField(term1797, term1797.getClass(), "version", "00");
        setField(term1797, term1797.getClass(), "userName", "root");
        setField(term1797, term1797.getClass(), "groupName", "");
        setIntField(term1797, term1797.getClass(), "devMajor", -1016503459);
        setIntField(term1797, term1797.getClass(), "devMinor", -1968847291);
        setBooleanField(term1797, term1797.getClass(), "isExtended", false);
        setLongField(term1797, term1797.getClass(), "realSize", -1468719814009985452L);
        setBooleanField(term1797, term1797.getClass(), "paxGNUSparse", false);
        setBooleanField(term1797, term1797.getClass(), "starSparse", false);
        setField(term1836, term1836.getClass(), "path", "OclPbYPkcH");
        setField(term1836, term1836.getClass(), "status", enum40);
        setIntField(term1836, term1836.getClass(), "prefixLength", 579005622);
        setField(term1836, term1836.getClass(), "filePath", null);
        setField(term1797, term1797.getClass(), "file", term1836);
        setField(term1789, term1789.getClass(), "currEntry", term1797);
        setField(term1789, term1789.getClass(), "zipEncoding", null);
        setField(term1789, term1789.getClass(), "encoding", "IoAlmYsBwc");
        setField(term1789, term1789.getClass(), "globalPaxHeaders", term1865);
        setField(term1789, term1789.getClass(), "SINGLE", term1875);
        setLongField(term1789, term1789.getClass(), "bytesRead", -7738503207562305297L);
        Class<? extends Object> term16193 = Class.forName((String) "java.io.File$PathStatus");
        Field term16192 = ((Class) term16193).getDeclaredField((String) "INVALID");
        ((Field) term16192).setAccessible(true);
        Object enum41 = ((Field) term16192).get((Object) null);
        HashMap term15991 = new HashMap();
        term15969 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term15970 = (byte[]) newByteArray(1);
        Object term15971 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term15984 = newInstance(Class.forName("java.io.File"));
        byte[] term15992 = (byte[]) newByteArray(0);
        setByteElement(term15970, 0, (byte) 102);
        setField(term15969, term15969.getClass(), "SMALL_BUF", term15970);
        setIntField(term15969, term15969.getClass(), "recordSize", -157887805);
        setIntField(term15969, term15969.getClass(), "blockSize", 1876565163);
        setBooleanField(term15969, term15969.getClass(), "hasHitEOF", true);
        setLongField(term15969, term15969.getClass(), "entrySize", -3842548265506930260L);
        setLongField(term15969, term15969.getClass(), "entryOffset", -5788180182343976541L);
        setField(term15969, term15969.getClass(), "is", null);
        setField(term15971, term15971.getClass(), "name", "");
        setBooleanField(term15971, term15971.getClass(), "preserveLeadingSlashes", true);
        setIntField(term15971, term15971.getClass(), "mode", -817164822);
        setLongField(term15971, term15971.getClass(), "userId", 2936323121573284007L);
        setLongField(term15971, term15971.getClass(), "groupId", -1154553077993834885L);
        setLongField(term15971, term15971.getClass(), "size", -2850532706972744550L);
        setLongField(term15971, term15971.getClass(), "modTime", -2644215923136513282L);
        setBooleanField(term15971, term15971.getClass(), "checkSumOK", true);
        setByteField(term15971, term15971.getClass(), "linkFlag", (byte) -118);
        setField(term15971, term15971.getClass(), "linkName", "");
        setField(term15971, term15971.getClass(), "magic", "ustar ");
        setField(term15971, term15971.getClass(), "version", "00");
        setField(term15971, term15971.getClass(), "userName", "root");
        setField(term15971, term15971.getClass(), "groupName", "");
        setIntField(term15971, term15971.getClass(), "devMajor", -1016503459);
        setIntField(term15971, term15971.getClass(), "devMinor", -1968847291);
        setBooleanField(term15971, term15971.getClass(), "isExtended", false);
        setLongField(term15971, term15971.getClass(), "realSize", -1468719814009985452L);
        setBooleanField(term15971, term15971.getClass(), "paxGNUSparse", false);
        setBooleanField(term15971, term15971.getClass(), "starSparse", false);
        setField(term15984, term15984.getClass(), "path", "OclPbYPkcH");
        setField(term15984, term15984.getClass(), "status", enum41);
        setIntField(term15984, term15984.getClass(), "prefixLength", 579005622);
        setField(term15984, term15984.getClass(), "filePath", null);
        setField(term15971, term15971.getClass(), "file", term15984);
        setField(term15969, term15969.getClass(), "currEntry", term15971);
        setField(term15969, term15969.getClass(), "zipEncoding", null);
        setField(term15969, term15969.getClass(), "encoding", "IoAlmYsBwc");
        setField(term15969, term15969.getClass(), "globalPaxHeaders", term15991);
        setField(term15969, term15969.getClass(), "SINGLE", term15992);
        setLongField(term15969, term15969.getClass(), "bytesRead", -7738503207562305297L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "reset", argTypes, term1789, args);
        assertTrue(recursiveEquals(term1789, term15969));
    }

};


