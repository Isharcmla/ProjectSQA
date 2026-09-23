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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.apache.commons.compress.archivers.tar.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class TarArchiveEntry_evaluateType_1877905315146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14879;
     Object term14943;

    public TarArchiveEntry_evaluateType_1877905315146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term46035 = Class.forName((String) "java.io.File$PathStatus");
        Field term46034 = ((Class) term46035).getDeclaredField((String) "INVALID");
        ((Field) term46034).setAccessible(true);
        Object enum189 = ((Field) term46034).get((Object) null);
        term14879 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term14918 = newInstance(Class.forName("java.io.File"));
        setField(term14879, term14879.getClass(), "name", "");
        setBooleanField(term14879, term14879.getClass(), "preserveLeadingSlashes", true);
        setIntField(term14879, term14879.getClass(), "mode", 2058711405);
        setLongField(term14879, term14879.getClass(), "userId", -2463629530824341661L);
        setLongField(term14879, term14879.getClass(), "groupId", 7800835025296877231L);
        setLongField(term14879, term14879.getClass(), "size", -187772971269812453L);
        setLongField(term14879, term14879.getClass(), "modTime", 468487103823886117L);
        setBooleanField(term14879, term14879.getClass(), "checkSumOK", true);
        setByteField(term14879, term14879.getClass(), "linkFlag", (byte) -44);
        setField(term14879, term14879.getClass(), "linkName", "");
        setField(term14879, term14879.getClass(), "magic", "ustar ");
        setField(term14879, term14879.getClass(), "version", "00");
        setField(term14879, term14879.getClass(), "userName", "root");
        setField(term14879, term14879.getClass(), "groupName", "");
        setIntField(term14879, term14879.getClass(), "devMajor", 1743683601);
        setIntField(term14879, term14879.getClass(), "devMinor", -945116798);
        setBooleanField(term14879, term14879.getClass(), "isExtended", false);
        setLongField(term14879, term14879.getClass(), "realSize", 4139034517298316285L);
        setBooleanField(term14879, term14879.getClass(), "paxGNUSparse", false);
        setBooleanField(term14879, term14879.getClass(), "starSparse", true);
        setField(term14918, term14918.getClass(), "path", "vQVyKLdtaz");
        setField(term14918, term14918.getClass(), "status", enum189);
        setIntField(term14918, term14918.getClass(), "prefixLength", 1593461795);
        setField(term14918, term14918.getClass(), "filePath", null);
        setField(term14879, term14879.getClass(), "file", term14918);
        term14943 = (byte[]) newByteArray(7);
        setByteElement(term14943, 0, (byte) 33);
        setByteElement(term14943, 1, (byte) -74);
        setByteElement(term14943, 2, (byte) -84);
        setByteElement(term14943, 3, (byte) -53);
        setByteElement(term14943, 4, (byte) -93);
        setByteElement(term14943, 5, (byte) 82);
        setByteElement(term14943, 6, (byte) -89);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term14943;
        try {
            callMethod(klass, "evaluateType", argTypes, term14879, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


