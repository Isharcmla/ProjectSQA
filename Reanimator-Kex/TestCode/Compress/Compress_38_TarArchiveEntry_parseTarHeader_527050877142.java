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

public class TarArchiveEntry_parseTarHeader_527050877142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14135;
     Object term14199;

    public TarArchiveEntry_parseTarHeader_527050877142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term44599 = Class.forName((String) "java.io.File$PathStatus");
        Field term44598 = ((Class) term44599).getDeclaredField((String) "CHECKED");
        ((Field) term44598).setAccessible(true);
        Object enum186 = ((Field) term44598).get((Object) null);
        term14135 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term14174 = newInstance(Class.forName("java.io.File"));
        setField(term14135, term14135.getClass(), "name", "");
        setBooleanField(term14135, term14135.getClass(), "preserveLeadingSlashes", false);
        setIntField(term14135, term14135.getClass(), "mode", 1008080511);
        setLongField(term14135, term14135.getClass(), "userId", -3130003589475815807L);
        setLongField(term14135, term14135.getClass(), "groupId", -5344598381371854750L);
        setLongField(term14135, term14135.getClass(), "size", -3718250311794019732L);
        setLongField(term14135, term14135.getClass(), "modTime", -5935517391653614345L);
        setBooleanField(term14135, term14135.getClass(), "checkSumOK", true);
        setByteField(term14135, term14135.getClass(), "linkFlag", (byte) 35);
        setField(term14135, term14135.getClass(), "linkName", "");
        setField(term14135, term14135.getClass(), "magic", "ustar ");
        setField(term14135, term14135.getClass(), "version", "00");
        setField(term14135, term14135.getClass(), "userName", "root");
        setField(term14135, term14135.getClass(), "groupName", "");
        setIntField(term14135, term14135.getClass(), "devMajor", 1935707624);
        setIntField(term14135, term14135.getClass(), "devMinor", 1507074215);
        setBooleanField(term14135, term14135.getClass(), "isExtended", false);
        setLongField(term14135, term14135.getClass(), "realSize", -6521561238735301071L);
        setBooleanField(term14135, term14135.getClass(), "paxGNUSparse", false);
        setBooleanField(term14135, term14135.getClass(), "starSparse", true);
        setField(term14174, term14174.getClass(), "path", "KoyGrUJeJW");
        setField(term14174, term14174.getClass(), "status", enum186);
        setIntField(term14174, term14174.getClass(), "prefixLength", -282881827);
        setField(term14174, term14174.getClass(), "filePath", null);
        setField(term14135, term14135.getClass(), "file", term14174);
        term14199 = (byte[]) newByteArray(6);
        setByteElement(term14199, 0, (byte) 66);
        setByteElement(term14199, 1, (byte) 123);
        setByteElement(term14199, 2, (byte) -5);
        setByteElement(term14199, 3, (byte) 84);
        setByteElement(term14199, 4, (byte) -97);
        setByteElement(term14199, 5, (byte) -24);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term14199;
        try {
            callMethod(klass, "parseTarHeader", argTypes, term14135, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


