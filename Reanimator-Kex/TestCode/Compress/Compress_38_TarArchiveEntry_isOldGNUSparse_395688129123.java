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

public class TarArchiveEntry_isOldGNUSparse_395688129123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9755;
     Object term36485;

    public TarArchiveEntry_isOldGNUSparse_395688129123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term36527 = Class.forName((String) "java.io.File$PathStatus");
        Field term36526 = ((Class) term36527).getDeclaredField((String) "CHECKED");
        ((Field) term36526).setAccessible(true);
        Object enum153 = ((Field) term36526).get((Object) null);
        term9755 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term9794 = newInstance(Class.forName("java.io.File"));
        setField(term9755, term9755.getClass(), "name", "");
        setBooleanField(term9755, term9755.getClass(), "preserveLeadingSlashes", true);
        setIntField(term9755, term9755.getClass(), "mode", -601863069);
        setLongField(term9755, term9755.getClass(), "userId", -8338004844694486146L);
        setLongField(term9755, term9755.getClass(), "groupId", 6426732259596412988L);
        setLongField(term9755, term9755.getClass(), "size", 185793058502220865L);
        setLongField(term9755, term9755.getClass(), "modTime", -7698746988132548371L);
        setBooleanField(term9755, term9755.getClass(), "checkSumOK", false);
        setByteField(term9755, term9755.getClass(), "linkFlag", (byte) 106);
        setField(term9755, term9755.getClass(), "linkName", "");
        setField(term9755, term9755.getClass(), "magic", "ustar ");
        setField(term9755, term9755.getClass(), "version", "00");
        setField(term9755, term9755.getClass(), "userName", "root");
        setField(term9755, term9755.getClass(), "groupName", "");
        setIntField(term9755, term9755.getClass(), "devMajor", 663292551);
        setIntField(term9755, term9755.getClass(), "devMinor", -1885090354);
        setBooleanField(term9755, term9755.getClass(), "isExtended", true);
        setLongField(term9755, term9755.getClass(), "realSize", 2145420811068634601L);
        setBooleanField(term9755, term9755.getClass(), "paxGNUSparse", true);
        setBooleanField(term9755, term9755.getClass(), "starSparse", false);
        setField(term9794, term9794.getClass(), "path", "onpbIeEKoi");
        setField(term9794, term9794.getClass(), "status", enum153);
        setIntField(term9794, term9794.getClass(), "prefixLength", -2066804303);
        setField(term9794, term9794.getClass(), "filePath", null);
        setField(term9755, term9755.getClass(), "file", term9794);
        Class<? extends Object> term36692 = Class.forName((String) "java.io.File$PathStatus");
        Field term36691 = ((Class) term36692).getDeclaredField((String) "CHECKED");
        ((Field) term36691).setAccessible(true);
        Object enum154 = ((Field) term36691).get((Object) null);
        term36485 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term36498 = newInstance(Class.forName("java.io.File"));
        setField(term36485, term36485.getClass(), "name", "");
        setBooleanField(term36485, term36485.getClass(), "preserveLeadingSlashes", true);
        setIntField(term36485, term36485.getClass(), "mode", -601863069);
        setLongField(term36485, term36485.getClass(), "userId", -8338004844694486146L);
        setLongField(term36485, term36485.getClass(), "groupId", 6426732259596412988L);
        setLongField(term36485, term36485.getClass(), "size", 185793058502220865L);
        setLongField(term36485, term36485.getClass(), "modTime", -7698746988132548371L);
        setBooleanField(term36485, term36485.getClass(), "checkSumOK", false);
        setByteField(term36485, term36485.getClass(), "linkFlag", (byte) 106);
        setField(term36485, term36485.getClass(), "linkName", "");
        setField(term36485, term36485.getClass(), "magic", "ustar ");
        setField(term36485, term36485.getClass(), "version", "00");
        setField(term36485, term36485.getClass(), "userName", "root");
        setField(term36485, term36485.getClass(), "groupName", "");
        setIntField(term36485, term36485.getClass(), "devMajor", 663292551);
        setIntField(term36485, term36485.getClass(), "devMinor", -1885090354);
        setBooleanField(term36485, term36485.getClass(), "isExtended", true);
        setLongField(term36485, term36485.getClass(), "realSize", 2145420811068634601L);
        setBooleanField(term36485, term36485.getClass(), "paxGNUSparse", true);
        setBooleanField(term36485, term36485.getClass(), "starSparse", false);
        setField(term36498, term36498.getClass(), "path", "onpbIeEKoi");
        setField(term36498, term36498.getClass(), "status", enum154);
        setIntField(term36498, term36498.getClass(), "prefixLength", -2066804303);
        setField(term36498, term36498.getClass(), "filePath", null);
        setField(term36485, term36485.getClass(), "file", term36498);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isOldGNUSparse", argTypes, term9755, args);
        assertTrue(recursiveEquals(term9755, term36485));
        assertTrue(recursiveEquals(retValue, false));
    }

};


