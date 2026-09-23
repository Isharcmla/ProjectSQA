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
import java.lang.Integer;

public class TarArchiveEntry_setDevMajor_323580500117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8377;
     Object term8441;
     Object term33999;

    public TarArchiveEntry_setDevMajor_323580500117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term34040 = Class.forName((String) "java.io.File$PathStatus");
        Field term34039 = ((Class) term34040).getDeclaredField((String) "CHECKED");
        ((Field) term34039).setAccessible(true);
        Object enum141 = ((Field) term34039).get((Object) null);
        term8377 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term8416 = newInstance(Class.forName("java.io.File"));
        setField(term8377, term8377.getClass(), "name", "");
        setBooleanField(term8377, term8377.getClass(), "preserveLeadingSlashes", true);
        setIntField(term8377, term8377.getClass(), "mode", 202001407);
        setLongField(term8377, term8377.getClass(), "userId", -78240609295693193L);
        setLongField(term8377, term8377.getClass(), "groupId", 3090901538358721367L);
        setLongField(term8377, term8377.getClass(), "size", -1677189124507026637L);
        setLongField(term8377, term8377.getClass(), "modTime", 4795660804170399986L);
        setBooleanField(term8377, term8377.getClass(), "checkSumOK", false);
        setByteField(term8377, term8377.getClass(), "linkFlag", (byte) 93);
        setField(term8377, term8377.getClass(), "linkName", "");
        setField(term8377, term8377.getClass(), "magic", "ustar ");
        setField(term8377, term8377.getClass(), "version", "00");
        setField(term8377, term8377.getClass(), "userName", "root");
        setField(term8377, term8377.getClass(), "groupName", "");
        setIntField(term8377, term8377.getClass(), "devMajor", 158873461);
        setIntField(term8377, term8377.getClass(), "devMinor", -430151637);
        setBooleanField(term8377, term8377.getClass(), "isExtended", true);
        setLongField(term8377, term8377.getClass(), "realSize", -4030863184426321096L);
        setBooleanField(term8377, term8377.getClass(), "paxGNUSparse", false);
        setBooleanField(term8377, term8377.getClass(), "starSparse", true);
        setField(term8416, term8416.getClass(), "path", "xLbjWUgOIL");
        setField(term8416, term8416.getClass(), "status", enum141);
        setIntField(term8416, term8416.getClass(), "prefixLength", -1697741339);
        setField(term8416, term8416.getClass(), "filePath", null);
        setField(term8377, term8377.getClass(), "file", term8416);
        term8441 = new Integer(98922530);
        Class<? extends Object> term34205 = Class.forName((String) "java.io.File$PathStatus");
        Field term34204 = ((Class) term34205).getDeclaredField((String) "CHECKED");
        ((Field) term34204).setAccessible(true);
        Object enum142 = ((Field) term34204).get((Object) null);
        term33999 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term34012 = newInstance(Class.forName("java.io.File"));
        setField(term33999, term33999.getClass(), "name", "");
        setBooleanField(term33999, term33999.getClass(), "preserveLeadingSlashes", true);
        setIntField(term33999, term33999.getClass(), "mode", 202001407);
        setLongField(term33999, term33999.getClass(), "userId", -78240609295693193L);
        setLongField(term33999, term33999.getClass(), "groupId", 3090901538358721367L);
        setLongField(term33999, term33999.getClass(), "size", -1677189124507026637L);
        setLongField(term33999, term33999.getClass(), "modTime", 4795660804170399986L);
        setBooleanField(term33999, term33999.getClass(), "checkSumOK", false);
        setByteField(term33999, term33999.getClass(), "linkFlag", (byte) 93);
        setField(term33999, term33999.getClass(), "linkName", "");
        setField(term33999, term33999.getClass(), "magic", "ustar ");
        setField(term33999, term33999.getClass(), "version", "00");
        setField(term33999, term33999.getClass(), "userName", "root");
        setField(term33999, term33999.getClass(), "groupName", "");
        setIntField(term33999, term33999.getClass(), "devMajor", 98922530);
        setIntField(term33999, term33999.getClass(), "devMinor", -430151637);
        setBooleanField(term33999, term33999.getClass(), "isExtended", true);
        setLongField(term33999, term33999.getClass(), "realSize", -4030863184426321096L);
        setBooleanField(term33999, term33999.getClass(), "paxGNUSparse", false);
        setBooleanField(term33999, term33999.getClass(), "starSparse", true);
        setField(term34012, term34012.getClass(), "path", "xLbjWUgOIL");
        setField(term34012, term34012.getClass(), "status", enum142);
        setIntField(term34012, term34012.getClass(), "prefixLength", -1697741339);
        setField(term34012, term34012.getClass(), "filePath", null);
        setField(term33999, term33999.getClass(), "file", term34012);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term8441;
        callMethod(klass, "setDevMajor", argTypes, term8377, args);
        assertTrue(recursiveEquals(term8377, term33999));
        assertTrue(recursiveEquals(term8441, 98922530));
    }

};


