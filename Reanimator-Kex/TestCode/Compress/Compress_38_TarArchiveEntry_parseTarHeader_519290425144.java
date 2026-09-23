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
import java.lang.Boolean;

public class TarArchiveEntry_parseTarHeader_519290425144 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14611;
     Object term14675;
     Object term14682;

    public TarArchiveEntry_parseTarHeader_519290425144() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term45513 = Class.forName((String) "java.io.File$PathStatus");
        Field term45512 = ((Class) term45513).getDeclaredField((String) "INVALID");
        ((Field) term45512).setAccessible(true);
        Object enum188 = ((Field) term45512).get((Object) null);
        term14611 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term14650 = newInstance(Class.forName("java.io.File"));
        setField(term14611, term14611.getClass(), "name", "");
        setBooleanField(term14611, term14611.getClass(), "preserveLeadingSlashes", true);
        setIntField(term14611, term14611.getClass(), "mode", 49950830);
        setLongField(term14611, term14611.getClass(), "userId", -1497280900081695731L);
        setLongField(term14611, term14611.getClass(), "groupId", -3602825674339018793L);
        setLongField(term14611, term14611.getClass(), "size", 3086974592680165932L);
        setLongField(term14611, term14611.getClass(), "modTime", -532956263280568707L);
        setBooleanField(term14611, term14611.getClass(), "checkSumOK", false);
        setByteField(term14611, term14611.getClass(), "linkFlag", (byte) 48);
        setField(term14611, term14611.getClass(), "linkName", "");
        setField(term14611, term14611.getClass(), "magic", "ustar ");
        setField(term14611, term14611.getClass(), "version", "00");
        setField(term14611, term14611.getClass(), "userName", "root");
        setField(term14611, term14611.getClass(), "groupName", "");
        setIntField(term14611, term14611.getClass(), "devMajor", -525257914);
        setIntField(term14611, term14611.getClass(), "devMinor", 147209682);
        setBooleanField(term14611, term14611.getClass(), "isExtended", true);
        setLongField(term14611, term14611.getClass(), "realSize", 6073193746616629086L);
        setBooleanField(term14611, term14611.getClass(), "paxGNUSparse", false);
        setBooleanField(term14611, term14611.getClass(), "starSparse", false);
        setField(term14650, term14650.getClass(), "path", "MAcUBcBckh");
        setField(term14650, term14650.getClass(), "status", enum188);
        setIntField(term14650, term14650.getClass(), "prefixLength", 34470066);
        setField(term14650, term14650.getClass(), "filePath", null);
        setField(term14611, term14611.getClass(), "file", term14650);
        term14675 = (byte[]) newByteArray(6);
        setByteElement(term14675, 0, (byte) -46);
        setByteElement(term14675, 1, (byte) -128);
        setByteElement(term14675, 2, (byte) 66);
        setByteElement(term14675, 3, (byte) -112);
        setByteElement(term14675, 4, (byte) 81);
        setByteElement(term14675, 5, (byte) 65);
        term14682 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = Class.forName("org.apache.commons.compress.archivers.zip.ZipEncoding");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term14675;
        args[1] = null;
        args[2] = term14682;
        try {
            callMethod(klass, "parseTarHeader", argTypes, term14611, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


