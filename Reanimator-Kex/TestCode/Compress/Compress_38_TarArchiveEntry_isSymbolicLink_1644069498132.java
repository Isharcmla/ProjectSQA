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

public class TarArchiveEntry_isSymbolicLink_1644069498132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11816;
     Object term39941;

    public TarArchiveEntry_isSymbolicLink_1644069498132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term41587 = Class.forName((String) "java.io.File$PathStatus");
        Field term41586 = ((Class) term41587).getDeclaredField((String) "CHECKED");
        ((Field) term41586).setAccessible(true);
        Object enum177 = ((Field) term41586).get((Object) null);
        term11816 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term11855 = newInstance(Class.forName("java.io.File"));
        setField(term11816, term11816.getClass(), "name", "");
        setBooleanField(term11816, term11816.getClass(), "preserveLeadingSlashes", false);
        setIntField(term11816, term11816.getClass(), "mode", -165587447);
        setLongField(term11816, term11816.getClass(), "userId", 6248239231585852341L);
        setLongField(term11816, term11816.getClass(), "groupId", -88538481937688851L);
        setLongField(term11816, term11816.getClass(), "size", 4069264186851023313L);
        setLongField(term11816, term11816.getClass(), "modTime", 5184635470881147510L);
        setBooleanField(term11816, term11816.getClass(), "checkSumOK", false);
        setByteField(term11816, term11816.getClass(), "linkFlag", (byte) -81);
        setField(term11816, term11816.getClass(), "linkName", "");
        setField(term11816, term11816.getClass(), "magic", "ustar ");
        setField(term11816, term11816.getClass(), "version", "00");
        setField(term11816, term11816.getClass(), "userName", "root");
        setField(term11816, term11816.getClass(), "groupName", "");
        setIntField(term11816, term11816.getClass(), "devMajor", -1347358701);
        setIntField(term11816, term11816.getClass(), "devMinor", 806595993);
        setBooleanField(term11816, term11816.getClass(), "isExtended", true);
        setLongField(term11816, term11816.getClass(), "realSize", 918397384129253729L);
        setBooleanField(term11816, term11816.getClass(), "paxGNUSparse", true);
        setBooleanField(term11816, term11816.getClass(), "starSparse", true);
        setField(term11855, term11855.getClass(), "path", "eqJfYWRaEL");
        setField(term11855, term11855.getClass(), "status", enum177);
        setIntField(term11855, term11855.getClass(), "prefixLength", 548228925);
        setField(term11855, term11855.getClass(), "filePath", null);
        setField(term11816, term11816.getClass(), "file", term11855);
        Class<? extends Object> term41771 = Class.forName((String) "java.io.File$PathStatus");
        Field term41770 = ((Class) term41771).getDeclaredField((String) "CHECKED");
        ((Field) term41770).setAccessible(true);
        Object enum178 = ((Field) term41770).get((Object) null);
        term39941 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term39964 = newInstance(Class.forName("java.io.File"));
        setField(term39941, term39941.getClass(), "name", "");
        setBooleanField(term39941, term39941.getClass(), "preserveLeadingSlashes", false);
        setIntField(term39941, term39941.getClass(), "mode", -165587447);
        setLongField(term39941, term39941.getClass(), "userId", 6248239231585852341L);
        setLongField(term39941, term39941.getClass(), "groupId", -88538481937688851L);
        setLongField(term39941, term39941.getClass(), "size", 4069264186851023313L);
        setLongField(term39941, term39941.getClass(), "modTime", 5184635470881147510L);
        setBooleanField(term39941, term39941.getClass(), "checkSumOK", false);
        setByteField(term39941, term39941.getClass(), "linkFlag", (byte) -81);
        setField(term39941, term39941.getClass(), "linkName", "");
        setField(term39941, term39941.getClass(), "magic", "ustar ");
        setField(term39941, term39941.getClass(), "version", "00");
        setField(term39941, term39941.getClass(), "userName", "root");
        setField(term39941, term39941.getClass(), "groupName", "");
        setIntField(term39941, term39941.getClass(), "devMajor", -1347358701);
        setIntField(term39941, term39941.getClass(), "devMinor", 806595993);
        setBooleanField(term39941, term39941.getClass(), "isExtended", true);
        setLongField(term39941, term39941.getClass(), "realSize", 918397384129253729L);
        setBooleanField(term39941, term39941.getClass(), "paxGNUSparse", true);
        setBooleanField(term39941, term39941.getClass(), "starSparse", true);
        setField(term39964, term39964.getClass(), "path", "eqJfYWRaEL");
        setField(term39964, term39964.getClass(), "status", enum178);
        setIntField(term39964, term39964.getClass(), "prefixLength", 548228925);
        setField(term39964, term39964.getClass(), "filePath", null);
        setField(term39941, term39941.getClass(), "file", term39964);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isSymbolicLink", argTypes, term11816, args);
        assertTrue(recursiveEquals(term11816, term39941));
        assertTrue(recursiveEquals(retValue, false));
    }

};


