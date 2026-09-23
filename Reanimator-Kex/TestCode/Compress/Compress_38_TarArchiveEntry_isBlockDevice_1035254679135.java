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

public class TarArchiveEntry_isBlockDevice_1035254679135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12503;
     Object term41218;

    public TarArchiveEntry_isBlockDevice_1035254679135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term41260 = Class.forName((String) "java.io.File$PathStatus");
        Field term41259 = ((Class) term41260).getDeclaredField((String) "INVALID");
        ((Field) term41259).setAccessible(true);
        Object enum175 = ((Field) term41259).get((Object) null);
        term12503 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term12542 = newInstance(Class.forName("java.io.File"));
        setField(term12503, term12503.getClass(), "name", "");
        setBooleanField(term12503, term12503.getClass(), "preserveLeadingSlashes", false);
        setIntField(term12503, term12503.getClass(), "mode", 982388293);
        setLongField(term12503, term12503.getClass(), "userId", 5315236285592892506L);
        setLongField(term12503, term12503.getClass(), "groupId", -6969704322644192945L);
        setLongField(term12503, term12503.getClass(), "size", -6685235643232255177L);
        setLongField(term12503, term12503.getClass(), "modTime", -5656664340499957324L);
        setBooleanField(term12503, term12503.getClass(), "checkSumOK", true);
        setByteField(term12503, term12503.getClass(), "linkFlag", (byte) -126);
        setField(term12503, term12503.getClass(), "linkName", "");
        setField(term12503, term12503.getClass(), "magic", "ustar ");
        setField(term12503, term12503.getClass(), "version", "00");
        setField(term12503, term12503.getClass(), "userName", "root");
        setField(term12503, term12503.getClass(), "groupName", "");
        setIntField(term12503, term12503.getClass(), "devMajor", -159494544);
        setIntField(term12503, term12503.getClass(), "devMinor", -75206835);
        setBooleanField(term12503, term12503.getClass(), "isExtended", true);
        setLongField(term12503, term12503.getClass(), "realSize", -5460517064177800852L);
        setBooleanField(term12503, term12503.getClass(), "paxGNUSparse", false);
        setBooleanField(term12503, term12503.getClass(), "starSparse", true);
        setField(term12542, term12542.getClass(), "path", "kBdSllIBVz");
        setField(term12542, term12542.getClass(), "status", enum175);
        setIntField(term12542, term12542.getClass(), "prefixLength", -1618206977);
        setField(term12542, term12542.getClass(), "filePath", null);
        setField(term12503, term12503.getClass(), "file", term12542);
        Class<? extends Object> term41425 = Class.forName((String) "java.io.File$PathStatus");
        Field term41424 = ((Class) term41425).getDeclaredField((String) "INVALID");
        ((Field) term41424).setAccessible(true);
        Object enum176 = ((Field) term41424).get((Object) null);
        term41218 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term41231 = newInstance(Class.forName("java.io.File"));
        setField(term41218, term41218.getClass(), "name", "");
        setBooleanField(term41218, term41218.getClass(), "preserveLeadingSlashes", false);
        setIntField(term41218, term41218.getClass(), "mode", 982388293);
        setLongField(term41218, term41218.getClass(), "userId", 5315236285592892506L);
        setLongField(term41218, term41218.getClass(), "groupId", -6969704322644192945L);
        setLongField(term41218, term41218.getClass(), "size", -6685235643232255177L);
        setLongField(term41218, term41218.getClass(), "modTime", -5656664340499957324L);
        setBooleanField(term41218, term41218.getClass(), "checkSumOK", true);
        setByteField(term41218, term41218.getClass(), "linkFlag", (byte) -126);
        setField(term41218, term41218.getClass(), "linkName", "");
        setField(term41218, term41218.getClass(), "magic", "ustar ");
        setField(term41218, term41218.getClass(), "version", "00");
        setField(term41218, term41218.getClass(), "userName", "root");
        setField(term41218, term41218.getClass(), "groupName", "");
        setIntField(term41218, term41218.getClass(), "devMajor", -159494544);
        setIntField(term41218, term41218.getClass(), "devMinor", -75206835);
        setBooleanField(term41218, term41218.getClass(), "isExtended", true);
        setLongField(term41218, term41218.getClass(), "realSize", -5460517064177800852L);
        setBooleanField(term41218, term41218.getClass(), "paxGNUSparse", false);
        setBooleanField(term41218, term41218.getClass(), "starSparse", true);
        setField(term41231, term41231.getClass(), "path", "kBdSllIBVz");
        setField(term41231, term41231.getClass(), "status", enum176);
        setIntField(term41231, term41231.getClass(), "prefixLength", -1618206977);
        setField(term41231, term41231.getClass(), "filePath", null);
        setField(term41218, term41218.getClass(), "file", term41231);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isBlockDevice", argTypes, term12503, args);
        assertTrue(recursiveEquals(term12503, term41218));
        assertTrue(recursiveEquals(retValue, false));
    }

};


