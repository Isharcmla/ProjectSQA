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

public class TarArchiveEntry_equals_180137248285 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term821;
     Object term885;
     Object term19985;
     Object term20004;

    public TarArchiveEntry_equals_180137248285() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term20028 = Class.forName((String) "java.io.File$PathStatus");
        Field term20027 = ((Class) term20028).getDeclaredField((String) "CHECKED");
        ((Field) term20027).setAccessible(true);
        Object enum76 = ((Field) term20027).get((Object) null);
        term821 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term860 = newInstance(Class.forName("java.io.File"));
        setField(term821, term821.getClass(), "name", "");
        setBooleanField(term821, term821.getClass(), "preserveLeadingSlashes", false);
        setIntField(term821, term821.getClass(), "mode", 1725571209);
        setLongField(term821, term821.getClass(), "userId", -2813493605142626659L);
        setLongField(term821, term821.getClass(), "groupId", -8885298608300233488L);
        setLongField(term821, term821.getClass(), "size", -4325723315152823407L);
        setLongField(term821, term821.getClass(), "modTime", 2535595959091595249L);
        setBooleanField(term821, term821.getClass(), "checkSumOK", true);
        setByteField(term821, term821.getClass(), "linkFlag", (byte) 74);
        setField(term821, term821.getClass(), "linkName", "");
        setField(term821, term821.getClass(), "magic", "ustar ");
        setField(term821, term821.getClass(), "version", "00");
        setField(term821, term821.getClass(), "userName", "root");
        setField(term821, term821.getClass(), "groupName", "");
        setIntField(term821, term821.getClass(), "devMajor", -522618178);
        setIntField(term821, term821.getClass(), "devMinor", 1134449235);
        setBooleanField(term821, term821.getClass(), "isExtended", false);
        setLongField(term821, term821.getClass(), "realSize", -5476826692763582090L);
        setBooleanField(term821, term821.getClass(), "paxGNUSparse", false);
        setBooleanField(term821, term821.getClass(), "starSparse", true);
        setField(term860, term860.getClass(), "path", "RMFIsYGgne");
        setField(term860, term860.getClass(), "status", enum76);
        setIntField(term860, term860.getClass(), "prefixLength", -883034806);
        setField(term860, term860.getClass(), "filePath", null);
        setField(term821, term821.getClass(), "file", term860);
        term885 = newInstance(Class.forName("java.lang.Object"));
        Class<? extends Object> term20193 = Class.forName((String) "java.io.File$PathStatus");
        Field term20192 = ((Class) term20193).getDeclaredField((String) "CHECKED");
        ((Field) term20192).setAccessible(true);
        Object enum77 = ((Field) term20192).get((Object) null);
        term19985 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term19998 = newInstance(Class.forName("java.io.File"));
        setField(term19985, term19985.getClass(), "name", "");
        setBooleanField(term19985, term19985.getClass(), "preserveLeadingSlashes", false);
        setIntField(term19985, term19985.getClass(), "mode", 1725571209);
        setLongField(term19985, term19985.getClass(), "userId", -2813493605142626659L);
        setLongField(term19985, term19985.getClass(), "groupId", -8885298608300233488L);
        setLongField(term19985, term19985.getClass(), "size", -4325723315152823407L);
        setLongField(term19985, term19985.getClass(), "modTime", 2535595959091595249L);
        setBooleanField(term19985, term19985.getClass(), "checkSumOK", true);
        setByteField(term19985, term19985.getClass(), "linkFlag", (byte) 74);
        setField(term19985, term19985.getClass(), "linkName", "");
        setField(term19985, term19985.getClass(), "magic", "ustar ");
        setField(term19985, term19985.getClass(), "version", "00");
        setField(term19985, term19985.getClass(), "userName", "root");
        setField(term19985, term19985.getClass(), "groupName", "");
        setIntField(term19985, term19985.getClass(), "devMajor", -522618178);
        setIntField(term19985, term19985.getClass(), "devMinor", 1134449235);
        setBooleanField(term19985, term19985.getClass(), "isExtended", false);
        setLongField(term19985, term19985.getClass(), "realSize", -5476826692763582090L);
        setBooleanField(term19985, term19985.getClass(), "paxGNUSparse", false);
        setBooleanField(term19985, term19985.getClass(), "starSparse", true);
        setField(term19998, term19998.getClass(), "path", "RMFIsYGgne");
        setField(term19998, term19998.getClass(), "status", enum77);
        setIntField(term19998, term19998.getClass(), "prefixLength", -883034806);
        setField(term19998, term19998.getClass(), "filePath", null);
        setField(term19985, term19985.getClass(), "file", term19998);
        term20004 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term885;
        Object retValue = callMethod(klass, "equals", argTypes, term821, args);
        assertTrue(recursiveEquals(term821, term19985));
        assertTrue(recursiveEquals(term885, term20004));
        assertTrue(recursiveEquals(retValue, false));
    }

};


