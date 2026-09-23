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

public class TarArchiveOutputStream_transferModTime_132846657333 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3469;
     Object term3523;
     Object term3584;

    public TarArchiveOutputStream_transferModTime_132846657333() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3469 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term3484 = (byte[]) newByteArray(9);
        byte[] term3495 = (byte[]) newByteArray(7);
        byte[] term3512 = (byte[]) newByteArray(9);
        setLongField(term3469, term3469.getClass(), "currSize", -1832940336320585644L);
        setField(term3469, term3469.getClass(), "currName", "idgaQsnJpQ");
        setLongField(term3469, term3469.getClass(), "currBytes", -8033714905181142681L);
        setByteElement(term3484, 0, (byte) -99);
        setByteElement(term3484, 1, (byte) 61);
        setByteElement(term3484, 2, (byte) 100);
        setByteElement(term3484, 3, (byte) 55);
        setByteElement(term3484, 4, (byte) -111);
        setByteElement(term3484, 5, (byte) -127);
        setByteElement(term3484, 6, (byte) 19);
        setByteElement(term3484, 7, (byte) 83);
        setByteElement(term3484, 8, (byte) -57);
        setField(term3469, term3469.getClass(), "recordBuf", term3484);
        setIntField(term3469, term3469.getClass(), "assemLen", -282881827);
        setByteElement(term3495, 0, (byte) 103);
        setByteElement(term3495, 1, (byte) 40);
        setByteElement(term3495, 2, (byte) -106);
        setByteElement(term3495, 3, (byte) -95);
        setByteElement(term3495, 4, (byte) 69);
        setByteElement(term3495, 5, (byte) 63);
        setByteElement(term3495, 6, (byte) -41);
        setField(term3469, term3469.getClass(), "assemBuf", term3495);
        setIntField(term3469, term3469.getClass(), "longFileMode", -1183353915);
        setIntField(term3469, term3469.getClass(), "bigNumberMode", -420030135);
        setIntField(term3469, term3469.getClass(), "recordsWritten", 267763294);
        setIntField(term3469, term3469.getClass(), "recordsPerBlock", -1497710478);
        setIntField(term3469, term3469.getClass(), "recordSize", 49950830);
        setBooleanField(term3469, term3469.getClass(), "closed", true);
        setBooleanField(term3469, term3469.getClass(), "haveUnclosedEntry", false);
        setBooleanField(term3469, term3469.getClass(), "finished", false);
        setField(term3469, term3469.getClass(), "out", null);
        setField(term3469, term3469.getClass(), "zipEncoding", null);
        setBooleanField(term3469, term3469.getClass(), "addPaxHeadersForNonAsciiNames", false);
        setByteElement(term3512, 0, (byte) -44);
        setByteElement(term3512, 1, (byte) -120);
        setByteElement(term3512, 2, (byte) -55);
        setByteElement(term3512, 3, (byte) 91);
        setByteElement(term3512, 4, (byte) 55);
        setByteElement(term3512, 5, (byte) -5);
        setByteElement(term3512, 6, (byte) -4);
        setByteElement(term3512, 7, (byte) -61);
        setByteElement(term3512, 8, (byte) -34);
        setField(term3469, term3469.getClass(), "oneByte", term3512);
        setLongField(term3469, term3469.getClass(), "bytesWritten", -9040825890007374809L);
        Class<? extends Object> term3692 = Class.forName((String) "java.io.File$PathStatus");
        Field term3691 = ((Class) term3692).getDeclaredField((String) "CHECKED");
        ((Field) term3691).setAccessible(true);
        Object enum5 = ((Field) term3691).get((Object) null);
        term3523 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term3559 = newInstance(Class.forName("java.io.File"));
        setField(term3523, term3523.getClass(), "name", "");
        setIntField(term3523, term3523.getClass(), "mode", -525257914);
        setIntField(term3523, term3523.getClass(), "userId", 147209682);
        setIntField(term3523, term3523.getClass(), "groupId", 34470066);
        setLongField(term3523, term3523.getClass(), "size", 1368340889161782793L);
        setLongField(term3523, term3523.getClass(), "modTime", -5786861555969446503L);
        setBooleanField(term3523, term3523.getClass(), "checkSumOK", false);
        setByteField(term3523, term3523.getClass(), "linkFlag", (byte) 73);
        setField(term3523, term3523.getClass(), "linkName", "");
        setField(term3523, term3523.getClass(), "magic", "ustar ");
        setField(term3523, term3523.getClass(), "version", "00");
        setField(term3523, term3523.getClass(), "userName", "root");
        setField(term3523, term3523.getClass(), "groupName", "");
        setIntField(term3523, term3523.getClass(), "devMajor", 2058711405);
        setIntField(term3523, term3523.getClass(), "devMinor", 1743683601);
        setBooleanField(term3523, term3523.getClass(), "isExtended", false);
        setLongField(term3523, term3523.getClass(), "realSize", 2354625302846375590L);
        setField(term3559, term3559.getClass(), "path", "VgZnGoIFwQ");
        setField(term3559, term3559.getClass(), "status", enum5);
        setIntField(term3559, term3559.getClass(), "prefixLength", -945116798);
        setField(term3559, term3559.getClass(), "filePath", null);
        setField(term3523, term3523.getClass(), "file", term3559);
        term3584 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term3620 = newInstance(Class.forName("java.io.File"));
        setField(term3584, term3584.getClass(), "name", "");
        setIntField(term3584, term3584.getClass(), "mode", 1593461795);
        setIntField(term3584, term3584.getClass(), "userId", 515182546);
        setIntField(term3584, term3584.getClass(), "groupId", -936895502);
        setLongField(term3584, term3584.getClass(), "size", 7276637106827860087L);
        setLongField(term3584, term3584.getClass(), "modTime", -3936701866695933852L);
        setBooleanField(term3584, term3584.getClass(), "checkSumOK", false);
        setByteField(term3584, term3584.getClass(), "linkFlag", (byte) 10);
        setField(term3584, term3584.getClass(), "linkName", "");
        setField(term3584, term3584.getClass(), "magic", "ustar ");
        setField(term3584, term3584.getClass(), "version", "00");
        setField(term3584, term3584.getClass(), "userName", "root");
        setField(term3584, term3584.getClass(), "groupName", "");
        setIntField(term3584, term3584.getClass(), "devMajor", -129547140);
        setIntField(term3584, term3584.getClass(), "devMinor", 199287428);
        setBooleanField(term3584, term3584.getClass(), "isExtended", false);
        setLongField(term3584, term3584.getClass(), "realSize", 1215116475929634177L);
        setField(term3620, term3620.getClass(), "path", "jUbSRrkrYZ");
        setField(term3620, term3620.getClass(), "status", enum5);
        setIntField(term3620, term3620.getClass(), "prefixLength", -1195339592);
        setField(term3620, term3620.getClass(), "filePath", null);
        setField(term3584, term3584.getClass(), "file", term3620);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        argTypes[1] = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Object[] args = new Object[2];
        args[0] = term3523;
        args[1] = term3584;
        callMethod(klass, "transferModTime", argTypes, term3469, args);
    }

};


