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

public class TarArchiveInputStream_parsePaxHeaders_178848202249 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3026;

    public TarArchiveInputStream_parsePaxHeaders_178848202249() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term16469 = Class.forName((String) "java.io.File$PathStatus");
        Field term16468 = ((Class) term16469).getDeclaredField((String) "INVALID");
        ((Field) term16468).setAccessible(true);
        Object enum43 = ((Field) term16468).get((Object) null);
        term3026 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term3027 = (byte[]) newByteArray(6);
        Object term3039 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term3075 = newInstance(Class.forName("java.io.File"));
        byte[] term3092 = (byte[]) newByteArray(2);
        setByteElement(term3027, 0, (byte) 84);
        setByteElement(term3027, 1, (byte) 85);
        setByteElement(term3027, 2, (byte) -17);
        setByteElement(term3027, 3, (byte) -83);
        setByteElement(term3027, 4, (byte) 48);
        setByteElement(term3027, 5, (byte) -128);
        setField(term3026, term3026.getClass(), "SMALL_BUF", term3027);
        setIntField(term3026, term3026.getClass(), "recordSize", 683666002);
        setIntField(term3026, term3026.getClass(), "blockSize", 1596213415);
        setBooleanField(term3026, term3026.getClass(), "hasHitEOF", true);
        setLongField(term3026, term3026.getClass(), "entrySize", 6682528376118987775L);
        setLongField(term3026, term3026.getClass(), "entryOffset", 682356318767179819L);
        setField(term3026, term3026.getClass(), "is", null);
        setField(term3039, term3039.getClass(), "name", "");
        setIntField(term3039, term3039.getClass(), "mode", -268815336);
        setIntField(term3039, term3039.getClass(), "userId", -1210583429);
        setIntField(term3039, term3039.getClass(), "groupId", -663691365);
        setLongField(term3039, term3039.getClass(), "size", -7291743527973326814L);
        setLongField(term3039, term3039.getClass(), "modTime", -5963439350418910964L);
        setBooleanField(term3039, term3039.getClass(), "checkSumOK", true);
        setByteField(term3039, term3039.getClass(), "linkFlag", (byte) 70);
        setField(term3039, term3039.getClass(), "linkName", "");
        setField(term3039, term3039.getClass(), "magic", "ustar ");
        setField(term3039, term3039.getClass(), "version", "00");
        setField(term3039, term3039.getClass(), "userName", "root");
        setField(term3039, term3039.getClass(), "groupName", "");
        setIntField(term3039, term3039.getClass(), "devMajor", 339854490);
        setIntField(term3039, term3039.getClass(), "devMinor", -615654495);
        setBooleanField(term3039, term3039.getClass(), "isExtended", true);
        setLongField(term3039, term3039.getClass(), "realSize", 9013624480170062917L);
        setField(term3075, term3075.getClass(), "path", "aJlieCFVtF");
        setField(term3075, term3075.getClass(), "status", enum43);
        setIntField(term3075, term3075.getClass(), "prefixLength", -1476117762);
        setField(term3075, term3075.getClass(), "filePath", null);
        setField(term3039, term3039.getClass(), "file", term3075);
        setField(term3026, term3026.getClass(), "currEntry", term3039);
        setField(term3026, term3026.getClass(), "encoding", null);
        setByteElement(term3092, 0, (byte) -28);
        setByteElement(term3092, 1, (byte) 115);
        setField(term3026, term3026.getClass(), "SINGLE", term3092);
        setLongField(term3026, term3026.getClass(), "bytesRead", 7862575738391801707L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.InputStream");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "parsePaxHeaders", argTypes, term3026, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


