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

public class TarArchiveEntry_isLink_1413696564133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12045;
     Object term40104;

    public TarArchiveEntry_isLink_1413696564133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term40146 = Class.forName((String) "java.io.File$PathStatus");
        Field term40145 = ((Class) term40146).getDeclaredField((String) "INVALID");
        ((Field) term40145).setAccessible(true);
        Object enum169 = ((Field) term40145).get((Object) null);
        term12045 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term12084 = newInstance(Class.forName("java.io.File"));
        setField(term12045, term12045.getClass(), "name", "");
        setBooleanField(term12045, term12045.getClass(), "preserveLeadingSlashes", false);
        setIntField(term12045, term12045.getClass(), "mode", -749861210);
        setLongField(term12045, term12045.getClass(), "userId", -2187638136407967948L);
        setLongField(term12045, term12045.getClass(), "groupId", 8708846223293804408L);
        setLongField(term12045, term12045.getClass(), "size", -2986201902216133814L);
        setLongField(term12045, term12045.getClass(), "modTime", 4255811647459029682L);
        setBooleanField(term12045, term12045.getClass(), "checkSumOK", true);
        setByteField(term12045, term12045.getClass(), "linkFlag", (byte) 102);
        setField(term12045, term12045.getClass(), "linkName", "");
        setField(term12045, term12045.getClass(), "magic", "ustar ");
        setField(term12045, term12045.getClass(), "version", "00");
        setField(term12045, term12045.getClass(), "userName", "root");
        setField(term12045, term12045.getClass(), "groupName", "");
        setIntField(term12045, term12045.getClass(), "devMajor", 1694224101);
        setIntField(term12045, term12045.getClass(), "devMinor", 937859191);
        setBooleanField(term12045, term12045.getClass(), "isExtended", false);
        setLongField(term12045, term12045.getClass(), "realSize", 8000844860910174690L);
        setBooleanField(term12045, term12045.getClass(), "paxGNUSparse", true);
        setBooleanField(term12045, term12045.getClass(), "starSparse", false);
        setField(term12084, term12084.getClass(), "path", "fhkbdRViHi");
        setField(term12084, term12084.getClass(), "status", enum169);
        setIntField(term12084, term12084.getClass(), "prefixLength", -916584829);
        setField(term12084, term12084.getClass(), "filePath", null);
        setField(term12045, term12045.getClass(), "file", term12084);
        Class<? extends Object> term40313 = Class.forName((String) "java.io.File$PathStatus");
        Field term40312 = ((Class) term40313).getDeclaredField((String) "INVALID");
        ((Field) term40312).setAccessible(true);
        Object enum170 = ((Field) term40312).get((Object) null);
        term40104 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term40117 = newInstance(Class.forName("java.io.File"));
        setField(term40104, term40104.getClass(), "name", "");
        setBooleanField(term40104, term40104.getClass(), "preserveLeadingSlashes", false);
        setIntField(term40104, term40104.getClass(), "mode", -749861210);
        setLongField(term40104, term40104.getClass(), "userId", -2187638136407967948L);
        setLongField(term40104, term40104.getClass(), "groupId", 8708846223293804408L);
        setLongField(term40104, term40104.getClass(), "size", -2986201902216133814L);
        setLongField(term40104, term40104.getClass(), "modTime", 4255811647459029682L);
        setBooleanField(term40104, term40104.getClass(), "checkSumOK", true);
        setByteField(term40104, term40104.getClass(), "linkFlag", (byte) 102);
        setField(term40104, term40104.getClass(), "linkName", "");
        setField(term40104, term40104.getClass(), "magic", "ustar ");
        setField(term40104, term40104.getClass(), "version", "00");
        setField(term40104, term40104.getClass(), "userName", "root");
        setField(term40104, term40104.getClass(), "groupName", "");
        setIntField(term40104, term40104.getClass(), "devMajor", 1694224101);
        setIntField(term40104, term40104.getClass(), "devMinor", 937859191);
        setBooleanField(term40104, term40104.getClass(), "isExtended", false);
        setLongField(term40104, term40104.getClass(), "realSize", 8000844860910174690L);
        setBooleanField(term40104, term40104.getClass(), "paxGNUSparse", true);
        setBooleanField(term40104, term40104.getClass(), "starSparse", false);
        setField(term40117, term40117.getClass(), "path", "fhkbdRViHi");
        setField(term40117, term40117.getClass(), "status", enum170);
        setIntField(term40117, term40117.getClass(), "prefixLength", -916584829);
        setField(term40117, term40117.getClass(), "filePath", null);
        setField(term40104, term40104.getClass(), "file", term40117);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isLink", argTypes, term12045, args);
        assertTrue(recursiveEquals(term12045, term40104));
        assertTrue(recursiveEquals(retValue, false));
    }

};


