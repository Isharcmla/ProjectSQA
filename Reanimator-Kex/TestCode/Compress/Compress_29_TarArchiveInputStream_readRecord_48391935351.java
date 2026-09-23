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

public class TarArchiveInputStream_readRecord_48391935351 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3040;

    public TarArchiveInputStream_readRecord_48391935351() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term17082 = Class.forName((String) "java.io.File$PathStatus");
        Field term17081 = ((Class) term17082).getDeclaredField((String) "INVALID");
        ((Field) term17081).setAccessible(true);
        Object enum47 = ((Field) term17081).get((Object) null);
        term3040 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term3041 = (byte[]) newByteArray(6);
        Object term3053 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term3089 = newInstance(Class.forName("java.io.File"));
        byte[] term3106 = (byte[]) newByteArray(2);
        setByteElement(term3041, 0, (byte) 70);
        setByteElement(term3041, 1, (byte) -28);
        setByteElement(term3041, 2, (byte) 115);
        setByteElement(term3041, 3, (byte) 96);
        setByteElement(term3041, 4, (byte) 51);
        setByteElement(term3041, 5, (byte) -53);
        setField(term3040, term3040.getClass(), "SMALL_BUF", term3041);
        setIntField(term3040, term3040.getClass(), "recordSize", 1596213415);
        setIntField(term3040, term3040.getClass(), "blockSize", -268815336);
        setBooleanField(term3040, term3040.getClass(), "hasHitEOF", true);
        setLongField(term3040, term3040.getClass(), "entrySize", 6682528376118987775L);
        setLongField(term3040, term3040.getClass(), "entryOffset", 682356318767179819L);
        setField(term3040, term3040.getClass(), "is", null);
        setField(term3053, term3053.getClass(), "name", "");
        setIntField(term3053, term3053.getClass(), "mode", -1210583429);
        setIntField(term3053, term3053.getClass(), "userId", -663691365);
        setIntField(term3053, term3053.getClass(), "groupId", 339854490);
        setLongField(term3053, term3053.getClass(), "size", -7291743527973326814L);
        setLongField(term3053, term3053.getClass(), "modTime", -5963439350418910964L);
        setBooleanField(term3053, term3053.getClass(), "checkSumOK", true);
        setByteField(term3053, term3053.getClass(), "linkFlag", (byte) -8);
        setField(term3053, term3053.getClass(), "linkName", "");
        setField(term3053, term3053.getClass(), "magic", "ustar ");
        setField(term3053, term3053.getClass(), "version", "00");
        setField(term3053, term3053.getClass(), "userName", "root");
        setField(term3053, term3053.getClass(), "groupName", "");
        setIntField(term3053, term3053.getClass(), "devMajor", -615654495);
        setIntField(term3053, term3053.getClass(), "devMinor", -1476117762);
        setBooleanField(term3053, term3053.getClass(), "isExtended", true);
        setLongField(term3053, term3053.getClass(), "realSize", 9013624480170062917L);
        setField(term3089, term3089.getClass(), "path", "aJlieCFVtF");
        setField(term3089, term3089.getClass(), "status", enum47);
        setIntField(term3089, term3089.getClass(), "prefixLength", -341962980);
        setField(term3089, term3089.getClass(), "filePath", null);
        setField(term3053, term3053.getClass(), "file", term3089);
        setField(term3040, term3040.getClass(), "currEntry", term3053);
        setField(term3040, term3040.getClass(), "zipEncoding", null);
        setByteElement(term3106, 0, (byte) -9);
        setByteElement(term3106, 1, (byte) 97);
        setField(term3040, term3040.getClass(), "SINGLE", term3106);
        setLongField(term3040, term3040.getClass(), "bytesRead", 7862575738391801707L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "readRecord", argTypes, term3040, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


