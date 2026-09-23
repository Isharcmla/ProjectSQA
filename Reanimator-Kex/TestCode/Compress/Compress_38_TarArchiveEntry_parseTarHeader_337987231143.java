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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.apache.commons.compress.archivers.tar.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class TarArchiveEntry_parseTarHeader_337987231143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14377;
     Object term14441;

    public TarArchiveEntry_parseTarHeader_337987231143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term45058 = Class.forName((String) "java.io.File$PathStatus");
        Field term45057 = ((Class) term45058).getDeclaredField((String) "CHECKED");
        ((Field) term45057).setAccessible(true);
        Object enum187 = ((Field) term45057).get((Object) null);
        term14377 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term14416 = newInstance(Class.forName("java.io.File"));
        setField(term14377, term14377.getClass(), "name", "");
        setBooleanField(term14377, term14377.getClass(), "preserveLeadingSlashes", true);
        setIntField(term14377, term14377.getClass(), "mode", -1183353915);
        setLongField(term14377, term14377.getClass(), "userId", -6609679920238945303L);
        setLongField(term14377, term14377.getClass(), "groupId", -7296330380944173376L);
        setLongField(term14377, term14377.getClass(), "size", -8890284990655172580L);
        setLongField(term14377, term14377.getClass(), "modTime", -5951743062322506095L);
        setBooleanField(term14377, term14377.getClass(), "checkSumOK", true);
        setByteField(term14377, term14377.getClass(), "linkFlag", (byte) 88);
        setField(term14377, term14377.getClass(), "linkName", "");
        setField(term14377, term14377.getClass(), "magic", "ustar ");
        setField(term14377, term14377.getClass(), "version", "00");
        setField(term14377, term14377.getClass(), "userName", "root");
        setField(term14377, term14377.getClass(), "groupName", "");
        setIntField(term14377, term14377.getClass(), "devMajor", -420030135);
        setIntField(term14377, term14377.getClass(), "devMinor", 267763294);
        setBooleanField(term14377, term14377.getClass(), "isExtended", true);
        setLongField(term14377, term14377.getClass(), "realSize", 768144790810175653L);
        setBooleanField(term14377, term14377.getClass(), "paxGNUSparse", true);
        setBooleanField(term14377, term14377.getClass(), "starSparse", false);
        setField(term14416, term14416.getClass(), "path", "HqBOwkVqjD");
        setField(term14416, term14416.getClass(), "status", enum187);
        setIntField(term14416, term14416.getClass(), "prefixLength", -1497710478);
        setField(term14416, term14416.getClass(), "filePath", null);
        setField(term14377, term14377.getClass(), "file", term14416);
        term14441 = (byte[]) newByteArray(2);
        setByteElement(term14441, 0, (byte) 96);
        setByteElement(term14441, 1, (byte) 70);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = Class.forName("org.apache.commons.compress.archivers.zip.ZipEncoding");
        Object[] args = new Object[2];
        args[0] = term14441;
        args[1] = null;
        try {
            callMethod(klass, "parseTarHeader", argTypes, term14377, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


