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

public class TarArchiveEntry_hashCode_204490813986 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1051;
     Object term20402;

    public TarArchiveEntry_hashCode_204490813986() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term20443 = Class.forName((String) "java.io.File$PathStatus");
        Field term20442 = ((Class) term20443).getDeclaredField((String) "CHECKED");
        ((Field) term20442).setAccessible(true);
        Object enum78 = ((Field) term20442).get((Object) null);
        term1051 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term1090 = newInstance(Class.forName("java.io.File"));
        setField(term1051, term1051.getClass(), "name", "");
        setBooleanField(term1051, term1051.getClass(), "preserveLeadingSlashes", true);
        setIntField(term1051, term1051.getClass(), "mode", 1585847225);
        setLongField(term1051, term1051.getClass(), "userId", -872011222785455006L);
        setLongField(term1051, term1051.getClass(), "groupId", -316468845751588286L);
        setLongField(term1051, term1051.getClass(), "size", 5127676408959197577L);
        setLongField(term1051, term1051.getClass(), "modTime", -6573104506744284592L);
        setBooleanField(term1051, term1051.getClass(), "checkSumOK", false);
        setByteField(term1051, term1051.getClass(), "linkFlag", (byte) -71);
        setField(term1051, term1051.getClass(), "linkName", "");
        setField(term1051, term1051.getClass(), "magic", "ustar ");
        setField(term1051, term1051.getClass(), "version", "00");
        setField(term1051, term1051.getClass(), "userName", "root");
        setField(term1051, term1051.getClass(), "groupName", "");
        setIntField(term1051, term1051.getClass(), "devMajor", 597278769);
        setIntField(term1051, term1051.getClass(), "devMinor", -1685132342);
        setBooleanField(term1051, term1051.getClass(), "isExtended", false);
        setLongField(term1051, term1051.getClass(), "realSize", -4920224193275732920L);
        setBooleanField(term1051, term1051.getClass(), "paxGNUSparse", true);
        setBooleanField(term1051, term1051.getClass(), "starSparse", true);
        setField(term1090, term1090.getClass(), "path", "NRdvgJlhkX");
        setField(term1090, term1090.getClass(), "status", enum78);
        setIntField(term1090, term1090.getClass(), "prefixLength", -1456670397);
        setField(term1090, term1090.getClass(), "filePath", null);
        setField(term1051, term1051.getClass(), "file", term1090);
        Class<? extends Object> term20608 = Class.forName((String) "java.io.File$PathStatus");
        Field term20607 = ((Class) term20608).getDeclaredField((String) "CHECKED");
        ((Field) term20607).setAccessible(true);
        Object enum79 = ((Field) term20607).get((Object) null);
        term20402 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term20415 = newInstance(Class.forName("java.io.File"));
        setField(term20402, term20402.getClass(), "name", "");
        setBooleanField(term20402, term20402.getClass(), "preserveLeadingSlashes", true);
        setIntField(term20402, term20402.getClass(), "mode", 1585847225);
        setLongField(term20402, term20402.getClass(), "userId", -872011222785455006L);
        setLongField(term20402, term20402.getClass(), "groupId", -316468845751588286L);
        setLongField(term20402, term20402.getClass(), "size", 5127676408959197577L);
        setLongField(term20402, term20402.getClass(), "modTime", -6573104506744284592L);
        setBooleanField(term20402, term20402.getClass(), "checkSumOK", false);
        setByteField(term20402, term20402.getClass(), "linkFlag", (byte) -71);
        setField(term20402, term20402.getClass(), "linkName", "");
        setField(term20402, term20402.getClass(), "magic", "ustar ");
        setField(term20402, term20402.getClass(), "version", "00");
        setField(term20402, term20402.getClass(), "userName", "root");
        setField(term20402, term20402.getClass(), "groupName", "");
        setIntField(term20402, term20402.getClass(), "devMajor", 597278769);
        setIntField(term20402, term20402.getClass(), "devMinor", -1685132342);
        setBooleanField(term20402, term20402.getClass(), "isExtended", false);
        setLongField(term20402, term20402.getClass(), "realSize", -4920224193275732920L);
        setBooleanField(term20402, term20402.getClass(), "paxGNUSparse", true);
        setBooleanField(term20402, term20402.getClass(), "starSparse", true);
        setField(term20415, term20415.getClass(), "path", "NRdvgJlhkX");
        setField(term20415, term20415.getClass(), "status", enum79);
        setIntField(term20415, term20415.getClass(), "prefixLength", -1456670397);
        setField(term20415, term20415.getClass(), "filePath", null);
        setField(term20402, term20402.getClass(), "file", term20415);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term1051, args);
        assertTrue(recursiveEquals(term1051, term20402));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


