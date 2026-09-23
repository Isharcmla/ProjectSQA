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

public class TarArchiveEntry_getSize_1658533913114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7688;
     Object term32714;

    public TarArchiveEntry_getSize_1658533913114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term32755 = Class.forName((String) "java.io.File$PathStatus");
        Field term32754 = ((Class) term32755).getDeclaredField((String) "INVALID");
        ((Field) term32754).setAccessible(true);
        Object enum136 = ((Field) term32754).get((Object) null);
        term7688 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term7727 = newInstance(Class.forName("java.io.File"));
        setField(term7688, term7688.getClass(), "name", "");
        setBooleanField(term7688, term7688.getClass(), "preserveLeadingSlashes", false);
        setIntField(term7688, term7688.getClass(), "mode", -1963464809);
        setLongField(term7688, term7688.getClass(), "userId", -7291742736502427077L);
        setLongField(term7688, term7688.getClass(), "groupId", -8121849829073967555L);
        setLongField(term7688, term7688.getClass(), "size", 5219030281405653303L);
        setLongField(term7688, term7688.getClass(), "modTime", -8471550651709805183L);
        setBooleanField(term7688, term7688.getClass(), "checkSumOK", false);
        setByteField(term7688, term7688.getClass(), "linkFlag", (byte) -61);
        setField(term7688, term7688.getClass(), "linkName", "");
        setField(term7688, term7688.getClass(), "magic", "ustar ");
        setField(term7688, term7688.getClass(), "version", "00");
        setField(term7688, term7688.getClass(), "userName", "root");
        setField(term7688, term7688.getClass(), "groupName", "");
        setIntField(term7688, term7688.getClass(), "devMajor", 71190297);
        setIntField(term7688, term7688.getClass(), "devMinor", 1202361360);
        setBooleanField(term7688, term7688.getClass(), "isExtended", true);
        setLongField(term7688, term7688.getClass(), "realSize", -948292411727204525L);
        setBooleanField(term7688, term7688.getClass(), "paxGNUSparse", true);
        setBooleanField(term7688, term7688.getClass(), "starSparse", false);
        setField(term7727, term7727.getClass(), "path", "GzFkzHGYFt");
        setField(term7727, term7727.getClass(), "status", enum136);
        setIntField(term7727, term7727.getClass(), "prefixLength", -2015048153);
        setField(term7727, term7727.getClass(), "filePath", null);
        setField(term7688, term7688.getClass(), "file", term7727);
        Class<? extends Object> term32920 = Class.forName((String) "java.io.File$PathStatus");
        Field term32919 = ((Class) term32920).getDeclaredField((String) "INVALID");
        ((Field) term32919).setAccessible(true);
        Object enum137 = ((Field) term32919).get((Object) null);
        term32714 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term32727 = newInstance(Class.forName("java.io.File"));
        setField(term32714, term32714.getClass(), "name", "");
        setBooleanField(term32714, term32714.getClass(), "preserveLeadingSlashes", false);
        setIntField(term32714, term32714.getClass(), "mode", -1963464809);
        setLongField(term32714, term32714.getClass(), "userId", -7291742736502427077L);
        setLongField(term32714, term32714.getClass(), "groupId", -8121849829073967555L);
        setLongField(term32714, term32714.getClass(), "size", 5219030281405653303L);
        setLongField(term32714, term32714.getClass(), "modTime", -8471550651709805183L);
        setBooleanField(term32714, term32714.getClass(), "checkSumOK", false);
        setByteField(term32714, term32714.getClass(), "linkFlag", (byte) -61);
        setField(term32714, term32714.getClass(), "linkName", "");
        setField(term32714, term32714.getClass(), "magic", "ustar ");
        setField(term32714, term32714.getClass(), "version", "00");
        setField(term32714, term32714.getClass(), "userName", "root");
        setField(term32714, term32714.getClass(), "groupName", "");
        setIntField(term32714, term32714.getClass(), "devMajor", 71190297);
        setIntField(term32714, term32714.getClass(), "devMinor", 1202361360);
        setBooleanField(term32714, term32714.getClass(), "isExtended", true);
        setLongField(term32714, term32714.getClass(), "realSize", -948292411727204525L);
        setBooleanField(term32714, term32714.getClass(), "paxGNUSparse", true);
        setBooleanField(term32714, term32714.getClass(), "starSparse", false);
        setField(term32727, term32727.getClass(), "path", "GzFkzHGYFt");
        setField(term32727, term32727.getClass(), "status", enum137);
        setIntField(term32727, term32727.getClass(), "prefixLength", -2015048153);
        setField(term32727, term32727.getClass(), "filePath", null);
        setField(term32714, term32714.getClass(), "file", term32727);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getSize", argTypes, term7688, args);
        assertTrue(recursiveEquals(term7688, term32714));
        assertTrue(recursiveEquals(retValue, 5219030281405653303L));
    }

};


