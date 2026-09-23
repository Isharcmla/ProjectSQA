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
import java.lang.String;
import java.lang.Object;

public class TarArchiveEntry_init_17180408781 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term297;
     Object term17747;
     Object term17768;

    public TarArchiveEntry_init_17180408781() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term17785 = Class.forName((String) "java.io.File$PathStatus");
        Field term17784 = ((Class) term17785).getDeclaredField((String) "INVALID");
        ((Field) term17784).setAccessible(true);
        Object enum70 = ((Field) term17784).get((Object) null);
        term297 = newInstance(Class.forName("java.io.File"));
        setField(term297, term297.getClass(), "path", "EGtDIRbSSb");
        setField(term297, term297.getClass(), "status", enum70);
        setIntField(term297, term297.getClass(), "prefixLength", 1162663216);
        setField(term297, term297.getClass(), "filePath", null);
        Class<? extends Object> term17966 = Class.forName((String) "java.io.File$PathStatus");
        Field term17965 = ((Class) term17966).getDeclaredField((String) "INVALID");
        ((Field) term17965).setAccessible(true);
        Object enum71 = ((Field) term17965).get((Object) null);
        term17747 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term17760 = newInstance(Class.forName("java.io.File"));
        setField(term17747, term17747.getClass(), "name", "SzjVpOQTyS");
        setBooleanField(term17747, term17747.getClass(), "preserveLeadingSlashes", false);
        setIntField(term17747, term17747.getClass(), "mode", 33188);
        setLongField(term17747, term17747.getClass(), "userId", 0L);
        setLongField(term17747, term17747.getClass(), "groupId", 0L);
        setLongField(term17747, term17747.getClass(), "size", 0L);
        setLongField(term17747, term17747.getClass(), "modTime", 0L);
        setBooleanField(term17747, term17747.getClass(), "checkSumOK", false);
        setByteField(term17747, term17747.getClass(), "linkFlag", (byte) 48);
        setField(term17747, term17747.getClass(), "linkName", "");
        setField(term17747, term17747.getClass(), "magic", "ustar ");
        setField(term17747, term17747.getClass(), "version", "00");
        setField(term17747, term17747.getClass(), "userName", "");
        setField(term17747, term17747.getClass(), "groupName", "");
        setIntField(term17747, term17747.getClass(), "devMajor", 0);
        setIntField(term17747, term17747.getClass(), "devMinor", 0);
        setBooleanField(term17747, term17747.getClass(), "isExtended", false);
        setLongField(term17747, term17747.getClass(), "realSize", 0L);
        setBooleanField(term17747, term17747.getClass(), "paxGNUSparse", false);
        setBooleanField(term17747, term17747.getClass(), "starSparse", false);
        setField(term17760, term17760.getClass(), "path", "EGtDIRbSSb");
        setField(term17760, term17760.getClass(), "status", enum71);
        setIntField(term17760, term17760.getClass(), "prefixLength", 1162663216);
        setField(term17760, term17760.getClass(), "filePath", null);
        setField(term17747, term17747.getClass(), "file", term17760);
        Class<? extends Object> term18129 = Class.forName((String) "java.io.File$PathStatus");
        Field term18128 = ((Class) term18129).getDeclaredField((String) "INVALID");
        ((Field) term18128).setAccessible(true);
        Object enum72 = ((Field) term18128).get((Object) null);
        term17768 = newInstance(Class.forName("java.io.File"));
        setField(term17768, term17768.getClass(), "path", "EGtDIRbSSb");
        setField(term17768, term17768.getClass(), "status", enum72);
        setIntField(term17768, term17768.getClass(), "prefixLength", 1162663216);
        setField(term17768, term17768.getClass(), "filePath", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.File");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term297;
        args[1] = "SzjVpOQTyS";
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term17747));
        assertTrue(recursiveEquals(term297, "SzjVpOQTyS"));
    }

};


