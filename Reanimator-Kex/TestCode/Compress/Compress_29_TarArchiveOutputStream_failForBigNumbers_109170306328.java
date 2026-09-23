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

public class TarArchiveOutputStream_failForBigNumbers_109170306328 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2467;
     Object term2508;

    public TarArchiveOutputStream_failForBigNumbers_109170306328() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2467 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term2482 = (byte[]) newByteArray(6);
        byte[] term2490 = (byte[]) newByteArray(5);
        byte[] term2505 = (byte[]) newByteArray(1);
        setLongField(term2467, term2467.getClass(), "currSize", 682356318767179819L);
        setField(term2467, term2467.getClass(), "currName", "ieCtQFdkii");
        setLongField(term2467, term2467.getClass(), "currBytes", -7291743527973326814L);
        setByteElement(term2482, 0, (byte) 109);
        setByteElement(term2482, 1, (byte) 17);
        setByteElement(term2482, 2, (byte) -126);
        setByteElement(term2482, 3, (byte) 35);
        setByteElement(term2482, 4, (byte) -46);
        setByteElement(term2482, 5, (byte) -14);
        setField(term2467, term2467.getClass(), "recordBuf", term2482);
        setIntField(term2467, term2467.getClass(), "assemLen", -426764678);
        setByteElement(term2490, 0, (byte) 124);
        setByteElement(term2490, 1, (byte) -124);
        setByteElement(term2490, 2, (byte) -72);
        setByteElement(term2490, 3, (byte) 90);
        setByteElement(term2490, 4, (byte) -34);
        setField(term2467, term2467.getClass(), "assemBuf", term2490);
        setIntField(term2467, term2467.getClass(), "longFileMode", -1222614956);
        setIntField(term2467, term2467.getClass(), "bigNumberMode", -1870495012);
        setIntField(term2467, term2467.getClass(), "recordsWritten", -1310015129);
        setIntField(term2467, term2467.getClass(), "recordsPerBlock", -2104981311);
        setIntField(term2467, term2467.getClass(), "recordSize", -571169753);
        setBooleanField(term2467, term2467.getClass(), "closed", true);
        setBooleanField(term2467, term2467.getClass(), "haveUnclosedEntry", false);
        setBooleanField(term2467, term2467.getClass(), "finished", false);
        setField(term2467, term2467.getClass(), "out", null);
        setField(term2467, term2467.getClass(), "zipEncoding", null);
        setBooleanField(term2467, term2467.getClass(), "addPaxHeadersForNonAsciiNames", true);
        setByteElement(term2505, 0, (byte) -2);
        setField(term2467, term2467.getClass(), "oneByte", term2505);
        setLongField(term2467, term2467.getClass(), "bytesWritten", -5963439350418910964L);
        Class<? extends Object> term2614 = Class.forName((String) "java.io.File$PathStatus");
        Field term2613 = ((Class) term2614).getDeclaredField((String) "INVALID");
        ((Field) term2613).setAccessible(true);
        Object enum3 = ((Field) term2613).get((Object) null);
        term2508 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term2544 = newInstance(Class.forName("java.io.File"));
        setField(term2508, term2508.getClass(), "name", "");
        setIntField(term2508, term2508.getClass(), "mode", 318591690);
        setIntField(term2508, term2508.getClass(), "userId", -165587447);
        setIntField(term2508, term2508.getClass(), "groupId", -1347358701);
        setLongField(term2508, term2508.getClass(), "size", 9013624480170062917L);
        setLongField(term2508, term2508.getClass(), "modTime", 7862575738391801707L);
        setBooleanField(term2508, term2508.getClass(), "checkSumOK", true);
        setByteField(term2508, term2508.getClass(), "linkFlag", (byte) 96);
        setField(term2508, term2508.getClass(), "linkName", "");
        setField(term2508, term2508.getClass(), "magic", "ustar ");
        setField(term2508, term2508.getClass(), "version", "00");
        setField(term2508, term2508.getClass(), "userName", "root");
        setField(term2508, term2508.getClass(), "groupName", "");
        setIntField(term2508, term2508.getClass(), "devMajor", 806595993);
        setIntField(term2508, term2508.getClass(), "devMinor", 548228925);
        setBooleanField(term2508, term2508.getClass(), "isExtended", true);
        setLongField(term2508, term2508.getClass(), "realSize", 50358265865610362L);
        setField(term2544, term2544.getClass(), "path", "dEnhdmILtU");
        setField(term2544, term2544.getClass(), "status", enum3);
        setIntField(term2544, term2544.getClass(), "prefixLength", -749861210);
        setField(term2544, term2544.getClass(), "filePath", null);
        setField(term2508, term2508.getClass(), "file", term2544);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Object[] args = new Object[1];
        args[0] = term2508;
        callMethod(klass, "failForBigNumbers", argTypes, term2467, args);
    }

};


