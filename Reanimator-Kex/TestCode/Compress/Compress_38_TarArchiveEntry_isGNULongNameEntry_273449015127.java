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

public class TarArchiveEntry_isGNULongNameEntry_273449015127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10671;
     Object term39005;

    public TarArchiveEntry_isGNULongNameEntry_273449015127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term39047 = Class.forName((String) "java.io.File$PathStatus");
        Field term39046 = ((Class) term39047).getDeclaredField((String) "CHECKED");
        ((Field) term39046).setAccessible(true);
        Object enum164 = ((Field) term39046).get((Object) null);
        term10671 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term10710 = newInstance(Class.forName("java.io.File"));
        setField(term10671, term10671.getClass(), "name", "");
        setBooleanField(term10671, term10671.getClass(), "preserveLeadingSlashes", false);
        setIntField(term10671, term10671.getClass(), "mode", 114754804);
        setLongField(term10671, term10671.getClass(), "userId", 329213208496958131L);
        setLongField(term10671, term10671.getClass(), "groupId", 8107921244631636572L);
        setLongField(term10671, term10671.getClass(), "size", -7904053112604879960L);
        setLongField(term10671, term10671.getClass(), "modTime", -6602460430714339690L);
        setBooleanField(term10671, term10671.getClass(), "checkSumOK", true);
        setByteField(term10671, term10671.getClass(), "linkFlag", (byte) 79);
        setField(term10671, term10671.getClass(), "linkName", "");
        setField(term10671, term10671.getClass(), "magic", "ustar ");
        setField(term10671, term10671.getClass(), "version", "00");
        setField(term10671, term10671.getClass(), "userName", "root");
        setField(term10671, term10671.getClass(), "groupName", "");
        setIntField(term10671, term10671.getClass(), "devMajor", 1687361082);
        setIntField(term10671, term10671.getClass(), "devMinor", 584893196);
        setBooleanField(term10671, term10671.getClass(), "isExtended", false);
        setLongField(term10671, term10671.getClass(), "realSize", 21047099434645581L);
        setBooleanField(term10671, term10671.getClass(), "paxGNUSparse", true);
        setBooleanField(term10671, term10671.getClass(), "starSparse", true);
        setField(term10710, term10710.getClass(), "path", "ytSBIKXogI");
        setField(term10710, term10710.getClass(), "status", enum164);
        setIntField(term10710, term10710.getClass(), "prefixLength", 497269071);
        setField(term10710, term10710.getClass(), "filePath", null);
        setField(term10671, term10671.getClass(), "file", term10710);
        Class<? extends Object> term39212 = Class.forName((String) "java.io.File$PathStatus");
        Field term39211 = ((Class) term39212).getDeclaredField((String) "CHECKED");
        ((Field) term39211).setAccessible(true);
        Object enum165 = ((Field) term39211).get((Object) null);
        term39005 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term39018 = newInstance(Class.forName("java.io.File"));
        setField(term39005, term39005.getClass(), "name", "");
        setBooleanField(term39005, term39005.getClass(), "preserveLeadingSlashes", false);
        setIntField(term39005, term39005.getClass(), "mode", 114754804);
        setLongField(term39005, term39005.getClass(), "userId", 329213208496958131L);
        setLongField(term39005, term39005.getClass(), "groupId", 8107921244631636572L);
        setLongField(term39005, term39005.getClass(), "size", -7904053112604879960L);
        setLongField(term39005, term39005.getClass(), "modTime", -6602460430714339690L);
        setBooleanField(term39005, term39005.getClass(), "checkSumOK", true);
        setByteField(term39005, term39005.getClass(), "linkFlag", (byte) 79);
        setField(term39005, term39005.getClass(), "linkName", "");
        setField(term39005, term39005.getClass(), "magic", "ustar ");
        setField(term39005, term39005.getClass(), "version", "00");
        setField(term39005, term39005.getClass(), "userName", "root");
        setField(term39005, term39005.getClass(), "groupName", "");
        setIntField(term39005, term39005.getClass(), "devMajor", 1687361082);
        setIntField(term39005, term39005.getClass(), "devMinor", 584893196);
        setBooleanField(term39005, term39005.getClass(), "isExtended", false);
        setLongField(term39005, term39005.getClass(), "realSize", 21047099434645581L);
        setBooleanField(term39005, term39005.getClass(), "paxGNUSparse", true);
        setBooleanField(term39005, term39005.getClass(), "starSparse", true);
        setField(term39018, term39018.getClass(), "path", "ytSBIKXogI");
        setField(term39018, term39018.getClass(), "status", enum165);
        setIntField(term39018, term39018.getClass(), "prefixLength", 497269071);
        setField(term39018, term39018.getClass(), "filePath", null);
        setField(term39005, term39005.getClass(), "file", term39018);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isGNULongNameEntry", argTypes, term10671, args);
        assertTrue(recursiveEquals(term10671, term39005));
        assertTrue(recursiveEquals(retValue, false));
    }

};


