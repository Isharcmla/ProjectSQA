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

public class TarArchiveEntry_isFIFO_1211150438136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12732;
     Object term41567;

    public TarArchiveEntry_isFIFO_1211150438136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term41771 = Class.forName((String) "java.io.File$PathStatus");
        Field term41770 = ((Class) term41771).getDeclaredField((String) "INVALID");
        ((Field) term41770).setAccessible(true);
        Object enum178 = ((Field) term41770).get((Object) null);
        term12732 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term12771 = newInstance(Class.forName("java.io.File"));
        setField(term12732, term12732.getClass(), "name", "");
        setBooleanField(term12732, term12732.getClass(), "preserveLeadingSlashes", true);
        setIntField(term12732, term12732.getClass(), "mode", -1747406163);
        setLongField(term12732, term12732.getClass(), "userId", -5242567610844514867L);
        setLongField(term12732, term12732.getClass(), "groupId", -2951854704066477061L);
        setLongField(term12732, term12732.getClass(), "size", 174253963298276221L);
        setLongField(term12732, term12732.getClass(), "modTime", 3713624957161771816L);
        setBooleanField(term12732, term12732.getClass(), "checkSumOK", false);
        setByteField(term12732, term12732.getClass(), "linkFlag", (byte) -91);
        setField(term12732, term12732.getClass(), "linkName", "");
        setField(term12732, term12732.getClass(), "magic", "ustar ");
        setField(term12732, term12732.getClass(), "version", "00");
        setField(term12732, term12732.getClass(), "userName", "root");
        setField(term12732, term12732.getClass(), "groupName", "");
        setIntField(term12732, term12732.getClass(), "devMajor", 388157121);
        setIntField(term12732, term12732.getClass(), "devMinor", 1684998508);
        setBooleanField(term12732, term12732.getClass(), "isExtended", false);
        setLongField(term12732, term12732.getClass(), "realSize", 6130232388739280211L);
        setBooleanField(term12732, term12732.getClass(), "paxGNUSparse", false);
        setBooleanField(term12732, term12732.getClass(), "starSparse", false);
        setField(term12771, term12771.getClass(), "path", "TJmVBGfTML");
        setField(term12771, term12771.getClass(), "status", enum178);
        setIntField(term12771, term12771.getClass(), "prefixLength", -1476644457);
        setField(term12771, term12771.getClass(), "filePath", null);
        setField(term12732, term12732.getClass(), "file", term12771);
        Class<? extends Object> term42064 = Class.forName((String) "java.io.File$PathStatus");
        Field term42063 = ((Class) term42064).getDeclaredField((String) "INVALID");
        ((Field) term42063).setAccessible(true);
        Object enum179 = ((Field) term42063).get((Object) null);
        term41567 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term41580 = newInstance(Class.forName("java.io.File"));
        setField(term41567, term41567.getClass(), "name", "");
        setBooleanField(term41567, term41567.getClass(), "preserveLeadingSlashes", true);
        setIntField(term41567, term41567.getClass(), "mode", -1747406163);
        setLongField(term41567, term41567.getClass(), "userId", -5242567610844514867L);
        setLongField(term41567, term41567.getClass(), "groupId", -2951854704066477061L);
        setLongField(term41567, term41567.getClass(), "size", 174253963298276221L);
        setLongField(term41567, term41567.getClass(), "modTime", 3713624957161771816L);
        setBooleanField(term41567, term41567.getClass(), "checkSumOK", false);
        setByteField(term41567, term41567.getClass(), "linkFlag", (byte) -91);
        setField(term41567, term41567.getClass(), "linkName", "");
        setField(term41567, term41567.getClass(), "magic", "ustar ");
        setField(term41567, term41567.getClass(), "version", "00");
        setField(term41567, term41567.getClass(), "userName", "root");
        setField(term41567, term41567.getClass(), "groupName", "");
        setIntField(term41567, term41567.getClass(), "devMajor", 388157121);
        setIntField(term41567, term41567.getClass(), "devMinor", 1684998508);
        setBooleanField(term41567, term41567.getClass(), "isExtended", false);
        setLongField(term41567, term41567.getClass(), "realSize", 6130232388739280211L);
        setBooleanField(term41567, term41567.getClass(), "paxGNUSparse", false);
        setBooleanField(term41567, term41567.getClass(), "starSparse", false);
        setField(term41580, term41580.getClass(), "path", "TJmVBGfTML");
        setField(term41580, term41580.getClass(), "status", enum179);
        setIntField(term41580, term41580.getClass(), "prefixLength", -1476644457);
        setField(term41580, term41580.getClass(), "filePath", null);
        setField(term41567, term41567.getClass(), "file", term41580);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isFIFO", argTypes, term12732, args);
        assertTrue(recursiveEquals(term12732, term41567));
        assertTrue(recursiveEquals(retValue, false));
    }

};


