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

public class TarArchiveEntry_setName_212226727889 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1813;
     Object term21942;

    public TarArchiveEntry_setName_212226727889() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term21985 = Class.forName((String) "java.io.File$PathStatus");
        Field term21984 = ((Class) term21985).getDeclaredField((String) "CHECKED");
        ((Field) term21984).setAccessible(true);
        Object enum85 = ((Field) term21984).get((Object) null);
        term1813 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term1852 = newInstance(Class.forName("java.io.File"));
        setField(term1813, term1813.getClass(), "name", "");
        setBooleanField(term1813, term1813.getClass(), "preserveLeadingSlashes", true);
        setIntField(term1813, term1813.getClass(), "mode", -203030934);
        setLongField(term1813, term1813.getClass(), "userId", 1233889271256172047L);
        setLongField(term1813, term1813.getClass(), "groupId", 6617340557564669657L);
        setLongField(term1813, term1813.getClass(), "size", 1439298019805881866L);
        setLongField(term1813, term1813.getClass(), "modTime", -8708192233349544946L);
        setBooleanField(term1813, term1813.getClass(), "checkSumOK", true);
        setByteField(term1813, term1813.getClass(), "linkFlag", (byte) 78);
        setField(term1813, term1813.getClass(), "linkName", "");
        setField(term1813, term1813.getClass(), "magic", "ustar ");
        setField(term1813, term1813.getClass(), "version", "00");
        setField(term1813, term1813.getClass(), "userName", "root");
        setField(term1813, term1813.getClass(), "groupName", "");
        setIntField(term1813, term1813.getClass(), "devMajor", -1179120542);
        setIntField(term1813, term1813.getClass(), "devMinor", -73683645);
        setBooleanField(term1813, term1813.getClass(), "isExtended", false);
        setLongField(term1813, term1813.getClass(), "realSize", 5907001541142728739L);
        setBooleanField(term1813, term1813.getClass(), "paxGNUSparse", false);
        setBooleanField(term1813, term1813.getClass(), "starSparse", false);
        setField(term1852, term1852.getClass(), "path", "oVcInYnLWB");
        setField(term1852, term1852.getClass(), "status", enum85);
        setIntField(term1852, term1852.getClass(), "prefixLength", -226514366);
        setField(term1852, term1852.getClass(), "filePath", null);
        setField(term1813, term1813.getClass(), "file", term1852);
        Class<? extends Object> term22170 = Class.forName((String) "java.io.File$PathStatus");
        Field term22169 = ((Class) term22170).getDeclaredField((String) "CHECKED");
        ((Field) term22169).setAccessible(true);
        Object enum86 = ((Field) term22169).get((Object) null);
        term21942 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term21955 = newInstance(Class.forName("java.io.File"));
        setField(term21942, term21942.getClass(), "name", "aJlieCFVtF");
        setBooleanField(term21942, term21942.getClass(), "preserveLeadingSlashes", true);
        setIntField(term21942, term21942.getClass(), "mode", -203030934);
        setLongField(term21942, term21942.getClass(), "userId", 1233889271256172047L);
        setLongField(term21942, term21942.getClass(), "groupId", 6617340557564669657L);
        setLongField(term21942, term21942.getClass(), "size", 1439298019805881866L);
        setLongField(term21942, term21942.getClass(), "modTime", -8708192233349544946L);
        setBooleanField(term21942, term21942.getClass(), "checkSumOK", true);
        setByteField(term21942, term21942.getClass(), "linkFlag", (byte) 78);
        setField(term21942, term21942.getClass(), "linkName", "");
        setField(term21942, term21942.getClass(), "magic", "ustar ");
        setField(term21942, term21942.getClass(), "version", "00");
        setField(term21942, term21942.getClass(), "userName", "root");
        setField(term21942, term21942.getClass(), "groupName", "");
        setIntField(term21942, term21942.getClass(), "devMajor", -1179120542);
        setIntField(term21942, term21942.getClass(), "devMinor", -73683645);
        setBooleanField(term21942, term21942.getClass(), "isExtended", false);
        setLongField(term21942, term21942.getClass(), "realSize", 5907001541142728739L);
        setBooleanField(term21942, term21942.getClass(), "paxGNUSparse", false);
        setBooleanField(term21942, term21942.getClass(), "starSparse", false);
        setField(term21955, term21955.getClass(), "path", "oVcInYnLWB");
        setField(term21955, term21955.getClass(), "status", enum86);
        setIntField(term21955, term21955.getClass(), "prefixLength", -226514366);
        setField(term21955, term21955.getClass(), "filePath", null);
        setField(term21942, term21942.getClass(), "file", term21955);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "aJlieCFVtF";
        callMethod(klass, "setName", argTypes, term1813, args);
        assertTrue(recursiveEquals(term1813, term21942));
    }

};


