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

public class TarArchiveEntry_getMode_1825423127113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7459;
     Object term32301;

    public TarArchiveEntry_getMode_1825423127113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term32342 = Class.forName((String) "java.io.File$PathStatus");
        Field term32341 = ((Class) term32342).getDeclaredField((String) "CHECKED");
        ((Field) term32341).setAccessible(true);
        Object enum134 = ((Field) term32341).get((Object) null);
        term7459 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term7498 = newInstance(Class.forName("java.io.File"));
        setField(term7459, term7459.getClass(), "name", "");
        setBooleanField(term7459, term7459.getClass(), "preserveLeadingSlashes", true);
        setIntField(term7459, term7459.getClass(), "mode", 538259104);
        setLongField(term7459, term7459.getClass(), "userId", -1539859611880912454L);
        setLongField(term7459, term7459.getClass(), "groupId", 4100236067313034103L);
        setLongField(term7459, term7459.getClass(), "size", 1195529027276497124L);
        setLongField(term7459, term7459.getClass(), "modTime", -2783999800714825789L);
        setBooleanField(term7459, term7459.getClass(), "checkSumOK", false);
        setByteField(term7459, term7459.getClass(), "linkFlag", (byte) -12);
        setField(term7459, term7459.getClass(), "linkName", "");
        setField(term7459, term7459.getClass(), "magic", "ustar ");
        setField(term7459, term7459.getClass(), "version", "00");
        setField(term7459, term7459.getClass(), "userName", "root");
        setField(term7459, term7459.getClass(), "groupName", "");
        setIntField(term7459, term7459.getClass(), "devMajor", 96566506);
        setIntField(term7459, term7459.getClass(), "devMinor", -343325701);
        setBooleanField(term7459, term7459.getClass(), "isExtended", false);
        setLongField(term7459, term7459.getClass(), "realSize", 4266570509071948633L);
        setBooleanField(term7459, term7459.getClass(), "paxGNUSparse", false);
        setBooleanField(term7459, term7459.getClass(), "starSparse", true);
        setField(term7498, term7498.getClass(), "path", "BndsHwAFMv");
        setField(term7498, term7498.getClass(), "status", enum134);
        setIntField(term7498, term7498.getClass(), "prefixLength", 107945604);
        setField(term7498, term7498.getClass(), "filePath", null);
        setField(term7459, term7459.getClass(), "file", term7498);
        Class<? extends Object> term32507 = Class.forName((String) "java.io.File$PathStatus");
        Field term32506 = ((Class) term32507).getDeclaredField((String) "CHECKED");
        ((Field) term32506).setAccessible(true);
        Object enum135 = ((Field) term32506).get((Object) null);
        term32301 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term32314 = newInstance(Class.forName("java.io.File"));
        setField(term32301, term32301.getClass(), "name", "");
        setBooleanField(term32301, term32301.getClass(), "preserveLeadingSlashes", true);
        setIntField(term32301, term32301.getClass(), "mode", 538259104);
        setLongField(term32301, term32301.getClass(), "userId", -1539859611880912454L);
        setLongField(term32301, term32301.getClass(), "groupId", 4100236067313034103L);
        setLongField(term32301, term32301.getClass(), "size", 1195529027276497124L);
        setLongField(term32301, term32301.getClass(), "modTime", -2783999800714825789L);
        setBooleanField(term32301, term32301.getClass(), "checkSumOK", false);
        setByteField(term32301, term32301.getClass(), "linkFlag", (byte) -12);
        setField(term32301, term32301.getClass(), "linkName", "");
        setField(term32301, term32301.getClass(), "magic", "ustar ");
        setField(term32301, term32301.getClass(), "version", "00");
        setField(term32301, term32301.getClass(), "userName", "root");
        setField(term32301, term32301.getClass(), "groupName", "");
        setIntField(term32301, term32301.getClass(), "devMajor", 96566506);
        setIntField(term32301, term32301.getClass(), "devMinor", -343325701);
        setBooleanField(term32301, term32301.getClass(), "isExtended", false);
        setLongField(term32301, term32301.getClass(), "realSize", 4266570509071948633L);
        setBooleanField(term32301, term32301.getClass(), "paxGNUSparse", false);
        setBooleanField(term32301, term32301.getClass(), "starSparse", true);
        setField(term32314, term32314.getClass(), "path", "BndsHwAFMv");
        setField(term32314, term32314.getClass(), "status", enum135);
        setIntField(term32314, term32314.getClass(), "prefixLength", 107945604);
        setField(term32314, term32314.getClass(), "filePath", null);
        setField(term32301, term32301.getClass(), "file", term32314);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getMode", argTypes, term7459, args);
        assertTrue(recursiveEquals(term7459, term32301));
        assertTrue(recursiveEquals(retValue, 538259104));
    }

};


