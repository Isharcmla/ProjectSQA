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

public class TarArchiveEntry_getDevMinor_868611674118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8608;
     Object term34412;

    public TarArchiveEntry_getDevMinor_868611674118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term34453 = Class.forName((String) "java.io.File$PathStatus");
        Field term34452 = ((Class) term34453).getDeclaredField((String) "CHECKED");
        ((Field) term34452).setAccessible(true);
        Object enum143 = ((Field) term34452).get((Object) null);
        term8608 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term8647 = newInstance(Class.forName("java.io.File"));
        setField(term8608, term8608.getClass(), "name", "");
        setBooleanField(term8608, term8608.getClass(), "preserveLeadingSlashes", false);
        setIntField(term8608, term8608.getClass(), "mode", -1388471422);
        setLongField(term8608, term8608.getClass(), "userId", -8010214112439224349L);
        setLongField(term8608, term8608.getClass(), "groupId", -6673920710396545553L);
        setLongField(term8608, term8608.getClass(), "size", 3412644969878030772L);
        setLongField(term8608, term8608.getClass(), "modTime", 6698455537431331246L);
        setBooleanField(term8608, term8608.getClass(), "checkSumOK", false);
        setByteField(term8608, term8608.getClass(), "linkFlag", (byte) 69);
        setField(term8608, term8608.getClass(), "linkName", "");
        setField(term8608, term8608.getClass(), "magic", "ustar ");
        setField(term8608, term8608.getClass(), "version", "00");
        setField(term8608, term8608.getClass(), "userName", "root");
        setField(term8608, term8608.getClass(), "groupName", "");
        setIntField(term8608, term8608.getClass(), "devMajor", -1498296052);
        setIntField(term8608, term8608.getClass(), "devMinor", 2098647989);
        setBooleanField(term8608, term8608.getClass(), "isExtended", true);
        setLongField(term8608, term8608.getClass(), "realSize", -8327432141027603933L);
        setBooleanField(term8608, term8608.getClass(), "paxGNUSparse", true);
        setBooleanField(term8608, term8608.getClass(), "starSparse", true);
        setField(term8647, term8647.getClass(), "path", "jDtqGUpnZN");
        setField(term8647, term8647.getClass(), "status", enum143);
        setIntField(term8647, term8647.getClass(), "prefixLength", 1598895173);
        setField(term8647, term8647.getClass(), "filePath", null);
        setField(term8608, term8608.getClass(), "file", term8647);
        Class<? extends Object> term34618 = Class.forName((String) "java.io.File$PathStatus");
        Field term34617 = ((Class) term34618).getDeclaredField((String) "CHECKED");
        ((Field) term34617).setAccessible(true);
        Object enum144 = ((Field) term34617).get((Object) null);
        term34412 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term34425 = newInstance(Class.forName("java.io.File"));
        setField(term34412, term34412.getClass(), "name", "");
        setBooleanField(term34412, term34412.getClass(), "preserveLeadingSlashes", false);
        setIntField(term34412, term34412.getClass(), "mode", -1388471422);
        setLongField(term34412, term34412.getClass(), "userId", -8010214112439224349L);
        setLongField(term34412, term34412.getClass(), "groupId", -6673920710396545553L);
        setLongField(term34412, term34412.getClass(), "size", 3412644969878030772L);
        setLongField(term34412, term34412.getClass(), "modTime", 6698455537431331246L);
        setBooleanField(term34412, term34412.getClass(), "checkSumOK", false);
        setByteField(term34412, term34412.getClass(), "linkFlag", (byte) 69);
        setField(term34412, term34412.getClass(), "linkName", "");
        setField(term34412, term34412.getClass(), "magic", "ustar ");
        setField(term34412, term34412.getClass(), "version", "00");
        setField(term34412, term34412.getClass(), "userName", "root");
        setField(term34412, term34412.getClass(), "groupName", "");
        setIntField(term34412, term34412.getClass(), "devMajor", -1498296052);
        setIntField(term34412, term34412.getClass(), "devMinor", 2098647989);
        setBooleanField(term34412, term34412.getClass(), "isExtended", true);
        setLongField(term34412, term34412.getClass(), "realSize", -8327432141027603933L);
        setBooleanField(term34412, term34412.getClass(), "paxGNUSparse", true);
        setBooleanField(term34412, term34412.getClass(), "starSparse", true);
        setField(term34425, term34425.getClass(), "path", "jDtqGUpnZN");
        setField(term34425, term34425.getClass(), "status", enum144);
        setIntField(term34425, term34425.getClass(), "prefixLength", 1598895173);
        setField(term34425, term34425.getClass(), "filePath", null);
        setField(term34412, term34412.getClass(), "file", term34425);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getDevMinor", argTypes, term8608, args);
        assertTrue(recursiveEquals(term8608, term34412));
        assertTrue(recursiveEquals(retValue, 2098647989));
    }

};


