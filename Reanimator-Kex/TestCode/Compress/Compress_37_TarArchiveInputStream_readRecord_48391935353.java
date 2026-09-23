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

public class TarArchiveInputStream_readRecord_48391935353 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3460;

    public TarArchiveInputStream_readRecord_48391935353() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term19109 = Class.forName((String) "java.io.File$PathStatus");
        Field term19108 = ((Class) term19109).getDeclaredField((String) "INVALID");
        ((Field) term19108).setAccessible(true);
        Object enum51 = ((Field) term19108).get((Object) null);
        HashMap term3541 = new HashMap();
        term3460 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term3461 = (byte[]) newByteArray(6);
        Object term3473 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term3512 = newInstance(Class.forName("java.io.File"));
        byte[] term3551 = (byte[]) newByteArray(2);
        setByteElement(term3461, 0, (byte) 70);
        setByteElement(term3461, 1, (byte) -28);
        setByteElement(term3461, 2, (byte) 115);
        setByteElement(term3461, 3, (byte) 96);
        setByteElement(term3461, 4, (byte) 51);
        setByteElement(term3461, 5, (byte) -53);
        setField(term3460, term3460.getClass(), "SMALL_BUF", term3461);
        setIntField(term3460, term3460.getClass(), "recordSize", -478195677);
        setIntField(term3460, term3460.getClass(), "blockSize", 972867650);
        setBooleanField(term3460, term3460.getClass(), "hasHitEOF", false);
        setLongField(term3460, term3460.getClass(), "entrySize", -8085190702504231560L);
        setLongField(term3460, term3460.getClass(), "entryOffset", 1672578078364590450L);
        setField(term3460, term3460.getClass(), "is", null);
        setField(term3473, term3473.getClass(), "name", "");
        setBooleanField(term3473, term3473.getClass(), "preserveLeadingSlashes", false);
        setIntField(term3473, term3473.getClass(), "mode", 1655935355);
        setLongField(term3473, term3473.getClass(), "userId", 4949335493504695457L);
        setLongField(term3473, term3473.getClass(), "groupId", -5216789073301458893L);
        setLongField(term3473, term3473.getClass(), "size", -1832940336320585644L);
        setLongField(term3473, term3473.getClass(), "modTime", -8033714905181142681L);
        setBooleanField(term3473, term3473.getClass(), "checkSumOK", false);
        setByteField(term3473, term3473.getClass(), "linkFlag", (byte) -8);
        setField(term3473, term3473.getClass(), "linkName", "");
        setField(term3473, term3473.getClass(), "magic", "ustar ");
        setField(term3473, term3473.getClass(), "version", "00");
        setField(term3473, term3473.getClass(), "userName", "root");
        setField(term3473, term3473.getClass(), "groupName", "");
        setIntField(term3473, term3473.getClass(), "devMajor", -481533957);
        setIntField(term3473, term3473.getClass(), "devMinor", 1240914516);
        setBooleanField(term3473, term3473.getClass(), "isExtended", false);
        setLongField(term3473, term3473.getClass(), "realSize", -9040825890007374809L);
        setBooleanField(term3473, term3473.getClass(), "paxGNUSparse", true);
        setBooleanField(term3473, term3473.getClass(), "starSparse", false);
        setField(term3512, term3512.getClass(), "path", "UiUYnPrcCi");
        setField(term3512, term3512.getClass(), "status", enum51);
        setIntField(term3512, term3512.getClass(), "prefixLength", -1465035361);
        setField(term3512, term3512.getClass(), "filePath", null);
        setField(term3473, term3473.getClass(), "file", term3512);
        setField(term3460, term3460.getClass(), "currEntry", term3473);
        setField(term3460, term3460.getClass(), "zipEncoding", null);
        setField(term3460, term3460.getClass(), "encoding", "UoYtihxVaS");
        setField(term3460, term3460.getClass(), "globalPaxHeaders", term3541);
        setByteElement(term3551, 0, (byte) -9);
        setByteElement(term3551, 1, (byte) 97);
        setField(term3460, term3460.getClass(), "SINGLE", term3551);
        setLongField(term3460, term3460.getClass(), "bytesRead", 1368340889161782793L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "readRecord", argTypes, term3460, args);
            assertTrue(false);
        }
        catch (NegativeArraySizeException e) {
        }

    }

};


