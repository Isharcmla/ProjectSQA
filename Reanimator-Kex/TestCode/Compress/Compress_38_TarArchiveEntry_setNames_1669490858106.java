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
import static org.apache.commons.compress.archivers.tar.EqualityUtils.*;
import java.lang.Object;
import java.lang.String;

public class TarArchiveEntry_setNames_1669490858106 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5808;
     Object term29197;

    public TarArchiveEntry_setNames_1669490858106() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term29242 = Class.forName((String) "java.io.File$PathStatus");
        Field term29241 = ((Class) term29242).getDeclaredField((String) "INVALID");
        ((Field) term29241).setAccessible(true);
        Object enum119 = ((Field) term29241).get((Object) null);
        term5808 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term5847 = newInstance(Class.forName("java.io.File"));
        setField(term5808, term5808.getClass(), "name", "");
        setBooleanField(term5808, term5808.getClass(), "preserveLeadingSlashes", false);
        setIntField(term5808, term5808.getClass(), "mode", 1596213415);
        setLongField(term5808, term5808.getClass(), "userId", -900457279156388404L);
        setLongField(term5808, term5808.getClass(), "groupId", 1084801489398441516L);
        setLongField(term5808, term5808.getClass(), "size", 6273754186658578034L);
        setLongField(term5808, term5808.getClass(), "modTime", 3620247240684476031L);
        setBooleanField(term5808, term5808.getClass(), "checkSumOK", false);
        setByteField(term5808, term5808.getClass(), "linkFlag", (byte) -119);
        setField(term5808, term5808.getClass(), "linkName", "");
        setField(term5808, term5808.getClass(), "magic", "ustar ");
        setField(term5808, term5808.getClass(), "version", "00");
        setField(term5808, term5808.getClass(), "userName", "root");
        setField(term5808, term5808.getClass(), "groupName", "");
        setIntField(term5808, term5808.getClass(), "devMajor", -268815336);
        setIntField(term5808, term5808.getClass(), "devMinor", -1210583429);
        setBooleanField(term5808, term5808.getClass(), "isExtended", false);
        setLongField(term5808, term5808.getClass(), "realSize", 8313800941204938919L);
        setBooleanField(term5808, term5808.getClass(), "paxGNUSparse", false);
        setBooleanField(term5808, term5808.getClass(), "starSparse", true);
        setField(term5847, term5847.getClass(), "path", "Ghbwtircqb");
        setField(term5847, term5847.getClass(), "status", enum119);
        setIntField(term5847, term5847.getClass(), "prefixLength", -663691365);
        setField(term5847, term5847.getClass(), "filePath", null);
        setField(term5808, term5808.getClass(), "file", term5847);
        Class<? extends Object> term29443 = Class.forName((String) "java.io.File$PathStatus");
        Field term29442 = ((Class) term29443).getDeclaredField((String) "INVALID");
        ((Field) term29442).setAccessible(true);
        Object enum120 = ((Field) term29442).get((Object) null);
        term29197 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term29210 = newInstance(Class.forName("java.io.File"));
        setField(term29197, term29197.getClass(), "name", "");
        setBooleanField(term29197, term29197.getClass(), "preserveLeadingSlashes", false);
        setIntField(term29197, term29197.getClass(), "mode", 1596213415);
        setLongField(term29197, term29197.getClass(), "userId", -900457279156388404L);
        setLongField(term29197, term29197.getClass(), "groupId", 1084801489398441516L);
        setLongField(term29197, term29197.getClass(), "size", 6273754186658578034L);
        setLongField(term29197, term29197.getClass(), "modTime", 3620247240684476031L);
        setBooleanField(term29197, term29197.getClass(), "checkSumOK", false);
        setByteField(term29197, term29197.getClass(), "linkFlag", (byte) -119);
        setField(term29197, term29197.getClass(), "linkName", "");
        setField(term29197, term29197.getClass(), "magic", "ustar ");
        setField(term29197, term29197.getClass(), "version", "00");
        setField(term29197, term29197.getClass(), "userName", "xrwlQZdwCp");
        setField(term29197, term29197.getClass(), "groupName", "IDCWpPLRkE");
        setIntField(term29197, term29197.getClass(), "devMajor", -268815336);
        setIntField(term29197, term29197.getClass(), "devMinor", -1210583429);
        setBooleanField(term29197, term29197.getClass(), "isExtended", false);
        setLongField(term29197, term29197.getClass(), "realSize", 8313800941204938919L);
        setBooleanField(term29197, term29197.getClass(), "paxGNUSparse", false);
        setBooleanField(term29197, term29197.getClass(), "starSparse", true);
        setField(term29210, term29210.getClass(), "path", "Ghbwtircqb");
        setField(term29210, term29210.getClass(), "status", enum120);
        setIntField(term29210, term29210.getClass(), "prefixLength", -663691365);
        setField(term29210, term29210.getClass(), "filePath", null);
        setField(term29197, term29197.getClass(), "file", term29210);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "xrwlQZdwCp";
        args[1] = "IDCWpPLRkE";
        callMethod(klass, "setNames", argTypes, term5808, args);
        assertTrue(recursiveEquals(term5808, term29197));
    }

};


