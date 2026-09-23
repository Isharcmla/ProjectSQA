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

public class TarArchiveEntry_isGNUSparse_698311188122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9526;
     Object term36070;

    public TarArchiveEntry_isGNUSparse_698311188122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term36112 = Class.forName((String) "java.io.File$PathStatus");
        Field term36111 = ((Class) term36112).getDeclaredField((String) "CHECKED");
        ((Field) term36111).setAccessible(true);
        Object enum151 = ((Field) term36111).get((Object) null);
        term9526 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term9565 = newInstance(Class.forName("java.io.File"));
        setField(term9526, term9526.getClass(), "name", "");
        setBooleanField(term9526, term9526.getClass(), "preserveLeadingSlashes", true);
        setIntField(term9526, term9526.getClass(), "mode", 1296895584);
        setLongField(term9526, term9526.getClass(), "userId", 3580984732036213717L);
        setLongField(term9526, term9526.getClass(), "groupId", 5330761990446327930L);
        setLongField(term9526, term9526.getClass(), "size", -3954795081650780841L);
        setLongField(term9526, term9526.getClass(), "modTime", 3288791194263207397L);
        setBooleanField(term9526, term9526.getClass(), "checkSumOK", true);
        setByteField(term9526, term9526.getClass(), "linkFlag", (byte) 100);
        setField(term9526, term9526.getClass(), "linkName", "");
        setField(term9526, term9526.getClass(), "magic", "ustar ");
        setField(term9526, term9526.getClass(), "version", "00");
        setField(term9526, term9526.getClass(), "userName", "root");
        setField(term9526, term9526.getClass(), "groupName", "");
        setIntField(term9526, term9526.getClass(), "devMajor", 628918458);
        setIntField(term9526, term9526.getClass(), "devMinor", -1274456137);
        setBooleanField(term9526, term9526.getClass(), "isExtended", true);
        setLongField(term9526, term9526.getClass(), "realSize", 3288941170644426558L);
        setBooleanField(term9526, term9526.getClass(), "paxGNUSparse", true);
        setBooleanField(term9526, term9526.getClass(), "starSparse", true);
        setField(term9565, term9565.getClass(), "path", "JDswTTCZHV");
        setField(term9565, term9565.getClass(), "status", enum151);
        setIntField(term9565, term9565.getClass(), "prefixLength", 1041916673);
        setField(term9565, term9565.getClass(), "filePath", null);
        setField(term9526, term9526.getClass(), "file", term9565);
        Class<? extends Object> term36277 = Class.forName((String) "java.io.File$PathStatus");
        Field term36276 = ((Class) term36277).getDeclaredField((String) "CHECKED");
        ((Field) term36276).setAccessible(true);
        Object enum152 = ((Field) term36276).get((Object) null);
        term36070 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term36083 = newInstance(Class.forName("java.io.File"));
        setField(term36070, term36070.getClass(), "name", "");
        setBooleanField(term36070, term36070.getClass(), "preserveLeadingSlashes", true);
        setIntField(term36070, term36070.getClass(), "mode", 1296895584);
        setLongField(term36070, term36070.getClass(), "userId", 3580984732036213717L);
        setLongField(term36070, term36070.getClass(), "groupId", 5330761990446327930L);
        setLongField(term36070, term36070.getClass(), "size", -3954795081650780841L);
        setLongField(term36070, term36070.getClass(), "modTime", 3288791194263207397L);
        setBooleanField(term36070, term36070.getClass(), "checkSumOK", true);
        setByteField(term36070, term36070.getClass(), "linkFlag", (byte) 100);
        setField(term36070, term36070.getClass(), "linkName", "");
        setField(term36070, term36070.getClass(), "magic", "ustar ");
        setField(term36070, term36070.getClass(), "version", "00");
        setField(term36070, term36070.getClass(), "userName", "root");
        setField(term36070, term36070.getClass(), "groupName", "");
        setIntField(term36070, term36070.getClass(), "devMajor", 628918458);
        setIntField(term36070, term36070.getClass(), "devMinor", -1274456137);
        setBooleanField(term36070, term36070.getClass(), "isExtended", true);
        setLongField(term36070, term36070.getClass(), "realSize", 3288941170644426558L);
        setBooleanField(term36070, term36070.getClass(), "paxGNUSparse", true);
        setBooleanField(term36070, term36070.getClass(), "starSparse", true);
        setField(term36083, term36083.getClass(), "path", "JDswTTCZHV");
        setField(term36083, term36083.getClass(), "status", enum152);
        setIntField(term36083, term36083.getClass(), "prefixLength", 1041916673);
        setField(term36083, term36083.getClass(), "filePath", null);
        setField(term36070, term36070.getClass(), "file", term36083);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isGNUSparse", argTypes, term9526, args);
        assertTrue(recursiveEquals(term9526, term36070));
        assertTrue(recursiveEquals(retValue, true));
    }

};


