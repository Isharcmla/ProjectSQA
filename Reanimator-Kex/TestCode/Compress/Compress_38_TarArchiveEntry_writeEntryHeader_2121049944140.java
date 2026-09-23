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
import java.lang.Boolean;

public class TarArchiveEntry_writeEntryHeader_2121049944140 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13655;
     Object term13719;
     Object term13724;

    public TarArchiveEntry_writeEntryHeader_2121049944140() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term43793 = Class.forName((String) "java.io.File$PathStatus");
        Field term43792 = ((Class) term43793).getDeclaredField((String) "INVALID");
        ((Field) term43792).setAccessible(true);
        Object enum185 = ((Field) term43792).get((Object) null);
        term13655 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term13694 = newInstance(Class.forName("java.io.File"));
        setField(term13655, term13655.getClass(), "name", "");
        setBooleanField(term13655, term13655.getClass(), "preserveLeadingSlashes", false);
        setIntField(term13655, term13655.getClass(), "mode", -130649791);
        setLongField(term13655, term13655.getClass(), "userId", -7191625829563442696L);
        setLongField(term13655, term13655.getClass(), "groupId", 1463379874413441830L);
        setLongField(term13655, term13655.getClass(), "size", 7998051124369147543L);
        setLongField(term13655, term13655.getClass(), "modTime", -1481367303699139651L);
        setBooleanField(term13655, term13655.getClass(), "checkSumOK", false);
        setByteField(term13655, term13655.getClass(), "linkFlag", (byte) 45);
        setField(term13655, term13655.getClass(), "linkName", "");
        setField(term13655, term13655.getClass(), "magic", "ustar ");
        setField(term13655, term13655.getClass(), "version", "00");
        setField(term13655, term13655.getClass(), "userName", "root");
        setField(term13655, term13655.getClass(), "groupName", "");
        setIntField(term13655, term13655.getClass(), "devMajor", 534834644);
        setIntField(term13655, term13655.getClass(), "devMinor", 1959097203);
        setBooleanField(term13655, term13655.getClass(), "isExtended", true);
        setLongField(term13655, term13655.getClass(), "realSize", -7709317346333670618L);
        setBooleanField(term13655, term13655.getClass(), "paxGNUSparse", true);
        setBooleanField(term13655, term13655.getClass(), "starSparse", false);
        setField(term13694, term13694.getClass(), "path", "IgRJUzaCwW");
        setField(term13694, term13694.getClass(), "status", enum185);
        setIntField(term13694, term13694.getClass(), "prefixLength", -209654048);
        setField(term13694, term13694.getClass(), "filePath", null);
        setField(term13655, term13655.getClass(), "file", term13694);
        term13719 = (byte[]) newByteArray(4);
        setByteElement(term13719, 0, (byte) -39);
        setByteElement(term13719, 1, (byte) -20);
        setByteElement(term13719, 2, (byte) 10);
        setByteElement(term13719, 3, (byte) 77);
        term13724 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = Class.forName("org.apache.commons.compress.archivers.zip.ZipEncoding");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term13719;
        args[1] = null;
        args[2] = term13724;
        try {
            callMethod(klass, "writeEntryHeader", argTypes, term13655, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


