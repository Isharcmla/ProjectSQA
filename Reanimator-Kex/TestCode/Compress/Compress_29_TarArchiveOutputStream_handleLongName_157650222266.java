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
import java.util.LinkedHashMap;
import java.lang.Byte;

public class TarArchiveOutputStream_handleLongName_157650222266 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3039;
     Object term3085;
     Object term3158;
     Object term3233;

    public TarArchiveOutputStream_handleLongName_157650222266() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3039 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term3054 = (byte[]) newByteArray(4);
        byte[] term3060 = (byte[]) newByteArray(6);
        byte[] term3076 = (byte[]) newByteArray(7);
        setLongField(term3039, term3039.getClass(), "currSize", 7247160664318067468L);
        setField(term3039, term3039.getClass(), "currName", "bLPjGVBhlX");
        setLongField(term3039, term3039.getClass(), "currBytes", 2135754395358000892L);
        setByteElement(term3054, 0, (byte) 84);
        setByteElement(term3054, 1, (byte) -70);
        setByteElement(term3054, 2, (byte) 84);
        setByteElement(term3054, 3, (byte) 114);
        setField(term3039, term3039.getClass(), "recordBuf", term3054);
        setIntField(term3039, term3039.getClass(), "assemLen", 1320570890);
        setByteElement(term3060, 0, (byte) 60);
        setByteElement(term3060, 1, (byte) -20);
        setByteElement(term3060, 2, (byte) 100);
        setByteElement(term3060, 3, (byte) -41);
        setByteElement(term3060, 4, (byte) -70);
        setByteElement(term3060, 5, (byte) -5);
        setField(term3039, term3039.getClass(), "assemBuf", term3060);
        setIntField(term3039, term3039.getClass(), "longFileMode", -130649791);
        setIntField(term3039, term3039.getClass(), "bigNumberMode", 534834644);
        setIntField(term3039, term3039.getClass(), "recordsWritten", 1959097203);
        setIntField(term3039, term3039.getClass(), "recordsPerBlock", -209654048);
        setIntField(term3039, term3039.getClass(), "recordSize", 477625804);
        setBooleanField(term3039, term3039.getClass(), "closed", false);
        setBooleanField(term3039, term3039.getClass(), "haveUnclosedEntry", true);
        setBooleanField(term3039, term3039.getClass(), "finished", false);
        setField(term3039, term3039.getClass(), "out", null);
        setField(term3039, term3039.getClass(), "zipEncoding", null);
        setBooleanField(term3039, term3039.getClass(), "addPaxHeadersForNonAsciiNames", false);
        setByteElement(term3076, 0, (byte) 119);
        setByteElement(term3076, 1, (byte) 81);
        setByteElement(term3076, 2, (byte) -28);
        setByteElement(term3076, 3, (byte) -18);
        setByteElement(term3076, 4, (byte) -61);
        setByteElement(term3076, 5, (byte) 70);
        setByteElement(term3076, 6, (byte) 89);
        setField(term3039, term3039.getClass(), "oneByte", term3076);
        setLongField(term3039, term3039.getClass(), "bytesWritten", -8085190702504231560L);
        Class<? extends Object> term61826 = Class.forName((String) "java.io.File$PathStatus");
        Field term61825 = ((Class) term61826).getDeclaredField((String) "CHECKED");
        ((Field) term61825).setAccessible(true);
        Object enum9 = ((Field) term61825).get((Object) null);
        term3085 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term3121 = newInstance(Class.forName("java.io.File"));
        setField(term3085, term3085.getClass(), "name", "");
        setIntField(term3085, term3085.getClass(), "mode", 252575029);
        setIntField(term3085, term3085.getClass(), "userId", 57189932);
        setIntField(term3085, term3085.getClass(), "groupId", 1460722225);
        setLongField(term3085, term3085.getClass(), "size", 1672578078364590450L);
        setLongField(term3085, term3085.getClass(), "modTime", 4949335493504695457L);
        setBooleanField(term3085, term3085.getClass(), "checkSumOK", false);
        setByteField(term3085, term3085.getClass(), "linkFlag", (byte) -99);
        setField(term3085, term3085.getClass(), "linkName", "");
        setField(term3085, term3085.getClass(), "magic", "ustar ");
        setField(term3085, term3085.getClass(), "version", "00");
        setField(term3085, term3085.getClass(), "userName", "root");
        setField(term3085, term3085.getClass(), "groupName", "");
        setIntField(term3085, term3085.getClass(), "devMajor", 1743224434);
        setIntField(term3085, term3085.getClass(), "devMinor", 842904495);
        setBooleanField(term3085, term3085.getClass(), "isExtended", true);
        setLongField(term3085, term3085.getClass(), "realSize", -5216789073301458893L);
        setField(term3121, term3121.getClass(), "path", "whBvTVIIlC");
        setField(term3121, term3121.getClass(), "status", enum9);
        setIntField(term3121, term3121.getClass(), "prefixLength", 1008080511);
        setField(term3121, term3121.getClass(), "filePath", null);
        setField(term3085, term3085.getClass(), "file", term3121);
        term3158 = new LinkedHashMap();
        term3233 = new Byte((byte) 59);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.util.Map");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = byte.class;
        argTypes[5] = Class.forName("java.lang.String");
        Object[] args = new Object[6];
        args[0] = term3085;
        args[1] = "IgRJUzaCwW";
        args[2] = term3158;
        args[3] = "OWKQODBLzb";
        args[4] = term3233;
        args[5] = "wGmYcqUkgE";
        try {
            callMethod(klass, "handleLongName", argTypes, term3039, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


