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

public class TarArchiveEntry_getUserId_64155154093 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2775;
     Object term23677;

    public TarArchiveEntry_getUserId_64155154093() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term23718 = Class.forName((String) "java.io.File$PathStatus");
        Field term23717 = ((Class) term23718).getDeclaredField((String) "CHECKED");
        ((Field) term23717).setAccessible(true);
        Object enum93 = ((Field) term23717).get((Object) null);
        term2775 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term2814 = newInstance(Class.forName("java.io.File"));
        setField(term2775, term2775.getClass(), "name", "");
        setBooleanField(term2775, term2775.getClass(), "preserveLeadingSlashes", true);
        setIntField(term2775, term2775.getClass(), "mode", -1968847291);
        setLongField(term2775, term2775.getClass(), "userId", -1468719814009985452L);
        setLongField(term2775, term2775.getClass(), "groupId", -7738503207562305297L);
        setLongField(term2775, term2775.getClass(), "size", 3825396310311739952L);
        setLongField(term2775, term2775.getClass(), "modTime", -3838084482494604218L);
        setBooleanField(term2775, term2775.getClass(), "checkSumOK", false);
        setByteField(term2775, term2775.getClass(), "linkFlag", (byte) -2);
        setField(term2775, term2775.getClass(), "linkName", "");
        setField(term2775, term2775.getClass(), "magic", "ustar ");
        setField(term2775, term2775.getClass(), "version", "00");
        setField(term2775, term2775.getClass(), "userName", "root");
        setField(term2775, term2775.getClass(), "groupName", "");
        setIntField(term2775, term2775.getClass(), "devMajor", 579005622);
        setIntField(term2775, term2775.getClass(), "devMinor", -14890619);
        setBooleanField(term2775, term2775.getClass(), "isExtended", false);
        setLongField(term2775, term2775.getClass(), "realSize", 3892018155439224435L);
        setBooleanField(term2775, term2775.getClass(), "paxGNUSparse", false);
        setBooleanField(term2775, term2775.getClass(), "starSparse", false);
        setField(term2814, term2814.getClass(), "path", "hNxWaHcfhY");
        setField(term2814, term2814.getClass(), "status", enum93);
        setIntField(term2814, term2814.getClass(), "prefixLength", 1632125673);
        setField(term2814, term2814.getClass(), "filePath", null);
        setField(term2775, term2775.getClass(), "file", term2814);
        Class<? extends Object> term23883 = Class.forName((String) "java.io.File$PathStatus");
        Field term23882 = ((Class) term23883).getDeclaredField((String) "CHECKED");
        ((Field) term23882).setAccessible(true);
        Object enum94 = ((Field) term23882).get((Object) null);
        term23677 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term23690 = newInstance(Class.forName("java.io.File"));
        setField(term23677, term23677.getClass(), "name", "");
        setBooleanField(term23677, term23677.getClass(), "preserveLeadingSlashes", true);
        setIntField(term23677, term23677.getClass(), "mode", -1968847291);
        setLongField(term23677, term23677.getClass(), "userId", -1468719814009985452L);
        setLongField(term23677, term23677.getClass(), "groupId", -7738503207562305297L);
        setLongField(term23677, term23677.getClass(), "size", 3825396310311739952L);
        setLongField(term23677, term23677.getClass(), "modTime", -3838084482494604218L);
        setBooleanField(term23677, term23677.getClass(), "checkSumOK", false);
        setByteField(term23677, term23677.getClass(), "linkFlag", (byte) -2);
        setField(term23677, term23677.getClass(), "linkName", "");
        setField(term23677, term23677.getClass(), "magic", "ustar ");
        setField(term23677, term23677.getClass(), "version", "00");
        setField(term23677, term23677.getClass(), "userName", "root");
        setField(term23677, term23677.getClass(), "groupName", "");
        setIntField(term23677, term23677.getClass(), "devMajor", 579005622);
        setIntField(term23677, term23677.getClass(), "devMinor", -14890619);
        setBooleanField(term23677, term23677.getClass(), "isExtended", false);
        setLongField(term23677, term23677.getClass(), "realSize", 3892018155439224435L);
        setBooleanField(term23677, term23677.getClass(), "paxGNUSparse", false);
        setBooleanField(term23677, term23677.getClass(), "starSparse", false);
        setField(term23690, term23690.getClass(), "path", "hNxWaHcfhY");
        setField(term23690, term23690.getClass(), "status", enum94);
        setIntField(term23690, term23690.getClass(), "prefixLength", 1632125673);
        setField(term23690, term23690.getClass(), "filePath", null);
        setField(term23677, term23677.getClass(), "file", term23690);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getUserId", argTypes, term2775, args);
        assertTrue(recursiveEquals(term2775, term23677));
        assertTrue(recursiveEquals(retValue, 1532716628));
    }

};


