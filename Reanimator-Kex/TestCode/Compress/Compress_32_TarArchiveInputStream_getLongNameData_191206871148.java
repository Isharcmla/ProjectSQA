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

public class TarArchiveInputStream_getLongNameData_191206871148 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2486;

    public TarArchiveInputStream_getLongNameData_191206871148() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term15984 = Class.forName((String) "java.io.File$PathStatus");
        Field term15983 = ((Class) term15984).getDeclaredField((String) "INVALID");
        ((Field) term15983).setAccessible(true);
        Object enum42 = ((Field) term15983).get((Object) null);
        term2486 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term2487 = (byte[]) newByteArray(6);
        Object term2499 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term2535 = newInstance(Class.forName("java.io.File"));
        byte[] term2564 = (byte[]) newByteArray(1);
        setByteElement(term2487, 0, (byte) 35);
        setByteElement(term2487, 1, (byte) 66);
        setByteElement(term2487, 2, (byte) 123);
        setByteElement(term2487, 3, (byte) -5);
        setByteElement(term2487, 4, (byte) 84);
        setByteElement(term2487, 5, (byte) -97);
        setField(term2486, term2486.getClass(), "SMALL_BUF", term2487);
        setIntField(term2486, term2486.getClass(), "recordSize", 97029295);
        setIntField(term2486, term2486.getClass(), "blockSize", -1371869594);
        setBooleanField(term2486, term2486.getClass(), "hasHitEOF", false);
        setLongField(term2486, term2486.getClass(), "entrySize", 6682528376118987775L);
        setLongField(term2486, term2486.getClass(), "entryOffset", 682356318767179819L);
        setField(term2486, term2486.getClass(), "is", null);
        setField(term2499, term2499.getClass(), "name", "");
        setIntField(term2499, term2499.getClass(), "mode", -2095575670);
        setLongField(term2499, term2499.getClass(), "userId", -7291743527973326814L);
        setLongField(term2499, term2499.getClass(), "groupId", -5963439350418910964L);
        setLongField(term2499, term2499.getClass(), "size", 9013624480170062917L);
        setLongField(term2499, term2499.getClass(), "modTime", 7862575738391801707L);
        setBooleanField(term2499, term2499.getClass(), "checkSumOK", true);
        setByteField(term2499, term2499.getClass(), "linkFlag", (byte) -24);
        setField(term2499, term2499.getClass(), "linkName", "");
        setField(term2499, term2499.getClass(), "magic", "ustar ");
        setField(term2499, term2499.getClass(), "version", "00");
        setField(term2499, term2499.getClass(), "userName", "root");
        setField(term2499, term2499.getClass(), "groupName", "");
        setIntField(term2499, term2499.getClass(), "devMajor", 1225272962);
        setIntField(term2499, term2499.getClass(), "devMinor", 1324040357);
        setBooleanField(term2499, term2499.getClass(), "isExtended", true);
        setLongField(term2499, term2499.getClass(), "realSize", 50358265865610362L);
        setField(term2535, term2535.getClass(), "path", "RkybSrpybU");
        setField(term2535, term2535.getClass(), "status", enum42);
        setIntField(term2535, term2535.getClass(), "prefixLength", -1588772968);
        setField(term2535, term2535.getClass(), "filePath", null);
        setField(term2499, term2499.getClass(), "file", term2535);
        setField(term2486, term2486.getClass(), "currEntry", term2499);
        setField(term2486, term2486.getClass(), "zipEncoding", null);
        setField(term2486, term2486.getClass(), "encoding", "xOEqzGAmDU");
        setByteElement(term2564, 0, (byte) 88);
        setField(term2486, term2486.getClass(), "SINGLE", term2564);
        setLongField(term2486, term2486.getClass(), "bytesRead", 5510783420697225605L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getLongNameData", argTypes, term2486, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


