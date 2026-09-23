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
import java.lang.Object;
import java.lang.String;

public class TarArchiveInputStream_paxHeaders_51667172319 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3283;

    public TarArchiveInputStream_paxHeaders_51667172319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3384 = Class.forName((String) "java.io.File$PathStatus");
        Field term3383 = ((Class) term3384).getDeclaredField((String) "INVALID");
        ((Field) term3383).setAccessible(true);
        Object enum13 = ((Field) term3383).get((Object) null);
        term3283 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term3284 = (byte[]) newByteArray(7);
        Object term3297 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term3333 = newInstance(Class.forName("java.io.File"));
        byte[] term3350 = (byte[]) newByteArray(2);
        setByteElement(term3284, 0, (byte) -46);
        setByteElement(term3284, 1, (byte) 14);
        setByteElement(term3284, 2, (byte) 34);
        setByteElement(term3284, 3, (byte) 126);
        setByteElement(term3284, 4, (byte) 7);
        setByteElement(term3284, 5, (byte) -96);
        setByteElement(term3284, 6, (byte) -22);
        setField(term3283, term3283.getClass(), "SMALL_BUF", term3284);
        setIntField(term3283, term3283.getClass(), "recordSize", 1532716628);
        setIntField(term3283, term3283.getClass(), "blockSize", -1801760683);
        setBooleanField(term3283, term3283.getClass(), "hasHitEOF", false);
        setLongField(term3283, term3283.getClass(), "entrySize", 50358265865610362L);
        setLongField(term3283, term3283.getClass(), "entryOffset", 5510783420697225605L);
        setField(term3283, term3283.getClass(), "is", null);
        setField(term3297, term3297.getClass(), "name", "");
        setIntField(term3297, term3297.getClass(), "mode", 1141317871);
        setIntField(term3297, term3297.getClass(), "userId", 890669485);
        setIntField(term3297, term3297.getClass(), "groupId", 691577392);
        setLongField(term3297, term3297.getClass(), "size", 6005241913654469005L);
        setLongField(term3297, term3297.getClass(), "modTime", -1983291584002806658L);
        setBooleanField(term3297, term3297.getClass(), "checkSumOK", false);
        setByteField(term3297, term3297.getClass(), "linkFlag", (byte) -5);
        setField(term3297, term3297.getClass(), "linkName", "");
        setField(term3297, term3297.getClass(), "magic", "ustar ");
        setField(term3297, term3297.getClass(), "version", "00");
        setField(term3297, term3297.getClass(), "userName", "root");
        setField(term3297, term3297.getClass(), "groupName", "");
        setIntField(term3297, term3297.getClass(), "devMajor", -893623680);
        setIntField(term3297, term3297.getClass(), "devMinor", -1963434938);
        setBooleanField(term3297, term3297.getClass(), "isExtended", false);
        setLongField(term3297, term3297.getClass(), "realSize", 5946780097489996391L);
        setField(term3333, term3333.getClass(), "path", "ZiaGIbnzTs");
        setField(term3333, term3333.getClass(), "status", enum13);
        setIntField(term3333, term3333.getClass(), "prefixLength", 906181092);
        setField(term3333, term3333.getClass(), "filePath", null);
        setField(term3297, term3297.getClass(), "file", term3333);
        setField(term3283, term3283.getClass(), "currEntry", term3297);
        setField(term3283, term3283.getClass(), "zipEncoding", null);
        setByteElement(term3350, 0, (byte) -124);
        setByteElement(term3350, 1, (byte) -105);
        setField(term3283, term3283.getClass(), "SINGLE", term3350);
        setLongField(term3283, term3283.getClass(), "bytesRead", -8652538484981166496L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "paxHeaders", argTypes, term3283, args);
    }

};


