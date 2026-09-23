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

public class TarArchiveInputStream_tryToConsumeSecondEOFRecord_70184422353 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4145;

    public TarArchiveInputStream_tryToConsumeSecondEOFRecord_70184422353() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term18262 = Class.forName((String) "java.io.File$PathStatus");
        Field term18261 = ((Class) term18262).getDeclaredField((String) "INVALID");
        ((Field) term18261).setAccessible(true);
        Object enum50 = ((Field) term18261).get((Object) null);
        term4145 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term4146 = (byte[]) newByteArray(1);
        Object term4153 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term4189 = newInstance(Class.forName("java.io.File"));
        byte[] term4206 = (byte[]) newByteArray(5);
        setByteElement(term4146, 0, (byte) 39);
        setField(term4145, term4145.getClass(), "SMALL_BUF", term4146);
        setIntField(term4145, term4145.getClass(), "recordSize", 107945604);
        setIntField(term4145, term4145.getClass(), "blockSize", -1963464809);
        setBooleanField(term4145, term4145.getClass(), "hasHitEOF", false);
        setLongField(term4145, term4145.getClass(), "entrySize", -8085190702504231560L);
        setLongField(term4145, term4145.getClass(), "entryOffset", 1672578078364590450L);
        setField(term4145, term4145.getClass(), "is", null);
        setField(term4153, term4153.getClass(), "name", "");
        setIntField(term4153, term4153.getClass(), "mode", 71190297);
        setIntField(term4153, term4153.getClass(), "userId", 1202361360);
        setIntField(term4153, term4153.getClass(), "groupId", -2015048153);
        setLongField(term4153, term4153.getClass(), "size", 4949335493504695457L);
        setLongField(term4153, term4153.getClass(), "modTime", -5216789073301458893L);
        setBooleanField(term4153, term4153.getClass(), "checkSumOK", true);
        setByteField(term4153, term4153.getClass(), "linkFlag", (byte) -1);
        setField(term4153, term4153.getClass(), "linkName", "");
        setField(term4153, term4153.getClass(), "magic", "ustar ");
        setField(term4153, term4153.getClass(), "version", "00");
        setField(term4153, term4153.getClass(), "userName", "root");
        setField(term4153, term4153.getClass(), "groupName", "");
        setIntField(term4153, term4153.getClass(), "devMajor", -2063457669);
        setIntField(term4153, term4153.getClass(), "devMinor", -1222006000);
        setBooleanField(term4153, term4153.getClass(), "isExtended", false);
        setLongField(term4153, term4153.getClass(), "realSize", -1832940336320585644L);
        setField(term4189, term4189.getClass(), "path", "IDCWpPLRkE");
        setField(term4189, term4189.getClass(), "status", enum50);
        setIntField(term4189, term4189.getClass(), "prefixLength", 2095798786);
        setField(term4189, term4189.getClass(), "filePath", null);
        setField(term4153, term4153.getClass(), "file", term4189);
        setField(term4145, term4145.getClass(), "currEntry", term4153);
        setField(term4145, term4145.getClass(), "encoding", null);
        setByteElement(term4206, 0, (byte) 117);
        setByteElement(term4206, 1, (byte) 43);
        setByteElement(term4206, 2, (byte) -27);
        setByteElement(term4206, 3, (byte) 34);
        setByteElement(term4206, 4, (byte) -126);
        setField(term4145, term4145.getClass(), "SINGLE", term4206);
        setLongField(term4145, term4145.getClass(), "bytesRead", -8033714905181142681L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "tryToConsumeSecondEOFRecord", argTypes, term4145, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


