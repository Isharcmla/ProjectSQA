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

public class TarArchiveInputStream_readGNUSparse_157335578051 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3663;
     Object term17188;

    public TarArchiveInputStream_readGNUSparse_157335578051() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term17232 = Class.forName((String) "java.io.File$PathStatus");
        Field term17231 = ((Class) term17232).getDeclaredField((String) "INVALID");
        ((Field) term17231).setAccessible(true);
        Object enum46 = ((Field) term17231).get((Object) null);
        term3663 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term3664 = (byte[]) newByteArray(1);
        Object term3671 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term3707 = newInstance(Class.forName("java.io.File"));
        byte[] term3724 = (byte[]) newByteArray(0);
        setByteElement(term3664, 0, (byte) 7);
        setField(term3663, term3663.getClass(), "SMALL_BUF", term3664);
        setIntField(term3663, term3663.getClass(), "recordSize", 906181092);
        setIntField(term3663, term3663.getClass(), "blockSize", 1045657203);
        setBooleanField(term3663, term3663.getClass(), "hasHitEOF", true);
        setLongField(term3663, term3663.getClass(), "entrySize", 2701184207686293431L);
        setLongField(term3663, term3663.getClass(), "entryOffset", 4474998035090263139L);
        setField(term3663, term3663.getClass(), "is", null);
        setField(term3671, term3671.getClass(), "name", "");
        setIntField(term3671, term3671.getClass(), "mode", 1386130016);
        setIntField(term3671, term3671.getClass(), "userId", 1072005683);
        setIntField(term3671, term3671.getClass(), "groupId", 1861318859);
        setLongField(term3671, term3671.getClass(), "size", 2848819812340321742L);
        setLongField(term3671, term3671.getClass(), "modTime", -8876856890348836498L);
        setBooleanField(term3671, term3671.getClass(), "checkSumOK", true);
        setByteField(term3671, term3671.getClass(), "linkFlag", (byte) -96);
        setField(term3671, term3671.getClass(), "linkName", "");
        setField(term3671, term3671.getClass(), "magic", "ustar ");
        setField(term3671, term3671.getClass(), "version", "00");
        setField(term3671, term3671.getClass(), "userName", "root");
        setField(term3671, term3671.getClass(), "groupName", "");
        setIntField(term3671, term3671.getClass(), "devMajor", 1474524152);
        setIntField(term3671, term3671.getClass(), "devMinor", 568954359);
        setBooleanField(term3671, term3671.getClass(), "isExtended", false);
        setLongField(term3671, term3671.getClass(), "realSize", 846579494941632714L);
        setField(term3707, term3707.getClass(), "path", "Ghbwtircqb");
        setField(term3707, term3707.getClass(), "status", enum46);
        setIntField(term3707, term3707.getClass(), "prefixLength", 53410913);
        setField(term3707, term3707.getClass(), "filePath", null);
        setField(term3671, term3671.getClass(), "file", term3707);
        setField(term3663, term3663.getClass(), "currEntry", term3671);
        setField(term3663, term3663.getClass(), "encoding", null);
        setField(term3663, term3663.getClass(), "SINGLE", term3724);
        setLongField(term3663, term3663.getClass(), "bytesRead", 6689117472719450333L);
        Class<? extends Object> term17850 = Class.forName((String) "java.io.File$PathStatus");
        Field term17849 = ((Class) term17850).getDeclaredField((String) "INVALID");
        ((Field) term17849).setAccessible(true);
        Object enum49 = ((Field) term17849).get((Object) null);
        term17188 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term17189 = (byte[]) newByteArray(1);
        Object term17190 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term17203 = newInstance(Class.forName("java.io.File"));
        byte[] term17208 = (byte[]) newByteArray(0);
        setByteElement(term17189, 0, (byte) 7);
        setField(term17188, term17188.getClass(), "SMALL_BUF", term17189);
        setIntField(term17188, term17188.getClass(), "recordSize", 906181092);
        setIntField(term17188, term17188.getClass(), "blockSize", 1045657203);
        setBooleanField(term17188, term17188.getClass(), "hasHitEOF", true);
        setLongField(term17188, term17188.getClass(), "entrySize", 2701184207686293431L);
        setLongField(term17188, term17188.getClass(), "entryOffset", 4474998035090263139L);
        setField(term17188, term17188.getClass(), "is", null);
        setField(term17190, term17190.getClass(), "name", "");
        setIntField(term17190, term17190.getClass(), "mode", 1386130016);
        setIntField(term17190, term17190.getClass(), "userId", 1072005683);
        setIntField(term17190, term17190.getClass(), "groupId", 1861318859);
        setLongField(term17190, term17190.getClass(), "size", 2848819812340321742L);
        setLongField(term17190, term17190.getClass(), "modTime", -8876856890348836498L);
        setBooleanField(term17190, term17190.getClass(), "checkSumOK", true);
        setByteField(term17190, term17190.getClass(), "linkFlag", (byte) -96);
        setField(term17190, term17190.getClass(), "linkName", "");
        setField(term17190, term17190.getClass(), "magic", "ustar ");
        setField(term17190, term17190.getClass(), "version", "00");
        setField(term17190, term17190.getClass(), "userName", "root");
        setField(term17190, term17190.getClass(), "groupName", "");
        setIntField(term17190, term17190.getClass(), "devMajor", 1474524152);
        setIntField(term17190, term17190.getClass(), "devMinor", 568954359);
        setBooleanField(term17190, term17190.getClass(), "isExtended", false);
        setLongField(term17190, term17190.getClass(), "realSize", 846579494941632714L);
        setField(term17203, term17203.getClass(), "path", "Ghbwtircqb");
        setField(term17203, term17203.getClass(), "status", enum49);
        setIntField(term17203, term17203.getClass(), "prefixLength", 53410913);
        setField(term17203, term17203.getClass(), "filePath", null);
        setField(term17190, term17190.getClass(), "file", term17203);
        setField(term17188, term17188.getClass(), "currEntry", term17190);
        setField(term17188, term17188.getClass(), "encoding", null);
        setField(term17188, term17188.getClass(), "SINGLE", term17208);
        setLongField(term17188, term17188.getClass(), "bytesRead", 6689117472719450333L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "readGNUSparse", argTypes, term3663, args);
        assertTrue(recursiveEquals(term3663, term17188));
    }

};


