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

public class TarArchiveInputStream_tryToConsumeSecondEOFRecord_70184422357 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4589;

    public TarArchiveInputStream_tryToConsumeSecondEOFRecord_70184422357() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term19770 = Class.forName((String) "java.io.File$PathStatus");
        Field term19769 = ((Class) term19770).getDeclaredField((String) "CHECKED");
        ((Field) term19769).setAccessible(true);
        Object enum53 = ((Field) term19769).get((Object) null);
        term4589 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term4590 = (byte[]) newByteArray(7);
        Object term4603 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term4639 = newInstance(Class.forName("java.io.File"));
        byte[] term4656 = (byte[]) newByteArray(2);
        setByteElement(term4590, 0, (byte) -73);
        setByteElement(term4590, 1, (byte) 1);
        setByteElement(term4590, 2, (byte) 99);
        setByteElement(term4590, 3, (byte) -121);
        setByteElement(term4590, 4, (byte) -50);
        setByteElement(term4590, 5, (byte) -79);
        setByteElement(term4590, 6, (byte) 110);
        setField(term4589, term4589.getClass(), "SMALL_BUF", term4590);
        setIntField(term4589, term4589.getClass(), "recordSize", 98922530);
        setIntField(term4589, term4589.getClass(), "blockSize", -1388471422);
        setBooleanField(term4589, term4589.getClass(), "hasHitEOF", true);
        setLongField(term4589, term4589.getClass(), "entrySize", 1215116475929634177L);
        setLongField(term4589, term4589.getClass(), "entryOffset", 1597484336218508869L);
        setField(term4589, term4589.getClass(), "is", null);
        setField(term4603, term4603.getClass(), "name", "");
        setIntField(term4603, term4603.getClass(), "mode", -1498296052);
        setIntField(term4603, term4603.getClass(), "userId", 2098647989);
        setIntField(term4603, term4603.getClass(), "groupId", 1598895173);
        setLongField(term4603, term4603.getClass(), "size", -685023850445639859L);
        setLongField(term4603, term4603.getClass(), "modTime", -6950146046121430355L);
        setBooleanField(term4603, term4603.getClass(), "checkSumOK", false);
        setByteField(term4603, term4603.getClass(), "linkFlag", (byte) -111);
        setField(term4603, term4603.getClass(), "linkName", "");
        setField(term4603, term4603.getClass(), "magic", "ustar ");
        setField(term4603, term4603.getClass(), "version", "00");
        setField(term4603, term4603.getClass(), "userName", "root");
        setField(term4603, term4603.getClass(), "groupName", "");
        setIntField(term4603, term4603.getClass(), "devMajor", 1830648570);
        setIntField(term4603, term4603.getClass(), "devMinor", -227365013);
        setBooleanField(term4603, term4603.getClass(), "isExtended", false);
        setLongField(term4603, term4603.getClass(), "realSize", 1667122142089513324L);
        setField(term4639, term4639.getClass(), "path", "dWRymuLBtr");
        setField(term4639, term4639.getClass(), "status", enum53);
        setIntField(term4639, term4639.getClass(), "prefixLength", 11724947);
        setField(term4639, term4639.getClass(), "filePath", null);
        setField(term4603, term4603.getClass(), "file", term4639);
        setField(term4589, term4589.getClass(), "currEntry", term4603);
        setField(term4589, term4589.getClass(), "zipEncoding", null);
        setByteElement(term4656, 0, (byte) -54);
        setByteElement(term4656, 1, (byte) -25);
        setField(term4589, term4589.getClass(), "SINGLE", term4656);
        setLongField(term4589, term4589.getClass(), "bytesRead", -6342139649364011743L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "tryToConsumeSecondEOFRecord", argTypes, term4589, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


