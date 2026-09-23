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
import java.util.LinkedHashMap;

public class TarArchiveOutputStream_writePaxHeaders_142187991317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term797;
     Object term839;
     Object term912;

    public TarArchiveOutputStream_writePaxHeaders_142187991317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term797 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term812 = (byte[]) newByteArray(3);
        byte[] term817 = (byte[]) newByteArray(5);
        byte[] term832 = (byte[]) newByteArray(5);
        setLongField(term797, term797.getClass(), "currSize", -6823727938421990489L);
        setField(term797, term797.getClass(), "currName", "oVcInYnLWB");
        setLongField(term797, term797.getClass(), "currBytes", -484994522244390100L);
        setByteElement(term812, 0, (byte) 123);
        setByteElement(term812, 1, (byte) 16);
        setByteElement(term812, 2, (byte) 2);
        setField(term797, term797.getClass(), "recordBuf", term812);
        setIntField(term797, term797.getClass(), "assemLen", -1347665717);
        setByteElement(term817, 0, (byte) -120);
        setByteElement(term817, 1, (byte) 96);
        setByteElement(term817, 2, (byte) -41);
        setByteElement(term817, 3, (byte) -88);
        setByteElement(term817, 4, (byte) 39);
        setField(term797, term797.getClass(), "assemBuf", term817);
        setIntField(term797, term797.getClass(), "longFileMode", -1888585309);
        setIntField(term797, term797.getClass(), "bigNumberMode", 683666002);
        setIntField(term797, term797.getClass(), "recordsWritten", 1596213415);
        setIntField(term797, term797.getClass(), "recordsPerBlock", -268815336);
        setIntField(term797, term797.getClass(), "recordSize", -1210583429);
        setBooleanField(term797, term797.getClass(), "closed", true);
        setBooleanField(term797, term797.getClass(), "haveUnclosedEntry", true);
        setBooleanField(term797, term797.getClass(), "finished", true);
        setField(term797, term797.getClass(), "out", null);
        setField(term797, term797.getClass(), "zipEncoding", null);
        setBooleanField(term797, term797.getClass(), "addPaxHeadersForNonAsciiNames", false);
        setByteElement(term832, 0, (byte) -1);
        setByteElement(term832, 1, (byte) 117);
        setByteElement(term832, 2, (byte) 43);
        setByteElement(term832, 3, (byte) -27);
        setByteElement(term832, 4, (byte) 34);
        setField(term797, term797.getClass(), "oneByte", term832);
        setLongField(term797, term797.getClass(), "bytesWritten", 1233889271256172047L);
        Class<? extends Object> term1045 = Class.forName((String) "java.io.File$PathStatus");
        Field term1044 = ((Class) term1045).getDeclaredField((String) "INVALID");
        ((Field) term1044).setAccessible(true);
        Object enum0 = ((Field) term1044).get((Object) null);
        term839 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term875 = newInstance(Class.forName("java.io.File"));
        setField(term839, term839.getClass(), "name", "");
        setIntField(term839, term839.getClass(), "mode", -663691365);
        setIntField(term839, term839.getClass(), "userId", 339854490);
        setIntField(term839, term839.getClass(), "groupId", -615654495);
        setLongField(term839, term839.getClass(), "size", 6617340557564669657L);
        setLongField(term839, term839.getClass(), "modTime", 1439298019805881866L);
        setBooleanField(term839, term839.getClass(), "checkSumOK", true);
        setByteField(term839, term839.getClass(), "linkFlag", (byte) -126);
        setField(term839, term839.getClass(), "linkName", "");
        setField(term839, term839.getClass(), "magic", "ustar ");
        setField(term839, term839.getClass(), "version", "00");
        setField(term839, term839.getClass(), "userName", "root");
        setField(term839, term839.getClass(), "groupName", "");
        setIntField(term839, term839.getClass(), "devMajor", -1476117762);
        setIntField(term839, term839.getClass(), "devMinor", -341962980);
        setBooleanField(term839, term839.getClass(), "isExtended", false);
        setLongField(term839, term839.getClass(), "realSize", -8708192233349544946L);
        setField(term875, term875.getClass(), "path", "aJlieCFVtF");
        setField(term875, term875.getClass(), "status", enum0);
        setIntField(term875, term875.getClass(), "prefixLength", 1532716628);
        setField(term875, term875.getClass(), "filePath", null);
        setField(term839, term839.getClass(), "file", term875);
        term912 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.util.Map");
        Object[] args = new Object[3];
        args[0] = term839;
        args[1] = "ZiaGIbnzTs";
        args[2] = term912;
        callMethod(klass, "writePaxHeaders", argTypes, term797, args);
    }

};


