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
import java.lang.IllegalArgumentException;
import static org.apache.commons.compress.archivers.tar.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;
import java.lang.Long;

public class TarArchiveEntry_setSize_1869522775115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7917;
     Object term7981;

    public TarArchiveEntry_setSize_1869522775115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term33443 = Class.forName((String) "java.io.File$PathStatus");
        Field term33442 = ((Class) term33443).getDeclaredField((String) "CHECKED");
        ((Field) term33442).setAccessible(true);
        Object enum138 = ((Field) term33442).get((Object) null);
        term7917 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term7956 = newInstance(Class.forName("java.io.File"));
        setField(term7917, term7917.getClass(), "name", "");
        setBooleanField(term7917, term7917.getClass(), "preserveLeadingSlashes", true);
        setIntField(term7917, term7917.getClass(), "mode", -2063457669);
        setLongField(term7917, term7917.getClass(), "userId", -8892586408602479513L);
        setLongField(term7917, term7917.getClass(), "groupId", 4616440478358528406L);
        setLongField(term7917, term7917.getClass(), "size", 3427570961451840069L);
        setLongField(term7917, term7917.getClass(), "modTime", 4502292577098212311L);
        setBooleanField(term7917, term7917.getClass(), "checkSumOK", true);
        setByteField(term7917, term7917.getClass(), "linkFlag", (byte) -85);
        setField(term7917, term7917.getClass(), "linkName", "");
        setField(term7917, term7917.getClass(), "magic", "ustar ");
        setField(term7917, term7917.getClass(), "version", "00");
        setField(term7917, term7917.getClass(), "userName", "root");
        setField(term7917, term7917.getClass(), "groupName", "");
        setIntField(term7917, term7917.getClass(), "devMajor", -1222006000);
        setIntField(term7917, term7917.getClass(), "devMinor", 2095798786);
        setBooleanField(term7917, term7917.getClass(), "isExtended", false);
        setLongField(term7917, term7917.getClass(), "realSize", -3730936709704460408L);
        setBooleanField(term7917, term7917.getClass(), "paxGNUSparse", false);
        setBooleanField(term7917, term7917.getClass(), "starSparse", true);
        setField(term7956, term7956.getClass(), "path", "tShwQLRGNe");
        setField(term7956, term7956.getClass(), "status", enum138);
        setIntField(term7956, term7956.getClass(), "prefixLength", -1565502840);
        setField(term7956, term7956.getClass(), "filePath", null);
        setField(term7917, term7917.getClass(), "file", term7956);
        term7981 = new Long(-8614778293741404325L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term7981;
        try {
            callMethod(klass, "setSize", argTypes, term7917, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


