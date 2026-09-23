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

public class TarArchiveInputStream_applyPaxHeadersToCurrentEntry_111899560350 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3269;
     Object term3340;
     Object term16692;
     Object term16713;

    public TarArchiveInputStream_applyPaxHeadersToCurrentEntry_111899560350() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term16744 = Class.forName((String) "java.io.File$PathStatus");
        Field term16743 = ((Class) term16744).getDeclaredField((String) "CHECKED");
        ((Field) term16743).setAccessible(true);
        Object enum44 = ((Field) term16743).get((Object) null);
        term3269 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term3270 = (byte[]) newByteArray(7);
        Object term3283 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term3319 = newInstance(Class.forName("java.io.File"));
        byte[] term3336 = (byte[]) newByteArray(2);
        setByteElement(term3270, 0, (byte) 96);
        setByteElement(term3270, 1, (byte) 51);
        setByteElement(term3270, 2, (byte) -53);
        setByteElement(term3270, 3, (byte) -8);
        setByteElement(term3270, 4, (byte) -9);
        setByteElement(term3270, 5, (byte) 97);
        setByteElement(term3270, 6, (byte) -46);
        setField(term3269, term3269.getClass(), "SMALL_BUF", term3270);
        setIntField(term3269, term3269.getClass(), "recordSize", -341962980);
        setIntField(term3269, term3269.getClass(), "blockSize", 1532716628);
        setBooleanField(term3269, term3269.getClass(), "hasHitEOF", false);
        setLongField(term3269, term3269.getClass(), "entrySize", 50358265865610362L);
        setLongField(term3269, term3269.getClass(), "entryOffset", 5510783420697225605L);
        setField(term3269, term3269.getClass(), "is", null);
        setField(term3283, term3283.getClass(), "name", "");
        setIntField(term3283, term3283.getClass(), "mode", -1801760683);
        setIntField(term3283, term3283.getClass(), "userId", 1141317871);
        setIntField(term3283, term3283.getClass(), "groupId", 890669485);
        setLongField(term3283, term3283.getClass(), "size", 6005241913654469005L);
        setLongField(term3283, term3283.getClass(), "modTime", -1983291584002806658L);
        setBooleanField(term3283, term3283.getClass(), "checkSumOK", false);
        setByteField(term3283, term3283.getClass(), "linkFlag", (byte) 14);
        setField(term3283, term3283.getClass(), "linkName", "");
        setField(term3283, term3283.getClass(), "magic", "ustar ");
        setField(term3283, term3283.getClass(), "version", "00");
        setField(term3283, term3283.getClass(), "userName", "root");
        setField(term3283, term3283.getClass(), "groupName", "");
        setIntField(term3283, term3283.getClass(), "devMajor", 691577392);
        setIntField(term3283, term3283.getClass(), "devMinor", -893623680);
        setBooleanField(term3283, term3283.getClass(), "isExtended", false);
        setLongField(term3283, term3283.getClass(), "realSize", 5946780097489996391L);
        setField(term3319, term3319.getClass(), "path", "ZiaGIbnzTs");
        setField(term3319, term3319.getClass(), "status", enum44);
        setIntField(term3319, term3319.getClass(), "prefixLength", -1963434938);
        setField(term3319, term3319.getClass(), "filePath", null);
        setField(term3283, term3283.getClass(), "file", term3319);
        setField(term3269, term3269.getClass(), "currEntry", term3283);
        setField(term3269, term3269.getClass(), "encoding", null);
        setByteElement(term3336, 0, (byte) 34);
        setByteElement(term3336, 1, (byte) 126);
        setField(term3269, term3269.getClass(), "SINGLE", term3336);
        setLongField(term3269, term3269.getClass(), "bytesRead", -8652538484981166496L);
        term3340 = new LinkedHashMap();
        Class<? extends Object> term16918 = Class.forName((String) "java.io.File$PathStatus");
        Field term16917 = ((Class) term16918).getDeclaredField((String) "INVALID");
        ((Field) term16917).setAccessible(true);
        Object enum45 = ((Field) term16917).get((Object) null);
        term16692 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term16693 = (byte[]) newByteArray(7);
        Object term16694 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term16707 = newInstance(Class.forName("java.io.File"));
        byte[] term16712 = (byte[]) newByteArray(2);
        setByteElement(term16693, 0, (byte) 96);
        setByteElement(term16693, 1, (byte) 51);
        setByteElement(term16693, 2, (byte) -53);
        setByteElement(term16693, 3, (byte) -8);
        setByteElement(term16693, 4, (byte) -9);
        setByteElement(term16693, 5, (byte) 97);
        setByteElement(term16693, 6, (byte) -46);
        setField(term16692, term16692.getClass(), "SMALL_BUF", term16693);
        setIntField(term16692, term16692.getClass(), "recordSize", -341962980);
        setIntField(term16692, term16692.getClass(), "blockSize", 1532716628);
        setBooleanField(term16692, term16692.getClass(), "hasHitEOF", false);
        setLongField(term16692, term16692.getClass(), "entrySize", 50358265865610362L);
        setLongField(term16692, term16692.getClass(), "entryOffset", 5510783420697225605L);
        setField(term16692, term16692.getClass(), "is", null);
        setField(term16694, term16694.getClass(), "name", "");
        setIntField(term16694, term16694.getClass(), "mode", -1801760683);
        setIntField(term16694, term16694.getClass(), "userId", 1141317871);
        setIntField(term16694, term16694.getClass(), "groupId", 890669485);
        setLongField(term16694, term16694.getClass(), "size", 6005241913654469005L);
        setLongField(term16694, term16694.getClass(), "modTime", -1983291584002806658L);
        setBooleanField(term16694, term16694.getClass(), "checkSumOK", false);
        setByteField(term16694, term16694.getClass(), "linkFlag", (byte) 14);
        setField(term16694, term16694.getClass(), "linkName", "");
        setField(term16694, term16694.getClass(), "magic", "ustar ");
        setField(term16694, term16694.getClass(), "version", "00");
        setField(term16694, term16694.getClass(), "userName", "root");
        setField(term16694, term16694.getClass(), "groupName", "");
        setIntField(term16694, term16694.getClass(), "devMajor", 691577392);
        setIntField(term16694, term16694.getClass(), "devMinor", -893623680);
        setBooleanField(term16694, term16694.getClass(), "isExtended", false);
        setLongField(term16694, term16694.getClass(), "realSize", 5946780097489996391L);
        setField(term16707, term16707.getClass(), "path", "ZiaGIbnzTs");
        setField(term16707, term16707.getClass(), "status", enum45);
        setIntField(term16707, term16707.getClass(), "prefixLength", -1963434938);
        setField(term16707, term16707.getClass(), "filePath", null);
        setField(term16694, term16694.getClass(), "file", term16707);
        setField(term16692, term16692.getClass(), "currEntry", term16694);
        setField(term16692, term16692.getClass(), "encoding", null);
        setByteElement(term16712, 0, (byte) 34);
        setByteElement(term16712, 1, (byte) 126);
        setField(term16692, term16692.getClass(), "SINGLE", term16712);
        setLongField(term16692, term16692.getClass(), "bytesRead", -8652538484981166496L);
        term16713 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Map");
        Object[] args = new Object[1];
        args[0] = term3340;
        callMethod(klass, "applyPaxHeadersToCurrentEntry", argTypes, term3269, args);
        assertTrue(recursiveEquals(term3269, term16692));
        assertTrue(recursiveEquals(term3340, term16713));
    }

};


