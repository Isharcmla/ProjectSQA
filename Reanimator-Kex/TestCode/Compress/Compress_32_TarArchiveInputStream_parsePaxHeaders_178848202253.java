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

public class TarArchiveInputStream_parsePaxHeaders_178848202253 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3836;

    public TarArchiveInputStream_parsePaxHeaders_178848202253() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term19028 = Class.forName((String) "java.io.File$PathStatus");
        Field term19027 = ((Class) term19028).getDeclaredField((String) "INVALID");
        ((Field) term19027).setAccessible(true);
        Object enum48 = ((Field) term19027).get((Object) null);
        term3836 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term3837 = (byte[]) newByteArray(5);
        Object term3848 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term3884 = newInstance(Class.forName("java.io.File"));
        byte[] term3913 = (byte[]) newByteArray(1);
        setByteElement(term3837, 0, (byte) 25);
        setByteElement(term3837, 1, (byte) 16);
        setByteElement(term3837, 2, (byte) 39);
        setByteElement(term3837, 3, (byte) 123);
        setByteElement(term3837, 4, (byte) 16);
        setField(term3836, term3836.getClass(), "SMALL_BUF", term3837);
        setIntField(term3836, term3836.getClass(), "recordSize", -1845499264);
        setIntField(term3836, term3836.getClass(), "blockSize", -505439934);
        setBooleanField(term3836, term3836.getClass(), "hasHitEOF", true);
        setLongField(term3836, term3836.getClass(), "entrySize", 1667122142089513324L);
        setLongField(term3836, term3836.getClass(), "entryOffset", -6342139649364011743L);
        setField(term3836, term3836.getClass(), "is", null);
        setField(term3848, term3848.getClass(), "name", "");
        setIntField(term3848, term3848.getClass(), "mode", -344842608);
        setLongField(term3848, term3848.getClass(), "userId", -4924950707540628022L);
        setLongField(term3848, term3848.getClass(), "groupId", -4393710401270724527L);
        setLongField(term3848, term3848.getClass(), "size", -4822736661741380518L);
        setLongField(term3848, term3848.getClass(), "modTime", -5386201758403679145L);
        setBooleanField(term3848, term3848.getClass(), "checkSumOK", true);
        setByteField(term3848, term3848.getClass(), "linkFlag", (byte) 2);
        setField(term3848, term3848.getClass(), "linkName", "");
        setField(term3848, term3848.getClass(), "magic", "ustar ");
        setField(term3848, term3848.getClass(), "version", "00");
        setField(term3848, term3848.getClass(), "userName", "root");
        setField(term3848, term3848.getClass(), "groupName", "");
        setIntField(term3848, term3848.getClass(), "devMajor", 941650513);
        setIntField(term3848, term3848.getClass(), "devMinor", 444029505);
        setBooleanField(term3848, term3848.getClass(), "isExtended", false);
        setLongField(term3848, term3848.getClass(), "realSize", -7268507582722666254L);
        setField(term3884, term3884.getClass(), "path", "dWRymuLBtr");
        setField(term3884, term3884.getClass(), "status", enum48);
        setIntField(term3884, term3884.getClass(), "prefixLength", -1034506028);
        setField(term3884, term3884.getClass(), "filePath", null);
        setField(term3848, term3848.getClass(), "file", term3884);
        setField(term3836, term3836.getClass(), "currEntry", term3848);
        setField(term3836, term3836.getClass(), "zipEncoding", null);
        setField(term3836, term3836.getClass(), "encoding", "AijpHYOFuy");
        setByteElement(term3913, 0, (byte) -120);
        setField(term3836, term3836.getClass(), "SINGLE", term3913);
        setLongField(term3836, term3836.getClass(), "bytesRead", 5671808784468963649L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.InputStream");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "parsePaxHeaders", argTypes, term3836, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


