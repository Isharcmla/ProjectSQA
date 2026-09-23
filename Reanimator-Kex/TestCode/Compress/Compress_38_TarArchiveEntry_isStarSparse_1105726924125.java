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

public class TarArchiveEntry_isStarSparse_1105726924125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10213;
     Object term37577;

    public TarArchiveEntry_isStarSparse_1105726924125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term37618 = Class.forName((String) "java.io.File$PathStatus");
        Field term37617 = ((Class) term37618).getDeclaredField((String) "CHECKED");
        ((Field) term37617).setAccessible(true);
        Object enum157 = ((Field) term37617).get((Object) null);
        term10213 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term10252 = newInstance(Class.forName("java.io.File"));
        setField(term10213, term10213.getClass(), "name", "");
        setBooleanField(term10213, term10213.getClass(), "preserveLeadingSlashes", true);
        setIntField(term10213, term10213.getClass(), "mode", -1504890659);
        setLongField(term10213, term10213.getClass(), "userId", -4043093655001688454L);
        setLongField(term10213, term10213.getClass(), "groupId", -419800263764810394L);
        setLongField(term10213, term10213.getClass(), "size", 5904678961906211249L);
        setLongField(term10213, term10213.getClass(), "modTime", -1820639665251914495L);
        setBooleanField(term10213, term10213.getClass(), "checkSumOK", false);
        setByteField(term10213, term10213.getClass(), "linkFlag", (byte) -103);
        setField(term10213, term10213.getClass(), "linkName", "");
        setField(term10213, term10213.getClass(), "magic", "ustar ");
        setField(term10213, term10213.getClass(), "version", "00");
        setField(term10213, term10213.getClass(), "userName", "root");
        setField(term10213, term10213.getClass(), "groupName", "");
        setIntField(term10213, term10213.getClass(), "devMajor", 1358829571);
        setIntField(term10213, term10213.getClass(), "devMinor", 991356662);
        setBooleanField(term10213, term10213.getClass(), "isExtended", false);
        setLongField(term10213, term10213.getClass(), "realSize", 3238645206498300107L);
        setBooleanField(term10213, term10213.getClass(), "paxGNUSparse", false);
        setBooleanField(term10213, term10213.getClass(), "starSparse", false);
        setField(term10252, term10252.getClass(), "path", "ffYhPOzlUs");
        setField(term10252, term10252.getClass(), "status", enum157);
        setIntField(term10252, term10252.getClass(), "prefixLength", -506958186);
        setField(term10252, term10252.getClass(), "filePath", null);
        setField(term10213, term10213.getClass(), "file", term10252);
        Class<? extends Object> term37783 = Class.forName((String) "java.io.File$PathStatus");
        Field term37782 = ((Class) term37783).getDeclaredField((String) "CHECKED");
        ((Field) term37782).setAccessible(true);
        Object enum158 = ((Field) term37782).get((Object) null);
        term37577 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term37590 = newInstance(Class.forName("java.io.File"));
        setField(term37577, term37577.getClass(), "name", "");
        setBooleanField(term37577, term37577.getClass(), "preserveLeadingSlashes", true);
        setIntField(term37577, term37577.getClass(), "mode", -1504890659);
        setLongField(term37577, term37577.getClass(), "userId", -4043093655001688454L);
        setLongField(term37577, term37577.getClass(), "groupId", -419800263764810394L);
        setLongField(term37577, term37577.getClass(), "size", 5904678961906211249L);
        setLongField(term37577, term37577.getClass(), "modTime", -1820639665251914495L);
        setBooleanField(term37577, term37577.getClass(), "checkSumOK", false);
        setByteField(term37577, term37577.getClass(), "linkFlag", (byte) -103);
        setField(term37577, term37577.getClass(), "linkName", "");
        setField(term37577, term37577.getClass(), "magic", "ustar ");
        setField(term37577, term37577.getClass(), "version", "00");
        setField(term37577, term37577.getClass(), "userName", "root");
        setField(term37577, term37577.getClass(), "groupName", "");
        setIntField(term37577, term37577.getClass(), "devMajor", 1358829571);
        setIntField(term37577, term37577.getClass(), "devMinor", 991356662);
        setBooleanField(term37577, term37577.getClass(), "isExtended", false);
        setLongField(term37577, term37577.getClass(), "realSize", 3238645206498300107L);
        setBooleanField(term37577, term37577.getClass(), "paxGNUSparse", false);
        setBooleanField(term37577, term37577.getClass(), "starSparse", false);
        setField(term37590, term37590.getClass(), "path", "ffYhPOzlUs");
        setField(term37590, term37590.getClass(), "status", enum158);
        setIntField(term37590, term37590.getClass(), "prefixLength", -506958186);
        setField(term37590, term37590.getClass(), "filePath", null);
        setField(term37577, term37577.getClass(), "file", term37590);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isStarSparse", argTypes, term10213, args);
        assertTrue(recursiveEquals(term10213, term37577));
    }

};


